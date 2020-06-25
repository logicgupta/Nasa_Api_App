package com.logic.nasa.data.network

import com.logic.nasa.data.model.DefaultData
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Streaming
import retrofit2.http.Url

interface ApiInterface {

    @GET(Endpoints.ENDPOINT_INITIAL)
    fun getDefaultRequest(@Query("api_key") key:String="DEMO_KEY"):Single<DefaultData>


    @GET(Endpoints.ENDPOINT_INITIAL)
    fun getSpecificDateRequest(@Query("api_key") key:String
                               ,@Query("date") date:String):Single<DefaultData>


    @Streaming
    @GET
    fun downloadImage(@Url imageUrl: String): Single<ResponseBody>


}