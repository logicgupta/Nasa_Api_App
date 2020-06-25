package com.logic.nasa.data.network
import android.content.Context
import androidx.multidex.BuildConfig
import com.google.gson.Gson
import com.logic.nasa.R
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Singleton
object ApiHelper {

    private const val NETWORK_CALL_TIMEOUT=60

    fun getInterface(context:Context,cacheDir:File,cacheSize:Long):ApiInterface{
        return Retrofit.Builder()
            .baseUrl(context.getString(R.string.base_url))
            .client(
                OkHttpClient.Builder()
                    .cache(Cache(cacheDir,cacheSize))
                    .addInterceptor(
                        HttpLoggingInterceptor().apply {
                            level=if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                            else HttpLoggingInterceptor.Level.NONE
                        })
                    .readTimeout(NETWORK_CALL_TIMEOUT.toLong(), TimeUnit.SECONDS)
                    .writeTimeout(NETWORK_CALL_TIMEOUT.toLong(), TimeUnit.SECONDS)
                    .build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }

}