package p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
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
import p073b.p142i.C3161i;

/* renamed from: b.h.b.a.b.j.a.a.b */
/* compiled from: DeserializedAnnotations.kt */
public class C2602b implements C1659h {

    /* renamed from: b */
    static final /* synthetic */ C3135k[] f7712b = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C2602b.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: c */
    private final C2710f f7713c;

    /* renamed from: b.h.b.a.b.j.a.a.b$a */
    /* compiled from: DeserializedAnnotations.kt */
    static final class C2603a extends C1490k implements C1450b<C1658g, Boolean> {

        /* renamed from: a */
        public static final C2603a f7714a = new C2603a();

        C2603a() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo9627a((C1658g) obj));
        }

        /* renamed from: a */
        public final boolean mo9627a(C1658g gVar) {
            C1489j.m6972b(gVar, "it");
            return gVar.mo7248b() == null;
        }
    }

    /* renamed from: b.h.b.a.b.j.a.a.b$b */
    /* compiled from: DeserializedAnnotations.kt */
    static final class C2604b extends C1490k implements C1450b<C1658g, C1651c> {

        /* renamed from: a */
        public static final C2604b f7715a = new C2604b();

        C2604b() {
            super(1);
        }

        /* renamed from: a */
        public final C1651c mo6756a(C1658g gVar) {
            C1489j.m6972b(gVar, "it");
            return gVar.mo7247a();
        }
    }

    /* renamed from: d */
    private final List<C1658g> m12878d() {
        return (List) C2712h.m13321a(this.f7713c, (Object) this, f7712b[0]);
    }

    public C2602b(C2713i iVar, C1449a<? extends List<C1658g>> aVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(aVar, "compute");
        this.f7713c = iVar.mo9793a(aVar);
    }

    /* renamed from: b */
    public boolean mo7257b(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C1662b.m7563b(this, bVar);
    }

    /* renamed from: a */
    public boolean mo7255a() {
        return m12878d().isEmpty();
    }

    /* renamed from: a */
    public C1651c mo7254a(C2355b bVar) {
        Object obj;
        boolean z;
        C1489j.m6972b(bVar, "fqName");
        Iterator it = m12878d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C1658g gVar = (C1658g) obj;
            C1651c c = gVar.mo7249c();
            if (gVar.mo7250d() != null || !C1489j.m6971a((Object) c.mo7240b(), (Object) bVar)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        C1658g gVar2 = (C1658g) obj;
        if (gVar2 != null) {
            return gVar2.mo7247a();
        }
        return null;
    }

    /* renamed from: b */
    public List<C1658g> mo7256b() {
        Iterable d = m12878d();
        Collection arrayList = new ArrayList();
        for (Object next : d) {
            if (((C1658g) next).mo7248b() != null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: c */
    public List<C1658g> mo7258c() {
        return m12878d();
    }

    public Iterator<C1651c> iterator() {
        return C3161i.m14688e(C3161i.m14677a(C1415k.m6899q(m12878d()), (C1450b) C2603a.f7714a), C2604b.f7715a).mo6822a();
    }
}
