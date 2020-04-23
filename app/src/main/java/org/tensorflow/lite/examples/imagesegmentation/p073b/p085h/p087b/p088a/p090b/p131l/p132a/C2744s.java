package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2758ag;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2840v;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.l.a.s */
/* compiled from: IntersectionType.kt */
public final class C2744s {

    /* renamed from: a */
    public static final C2744s f8006a = new C2744s();

    /* renamed from: b.h.b.a.b.l.a.s$a */
    /* compiled from: IntersectionType.kt */
    private enum C2745a {
        ;

        /* renamed from: b.h.b.a.b.l.a.s$a$a */
        /* compiled from: IntersectionType.kt */
        static final class C2746a extends C2745a {
            C2746a(String str, int i) {
                super(str, i);
            }

            /* renamed from: a */
            public C2745a mo9861a(C2788az azVar) {
                C1489j.m6972b(azVar, "nextType");
                return mo9862b(azVar);
            }
        }

        /* renamed from: b.h.b.a.b.l.a.s$a$b */
        /* compiled from: IntersectionType.kt */
        static final class C2747b extends C2745a {
            /* renamed from: c */
            public C2747b mo9861a(C2788az azVar) {
                C1489j.m6972b(azVar, "nextType");
                return this;
            }

            C2747b(String str, int i) {
                super(str, i);
            }
        }

        /* renamed from: b.h.b.a.b.l.a.s$a$c */
        /* compiled from: IntersectionType.kt */
        static final class C2748c extends C2745a {
            C2748c(String str, int i) {
                super(str, i);
            }

            /* renamed from: a */
            public C2745a mo9861a(C2788az azVar) {
                C1489j.m6972b(azVar, "nextType");
                return mo9862b(azVar);
            }
        }

        /* renamed from: b.h.b.a.b.l.a.s$a$d */
        /* compiled from: IntersectionType.kt */
        static final class C2749d extends C2745a {
            C2749d(String str, int i) {
                super(str, i);
            }

            /* renamed from: a */
            public C2745a mo9861a(C2788az azVar) {
                C1489j.m6972b(azVar, "nextType");
                C2745a b = mo9862b(azVar);
                return b == C2745a.f8008b ? this : b;
            }
        }

        /* renamed from: a */
        public abstract C2745a mo9861a(C2788az azVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C2745a mo9862b(C2788az azVar) {
            C1489j.m6972b(azVar, "$receiver");
            if (azVar.mo7897c()) {
                return f8008b;
            }
            if (C2728l.f7975a.mo9840a(azVar)) {
                return f8010d;
            }
            return f8009c;
        }
    }

    private C2744s() {
    }

