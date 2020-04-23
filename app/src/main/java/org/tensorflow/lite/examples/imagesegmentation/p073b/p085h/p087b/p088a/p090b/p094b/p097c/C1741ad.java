package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1682ad;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2549c.C2551b;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2552d;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2565i;
import p073b.p085h.p087b.p088a.p090b.p139n.C2885a;

/* renamed from: b.h.b.a.b.b.c.ad */
/* compiled from: SubpackagesScope.kt */
public class C1741ad extends C2565i {

    /* renamed from: a */
    private final C1821y f5379a;

    /* renamed from: b */
    private final C2355b f5380b;

    public C1741ad(C1821y yVar, C2355b bVar) {
        C1489j.m6972b(yVar, "moduleDescriptor");
        C1489j.m6972b(bVar, "fqName");
        this.f5379a = yVar;
        this.f5380b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C1682ad mo7372a(C2360f fVar) {
        C1489j.m6972b(fVar, "name");
        if (fVar.mo9041c()) {
            return null;
        }
        C1821y yVar = this.f5379a;
        C2355b a = this.f5380b.mo9012a(fVar);
        C1489j.m6969a((Object) a, "fqName.child(name)");
        C1682ad a2 = yVar.mo7523a(a);
        if (a2.mo7291g()) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        if (!dVar.mo9576a(C2552d.f7631k.mo9583d())) {
            return C1415k.m6837a();
        }
        if (this.f5380b.mo9016c() && dVar.mo9578b().contains(C2551b.f7620a)) {
            return C1415k.m6837a();
        }
        Collection<C2355b> a = this.f5379a.mo7524a(this.f5380b, bVar);
        ArrayList arrayList = new ArrayList(a.size());
        for (C2355b e : a) {
            C2360f e2 = e.mo9018e();
            C1489j.m6969a((Object) e2, "shortName");
            if (((Boolean) bVar.mo6756a(e2)).booleanValue()) {
                C2885a.m13950a(arrayList, mo7372a(e2));
            }
        }
        return arrayList;
    }
}
