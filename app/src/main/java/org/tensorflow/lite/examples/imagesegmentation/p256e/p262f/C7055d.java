package p256e.p262f;

import p256e.p259c.C6994f;

/* renamed from: e.f.d */
/* compiled from: LineStroker */
public class C7055d {

    /* renamed from: A */
    private int f25052A;

    /* renamed from: B */
    private int f25053B;

    /* renamed from: C */
    private int f25054C;

    /* renamed from: D */
    private int f25055D;

    /* renamed from: E */
    private int f25056E;

    /* renamed from: F */
    private int f25057F;

    /* renamed from: G */
    private int f25058G;

    /* renamed from: H */
    private int f25059H;

    /* renamed from: I */
    private int f25060I;

    /* renamed from: J */
    private int f25061J;

    /* renamed from: K */
    private int f25062K;

    /* renamed from: L */
    private int f25063L;

    /* renamed from: M */
    private int f25064M;

    /* renamed from: N */
    private double f25065N;

    /* renamed from: O */
    private double f25066O;

    /* renamed from: P */
    private double f25067P;

    /* renamed from: a */
    private C7055d f25068a;

    /* renamed from: b */
    boolean f25069b = false;

    /* renamed from: c */
    private int f25070c;

    /* renamed from: d */
    private int f25071d;

    /* renamed from: e */
    private int f25072e;

    /* renamed from: f */
    private int f25073f;

    /* renamed from: g */
    private int f25074g;

    /* renamed from: h */
    private int f25075h;

    /* renamed from: i */
    private int f25076i;

    /* renamed from: j */
    private long f25077j;

    /* renamed from: k */
    private int f25078k;

    /* renamed from: l */
    private int[] f25079l;

    /* renamed from: m */
    private int[] f25080m;

    /* renamed from: n */
    private boolean[] f25081n;

    /* renamed from: o */
    private int[] f25082o;

    /* renamed from: p */
    private int[] f25083p = new int[2];

    /* renamed from: q */
    private int[] f25084q = new int[100];

    /* renamed from: r */
    private int[] f25085r = new int[2];

    /* renamed from: s */
    private long f25086s;

    /* renamed from: t */
    private int f25087t;

    /* renamed from: u */
    private int f25088u;

    /* renamed from: v */
    private boolean f25089v;

    /* renamed from: w */
    private boolean f25090w;

    /* renamed from: x */
    private boolean f25091x;

    /* renamed from: y */
    private int f25092y;

    /* renamed from: z */
    private int f25093z;

    /* renamed from: a */
    private boolean m37087a(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((long) (i3 - i)) * ((long) (i6 - i4)) < ((long) (i4 - i2)) * ((long) (i5 - i3));
    }

    /* renamed from: b */
    private boolean m37089b(int i, int i2, int i3, int i4, int i5, int i6) {
        long j = (long) i3;
        long j2 = (long) i4;
        long j3 = (long) i5;
        long j4 = (long) i6;
        return (((j2 - j4) * ((long) i)) + ((j3 - j) * ((long) i2))) + ((j * j4) - (j3 * j2)) > 0;
    }

    public C7055d() {
    }

    public C7055d(C7055d dVar, int i, int i2, int i3, int i4, C6994f fVar) {
        mo22205a(dVar);
        mo22204a(i, i2, i3, i4, fVar);
    }

    /* renamed from: a */
    public void mo22205a(C7055d dVar) {
        this.f25068a = dVar;
    }

