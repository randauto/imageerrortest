package p000a.p013b.p014a.p015a;

import java.util.concurrent.Callable;
import p000a.p013b.C0189e;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p019d.C0186e;

/* renamed from: a.b.a.a.a */
/* compiled from: RxAndroidPlugins */
public final class C0157a {

    /* renamed from: a */
    private static volatile C0186e<Callable<C0189e>, C0189e> f355a;

    /* renamed from: b */
    private static volatile C0186e<C0189e, C0189e> f356b;

    /* renamed from: a */
    public static C0189e m455a(Callable<C0189e> callable) {
        if (callable != null) {
            C0186e<Callable<C0189e>, C0189e> eVar = f355a;
            if (eVar == null) {
                return m457b(callable);
            }
            return m453a(eVar, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: a */
    public static C0189e m454a(C0189e eVar) {
        if (eVar != null) {
            C0186e<C0189e, C0189e> eVar2 = f356b;
            if (eVar2 == null) {
                return eVar;
            }
            return (C0189e) m456a(eVar2, (T) eVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: b */
    static C0189e m457b(Callable<C0189e> callable) {
        try {
            C0189e eVar = (C0189e) callable.call();
            if (eVar != null) {
                return eVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C0176b.m497a(th);
        }
    }

    /* renamed from: a */
    static C0189e m453a(C0186e<Callable<C0189e>, C0189e> eVar, Callable<C0189e> callable) {
        C0189e eVar2 = (C0189e) m456a(eVar, (T) callable);
        if (eVar2 != null) {
            return eVar2;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: a */
    static <T, R> R m456a(C0186e<T, R> eVar, T t) {
        try {
            return eVar.mo382a(t);
        } catch (Throwable th) {
            throw C0176b.m497a(th);
        }
    }
}
