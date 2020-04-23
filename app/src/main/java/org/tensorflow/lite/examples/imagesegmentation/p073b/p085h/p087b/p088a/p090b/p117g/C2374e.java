package p073b.p085h.p087b.p088a.p090b.p117g;

import android.support.p072v8.renderscript.Allocation;
import java.io.InputStream;
import java.util.ArrayList;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q.C2407a;

/* renamed from: b.h.b.a.b.g.e */
/* compiled from: CodedInputStream */
public final class C2374e {

    /* renamed from: a */
    private final byte[] f7261a;

    /* renamed from: b */
    private final boolean f7262b;

    /* renamed from: c */
    private int f7263c;

    /* renamed from: d */
    private int f7264d;

    /* renamed from: e */
    private int f7265e;

    /* renamed from: f */
    private final InputStream f7266f;

    /* renamed from: g */
    private int f7267g;

    /* renamed from: h */
    private boolean f7268h;

    /* renamed from: i */
    private int f7269i;

    /* renamed from: j */
    private int f7270j;

    /* renamed from: k */
    private int f7271k;

    /* renamed from: l */
    private int f7272l;

    /* renamed from: m */
    private int f7273m;

    /* renamed from: n */
    private C2375a f7274n;

    /* renamed from: b.h.b.a.b.g.e$a */
    /* compiled from: CodedInputStream */
    private interface C2375a {
        /* renamed from: a */
        void mo9130a();
    }

    /* renamed from: a */
    public static long m11770a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: b */
    public static int m11773b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public static C2374e m11772a(InputStream inputStream) {
        return new C2374e(inputStream);
    }

