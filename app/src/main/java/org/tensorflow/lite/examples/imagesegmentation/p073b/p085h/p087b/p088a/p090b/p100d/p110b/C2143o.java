package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1694an;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b.C1873i;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1908h;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2535b;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2626g;

/* renamed from: b.h.b.a.b.d.b.o */
/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
public final class C2143o implements C1692am {

    /* renamed from: b */
    private final C1908h f6447b;

    public C2143o(C1908h hVar) {
        C1489j.m6972b(hVar, "packageFragment");
        this.f6447b = hVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6447b);
        sb.append(": ");
        sb.append(this.f6447b.mo7694c().keySet());
        return sb.toString();
    }

    /* renamed from: a */
    public C1694an mo6988a() {
        C1694an anVar = C1694an.f5332a;
        C1489j.m6969a((Object) anVar, "SourceFile.NO_SOURCE_FILE");
        return anVar;
    }

    /* renamed from: a */
    public final C2137n mo8062a(C2626g gVar) {
        C1489j.m6972b(gVar, "descriptor");
        C2535b a = C1873i.m8630a(gVar);
        if (a != null) {
            return (C2137n) this.f6447b.mo7694c().get(a.mo9555c());
        }
        return null;
    }
}
