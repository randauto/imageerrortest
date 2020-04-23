package p073b.p085h.p087b.p088a.p090b.p094b;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.p126a.C2543e;

/* renamed from: b.h.b.a.b.b.az */
/* compiled from: Visibility.kt */
public abstract class C1723az {

    /* renamed from: a */
    private final String f5352a;

    /* renamed from: b */
    private final boolean f5353b;

    /* renamed from: a */
    public abstract boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar);

    /* renamed from: b */
    public C1723az mo7338b() {
        return this;
    }

    protected C1723az(String str, boolean z) {
        C1489j.m6972b(str, "name");
        this.f5352a = str;
        this.f5353b = z;
    }

    /* renamed from: c */
    public final boolean mo7339c() {
        return this.f5353b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Integer mo7337a(C1723az azVar) {
        C1489j.m6972b(azVar, "visibility");
        return C1710ay.m7691a(this, azVar);
    }

    /* renamed from: a */
    public String mo7336a() {
        return this.f5352a;
    }

    public final String toString() {
        return mo7336a();
    }
}
