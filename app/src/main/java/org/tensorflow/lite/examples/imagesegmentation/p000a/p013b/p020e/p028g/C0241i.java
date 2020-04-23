package p000a.p013b.p020e.p028g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.g.i */
/* compiled from: SchedulerPoolFactory */
public final class C0241i {

    /* renamed from: a */
    public static final boolean f481a;

    /* renamed from: b */
    public static final int f482b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f483c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f484d = new ConcurrentHashMap();

    /* renamed from: a.b.e.g.i$a */
    /* compiled from: SchedulerPoolFactory */
    static final class C0242a implements Runnable {
        C0242a() {
        }

        public void run() {
            try {
                Iterator it = new ArrayList(C0241i.f484d.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        C0241i.f484d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
            } catch (Throwable th) {
                C0254a.m674a(th);
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        int i = 1;
        boolean z = properties.containsKey("rx2.purge-enabled") ? Boolean.getBoolean("rx2.purge-enabled") : true;
        if (z && properties.containsKey("rx2.purge-period-seconds")) {
            i = Integer.getInteger("rx2.purge-period-seconds", 1).intValue();
        }
        f481a = z;
        f482b = i;
        m642a();
    }

    /* renamed from: a */
    public static void m642a() {
        if (f481a) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f483c.get();
                if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C0237f("RxSchedulerPurge"));
                    if (f483c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        newScheduledThreadPool.scheduleAtFixedRate(new C0242a(), (long) f482b, (long) f482b, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m641a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f481a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f484d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
