package p073b.p085h.p087b.p088a.p090b.p136m;

import java.util.List;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p136m.C2852c.C2853a;

/* renamed from: b.h.b.a.b.m.a */
/* compiled from: modifierChecks.kt */
public abstract class C2845a {
    /* renamed from: a */
    public abstract List<C2856d> mo9958a();

    /* renamed from: a */
    public final C2852c mo9957a(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        for (C2856d dVar : mo9958a()) {
            if (dVar.mo9965a(tVar)) {
                return dVar.mo9966b(tVar);
            }
        }
        return C2853a.f8130a;
    }
}
