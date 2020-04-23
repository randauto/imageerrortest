package p073b.p085h.p087b.p088a.p090b.p119i.p123c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import p073b.C3227u;
import p073b.C3230x;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1488i;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1500u.C1502b;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3123d;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1686ag;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1800i;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2552d;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2566j.C2567a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p139n.C2886b;
import p073b.p085h.p087b.p088a.p090b.p139n.C2886b.C2888a;
import p073b.p085h.p087b.p088a.p090b.p139n.C2886b.C2889b;
import p073b.p085h.p087b.p088a.p090b.p139n.C2886b.C2890c;
import p073b.p142i.C3160h;
import p073b.p142i.C3161i;

/* renamed from: b.h.b.a.b.i.c.a */
/* compiled from: DescriptorUtils.kt */
public final class C2524a {

    /* renamed from: a */
    private static final C2360f f7571a = C2360f.m11701a("value");

    /* renamed from: b.h.b.a.b.i.c.a$a */
    /* compiled from: DescriptorUtils.kt */
    static final class C2525a extends C1490k implements C1461m<C2560h, Boolean, C3230x> {

        /* renamed from: a */
        final /* synthetic */ C1796e f7572a;

        /* renamed from: b */
        final /* synthetic */ LinkedHashSet f7573b;

        C2525a(C1796e eVar, LinkedHashSet linkedHashSet) {
            this.f7572a = eVar;
            this.f7573b = linkedHashSet;
            super(2);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6920a(Object obj, Object obj2) {
            mo9542a((C2560h) obj, ((Boolean) obj2).booleanValue());
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9542a(C2560h hVar, boolean z) {
            C1489j.m6972b(hVar, "scope");
            for (C1804m mVar : C2567a.m12758a(hVar, C2552d.f7626f, null, 2, null)) {
                if (mVar instanceof C1796e) {
                    C1796e eVar = (C1796e) mVar;
                    if (C2523c.m12585a(eVar, this.f7572a)) {
                        this.f7573b.add(mVar);
                    }
                    if (z) {
                        C2525a aVar = this;
                        C2560h C = eVar.mo7352C();
                        C1489j.m6969a((Object) C, "descriptor.unsubstitutedInnerClassesScope");
                        aVar.mo9542a(C, z);
                    }
                }
            }
        }
    }

    /* renamed from: b.h.b.a.b.i.c.a$b */
    /* compiled from: DescriptorUtils.kt */
    static final class C2526b<N> implements C2889b<N> {

        /* renamed from: a */
        public static final C2526b f7574a = new C2526b();

        C2526b() {
        }

        /* renamed from: a */
        public final List<C1705au> mo7165a(C1705au auVar) {
            C1489j.m6969a((Object) auVar, "current");
            Iterable<C1705au> k = auVar.mo7238k();
            Collection arrayList = new ArrayList(C1415k.m6842a(k, 10));
            for (C1705au n : k) {
                arrayList.add(n.mo7326n());
            }
            return (List) arrayList;
        }
    }

    /* renamed from: b.h.b.a.b.i.c.a$c */
    /* compiled from: DescriptorUtils.kt */
    static final class C2527c extends C1488i implements C1450b<C1705au, Boolean> {

        /* renamed from: c */
        public static final C2527c f7575c = new C2527c();

        C2527c() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo9544a((C1705au) obj));
        }

        /* renamed from: f */
        public final C3123d mo6930f() {
            return C1503v.m6999a(C1705au.class);
        }

        /* renamed from: g */
        public final String mo6931g() {
            return "declaresDefaultValue";
        }

        /* renamed from: h */
        public final String mo6932h() {
            return "declaresDefaultValue()Z";
        }

        /* renamed from: a */
        public final boolean mo9544a(C1705au auVar) {
            C1489j.m6972b(auVar, "p1");
            return auVar.mo7324l();
        }
    }

    /* renamed from: b.h.b.a.b.i.c.a$d */
    /* compiled from: DescriptorUtils.kt */
    static final class C2528d<N> implements C2889b<N> {

        /* renamed from: a */
        final /* synthetic */ boolean f7576a;

