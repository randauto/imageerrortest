package p000a.p001a.p002a.p003a.p004a.p009d;

import android.content.Context;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;

/* renamed from: a.a.a.a.a.d.i */
/* compiled from: TimeBasedFileRollOverRunnable */
public class C0090i implements Runnable {

    /* renamed from: a */
    private final Context f167a;

    /* renamed from: b */
    private final C0086e f168b;

    public C0090i(Context context, C0086e eVar) {
        this.f167a = context;
        this.f168b = eVar;
    }

    public void run() {
        try {
            C0020i.m55a(this.f167a, "Performing time based file roll over.");
            if (!this.f168b.rollFileOver()) {
                this.f168b.cancelTimeBasedFileRollOver();
            }
        } catch (Exception e) {
            C0020i.m56a(this.f167a, "Failed to roll over file", (Throwable) e);
        }
    }
}
