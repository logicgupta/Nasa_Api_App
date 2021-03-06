package com.ando.classengage.student.ui.batch.info.assignment.detail

import android.content.Context
import android.os.Environment
import androidx.lifecycle.MutableLiveData
import com.ando.classengage.student.R
import com.ando.classengage.student.data.model.AssignmentDTO
import com.ando.classengage.student.data.repositery.BatchRepositery
import com.ando.classengage.student.ui.base.BaseViewModel
import com.ando.classengage.student.utils.file.FileUtils
import com.ando.classengage.student.utils.network.NetworkHelper
import io.reactivex.Single
import io.reactivex.SingleOnSubscribe
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import okio.Okio
import java.io.File

class AssignmentDetailViewModel(
    networkHelper: NetworkHelper,
    compositeDisposable: CompositeDisposable,
    private val batchRepositery: BatchRepositery)
: BaseViewModel(networkHelper, compositeDisposable) {


    var assignmentDTO: AssignmentDTO? = null
    val assignmentDTOLiveData=MutableLiveData<AssignmentDTO>()
   internal val attachmentLiveData=MutableLiveData<ArrayList<Attachment>>()

    fun start(assignmentDTO: AssignmentDTO,context: Context){
        this.assignmentDTO=assignmentDTO
        assignmentDTOLiveData.postValue(assignmentDTO)

        assignmentDTO.attachments.let { list->
            if (list.isNullOrEmpty()){
                attachmentLiveData.postValue(null)
                return@let
            }

            val attachList=ArrayList<Attachment>().apply {

                for (item in list){
                    val filename=item.substring(item.lastIndexOf("/") + 1)
                    val extension=item.substring(item.lastIndexOf(".")+1)
                    val type = if (extension.equals("pdf",ignoreCase = true))
                        Attachment.Type.PDF else
                        Attachment.Type.IMAGE
                    val appDownLoadFolder=File(
                        Environment
                            .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                        context.getString(R.string.app_name)
                    )
                    val downLoadFile=File(appDownLoadFolder,filename)
                    val isDownloaded=downLoadFile.exists()
                    add(Attachment(fileName = filename,type = type,isDownloaded = isDownloaded))
                }
            }
            attachmentLiveData.postValue(attachList)
        }

    }


  internal  fun downloadAttachment(attachment: Attachment,context: Context){

      if (!FileUtils.isExternalStorageWritable()){
          errorStringLiveData.postValue("Unable to access external storage")
          return
      }

        progressLiveData.postValue(true)

      if (!checkInternetConnectionWithError()){
            progressLiveData.postValue(false)
            return
             }
      if (attachment.isDownloading) {
          errorStringLiveData.postValue("Attachment download in progress")
          return
      }

      val appDownLoadFolder=File(
          Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
          ,context.getString(R.string.app_name)
      )

      if (!appDownLoadFolder.exists()&&!appDownLoadFolder.mkdir()){
          errorStringLiveData.postValue("Error while creating folder for Attachments ")
          appDownLoadFolder.mkdir()
          return
      }

      val downLoadFile=File(appDownLoadFolder,attachment.fileName)

        compositeDisposable.addAll(
            batchRepositery
                .downloadAttachment(attachment.fileName)
                .flatMap { responseBody->
                    Single.create(SingleOnSubscribe<File> {
                        downLoadFile.delete()
                        val sink = Okio.buffer(Okio.sink(downLoadFile))
                        sink.writeAll(responseBody.source())
                        sink.close()
                        it.onSuccess(downLoadFile)
                    })
                }
                .subscribeOn(Schedulers.io())
                .subscribe({
                    progressLiveData.postValue(false)
                    attachment.isDownloading = false
                    attachment.isDownloaded = true
                    attachmentLiveData.postValue(attachmentLiveData.value)


                },{
                    attachment.isDownloading = false
                    attachmentLiveData.postValue(attachmentLiveData.value)
                    progressLiveData.postValue(false)
                    it?.message.run {
                        errorStringLiveData.postValue(toString())
                    }
                })

        )

    }



}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              