    /* renamed from: a */
    public void mo22204a(int i, int i2, int i3, int i4, C6994f fVar) {
        double d;
        double d2;
        int i5 = i;
        int i6 = i3;
        C6994f fVar2 = fVar;
        this.f25072e = C7052c.m37053a(fVar2.f24763a);
        this.f25073f = C7052c.m37053a(fVar2.f24764b);
        this.f25074g = C7052c.m37053a(fVar2.f24766d);
        this.f25075h = C7052c.m37053a(fVar2.f24767e);
        this.f25076i = i5 >> 1;
        this.f25077j = (((long) this.f25072e) * ((long) this.f25076i)) >> 16;
        this.f25070c = i2;
        this.f25071d = i6;
        this.f25065N = (((double) this.f25072e) * ((double) this.f25072e)) + (((double) this.f25073f) * ((double) this.f25073f));
        this.f25066O = (((double) this.f25074g) * ((double) this.f25074g)) + (((double) this.f25075h) * ((double) this.f25075h));
        this.f25067P = (((double) this.f25072e) * ((double) this.f25074g)) + (((double) this.f25073f) * ((double) this.f25075h));
        double d3 = ((double) this.f25072e) / 65536.0d;
        double d4 = ((double) this.f25073f) / 65536.0d;
        double d5 = ((double) this.f25074g) / 65536.0d;
        double d6 = ((double) this.f25075h) / 65536.0d;
        double d7 = (d3 * d6) - (d4 * d5);
        if (i6 == 0) {
            d2 = d6;
            d = d5;
            double d8 = (((double) i4) / 65536.0d) * (((double) this.f25076i) / 65536.0d) * d7;
            this.f25086s = (long) (d8 * d8 * 65536.0d * 65536.0d);
        } else {
            d = d5;
            d2 = d6;
        }
        this.f25078k = (int) ((((float) i5) * 3.14159f) / 65536.0f);
        if (this.f25079l == null || this.f25079l.length < this.f25078k) {
            this.f25079l = new int[this.f25078k];
            this.f25080m = new int[this.f25078k];
            this.f25081n = new boolean[this.f25078k];
            this.f25082o = new int[(this.f25078k * 2)];
        }
        int i7 = 0;
        while (i7 < this.f25078k) {
            double d9 = ((double) i5) / 2.0d;
            double d10 = (((double) (i7 * 2)) * 3.141592653589793d) / ((double) this.f25078k);
            double cos = Math.cos(d10);
            double sin = Math.sin(d10);
            double d11 = d3;
            this.f25079l[i7] = (int) (d9 * ((d3 * cos) + (d4 * sin)));
            this.f25080m[i7] = (int) (d9 * ((d * cos) + (sin * d2)));
            i7++;
            d3 = d11;
        }
        this.f25087t = 2;
        this.f25088u = 0;
        this.f25089v = false;
        this.f25090w = false;
    }

    /* renamed from: a */
    private void m37085a(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        long j = ((long) i9) - ((long) i7);
        long j2 = ((long) i10) - ((long) i8);
        if (this.f25072e > 0 && this.f25072e == this.f25075h) {
            if ((this.f25073f == 0) && (this.f25074g == 0)) {
                long a = C7052c.m37055a(j, j2);
                if (a == 0) {
                    i6 = 0;
                    i5 = 0;
                } else {
                    i5 = (int) ((j2 * this.f25077j) / a);
                    i6 = (int) ((-(j * this.f25077j)) / a);
                }
                iArr[0] = i5;
                iArr[1] = i6;
            }
        }
        double d = (double) (i9 - i7);
        double d2 = (double) (i10 - i8);
        double a2 = ((double) (((((double) this.f25072e) * ((double) this.f25075h)) - (((double) this.f25073f) * ((double) this.f25074g)) > 0.0d ? 1 : -1) * this.f25076i)) / (C7052c.m37052a((((double) this.f25072e) * d2) - (((double) this.f25074g) * d), (((double) this.f25073f) * d2) - (((double) this.f25075h) * d)) * 65536.0d);
        double d3 = (this.f25065N * d2) - (this.f25067P * d);
        i6 = (int) (((d2 * this.f25067P) - (d * this.f25066O)) * a2);
        i5 = (int) (d3 * a2);
        iArr[0] = i5;
        iArr[1] = i6;
    }

    /* renamed from: a */
    private void m37081a(int i) {
        if (this.f25084q.length < i) {
            int[] iArr = new int[Math.max(i, (this.f25084q.length * 6) / 5)];
            System.arraycopy(this.f25084q, 0, iArr, 0, this.f25088u);
            this.f25084q = iArr;
        }
    }

