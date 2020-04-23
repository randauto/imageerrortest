package p073b.p085h.p087b.p088a.p090b.p091a.p093b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3221p;
import p073b.C3232z;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2768ao;
import p073b.p085h.p087b.p088a.p090b.p131l.C2768ao.C2769a;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.a.b.h */
/* compiled from: mappingUtil.kt */
public final class C1620h {
    /* renamed from: a */
    public static final C2768ao m7360a(C1796e eVar, C1796e eVar2) {
        C1489j.m6972b(eVar, "from");
        C1489j.m6972b(eVar2, "to");
        boolean z = eVar.mo7090z().size() == eVar2.mo7090z().size();
        if (!C3232z.f8648a || z) {
            C2769a aVar = C2768ao.f8029b;
            List z2 = eVar.mo7090z();
            C1489j.m6969a((Object) z2, "from.declaredTypeParameters");
            Iterable<C1700ar> iterable = z2;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C1700ar e : iterable) {
                arrayList.add(e.mo7067e());
            }
            Iterable iterable2 = (List) arrayList;
            List z3 = eVar2.mo7090z();
            C1489j.m6969a((Object) z3, "to.declaredTypeParameters");
            Iterable<C1700ar> iterable3 = z3;
            Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable3, 10));
            for (C1700ar arVar : iterable3) {
                C1489j.m6969a((Object) arVar, "it");
                C2755ad A_ = arVar.mo7346A_();
                C1489j.m6969a((Object) A_, "it.defaultType");
                arrayList2.add(C2803a.m13683f(A_));
            }
            return C2769a.m13520a(aVar, C1389ad.m6748a((Iterable<? extends C3221p<? extends K, ? extends V>>) C1415k.m6861a(iterable2, (Iterable<? extends R>) (List) arrayList2)), false, 2, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(eVar);
        sb.append(" and ");
        sb.append(eVar2);
        sb.append(" should have same number of type parameters, ");
        sb.append("but ");
        sb.append(eVar.mo7090z().size());
        sb.append(" / ");
        sb.append(eVar2.mo7090z().size());
        sb.append(" found");
        throw new AssertionError(sb.toString());
    }
}
