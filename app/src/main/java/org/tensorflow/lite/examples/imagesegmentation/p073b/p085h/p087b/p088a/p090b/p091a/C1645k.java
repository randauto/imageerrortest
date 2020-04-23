package p073b.p085h.p087b.p088a.p090b.p091a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1746ag;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1768m;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1789v;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2691b;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.a.k */
/* compiled from: suspendFunctionTypes.kt */
public final class C1645k {

    /* renamed from: a */
    private static final C1789v f5209a;

    /* renamed from: b */
    private static final C1789v f5210b;

    /* renamed from: a */
    public static final C1789v m7505a() {
        return f5209a;
    }

    static {
        C1821y a = C2827p.m13778a();
        C1489j.m6969a((Object) a, "ErrorUtils.getErrorModule()");
        C2355b bVar = C2523c.f7563e;
        C1489j.m6969a((Object) bVar, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
        C1789v vVar = new C1789v(new C1768m(a, bVar), C1797f.INTERFACE, false, false, C2523c.f7565g.mo9018e(), C1692am.f5331a, C2691b.f7924a);
        vVar.mo7539a(C1818w.ABSTRACT);
        vVar.mo7538a(C1710ay.f5340e);
        vVar.mo7540a(C1415k.m6832a(C1746ag.m7832a(vVar, C1659h.f5247a.mo7260a(), false, C2792ba.IN_VARIANCE, C2360f.m11701a("T"), 0)));
        vVar.mo7541c();
        f5209a = vVar;
        C1821y a2 = C2827p.m13778a();
        C1489j.m6969a((Object) a2, "ErrorUtils.getErrorModule()");
        C2355b bVar2 = C2523c.f7562d;
        C1489j.m6969a((Object) bVar2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
        C1789v vVar2 = new C1789v(new C1768m(a2, bVar2), C1797f.INTERFACE, false, false, C2523c.f7566h.mo9018e(), C1692am.f5331a, C2691b.f7924a);
        vVar2.mo7539a(C1818w.ABSTRACT);
        vVar2.mo7538a(C1710ay.f5340e);
        vVar2.mo7540a(C1415k.m6832a(C1746ag.m7832a(vVar2, C1659h.f5247a.mo7260a(), false, C2792ba.IN_VARIANCE, C2360f.m11701a("T"), 0)));
        vVar2.mo7541c();
        f5210b = vVar2;
    }

    /* renamed from: b */
    public static final C1789v m7508b() {
        return f5210b;
    }

    /* renamed from: a */
    public static final C2755ad m7506a(C2841w wVar, boolean z) {
        C2767an anVar;
        C1489j.m6972b(wVar, "suspendFunType");
        boolean b = C1626f.m7374b(wVar);
        if (!C3232z.f8648a || b) {
            C1627g a = C2803a.m13674a(wVar);
            C1659h x = wVar.mo7086x();
            C2841w e = C1626f.m7377e(wVar);
            Iterable<C2771ap> g = C1626f.m7379g(wVar);
            Collection arrayList = new ArrayList(C1415k.m6842a(g, 10));
            for (C2771ap c : g) {
                arrayList.add(c.mo9869c());
            }
            Collection collection = (List) arrayList;
            C1659h a2 = C1659h.f5247a.mo7260a();
            if (z) {
                anVar = f5210b.mo7067e();
            } else {
                anVar = f5209a.mo7067e();
            }
            C1489j.m6969a((Object) anVar, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
            List a3 = C1415k.m6862a(collection, C2842x.m13881a(a2, anVar, C1415k.m6832a(C2803a.m13683f(C1626f.m7378f(wVar))), false));
            C2755ad t = C2803a.m13674a(wVar).mo7207t();
            C1489j.m6969a((Object) t, "suspendFunType.builtIns.nullableAnyType");
            return C1626f.m7371a(a, x, e, a3, null, t, false, 64, null).mo7894a(wVar.mo7897c());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This type should be suspend function type: ");
        sb.append(wVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public static final boolean m7507a(C2355b bVar, boolean z) {
        if (z) {
            return C1489j.m6971a((Object) bVar, (Object) C2523c.f7566h);
        }
        return C1489j.m6971a((Object) bVar, (Object) C2523c.f7565g);
    }
}
