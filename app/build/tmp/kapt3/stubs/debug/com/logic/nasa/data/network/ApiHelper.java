package com.logic.nasa.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/logic/nasa/data/network/ApiHelper;", "", "()V", "NETWORK_CALL_TIMEOUT", "", "getInterface", "Lcom/logic/nasa/data/network/ApiInterface;", "context", "Landroid/content/Context;", "cacheDir", "Ljava/io/File;", "cacheSize", "", "app_debug"})
@javax.inject.Singleton()
public final class ApiHelper {
    private static final int NETWORK_CALL_TIMEOUT = 60;
    public static final com.logic.nasa.data.network.ApiHelper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.logic.nasa.data.network.ApiInterface getInterface(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File cacheDir, long cacheSize) {
        return null;
    }
    
    private ApiHelper() {
        super();
    }
}