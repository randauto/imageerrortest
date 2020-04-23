package p073b.p085h.p087b.p088a.p090b.p136m;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;
import p073b.p085h.p087b.p088a.p090b.p136m.C2861f.C2862a;
import p073b.p085h.p087b.p088a.p090b.p136m.C2861f.C2863b;
import p073b.p085h.p087b.p088a.p090b.p136m.C2873k.C2874a;
import p073b.p085h.p087b.p088a.p090b.p136m.C2873k.C2876b;
import p073b.p085h.p087b.p088a.p090b.p136m.C2873k.C2878c;
import p073b.p085h.p087b.p088a.p090b.p136m.C2880l.C2881a;
import p073b.p085h.p087b.p088a.p090b.p136m.C2880l.C2882b;
import p073b.p085h.p087b.p088a.p090b.p136m.C2880l.C2883c;
import p073b.p085h.p087b.p088a.p090b.p136m.C2880l.C2884d;

/* renamed from: b.h.b.a.b.m.i */
/* compiled from: modifierChecks.kt */
public final class C2867i extends C2845a {

    /* renamed from: a */
    public static final C2867i f8149a = new C2867i();

    /* renamed from: b */
    private static final List<C2856d> f8150b;

    /* renamed from: b.h.b.a.b.m.i$a */
    /* compiled from: modifierChecks.kt */
    static final class C2868a extends C1490k implements C1450b<C1813t, String> {

        /* renamed from: a */
        public static final C2868a f8151a = new C2868a();

        C2868a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(C1813t tVar) {
            C1489j.m6972b(tVar, "$receiver");
            List i = tVar.mo7236i();
            C1489j.m6969a((Object) i, "valueParameters");
            C1705au auVar = (C1705au) C1415k.m6888i(i);
            boolean z = false;
            if (auVar != null) {
                if (!C2524a.m12622a(auVar) && auVar.mo7325m() == null) {
                    z = true;
                }
            }
            C2867i iVar = C2867i.f8149a;
            if (!z) {
                return "last parameter should not have a default value or be a vararg";
            }
            return null;
        }
    }

    /* renamed from: b.h.b.a.b.m.i$b */
    /* compiled from: modifierChecks.kt */
    static final class C2869b extends C1490k implements C1450b<C1813t, String> {

        /* renamed from: a */
        public static final C2869b f8152a = new C2869b();

