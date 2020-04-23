package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1699aq;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;

/* renamed from: b.h.b.a.b.l.x */
/* compiled from: KotlinTypeFactory.kt */
public final class C2842x {

    /* renamed from: a */
    public static final C2842x f8124a = new C2842x();

    private C2842x() {
    }

    /* renamed from: a */
    private final C2560h m13879a(C2767an anVar, List<? extends C2771ap> list) {
        C1799h d = anVar.mo7096d();
        if (d instanceof C1700ar) {
            return d.mo7346A_().mo7787b();
        }
        if (d instanceof C1796e) {
            if (list.isEmpty()) {
                return ((C1796e) d).mo7346A_().mo7787b();
            }
            C2560h a = ((C1796e) d).mo7356a(C2768ao.f8029b.mo9873a(anVar, list));
            C1489j.m6969a((Object) a, "descriptor.getMemberScop…(constructor, arguments))");
            return a;
        } else if (d instanceof C1699aq) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scope for abbreviation: ");
            sb.append(((C1699aq) d).mo7351z_());
            C2560h a2 = C2827p.m13779a(sb.toString(), true);
            C1489j.m6969a((Object) a2, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            return a2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unsupported classifier: ");
            sb2.append(d);
            sb2.append(" for constructor: ");
            sb2.append(anVar);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public static final C2755ad m13881a(C1659h hVar, C2767an anVar, List<? extends C2771ap> list, boolean z) {
        C1489j.m6972b(hVar, "annotations");
        C1489j.m6972b(anVar, "constructor");
        C1489j.m6972b(list, "arguments");
        if (!hVar.mo7255a() || !list.isEmpty() || z || anVar.mo7096d() == null) {
            return m13882a(hVar, anVar, list, z, f8124a.m13879a(anVar, list));
        }
        C1799h d = anVar.mo7096d();
        if (d == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) d, "constructor.declarationDescriptor!!");
        C2755ad A_ = d.mo7346A_();
        C1489j.m6969a((Object) A_, "constructor.declarationDescriptor!!.defaultType");
        return A_;
    }

    /* renamed from: a */
    public static final C2755ad m13882a(C1659h hVar, C2767an anVar, List<? extends C2771ap> list, boolean z, C2560h hVar2) {
        C1489j.m6972b(hVar, "annotations");
        C1489j.m6972b(anVar, "constructor");
        C1489j.m6972b(list, "arguments");
        C1489j.m6972b(hVar2, "memberScope");
        C2756ae aeVar = new C2756ae(anVar, list, z, hVar2);
        if (hVar.mo7255a()) {
            return aeVar;
        }
        return new C2804d(aeVar, hVar);
    }

    /* renamed from: a */
    public static final C2755ad m13880a(C1659h hVar, C1796e eVar, List<? extends C2771ap> list) {
        C1489j.m6972b(hVar, "annotations");
        C1489j.m6972b(eVar, "descriptor");
        C1489j.m6972b(list, "arguments");
        C2767an e = eVar.mo7067e();
        C1489j.m6969a((Object) e, "descriptor.typeConstructor");
        return m13881a(hVar, e, list, false);
    }

    /* renamed from: a */
    public static final C2788az m13883a(C2755ad adVar, C2755ad adVar2) {
        C1489j.m6972b(adVar, "lowerBound");
        C1489j.m6972b(adVar2, "upperBound");
        if (C1489j.m6971a((Object) adVar, (Object) adVar2)) {
            return adVar;
        }
        return new C2835r(adVar, adVar2);
    }
}