        C2528d(boolean z) {
            this.f7576a = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
            if (r2 != null) goto L_0x0019;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Iterable<p073b.p085h.p087b.p088a.p090b.p094b.C1724b> mo7165a(p073b.p085h.p087b.p088a.p090b.p094b.C1724b r2) {
            /*
                r1 = this;
                boolean r0 = r1.f7576a
                if (r0 == 0) goto L_0x000c
                if (r2 == 0) goto L_0x000b
                b.h.b.a.b.b.b r2 = r2.mo7343l()
                goto L_0x000c
            L_0x000b:
                r2 = 0
            L_0x000c:
                if (r2 == 0) goto L_0x0015
                java.util.Collection r2 = r2.mo7238k()
                if (r2 == 0) goto L_0x0015
                goto L_0x0019
            L_0x0015:
                java.util.List r2 = p073b.p074a.C1415k.m6837a()
            L_0x0019:
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a.C2528d.mo7165a(b.h.b.a.b.b.b):java.lang.Iterable");
        }
    }

    /* renamed from: b.h.b.a.b.i.c.a$e */
    /* compiled from: DescriptorUtils.kt */
    public static final class C2529e extends C2888a<C1724b, C1724b> {

        /* renamed from: a */
        final /* synthetic */ C1502b f7577a;

        /* renamed from: b */
        final /* synthetic */ C1450b f7578b;

        C2529e(C1502b bVar, C1450b bVar2) {
            this.f7577a = bVar;
            this.f7578b = bVar2;
        }

        /* renamed from: a */
        public boolean mo7169a(C1724b bVar) {
            C1489j.m6972b(bVar, "current");
            return ((C1724b) this.f7577a.f4869a) == null;
        }

        /* renamed from: b */
        public void mo9549b(C1724b bVar) {
            C1489j.m6972b(bVar, "current");
            if (((C1724b) this.f7577a.f4869a) == null && ((Boolean) this.f7578b.mo6756a(bVar)).booleanValue()) {
                this.f7577a.f4869a = bVar;
            }
        }

        /* renamed from: a */
        public C1724b mo7170b() {
            return (C1724b) this.f7577a.f4869a;
        }
    }

    /* renamed from: b.h.b.a.b.i.c.a$f */
    /* compiled from: DescriptorUtils.kt */
    static final class C2530f extends C1490k implements C1450b<C1804m, C1804m> {

        /* renamed from: a */
        public static final C2530f f7579a = new C2530f();

        C2530f() {
            super(1);
        }

        /* renamed from: a */
        public final C1804m mo6756a(C1804m mVar) {
            C1489j.m6972b(mVar, "it");
            return mVar.mo7065b();
        }
    }

    /* renamed from: a */
    public static final C2356c m12621a(C1804m mVar) {
        C1489j.m6972b(mVar, "$receiver");
        C2356c d = C2523c.m12596d(mVar);
        C1489j.m6969a((Object) d, "DescriptorUtils.getFqName(this)");
        return d;
    }

    /* renamed from: b */
    public static final C2355b m12623b(C1804m mVar) {
        C1489j.m6972b(mVar, "$receiver");
        C2355b e = C2523c.m12597e(mVar);
        C1489j.m6969a((Object) e, "DescriptorUtils.getFqNameSafe(this)");
        return e;
    }

    /* renamed from: c */
    public static final C1821y m12626c(C1804m mVar) {
        C1489j.m6972b(mVar, "$receiver");
        C1821y g = C2523c.m12599g(mVar);
        C1489j.m6969a((Object) g, "DescriptorUtils.getContainingModule(this)");
        return g;
    }

    /* renamed from: a */
    public static final C1796e m12618a(C1821y yVar, C2355b bVar, C1827b bVar2) {
        C1489j.m6972b(yVar, "$receiver");
        C1489j.m6972b(bVar, "topLevelClassFqName");
        C1489j.m6972b(bVar2, "location");
        boolean z = !bVar.mo9016c();
        if (!C3232z.f8648a || z) {
            C2355b d = bVar.mo9017d();
            C1489j.m6969a((Object) d, "topLevelClassFqName.parent()");
            C2560h c = yVar.mo7523a(d).mo7288c();
            C2360f e = bVar.mo9018e();
            C1489j.m6969a((Object) e, "topLevelClassFqName.shortName()");
            C1799h c2 = c.mo7649c(e, bVar2);
            if (!(c2 instanceof C1796e)) {
                c2 = null;
            }
            return (C1796e) c2;
        }
        throw new AssertionError("Assertion failed");
    }

    /* renamed from: a */
    public static final C2354a m12619a(C1800i iVar) {
        C1489j.m6972b(iVar, "$receiver");
        C1804m b = iVar.mo7065b();
        if (b instanceof C1680ab) {
            return new C2354a(((C1680ab) b).mo7284f(), iVar.mo7351z_());
        }
        if (!(b instanceof C1800i)) {
            return null;
        }
        C1489j.m6969a((Object) b, "owner");
        C2354a a = m12619a((C1800i) b);
        if (a != null) {
            return a.mo9000a(iVar.mo7351z_());
        }
        return null;
    }

    /* renamed from: a */
    public static final C1796e m12617a(C1796e eVar) {
        C1489j.m6972b(eVar, "$receiver");
        for (C2841w wVar : eVar.mo7346A_().mo9507g().mo7405C_()) {
            if (!C1627g.m7431s(wVar)) {
                C1799h d = wVar.mo9507g().mo7096d();
                if (C2523c.m12609q(d)) {
                    if (d != null) {
                        return (C1796e) d;
                    }
                    throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final C1627g m12627d(C1804m mVar) {
        C1489j.m6972b(mVar, "$receiver");
        return m12626c(mVar).mo7522a();
    }

    /* renamed from: a */
    public static final boolean m12622a(C1705au auVar) {
        C1489j.m6972b(auVar, "$receiver");
        Boolean a = C2886b.m13954a((Collection<N>) C1415k.m6832a(auVar), (C2889b<N>) C2526b.f7574a, (C1450b<N, Boolean>) C2527c.f7575c);
        C1489j.m6969a((Object) a, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return a.booleanValue();
    }

    /* renamed from: e */
    public static final C3160h<C1804m> m12628e(C1804m mVar) {
        C1489j.m6972b(mVar, "$receiver");
        return C3161i.m14668a((Object) mVar, (C1450b) C2530f.f7579a);
    }

    /* renamed from: f */
    public static final C3160h<C1804m> m12629f(C1804m mVar) {
        C1489j.m6972b(mVar, "$receiver");
        return C3161i.m14676a(m12628e(mVar), 1);
    }

    /* renamed from: a */
    public static final C1724b m12613a(C1724b bVar) {
        C1489j.m6972b(bVar, "$receiver");
        if (!(bVar instanceof C1686ag)) {
            return bVar;
        }
        C1687ah q = ((C1686ag) bVar).mo7296q();
        C1489j.m6969a((Object) q, "correspondingProperty");
        return q;
    }

    /* renamed from: a */
    public static final C2355b m12620a(C1648a aVar) {
        C1489j.m6972b(aVar, "$receiver");
        C2356c a = m12621a((C1804m) aVar);
        if (!a.mo9026b()) {
            a = null;
        }
        if (a != null) {
            return a.mo9028c();
        }
        return null;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C1724b m12615a(C1724b bVar, boolean z, C1450b bVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m12614a(bVar, z, bVar2);
    }

    /* renamed from: a */
    public static final C1724b m12614a(C1724b bVar, boolean z, C1450b<? super C1724b, Boolean> bVar2) {
        C1489j.m6972b(bVar, "$receiver");
        C1489j.m6972b(bVar2, "predicate");
        C1502b bVar3 = new C1502b();
        bVar3.f4869a = (C1724b) null;
        return (C1724b) C2886b.m13955a((Collection<N>) C1415k.m6832a(bVar), (C2889b<N>) new C2528d<N>(z), (C2890c<N, R>) new C2529e<N,R>(bVar3, bVar2));
    }

    /* renamed from: b */
    public static final Collection<C1796e> m12625b(C1796e eVar) {
        C1489j.m6972b(eVar, "sealedClass");
        if (eVar.mo7074m() != C1818w.SEALED) {
            return C1415k.m6837a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C2525a aVar = new C2525a(eVar, linkedHashSet);
        C1804m b = eVar.mo7065b();
        if (b instanceof C1680ab) {
            aVar.mo9542a(((C1680ab) b).mo7159a(), false);
        }
        C2560h C = eVar.mo7352C();
        C1489j.m6969a((Object) C, "sealedClass.unsubstitutedInnerClassesScope");
        aVar.mo9542a(C, true);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static final C1796e m12616a(C1651c cVar) {
        C1489j.m6972b(cVar, "$receiver");
        C1799h d = cVar.mo7239a().mo9507g().mo7096d();
        if (!(d instanceof C1796e)) {
            d = null;
        }
        return (C1796e) d;
    }

    /* renamed from: b */
    public static final C2500f<?> m12624b(C1651c cVar) {
        C1489j.m6972b(cVar, "$receiver");
        return (C2500f) C1415k.m6871c(cVar.mo7241c().values());
    }
}
