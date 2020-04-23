package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1658g;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h.C1662b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.d.a.f.b */
/* compiled from: typeEnhancement.kt */
final class C2014b implements C1659h {

    /* renamed from: b */
    private final C2355b f5965b;

    /* renamed from: a */
    public boolean mo7255a() {
        return false;
    }

    public C2014b(C2355b bVar) {
        C1489j.m6972b(bVar, "fqNameToMatch");
        this.f5965b = bVar;
    }

    /* renamed from: b */
    public boolean mo7257b(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C1662b.m7563b(this, bVar);
    }

    /* renamed from: c */
    public C2013a mo7254a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        if (C1489j.m6971a((Object) bVar, (Object) this.f5965b)) {
            return C2013a.f5964a;
        }
        return null;
    }

    /* renamed from: c */
    public List<C1658g> mo7258c() {
        Iterable<C1651c> iterable = this;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C1651c gVar : iterable) {
            arrayList.add(new C1658g(gVar, null));
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    public List<C1658g> mo7256b() {
        return C1415k.m6837a();
    }

    public Iterator<C1651c> iterator() {
        return C1415k.m6837a().iterator();
    }
}
