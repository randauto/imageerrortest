package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.d.a.q */
/* compiled from: specialBuiltinMembers.kt */
final class C2090q {

    /* renamed from: a */
    private final C2360f f6349a;

    /* renamed from: b */
    private final String f6350b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f6350b, (java.lang.Object) r3.f6350b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2090q
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.d.a.q r3 = (p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2090q) r3
            b.h.b.a.b.f.f r0 = r2.f6349a
            b.h.b.a.b.f.f r1 = r3.f6349a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f6350b
            java.lang.String r3 = r3.f6350b
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
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2090q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2360f fVar = this.f6349a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        String str = this.f6350b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NameAndSignature(name=");
        sb.append(this.f6349a);
        sb.append(", signature=");
        sb.append(this.f6350b);
        sb.append(")");
        return sb.toString();
    }

    public C2090q(C2360f fVar, String str) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(str, "signature");
        this.f6349a = fVar;
        this.f6350b = str;
    }

    /* renamed from: a */
    public final C2360f mo7972a() {
        return this.f6349a;
    }

    /* renamed from: b */
    public final String mo7973b() {
        return this.f6350b;
    }
}
