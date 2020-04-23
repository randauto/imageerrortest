package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p106b;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1861l;

/* renamed from: b.h.b.a.b.d.a.c.b.a */
/* compiled from: JavaTypeResolver.kt */
public final class C1942a {

    /* renamed from: a */
    private final C1861l f5876a;

    /* renamed from: b */
    private final C1943b f5877b;

    /* renamed from: c */
    private final boolean f5878c;

    /* renamed from: d */
    private final C1700ar f5879d;

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C1942a m8976a(C1942a aVar, C1861l lVar, C1943b bVar, boolean z, C1700ar arVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = aVar.f5876a;
        }
        if ((i & 2) != 0) {
            bVar = aVar.f5877b;
        }
        if ((i & 4) != 0) {
            z = aVar.f5878c;
        }
        if ((i & 8) != 0) {
            arVar = aVar.f5879d;
        }
        return aVar.mo7764a(lVar, bVar, z, arVar);
    }

    /* renamed from: a */
    public final C1942a mo7764a(C1861l lVar, C1943b bVar, boolean z, C1700ar arVar) {
        C1489j.m6972b(lVar, "howThisTypeIsUsed");
        C1489j.m6972b(bVar, "flexibility");
        return new C1942a(lVar, bVar, z, arVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1942a) {
                C1942a aVar = (C1942a) obj;
                if (C1489j.m6971a((Object) this.f5876a, (Object) aVar.f5876a) && C1489j.m6971a((Object) this.f5877b, (Object) aVar.f5877b)) {
                    if (!(this.f5878c == aVar.f5878c) || !C1489j.m6971a((Object) this.f5879d, (Object) aVar.f5879d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C1861l lVar = this.f5876a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        C1943b bVar = this.f5877b;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean z = this.f5878c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        C1700ar arVar = this.f5879d;
        if (arVar != null) {
            i = arVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JavaTypeAttributes(howThisTypeIsUsed=");
        sb.append(this.f5876a);
        sb.append(", flexibility=");
        sb.append(this.f5877b);
        sb.append(", isForAnnotationParameter=");
        sb.append(this.f5878c);
        sb.append(", upperBoundOfTypeParameter=");
        sb.append(this.f5879d);
        sb.append(")");
        return sb.toString();
    }

    public C1942a(C1861l lVar, C1943b bVar, boolean z, C1700ar arVar) {
        C1489j.m6972b(lVar, "howThisTypeIsUsed");
        C1489j.m6972b(bVar, "flexibility");
        this.f5876a = lVar;
        this.f5877b = bVar;
        this.f5878c = z;
        this.f5879d = arVar;
    }

    /* renamed from: a */
    public final C1861l mo7763a() {
        return this.f5876a;
    }

    public /* synthetic */ C1942a(C1861l lVar, C1943b bVar, boolean z, C1700ar arVar, int i, C1486g gVar) {
        if ((i & 2) != 0) {
            bVar = C1943b.INFLEXIBLE;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            arVar = null;
        }
        this(lVar, bVar, z, arVar);
    }

    /* renamed from: b */
    public final C1943b mo7766b() {
        return this.f5877b;
    }

    /* renamed from: c */
    public final boolean mo7767c() {
        return this.f5878c;
    }

    /* renamed from: d */
    public final C1700ar mo7768d() {
        return this.f5879d;
    }

    /* renamed from: a */
    public final C1942a mo7765a(C1943b bVar) {
        C1489j.m6972b(bVar, "flexibility");
        return m8976a(this, null, bVar, false, null, 13, null);
    }
}
