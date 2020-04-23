package p073b.p085h.p087b.p088a.p090b.p119i.p124d;

import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1850g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1965g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1908h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1986aa;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1992g;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;

/* renamed from: b.h.b.a.b.i.d.a */
/* compiled from: JavaDescriptorResolver.kt */
public final class C2534a {

    /* renamed from: a */
    private final C1965g f7589a;

    /* renamed from: b */
    private final C1850g f7590b;

    public C2534a(C1965g gVar, C1850g gVar2) {
        C1489j.m6972b(gVar, "packageFragmentProvider");
        C1489j.m6972b(gVar2, "javaResolverCache");
        this.f7589a = gVar;
        this.f7590b = gVar2;
    }

    /* renamed from: a */
    public final C1965g mo9552a() {
        return this.f7589a;
    }

    /* renamed from: a */
    public final C1796e mo9551a(C1992g gVar) {
        C1489j.m6972b(gVar, "javaClass");
        C2355b c = gVar.mo7835c();
        if (c != null && gVar.mo7842j() == C1986aa.SOURCE) {
            return this.f7590b.mo7609a(c);
        }
        C1992g f = gVar.mo7838f();
        C1796e eVar = null;
        if (f != null) {
            C1796e a = mo9551a(f);
            C2560h C = a != null ? a.mo7352C() : null;
            C1799h c2 = C != null ? C.mo7649c(gVar.mo7867r(), C1830d.FROM_JAVA_LOADER) : null;
            if (!(c2 instanceof C1796e)) {
                c2 = null;
            }
            return (C1796e) c2;
        } else if (c == null) {
            return null;
        } else {
            C1965g gVar2 = this.f7589a;
            C2355b d = c.mo9017d();
            C1489j.m6969a((Object) d, "fqName.parent()");
            C1908h hVar = (C1908h) C1415k.m6885g(gVar2.mo7286a(d));
            if (hVar != null) {
                eVar = hVar.mo7693a(gVar);
            }
            return eVar;
        }
    }
}
