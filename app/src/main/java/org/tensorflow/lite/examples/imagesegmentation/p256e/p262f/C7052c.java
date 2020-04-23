package p256e.p262f;

import com.facebook.ads.AdError;
import p256e.p259c.C6994f;

/* renamed from: e.f.c */
/* compiled from: LinePath */
public class C7052c {

    /* renamed from: g */
    private static C6994f f25037g = new C6994f();

    /* renamed from: h */
    private static float f25038h = 10.0f;

    /* renamed from: a */
    protected byte[] f25039a;

    /* renamed from: b */
    protected float[] f25040b;

    /* renamed from: c */
    protected int[] f25041c;

    /* renamed from: d */
    protected int f25042d;

    /* renamed from: e */
    protected int f25043e;

    /* renamed from: f */
    protected int f25044f;

    /* renamed from: e.f.c$a */
    /* compiled from: LinePath */
    public static class C7054a {

        /* renamed from: f */
        static final int[] f25046f = {2, 2, 0};

        /* renamed from: a */
        float[] f25047a;

        /* renamed from: b */
        int f25048b;

        /* renamed from: c */
        int f25049c = 0;

        /* renamed from: d */
        int f25050d = 0;

        /* renamed from: e */
        C7052c f25051e;

        C7054a(C7052c cVar) {
            this.f25051e = cVar;
            this.f25047a = cVar.f25040b;
        }

        /* renamed from: a */
        public int mo22200a(float[] fArr) {
            byte b = this.f25051e.f25039a[this.f25048b];
            int i = f25046f[b];
            if (i > 0) {
                System.arraycopy(this.f25047a, this.f25049c, fArr, 0, i);
                int i2 = this.f25051e.f25041c[this.f25050d];
                fArr[i + 0] = (float) ((i2 >> 24) & 255);
                fArr[i + 1] = (float) ((i2 >> 16) & 255);
                fArr[i + 2] = (float) ((i2 >> 8) & 255);
                fArr[i + 3] = (float) ((i2 >> 0) & 255);
            }
            return b;
        }

        /* renamed from: a */
        public int mo22199a() {
            return this.f25051e.mo22193c();
        }

        /* renamed from: b */
        public boolean mo22201b() {
            return this.f25048b >= this.f25051e.f25042d;
        }

        /* renamed from: c */
        public void mo22202c() {
            byte[] bArr = this.f25051e.f25039a;
            int i = this.f25048b;
            this.f25048b = i + 1;
            byte b = bArr[i];
            if (f25046f[b] > 0) {
                this.f25049c += f25046f[b];
                this.f25050d++;
            }
        }
    }

    /* renamed from: a */
    public static long m37054a(long j) {
        long j2 = 0;
        long j3 = 0;
        int i = 39;
        while (true) {
            j2 = (j2 << 2) | (j >>> 62);
            j <<= 2;
            j3 <<= 1;
            long j4 = (j3 << 1) + 1;
            if (j2 >= j4) {
                j2 -= j4;
                j3++;
            }
            int i2 = i - 1;
            if (i == 0) {
                return j3;
            }
            i = i2;
        }
    }

    /* renamed from: b */
    static float m37063b(int i) {
        return ((float) i) / 65536.0f;
    }

    public C7052c() {
        this(1, 20);
    }

    public C7052c(int i) {
        this(i, 20);
    }

