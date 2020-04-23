package p000a.p013b.p020e.p028g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0189e;
import p000a.p013b.C0189e.C0191b;
import p000a.p013b.p017b.C0165a;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p020e.p021a.C0194c;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.g.j */
/* compiled from: SingleScheduler */
public final class C0243j extends C0189e {

    /* renamed from: d */
    static final C0237f f485d = new C0237f("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: e */
    static final ScheduledExecutorService f486e = Executors.newScheduledThreadPool(0);

    /* renamed from: b */
    final ThreadFactory f487b;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f488c;

    /* renamed from: a.b.e.g.j$a */
    /* compiled from: SingleScheduler */
    static final class C0244a extends C0191b {

        /* renamed from: a */
        final ScheduledExecutorService f489a;

        /* renamed from: b */
        final C0165a f490b = new C0165a();

        /* renamed from: c */
        volatile boolean f491c;

        C0244a(ScheduledExecutorService scheduledExecutorService) {
            this.f489a = scheduledExecutorService;
        }

        /* renamed from: a */
        public C0166b mo348a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f491c) {
                return C0194c.INSTANCE;
            }
            C0240h hVar = new C0240h(C0254a.m673a(runnable), this.f490b);
            this.f490b.mo359a((C0166b) hVar);
            if (j <= 0) {
                try {
                    future = this.f489a.submit(hVar);
                } catch (RejectedExecutionException e) {
                    mo349a();
                    C0254a.m674a((Throwable) e);
                    return C0194c.INSTANCE;
                }
            } else {
                future = this.f489a.schedule(hVar, j, timeUnit);
            }
            hVar.mo433a(future);
            return hVar;
        }

        /* renamed from: a */
        public void mo349a() {
            if (!this.f491c) {
                this.f491c = true;
                this.f490b.mo349a();
            }
        }
    }

    static {
        f486e.shutdown();
    }

    public C0243j() {
        this(f485d);
    }

    public C0243j(ThreadFactory threadFactory) {
        this.f488c = new AtomicReference<>();
        this.f487b = threadFactory;
        this.f488c.lazySet(m643a(threadFactory));
    }

    /* renamed from: a */
    static ScheduledExecutorService m643a(ThreadFactory threadFactory) {
        return C0241i.m641a(threadFactory);
    }

    /* renamed from: b */
    public void mo384b() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = (ScheduledExecutorService) this.f488c.get();
            if (scheduledExecutorService != f486e) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = m643a(this.f487b);
            }
        } while (!this.f488c.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    /* renamed from: a */
    public C0191b mo347a() {
        return new C0244a((ScheduledExecutorService) this.f488c.get());
    }

    /* renamed from: a */
    public C0166b mo346a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C0239g gVar = new C0239g(C0254a.m673a(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f488c.get()).submit(gVar);
            } catch (RejectedExecutionException e) {
                C0254a.m674a((Throwable) e);
                return C0194c.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f488c.get()).schedule(gVar, j, timeUnit);
        }
        gVar.mo415a(future);
        return gVar;
    }
}
