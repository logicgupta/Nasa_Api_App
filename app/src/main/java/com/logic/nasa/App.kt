package com.logic.nasa

import androidx.multidex.MultiDexApplication
import com.logic.nasa.di.component.ApplicationComponent
import com.logic.nasa.di.component.DaggerApplicationComponent
import com.logic.nasa.di.module.ApplicationModule

class App : MultiDexApplication() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }
    private fun getDependencies(){
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

}