package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.l.ba */
/* compiled from: Variance.kt */
public enum C2792ba {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: e */
    private final String f8058e;

    /* renamed from: f */
    private final boolean f8059f;

    /* renamed from: g */
    private final boolean f8060g;

    /* renamed from: h */
    private final int f8061h;

    protected C2792ba(String str, boolean z, boolean z2, int i) {
        C1489j.m6972b(str, "label");
        this.f8058e = str;
        this.f8059f = z;
        this.f8060g = z2;
        this.f8061h = i;
    }

    /* renamed from: a */
    public final String mo9897a() {
        return this.f8058e;
    }

    /* renamed from: b */
    public final boolean mo9898b() {
        return this.f8060g;
    }

    public String toString() {
        return this.f8058e;
    }
}
