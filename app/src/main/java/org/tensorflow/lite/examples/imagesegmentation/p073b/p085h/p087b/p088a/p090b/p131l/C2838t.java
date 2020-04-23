package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.C3219n;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.l.t */
/* compiled from: flexibleTypes.kt */
public final class C2838t {
    /* renamed from: a */
    public static final boolean m13858a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return wVar.mo9892l() instanceof C2834q;
    }

    /* renamed from: b */
    public static final C2834q m13859b(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (l != null) {
            return (C2834q) l;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
    }

    /* renamed from: c */
    public static final C2755ad m13860c(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (l instanceof C2834q) {
            return ((C2834q) l).mo9945f();
        }
        if (l instanceof C2755ad) {
            return (C2755ad) l;
        }
        throw new C3219n();
    }

    /* renamed from: d */
    public static final C2755ad m13861d(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (l instanceof C2834q) {
            return ((C2834q) l).mo9946h();
        }
        if (l instanceof C2755ad) {
            return (C2755ad) l;
        }
        throw new C3219n();
    }
}
