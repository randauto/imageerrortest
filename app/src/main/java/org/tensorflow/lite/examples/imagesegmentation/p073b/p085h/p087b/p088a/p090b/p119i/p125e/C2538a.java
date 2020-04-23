package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.Collection;
import java.util.Set;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.i.e.a */
/* compiled from: AbstractScopeAdapter.kt */
public abstract class C2538a implements C2560h {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C2560h mo9563c();

    /* renamed from: b */
    public Collection<C1691al> mo7444b(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return mo9563c().mo7444b(fVar, bVar);
    }

    /* renamed from: c */
    public C1799h mo7649c(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return mo9563c().mo7649c(fVar, bVar);
    }

    /* renamed from: a */
    public Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return mo9563c().mo7443a(fVar, bVar);
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        return mo9563c().mo7373a(dVar, bVar);
    }

    /* renamed from: D_ */
    public Set<C2360f> mo7441D_() {
        return mo9563c().mo7441D_();
    }

    /* renamed from: G_ */
    public Set<C2360f> mo7442G_() {
        return mo9563c().mo7442G_();
    }
}
