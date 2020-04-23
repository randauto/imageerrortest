package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.notify;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.provider.MediaStore.Images.Media;
import android.support.p053v4.app.C0710z.C0713c;
import android.support.p053v4.content.C0748c;
import android.util.Log;
import android.widget.RemoteViews;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.p156f.C3369h;
import com.bumptech.glide.p156f.p157a.C3350f;
import com.judi.emojiphoto.R;
import java.util.ArrayList;
import java.util.List;
import judi.com.C7139a;
import judi.com.kottlinbase.p272a.C7188b;
import judi.com.kottlinbase.p274ui.splash.SplashActivity;

public class PhotosContentJob extends JobService {

    /* renamed from: a */
    static final Uri f26301a = Uri.parse("content://media/");

    /* renamed from: b */
    static final List<String> f26302b = Media.EXTERNAL_CONTENT_URI.getPathSegments();

    /* renamed from: c */
    static final JobInfo f26303c;

    /* renamed from: d */
    final Handler f26304d = new Handler();

    /* renamed from: e */
    final Runnable f26305e = new Runnable() {
        public void run() {
            PhotosContentJob.m38410a(PhotosContentJob.this);
            PhotosContentJob.this.jobFinished(PhotosContentJob.this.f26306f, false);
        }
    };

    /* renamed from: f */
    JobParameters f26306f;

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    static {
        Builder builder = new Builder(998, new ComponentName("com.judi.emojiphoto", PhotosContentJob.class.getName()));
        if (VERSION.SDK_INT >= 24) {
            builder.addTriggerContentUri(new TriggerContentUri(Media.EXTERNAL_CONTENT_URI, 1));
            builder.addTriggerContentUri(new TriggerContentUri(f26301a, 0));
        }
        builder.setOverrideDeadline(0);
        f26303c = builder.build();
    }

    /* renamed from: a */
    public static void m38410a(Context context) {
        if (VERSION.SDK_INT >= 23) {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
            if (jobScheduler != null) {
                jobScheduler.schedule(f26303c);
            }
            Log.i("PhotosContentJob", "JOB SCHEDULED!");
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        boolean z;
        String string;
        Log.i("PhotosContentJob", "JOB STARTED!");
        this.f26306f = jobParameters;
        if (VERSION.SDK_INT < 24) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            if (jobParameters.getTriggeredContentUris() != null) {
                ArrayList arrayList = new ArrayList();
                z = false;
                for (Uri pathSegments : jobParameters.getTriggeredContentUris()) {
                    List pathSegments2 = pathSegments.getPathSegments();
                    if (pathSegments2 == null || pathSegments2.size() != f26302b.size() + 1) {
                        z = true;
                    } else {
                        arrayList.add(pathSegments2.get(pathSegments2.size() - 1));
                    }
                }
                if (arrayList.size() > 0 && C7188b.m38398a(getApplicationContext())) {
                    Cursor query = getContentResolver().query(Media.EXTERNAL_CONTENT_URI, new String[]{"_data", "_id"}, null, null, "date_added DESC LIMIT 3");
                    if (query != null) {
                        int columnIndex = query.getColumnIndex("_data");
                        while (true) {
                            if (!query.moveToNext()) {
                                break;
                            }
                            string = query.getString(columnIndex);
                            if (string.contains("Auto")) {
                                if (!string.contains("Blur")) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onStartJob: ");
                        sb2.append(string);
                        Log.d("PhotosContentJob", sb2.toString());
                        C7139a.m38192a().mo23013a(getApplicationContext());
                        if (System.currentTimeMillis() - C7139a.m38192a().mo23024g() > 36000000) {
                            m38411a(string, query.getCount());
                            C7139a.m38192a().mo23012a(System.currentTimeMillis());
                        } else {
                            Log.d("PhotosContentJob", "ignore");
                        }
                        query.close();
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                sb.append("Photos rescan needed!");
            }
        } else {
            sb.append("(No photos content)");
        }
        this.f26304d.postDelayed(this.f26305e, 10000);
        return true;
    }

    /* renamed from: a */
    private void m38411a(String str, int i) {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.view_remind_notify);
            if (str == null || str.isEmpty()) {
                remoteViews.setViewVisibility(R.id.imgNewPhoto, 8);
            } else {
                remoteViews.setViewVisibility(R.id.imgNewPhoto, 0);
            }
            if (i <= 1) {
                remoteViews.setViewVisibility(R.id.tvNumber, 8);
            } else {
                remoteViews.setViewVisibility(R.id.tvNumber, 8);
                StringBuilder sb = new StringBuilder();
                sb.append("+");
                sb.append(i);
                remoteViews.setTextViewText(R.id.tvNumber, String.valueOf(sb.toString()));
            }
            String str2 = "default_channel_id";
            String str3 = "Default Channel";
            if (VERSION.SDK_INT >= 26 && notificationManager.getNotificationChannel(str2) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(str2, str3, 3);
                notificationChannel.setLightColor(C0748c.m3004c(this, R.color.colorAccent));
                notificationChannel.enableVibration(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Intent intent = new Intent(this, SplashActivity.class);
            intent.setFlags(268468224);
            Notification b = new C0713c(this, str2).mo2410a((int) R.drawable.ic_push).mo2415a(remoteViews).mo2423c(C0748c.m3004c(this, R.color.colorAccent)).mo2420b(0).mo2413a(PendingIntent.getActivity(this, 0, intent, 0)).mo2418a(true).mo2419b();
            if (str != null && !str.isEmpty()) {
                C3350f fVar = new C3350f(getApplicationContext(), R.id.imgNewPhoto, remoteViews, b, 1212);
                C3303c.m15109b(getApplicationContext()).mo10845f().mo10832a(str).mo10667b(C3369h.m15420b().mo10666b(80, 80)).mo10821a(fVar);
            }
            notificationManager.notify(1212, b);
        }
    }
}
