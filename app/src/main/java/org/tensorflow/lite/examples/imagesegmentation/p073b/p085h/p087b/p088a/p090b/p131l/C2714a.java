package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;

/* renamed from: b.h.b.a.b.l.a */
/* compiled from: SpecialTypes.kt */
public final class C2714a extends C2819i {

    /* renamed from: a */
    private final C2755ad f7955a;

    /* renamed from: b */
    private final C2755ad f7956b;

    public C2714a(C2755ad adVar, C2755ad adVar2) {
        C1489j.m6972b(adVar, "delegate");
        C1489j.m6972b(adVar2, "abbreviation");
        this.f7955a = adVar;
        this.f7956b = adVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2755ad mo7898d() {
        return this.f7955a;
    }

    /* renamed from: f */
    public final C2755ad mo9822f() {
        return this.f7956b;
    }

    /* renamed from: e */
    public final C2755ad mo9821e() {
        return mo7898d();
    }

    /* renamed from: a */
    public C2714a mo7896c(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return new C2714a(mo7898d().mo7896c(hVar), this.f7956b);
    }

    /* renamed from: c */
    public C2714a mo7789b(boolean z) {
        return new C2714a(mo7898d().mo7894a(z), this.f7956b.mo7894a(z));
    }
}
