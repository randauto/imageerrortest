package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p.C2831b;

/* renamed from: b.h.b.a.b.l.ae */
/* compiled from: KotlinTypeFactory.kt */
final class C2756ae extends C2755ad {

    /* renamed from: a */
    private final C2767an f8013a;

    /* renamed from: b */
    private final List<C2771ap> f8014b;

    /* renamed from: c */
    private final boolean f8015c;

    /* renamed from: d */
    private final C2560h f8016d;

    /* renamed from: g */
    public C2767an mo9507g() {
        return this.f8013a;
    }

    /* renamed from: a */
    public List<C2771ap> mo9501a() {
        return this.f8014b;
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return this.f8015c;
    }

    /* renamed from: b */
    public C2560h mo7787b() {
        return this.f8016d;
    }

    public C2756ae(C2767an anVar, List<? extends C2771ap> list, boolean z, C2560h hVar) {
        C1489j.m6972b(anVar, "constructor");
        C1489j.m6972b(list, "arguments");
        C1489j.m6972b(hVar, "memberScope");
        this.f8013a = anVar;
        this.f8014b = list;
        this.f8015c = z;
        this.f8016d = hVar;
        if (mo7787b() instanceof C2831b) {
            StringBuilder sb = new StringBuilder();
            sb.append("SimpleTypeImpl should not be created for error type: ");
            sb.append(mo7787b());
            sb.append(10);
            sb.append(mo9507g());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return C1659h.f5247a.mo7260a();
    }

    /* renamed from: c */
    public C2755ad mo7788b(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        if (hVar.mo7255a()) {
            return this;
        }
        return new C2804d(this, hVar);
    }

    /* renamed from: a */
    public C2755ad mo7789b(boolean z) {
        C2820j jVar;
        if (z == mo7897c()) {
            return this;
        }
        if (z) {
            jVar = new C2753ab(this);
        } else {
            jVar = new C2752aa(this);
        }
        return jVar;
    }
}
