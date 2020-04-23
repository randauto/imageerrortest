package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3221p;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1747ah;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2088o;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1932l;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2129i;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2517s;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2535b;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2625f;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2626g;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.d.a.b.i */
/* compiled from: util.kt */
public final class C1873i {
    /* renamed from: a */
    public static final List<C1705au> m8631a(Collection<C1874j> collection, Collection<? extends C1705au> collection2, C1648a aVar) {
        Collection<C1874j> collection3 = collection;
        Collection<? extends C1705au> collection4 = collection2;
        C1648a aVar2 = aVar;
        C1489j.m6972b(collection3, "newValueParametersTypes");
        C1489j.m6972b(collection4, "oldValueParameters");
        C1489j.m6972b(aVar2, "newOwner");
        boolean z = collection.size() == collection2.size();
        if (!C3232z.f8648a || z) {
            Iterable<C3221p> a = C1415k.m6861a((Iterable<? extends T>) collection3, (Iterable<? extends R>) collection4);
            Collection arrayList = new ArrayList(C1415k.m6842a(a, 10));
            for (C3221p pVar : a) {
                C1874j jVar = (C1874j) pVar.mo10389c();
                C1705au auVar = (C1705au) pVar.mo10390d();
                int c = auVar.mo7323c();
                C1659h x = auVar.mo7086x();
                C2360f z_ = auVar.mo7351z_();
                C1489j.m6969a((Object) z_, "oldParameter.name");
                C2841w a2 = jVar.mo7632a();
                boolean b = jVar.mo7633b();
                boolean o = auVar.mo7327o();
                boolean q = auVar.mo7328q();
                C2841w a3 = auVar.mo7325m() != null ? C2524a.m12626c(aVar2).mo7522a().mo7187a(jVar.mo7632a()) : null;
                C1692am y = auVar.mo7088y();
                C1489j.m6969a((Object) y, "oldParameter.source");
                C1747ah ahVar = new C1747ah(aVar, null, c, x, z_, a2, b, o, q, a3, y);
                arrayList.add(ahVar);
            }
            return (List) arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Different value parameters sizes: Enhanced = ");
        sb.append(collection.size());
        sb.append(", Old = ");
        sb.append(collection2.size());
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public static final C1932l m8629a(C1796e eVar) {
        C1489j.m6972b(eVar, "$receiver");
        C1796e a = C2524a.m12617a(eVar);
        if (a == null) {
            return null;
        }
        C2560h x_ = a.mo7087x_();
        if (!(x_ instanceof C1932l)) {
            return m8629a(a);
        }
        return (C1932l) x_;
    }

    /* renamed from: a */
    public static final C2535b m8630a(C2626g gVar) {
        C1489j.m6972b(gVar, "$receiver");
        C2625f N = gVar.mo9635N();
        if (!(N instanceof C2129i)) {
            N = null;
        }
        C2129i iVar = (C2129i) N;
        if (iVar != null) {
            return iVar.mo8044d();
        }
        return null;
    }

    /* renamed from: a */
    public static final C1863a m8628a(C1705au auVar) {
        C1489j.m6972b(auVar, "$receiver");
        C1659h x = auVar.mo7086x();
        C2355b bVar = C2088o.f6336n;
        C1489j.m6969a((Object) bVar, "JvmAnnotationNames.DEFAULT_VALUE_FQ_NAME");
        C1651c a = x.mo7254a(bVar);
        if (a != null) {
            C2500f b = C2524a.m12624b(a);
            if (b != null) {
                if (!(b instanceof C2517s)) {
                    b = null;
                }
                C2517s sVar = (C2517s) b;
                if (sVar != null) {
                    String str = (String) sVar.mo9521a();
                    if (str != null) {
                        return new C1872h(str);
                    }
                }
            }
        }
        C1659h x2 = auVar.mo7086x();
        C2355b bVar2 = C2088o.f6337o;
        C1489j.m6969a((Object) bVar2, "JvmAnnotationNames.DEFAULT_NULL_FQ_NAME");
        if (x2.mo7257b(bVar2)) {
            return C1871g.f5716a;
        }
        return null;
    }
}
