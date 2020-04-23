package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.b.a.g */
/* compiled from: AnnotationWithTarget.kt */
public final class C1658g {

    /* renamed from: a */
    private final C1651c f5245a;

    /* renamed from: b */
    private final C1654e f5246b;

    /* renamed from: c */
    public final C1651c mo7249c() {
        return this.f5245a;
    }

    /* renamed from: d */
    public final C1654e mo7250d() {
        return this.f5246b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f5246b, (java.lang.Object) r3.f5246b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1658g
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.b.a.g r3 = (p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1658g) r3
            b.h.b.a.b.b.a.c r0 = r2.f5245a
            b.h.b.a.b.b.a.c r1 = r3.f5245a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.b.a.e r0 = r2.f5246b
            b.h.b.a.b.b.a.e r3 = r3.f5246b
            boolean r3 = p073b.p079e.p081b.C1489j.m6971a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1658g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C1651c cVar = this.f5245a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C1654e eVar = this.f5246b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnnotationWithTarget(annotation=");
        sb.append(this.f5245a);
        sb.append(", target=");
        sb.append(this.f5246b);
        sb.append(")");
        return sb.toString();
    }

    public C1658g(C1651c cVar, C1654e eVar) {
        C1489j.m6972b(cVar, "annotation");
        this.f5245a = cVar;
        this.f5246b = eVar;
    }

    /* renamed from: a */
    public final C1651c mo7247a() {
        return this.f5245a;
    }

    /* renamed from: b */
    public final C1654e mo7248b() {
        return this.f5246b;
    }
}
