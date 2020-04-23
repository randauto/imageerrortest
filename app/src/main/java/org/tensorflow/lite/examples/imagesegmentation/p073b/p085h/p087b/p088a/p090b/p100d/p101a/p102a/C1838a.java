package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import p073b.C3230x;
import p073b.p079e.p080a.C1450b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1992g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1994i;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1995j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2001p;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2002q;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2007v;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2010y;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2582h;
import p073b.p085h.p087b.p088a.p090b.p119i.C2584j;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2663m;

/* renamed from: b.h.b.a.b.d.a.a.a */
/* compiled from: DescriptorResolverUtils */
public final class C1838a {
    /* renamed from: a */
    public static <D extends C1724b> Collection<D> m8533a(C2360f fVar, Collection<D> collection, Collection<D> collection2, C1796e eVar, C2663m mVar) {
        return m8534a(fVar, collection, collection2, eVar, mVar, false);
    }

    /* renamed from: b */
    public static <D extends C1724b> Collection<D> m8538b(C2360f fVar, Collection<D> collection, Collection<D> collection2, C1796e eVar, C2663m mVar) {
        return m8534a(fVar, collection, collection2, eVar, mVar, true);
    }

    /* renamed from: a */
    private static <D extends C1724b> Collection<D> m8534a(C2360f fVar, Collection<D> collection, Collection<D> collection2, C1796e eVar, final C2663m mVar, final boolean z) {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        C2584j.m12828a(fVar, collection, collection2, eVar, new C2582h() {
            /* renamed from: a */
            public void mo7449a(C1724b bVar, C1724b bVar2) {
            }

            /* renamed from: a */
            public void mo7448a(C1724b bVar) {
                C2584j.m12825a(bVar, (C1450b<C1724b, C3230x>) new C1450b<C1724b, C3230x>() {
                    /* renamed from: a */
                    public C3230x mo6756a(C1724b bVar) {
                        mVar.mo7007a(bVar);
                        return C3230x.f8645a;
                    }
                });
                linkedHashSet.add(bVar);
            }

            /* renamed from: a */
            public void mo7592a(C1724b bVar, Collection<? extends C1724b> collection) {
                if (!z || bVar.mo7344n() == C1725a.FAKE_OVERRIDE) {
                    super.mo7592a(bVar, collection);
                }
            }
        });
        return linkedHashSet;
    }

    /* renamed from: a */
    public static C1705au m8532a(C2360f fVar, C1796e eVar) {
        Collection k = eVar.mo7072k();
        if (k.size() != 1) {
            return null;
        }
        for (C1705au auVar : ((C1795d) k.iterator().next()).mo7236i()) {
            if (auVar.mo7351z_().equals(fVar)) {
                return auVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m8535a(C2001p pVar) {
        return pVar.mo7859f().mo7839g() && (pVar instanceof C2002q) && m8536a((C2002q) pVar);
    }

    /* renamed from: a */
    public static boolean m8536a(C2002q qVar) {
        String a = qVar.mo7867r().mo9039a();
        if (a.equals("toString") || a.equals("hashCode")) {
            return qVar.mo7860c().isEmpty();
        }
        if (a.equals("equals")) {
            return m8537a(qVar, "java.lang.Object");
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m8537a(C2002q qVar, String str) {
        List c = qVar.mo7860c();
        boolean z = true;
        if (c.size() == 1) {
            C2007v d = ((C2010y) c.get(0)).mo7875d();
            if (d instanceof C1995j) {
                C1994i c2 = ((C1995j) d).mo7847c();
                if (c2 instanceof C1992g) {
                    C2355b c3 = ((C1992g) c2).mo7835c();
                    if (c3 == null || !c3.mo9013a().equals(str)) {
                        z = false;
                    }
                    return z;
                }
            }
        }
        return false;
    }
}
