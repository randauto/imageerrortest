package p254d.p255a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Process;
import android.support.p053v4.app.C0625a;
import android.support.p053v4.app.C0639b;
import android.support.p053v4.content.C0767h;
import android.support.p053v4.p061f.C0808l;

/* renamed from: d.a.b */
/* compiled from: PermissionUtils */
public final class C6973b {

    /* renamed from: a */
    private static final C0808l<String, Integer> f24465a = new C0808l<>(8);

    static {
        f24465a.put("com.android.voicemail.permission.ADD_VOICEMAIL", Integer.valueOf(14));
        f24465a.put("android.permission.BODY_SENSORS", Integer.valueOf(20));
        f24465a.put("android.permission.READ_CALL_LOG", Integer.valueOf(16));
        f24465a.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(16));
        f24465a.put("android.permission.USE_SIP", Integer.valueOf(9));
        f24465a.put("android.permission.WRITE_CALL_LOG", Integer.valueOf(16));
        f24465a.put("android.permission.SYSTEM_ALERT_WINDOW", Integer.valueOf(23));
        f24465a.put("android.permission.WRITE_SETTINGS", Integer.valueOf(23));
    }

    /* renamed from: a */
    public static boolean m36300a(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m36299a(String str) {
        Integer num = (Integer) f24465a.get(str);
        return num == null || VERSION.SDK_INT >= num.intValue();
    }

    /* renamed from: a */
    public static boolean m36298a(Context context, String... strArr) {
        for (String str : strArr) {
            if (m36299a(str) && !m36297a(context, str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m36297a(Context context, String str) {
        if (VERSION.SDK_INT >= 23 && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            return m36301b(context, str);
        }
        boolean z = false;
        try {
            if (C0767h.m3063a(context, str) == 0) {
                z = true;
            }
            return z;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m36301b(Context context, String str) {
        String a = C0639b.m2318a(str);
        boolean z = true;
        if (a == null) {
            return true;
        }
        if (!(C0639b.m2316a(context, a, Process.myUid(), context.getPackageName()) == 0 && C0767h.m3063a(context, str) == 0)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m36296a(Activity activity, String... strArr) {
        for (String a : strArr) {
            if (C0625a.m2279a(activity, a)) {
                return true;
            }
        }
        return false;
    }
}
