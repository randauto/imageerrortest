package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import java.util.List;
import p073b.C3221p;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b.C1866d;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b.C1867e;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2130j;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2130j.C2133c;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2147r;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2531d;
import p073b.p085h.p087b.p088a.p090b.p119i.C2531d.C2532a;
import p073b.p085h.p087b.p088a.p090b.p119i.C2531d.C2533b;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.d.a.l */
/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
public final class C2081l implements C2531d {

    /* renamed from: a */
    public static final C2082a f6317a = new C2082a(null);

    /* renamed from: b.h.b.a.b.d.a.l$a */
    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class C2082a {
        private C2082a() {
        }

        public /* synthetic */ C2082a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo7971a(C1648a aVar, C1648a aVar2) {
            C1489j.m6972b(aVar, "superDescriptor");
            C1489j.m6972b(aVar2, "subDescriptor");
            if (!(aVar2 instanceof C1867e) || !(aVar instanceof C1813t)) {
                return false;
            }
            C1867e eVar = (C1867e) aVar2;
            C1813t tVar = (C1813t) aVar;
            boolean z = eVar.mo7236i().size() == tVar.mo7236i().size();
            if (!C3232z.f8648a || z) {
                C1691al o = eVar.mo7365r();
                C1489j.m6969a((Object) o, "subDescriptor.original");
                List i = o.mo7236i();
                C1489j.m6969a((Object) i, "subDescriptor.original.valueParameters");
                Iterable iterable = i;
                C1813t r = tVar.mo7365r();
                C1489j.m6969a((Object) r, "superDescriptor.original");
                List i2 = r.mo7236i();
                C1489j.m6969a((Object) i2, "superDescriptor.original.valueParameters");
                for (C3221p pVar : C1415k.m6861a(iterable, (Iterable<? extends R>) i2)) {
                    C1705au auVar = (C1705au) pVar.mo10389c();
                    C1705au auVar2 = (C1705au) pVar.mo10390d();
                    C2082a aVar3 = this;
                    C1813t tVar2 = (C1813t) aVar2;
                    C1489j.m6969a((Object) auVar, "subParameter");
                    boolean z2 = aVar3.m9323a(tVar2, auVar) instanceof C2133c;
                    C1489j.m6969a((Object) auVar2, "superParameter");
                    if (z2 != (aVar3.m9323a(tVar, auVar2) instanceof C2133c)) {
                        return true;
                    }
                }
                return false;
            }
            throw new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size");
        }

        /* renamed from: a */
        private final C2130j m9323a(C1813t tVar, C1705au auVar) {
            if (C2147r.m9580a((C1648a) tVar) || m9324a(tVar)) {
                C2841w r = auVar.mo7320r();
                C1489j.m6969a((Object) r, "valueParameterDescriptor.type");
                return C2147r.m9575a(C2803a.m13679b(r));
            }
            C2841w r2 = auVar.mo7320r();
            C1489j.m6969a((Object) r2, "valueParameterDescriptor.type");
            return C2147r.m9575a(r2);
        }

        /* renamed from: a */
        private final boolean m9324a(C1813t tVar) {
            boolean z = true;
            if (tVar.mo7236i().size() != 1) {
                return false;
            }
            C1804m b = tVar.mo7065b();
            if (!(b instanceof C1796e)) {
                b = null;
            }
            C1796e eVar = (C1796e) b;
            if (eVar == null) {
                return false;
            }
            List i = tVar.mo7236i();
            C1489j.m6969a((Object) i, "f.valueParameters");
            Object j = C1415k.m6890j(i);
            C1489j.m6969a(j, "f.valueParameters.single()");
            C1799h d = ((C1705au) j).mo7320r().mo9507g().mo7096d();
            if (!(d instanceof C1796e)) {
                d = null;
            }
            C1796e eVar2 = (C1796e) d;
            if (eVar2 == null) {
                return false;
            }
            if (!C1627g.m7401b(eVar) || !C1489j.m6971a((Object) C2524a.m12623b((C1804m) eVar), (Object) C2524a.m12623b((C1804m) eVar2))) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: a */
    public C2533b mo7970a(C1648a aVar, C1648a aVar2, C1796e eVar) {
        C1489j.m6972b(aVar, "superDescriptor");
        C1489j.m6972b(aVar2, "subDescriptor");
        if (m9320b(aVar, aVar2, eVar)) {
            return C2533b.INCOMPATIBLE;
        }
        if (f6317a.mo7971a(aVar, aVar2)) {
            return C2533b.INCOMPATIBLE;
        }
        return C2533b.UNKNOWN;
    }

    /* renamed from: b */
    private final boolean m9320b(C1648a aVar, C1648a aVar2, C1796e eVar) {
        if (!(aVar instanceof C1724b) || !(aVar2 instanceof C1813t) || C1627g.m7393a((C1804m) aVar2)) {
            return false;
        }
        C1975d dVar = C1975d.f5932a;
        C1813t tVar = (C1813t) aVar2;
        C2360f z_ = tVar.mo7351z_();
        C1489j.m6969a((Object) z_, "subDescriptor.name");
        if (!dVar.mo7817a(z_)) {
            C1875c cVar = C1875c.f5720a;
            C2360f z_2 = tVar.mo7351z_();
            C1489j.m6969a((Object) z_2, "subDescriptor.name");
            if (!cVar.mo7636a(z_2)) {
                return false;
            }
        }
        C1724b c = C2092s.m9377c((C1724b) aVar);
        boolean z = aVar instanceof C1813t;
        C1813t tVar2 = (C1813t) (!z ? null : aVar);
        if ((tVar2 == null || tVar.mo7470t() != tVar2.mo7470t()) && (c == null || !tVar.mo7470t())) {
            return true;
        }
        if (!(eVar instanceof C1866d) || tVar.mo7469s() != null || c == null || C2092s.m9372a(eVar, (C1648a) c)) {
            return false;
        }
        if ((c instanceof C1813t) && z && C1975d.m9075a((C1813t) c) != null) {
            String a = C2147r.m9578a(tVar, false, false, 2, null);
            C1813t r = ((C1813t) aVar).mo7365r();
            C1489j.m6969a((Object) r, "superDescriptor.original");
            if (C1489j.m6971a((Object) a, (Object) C2147r.m9578a(r, false, false, 2, null))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public C2532a mo7969a() {
        return C2532a.CONFLICTS_ONLY;
    }
}
