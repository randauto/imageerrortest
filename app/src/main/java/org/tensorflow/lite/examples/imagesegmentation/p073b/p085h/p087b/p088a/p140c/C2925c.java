package p073b.p085h.p087b.p088a.p140c;

/* renamed from: b.h.b.a.c.c */
/* compiled from: IntTree */
final class C2925c<V> {

    /* renamed from: a */
    static final C2925c<Object> f8266a = new C2925c<>();

    /* renamed from: b */
    private final long f8267b;

    /* renamed from: c */
    private final V f8268c;

    /* renamed from: d */
    private final C2925c<V> f8269d;

    /* renamed from: e */
    private final C2925c<V> f8270e;

    /* renamed from: f */
    private final int f8271f;

    private C2925c() {
        this.f8271f = 0;
        this.f8267b = 0;
        this.f8268c = null;
        this.f8269d = null;
        this.f8270e = null;
    }

    private C2925c(long j, V v, C2925c<V> cVar, C2925c<V> cVar2) {
        this.f8267b = j;
        this.f8268c = v;
        this.f8269d = cVar;
        this.f8270e = cVar2;
        this.f8271f = cVar.f8271f + 1 + cVar2.f8271f;
    }

    /* renamed from: b */
    private C2925c<V> m14042b(long j) {
        if (this.f8271f == 0 || j == this.f8267b) {
            return this;
        }
        C2925c cVar = new C2925c(j, this.f8268c, this.f8269d, this.f8270e);
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public V mo10054a(long j) {
        if (this.f8271f == 0) {
            return null;
        }
        if (j < this.f8267b) {
            return this.f8269d.mo10054a(j - this.f8267b);
        }
        if (j > this.f8267b) {
            return this.f8270e.mo10054a(j - this.f8267b);
        }
        return this.f8268c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2925c<V> mo10053a(long j, V v) {
        if (this.f8271f == 0) {
            C2925c cVar = new C2925c(j, v, this, this);
            return cVar;
        } else if (j < this.f8267b) {
            return m14041a(this.f8269d.mo10053a(j - this.f8267b, v), this.f8270e);
        } else {
            if (j > this.f8267b) {
                return m14041a(this.f8269d, this.f8270e.mo10053a(j - this.f8267b, v));
            }
            if (v == this.f8268c) {
                return this;
            }
            C2925c cVar2 = new C2925c(j, v, this.f8269d, this.f8270e);
            return cVar2;
        }
    }

    /* renamed from: a */
    private C2925c<V> m14041a(C2925c<V> cVar, C2925c<V> cVar2) {
        if (cVar == this.f8269d && cVar2 == this.f8270e) {
            return this;
        }
        return m14040a(this.f8267b, this.f8268c, cVar, cVar2);
    }

    /* renamed from: a */
    private static <V> C2925c<V> m14040a(long j, V v, C2925c<V> cVar, C2925c<V> cVar2) {
        C2925c<V> cVar3 = cVar;
        C2925c<V> cVar4 = cVar2;
        if (cVar3.f8271f + cVar4.f8271f > 1) {
            if (cVar3.f8271f >= cVar4.f8271f * 5) {
                C2925c<V> cVar5 = cVar3.f8269d;
                C2925c<V> cVar6 = cVar3.f8270e;
                if (cVar6.f8271f < cVar5.f8271f * 2) {
                    long j2 = cVar3.f8267b + j;
                    V v2 = cVar3.f8268c;
                    C2925c cVar7 = new C2925c(-cVar3.f8267b, v, cVar6.m14042b(cVar6.f8267b + cVar3.f8267b), cVar2);
                    C2925c cVar8 = new C2925c(j2, v2, cVar5, cVar7);
                    return cVar8;
                }
                C2925c<V> cVar9 = cVar6.f8269d;
                C2925c<V> cVar10 = cVar6.f8270e;
                long j3 = cVar6.f8267b + cVar3.f8267b + j;
                V v3 = cVar6.f8268c;
                C2925c cVar11 = new C2925c(-cVar6.f8267b, cVar3.f8268c, cVar5, cVar9.m14042b(cVar9.f8267b + cVar6.f8267b));
                C2925c cVar12 = new C2925c((-cVar3.f8267b) - cVar6.f8267b, v, cVar10.m14042b(cVar10.f8267b + cVar6.f8267b + cVar3.f8267b), cVar2);
                C2925c cVar13 = new C2925c(j3, v3, cVar11, cVar12);
                return cVar13;
            } else if (cVar4.f8271f >= cVar3.f8271f * 5) {
                C2925c<V> cVar14 = cVar4.f8269d;
                C2925c<V> cVar15 = cVar4.f8270e;
                if (cVar14.f8271f < cVar15.f8271f * 2) {
                    long j4 = cVar4.f8267b + j;
                    V v4 = cVar4.f8268c;
                    C2925c cVar16 = new C2925c(-cVar4.f8267b, v, cVar, cVar14.m14042b(cVar14.f8267b + cVar4.f8267b));
                    C2925c cVar17 = new C2925c(j4, v4, cVar16, cVar15);
                    return cVar17;
                }
                C2925c<V> cVar18 = cVar14.f8269d;
                C2925c<V> cVar19 = cVar14.f8270e;
                long j5 = cVar14.f8267b + cVar4.f8267b + j;
                V v5 = cVar14.f8268c;
                long j6 = j5;
                C2925c cVar20 = new C2925c((-cVar4.f8267b) - cVar14.f8267b, v, cVar, cVar18.m14042b(cVar18.f8267b + cVar14.f8267b + cVar4.f8267b));
                C2925c cVar21 = new C2925c(-cVar14.f8267b, cVar4.f8268c, cVar19.m14042b(cVar19.f8267b + cVar14.f8267b), cVar15);
                C2925c cVar22 = new C2925c(j6, v5, cVar20, cVar21);
                return cVar22;
            }
        }
        C2925c cVar23 = new C2925c(j, v, cVar, cVar2);
        return cVar23;
    }
}
