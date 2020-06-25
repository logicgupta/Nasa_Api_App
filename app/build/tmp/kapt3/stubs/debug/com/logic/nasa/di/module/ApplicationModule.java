package com.logic.nasa.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/logic/nasa/di/module/ApplicationModule;", "", "application", "Lcom/logic/nasa/App;", "(Lcom/logic/nasa/App;)V", "providesApiInterface", "Lcom/logic/nasa/data/network/ApiInterface;", "providesCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "providesNetworkHelper", "Lcom/logic/nasa/utils/NetworkHelper;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final com.logic.nasa.App application = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.logic.nasa.data.network.ApiInterface providesApiInterface() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final io.reactivex.disposables.CompositeDisposable providesCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.logic.nasa.utils.NetworkHelper providesNetworkHelper() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.App application) {
        super();
    }
}