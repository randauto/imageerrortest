package p073b.p085h.p087b.p088a.p090b.p119i.p122b;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1810s;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.i.b.v */
/* compiled from: constantValues.kt */
public final class C2520v extends C2522x<Long> {
    public C2520v(long j) {
        super(Long.valueOf(j));
    }

    /* renamed from: a */
    public C2841w mo9516a(C1821y yVar) {
        C1489j.m6972b(yVar, "module");
        C2354a aVar = C1627g.f5076h.f5140as;
        C1489j.m6969a((Object) aVar, "KotlinBuiltIns.FQ_NAMES.uLong");
        C1796e a = C1810s.m8443a(yVar, aVar);
        if (a != null) {
            C2755ad A_ = a.mo7346A_();
            if (A_ != null) {
                return A_;
            }
        }
        C2755ad c = C2827p.m13791c("Unsigned type ULong not found");
        C1489j.m6969a((Object) c, "ErrorUtils.createErrorTy…ed type ULong not found\")");
        return c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) mo9521a()).longValue());
        sb.append(".toULong()");
        return sb.toString();
    }
}
