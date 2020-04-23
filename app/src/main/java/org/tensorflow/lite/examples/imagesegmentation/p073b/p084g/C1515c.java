package p073b.p084g;

import p073b.C3218m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, mo10386c = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"})
/* renamed from: b.g.c */
/* compiled from: Ranges.kt */
public final class C1515c extends C1512a {

    /* renamed from: b */
    public static final C1516a f4883b = new C1516a(null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C1515c f4884c = new C1515c(1, 0);

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo10386c = {"Lkotlin/ranges/IntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"})
    /* renamed from: b.g.c$a */
    /* compiled from: Ranges.kt */
    public static final class C1516a {
        private C1516a() {
        }

        public /* synthetic */ C1516a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1515c mo6986a() {
            return C1515c.f4884c;
        }
    }

    public C1515c(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: f */
    public Integer mo6984f() {
        return Integer.valueOf(mo6973a());
    }

    /* renamed from: g */
    public Integer mo6985g() {
        return Integer.valueOf(mo6974b());
    }

    /* renamed from: e */
    public boolean mo6977e() {
        return mo6973a() > mo6974b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (mo6974b() == r3.mo6974b()) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p073b.p084g.C1515c
            if (r0 == 0) goto L_0x002b
            boolean r0 = r2.mo6977e()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            b.g.c r0 = (p073b.p084g.C1515c) r0
            boolean r0 = r0.mo6977e()
            if (r0 != 0) goto L_0x0029
        L_0x0013:
            int r0 = r2.mo6973a()
            b.g.c r3 = (p073b.p084g.C1515c) r3
            int r1 = r3.mo6973a()
            if (r0 != r1) goto L_0x002b
            int r0 = r2.mo6974b()
            int r3 = r3.mo6974b()
            if (r0 != r3) goto L_0x002b
        L_0x0029:
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p084g.C1515c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (mo6977e()) {
            return -1;
        }
        return (mo6973a() * 31) + mo6974b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo6973a());
        sb.append("..");
        sb.append(mo6974b());
        return sb.toString();
    }
}
