package p073b.p085h.p087b.p088a.p090b.p136m;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1640i;
import p073b.p085h.p087b.p088a.p090b.p091a.C1640i.C1642b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;
import p073b.p085h.p087b.p088a.p090b.p136m.C2849b.C2850a;

/* renamed from: b.h.b.a.b.m.e */
/* compiled from: modifierChecks.kt */
final class C2860e implements C2849b {

    /* renamed from: a */
    public static final C2860e f8141a = new C2860e();

    /* renamed from: b */
    private static final String f8142b = f8142b;

    private C2860e() {
    }

    /* renamed from: b */
    public String mo9963b(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        return C2850a.m13900a(this, tVar);
    }

    /* renamed from: a */
    public String mo9961a() {
        return f8142b;
    }

    /* renamed from: a */
    public boolean mo9962a(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        C1705au auVar = (C1705au) tVar.mo7236i().get(1);
        C1642b bVar = C1640i.f5194b;
        C1489j.m6969a((Object) auVar, "secondParameter");
        C2841w a = bVar.mo7224a(C2524a.m12626c(auVar));
        if (a == null) {
            return false;
        }
        C2841w r = auVar.mo7320r();
        C1489j.m6969a((Object) r, "secondParameter.type");
        C2841w c = C2803a.m13680c(r);
        C1489j.m6969a((Object) c, "secondParameter.type.makeNotNullable()");
        return C2803a.m13678a(a, c);
    }
}
