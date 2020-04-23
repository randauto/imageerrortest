package p000a.p013b.p020e.p028g;

import java.util.concurrent.Callable;

/* renamed from: a.b.e.g.g */
/* compiled from: ScheduledDirectTask */
public final class C0239g extends C0226a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public C0239g(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: b */
    public Void call() {
        this.f436b = Thread.currentThread();
        try {
            this.f435a.run();
            return null;
        } finally {
            lazySet(f433c);
            this.f436b = null;
        }
    }
}
