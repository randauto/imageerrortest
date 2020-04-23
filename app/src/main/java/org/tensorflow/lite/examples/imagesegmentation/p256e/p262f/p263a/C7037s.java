package p256e.p262f.p263a;

import p256e.p262f.p263a.C7032q.C7033a;

/* renamed from: e.f.a.s */
/* compiled from: PriorityQSort */
class C7037s extends C7032q {

    /* renamed from: h */
    static final /* synthetic */ boolean f24993h = (!C7037s.class.desiredAssertionStatus());

    /* renamed from: a */
    C7036r f24994a;

    /* renamed from: b */
    Object[] f24995b = new Object[32];

    /* renamed from: c */
    int[] f24996c;

    /* renamed from: d */
    int f24997d = 0;

    /* renamed from: e */
    int f24998e = 32;

    /* renamed from: f */
    boolean f24999f = false;

    /* renamed from: g */
    C7033a f25000g;

    /* renamed from: e.f.a.s$a */
    /* compiled from: PriorityQSort */
    private static class C7039a {

        /* renamed from: a */
        int f25001a;

        /* renamed from: b */
        int f25002b;

        private C7039a() {
        }
    }

    public C7037s(C7033a aVar) {
        this.f24994a = new C7036r(aVar);
        this.f25000g = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22160a() {
        if (this.f24994a != null) {
            this.f24994a.mo22160a();
        }
        this.f24996c = null;
        this.f24995b = null;
    }

    /* renamed from: b */
    private static boolean m36968b(C7033a aVar, Object obj, Object obj2) {
        return !C7032q.m36950a(aVar, obj2, obj);
    }

    /* renamed from: c */
    private static boolean m36969c(C7033a aVar, Object obj, Object obj2) {
        return !C7032q.m36950a(aVar, obj, obj2);
    }

    /* renamed from: a */
    private static void m36967a(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo22162b() {
        C7039a[] aVarArr = new C7039a[50];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr[i] = new C7039a();
        }
        int i2 = 2016473283;
        this.f24996c = new int[(this.f24997d + 1)];
        int i3 = this.f24997d - 1;
        int i4 = 0;
        for (int i5 = 0; i5 <= i3; i5++) {
            this.f24996c[i5] = i4;
            i4++;
        }
        aVarArr[0].f25001a = 0;
        aVarArr[0].f25002b = i3;
        int i6 = 1;
        while (true) {
            i6--;
            if (i6 >= 0) {
                int i7 = aVarArr[i6].f25001a;
                int i8 = aVarArr[i6].f25002b;
                while (i8 > i7 + 10) {
                    int abs = Math.abs((i2 * 1539415821) + 1);
                    int i9 = (abs % ((i8 - i7) + 1)) + i7;
                    int i10 = this.f24996c[i9];
                    this.f24996c[i9] = this.f24996c[i7];
                    this.f24996c[i7] = i10;
                    int i11 = i7 - 1;
                    int i12 = i8 + 1;
                    while (true) {
                        i11++;
                        if (!m36969c(this.f25000g, this.f24995b[this.f24996c[i11]], this.f24995b[i10])) {
                            do {
                                i12--;
                            } while (m36968b(this.f25000g, this.f24995b[this.f24996c[i12]], this.f24995b[i10]));
                            m36967a(this.f24996c, i11, i12);
                            if (i11 >= i12) {
                                break;
                            }
                        }
                    }
                    m36967a(this.f24996c, i11, i12);
                    if (i11 - i7 < i8 - i12) {
                        aVarArr[i6].f25001a = i12 + 1;
                        aVarArr[i6].f25002b = i8;
                        i6++;
                        i8 = i11 - 1;
                    } else {
                        aVarArr[i6].f25001a = i7;
                        aVarArr[i6].f25002b = i11 - 1;
                        i6++;
                        i7 = i12 + 1;
                    }
                    i2 = abs;
                }
                for (int i13 = i7 + 1; i13 <= i8; i13++) {
                    int i14 = this.f24996c[i13];
                    int i15 = i13;
                    while (i15 > i7) {
                        int i16 = i15 - 1;
                        if (!m36968b(this.f25000g, this.f24995b[this.f24996c[i16]], this.f24995b[i14])) {
                            break;
                        }
                        this.f24996c[i15] = this.f24996c[i16];
                        i15--;
                    }
                    this.f24996c[i15] = i14;
                }
            } else {
                this.f24998e = this.f24997d;
                this.f24999f = true;
                this.f24994a.mo22162b();
                return true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo22159a(Object obj) {
        if (this.f24999f) {
            return this.f24994a.mo22159a(obj);
        }
        int i = this.f24997d;
        int i2 = this.f24997d + 1;
        this.f24997d = i2;
        if (i2 >= this.f24998e) {
            Object[] objArr = this.f24995b;
            this.f24998e <<= 1;
            Object[] objArr2 = new Object[this.f24998e];
            System.arraycopy(this.f24995b, 0, objArr2, 0, this.f24995b.length);
            this.f24995b = objArr2;
            if (this.f24995b == null) {
                this.f24995b = objArr;
                return Integer.MAX_VALUE;
            }
        }
        if (f24993h || i != Integer.MAX_VALUE) {
            this.f24995b[i] = obj;
            return -(i + 1);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Object mo22163c() {
        if (this.f24997d == 0) {
            return this.f24994a.mo22163c();
        }
        Object obj = this.f24995b[this.f24996c[this.f24997d - 1]];
        if (!this.f24994a.mo22165e()) {
            if (m36950a(this.f25000g, this.f24994a.mo22164d(), obj)) {
                return this.f24994a.mo22163c();
            }
        }
        do {
            this.f24997d--;
            if (this.f24997d <= 0) {
                break;
            }
        } while (this.f24995b[this.f24996c[this.f24997d - 1]] == null);
        return obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Object mo22164d() {
        if (this.f24997d == 0) {
            return this.f24994a.mo22164d();
        }
        Object obj = this.f24995b[this.f24996c[this.f24997d - 1]];
        if (!this.f24994a.mo22165e()) {
            Object d = this.f24994a.mo22164d();
            if (C7032q.m36950a(this.f25000g, d, obj)) {
                return d;
            }
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo22165e() {
        return this.f24997d == 0 && this.f24994a.mo22165e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22161a(int i) {
        if (i >= 0) {
            this.f24994a.mo22161a(i);
            return;
        }
        int i2 = -(i + 1);
        if (f24993h || (i2 < this.f24998e && this.f24995b[i2] != null)) {
            this.f24995b[i2] = null;
            while (this.f24997d > 0 && this.f24995b[this.f24996c[this.f24997d - 1]] == null) {
                this.f24997d--;
            }
            return;
        }
        throw new AssertionError();
    }
}
