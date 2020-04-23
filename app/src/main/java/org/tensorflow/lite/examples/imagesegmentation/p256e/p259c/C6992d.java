package p256e.p259c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p072v8.renderscript.Allocation;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: e.c.d */
/* compiled from: PImage */
public class C6992d implements Cloneable {

    /* renamed from: cr */
    static byte[] f24747cr;

    /* renamed from: cc */
    public int f24748cc;

    /* renamed from: cd */
    public int[] f24749cd;

    /* renamed from: ce */
    public int f24750ce;

    /* renamed from: cf */
    public int f24751cf;

    /* renamed from: cg */
    public int f24752cg;

    /* renamed from: ch */
    public int f24753ch;

    /* renamed from: ci */
    public int f24754ci;

    /* renamed from: cj */
    public C6982a f24755cj;

    /* renamed from: ck */
    protected Bitmap f24756ck;

    /* renamed from: cl */
    protected boolean f24757cl;

    /* renamed from: cm */
    protected int f24758cm;

    /* renamed from: cn */
    protected int f24759cn;

    /* renamed from: co */
    protected int f24760co;

    /* renamed from: cp */
    protected int f24761cp;

    /* renamed from: cq */
    public boolean f24762cq;

    public C6992d() {
        this.f24752cg = 1;
        this.f24762cq = false;
        this.f24748cc = 2;
    }

    public C6992d(int i, int i2) {
        this.f24752cg = 1;
        this.f24762cq = false;
        mo22030b(i, i2, 1);
    }

    public C6992d(int i, int i2, int i3) {
        this.f24752cg = 1;
        this.f24762cq = false;
        mo22030b(i, i2, i3);
    }

    /* renamed from: b */
    public void mo22030b(int i, int i2, int i3) {
        this.f24750ce = i;
        this.f24751cf = i2;
        this.f24749cd = new int[(i * i2)];
        this.f24748cc = i3;
        this.f24753ch = i * this.f24752cg;
        this.f24754ci = i2 * this.f24752cg;
        this.f24749cd = new int[(this.f24753ch * this.f24754ci)];
    }

    public C6992d(Object obj) {
        this.f24752cg = 1;
        this.f24762cq = false;
        Bitmap bitmap = (Bitmap) obj;
        this.f24756ck = bitmap;
        this.f24750ce = bitmap.getWidth();
        this.f24751cf = bitmap.getHeight();
        this.f24749cd = null;
        this.f24748cc = bitmap.hasAlpha() ? 2 : 1;
        this.f24752cg = 1;
        this.f24753ch = this.f24750ce;
        this.f24754ci = this.f24751cf;
    }

    /* renamed from: af */
    public Object mo22021af() {
        return this.f24756ck;
    }

    /* renamed from: a */
    public void mo22019a(Object obj) {
        this.f24756ck = (Bitmap) obj;
    }

    /* renamed from: ag */
    public boolean mo22022ag() {
        return this.f24757cl;
    }

    /* renamed from: ah */
    public void mo22023ah() {
        this.f24757cl = true;
    }

    /* renamed from: b */
    public void mo22031b(boolean z) {
        this.f24757cl = z;
    }

    /* renamed from: ai */
    public int mo22024ai() {
        return this.f24758cm;
    }

    /* renamed from: aj */
    public int mo22025aj() {
        return this.f24760co;
    }

    /* renamed from: ak */
    public int mo22026ak() {
        return this.f24759cn;
    }

    /* renamed from: al */
    public int mo22027al() {
        return this.f24761cp;
    }

