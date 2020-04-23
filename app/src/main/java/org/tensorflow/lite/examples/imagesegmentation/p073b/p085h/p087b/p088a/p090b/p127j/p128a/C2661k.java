package p073b.p085h.p087b.p088a.p090b.p127j.p128a;

import java.util.List;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2187ae;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2278a;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2290h;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2296k;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2298l;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2625f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.j.a.k */
/* compiled from: context.kt */
public final class C2661k {

    /* renamed from: a */
    private final C2681w f7853a;

    /* renamed from: b */
    private final C2669q f7854b = new C2669q(this);

    /* renamed from: c */
    private final C2657i f7855c;

    /* renamed from: d */
    private final C2285c f7856d;

    /* renamed from: e */
    private final C1804m f7857e;

    /* renamed from: f */
    private final C2290h f7858f;

    /* renamed from: g */
    private final C2296k f7859g;

    /* renamed from: h */
    private final C2278a f7860h;

    /* renamed from: i */
    private final C2625f f7861i;

    public C2661k(C2657i iVar, C2285c cVar, C1804m mVar, C2290h hVar, C2296k kVar, C2278a aVar, C2625f fVar, C2681w wVar, List<C2187ae> list) {
        C2657i iVar2 = iVar;
        C2285c cVar2 = cVar;
        C1804m mVar2 = mVar;
        C2290h hVar2 = hVar;
        C2296k kVar2 = kVar;
        C2278a aVar2 = aVar;
        C1489j.m6972b(iVar, "components");
        C1489j.m6972b(cVar, "nameResolver");
        C1489j.m6972b(mVar, "containingDeclaration");
        C1489j.m6972b(hVar, "typeTable");
        C1489j.m6972b(kVar2, "versionRequirementTable");
        C1489j.m6972b(aVar2, "metadataVersion");
        C1489j.m6972b(list, "typeParameters");
        this.f7855c = iVar2;
        this.f7856d = cVar2;
        this.f7857e = mVar2;
        this.f7858f = hVar2;
        this.f7859g = kVar2;
        this.f7860h = aVar2;
        this.f7861i = fVar;
        StringBuilder sb = new StringBuilder();
        sb.append("Deserializer for ");
        sb.append(this.f7857e.mo7351z_());
        C2681w wVar2 = new C2681w(this, wVar, list, sb.toString(), false, 16, null);
        this.f7853a = wVar2;
    }

    /* renamed from: d */
    public final C2657i mo9742d() {
        return this.f7855c;
    }

    /* renamed from: e */
    public final C2285c mo9743e() {
        return this.f7856d;
    }

    /* renamed from: f */
    public final C1804m mo9744f() {
        return this.f7857e;
    }

    /* renamed from: g */
    public final C2290h mo9745g() {
        return this.f7858f;
    }

    /* renamed from: h */
    public final C2296k mo9746h() {
        return this.f7859g;
    }

    /* renamed from: i */
    public final C2625f mo9747i() {
        return this.f7861i;
    }

    /* renamed from: a */
    public final C2681w mo9739a() {
        return this.f7853a;
    }

    /* renamed from: b */
    public final C2669q mo9740b() {
        return this.f7854b;
    }

    /* renamed from: c */
    public final C2713i mo9741c() {
        return this.f7855c.mo9717b();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C2661k m13181a(C2661k kVar, C1804m mVar, List list, C2285c cVar, C2290h hVar, C2296k kVar2, C2278a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = kVar.f7856d;
        }
        C2285c cVar2 = cVar;
        if ((i & 8) != 0) {
            hVar = kVar.f7858f;
        }
        C2290h hVar2 = hVar;
        if ((i & 16) != 0) {
            kVar2 = kVar.f7859g;
        }
        C2296k kVar3 = kVar2;
        if ((i & 32) != 0) {
            aVar = kVar.f7860h;
        }
        return kVar.mo9738a(mVar, list, cVar2, hVar2, kVar3, aVar);
    }

    /* renamed from: a */
    public final C2661k mo9738a(C1804m mVar, List<C2187ae> list, C2285c cVar, C2290h hVar, C2296k kVar, C2278a aVar) {
        C1804m mVar2 = mVar;
        C1489j.m6972b(mVar, "descriptor");
        List<C2187ae> list2 = list;
        C1489j.m6972b(list, "typeParameterProtos");
        C2285c cVar2 = cVar;
        C1489j.m6972b(cVar, "nameResolver");
        C1489j.m6972b(hVar, "typeTable");
        C2296k kVar2 = kVar;
        C1489j.m6972b(kVar2, "versionRequirementTable");
        C1489j.m6972b(aVar, "metadataVersion");
        C2657i iVar = this.f7855c;
        if (!C2298l.m11226a(aVar)) {
            kVar2 = this.f7859g;
        }
        C2661k kVar3 = new C2661k(iVar, cVar, mVar, hVar, kVar2, aVar, this.f7861i, this.f7853a, list);
        return kVar3;
    }
}
