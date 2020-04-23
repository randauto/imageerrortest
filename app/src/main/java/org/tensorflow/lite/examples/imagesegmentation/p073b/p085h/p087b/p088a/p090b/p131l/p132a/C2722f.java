package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.List;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.l.a.f */
/* compiled from: NewCapturedType.kt */
public final class C2722f implements C2767an {

    /* renamed from: a */
    private final C2771ap f7969a;

    /* renamed from: b */
    private List<? extends C2788az> f7970b;

    /* renamed from: d */
    public C1799h mo7096d() {
        return null;
    }

    /* renamed from: f */
    public boolean mo7097f() {
        return false;
    }

    public C2722f(C2771ap apVar, List<? extends C2788az> list) {
        C1489j.m6972b(apVar, "projection");
        this.f7969a = apVar;
        this.f7970b = list;
    }

    public /* synthetic */ C2722f(C2771ap apVar, List list, int i, C1486g gVar) {
        if ((i & 2) != 0) {
            list = null;
        }
        this(apVar, list);
    }

    /* renamed from: a */
    public final void mo9831a(List<? extends C2788az> list) {
        C1489j.m6972b(list, "supertypes");
        boolean z = this.f7970b == null;
        if (!C3232z.f8648a || z) {
            this.f7970b = list;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Already initialized! oldValue = ");
        sb.append(this.f7970b);
        sb.append(", newValue = ");
        sb.append(list);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public List<C2788az> mo7405C_() {
        List<? extends C2788az> list = this.f7970b;
        return list != null ? list : C1415k.m6837a();
    }

    /* renamed from: b */
    public List<C1700ar> mo7094b() {
        return C1415k.m6837a();
    }

    /* renamed from: e */
    public C1627g mo7407e() {
        C2841w c = this.f7969a.mo9869c();
        C1489j.m6969a((Object) c, "projection.type");
        return C2803a.m13674a(c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CapturedType(");
        sb.append(this.f7969a);
        sb.append(')');
        return sb.toString();
    }
}
