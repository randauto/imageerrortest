package p256e.p262f;

import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import p256e.p259c.C6982a;
import p256e.p259c.C6989c;

/* renamed from: e.f.l */
/* compiled from: Texture */
public class C7088l {

    /* renamed from: A */
    protected C7051b f25927A = null;

    /* renamed from: B */
    protected int f25928B = 0;

    /* renamed from: C */
    protected int f25929C = 0;

    /* renamed from: D */
    protected boolean f25930D;

    /* renamed from: E */
    protected int f25931E;

    /* renamed from: F */
    protected int f25932F;

    /* renamed from: G */
    protected int f25933G;

    /* renamed from: H */
    protected int f25934H;

    /* renamed from: I */
    protected Object f25935I;

    /* renamed from: J */
    protected LinkedList<C7089a> f25936J = null;

    /* renamed from: K */
    protected LinkedList<C7089a> f25937K = null;

    /* renamed from: L */
    private C7073g f25938L;

    /* renamed from: a */
    public int f25939a;

    /* renamed from: b */
    public int f25940b;

    /* renamed from: c */
    public int f25941c;

    /* renamed from: d */
    public int f25942d;

    /* renamed from: e */
    public int f25943e;

    /* renamed from: f */
    public int f25944f;

    /* renamed from: g */
    public int f25945g;

    /* renamed from: h */
    public int f25946h;

    /* renamed from: i */
    public int f25947i;

    /* renamed from: j */
    public int f25948j;

    /* renamed from: k */
    public int f25949k;

    /* renamed from: l */
    protected C7065i f25950l;

    /* renamed from: m */
    protected C7056e f25951m;

    /* renamed from: n */
    protected int f25952n;

    /* renamed from: o */
    protected boolean f25953o;

    /* renamed from: p */
    protected boolean f25954p;

    /* renamed from: q */
    protected boolean f25955q;

    /* renamed from: r */
    protected float f25956r;

    /* renamed from: s */
    protected float f25957s;

    /* renamed from: t */
    protected boolean f25958t;

    /* renamed from: u */
    protected boolean f25959u;

    /* renamed from: v */
    protected boolean f25960v;

    /* renamed from: w */
    protected int[] f25961w = null;

    /* renamed from: x */
    protected IntBuffer f25962x = null;

    /* renamed from: y */
    protected int[] f25963y = null;

    /* renamed from: z */
    protected IntBuffer f25964z = null;

    /* renamed from: e.f.l$a */
    /* compiled from: Texture */
    protected class C7089a {

        /* renamed from: a */
        int f25965a;

        /* renamed from: b */
        int f25966b;

        /* renamed from: c */
        IntBuffer f25967c;
    }

    /* renamed from: e.f.l$b */
    /* compiled from: Texture */
    public static class C7090b {

        /* renamed from: a */
        public int f25968a;

        /* renamed from: b */
        public int f25969b;

        /* renamed from: c */
        public int f25970c;

        /* renamed from: d */
        public boolean f25971d;

        /* renamed from: e */
        public int f25972e;

        /* renamed from: f */
        public int f25973f;

        public C7090b() {
            this.f25968a = 0;
            this.f25969b = 2;
            this.f25970c = 4;
            this.f25971d = true;
            this.f25972e = 0;
            this.f25973f = 0;
        }

        public C7090b(int i, int i2, boolean z) {
            this.f25968a = 0;
            this.f25969b = i;
            this.f25971d = z;
            if (i2 != 5 || z) {
                this.f25970c = i2;
            } else {
                this.f25970c = 4;
            }
            this.f25972e = 0;
            this.f25973f = 0;
        }

