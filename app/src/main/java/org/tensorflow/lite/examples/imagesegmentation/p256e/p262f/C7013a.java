package p256e.p262f;

import java.util.Arrays;
import java.util.HashMap;
import p256e.p259c.C6982a;
import p256e.p259c.C6987b;
import p256e.p259c.C6987b.C6988a;
import p256e.p259c.C6989c;
import p256e.p259c.C6992d;
import p256e.p262f.C7088l.C7090b;

/* renamed from: e.f.a */
/* compiled from: FontTexture */
class C7013a {

    /* renamed from: a */
    protected C7056e f24874a;

    /* renamed from: b */
    protected boolean f24875b;

    /* renamed from: c */
    protected int f24876c;

    /* renamed from: d */
    protected int f24877d;

    /* renamed from: e */
    protected int f24878e;

    /* renamed from: f */
    protected int f24879f;

    /* renamed from: g */
    protected int f24880g;

    /* renamed from: h */
    protected C7088l[] f24881h = null;

    /* renamed from: i */
    protected C6992d[] f24882i = null;

    /* renamed from: j */
    protected int f24883j;

    /* renamed from: k */
    protected C7014a[] f24884k;

    /* renamed from: l */
    protected HashMap<C6988a, C7014a> f24885l;

    /* renamed from: e.f.a$a */
    /* compiled from: FontTexture */
    class C7014a {

        /* renamed from: a */
        int f24886a;

        /* renamed from: b */
        int f24887b;

        /* renamed from: c */
        int f24888c;

        /* renamed from: d */
        int[] f24889d = new int[4];

        /* renamed from: e */
        float f24890e;

        /* renamed from: f */
        float f24891f;

        /* renamed from: g */
        float f24892g;

        /* renamed from: h */
        float f24893h;

        /* renamed from: i */
        int[] f24894i;

