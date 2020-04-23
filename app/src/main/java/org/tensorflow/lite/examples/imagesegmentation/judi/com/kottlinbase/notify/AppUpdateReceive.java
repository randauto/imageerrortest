package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.notify;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.p053v4.app.C0710z.C0713c;
import android.support.p053v4.content.C0748c;
import com.judi.emojiphoto.R;
import judi.com.C7139a;
import judi.com.kottlinbase.p274ui.splash.SplashActivity;

public class AppUpdateReceive extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (C7139a.m38192a().mo23017b()) {
            C7139a.m38192a().mo23018c();
            m38409a(context);
        }
    }

    /* renamed from: a */
    private void m38409a(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            String str = "default_channel_id";
            String str2 = "Default Channel";
            if (VERSION.SDK_INT >= 26 && notificationManager.getNotificationChannel(str) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(str, str2, 3);
                notificationChannel.setLightColor(C0748c.m3004c(context, R.color.colorAccent));
                notificationChannel.enableVibration(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Intent intent = new Intent(context, SplashActivity.class);
            intent.setFlags(268468224);
            notificationManager.notify(10101, new C0713c(context, str).mo2410a((int) R.drawable.ic_push).mo2416a((CharSequence) context.getString(R.string.app_name)).mo2421b((CharSequence) context.getString(R.string.msg_creator)).mo2420b(0).mo2413a(PendingIntent.getActivity(context, 0, intent, 0)).mo2418a(true).mo2419b());
        }
    }
}
