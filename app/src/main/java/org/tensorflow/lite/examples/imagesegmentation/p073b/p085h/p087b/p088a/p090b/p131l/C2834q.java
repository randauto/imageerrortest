package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p085h.p087b.p088a.p090b.p118h.C2469h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;

/* renamed from: b.h.b.a.b.l.q */
/* compiled from: KotlinType.kt */
public abstract class C2834q extends C2788az implements C2764ak {

    /* renamed from: a */
    private final C2755ad f8111a;

    /* renamed from: b */
    private final C2755ad f8112b;

    /* renamed from: H_ */
    public abstract C2755ad mo7783H_();

    /* renamed from: a */
    public abstract String mo7786a(C2443c cVar, C2469h hVar);

    /* renamed from: a */
    public boolean mo9502a(C2841w wVar) {
        C1489j.m6972b(wVar, "type");
        return false;
    }

    /* renamed from: f */
    public final C2755ad mo9945f() {
        return this.f8111a;
    }

    /* renamed from: h */
    public final C2755ad mo9946h() {
        return this.f8112b;
    }

    public C2834q(C2755ad adVar, C2755ad adVar2) {
        C1489j.m6972b(adVar, "lowerBound");
        C1489j.m6972b(adVar2, "upperBound");
        super(null);
        this.f8111a = adVar;
        this.f8112b = adVar2;
    }

    /* renamed from: d */
    public C2841w mo9504d() {
        return this.f8111a;
    }

    /* renamed from: e */
    public C2841w mo9505e() {
        return this.f8112b;
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return mo7783H_().mo7086x();
    }

    /* renamed from: g */
    public C2767an mo9507g() {
        return mo7783H_().mo9507g();
    }

    /* renamed from: a */
    public List<C2771ap> mo9501a() {
        return mo7783H_().mo9501a();
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return mo7783H_().mo7897c();
    }

    /* renamed from: b */
    public C2560h mo7787b() {
        return mo7783H_().mo7787b();
    }

    public String toString() {
        return C2443c.f7423h.mo9348a((C2841w) this);
    }
}