    /* renamed from: p */
    public void mo21747p() {
        if (this.f24749cd == null || this.f24749cd.length != this.f24750ce * this.f24751cf) {
            this.f24749cd = new int[(this.f24750ce * this.f24751cf)];
        }
        if (this.f24756ck != null) {
            if (this.f24757cl) {
                if (!this.f24756ck.isMutable()) {
                    this.f24756ck = this.f24756ck.copy(Config.ARGB_8888, true);
                }
                this.f24756ck.setPixels(this.f24749cd, 0, this.f24750ce, this.f24758cm, this.f24759cn, this.f24760co - this.f24758cm, this.f24761cp - this.f24759cn);
                this.f24757cl = false;
            } else {
                this.f24756ck.getPixels(this.f24749cd, 0, this.f24750ce, 0, 0, this.f24750ce, this.f24751cf);
            }
        }
        mo22028am();
    }

    /* renamed from: q */
    public void mo21748q() {
        mo22017a(0, 0, this.f24750ce, this.f24751cf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22017a(int i, int i2, int i3, int i4) {
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (!this.f24757cl) {
            this.f24758cm = C6982a.m36420c(0, i);
            this.f24760co = C6982a.m36422d(this.f24750ce, i5);
            this.f24759cn = C6982a.m36420c(0, i2);
            this.f24761cp = C6982a.m36422d(this.f24751cf, i6);
            this.f24757cl = true;
            return;
        }
        if (i < this.f24758cm) {
            this.f24758cm = C6982a.m36420c(0, i);
        }
        if (i > this.f24760co) {
            this.f24760co = C6982a.m36422d(this.f24750ce, i);
        }
        if (i2 < this.f24759cn) {
            this.f24759cn = C6982a.m36420c(0, i2);
        }
        if (i2 > this.f24761cp) {
            this.f24761cp = C6982a.m36422d(this.f24751cf, i2);
        }
        if (i5 < this.f24758cm) {
            this.f24758cm = C6982a.m36420c(0, i5);
        }
        if (i5 > this.f24760co) {
            this.f24760co = C6982a.m36422d(this.f24750ce, i5);
        }
        if (i6 < this.f24759cn) {
            this.f24759cn = C6982a.m36420c(0, i6);
        }
        if (i6 > this.f24761cp) {
            this.f24761cp = C6982a.m36422d(this.f24751cf, i6);
        }
    }

    public Object clone() {
        return mo21752u();
    }

    /* renamed from: am */
    public void mo22028am() {
        this.f24762cq = true;
    }

    /* renamed from: b */
    public int mo21722b(int i, int i2) {
        if (i < 0 || i2 < 0 || i >= this.f24750ce || i2 >= this.f24751cf) {
            return 0;
        }
        if (this.f24749cd == null) {
            return this.f24756ck.getPixel(i, i2);
        }
        int i3 = this.f24748cc;
        if (i3 == 4) {
            return (this.f24749cd[(i2 * this.f24750ce) + i] << 24) | 16777215;
        }
        switch (i3) {
            case 1:
                return this.f24749cd[(i2 * this.f24750ce) + i] | -16777216;
            case 2:
                return this.f24749cd[(i2 * this.f24750ce) + i];
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public C6992d mo22029b(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11 = i;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        if (i11 < 0) {
            i5 = -i11;
            i7 = i13 + i11;
            i6 = 0;
            z = true;
        } else {
            i6 = i11;
            i7 = i13;
            z = false;
            i5 = 0;
        }
        if (i12 < 0) {
            i8 = -i12;
            i10 = i14 + i12;
            i9 = 0;
            z2 = true;
        } else {
            z2 = z;
            i8 = 0;
            i9 = i12;
            i10 = i14;
        }
        if (i6 + i7 > this.f24750ce) {
            i7 = this.f24750ce - i6;
            z2 = true;
        }
        if (i9 + i10 > this.f24751cf) {
            i10 = this.f24751cf - i9;
            z2 = true;
        }
        int i15 = i7 < 0 ? 0 : i7;
        int i16 = i10 < 0 ? 0 : i10;
        int i17 = this.f24748cc;
        if (z2 && this.f24748cc == 1) {
            i17 = 2;
        }
        C6992d dVar = new C6992d(i13, i14, i17);
        dVar.f24755cj = this.f24755cj;
        if (i15 > 0 && i16 > 0) {
            mo22018a(i6, i9, i15, i16, dVar, i5, i8);
            dVar.mo22019a((Object) Bitmap.createBitmap(dVar.f24749cd, i13, i14, Config.ARGB_8888));
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22018a(int i, int i2, int i3, int i4, C6992d dVar, int i5, int i6) {
        C6992d dVar2 = dVar;
        if (this.f24756ck != null) {
            this.f24756ck.getPixels(dVar2.f24749cd, (i6 * dVar2.f24750ce) + i5, dVar2.f24750ce, i, i2, i3, i4);
        } else if (this.f24749cd != null) {
            int i7 = (this.f24750ce * i2) + i;
            int i8 = i4;
            int i9 = (i6 * dVar2.f24750ce) + i5;
            for (int i10 = 0; i10 < i8; i10++) {
                System.arraycopy(this.f24749cd, i7, dVar2.f24749cd, i9, i3);
                i7 += this.f24750ce;
                i9 += dVar2.f24750ce;
            }
        }
    }

    /* renamed from: u */
    public C6992d mo21752u() {
        return mo22029b(0, 0, this.f24750ce, this.f24751cf);
    }

    /* renamed from: a */
    public void mo21716a(int i, int i2, int i3) {
        if (this.f24749cd == null) {
            this.f24756ck.setPixel(i, i2, i3);
        } else if (i >= 0 && i2 >= 0 && i < this.f24750ce && i2 < this.f24751cf) {
            this.f24749cd[(this.f24750ce * i2) + i] = i3;
            mo22017a(i, i2, 1, 1);
        }
    }

    static {
        byte[] bArr = new byte[Allocation.USAGE_SHARED];
        // fill-array-data instruction
        bArr[0] = 77;
        bArr[1] = 77;
        bArr[2] = 0;
        bArr[3] = 42;
        bArr[4] = 0;
        bArr[5] = 0;
        bArr[6] = 0;
        bArr[7] = 8;
        bArr[8] = 0;
        bArr[9] = 9;
        bArr[10] = 0;
        bArr[11] = -2;
        bArr[12] = 0;
        bArr[13] = 4;
        bArr[14] = 0;
        bArr[15] = 0;
        bArr[16] = 0;
        bArr[17] = 1;
        bArr[18] = 0;
        bArr[19] = 0;
        bArr[20] = 0;
        bArr[21] = 0;
        bArr[22] = 1;
        bArr[23] = 0;
        bArr[24] = 0;
        bArr[25] = 3;
        bArr[26] = 0;
        bArr[27] = 0;
        bArr[28] = 0;
        bArr[29] = 1;
        bArr[30] = 0;
        bArr[31] = 0;
        bArr[32] = 0;
        bArr[33] = 0;
        bArr[34] = 1;
        bArr[35] = 1;
        bArr[36] = 0;
        bArr[37] = 3;
        bArr[38] = 0;
        bArr[39] = 0;
        bArr[40] = 0;
        bArr[41] = 1;
        bArr[42] = 0;
        bArr[43] = 0;
        bArr[44] = 0;
        bArr[45] = 0;
        bArr[46] = 1;
        bArr[47] = 2;
        bArr[48] = 0;
        bArr[49] = 3;
        bArr[50] = 0;
        bArr[51] = 0;
        bArr[52] = 0;
        bArr[53] = 3;
        bArr[54] = 0;
        bArr[55] = 0;
        bArr[56] = 0;
        bArr[57] = 122;
        bArr[58] = 1;
        bArr[59] = 6;
        bArr[60] = 0;
        bArr[61] = 3;
        bArr[62] = 0;
        bArr[63] = 0;
        bArr[64] = 0;
        bArr[65] = 1;
        bArr[66] = 0;
        bArr[67] = 2;
        bArr[68] = 0;
        bArr[69] = 0;
        bArr[70] = 1;
        bArr[71] = 17;
        bArr[72] = 0;
        bArr[73] = 4;
        bArr[74] = 0;
        bArr[75] = 0;
        bArr[76] = 0;
        bArr[77] = 1;
        bArr[78] = 0;
        bArr[79] = 0;
        bArr[80] = 3;
        bArr[81] = 0;
        bArr[82] = 1;
        bArr[83] = 21;
        bArr[84] = 0;
        bArr[85] = 3;
        bArr[86] = 0;
        bArr[87] = 0;
        bArr[88] = 0;
        bArr[89] = 1;
        bArr[90] = 0;
        bArr[91] = 3;
        bArr[92] = 0;
        bArr[93] = 0;
        bArr[94] = 1;
        bArr[95] = 22;
        bArr[96] = 0;
        bArr[97] = 3;
        bArr[98] = 0;
        bArr[99] = 0;
        bArr[100] = 0;
        bArr[101] = 1;
        bArr[102] = 0;
        bArr[103] = 0;
        bArr[104] = 0;
        bArr[105] = 0;
        bArr[106] = 1;
        bArr[107] = 23;
        bArr[108] = 0;
        bArr[109] = 4;
        bArr[110] = 0;
        bArr[111] = 0;
        bArr[112] = 0;
        bArr[113] = 1;
        bArr[114] = 0;
        bArr[115] = 0;
        bArr[116] = 0;
        bArr[117] = 0;
        bArr[118] = 0;
        bArr[119] = 0;
        bArr[120] = 0;
        bArr[121] = 0;
        bArr[122] = 0;
        bArr[123] = 8;
        bArr[124] = 0;
        bArr[125] = 8;
        bArr[126] = 0;
        bArr[127] = 8;
        f24747cr = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22020a(OutputStream outputStream) {
        try {
            byte[] bArr = new byte[768];
            System.arraycopy(f24747cr, 0, bArr, 0, f24747cr.length);
            bArr[30] = (byte) ((this.f24750ce >> 8) & 255);
            bArr[31] = (byte) (this.f24750ce & 255);
            byte b = (byte) ((this.f24751cf >> 8) & 255);
            bArr[102] = b;
            bArr[42] = b;
            byte b2 = (byte) (this.f24751cf & 255);
            bArr[103] = b2;
            bArr[43] = b2;
            int i = this.f24750ce * this.f24751cf * 3;
            bArr[114] = (byte) ((i >> 24) & 255);
            bArr[115] = (byte) ((i >> 16) & 255);
            bArr[116] = (byte) ((i >> 8) & 255);
            bArr[117] = (byte) (i & 255);
            outputStream.write(bArr);
            for (int i2 = 0; i2 < this.f24749cd.length; i2++) {
                outputStream.write((this.f24749cd[i2] >> 16) & 255);
                outputStream.write((this.f24749cd[i2] >> 8) & 255);
                outputStream.write(this.f24749cd[i2] & 255);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r7 <= 1) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00eb A[Catch:{ IOException -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110 A[Catch:{ IOException -> 0x017f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22032b(java.io.OutputStream r13) {
        /*
            r12 = this;
            r0 = 18
            byte[] r0 = new byte[r0]
            int r1 = r12.f24748cc
            r2 = 40
            r3 = 4
            r4 = 17
            r5 = 8
            r6 = 16
            r7 = 2
            r8 = 1
            if (r1 != r3) goto L_0x001c
            r1 = 11
            r0[r7] = r1
            r0[r6] = r5
            r0[r4] = r2
            goto L_0x0037
        L_0x001c:
            int r1 = r12.f24748cc
            r9 = 32
            r10 = 10
            if (r1 != r8) goto L_0x002d
            r0[r7] = r10
            r1 = 24
            r0[r6] = r1
            r0[r4] = r9
            goto L_0x0037
        L_0x002d:
            int r1 = r12.f24748cc
            if (r1 != r7) goto L_0x0184
            r0[r7] = r10
            r0[r6] = r9
            r0[r4] = r2
        L_0x0037:
            r1 = 12
            int r2 = r12.f24750ce
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 13
            int r2 = r12.f24750ce
            int r2 = r2 >> r5
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 14
            int r2 = r12.f24751cf
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 15
            int r2 = r12.f24751cf
            int r2 = r2 >> r5
            byte r2 = (byte) r2
            r0[r1] = r2
            r1 = 0
            r13.write(r0)     // Catch:{ IOException -> 0x017f }
            int r0 = r12.f24751cf     // Catch:{ IOException -> 0x017f }
            int r2 = r12.f24750ce     // Catch:{ IOException -> 0x017f }
            int r0 = r0 * r2
            r2 = 128(0x80, float:1.794E-43)
            int[] r4 = new int[r2]     // Catch:{ IOException -> 0x017f }
            int r5 = r12.f24748cc     // Catch:{ IOException -> 0x017f }
            r6 = 3
            if (r5 != r3) goto L_0x00ca
            r3 = 0
        L_0x006d:
            if (r3 >= r0) goto L_0x017b
            int[] r5 = r12.f24749cd     // Catch:{ IOException -> 0x017f }
            r5 = r5[r3]     // Catch:{ IOException -> 0x017f }
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4[r1] = r5     // Catch:{ IOException -> 0x017f }
            r7 = 1
        L_0x0078:
            int r9 = r3 + r7
            if (r9 >= r0) goto L_0x008e
            int[] r10 = r12.f24749cd     // Catch:{ IOException -> 0x017f }
            r9 = r10[r9]     // Catch:{ IOException -> 0x017f }
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r5 != r9) goto L_0x008a
            if (r7 != r2) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            int r7 = r7 + 1
            goto L_0x0078
        L_0x008a:
            if (r7 <= r8) goto L_0x008e
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            if (r9 == 0) goto L_0x009b
            int r9 = r7 + -1
            r9 = r9 | r2
            r13.write(r9)     // Catch:{ IOException -> 0x017f }
            r13.write(r5)     // Catch:{ IOException -> 0x017f }
            goto L_0x00c8
        L_0x009b:
            r7 = r5
            r5 = 1
        L_0x009d:
            int r9 = r3 + r5
            if (r9 >= r0) goto L_0x00b7
            int[] r10 = r12.f24749cd     // Catch:{ IOException -> 0x017f }
            r9 = r10[r9]     // Catch:{ IOException -> 0x017f }
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r7 == r9) goto L_0x00ab
            if (r5 < r2) goto L_0x00ad
        L_0x00ab:
            if (r5 >= r6) goto L_0x00b3
        L_0x00ad:
            r4[r5] = r9     // Catch:{ IOException -> 0x017f }
            int r5 = r5 + 1
            r7 = r9
            goto L_0x009d
        L_0x00b3:
            if (r7 != r9) goto L_0x00b7
            int r5 = r5 + -2
        L_0x00b7:
            r7 = r5
            int r5 = r7 + -1
            r13.write(r5)     // Catch:{ IOException -> 0x017f }
            r5 = 0
        L_0x00be:
            if (r5 >= r7) goto L_0x00c8
            r9 = r4[r5]     // Catch:{ IOException -> 0x017f }
            r13.write(r9)     // Catch:{ IOException -> 0x017f }
            int r5 = r5 + 1
            goto L_0x00be
        L_0x00c8:
            int r3 = r3 + r7
            goto L_0x006d
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            if (r3 >= r0) goto L_0x017b
            int[] r5 = r12.f24749cd     // Catch:{ IOException -> 0x017f }
            r5 = r5[r3]     // Catch:{ IOException -> 0x017f }
            r4[r1] = r5     // Catch:{ IOException -> 0x017f }
            r9 = 1
        L_0x00d4:
            int r10 = r3 + r9
            if (r10 >= r0) goto L_0x00e8
            int[] r11 = r12.f24749cd     // Catch:{ IOException -> 0x017f }
            r10 = r11[r10]     // Catch:{ IOException -> 0x017f }
            if (r5 != r10) goto L_0x00e4
            if (r9 != r2) goto L_0x00e1
            goto L_0x00e4
        L_0x00e1:
            int r9 = r9 + 1
            goto L_0x00d4
        L_0x00e4:
            if (r9 <= r8) goto L_0x00e8
            r10 = 1
            goto L_0x00e9
        L_0x00e8:
            r10 = 0
        L_0x00e9:
            if (r10 == 0) goto L_0x0110
            int r10 = r9 + -1
            r10 = r10 | r2
            r13.write(r10)     // Catch:{ IOException -> 0x017f }
            r10 = r5 & 255(0xff, float:3.57E-43)
            r13.write(r10)     // Catch:{ IOException -> 0x017f }
            int r10 = r5 >> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            r13.write(r10)     // Catch:{ IOException -> 0x017f }
            int r10 = r5 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            r13.write(r10)     // Catch:{ IOException -> 0x017f }
            int r10 = r12.f24748cc     // Catch:{ IOException -> 0x017f }
            if (r10 != r7) goto L_0x0178
            int r5 = r5 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            r13.write(r5)     // Catch:{ IOException -> 0x017f }
            goto L_0x0178
        L_0x0110:
            r9 = r5
            r5 = 1
        L_0x0112:
            int r10 = r3 + r5
            if (r10 >= r0) goto L_0x0131
            int[] r11 = r12.f24749cd     // Catch:{ IOException -> 0x017f }
            r11 = r11[r10]     // Catch:{ IOException -> 0x017f }
            if (r9 == r11) goto L_0x011e
            if (r5 < r2) goto L_0x0120
        L_0x011e:
            if (r5 >= r6) goto L_0x0129
        L_0x0120:
            int[] r9 = r12.f24749cd     // Catch:{ IOException -> 0x017f }
            r9 = r9[r10]     // Catch:{ IOException -> 0x017f }
            r4[r5] = r9     // Catch:{ IOException -> 0x017f }
            int r5 = r5 + 1
            goto L_0x0112
        L_0x0129:
            int[] r11 = r12.f24749cd     // Catch:{ IOException -> 0x017f }
            r10 = r11[r10]     // Catch:{ IOException -> 0x017f }
            if (r9 != r10) goto L_0x0131
            int r5 = r5 + -2
        L_0x0131:
            r9 = r5
            int r5 = r9 + -1
            r13.write(r5)     // Catch:{ IOException -> 0x017f }
            int r5 = r12.f24748cc     // Catch:{ IOException -> 0x017f }
            if (r5 != r7) goto L_0x015d
            r5 = 0
        L_0x013c:
            if (r5 >= r9) goto L_0x0178
            r10 = r4[r5]     // Catch:{ IOException -> 0x017f }
            r11 = r10 & 255(0xff, float:3.57E-43)
            r13.write(r11)     // Catch:{ IOException -> 0x017f }
            int r11 = r10 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            r13.write(r11)     // Catch:{ IOException -> 0x017f }
            int r11 = r10 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            r13.write(r11)     // Catch:{ IOException -> 0x017f }
            int r10 = r10 >>> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            r13.write(r10)     // Catch:{ IOException -> 0x017f }
            int r5 = r5 + 1
            goto L_0x013c
        L_0x015d:
            r5 = 0
        L_0x015e:
            if (r5 >= r9) goto L_0x0178
            r10 = r4[r5]     // Catch:{ IOException -> 0x017f }
            r11 = r10 & 255(0xff, float:3.57E-43)
            r13.write(r11)     // Catch:{ IOException -> 0x017f }
            int r11 = r10 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            r13.write(r11)     // Catch:{ IOException -> 0x017f }
            int r10 = r10 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            r13.write(r10)     // Catch:{ IOException -> 0x017f }
            int r5 = r5 + 1
            goto L_0x015e
        L_0x0178:
            int r3 = r3 + r9
            goto L_0x00cb
        L_0x017b:
            r13.flush()     // Catch:{ IOException -> 0x017f }
            return r8
        L_0x017f:
            r13 = move-exception
            r13.printStackTrace()
            return r1
        L_0x0184:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r0 = "Image format not recognized inside save()"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p259c.C6992d.mo22032b(java.io.OutputStream):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo21990h(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo21747p()
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x009d }
            e.c.a r2 = r7.f24755cj     // Catch:{ IOException -> 0x009d }
            java.io.OutputStream r2 = r2.mo21858g(r8)     // Catch:{ IOException -> 0x009d }
            r3 = 16384(0x4000, float:2.2959E-41)
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x009d }
            java.lang.String r2 = r8.toLowerCase()     // Catch:{ IOException -> 0x009d }
            r3 = 46
            int r3 = r2.lastIndexOf(r3)     // Catch:{ IOException -> 0x009d }
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)     // Catch:{ IOException -> 0x009d }
            java.lang.String r3 = "jpg"
            boolean r3 = r2.equals(r3)     // Catch:{ IOException -> 0x009d }
            r4 = 100
            if (r3 != 0) goto L_0x0083
            java.lang.String r3 = "jpeg"
            boolean r3 = r2.equals(r3)     // Catch:{ IOException -> 0x009d }
            if (r3 == 0) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            java.lang.String r3 = "png"
            boolean r3 = r2.equals(r3)     // Catch:{ IOException -> 0x009d }
            if (r3 == 0) goto L_0x004f
            int[] r2 = r7.f24749cd     // Catch:{ IOException -> 0x009d }
            int r3 = r7.f24750ce     // Catch:{ IOException -> 0x009d }
            int r5 = r7.f24751cf     // Catch:{ IOException -> 0x009d }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ IOException -> 0x009d }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r5, r6)     // Catch:{ IOException -> 0x009d }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x009d }
            boolean r2 = r2.compress(r3, r4, r1)     // Catch:{ IOException -> 0x009d }
            goto L_0x0095
        L_0x004f:
            java.lang.String r3 = "tga"
            boolean r3 = r2.equals(r3)     // Catch:{ IOException -> 0x009d }
            if (r3 == 0) goto L_0x005c
            boolean r2 = r7.mo22032b(r1)     // Catch:{ IOException -> 0x009d }
            goto L_0x0095
        L_0x005c:
            java.lang.String r3 = "tif"
            boolean r3 = r2.equals(r3)     // Catch:{ IOException -> 0x009d }
            if (r3 != 0) goto L_0x007e
            java.lang.String r3 = "tiff"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException -> 0x009d }
            if (r2 != 0) goto L_0x007e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x009d }
            r2.<init>()     // Catch:{ IOException -> 0x009d }
            r2.append(r8)     // Catch:{ IOException -> 0x009d }
            java.lang.String r3 = ".tif"
            r2.append(r3)     // Catch:{ IOException -> 0x009d }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x009d }
            r8 = r2
        L_0x007e:
            boolean r2 = r7.mo22020a(r1)     // Catch:{ IOException -> 0x009d }
            goto L_0x0095
        L_0x0083:
            int[] r2 = r7.f24749cd     // Catch:{ IOException -> 0x009d }
            int r3 = r7.f24750ce     // Catch:{ IOException -> 0x009d }
            int r5 = r7.f24751cf     // Catch:{ IOException -> 0x009d }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ IOException -> 0x009d }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r5, r6)     // Catch:{ IOException -> 0x009d }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x009d }
            boolean r2 = r2.compress(r3, r4, r1)     // Catch:{ IOException -> 0x009d }
        L_0x0095:
            r0 = r2
            r1.flush()     // Catch:{ IOException -> 0x009d }
            r1.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r1 = move-exception
            r1.printStackTrace()
        L_0x00a1:
            if (r0 != 0) goto L_0x00b9
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not write the image to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.println(r8)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p259c.C6992d.mo21990h(java.lang.String):boolean");
    }
}
