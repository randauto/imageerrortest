package p145c.p146a.p147a;

import android.content.Context;
import android.os.Build.VERSION;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;

/* renamed from: c.a.a.k */
/* compiled from: Utils */
class C3264k {
    /* renamed from: a */
    static boolean m14943a() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    static int m14942a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", C0008a.ANDROID_CLIENT_TYPE);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
