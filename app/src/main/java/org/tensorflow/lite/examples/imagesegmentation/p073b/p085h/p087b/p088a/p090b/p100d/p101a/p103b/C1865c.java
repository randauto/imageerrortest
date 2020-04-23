package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b;

import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1761f;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.d.a.b.c */
/* compiled from: JavaClassConstructorDescriptor */
public class C1865c extends C1761f implements C1864b {

    /* renamed from: d */
    static final /* synthetic */ boolean f5702d = (!C1865c.class.desiredAssertionStatus());

    /* renamed from: e */
    private Boolean f5703e = null;

    /* renamed from: f */
    private Boolean f5704f = null;

    protected C1865c(C1796e eVar, C1865c cVar, C1659h hVar, boolean z, C1725a aVar, C1692am amVar) {
        super(eVar, cVar, hVar, z, aVar, amVar);
    }

    /* renamed from: b */
    public static C1865c m8601b(C1796e eVar, C1659h hVar, boolean z, C1692am amVar) {
        C1865c cVar = new C1865c(eVar, null, hVar, z, C1725a.DECLARATION, amVar);
        return cVar;
    }

    /* renamed from: G */
    public boolean mo7453G() {
        if (f5702d || this.f5703e != null) {
            return this.f5703e.booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hasStableParameterNames was not set: ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: i */
    public void mo7467i(boolean z) {
        this.f5703e = Boolean.valueOf(z);
    }

    /* renamed from: j */
    public boolean mo7237j() {
        if (f5702d || this.f5704f != null) {
            return this.f5704f.booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hasSynthesizedParameterNames was not set: ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: j */
    public void mo7468j(boolean z) {
        this.f5704f = Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1865c mo7420b(C1804m mVar, C1813t tVar, C1725a aVar, C2360f fVar, C1659h hVar, C1692am amVar) {
        if (aVar != C1725a.DECLARATION && aVar != C1725a.SYNTHESIZED) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\n");
            sb.append("newOwner: ");
            sb.append(mVar);
            sb.append("\n");
            sb.append("kind: ");
            sb.append(aVar);
            throw new IllegalStateException(sb.toString());
        } else if (f5702d || fVar == null) {
            C1865c a = mo7625a((C1796e) mVar, (C1865c) tVar, aVar, amVar, hVar);
            a.mo7467i(mo7453G());
            a.mo7468j(mo7237j());
            return a;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Attempt to rename constructor: ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1865c mo7625a(C1796e eVar, C1865c cVar, C1725a aVar, C1692am amVar, C1659h hVar) {
        C1865c cVar2 = new C1865c(eVar, cVar, hVar, this.f5426a, aVar, amVar);
        return cVar2;
    }

    /* renamed from: b */
    public C1865c mo7624a(C2841w wVar, List<C1874j> list, C2841w wVar2) {
        C1865c c = mo7420b(mo7384q(), null, mo7344n(), null, mo7086x(), mo7088y());
        C1865c cVar = c;
        C2841w wVar3 = wVar;
        C2841w wVar4 = wVar2;
        cVar.mo7367a(wVar3, mo7232e(), mo7233f(), C1873i.m8631a(list, mo7236i(), c), wVar4, mo7074m(), mo7077p());
        return c;
    }
}
