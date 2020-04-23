package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p085h.p087b.p088a.p090b.p118h.C2469h;

/* renamed from: b.h.b.a.b.l.s */
/* compiled from: TypeWithEnhancement.kt */
public final class C2837s extends C2834q implements C2785aw {

    /* renamed from: a */
    private final C2834q f8116a;

    /* renamed from: b */
    private final C2841w f8117b;

    /* renamed from: i */
    public C2834q mo9865j() {
        return this.f8116a;
    }

    /* renamed from: k */
    public C2841w mo9866k() {
        return this.f8117b;
    }

    public C2837s(C2834q qVar, C2841w wVar) {
        C1489j.m6972b(qVar, "origin");
        C1489j.m6972b(wVar, "enhancement");
        super(qVar.mo9945f(), qVar.mo9946h());
        this.f8116a = qVar;
        this.f8117b = wVar;
    }

    /* renamed from: b */
    public C2788az mo7788b(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return C2786ax.m13595b(mo9865j().mo7788b(hVar), mo9866k());
    }

    /* renamed from: b */
    public C2788az mo7789b(boolean z) {
        return C2786ax.m13595b(mo9865j().mo7789b(z), mo9866k().mo9892l().mo7789b(z));
    }

    /* renamed from: a */
    public String mo7786a(C2443c cVar, C2469h hVar) {
        C1489j.m6972b(cVar, "renderer");
        C1489j.m6972b(hVar, "options");
        if (hVar.mo9411k()) {
            return cVar.mo9348a(mo9866k());
        }
        return mo9865j().mo7786a(cVar, hVar);
    }

    /* renamed from: H_ */
    public C2755ad mo7783H_() {
        return mo9865j().mo7783H_();
    }
}
