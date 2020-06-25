package com.logic.nasa.utils

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import java.util.concurrent.atomic.AtomicInteger

class NotificationHelper(private val context: Context) {

    companion object {
        private const val CHANNEL_ID_ATTACHMENT = "attachment"

        private val idAtomicInteger = AtomicInteger(0)

        fun generateNotificationId(): Int = idAtomicInteger.incrementAndGet()
    }

    fun cancelNotification(id: Int) {
        NotificationManagerCompat.from(context).cancel(id)
    }

    fun showNotification(id: Int, notification: Notification) {
        NotificationManagerCompat.from(context).notify(id, notification)
    }

    fun createAttachmentChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Attachments"
            val descriptionText =
                "Notifications related to attachment, such as downloads"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID_ATTACHMENT, name, importance).apply {
                description = descriptionText
            }
            val notificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    fun createAttachmentNotificationBuilder(): NotificationCompat.Builder =
        NotificationCompat.Builder(context, CHANNEL_ID_ATTACHMENT)
}