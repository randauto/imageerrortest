package p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1658g;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h.C1662b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.j.a.a.a */
/* compiled from: DeserializedAnnotations.kt */
public class C2601a implements C1659h {

    /* renamed from: b */
    static final /* synthetic */ C3135k[] f7710b = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C2601a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: c */
    private final C2710f f7711c;

    /* renamed from: d */
    private final List<C1651c> m12872d() {
        return (List) C2712h.m13321a(this.f7711c, (Object) this, f7710b[0]);
    }

    public C2601a(C2713i iVar, C1449a<? extends List<? extends C1651c>> aVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(aVar, "compute");
        this.f7711c = iVar.mo9793a(aVar);
    }

    /* renamed from: a */
    public C1651c mo7254a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C1662b.m7562a(this, bVar);
    }

    /* renamed from: b */
    public boolean mo7257b(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C1662b.m7563b(this, bVar);
    }

    /* renamed from: a */
    public boolean mo7255a() {
        return m12872d().isEmpty();
    }

    /* renamed from: b */
    public List<C1658g> mo7256b() {
        return C1415k.m6837a();
    }

    /* renamed from: c */
    public List<C1658g> mo7258c() {
        Iterable<C1651c> d = m12872d();
        Collection arrayList = new ArrayList(C1415k.m6842a(d, 10));
        for (C1651c gVar : d) {
            arrayList.add(new C1658g(gVar, null));
        }
        return (List) arrayList;
    }

    public Iterator<C1651c> iterator() {
        return m12872d().iterator();
    }
}
