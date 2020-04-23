package p073b.p085h.p087b.p088a.p090b.p131l.p134c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3219n;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2759ah;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2773ar;
import p073b.p085h.p087b.p088a.p090b.p131l.C2777at;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2786ax;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2834q;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2717c;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2721e;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2727k;

/* renamed from: b.h.b.a.b.l.c.a */
/* compiled from: TypeUtils.kt */
public final class C2803a {
    /* renamed from: a */
    public static final C1627g m13674a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1627g e = wVar.mo9507g().mo7407e();
        C1489j.m6969a((Object) e, "constructor.builtIns");
        return e;
    }

    /* renamed from: b */
    public static final C2841w m13679b(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return C2783av.m13577c(wVar);
    }

    /* renamed from: c */
    public static final C2841w m13680c(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return C2783av.m13578d(wVar);
    }

    /* renamed from: d */
    public static final boolean m13681d(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return C1627g.m7431s(wVar);
    }

    /* renamed from: e */
    public static final boolean m13682e(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return C2783av.m13584j(wVar);
    }

    /* renamed from: a */
    public static final boolean m13678a(C2841w wVar, C2841w wVar2) {
        C1489j.m6972b(wVar, "$receiver");
        C1489j.m6972b(wVar2, "superType");
        return C2717c.f7961a.mo9823a(wVar, wVar2);
    }

    /* renamed from: a */
    public static final C2841w m13676a(C2841w wVar, C1659h hVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1489j.m6972b(hVar, "newAnnotations");
        if (!wVar.mo7086x().mo7255a() || !hVar.mo7255a()) {
            return wVar.mo9892l().mo7788b(hVar);
        }
        return wVar;
    }

    /* renamed from: a */
    public static final C2771ap m13675a(C2841w wVar, C2792ba baVar, C1700ar arVar) {
        C1489j.m6972b(wVar, "type");
        C1489j.m6972b(baVar, "projectionKind");
        if ((arVar != null ? arVar.mo7316k() : null) == baVar) {
            baVar = C2792ba.INVARIANT;
        }
        return new C2773ar(baVar, wVar);
    }

    /* renamed from: f */
    public static final C2771ap m13683f(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return new C2773ar(wVar);
    }

    /* renamed from: a */
    public static final boolean m13677a(C2788az azVar) {
        C1489j.m6972b(azVar, "$receiver");
        return (azVar.mo9507g() instanceof C2727k) || (azVar.mo9507g().mo7096d() instanceof C1700ar) || (azVar instanceof C2721e);
    }

    /* renamed from: g */
    public static final C2841w m13684g(C2841w wVar) {
        C2788az azVar;
        C1489j.m6972b(wVar, "$receiver");
        C2788az l = wVar.mo9892l();
        if (l instanceof C2834q) {
            C2834q qVar = (C2834q) l;
            C2755ad f = qVar.mo9945f();
            if (!f.mo9507g().mo7094b().isEmpty() && f.mo9507g().mo7096d() != null) {
                List b = f.mo9507g().mo7094b();
                C1489j.m6969a((Object) b, "constructor.parameters");
                Iterable<C1700ar> iterable = b;
                Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
                for (C1700ar ahVar : iterable) {
                    arrayList.add(new C2759ah(ahVar));
                }
                f = C2777at.m13544a(f, (List) arrayList, (C1659h) null, 2, (Object) null);
            }
            C2755ad h = qVar.mo9946h();
            if (!h.mo9507g().mo7094b().isEmpty() && h.mo9507g().mo7096d() != null) {
                List b2 = h.mo9507g().mo7094b();
                C1489j.m6969a((Object) b2, "constructor.parameters");
                Iterable<C1700ar> iterable2 = b2;
                Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable2, 10));
                for (C1700ar ahVar2 : iterable2) {
                    arrayList2.add(new C2759ah(ahVar2));
                }
                h = C2777at.m13544a(h, (List) arrayList2, (C1659h) null, 2, (Object) null);
            }
            azVar = C2842x.m13883a(f, h);
        } else if (l instanceof C2755ad) {
            C2755ad adVar = (C2755ad) l;
            if (!adVar.mo9507g().mo7094b().isEmpty() && adVar.mo9507g().mo7096d() != null) {
                List b3 = adVar.mo9507g().mo7094b();
                C1489j.m6969a((Object) b3, "constructor.parameters");
                Iterable<C1700ar> iterable3 = b3;
                Collection arrayList3 = new ArrayList(C1415k.m6842a(iterable3, 10));
                for (C1700ar ahVar3 : iterable3) {
                    arrayList3.add(new C2759ah(ahVar3));
                }
                adVar = C2777at.m13544a(adVar, (List) arrayList3, (C1659h) null, 2, (Object) null);
            }
            azVar = adVar;
        } else {
            throw new C3219n();
        }
        return C2786ax.m13593a(azVar, l);
    }
}
