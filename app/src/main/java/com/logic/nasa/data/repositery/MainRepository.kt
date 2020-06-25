package com.logic.nasa.data.repositery

import com.logic.nasa.data.model.DefaultData
import com.logic.nasa.data.network.ApiInterface
import io.reactivex.Single
import okhttp3.ResponseBody
import javax.inject.Inject

class MainRepository @Inject constructor(private  val apiInterface: ApiInterface) {

    fun getTodayData():Single<DefaultData> =
        apiInterface.getDefaultRequest();

    fun getSpecificData(date:String):Single<DefaultData> =
        apiInterface.getSpecificDateRequest("DEMO_KEY",date)

    fun getDownloadImage(imageUrl:String):Single<ResponseBody> =
            apiInterface.downloadImage(imageUrl)
}