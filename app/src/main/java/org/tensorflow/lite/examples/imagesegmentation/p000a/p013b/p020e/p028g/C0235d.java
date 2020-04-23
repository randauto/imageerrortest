package p000a.p013b.p020e.p028g;

import java.util.concurrent.ThreadFactory;
import p000a.p013b.C0189e;
import p000a.p013b.C0189e.C0191b;

/* renamed from: a.b.e.g.d */
/* compiled from: NewThreadScheduler */
public final class C0235d extends C0189e {

    /* renamed from: c */
    private static final C0237f f469c = new C0237f("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f470b;

    public C0235d() {
        this(f469c);
    }

    public C0235d(ThreadFactory threadFactory) {
        this.f470b = threadFactory;
    }

    /* renamed from: a */
    public C0191b mo347a() {
        return new C0236e(this.f470b);
    }
}
