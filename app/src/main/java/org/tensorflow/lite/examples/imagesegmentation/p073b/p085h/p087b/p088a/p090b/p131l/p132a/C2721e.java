package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;

/* renamed from: b.h.b.a.b.l.a.e */
/* compiled from: NewCapturedType.kt */
public final class C2721e extends C2755ad {

    /* renamed from: a */
    private final C2715a f7964a;

    /* renamed from: b */
    private final C2722f f7965b;

    /* renamed from: c */
    private final C2788az f7966c;

    /* renamed from: d */
    private final C1659h f7967d;

    /* renamed from: e */
    private final boolean f7968e;

    /* renamed from: d */
    public C2722f mo9507g() {
        return this.f7965b;
    }

    /* renamed from: e */
    public final C2788az mo9829e() {
        return this.f7966c;
    }

    public /* synthetic */ C2721e(C2715a aVar, C2722f fVar, C2788az azVar, C1659h hVar, boolean z, int i, C1486g gVar) {
        if ((i & 8) != 0) {
            hVar = C1659h.f5247a.mo7260a();
        }
        this(aVar, fVar, azVar, hVar, (i & 16) != 0 ? false : z);
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return this.f7967d;
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return this.f7968e;
    }

    public C2721e(C2715a aVar, C2722f fVar, C2788az azVar, C1659h hVar, boolean z) {
        C1489j.m6972b(aVar, "captureStatus");
        C1489j.m6972b(fVar, "constructor");
        C1489j.m6972b(hVar, "annotations");
        this.f7964a = aVar;
        this.f7965b = fVar;
        this.f7966c = azVar;
        this.f7967d = hVar;
        this.f7968e = z;
    }

    public C2721e(C2715a aVar, C2788az azVar, C2771ap apVar) {
        C1489j.m6972b(aVar, "captureStatus");
        C1489j.m6972b(apVar, "projection");
        this(aVar, new C2722f(apVar, null, 2, null), azVar, null, false, 24, null);
    }

    /* renamed from: a */
    public List<C2771ap> mo9501a() {
        return C1415k.m6837a();
    }

    /* renamed from: b */
    public C2560h mo7787b() {
        C2560h a = C2827p.m13779a("No member resolution should be done on captured type!", true);
        C1489j.m6969a((Object) a, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return a;
    }

    /* renamed from: a */
    public C2721e mo7896c(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        C2721e eVar = new C2721e(this.f7964a, mo9507g(), this.f7966c, hVar, mo7897c());
        return eVar;
    }

    /* renamed from: c */
    public C2721e mo7789b(boolean z) {
        C2721e eVar = new C2721e(this.f7964a, mo9507g(), this.f7966c, mo7086x(), z);
        return eVar;
    }
}
