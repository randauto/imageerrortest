package p256e.p261e;

/* renamed from: e.e.d */
/* compiled from: TouchEvent */
public class C7011d extends C7008a {

    /* renamed from: f */
    protected int f24861f;

    /* renamed from: g */
    protected int f24862g;

    /* renamed from: h */
    protected int[] f24863h;

    /* renamed from: i */
    protected float[] f24864i;

    /* renamed from: j */
    protected float[] f24865j;

    /* renamed from: k */
    protected float[] f24866k;

    /* renamed from: l */
    protected float[] f24867l;

    /* renamed from: e.e.d$a */
    /* compiled from: TouchEvent */
    public class C7012a {

        /* renamed from: a */
        public int f24868a;

        /* renamed from: b */
        public float f24869b;

        /* renamed from: c */
        public float f24870c;

        /* renamed from: d */
        public float f24871d;

        /* renamed from: e */
        public float f24872e;

        public C7012a() {
        }
    }

    public C7011d(Object obj, long j, int i, int i2, int i3) {
        super(obj, j, i, i2);
        this.f24853e = 3;
        this.f24861f = i3;
    }

    /* renamed from: a */
    public void mo22117a(int i) {
        this.f24862g = i;
        this.f24863h = new int[i];
        this.f24864i = new float[i];
        this.f24865j = new float[i];
        this.f24866k = new float[i];
        this.f24867l = new float[i];
    }

    /* renamed from: a */
    public void mo22118a(int i, int i2, float f, float f2, float f3, float f4) {
        this.f24863h[i] = i2;
        this.f24864i[i] = f;
        this.f24865j[i] = f2;
        this.f24866k[i] = f3;
        this.f24867l[i] = f4;
    }

    /* renamed from: a */
    public C7012a[] mo22119a(C7012a[] aVarArr) {
        if (aVarArr == null || aVarArr.length != this.f24862g) {
            aVarArr = new C7012a[this.f24862g];
            for (int i = 0; i < this.f24862g; i++) {
                aVarArr[i] = new C7012a();
            }
        }
        for (int i2 = 0; i2 < this.f24862g; i2++) {
            aVarArr[i2].f24868a = this.f24863h[i2];
            aVarArr[i2].f24869b = this.f24864i[i2];
            aVarArr[i2].f24870c = this.f24865j[i2];
            aVarArr[i2].f24871d = this.f24866k[i2];
            aVarArr[i2].f24872e = this.f24867l[i2];
        }
        return aVarArr;
    }
}
