package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p073b.C3221p;
import p073b.C3226t;
import p073b.C3227u;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2147r;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2150u;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2536c;

/* renamed from: b.h.b.a.b.d.a.c */
/* compiled from: specialBuiltinMembers.kt */
public final class C1875c {

    /* renamed from: a */
    public static final C1875c f5720a = new C1875c();

    /* renamed from: b */
    private static final C2090q f5721b;

    /* renamed from: c */
    private static final Map<C2090q, C2360f> f5722c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<String, C2360f> f5723d;

    /* renamed from: e */
    private static final List<C2360f> f5724e;

    /* renamed from: f */
    private static final Map<C2360f, List<C2360f>> f5725f;

    /* renamed from: b.h.b.a.b.d.a.c$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C1876a extends C1490k implements C1450b<C1724b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1691al f5726a;

        C1876a(C1691al alVar) {
            this.f5726a = alVar;
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7640a((C1724b) obj));
        }

        /* renamed from: a */
        public final boolean mo7640a(C1724b bVar) {
            C1489j.m6972b(bVar, "it");
            Map a = C1875c.f5723d;
            String b = C2147r.m9581b(this.f5726a);
            if (a != null) {
                return a.containsKey(b);
            }
            throw new C3227u("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
    }

    static {
        String c = C2536c.INT.mo9561c();
        C1489j.m6969a((Object) c, "JvmPrimitiveType.INT.desc");
        f5721b = C2092s.m9373b("java/util/List", "removeAt", c, "Ljava/lang/Object;");
        C2150u uVar = C2150u.f6453a;
        String c2 = C2536c.BYTE.mo9561c();
        C1489j.m6969a((Object) c2, "JvmPrimitiveType.BYTE.desc");
        String c3 = C2536c.SHORT.mo9561c();
        C1489j.m6969a((Object) c3, "JvmPrimitiveType.SHORT.desc");
        String c4 = C2536c.INT.mo9561c();
        C1489j.m6969a((Object) c4, "JvmPrimitiveType.INT.desc");
        String c5 = C2536c.LONG.mo9561c();
        C1489j.m6969a((Object) c5, "JvmPrimitiveType.LONG.desc");
        String c6 = C2536c.FLOAT.mo9561c();
        C1489j.m6969a((Object) c6, "JvmPrimitiveType.FLOAT.desc");
        String c7 = C2536c.DOUBLE.mo9561c();
        C1489j.m6969a((Object) c7, "JvmPrimitiveType.DOUBLE.desc");
        String c8 = C2536c.INT.mo9561c();
        C1489j.m6969a((Object) c8, "JvmPrimitiveType.INT.desc");
        String c9 = C2536c.CHAR.mo9561c();
        C1489j.m6969a((Object) c9, "JvmPrimitiveType.CHAR.desc");
        f5722c = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(C2092s.m9373b(uVar.mo8076a("Number"), "toByte", "", c2), C2360f.m11701a("byteValue")), C3226t.m14841a(C2092s.m9373b(uVar.mo8076a("Number"), "toShort", "", c3), C2360f.m11701a("shortValue")), C3226t.m14841a(C2092s.m9373b(uVar.mo8076a("Number"), "toInt", "", c4), C2360f.m11701a("intValue")), C3226t.m14841a(C2092s.m9373b(uVar.mo8076a("Number"), "toLong", "", c5), C2360f.m11701a("longValue")), C3226t.m14841a(C2092s.m9373b(uVar.mo8076a("Number"), "toFloat", "", c6), C2360f.m11701a("floatValue")), C3226t.m14841a(C2092s.m9373b(uVar.mo8076a("Number"), "toDouble", "", c7), C2360f.m11701a("doubleValue")), C3226t.m14841a(f5721b, C2360f.m11701a("remove")), C3226t.m14841a(C2092s.m9373b(uVar.mo8076a("CharSequence"), "get", c8, c9), C2360f.m11701a("charAt"))});
        Map<C2090q, C2360f> map = f5722c;
        Map<String, C2360f> linkedHashMap = new LinkedHashMap<>(C1389ad.m6746a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(((C2090q) entry.getKey()).mo7973b(), entry.getValue());
        }
        f5723d = linkedHashMap;
        Iterable<C2090q> keySet = f5722c.keySet();
        Collection arrayList = new ArrayList(C1415k.m6842a(keySet, 10));
        for (C2090q a : keySet) {
            arrayList.add(a.mo7972a());
        }
        f5724e = (List) arrayList;
        Iterable<Entry> entrySet = f5722c.entrySet();
        Collection arrayList2 = new ArrayList(C1415k.m6842a(entrySet, 10));
        for (Entry entry2 : entrySet) {
            arrayList2.add(new C3221p(((C2090q) entry2.getKey()).mo7972a(), entry2.getValue()));
        }
        Iterable<C3221p> iterable = (List) arrayList2;
        Map<C2360f, List<C2360f>> linkedHashMap2 = new LinkedHashMap<>();
        for (C3221p pVar : iterable) {
            C2360f fVar = (C2360f) pVar.mo10388b();
            Object obj = linkedHashMap2.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(fVar, obj);
            }
            ((List) obj).add((C2360f) pVar.mo10387a());
        }
        f5725f = linkedHashMap2;
    }

    private C1875c() {
    }

    /* renamed from: a */
    public final List<C2360f> mo7635a() {
        return f5724e;
    }

    /* renamed from: a */
    public final boolean mo7636a(C2360f fVar) {
        C1489j.m6972b(fVar, "$receiver");
        return f5724e.contains(fVar);
    }

    /* renamed from: a */
    public final C2360f mo7634a(C1691al alVar) {
        C1489j.m6972b(alVar, "functionDescriptor");
        Map<String, C2360f> map = f5723d;
        String b = C2147r.m9581b(alVar);
        if (b != null) {
            return (C2360f) map.get(b);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo7638b(C1691al alVar) {
        C1489j.m6972b(alVar, "functionDescriptor");
        return C1627g.m7393a((C1804m) alVar) && C2524a.m12615a(alVar, false, new C1876a(alVar), 1, null) != null;
    }

    /* renamed from: b */
    public final List<C2360f> mo7637b(C2360f fVar) {
        C1489j.m6972b(fVar, "name");
        List<C2360f> list = (List) f5725f.get(fVar);
        return list != null ? list : C1415k.m6837a();
    }

    /* renamed from: c */
    public final boolean mo7639c(C1691al alVar) {
        C1489j.m6972b(alVar, "$receiver");
        return C1489j.m6971a((Object) alVar.mo7351z_().mo9039a(), (Object) "removeAt") && C1489j.m6971a((Object) C2147r.m9581b(alVar), (Object) f5721b.mo7973b());
    }
}
