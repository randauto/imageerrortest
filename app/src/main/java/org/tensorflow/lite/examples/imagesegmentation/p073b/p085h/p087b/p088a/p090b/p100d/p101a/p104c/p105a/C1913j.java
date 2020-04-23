package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p073b.C3219n;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1882b.C1883a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1986aa;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1992g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2005t;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.p111a.C2105a.C2106a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p116f.C2362h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2552d;
import p073b.p085h.p087b.p088a.p090b.p130k.C2708d;
import p073b.p085h.p087b.p088a.p090b.p130k.C2711g;
import p073b.p085h.p087b.p088a.p090b.p139n.C2894d;

/* renamed from: b.h.b.a.b.d.a.c.a.j */
/* compiled from: LazyJavaPackageScope.kt */
public final class C1913j extends C1939m {

    /* renamed from: b */
    private final C2711g<Set<String>> f5803b;

    /* renamed from: d */
    private final C2708d<C1914a, C1796e> f5804d;

    /* renamed from: e */
    private final C2005t f5805e;

    /* renamed from: f */
    private final C1908h f5806f;

    /* renamed from: b.h.b.a.b.d.a.c.a.j$a */
    /* compiled from: LazyJavaPackageScope.kt */
    private static final class C1914a {

        /* renamed from: a */
        private final C2360f f5807a;

        /* renamed from: b */
        private final C1992g f5808b;

        public C1914a(C2360f fVar, C1992g gVar) {
            C1489j.m6972b(fVar, "name");
            this.f5807a = fVar;
            this.f5808b = gVar;
        }

        /* renamed from: a */
        public final C2360f mo7702a() {
            return this.f5807a;
        }

        /* renamed from: b */
        public final C1992g mo7703b() {
            return this.f5808b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1914a) && C1489j.m6971a((Object) this.f5807a, (Object) ((C1914a) obj).f5807a);
        }

