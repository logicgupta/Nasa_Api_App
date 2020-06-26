package com.logic.nasa.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/logic/nasa/ui/main/MainViewModel;", "Lcom/logic/nasa/utils/BaseViewModel;", "networkHelper", "Lcom/logic/nasa/utils/NetworkHelper;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mainRepository", "Lcom/logic/nasa/data/repositery/MainRepository;", "(Lcom/logic/nasa/utils/NetworkHelper;Lio/reactivex/disposables/CompositeDisposable;Lcom/logic/nasa/data/repositery/MainRepository;)V", "todayLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/logic/nasa/data/model/DefaultData;", "getTodayLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getSpecificDateDate", "", "date", "", "getTodayData", "app_debug"})
public final class MainViewModel extends com.logic.nasa.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.logic.nasa.data.model.DefaultData> todayLiveData = null;
    private final com.logic.nasa.data.repositery.MainRepository mainRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.logic.nasa.data.model.DefaultData> getTodayLiveData() {
        return null;
    }
    
    public final void getTodayData() {
    }
    
    public final void getSpecificDateDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.utils.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.logic.nasa.data.repositery.MainRepository mainRepository) {
        super(null, null);
    }
}