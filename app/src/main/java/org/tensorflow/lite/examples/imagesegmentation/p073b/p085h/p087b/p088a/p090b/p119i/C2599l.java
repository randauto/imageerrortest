package p073b.p085h.p087b.p088a.p090b.p119i;

import java.util.Collection;
import p073b.C3232z;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;

/* renamed from: b.h.b.a.b.i.l */
/* compiled from: VisibilityUtil.kt */
public final class C2599l {
    /* renamed from: a */
    public static final C1724b m12871a(Collection<? extends C1724b> collection) {
        C1489j.m6972b(collection, "descriptors");
        boolean z = !collection.isEmpty();
        if (!C3232z.f8648a || z) {
            C1724b bVar = null;
            for (C1724b bVar2 : collection) {
                if (bVar != null) {
                    Integer b = C1710ay.m7696b(bVar.mo7077p(), bVar2.mo7077p());
                    if (b != null) {
                        if (C1489j.m6965a(b.intValue(), 0) >= 0) {
                        }
                    }
                }
                bVar = bVar2;
            }
            if (bVar == null) {
                C1489j.m6968a();
            }
            return bVar;
        }
        throw new AssertionError("Assertion failed");
    }
}
