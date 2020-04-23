package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p106b.C1953g;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2665n;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;

/* renamed from: b.h.b.a.b.d.b.g */
/* compiled from: JavaFlexibleTypeDeserializer.kt */
public final class C2127g implements C2665n {

    /* renamed from: a */
    public static final C2127g f6433a = new C2127g();

    private C2127g() {
    }

    /* renamed from: a */
    public C2841w mo8036a(C2173aa aaVar, String str, C2755ad adVar, C2755ad adVar2) {
        C1489j.m6972b(aaVar, "proto");
        C1489j.m6972b(str, "flexibleId");
        C1489j.m6972b(adVar, "lowerBound");
        C1489j.m6972b(adVar2, "upperBound");
        if (!C1489j.m6971a((Object) str, (Object) "kotlin.jvm.PlatformType")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error java flexible type with id: ");
            sb.append(str);
            sb.append(". (");
            sb.append(adVar);
            sb.append("..");
            sb.append(adVar2);
            sb.append(')');
            C2755ad c = C2827p.m13791c(sb.toString());
            C1489j.m6969a((Object) c, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
            return c;
        } else if (aaVar.mo9206a(C2330b.f7135g)) {
            return new C1953g(adVar, adVar2);
        } else {
            return C2842x.m13883a(adVar, adVar2);
        }
    }
}
