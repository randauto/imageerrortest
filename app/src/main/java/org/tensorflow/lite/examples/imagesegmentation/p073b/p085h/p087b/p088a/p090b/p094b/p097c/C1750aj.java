package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2711g;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.c.aj */
/* compiled from: VariableDescriptorWithInitializerImpl */
public abstract class C1750aj extends C1749ai {

    /* renamed from: d */
    static final /* synthetic */ boolean f5401d = (!C1750aj.class.desiredAssertionStatus());

    /* renamed from: a */
    protected C2711g<C2500f<?>> f5402a;

    /* renamed from: e */
    private final boolean f5403e;

    public C1750aj(C1804m mVar, C1659h hVar, C2360f fVar, C2841w wVar, boolean z, C1692am amVar) {
        super(mVar, hVar, fVar, wVar, amVar);
        this.f5403e = z;
    }

    /* renamed from: s */
    public boolean mo7330s() {
        return this.f5403e;
    }

    /* renamed from: t */
    public C2500f<?> mo7331t() {
        if (this.f5402a != null) {
            return (C2500f) this.f5402a.mo6823a();
        }
        return null;
    }

    /* renamed from: a */
    public void mo7395a(C2711g<C2500f<?>> gVar) {
        if (f5401d || !mo7330s()) {
            this.f5402a = gVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Constant value for variable initializer should be recorded only for final variables: ");
        sb.append(mo7351z_());
        throw new AssertionError(sb.toString());
    }
}
