package p256e.p259c;

import android.support.p072v8.renderscript.Allocation;
import android.view.SurfaceHolder;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import p256e.p258b.C6977a;
import p256e.p259c.C6987b.C6988a;

/* renamed from: e.c.c */
/* compiled from: PGraphics */
public class C6989c extends C6992d {

    /* renamed from: bD */
    protected static final float[] f24597bD = new float[720];

    /* renamed from: bE */
    protected static final float[] f24598bE = new float[720];

    /* renamed from: ca */
    protected static HashMap<String, Object> f24599ca;

    /* renamed from: cb */
    protected static C6990a f24600cb;

    /* renamed from: A */
    public int f24601A;

    /* renamed from: B */
    public float f24602B;

    /* renamed from: C */
    public float f24603C;

    /* renamed from: D */
    public float f24604D;

    /* renamed from: E */
    public float f24605E;

    /* renamed from: F */
    boolean f24606F;

    /* renamed from: G */
    boolean f24607G;

    /* renamed from: H */
    public boolean f24608H;

    /* renamed from: I */
    public int f24609I;

    /* renamed from: J */
    protected boolean f24610J;

    /* renamed from: K */
    protected float f24611K;

    /* renamed from: L */
    protected float f24612L;

    /* renamed from: M */
    protected float f24613M;

    /* renamed from: N */
    protected float f24614N;

    /* renamed from: O */
    protected int f24615O;

    /* renamed from: P */
    protected int f24616P;

    /* renamed from: Q */
    protected int f24617Q;

    /* renamed from: R */
    protected int f24618R;

    /* renamed from: S */
    public boolean f24619S;

    /* renamed from: T */
    public int f24620T = -1;

    /* renamed from: U */
    protected boolean f24621U;

    /* renamed from: V */
    protected float f24622V;

    /* renamed from: W */
    protected float f24623W;

    /* renamed from: X */
    protected float f24624X;

    /* renamed from: Y */
    protected float f24625Y;

    /* renamed from: Z */
    protected int f24626Z;

    /* renamed from: aA */
    public float f24627aA;

    /* renamed from: aB */
    public int f24628aB;

    /* renamed from: aC */
    public float f24629aC;

    /* renamed from: aD */
    public float f24630aD;

    /* renamed from: aE */
    public float f24631aE;

    /* renamed from: aF */
    public boolean f24632aF;

    /* renamed from: aG */
    public int f24633aG;

    /* renamed from: aH */
    public float f24634aH;

    /* renamed from: aI */
    public float f24635aI;

    /* renamed from: aJ */
    public float f24636aJ;

    /* renamed from: aK */
    public int f24637aK;

    /* renamed from: aL */
    public float f24638aL;

    /* renamed from: aM */
    public float f24639aM;

    /* renamed from: aN */
    public float f24640aN;

    /* renamed from: aO */
    public float f24641aO;

    /* renamed from: aP */
    C6996h[] f24642aP = new C6996h[64];

    /* renamed from: aQ */
    int f24643aQ;

    /* renamed from: aR */
    public int f24644aR = -3355444;

    /* renamed from: aS */
    protected boolean f24645aS;

    /* renamed from: aT */
    protected float f24646aT;

    /* renamed from: aU */
    protected float f24647aU;

    /* renamed from: aV */
    protected float f24648aV;

    /* renamed from: aW */
    protected float f24649aW;

    /* renamed from: aX */
    protected int f24650aX;

    /* renamed from: aY */
    protected int f24651aY;

    /* renamed from: aZ */
    protected int f24652aZ;

    /* renamed from: aa */
    protected int f24653aa;

    /* renamed from: ab */
    protected int f24654ab;

    /* renamed from: ac */
    protected int f24655ac;

    /* renamed from: ad */
    public boolean f24656ad;

    /* renamed from: ae */
    public int f24657ae = -16777216;

    /* renamed from: af */
    protected boolean f24658af;

    /* renamed from: ag */
    protected float f24659ag;

    /* renamed from: ah */
    protected float f24660ah;

    /* renamed from: ai */
    protected float f24661ai;

    /* renamed from: aj */
    protected float f24662aj;

    /* renamed from: ak */
    protected int f24663ak;

    /* renamed from: al */
    protected int f24664al;

    /* renamed from: am */
    protected int f24665am;

    /* renamed from: an */
    protected int f24666an;

    /* renamed from: ao */
    public float f24667ao = 1.0f;

    /* renamed from: ap */
    public int f24668ap = 8;

    /* renamed from: aq */
    public int f24669aq = 2;

    /* renamed from: ar */
    public int f24670ar;

    /* renamed from: as */
    public int f24671as;

    /* renamed from: at */
    public int f24672at;

    /* renamed from: au */
    public int f24673au = 0;

    /* renamed from: av */
    public C6987b f24674av;

    /* renamed from: aw */
    public int f24675aw = 21;

    /* renamed from: ax */
    public int f24676ax = 0;

    /* renamed from: ay */
    public int f24677ay = 4;

    /* renamed from: az */
    public float f24678az;

    /* renamed from: bA */
    protected C6995g f24679bA;

    /* renamed from: bB */
    protected float[][] f24680bB;

    /* renamed from: bC */
    protected int f24681bC;

    /* renamed from: bF */
    protected char[] f24682bF;

    /* renamed from: bG */
    protected char[] f24683bG;

    /* renamed from: bH */
    public boolean f24684bH;

    /* renamed from: bI */
    protected int f24685bI;

    /* renamed from: bJ */
    protected boolean f24686bJ;

    /* renamed from: bK */
    public float f24687bK;

    /* renamed from: bL */
    public float f24688bL;

    /* renamed from: bM */
    public float f24689bM;

    /* renamed from: bN */
    public int f24690bN;

    /* renamed from: bO */
    public float f24691bO;

    /* renamed from: bP */
    public float f24692bP;

    /* renamed from: bQ */
    public C6992d f24693bQ;

    /* renamed from: bR */
    public int f24694bR;

    /* renamed from: bS */
    public int f24695bS;

    /* renamed from: bT */
    protected String f24696bT;

    /* renamed from: bU */
    protected int f24697bU;

    /* renamed from: bV */
    protected int f24698bV;

    /* renamed from: bW */
    protected int f24699bW;

    /* renamed from: bX */
    protected boolean f24700bX;

    /* renamed from: bY */
    protected boolean f24701bY;

    /* renamed from: bZ */
    protected boolean f24702bZ;

    /* renamed from: ba */
    protected int f24703ba;

    /* renamed from: bb */
    protected int f24704bb;

    /* renamed from: bc */
    protected float f24705bc;

    /* renamed from: bd */
    protected float f24706bd;

    /* renamed from: be */
    protected float f24707be;

    /* renamed from: bf */
    protected float f24708bf;

    /* renamed from: bg */
    protected int f24709bg;

    /* renamed from: bh */
    protected int f24710bh;

    /* renamed from: bi */
    protected int f24711bi;

    /* renamed from: bj */
    protected int f24712bj;

    /* renamed from: bk */
    protected int f24713bk;

    /* renamed from: bl */
    protected boolean f24714bl;

    /* renamed from: bm */
    float[] f24715bm = new float[3];

    /* renamed from: bn */
    protected int f24716bn;