        C2869b() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(C1813t tVar) {
            boolean z;
            C1489j.m6972b(tVar, "$receiver");
            C28701 r0 = C28701.f8153a;
            C2867i iVar = C2867i.f8149a;
            C1804m b = tVar.mo7065b();
            C1489j.m6969a((Object) b, "containingDeclaration");
            boolean a = r0.mo9973a(b);
            boolean z2 = true;
            if (!a) {
                Collection k = tVar.mo7238k();
                C1489j.m6969a((Object) k, "overriddenDescriptors");
                Iterable iterable = k;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1813t tVar2 = (C1813t) it.next();
                        C28701 r3 = C28701.f8153a;
                        C1489j.m6969a((Object) tVar2, "it");
                        C1804m b2 = tVar2.mo7065b();
                        C1489j.m6969a((Object) b2, "it.containingDeclaration");
                        if (r3.mo9973a(b2)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            if (!z2) {
                return "must override ''equals()'' in Any";
            }
            return null;
        }
    }

    /* renamed from: b.h.b.a.b.m.i$c */
    /* compiled from: modifierChecks.kt */
    static final class C2871c extends C1490k implements C1450b<C1813t, String> {

        /* renamed from: a */
        public static final C2871c f8154a = new C2871c();

        C2871c() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(C1813t tVar) {
            boolean z;
            C1489j.m6972b(tVar, "$receiver");
            C1690ak e = tVar.mo7232e();
            if (e == null) {
                e = tVar.mo7231d();
            }
            C2867i iVar = C2867i.f8149a;
            boolean z2 = false;
            if (e != null) {
                C2841w g = tVar.mo7234g();
                if (g != null) {
                    C2841w r = e.mo7320r();
                    C1489j.m6969a((Object) r, "receiver.type");
                    z = C2803a.m13678a(g, r);
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (!z2) {
                return "receiver must be a supertype of the return type";
            }
            return null;
        }
    }

    static {
        C2360f fVar = C2872j.f8175i;
        C1489j.m6969a((Object) fVar, "GET");
        C2856d dVar = new C2856d(fVar, new C2849b[]{C2863b.f8145a, new C2881a(1)}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar2 = C2872j.f8176j;
        C1489j.m6969a((Object) fVar2, "SET");
        C2849b[] bVarArr = {C2863b.f8145a, new C2881a(2)};
        C2360f fVar3 = C2872j.f8167a;
        C1489j.m6969a((Object) fVar3, "GET_VALUE");
        C2856d dVar2 = new C2856d(fVar3, new C2849b[]{C2863b.f8145a, C2866h.f8147a, new C2881a(2), C2860e.f8141a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar4 = C2872j.f8168b;
        C1489j.m6969a((Object) fVar4, "SET_VALUE");
        C2856d dVar3 = new C2856d(fVar4, new C2849b[]{C2863b.f8145a, C2866h.f8147a, new C2881a(3), C2860e.f8141a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar5 = C2872j.f8169c;
        C1489j.m6969a((Object) fVar5, "PROVIDE_DELEGATE");
        C2856d dVar4 = new C2856d(fVar5, new C2849b[]{C2863b.f8145a, C2866h.f8147a, new C2882b(2), C2860e.f8141a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar6 = C2872j.f8173g;
        C1489j.m6969a((Object) fVar6, "INVOKE");
        C2856d dVar5 = new C2856d(fVar6, new C2849b[]{C2863b.f8145a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar7 = C2872j.f8172f;
        C1489j.m6969a((Object) fVar7, "CONTAINS");
        C2856d dVar6 = new C2856d(fVar7, new C2849b[]{C2863b.f8145a, C2884d.f8206a, C2866h.f8147a, C2874a.f8196a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar8 = C2872j.f8174h;
        C1489j.m6969a((Object) fVar8, "ITERATOR");
        C2856d dVar7 = new C2856d(fVar8, new C2849b[]{C2863b.f8145a, C2883c.f8205a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar9 = C2872j.f8177k;
        C1489j.m6969a((Object) fVar9, "NEXT");
        C2856d dVar8 = new C2856d(fVar9, new C2849b[]{C2863b.f8145a, C2883c.f8205a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar10 = C2872j.f8178l;
        C1489j.m6969a((Object) fVar10, "HAS_NEXT");
        C2856d dVar9 = new C2856d(fVar10, new C2849b[]{C2863b.f8145a, C2883c.f8205a, C2874a.f8196a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar11 = C2872j.f8155A;
        C1489j.m6969a((Object) fVar11, "RANGE_TO");
        C2856d dVar10 = new C2856d(fVar11, new C2849b[]{C2863b.f8145a, C2884d.f8206a, C2866h.f8147a}, (C1450b) null, 4, (C1486g) null);
        C2360f fVar12 = C2872j.f8170d;
        C1489j.m6969a((Object) fVar12, "EQUALS");
        C2849b[] bVarArr2 = {C2862a.f8144a};
        C2360f fVar13 = C2872j.f8171e;
        C1489j.m6969a((Object) fVar13, "COMPARE_TO");
        C2856d dVar11 = new C2856d(fVar13, new C2849b[]{C2863b.f8145a, C2876b.f8198a, C2884d.f8206a, C2866h.f8147a}, (C1450b) null, 4, (C1486g) null);
        C2856d dVar12 = new C2856d(C2872j.f8164J, new C2849b[]{C2863b.f8145a, C2884d.f8206a, C2866h.f8147a}, (C1450b) null, 4, (C1486g) null);
        C2856d dVar13 = new C2856d(C2872j.f8163I, new C2849b[]{C2863b.f8145a, C2883c.f8205a}, (C1450b) null, 4, (C1486g) null);
        Collection b = C1415k.m6840b((T[]) new C2360f[]{C2872j.f8182p, C2872j.f8183q});
        C2849b[] bVarArr3 = {C2863b.f8145a};
        C2856d dVar14 = new C2856d(C2872j.f8165K, new C2849b[]{C2863b.f8145a, C2878c.f8200a, C2884d.f8206a, C2866h.f8147a}, (C1450b) null, 4, (C1486g) null);
        C2856d dVar15 = new C2856d(C2872j.f8179m, new C2849b[]{C2863b.f8145a, C2883c.f8205a}, (C1450b) null, 4, (C1486g) null);
        f8150b = C1415k.m6840b((T[]) new C2856d[]{dVar, new C2856d(fVar2, bVarArr, (C1450b<? super C1813t, String>) C2868a.f8151a), dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, new C2856d(fVar12, bVarArr2, (C1450b<? super C1813t, String>) C2869b.f8152a), dVar11, dVar12, dVar13, new C2856d(b, bVarArr3, (C1450b<? super C1813t, String>) C2871c.f8154a), dVar14, dVar15});
    }

    private C2867i() {
    }

    /* renamed from: a */
    public List<C2856d> mo9958a() {
        return f8150b;
    }
}