        public C7090b(int i, int i2, boolean z, int i3) {
            this.f25968a = 0;
            this.f25969b = i;
            this.f25971d = z;
            if (i2 != 5 || z) {
                this.f25970c = i2;
            } else {
                this.f25970c = 4;
            }
            this.f25972e = i3;
            this.f25973f = i3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo22872i() {
    }

    public C7088l(C7065i iVar) {
        this.f25950l = iVar;
        this.f25951m = iVar.f25493a;
        this.f25952n = this.f25951m.mo22206A();
        this.f25953o = false;
        this.f25941c = 0;
    }

    public C7088l(C7065i iVar, int i, int i2, Object obj) {
        this.f25950l = iVar;
        this.f25951m = iVar.f25493a;
        this.f25952n = this.f25951m.mo22206A();
        this.f25953o = false;
        this.f25941c = 0;
        mo22846a(i, i2, (C7090b) obj);
    }

    /* renamed from: a */
    public void mo22843a(int i, int i2) {
        C7090b bVar;
        if (this.f25941c > 0) {
            bVar = mo22881r();
        } else {
            bVar = new C7090b();
        }
        mo22846a(i, i2, bVar);
    }

    /* renamed from: a */
    public void mo22846a(int i, int i2, C7090b bVar) {
        mo22847a(bVar);
        mo22859b(i, i2);
        mo22875l();
    }

    /* renamed from: a */
    public void mo22845a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f25939a = i;
        this.f25940b = i2;
        this.f25941c = i3;
        this.f25942d = i4;
        this.f25943e = i5;
        this.f25948j = i6;
        this.f25949k = i7;
        this.f25944f = i8;
        this.f25945g = i9;
        this.f25946h = i10;
        this.f25947i = i11;
        this.f25956r = ((float) i) / ((float) i6);
        this.f25957s = ((float) i2) / ((float) i7);
        boolean z = false;
        this.f25954p = i8 == C7056e.f25171cT || i8 == C7056e.f25172cU;
        if (i10 == C7056e.f25174cW || i11 == C7056e.f25174cW) {
            z = true;
        }
        this.f25955q = z;
    }

    /* renamed from: a */
    public void mo22854a(int[] iArr, int i) {
        mo22857a(iArr, 0, 0, this.f25939a, this.f25940b, i);
    }

    /* renamed from: a */
    public void mo22857a(int[] iArr, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int[] iArr2 = iArr;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if (iArr2 == null) {
            C6989c.m36558a("The pixels array is null.");
            return;
        }
        int i10 = i8 * i9;
        if (iArr2.length < i10) {
            StringBuilder sb = new StringBuilder();
            sb.append("The pixel array has a length of ");
            sb.append(iArr2.length);
            sb.append(", but it should be at least ");
            sb.append(i10);
            C6989c.m36558a(sb.toString());
        } else if (iArr2.length != 0 && i8 != 0 && i9 != 0) {
            if (!this.f25951m.mo22345g(this.f25942d)) {
                this.f25951m.mo22330e(this.f25942d);
                z = true;
            } else {
                z = false;
            }
            this.f25951m.mo22321d(this.f25942d, this.f25941c);
            mo22842a(i10);
            mo22855a(iArr2, i5, i8, i9);
            if (this.f25959u) {
                mo22862b(this.f25961w, 1);
            }
            if (this.f25960v) {
                mo22865c(this.f25961w, 1);
            }
            mo22853a(this.f25961w);
            this.f25951m.mo22299b(this.f25942d, 0, i, i2, i3, i4, C7056e.f25150by, C7056e.f25147bv, this.f25962x);
            mo22863c(i6, i7, i8, i9);
            if (this.f25954p) {
                if (C7065i.f25455cE) {
                    this.f25951m.mo22211C(this.f25942d);
                } else {
                    mo22872i();
                }
            }
            this.f25951m.mo22321d(this.f25942d, 0);
            if (z) {
                this.f25951m.mo22336f(this.f25942d);
            }
            mo22879p();
            mo22880q();
            mo22844a(i6, i7, i8, i9);
        }
    }

    /* renamed from: a */
    public void mo22856a(int[] iArr, int i, int i2, int i3, int i4) {
        mo22853a(iArr);
        mo22850a(this.f25962x, i, i2, i3, i4);
        mo22879p();
    }

