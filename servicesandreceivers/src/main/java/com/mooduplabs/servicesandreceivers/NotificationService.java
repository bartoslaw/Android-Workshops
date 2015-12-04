package com.mooduplabs.servicesandreceivers;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class NotificationService extends IntentService {

    private static final int INTERNET_NOTIFICATION_ID = 0;

    public NotificationService() {
        super(NotificationService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //todo odbierz wartość otrzymaną od broadcast receivera i na jej podstawie wyświetl notyfikację
        //http://developer.android.com/reference/android/support/v4/app/NotificationCompat.Builder.html
        String internetStatus = "?";

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(INTERNET_NOTIFICATION_ID, builder.build());
    }

}
