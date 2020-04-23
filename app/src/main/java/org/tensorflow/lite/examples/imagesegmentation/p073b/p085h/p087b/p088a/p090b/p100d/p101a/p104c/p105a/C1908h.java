package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1798g;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1790w;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1877a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1964f;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1992g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2005t;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2009x;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2136m;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2143o;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2149t;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.p111a.C2105a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2535b;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;

/* renamed from: b.h.b.a.b.d.a.c.a.h */
/* compiled from: LazyJavaPackageFragment.kt */
public final class C1908h extends C1790w {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5791a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1908h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1908h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1967h f5792b;

    /* renamed from: c */
    private final C2710f f5793c = this.f5792b.mo7803c().mo9793a((C1449a<? extends T>) new C1909a<Object>(this));

    /* renamed from: d */
    private final C1885d f5794d = new C1885d(this.f5792b, this.f5798h, this);

    /* renamed from: e */
    private final C2710f<List<C2355b>> f5795e = this.f5792b.mo7803c().mo9795a(new C1911c(this), C1415k.m6837a());

    /* renamed from: f */
    private final C1659h f5796f;

    /* renamed from: g */
    private final C2710f f5797g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2005t f5798h;

    /* renamed from: b.h.b.a.b.d.a.c.a.h$a */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C1909a extends C1490k implements C1449a<Map<String, ? extends C2137n>> {

        /* renamed from: a */
        final /* synthetic */ C1908h f5799a;

        C1909a(C1908h hVar) {
            this.f5799a = hVar;
            super(0);
        }

        /* renamed from: b */
        public final Map<String, C2137n> mo6823a() {
            C2149t k = this.f5799a.f5792b.mo7805e().mo7754k();
            String a = this.f5799a.mo7284f().mo9013a();
            C1489j.m6969a((Object) a, "fqName.asString()");
            Iterable<String> b = k.mo7014b(a);
            Collection arrayList = new ArrayList();
            for (String str : b) {
                C2535b a2 = C2535b.m12655a(str);
                C1489j.m6969a((Object) a2, "JvmClassName.byInternalName(partName)");
                C2354a a3 = C2354a.m11661a(a2.mo9553a());
                C2136m c = this.f5799a.f5792b.mo7805e().mo7746c();
                C1489j.m6969a((Object) a3, "classId");
                C2137n a4 = c.mo7006a(a3);
                C3221p a5 = a4 != null ? C3226t.m14841a(str, a4) : null;
                if (a5 != null) {
                    arrayList.add(a5);
                }
            }
            return C1389ad.m6748a((Iterable<? extends C3221p<? extends K, ? extends V>>) (List) arrayList);
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.a.h$b */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C1910b extends C1490k implements C1449a<HashMap<C2535b, C2535b>> {

        /* renamed from: a */
        final /* synthetic */ C1908h f5800a;

        C1910b(C1908h hVar) {
            this.f5800a = hVar;
            super(0);
        }

        /* renamed from: b */
        public final HashMap<C2535b, C2535b> mo6823a() {
            HashMap<C2535b, C2535b> hashMap = new HashMap<>();
            for (Entry entry : this.f5800a.mo7694c().entrySet()) {
                String str = (String) entry.getKey();
                C2137n nVar = (C2137n) entry.getValue();
                C2535b a = C2535b.m12655a(str);
                C2105a d = nVar.mo7000d();
                switch (C1912i.f5802a[d.mo8007d().ordinal()]) {
                    case 1:
                        Map map = hashMap;
                        C1489j.m6969a((Object) a, "partName");
                        String a2 = d.mo8004a();
                        if (a2 == null) {
                            break;
                        } else {
                            C2535b a3 = C2535b.m12655a(a2);
                            C1489j.m6969a((Object) a3, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                            map.put(a, a3);
                            break;
                        }
                    case 2:
                        Map map2 = hashMap;
                        C1489j.m6969a((Object) a, "partName");
                        map2.put(a, a);
                        break;
                }
            }
            return hashMap;
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.a.h$c */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C1911c extends C1490k implements C1449a<List<? extends C2355b>> {

        /* renamed from: a */
        final /* synthetic */ C1908h f5801a;

        C1911c(C1908h hVar) {
            this.f5801a = hVar;
            super(0);
        }

        /* renamed from: b */
        public final List<C2355b> mo6823a() {
            Iterable<C2005t> d = this.f5801a.f5798h.mo7870d();
            Collection arrayList = new ArrayList(C1415k.m6842a(d, 10));
            for (C2005t c : d) {
                arrayList.add(c.mo7869c());
            }
            return (List) arrayList;
        }
    }

    /* renamed from: c */
    public final Map<String, C2137n> mo7694c() {
        return (Map) C2712h.m13321a(this.f5793c, (Object) this, f5791a[0]);
    }

    public C1908h(C1967h hVar, C2005t tVar) {
        C1659h hVar2;
        C1489j.m6972b(hVar, "outerContext");
        C1489j.m6972b(tVar, "jPackage");
        super(hVar.mo7804d(), tVar.mo7869c());
        this.f5798h = tVar;
        this.f5792b = C1877a.m8645a(hVar, (C1798g) this, (C2009x) null, 0, 6, (Object) null);
        if (this.f5792b.mo7805e().mo7759p().mo7584a()) {
            hVar2 = C1659h.f5247a.mo7260a();
        } else {
            hVar2 = C1964f.m9046a(this.f5792b, this.f5798h);
        }
        this.f5796f = hVar2;
        this.f5797g = this.f5792b.mo7803c().mo9793a((C1449a<? extends T>) new C1910b<Object>(this));
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return this.f5796f;
    }

    /* renamed from: g */
    public final List<C2355b> mo7695g() {
        return (List) this.f5795e.mo6823a();
    }

    /* renamed from: a */
    public final C1796e mo7693a(C1992g gVar) {
        C1489j.m6972b(gVar, "jClass");
        return this.f5794d.mo7650c().mo7700a(gVar);
    }

    /* renamed from: h */
    public C1885d mo7159a() {
        return this.f5794d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lazy Java package fragment: ");
        sb.append(mo7284f());
        return sb.toString();
    }

    /* renamed from: y */
    public C1692am mo7088y() {
        return new C2143o(this);
    }
}
