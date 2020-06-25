package com.logic.nasa.ui.main
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.logic.nasa.data.model.DefaultData
import com.logic.nasa.data.repositery.MainRepository
import com.logic.nasa.utils.BaseViewModel
import com.logic.nasa.utils.NetworkHelper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainViewModel(networkHelper: NetworkHelper,
                    compositeDisposable: CompositeDisposable,
                    private val mainRepository: MainRepository)
    :BaseViewModel(networkHelper, compositeDisposable) {


    public val todayLiveData:MutableLiveData<DefaultData> = MutableLiveData()


    fun getTodayData(){

        if(!checkInternetConnectionWithError()){
            progressLiveData.postValue(false);
                return;
        }
        progressLiveData.postValue(true);

        compositeDisposable.add(
            mainRepository
                .getTodayData()
                .subscribeOn(Schedulers.io())
                .subscribe({
                    Log.e("Tag","${it}");
                    todayLiveData.postValue(it)
                    progressLiveData.postValue(false);

                },{
                    it.message?.run {
                        Log.e("Tag","${toString()}");
                        errorStringLiveData.postValue(toString())
                        progressLiveData.postValue(false);
                    }
                })
        );
    }

    fun  getSpecificDateDate(date:String){

        if(!checkInternetConnectionWithError()){
            progressLiveData.postValue(false)
            return
        }
        progressLiveData.postValue(true)

        compositeDisposable.add(
            mainRepository
                .getSpecificData(date)
                .subscribeOn(Schedulers.io())
                .subscribe({
                    Log.e("Tag","${it}")
                    todayLiveData.postValue(it)
                    progressLiveData.postValue(false)
                    var img_url=it.url.split("image");
                    Log.e("x",""+img_url[0])
                    Log.e("x",""+img_url[1])
                   // getDownloadedImage("/image"+img_url[1]);

                },{
                    it.message?.run {
                        Log.e("Tag","${toString()}")
                        errorStringLiveData.postValue(toString())
                        progressLiveData.postValue(false)
                    }
                })
        );

    }

    fun  getDownloadedImage(imageUrl:String){

        compositeDisposable.add(
            mainRepository
                .getDownloadImage(imageUrl)
                .subscribeOn(Schedulers.io())
                .subscribe()
        )
    }

}