package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1681ac;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.b.c.i */
/* compiled from: CompositePackageFragmentProvider.kt */
public final class C1764i implements C1681ac {

    /* renamed from: a */
    private final List<C1681ac> f5437a;

    public C1764i(List<? extends C1681ac> list) {
        C1489j.m6972b(list, "providers");
        this.f5437a = list;
    }

    /* renamed from: a */
    public List<C1680ab> mo7286a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (C1681ac a : this.f5437a) {
            arrayList.addAll(a.mo7286a(bVar));
        }
        return C1415k.m6893k((Iterable<? extends T>) arrayList);
    }

    /* renamed from: a */
    public Collection<C2355b> mo7285a(C2355b bVar, C1450b<? super C2360f, Boolean> bVar2) {
        C1489j.m6972b(bVar, "fqName");
        C1489j.m6972b(bVar2, "nameFilter");
        HashSet hashSet = new HashSet();
        for (C1681ac a : this.f5437a) {
            hashSet.addAll(a.mo7285a(bVar, bVar2));
        }
        return hashSet;
    }
}
