package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f;

import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.d.a.f.h */
/* compiled from: signatureEnhancement.kt */
public final class C2021h {

    /* renamed from: a */
    private final C2020g f5982a;

    /* renamed from: b */
    private final boolean f5983b;

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C2021h m9176a(C2021h hVar, C2020g gVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = hVar.f5982a;
        }
        if ((i & 2) != 0) {
            z = hVar.f5983b;
        }
        return hVar.mo7900a(gVar, z);
    }

    /* renamed from: a */
    public final C2021h mo7900a(C2020g gVar, boolean z) {
        C1489j.m6972b(gVar, "qualifier");
        return new C2021h(gVar, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2021h) {
                C2021h hVar = (C2021h) obj;
                if (C1489j.m6971a((Object) this.f5982a, (Object) hVar.f5982a)) {
                    if (this.f5983b == hVar.f5983b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C2020g gVar = this.f5982a;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        boolean z = this.f5983b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.f5982a);
        sb.append(", isForWarningOnly=");
        sb.append(this.f5983b);
        sb.append(")");
        return sb.toString();
    }

    public C2021h(C2020g gVar, boolean z) {
        C1489j.m6972b(gVar, "qualifier");
        this.f5982a = gVar;
        this.f5983b = z;
    }

    /* renamed from: a */
    public final C2020g mo7899a() {
        return this.f5982a;
    }

    public /* synthetic */ C2021h(C2020g gVar, boolean z, int i, C1486g gVar2) {
        if ((i & 2) != 0) {
            z = false;
        }
        this(gVar, z);
    }

    /* renamed from: b */
    public final boolean mo7901b() {
        return this.f5983b;
    }
}
