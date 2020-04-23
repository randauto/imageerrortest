package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;

/* renamed from: b.h.b.a.b.l.j */
/* compiled from: KotlinTypeFactory.kt */
public abstract class C2820j extends C2819i {

    /* renamed from: a */
    private final C2755ad f8090a;

    public C2820j(C2755ad adVar) {
        C1489j.m6972b(adVar, "delegate");
        this.f8090a = adVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2755ad mo7898d() {
        return this.f8090a;
    }

    /* renamed from: a */
    public C2820j mo7896c(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return hVar != mo7086x() ? new C2804d(this, hVar) : this;
    }

    /* renamed from: a */
    public C2755ad mo7789b(boolean z) {
        if (z == mo7897c()) {
            return this;
        }
        return mo7898d().mo7894a(z).mo7896c(mo7086x());
    }
}
