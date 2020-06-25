package com.logic.nasa.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/logic/nasa/di/module/ActivityModule;", "", "activity", "Lcom/logic/nasa/utils/BaseActivity;", "(Lcom/logic/nasa/utils/BaseActivity;)V", "providesMainModel", "Lcom/logic/nasa/ui/main/MainViewModel;", "networkHelper", "Lcom/logic/nasa/utils/NetworkHelper;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mainRepository", "Lcom/logic/nasa/data/repositery/MainRepository;", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    private final com.logic.nasa.utils.BaseActivity<?> activity = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.logic.nasa.ui.main.MainViewModel providesMainModel(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.utils.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.logic.nasa.data.repositery.MainRepository mainRepository) {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.utils.BaseActivity<?> activity) {
        super();
    }
}