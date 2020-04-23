package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1800i;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p098c.C1825a;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2005t;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2552d;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p136m.p138b.C2851a;

/* renamed from: b.h.b.a.b.d.a.c.a.d */
/* compiled from: JvmPackageScope.kt */
public final class C1885d implements C2560h {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5738a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1885d.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};

    /* renamed from: b */
    private final C1913j f5739b;

    /* renamed from: d */
    private final C2710f f5740d = this.f5741e.mo7803c().mo9793a((C1449a<? extends T>) new C1886a<Object>(this));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1967h f5741e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1908h f5742f;

    /* renamed from: b.h.b.a.b.d.a.c.a.d$a */
    /* compiled from: JvmPackageScope.kt */
    static final class C1886a extends C1490k implements C1449a<List<? extends C2560h>> {

        /* renamed from: a */
        final /* synthetic */ C1885d f5743a;

        C1886a(C1885d dVar) {
            this.f5743a = dVar;
            super(0);
        }

        /* renamed from: b */
        public final List<C2560h> mo6823a() {
            Iterable<C2137n> values = this.f5743a.f5742f.mo7694c().values();
            Collection arrayList = new ArrayList();
            for (C2137n a : values) {
                C2560h a2 = this.f5743a.f5741e.mo7805e().mo7747d().mo8029a((C1680ab) this.f5743a.f5742f, a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return C1415k.m6893k((Iterable<? extends T>) (List) arrayList);
        }
    }

    /* renamed from: d */
    private final List<C2560h> m8676d() {
        return (List) C2712h.m13321a(this.f5740d, (Object) this, f5738a[0]);
    }

    public C1885d(C1967h hVar, C2005t tVar, C1908h hVar2) {
        C1489j.m6972b(hVar, "c");
        C1489j.m6972b(tVar, "jPackage");
        C1489j.m6972b(hVar2, "packageFragment");
        this.f5741e = hVar;
        this.f5742f = hVar2;
        this.f5739b = new C1913j(this.f5741e, tVar, this.f5742f);
    }

    /* renamed from: c */
    public final C1913j mo7650c() {
        return this.f5739b;
    }

    /* renamed from: c */
    public C1799h mo7649c(C2360f fVar, C1827b bVar) {
        C1799h c;
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        mo7651d(fVar, bVar);
        C1796e e = this.f5739b.mo7649c(fVar, bVar);
        if (e != null) {
            return e;
        }
        C1799h hVar = null;
        Iterator it = m8676d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c = ((C2560h) it.next()).mo7649c(fVar, bVar);
            if (c != null) {
                if (!(c instanceof C1800i) || !((C1800i) c).mo7083u()) {
                    hVar = c;
                } else if (hVar == null) {
                    hVar = c;
                }
            }
        }
        hVar = c;
        return hVar;
    }

    /* renamed from: a */
    public Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        mo7651d(fVar, bVar);
        C1913j jVar = this.f5739b;
        List<C2560h> d = m8676d();
        Collection<C1687ah> a = jVar.mo7443a(fVar, bVar);
        for (C2560h a2 : d) {
            a = C2851a.m13901a(a, a2.mo7443a(fVar, bVar));
        }
        return a != null ? a : C1395aj.m6759a();
    }

    /* renamed from: b */
    public Collection<C1691al> mo7444b(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        mo7651d(fVar, bVar);
        C1913j jVar = this.f5739b;
        List<C2560h> d = m8676d();
        Collection<C1691al> b = jVar.mo7444b(fVar, bVar);
        for (C2560h b2 : d) {
            b = C2851a.m13901a(b, b2.mo7444b(fVar, bVar));
        }
        return b != null ? b : C1395aj.m6759a();
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        C1913j jVar = this.f5739b;
        List<C2560h> d = m8676d();
        Collection<C1804m> a = jVar.mo7373a(dVar, bVar);
        for (C2560h a2 : d) {
            a = C2851a.m13901a(a, a2.mo7373a(dVar, bVar));
        }
        return a != null ? a : C1395aj.m6759a();
    }

    /* renamed from: D_ */
    public Set<C2360f> mo7441D_() {
        Iterable<C2560h> d = m8676d();
        Collection linkedHashSet = new LinkedHashSet();
        for (C2560h D_ : d) {
            C1415k.m6849a(linkedHashSet, (Iterable<? extends T>) D_.mo7441D_());
        }
        Set<C2360f> set = (Set) linkedHashSet;
        set.addAll(this.f5739b.mo7441D_());
        return set;
    }

    /* renamed from: G_ */
    public Set<C2360f> mo7442G_() {
        Iterable<C2560h> d = m8676d();
        Collection linkedHashSet = new LinkedHashSet();
        for (C2560h G_ : d) {
            C1415k.m6849a(linkedHashSet, (Iterable<? extends T>) G_.mo7442G_());
        }
        Set<C2360f> set = (Set) linkedHashSet;
        set.addAll(this.f5739b.mo7442G_());
        return set;
    }

    /* renamed from: d */
    public void mo7651d(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        C1825a.m8499a(this.f5741e.mo7805e().mo7756m(), bVar, (C1680ab) this.f5742f, fVar);
    }
}
