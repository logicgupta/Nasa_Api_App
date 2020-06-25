package com.logic.nasa.di.module

import androidx.lifecycle.ViewModelProviders
import com.logic.nasa.data.repositery.MainRepository
import com.logic.nasa.ui.main.MainViewModel
import com.logic.nasa.utils.BaseActivity
import com.logic.nasa.utils.NetworkHelper
import com.logic.nasa.utils.ViewModelProviderFactory
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class ActivityModule(private val activity: BaseActivity<*>) {

    @Provides
    fun providesMainModel(
        networkHelper: NetworkHelper,
        compositeDisposable: CompositeDisposable,
        mainRepository: MainRepository
    ): MainViewModel =
        ViewModelProviders.of(activity,
            ViewModelProviderFactory(MainViewModel::class) {
                MainViewModel(networkHelper, compositeDisposable, mainRepository)
            }).get(MainViewModel::class.java)

}