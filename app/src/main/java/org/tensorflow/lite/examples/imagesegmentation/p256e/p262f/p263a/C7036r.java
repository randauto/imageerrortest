package p256e.p262f.p263a;

import p256e.p262f.p263a.C7032q.C7033a;
import p256e.p262f.p263a.C7032q.C7034b;
import p256e.p262f.p263a.C7032q.C7035c;

/* renamed from: e.f.a.r */
/* compiled from: PriorityQHeap */
class C7036r extends C7032q {

    /* renamed from: h */
    static final /* synthetic */ boolean f24985h = (!C7036r.class.desiredAssertionStatus());

    /* renamed from: a */
    C7035c[] f24986a = new C7035c[33];

    /* renamed from: b */
    C7034b[] f24987b;

    /* renamed from: c */
    int f24988c = 0;

    /* renamed from: d */
    int f24989d = 32;

    /* renamed from: e */
    int f24990e;

    /* renamed from: f */
    boolean f24991f;

    /* renamed from: g */
    C7033a f24992g;

    public C7036r(C7033a aVar) {
        for (int i = 0; i < this.f24986a.length; i++) {
            this.f24986a[i] = new C7035c();
        }
        this.f24987b = new C7034b[33];
        for (int i2 = 0; i2 < this.f24987b.length; i2++) {
            this.f24987b[i2] = new C7034b();
        }
        this.f24991f = false;
        this.f24990e = 0;
        this.f24992g = aVar;
        this.f24986a[1].f24984a = 1;
        this.f24987b[1].f24982a = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22160a() {
        this.f24987b = null;
        this.f24986a = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22166b(int i) {
        C7035c[] cVarArr = this.f24986a;
        C7034b[] bVarArr = this.f24987b;
        int i2 = cVarArr[i].f24984a;
        while (true) {
            int i3 = i << 1;
            if (i3 < this.f24988c) {
                int i4 = i3 + 1;
                if (m36950a(this.f24992g, bVarArr[cVarArr[i4].f24984a].f24982a, bVarArr[cVarArr[i3].f24984a].f24982a)) {
                    i3 = i4;
                }
            }
            if (f24985h || i3 <= this.f24989d) {
                int i5 = cVarArr[i3].f24984a;
                if (i3 > this.f24988c || m36950a(this.f24992g, bVarArr[i2].f24982a, bVarArr[i5].f24982a)) {
                    cVarArr[i].f24984a = i2;
                    bVarArr[i2].f24983b = i;
                } else {
                    cVarArr[i].f24984a = i5;
                    bVarArr[i5].f24983b = i;
                    i = i3;
                }
            } else {
                throw new AssertionError();
            }
        }
        cVarArr[i].f24984a = i2;
        bVarArr[i2].f24983b = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo22167c(int i) {
        C7035c[] cVarArr = this.f24986a;
        C7034b[] bVarArr = this.f24987b;
        int i2 = cVarArr[i].f24984a;
        while (true) {
            int i3 = i >> 1;
            int i4 = cVarArr[i3].f24984a;
            if (i3 == 0 || m36950a(this.f24992g, bVarArr[i4].f24982a, bVarArr[i2].f24982a)) {
                cVarArr[i].f24984a = i2;
                bVarArr[i2].f24983b = i;
            } else {
                cVarArr[i].f24984a = i4;
                bVarArr[i4].f24983b = i;
                i = i3;
            }
        }
        cVarArr[i].f24984a = i2;
        bVarArr[i2].f24983b = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo22162b() {
        for (int i = this.f24988c; i >= 1; i--) {
            mo22166b(i);
        }
        this.f24991f = true;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo22159a(Object obj) {
        int i;
        int i2 = this.f24988c + 1;
        this.f24988c = i2;
        if (i2 * 2 > this.f24989d) {
            C7035c[] cVarArr = this.f24986a;
            C7034b[] bVarArr = this.f24987b;
            this.f24989d <<= 1;
            C7035c[] cVarArr2 = new C7035c[(this.f24989d + 1)];
            System.arraycopy(this.f24986a, 0, cVarArr2, 0, this.f24986a.length);
            for (int length = this.f24986a.length; length < cVarArr2.length; length++) {
                cVarArr2[length] = new C7035c();
            }
            this.f24986a = cVarArr2;
            if (this.f24986a == null) {
                this.f24986a = cVarArr;
                return Integer.MAX_VALUE;
            }
            C7034b[] bVarArr2 = new C7034b[(this.f24989d + 1)];
            System.arraycopy(this.f24987b, 0, bVarArr2, 0, this.f24987b.length);
            for (int length2 = this.f24987b.length; length2 < bVarArr2.length; length2++) {
                bVarArr2[length2] = new C7034b();
            }
            this.f24987b = bVarArr2;
            if (this.f24987b == null) {
                this.f24987b = bVarArr;
                return Integer.MAX_VALUE;
            }
        }
        if (this.f24990e == 0) {
            i = i2;
        } else {
            i = this.f24990e;
            this.f24990e = this.f24987b[i].f24983b;
        }
        this.f24986a[i2].f24984a = i;
        this.f24987b[i].f24983b = i2;
        this.f24987b[i].f24982a = obj;
        if (this.f24991f) {
            mo22167c(i2);
        }
        if (f24985h || i != Integer.MAX_VALUE) {
            return i;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Object mo22163c() {
        C7035c[] cVarArr = this.f24986a;
        C7034b[] bVarArr = this.f24987b;
        int i = cVarArr[1].f24984a;
        Object obj = bVarArr[i].f24982a;
        if (this.f24988c > 0) {
            cVarArr[1].f24984a = cVarArr[this.f24988c].f24984a;
            bVarArr[cVarArr[1].f24984a].f24983b = 1;
            bVarArr[i].f24982a = null;
            bVarArr[i].f24983b = this.f24990e;
            this.f24990e = i;
            int i2 = this.f24988c - 1;
            this.f24988c = i2;
            if (i2 > 0) {
                mo22166b(1);
            }
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22161a(int i) {
        C7035c[] cVarArr = this.f24986a;
        C7034b[] bVarArr = this.f24987b;
        if (f24985h || (i >= 1 && i <= this.f24989d && bVarArr[i].f24982a != null)) {
            int i2 = bVarArr[i].f24983b;
            cVarArr[i2].f24984a = cVarArr[this.f24988c].f24984a;
            bVarArr[cVarArr[i2].f24984a].f24983b = i2;
            int i3 = this.f24988c - 1;
            this.f24988c = i3;
            if (i2 <= i3) {
                if (i2 <= 1 || m36950a(this.f24992g, bVarArr[cVarArr[i2 >> 1].f24984a].f24982a, bVarArr[cVarArr[i2].f24984a].f24982a)) {
                    mo22166b(i2);
                } else {
                    mo22167c(i2);
                }
            }
            bVarArr[i].f24982a = null;
            bVarArr[i].f24983b = this.f24990e;
            this.f24990e = i;
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Object mo22164d() {
        return this.f24987b[this.f24986a[1].f24984a].f24982a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo22165e() {
        return this.f24988c == 0;
    }
}
