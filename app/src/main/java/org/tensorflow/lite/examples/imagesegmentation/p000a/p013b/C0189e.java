package p000a.p013b;

import java.util.concurrent.TimeUnit;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p020e.p028g.C0236e;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e */
/* compiled from: Scheduler */
public abstract class C0189e {

    /* renamed from: a */
    static final long f372a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: a.b.e$a */
    /* compiled from: Scheduler */
    static final class C0190a implements C0166b, Runnable {

        /* renamed from: a */
        final Runnable f373a;

        /* renamed from: b */
        final C0191b f374b;

        /* renamed from: c */
        Thread f375c;

        C0190a(Runnable runnable, C0191b bVar) {
            this.f373a = runnable;
            this.f374b = bVar;
        }

        public void run() {
            this.f375c = Thread.currentThread();
            try {
                this.f373a.run();
            } finally {
                mo349a();
                this.f375c = null;
            }
        }

        /* renamed from: a */
        public void mo349a() {
            if (this.f375c != Thread.currentThread() || !(this.f374b instanceof C0236e)) {
                this.f374b.mo349a();
            } else {
                ((C0236e) this.f374b).mo428c();
            }
        }
    }

    /* renamed from: a.b.e$b */
    /* compiled from: Scheduler */
    public static abstract class C0191b implements C0166b {
        /* renamed from: a */
        public abstract C0166b mo348a(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: a */
        public C0166b mo387a(Runnable runnable) {
            return mo348a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public long mo386a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public abstract C0191b mo347a();

    /* renamed from: b */
    public void mo384b() {
    }

    /* renamed from: a */
    public C0166b mo383a(Runnable runnable) {
        return mo346a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public C0166b mo346a(Runnable runnable, long j, TimeUnit timeUnit) {
        C0191b a = mo347a();
        C0190a aVar = new C0190a(C0254a.m673a(runnable), a);
        a.mo348a(aVar, j, timeUnit);
        return aVar;
    }
}
