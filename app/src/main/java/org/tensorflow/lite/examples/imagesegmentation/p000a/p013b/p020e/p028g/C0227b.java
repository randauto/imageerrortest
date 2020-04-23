package p000a.p013b.p020e.p028g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0189e;
import p000a.p013b.C0189e.C0191b;
import p000a.p013b.p017b.C0165a;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p020e.p021a.C0194c;
import p000a.p013b.p020e.p021a.C0195d;

/* renamed from: a.b.e.g.b */
/* compiled from: ComputationScheduler */
public final class C0227b extends C0189e {

    /* renamed from: b */
    static final C0229b f437b = new C0229b(0, f438c);

    /* renamed from: c */
    static final C0237f f438c = new C0237f("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);

    /* renamed from: d */
    static final int f439d = m611a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: e */
    static final C0230c f440e = new C0230c(new C0237f("RxComputationShutdown"));

    /* renamed from: f */
    final ThreadFactory f441f;

    /* renamed from: g */
    final AtomicReference<C0229b> f442g;

    /* renamed from: a.b.e.g.b$a */
    /* compiled from: ComputationScheduler */
    static final class C0228a extends C0191b {

        /* renamed from: a */
        volatile boolean f443a;

        /* renamed from: b */
        private final C0195d f444b = new C0195d();

        /* renamed from: c */
        private final C0165a f445c = new C0165a();

        /* renamed from: d */
        private final C0195d f446d = new C0195d();

        /* renamed from: e */
        private final C0230c f447e;

        C0228a(C0230c cVar) {
            this.f447e = cVar;
            this.f446d.mo359a((C0166b) this.f444b);
            this.f446d.mo359a((C0166b) this.f445c);
        }

        /* renamed from: a */
        public void mo349a() {
            if (!this.f443a) {
                this.f443a = true;
                this.f446d.mo349a();
            }
        }

        /* renamed from: a */
        public C0166b mo387a(Runnable runnable) {
            if (this.f443a) {
                return C0194c.INSTANCE;
            }
            return this.f447e.mo426a(runnable, 0, TimeUnit.MILLISECONDS, this.f444b);
        }

        /* renamed from: a */
        public C0166b mo348a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f443a) {
                return C0194c.INSTANCE;
            }
            return this.f447e.mo426a(runnable, j, timeUnit, this.f445c);
        }
    }

    /* renamed from: a.b.e.g.b$b */
    /* compiled from: ComputationScheduler */
    static final class C0229b {

        /* renamed from: a */
        final int f448a;

        /* renamed from: b */
        final C0230c[] f449b;

        /* renamed from: c */
        long f450c;

        C0229b(int i, ThreadFactory threadFactory) {
            this.f448a = i;
            this.f449b = new C0230c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f449b[i2] = new C0230c(threadFactory);
            }
        }

        /* renamed from: a */
        public C0230c mo416a() {
            int i = this.f448a;
            if (i == 0) {
                return C0227b.f440e;
            }
            C0230c[] cVarArr = this.f449b;
            long j = this.f450c;
            this.f450c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo417b() {
            for (C0230c a : this.f449b) {
                a.mo349a();
            }
        }
    }

    /* renamed from: a.b.e.g.b$c */
    /* compiled from: ComputationScheduler */
    static final class C0230c extends C0236e {
        C0230c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    /* renamed from: a */
    static int m611a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    static {
        f440e.mo349a();
        f437b.mo417b();
    }

    public C0227b() {
        this(f438c);
    }

    public C0227b(ThreadFactory threadFactory) {
        this.f441f = threadFactory;
        this.f442g = new AtomicReference<>(f437b);
        mo384b();
    }

    /* renamed from: a */
    public C0191b mo347a() {
        return new C0228a(((C0229b) this.f442g.get()).mo416a());
    }

    /* renamed from: a */
    public C0166b mo346a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C0229b) this.f442g.get()).mo416a().mo427b(runnable, j, timeUnit);
    }

    /* renamed from: b */
    public void mo384b() {
        C0229b bVar = new C0229b(f439d, this.f441f);
        if (!this.f442g.compareAndSet(f437b, bVar)) {
            bVar.mo417b();
        }
    }
}
