package p073b.p085h.p087b.p088a.p090b.p091a;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.a.l */
/* compiled from: UnsignedType.kt */
public enum C1646l {
    UBYTE(r3),
    USHORT(r3),
    UINT(r3),
    ULONG(r3);
    

    /* renamed from: f */
    private final C2360f f5216f;

    /* renamed from: g */
    private final C2360f f5217g;

    /* renamed from: h */
    private final C2354a f5218h;

    /* renamed from: i */
    private final C2354a f5219i;

    protected C1646l(C2354a aVar) {
        C1489j.m6972b(aVar, "classId");
        this.f5219i = aVar;
        this.f5216f = this.f5219i.mo9003c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5216f.mo9039a());
        sb.append("Array");
        this.f5217g = C2360f.m11701a(sb.toString());
        this.f5218h = new C2354a(this.f5219i.mo9001a(), this.f5217g);
    }

    /* renamed from: c */
    public final C2354a mo7228c() {
        return this.f5219i;
    }

    /* renamed from: a */
    public final C2360f mo7226a() {
        return this.f5216f;
    }

    /* renamed from: b */
    public final C2354a mo7227b() {
        return this.f5218h;
    }
}
