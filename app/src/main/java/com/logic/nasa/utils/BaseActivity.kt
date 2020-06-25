package com.logic.nasa.utils
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.logic.nasa.App
import com.logic.nasa.di.component.ActivityComponent
import com.logic.nasa.di.component.DaggerActivityComponent
import com.logic.nasa.di.module.ActivityModule

import javax.inject.Inject

abstract class BaseActivity<VM:BaseViewModel> :AppCompatActivity(){

    @Inject
    lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies(buildActivityComponent())
        super.onCreate(savedInstanceState)
        setContentView(provideLayoutId())
        setupView()
        setupObservers()

    }
    private fun buildActivityComponent() =
        DaggerActivityComponent.builder()
            .applicationComponent((application as App).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()

    protected abstract fun injectDependencies(activityComponent: ActivityComponent)
    protected open fun setupObservers() {
        viewModel.errorStringIdLiveData.observe(this, Observer {
            showToast(getString(it))
        })
        viewModel.errorStringLiveData.observe(this, Observer {
            showToast(it)
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    @LayoutRes
    abstract fun provideLayoutId():Int

    protected abstract fun setupView()
}