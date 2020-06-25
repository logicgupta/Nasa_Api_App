package com.logic.nasa.ui.main

import android.Manifest
import android.app.DatePickerDialog
import android.app.DownloadManager
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.View
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
        activityComponent.injectMainActivity(this);
    }

    override fun provideLayoutId(): Int =R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        viewModel.getTodayData()
    }
    var day:String?=null
    var month:String?=null
    var year:String?=null
    var fileUrl:String?=null
    private val STORAGE_PERMISSION_CODE:Int=1000
    private var fileName:String?=null
    override fun setupObservers() {
        super.setupObservers()

        viewModel.progressLiveData.observe(this, Observer {
            if(it){
                layout.visibility=View.GONE
            }
            else{
                progress_circular.visibility= View.GONE
            }
        });

        viewModel.errorStringLiveData.observe(this, Observer {
            error_handle.text=it
        })

        viewModel.todayLiveData.observe(this, Observer {
            layout.visibility=View.VISIBLE
            title_textView.text=it.title
            desc_textView.text=it.explanation;
            fileUrl=it.url
            if(it.media_type == "image"){
                button.text="Zoom"
            }
            else
                button.text="Play"
           // checkPermission()
        })
    }
    /*
                This is just a demo do not use this method
     */

//    fun getDownloadedImage(){
//        fileName=System.currentTimeMillis().toString()
//        val request=DownloadManager.Request(Uri.parse(fileUrl))
//        request
//            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
//        request.setTitle("Downloading")
//        request.setDescription("File is Downloading")
//
//        request.allowScanningByMediaScanner()
//        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
//        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,
//        fileName)
//
//        // get doenload service and enqueue
//        val manager=getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
//        manager.enqueue(request)
//
//    }
//
//    fun checkPermission(){
//        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
//            if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)==
//                    PackageManager.PERMISSION_DENIED){
//                //Reject
//            requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),STORAGE_PERMISSION_CODE)
//
//
//            }
//            else{
//                // Granted
//                getDownloadedImage()
//            }
//        }
//        else{
//                //   system os is less
//            getDownloadedImage()
//        }
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        when(requestCode){
//            STORAGE_PERMISSION_CODE->{
//                if(grantResults.isNotEmpty() && grantResults[0]==
//                        PackageManager.PERMISSION_GRANTED){
//
//                    // permission PopUp granted
//                    getDownloadedImage()
//                }
//                else{
//                  //  permissions from popup denied
//                    showToast("Permission Denied");
//
//                }
//            }
//        }
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//    }
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
                val myBitmap = BitmapFactory.decodeFile(file.getAbsolutePath())
                image.setImageBitmap(myBitmap)
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
                day="0"+day;
            }
            if(month!!.length==1){
                month="0"+month;
            }
            Log.e("s",""+year+"-"+month+"-"+day);
            viewModel.getSpecificDateDate(year+"-"+month+"-"+day)

        }, year_current, month_current, day_current)

        dpd.show()
    }

}
