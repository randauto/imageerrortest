package p073b.p085h;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo10386c = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"})
/* renamed from: b.h.q */
/* compiled from: KType.kt */
public final class C3145q {

    /* renamed from: a */
    public static final C3146a f8540a = new C3146a(null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C3145q f8541d = new C3145q(null, null);

    /* renamed from: b */
    private final C3147r f8542b;

    /* renamed from: c */
    private final C3143o f8543c;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "()V", "STAR", "Lkotlin/reflect/KTypeProjection;", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", "contravariant", "type", "Lkotlin/reflect/KType;", "covariant", "invariant", "kotlin-stdlib"})
    /* renamed from: b.h.q$a */
    /* compiled from: KType.kt */
    public static final class C3146a {
        private C3146a() {
        }

        public /* synthetic */ C3146a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C3145q mo10329a() {
            return C3145q.f8541d;
        }

        /* renamed from: a */
        public final C3145q mo10330a(C3143o oVar) {
            C1489j.m6972b(oVar, "type");
            return new C3145q(C3147r.INVARIANT, oVar);
        }

        /* renamed from: b */
        public final C3145q mo10331b(C3143o oVar) {
            C1489j.m6972b(oVar, "type");
            return new C3145q(C3147r.IN, oVar);
        }

        /* renamed from: c */
        public final C3145q mo10332c(C3143o oVar) {
            C1489j.m6972b(oVar, "type");
            return new C3145q(C3147r.OUT, oVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f8543c, (java.lang.Object) r3.f8543c) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.p085h.C3145q
            if (r0 == 0) goto L_0x001d
            b.h.q r3 = (p073b.p085h.C3145q) r3
            b.h.r r0 = r2.f8542b
            b.h.r r1 = r3.f8542b
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            b.h.o r0 = r2.f8543c
            b.h.o r3 = r3.f8543c
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
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.C3145q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3147r rVar = this.f8542b;
        int i = 0;
        int hashCode = (rVar != null ? rVar.hashCode() : 0) * 31;
        C3143o oVar = this.f8543c;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KTypeProjection(variance=");
        sb.append(this.f8542b);
        sb.append(", type=");
        sb.append(this.f8543c);
        sb.append(")");
        return sb.toString();
    }

    public C3145q(C3147r rVar, C3143o oVar) {
        this.f8542b = rVar;
        this.f8543c = oVar;
    }
}
