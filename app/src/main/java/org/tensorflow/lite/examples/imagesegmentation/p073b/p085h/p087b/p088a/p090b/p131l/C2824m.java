package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p085h.p087b.p088a.p090b.p118h.C2469h;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.l.m */
/* compiled from: dynamicTypes.kt */
public final class C2824m extends C2834q {

    /* renamed from: a */
    private final C1659h f8094a;

    /* renamed from: a */
    public C2824m mo7789b(boolean z) {
        return this;
    }

    /* renamed from: a */
    public String mo7786a(C2443c cVar, C2469h hVar) {
        C1489j.m6972b(cVar, "renderer");
        C1489j.m6972b(hVar, "options");
        return "dynamic";
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return false;
    }

    public C2824m(C1627g gVar, C1659h hVar) {
        C1489j.m6972b(gVar, "builtIns");
        C1489j.m6972b(hVar, "annotations");
        C2755ad q = gVar.mo7204q();
        C1489j.m6969a((Object) q, "builtIns.nothingType");
        C2755ad t = gVar.mo7207t();
        C1489j.m6969a((Object) t, "builtIns.nullableAnyType");
        super(q, t);
        this.f8094a = hVar;
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return this.f8094a;
    }

    /* renamed from: H_ */
    public C2755ad mo7783H_() {
        return mo9946h();
    }

    /* renamed from: a */
    public C2824m mo7788b(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return new C2824m(C2803a.m13674a((C2841w) mo7783H_()), hVar);
    }
}