    /* renamed from: a */
    public void mo22850a(IntBuffer intBuffer, int i, int i2, int i3, int i4) {
        boolean z;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (intBuffer == null) {
            C6989c.m36558a("The pixel buffer is null.");
            return;
        }
        int i9 = i7 * i8;
        if (intBuffer.capacity() < i9) {
            StringBuilder sb = new StringBuilder();
            sb.append("The pixel bufer has a length of ");
            sb.append(intBuffer.capacity());
            sb.append(", but it should be at least ");
            sb.append(i9);
            C6989c.m36558a(sb.toString());
        } else if (intBuffer.capacity() != 0) {
            if (!this.f25951m.mo22345g(this.f25942d)) {
                this.f25951m.mo22330e(this.f25942d);
                z = true;
            } else {
                z = false;
            }
            this.f25951m.mo22321d(this.f25942d, this.f25941c);
            this.f25951m.mo22299b(this.f25942d, 0, i, i2, i3, i4, C7056e.f25150by, C7056e.f25147bv, intBuffer);
            mo22863c(i5, i6, i7, i8);
            if (this.f25954p) {
                if (C7065i.f25455cE) {
                    this.f25951m.mo22211C(this.f25942d);
                } else {
                    mo22872i();
                }
            }
            this.f25951m.mo22321d(this.f25942d, 0);
            if (z) {
                this.f25951m.mo22336f(this.f25942d);
            }
            mo22844a(i5, i6, i7, i8);
        }
    }

    /* renamed from: a */
    public void mo22848a(C7088l lVar) {
        mo22849a(lVar, 0, 0, lVar.f25939a, lVar.f25940b, false);
    }

    /* renamed from: a */
    public void mo22852a(boolean z, int i) {
        int i2 = this.f25945g;
        int i3 = this.f25944f;
        if (!z) {
            this.f25954p = false;
            if (i == 2) {
                this.f25945g = C7056e.f25169cR;
                this.f25944f = C7056e.f25169cR;
            } else if (i == 3) {
                this.f25945g = C7056e.f25169cR;
                this.f25944f = C7056e.f25170cS;
            } else if (i == 4 || i == 5) {
                this.f25945g = C7056e.f25170cS;
                this.f25944f = C7056e.f25170cS;
            } else {
                throw new RuntimeException("Unknown texture filtering mode");
            }
        } else if (i == 2) {
            this.f25945g = C7056e.f25169cR;
            this.f25944f = C7056e.f25169cR;
            this.f25954p = false;
        } else if (i == 3) {
            this.f25945g = C7056e.f25169cR;
            this.f25944f = C7056e.f25348k ? C7056e.f25171cT : C7056e.f25170cS;
            this.f25954p = true;
        } else if (i == 4) {
            this.f25945g = C7056e.f25170cS;
            this.f25944f = C7056e.f25348k ? C7056e.f25171cT : C7056e.f25170cS;
            this.f25954p = true;
        } else if (i == 5) {
            this.f25945g = C7056e.f25170cS;
            this.f25944f = C7056e.f25348k ? C7056e.f25172cU : C7056e.f25170cS;
            this.f25954p = true;
        } else {
            throw new RuntimeException("Unknown texture filtering mode");
        }
        if (i2 != this.f25945g || i3 != this.f25944f) {
            mo22869f();
            this.f25951m.mo22311c(this.f25942d, C7056e.f25231db, this.f25944f);
            this.f25951m.mo22311c(this.f25942d, C7056e.f25232dc, this.f25945g);
            if (this.f25954p) {
                if (C7065i.f25455cE) {
                    this.f25951m.mo22211C(this.f25942d);
                } else {
                    mo22872i();
                }
            }
            mo22870g();
        }
    }

    /* renamed from: a */
    public void mo22851a(boolean z) {
        if (z) {
            this.f25946h = C7056e.f25174cW;
            this.f25947i = C7056e.f25174cW;
            this.f25955q = true;
        } else {
            this.f25946h = C7056e.f25173cV;
            this.f25947i = C7056e.f25173cV;
            this.f25955q = false;
        }
        mo22869f();
        this.f25951m.mo22311c(this.f25942d, C7056e.f25233dd, this.f25946h);
        this.f25951m.mo22311c(this.f25942d, C7056e.f25234de, this.f25947i);
        mo22870g();
    }

