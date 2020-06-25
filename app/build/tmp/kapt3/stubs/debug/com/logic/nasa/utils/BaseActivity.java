package com.logic.nasa.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0002\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H$J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\'J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\b\u0010\u001a\u001a\u00020\u000fH$R \u0010\u0005\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lcom/logic/nasa/utils/BaseActivity;", "VM", "Lcom/logic/nasa/utils/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "getViewModel", "()Lcom/logic/nasa/utils/BaseViewModel;", "setViewModel", "(Lcom/logic/nasa/utils/BaseViewModel;)V", "Lcom/logic/nasa/utils/BaseViewModel;", "buildActivityComponent", "error/NonExistentClass", "()Lerror/NonExistentClass;", "injectDependencies", "", "activityComponent", "Lcom/logic/nasa/di/component/ActivityComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "provideLayoutId", "", "setupObservers", "setupView", "app_debug"})
public abstract class BaseActivity<VM extends com.logic.nasa.utils.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public VM viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final VM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final error.NonExistentClass buildActivityComponent() {
        return null;
    }
    
    protected abstract void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.di.component.ActivityComponent activityComponent);
    
    protected void setupObservers() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int provideLayoutId();
    
    protected abstract void setupView();
    
    public BaseActivity() {
        super();
    }
}