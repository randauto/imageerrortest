package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1682ad;
import p073b.p085h.p087b.p088a.p090b.p094b.C1682ad.C1683a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2547b;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2559g;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h.C2564c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.b.c.q */
/* compiled from: LazyPackageViewDescriptorImpl.kt */
public final class C1779q extends C1765j implements C1682ad {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5511a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1779q.class), "fragments", "getFragments()Ljava/util/List;"))};

    /* renamed from: b */
    private final C2710f f5512b;

    /* renamed from: c */
    private final C2560h f5513c;

    /* renamed from: d */
    private final C1786u f5514d;

    /* renamed from: e */
    private final C2355b f5515e;

    /* renamed from: b.h.b.a.b.b.c.q$a */
    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class C1780a extends C1490k implements C1449a<List<? extends C1680ab>> {

        /* renamed from: a */
        final /* synthetic */ C1779q f5516a;

        C1780a(C1779q qVar) {
            this.f5516a = qVar;
            super(0);
        }

        /* renamed from: b */
        public final List<C1680ab> mo6823a() {
            return this.f5516a.mo7289e().mo7534g().mo7286a(this.f5516a.mo7287a());
        }
    }

    /* renamed from: b.h.b.a.b.b.c.q$b */
    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class C1781b extends C1490k implements C1449a<C2560h> {

        /* renamed from: a */
        final /* synthetic */ C1779q f5517a;

        C1781b(C1779q qVar) {
            this.f5517a = qVar;
            super(0);
        }

        /* renamed from: b */
        public final C2560h mo6823a() {
            if (this.f5517a.mo7290f().isEmpty()) {
                return C2564c.f7661a;
            }
            Iterable<C1680ab> f = this.f5517a.mo7290f();
            Collection arrayList = new ArrayList(C1415k.m6842a(f, 10));
            for (C1680ab a : f) {
                arrayList.add(a.mo7159a());
            }
            List a2 = C1415k.m6862a((Collection<? extends T>) (List) arrayList, new C1741ad(this.f5517a.mo7289e(), this.f5517a.mo7287a()));
            StringBuilder sb = new StringBuilder();
            sb.append("package view scope for ");
            sb.append(this.f5517a.mo7287a());
            sb.append(" in ");
            sb.append(this.f5517a.mo7289e().mo7351z_());
            return new C2547b(sb.toString(), a2);
        }
    }

    /* renamed from: f */
    public List<C1680ab> mo7290f() {
        return (List) C2712h.m13321a(this.f5512b, (Object) this, f5511a[0]);
    }

    /* renamed from: g */
    public boolean mo7291g() {
        return C1683a.m7633a(this);
    }

    /* renamed from: j */
    public C1786u mo7289e() {
        return this.f5514d;
    }

    /* renamed from: a */
    public C2355b mo7287a() {
        return this.f5515e;
    }

    public C1779q(C1786u uVar, C2355b bVar, C2713i iVar) {
        C1489j.m6972b(uVar, "module");
        C1489j.m6972b(bVar, "fqName");
        C1489j.m6972b(iVar, "storageManager");
        super(C1659h.f5247a.mo7260a(), bVar.mo9020f());
        this.f5514d = uVar;
        this.f5515e = bVar;
        this.f5512b = iVar.mo9793a((C1449a<? extends T>) new C1780a<Object>(this));
        this.f5513c = new C2559g(iVar.mo9793a((C1449a<? extends T>) new C1781b<Object>(this)));
    }

    /* renamed from: c */
    public C2560h mo7288c() {
        return this.f5513c;
    }

    /* renamed from: h */
    public C1682ad mo7065b() {
        if (mo7287a().mo9016c()) {
            return null;
        }
        C1786u j = mo7289e();
        C2355b d = mo7287a().mo9017d();
        C1489j.m6969a((Object) d, "fqName.parent()");
        return j.mo7523a(d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1682ad)) {
            obj = null;
        }
        C1682ad adVar = (C1682ad) obj;
        boolean z = false;
        if (adVar == null) {
            return false;
        }
        if (C1489j.m6971a((Object) mo7287a(), (Object) adVar.mo7287a()) && C1489j.m6971a((Object) mo7289e(), (Object) adVar.mo7289e())) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (mo7289e().hashCode() * 31) + mo7287a().hashCode();
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        C1489j.m6972b(oVar, "visitor");
        return oVar.mo7425a((C1682ad) this, d);
    }
}
