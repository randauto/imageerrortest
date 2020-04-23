package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f;

import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;

/* renamed from: b.h.b.a.b.d.a.f.c */
/* compiled from: typeEnhancement.kt */
final class C2015c<T> {

    /* renamed from: a */
    private final T f5966a;

    /* renamed from: b */
    private final C1659h f5967b;

    /* renamed from: a */
    public final T mo7882a() {
        return this.f5966a;
    }

    /* renamed from: b */
    public final C1659h mo7883b() {
        return this.f5967b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f5967b, (java.lang.Object) r3.f5967b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2015c
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.d.a.f.c r3 = (p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2015c) r3
            T r0 = r2.f5966a
            T r1 = r3.f5966a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.b.a.h r0 = r2.f5967b
            b.h.b.a.b.b.a.h r3 = r3.f5967b
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
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2015c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        T t = this.f5966a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        C1659h hVar = this.f5967b;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EnhancementResult(result=");
        sb.append(this.f5966a);
        sb.append(", enhancementAnnotations=");
        sb.append(this.f5967b);
        sb.append(")");
        return sb.toString();
    }

    public C2015c(T t, C1659h hVar) {
        this.f5966a = t;
        this.f5967b = hVar;
    }
}
