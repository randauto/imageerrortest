package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SystemBootReceive extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            PhotosContentJob.m38410a(context);
        }
    }
}
