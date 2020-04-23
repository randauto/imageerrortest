package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c;

import java.util.EnumMap;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C1834a.C1835a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2016d;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2021h;

/* renamed from: b.h.b.a.b.d.a.c.d */
/* compiled from: context.kt */
public final class C1961d {

    /* renamed from: a */
    private final EnumMap<C1835a, C2021h> f5907a;

    public C1961d(EnumMap<C1835a, C2021h> enumMap) {
        C1489j.m6972b(enumMap, "nullabilityQualifiers");
        this.f5907a = enumMap;
    }

    /* renamed from: a */
    public final EnumMap<C1835a, C2021h> mo7796a() {
        return this.f5907a;
    }

    /* renamed from: a */
    public final C2016d mo7795a(C1835a aVar) {
        C2021h hVar = (C2021h) this.f5907a.get(aVar);
        if (hVar != null) {
            return new C2016d(hVar.mo7899a(), null, false, hVar.mo7901b());
        }
        return null;
    }
}