    /* renamed from: bo */
    protected float[][] f24717bo = ((float[][]) Array.newInstance(float.class, new int[]{512, 37}));

    /* renamed from: bp */
    protected int f24718bp;

    /* renamed from: bq */
    protected boolean f24719bq = false;

    /* renamed from: br */
    public int f24720br = 20;

    /* renamed from: bs */
    protected C6995g f24721bs;

    /* renamed from: bt */
    protected C6995g f24722bt;

    /* renamed from: bu */
    protected boolean f24723bu;

    /* renamed from: bv */
    public int f24724bv;

    /* renamed from: bw */
    public float f24725bw;

    /* renamed from: bx */
    protected C6995g f24726bx;

    /* renamed from: by */
    protected C6995g f24727by;

    /* renamed from: bz */
    protected C6995g f24728bz;

    /* renamed from: t */
    public int f24729t;

    /* renamed from: u */
    protected boolean f24730u;

    /* renamed from: v */
    protected boolean f24731v;

    /* renamed from: w */
    protected C6989c f24732w;

    /* renamed from: x */
    protected boolean f24733x;

    /* renamed from: y */
    protected boolean[] f24734y = new boolean[13];

    /* renamed from: z */
    protected WeakHashMap<C6992d, Object> f24735z = new WeakHashMap<>();

    /* renamed from: e.c.c$a */
    /* compiled from: PGraphics */
    protected static class C6990a {

        /* renamed from: a */
        static final int f24736a = Math.max(1, Runtime.getRuntime().availableProcessors() - 1);

        /* renamed from: b */
        BlockingQueue<C6992d> f24737b = new ArrayBlockingQueue(f24736a);

        /* renamed from: c */
        ExecutorService f24738c = Executors.newFixedThreadPool(f24736a);

        /* renamed from: d */
        int f24739d = 0;

        /* renamed from: e */
        volatile long f24740e = 0;

        /* renamed from: f */
        long f24741f = 0;

        /* renamed from: g */
        int f24742g = 0;

