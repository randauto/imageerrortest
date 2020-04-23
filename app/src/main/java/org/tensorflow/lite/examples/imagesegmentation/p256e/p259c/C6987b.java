package p256e.p259c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.p072v8.renderscript.Allocation;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: e.c.b */
/* compiled from: PFont */
public class C6987b {

    /* renamed from: q */
    static final char[] f24567q = {128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 180, 181, 182, 183, 184, 186, 187, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 255, 258, 259, 260, 261, 262, 263, 268, 269, 270, 271, 272, 273, 280, 281, 282, 283, 305, 313, 314, 317, 318, 321, 322, 323, 324, 327, 328, 336, 337, 338, 339, 340, 341, 344, 345, 346, 347, 350, 351, 352, 353, 354, 355, 356, 357, 366, 367, 368, 369, 376, 377, 378, 379, 380, 381, 382, 402, 710, 711, 728, 729, 730, 731, 732, 733, 937, 960, 8211, 8212, 8216, 8217, 8218, 8220, 8221, 8222, 8224, 8225, 8226, 8230, 8240, 8249, 8250, 8260, 8364, 8482, 8706, 8710, 8719, 8721, 8730, 8734, 8747, 8776, 8800, 8804, 8805, 9674, 63743, 64257, 64258};

    /* renamed from: r */
    public static char[] f24568r = new char[(f24567q.length + 94)];

    /* renamed from: s */
    static HashMap<String, Typeface> f24569s;

    /* renamed from: t */
    static String[] f24570t;

    /* renamed from: a */
    protected int f24571a;

    /* renamed from: b */
    protected C6988a[] f24572b;

    /* renamed from: c */
    protected String f24573c;

    /* renamed from: d */
    protected String f24574d;

    /* renamed from: e */
    protected int f24575e;

    /* renamed from: f */
    protected boolean f24576f;

    /* renamed from: g */
    protected int f24577g;

    /* renamed from: h */
    protected int f24578h;

    /* renamed from: i */
    protected int[] f24579i;

    /* renamed from: j */
    protected boolean f24580j;

    /* renamed from: k */
    protected Typeface f24581k;

    /* renamed from: l */
    protected boolean f24582l;

    /* renamed from: m */
    Bitmap f24583m;

    /* renamed from: n */
    Canvas f24584n;

    /* renamed from: o */
    Paint f24585o;

    /* renamed from: p */
    int[] f24586p;

    /* renamed from: e.c.b$a */
    /* compiled from: PFont */
    public class C6988a {

        /* renamed from: a */
        public C6992d f24587a;

        /* renamed from: b */
        public int f24588b;

        /* renamed from: c */
        public int f24589c;

        /* renamed from: d */
        public int f24590d;

        /* renamed from: e */
        public int f24591e;

        /* renamed from: f */
        public int f24592f;

        /* renamed from: g */
        public int f24593g;

        /* renamed from: h */
        public int f24594h;

        /* renamed from: i */
        public boolean f24595i = false;

        protected C6988a(char c) {
            int i = 0;
            int i2 = C6987b.this.f24575e * 3;
            C6987b.this.f24584n.drawColor(-1);
            C6987b.this.f24585o.setColor(-16777216);
            C6987b.this.f24584n.drawText(String.valueOf(c), (float) C6987b.this.f24575e, (float) (C6987b.this.f24575e * 2), C6987b.this.f24585o);
            C6987b.this.f24583m.getPixels(C6987b.this.f24586p, 0, i2, 0, 0, i2, i2);
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            int i5 = AdError.NETWORK_ERROR_CODE;
            int i6 = 0;
            int i7 = AdError.NETWORK_ERROR_CODE;
            while (i3 < i2) {
                boolean z2 = z;
                for (int i8 = 0; i8 < i2; i8++) {
                    if ((C6987b.this.f24586p[(i3 * i2) + i8] & 255) != 255) {
                        if (i8 < i7) {
                            i7 = i8;
                        }
                        if (i3 < i5) {
                            i5 = i3;
                        }
                        if (i8 > i6) {
                            i6 = i8;
                        }
                        if (i3 > i4) {
                            i4 = i3;
                        }
                        z2 = true;
                    }
                }
                i3++;
                z = z2;
            }
            if (!z) {
                i5 = 0;
                i6 = 0;
                i7 = 0;
            } else {
                i = i4;
            }
            this.f24588b = c;
            this.f24589c = (i - i5) + 1;
            this.f24590d = (i6 - i7) + 1;
            this.f24592f = (int) C6987b.this.f24585o.measureText(String.valueOf(c));
            this.f24593g = (C6987b.this.f24575e * 2) - i5;
            this.f24594h = i7 - C6987b.this.f24575e;
            this.f24587a = new C6992d(this.f24590d, this.f24589c, 4);
            int[] iArr = this.f24587a.f24749cd;
            for (int i9 = i5; i9 <= i; i9++) {
                for (int i10 = i7; i10 <= i6; i10++) {
                    iArr[((i9 - i5) * this.f24590d) + (i10 - i7)] = 255 - (C6987b.this.f24586p[(i9 * i2) + i10] & 255);
                }
            }
            if (this.f24588b == 100 && C6987b.this.f24577g == 0) {
                C6987b.this.f24577g = this.f24593g;
            }
            if (this.f24588b == 112 && C6987b.this.f24578h == 0) {
                C6987b.this.f24578h = (-this.f24593g) + this.f24589c;
            }
        }
    }

