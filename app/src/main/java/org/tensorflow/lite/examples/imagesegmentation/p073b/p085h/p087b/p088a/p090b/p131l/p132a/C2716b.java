package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3219n;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2825n;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2834q;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;

/* renamed from: b.h.b.a.b.l.a.b */
/* compiled from: IntersectionType.kt */
public final class C2716b {
    /* renamed from: a */
    public static final C2788az m13339a(List<? extends C2788az> list) {
        C2755ad adVar;
        C1489j.m6972b(list, "types");
        switch (list.size()) {
            case 0:
                throw new IllegalStateException("Expected some types".toString());
            case 1:
                return (C2788az) C1415k.m6890j(list);
            default:
                Iterable<C2788az> iterable = list;
                Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
                boolean z = false;
                boolean z2 = false;
                for (C2788az azVar : iterable) {
                    z = z || C2843y.m13884a(azVar);
                    if (azVar instanceof C2755ad) {
                        adVar = (C2755ad) azVar;
                    } else if (!(azVar instanceof C2834q)) {
                        throw new C3219n();
                    } else if (C2825n.m13766a(azVar)) {
                        return azVar;
                    } else {
                        adVar = ((C2834q) azVar).mo9945f();
                        z2 = true;
                    }
                    arrayList.add(adVar);
                }
                List list2 = (List) arrayList;
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Intersection of error types: ");
                    sb.append(list);
                    C2755ad c = C2827p.m13791c(sb.toString());
                    C1489j.m6969a((Object) c, "ErrorUtils.createErrorTy… of error types: $types\")");
                    return c;
                } else if (!z2) {
                    return C2744s.f8006a.mo9860a(list2);
                } else {
                    Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable, 10));
                    for (C2788az d : iterable) {
                        arrayList2.add(C2838t.m13861d(d));
                    }
                    return C2842x.m13883a(C2744s.f8006a.mo9860a(list2), C2744s.f8006a.mo9860a((List) arrayList2));
                }
        }
    }
}