        /* renamed from: a */
        public C6992d mo22014a(int i, int i2, int i3) {
            C6992d dVar;
            try {
                if (this.f24739d >= f24736a || !this.f24737b.isEmpty()) {
                    dVar = (C6992d) this.f24737b.take();
                    if (!(dVar.f24750ce == i && dVar.f24751cf == i2)) {
                        dVar.f24750ce = i;
                        dVar.f24751cf = i2;
                        dVar.f24749cd = new int[(i * i2)];
                    }
                } else {
                    dVar = new C6992d(i, i2);
                    this.f24739d++;
                }
                dVar.f24748cc = i3;
                return dVar;
            } catch (InterruptedException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public void mo22015a(final C6989c cVar, final C6992d dVar, final String str) {
            dVar.f24755cj = cVar.f24755cj;
            if (dVar.f24755cj.f24514Q - 1 == this.f24742g && f24736a > 1) {
                long max = this.f24740e / ((long) Math.max(1, f24736a - 1));
                long g = (long) C6982a.m36425g(((float) ((this.f24741f + max) - System.nanoTime())) / 1000000.0f);
                if (g > 0) {
                    try {
                        Thread.sleep(g);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            this.f24742g = dVar.f24755cj.f24514Q;
            this.f24741f = System.nanoTime();
            try {
                this.f24738c.submit(new Runnable() {
                    public void run() {
                        try {
                            long nanoTime = System.nanoTime();
                            cVar.mo21972d(dVar);
                            dVar.mo21990h(str);
                            long nanoTime2 = System.nanoTime() - nanoTime;
                            synchronized (C6990a.this) {
                                if (C6990a.this.f24740e == 0) {
                                    C6990a.this.f24740e = nanoTime2;
                                } else if (nanoTime2 < C6990a.this.f24740e) {
                                    C6990a.this.f24740e = ((C6990a.this.f24740e * 31) + nanoTime2) / 32;
                                } else {
                                    C6990a.this.f24740e = nanoTime2;
                                }
                            }
                            C6990a.this.f24737b.offer(dVar);
                        } catch (Throwable th) {
                            C6990a.this.f24737b.offer(dVar);
                            throw th;
                        }
                    }
                });
            } catch (RejectedExecutionException unused2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo21907B() {
        return false;
    }

    /* renamed from: a */
    public C6997i mo21705a(C6977a aVar, SurfaceHolder surfaceHolder, boolean z) {
        return null;
    }

    /* renamed from: a */
    public void mo21706a() {
    }

    /* renamed from: ac */
    public boolean mo21949ac() {
        return true;
    }

    /* renamed from: ad */
    public boolean mo21950ad() {
        return false;
    }

    /* renamed from: ae */
    public boolean mo21951ae() {
        return false;
    }

    /* renamed from: b */
    public float mo21952b(float f, float f2, float f3, float f4, float f5) {
        float f6 = f5 - 1.0f;
        return (f5 * (((3.0f * f6) * ((f2 * f6) - (f3 * f5))) + ((f4 * f5) * f5))) - (((f * f6) * f6) * f6);
    }

    /* renamed from: b */
    public void mo21726b(int i) {
    }

    /* renamed from: d */
    public void mo21731d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21732d(float f, float f2, float f3, float f4) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21972d(C6992d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo21733d(int i) {
        return true;
    }

    /* renamed from: e */
    public void mo21734e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo21749r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo21750s() {
    }

    /* renamed from: v */
    public void mo22004v() {
    }

    static {
        for (int i = 0; i < 720; i++) {
            double d = (double) (((float) i) * 0.017453292f * 0.5f);
            f24597bD[i] = (float) Math.sin(d);
            f24598bE[i] = (float) Math.cos(d);
        }
    }

    public C6989c() {
        C6995g gVar = r4;
        C6995g gVar2 = new C6995g(-1.0f, 3.0f, -3.0f, 1.0f, 3.0f, -6.0f, 3.0f, 0.0f, -3.0f, 3.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.f24721bs = gVar;
        this.f24723bu = false;
        this.f24724bv = 20;
        this.f24725bw = 0.0f;
        this.f24682bF = new char[8192];
        this.f24683bG = new char[8192];
        this.f24684bH = true;
        this.f24690bN = 2;
        this.f24693bQ = null;
        this.f24694bR = 0;
        this.f24695bS = 0;
        this.f24700bX = false;
        this.f24701bY = true;
        this.f24702bZ = false;
    }

    /* renamed from: a */
    public void mo21939a(C6982a aVar) {
        this.f24755cj = aVar;
    }

    /* renamed from: a */
    public void mo21946a(boolean z) {
        this.f24733x = z;
        if (this.f24733x) {
            this.f24748cc = 1;
        }
    }

    /* renamed from: a */
    public void mo21715a(int i, int i2) {
        this.f24750ce = i;
        this.f24751cf = i2;
        this.f24753ch = this.f24750ce * this.f24752cg;
        this.f24754ci = this.f24751cf * this.f24752cg;
        this.f24731v = true;
    }

    /* renamed from: b */
    public void mo21723b() {
        this.f24755cj = null;
    }

    /* renamed from: a */
    public void mo21942a(C6992d dVar, Object obj) {
        this.f24735z.put(dVar, obj);
    }

    /* renamed from: b */
    public Object mo21954b(C6992d dVar) {
        return this.f24735z.get(dVar);
    }

    /* renamed from: c */
    public void mo21966c(C6992d dVar) {
        this.f24735z.remove(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo22006w() {
        if (!this.f24730u) {
            mo22009x();
        }
        if (this.f24731v) {
            mo22011y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo22009x() {
        mo21957b(1, 255.0f);
        mo21999q(255);
        mo21997o(0);
        mo21724b(1.0f);
        mo21737f(8);
        mo21735e(2);
        this.f24716bn = 0;
        mo21992j(0);
        mo21993k(3);
        this.f24686bJ = true;
        this.f24674av = null;
        this.f24678az = 12.0f;
        this.f24627aA = 14.0f;
        this.f24675aw = 21;
        this.f24677ay = 4;
        if (this.f24733x) {
            mo22003u(this.f24644aR);
        }
        mo21989h(1);
        this.f24730u = true;
        this.f24731v = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo22011y() {
        if (this.f24730u) {
            mo21936a(this.f24601A, this.f24602B, this.f24603C, this.f24604D);
            if (this.f24619S) {
                mo21999q(this.f24620T);
            } else {
                mo21928W();
            }
            if (this.f24656ad) {
                mo21997o(this.f24657ae);
                mo21724b(this.f24667ao);
                mo21735e(this.f24669aq);
                mo21737f(this.f24668ap);
            } else {
                mo21926U();
            }
            if (this.f24608H) {
                mo21998p(this.f24609I);
            } else {
                mo21927V();
            }
            if (this.f24674av != null) {
                float f = this.f24627aA;
                mo21717a(this.f24674av, this.f24678az);
                mo21961c(f);
            }
            mo21996n(this.f24677ay);
            mo21971d(this.f24675aw, this.f24676ax);
            mo22003u(this.f24644aR);
            mo21989h(this.f24704bb);
            this.f24731v = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo22013z() {
        this.f24701bY = false;
        if (!this.f24755cj.f24512O) {
            this.f24755cj.mo21884z();
            this.f24700bX = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo21906A() {
        return !this.f24701bY && this.f24700bX;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo21751t() {
        if (this.f24701bY && this.f24700bX) {
            this.f24700bX = false;
            this.f24755cj.mo21776A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo21908C() {
        return this.f24755cj.mo21777B() && (!mo21907B() || !this.f24702bZ);
    }

    /* renamed from: D */
    public void mo21909D() {
        mo21714a(20);
    }

    /* renamed from: a */
    public void mo21714a(int i) {
        this.f24716bn = i;
    }

    /* renamed from: g */
    public void mo21985g(int i) {
        this.f24690bN = i;
    }

    /* renamed from: a */
    public void mo21718a(C6992d dVar) {
        this.f24693bQ = dVar;
    }

    /* renamed from: E */
    public void mo21910E() {
        this.f24693bQ = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo21911F() {
        if (this.f24718bp == this.f24717bo.length) {
            float[][] fArr = (float[][]) Array.newInstance(float.class, new int[]{this.f24718bp << 1, 37});
            System.arraycopy(this.f24717bo, 0, fArr, 0, this.f24718bp);
            this.f24717bo = fArr;
        }
    }

    /* renamed from: a */
    public void mo21708a(float f, float f2) {
        mo21911F();
        float[] fArr = this.f24717bo[this.f24718bp];
        boolean z = false;
        this.f24681bC = 0;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = 0.0f;
        fArr[12] = this.f24684bH ? 1.0f : 0.0f;
        if (this.f24693bQ != null) {
            z = true;
        }
        if (this.f24619S || z) {
            if (!z) {
                fArr[3] = this.f24622V;
                fArr[4] = this.f24623W;
                fArr[5] = this.f24624X;
                fArr[6] = this.f24625Y;
            } else if (this.f24608H) {
                fArr[3] = this.f24611K;
                fArr[4] = this.f24612L;
                fArr[5] = this.f24613M;
                fArr[6] = this.f24614N;
            } else {
                fArr[3] = 1.0f;
                fArr[4] = 1.0f;
                fArr[5] = 1.0f;
                fArr[6] = 1.0f;
            }
        }
        if (this.f24656ad) {
            fArr[13] = this.f24659ag;
            fArr[14] = this.f24660ah;
            fArr[15] = this.f24661ai;
            fArr[16] = this.f24662aj;
            fArr[17] = this.f24667ao;
        }
        fArr[7] = this.f24691bO;
        fArr[8] = this.f24692bP;
        if (this.f24686bJ) {
            float f3 = (this.f24687bK * this.f24687bK) + (this.f24688bL * this.f24688bL) + (this.f24689bM * this.f24689bM);
            if (f3 < 1.0E-4f) {
                fArr[36] = 0.0f;
            } else {
                if (Math.abs(f3 - 1.0f) > 1.0E-4f) {
                    float c = C6982a.m36418c(f3);
                    this.f24687bK /= c;
                    this.f24688bL /= c;
                    this.f24689bM /= c;
                }
                fArr[36] = 1.0f;
            }
        } else {
            fArr[36] = 1.0f;
        }
        fArr[9] = this.f24687bK;
        fArr[10] = this.f24688bL;
        fArr[11] = this.f24689bM;
        this.f24718bp++;
    }

    /* renamed from: a */
    public void mo21709a(float f, float f2, float f3) {
        mo21911F();
        float[] fArr = this.f24717bo[this.f24718bp];
        boolean z = false;
        if (this.f24716bn == 20 && this.f24718bp > 0) {
            float[] fArr2 = this.f24717bo[this.f24718bp - 1];
            if (Math.abs(fArr2[0] - f) < 1.0E-4f && Math.abs(fArr2[1] - f2) < 1.0E-4f && Math.abs(fArr2[2] - f3) < 1.0E-4f) {
                return;
            }
        }
        this.f24681bC = 0;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[12] = this.f24684bH ? 1.0f : 0.0f;
        if (this.f24693bQ != null) {
            z = true;
        }
        if (this.f24619S || z) {
            if (!z) {
                fArr[3] = this.f24622V;
                fArr[4] = this.f24623W;
                fArr[5] = this.f24624X;
                fArr[6] = this.f24625Y;
            } else if (this.f24608H) {
                fArr[3] = this.f24611K;
                fArr[4] = this.f24612L;
                fArr[5] = this.f24613M;
                fArr[6] = this.f24614N;
            } else {
                fArr[3] = 1.0f;
                fArr[4] = 1.0f;
                fArr[5] = 1.0f;
                fArr[6] = 1.0f;
            }
        }
        if (this.f24656ad) {
            fArr[13] = this.f24659ag;
            fArr[14] = this.f24660ah;
            fArr[15] = this.f24661ai;
            fArr[16] = this.f24662aj;
            fArr[17] = this.f24667ao;
        }
        fArr[7] = this.f24691bO;
        fArr[8] = this.f24692bP;
        if (this.f24686bJ) {
            float f4 = (this.f24687bK * this.f24687bK) + (this.f24688bL * this.f24688bL) + (this.f24689bM * this.f24689bM);
            if (f4 < 1.0E-4f) {
                fArr[36] = 0.0f;
            } else {
                if (Math.abs(f4 - 1.0f) > 1.0E-4f) {
                    float c = C6982a.m36418c(f4);
                    this.f24687bK /= c;
                    this.f24688bL /= c;
                    this.f24689bM /= c;
                }
                fArr[36] = 1.0f;
            }
        } else {
            fArr[36] = 1.0f;
        }
        fArr[9] = this.f24687bK;
        fArr[10] = this.f24688bL;
        fArr[11] = this.f24689bM;
        this.f24718bp++;
    }

    /* renamed from: a */
    public void mo21710a(float f, float f2, float f3, float f4) {
        mo21968d(f3, f4);
        mo21708a(f, f2);
    }

    /* renamed from: a */
    public void mo21711a(float f, float f2, float f3, float f4, float f5) {
        mo21968d(f4, f5);
        mo21709a(f, f2, f3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21968d(float f, float f2) {
        if (this.f24693bQ != null) {
            if (this.f24690bN == 2) {
                f /= (float) this.f24693bQ.f24750ce;
                f2 /= (float) this.f24693bQ.f24751cf;
            }
            this.f24691bO = f;
            this.f24692bP = f2;
            return;
        }
        throw new RuntimeException("You must first call texture() before using u and v coordinates with vertex()");
    }

    /* renamed from: G */
    public void mo21912G() {
        m36563e("beginContour");
    }

    /* renamed from: H */
    public void mo21913H() {
        m36563e("endContour");
    }

    /* renamed from: I */
    public void mo21914I() {
        mo21726b(1);
    }

    /* renamed from: h */
    public void mo21989h(int i) {
        this.f24704bb = i;
        mo21915J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo21915J() {
        if (this.f24704bb != 1) {
            m36563e("blendMode");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21965c(int i, int i2) {
        if (i == 0 || i != 20) {
            throw new RuntimeException("beginShape() or beginShape(POLYGON) must be used before bezierVertex() or quadraticVertex()");
        } else if (i2 == 0) {
            throw new RuntimeException("vertex() must be used at least oncebefore bezierVertex() or quadraticVertex()");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo21991i(int i) {
        if (i == 20) {
            if (this.f24680bB == null) {
                this.f24680bB = (float[][]) Array.newInstance(float.class, new int[]{Allocation.USAGE_SHARED, 3});
            }
            if (this.f24681bC == this.f24680bB.length) {
                float[][] fArr = (float[][]) Array.newInstance(float.class, new int[]{this.f24681bC << 1, 3});
                System.arraycopy(this.f24680bB, 0, fArr, 0, this.f24681bC);
                this.f24680bB = fArr;
            }
            mo21918M();
            return;
        }
        throw new RuntimeException("You must use beginShape() or beginShape(POLYGON) before curveVertex()");
    }

    /* renamed from: b */
    public void mo21725b(float f, float f2, float f3, float f4) {
        mo21714a(5);
        mo21708a(f, f2);
        mo21708a(f3, f4);
        mo21914I();
    }

    /* renamed from: a */
    public void mo21712a(float f, float f2, float f3, float f4, float f5, float f6) {
        mo21714a(9);
        mo21708a(f, f2);
        mo21708a(f3, f4);
        mo21708a(f5, f6);
        mo21914I();
    }

    /* renamed from: a */
    public void mo21713a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        mo21714a(17);
        mo21708a(f, f2);
        mo21708a(f3, f4);
        mo21708a(f5, f6);
        mo21708a(f7, f8);
        mo21914I();
    }

    /* renamed from: j */
    public void mo21992j(int i) {
        this.f24670ar = i;
    }

    /* renamed from: e */
    public void mo21977e(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        switch (this.f24670ar) {
            case 0:
                f3 += f;
                f4 += f2;
                break;
            case 2:
                f6 = f + f3;
                f5 = f2 + f4;
                f -= f3;
                f2 -= f4;
                break;
            case 3:
                float f7 = f3 / 2.0f;
                float f8 = f4 / 2.0f;
                f6 = f + f7;
                f5 = f2 + f8;
                f -= f7;
                f2 -= f8;
                break;
        }
        f3 = f6;
        f4 = f5;
        if (f > f3) {
            float f9 = f3;
            f3 = f;
            f = f9;
        }
        if (f2 > f4) {
            float f10 = f4;
            f4 = f2;
            f2 = f10;
        }
        mo21729c(f, f2, f3, f4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21729c(float f, float f2, float f3, float f4) {
        mo21713a(f, f2, f3, f2, f3, f4, f, f4);
    }

    /* renamed from: k */
    public void mo21993k(int i) {
        this.f24671as = i;
    }

    /* renamed from: f */
    public void mo21981f(float f, float f2, float f3, float f4) {
        if (this.f24671as == 1) {
            f3 -= f;
            f4 -= f2;
        } else if (this.f24671as == 2) {
            f -= f3;
            f2 -= f4;
            f3 *= 2.0f;
            f4 *= 2.0f;
        } else if (this.f24671as == 3) {
            f -= f3 / 2.0f;
            f2 -= f4 / 2.0f;
        }
        if (f3 < 0.0f) {
            f += f3;
            f3 = -f3;
        }
        if (f4 < 0.0f) {
            f2 += f4;
            f4 = -f4;
        }
        mo21732d(f, f2, f3, f4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo21916K() {
        if (!this.f24719bq) {
            mo21917L();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo21917L() {
        mo21730c(this.f24720br);
        this.f24719bq = true;
    }

    /* renamed from: c */
    public void mo21730c(int i) {
        this.f24720br = i;
        if (this.f24722bt == null) {
            this.f24722bt = new C6995g();
        }
        mo21938a(i, this.f24722bt);
        this.f24722bt.mo22043a(this.f24721bs);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo21918M() {
        if (!this.f24723bu) {
            mo21919N();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo21919N() {
        if (this.f24727by == null) {
            this.f24726bx = new C6995g();
            this.f24727by = new C6995g();
            this.f24723bu = true;
        }
        float f = this.f24725bw;
        float f2 = (f - 1.0f) / 2.0f;
        float f3 = 1.0f - f;
        float f4 = f3;
        float f5 = f3 / 2.0f;
        this.f24726bx.mo22041a(f2, (3.0f + f) / 2.0f, (-3.0f - f) / 2.0f, f5, f4, (-5.0f - f) / 2.0f, 2.0f + f, f2, f2, 0.0f, f5, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        mo21938a(this.f24724bv, this.f24727by);
        if (this.f24728bz == null) {
            this.f24728bz = this.f24721bs.mo22046b();
            this.f24728bz.mo22051c();
            this.f24679bA = new C6995g();
        }
        this.f24679bA.mo22042a((C6993e) this.f24726bx);
        this.f24679bA.mo22048b(this.f24728bz);
        this.f24727by.mo22043a(this.f24726bx);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21938a(int i, C6995g gVar) {
        float f = 1.0f / ((float) i);
        float f2 = f;
        float f3 = f * f;
        float f4 = f * f3;
        float f5 = f4 * 6.0f;
        gVar.mo22041a(0.0f, 0.0f, 0.0f, 1.0f, f4, f3, f2, 0.0f, f5, f3 * 2.0f, 0.0f, 0.0f, f5, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: l */
    public void mo21994l(int i) {
        if (i == 0 || i == 1 || i == 3) {
            this.f24673au = i;
            return;
        }
        throw new RuntimeException("imageMode() only works with CORNER, CORNERS, or CENTER");
    }

    /* renamed from: a */
    public void mo21940a(C6992d dVar, float f, float f2, float f3, float f4) {
        mo21959b(dVar, f, f2, f3, f4, 0, 0, dVar.f24750ce, dVar.f24751cf);
    }

    /* renamed from: b */
    public void mo21959b(C6992d dVar, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        C6992d dVar2 = dVar;
        float f11 = f3;
        float f12 = f4;
        if (dVar2.f24750ce != -1 && dVar2.f24751cf != -1) {
            if (this.f24673au == 0) {
                if (f11 < 0.0f) {
                    float f13 = -f11;
                    f7 = f + f11;
                    f8 = f13;
                } else {
                    f8 = f11;
                    f7 = f;
                }
                if (f12 < 0.0f) {
                    float f14 = -f12;
                    f9 = f2 + f12;
                    f10 = f14;
                } else {
                    f10 = f12;
                    f9 = f2;
                }
                mo21719a(dVar, f7, f9, f7 + f8, f9 + f10, i, i2, i3, i4);
            } else if (this.f24673au == 1) {
                if (f11 < f) {
                    f5 = f;
                } else {
                    f5 = f11;
                    f11 = f;
                }
                if (f12 < f2) {
                    f6 = f2;
                } else {
                    f6 = f12;
                    f12 = f2;
                }
                mo21719a(dVar, f11, f12, f5, f6, i, i2, i3, i4);
            } else if (this.f24673au == 3) {
                if (f11 < 0.0f) {
                    f11 = -f11;
                }
                if (f12 < 0.0f) {
                    f12 = -f12;
                }
                float f15 = f - (f11 / 2.0f);
                float f16 = f2 - (f12 / 2.0f);
                mo21719a(dVar, f15, f16, f15 + f11, f16 + f12, i, i2, i3, i4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21719a(C6992d dVar, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4) {
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        boolean z = this.f24656ad;
        boolean z2 = this.f24619S;
        int i5 = this.f24690bN;
        this.f24656ad = false;
        this.f24619S = true;
        this.f24690bN = 2;
        float f9 = this.f24622V;
        float f10 = this.f24623W;
        float f11 = this.f24624X;
        float f12 = this.f24625Y;
        if (this.f24608H) {
            this.f24622V = this.f24611K;
            this.f24623W = this.f24612L;
            this.f24624X = this.f24613M;
            this.f24625Y = this.f24614N;
        } else {
            this.f24622V = 1.0f;
            this.f24623W = 1.0f;
            this.f24624X = 1.0f;
            this.f24625Y = 1.0f;
        }
        mo21714a(17);
        mo21718a(dVar);
        float f13 = (float) i;
        float f14 = (float) i2;
        mo21710a(f5, f6, f13, f14);
        float f15 = (float) i4;
        mo21710a(f5, f8, f13, f15);
        float f16 = (float) i3;
        mo21710a(f7, f8, f16, f15);
        mo21710a(f7, f6, f16, f14);
        mo21914I();
        this.f24656ad = z;
        this.f24619S = z2;
        this.f24690bN = i5;
        this.f24622V = f9;
        this.f24623W = f10;
        this.f24624X = f11;
        this.f24625Y = f12;
    }

    /* renamed from: m */
    public void mo21995m(int i) {
        this.f24672at = i;
    }

    /* renamed from: d */
    public void mo21971d(int i, int i2) {
        this.f24675aw = i;
        this.f24676ax = i2;
    }

    /* renamed from: O */
    public float mo21920O() {
        if (this.f24674av == null) {
            mo21986g("textAscent");
        }
        return this.f24674av.mo21901d() * this.f24678az;
    }

    /* renamed from: P */
    public float mo21921P() {
        if (this.f24674av == null) {
            mo21986g("textDescent");
        }
        return this.f24674av.mo21903e() * this.f24678az;
    }

    /* renamed from: a */
    public void mo21717a(C6987b bVar, float f) {
        if (bVar != null) {
            if (f <= 0.0f) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("textFont: ignoring size ");
                sb.append(f);
                sb.append(" px:the text size must be larger than zero");
                printStream.println(sb.toString());
                f = this.f24678az;
            }
            mo21958b(bVar, f);
            return;
        }
        throw new RuntimeException("A null PFont was passed to textFont()");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21958b(C6987b bVar, float f) {
        this.f24674av = bVar;
        mo21974e(f);
    }

    /* renamed from: c */
    public void mo21961c(float f) {
        this.f24627aA = f;
    }

    /* renamed from: n */
    public void mo21996n(int i) {
        if (i == 21 || i == 22) {
            m36558a("Since Processing beta, textMode() is now textAlign().");
            return;
        }
        if (i == 256) {
            m36558a("textMode(SCREEN) has been removed from Processing 2.0.");
        }
        if (mo21733d(i)) {
            this.f24677ay = i;
        } else {
            String valueOf = String.valueOf(i);
            switch (i) {
                case 4:
                    valueOf = "MODEL";
                    break;
                case 5:
                    valueOf = "SHAPE";
                    break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("textMode(");
            sb.append(valueOf);
            sb.append(") is not supported by this renderer.");
            m36558a(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo21707a(float f) {
        if (f <= 0.0f) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("textSize(");
            sb.append(f);
            sb.append(") ignored: the text size must be larger than zero");
            printStream.println(sb.toString());
            return;
        }
        if (this.f24674av == null) {
            mo21944a("textSize", f);
        }
        mo21967d(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21967d(float f) {
        mo21974e(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo21974e(float f) {
        this.f24678az = f;
        this.f24627aA = (mo21920O() + mo21921P()) * 1.275f;
    }

    /* renamed from: a */
    public float mo21932a(char c) {
        this.f24683bG[0] = c;
        return mo21704a(this.f24683bG, 0, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo21704a(char[] cArr, int i, int i2) {
        float f = 0.0f;
        while (i < i2) {
            f += this.f24674av.mo21904e(cArr[i]) * this.f24678az;
            i++;
        }
        return f;
    }

    /* renamed from: a */
    public void mo21945a(String str, float f, float f2) {
        if (this.f24674av == null) {
            mo21986g("text");
        }
        int length = str.length();
        if (length > this.f24682bF.length) {
            this.f24682bF = new char[(length + 10)];
        }
        int i = 0;
        str.getChars(0, length, this.f24682bF, 0);
        float f3 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f24682bF[i2] == 10) {
                f3 += this.f24627aA;
            }
        }
        if (this.f24676ax == 3) {
            f2 += (mo21920O() - f3) / 2.0f;
        } else if (this.f24676ax == 101) {
            f2 += mo21920O();
        } else if (this.f24676ax == 102) {
            f2 -= mo21921P() + f3;
        }
        int i3 = 0;
        while (i < length) {
            if (this.f24682bF[i] == 10) {
                mo21960b(this.f24682bF, i3, i, f, f2);
                f2 += this.f24627aA;
                i3 = i + 1;
            }
            i++;
        }
        if (i3 < length) {
            mo21960b(this.f24682bF, i3, i, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21960b(char[] cArr, int i, int i2, float f, float f2) {
        if (this.f24675aw == 3) {
            f -= mo21704a(cArr, i, i2) / 2.0f;
        } else if (this.f24675aw == 22) {
            f -= mo21704a(cArr, i, i2);
        }
        mo21720a(cArr, i, i2, f, f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21720a(char[] cArr, int i, int i2, float f, float f2) {
        while (i < i2) {
            mo21933a(cArr[i], f, f2);
            f += mo21932a(cArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21933a(char c, float f, float f2) {
        C6988a b = this.f24674av.mo21897b(c);
        if (b != null && this.f24677ay == 4) {
            float f3 = f + ((((float) b.f24594h) / ((float) this.f24674av.f24575e)) * this.f24678az);
            float f4 = f2 - ((((float) b.f24593g) / ((float) this.f24674av.f24575e)) * this.f24678az);
            mo21941a(b.f24587a, f3, f4, f3 + ((((float) b.f24590d) / ((float) this.f24674av.f24575e)) * this.f24678az), f4 + ((((float) b.f24589c) / ((float) this.f24674av.f24575e)) * this.f24678az), b.f24590d, b.f24589c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21941a(C6992d dVar, float f, float f2, float f3, float f4, int i, int i2) {
        boolean z = this.f24608H;
        int i3 = this.f24609I;
        mo21998p(this.f24620T);
        mo21719a(dVar, f, f2, f3, f4, 0, 0, i, i2);
        if (z) {
            mo21998p(i3);
        } else {
            mo21927V();
        }
    }

    /* renamed from: g */
    public void mo21738g() {
        m36561c("pushMatrix");
    }

    /* renamed from: h */
    public void mo21739h() {
        m36561c("popMatrix");
    }

    /* renamed from: i */
    public void mo21740i() {
        m36561c("resetMatrix");
    }

    /* renamed from: Q */
    public void mo21922Q() {
        m36563e("camera");
    }

    /* renamed from: a */
    public void mo21934a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        m36563e("camera");
    }

    /* renamed from: b */
    public void mo21956b(float f, float f2, float f3, float f4, float f5, float f6) {
        m36563e("ortho");
    }

    /* renamed from: R */
    public void mo21923R() {
        m36563e("perspective");
    }

    /* renamed from: g */
    public void mo21984g(float f, float f2, float f3, float f4) {
        m36563e("perspective");
    }

    /* renamed from: c */
    public void mo21963c(float f, float f2, float f3, float f4, float f5, float f6) {
        m36561c("frustum");
    }

    /* renamed from: b */
    public float mo21721b(float f, float f2) {
        m36563e("screenX");
        return 0.0f;
    }

    /* renamed from: c */
    public float mo21727c(float f, float f2) {
        m36563e("screenY");
        return 0.0f;
    }

    /* renamed from: S */
    public void mo21924S() {
        if (this.f24643aQ == this.f24642aP.length) {
            this.f24642aP = (C6996h[]) C6982a.m36402a((Object) this.f24642aP);
        }
        if (this.f24642aP[this.f24643aQ] == null) {
            this.f24642aP[this.f24643aQ] = new C6996h();
        }
        C6996h[] hVarArr = this.f24642aP;
        int i = this.f24643aQ;
        this.f24643aQ = i + 1;
        mo21953b(hVarArr[i]);
    }

    /* renamed from: T */
    public void mo21925T() {
        if (this.f24643aQ != 0) {
            this.f24643aQ--;
            mo21943a(this.f24642aP[this.f24643aQ]);
            return;
        }
        throw new RuntimeException("Too many popStyle() without enough pushStyle()");
    }

    /* renamed from: a */
    public void mo21943a(C6996h hVar) {
        mo21994l(hVar.f24794a);
        mo21992j(hVar.f24795b);
        mo21993k(hVar.f24796c);
        mo21995m(hVar.f24797d);
        mo21989h(hVar.f24798e);
        if (hVar.f24804k) {
            mo21998p(hVar.f24805l);
        } else {
            mo21927V();
        }
        if (hVar.f24806m) {
            mo21999q(hVar.f24807n);
        } else {
            mo21928W();
        }
        if (hVar.f24808o) {
            mo21997o(hVar.f24809p);
        } else {
            mo21926U();
        }
        mo21724b(hVar.f24810q);
        mo21735e(hVar.f24811r);
        mo21737f(hVar.f24812s);
        mo21957b(1, 1.0f);
        mo21955b(hVar.f24813t, hVar.f24814u, hVar.f24815v);
        mo21969d(hVar.f24819z, hVar.f24785A, hVar.f24786B);
        mo21962c(hVar.f24816w, hVar.f24817x, hVar.f24818y);
        mo21978f(hVar.f24787C);
        mo21937a(hVar.f24799f, hVar.f24800g, hVar.f24801h, hVar.f24802i, hVar.f24803j);
        if (hVar.f24788D != null) {
            mo21717a(hVar.f24788D, hVar.f24792H);
            mo21961c(hVar.f24793I);
        }
        mo21971d(hVar.f24789E, hVar.f24790F);
        mo21996n(hVar.f24791G);
    }

    /* renamed from: b */
    public C6996h mo21953b(C6996h hVar) {
        if (hVar == null) {
            hVar = new C6996h();
        }
        hVar.f24794a = this.f24673au;
        hVar.f24795b = this.f24670ar;
        hVar.f24796c = this.f24671as;
        hVar.f24797d = this.f24672at;
        hVar.f24798e = this.f24704bb;
        hVar.f24799f = this.f24601A;
        hVar.f24800g = this.f24602B;
        hVar.f24801h = this.f24603C;
        hVar.f24802i = this.f24604D;
        hVar.f24803j = this.f24605E;
        hVar.f24804k = this.f24608H;
        hVar.f24805l = this.f24609I;
        hVar.f24806m = this.f24619S;
        hVar.f24807n = this.f24620T;
        hVar.f24808o = this.f24656ad;
        hVar.f24809p = this.f24657ae;
        hVar.f24810q = this.f24667ao;
        hVar.f24811r = this.f24669aq;
        hVar.f24812s = this.f24668ap;
        hVar.f24813t = this.f24629aC;
        hVar.f24814u = this.f24630aD;
        hVar.f24815v = this.f24631aE;
        hVar.f24816w = this.f24634aH;
        hVar.f24817x = this.f24635aI;
        hVar.f24818y = this.f24636aJ;
        hVar.f24819z = this.f24638aL;
        hVar.f24785A = this.f24639aM;
        hVar.f24786B = this.f24640aN;
        hVar.f24787C = this.f24641aO;
        hVar.f24788D = this.f24674av;
        hVar.f24789E = this.f24675aw;
        hVar.f24790F = this.f24676ax;
        hVar.f24791G = this.f24677ay;
        hVar.f24792H = this.f24678az;
        hVar.f24793I = this.f24627aA;
        return hVar;
    }

    /* renamed from: b */
    public void mo21724b(float f) {
        this.f24667ao = f;
    }

    /* renamed from: f */
    public void mo21737f(int i) {
        this.f24668ap = i;
    }

    /* renamed from: e */
    public void mo21735e(int i) {
        this.f24669aq = i;
    }

    /* renamed from: U */
    public void mo21926U() {
        this.f24656ad = false;
    }

    /* renamed from: o */
    public void mo21997o(int i) {
        mo22007w(i);
        mo21743l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo21743l() {
        this.f24656ad = true;
        this.f24659ag = this.f24705bc;
        this.f24660ah = this.f24706bd;
        this.f24661ai = this.f24707be;
        this.f24662aj = this.f24708bf;
        this.f24663ak = this.f24709bg;
        this.f24664al = this.f24710bh;
        this.f24665am = this.f24711bi;
        this.f24666an = this.f24712bj;
        this.f24657ae = this.f24713bk;
        this.f24658af = this.f24714bl;
    }

    /* renamed from: V */
    public void mo21927V() {
        this.f24608H = false;
    }

    /* renamed from: p */
    public void mo21998p(int i) {
        mo22007w(i);
        mo21744m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo21744m() {
        this.f24608H = true;
        this.f24611K = this.f24705bc;
        this.f24612L = this.f24706bd;
        this.f24613M = this.f24707be;
        this.f24614N = this.f24708bf;
        this.f24615O = this.f24709bg;
        this.f24616P = this.f24710bh;
        this.f24617Q = this.f24711bi;
        this.f24618R = this.f24712bj;
        this.f24609I = this.f24713bk;
        this.f24610J = this.f24714bl;
    }

    /* renamed from: W */
    public void mo21928W() {
        this.f24619S = false;
    }

    /* renamed from: q */
    public void mo21999q(int i) {
        mo22007w(i);
        mo21745n();
    }

    /* renamed from: a */
    public void mo21935a(int i, float f) {
        mo21964c(i, f);
        mo21745n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo21745n() {
        this.f24619S = true;
        this.f24622V = this.f24705bc;
        this.f24623W = this.f24706bd;
        this.f24624X = this.f24707be;
        this.f24625Y = this.f24708bf;
        this.f24626Z = this.f24709bg;
        this.f24653aa = this.f24710bh;
        this.f24654ab = this.f24711bi;
        this.f24655ac = this.f24712bj;
        this.f24620T = this.f24713bk;
        this.f24621U = this.f24714bl;
    }

    /* renamed from: r */
    public void mo22000r(int i) {
        mo22007w(i);
        mo21929X();
    }

    /* renamed from: b */
    public void mo21955b(float f, float f2, float f3) {
        mo21983g(f, f2, f3);
        mo21929X();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo21929X() {
        this.f24628aB = this.f24713bk;
        this.f24629aC = this.f24705bc;
        this.f24630aD = this.f24706bd;
        this.f24631aE = this.f24707be;
        this.f24632aF = true;
    }

    /* renamed from: s */
    public void mo22001s(int i) {
        mo22007w(i);
        mo21930Y();
    }

    /* renamed from: c */
    public void mo21962c(float f, float f2, float f3) {
        mo21983g(f, f2, f3);
        mo21930Y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo21930Y() {
        this.f24633aG = this.f24713bk;
        this.f24634aH = this.f24705bc;
        this.f24635aI = this.f24706bd;
        this.f24636aJ = this.f24707be;
    }

    /* renamed from: f */
    public void mo21978f(float f) {
        this.f24641aO = f;
    }

    /* renamed from: t */
    public void mo22002t(int i) {
        mo22007w(i);
        mo21931Z();
    }

    /* renamed from: d */
    public void mo21969d(float f, float f2, float f3) {
        mo21983g(f, f2, f3);
        mo21931Z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo21931Z() {
        this.f24637aK = this.f24713bk;
        this.f24638aL = this.f24705bc;
        this.f24639aM = this.f24706bd;
        this.f24640aN = this.f24707be;
    }

    /* renamed from: aa */
    public void mo21947aa() {
        m36561c("noLights");
    }

    /* renamed from: e */
    public void mo21976e(float f, float f2, float f3) {
        m36561c("lightFalloff");
    }

    /* renamed from: f */
    public void mo21980f(float f, float f2, float f3) {
        m36561c("lightSpecular");
    }

    /* renamed from: u */
    public void mo22003u(int i) {
        mo22007w(i);
        mo21948ab();
    }

    /* renamed from: g */
    public void mo21982g(float f) {
        mo21987h(f);
        mo21948ab();
    }

    /* renamed from: e */
    public void mo21975e(float f, float f2) {
        if (this.f24748cc == 1) {
            mo21982g(f);
            return;
        }
        mo21979f(f, f2);
        mo21948ab();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public void mo21948ab() {
        this.f24646aT = this.f24705bc;
        this.f24647aU = this.f24706bd;
        this.f24648aV = this.f24707be;
        this.f24649aW = this.f24748cc == 1 ? this.f24605E : this.f24708bf;
        this.f24650aX = this.f24709bg;
        this.f24651aY = this.f24710bh;
        this.f24652aZ = this.f24711bi;
        this.f24703ba = this.f24748cc == 1 ? 255 : this.f24712bj;
        this.f24645aS = this.f24748cc == 1 ? false : this.f24714bl;
        this.f24644aR = this.f24713bk;
        mo21746o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo21746o() {
        mo21924S();
        mo21738g();
        mo21740i();
        mo21999q(this.f24644aR);
        mo21977e(0.0f, 0.0f, (float) this.f24750ce, (float) this.f24751cf);
        mo21739h();
        mo21925T();
    }

    /* renamed from: v */
    public void mo22005v(int i) {
        mo21937a(i, this.f24602B, this.f24603C, this.f24604D, this.f24605E);
    }

    /* renamed from: b */
    public void mo21957b(int i, float f) {
        mo21937a(i, f, f, f, f);
    }

    /* renamed from: a */
    public void mo21936a(int i, float f, float f2, float f3) {
        mo21937a(i, f, f2, f3, this.f24605E);
    }

    /* renamed from: a */
    public void mo21937a(int i, float f, float f2, float f3, float f4) {
        this.f24601A = i;
        this.f24602B = f;
        this.f24603C = f2;
        this.f24604D = f3;
        this.f24605E = f4;
        boolean z = false;
        this.f24606F = (f4 == 1.0f && f == f2 && f2 == f3 && f3 == f4) ? false : true;
        if (this.f24601A == 1 && this.f24605E == 255.0f && this.f24602B == 255.0f && this.f24603C == 255.0f && this.f24604D == 255.0f) {
            z = true;
        }
        this.f24607G = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo22007w(int i) {
        if ((-16777216 & i) == 0) {
            float f = (float) i;
            if (f <= this.f24602B) {
                mo21987h(f);
                return;
            }
        }
        mo21970d(i, this.f24605E);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21964c(int i, float f) {
        if ((-16777216 & i) == 0) {
            float f2 = (float) i;
            if (f2 <= this.f24602B) {
                mo21979f(f2, f);
                return;
            }
        }
        mo21970d(i, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo21987h(float f) {
        mo21979f(f, this.f24605E);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo21979f(float f, float f2) {
        if (f > this.f24602B) {
            f = this.f24602B;
        }
        if (f2 > this.f24605E) {
            f2 = this.f24605E;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (this.f24606F) {
            f /= this.f24602B;
        }
        this.f24705bc = f;
        this.f24706bd = this.f24705bc;
        this.f24707be = this.f24705bc;
        if (this.f24606F) {
            f2 /= this.f24605E;
        }
        this.f24708bf = f2;
        this.f24709bg = (int) (this.f24705bc * 255.0f);
        this.f24710bh = (int) (this.f24706bd * 255.0f);
        this.f24711bi = (int) (this.f24707be * 255.0f);
        this.f24712bj = (int) (this.f24708bf * 255.0f);
        this.f24713bk = (this.f24712bj << 24) | (this.f24709bg << 16) | (this.f24710bh << 8) | this.f24711bi;
        this.f24714bl = this.f24712bj != 255;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21983g(float f, float f2, float f3) {
        mo21988h(f, f2, f3, this.f24605E);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo21988h(float f, float f2, float f3, float f4) {
        if (f > this.f24602B) {
            f = this.f24602B;
        }
        if (f2 > this.f24603C) {
            f2 = this.f24603C;
        }
        if (f3 > this.f24604D) {
            f3 = this.f24604D;
        }
        if (f4 > this.f24605E) {
            f4 = this.f24605E;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        int i = this.f24601A;
        boolean z = true;
        if (i != 1) {
            if (i == 3) {
                float f5 = f / this.f24602B;
                float f6 = f2 / this.f24603C;
                float f7 = f3 / this.f24604D;
                if (this.f24606F) {
                    f4 /= this.f24605E;
                }
                this.f24708bf = f4;
                if (f6 != 0.0f) {
                    float f8 = (f5 - ((float) ((int) f5))) * 6.0f;
                    int i2 = (int) f8;
                    float f9 = f8 - ((float) i2);
                    float f10 = (1.0f - f6) * f7;
                    float f11 = (1.0f - (f6 * f9)) * f7;
                    float f12 = (1.0f - (f6 * (1.0f - f9))) * f7;
                    switch (i2) {
                        case 0:
                            this.f24705bc = f7;
                            this.f24706bd = f12;
                            this.f24707be = f10;
                            break;
                        case 1:
                            this.f24705bc = f11;
                            this.f24706bd = f7;
                            this.f24707be = f10;
                            break;
                        case 2:
                            this.f24705bc = f10;
                            this.f24706bd = f7;
                            this.f24707be = f12;
                            break;
                        case 3:
                            this.f24705bc = f10;
                            this.f24706bd = f11;
                            this.f24707be = f7;
                            break;
                        case 4:
                            this.f24705bc = f12;
                            this.f24706bd = f10;
                            this.f24707be = f7;
                            break;
                        case 5:
                            this.f24705bc = f7;
                            this.f24706bd = f10;
                            this.f24707be = f11;
                            break;
                    }
                } else {
                    this.f24707be = f7;
                    this.f24706bd = f7;
                    this.f24705bc = f7;
                }
            }
        } else if (this.f24606F) {
            this.f24705bc = f / this.f24602B;
            this.f24706bd = f2 / this.f24603C;
            this.f24707be = f3 / this.f24604D;
            this.f24708bf = f4 / this.f24605E;
        } else {
            this.f24705bc = f;
            this.f24706bd = f2;
            this.f24707be = f3;
            this.f24708bf = f4;
        }
        this.f24709bg = (int) (this.f24705bc * 255.0f);
        this.f24710bh = (int) (this.f24706bd * 255.0f);
        this.f24711bi = (int) (this.f24707be * 255.0f);
        this.f24712bj = (int) (this.f24708bf * 255.0f);
        this.f24713bk = (this.f24712bj << 24) | (this.f24709bg << 16) | (this.f24710bh << 8) | this.f24711bi;
        if (this.f24712bj == 255) {
            z = false;
        }
        this.f24714bl = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21970d(int i, float f) {
        if (f == this.f24605E) {
            this.f24712bj = (i >> 24) & 255;
            this.f24713bk = i;
        } else {
            this.f24712bj = (int) (((float) ((i >> 24) & 255)) * (f / this.f24605E));
            this.f24713bk = (this.f24712bj << 24) | (16777215 & i);
        }
        this.f24709bg = (i >> 16) & 255;
        this.f24710bh = (i >> 8) & 255;
        this.f24711bi = i & 255;
        this.f24708bf = ((float) this.f24712bj) / 255.0f;
        this.f24705bc = ((float) this.f24709bg) / 255.0f;
        this.f24706bd = ((float) this.f24710bh) / 255.0f;
        this.f24707be = ((float) this.f24711bi) / 255.0f;
        this.f24714bl = this.f24712bj != 255;
    }

    /* renamed from: e */
    public final int mo21973e(int i, int i2) {
        if (this.f24607G) {
            if (i > 255) {
                i = 255;
            } else if (i < 0) {
                i = 0;
            }
            if (i2 > 255) {
                i2 = 255;
            } else if (i2 < 0) {
                i2 = 0;
            }
            return i | ((i2 & 255) << 24) | (i << 16) | (i << 8);
        }
        mo21964c(i, (float) i2);
        return this.f24713bk;
    }

    /* renamed from: x */
    public final float mo22008x(int i) {
        float f = (float) ((i >> 16) & 255);
        if (this.f24607G) {
            return f;
        }
        return (f / 255.0f) * this.f24602B;
    }

    /* renamed from: y */
    public final float mo22010y(int i) {
        float f = (float) ((i >> 8) & 255);
        if (this.f24607G) {
            return f;
        }
        return (f / 255.0f) * this.f24603C;
    }

    /* renamed from: z */
    public final float mo22012z(int i) {
        float f = (float) (i & 255);
        if (this.f24607G) {
            return f;
        }
        return (f / 255.0f) * this.f24604D;
    }

    /* renamed from: a */
    public static void m36558a(String str) {
        if (f24599ca == null) {
            f24599ca = new HashMap<>();
        }
        if (!f24599ca.containsKey(str)) {
            System.err.println(str);
            f24599ca.put(str, new Object());
        }
    }

    /* renamed from: a */
    public static void m36559a(String str, Object... objArr) {
        m36558a(String.format(str, objArr));
    }

    /* renamed from: b */
    public static void m36560b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("() with x, y, and z coordinates can only be used with a renderer that supports 3D, such as P3D or OPENGL. Use a version without a z-coordinate instead.");
        m36558a(sb.toString());
    }

    /* renamed from: c */
    public static void m36561c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("() is not available with this renderer.");
        m36558a(sb.toString());
    }

    /* renamed from: d */
    public static void m36562d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" is not available with this renderer.");
        m36558a(sb.toString());
    }

    /* renamed from: e */
    public static void m36563e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(), or this particular variation of it, is not available with this renderer.");
        m36558a(sb.toString());
    }

    /* renamed from: f */
    public static void m36564f(String str) {
        throw new RuntimeException(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21986g(String str) {
        mo21944a(str, 12.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21944a(String str, float f) {
        if (this.f24755cj != null) {
            this.f24674av = this.f24755cj.mo21865i(f);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Use textFont() before ");
        sb.append(str);
        sb.append("()");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: h */
    public boolean mo21990h(String str) {
        if (this.f24734y[12]) {
            return super.mo21990h(str);
        }
        if (f24600cb == null) {
            f24600cb = new C6990a();
        }
        if (!this.f24762cq) {
            mo21747p();
        }
        C6992d a = f24600cb.mo22014a(this.f24753ch, this.f24754ci, this.f24748cc);
        if (a == null) {
            return false;
        }
        System.arraycopy(this.f24749cd, 0, a.f24749cd, 0, C6982a.m36422d(this.f24749cd.length, a.f24749cd.length));
        f24600cb.mo22015a(this, a, str);
        return true;
    }
}
