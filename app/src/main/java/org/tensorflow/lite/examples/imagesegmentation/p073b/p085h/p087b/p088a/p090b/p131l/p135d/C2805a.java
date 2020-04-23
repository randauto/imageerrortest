package p073b.p085h.p087b.p088a.p090b.p131l.p135d;

/* renamed from: b.h.b.a.b.l.d.a */
/* compiled from: CapturedTypeApproximation.kt */
public final class C2805a<T> {

    /* renamed from: a */
    private final T f8073a;

    /* renamed from: b */
    private final T f8074b;

    /* renamed from: c */
    public final T mo9917c() {
        return this.f8073a;
    }

    /* renamed from: d */
    public final T mo9918d() {
        return this.f8074b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f8074b, (java.lang.Object) r3.f8074b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p131l.p135d.C2805a
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.l.d.a r3 = (p073b.p085h.p087b.p088a.p090b.p131l.p135d.C2805a) r3
            T r0 = r2.f8073a
            T r1 = r3.f8073a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            T r0 = r2.f8074b
            T r3 = r3.f8074b
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
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p131l.p135d.C2805a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        T t = this.f8073a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.f8074b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApproximationBounds(lower=");
        sb.append(this.f8073a);
        sb.append(", upper=");
        sb.append(this.f8074b);
        sb.append(")");
        return sb.toString();
    }

    public C2805a(T t, T t2) {
        this.f8073a = t;
        this.f8074b = t2;
    }

    /* renamed from: a */
    public final T mo9915a() {
        return this.f8073a;
    }

    /* renamed from: b */
    public final T mo9916b() {
        return this.f8074b;
    }
}
