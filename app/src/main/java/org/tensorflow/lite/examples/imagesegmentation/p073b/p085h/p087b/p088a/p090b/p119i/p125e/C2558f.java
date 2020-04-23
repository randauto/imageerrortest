package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1699aq;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1800i;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.i.e.f */
/* compiled from: InnerClassesScopeWrapper.kt */
public final class C2558f extends C2565i {

    /* renamed from: a */
    private final C2560h f7655a;

    public C2558f(C2560h hVar) {
        C1489j.m6972b(hVar, "workerScope");
        this.f7655a = hVar;
    }

    /* renamed from: c */
    public C1799h mo7649c(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        C1799h c = this.f7655a.mo7649c(fVar, bVar);
        if (c == null) {
            return null;
        }
        C1796e eVar = (C1796e) (!(c instanceof C1796e) ? null : c);
        if (eVar != null) {
            return eVar;
        }
        if (!(c instanceof C1699aq)) {
            c = null;
        }
        return (C1699aq) c;
    }

    /* renamed from: b */
    public List<C1799h> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        C2552d b = dVar.mo9577b(C2552d.f7631k.mo9587h());
        if (b == null) {
            return C1415k.m6837a();
        }
        Iterable a = this.f7655a.mo7373a(b, bVar);
        Collection arrayList = new ArrayList();
        for (Object next : a) {
            if (next instanceof C1800i) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: D_ */
    public Set<C2360f> mo7441D_() {
        return this.f7655a.mo7441D_();
    }

    /* renamed from: G_ */
    public Set<C2360f> mo7442G_() {
        return this.f7655a.mo7442G_();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Classes from ");
        sb.append(this.f7655a);
        return sb.toString();
    }
}