        C7014a(int i, int i2, int i3, int i4, int i5, int[] iArr) {
            this.f24886a = i;
            this.f24889d[0] = i2 + 1;
            this.f24889d[1] = ((i3 + 1) + i5) - 2;
            this.f24889d[2] = i4 - 2;
            this.f24889d[3] = (-i5) + 2;
            this.f24894i = iArr;
            mo22131a();
            mo22132b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22131a() {
            this.f24887b = C7013a.this.f24881h[this.f24886a].f25948j;
            this.f24888c = C7013a.this.f24881h[this.f24886a].f25949k;
            this.f24890e = ((float) this.f24889d[0]) / ((float) this.f24887b);
            this.f24891f = this.f24890e + (((float) this.f24889d[2]) / ((float) this.f24887b));
            this.f24892g = ((float) (this.f24889d[1] + this.f24889d[3])) / ((float) this.f24888c);
            this.f24893h = this.f24892g - (((float) this.f24889d[3]) / ((float) this.f24888c));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22132b() {
            C7013a.this.f24881h[this.f24886a].mo22856a(this.f24894i, this.f24889d[0] - 1, (this.f24889d[1] + this.f24889d[3]) - 1, this.f24889d[2] + 2, (-this.f24889d[3]) + 2);
        }
    }

    /* renamed from: a */
    public void mo22123a() {
    }

    public C7013a(C7065i iVar, C6987b bVar, boolean z) {
        this.f24874a = iVar.f25493a;
        this.f24875b = z;
        mo22125a(iVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22125a(C7065i iVar, C6987b bVar) {
        this.f24883j = -1;
        int h = C7056e.m37126h(bVar.mo21892a());
        this.f24876c = C6982a.m36422d(C7065i.f25462cL, C6982a.m36420c(C7056e.f25358u, h));
        this.f24877d = C6982a.m36422d(C7065i.f25462cL, C6982a.m36420c(C7056e.f25359v, h * 2));
        if (this.f24877d < h) {
            C6989c.m36558a("The font size is too large to be properly displayed with OpenGL");
        }
        mo22126a(iVar);
        this.f24878e = 0;
        this.f24879f = 0;
        this.f24880g = 0;
        this.f24885l = new HashMap<>();
        this.f24884k = new C7014a[bVar.mo21905f()];
        mo22128b(iVar, bVar);
    }

    /* renamed from: a */
    public boolean mo22126a(C7065i iVar) {
        boolean z;
        int i;
        C7088l lVar;
        int i2 = this.f24877d;
        if (-1 >= this.f24883j || this.f24881h[this.f24883j].f25949k >= this.f24877d) {
            i = this.f24876c;
            z = false;
        } else {
            i = C6982a.m36422d(this.f24881h[this.f24883j].f25949k * 2, this.f24877d);
            z = true;
        }
        if (this.f24875b) {
            lVar = new C7088l(iVar, i2, i, new C7090b(2, 4, false));
        } else {
            lVar = new C7088l(iVar, i2, i, new C7090b(2, 3, false));
        }
        if (this.f24881h == null) {
            this.f24881h = new C7088l[1];
            this.f24881h[0] = lVar;
            this.f24882i = new C6992d[1];
            this.f24882i[0] = iVar.mo22459b(lVar);
            this.f24883j = 0;
        } else if (z) {
            lVar.mo22848a(this.f24881h[this.f24883j]);
            this.f24881h[this.f24883j] = lVar;
            iVar.mo21942a(this.f24882i[this.f24883j], (Object) lVar);
            this.f24882i[this.f24883j].f24750ce = lVar.f25939a;
            this.f24882i[this.f24883j].f24751cf = lVar.f25940b;
        } else {
            this.f24883j = this.f24881h.length;
            C7088l[] lVarArr = new C7088l[(this.f24883j + 1)];
            C6982a.m36408a((Object) this.f24881h, (Object) lVarArr, this.f24881h.length);
            lVarArr[this.f24883j] = lVar;
            this.f24881h = lVarArr;
            C6992d[] dVarArr = new C6992d[this.f24881h.length];
            C6982a.m36408a((Object) this.f24882i, (Object) dVarArr, this.f24882i.length);
            dVarArr[this.f24883j] = iVar.mo22459b(lVar);
            this.f24882i = dVarArr;
        }
        lVar.mo22869f();
        return z;
    }

    /* renamed from: b */
    public void mo22127b() {
        for (C7088l lVar : this.f24881h) {
            this.f24874a.mo22336f(lVar.f25942d);
        }
    }

    /* renamed from: a */
    public C6992d mo22120a(C7014a aVar) {
        return this.f24882i[aVar.f24886a];
    }

    /* renamed from: b */
    public void mo22128b(C7065i iVar, C6987b bVar) {
        for (int i = 0; i < bVar.mo21905f(); i++) {
            mo22124a(iVar, i, bVar.mo21894a(i));
        }
    }

    /* renamed from: c */
    public void mo22129c() {
        for (C7014a aVar : this.f24884k) {
            if (aVar != null && aVar.f24886a == this.f24883j) {
                aVar.mo22131a();
            }
        }
    }

    /* renamed from: a */
    public C7014a mo22121a(C6988a aVar) {
        return (C7014a) this.f24885l.get(aVar);
    }

    /* renamed from: a */
    public C7014a mo22122a(C7065i iVar, C6988a aVar) {
        int length = this.f24884k.length;
        if (length == 0) {
            this.f24884k = new C7014a[1];
        }
        mo22124a(iVar, length, aVar);
        return this.f24884k[length];
    }

    /* renamed from: d */
    public boolean mo22130d() {
        boolean z = false;
        for (C7088l n : this.f24881h) {
            if (n.mo22877n()) {
                z = true;
            }
        }
        if (z) {
            for (C7088l m : this.f24881h) {
                m.mo22876m();
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22124a(C7065i iVar, int i, C6988a aVar) {
        int i2 = i;
        C6988a aVar2 = aVar;
        int i3 = aVar2.f24590d + 1 + 1;
        int i4 = aVar2.f24589c + 1 + 1;
        int i5 = i3 * i4;
        int[] iArr = new int[i5];
        if (C7056e.f25102aV) {
            Arrays.fill(iArr, 0, i3, -256);
            int i6 = i3;
            int i7 = 0;
            for (int i8 = 0; i8 < aVar2.f24589c; i8++) {
                int i9 = i6 + 1;
                iArr[i6] = -256;
                int i10 = 0;
                while (i10 < aVar2.f24590d) {
                    int i11 = i9 + 1;
                    int i12 = i7 + 1;
                    iArr[i9] = aVar2.f24587a.f24749cd[i7] | -256;
                    i10++;
                    i9 = i11;
                    i7 = i12;
                }
                i6 = i9 + 1;
                iArr[i9] = -256;
            }
            Arrays.fill(iArr, (i4 - 1) * i3, i5, -256);
        } else {
            Arrays.fill(iArr, 0, i3, 16777215);
            int i13 = i3;
            int i14 = 0;
            for (int i15 = 0; i15 < aVar2.f24589c; i15++) {
                int i16 = i13 + 1;
                iArr[i13] = 16777215;
                int i17 = 0;
                while (i17 < aVar2.f24590d) {
                    int i18 = i16 + 1;
                    int i19 = i14 + 1;
                    iArr[i16] = (aVar2.f24587a.f24749cd[i14] << 24) | 16777215;
                    i17++;
                    i16 = i18;
                    i14 = i19;
                }
                i13 = i16 + 1;
                iArr[i16] = 16777215;
            }
            Arrays.fill(iArr, (i4 - 1) * i3, i5, 16777215);
        }
        if (this.f24878e + i3 > this.f24881h[this.f24883j].f25948j) {
            this.f24878e = 0;
            this.f24879f += this.f24880g;
        }
        this.f24880g = Math.max(this.f24880g, i4);
        if (this.f24879f + this.f24880g > this.f24881h[this.f24883j].f25949k) {
            if (mo22126a(iVar)) {
                mo22129c();
            } else {
                this.f24878e = 0;
                this.f24879f = 0;
                this.f24880g = 0;
            }
        }
        C7014a aVar3 = new C7014a(this.f24883j, this.f24878e, this.f24879f, i3, i4, iArr);
        this.f24878e += i3;
        if (i2 == this.f24884k.length) {
            C7014a[] aVarArr = new C7014a[(this.f24884k.length + 1)];
            System.arraycopy(this.f24884k, 0, aVarArr, 0, this.f24884k.length);
            this.f24884k = aVarArr;
        }
        this.f24884k[i2] = aVar3;
        this.f24885l.put(aVar2, aVar3);
    }
}
