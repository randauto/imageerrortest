package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p073b.C3221p;
import p073b.C3226t;
import p073b.C3232z;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;

/* renamed from: b.h.b.a.b.d.a.e */
/* compiled from: specialBuiltinMembers.kt */
public final class C1983e {

    /* renamed from: a */
    public static final C1983e f5954a = new C1983e();

    /* renamed from: b */
    private static final Map<C2355b, C2360f> f5955b;

    /* renamed from: c */
    private static final Map<C2360f, List<C2360f>> f5956c;

    /* renamed from: d */
    private static final Set<C2355b> f5957d = f5955b.keySet();

    /* renamed from: e */
    private static final Set<C2360f> f5958e;

    /* renamed from: b.h.b.a.b.d.a.e$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C1984a extends C1490k implements C1450b<C1724b, Boolean> {

        /* renamed from: a */
        public static final C1984a f5959a = new C1984a();

        C1984a() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7824a((C1724b) obj));
        }

        /* renamed from: a */
        public final boolean mo7824a(C1724b bVar) {
            C1489j.m6972b(bVar, "it");
            return C1983e.f5954a.mo7822a(bVar);
        }
    }

    static {
        C2356c cVar = C1627g.f5076h.f5161r;
        C1489j.m6969a((Object) cVar, "BUILTIN_NAMES._enum");
        C2356c cVar2 = C1627g.f5076h.f5161r;
        C1489j.m6969a((Object) cVar2, "BUILTIN_NAMES._enum");
        C2355b bVar = C1627g.f5076h.f5109O;
        C1489j.m6969a((Object) bVar, "BUILTIN_NAMES.collection");
        C2355b bVar2 = C1627g.f5076h.f5113S;
        C1489j.m6969a((Object) bVar2, "BUILTIN_NAMES.map");
        C2356c cVar3 = C1627g.f5076h.f5149f;
        C1489j.m6969a((Object) cVar3, "BUILTIN_NAMES.charSequence");
        C2355b bVar3 = C1627g.f5076h.f5113S;
        C1489j.m6969a((Object) bVar3, "BUILTIN_NAMES.map");
        C2355b bVar4 = C1627g.f5076h.f5113S;
        C1489j.m6969a((Object) bVar4, "BUILTIN_NAMES.map");
        C2355b bVar5 = C1627g.f5076h.f5113S;
        C1489j.m6969a((Object) bVar5, "BUILTIN_NAMES.map");
        f5955b = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(C2092s.m9375b(cVar, "name"), C2360f.m11701a("name")), C3226t.m14841a(C2092s.m9375b(cVar2, "ordinal"), C2360f.m11701a("ordinal")), C3226t.m14841a(C2092s.m9374b(bVar, "size"), C2360f.m11701a("size")), C3226t.m14841a(C2092s.m9374b(bVar2, "size"), C2360f.m11701a("size")), C3226t.m14841a(C2092s.m9375b(cVar3, "length"), C2360f.m11701a("length")), C3226t.m14841a(C2092s.m9374b(bVar3, "keys"), C2360f.m11701a("keySet")), C3226t.m14841a(C2092s.m9374b(bVar4, "values"), C2360f.m11701a("values")), C3226t.m14841a(C2092s.m9374b(bVar5, "entries"), C2360f.m11701a("entrySet"))});
        Iterable<Entry> entrySet = f5955b.entrySet();
        Collection arrayList = new ArrayList(C1415k.m6842a(entrySet, 10));
        for (Entry entry : entrySet) {
            arrayList.add(new C3221p(((C2355b) entry.getKey()).mo9018e(), entry.getValue()));
        }
        Iterable<C3221p> iterable = (List) arrayList;
        Map<C2360f, List<C2360f>> linkedHashMap = new LinkedHashMap<>();
        for (C3221p pVar : iterable) {
            C2360f fVar = (C2360f) pVar.mo10388b();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((C2360f) pVar.mo10387a());
        }
        f5956c = linkedHashMap;
        Iterable<C2355b> iterable2 = f5957d;
        Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable2, 10));
        for (C2355b e : iterable2) {
            arrayList2.add(e.mo9018e());
        }
        f5958e = C1415k.m6895m((List) arrayList2);
    }

    private C1983e() {
    }

    /* renamed from: a */
    public final Set<C2360f> mo7821a() {
        return f5958e;
    }

    /* renamed from: a */
    public final boolean mo7822a(C1724b bVar) {
        C1489j.m6972b(bVar, "callableMemberDescriptor");
        if (!f5958e.contains(bVar.mo7351z_())) {
            return false;
        }
        return m9086c(bVar);
    }

    /* renamed from: c */
    private final boolean m9086c(C1724b bVar) {
        if (C1415k.m6863a((Iterable<? extends T>) f5957d, C2524a.m12620a((C1648a) bVar)) && bVar.mo7236i().isEmpty()) {
            return true;
        }
        boolean z = false;
        if (!C1627g.m7393a((C1804m) bVar)) {
            return false;
        }
        Collection k = bVar.mo7238k();
        C1489j.m6969a((Object) k, "overriddenDescriptors");
        Iterable iterable = k;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1724b bVar2 = (C1724b) it.next();
                C1983e eVar = f5954a;
                C1489j.m6969a((Object) bVar2, "it");
                if (eVar.mo7822a(bVar2)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final List<C2360f> mo7820a(C2360f fVar) {
        C1489j.m6972b(fVar, "name1");
        List<C2360f> list = (List) f5956c.get(fVar);
        return list != null ? list : C1415k.m6837a();
    }

    /* renamed from: b */
    public final String mo7823b(C1724b bVar) {
        C1489j.m6972b(bVar, "$receiver");
        boolean a = C1627g.m7393a((C1804m) bVar);
        if (!C3232z.f8648a || a) {
            String str = null;
            C1724b a2 = C2524a.m12615a(C2524a.m12613a(bVar), false, C1984a.f5959a, 1, null);
            if (a2 == null) {
                return null;
            }
            C2360f fVar = (C2360f) f5955b.get(C2524a.m12623b((C1804m) a2));
            if (fVar != null) {
                str = fVar.mo9039a();
            }
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This method is defined only for builtin members, but ");
        sb.append(bVar);
        sb.append(" found");
        throw new AssertionError(sb.toString());
    }
}
