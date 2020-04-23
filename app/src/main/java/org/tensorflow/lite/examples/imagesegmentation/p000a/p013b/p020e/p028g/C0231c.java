package p000a.p013b.p020e.p028g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0189e;
import p000a.p013b.C0189e.C0191b;
import p000a.p013b.p017b.C0165a;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p020e.p021a.C0194c;

/* renamed from: a.b.e.g.c */
/* compiled from: IoScheduler */
public final class C0231c extends C0189e {

    /* renamed from: b */
    static final C0237f f451b;

    /* renamed from: c */
    static final C0237f f452c;

    /* renamed from: d */
    static final C0234c f453d = new C0234c(new C0237f("RxCachedThreadSchedulerShutdown"));

    /* renamed from: g */
    static final C0232a f454g = new C0232a(0, null, f451b);

    /* renamed from: h */
    private static final TimeUnit f455h = TimeUnit.SECONDS;

    /* renamed from: e */
    final ThreadFactory f456e;

    /* renamed from: f */
    final AtomicReference<C0232a> f457f;

    /* renamed from: a.b.e.g.c$a */
    /* compiled from: IoScheduler */
    static final class C0232a implements Runnable {

        /* renamed from: a */
        final C0165a f458a;

        /* renamed from: b */
        private final long f459b;

        /* renamed from: c */
        private final ConcurrentLinkedQueue<C0234c> f460c;

        /* renamed from: d */
        private final ScheduledExecutorService f461d;

        /* renamed from: e */
        private final Future<?> f462e;

        /* renamed from: f */
        private final ThreadFactory f463f;

        C0232a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future<?> future;
            this.f459b = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f460c = new ConcurrentLinkedQueue<>();
            this.f458a = new C0165a();
            this.f463f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C0231c.f452c);
                future = scheduledExecutorService.scheduleWithFixedDelay(this, this.f459b, this.f459b, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.f461d = scheduledExecutorService;
            this.f462e = future;
        }

        public void run() {
            mo420b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0234c mo418a() {
            if (this.f458a.mo360b()) {
                return C0231c.f453d;
            }
            while (!this.f460c.isEmpty()) {
                C0234c cVar = (C0234c) this.f460c.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            C0234c cVar2 = new C0234c(this.f463f);
            this.f458a.mo359a((C0166b) cVar2);
            return cVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo419a(C0234c cVar) {
            cVar.mo424a(mo421c() + this.f459b);
            this.f460c.offer(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo420b() {
            if (!this.f460c.isEmpty()) {
                long c = mo421c();
                Iterator it = this.f460c.iterator();
                while (it.hasNext()) {
                    C0234c cVar = (C0234c) it.next();
                    if (cVar.mo425b() > c) {
                        return;
                    }
                    if (this.f460c.remove(cVar)) {
                        this.f458a.mo361b(cVar);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public long mo421c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo422d() {
            this.f458a.mo349a();
            if (this.f462e != null) {
                this.f462e.cancel(true);
            }
            if (this.f461d != null) {
                this.f461d.shutdownNow();
            }
        }
    }

    /* renamed from: a.b.e.g.c$b */
    /* compiled from: IoScheduler */
    static final class C0233b extends C0191b {

        /* renamed from: a */
        final AtomicBoolean f464a = new AtomicBoolean();

        /* renamed from: b */
        private final C0165a f465b;

        /* renamed from: c */
        private final C0232a f466c;

        /* renamed from: d */
        private final C0234c f467d;

        C0233b(C0232a aVar) {
            this.f466c = aVar;
            this.f465b = new C0165a();
            this.f467d = aVar.mo418a();
        }

        /* renamed from: a */
        public void mo349a() {
            if (this.f464a.compareAndSet(false, true)) {
                this.f465b.mo349a();
                this.f466c.mo419a(this.f467d);
            }
        }

        /* renamed from: a */
        public C0166b mo348a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f465b.mo360b()) {
                return C0194c.INSTANCE;
            }
            return this.f467d.mo426a(runnable, j, timeUnit, this.f465b);
        }
    }

    /* renamed from: a.b.e.g.c$c */
    /* compiled from: IoScheduler */
    static final class C0234c extends C0236e {

        /* renamed from: b */
        private long f468b = 0;

        C0234c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: b */
        public long mo425b() {
            return this.f468b;
        }

        /* renamed from: a */
        public void mo424a(long j) {
            this.f468b = j;
        }
    }

    static {
        f453d.mo349a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f451b = new C0237f("RxCachedThreadScheduler", max);
        f452c = new C0237f("RxCachedWorkerPoolEvictor", max);
        f454g.mo422d();
    }

    public C0231c() {
        this(f451b);
    }

    public C0231c(ThreadFactory threadFactory) {
        this.f456e = threadFactory;
        this.f457f = new AtomicReference<>(f454g);
        mo384b();
    }

    /* renamed from: b */
    public void mo384b() {
        C0232a aVar = new C0232a(60, f455h, this.f456e);
        if (!this.f457f.compareAndSet(f454g, aVar)) {
            aVar.mo422d();
        }
    }

    /* renamed from: a */
    public C0191b mo347a() {
        return new C0233b((C0232a) this.f457f.get());
    }
}