    /* renamed from: a */
    public float mo22841a() {
        return this.f25956r;
    }

    /* renamed from: b */
    public float mo22858b() {
        return this.f25957s;
    }

    /* renamed from: c */
    public boolean mo22866c() {
        return this.f25959u;
    }

    /* renamed from: d */
    public boolean mo22867d() {
        return this.f25960v;
    }

    /* renamed from: b */
    public void mo22861b(boolean z) {
        this.f25960v = z;
    }

    /* renamed from: e */
    public int mo22868e() {
        if (this.f25945g == C7056e.f25169cR && this.f25944f == C7056e.f25169cR) {
            return 2;
        }
        if (this.f25945g == C7056e.f25169cR) {
            if (this.f25944f == (C7056e.f25348k ? C7056e.f25171cT : C7056e.f25170cS)) {
                return 3;
            }
        }
        if (this.f25945g == C7056e.f25170cS) {
            if (this.f25944f == (C7056e.f25348k ? C7056e.f25171cT : C7056e.f25170cS)) {
                return 4;
            }
        }
        return (this.f25945g == C7056e.f25170cS && this.f25944f == C7056e.f25172cU) ? 5 : -1;
    }

    /* renamed from: f */
    public void mo22869f() {
        if (!this.f25951m.mo22345g(this.f25942d)) {
            this.f25951m.mo22330e(this.f25942d);
        }
        this.f25951m.mo22321d(this.f25942d, this.f25941c);
        this.f25958t = true;
    }

    /* renamed from: g */
    public void mo22870g() {
        if (this.f25951m.mo22288a(this.f25942d, this.f25941c)) {
            if (!this.f25951m.mo22345g(this.f25942d)) {
                this.f25951m.mo22330e(this.f25942d);
                this.f25951m.mo22321d(this.f25942d, 0);
                this.f25951m.mo22336f(this.f25942d);
            } else {
                this.f25951m.mo22321d(this.f25942d, 0);
            }
        }
        this.f25958t = false;
    }

    /* renamed from: h */
    public void mo22871h() {
        mo22860b(0, 0, this.f25939a, this.f25940b);
    }

