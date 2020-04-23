package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.b.a.m */
/* compiled from: Annotations.kt */
public final class C1671m implements C1659h {

    /* renamed from: b */
    private final C1659h f5262b;

    /* renamed from: c */
    private final C1450b<C2355b, Boolean> f5263c;

    public C1671m(C1659h hVar, C1450b<? super C2355b, Boolean> bVar) {
        C1489j.m6972b(hVar, "delegate");
        C1489j.m6972b(bVar, "fqNameFilter");
        this.f5262b = hVar;
        this.f5263c = bVar;
    }

    /* renamed from: b */
    public boolean mo7257b(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        if (((Boolean) this.f5263c.mo6756a(bVar)).booleanValue()) {
            return this.f5262b.mo7257b(bVar);
        }
        return false;
    }

    /* renamed from: a */
    public C1651c mo7254a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        if (((Boolean) this.f5263c.mo6756a(bVar)).booleanValue()) {
            return this.f5262b.mo7254a(bVar);
        }
        return null;
    }

    /* renamed from: b */
    public List<C1658g> mo7256b() {
        Iterable b = this.f5262b.mo7256b();
        Collection arrayList = new ArrayList();
        for (Object next : b) {
            if (m7586a(((C1658g) next).mo7247a())) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: c */
    public List<C1658g> mo7258c() {
        Iterable c = this.f5262b.mo7258c();
        Collection arrayList = new ArrayList();
        for (Object next : c) {
            if (m7586a(((C1658g) next).mo7247a())) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public Iterator<C1651c> iterator() {
        Iterable iterable = this.f5262b;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (m7586a((C1651c) next)) {
                arrayList.add(next);
            }
        }
        return ((List) arrayList).iterator();
    }

    /* renamed from: a */
    public boolean mo7255a() {
        Iterable<C1651c> iterable = this.f5262b;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C1651c a : iterable) {
            if (m7586a(a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m7586a(C1651c cVar) {
        C2355b b = cVar.mo7240b();
        return b != null && ((Boolean) this.f5263c.mo6756a(b)).booleanValue();
    }
}
