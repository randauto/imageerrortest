package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;

/* renamed from: b.h.b.a.b.l.o */
/* compiled from: ErrorType.kt */
public class C2826o extends C2755ad {

    /* renamed from: a */
    private final C2767an f8095a;

    /* renamed from: b */
    private final C2560h f8096b;

    /* renamed from: c */
    private final List<C2771ap> f8097c;

    /* renamed from: d */
    private final boolean f8098d;

    public C2826o(C2767an anVar, C2560h hVar) {
        this(anVar, hVar, null, false, 12, null);
    }

    /* renamed from: g */
    public C2767an mo9507g() {
        return this.f8095a;
    }

    /* renamed from: b */
    public C2560h mo7787b() {
        return this.f8096b;
    }

    public /* synthetic */ C2826o(C2767an anVar, C2560h hVar, List list, boolean z, int i, C1486g gVar) {
        if ((i & 4) != 0) {
            list = C1415k.m6837a();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        this(anVar, hVar, list, z);
    }

    /* renamed from: a */
    public List<C2771ap> mo9501a() {
        return this.f8097c;
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return this.f8098d;
    }

    public C2826o(C2767an anVar, C2560h hVar, List<? extends C2771ap> list, boolean z) {
        C1489j.m6972b(anVar, "constructor");
        C1489j.m6972b(hVar, "memberScope");
        C1489j.m6972b(list, "arguments");
        this.f8095a = anVar;
        this.f8096b = hVar;
        this.f8097c = list;
        this.f8098d = z;
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return C1659h.f5247a.mo7260a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo9507g().toString());
        sb.append(mo9501a().isEmpty() ? "" : C1415k.m6858a(mo9501a(), ", ", "<", ">", -1, "...", null));
        return sb.toString();
    }

    /* renamed from: c */
    public C2755ad mo7788b(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return this;
    }

    /* renamed from: a */
    public C2755ad mo7789b(boolean z) {
        return new C2826o(mo9507g(), mo7787b(), mo9501a(), z);
    }
}
