package com.logic.nasa.di.component

import com.logic.nasa.App
import com.logic.nasa.data.repositery.MainRepository
import com.logic.nasa.di.module.ApplicationModule
import com.logic.nasa.utils.NetworkHelper
import dagger.Component
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: App)

    fun getCompositeDisposable(): CompositeDisposable

    fun getNetworkHelper(): NetworkHelper

    fun getMainRepositery():MainRepository
}