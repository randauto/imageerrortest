package p073b.p085h.p087b.p088a.p090b.p127j.p128a;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2278a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;

/* renamed from: b.h.b.a.b.j.a.o */
/* compiled from: IncompatibleVersionErrorData.kt */
public final class C2666o<T extends C2278a> {

    /* renamed from: a */
    private final T f7863a;

    /* renamed from: b */
    private final T f7864b;

    /* renamed from: c */
    private final String f7865c;

    /* renamed from: d */
    private final C2354a f7866d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f7866d, (java.lang.Object) r3.f7866d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2666o
            if (r0 == 0) goto L_0x0031
            b.h.b.a.b.j.a.o r3 = (p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2666o) r3
            T r0 = r2.f7863a
            T r1 = r3.f7863a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x0031
            T r0 = r2.f7864b
            T r1 = r3.f7864b
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f7865c
            java.lang.String r1 = r3.f7865c
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x0031
            b.h.b.a.b.f.a r0 = r2.f7866d
            b.h.b.a.b.f.a r3 = r3.f7866d
            boolean r3 = p073b.p079e.p081b.C1489j.m6971a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2666o.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        T t = this.f7863a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.f7864b;
        int hashCode2 = (hashCode + (t2 != null ? t2.hashCode() : 0)) * 31;
        String str = this.f7865c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C2354a aVar = this.f7866d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.f7863a);
        sb.append(", expectedVersion=");
        sb.append(this.f7864b);
        sb.append(", filePath=");
        sb.append(this.f7865c);
        sb.append(", classId=");
        sb.append(this.f7866d);
        sb.append(")");
        return sb.toString();
    }

    public C2666o(T t, T t2, String str, C2354a aVar) {
        C1489j.m6972b(t, "actualVersion");
        C1489j.m6972b(t2, "expectedVersion");
        C1489j.m6972b(str, "filePath");
        C1489j.m6972b(aVar, "classId");
        this.f7863a = t;
        this.f7864b = t2;
        this.f7865c = str;
        this.f7866d = aVar;
    }
}
