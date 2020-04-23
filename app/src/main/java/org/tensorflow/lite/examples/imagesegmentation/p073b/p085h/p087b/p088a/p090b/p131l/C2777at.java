package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.C3219n;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;

/* renamed from: b.h.b.a.b.l.at */
/* compiled from: TypeSubstitution.kt */
public final class C2777at {
    /* renamed from: a */
    public static /* synthetic */ C2841w m13547a(C2841w wVar, List list, C1659h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wVar.mo9501a();
        }
        if ((i & 2) != 0) {
            hVar = wVar.mo7086x();
        }
        return m13546a(wVar, list, hVar);
    }

    /* renamed from: a */
    public static final C2841w m13546a(C2841w wVar, List<? extends C2771ap> list, C1659h hVar) {
        C2841w wVar2;
        C1489j.m6972b(wVar, "$receiver");
        C1489j.m6972b(list, "newArguments");
        C1489j.m6972b(hVar, "newAnnotations");
        if ((list.isEmpty() || list == wVar.mo9501a()) && hVar == wVar.mo7086x()) {
            return wVar;
        }
        C2788az l = wVar.mo9892l();
        if (l instanceof C2834q) {
            C2834q qVar = (C2834q) l;
            wVar2 = C2842x.m13883a(m13543a(qVar.mo9945f(), list, hVar), m13543a(qVar.mo9946h(), list, hVar));
        } else if (l instanceof C2755ad) {
            wVar2 = m13543a((C2755ad) l, list, hVar);
        } else {
            throw new C3219n();
        }
        return wVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ C2755ad m13544a(C2755ad adVar, List list, C1659h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adVar.mo9501a();
        }
        if ((i & 2) != 0) {
            hVar = adVar.mo7086x();
        }
        return m13543a(adVar, list, hVar);
    }

    /* renamed from: a */
    public static final C2755ad m13543a(C2755ad adVar, List<? extends C2771ap> list, C1659h hVar) {
        C1489j.m6972b(adVar, "$receiver");
        C1489j.m6972b(list, "newArguments");
        C1489j.m6972b(hVar, "newAnnotations");
        if (list.isEmpty() && hVar == adVar.mo7086x()) {
            return adVar;
        }
        if (list.isEmpty()) {
            return adVar.mo7896c(hVar);
        }
        return C2842x.m13881a(hVar, adVar.mo9507g(), list, adVar.mo7897c());
    }

    /* renamed from: a */
    public static final C2755ad m13545a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (!(l instanceof C2755ad)) {
            l = null;
        }
        C2755ad adVar = (C2755ad) l;
        if (adVar != null) {
            return adVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This is should be simple type: ");
        sb.append(wVar);
        throw new IllegalStateException(sb.toString().toString());
    }
}