    /* renamed from: a */
    static C2374e m11771a(C2403p pVar) {
        C2374e eVar = new C2374e(pVar);
        try {
            eVar.mo9104c(pVar.mo9064a());
            return eVar;
        } catch (C2395k e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public int mo9095a() {
        if (mo9128y()) {
            this.f7267g = 0;
            return 0;
        }
        this.f7267g = mo9122s();
        if (C2430z.m12125b(this.f7267g) != 0) {
            return this.f7267g;
        }
        throw C2395k.m11986e();
    }

    /* renamed from: a */
    public void mo9097a(int i) {
        if (this.f7267g != i) {
            throw C2395k.m11987f();
        }
    }

    /* renamed from: a */
    public boolean mo9101a(int i, C2376f fVar) {
        switch (C2430z.m12123a(i)) {
            case 0:
                long e = mo9107e();
                fVar.mo9171p(i);
                fVar.mo9142a(e);
                return true;
            case 1:
                long w = mo9126w();
                fVar.mo9171p(i);
                fVar.mo9158c(w);
                return true;
            case 2:
                C2371d l = mo9115l();
                fVar.mo9171p(i);
                fVar.mo9143a(l);
                return true;
            case 3:
                fVar.mo9171p(i);
                mo9099a(fVar);
                int a = C2430z.m12124a(C2430z.m12125b(i), 4);
                mo9097a(a);
                fVar.mo9171p(a);
                return true;
            case 4:
                return false;
            case 5:
                int v = mo9125v();
                fVar.mo9171p(i);
                fVar.mo9155c(v);
                return true;
            default:
                throw C2395k.m11988g();
        }
    }

    /* renamed from: a */
    public void mo9099a(C2376f fVar) {
        int a;
        do {
            a = mo9095a();
            if (a == 0) {
                return;
            }
        } while (mo9101a(a, fVar));
    }

    /* renamed from: b */
    public double mo9102b() {
        return Double.longBitsToDouble(mo9126w());
    }

    /* renamed from: c */
    public float mo9103c() {
        return Float.intBitsToFloat(mo9125v());
    }

    /* renamed from: d */
    public long mo9105d() {
        return mo9123t();
    }

    /* renamed from: e */
    public long mo9107e() {
        return mo9123t();
    }

    /* renamed from: f */
    public int mo9109f() {
        return mo9122s();
    }

    /* renamed from: g */
    public long mo9110g() {
        return mo9126w();
    }

    /* renamed from: h */
    public int mo9111h() {
        return mo9125v();
    }

    /* renamed from: i */
    public boolean mo9112i() {
        return mo9123t() != 0;
    }

    /* renamed from: j */
    public String mo9113j() {
        int s = mo9122s();
        if (s <= this.f7263c - this.f7265e && s > 0) {
            String str = new String(this.f7261a, this.f7265e, s, "UTF-8");
            this.f7265e += s;
            return str;
        } else if (s == 0) {
            return "";
        } else {
            return new String(m11777i(s), "UTF-8");
        }
    }

    /* renamed from: k */
    public String mo9114k() {
        byte[] bArr;
        int s = mo9122s();
        int i = this.f7265e;
        if (s <= this.f7263c - i && s > 0) {
            bArr = this.f7261a;
            this.f7265e = i + s;
        } else if (s == 0) {
            return "";
        } else {
            bArr = m11777i(s);
            i = 0;
        }
        if (C2429y.m12119a(bArr, i, i + s)) {
            return new String(bArr, i, s, "UTF-8");
        }
        throw C2395k.m11991j();
    }

    /* renamed from: a */
    public void mo9098a(int i, C2407a aVar, C2378g gVar) {
        if (this.f7271k < this.f7272l) {
            this.f7271k++;
            aVar.mo8132c(this, gVar);
            mo9097a(C2430z.m12124a(i, 4));
            this.f7271k--;
            return;
        }
        throw C2395k.m11989h();
    }

    /* renamed from: a */
    public void mo9100a(C2407a aVar, C2378g gVar) {
        int s = mo9122s();
        if (this.f7271k < this.f7272l) {
            int c = mo9104c(s);
            this.f7271k++;
            aVar.mo8132c(this, gVar);
            mo9097a(0);
            this.f7271k--;
            mo9106d(c);
            return;
        }
        throw C2395k.m11989h();
    }

    /* renamed from: a */
    public <T extends C2406q> T mo9096a(C2409s<T> sVar, C2378g gVar) {
        int s = mo9122s();
        if (this.f7271k < this.f7272l) {
            int c = mo9104c(s);
            this.f7271k++;
            T t = (C2406q) sVar.mo8114b(this, gVar);
            mo9097a(0);
            this.f7271k--;
            mo9106d(c);
            return t;
        }
        throw C2395k.m11989h();
    }

    /* renamed from: l */
    public C2371d mo9115l() {
        int s = mo9122s();
        if (s <= this.f7263c - this.f7265e && s > 0) {
            C2371d a = (!this.f7262b || !this.f7268h) ? C2371d.m11742a(this.f7261a, this.f7265e, s) : new C2368c(this.f7261a, this.f7265e, s);
            this.f7265e += s;
            return a;
        } else if (s == 0) {
            return C2371d.f7253a;
        } else {
            return new C2403p(m11777i(s));
        }
    }

    /* renamed from: m */
    public int mo9116m() {
        return mo9122s();
    }

    /* renamed from: n */
    public int mo9117n() {
        return mo9122s();
    }

    /* renamed from: o */
    public int mo9118o() {
        return mo9125v();
    }

    /* renamed from: p */
    public long mo9119p() {
        return mo9126w();
    }

    /* renamed from: q */
    public int mo9120q() {
        return m11773b(mo9122s());
    }

    /* renamed from: r */
    public long mo9121r() {
        return m11770a(mo9123t());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r1[r2] < 0) goto L_0x007f;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo9122s() {
        /*
            r8 = this;
            int r0 = r8.f7265e
            int r1 = r8.f7263c
            if (r1 != r0) goto L_0x0008
            goto L_0x007f
        L_0x0008:
            byte[] r1 = r8.f7261a
            int r2 = r0 + 1
            byte r0 = r1[r0]
            if (r0 < 0) goto L_0x0013
            r8.f7265e = r2
            return r0
        L_0x0013:
            int r3 = r8.f7263c
            int r3 = r3 - r2
            r4 = 9
            if (r3 >= r4) goto L_0x001b
            goto L_0x007f
        L_0x001b:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            long r4 = (long) r0
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x002e
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 ^ r4
            int r0 = (int) r0
            goto L_0x0085
        L_0x002e:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r3 = r3 << 14
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0040
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r3
            int r0 = (int) r0
        L_0x003e:
            r3 = r2
            goto L_0x0085
        L_0x0040:
            int r3 = r2 + 1
            byte r2 = r1[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            long r4 = (long) r0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0052
            r0 = -2080896(0xffffffffffe03f80, double:NaN)
            long r0 = r0 ^ r4
            int r0 = (int) r0
            goto L_0x0085
        L_0x0052:
            int r2 = r3 + 1
            byte r3 = r1[r3]
            int r4 = r3 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r3 >= 0) goto L_0x003e
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x0085
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x003e
            int r3 = r2 + 1
            byte r2 = r1[r2]
            if (r2 >= 0) goto L_0x0085
            int r2 = r3 + 1
            byte r3 = r1[r3]
            if (r3 >= 0) goto L_0x003e
            int r3 = r2 + 1
            byte r1 = r1[r2]
            if (r1 >= 0) goto L_0x0085
        L_0x007f:
            long r0 = r8.mo9124u()
            int r0 = (int) r0
            return r0
        L_0x0085:
            r8.f7265e = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p117g.C2374e.mo9122s():int");
    }

    /* renamed from: a */
    public static int m11769a(int i, InputStream inputStream) {
        if ((i & Allocation.USAGE_SHARED) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & Allocation.USAGE_SHARED) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C2395k.m11983b();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw C2395k.m11983b();
            } else if ((read2 & Allocation.USAGE_SHARED) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw C2395k.m11985d();
    }

    /* renamed from: t */
    public long mo9123t() {
        long j;
        int i;
        long j2;
        int i2 = this.f7265e;
        if (this.f7263c != i2) {
            byte[] bArr = this.f7261a;
            int i3 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f7265e = i3;
                return (long) b;
            } else if (this.f7263c - i3 >= 9) {
                int i4 = i3 + 1;
                long j3 = (long) (b ^ (bArr[i3] << 7));
                if (j3 < 0) {
                    j = -128 ^ j3;
                    i = i4;
                } else {
                    i = i4 + 1;
                    long j4 = ((long) (bArr[i4] << 14)) ^ j3;
                    if (j4 >= 0) {
                        j = j4 ^ 16256;
                    } else {
                        int i5 = i + 1;
                        long j5 = j4 ^ ((long) (bArr[i] << 21));
                        if (j5 < 0) {
                            j2 = -2080896 ^ j5;
                        } else {
                            i = i5 + 1;
                            long j6 = j5 ^ (((long) bArr[i5]) << 28);
                            if (j6 >= 0) {
                                j = j6 ^ 266354560;
                            } else {
                                i5 = i + 1;
                                long j7 = j6 ^ (((long) bArr[i]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L ^ j7;
                                } else {
                                    i = i5 + 1;
                                    long j8 = j7 ^ (((long) bArr[i5]) << 42);
                                    if (j8 >= 0) {
                                        j = j8 ^ 4363953127296L;
                                    } else {
                                        i5 = i + 1;
                                        long j9 = j8 ^ (((long) bArr[i]) << 49);
                                        if (j9 < 0) {
                                            j2 = -558586000294016L ^ j9;
                                        } else {
                                            i = i5 + 1;
                                            long j10 = (j9 ^ (((long) bArr[i5]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i5 = i + 1;
                                                if (((long) bArr[i]) >= 0) {
                                                    j = j10;
                                                    i = i5;
                                                }
                                            } else {
                                                j = j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j = j2;
                        i = i5;
                    }
                }
                this.f7265e = i;
                return j;
            }
        }
        return mo9124u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public long mo9124u() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte z = mo9129z();
            j |= ((long) (z & Byte.MAX_VALUE)) << i;
            if ((z & 128) == 0) {
                return j;
            }
        }
        throw C2395k.m11985d();
    }

    /* renamed from: v */
    public int mo9125v() {
        int i = this.f7265e;
        if (this.f7263c - i < 4) {
            m11775g(4);
            i = this.f7265e;
        }
        byte[] bArr = this.f7261a;
        this.f7265e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: w */
    public long mo9126w() {
        int i = this.f7265e;
        if (this.f7263c - i < 8) {
            m11775g(8);
            i = this.f7265e;
        }
        byte[] bArr = this.f7261a;
        this.f7265e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private C2374e(InputStream inputStream) {
        this.f7268h = false;
        this.f7270j = Integer.MAX_VALUE;
        this.f7272l = 64;
        this.f7273m = 67108864;
        this.f7274n = null;
        this.f7261a = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
        this.f7263c = 0;
        this.f7265e = 0;
        this.f7269i = 0;
        this.f7266f = inputStream;
        this.f7262b = false;
    }

    private C2374e(C2403p pVar) {
        this.f7268h = false;
        this.f7270j = Integer.MAX_VALUE;
        this.f7272l = 64;
        this.f7273m = 67108864;
        this.f7274n = null;
        this.f7261a = pVar.f7323c;
        this.f7265e = pVar.mo9066b();
        this.f7263c = this.f7265e + pVar.mo9064a();
        this.f7269i = -this.f7265e;
        this.f7266f = null;
        this.f7262b = true;
    }

    /* renamed from: c */
    public int mo9104c(int i) {
        if (i >= 0) {
            int i2 = i + this.f7269i + this.f7265e;
            int i3 = this.f7270j;
            if (i2 <= i3) {
                this.f7270j = i2;
                m11768A();
                return i3;
            }
            throw C2395k.m11983b();
        }
        throw C2395k.m11984c();
    }

    /* renamed from: A */
    private void m11768A() {
        this.f7263c += this.f7264d;
        int i = this.f7269i + this.f7263c;
        if (i > this.f7270j) {
            this.f7264d = i - this.f7270j;
            this.f7263c -= this.f7264d;
            return;
        }
        this.f7264d = 0;
    }

    /* renamed from: d */
    public void mo9106d(int i) {
        this.f7270j = i;
        m11768A();
    }

    /* renamed from: x */
    public int mo9127x() {
        if (this.f7270j == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f7270j - (this.f7269i + this.f7265e);
    }

    /* renamed from: y */
    public boolean mo9128y() {
        return this.f7265e == this.f7263c && !m11776h(1);
    }

    /* renamed from: f */
    private void m11774f(int i) {
        if (this.f7263c - this.f7265e < i) {
            m11775g(i);
        }
    }

    /* renamed from: g */
    private void m11775g(int i) {
        if (!m11776h(i)) {
            throw C2395k.m11983b();
        }
    }

    /* renamed from: h */
    private boolean m11776h(int i) {
        if (this.f7265e + i <= this.f7263c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        } else if (this.f7269i + this.f7265e + i > this.f7270j) {
            return false;
        } else {
            if (this.f7274n != null) {
                this.f7274n.mo9130a();
            }
            if (this.f7266f != null) {
                int i2 = this.f7265e;
                if (i2 > 0) {
                    if (this.f7263c > i2) {
                        System.arraycopy(this.f7261a, i2, this.f7261a, 0, this.f7263c - i2);
                    }
                    this.f7269i += i2;
                    this.f7263c -= i2;
                    this.f7265e = 0;
                }
                int read = this.f7266f.read(this.f7261a, this.f7263c, this.f7261a.length - this.f7263c);
                if (read == 0 || read < -1 || read > this.f7261a.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f7263c += read;
                    if ((this.f7269i + i) - this.f7273m <= 0) {
                        m11768A();
                        return this.f7263c >= i ? true : m11776h(i);
                    }
                    throw C2395k.m11990i();
                }
            }
            return false;
        }
    }

    /* renamed from: z */
    public byte mo9129z() {
        if (this.f7265e == this.f7263c) {
            m11775g(1);
        }
        byte[] bArr = this.f7261a;
        int i = this.f7265e;
        this.f7265e = i + 1;
        return bArr[i];
    }

    /* renamed from: i */
    private byte[] m11777i(int i) {
        if (i <= 0) {
            if (i == 0) {
                return C2392j.f7311a;
            }
            throw C2395k.m11984c();
        } else if (this.f7269i + this.f7265e + i > this.f7270j) {
            mo9108e((this.f7270j - this.f7269i) - this.f7265e);
            throw C2395k.m11983b();
        } else if (i < 4096) {
            byte[] bArr = new byte[i];
            int i2 = this.f7263c - this.f7265e;
            System.arraycopy(this.f7261a, this.f7265e, bArr, 0, i2);
            this.f7265e = this.f7263c;
            int i3 = i - i2;
            m11774f(i3);
            System.arraycopy(this.f7261a, 0, bArr, i2, i3);
            this.f7265e = i3;
            return bArr;
        } else {
            int i4 = this.f7265e;
            int i5 = this.f7263c;
            this.f7269i += this.f7263c;
            this.f7265e = 0;
            this.f7263c = 0;
            int i6 = i5 - i4;
            int i7 = i - i6;
            ArrayList<byte[]> arrayList = new ArrayList<>();
            while (i7 > 0) {
                byte[] bArr2 = new byte[Math.min(i7, CodedOutputStream.DEFAULT_BUFFER_SIZE)];
                int i8 = 0;
                while (i8 < bArr2.length) {
                    int read = this.f7266f == null ? -1 : this.f7266f.read(bArr2, i8, bArr2.length - i8);
                    if (read != -1) {
                        this.f7269i += read;
                        i8 += read;
                    } else {
                        throw C2395k.m11983b();
                    }
                }
                i7 -= bArr2.length;
                arrayList.add(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.f7261a, i4, bArr3, 0, i6);
            for (byte[] bArr4 : arrayList) {
                System.arraycopy(bArr4, 0, bArr3, i6, bArr4.length);
                i6 += bArr4.length;
            }
            return bArr3;
        }
    }

    /* renamed from: e */
    public void mo9108e(int i) {
        if (i > this.f7263c - this.f7265e || i < 0) {
            m11778j(i);
        } else {
            this.f7265e += i;
        }
    }

    /* renamed from: j */
    private void m11778j(int i) {
        if (i < 0) {
            throw C2395k.m11984c();
        } else if (this.f7269i + this.f7265e + i <= this.f7270j) {
            int i2 = this.f7263c - this.f7265e;
            this.f7265e = this.f7263c;
            m11775g(1);
            while (true) {
                int i3 = i - i2;
                if (i3 > this.f7263c) {
                    i2 += this.f7263c;
                    this.f7265e = this.f7263c;
                    m11775g(1);
                } else {
                    this.f7265e = i3;
                    return;
                }
            }
        } else {
            mo9108e((this.f7270j - this.f7269i) - this.f7265e);
            throw C2395k.m11983b();
        }
    }
}
