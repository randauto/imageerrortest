package p000a.p001a.p002a.p003a.p004a.p006b;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p000a.p001a.p002a.p003a.C0140c;

/* renamed from: a.a.a.a.a.b.o */
/* compiled from: ExecutorUtils */
public final class C0030o {
    /* renamed from: a */
    public static ExecutorService m96a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(m100c(str));
        m97a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m99b(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(m100c(str));
        m97a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: c */
    public static final ThreadFactory m100c(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1);
        return new ThreadFactory() {
            public Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new C0019h() {
                    public void onRun() {
                        runnable.run();
                    }
                });
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(atomicLong.getAndIncrement());
                newThread.setName(sb.toString());
                return newThread;
            }
        };
    }

    /* renamed from: a */
    private static final void m97a(String str, ExecutorService executorService) {
        m98a(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public static final void m98a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        final String str2 = str;
        final ExecutorService executorService2 = executorService;
        final long j2 = j;
        final TimeUnit timeUnit2 = timeUnit;
        C00332 r2 = new C0019h() {
            public void onRun() {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Executing shutdown hook for ");
                    sb.append(str2);
                    C0140c.m397g().mo283a("Fabric", sb.toString());
                    executorService2.shutdown();
                    if (!executorService2.awaitTermination(j2, timeUnit2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                        C0140c.m397g().mo283a("Fabric", sb2.toString());
                        executorService2.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    C0140c.m397g().mo283a("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str2}));
                    executorService2.shutdownNow();
                }
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(r2, sb.toString()));
    }
}
