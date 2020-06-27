package com.logic.nasa.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u001c\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0014J\b\u0010 \u001a\u00020\u0017H\u0014J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0017H\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/logic/nasa/ui/main/PlayVideoActivity;", "Lcom/logic/nasa/utils/BaseActivity;", "Lcom/logic/nasa/ui/main/MainViewModel;", "()V", "flag", "", "getFlag", "()Z", "setFlag", "(Z)V", "simpleExoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getSimpleExoPlayer", "()Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setSimpleExoPlayer", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "injectDependencies", "", "activityComponent", "Lcom/logic/nasa/di/component/ActivityComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "persistentState", "Landroid/os/PersistableBundle;", "onPause", "onRestart", "provideLayoutId", "", "setupView", "app_debug"})
public final class PlayVideoActivity extends com.logic.nasa.utils.BaseActivity<com.logic.nasa.ui.main.MainViewModel> {
    @org.jetbrains.annotations.NotNull()
    public com.google.android.exoplayer2.SimpleExoPlayer simpleExoPlayer;
    private boolean flag = true;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String url;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.exoplayer2.SimpleExoPlayer getSimpleExoPlayer() {
        return null;
    }
    
    public final void setSimpleExoPlayer(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.SimpleExoPlayer p0) {
    }
    
    public final boolean getFlag() {
        return false;
    }
    
    public final void setFlag(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
    android.os.PersistableBundle persistentState) {
    }
    
    @java.lang.Override()
    protected void injectDependencies(@org.jetbrains.annotations.NotNull()
    com.logic.nasa.di.component.ActivityComponent activityComponent) {
    }
    
    @java.lang.Override()
    public int provideLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"SourceLockedOrientationActivity"})
    @java.lang.Override()
    protected void setupView() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onRestart() {
    }
    
    public PlayVideoActivity() {
        super();
    }
}