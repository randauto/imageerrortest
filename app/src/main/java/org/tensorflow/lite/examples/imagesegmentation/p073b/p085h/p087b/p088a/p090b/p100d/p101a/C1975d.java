package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1389ad;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2147r;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2150u;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2536c;

/* renamed from: b.h.b.a.b.d.a.d */
/* compiled from: specialBuiltinMembers.kt */
public final class C1975d {

    /* renamed from: a */
    public static final C1975d f5932a = new C1975d();

    /* renamed from: b */
    private static final List<C2090q> f5933b;

    /* renamed from: c */
    private static final List<String> f5934c;

    /* renamed from: d */
    private static final List<String> f5935d;

    /* renamed from: e */
    private static final Map<C2090q, C1977b> f5936e;

    /* renamed from: f */
    private static final Map<String, C1977b> f5937f;

    /* renamed from: g */
    private static final Set<C2360f> f5938g;

    /* renamed from: h */
    private static final Set<String> f5939h;

    /* renamed from: b.h.b.a.b.d.a.d$a */
    /* compiled from: specialBuiltinMembers.kt */
    public enum C1976a {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        

        /* renamed from: e */
        private final String f5944e;

        /* renamed from: f */
        private final boolean f5945f;

        protected C1976a(String str, boolean z) {
            this.f5944e = str;
            this.f5945f = z;
        }
    }

    /* renamed from: b.h.b.a.b.d.a.d$b */
    /* compiled from: specialBuiltinMembers.kt */
    public enum C1977b {
        NULL(null),
        INDEX(Integer.valueOf(-1)),
        FALSE(Boolean.valueOf(false));
        

        /* renamed from: f */
        private final Object f5951f;

        /* renamed from: b.h.b.a.b.d.a.d$b$a */
        /* compiled from: specialBuiltinMembers.kt */
        static final class C1978a extends C1977b {
            C1978a(String str, int i) {
                super(str, i, null);
            }
        }

        protected C1977b(Object obj) {
            this.f5951f = obj;
        }
    }

