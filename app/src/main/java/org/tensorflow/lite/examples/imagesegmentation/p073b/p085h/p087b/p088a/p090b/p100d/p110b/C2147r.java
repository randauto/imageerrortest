package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1595c;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1803l;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C1975d;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2092s;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2130j.C2132b;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2130j.C2133c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2535b;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2536c;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.d.b.r */
/* compiled from: methodSignatureMapping.kt */
public final class C2147r {
    /* renamed from: a */
    public static final String m9577a(C1813t tVar, boolean z, boolean z2) {
        String str;
        C1489j.m6972b(tVar, "$receiver");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (tVar instanceof C1803l) {
                str = "<init>";
            } else {
                str = tVar.mo7351z_().mo9039a();
                C1489j.m6969a((Object) str, "name.asString()");
            }
            sb.append(str);
        }
        sb.append("(");
        for (C1705au auVar : tVar.mo7236i()) {
            C1489j.m6969a((Object) auVar, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
            C2841w r = auVar.mo7320r();
            C1489j.m6969a((Object) r, "parameter.type");
            m9579a(sb, r);
        }
        sb.append(")");
        if (z) {
            if (C2157z.m9625a((C1648a) tVar)) {
                sb.append("V");
            } else {
                C2841w g = tVar.mo7234g();
                if (g == null) {
                    C1489j.m6968a();
                }
                C1489j.m6969a((Object) g, "returnType!!");
                m9579a(sb, g);
            }
        }
        String sb2 = sb.toString();
        C1489j.m6969a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m9578a(C1813t tVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return m9577a(tVar, z, z2);
    }

    /* renamed from: a */
    public static final boolean m9580a(C1648a aVar) {
        C1489j.m6972b(aVar, "f");
        boolean z = false;
        if (!(aVar instanceof C1813t)) {
            return false;
        }
        C1813t tVar = (C1813t) aVar;
        if (tVar.mo7236i().size() != 1 || C2092s.m9380f((C1724b) aVar) || (!C1489j.m6971a((Object) tVar.mo7351z_().mo9039a(), (Object) "remove"))) {
            return false;
        }
        C1813t r = tVar.mo7365r();
        C1489j.m6969a((Object) r, "f.original");
        List i = r.mo7236i();
        C1489j.m6969a((Object) i, "f.original.valueParameters");
        Object j = C1415k.m6890j(i);
        C1489j.m6969a(j, "f.original.valueParameters.single()");
        C2841w r2 = ((C1705au) j).mo7320r();
        C1489j.m6969a((Object) r2, "f.original.valueParameters.single().type");
        C2130j a = m9575a(r2);
        C2536c cVar = null;
        if (!(a instanceof C2133c)) {
            a = null;
        }
        C2133c cVar2 = (C2133c) a;
        if (cVar2 != null) {
            cVar = cVar2.mo8051a();
        }
        if (cVar != C2536c.INT) {
            return false;
        }
        C1813t a2 = C1975d.m9075a(tVar);
        if (a2 == null) {
            return false;
        }
        C1813t r3 = a2.mo7365r();
        C1489j.m6969a((Object) r3, "overridden.original");
        List i2 = r3.mo7236i();
        C1489j.m6969a((Object) i2, "overridden.original.valueParameters");
        Object j2 = C1415k.m6890j(i2);
        C1489j.m6969a(j2, "overridden.original.valueParameters.single()");
        C2841w r4 = ((C1705au) j2).mo7320r();
        C1489j.m6969a((Object) r4, "overridden.original.valueParameters.single().type");
        C2130j a3 = m9575a(r4);
        C1804m b = a2.mo7065b();
        C1489j.m6969a((Object) b, "overridden.containingDeclaration");
        if (C1489j.m6971a((Object) C2524a.m12621a(b), (Object) C1627g.f5076h.f5117W.mo9014b()) && (a3 instanceof C2132b) && C1489j.m6971a((Object) ((C2132b) a3).mo8050a(), (Object) "java/lang/Object")) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static final String m9576a(C1796e eVar) {
        C1489j.m6972b(eVar, "$receiver");
        C1595c cVar = C1595c.f4995a;
        C2356c b = C2524a.m12623b((C1804m) eVar).mo9014b();
        C1489j.m6969a((Object) b, "fqNameSafe.toUnsafe()");
        C2354a a = cVar.mo7121a(b);
        if (a == null) {
            return C2157z.m9623a(eVar, null, false, 2, null);
        }
        C2535b a2 = C2535b.m12653a(a);
        C1489j.m6969a((Object) a2, "JvmClassName.byClassId(it)");
        String c = a2.mo9555c();
        C1489j.m6969a((Object) c, "JvmClassName.byClassId(it).internalName");
        return c;
    }

    /* renamed from: a */
    private static final void m9579a(StringBuilder sb, C2841w wVar) {
        sb.append(m9575a(wVar));
    }

    /* renamed from: a */
    public static final C2130j m9575a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return (C2130j) C2157z.m9621a(wVar, C2135l.f6446a, C2154x.f6458c, C2153w.f6455a, null, null, false, 32, null);
    }

    /* renamed from: b */
    public static final String m9581b(C1648a aVar) {
        C1489j.m6972b(aVar, "$receiver");
        C2150u uVar = C2150u.f6453a;
        if (C2523c.m12593b((C1804m) aVar)) {
            return null;
        }
        C1804m b = aVar.mo7065b();
        if (!(b instanceof C1796e)) {
            b = null;
        }
        C1796e eVar = (C1796e) b;
        if (eVar == null) {
            return null;
        }
        C2360f z_ = eVar.mo7351z_();
        C1489j.m6969a((Object) z_, "classDescriptor.name");
        if (z_.mo9041c()) {
            return null;
        }
        C1648a h = aVar.mo7235h();
        if (!(h instanceof C1691al)) {
            h = null;
        }
        C1691al alVar = (C1691al) h;
        if (alVar != null) {
            return uVar.mo8075a(eVar, m9578a(alVar, false, false, 3, null));
        }
        return null;
    }
}
