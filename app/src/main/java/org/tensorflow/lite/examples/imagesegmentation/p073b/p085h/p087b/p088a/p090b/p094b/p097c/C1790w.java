package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.b.c.w */
/* compiled from: PackageFragmentDescriptorImpl.kt */
public abstract class C1790w extends C1766k implements C1680ab {

    /* renamed from: a */
    private final C2355b f5549a;

    /* renamed from: f */
    public final C2355b mo7284f() {
        return this.f5549a;
    }

    public C1790w(C1821y yVar, C2355b bVar) {
        C1489j.m6972b(yVar, "module");
        C1489j.m6972b(bVar, "fqName");
        super(yVar, C1659h.f5247a.mo7260a(), bVar.mo9020f(), C1692am.f5331a);
        this.f5549a = bVar;
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        C1489j.m6972b(oVar, "visitor");
        return oVar.mo7424a((C1680ab) this, d);
    }

    /* renamed from: e */
    public C1821y mo7065b() {
        C1804m b = super.mo7065b();
        if (b != null) {
            return (C1821y) b;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
    }

    /* renamed from: y */
    public C1692am mo7088y() {
        C1692am amVar = C1692am.f5331a;
        C1489j.m6969a((Object) amVar, "SourceElement.NO_SOURCE");
        return amVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("package ");
        sb.append(this.f5549a);
        return sb.toString();
    }
}
