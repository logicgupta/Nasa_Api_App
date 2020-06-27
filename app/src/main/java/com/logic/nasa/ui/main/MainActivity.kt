package com.logic.nasa.ui.main
import android.Manifest
import android.app.DatePickerDialog
import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.media.ThumbnailUtils
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import com.logic.nasa.R
import com.logic.nasa.di.component.ActivityComponent
import com.logic.nasa.utils.BaseActivity
import com.logic.nasa.utils.showToast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.util.*


class MainActivity : BaseActivity<MainViewModel>() {


    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.injectMainActivity(this)
    }

    override fun provideLayoutId(): Int =R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getTodayData()
        registerReceiver(onDownloadComplete, IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE))
    }
    var day:String?=null
    var month:String?=null
    var year:String?=null
    var fileUrl:String?=null
    var mediaType:String?=null
    var url:String?=null
    private val STORAGE_PERMISSION_CODE:Int=1000
    private var fileName:String?=null
    var downloadId:Long = 0
    lateinit var manager:DownloadManager
    override fun setupObservers() {
        super.setupObservers()

        viewModel.progressLiveData.observe(this, Observer {
            if(it){
                error_handle.visibility=View.GONE
                layout.visibility=View.GONE
                image.visibility=View.GONE
                progress_circular.visibility=View.VISIBLE
            }
        })

        viewModel.errorStringLiveData.observe(this, Observer {
            error_handle.text=it
            error_handle.visibility=View.VISIBLE
        })

        /*
                    Default Api Data -- Today's Data
         */
        viewModel.todayLiveData.observe(this, Observer {
            title_textView.text=it.title
            desc_textView.text=it.explanation
            fileUrl=it.url
            mediaType=it.media_type
            url=it.hdurl
            if(it.media_type == "image"){
                button.text="Zoom"
            }
            else
                button.text="Play"
            checkPermission()
        })

        /*
                   Calender Date Data
         */

        viewModel.specificLiveData.observe(this, Observer {
            title_textView.text=it.title
            desc_textView.text=it.explanation
            fileUrl=it.url
            mediaType=it.media_type
            url=it.hdurl
            if(it.media_type == "image"){
                button.text="Zoom"
            }
            else
                button.text="Play"
            checkPermission()
        })
    }

    fun getDownloadFile(){
        showToast("File Downloading in Progress....")
        fileName=System.currentTimeMillis().toString()
        val request=DownloadManager.Request(Uri.parse(url))
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
        request.setTitle("Downloading")
        request.setDescription("File is Downloading")
        request.allowScanningByMediaScanner()
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,
        fileName)

        // get download service and enqueue
        manager=getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        downloadId= manager.enqueue(request)
    }

    fun checkPermission(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)==
                    PackageManager.PERMISSION_DENIED){
                //Reject
            requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),STORAGE_PERMISSION_CODE)


            }
            else{
                // Granted
                getDownloadFile()
            }
        }
        else{
                //   system os is less
            getDownloadFile()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when(requestCode){
            STORAGE_PERMISSION_CODE->{
                if(grantResults.isNotEmpty() && grantResults[0]==
                        PackageManager.PERMISSION_GRANTED){

                    // permission PopUp granted
                    getDownloadFile()
                }
                else{
                  //  permissions from popup denied
                    showToast("Permission Denied")

                }
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
    override fun setupView() {
        calender.setOnClickListener {
            openDatePicker()
        }
        button.setOnClickListener {


            val file = File(
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                fileName
            ) // Set Your File Name

            if (file.exists()) {
                if(mediaType == "image"){

                        val intent= Intent(this,FullImageViewActivity::class.java)
                        intent.putExtra("mediaType","${mediaType}")
                        intent.putExtra("filename",fileName)
                        startActivity(intent)
                }
                else{
                       val intent= Intent(this,PlayVideoActivity::class.java)
                       intent.putExtra("mediaType","${mediaType}")
                       intent.putExtra("filename",fileName)
                       startActivity(intent)
                }
            }
            else{
                showToast("File not Found !")
            }
        }
    }

    fun openDatePicker(){
        val c = Calendar.getInstance()
        val year_current = c.get(Calendar.YEAR)
        val month_current = c.get(Calendar.MONTH)
        val day_current = c.get(Calendar.DAY_OF_MONTH)


        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, _year, monthOfYear, dayOfMonth ->

            // Display Selected date
            day=(dayOfMonth).toString()
            month=(monthOfYear+1).toString()
            year=_year.toString()
            if(day!!.length==1){
                day="0"+day
            }
            if(month!!.length==1){
                month="0"+month
            }
            viewModel.getSpecificDateDate(year+"-"+month+"-"+day)

        }, year_current, month_current, day_current)

        dpd.show()
    }


    private val onDownloadComplete: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {

            //Fetching the download id received with the broadcast
            val id = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1)

            //Checking if the received broadcast is for our enqueued download by matching download id
            if (downloadId === id) {
                showToast("Download Completed")
                layout.visibility=View.VISIBLE
                image.visibility=View.VISIBLE
                progress_circular.visibility= View.GONE
                if (mediaType=="image"){

                    val file = File(
                        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                        fileName
                    ) // Set Your File Name
                    val myBitmap = BitmapFactory.decodeFile(file.absolutePath)
                    image.setImageBitmap(myBitmap)
                }
                else{
                    val file = File(
                        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                        fileName
                    )
                    val bMap = ThumbnailUtils.createVideoThumbnail(
                        file.absolutePath,
                        MediaStore.Video.Thumbnails.MICRO_KIND
                    )
                    image.setImageBitmap(bMap)

                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(onDownloadComplete)
    }
}