        public int hashCode() {
            return this.f5807a.hashCode();
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.a.j$b */
    /* compiled from: LazyJavaPackageScope.kt */
    private static abstract class C1915b {

        /* renamed from: b.h.b.a.b.d.a.c.a.j$b$a */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C1916a extends C1915b {

            /* renamed from: a */
            private final C1796e f5809a;

            public C1916a(C1796e eVar) {
                C1489j.m6972b(eVar, "descriptor");
                super(null);
                this.f5809a = eVar;
            }

            /* renamed from: a */
            public final C1796e mo7706a() {
                return this.f5809a;
            }
        }

        /* renamed from: b.h.b.a.b.d.a.c.a.j$b$b */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C1917b extends C1915b {

            /* renamed from: a */
            public static final C1917b f5810a = new C1917b();

            private C1917b() {
                super(null);
            }
        }

        /* renamed from: b.h.b.a.b.d.a.c.a.j$b$c */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C1918c extends C1915b {

            /* renamed from: a */
            public static final C1918c f5811a = new C1918c();

            private C1918c() {
                super(null);
            }
        }

        private C1915b() {
        }

        public /* synthetic */ C1915b(C1486g gVar) {
            this();
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.a.j$c */
    /* compiled from: LazyJavaPackageScope.kt */
    static final class C1919c extends C1490k implements C1450b<C1914a, C1796e> {

        /* renamed from: a */
        final /* synthetic */ C1913j f5812a;

        /* renamed from: b */
        final /* synthetic */ C1967h f5813b;

        C1919c(C1913j jVar, C1967h hVar) {
            this.f5812a = jVar;
            this.f5813b = hVar;
            super(1);
        }

        /* renamed from: a */
        public final C1796e mo6756a(C1914a aVar) {
            C2137n nVar;
            C1891f fVar;
            C1489j.m6972b(aVar, "request");
            C2354a aVar2 = new C2354a(this.f5812a.mo7680h().mo7284f(), aVar.mo7702a());
            if (aVar.mo7703b() != null) {
                nVar = this.f5813b.mo7805e().mo7746c().mo7005a(aVar.mo7703b());
            } else {
                nVar = this.f5813b.mo7805e().mo7746c().mo7006a(aVar2);
            }
            C1796e eVar = null;
            C2354a b = nVar != null ? nVar.mo6998b() : null;
            if (b != null && (b.mo9007f() || b.mo9004d())) {
                return null;
            }
            C1915b a = this.f5812a.m8849a(nVar);
            if (a instanceof C1916a) {
                eVar = ((C1916a) a).mo7706a();
            } else if (!(a instanceof C1918c)) {
                if (a instanceof C1917b) {
                    C1992g b2 = aVar.mo7703b();
                    if (b2 == null) {
                        b2 = this.f5813b.mo7805e().mo7745b().mo6992a(aVar2);
                    }
                    C1992g gVar = b2;
                    if ((gVar != null ? gVar.mo7842j() : null) != C1986aa.BINARY) {
                        C2355b c = gVar != null ? gVar.mo7835c() : null;
                        if (c == null || c.mo9016c() || (!C1489j.m6971a((Object) c.mo9017d(), (Object) this.f5812a.mo7680h().mo7284f()))) {
                            fVar = null;
                        } else {
                            fVar = new C1891f(this.f5813b, this.f5812a.mo7680h(), gVar, null, 8, null);
                            this.f5813b.mo7805e().mo7761r().mo7968a(fVar);
                        }
                        eVar = fVar;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't find kotlin binary class for light class created by kotlin binary file\n");
                        sb.append("JavaClass: ");
                        sb.append(gVar);
                        sb.append(10);
                        sb.append("ClassId: ");
                        sb.append(aVar2);
                        sb.append(10);
                        sb.append("findKotlinClass(JavaClass) = ");
                        sb.append(this.f5813b.mo7805e().mo7746c().mo7005a(gVar));
                        sb.append(10);
                        sb.append("findKotlinClass(ClassId) = ");
                        sb.append(this.f5813b.mo7805e().mo7746c().mo7006a(aVar2));
                        sb.append(10);
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    throw new C3219n();
                }
            }
            return eVar;
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.a.j$d */
    /* compiled from: LazyJavaPackageScope.kt */
    static final class C1920d extends C1490k implements C1449a<Set<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C1913j f5814a;

        /* renamed from: b */
        final /* synthetic */ C1967h f5815b;

        C1920d(C1913j jVar, C1967h hVar) {
            this.f5814a = jVar;
            this.f5815b = hVar;
            super(0);
        }

        /* renamed from: b */
        public final Set<String> mo6823a() {
            return this.f5815b.mo7805e().mo7745b().mo6994b(this.f5814a.mo7680h().mo7284f());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7668a(Collection<C1691al> collection, C2360f fVar) {
        C1489j.m6972b(collection, "result");
        C1489j.m6972b(fVar, "name");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1908h mo7680h() {
        return this.f5806f;
    }

    public C1913j(C1967h hVar, C2005t tVar, C1908h hVar2) {
        C1489j.m6972b(hVar, "c");
        C1489j.m6972b(tVar, "jPackage");
        C1489j.m6972b(hVar2, "ownerDescriptor");
        super(hVar);
        this.f5805e = tVar;
        this.f5806f = hVar2;
        this.f5803b = hVar.mo7803c().mo9799b((C1449a<? extends T>) new C1920d<Object>(this, hVar));
        this.f5804d = hVar.mo7803c().mo9797b((C1450b<? super K, ? extends V>) new C1919c<Object,Object>(this, hVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1915b m8849a(C2137n nVar) {
        if (nVar == null) {
            return C1917b.f5810a;
        }
        if (nVar.mo7000d().mo8007d() != C2106a.CLASS) {
            return C1918c.f5811a;
        }
        C1796e a = mo7714j().mo7805e().mo7747d().mo8028a(nVar);
        return a != null ? new C1916a(a) : C1917b.f5810a;
    }

    /* renamed from: e */
    public C1796e mo7649c(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return m8847a(fVar, (C1992g) null);
    }

    /* renamed from: a */
    private final C1796e m8847a(C2360f fVar, C1992g gVar) {
        if (!C2362h.m11711b(fVar)) {
            return null;
        }
        Set set = (Set) this.f5803b.mo6823a();
        if (gVar != null || set == null || set.contains(fVar.mo9039a())) {
            return (C1796e) this.f5804d.mo6756a(new C1914a(fVar, gVar));
        }
        return null;
    }

    /* renamed from: a */
    public final C1796e mo7700a(C1992g gVar) {
        C1489j.m6972b(gVar, "javaClass");
        return m8847a(gVar.mo7867r(), gVar);
    }

    /* renamed from: a */
    public Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return C1415k.m6837a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1882b mo7673d() {
        return C1883a.f5737a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Set<C2360f> mo7674d(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        if (!dVar.mo9576a(C2552d.f7631k.mo9580a())) {
            return C1395aj.m6759a();
        }
        Set set = (Set) this.f5803b.mo6823a();
        if (set != null) {
            Iterable<String> iterable = set;
            Collection hashSet = new HashSet();
            for (String a : iterable) {
                hashSet.add(C2360f.m11701a(a));
            }
            return (Set) hashSet;
        }
        C2005t tVar = this.f5805e;
        if (bVar == null) {
            bVar = C2894d.m13971a();
        }
        Iterable<C1992g> a2 = tVar.mo7868a(bVar);
        Collection linkedHashSet = new LinkedHashSet();
        for (C1992g gVar : a2) {
            C2360f r = gVar.mo7842j() == C1986aa.SOURCE ? null : gVar.mo7867r();
            if (r != null) {
                linkedHashSet.add(r);
            }
        }
        return (Set) linkedHashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Set<C2360f> mo7672c(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        return C1395aj.m6759a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Set<C2360f> mo7677e(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        return C1395aj.m6759a();
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        return mo7712a(dVar, bVar, (C1827b) C1830d.WHEN_GET_ALL_DESCRIPTORS);
    }
}
