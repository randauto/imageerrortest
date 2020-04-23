package p073b;

import java.io.Serializable;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, mo10386c = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
/* renamed from: b.p */
/* compiled from: Tuples.kt */
public final class C3221p<A, B> implements Serializable {

    /* renamed from: a */
    private final A f8631a;

    /* renamed from: b */
    private final B f8632b;

    /* renamed from: c */
    public final A mo10389c() {
        return this.f8631a;
    }

    /* renamed from: d */
    public final B mo10390d() {
        return this.f8632b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f8632b, (java.lang.Object) r3.f8632b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.C3221p
            if (r0 == 0) goto L_0x001d
            b.p r3 = (p073b.C3221p) r3
            A r0 = r2.f8631a
            A r1 = r3.f8631a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            B r0 = r2.f8632b
            B r3 = r3.f8632b
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
        throw new UnsupportedOperationException("Method not decompiled: p073b.C3221p.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        A a = this.f8631a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f8632b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public C3221p(A a, B b) {
        this.f8631a = a;
        this.f8632b = b;
    }

    /* renamed from: a */
    public final A mo10387a() {
        return this.f8631a;
    }

    /* renamed from: b */
    public final B mo10388b() {
        return this.f8632b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f8631a);
        sb.append(", ");
        sb.append(this.f8632b);
        sb.append(')');
        return sb.toString();
    }
}
