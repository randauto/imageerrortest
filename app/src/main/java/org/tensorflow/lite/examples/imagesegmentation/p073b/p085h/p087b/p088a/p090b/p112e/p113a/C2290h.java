package p073b.p085h.p087b.p088a.p090b.p112e.p113a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag;

/* renamed from: b.h.b.a.b.e.a.h */
/* compiled from: TypeTable.kt */
public final class C2290h {

    /* renamed from: a */
    private final List<C2173aa> f7036a;

    public C2290h(C2193ag agVar) {
        C1489j.m6972b(agVar, "typeTable");
        C2290h hVar = this;
        List<C2173aa> d = agVar.mo8355d();
        if (agVar.mo8357f()) {
            int g = agVar.mo8358g();
            List d2 = agVar.mo8355d();
            C1489j.m6969a((Object) d2, "typeTable.typeList");
            Iterable<C2173aa> iterable = d2;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            int i = 0;
            for (C2173aa aaVar : iterable) {
                int i2 = i + 1;
                if (i >= g) {
                    aaVar = aaVar.mo8110m().mo8258a(true).mo8141l();
                }
                arrayList.add(aaVar);
                i = i2;
            }
            d = (List) arrayList;
        } else {
            C1489j.m6969a((Object) d, "originalTypes");
        }
        this.f7036a = d;
    }

    /* renamed from: a */
    public final C2173aa mo8814a(int i) {
        return (C2173aa) this.f7036a.get(i);
    }
}
