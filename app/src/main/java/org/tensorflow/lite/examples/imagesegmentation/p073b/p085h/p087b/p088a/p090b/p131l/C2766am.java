package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.l.am */
/* compiled from: TypeCapabilities.kt */
public final class C2766am {
    /* renamed from: a */
    public static final boolean m13506a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (!(l instanceof C2815f)) {
            l = null;
        }
        C2815f fVar = (C2815f) l;
        if (fVar != null) {
            return fVar.mo7892I_();
        }
        return false;
    }

    /* renamed from: b */
    public static final C2815f m13508b(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (!(l instanceof C2815f)) {
            l = null;
        }
        C2815f fVar = (C2815f) l;
        if (fVar == null || !fVar.mo7892I_()) {
            return null;
        }
        return fVar;
    }

    /* renamed from: c */
    public static final C2841w m13509c(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (!(l instanceof C2764ak)) {
            l = null;
        }
        C2764ak akVar = (C2764ak) l;
        if (akVar == null) {
            return wVar;
        }
        C2841w d = akVar.mo9504d();
        return d != null ? d : wVar;
    }

    /* renamed from: d */
    public static final C2841w m13510d(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (!(l instanceof C2764ak)) {
            l = null;
        }
        C2764ak akVar = (C2764ak) l;
        if (akVar == null) {
            return wVar;
        }
        C2841w e = akVar.mo9505e();
        return e != null ? e : wVar;
    }

    /* renamed from: a */
    public static final boolean m13507a(C2841w wVar, C2841w wVar2) {
        C1489j.m6972b(wVar, "first");
        C1489j.m6972b(wVar2, "second");
        C2788az l = wVar.mo9892l();
        if (!(l instanceof C2764ak)) {
            l = null;
        }
        C2764ak akVar = (C2764ak) l;
        if (!(akVar != null ? akVar.mo9502a(wVar2) : false)) {
            C2788az l2 = wVar2.mo9892l();
            if (!(l2 instanceof C2764ak)) {
                l2 = null;
            }
            C2764ak akVar2 = (C2764ak) l2;
            if (!(akVar2 != null ? akVar2.mo9502a(wVar) : false)) {
                return false;
            }
        }
        return true;
    }
}
