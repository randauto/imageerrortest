package p073b.p085h.p087b.p088a.p090b.p119i.p120a.p121a;

import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2764ak;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.i.a.a.a */
/* compiled from: CapturedTypeConstructor.kt */
public final class C2488a extends C2755ad implements C2764ak {

    /* renamed from: a */
    private final C2771ap f7537a;

    /* renamed from: b */
    private final C2489b f7538b;

    /* renamed from: c */
    private final boolean f7539c;

    /* renamed from: d */
    private final C1659h f7540d;

    public /* synthetic */ C2488a(C2771ap apVar, C2489b bVar, boolean z, C1659h hVar, int i, C1486g gVar) {
        if ((i & 2) != 0) {
            bVar = new C2489b(apVar);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            hVar = C1659h.f5247a.mo7260a();
        }
        this(apVar, bVar, z, hVar);
    }

    /* renamed from: f */
    public C2489b mo9507g() {
        return this.f7538b;
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return this.f7539c;
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return this.f7540d;
    }

    public C2488a(C2771ap apVar, C2489b bVar, boolean z, C1659h hVar) {
        C1489j.m6972b(apVar, "typeProjection");
        C1489j.m6972b(bVar, "constructor");
        C1489j.m6972b(hVar, "annotations");
        this.f7537a = apVar;
        this.f7538b = bVar;
        this.f7539c = z;
        this.f7540d = hVar;
    }

    /* renamed from: a */
    public List<C2771ap> mo9501a() {
        return C1415k.m6837a();
    }

    /* renamed from: b */
    public C2560h mo7787b() {
        C2560h a = C2827p.m13779a("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        C1489j.m6969a((Object) a, "ErrorUtils.createErrorSc…system resolution\", true)");
        return a;
    }

    /* renamed from: d */
    public C2841w mo9504d() {
        C2792ba baVar = C2792ba.OUT_VARIANCE;
        C2755ad t = C2803a.m13674a((C2841w) this).mo7207t();
        C1489j.m6969a((Object) t, "builtIns.nullableAnyType");
        C2841w a = m12473a(baVar, t);
        C1489j.m6969a((Object) a, "representative(OUT_VARIA…builtIns.nullableAnyType)");
        return a;
    }

    /* renamed from: e */
    public C2841w mo9505e() {
        C2792ba baVar = C2792ba.IN_VARIANCE;
        C2755ad q = C2803a.m13674a((C2841w) this).mo7204q();
        C1489j.m6969a((Object) q, "builtIns.nothingType");
        C2841w a = m12473a(baVar, q);
        C1489j.m6969a((Object) a, "representative(IN_VARIANCE, builtIns.nothingType)");
        return a;
    }

    /* renamed from: a */
    private final C2841w m12473a(C2792ba baVar, C2841w wVar) {
        return this.f7537a.mo9868b() == baVar ? this.f7537a.mo9869c() : wVar;
    }

    /* renamed from: a */
    public boolean mo9502a(C2841w wVar) {
        C1489j.m6972b(wVar, "type");
        return mo9507g() == wVar.mo9507g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f7537a);
        sb.append(')');
        sb.append(mo7897c() ? "?" : "");
        return sb.toString();
    }

    /* renamed from: c */
    public C2488a mo7789b(boolean z) {
        if (z == mo7897c()) {
            return this;
        }
        return new C2488a(this.f7537a, mo9507g(), z, mo7086x());
    }

    /* renamed from: a */
    public C2488a mo7896c(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return new C2488a(this.f7537a, mo9507g(), mo7897c(), hVar);
    }
}
