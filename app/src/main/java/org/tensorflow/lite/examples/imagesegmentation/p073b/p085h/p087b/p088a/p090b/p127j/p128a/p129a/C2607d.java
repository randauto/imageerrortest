package p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a;

import java.util.List;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1803l;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1761f;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2222e;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2290h;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2291i;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2296k;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2605c.C2606a;

/* renamed from: b.h.b.a.b.j.a.a.d */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class C2607d extends C1761f implements C2605c {

    /* renamed from: d */
    private boolean f7716d;

    /* renamed from: e */
    private final C2222e f7717e;

    /* renamed from: f */
    private final C2285c f7718f;

    /* renamed from: g */
    private final C2290h f7719g;

    /* renamed from: h */
    private final C2296k f7720h;

    /* renamed from: i */
    private final C2625f f7721i;

    /* renamed from: C */
    public boolean mo7452C() {
        return false;
    }

    /* renamed from: a */
    public boolean mo7108a() {
        return false;
    }

    /* renamed from: c */
    public boolean mo7109c() {
        return false;
    }

    /* renamed from: w */
    public boolean mo7085w() {
        return false;
    }

    /* renamed from: O */
    public List<C2291i> mo9636O() {
        return C2606a.m12888a(this);
    }

    /* renamed from: I */
    public C2222e mo9631J() {
        return this.f7717e;
    }

    /* renamed from: K */
    public C2285c mo9632K() {
        return this.f7718f;
    }

    /* renamed from: L */
    public C2290h mo9633L() {
        return this.f7719g;
    }

    /* renamed from: M */
    public C2296k mo9634M() {
        return this.f7720h;
    }

    /* renamed from: N */
    public C2625f mo9635N() {
        return this.f7721i;
    }

    public /* synthetic */ C2607d(C1796e eVar, C1803l lVar, C1659h hVar, boolean z, C1725a aVar, C2222e eVar2, C2285c cVar, C2290h hVar2, C2296k kVar, C2625f fVar, C1692am amVar, int i, C1486g gVar) {
        this(eVar, lVar, hVar, z, aVar, eVar2, cVar, hVar2, kVar, fVar, (i & 1024) != 0 ? null : amVar);
    }

    public C2607d(C1796e eVar, C1803l lVar, C1659h hVar, boolean z, C1725a aVar, C2222e eVar2, C2285c cVar, C2290h hVar2, C2296k kVar, C2625f fVar, C1692am amVar) {
        C2222e eVar3 = eVar2;
        C2285c cVar2 = cVar;
        C2290h hVar3 = hVar2;
        C2296k kVar2 = kVar;
        C1796e eVar4 = eVar;
        C1489j.m6972b(eVar, "containingDeclaration");
        C1659h hVar4 = hVar;
        C1489j.m6972b(hVar, "annotations");
        C1489j.m6972b(aVar, "kind");
        C1489j.m6972b(eVar3, "proto");
        C1489j.m6972b(cVar2, "nameResolver");
        C1489j.m6972b(hVar3, "typeTable");
        C1489j.m6972b(kVar2, "versionRequirementTable");
        super(eVar, lVar, hVar, z, aVar, amVar != null ? amVar : C1692am.f5331a);
        this.f7717e = eVar3;
        this.f7718f = cVar2;
        this.f7719g = hVar3;
        this.f7720h = kVar2;
        this.f7721i = fVar;
    }

    /* renamed from: H */
    public boolean mo9629H() {
        return this.f7716d;
    }

    /* renamed from: k */
    public void mo9638k(boolean z) {
        this.f7716d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C2607d mo7420b(C1804m mVar, C1813t tVar, C1725a aVar, C2360f fVar, C1659h hVar, C1692am amVar) {
        C1804m mVar2 = mVar;
        C1489j.m6972b(mVar, "newOwner");
        C1725a aVar2 = aVar;
        C1489j.m6972b(aVar2, "kind");
        C1659h hVar2 = hVar;
        C1489j.m6972b(hVar2, "annotations");
        C1692am amVar2 = amVar;
        C1489j.m6972b(amVar2, "source");
        C2607d dVar = new C2607d((C1796e) mVar2, (C1803l) tVar, hVar2, this.f5426a, aVar2, mo9631J(), mo9632K(), mo9633L(), mo9634M(), mo9635N(), amVar2);
        dVar.mo9638k(mo9629H());
        return dVar;
    }
}
