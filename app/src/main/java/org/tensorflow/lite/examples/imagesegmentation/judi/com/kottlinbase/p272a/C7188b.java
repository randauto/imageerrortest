package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p272a;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.support.p053v4.app.C0625a;
import android.support.p053v4.app.C0639b;
import android.support.p053v4.content.C0748c;

/* renamed from: judi.com.kottlinbase.a.b */
/* compiled from: PermissionUtil */
public class C7188b {
    /* renamed from: a */
    public static boolean m38398a(Context context) {
        return m38399a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* renamed from: a */
    private static boolean m38399a(Context context, String str) {
        if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            return m38400b(context, str);
        }
        return C0748c.m3001b(context, str) == 0;
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m38400b(Context context, String str) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        boolean z = false;
        if (appOpsManager == null) {
            return false;
        }
        String a = C0639b.m2318a(str);
        if ((a == null || appOpsManager.checkOpNoThrow(a, Process.myUid(), context.getPackageName()) == 0) && C0625a.m3001b(context, str) == 0) {
            z = true;
        }
        return z;
    }
}
