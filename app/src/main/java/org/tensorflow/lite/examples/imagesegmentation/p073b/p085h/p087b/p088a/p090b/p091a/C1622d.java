package p073b.p085h.p087b.p088a.p090b.p091a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1800i;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;

/* renamed from: b.h.b.a.b.a.d */
/* compiled from: CompanionObjectMapping.kt */
public final class C1622d {

    /* renamed from: a */
    public static final C1622d f5064a = new C1622d();

    /* renamed from: b */
    private static final LinkedHashSet<C2354a> f5065b;

    static {
        Set<C1639h> set = C1639h.f5187i;
        C1489j.m6969a((Object) set, "PrimitiveType.NUMBER_TYPES");
        Iterable<C1639h> iterable = set;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C1639h c : iterable) {
            arrayList.add(C1627g.m7406c(c));
        }
        Iterable<C2355b> a = C1415k.m6862a((Collection<? extends T>) C1415k.m6862a((Collection<? extends T>) (List) arrayList, C1627g.f5076h.f5150g.mo9028c()), C1627g.f5076h.f5161r.mo9028c());
        Collection linkedHashSet = new LinkedHashSet();
        for (C2355b a2 : a) {
            linkedHashSet.add(C2354a.m11661a(a2));
        }
        f5065b = (LinkedHashSet) linkedHashSet;
    }

    private C1622d() {
    }

    /* renamed from: a */
    public final Set<C2354a> mo7174a() {
        Set<C2354a> unmodifiableSet = Collections.unmodifiableSet(f5065b);
        C1489j.m6969a((Object) unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        return unmodifiableSet;
    }

    /* renamed from: a */
    public final boolean mo7175a(C1796e eVar) {
        C1489j.m6972b(eVar, "classDescriptor");
        if (C2523c.m12601i(eVar)) {
            Iterable iterable = f5065b;
            C2354a a = C2524a.m12619a((C1800i) eVar);
            if (C1415k.m6863a(iterable, a != null ? a.mo9005e() : null)) {
                return true;
            }
        }
        return false;
    }
}
