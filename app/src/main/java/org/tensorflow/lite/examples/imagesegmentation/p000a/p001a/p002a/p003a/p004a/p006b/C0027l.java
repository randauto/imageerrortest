package p000a.p001a.p002a.p003a.p004a.p006b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: a.a.a.a.a.b.l */
/* compiled from: DataCollectionArbiter */
public class C0027l {

    /* renamed from: a */
    private static C0027l f37a;

    /* renamed from: b */
    private static Object f38b = new Object();

    /* renamed from: c */
    private final SharedPreferences f39c;

    /* renamed from: d */
    private volatile boolean f40d;

    /* renamed from: e */
    private volatile boolean f41e;

    /* renamed from: f */
    private final C0034p f42f;

    /* renamed from: g */
    private boolean f43g = false;

    /* renamed from: a */
    public static C0027l m90a(Context context) {
        C0027l lVar;
        synchronized (f38b) {
            if (f37a == null) {
                f37a = new C0027l(context);
            }
            lVar = f37a;
        }
        return lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0027l(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f43g = r0
            if (r7 == 0) goto L_0x0070
            java.lang.String r1 = "com.google.firebase.crashlytics.prefs"
            android.content.SharedPreferences r1 = r7.getSharedPreferences(r1, r0)
            r6.f39c = r1
            a.a.a.a.a.b.p r1 = p000a.p001a.p002a.p003a.p004a.p006b.C0035q.m102a(r7)
            r6.f42f = r1
            android.content.SharedPreferences r1 = r6.f39c
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.contains(r2)
            r2 = 1
            if (r1 == 0) goto L_0x002b
            android.content.SharedPreferences r1 = r6.f39c
            java.lang.String r3 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.getBoolean(r3, r2)
        L_0x0029:
            r3 = 1
            goto L_0x0062
        L_0x002b:
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0054 }
            if (r1 == 0) goto L_0x0060
            java.lang.String r3 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0054 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0054 }
            if (r1 == 0) goto L_0x0060
            android.os.Bundle r3 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0054 }
            if (r3 == 0) goto L_0x0060
            android.os.Bundle r3 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0054 }
            java.lang.String r4 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r3.containsKey(r4)     // Catch:{ NameNotFoundException -> 0x0054 }
            if (r3 == 0) goto L_0x0060
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0054 }
            java.lang.String r3 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.getBoolean(r3)     // Catch:{ NameNotFoundException -> 0x0054 }
            goto L_0x0029
        L_0x0054:
            r1 = move-exception
            a.a.a.a.l r3 = p000a.p001a.p002a.p003a.C0140c.m397g()
            java.lang.String r4 = "Fabric"
            java.lang.String r5 = "Unable to get PackageManager. Falling through"
            r3.mo284a(r4, r5, r1)
        L_0x0060:
            r1 = 1
            r3 = 0
        L_0x0062:
            r6.f41e = r1
            r6.f40d = r3
            java.lang.String r7 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m83n(r7)
            if (r7 == 0) goto L_0x006d
            r0 = 1
        L_0x006d:
            r6.f43g = r0
            return
        L_0x0070:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p006b.C0027l.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public boolean mo52a() {
        if (this.f43g && this.f40d) {
            return this.f41e;
        }
        if (this.f42f != null) {
            return this.f42f.mo58a();
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo53b() {
        return this.f41e;
    }

    @SuppressLint({"CommitPrefEdits", "ApplySharedPref"})
    /* renamed from: a */
    public void mo51a(boolean z) {
        this.f41e = z;
        this.f40d = true;
        this.f39c.edit().putBoolean("firebase_crashlytics_collection_enabled", z).commit();
    }
}
