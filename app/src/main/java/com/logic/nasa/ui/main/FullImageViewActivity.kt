package com.logic.nasa.ui.main

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.logic.nasa.R
import kotlinx.android.synthetic.main.activity_full_image_view.*


class FullImageViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_image_view)

        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val url:String=intent.getStringExtra("url")
//        val bitmap: Bitmap =
//            Glide.with(this).asBitmap().load(url).submit(600, 300).get()
//        image.setImageBitmap(bitmap)

        val myOptions = RequestOptions()
            .fitCenter() // or centerCrop
            .override(100, 100)

        Glide.with(this)
            .asBitmap()
            .apply(myOptions)
            .load(url)
            .into(image)
    }
}
