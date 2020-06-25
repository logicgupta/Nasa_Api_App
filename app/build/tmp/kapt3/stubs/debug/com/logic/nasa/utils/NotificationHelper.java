package com.logic.nasa.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/logic/nasa/utils/NotificationHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cancelNotification", "", "id", "", "createAttachmentChannel", "createAttachmentNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "showNotification", "notification", "Landroid/app/Notification;", "Companion", "app_debug"})
public final class NotificationHelper {
    private final android.content.Context context = null;
    private static final java.lang.String CHANNEL_ID_ATTACHMENT = "attachment";
    private static final java.util.concurrent.atomic.AtomicInteger idAtomicInteger = null;
    public static final com.logic.nasa.utils.NotificationHelper.Companion Companion = null;
    
    public final void cancelNotification(int id) {
    }
    
    public final void showNotification(int id, @org.jetbrains.annotations.NotNull()
    android.app.Notification notification) {
    }
    
    public final void createAttachmentChannel() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder createAttachmentNotificationBuilder() {
        return null;
    }
    
    public NotificationHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/logic/nasa/utils/NotificationHelper$Companion;", "", "()V", "CHANNEL_ID_ATTACHMENT", "", "idAtomicInteger", "Ljava/util/concurrent/atomic/AtomicInteger;", "generateNotificationId", "", "app_debug"})
    public static final class Companion {
        
        public final int generateNotificationId() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}