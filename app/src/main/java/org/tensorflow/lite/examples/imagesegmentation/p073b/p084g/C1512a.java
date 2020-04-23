package p073b.p084g;

import p073b.C3218m;
import p073b.p074a.C1388ac;
import p073b.p076c.C1443c;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo10386c = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"})
/* renamed from: b.g.a */
/* compiled from: Progressions.kt */
public class C1512a implements C1474a, Iterable<Integer> {

    /* renamed from: a */
    public static final C1513a f4875a = new C1513a(null);

    /* renamed from: b */
    private final int f4876b;

    /* renamed from: c */
    private final int f4877c;

    /* renamed from: d */
    private final int f4878d;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, mo10386c = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"})
    /* renamed from: b.g.a$a */
    /* compiled from: Progressions.kt */
    public static final class C1513a {
        private C1513a() {
        }

        public /* synthetic */ C1513a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1512a mo6982a(int i, int i2, int i3) {
            return new C1512a(i, i2, i3);
        }
    }

    public C1512a(int i, int i2, int i3) {
        if (i3 != 0) {
            this.f4876b = i;
            this.f4877c = C1443c.m6928a(i, i2, i3);
            this.f4878d = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero");
    }

    /* renamed from: a */
    public final int mo6973a() {
        return this.f4876b;
    }

    /* renamed from: b */
    public final int mo6974b() {
        return this.f4877c;
    }

    /* renamed from: c */
    public final int mo6975c() {
        return this.f4878d;
    }

    /* renamed from: d */
    public C1388ac iterator() {
        return new C1514b(this.f4876b, this.f4877c, this.f4878d);
    }

    /* renamed from: e */
    public boolean mo6977e() {
        if (this.f4878d > 0) {
            if (this.f4876b <= this.f4877c) {
                return false;
            }
        } else if (this.f4876b >= this.f4877c) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f4878d == r3.f4878d) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p073b.p084g.C1512a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.mo6977e()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            b.g.a r0 = (p073b.p084g.C1512a) r0
            boolean r0 = r0.mo6977e()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            int r0 = r2.f4876b
            b.g.a r3 = (p073b.p084g.C1512a) r3
            int r1 = r3.f4876b
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f4877c
            int r1 = r3.f4877c
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f4878d
            int r3 = r3.f4878d
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p084g.C1512a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (mo6977e()) {
            return -1;
        }
        return (((this.f4876b * 31) + this.f4877c) * 31) + this.f4878d;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f4878d > 0) {
            sb = new StringBuilder();
            sb.append(this.f4876b);
            sb.append("..");
            sb.append(this.f4877c);
            sb.append(" step ");
            i = this.f4878d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f4876b);
            sb.append(" downTo ");
            sb.append(this.f4877c);
            sb.append(" step ");
            i = -this.f4878d;
        }
        sb.append(i);
        return sb.toString();
    }
}
