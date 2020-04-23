package p000a.p001a.p002a.p003a;

import android.util.Log;

/* renamed from: a.a.a.a.b */
/* compiled from: DefaultLogger */
public class C0139b implements C0154l {

    /* renamed from: a */
    private int f307a;

    public C0139b(int i) {
        this.f307a = i;
    }

    public C0139b() {
        this.f307a = 4;
    }

    /* renamed from: a */
    public boolean mo285a(String str, int i) {
        return this.f307a <= i || Log.isLoggable(str, i);
    }

    /* renamed from: a */
    public void mo284a(String str, String str2, Throwable th) {
        if (mo285a(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: b */
    public void mo287b(String str, String str2, Throwable th) {
        if (mo285a(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: c */
    public void mo289c(String str, String str2, Throwable th) {
        if (mo285a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: d */
    public void mo291d(String str, String str2, Throwable th) {
        if (mo285a(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: e */
    public void mo293e(String str, String str2, Throwable th) {
        if (mo285a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: a */
    public void mo283a(String str, String str2) {
        mo284a(str, str2, (Throwable) null);
    }

    /* renamed from: b */
    public void mo286b(String str, String str2) {
        mo287b(str, str2, null);
    }

    /* renamed from: c */
    public void mo288c(String str, String str2) {
        mo289c(str, str2, null);
    }

    /* renamed from: d */
    public void mo290d(String str, String str2) {
        mo291d(str, str2, null);
    }

    /* renamed from: e */
    public void mo292e(String str, String str2) {
        mo293e(str, str2, null);
    }

    /* renamed from: a */
    public void mo281a(int i, String str, String str2) {
        mo282a(i, str, str2, false);
    }

    /* renamed from: a */
    public void mo282a(int i, String str, String str2, boolean z) {
        if (z || mo285a(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
