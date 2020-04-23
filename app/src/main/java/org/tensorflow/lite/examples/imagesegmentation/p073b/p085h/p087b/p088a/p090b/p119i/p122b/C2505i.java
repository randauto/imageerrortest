package p073b.p085h.p087b.p088a.p090b.p119i.p122b;

import p073b.C3221p;
import p073b.C3226t;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1810s;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.i.b.i */
/* compiled from: constantValues.kt */
public final class C2505i extends C2500f<C3221p<? extends C2354a, ? extends C2360f>> {

    /* renamed from: a */
    private final C2354a f7551a;

    /* renamed from: b */
    private final C2360f f7552b;

    public C2505i(C2354a aVar, C2360f fVar) {
        C1489j.m6972b(aVar, "enumClassId");
        C1489j.m6972b(fVar, "enumEntryName");
        super(C3226t.m14841a(aVar, fVar));
        this.f7551a = aVar;
        this.f7552b = fVar;
    }

    /* renamed from: b */
    public final C2360f mo9529b() {
        return this.f7552b;
    }

    /* renamed from: a */
    public C2841w mo9516a(C1821y yVar) {
        C1489j.m6972b(yVar, "module");
        C1796e a = C1810s.m8443a(yVar, this.f7551a);
        if (a != null) {
            if (!C2523c.m12605m(a)) {
                a = null;
            }
            if (a != null) {
                C2755ad A_ = a.mo7346A_();
                if (A_ != null) {
                    return A_;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Containing class for error-class based enum entry ");
        sb.append(this.f7551a);
        sb.append('.');
        sb.append(this.f7552b);
        C2755ad c = C2827p.m13791c(sb.toString());
        C1489j.m6969a((Object) c, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
        return c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7551a.mo9003c());
        sb.append('.');
        sb.append(this.f7552b);
        return sb.toString();
    }
}
