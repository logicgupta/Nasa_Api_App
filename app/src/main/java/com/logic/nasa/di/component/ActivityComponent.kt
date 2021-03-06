package com.logic.nasa.di.component

import com.logic.nasa.di.ActivityScope
import com.logic.nasa.di.module.ActivityModule
import com.logic.nasa.ui.main.MainActivity
import com.logic.nasa.ui.main.PlayVideoActivity
import dagger.Component
@ActivityScope
@Component(dependencies = [ApplicationComponent::class],modules = [ActivityModule::class])
interface ActivityComponent {

    fun injectMainActivity(activity: MainActivity)

    fun injectPlayVideoActivity(activity:PlayVideoActivity)
}