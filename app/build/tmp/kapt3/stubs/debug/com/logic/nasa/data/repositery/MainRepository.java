package com.logic.nasa.data.repositery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\f\u001a\u00020\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/logic/nasa/data/repositery/MainRepository;", "", "apiInterface", "Lcom/logic/nasa/data/network/ApiInterface;", "(Lcom/logic/nasa/data/network/ApiInterface;)V", "getDownloadImage", "Lio/reactivex/Single;", "Lokhttp3/ResponseBody;", "imageUrl", "", "getSpecificData", "Lcom/logic/nasa/data/model/DefaultData;", "date", "getTodayData", "app_debug"})
public final class MainRepository {
    private final com.logic.nasa.data.network.ApiInterface apiInterface = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.logic.nasa.data.model.DefaultData> getTodayData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.logic.nasa.data.model.DefaultData> getSpecificData(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<okhttp3.ResponseBody> getDownloadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl) {
        return null;
    }
    
    @javax.inject.Inject()
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.data.network.ApiInterface apiInterface) {
        super();
    }
}