package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p106b;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3219n;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1861l;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2773ar;
import p073b.p085h.p087b.p088a.p090b.p131l.C2774as;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;

/* renamed from: b.h.b.a.b.d.a.c.b.e */
/* compiled from: RawType.kt */
public final class C1951e extends C2774as {

    /* renamed from: a */
    public static final C1951e f5896a = new C1951e();

    /* renamed from: b */
    private static final C1942a f5897b = C1949d.m9005a(C1861l.COMMON, false, (C1700ar) null, 3, (Object) null).mo7765a(C1943b.FLEXIBLE_LOWER_BOUND);

    /* renamed from: c */
    private static final C1942a f5898c = C1949d.m9005a(C1861l.COMMON, false, (C1700ar) null, 3, (Object) null).mo7765a(C1943b.FLEXIBLE_UPPER_BOUND);

    /* renamed from: a */
    public boolean mo7781a() {
        return false;
    }

    private C1951e() {
    }

    /* renamed from: a */
    public C2773ar mo7782b(C2841w wVar) {
        C1489j.m6972b(wVar, "key");
        return new C2773ar(m9014c(wVar));
    }

    /* renamed from: c */
    private final C2841w m9014c(C2841w wVar) {
        C2788az azVar;
        C1799h d = wVar.mo9507g().mo7096d();
        if (d instanceof C1700ar) {
            return m9014c(C1949d.m9009a((C1700ar) d, (C1700ar) null, (C1449a) null, 3, (Object) null));
        }
        if (d instanceof C1796e) {
            C1796e eVar = (C1796e) d;
            C3221p a = m9013a(C2838t.m13860c(wVar), eVar, f5897b);
            C2755ad adVar = (C2755ad) a.mo10389c();
            boolean booleanValue = ((Boolean) a.mo10390d()).booleanValue();
            C3221p a2 = m9013a(C2838t.m13861d(wVar), eVar, f5898c);
            C2755ad adVar2 = (C2755ad) a2.mo10389c();
            boolean booleanValue2 = ((Boolean) a2.mo10390d()).booleanValue();
            if (booleanValue || booleanValue2) {
                azVar = new C1953g(adVar, adVar2);
            } else {
                azVar = C2842x.m13883a(adVar, adVar2);
            }
            return azVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected declaration kind: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    private final C3221p<C2755ad, Boolean> m9013a(C2755ad adVar, C1796e eVar, C1942a aVar) {
        if (adVar.mo9507g().mo7094b().isEmpty()) {
            return C3226t.m14841a(adVar, Boolean.valueOf(false));
        }
        C2841w wVar = adVar;
        if (C1627g.m7409c(wVar)) {
            C2771ap apVar = (C2771ap) adVar.mo9501a().get(0);
            C2792ba b = apVar.mo9868b();
            C2841w c = apVar.mo9869c();
            C1489j.m6969a((Object) c, "componentTypeProjection.type");
            return C3226t.m14841a(C2842x.m13881a(adVar.mo7086x(), adVar.mo9507g(), C1415k.m6832a(new C2773ar(b, m9014c(c))), adVar.mo7897c()), Boolean.valueOf(false));
        } else if (C2843y.m13884a(wVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Raw error type: ");
            sb.append(adVar.mo9507g());
            return C3226t.m14841a(C2827p.m13791c(sb.toString()), Boolean.valueOf(false));
        } else {
            C1659h x = adVar.mo7086x();
            C2767an g = adVar.mo9507g();
            List b2 = adVar.mo9507g().mo7094b();
            C1489j.m6969a((Object) b2, "type.constructor.parameters");
            Iterable<C1700ar> iterable = b2;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C1700ar arVar : iterable) {
                C1951e eVar2 = f5896a;
                C1489j.m6969a((Object) arVar, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                arrayList.add(m9012a(eVar2, arVar, aVar, null, 4, null));
            }
            List list = (List) arrayList;
            boolean c2 = adVar.mo7897c();
            C2560h a = eVar.mo7356a(f5896a);
            C1489j.m6969a((Object) a, "declaration.getMemberScope(RawSubstitution)");
            return C3226t.m14841a(C2842x.m13882a(x, g, list, c2, a), Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C2771ap m9012a(C1951e eVar, C1700ar arVar, C1942a aVar, C2841w wVar, int i, Object obj) {
        if ((i & 4) != 0) {
            wVar = C1949d.m9009a(arVar, (C1700ar) null, (C1449a) null, 3, (Object) null);
        }
        return eVar.mo7779a(arVar, aVar, wVar);
    }

    /* renamed from: a */
    public final C2771ap mo7779a(C1700ar arVar, C1942a aVar, C2841w wVar) {
        C2771ap a;
        C1489j.m6972b(arVar, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        C1489j.m6972b(aVar, "attr");
        C1489j.m6972b(wVar, "erasedUpperBound");
        switch (C1952f.f5899a[aVar.mo7766b().ordinal()]) {
            case 1:
                return new C2773ar(C2792ba.INVARIANT, wVar);
            case 2:
            case 3:
                if (!arVar.mo7316k().mo9898b()) {
                    return new C2773ar(C2792ba.INVARIANT, C2524a.m12627d(arVar).mo7204q());
                }
                List b = wVar.mo9507g().mo7094b();
                C1489j.m6969a((Object) b, "erasedUpperBound.constructor.parameters");
                if (!b.isEmpty()) {
                    a = new C2773ar(C2792ba.OUT_VARIANCE, wVar);
                } else {
                    a = C1949d.m9007a(arVar, aVar);
                }
                return a;
            default:
                throw new C3219n();
        }
    }
}
