package p000a.p001a.p002a.p003a.p004a.p007c;

import android.annotation.TargetApi;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: a.a.a.a.a.c.k */
/* compiled from: PriorityThreadPoolExecutor */
public class C0076k extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final int f154a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final int f155b = (f154a + 1);

    /* renamed from: c */
    private static final int f156c = ((f154a * 2) + 1);

    /* renamed from: a.a.a.a.a.c.k$a */
    /* compiled from: PriorityThreadPoolExecutor */
    protected static final class C0077a implements ThreadFactory {

        /* renamed from: a */
        private final int f157a;

        public C0077a(int i) {
            this.f157a = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f157a);
            thread.setName("Queue");
            return thread;
        }
    }

    <T extends Runnable & C0065b & C0078l & C0074i> C0076k(int i, int i2, long j, TimeUnit timeUnit, C0066c<T> cVar, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, cVar, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: a */
    public static <T extends Runnable & C0065b & C0078l & C0074i> C0076k m205a(int i, int i2) {
        C0076k kVar = new C0076k(i, i2, 1, TimeUnit.SECONDS, new C0066c(), new C0077a(10));
        return kVar;
    }

    /* renamed from: a */
    public static C0076k m204a() {
        return m205a(f155b, f156c);
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C0073h(runnable, t);
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C0073h(callable);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (C0075j.isProperDelegate(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        C0078l lVar = (C0078l) runnable;
        lVar.setFinished(true);
        lVar.setError(th);
        getQueue().mo130d();
        super.afterExecute(runnable, th);
    }

    /* renamed from: b */
    public C0066c getQueue() {
        return (C0066c) super.getQueue();
    }
}
