package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;

/* renamed from: b.h.b.a.b.l.af */
/* compiled from: TypeWithEnhancement.kt */
public final class C2757af extends C2819i implements C2785aw {

    /* renamed from: a */
    private final C2755ad f8017a;

    /* renamed from: b */
    private final C2841w f8018b;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2755ad mo7898d() {
        return this.f8017a;
    }

    /* renamed from: k */
    public C2841w mo9866k() {
        return this.f8018b;
    }

    public C2757af(C2755ad adVar, C2841w wVar) {
        C1489j.m6972b(adVar, "delegate");
        C1489j.m6972b(wVar, "enhancement");
        this.f8017a = adVar;
        this.f8018b = wVar;
    }

    /* renamed from: j */
    public C2788az mo9865j() {
        return mo7898d();
    }

    /* renamed from: c */
    public C2755ad mo7788b(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        C2788az b = C2786ax.m13595b(mo9865j().mo7788b(hVar), mo9866k());
        if (b != null) {
            return (C2755ad) b;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    /* renamed from: a */
    public C2755ad mo7789b(boolean z) {
        C2788az b = C2786ax.m13595b(mo9865j().mo7789b(z), mo9866k().mo9892l().mo7789b(z));
        if (b != null) {
            return (C2755ad) b;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }
}
