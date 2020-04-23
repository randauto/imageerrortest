package p000a.p013b.p020e.p028g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p013b.C0189e;
import p000a.p013b.C0189e.C0191b;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p017b.C0167c;
import p000a.p013b.p020e.p021a.C0194c;
import p000a.p013b.p020e.p022b.C0209b;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.g.k */
/* compiled from: TrampolineScheduler */
public final class C0245k extends C0189e {

    /* renamed from: b */
    private static final C0245k f492b = new C0245k();

    /* renamed from: a.b.e.g.k$a */
    /* compiled from: TrampolineScheduler */
    static final class C0246a implements Runnable {

        /* renamed from: a */
        private final Runnable f493a;

        /* renamed from: b */
        private final C0248c f494b;

        /* renamed from: c */
        private final long f495c;

        C0246a(Runnable runnable, C0248c cVar, long j) {
            this.f493a = runnable;
            this.f494b = cVar;
            this.f495c = j;
        }

        public void run() {
            if (!this.f494b.f502c) {
                long a = this.f494b.mo386a(TimeUnit.MILLISECONDS);
                if (this.f495c > a) {
                    long j = this.f495c - a;
                    if (j > 0) {
                        try {
                            Thread.sleep(j);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            C0254a.m674a((Throwable) e);
                            return;
                        }
                    }
                }
                if (!this.f494b.f502c) {
                    this.f493a.run();
                }
            }
        }
    }

    /* renamed from: a.b.e.g.k$b */
    /* compiled from: TrampolineScheduler */
    static final class C0247b implements Comparable<C0247b> {

        /* renamed from: a */
        final Runnable f496a;

        /* renamed from: b */
        final long f497b;

        /* renamed from: c */
        final int f498c;

        /* renamed from: d */
        volatile boolean f499d;

        C0247b(Runnable runnable, Long l, int i) {
            this.f496a = runnable;
            this.f497b = l.longValue();
            this.f498c = i;
        }

        /* renamed from: a */
        public int compareTo(C0247b bVar) {
            int a = C0209b.m546a(this.f497b, bVar.f497b);
            return a == 0 ? C0209b.m544a(this.f498c, bVar.f498c) : a;
        }
    }

    /* renamed from: a.b.e.g.k$c */
    /* compiled from: TrampolineScheduler */
    static final class C0248c extends C0191b implements C0166b {

        /* renamed from: a */
        final PriorityBlockingQueue<C0247b> f500a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        final AtomicInteger f501b = new AtomicInteger();

        /* renamed from: c */
        volatile boolean f502c;

        /* renamed from: d */
        private final AtomicInteger f503d = new AtomicInteger();

        /* renamed from: a.b.e.g.k$c$a */
        /* compiled from: TrampolineScheduler */
        final class C0249a implements Runnable {

            /* renamed from: a */
            final C0247b f504a;

            C0249a(C0247b bVar) {
                this.f504a = bVar;
            }

            public void run() {
                this.f504a.f499d = true;
                C0248c.this.f500a.remove(this.f504a);
            }
        }

        C0248c() {
        }

        /* renamed from: a */
        public C0166b mo387a(Runnable runnable) {
            return mo440a(runnable, mo386a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: a */
        public C0166b mo348a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo386a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo440a(new C0246a(runnable, this, a), a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0166b mo440a(Runnable runnable, long j) {
            if (this.f502c) {
                return C0194c.INSTANCE;
            }
            C0247b bVar = new C0247b(runnable, Long.valueOf(j), this.f501b.incrementAndGet());
            this.f500a.add(bVar);
            if (this.f503d.getAndIncrement() != 0) {
                return C0167c.m482a(new C0249a(bVar));
            }
            int i = 1;
            while (!this.f502c) {
                C0247b bVar2 = (C0247b) this.f500a.poll();
                if (bVar2 == null) {
                    i = this.f503d.addAndGet(-i);
                    if (i == 0) {
                        return C0194c.INSTANCE;
                    }
                } else if (!bVar2.f499d) {
                    bVar2.f496a.run();
                }
            }
            this.f500a.clear();
            return C0194c.INSTANCE;
        }

        /* renamed from: a */
        public void mo349a() {
            this.f502c = true;
        }
    }

    /* renamed from: c */
    public static C0245k m649c() {
        return f492b;
    }

    /* renamed from: a */
    public C0191b mo347a() {
        return new C0248c();
    }

    C0245k() {
    }

    /* renamed from: a */
    public C0166b mo383a(Runnable runnable) {
        C0254a.m673a(runnable).run();
        return C0194c.INSTANCE;
    }

    /* renamed from: a */
    public C0166b mo346a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C0254a.m673a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C0254a.m674a((Throwable) e);
        }
        return C0194c.INSTANCE;
    }
}
