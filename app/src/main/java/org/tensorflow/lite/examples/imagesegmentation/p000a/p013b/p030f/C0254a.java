package p000a.p013b.p030f;

import java.util.concurrent.Callable;
import p000a.p013b.C0164b;
import p000a.p013b.C0181d;
import p000a.p013b.C0189e;
import p000a.p013b.p018c.C0171a;
import p000a.p013b.p018c.C0177c;
import p000a.p013b.p018c.C0178d;
import p000a.p013b.p018c.C0180f;
import p000a.p013b.p019d.C0183b;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p019d.C0186e;
import p000a.p013b.p020e.p022b.C0209b;
import p000a.p013b.p020e.p029h.C0250a;

/* renamed from: a.b.f.a */
/* compiled from: RxJavaPlugins */
public final class C0254a {

    /* renamed from: a */
    static volatile C0185d<? super Throwable> f512a;

    /* renamed from: b */
    static volatile C0186e<? super Runnable, ? extends Runnable> f513b;

    /* renamed from: c */
    static volatile C0186e<? super Callable<C0189e>, ? extends C0189e> f514c;

    /* renamed from: d */
    static volatile C0186e<? super Callable<C0189e>, ? extends C0189e> f515d;

    /* renamed from: e */
    static volatile C0186e<? super Callable<C0189e>, ? extends C0189e> f516e;

    /* renamed from: f */
    static volatile C0186e<? super Callable<C0189e>, ? extends C0189e> f517f;

    /* renamed from: g */
    static volatile C0186e<? super C0189e, ? extends C0189e> f518g;

    /* renamed from: h */
    static volatile C0186e<? super C0164b, ? extends C0164b> f519h;

    /* renamed from: i */
    static volatile C0183b<? super C0164b, ? super C0181d, ? extends C0181d> f520i;

    /* renamed from: a */
    public static C0189e m670a(Callable<C0189e> callable) {
        C0209b.m547a(callable, "Scheduler Callable can't be null");
        C0186e<? super Callable<C0189e>, ? extends C0189e> eVar = f514c;
        if (eVar == null) {
            return m680e(callable);
        }
        return m668a(eVar, callable);
    }

    /* renamed from: b */
    public static C0189e m675b(Callable<C0189e> callable) {
        C0209b.m547a(callable, "Scheduler Callable can't be null");
        C0186e<? super Callable<C0189e>, ? extends C0189e> eVar = f516e;
        if (eVar == null) {
            return m680e(callable);
        }
        return m668a(eVar, callable);
    }

    /* renamed from: c */
    public static C0189e m677c(Callable<C0189e> callable) {
        C0209b.m547a(callable, "Scheduler Callable can't be null");
        C0186e<? super Callable<C0189e>, ? extends C0189e> eVar = f517f;
        if (eVar == null) {
            return m680e(callable);
        }
        return m668a(eVar, callable);
    }

    /* renamed from: d */
    public static C0189e m679d(Callable<C0189e> callable) {
        C0209b.m547a(callable, "Scheduler Callable can't be null");
        C0186e<? super Callable<C0189e>, ? extends C0189e> eVar = f515d;
        if (eVar == null) {
            return m680e(callable);
        }
        return m668a(eVar, callable);
    }

    /* renamed from: a */
    public static void m674a(Throwable th) {
        C0185d<? super Throwable> dVar = f512a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m676b(th)) {
            th = new C0180f(th);
        }
        if (dVar != null) {
            try {
                dVar.mo381a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m678c(th2);
            }
        }
        th.printStackTrace();
        m678c(th);
    }

    /* renamed from: b */
    static boolean m676b(Throwable th) {
        if (!(th instanceof C0178d) && !(th instanceof C0177c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C0171a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    static void m678c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public static C0189e m669a(C0189e eVar) {
        C0186e<? super C0189e, ? extends C0189e> eVar2 = f518g;
        if (eVar2 == null) {
            return eVar;
        }
        return (C0189e) m672a(eVar2, (T) eVar);
    }

    /* renamed from: a */
    public static Runnable m673a(Runnable runnable) {
        C0209b.m547a(runnable, "run is null");
        C0186e<? super Runnable, ? extends Runnable> eVar = f513b;
        if (eVar == null) {
            return runnable;
        }
        return (Runnable) m672a(eVar, (T) runnable);
    }

    /* renamed from: a */
    public static <T> C0181d<? super T> m667a(C0164b<T> bVar, C0181d<? super T> dVar) {
        C0183b<? super C0164b, ? super C0181d, ? extends C0181d> bVar2 = f520i;
        return bVar2 != null ? (C0181d) m671a(bVar2, bVar, dVar) : dVar;
    }

    /* renamed from: a */
    public static <T> C0164b<T> m666a(C0164b<T> bVar) {
        C0186e<? super C0164b, ? extends C0164b> eVar = f519h;
        return eVar != null ? (C0164b) m672a(eVar, (T) bVar) : bVar;
    }

    /* renamed from: a */
    static <T, R> R m672a(C0186e<T, R> eVar, T t) {
        try {
            return eVar.mo382a(t);
        } catch (Throwable th) {
            throw C0250a.m658a(th);
        }
    }

    /* renamed from: a */
    static <T, U, R> R m671a(C0183b<T, U, R> bVar, T t, U u) {
        try {
            return bVar.mo380a(t, u);
        } catch (Throwable th) {
            throw C0250a.m658a(th);
        }
    }

    /* renamed from: e */
    static C0189e m680e(Callable<C0189e> callable) {
        try {
            return (C0189e) C0209b.m547a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C0250a.m658a(th);
        }
    }

    /* renamed from: a */
    static C0189e m668a(C0186e<? super Callable<C0189e>, ? extends C0189e> eVar, Callable<C0189e> callable) {
        return (C0189e) C0209b.m547a(m672a(eVar, (T) callable), "Scheduler Callable result can't be null");
    }
}
