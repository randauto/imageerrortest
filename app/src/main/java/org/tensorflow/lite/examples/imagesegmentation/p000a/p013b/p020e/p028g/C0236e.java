package p000a.p013b.p020e.p028g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p000a.p013b.C0189e.C0191b;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p020e.p021a.C0192a;
import p000a.p013b.p020e.p021a.C0194c;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.g.e */
/* compiled from: NewThreadWorker */
public class C0236e extends C0191b implements C0166b {

    /* renamed from: a */
    volatile boolean f471a;

    /* renamed from: b */
    private final ScheduledExecutorService f472b;

    public C0236e(ThreadFactory threadFactory) {
        this.f472b = C0241i.m641a(threadFactory);
    }

    /* renamed from: a */
    public C0166b mo387a(Runnable runnable) {
        return mo348a(runnable, 0, null);
    }

    /* renamed from: a */
    public C0166b mo348a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f471a) {
            return C0194c.INSTANCE;
        }
        return mo426a(runnable, j, timeUnit, null);
    }

    /* renamed from: b */
    public C0166b mo427b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C0239g gVar = new C0239g(C0254a.m673a(runnable));
        if (j <= 0) {
            try {
                future = this.f472b.submit(gVar);
            } catch (RejectedExecutionException e) {
                C0254a.m674a((Throwable) e);
                return C0194c.INSTANCE;
            }
        } else {
            future = this.f472b.schedule(gVar, j, timeUnit);
        }
        gVar.mo415a(future);
        return gVar;
    }

    /* renamed from: a */
    public C0240h mo426a(Runnable runnable, long j, TimeUnit timeUnit, C0192a aVar) {
        Future future;
        C0240h hVar = new C0240h(C0254a.m673a(runnable), aVar);
        if (aVar != null && !aVar.mo359a(hVar)) {
            return hVar;
        }
        if (j <= 0) {
            try {
                future = this.f472b.submit(hVar);
            } catch (RejectedExecutionException e) {
                if (aVar != null) {
                    aVar.mo361b(hVar);
                }
                C0254a.m674a((Throwable) e);
            }
        } else {
            future = this.f472b.schedule(hVar, j, timeUnit);
        }
        hVar.mo433a(future);
        return hVar;
    }

    /* renamed from: a */
    public void mo349a() {
        if (!this.f471a) {
            this.f471a = true;
            this.f472b.shutdownNow();
        }
    }

    /* renamed from: c */
    public void mo428c() {
        if (!this.f471a) {
            this.f471a = true;
            this.f472b.shutdown();
        }
    }
}
