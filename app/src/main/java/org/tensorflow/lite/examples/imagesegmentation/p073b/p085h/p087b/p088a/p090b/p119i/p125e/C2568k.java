package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2493b;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.i.e.k */
/* compiled from: StaticScopeForKotlinEnum.kt */
public final class C2568k extends C2565i {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f7662a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C2568k.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b */
    private final C2710f f7663b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1796e f7664d;

    /* renamed from: b.h.b.a.b.i.e.k$a */
    /* compiled from: StaticScopeForKotlinEnum.kt */
    static final class C2569a extends C1490k implements C1449a<List<? extends C1691al>> {

        /* renamed from: a */
        final /* synthetic */ C2568k f7665a;

        C2569a(C2568k kVar) {
            this.f7665a = kVar;
            super(0);
        }

        /* renamed from: b */
        public final List<C1691al> mo6823a() {
            return C1415k.m6840b((T[]) new C1691al[]{C2493b.m12516b(this.f7665a.f7664d), C2493b.m12509a(this.f7665a.f7664d)});
        }
    }

    /* renamed from: c */
    private final List<C1691al> m12761c() {
        return (List) C2712h.m13321a(this.f7663b, (Object) this, f7662a[0]);
    }

    /* renamed from: e */
    public Void mo9597e(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return null;
    }

    /* renamed from: c */
    public /* synthetic */ C1799h mo7649c(C2360f fVar, C1827b bVar) {
        return (C1799h) mo9597e(fVar, bVar);
    }

    public C2568k(C2713i iVar, C1796e eVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(eVar, "containingClass");
        this.f7664d = eVar;
        boolean z = this.f7664d.mo7073l() == C1797f.ENUM_CLASS;
        if (!C3232z.f8648a || z) {
            this.f7663b = iVar.mo9793a((C1449a<? extends T>) new C2569a<Object>(this));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class should be an enum: ");
        sb.append(this.f7664d);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: b */
    public List<C1691al> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        return m12761c();
    }

    /* renamed from: f */
    public ArrayList<C1691al> mo7444b(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        Iterable c = m12761c();
        Collection arrayList = new ArrayList(1);
        for (Object next : c) {
            if (C1489j.m6971a((Object) ((C1691al) next).mo7351z_(), (Object) fVar)) {
                arrayList.add(next);
            }
        }
        return (ArrayList) arrayList;
    }
}