    /* renamed from: a */
    private int m37080a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int[] iArr) {
        int i8;
        int i9 = i7;
        boolean z2 = i9 == 0 ? m37089b(i, i2, i3, i4, i5, i6) : i9 == 1;
        boolean z3 = z2;
        for (int i10 = 0; i10 < this.f25078k; i10++) {
            if (m37089b(i + this.f25079l[i10], i2 + this.f25080m[i10], i3, i4, i5, i6) != z3) {
                this.f25081n[i10] = true;
            } else {
                this.f25081n[i10] = false;
            }
        }
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < this.f25078k; i13++) {
            if (this.f25081n[i13] && !this.f25081n[((this.f25078k + i13) - 1) % this.f25078k]) {
                i12 = i13;
            }
            if (this.f25081n[i13] && !this.f25081n[(i13 + 1) % this.f25078k]) {
                i11 = i13;
            }
        }
        if (i11 < i12) {
            i11 += this.f25078k;
        }
        if (i12 == -1 || i11 == -1) {
            i8 = 0;
        } else {
            long j = (long) ((this.f25079l[i12] + i) - i3);
            long j2 = (long) ((i2 + this.f25080m[i12]) - i4);
            long j3 = (long) ((this.f25079l[i12] + i) - i5);
            long j4 = (long) ((i2 + this.f25080m[i12]) - i6);
            boolean z4 = (j * j) + (j2 * j2) > (j3 * j3) + (j4 * j4);
            int i14 = z4 ? i11 : i12;
            int i15 = z4 ? -1 : 1;
            i8 = 0;
            while (true) {
                int i16 = i14 % this.f25078k;
                int i17 = this.f25079l[i16] + i;
                int i18 = i2 + this.f25080m[i16];
                int i19 = i8 + 1;
                iArr[i8] = i17;
                i8 = i19 + 1;
                iArr[i19] = i18;
                if (i14 == (z4 ? i12 : i11)) {
                    break;
                }
                i14 += i15;
            }
        }
        return i8 / 2;
    }

    /* renamed from: a */
    private void m37083a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, long j) {
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i6;
        boolean z3 = z2;
        if ((i9 != 0 || i10 != 0) && (i11 != 0 || i12 != 0)) {
            long j2 = ((long) i9) - ((long) i11);
            long j3 = ((long) i10) - ((long) i12);
            if ((j2 * j2) + (j3 * j3) >= j) {
                if (z3) {
                    i9 = -i9;
                    i10 = -i10;
                    i11 = -i11;
                    i12 = -i12;
                }
                int a = m37080a(i, i2, i + i9, i2 + i10, i + i11, i2 + i12, i7, z, this.f25082o);
                for (int i13 = 0; i13 < a; i13++) {
                    int i14 = i13 * 2;
                    m37088b(this.f25082o[i14], this.f25082o[i14 + 1], i8, z3);
                }
            }
        }
    }

    /* renamed from: a */
    private void m37084a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        long j = (long) i;
        long j2 = (long) i2;
        long j3 = (long) i5;
        long j4 = (long) i7;
        long j5 = (long) i6;
        long j6 = (long) i8;
        long j7 = ((long) i3) - j;
        long j8 = ((long) i4) - j2;
        long j9 = j6 - j5;
        long j10 = ((j7 * j9) - ((j4 - j3) * j8)) >> 16;
        if (j10 == 0) {
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        long j11 = ((((j2 - j5) * j4) - (j9 * j)) + (j3 * (j6 - j2))) >> 16;
        iArr[0] = (int) (j + ((j7 * j11) / j10));
        iArr[1] = (int) (j2 + ((j11 * j8) / j10));
    }

    /* renamed from: a */
    private void m37082a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z) {
        int i12 = i;
        int i13 = i2;
        int i14 = i3;
        int i15 = i4;
        int i16 = i5;
        int i17 = i6;
        int i18 = i7;
        int i19 = i8;
        int i20 = i9;
        int i21 = i10;
        boolean z2 = z;
        if (i20 != i18 || i21 != i19) {
            if (i12 != i14 || i13 != i15) {
                if (i14 != i16 || i15 != i17) {
                    if (z2) {
                        i18 = -i18;
                        i19 = -i19;
                        i20 = -i20;
                        i21 = -i21;
                    }
                    m37084a(i12 + i18, i13 + i19, i18 + i14, i19 + i15, i14 + i20, i15 + i21, i16 + i20, i17 + i21, this.f25085r);
                    long j = ((long) this.f25085r[0]) - ((long) i14);
                    long j2 = ((long) this.f25085r[1]) - ((long) i15);
                    long j3 = ((((long) this.f25072e) * j2) - (((long) this.f25074g) * j)) >> 16;
                    long j4 = ((j2 * ((long) this.f25073f)) - (j * ((long) this.f25075h))) >> 16;
                    if ((j3 * j3) + (j4 * j4) < this.f25086s) {
                        m37088b(this.f25085r[0], this.f25085r[1], i11, z2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo22195a(int i, int i2, int i3) {
        if (this.f25090w) {
            m37086a(this.f25092y, this.f25093z, this.f25056E, this.f25091x);
            this.f25090w = false;
        }
        if (this.f25087t == 1) {
            m37091d();
        }
        this.f25054C = i;
        this.f25092y = i;
        this.f25055D = i2;
        this.f25093z = i2;
        this.f25058G = i3;
        this.f25056E = i3;
        this.f25088u = 0;
        this.f25089v = false;
        this.f25069b = false;
        this.f25087t = 0;
    }

    /* renamed from: a */
    public void mo22194a() {
        this.f25069b = true;
    }

    /* renamed from: b */
    public void mo22197b(int i, int i2, int i3) {
        if (this.f25090w) {
            if (i != this.f25092y || i2 != this.f25093z) {
                m37086a(this.f25092y, this.f25093z, this.f25056E, this.f25091x);
                this.f25090w = false;
            } else {
                return;
            }
        } else if (i != this.f25054C || i2 != this.f25055D) {
            if (i == this.f25092y && i2 == this.f25093z) {
                this.f25090w = true;
                this.f25091x = this.f25069b;
                this.f25069b = false;
                return;
            }
        } else {
            return;
        }
        m37086a(i, i2, i3, this.f25069b);
        this.f25069b = false;
    }

    /* renamed from: a */
    private void m37086a(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        m37085a(this.f25054C, this.f25055D, i, i2, this.f25083p);
        int i9 = this.f25083p[0];
        int i10 = this.f25083p[1];
        if (!this.f25089v) {
            m37090c(this.f25054C + i9, this.f25055D + i10, this.f25058G);
            this.f25052A = i6;
            this.f25053B = i7;
            this.f25059H = i9;
            this.f25060I = i10;
            this.f25089v = true;
            i5 = i10;
            i4 = i9;
        } else {
            boolean a = m37087a(this.f25063L, this.f25064M, this.f25054C, this.f25055D, i, i2);
            if (!z) {
                i5 = i10;
                i4 = i9;
                m37083a(this.f25054C, this.f25055D, this.f25061J, this.f25062K, i4, i5, 0, this.f25058G, false, a, 1000000000);
            } else if (this.f25071d == 0) {
                int i11 = this.f25063L;
                int i12 = this.f25064M;
                int i13 = this.f25054C;
                int i14 = this.f25055D;
                int i15 = this.f25061J;
                int i16 = this.f25062K;
                int i17 = i16;
                i5 = i10;
                i4 = i9;
                m37082a(i11, i12, i13, i14, i, i2, i15, i17, i9, i5, this.f25058G, a);
            } else {
                i5 = i10;
                i4 = i9;
                if (this.f25071d == 1) {
                    m37083a(this.f25054C, this.f25055D, this.f25061J, this.f25062K, i4, i5, 0, this.f25058G, false, a, 100000000);
                }
            }
            m37088b(this.f25054C, this.f25055D, this.f25058G, !a);
        }
        int i18 = i4;
        int i19 = i5;
        m37088b(this.f25054C + i18, this.f25055D + i19, this.f25058G, false);
        int i20 = i2;
        int i21 = i3;
        m37088b(i6 + i18, i20 + i19, i21, false);
        m37088b(this.f25054C - i18, this.f25055D - i19, this.f25058G, true);
        m37088b(i6 - i18, i20 - i19, i21, true);
        this.f25061J = i18;
        this.f25062K = i19;
        this.f25063L = this.f25054C;
        this.f25064M = this.f25055D;
        this.f25057F = this.f25058G;
        this.f25054C = i6;
        this.f25055D = i20;
        this.f25058G = i21;
        this.f25087t = 1;
    }

    /* renamed from: b */
    public void mo22196b() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f25090w) {
            this.f25090w = false;
        }
        if (!this.f25089v) {
            m37091d();
            return;
        }
        m37085a(this.f25054C, this.f25055D, this.f25092y, this.f25093z, this.f25083p);
        int i5 = this.f25083p[0];
        int i6 = this.f25083p[1];
        boolean a = m37087a(this.f25063L, this.f25064M, this.f25054C, this.f25055D, this.f25092y, this.f25093z);
        if (!this.f25069b) {
            i = i6;
            i2 = 1;
            m37083a(this.f25054C, this.f25055D, this.f25061J, this.f25062K, i5, i, 0, this.f25058G, false, a, 1000000000);
        } else if (this.f25071d == 0) {
            i = i6;
            i2 = 1;
            m37082a(this.f25063L, this.f25064M, this.f25054C, this.f25055D, this.f25092y, this.f25093z, this.f25061J, this.f25062K, i5, i6, this.f25057F, a);
        } else {
            i = i6;
            i2 = 1;
            if (this.f25071d == 1) {
                m37083a(this.f25054C, this.f25055D, this.f25061J, this.f25062K, i5, i, 0, this.f25058G, false, a, 100000000);
            }
        }
        int i7 = i;
        m37092d(this.f25054C + i5, this.f25055D + i7, this.f25058G);
        m37092d(this.f25092y + i5, this.f25093z + i7, this.f25056E);
        boolean a2 = m37087a(this.f25054C, this.f25055D, this.f25092y, this.f25093z, this.f25052A, this.f25053B);
        if (a2) {
            i3 = i7;
        } else if (this.f25071d == 0) {
            i3 = i7;
            m37082a(this.f25054C, this.f25055D, this.f25092y, this.f25093z, this.f25052A, this.f25053B, i5, i7, this.f25059H, this.f25060I, this.f25058G, false);
        } else {
            i3 = i7;
            if (this.f25071d == i2) {
                m37083a(this.f25092y, this.f25093z, i5, i3, this.f25059H, this.f25060I, 0, this.f25056E, false, false, 100000000);
            }
        }
        m37092d(this.f25092y + this.f25059H, this.f25093z + this.f25060I, this.f25056E);
        m37092d(this.f25092y - this.f25059H, this.f25093z - this.f25060I, this.f25056E);
        if (!a2) {
            i4 = i3;
        } else if (this.f25071d == 0) {
            i4 = i3;
            m37082a(this.f25054C, this.f25055D, this.f25092y, this.f25093z, this.f25052A, this.f25053B, -i5, -i4, -this.f25059H, -this.f25060I, this.f25058G, false);
        } else {
            int i8 = i3;
            if (this.f25071d == i2) {
                i4 = i8;
                m37083a(this.f25092y, this.f25093z, -i5, -i8, -this.f25059H, -this.f25060I, 0, this.f25056E, true, false, 100000000);
            } else {
                i4 = i8;
            }
        }
        m37092d(this.f25092y - i5, this.f25093z - i4, this.f25056E);
        m37092d(this.f25054C - i5, this.f25055D - i4, this.f25058G);
        for (int i9 = this.f25088u - 3; i9 >= 0; i9 -= 3) {
            m37092d(this.f25084q[i9], this.f25084q[i9 + 1], this.f25084q[i9 + 2]);
        }
        this.f25054C = this.f25092y;
        this.f25055D = this.f25093z;
        this.f25088u = 0;
        this.f25089v = false;
        this.f25069b = false;
        this.f25087t = 2;
        m37093e();
    }

    /* renamed from: c */
    public void mo22198c() {
        if (this.f25090w) {
            m37086a(this.f25092y, this.f25093z, this.f25056E, this.f25091x);
            this.f25090w = false;
        }
        if (this.f25087t == 1) {
            m37091d();
        }
        this.f25068a.mo22198c();
        this.f25069b = false;
        this.f25087t = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo22203a(long j, long j2) {
        long j3 = ((((long) this.f25072e) * ((long) this.f25075h)) - (((long) this.f25073f) * ((long) this.f25074g))) >> 16;
        return (long) ((int) C7052c.m37055a(((((long) this.f25072e) * j2) - (((long) this.f25074g) * j)) / j3, ((j2 * ((long) this.f25073f)) - (j * ((long) this.f25075h))) / j3));
    }

    /* renamed from: d */
    private void m37091d() {
        int i;
        if (this.f25070c == 1) {
            i = 2;
            m37083a(this.f25054C, this.f25055D, this.f25061J, this.f25062K, -this.f25061J, -this.f25062K, 1, this.f25058G, false, false, 100000000);
        } else {
            i = 2;
            if (this.f25070c == 2) {
                long j = (long) (this.f25063L - this.f25054C);
                long j2 = (long) (this.f25064M - this.f25055D);
                long a = mo22203a(j, j2);
                if (0 < a) {
                    long j3 = (((long) this.f25076i) * 65536) / a;
                    int i2 = this.f25054C - ((int) ((j * j3) >> 16));
                    int i3 = this.f25055D - ((int) ((j2 * j3) >> 16));
                    m37092d(this.f25061J + i2, this.f25062K + i3, this.f25058G);
                    m37092d(i2 - this.f25061J, i3 - this.f25062K, this.f25058G);
                }
            }
        }
        for (int i4 = this.f25088u - 3; i4 >= 0; i4 -= 3) {
            m37092d(this.f25084q[i4], this.f25084q[i4 + 1], this.f25084q[i4 + 2]);
        }
        this.f25088u = 0;
        if (this.f25070c == 1) {
            m37083a(this.f25092y, this.f25093z, -this.f25059H, -this.f25060I, this.f25059H, this.f25060I, 1, this.f25056E, false, false, 100000000);
        } else if (this.f25070c == i) {
            long j4 = (long) (this.f25052A - this.f25092y);
            long j5 = (long) (this.f25053B - this.f25093z);
            long a2 = mo22203a(j4, j5);
            if (0 < a2) {
                long j6 = (((long) this.f25076i) * 65536) / a2;
                int i5 = this.f25092y - ((int) ((j4 * j6) >> 16));
                int i6 = this.f25093z - ((int) ((j5 * j6) >> 16));
                m37092d(i5 - this.f25059H, i6 - this.f25060I, this.f25056E);
                m37092d(i5 + this.f25059H, i6 + this.f25060I, this.f25056E);
            }
        }
        m37093e();
        this.f25069b = false;
    }

    /* renamed from: c */
    private void m37090c(int i, int i2, int i3) {
        this.f25068a.mo22195a(i, i2, i3);
    }

    /* renamed from: d */
    private void m37092d(int i, int i2, int i3) {
        this.f25068a.mo22197b(i, i2, i3);
    }

    /* renamed from: b */
    private void m37088b(int i, int i2, int i3, boolean z) {
        if (z) {
            m37081a(this.f25088u + 3);
            int[] iArr = this.f25084q;
            int i4 = this.f25088u;
            this.f25088u = i4 + 1;
            iArr[i4] = i;
            int[] iArr2 = this.f25084q;
            int i5 = this.f25088u;
            this.f25088u = i5 + 1;
            iArr2[i5] = i2;
            int[] iArr3 = this.f25084q;
            int i6 = this.f25088u;
            this.f25088u = i6 + 1;
            iArr3[i6] = i3;
            return;
        }
        m37092d(i, i2, i3);
    }

    /* renamed from: e */
    private void m37093e() {
        this.f25068a.mo22196b();
    }
}
