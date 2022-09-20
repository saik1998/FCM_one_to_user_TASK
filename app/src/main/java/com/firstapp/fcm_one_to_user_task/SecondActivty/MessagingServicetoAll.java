package com.firstapp.fcm_one_to_user_task.SecondActivty;

import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingServicetoAll extends FirebaseMessagingService {
    NotificationHelper notificationHelper;
    Class activityName;
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        notificationHelper=new NotificationHelper(this);
        notificationHelper.createChannels(message.getNotification().getTitle(),message.getNotification().getBody(),activityName);
    }

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("TAG", "onNewToken: "+token);
    }
}

