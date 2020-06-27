package com.logic.nasa.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0014J\u0012\u00100\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020+H\u0014J-\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\u00052\u000e\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0007072\u0006\u00108\u001a\u000209H\u0016\u00a2\u0006\u0002\u0010:J\u0006\u0010;\u001a\u00020+J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020+H\u0014J\b\u0010>\u001a\u00020+H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR\u001c\u0010\'\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000b\u00a8\u0006?"}, d2 = {"Lcom/logic/nasa/ui/main/MainActivity;", "Lcom/logic/nasa/utils/BaseActivity;", "Lcom/logic/nasa/ui/main/MainViewModel;", "()V", "STORAGE_PERMISSION_CODE", "", "day", "", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "downloadId", "", "getDownloadId", "()J", "setDownloadId", "(J)V", "fileName", "fileUrl", "getFileUrl", "setFileUrl", "manager", "Landroid/app/DownloadManager;", "getManager", "()Landroid/app/DownloadManager;", "setManager", "(Landroid/app/DownloadManager;)V", "mediaType", "getMediaType", "setMediaType", "month", "getMonth", "setMonth", "onDownloadComplete", "Landroid/content/BroadcastReceiver;", "url", "getUrl", "setUrl", "year", "getYear", "setYear", "checkPermission", "", "getDownloadFile", "injectDependencies", "activityComponent", "Lcom/logic/nasa/di/component/ActivityComponent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openDatePicker", "provideLayoutId", "setupObservers", "setupView", "app_debug"})
public final class MainActivity extends com.logic.nasa.utils.BaseActivity<com.logic.nasa.ui.main.MainViewModel> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String day;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String month;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String year;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fileUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mediaType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String url;
    private final int STORAGE_PERMISSION_CODE = 1000;
    private java.lang.String fileName;
    private long downloadId = 0L;
    @org.jetbrains.annotations.NotNull()
    public android.app.DownloadManager manager;
    private final android.content.BroadcastReceiver onDownloadComplete = null;
    private java.util.HashMap _$_findViewCache;
    
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDay() {
        return null;
    }
    
    public final void setDay(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMonth() {
        return null;
    }
    
    public final void setMonth(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYear() {
        return null;
    }
    
    public final void setYear(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFileUrl() {
        return null;
    }
    
    public final void setFileUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMediaType() {
        return null;
    }
    
    public final void setMediaType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getDownloadId() {
        return 0L;
    }
    
    public final void setDownloadId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.DownloadManager getManager() {
        return null;
    }
    
    public final void setManager(@org.jetbrains.annotations.NotNull()
    android.app.DownloadManager p0) {
    }
    
    @java.lang.Override()
    protected void setupObservers() {
    }
    
    public final void getDownloadFile() {
    }
    
    public final void checkPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void setupView() {
    }
    
    public final void openDatePicker() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainActivity() {
        super();
    }
}