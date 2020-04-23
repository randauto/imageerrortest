package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.d.a.h */
/* compiled from: FakePureImplementationsProvider.kt */
public final class C2076h {

    /* renamed from: a */
    public static final C2076h f6314a;

    /* renamed from: b */
    private static final HashMap<C2355b, C2355b> f6315b = new HashMap<>();

    static {
        C2076h hVar = new C2076h();
        f6314a = hVar;
        C2355b bVar = C1627g.f5076h.f5118X;
        C1489j.m6969a((Object) bVar, "FQ_NAMES.mutableList");
        hVar.m9313a(bVar, hVar.m9312a("java.util.ArrayList", "java.util.LinkedList"));
        C2355b bVar2 = C1627g.f5076h.f5120Z;
        C1489j.m6969a((Object) bVar2, "FQ_NAMES.mutableSet");
        hVar.m9313a(bVar2, hVar.m9312a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        C2355b bVar3 = C1627g.f5076h.f5122aa;
        C1489j.m6969a((Object) bVar3, "FQ_NAMES.mutableMap");
        hVar.m9313a(bVar3, hVar.m9312a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        hVar.m9313a(new C2355b("java.util.function.Function"), hVar.m9312a("java.util.function.UnaryOperator"));
        hVar.m9313a(new C2355b("java.util.function.BiFunction"), hVar.m9312a("java.util.function.BinaryOperator"));
    }

    private C2076h() {
    }

    /* renamed from: a */
    public final C2355b mo7967a(C2355b bVar) {
        C1489j.m6972b(bVar, "classFqName");
        return (C2355b) f6315b.get(bVar);
    }

    /* renamed from: a */
    private final void m9313a(C2355b bVar, List<C2355b> list) {
        Iterable<C2355b> iterable = list;
        Map map = f6315b;
        for (C2355b a : iterable) {
            C3221p a2 = C3226t.m14841a(a, bVar);
            map.put(a2.mo10387a(), a2.mo10388b());
        }
    }

    /* renamed from: a */
    private final List<C2355b> m9312a(String... strArr) {
        Collection arrayList = new ArrayList(strArr.length);
        for (String bVar : strArr) {
            arrayList.add(new C2355b(bVar));
        }
        return (List) arrayList;
    }
}
