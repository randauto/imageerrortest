package p073b.p085h.p087b.p088a.p090b.p094b;

import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1488i;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3123d;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p142i.C3161i;

/* renamed from: b.h.b.a.b.b.s */
/* compiled from: findClassInModule.kt */
public final class C1810s {

    /* renamed from: b.h.b.a.b.b.s$a */
    /* compiled from: findClassInModule.kt */
    static final class C1811a extends C1488i implements C1450b<C2354a, C2354a> {

        /* renamed from: c */
        public static final C1811a f5597c = new C1811a();

        C1811a() {
            super(1);
        }

        /* renamed from: f */
        public final C3123d mo6930f() {
            return C1503v.m6999a(C2354a.class);
        }

        /* renamed from: g */
        public final String mo6931g() {
            return "getOuterClassId";
        }

        /* renamed from: h */
        public final String mo6932h() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        /* renamed from: a */
        public final C2354a mo6756a(C2354a aVar) {
            C1489j.m6972b(aVar, "p1");
            return aVar.mo9005e();
        }
    }

    /* renamed from: b.h.b.a.b.b.s$b */
    /* compiled from: findClassInModule.kt */
    static final class C1812b extends C1490k implements C1450b<C2354a, Integer> {

        /* renamed from: a */
        public static final C1812b f5598a = new C1812b();

        C1812b() {
            super(1);
        }

        /* renamed from: a */
        public final int mo7571a(C2354a aVar) {
            C1489j.m6972b(aVar, "it");
            return 0;
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Integer.valueOf(mo7571a((C2354a) obj));
        }
    }

    /* renamed from: a */
    public static final C1796e m8443a(C1821y yVar, C2354a aVar) {
        C1489j.m6972b(yVar, "$receiver");
        C1489j.m6972b(aVar, "classId");
        C2355b a = aVar.mo9001a();
        C1489j.m6969a((Object) a, "classId.packageFqName");
        C1682ad a2 = yVar.mo7523a(a);
        List g = aVar.mo9002b().mo9021g();
        C2560h c = a2.mo7288c();
        C1489j.m6969a((Object) g, "segments");
        Object f = C1415k.m6883f(g);
        C1489j.m6969a(f, "segments.first()");
        C1799h c2 = c.mo7649c((C2360f) f, C1830d.FROM_DESERIALIZATION);
        if (!(c2 instanceof C1796e)) {
            c2 = null;
        }
        C1796e eVar = (C1796e) c2;
        if (eVar == null) {
            return null;
        }
        for (C2360f fVar : g.subList(1, g.size())) {
            C2560h C = eVar.mo7352C();
            C1489j.m6969a((Object) fVar, "name");
            C1799h c3 = C.mo7649c(fVar, C1830d.FROM_DESERIALIZATION);
            if (!(c3 instanceof C1796e)) {
                c3 = null;
            }
            eVar = (C1796e) c3;
            if (eVar == null) {
                return null;
            }
        }
        return eVar;
    }

    /* renamed from: a */
    public static final C1796e m8444a(C1821y yVar, C2354a aVar, C1675aa aaVar) {
        C1489j.m6972b(yVar, "$receiver");
        C1489j.m6972b(aVar, "classId");
        C1489j.m6972b(aaVar, "notFoundClasses");
        C1796e a = m8443a(yVar, aVar);
        if (a != null) {
            return a;
        }
        return aaVar.mo7271a(aVar, C3161i.m14689e(C3161i.m14688e(C3161i.m14668a((Object) aVar, (C1450b) C1811a.f5597c), C1812b.f5598a)));
    }

    /* renamed from: b */
    public static final C1699aq m8445b(C1821y yVar, C2354a aVar) {
        C1489j.m6972b(yVar, "$receiver");
        C1489j.m6972b(aVar, "classId");
        C2355b a = aVar.mo9001a();
        C1489j.m6969a((Object) a, "classId.packageFqName");
        C1682ad a2 = yVar.mo7523a(a);
        List g = aVar.mo9002b().mo9021g();
        int size = g.size() - 1;
        C2560h c = a2.mo7288c();
        C1489j.m6969a((Object) g, "segments");
        Object f = C1415k.m6883f(g);
        C1489j.m6969a(f, "segments.first()");
        C1799h c2 = c.mo7649c((C2360f) f, C1830d.FROM_DESERIALIZATION);
        if (size == 0) {
            if (!(c2 instanceof C1699aq)) {
                c2 = null;
            }
            return (C1699aq) c2;
        }
        if (!(c2 instanceof C1796e)) {
            c2 = null;
        }
        C1796e eVar = (C1796e) c2;
        if (eVar == null) {
            return null;
        }
        for (C2360f fVar : g.subList(1, size)) {
            C2560h C = eVar.mo7352C();
            C1489j.m6969a((Object) fVar, "name");
            C1799h c3 = C.mo7649c(fVar, C1830d.FROM_DESERIALIZATION);
            if (!(c3 instanceof C1796e)) {
                c3 = null;
            }
            eVar = (C1796e) c3;
            if (eVar == null) {
                return null;
            }
        }
        C2360f fVar2 = (C2360f) g.get(size);
        C2560h g2 = eVar.mo7068g();
        C1489j.m6969a((Object) fVar2, "lastName");
        C1799h c4 = g2.mo7649c(fVar2, C1830d.FROM_DESERIALIZATION);
        if (!(c4 instanceof C1699aq)) {
            c4 = null;
        }
        return (C1699aq) c4;
    }
}