    public C6987b() {
    }

    public C6987b(Typeface typeface, int i, boolean z, char[] cArr) {
        this.f24581k = typeface;
        this.f24576f = z;
        this.f24573c = "";
        this.f24574d = "";
        this.f24575e = i;
        this.f24572b = new C6988a[10];
        this.f24579i = new int[Allocation.USAGE_SHARED];
        Arrays.fill(this.f24579i, -1);
        int i2 = i * 3;
        this.f24583m = Bitmap.createBitmap(i2, i2, Config.ARGB_8888);
        this.f24584n = new Canvas(this.f24583m);
        this.f24585o = new Paint();
        this.f24585o.setAntiAlias(z);
        this.f24585o.setTypeface(typeface);
        this.f24585o.setTextSize((float) i);
        this.f24586p = new int[(i2 * i2)];
        if (cArr == null) {
            this.f24580j = true;
        } else {
            Arrays.sort(cArr);
            this.f24572b = new C6988a[cArr.length];
            this.f24571a = 0;
            for (char aVar : cArr) {
                C6988a aVar2 = new C6988a(aVar);
                if (aVar2.f24588b < 128) {
                    this.f24579i[aVar2.f24588b] = this.f24571a;
                }
                aVar2.f24591e = this.f24571a;
                C6988a[] aVarArr = this.f24572b;
                int i3 = this.f24571a;
                this.f24571a = i3 + 1;
                aVarArr[i3] = aVar2;
            }
        }
        if (this.f24577g == 0) {
            new C6988a('d');
            if (this.f24577g == 0) {
                this.f24577g = C6982a.m36425g(this.f24585o.ascent());
            }
        }
        if (this.f24578h == 0) {
            new C6988a('p');
            if (this.f24578h == 0) {
                this.f24578h = C6982a.m36425g(this.f24585o.descent());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21895a(char c) {
        C6988a aVar = new C6988a(c);
        if (this.f24571a == this.f24572b.length) {
            this.f24572b = (C6988a[]) C6982a.m36402a((Object) this.f24572b);
        }
        int i = 0;
        if (this.f24571a == 0) {
            aVar.f24591e = 0;
            this.f24572b[this.f24571a] = aVar;
            if (aVar.f24588b < 128) {
                this.f24579i[aVar.f24588b] = 0;
            }
        } else if (this.f24572b[this.f24571a - 1].f24588b < aVar.f24588b) {
            this.f24572b[this.f24571a] = aVar;
            if (aVar.f24588b < 128) {
                this.f24579i[aVar.f24588b] = this.f24571a;
            }
        } else {
            while (true) {
                if (i >= this.f24571a) {
                    break;
                } else if (this.f24572b[i].f24588b > c) {
                    for (int i2 = this.f24571a; i2 > i; i2--) {
                        this.f24572b[i2] = this.f24572b[i2 - 1];
                        if (this.f24572b[i2].f24588b < 128) {
                            this.f24579i[this.f24572b[i2].f24588b] = i2;
                        }
                    }
                    aVar.f24591e = i;
                    this.f24572b[i] = aVar;
                    if (c < 128) {
                        this.f24579i[c] = i;
                    }
                } else {
                    i++;
                }
            }
        }
        this.f24571a++;
    }

    /* renamed from: a */
    public int mo21892a() {
        return this.f24575e;
    }

    /* renamed from: b */
    public boolean mo21898b() {
        return this.f24576f;
    }

    /* renamed from: a */
    public void mo21896a(Object obj) {
        this.f24581k = (Typeface) obj;
    }

    /* renamed from: c */
    public Object mo21900c() {
        if (this.f24582l) {
            return null;
        }
        return this.f24581k;
    }

    /* renamed from: a */
    public static Object m36542a(String str) {
        m36543g();
        return f24569s.get(str);
    }

    /* renamed from: b */
    public C6988a mo21897b(char c) {
        int c2 = mo21899c(c);
        if (c2 == -1) {
            return null;
        }
        return this.f24572b[c2];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo21899c(char c) {
        if (!this.f24580j) {
            return mo21902d(c);
        }
        int d = mo21902d(c);
        if (d != -1) {
            return d;
        }
        mo21895a(c);
        return mo21902d(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo21902d(char c) {
        if (this.f24571a == 0) {
            return -1;
        }
        if (c < 128) {
            return this.f24579i[c];
        }
        return mo21893a(c, 0, this.f24571a - 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo21893a(int i, int i2, int i3) {
        int i4 = (i2 + i3) / 2;
        if (i == this.f24572b[i4].f24588b) {
            return i4;
        }
        if (i2 >= i3) {
            return -1;
        }
        if (i < this.f24572b[i4].f24588b) {
            return mo21893a(i, i2, i4 - 1);
        }
        return mo21893a(i, i4 + 1, i3);
    }

    /* renamed from: d */
    public float mo21901d() {
        return ((float) this.f24577g) / ((float) this.f24575e);
    }

    /* renamed from: e */
    public float mo21903e() {
        return ((float) this.f24578h) / ((float) this.f24575e);
    }

    /* renamed from: e */
    public float mo21904e(char c) {
        if (c == ' ') {
            return mo21904e('i');
        }
        int c2 = mo21899c(c);
        if (c2 == -1) {
            return 0.0f;
        }
        return ((float) this.f24572b[c2].f24592f) / ((float) this.f24575e);
    }

    /* renamed from: f */
    public int mo21905f() {
        return this.f24571a;
    }

    /* renamed from: a */
    public C6988a mo21894a(int i) {
        return this.f24572b[i];
    }

    static {
        int i = 0;
        int i2 = 33;
        int i3 = 0;
        while (i2 <= 126) {
            int i4 = i3 + 1;
            f24568r[i3] = (char) i2;
            i2++;
            i3 = i4;
        }
        while (i < f24567q.length) {
            int i5 = i3 + 1;
            f24568r[i3] = f24567q[i];
            i++;
            i3 = i5;
        }
    }

    /* renamed from: g */
    public static void m36543g() {
        if (f24569s == null) {
            f24569s = new HashMap<>();
            f24569s.put("Serif", Typeface.create(Typeface.SERIF, 0));
            f24569s.put("Serif-Bold", Typeface.create(Typeface.SERIF, 1));
            f24569s.put("Serif-Italic", Typeface.create(Typeface.SERIF, 2));
            f24569s.put("Serif-BoldItalic", Typeface.create(Typeface.SERIF, 3));
            f24569s.put("SansSerif", Typeface.create(Typeface.SANS_SERIF, 0));
            f24569s.put("SansSerif-Bold", Typeface.create(Typeface.SANS_SERIF, 1));
            f24569s.put("SansSerif-Italic", Typeface.create(Typeface.SANS_SERIF, 2));
            f24569s.put("SansSerif-BoldItalic", Typeface.create(Typeface.SANS_SERIF, 3));
            f24569s.put("Monospaced", Typeface.create(Typeface.MONOSPACE, 0));
            f24569s.put("Monospaced-Bold", Typeface.create(Typeface.MONOSPACE, 1));
            f24569s.put("Monospaced-Italic", Typeface.create(Typeface.MONOSPACE, 2));
            f24569s.put("Monospaced-BoldItalic", Typeface.create(Typeface.MONOSPACE, 3));
            f24570t = new String[f24569s.size()];
            f24569s.keySet().toArray(f24570t);
        }
    }
}
