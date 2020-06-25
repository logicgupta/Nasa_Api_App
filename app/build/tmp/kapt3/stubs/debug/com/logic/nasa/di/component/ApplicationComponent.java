package com.logic.nasa.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/logic/nasa/di/component/ApplicationComponent;", "", "getCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMainRepositery", "Lcom/logic/nasa/data/repositery/MainRepository;", "getNetworkHelper", "Lcom/logic/nasa/utils/NetworkHelper;", "inject", "", "application", "Lcom/logic/nasa/App;", "app_debug"})
@dagger.Component(modules = {com.logic.nasa.di.module.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.App application);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.disposables.CompositeDisposable getCompositeDisposable();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.logic.nasa.utils.NetworkHelper getNetworkHelper();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.logic.nasa.data.repositery.MainRepository getMainRepositery();
}