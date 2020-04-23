package p000a.p001a.p002a.p003a.p004a.p006b;

import android.content.Context;
import android.text.TextUtils;
import p000a.p001a.p002a.p003a.C0140c;

/* renamed from: a.a.a.a.a.b.r */
/* compiled from: FirebaseInfo */
public class C0036r {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo59a(Context context) {
        int a = C0020i.m40a(context, "google_app_id", "string");
        if (a == 0) {
            return null;
        }
        C0140c.m397g().mo283a("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return mo60a(context.getResources().getString(a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo60a(String str) {
        return C0020i.m67b(str).substring(0, 40);
    }

    /* renamed from: b */
    public boolean mo61b(Context context) {
        boolean z = false;
        if (C0020i.m61a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        if (mo64e(context) && !mo62c(context)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo62c(Context context) {
        if (!TextUtils.isEmpty(new C0018g().mo42c(context))) {
            return true;
        }
        return !TextUtils.isEmpty(new C0018g().mo43d(context));
    }

    /* renamed from: d */
    public boolean mo63d(Context context) {
        int a = C0020i.m40a(context, "io.fabric.auto_initialize", "bool");
        if (a == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(a);
        if (z) {
            C0140c.m397g().mo283a("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo64e(Context context) {
        int a = C0020i.m40a(context, "google_app_id", "string");
        if (a == 0) {
            return false;
        }
        return !TextUtils.isEmpty(context.getResources().getString(a));
    }
}