    /* renamed from: a */
    public void mo22844a(int i, int i2, int i3, int i4) {
        mo22860b(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22860b(int i, int i2, int i3, int i4) {
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (!this.f25930D) {
            this.f25931E = C6982a.m36420c(0, i);
            this.f25933G = C6982a.m36422d(this.f25939a - 1, i5);
            this.f25932F = C6982a.m36420c(0, i2);
            this.f25934H = C6982a.m36422d(this.f25940b - 1, i6);
            this.f25930D = true;
            return;
        }
        if (i < this.f25931E) {
            this.f25931E = C6982a.m36420c(0, i);
        }
        if (i > this.f25933G) {
            this.f25933G = C6982a.m36422d(this.f25939a - 1, i);
        }
        if (i2 < this.f25932F) {
            this.f25932F = C6982a.m36420c(0, i2);
        }
        if (i2 > this.f25934H) {
            this.f25934H = i2;
        }
        if (i5 < this.f25931E) {
            this.f25931E = C6982a.m36420c(0, i5);
        }
        if (i5 > this.f25933G) {
            this.f25933G = C6982a.m36422d(this.f25939a - 1, i5);
        }
        if (i6 < this.f25932F) {
            this.f25932F = C6982a.m36420c(0, i6);
        }
        if (i6 > this.f25934H) {
            this.f25934H = C6982a.m36422d(this.f25940b - 1, i6);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22842a(int i) {
        if (this.f25961w == null || this.f25961w.length < i) {
            this.f25961w = new int[i];
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22853a(int[] iArr) {
        this.f25962x = C7056e.m37107a(this.f25962x, iArr, true);
        this.f25928B++;
    }

    /* renamed from: j */
    public boolean mo22873j() {
        return (this.f25935I == null || this.f25936J == null || this.f25936J.size() <= 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo22874k() {
        C7089a aVar;
        try {
            aVar = (C7089a) this.f25936J.remove(0);
        } catch (NoSuchElementException unused) {
            C6989c.m36558a("Don't have pixel data to copy to texture");
            aVar = null;
        }
        if (aVar == null) {
            return false;
        }
        if (!(aVar.f25965a == this.f25939a && aVar.f25966b == this.f25940b)) {
            mo22843a(aVar.f25965a, aVar.f25966b);
        }
        aVar.f25967c.rewind();
        mo22850a(aVar.f25967c, 0, 0, this.f25939a, this.f25940b);
        if (this.f25937K == null) {
            this.f25937K = new LinkedList<>();
        }
        this.f25937K.add(aVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22862b(int[] iArr, int i) {
        int i2 = (this.f25939a - 1) * i;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25939a / 2; i4++) {
            for (int i5 = 0; i5 < this.f25940b; i5++) {
                int i6 = i * i5;
                int i7 = (this.f25939a * i6) + i3;
                int i8 = (i6 * this.f25939a) + i2;
                for (int i9 = 0; i9 < i; i9++) {
                    int i10 = iArr[i7];
                    iArr[i7] = iArr[i8];
                    iArr[i8] = i10;
                    i7++;
                    i8++;
                }
            }
            i3 += i;
            i2 -= i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22865c(int[] iArr, int i) {
        int i2 = (this.f25940b - 1) * i * this.f25939a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f25940b / 2) {
            int i5 = i2;
            int i6 = i4;
            for (int i7 = 0; i7 < this.f25939a * i; i7++) {
                int i8 = iArr[i6];
                iArr[i6] = iArr[i5];
                iArr[i5] = i8;
                i6++;
                i5++;
            }
            i3++;
            int i9 = i6;
            i2 = i5 - ((this.f25939a * i) * 2);
            i4 = i9;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22855a(int[] r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            boolean r6 = p256e.p262f.C7056e.f25102aV
            r7 = 4
            r0 = 0
            if (r6 == 0) goto L_0x003e
            if (r5 == r7) goto L_0x0030
            switch(r5) {
                case 1: goto L_0x0020;
                case 2: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x008f
        L_0x000d:
            int r5 = r4.length
            if (r0 >= r5) goto L_0x008f
            r5 = r4[r0]
            int[] r6 = r3.f25961w
            int r7 = r5 << 8
            int r5 = r5 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r7
            r6[r0] = r5
            int r0 = r0 + 1
            goto L_0x000d
        L_0x0020:
            int r5 = r4.length
            if (r0 >= r5) goto L_0x008f
            r5 = r4[r0]
            int[] r6 = r3.f25961w
            int r5 = r5 << 8
            r5 = r5 | 255(0xff, float:3.57E-43)
            r6[r0] = r5
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0030:
            int r5 = r4.length
            if (r0 >= r5) goto L_0x008f
            int[] r5 = r3.f25961w
            r6 = r4[r0]
            r6 = r6 | -256(0xffffffffffffff00, float:NaN)
            r5[r0] = r6
            int r0 = r0 + 1
            goto L_0x0030
        L_0x003e:
            if (r5 == r7) goto L_0x007d
            r6 = 16711680(0xff0000, float:2.3418052E-38)
            switch(r5) {
                case 1: goto L_0x0060;
                case 2: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x008f
        L_0x0046:
            int r5 = r4.length
            if (r0 >= r5) goto L_0x008f
            r5 = r4[r0]
            int[] r7 = r3.f25961w
            r1 = r5 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r2 = r5 & r6
            int r2 = r2 >> 16
            r1 = r1 | r2
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r5 = r5 & r2
            r5 = r5 | r1
            r7[r0] = r5
            int r0 = r0 + 1
            goto L_0x0046
        L_0x0060:
            int r5 = r4.length
            if (r0 >= r5) goto L_0x008f
            r5 = r4[r0]
            int[] r7 = r3.f25961w
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            r2 = r5 & r6
            int r2 = r2 >> 16
            r1 = r1 | r2
            r2 = 65280(0xff00, float:9.1477E-41)
            r5 = r5 & r2
            r5 = r5 | r1
            r7[r0] = r5
            int r0 = r0 + 1
            goto L_0x0060
        L_0x007d:
            int r5 = r4.length
            if (r0 >= r5) goto L_0x008f
            int[] r5 = r3.f25961w
            r6 = r4[r0]
            int r6 = r6 << 24
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 | r7
            r5[r0] = r6
            int r0 = r0 + 1
            goto L_0x007d
        L_0x008f:
            int r4 = r3.f25929C
            int r4 = r4 + 1
            r3.f25929C = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p262f.C7088l.mo22855a(int[], int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22859b(int i, int i2) {
        this.f25939a = i;
        this.f25940b = i2;
        if (C7065i.f25454cD) {
            this.f25948j = i;
            this.f25949k = i2;
        } else {
            this.f25948j = C7056e.m37126h(i);
            this.f25949k = C7056e.m37126h(i2);
        }
        if (this.f25948j > C7065i.f25462cL || this.f25949k > C7065i.f25462cL) {
            this.f25949k = 0;
            this.f25948j = 0;
            StringBuilder sb = new StringBuilder();
            sb.append("Image width and height cannot be larger than ");
            sb.append(C7065i.f25462cL);
            sb.append(" with this graphics card.");
            throw new RuntimeException(sb.toString());
        }
        this.f25956r = ((float) this.f25939a) / ((float) this.f25948j);
        this.f25957s = ((float) this.f25940b) / ((float) this.f25949k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo22875l() {
        boolean z;
        mo22876m();
        if (!this.f25951m.mo22345g(this.f25942d)) {
            this.f25951m.mo22330e(this.f25942d);
            z = true;
        } else {
            z = false;
        }
        this.f25952n = this.f25951m.mo22208B();
        this.f25938L = new C7073g(this);
        this.f25951m.mo22321d(this.f25942d, this.f25941c);
        this.f25951m.mo22311c(this.f25942d, C7056e.f25231db, this.f25944f);
        this.f25951m.mo22311c(this.f25942d, C7056e.f25232dc, this.f25945g);
        this.f25951m.mo22311c(this.f25942d, C7056e.f25233dd, this.f25946h);
        this.f25951m.mo22311c(this.f25942d, C7056e.f25234de, this.f25947i);
        if (C7065i.f25458cH) {
            this.f25951m.mo22264a(this.f25942d, C7056e.f25162cK, C7065i.f25464cN);
        }
        this.f25951m.mo22272a(this.f25942d, 0, this.f25943e, this.f25948j, this.f25949k, 0, C7056e.f25150by, C7056e.f25147bv, null);
        this.f25951m.mo22266a(this.f25942d, C7056e.f25150by, this.f25939a, this.f25940b);
        this.f25951m.mo22321d(this.f25942d, 0);
        if (z) {
            this.f25951m.mo22336f(this.f25942d);
        }
        this.f25958t = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo22876m() {
        if (this.f25938L != null) {
            this.f25938L.mo22504a();
            this.f25938L = null;
            this.f25941c = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo22877n() {
        boolean z = !this.f25951m.mo22328d(this.f25952n);
        if (z) {
            mo22876m();
        }
        return z;
    }

    /* renamed from: c */
    public void mo22864c(boolean z) {
        this.f25953o = z;
    }

    /* renamed from: o */
    public boolean mo22878o() {
        return this.f25953o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22849a(C7088l lVar, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        C7088l lVar2 = lVar;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if (lVar2 != null) {
            if (this.f25927A == null) {
                this.f25927A = new C7051b(this.f25950l, this.f25948j, this.f25949k);
            }
            this.f25927A.mo22173a(this);
            this.f25927A.mo22176c();
            this.f25950l.mo22446an();
            this.f25950l.mo22416a(this.f25927A);
            this.f25950l.mo21924S();
            this.f25950l.mo21989h(0);
            if (z) {
                int i10 = i9;
                int i11 = i7;
                this.f25951m.mo22271a(lVar2.f25942d, lVar2.f25941c, lVar2.f25948j, lVar2.f25949k, 0, 0, this.f25927A.f25024i, this.f25927A.f25025j, 1, i, i2, i6 + i8, i7 + i10, 0, 0, this.f25939a, this.f25940b);
                i5 = i;
            } else {
                int i12 = i7;
                i5 = i;
                int i13 = i5 + i3;
                int i14 = i12 + i4;
                int i15 = i14;
                int i16 = i;
                int i17 = i2;
                this.f25951m.mo22271a(lVar2.f25942d, lVar2.f25941c, lVar2.f25948j, lVar2.f25949k, 0, 0, this.f25927A.f25024i, this.f25927A.f25025j, 1, i16, i17, i13, i14, i, i2, i13, i15);
            }
            this.f25951m.mo22244T();
            this.f25950l.mo21925T();
            this.f25950l.mo22447ao();
            mo22844a(i5, i2, i3, i4);
            return;
        }
        throw new RuntimeException("Source texture is null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22879p() {
        double freeMemory = ((double) Runtime.getRuntime().freeMemory()) / 1000000.0d;
        if (this.f25928B < 10 || freeMemory < 5.0d) {
            this.f25962x = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo22880q() {
        double freeMemory = ((double) Runtime.getRuntime().freeMemory()) / 1000000.0d;
        if (this.f25929C < 10 || freeMemory < 5.0d) {
            this.f25961w = null;
        }
    }

    /* renamed from: r */
    public C7090b mo22881r() {
        C7090b bVar = new C7090b();
        if (this.f25942d == C7056e.f25157cF) {
            bVar.f25968a = 0;
        }
        if (this.f25943e == C7056e.f25149bx) {
            bVar.f25969b = 1;
        } else if (this.f25943e == C7056e.f25150by) {
            bVar.f25969b = 2;
        } else if (this.f25943e == C7056e.f25151bz) {
            bVar.f25969b = 4;
        }
        if (this.f25945g == C7056e.f25169cR && this.f25944f == C7056e.f25169cR) {
            bVar.f25970c = 2;
            bVar.f25971d = false;
        } else if (this.f25945g == C7056e.f25169cR && this.f25944f == C7056e.f25170cS) {
            bVar.f25970c = 3;
            bVar.f25971d = false;
        } else if (this.f25945g == C7056e.f25169cR && this.f25944f == C7056e.f25171cT) {
            bVar.f25970c = 3;
            bVar.f25971d = true;
        } else if (this.f25945g == C7056e.f25170cS && this.f25944f == C7056e.f25170cS) {
            bVar.f25970c = 4;
            bVar.f25971d = false;
        } else if (this.f25945g == C7056e.f25170cS && this.f25944f == C7056e.f25171cT) {
            bVar.f25970c = 4;
            bVar.f25971d = true;
        } else if (this.f25945g == C7056e.f25170cS && this.f25944f == C7056e.f25172cU) {
            bVar.f25970c = 5;
            bVar.f25971d = true;
        }
        if (this.f25946h == C7056e.f25173cV) {
            bVar.f25972e = 0;
        } else if (this.f25946h == C7056e.f25174cW) {
            bVar.f25972e = 1;
        }
        if (this.f25947i == C7056e.f25173cV) {
            bVar.f25973f = 0;
        } else if (this.f25947i == C7056e.f25174cW) {
            bVar.f25973f = 1;
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22847a(C7090b bVar) {
        if (bVar.f25968a == 0) {
            this.f25942d = C7056e.f25157cF;
            boolean z = true;
            if (bVar.f25969b == 1) {
                this.f25943e = C7056e.f25149bx;
            } else if (bVar.f25969b == 2) {
                this.f25943e = C7056e.f25150by;
            } else if (bVar.f25969b == 4) {
                this.f25943e = C7056e.f25151bz;
            } else {
                throw new RuntimeException("Unknown texture format");
            }
            boolean z2 = bVar.f25971d && C7056e.f25348k;
            if (z2 && !C7065i.f25455cE) {
                C6989c.m36558a("Mipmaps were requested but automatic mipmap generation is not supported and manual generation still not implemented, so mipmaps will be disabled.");
                z2 = false;
            }
            if (bVar.f25970c == 2) {
                this.f25945g = C7056e.f25169cR;
                this.f25944f = C7056e.f25169cR;
            } else if (bVar.f25970c == 3) {
                this.f25945g = C7056e.f25169cR;
                this.f25944f = z2 ? C7056e.f25171cT : C7056e.f25170cS;
            } else if (bVar.f25970c == 4) {
                this.f25945g = C7056e.f25170cS;
                this.f25944f = z2 ? C7056e.f25171cT : C7056e.f25170cS;
            } else if (bVar.f25970c == 5) {
                this.f25945g = C7056e.f25170cS;
                this.f25944f = z2 ? C7056e.f25172cU : C7056e.f25170cS;
            } else {
                throw new RuntimeException("Unknown texture filtering mode");
            }
            if (bVar.f25972e == 0) {
                this.f25946h = C7056e.f25173cV;
            } else if (bVar.f25972e == 1) {
                this.f25946h = C7056e.f25174cW;
            } else {
                throw new RuntimeException("Unknown wrapping mode");
            }
            if (bVar.f25973f == 0) {
                this.f25947i = C7056e.f25173cV;
            } else if (bVar.f25973f == 1) {
                this.f25947i = C7056e.f25174cW;
            } else {
                throw new RuntimeException("Unknown wrapping mode");
            }
            this.f25954p = this.f25944f == C7056e.f25171cT || this.f25944f == C7056e.f25172cU;
            if (!(this.f25946h == C7056e.f25174cW || this.f25947i == C7056e.f25174cW)) {
                z = false;
            }
            this.f25955q = z;
            this.f25959u = false;
            this.f25960v = false;
            return;
        }
        throw new RuntimeException("Unknown texture target");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22863c(int i, int i2, int i3, int i4) {
        boolean z;
        int i5 = i3;
        int i6 = i4;
        if (this.f25939a < this.f25948j || this.f25940b < this.f25949k) {
            int i7 = i + i5;
            if (i7 == this.f25939a || i2 + i6 == this.f25940b) {
                if (i7 == this.f25939a) {
                    int i8 = this.f25948j - this.f25939a;
                    this.f25963y = new int[(i6 * i8)];
                    int i9 = 0;
                    while (i9 < i6) {
                        int i10 = this.f25961w[(i9 * i5) + (i5 - 1)];
                        int i11 = i9 * i8;
                        i9++;
                        Arrays.fill(this.f25963y, i11, i9 * i8, i10);
                    }
                    this.f25964z = C7056e.m37107a(this.f25964z, this.f25963y, true);
                    this.f25951m.mo22299b(this.f25942d, 0, this.f25939a, i2, i8, i4, C7056e.f25150by, C7056e.f25147bv, this.f25964z);
                }
                int i12 = i2 + i6;
                if (i12 == this.f25940b) {
                    int i13 = this.f25949k - this.f25940b;
                    this.f25963y = new int[(i13 * i5)];
                    for (int i14 = 0; i14 < i13; i14++) {
                        System.arraycopy(this.f25961w, (i6 - 1) * i5, this.f25963y, i14 * i5, i5);
                    }
                    this.f25964z = C7056e.m37107a(this.f25964z, this.f25963y, true);
                    z = true;
                    this.f25951m.mo22299b(this.f25942d, 0, i, this.f25940b, i3, i13, C7056e.f25150by, C7056e.f25147bv, this.f25964z);
                } else {
                    z = true;
                }
                if (i7 == this.f25939a && i12 == this.f25940b) {
                    int i15 = this.f25948j - this.f25939a;
                    int i16 = this.f25949k - this.f25940b;
                    int i17 = this.f25961w[(i5 * i6) - (z ? 1 : 0)];
                    int i18 = i16 * i15;
                    this.f25963y = new int[i18];
                    Arrays.fill(this.f25963y, 0, i18, i17);
                    this.f25964z = C7056e.m37107a(this.f25964z, this.f25963y, z);
                    this.f25951m.mo22299b(this.f25942d, 0, this.f25939a, this.f25940b, i15, i16, C7056e.f25150by, C7056e.f25147bv, this.f25964z);
                }
            }
        }
    }
}