    /* renamed from: a */
    public final C2755ad mo9860a(List<? extends C2755ad> list) {
        C1489j.m6972b(list, "types");
        boolean z = list.size() > 1;
        if (!C3232z.f8648a || z) {
            ArrayList arrayList = new ArrayList();
            for (C2755ad adVar : list) {
                if (adVar.mo9507g() instanceof C2840v) {
                    Collection C_ = adVar.mo9507g().mo7405C_();
                    C1489j.m6969a((Object) C_, "type.constructor.supertypes");
                    Iterable<C2841w> iterable = C_;
                    Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable, 10));
                    for (C2841w wVar : iterable) {
                        C1489j.m6969a((Object) wVar, "it");
                        C2755ad d = C2838t.m13861d(wVar);
                        if (adVar.mo7897c()) {
                            d = d.mo7894a(true);
                        }
                        arrayList2.add(d);
                    }
                    arrayList.addAll((List) arrayList2);
                } else {
                    arrayList.add(adVar);
                }
            }
            Iterable<C2788az> iterable2 = arrayList;
            C2745a aVar = C2745a.f8007a;
            for (C2788az a : iterable2) {
                aVar = aVar.mo9861a(a);
            }
            Collection linkedHashSet = new LinkedHashSet();
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                C2755ad adVar2 = (C2755ad) it.next();
                if (aVar == C2745a.f8010d) {
                    adVar2 = C2758ag.m13477a(adVar2);
                }
                linkedHashSet.add(adVar2);
            }
            return m13441a((Set<? extends C2755ad>) (LinkedHashSet) linkedHashSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Size should be at least 2, but it is ");
        sb.append(list.size());
        throw new AssertionError(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p073b.p085h.p087b.p088a.p090b.p131l.C2755ad m13441a(java.util.Set<? extends p073b.p085h.p087b.p088a.p090b.p131l.C2755ad> r12) {
        /*
            r11 = this;
            int r0 = r12.size()
            r1 = 1
            if (r0 != r1) goto L_0x0010
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r12 = p073b.p074a.C1415k.m6882f(r12)
            b.h.b.a.b.l.ad r12 = (p073b.p085h.p087b.p088a.p090b.p131l.C2755ad) r12
            return r12
        L_0x0010:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            r0.<init>(r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0077
            java.lang.Object r4 = r3.next()
            b.h.b.a.b.l.ad r4 = (p073b.p085h.p087b.p088a.p090b.p131l.C2755ad) r4
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L_0x003a
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x003a
            goto L_0x0071
        L_0x003a:
            java.util.Iterator r6 = r6.iterator()
        L_0x003e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0071
            java.lang.Object r7 = r6.next()
            b.h.b.a.b.l.ad r7 = (p073b.p085h.p087b.p088a.p090b.p131l.C2755ad) r7
            if (r7 == r4) goto L_0x006d
            b.h.b.a.b.l.a.s r8 = f8006a
            java.lang.String r9 = "lower"
            p073b.p079e.p081b.C1489j.m6969a(r7, r9)
            b.h.b.a.b.l.w r7 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r7
            java.lang.String r9 = "upper"
            p073b.p079e.p081b.C1489j.m6969a(r4, r9)
            r9 = r4
            b.h.b.a.b.l.w r9 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r9
            boolean r8 = r8.m13442a(r7, r9)
            if (r8 != 0) goto L_0x006b
            b.h.b.a.b.l.a.h r8 = p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2724h.f7971b
            boolean r7 = r8.mo9824b(r7, r9)
            if (r7 == 0) goto L_0x006d
        L_0x006b:
            r7 = 1
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            if (r7 == 0) goto L_0x003e
            r5 = 1
        L_0x0071:
            if (r5 == 0) goto L_0x001c
            r3.remove()
            goto L_0x001c
        L_0x0077:
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r1 = r1 ^ r3
            boolean r3 = p073b.C3232z.f8648a
            if (r3 == 0) goto L_0x00af
            if (r1 == 0) goto L_0x0086
            goto L_0x00af
        L_0x0086:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "This collections cannot be empty! input types: "
            r0.append(r1)
            r2 = r12
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 63
            r10 = 0
            java.lang.String r12 = p073b.p074a.C1415k.m6859a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00af:
            int r12 = r0.size()
            r1 = 2
            if (r12 >= r1) goto L_0x00c4
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r12 = p073b.p074a.C1415k.m6890j(r0)
            java.lang.String r0 = "filteredSuperAndEqualTypes.single()"
            p073b.p079e.p081b.C1489j.m6969a(r12, r0)
            b.h.b.a.b.l.ad r12 = (p073b.p085h.p087b.p088a.p090b.p131l.C2755ad) r12
            return r12
        L_0x00c4:
            b.h.b.a.b.l.v r12 = new b.h.b.a.b.l.v
            r12.<init>(r2)
            b.h.b.a.b.b.a.h$a r0 = p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h.f5247a
            b.h.b.a.b.b.a.h r0 = r0.mo7260a()
            r1 = r12
            b.h.b.a.b.l.an r1 = (p073b.p085h.p087b.p088a.p090b.p131l.C2767an) r1
            java.util.List r2 = p073b.p074a.C1415k.m6837a()
            b.h.b.a.b.i.e.h r12 = r12.mo9951a()
            java.lang.String r3 = "constructor.createScopeForKotlinType()"
            p073b.p079e.p081b.C1489j.m6969a(r12, r3)
            b.h.b.a.b.l.ad r12 = p073b.p085h.p087b.p088a.p090b.p131l.C2842x.m13882a(r0, r1, r2, r5, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2744s.m13441a(java.util.Set):b.h.b.a.b.l.ad");
    }

    /* renamed from: a */
    private final boolean m13442a(C2841w wVar, C2841w wVar2) {
        C2724h hVar = C2724h.f7971b;
        return hVar.mo9823a(wVar, wVar2) && !hVar.mo9823a(wVar2, wVar);
    }
}