    public C7052c(int i, int i2) {
        mo22189a(i);
        this.f25039a = new byte[i2];
        this.f25040b = new float[(i2 * 2)];
        this.f25041c = new int[i2];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22190a(boolean z, int i) {
        if (!z || this.f25042d != 0) {
            int length = this.f25039a.length;
            int i2 = 500;
            if (this.f25042d >= length) {
                this.f25039a = m37060a(this.f25039a, length + (length > 500 ? 500 : length));
            }
            int length2 = this.f25040b.length;
            int i3 = i * 2;
            if (this.f25043e + i3 > length2) {
                int i4 = AdError.NETWORK_ERROR_CODE;
                if (length2 <= 1000) {
                    i4 = length2;
                }
                if (i4 < i3) {
                    i4 = i3;
                }
                this.f25040b = m37061a(this.f25040b, length2 + i4);
            }
            int length3 = this.f25041c.length;
            if ((this.f25043e / 2) + i > length3) {
                if (length3 <= 500) {
                    i2 = length3;
                }
                if (i2 >= i) {
                    i = i2;
                }
                this.f25041c = m37062a(this.f25041c, length3 + i);
                return;
            }
            return;
        }
        throw new RuntimeException("missing initial moveto in path definition");
    }

    /* renamed from: a */
    public final void mo22188a(float f, float f2, int i) {
        if (this.f25042d <= 0 || this.f25039a[this.f25042d - 1] != 0) {
            mo22190a(false, 1);
            byte[] bArr = this.f25039a;
            int i2 = this.f25042d;
            this.f25042d = i2 + 1;
            bArr[i2] = 0;
            float[] fArr = this.f25040b;
            int i3 = this.f25043e;
            this.f25043e = i3 + 1;
            fArr[i3] = f;
            float[] fArr2 = this.f25040b;
            int i4 = this.f25043e;
            this.f25043e = i4 + 1;
            fArr2[i4] = f2;
            this.f25041c[(this.f25043e / 2) - 1] = i;
            return;
        }
        this.f25040b[this.f25043e - 2] = f;
        this.f25040b[this.f25043e - 1] = f2;
        this.f25041c[(this.f25043e / 2) - 1] = i;
    }

    /* renamed from: b */
    public final void mo22192b(float f, float f2, int i) {
        mo22190a(true, 1);
        byte[] bArr = this.f25039a;
        int i2 = this.f25042d;
        this.f25042d = i2 + 1;
        bArr[i2] = 1;
        float[] fArr = this.f25040b;
        int i3 = this.f25043e;
        this.f25043e = i3 + 1;
        fArr[i3] = f;
        float[] fArr2 = this.f25040b;
        int i4 = this.f25043e;
        this.f25043e = i4 + 1;
        fArr2[i4] = f2;
        this.f25041c[(this.f25043e / 2) - 1] = i;
    }

    /* renamed from: a */
    public C7054a mo22187a() {
        return new C7054a(this);
    }

    /* renamed from: b */
    public final void mo22191b() {
        if (this.f25042d == 0 || this.f25039a[this.f25042d - 1] != 2) {
            mo22190a(false, 0);
            byte[] bArr = this.f25039a;
            int i = this.f25042d;
            this.f25042d = i + 1;
            bArr[i] = 2;
        }
    }

    /* renamed from: c */
    public final int mo22193c() {
        return this.f25044f;
    }

    /* renamed from: a */
    public final void mo22189a(int i) {
        if (i == 0 || i == 1) {
            this.f25044f = i;
            return;
        }
        throw new IllegalArgumentException("winding rule must be WIND_EVEN_ODD or WIND_NON_ZERO");
    }

    /* renamed from: a */
    public static C7052c m37056a(C7052c cVar, float f, int i, int i2) {
        return m37057a(cVar, f, i, i2, f25038h, null);
    }

    /* renamed from: a */
    public static C7052c m37057a(C7052c cVar, float f, int i, int i2, float f2, C6994f fVar) {
        C7052c cVar2 = new C7052c();
        m37059a(cVar, f, i, i2, f2, fVar, new C7055d(cVar2) {

            /* renamed from: a */
            final /* synthetic */ C7052c f25045a;

            /* renamed from: a */
            public void mo22194a() {
            }

            /* renamed from: c */
            public void mo22198c() {
            }

            {
                this.f25045a = r1;
            }

            /* renamed from: a */
            public void mo22195a(int i, int i2, int i3) {
                this.f25045a.mo22188a(C7052c.m37063b(i), C7052c.m37063b(i2), i3);
            }

            /* renamed from: b */
            public void mo22197b(int i, int i2, int i3) {
                this.f25045a.mo22192b(C7052c.m37063b(i), C7052c.m37063b(i2), i3);
            }

            /* renamed from: b */
            public void mo22196b() {
                this.f25045a.mo22191b();
            }
        });
        return cVar2;
    }

    /* renamed from: a */
    private static void m37059a(C7052c cVar, float f, int i, int i2, float f2, C6994f fVar, C7055d dVar) {
        int a = m37053a(f);
        int a2 = m37053a(f2);
        if (fVar == null) {
            fVar = f25037g;
        }
        C7055d dVar2 = new C7055d(dVar, a, i, i2, a2, fVar);
        m37058a(cVar.mo22187a(), dVar2);
    }

    /* renamed from: a */
    private static void m37058a(C7054a aVar, C7055d dVar) {
        float[] fArr = new float[6];
        while (!aVar.mo22201b()) {
            switch (aVar.mo22200a(fArr)) {
                case 0:
                    dVar.mo22195a(m37053a(fArr[0]), m37053a(fArr[1]), (((int) fArr[2]) << 24) | (((int) fArr[3]) << 16) | (((int) fArr[4]) << 8) | ((int) fArr[5]));
                    break;
                case 1:
                    int i = (((int) fArr[2]) << 24) | (((int) fArr[3]) << 16) | (((int) fArr[4]) << 8) | ((int) fArr[5]);
                    dVar.mo22194a();
                    dVar.mo22197b(m37053a(fArr[0]), m37053a(fArr[1]), i);
                    break;
                case 2:
                    dVar.mo22194a();
                    dVar.mo22196b();
                    break;
                default:
                    throw new InternalError("unknown flattened segment type");
            }
            aVar.mo22202c();
        }
        dVar.mo22198c();
    }

    /* renamed from: a */
    public static float[] m37061a(float[] fArr, int i) {
        float[] fArr2 = new float[i];
        for (int i2 = 0; i2 < fArr2.length; i2++) {
            if (i2 > fArr.length - 1) {
                fArr2[i2] = 0.0f;
            } else {
                fArr2[i2] = fArr[i2];
            }
        }
        return fArr2;
    }

    /* renamed from: a */
    public static byte[] m37060a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (i2 > bArr.length - 1) {
                bArr2[i2] = 0;
            } else {
                bArr2[i2] = bArr[i2];
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public static int[] m37062a(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            if (i2 > iArr.length - 1) {
                iArr2[i2] = 0;
            } else {
                iArr2[i2] = iArr[i2];
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    public static double m37052a(double d, double d2) {
        return Math.sqrt((d * d) + (d2 * d2));
    }

    /* renamed from: a */
    public static long m37055a(long j, long j2) {
        return (m37054a((j * j) + (j2 * j2)) + 128) >> 8;
    }

    /* renamed from: a */
    static int m37053a(float f) {
        float f2 = (f * 65536.0f) + 0.5f;
        if (f2 <= -4.2949673E9f) {
            return Integer.MIN_VALUE;
        }
        if (f2 >= 4.2949673E9f) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.floor((double) f2);
    }
}
