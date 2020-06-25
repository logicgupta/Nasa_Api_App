package com.logic.nasa.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0014H\u0004J\b\u0010\u0017\u001a\u00020\u0014H\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/logic/nasa/utils/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "networkHelper", "Lcom/logic/nasa/utils/NetworkHelper;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/logic/nasa/utils/NetworkHelper;Lio/reactivex/disposables/CompositeDisposable;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "errorStringIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorStringIdLiveData", "()Landroidx/lifecycle/MutableLiveData;", "errorStringLiveData", "", "getErrorStringLiveData", "getNetworkHelper", "()Lcom/logic/nasa/utils/NetworkHelper;", "progressLiveData", "", "getProgressLiveData", "checkInternetConnection", "checkInternetConnectionWithError", "onCleared", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> errorStringIdLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorStringLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final com.logic.nasa.utils.NetworkHelper networkHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgressLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getErrorStringIdLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorStringLiveData() {
        return null;
    }
    
    protected final boolean checkInternetConnectionWithError() {
        return false;
    }
    
    protected final boolean checkInternetConnection() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.logic.nasa.utils.NetworkHelper getNetworkHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.utils.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
}