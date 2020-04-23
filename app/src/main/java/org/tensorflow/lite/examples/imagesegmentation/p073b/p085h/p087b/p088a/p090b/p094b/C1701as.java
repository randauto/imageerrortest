package p073b.p085h.p087b.p088a.p090b.p094b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p142i.C3160h;
import p073b.p142i.C3161i;

/* renamed from: b.h.b.a.b.b.as */
/* compiled from: typeParameterUtils.kt */
public final class C1701as {

    /* renamed from: b.h.b.a.b.b.as$a */
    /* compiled from: typeParameterUtils.kt */
    static final class C1702a extends C1490k implements C1450b<C1804m, Boolean> {

        /* renamed from: a */
        public static final C1702a f5334a = new C1702a();

        C1702a() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7318a((C1804m) obj));
        }

        /* renamed from: a */
        public final boolean mo7318a(C1804m mVar) {
            C1489j.m6972b(mVar, "it");
            return mVar instanceof C1648a;
        }
    }

    /* renamed from: b.h.b.a.b.b.as$b */
    /* compiled from: typeParameterUtils.kt */
    static final class C1703b extends C1490k implements C1450b<C1804m, C3160h<? extends C1700ar>> {

        /* renamed from: a */
        public static final C1703b f5335a = new C1703b();

        C1703b() {
            super(1);
        }

        /* renamed from: a */
        public final C3160h<C1700ar> mo6756a(C1804m mVar) {
            C1489j.m6972b(mVar, "it");
            List f = ((C1648a) mVar).mo7233f();
            C1489j.m6969a((Object) f, "(it as CallableDescriptor).typeParameters");
            return C1415k.m6899q(f);
        }
    }

    /* renamed from: a */
    public static final List<C1700ar> m7668a(C1800i iVar) {
        List list;
        Object obj;
        C1489j.m6972b(iVar, "$receiver");
        List<C1700ar> z = iVar.mo7090z();
        if (iVar.mo7079r() || (iVar.mo7065b() instanceof C1648a)) {
            C1804m mVar = iVar;
            List e = C3161i.m14689e(C3161i.m14687d(C3161i.m14684c(C2524a.m12629f(mVar), C1702a.f5334a), C1703b.f5335a));
            Iterator a = C2524a.m12629f(mVar).mo6822a();
            while (true) {
                list = null;
                if (!a.hasNext()) {
                    obj = null;
                    break;
                }
                obj = a.next();
                if (obj instanceof C1796e) {
                    break;
                }
            }
            C1796e eVar = (C1796e) obj;
            if (eVar != null) {
                C2767an e2 = eVar.mo7067e();
                if (e2 != null) {
                    list = e2.mo7094b();
                }
            }
            if (list == null) {
                list = C1415k.m6837a();
            }
            if (!e.isEmpty() || !list.isEmpty()) {
                Iterable<C1700ar> b = C1415k.m6870b((Collection<? extends T>) e, (Iterable<? extends T>) list);
                Collection arrayList = new ArrayList(C1415k.m6842a(b, 10));
                for (C1700ar arVar : b) {
                    C1489j.m6969a((Object) arVar, "it");
                    arrayList.add(m7667a(arVar, mVar, z.size()));
                }
                List list2 = (List) arrayList;
                C1489j.m6969a((Object) z, "declaredParameters");
                return C1415k.m6870b((Collection<? extends T>) z, (Iterable<? extends T>) list2);
            }
            List<C1700ar> z2 = iVar.mo7090z();
            C1489j.m6969a((Object) z2, "declaredTypeParameters");
            return z2;
        }
        C1489j.m6969a((Object) z, "declaredParameters");
        return z;
    }

    /* renamed from: a */
    private static final C1733c m7667a(C1700ar arVar, C1804m mVar, int i) {
        return new C1733c(arVar, mVar, i);
    }

    /* renamed from: a */
    public static final C1685af m7665a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1799h d = wVar.mo9507g().mo7096d();
        if (!(d instanceof C1800i)) {
            d = null;
        }
        return m7666a(wVar, (C1800i) d, 0);
    }

    /* renamed from: a */
    private static final C1685af m7666a(C2841w wVar, C1800i iVar, int i) {
        C1800i iVar2 = null;
        if (iVar != null) {
            C1804m mVar = iVar;
            if (!C2827p.m13783a(mVar)) {
                int size = iVar.mo7090z().size() + i;
                if (!iVar.mo7079r()) {
                    boolean z = size == wVar.mo9501a().size() || C2523c.m12593b(mVar);
                    if (!C3232z.f8648a || z) {
                        return new C1685af(iVar, wVar.mo9501a().subList(i, wVar.mo9501a().size()), null);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(wVar.mo9501a().size() - size);
                    sb.append(" trailing arguments were found in ");
                    sb.append(wVar);
                    sb.append(" type");
                    throw new AssertionError(sb.toString());
                }
                List subList = wVar.mo9501a().subList(i, size);
                C1804m b = iVar.mo7065b();
                if (b instanceof C1800i) {
                    iVar2 = b;
                }
                return new C1685af(iVar, subList, m7666a(wVar, iVar2, size));
            }
        }
        return null;
    }
}
