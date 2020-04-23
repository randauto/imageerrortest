package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b;

import java.util.List;
import java.util.Map;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t.C1815b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1740ac;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p136m.C2867i;

/* renamed from: b.h.b.a.b.d.a.b.e */
/* compiled from: JavaMethodDescriptor */
public class C1867e extends C1740ac implements C1864b {

    /* renamed from: a */
    public static final C1815b<C1705au> f5705a = new C1815b<C1705au>() {
    };

    /* renamed from: b */
    static final /* synthetic */ boolean f5706b = (!C1867e.class.desiredAssertionStatus());

    /* renamed from: d */
    private C1869a f5707d = null;

    /* renamed from: b.h.b.a.b.d.a.b.e$a */
    /* compiled from: JavaMethodDescriptor */
    private enum C1869a {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: e */
        public final boolean f5713e;

        /* renamed from: f */
        public final boolean f5714f;

        private C1869a(boolean z, boolean z2) {
            this.f5713e = z;
            this.f5714f = z2;
        }

        /* renamed from: a */
        public static C1869a m8621a(boolean z, boolean z2) {
            return z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
        }
    }

    protected C1867e(C1804m mVar, C1691al alVar, C1659h hVar, C2360f fVar, C1725a aVar, C1692am amVar) {
        super(mVar, alVar, hVar, fVar, aVar, amVar);
    }

    /* renamed from: a */
    public static C1867e m8612a(C1804m mVar, C1659h hVar, C2360f fVar, C1692am amVar) {
        C1867e eVar = new C1867e(mVar, null, hVar, fVar, C1725a.DECLARATION, amVar);
        return eVar;
    }

    /* renamed from: a */
    public C1740ac mo7366a(C2841w wVar, C1690ak akVar, List<? extends C1700ar> list, List<C1705au> list2, C2841w wVar2, C1818w wVar3, C1723az azVar, Map<? extends C1815b<?>, ?> map) {
        C1740ac a = super.mo7366a(wVar, akVar, list, list2, wVar2, wVar3, azVar, map);
        mo7458a(C2867i.f8149a.mo9957a(a).mo9964a());
        return a;
    }

    /* renamed from: G */
    public boolean mo7453G() {
        if (f5706b || this.f5707d != null) {
            return this.f5707d.f5713e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter names status was not set: ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: j */
    public boolean mo7237j() {
        if (f5706b || this.f5707d != null) {
            return this.f5707d.f5714f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter names status was not set: ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public void mo7628a(boolean z, boolean z2) {
        this.f5707d = C1869a.m8621a(z, z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1867e mo7106a(C1804m mVar, C1813t tVar, C1725a aVar, C2360f fVar, C1659h hVar, C1692am amVar) {
        C1691al alVar = (C1691al) tVar;
        if (fVar == null) {
            fVar = mo7351z_();
        }
        C1867e eVar = new C1867e(mVar, alVar, hVar, fVar, aVar, amVar);
        eVar.mo7628a(mo7453G(), mo7237j());
        return eVar;
    }

    /* renamed from: b */
    public C1867e mo7624a(C2841w wVar, List<C1874j> list, C2841w wVar2) {
        C1867e eVar = (C1867e) mo7304D().mo7484a(C1873i.m8631a(list, mo7236i(), this)).mo7483a(wVar2).mo7497b(wVar).mo7500c().mo7496b().mo7505f();
        if (f5706b || eVar != null) {
            return eVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("null after substitution while enhancing ");
        sb.append(toString());
        throw new AssertionError(sb.toString());
    }
}
