package p000a.p001a.p002a.p003a.p004a.p007c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.support.p072v8.renderscript.Allocation;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a.a.a.a.a.c.a */
/* compiled from: AsyncTask */
public abstract class C0049a<Params, Progress, Result> {

    /* renamed from: a */
    private static final int f107a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    public static final Executor f108b;

    /* renamed from: c */
    public static final Executor f109c = new C0056c();

    /* renamed from: d */
    private static final int f110d = (f107a + 1);

    /* renamed from: e */
    private static final int f111e = ((f107a * 2) + 1);

    /* renamed from: f */
    private static final ThreadFactory f112f = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f121a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTask #");
            sb.append(this.f121a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f113g = new LinkedBlockingQueue(Allocation.USAGE_SHARED);

    /* renamed from: h */
    private static final C0055b f114h = new C0055b();

    /* renamed from: i */
    private static volatile Executor f115i = f109c;

    /* renamed from: j */
    private final C0059e<Params, Result> f116j = new C0059e<Params, Result>() {
        public Result call() {
            C0049a.this.f120n.set(true);
            Process.setThreadPriority(10);
            return C0049a.this.m168d(C0049a.this.mo96a((Params[]) this.f135b));
        }
    };

    /* renamed from: k */
    private final FutureTask<Result> f117k = new FutureTask<Result>(this.f116j) {
        /* access modifiers changed from: protected */
        public void done() {
            try {
                C0049a.this.m167c(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C0049a.this.m167c(null);
            }
        }
    };

    /* renamed from: l */
    private volatile C0058d f118l = C0058d.PENDING;

    /* renamed from: m */
    private final AtomicBoolean f119m = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final AtomicBoolean f120n = new AtomicBoolean();

    /* renamed from: a.a.a.a.a.c.a$a */
    /* compiled from: AsyncTask */
    private static class C0054a<Data> {

        /* renamed from: a */
        final C0049a f125a;

        /* renamed from: b */
        final Data[] f126b;

        C0054a(C0049a aVar, Data... dataArr) {
            this.f125a = aVar;
            this.f126b = dataArr;
        }
    }

    /* renamed from: a.a.a.a.a.c.a$b */
    /* compiled from: AsyncTask */
    private static class C0055b extends Handler {
        public C0055b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C0054a aVar = (C0054a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f125a.m169e(aVar.f126b[0]);
                    return;
                case 2:
                    aVar.f125a.mo102b((Progress[]) aVar.f126b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a.a.a.a.a.c.a$c */
    /* compiled from: AsyncTask */
    private static class C0056c implements Executor {

        /* renamed from: a */
        final LinkedList<Runnable> f127a;

        /* renamed from: b */
        Runnable f128b;

        private C0056c() {
            this.f127a = new LinkedList<>();
        }

        public synchronized void execute(final Runnable runnable) {
            this.f127a.offer(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        C0056c.this.mo109a();
                    }
                }
            });
            if (this.f128b == null) {
                mo109a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized void mo109a() {
            Runnable runnable = (Runnable) this.f127a.poll();
            this.f128b = runnable;
            if (runnable != null) {
                C0049a.f108b.execute(this.f128b);
            }
        }
    }

    /* renamed from: a.a.a.a.a.c.a$d */
    /* compiled from: AsyncTask */
    public enum C0058d {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: a.a.a.a.a.c.a$e */
    /* compiled from: AsyncTask */
    private static abstract class C0059e<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f135b;

        private C0059e() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo96a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo97a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo102b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo103c() {
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f110d, f111e, 1, TimeUnit.SECONDS, f113g, f112f);
        f108b = threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m167c(Result result) {
        if (!this.f120n.get()) {
            m168d(result);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Result m168d(Result result) {
        f114h.obtainMessage(1, new C0054a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: b */
    public final C0058d mo100b() {
        return this.f118l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo101b(Result result) {
        mo103c();
    }

    /* renamed from: d */
    public final boolean mo104d() {
        return this.f119m.get();
    }

    /* renamed from: a */
    public final boolean mo99a(boolean z) {
        this.f119m.set(true);
        return this.f117k.cancel(z);
    }

    /* renamed from: a */
    public final C0049a<Params, Progress, Result> mo95a(Executor executor, Params... paramsArr) {
        if (this.f118l != C0058d.PENDING) {
            switch (this.f118l) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f118l = C0058d.RUNNING;
        mo97a();
        this.f116j.f135b = paramsArr;
        executor.execute(this.f117k);
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m169e(Result result) {
        if (mo104d()) {
            mo101b(result);
        } else {
            mo98a(result);
        }
        this.f118l = C0058d.FINISHED;
    }
}
