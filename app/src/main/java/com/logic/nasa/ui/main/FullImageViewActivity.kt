package com.logic.nasa.ui.main

import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Environment
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.logic.nasa.R
import kotlinx.android.synthetic.main.activity_full_image_view.*
import java.io.File


class FullImageViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_image_view)

        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val fileName:String=intent.getStringExtra("filename")
        val file = File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
            fileName
        ) // Set Your File Name
        val myBitmap = BitmapFactory.decodeFile(file.getAbsolutePath())
        image.setImageBitmap(myBitmap)

    }
}