    /* renamed from: b.h.b.a.b.d.a.d$c */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C1979c extends C1490k implements C1450b<C1724b, Boolean> {

        /* renamed from: a */
        public static final C1979c f5952a = new C1979c();

        C1979c() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7818a((C1724b) obj));
        }

        /* renamed from: a */
        public final boolean mo7818a(C1724b bVar) {
            C1489j.m6972b(bVar, "it");
            return C1975d.f5932a.m9078b(bVar);
        }
    }

    /* renamed from: b.h.b.a.b.d.a.d$d */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C1980d extends C1490k implements C1450b<C1724b, Boolean> {

        /* renamed from: a */
        public static final C1980d f5953a = new C1980d();

        C1980d() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7819a((C1724b) obj));
        }

        /* renamed from: a */
        public final boolean mo7819a(C1724b bVar) {
            C1489j.m6972b(bVar, "it");
            return (bVar instanceof C1813t) && C1975d.f5932a.m9078b(bVar);
        }
    }

    static {
        Iterable<String> a = C1395aj.m6761a((T[]) new String[]{"containsAll", "removeAll", "retainAll"});
        Collection arrayList = new ArrayList(C1415k.m6842a(a, 10));
        for (String a2 : a) {
            String c = C2536c.BOOLEAN.mo9561c();
            C1489j.m6969a((Object) c, "JvmPrimitiveType.BOOLEAN.desc");
            arrayList.add(C2092s.m9373b("java/util/Collection", a2, "Ljava/util/Collection;", c));
        }
        f5933b = (List) arrayList;
        Iterable<C2090q> iterable = f5933b;
        Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C2090q b : iterable) {
            arrayList2.add(b.mo7973b());
        }
        f5934c = (List) arrayList2;
        Iterable<C2090q> iterable2 = f5933b;
        Collection arrayList3 = new ArrayList(C1415k.m6842a(iterable2, 10));
        for (C2090q a3 : iterable2) {
            arrayList3.add(a3.mo7972a().mo9039a());
        }
        f5935d = (List) arrayList3;
        C2150u uVar = C2150u.f6453a;
        String c2 = C2536c.BOOLEAN.mo9561c();
        C1489j.m6969a((Object) c2, "JvmPrimitiveType.BOOLEAN.desc");
        String c3 = C2536c.BOOLEAN.mo9561c();
        C1489j.m6969a((Object) c3, "JvmPrimitiveType.BOOLEAN.desc");
        String c4 = C2536c.BOOLEAN.mo9561c();
        C1489j.m6969a((Object) c4, "JvmPrimitiveType.BOOLEAN.desc");
        String c5 = C2536c.BOOLEAN.mo9561c();
        C1489j.m6969a((Object) c5, "JvmPrimitiveType.BOOLEAN.desc");
        String c6 = C2536c.BOOLEAN.mo9561c();
        C1489j.m6969a((Object) c6, "JvmPrimitiveType.BOOLEAN.desc");
        String c7 = C2536c.INT.mo9561c();
        C1489j.m6969a((Object) c7, "JvmPrimitiveType.INT.desc");
        String c8 = C2536c.INT.mo9561c();
        C1489j.m6969a((Object) c8, "JvmPrimitiveType.INT.desc");
        f5936e = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("Collection"), "contains", "Ljava/lang/Object;", c2), C1977b.FALSE), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("Collection"), "remove", "Ljava/lang/Object;", c3), C1977b.FALSE), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("Map"), "containsKey", "Ljava/lang/Object;", c4), C1977b.FALSE), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("Map"), "containsValue", "Ljava/lang/Object;", c5), C1977b.FALSE), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", c6), C1977b.FALSE), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), C1977b.f5949d), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), C1977b.NULL), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), C1977b.NULL), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("List"), "indexOf", "Ljava/lang/Object;", c7), C1977b.INDEX), C3226t.m14841a(C2092s.m9373b(uVar.mo8081b("List"), "lastIndexOf", "Ljava/lang/Object;", c8), C1977b.INDEX)});
        Map<C2090q, C1977b> map = f5936e;
        Map<String, C1977b> linkedHashMap = new LinkedHashMap<>(C1389ad.m6746a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((C2090q) entry.getKey()).mo7973b(), entry.getValue());
        }
        f5937f = linkedHashMap;
        Iterable<C2090q> a4 = C1395aj.m6763a(f5936e.keySet(), (Iterable<? extends T>) f5933b);
        Collection arrayList4 = new ArrayList(C1415k.m6842a(a4, 10));
        for (C2090q a5 : a4) {
            arrayList4.add(a5.mo7972a());
        }
        f5938g = C1415k.m6895m((List) arrayList4);
        Collection arrayList5 = new ArrayList(C1415k.m6842a(a4, 10));
        for (C2090q b2 : a4) {
            arrayList5.add(b2.mo7973b());
        }
        f5939h = C1415k.m6895m((List) arrayList5);
    }

    private C1975d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m9078b(C1724b bVar) {
        return C1415k.m6863a((Iterable<? extends T>) f5939h, C2147r.m9581b(bVar));
    }

    /* renamed from: a */
    public static final C1813t m9075a(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        C1975d dVar = f5932a;
        C2360f z_ = tVar.mo7351z_();
        C1489j.m6969a((Object) z_, "functionDescriptor.name");
        if (!dVar.mo7817a(z_)) {
            return null;
        }
        return (C1813t) C2524a.m12615a(tVar, false, C1979c.f5952a, 1, null);
    }

    /* renamed from: a */
    public final boolean mo7817a(C2360f fVar) {
        C1489j.m6972b(fVar, "$receiver");
        return f5938g.contains(fVar);
    }

    /* renamed from: a */
    public static final C1976a m9076a(C1724b bVar) {
        C1976a aVar;
        C1489j.m6972b(bVar, "$receiver");
        if (!f5938g.contains(bVar.mo7351z_())) {
            return null;
        }
        C1724b a = C2524a.m12615a(bVar, false, C1980d.f5953a, 1, null);
        if (a != null) {
            String b = C2147r.m9581b(a);
            if (b != null) {
                if (f5934c.contains(b)) {
                    return C1976a.ONE_COLLECTION_PARAMETER;
                }
                Object obj = f5937f.get(b);
                if (obj == null) {
                    C1489j.m6968a();
                }
                if (((C1977b) obj) == C1977b.NULL) {
                    aVar = C1976a.OBJECT_PARAMETER_GENERIC;
                } else {
                    aVar = C1976a.OBJECT_PARAMETER_NON_GENERIC;
                }
                return aVar;
            }
        }
        return null;
    }
}
