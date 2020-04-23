package p073b.p085h.p087b.p088a.p090b.p119i.p122b;

import java.util.List;
import p073b.C3232z;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.i.b.b */
/* compiled from: constantValues.kt */
public final class C2496b extends C2500f<List<? extends C2500f<?>>> {

    /* renamed from: a */
    private final C1450b<C1821y, C2841w> f7546a;

    public C2496b(List<? extends C2500f<?>> list, C1450b<? super C1821y, ? extends C2841w> bVar) {
        C1489j.m6972b(list, "value");
        C1489j.m6972b(bVar, "computeType");
        super(list);
        this.f7546a = bVar;
    }

    /* renamed from: a */
    public C2841w mo9516a(C1821y yVar) {
        C1489j.m6972b(yVar, "module");
        C2841w wVar = (C2841w) this.f7546a.mo6756a(yVar);
        boolean z = C1627g.m7409c(wVar) || C1627g.m7414d(wVar);
        if (!C3232z.f8648a || z) {
            return wVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Type should be an array, but was ");
        sb.append(wVar);
        sb.append(": ");
        sb.append((List) mo9521a());
        throw new AssertionError(sb.toString());
    }
}
