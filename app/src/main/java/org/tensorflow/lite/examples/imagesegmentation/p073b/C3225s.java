package p073b;

import java.io.Serializable;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001c"}, mo10386c = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"})
/* renamed from: b.s */
/* compiled from: Tuples.kt */
public final class C3225s<A, B, C> implements Serializable {

    /* renamed from: a */
    private final A f8641a;

    /* renamed from: b */
    private final B f8642b;

    /* renamed from: c */
    private final C f8643c;

    /* renamed from: b */
    public final A mo10399b() {
        return this.f8641a;
    }

    /* renamed from: c */
    public final B mo10400c() {
        return this.f8642b;
    }

    /* renamed from: d */
    public final C mo10401d() {
        return this.f8643c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f8643c, (java.lang.Object) r3.f8643c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p073b.C3225s
            if (r0 == 0) goto L_0x0027
            b.s r3 = (p073b.C3225s) r3
            A r0 = r2.f8641a
            A r1 = r3.f8641a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x0027
            B r0 = r2.f8642b
            B r1 = r3.f8642b
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x0027
            C r0 = r2.f8643c
            C r3 = r3.f8643c
            boolean r3 = p073b.p079e.p081b.C1489j.m6971a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.C3225s.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        A a = this.f8641a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f8642b;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f8643c;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public C3225s(A a, B b, C c) {
        this.f8641a = a;
        this.f8642b = b;
        this.f8643c = c;
    }

    /* renamed from: a */
    public final C mo10398a() {
        return this.f8643c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f8641a);
        sb.append(", ");
        sb.append(this.f8642b);
        sb.append(", ");
        sb.append(this.f8643c);
        sb.append(')');
        return sb.toString();
    }
}
