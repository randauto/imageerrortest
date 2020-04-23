package p000a.p013b.p020e.p028g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p020e.p022b.C0196a;

/* renamed from: a.b.e.g.a */
/* compiled from: AbstractDirectTask */
abstract class C0226a extends AtomicReference<Future<?>> implements C0166b {

    /* renamed from: c */
    protected static final FutureTask<Void> f433c = new FutureTask<>(C0196a.f384b, null);

    /* renamed from: d */
    protected static final FutureTask<Void> f434d = new FutureTask<>(C0196a.f384b, null);
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: a */
    protected final Runnable f435a;

    /* renamed from: b */
    protected Thread f436b;

    C0226a(Runnable runnable) {
        this.f435a = runnable;
    }

    /* renamed from: a */
    public final void mo349a() {
        Future future = (Future) get();
        if (future != f433c && future != f434d && compareAndSet(future, f434d) && future != null) {
            future.cancel(this.f436b != Thread.currentThread());
        }
    }

    /* renamed from: a */
    public final void mo415a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f433c) {
                if (future2 == f434d) {
                    future.cancel(this.f436b != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
