package p073b.p085h.p087b.p088a.p090b.p119i.p120a.p121a;

import java.util.Collection;
import java.util.List;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2722f;

/* renamed from: b.h.b.a.b.i.a.a.b */
/* compiled from: CapturedTypeConstructor.kt */
public final class C2489b implements C2767an {

    /* renamed from: a */
    private C2722f f7541a;

    /* renamed from: b */
    private final C2771ap f7542b;

    /* renamed from: f */
    public boolean mo7097f() {
        return false;
    }

    /* renamed from: g */
    public Void mo9511g() {
        return null;
    }

    public C2489b(C2771ap apVar) {
        C1489j.m6972b(apVar, "typeProjection");
        this.f7542b = apVar;
        boolean z = this.f7542b.mo9868b() != C2792ba.INVARIANT;
        if (C3232z.f8648a && !z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Only nontrivial projections can be captured, not: ");
            sb.append(this.f7542b);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: d */
    public /* synthetic */ C1799h mo7096d() {
        return (C1799h) mo9511g();
    }

    /* renamed from: h */
    public final C2771ap mo9512h() {
        return this.f7542b;
    }

    /* renamed from: a */
    public final C2722f mo9509a() {
        return this.f7541a;
    }

    /* renamed from: a */
    public final void mo9510a(C2722f fVar) {
        this.f7541a = fVar;
    }

    /* renamed from: b */
    public List<C1700ar> mo7094b() {
        return C1415k.m6837a();
    }

    /* renamed from: C_ */
    public Collection<C2841w> mo7405C_() {
        C2841w wVar;
        if (this.f7542b.mo9868b() == C2792ba.OUT_VARIANCE) {
            wVar = this.f7542b.mo9869c();
        } else {
            wVar = mo7407e().mo7207t();
        }
        return C1415k.m6832a(wVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CapturedTypeConstructor(");
        sb.append(this.f7542b);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: e */
    public C1627g mo7407e() {
        C1627g e = this.f7542b.mo9869c().mo9507g().mo7407e();
        C1489j.m6969a((Object) e, "typeProjection.type.constructor.builtIns");
        return e;
    }
}
