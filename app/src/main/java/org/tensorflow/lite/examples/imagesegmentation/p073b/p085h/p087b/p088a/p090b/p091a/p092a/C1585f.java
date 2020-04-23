package p073b.p085h.p087b.p088a.p090b.p091a.p092a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3227u;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p074a.C1433z;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1626f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1740ac;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1747ah;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1775o;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1775o.C1777a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p136m.C2872j;

/* renamed from: b.h.b.a.b.a.a.f */
/* compiled from: FunctionInvokeDescriptor.kt */
public final class C1585f extends C1740ac {

    /* renamed from: a */
    public static final C1586a f4984a = new C1586a(null);

    /* renamed from: b.h.b.a.b.a.a.f$a */
    /* compiled from: FunctionInvokeDescriptor.kt */
    public static final class C1586a {
        private C1586a() {
        }

        public /* synthetic */ C1586a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1585f mo7110a(C1576b bVar, boolean z) {
            C1489j.m6972b(bVar, "functionClass");
            List z2 = bVar.mo7090z();
            C1585f fVar = new C1585f(bVar, null, C1725a.DECLARATION, z, null);
            C1690ak D = bVar.mo7353D();
            List a = C1415k.m6837a();
            Iterable iterable = z2;
            ArrayList arrayList = new ArrayList();
            for (Object next : iterable) {
                if (!(((C1700ar) next).mo7316k() == C2792ba.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<C1433z> n = C1415k.m6896n(arrayList);
            Collection arrayList2 = new ArrayList(C1415k.m6842a(n, 10));
            for (C1433z zVar : n) {
                arrayList2.add(C1585f.f4984a.m7233a(fVar, zVar.mo6910a(), (C1700ar) zVar.mo6911b()));
            }
            fVar.mo7367a(null, D, a, (List) arrayList2, ((C1700ar) C1415k.m6886h(z2)).mo7346A_(), C1818w.ABSTRACT, C1710ay.f5340e);
            fVar.mo7468j(true);
            return fVar;
        }

        /* renamed from: a */
        private final C1705au m7233a(C1585f fVar, int i, C1700ar arVar) {
            String str;
            String a = arVar.mo7351z_().mo9039a();
            int hashCode = a.hashCode();
            if (hashCode != 69) {
                if (hashCode == 84 && a.equals("T")) {
                    str = "instance";
                    C1648a aVar = fVar;
                    C1659h a2 = C1659h.f5247a.mo7260a();
                    C2360f a3 = C2360f.m11701a(str);
                    C1489j.m6969a((Object) a3, "Name.identifier(name)");
                    C2755ad A_ = arVar.mo7346A_();
                    C1489j.m6969a((Object) A_, "typeParameter.defaultType");
                    C2841w wVar = A_;
                    C1692am amVar = C1692am.f5331a;
                    C1489j.m6969a((Object) amVar, "SourceElement.NO_SOURCE");
                    C1747ah ahVar = new C1747ah(aVar, null, i, a2, a3, wVar, false, false, false, null, amVar);
                    return ahVar;
                }
            } else if (a.equals("E")) {
                str = "receiver";
                C1648a aVar2 = fVar;
                C1659h a22 = C1659h.f5247a.mo7260a();
                C2360f a32 = C2360f.m11701a(str);
                C1489j.m6969a((Object) a32, "Name.identifier(name)");
                C2755ad A_2 = arVar.mo7346A_();
                C1489j.m6969a((Object) A_2, "typeParameter.defaultType");
                C2841w wVar2 = A_2;
                C1692am amVar2 = C1692am.f5331a;
                C1489j.m6969a((Object) amVar2, "SourceElement.NO_SOURCE");
                C1747ah ahVar2 = new C1747ah(aVar2, null, i, a22, a32, wVar2, false, false, false, null, amVar2);
                return ahVar2;
            }
            C1489j.m6969a((Object) a, "typeParameterName");
            if (a != null) {
                str = a.toLowerCase();
                C1489j.m6969a((Object) str, "(this as java.lang.String).toLowerCase()");
                C1648a aVar22 = fVar;
                C1659h a222 = C1659h.f5247a.mo7260a();
                C2360f a322 = C2360f.m11701a(str);
                C1489j.m6969a((Object) a322, "Name.identifier(name)");
                C2755ad A_22 = arVar.mo7346A_();
                C1489j.m6969a((Object) A_22, "typeParameter.defaultType");
                C2841w wVar22 = A_22;
                C1692am amVar22 = C1692am.f5331a;
                C1489j.m6969a((Object) amVar22, "SourceElement.NO_SOURCE");
                C1747ah ahVar22 = new C1747ah(aVar22, null, i, a222, a322, wVar22, false, false, false, null, amVar22);
                return ahVar22;
            }
            throw new C3227u("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: a */
    public boolean mo7108a() {
        return false;
    }

    /* renamed from: c */
    public boolean mo7109c() {
        return false;
    }

    /* renamed from: w */
    public boolean mo7085w() {
        return false;
    }

    public /* synthetic */ C1585f(C1804m mVar, C1585f fVar, C1725a aVar, boolean z, C1486g gVar) {
        this(mVar, fVar, aVar, z);
    }

    private C1585f(C1804m mVar, C1585f fVar, C1725a aVar, boolean z) {
        super(mVar, fVar, C1659h.f5247a.mo7260a(), C2872j.f8173g, aVar, C1692am.f5331a);
        mo7458a(true);
        mo7466h(z);
        mo7467i(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1813t mo7107a(C1777a aVar) {
        boolean z;
        C1489j.m6972b(aVar, "configuration");
        C1585f fVar = (C1585f) super.mo7107a(aVar);
        if (fVar == null) {
            return null;
        }
        List i = fVar.mo7236i();
        C1489j.m6969a((Object) i, "substituted.valueParameters");
        Iterable iterable = i;
        boolean z2 = true;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1705au auVar = (C1705au) it.next();
                C1489j.m6969a((Object) auVar, "it");
                C2841w r = auVar.mo7320r();
                C1489j.m6969a((Object) r, "it.type");
                if (C1626f.m7380h(r) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return fVar;
        }
        List i2 = fVar.mo7236i();
        C1489j.m6969a((Object) i2, "substituted.valueParameters");
        Iterable<C1705au> iterable2 = i2;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable2, 10));
        for (C1705au auVar2 : iterable2) {
            C1489j.m6969a((Object) auVar2, "it");
            C2841w r2 = auVar2.mo7320r();
            C1489j.m6969a((Object) r2, "it.type");
            arrayList.add(C1626f.m7380h(r2));
        }
        return fVar.m7227a((List) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1775o mo7106a(C1804m mVar, C1813t tVar, C1725a aVar, C2360f fVar, C1659h hVar, C1692am amVar) {
        C1489j.m6972b(mVar, "newOwner");
        C1489j.m6972b(aVar, "kind");
        C1489j.m6972b(hVar, "annotations");
        C1489j.m6972b(amVar, "source");
        return new C1585f(mVar, (C1585f) tVar, aVar, mo7452C());
    }

    /* renamed from: a */
    private final C1813t m7227a(List<C2360f> list) {
        boolean z;
        int size = mo7236i().size() - list.size();
        boolean z2 = false;
        boolean z3 = size == 0 || size == 1;
        if (!C3232z.f8648a || z3) {
            List i = mo7236i();
            C1489j.m6969a((Object) i, "valueParameters");
            Iterable<C1705au> iterable = i;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C1705au auVar : iterable) {
                C1489j.m6969a((Object) auVar, "it");
                C2360f z_ = auVar.mo7351z_();
                int c = auVar.mo7323c();
                int i2 = c - size;
                if (i2 >= 0) {
                    C2360f fVar = (C2360f) list.get(i2);
                    if (fVar != null) {
                        z_ = fVar;
                    }
                }
                C1648a aVar = this;
                C1489j.m6969a((Object) z_, "newName");
                arrayList.add(auVar.mo7322a(aVar, z_, c));
            }
            List list2 = (List) arrayList;
            C1777a e = mo7462e(C2778au.f8036a);
            Iterable iterable2 = list;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it = iterable2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C2360f) it.next()) == null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C1813t a = super.mo7107a(e.mo7499c(z2).mo7484a(list2).mo7473a((C1724b) mo7365r()));
            if (a == null) {
                C1489j.m6968a();
            }
            return a;
        }
        throw new AssertionError("Assertion failed");
    }
}
