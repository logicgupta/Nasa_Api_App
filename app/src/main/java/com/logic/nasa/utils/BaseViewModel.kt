package com.logic.nasa.utils

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.logic.nasa.R
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel(
    protected val networkHelper: NetworkHelper,
    protected val compositeDisposable: CompositeDisposable
) : ViewModel() {

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    val progressLiveData: MutableLiveData<Boolean> = MutableLiveData()
    val errorStringIdLiveData: MutableLiveData<Int> = MutableLiveData()
    val errorStringLiveData: MutableLiveData<String> = MutableLiveData()

    protected fun checkInternetConnectionWithError(): Boolean =
        if (networkHelper.isNetworkConnected()) {
            true
        } else {
            errorStringIdLiveData.postValue(R.string.network_connection_error)
            false
        }

    protected fun checkInternetConnection(): Boolean = networkHelper.isNetworkConnected()
}