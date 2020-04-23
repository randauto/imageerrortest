package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;

/* renamed from: b.h.b.a.b.l.aj */
/* compiled from: StubType.kt */
public final class C2763aj extends C2755ad {

    /* renamed from: a */
    private final C2767an f8024a;

    /* renamed from: b */
    private final boolean f8025b;

    /* renamed from: c */
    private final C2767an f8026c;

    /* renamed from: d */
    private final C2560h f8027d;

    /* renamed from: c */
    public boolean mo7897c() {
        return this.f8025b;
    }

    /* renamed from: g */
    public C2767an mo9507g() {
        return this.f8026c;
    }

    /* renamed from: b */
    public C2560h mo7787b() {
        return this.f8027d;
    }

    public C2763aj(C2767an anVar, boolean z, C2767an anVar2, C2560h hVar) {
        C1489j.m6972b(anVar, "originalTypeVariable");
        C1489j.m6972b(anVar2, "constructor");
        C1489j.m6972b(hVar, "memberScope");
        this.f8024a = anVar;
        this.f8025b = z;
        this.f8026c = anVar2;
        this.f8027d = hVar;
    }

    /* renamed from: a */
    public List<C2771ap> mo9501a() {
        return C1415k.m6837a();
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return C1659h.f5247a.mo7260a();
    }

    /* renamed from: c */
    public C2755ad mo7788b(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        throw new IllegalStateException("Shouldn't be called on non-fixed type".toString());
    }

    /* renamed from: a */
    public C2755ad mo7789b(boolean z) {
        if (z == mo7897c()) {
            return this;
        }
        return new C2763aj(this.f8024a, z, mo9507g(), mo7787b());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NonFixed: ");
        sb.append(this.f8024a);
        return sb.toString();
    }
}
