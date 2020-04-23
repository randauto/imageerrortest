package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1708aw;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h.C2563b;
import p073b.p085h.p087b.p088a.p090b.p139n.C2894d;

/* renamed from: b.h.b.a.b.i.e.i */
/* compiled from: MemberScopeImpl.kt */
public abstract class C2565i implements C2560h {
    /* renamed from: c */
    public C1799h mo7649c(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return null;
    }

    /* renamed from: d */
    public void mo7675d(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        C2563b.m12745a(this, fVar, bVar);
    }

    /* renamed from: a */
    public Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return C1415k.m6837a();
    }

    /* renamed from: b */
    public Collection<C1691al> mo7444b(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return C1415k.m6837a();
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        return C1415k.m6837a();
    }

    /* renamed from: D_ */
    public Set<C2360f> mo7441D_() {
        Iterable a = mo7373a(C2552d.f7628h, C2894d.m13971a());
        Collection arrayList = new ArrayList();
        for (Object next : a) {
            if (next instanceof C1691al) {
                arrayList.add(next);
            }
        }
        Iterable<C1691al> iterable = (List) arrayList;
        Collection linkedHashSet = new LinkedHashSet();
        for (C1691al z_ : iterable) {
            linkedHashSet.add(z_.mo7351z_());
        }
        return (Set) linkedHashSet;
    }

    /* renamed from: G_ */
    public Set<C2360f> mo7442G_() {
        Iterable a = mo7373a(C2552d.f7629i, C2894d.m13971a());
        Collection arrayList = new ArrayList();
        for (Object next : a) {
            if (next instanceof C1708aw) {
                arrayList.add(next);
            }
        }
        Iterable<C1708aw> iterable = (List) arrayList;
        Collection linkedHashSet = new LinkedHashSet();
        for (C1708aw z_ : iterable) {
            linkedHashSet.add(z_.mo7351z_());
        }
        return (Set) linkedHashSet;
    }
}
