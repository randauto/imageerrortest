package p073b.p085h.p087b.p088a.p090b.p112e.p113a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa.C2175a;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2182ab;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2187ae;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2197ai;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2248o;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2260u;

/* renamed from: b.h.b.a.b.e.a.g */
/* compiled from: protoTypeTableUtil.kt */
public final class C2289g {
    /* renamed from: a */
    public static final List<C2173aa> m11206a(C2216c cVar, C2290h hVar) {
        C1489j.m6972b(cVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        List<C2173aa> q = cVar.mo8473q();
        if (!(!q.isEmpty())) {
            q = null;
        }
        if (q != null) {
            return q;
        }
        List s = cVar.mo8475s();
        C1489j.m6969a((Object) s, "supertypeIdList");
        Iterable<Integer> iterable = s;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (Integer num : iterable) {
            C1489j.m6969a((Object) num, "it");
            arrayList.add(hVar.mo8814a(num.intValue()));
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static final C2173aa m11199a(C2175a aVar, C2290h hVar) {
        C1489j.m6972b(aVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (aVar.mo8235f()) {
            return aVar.mo8236g();
        }
        if (aVar.mo8237j()) {
            return hVar.mo8814a(aVar.mo8238k());
        }
        return null;
    }

    /* renamed from: a */
    public static final C2173aa m11200a(C2173aa aaVar, C2290h hVar) {
        C1489j.m6972b(aaVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (aaVar.mo8219l()) {
            return aaVar.mo8220p();
        }
        if (aaVar.mo8221q()) {
            return hVar.mo8814a(aaVar.mo8222r());
        }
        return null;
    }

    /* renamed from: a */
    public static final List<C2173aa> m11205a(C2187ae aeVar, C2290h hVar) {
        C1489j.m6972b(aeVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        List<C2173aa> q = aeVar.mo8334q();
        if (!(!q.isEmpty())) {
            q = null;
        }
        if (q != null) {
            return q;
        }
        List s = aeVar.mo8336s();
        C1489j.m6969a((Object) s, "upperBoundIdList");
        Iterable<Integer> iterable = s;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (Integer num : iterable) {
            C1489j.m6969a((Object) num, "it");
            arrayList.add(hVar.mo8814a(num.intValue()));
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static final C2173aa m11203a(C2248o oVar, C2290h hVar) {
        C1489j.m6972b(oVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (oVar.mo8632l()) {
            C2173aa p = oVar.mo8633p();
            C1489j.m6969a((Object) p, "returnType");
            return p;
        } else if (oVar.mo8634q()) {
            return hVar.mo8814a(oVar.mo8635r());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    /* renamed from: a */
    public static final boolean m11207a(C2248o oVar) {
        C1489j.m6972b(oVar, "$receiver");
        return oVar.mo8638u() || oVar.mo8640w();
    }

    /* renamed from: b */
    public static final C2173aa m11212b(C2248o oVar, C2290h hVar) {
        C1489j.m6972b(oVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (oVar.mo8638u()) {
            return oVar.mo8639v();
        }
        if (oVar.mo8640w()) {
            return hVar.mo8814a(oVar.mo8641x());
        }
        return null;
    }

    /* renamed from: a */
    public static final C2173aa m11204a(C2260u uVar, C2290h hVar) {
        C1489j.m6972b(uVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (uVar.mo8719l()) {
            C2173aa p = uVar.mo8720p();
            C1489j.m6969a((Object) p, "returnType");
            return p;
        } else if (uVar.mo8721q()) {
            return hVar.mo8814a(uVar.mo8722r());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    /* renamed from: a */
    public static final boolean m11208a(C2260u uVar) {
        C1489j.m6972b(uVar, "$receiver");
        return uVar.mo8725u() || uVar.mo8727w();
    }

    /* renamed from: b */
    public static final C2173aa m11213b(C2260u uVar, C2290h hVar) {
        C1489j.m6972b(uVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (uVar.mo8725u()) {
            return uVar.mo8726v();
        }
        if (uVar.mo8727w()) {
            return hVar.mo8814a(uVar.mo8728x());
        }
        return null;
    }

    /* renamed from: a */
    public static final C2173aa m11202a(C2197ai aiVar, C2290h hVar) {
        C1489j.m6972b(aiVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (aiVar.mo8376j()) {
            C2173aa k = aiVar.mo8377k();
            C1489j.m6969a((Object) k, "type");
            return k;
        } else if (aiVar.mo8378l()) {
            return hVar.mo8814a(aiVar.mo8379p());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    /* renamed from: b */
    public static final C2173aa m11211b(C2197ai aiVar, C2290h hVar) {
        C1489j.m6972b(aiVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (aiVar.mo8380q()) {
            return aiVar.mo8381r();
        }
        if (aiVar.mo8382s()) {
            return hVar.mo8814a(aiVar.mo8383t());
        }
        return null;
    }

    /* renamed from: b */
    public static final C2173aa m11209b(C2173aa aaVar, C2290h hVar) {
        C1489j.m6972b(aaVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (aaVar.mo8199A()) {
            return aaVar.mo8200B();
        }
        if (aaVar.mo8201C()) {
            return hVar.mo8814a(aaVar.mo8202D());
        }
        return null;
    }

    /* renamed from: c */
    public static final C2173aa m11214c(C2173aa aaVar, C2290h hVar) {
        C1489j.m6972b(aaVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (aaVar.mo8203E()) {
            return aaVar.mo8204F();
        }
        if (aaVar.mo8205G()) {
            return hVar.mo8814a(aaVar.mo8206H());
        }
        return null;
    }

    /* renamed from: a */
    public static final C2173aa m11201a(C2182ab abVar, C2290h hVar) {
        C1489j.m6972b(abVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (abVar.mo8293l()) {
            C2173aa p = abVar.mo8294p();
            C1489j.m6969a((Object) p, "underlyingType");
            return p;
        } else if (abVar.mo8295q()) {
            return hVar.mo8814a(abVar.mo8296r());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: b */
    public static final C2173aa m11210b(C2182ab abVar, C2290h hVar) {
        C1489j.m6972b(abVar, "$receiver");
        C1489j.m6972b(hVar, "typeTable");
        if (abVar.mo8297s()) {
            C2173aa t = abVar.mo8298t();
            C1489j.m6969a((Object) t, "expandedType");
            return t;
        } else if (abVar.mo8299u()) {
            return hVar.mo8814a(abVar.mo8300v());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }
}
