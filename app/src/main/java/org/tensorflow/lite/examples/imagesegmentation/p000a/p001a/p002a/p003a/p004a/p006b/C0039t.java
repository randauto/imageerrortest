package p000a.p001a.p002a.p003a.p004a.p006b;

import android.content.Context;
import p000a.p001a.p002a.p003a.C0140c;
import p000a.p001a.p002a.p003a.p004a.p005a.C0005b;
import p000a.p001a.p002a.p003a.p004a.p005a.C0007d;

/* renamed from: a.a.a.a.a.b.t */
/* compiled from: InstallerPackageNameProvider */
public class C0039t {

    /* renamed from: a */
    private final C0007d<String> f83a = new C0007d<String>() {
        /* renamed from: a */
        public String load(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    };

    /* renamed from: b */
    private final C0005b<String> f84b = new C0005b<>();

    /* renamed from: a */
    public String mo77a(Context context) {
        try {
            String str = (String) this.f84b.mo18a(context, this.f83a);
            if ("".equals(str)) {
                str = null;
            }
            return str;
        } catch (Exception e) {
            C0140c.m397g().mo293e("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
