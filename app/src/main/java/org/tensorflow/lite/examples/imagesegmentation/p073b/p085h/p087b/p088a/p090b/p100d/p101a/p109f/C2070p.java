package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.d.a.f.p */
/* compiled from: signatureEnhancement.kt */
final class C2070p {

    /* renamed from: a */
    private final C2841w f6302a;

    /* renamed from: b */
    private final C2016d f6303b;

    /* renamed from: b */
    public final C2841w mo7961b() {
        return this.f6302a;
    }

    /* renamed from: c */
    public final C2016d mo7962c() {
        return this.f6303b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f6303b, (java.lang.Object) r3.f6303b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2070p
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.d.a.f.p r3 = (p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2070p) r3
            b.h.b.a.b.l.w r0 = r2.f6302a
            b.h.b.a.b.l.w r1 = r3.f6302a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.d.a.f.d r0 = r2.f6303b
            b.h.b.a.b.d.a.f.d r3 = r3.f6303b
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
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2070p.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2841w wVar = this.f6302a;
        int i = 0;
        int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        C2016d dVar = this.f6303b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TypeAndDefaultQualifiers(type=");
        sb.append(this.f6302a);
        sb.append(", defaultQualifiers=");
        sb.append(this.f6303b);
        sb.append(")");
        return sb.toString();
    }

    public C2070p(C2841w wVar, C2016d dVar) {
        C1489j.m6972b(wVar, "type");
        this.f6302a = wVar;
        this.f6303b = dVar;
    }

    /* renamed from: a */
    public final C2841w mo7960a() {
        return this.f6302a;
    }
}
