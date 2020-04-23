package p000a.p001a.p002a.p003a.p004a.p006b;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: a.a.a.a.a.b.x */
/* compiled from: TimingMetric */
public class C0048x {

    /* renamed from: a */
    private final String f102a;

    /* renamed from: b */
    private final String f103b;

    /* renamed from: c */
    private final boolean f104c;

    /* renamed from: d */
    private long f105d;

    /* renamed from: e */
    private long f106e;

    public C0048x(String str, String str2) {
        this.f102a = str;
        this.f103b = str2;
        this.f104c = !Log.isLoggable(str2, 2);
    }

    /* renamed from: a */
    public synchronized void mo93a() {
        if (!this.f104c) {
            this.f105d = SystemClock.elapsedRealtime();
            this.f106e = 0;
        }
    }

    /* renamed from: b */
    public synchronized void mo94b() {
        if (!this.f104c) {
            if (this.f106e == 0) {
                this.f106e = SystemClock.elapsedRealtime() - this.f105d;
                m160c();
            }
        }
    }

    /* renamed from: c */
    private void m160c() {
        String str = this.f103b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f102a);
        sb.append(": ");
        sb.append(this.f106e);
        sb.append("ms");
        Log.v(str, sb.toString());
    }
}
