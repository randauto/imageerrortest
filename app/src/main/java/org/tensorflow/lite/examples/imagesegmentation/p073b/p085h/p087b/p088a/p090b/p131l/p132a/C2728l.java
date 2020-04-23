package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.ArrayDeque;
import java.util.Set;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2758ag;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2734c;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2734c.C2735a;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2734c.C2737c;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2734c.C2738d;

/* renamed from: b.h.b.a.b.l.a.l */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C2728l {

    /* renamed from: a */
    public static final C2728l f7975a = new C2728l();

    private C2728l() {
    }

    /* renamed from: a */
    public final boolean mo9839a(C2731o oVar, C2755ad adVar, C2755ad adVar2) {
        C1489j.m6972b(oVar, "context");
        C1489j.m6972b(adVar, "subType");
        C1489j.m6972b(adVar2, "superType");
        return m13392b(oVar, adVar, adVar2);
    }

    /* renamed from: a */
    public final boolean mo9840a(C2788az azVar) {
        C1489j.m6972b(azVar, "type");
        return m13390a(new C2731o(false, false, 2, null), C2838t.m13860c(azVar), (C2734c) C2735a.f7994a);
    }

    /* renamed from: b */
    private final boolean m13392b(C2731o oVar, C2755ad adVar, C2755ad adVar2) {
        boolean z = C2726j.m13389c(adVar) || C2726j.m13388b(adVar) || oVar.mo9849a((C2788az) adVar);
        if (!C3232z.f8648a || z) {
            boolean z2 = C2726j.m13388b(adVar2) || oVar.mo9849a((C2788az) adVar2);
            if (C3232z.f8648a && !z2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Not singleClassifierType superType: ");
                sb.append(adVar2);
                throw new AssertionError(sb.toString());
            } else if (adVar2.mo7897c() || C2758ag.m13481c(adVar) || m13390a(oVar, adVar, (C2734c) C2735a.f7994a)) {
                return true;
            } else {
                if (!C2758ag.m13481c(adVar2) && !m13390a(oVar, adVar2, (C2734c) C2738d.f7997a) && !C2726j.m13387a(adVar)) {
                    return m13391a(oVar, adVar, adVar2.mo9507g());
                }
                return false;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Not singleClassifierType superType: ");
            sb2.append(adVar2);
            throw new AssertionError(sb2.toString());
        }
    }

    /* renamed from: a */
    private final boolean m13390a(C2731o oVar, C2755ad adVar, C2734c cVar) {
        C2755ad adVar2 = adVar;
        if ((C2726j.m13387a(adVar) && !adVar.mo7897c()) || C2758ag.m13481c(adVar2)) {
            return true;
        }
        oVar.m13403c();
        ArrayDeque c = oVar.f7981c;
        if (c == null) {
            C1489j.m6968a();
        }
        Set d = oVar.f7982d;
        if (d == null) {
            C1489j.m6968a();
        }
        c.push(adVar2);
        while (!c.isEmpty()) {
            if (d.size() <= 1000) {
                C2755ad adVar3 = (C2755ad) c.pop();
                C1489j.m6969a((Object) adVar3, "current");
                if (d.add(adVar3)) {
                    C2734c cVar2 = adVar3.mo7897c() ? C2737c.f7996a : cVar;
                    if (!(!C1489j.m6971a((Object) cVar2, (Object) C2737c.f7996a))) {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        for (C2841w wVar : adVar3.mo9507g().mo7405C_()) {
                            C1489j.m6969a((Object) wVar, "supertype");
                            C2755ad a = cVar2.mo9851a(wVar);
                            if ((C2726j.m13387a(a) && !a.mo7897c()) || C2758ag.m13481c(a)) {
                                oVar.m13405d();
                                return true;
                            }
                            c.add(a);
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(adVar2);
                sb.append(". Supertypes = ");
                sb.append(C1415k.m6859a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        oVar.m13405d();
        return false;
    }

    /* renamed from: a */
    private final boolean m13391a(C2731o oVar, C2755ad adVar, C2767an anVar) {
        C2755ad adVar2 = adVar;
        C2767an anVar2 = anVar;
        if (!adVar.mo7897c() && C1489j.m6971a((Object) adVar.mo9507g(), (Object) anVar2)) {
            return true;
        }
        oVar.m13403c();
        ArrayDeque c = oVar.f7981c;
        if (c == null) {
            C1489j.m6968a();
        }
        Set d = oVar.f7982d;
        if (d == null) {
            C1489j.m6968a();
        }
        c.push(adVar2);
        while (!c.isEmpty()) {
            if (d.size() <= 1000) {
                C2755ad adVar3 = (C2755ad) c.pop();
                C1489j.m6969a((Object) adVar3, "current");
                if (d.add(adVar3)) {
                    C2734c cVar = adVar3.mo7897c() ? C2737c.f7996a : C2735a.f7994a;
                    if (!(!C1489j.m6971a((Object) cVar, (Object) C2737c.f7996a))) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        for (C2841w wVar : adVar3.mo9507g().mo7405C_()) {
                            C1489j.m6969a((Object) wVar, "supertype");
                            C2755ad a = cVar.mo9851a(wVar);
                            if (!a.mo7897c() && C1489j.m6971a((Object) a.mo9507g(), (Object) anVar2)) {
                                oVar.m13405d();
                                return true;
                            }
                            c.add(a);
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(adVar2);
                sb.append(". Supertypes = ");
                sb.append(C1415k.m6859a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        oVar.m13405d();
        return false;
    }
}
