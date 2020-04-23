package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p073b.C1511g;
import p073b.C1521h;
import p073b.C3227u;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1696ao;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p120a.p121a.C2490c;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2566j.C2567a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2774as;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p139n.C2885a;

/* renamed from: b.h.b.a.b.i.e.l */
/* compiled from: SubstitutingScope.kt */
public final class C2570l implements C2560h {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f7666a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C2570l.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;"))};

    /* renamed from: b */
    private final C2778au f7667b;

    /* renamed from: d */
    private Map<C1804m, C1804m> f7668d;

    /* renamed from: e */
    private final C1511g f7669e = C1521h.m14706a(new C2571a(this));
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2560h f7670f;

    /* renamed from: b.h.b.a.b.i.e.l$a */
    /* compiled from: SubstitutingScope.kt */
    static final class C2571a extends C1490k implements C1449a<Collection<? extends C1804m>> {

        /* renamed from: a */
        final /* synthetic */ C2570l f7671a;

        C2571a(C2570l lVar) {
            this.f7671a = lVar;
            super(0);
        }

        /* renamed from: b */
        public final Collection<C1804m> mo6823a() {
            return this.f7671a.m12773a(C2567a.m12758a(this.f7671a.f7670f, null, null, 3, null));
        }
    }

    /* renamed from: c */
    private final Collection<C1804m> m12774c() {
        C1511g gVar = this.f7669e;
        C3135k kVar = f7666a[0];
        return (Collection) gVar.mo6918a();
    }

    public C2570l(C2560h hVar, C2778au auVar) {
        C1489j.m6972b(hVar, "workerScope");
        C1489j.m6972b(auVar, "givenSubstitutor");
        this.f7670f = hVar;
        C2774as b = auVar.mo9888b();
        C1489j.m6969a((Object) b, "givenSubstitutor.substitution");
        this.f7667b = C2490c.m12500a(b, false, 1, null).mo9881f();
    }

    /* renamed from: a */
    private final <D extends C1804m> D m12770a(D d) {
        if (this.f7667b.mo9886a()) {
            return d;
        }
        if (this.f7668d == null) {
            this.f7668d = new HashMap();
        }
        Map<C1804m, C1804m> map = this.f7668d;
        if (map == null) {
            C1489j.m6968a();
        }
        D d2 = map.get(d);
        if (d2 == null) {
            if (d instanceof C1696ao) {
                D d3 = ((C1696ao) d).mo7307d(this.f7667b);
                if (d3 != null) {
                    d2 = (C1804m) d3;
                    map.put(d, d2);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, ");
                    sb.append("but ");
                    sb.append(d);
                    sb.append(" substitution fails");
                    throw new AssertionError(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown descriptor in scope: ");
                sb2.append(d);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        D d4 = (C1804m) d2;
        if (d4 != null) {
            return d4;
        }
        throw new C3227u("null cannot be cast to non-null type D");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final <D extends C1804m> Collection<D> m12773a(Collection<? extends D> collection) {
        if (this.f7667b.mo9886a() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet c = C2885a.m13952c(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c.add(m12770a((D) (C1804m) it.next()));
        }
        return c;
    }

    /* renamed from: a */
    public Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return m12773a(this.f7670f.mo7443a(fVar, bVar));
    }

    /* renamed from: c */
    public C1799h mo7649c(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        C1799h c = this.f7670f.mo7649c(fVar, bVar);
        if (c != null) {
            return (C1799h) m12770a((D) c);
        }
        return null;
    }

    /* renamed from: b */
    public Collection<C1691al> mo7444b(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return m12773a(this.f7670f.mo7444b(fVar, bVar));
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        return m12774c();
    }

    /* renamed from: D_ */
    public Set<C2360f> mo7441D_() {
        return this.f7670f.mo7441D_();
    }

    /* renamed from: G_ */
    public Set<C2360f> mo7442G_() {
        return this.f7670f.mo7442G_();
    }
}
