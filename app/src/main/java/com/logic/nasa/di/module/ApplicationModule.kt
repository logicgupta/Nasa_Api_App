package com.logic.nasa.di.module

import com.logic.nasa.App
import com.logic.nasa.data.network.ApiHelper
import com.logic.nasa.utils.NetworkHelper
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class ApplicationModule(private val application:App) {

    @Singleton
    @Provides
    fun providesApiInterface()= ApiHelper
        .getInterface(application,application.cacheDir,10*1024*1024)

    @Singleton
    @Provides
    fun providesCompositeDisposable()= CompositeDisposable()

    @Singleton
    @Provides
    fun providesNetworkHelper() = NetworkHelper(application)


}