package com.mooduplabs.servicesandreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectivityReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //TODO wystartuj NotificationService i przekaż do niego informującę o stanie połączenia z internetem
        //http://developer.android.com/reference/android/content/Intent.html
    }

    private boolean isNetworkOn(Context context) {
        //TODO sprawdź stan internetu HINT: użyj klasy NetworkInfo którą możesz uzyskać dzięki systemowemu ConnectivityManager
        //http://developer.android.com/reference/android/net/ConnectivityManager.html
        //http://developer.android.com/reference/android/net/NetworkInfo.html
        return false;
    }


}
