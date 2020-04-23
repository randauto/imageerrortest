package p256e.p262f;

import java.net.URL;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import p256e.p259c.C6982a;
import p256e.p259c.C6989c;
import p256e.p259c.C6992d;

/* renamed from: e.f.j */
/* compiled from: PShader */
public class C7082j {

    /* renamed from: a */
    protected static String f25833a = "attribute *vec2 *offset";

    /* renamed from: b */
    protected static String f25834b = "in *vec2 *offset;";

    /* renamed from: c */
    protected static String f25835c = "attribute *vec4 *direction";

    /* renamed from: d */
    protected static String f25836d = "in *vec4 *direction";

    /* renamed from: e */
    protected static String f25837e = "#define *PROCESSING_POINT_SHADER";

    /* renamed from: f */
    protected static String f25838f = "#define *PROCESSING_LINE_SHADER";

    /* renamed from: g */
    protected static String f25839g = "#define *PROCESSING_COLOR_SHADER";

    /* renamed from: h */
    protected static String f25840h = "#define *PROCESSING_LIGHT_SHADER";

    /* renamed from: i */
    protected static String f25841i = "#define *PROCESSING_TEXTURE_SHADER";

    /* renamed from: j */
    protected static String f25842j = "#define *PROCESSING_TEXLIGHT_SHADER";

    /* renamed from: k */
    protected static String f25843k = "#define *PROCESSING_POLYGON_SHADER";

    /* renamed from: l */
    protected static String f25844l = "#define *PROCESSING_TRIANGLES_SHADER";

    /* renamed from: m */
    protected static String f25845m = "#define *PROCESSING_QUADS_SHADER";

    /* renamed from: A */
    protected String[] f25846A;

    /* renamed from: B */
    protected String[] f25847B;

    /* renamed from: C */
    protected boolean f25848C;

    /* renamed from: D */
    protected HashMap<Integer, C7083a> f25849D;

    /* renamed from: E */
    protected HashMap<Integer, C7088l> f25850E;

    /* renamed from: F */
    protected HashMap<Integer, Integer> f25851F;

    /* renamed from: G */
    protected IntBuffer f25852G;

    /* renamed from: H */
    protected FloatBuffer f25853H;

    /* renamed from: I */
    protected boolean f25854I;

    /* renamed from: J */
    protected boolean f25855J;

    /* renamed from: K */
    protected int f25856K;

    /* renamed from: L */
    protected int f25857L;

    /* renamed from: M */
    protected int f25858M;

    /* renamed from: N */
    protected int f25859N;

    /* renamed from: O */
    protected int f25860O;

    /* renamed from: P */
    protected int f25861P;

    /* renamed from: Q */
    protected int f25862Q;

    /* renamed from: R */
    protected int f25863R;

    /* renamed from: S */
    protected int f25864S;

    /* renamed from: T */
    protected int f25865T;

    /* renamed from: U */
    protected int f25866U;

    /* renamed from: V */
    protected int f25867V;

    /* renamed from: W */
    protected int f25868W;

    /* renamed from: X */
    protected int f25869X;

    /* renamed from: Y */
    protected int f25870Y;

    /* renamed from: Z */
    protected int f25871Z;

    /* renamed from: aa */
    protected int f25872aa;

    /* renamed from: ab */
    protected C7088l f25873ab;

    /* renamed from: ac */
    protected int f25874ac;

    /* renamed from: ad */
    protected int f25875ad;

    /* renamed from: ae */
    protected int f25876ae;

    /* renamed from: af */
    protected int f25877af;

    /* renamed from: ag */
    protected float[] f25878ag;

    /* renamed from: ah */
    protected int f25879ah;

    /* renamed from: ai */
    protected int f25880ai;

    /* renamed from: aj */
    protected int f25881aj;

    /* renamed from: ak */
    protected int f25882ak;

    /* renamed from: al */
    protected int f25883al;

    /* renamed from: am */
    protected int f25884am;

    /* renamed from: an */
    protected int f25885an;

    /* renamed from: ao */
    protected int f25886ao;

    /* renamed from: ap */
    protected int f25887ap;

    /* renamed from: aq */
    protected int f25888aq;

    /* renamed from: ar */
    protected int f25889ar;

    /* renamed from: as */
    private C7072f f25890as;

    /* renamed from: n */
    protected C6982a f25891n;

    /* renamed from: o */
    protected C7065i f25892o;

    /* renamed from: p */
    protected C7065i f25893p;

    /* renamed from: q */
    protected C7056e f25894q;

    /* renamed from: r */
    protected int f25895r;

    /* renamed from: s */
    protected int f25896s;

    /* renamed from: t */
    public int f25897t;

    /* renamed from: u */
    public int f25898u;

    /* renamed from: v */
    public int f25899v;

    /* renamed from: w */
    protected URL f25900w;

    /* renamed from: x */
    protected URL f25901x;

    /* renamed from: y */
    protected String f25902y;

    /* renamed from: z */
    protected String f25903z;

    /* renamed from: e.f.j$a */
    /* compiled from: PShader */
    protected static class C7083a {

        /* renamed from: a */
        int f25904a;

        /* renamed from: b */
        Object f25905b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22791c() {
    }

    public C7082j() {
        this.f25849D = null;
        this.f25854I = false;
        this.f25855J = false;
        this.f25891n = null;
        this.f25894q = null;
        this.f25895r = -1;
        this.f25900w = null;
        this.f25901x = null;
        this.f25902y = null;
        this.f25903z = null;
        this.f25897t = 0;
        this.f25898u = 0;
        this.f25899v = 0;
        this.f25852G = C7056e.m37134r(1);
        this.f25853H = C7056e.m37136t(1);
        this.f25848C = false;
        this.f25896s = -1;
    }

    public C7082j(C6982a aVar, String[] strArr, String[] strArr2) {
        this.f25849D = null;
        this.f25854I = false;
        this.f25855J = false;
        this.f25891n = aVar;
        this.f25892o = (C7065i) aVar.f24532d;
        this.f25894q = this.f25892o.f25493a;
        this.f25900w = null;
        this.f25901x = null;
        this.f25902y = null;
        this.f25903z = null;
        this.f25846A = strArr;
        this.f25847B = strArr2;
        this.f25897t = 0;
        this.f25898u = 0;
        this.f25899v = 0;
        this.f25852G = C7056e.m37134r(1);
        this.f25853H = C7056e.m37136t(1);
        int a = m37974a(this.f25846A, -1);
        int a2 = m37974a(this.f25847B, -1);
        if (a == -1 && a2 == -1) {
            this.f25896s = 2;
        } else if (a == -1) {
            this.f25896s = a2;
        } else if (a2 == -1) {
            this.f25896s = a;
        } else if (a2 == a) {
            this.f25896s = a;
        } else {
            C6989c.m36558a("The vertex and fragment shaders have different types");
        }
    }

    /* renamed from: a */
    public void mo22773a() {
        mo22799g();
        if (!this.f25848C) {
            this.f25894q.mo22224J(this.f25897t);
            this.f25848C = true;
            mo22793d();
            mo22795e();
        }
        if (mo22814r()) {
            mo22819w();
        }
    }

    /* renamed from: b */
    public void mo22789b() {
        if (mo22814r()) {
            mo22820x();
        }
        if (this.f25848C) {
            mo22797f();
            this.f25894q.mo22224J(0);
            this.f25848C = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22778a(int i, int i2, int i3) {
        this.f25894q.mo22310c(C7056e.f25188ck, i);
        this.f25894q.mo22323d(C7056e.f25201cx, i2, C7056e.f25100aT, i3 * C7056e.f25099aS);
        this.f25894q.mo22310c(C7056e.f25188ck, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22772a(String str) {
        mo22799g();
        return this.f25894q.mo22308c(this.f25897t, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo22788b(String str) {
        mo22799g();
        return this.f25894q.mo22320d(this.f25897t, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22780a(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
        if (-1 < i) {
            int i7 = i2;
            this.f25894q.mo22310c(C7056e.f25187cj, i2);
            this.f25894q.mo22275a(i, i3, i4, z, i5, i6);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22777a(int i, int i2) {
        if (-1 < i) {
            this.f25894q.mo22341g(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22774a(int i, float f, float f2) {
        if (-1 < i) {
            this.f25894q.mo22261a(i, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22775a(int i, float f, float f2, float f3) {
        if (-1 < i) {
            this.f25894q.mo22262a(i, f, f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22776a(int i, float f, float f2, float f3, float f4) {
        if (-1 < i) {
            this.f25894q.mo22263a(i, f, f2, f3, f4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22782a(int i, float[] fArr, int i2, int i3) {
        if (-1 < i) {
            mo22785a(fArr);
            if (i2 == 1) {
                this.f25894q.mo22277a(i, i3, this.f25853H);
            } else if (i2 == 2) {
                this.f25894q.mo22300b(i, i3, this.f25853H);
            } else if (i2 == 3) {
                this.f25894q.mo22315c(i, i3, this.f25853H);
            } else if (i2 == 4) {
                this.f25894q.mo22325d(i, i3, this.f25853H);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22781a(int i, float[] fArr) {
        if (-1 < i) {
            mo22785a(fArr);
            if (fArr.length == 4) {
                this.f25894q.mo22279a(i, 1, false, this.f25853H);
            } else if (fArr.length == 9) {
                this.f25894q.mo22302b(i, 1, false, this.f25853H);
            } else if (fArr.length == 16) {
                this.f25894q.mo22317c(i, 1, false, this.f25853H);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo22793d() {
        if (this.f25849D != null && this.f25849D.size() > 0) {
            int i = 0;
            for (Integer num : this.f25849D.keySet()) {
                C7083a aVar = (C7083a) this.f25849D.get(num);
                if (aVar.f25904a == 0) {
                    this.f25894q.mo22341g(num.intValue(), ((int[]) aVar.f25905b)[0]);
                } else if (aVar.f25904a == 1) {
                    int[] iArr = (int[]) aVar.f25905b;
                    this.f25894q.mo22322d(num.intValue(), iArr[0], iArr[1]);
                } else if (aVar.f25904a == 2) {
                    int[] iArr2 = (int[]) aVar.f25905b;
                    this.f25894q.mo22338f(num.intValue(), iArr2[0], iArr2[1], iArr2[2]);
                } else if (aVar.f25904a == 3) {
                    int[] iArr3 = (int[]) aVar.f25905b;
                    this.f25894q.mo22297b(num.intValue(), iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
                } else if (aVar.f25904a == 4) {
                    this.f25894q.mo22260a(num.intValue(), ((float[]) aVar.f25905b)[0]);
                } else if (aVar.f25904a == 5) {
                    float[] fArr = (float[]) aVar.f25905b;
                    this.f25894q.mo22261a(num.intValue(), fArr[0], fArr[1]);
                } else if (aVar.f25904a == 6) {
                    float[] fArr2 = (float[]) aVar.f25905b;
                    this.f25894q.mo22262a(num.intValue(), fArr2[0], fArr2[1], fArr2[2]);
                } else if (aVar.f25904a == 7) {
                    float[] fArr3 = (float[]) aVar.f25905b;
                    this.f25894q.mo22263a(num.intValue(), fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                } else if (aVar.f25904a == 8) {
                    int[] iArr4 = (int[]) aVar.f25905b;
                    mo22786a(iArr4);
                    this.f25894q.mo22278a(num.intValue(), iArr4.length, this.f25852G);
                } else if (aVar.f25904a == 9) {
                    int[] iArr5 = (int[]) aVar.f25905b;
                    mo22786a(iArr5);
                    this.f25894q.mo22301b(num.intValue(), iArr5.length / 2, this.f25852G);
                } else if (aVar.f25904a == 10) {
                    int[] iArr6 = (int[]) aVar.f25905b;
                    mo22786a(iArr6);
                    this.f25894q.mo22316c(num.intValue(), iArr6.length / 3, this.f25852G);
                } else if (aVar.f25904a == 11) {
                    int[] iArr7 = (int[]) aVar.f25905b;
                    mo22786a(iArr7);
                    this.f25894q.mo22326d(num.intValue(), iArr7.length / 4, this.f25852G);
                } else if (aVar.f25904a == 12) {
                    float[] fArr4 = (float[]) aVar.f25905b;
                    mo22785a(fArr4);
                    this.f25894q.mo22277a(num.intValue(), fArr4.length, this.f25853H);
                } else if (aVar.f25904a == 13) {
                    float[] fArr5 = (float[]) aVar.f25905b;
                    mo22785a(fArr5);
                    this.f25894q.mo22300b(num.intValue(), fArr5.length / 2, this.f25853H);
                } else if (aVar.f25904a == 14) {
                    float[] fArr6 = (float[]) aVar.f25905b;
                    mo22785a(fArr6);
                    this.f25894q.mo22315c(num.intValue(), fArr6.length / 3, this.f25853H);
                } else if (aVar.f25904a == 15) {
                    float[] fArr7 = (float[]) aVar.f25905b;
                    mo22785a(fArr7);
                    this.f25894q.mo22325d(num.intValue(), fArr7.length / 4, this.f25853H);
                } else if (aVar.f25904a == 16) {
                    mo22785a((float[]) aVar.f25905b);
                    this.f25894q.mo22279a(num.intValue(), 1, false, this.f25853H);
                } else if (aVar.f25904a == 17) {
                    mo22785a((float[]) aVar.f25905b);
                    this.f25894q.mo22302b(num.intValue(), 1, false, this.f25853H);
                } else if (aVar.f25904a == 18) {
                    mo22785a((float[]) aVar.f25905b);
                    this.f25894q.mo22317c(num.intValue(), 1, false, this.f25853H);
                } else if (aVar.f25904a == 19) {
                    C7088l e = this.f25893p.mo22486e((C6992d) aVar.f25905b);
                    if (this.f25850E == null) {
                        this.f25850E = new HashMap<>();
                    }
                    this.f25850E.put(num, e);
                    if (this.f25851F == null) {
                        this.f25851F = new HashMap<>();
                    }
                    if (this.f25851F.containsKey(num)) {
                        i = ((Integer) this.f25851F.get(num)).intValue();
                        this.f25894q.mo22341g(num.intValue(), i);
                    } else {
                        this.f25851F.put(num, Integer.valueOf(i));
                        this.f25894q.mo22341g(num.intValue(), i);
                    }
                    i++;
                }
            }
            this.f25849D.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22786a(int[] iArr) {
        this.f25852G = C7056e.m37107a(this.f25852G, iArr, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22785a(float[] fArr) {
        this.f25853H = C7056e.m37105a(this.f25853H, fArr, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo22795e() {
        if (this.f25850E != null && this.f25851F != null) {
            for (Integer intValue : this.f25850E.keySet()) {
                int intValue2 = intValue.intValue();
                C7088l lVar = (C7088l) this.f25850E.get(Integer.valueOf(intValue2));
                Integer num = (Integer) this.f25851F.get(Integer.valueOf(intValue2));
                if (num != null) {
                    this.f25894q.mo22213D(C7056e.f25175cX + num.intValue());
                    lVar.mo22869f();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot find unit for texture ");
                    sb.append(lVar);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo22797f() {
        if (this.f25850E != null && this.f25851F != null) {
            for (Integer intValue : this.f25850E.keySet()) {
                int intValue2 = intValue.intValue();
                C7088l lVar = (C7088l) this.f25850E.get(Integer.valueOf(intValue2));
                Integer num = (Integer) this.f25851F.get(Integer.valueOf(intValue2));
                if (num != null) {
                    this.f25894q.mo22213D(C7056e.f25175cX + num.intValue());
                    lVar.mo22870g();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot find unit for texture ");
                    sb.append(lVar);
                    throw new RuntimeException(sb.toString());
                }
            }
            this.f25894q.mo22213D(C7056e.f25175cX);
        }
    }

    /* renamed from: g */
    public void mo22799g() {
        if (this.f25897t == 0 || mo22807k()) {
            mo22801h();
            if (mo22804i()) {
                this.f25894q.mo22337f(this.f25897t, this.f25898u);
                this.f25894q.mo22337f(this.f25897t, this.f25899v);
                mo22791c();
                this.f25894q.mo22222I(this.f25897t);
                mo22805j();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo22801h() {
        this.f25895r = this.f25894q.mo22208B();
        this.f25890as = new C7072f(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo22804i() {
        boolean z;
        boolean z2;
        if (mo22808l()) {
            z = mo22810n();
        } else {
            C6989c.m36564f("Doesn't have a vertex shader");
            z = true;
        }
        if (mo22809m()) {
            z2 = mo22811o();
        } else {
            C6989c.m36564f("Doesn't have a fragment shader");
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo22805j() {
        this.f25894q.mo22339f(this.f25897t, C7056e.f25248ds, this.f25852G);
        boolean z = false;
        if (!(this.f25852G.get(0) != 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot link shader program:\n");
            sb.append(this.f25894q.mo22232N(this.f25897t));
            C6989c.m36564f(sb.toString());
        }
        this.f25894q.mo22228L(this.f25897t);
        this.f25894q.mo22339f(this.f25897t, C7056e.f25249dt, this.f25852G);
        if (this.f25852G.get(0) != 0) {
            z = true;
        }
        if (!z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot validate shader program:\n");
            sb2.append(this.f25894q.mo22232N(this.f25897t));
            C6989c.m36564f(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo22807k() {
        boolean z = !this.f25894q.mo22328d(this.f25895r);
        if (z) {
            mo22812p();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo22808l() {
        return this.f25846A != null && this.f25846A.length > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo22809m() {
        return this.f25847B != null && this.f25847B.length > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo22810n() {
        this.f25894q.mo22303b(this.f25898u, C6982a.m36404a(this.f25846A, "\n"));
        this.f25894q.mo22218G(this.f25898u);
        this.f25894q.mo22333e(this.f25898u, C7056e.f25247dr, this.f25852G);
        if (this.f25852G.get(0) != 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot compile vertex shader:\n");
        sb.append(this.f25894q.mo22230M(this.f25898u));
        C6989c.m36564f(sb.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo22811o() {
        this.f25894q.mo22303b(this.f25899v, C6982a.m36404a(this.f25847B, "\n"));
        this.f25894q.mo22218G(this.f25899v);
        this.f25894q.mo22333e(this.f25899v, C7056e.f25247dr, this.f25852G);
        if (this.f25852G.get(0) != 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot compile fragment shader:\n");
        sb.append(this.f25894q.mo22230M(this.f25899v));
        C6989c.m36564f(sb.toString());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22812p() {
        if (this.f25890as != null) {
            this.f25890as.mo22504a();
            this.f25898u = 0;
            this.f25899v = 0;
            this.f25897t = 0;
            this.f25890as = null;
        }
    }

    /* renamed from: a */
    protected static int m37974a(String[] strArr, int i) {
        for (String trim : strArr) {
            String trim2 = trim.trim();
            if (C6982a.m36410a(trim2, f25839g) != null) {
                return 3;
            }
            if (C6982a.m36410a(trim2, f25840h) != null) {
                return 4;
            }
            if (C6982a.m36410a(trim2, f25841i) != null) {
                return 5;
            }
            if (C6982a.m36410a(trim2, f25842j) != null) {
                return 6;
            }
            if (C6982a.m36410a(trim2, f25843k) != null || C6982a.m36410a(trim2, f25844l) != null || C6982a.m36410a(trim2, f25845m) != null) {
                return 2;
            }
            if (C6982a.m36410a(trim2, f25837e) != null) {
                return 0;
            }
            if (C6982a.m36410a(trim2, f25838f) != null) {
                return 1;
            }
            if (C6982a.m36410a(trim2, f25833a) != null || C6982a.m36410a(trim2, f25834b) != null) {
                return 0;
            }
            if (C6982a.m36410a(trim2, f25835c) != null || C6982a.m36410a(trim2, f25836d) != null) {
                return 1;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo22813q() {
        return this.f25896s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo22814r() {
        return this.f25896s >= 0 && this.f25896s <= 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22787a(int i) {
        if (mo22813q() == 2 || mo22813q() == i) {
            return true;
        }
        if (i == 6) {
            C6989c.m36558a("Your shader needs to be of TEXLIGHT type to render this geometry properly, using default shader instead.");
        } else if (i == 4) {
            C6989c.m36558a("Your shader needs to be of LIGHT type to render this geometry properly, using default shader instead.");
        } else if (i == 5) {
            C6989c.m36558a("Your shader needs to be of TEXTURE type to render this geometry properly, using default shader instead.");
        } else if (i == 3) {
            C6989c.m36558a("Your shader needs to be of COLOR type to render this geometry properly, using default shader instead.");
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int mo22815s() {
        if (this.f25851F == null) {
            return -1;
        }
        return this.f25851F.size() - 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22783a(C7065i iVar) {
        this.f25893p = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22816t() {
        if (!this.f25854I) {
            this.f25879ah = mo22772a("vertex");
            if (this.f25879ah == -1) {
                this.f25879ah = mo22772a("position");
            }
            this.f25880ai = mo22772a("color");
            this.f25882ak = mo22772a("texCoord");
            this.f25881aj = mo22772a("normal");
            this.f25886ao = mo22772a("ambient");
            this.f25887ap = mo22772a("specular");
            this.f25888aq = mo22772a("emissive");
            this.f25889ar = mo22772a("shininess");
            this.f25884am = mo22772a("direction");
            this.f25885an = mo22772a("offset");
            this.f25884am = mo22772a("direction");
            this.f25885an = mo22772a("offset");
            this.f25854I = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo22817u() {
        if (!this.f25855J) {
            this.f25856K = mo22788b("transform");
            if (this.f25856K == -1) {
                this.f25856K = mo22788b("transformMatrix");
            }
            this.f25857L = mo22788b("modelview");
            if (this.f25857L == -1) {
                this.f25857L = mo22788b("modelviewMatrix");
            }
            this.f25858M = mo22788b("projection");
            if (this.f25858M == -1) {
                this.f25858M = mo22788b("projectionMatrix");
            }
            this.f25861P = mo22788b("viewport");
            this.f25862Q = mo22788b("resolution");
            this.f25859N = mo22788b("ppixels");
            this.f25883al = mo22788b("normalMatrix");
            this.f25865T = mo22788b("lightCount");
            this.f25866U = mo22788b("lightPosition");
            this.f25867V = mo22788b("lightNormal");
            this.f25868W = mo22788b("lightAmbient");
            this.f25869X = mo22788b("lightDiffuse");
            this.f25870Y = mo22788b("lightSpecular");
            this.f25871Z = mo22788b("lightFalloff");
            this.f25872aa = mo22788b("lightSpot");
            this.f25875ad = mo22788b("texture");
            if (this.f25875ad == -1) {
                this.f25875ad = mo22788b("texMap");
            }
            this.f25876ae = mo22788b("texMatrix");
            this.f25877af = mo22788b("texOffset");
            this.f25863R = mo22788b("perspective");
            this.f25864S = mo22788b("scale");
            this.f25855J = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo22818v() {
        if (-1 < this.f25856K) {
            this.f25893p.mo22431aL();
            mo22781a(this.f25856K, this.f25893p.f25532dZ);
        }
        if (-1 < this.f25857L) {
            this.f25893p.mo22430aK();
            mo22781a(this.f25857L, this.f25893p.f25531dY);
        }
        if (-1 < this.f25858M) {
            this.f25893p.mo22429aJ();
            mo22781a(this.f25858M, this.f25893p.f25530dX);
        }
        if (-1 < this.f25861P) {
            mo22776a(this.f25861P, (float) this.f25893p.f25574eY.get(0), (float) this.f25893p.f25574eY.get(1), (float) this.f25893p.f25574eY.get(2), (float) this.f25893p.f25574eY.get(3));
        }
        if (-1 < this.f25862Q) {
            mo22774a(this.f25862Q, (float) this.f25893p.f25574eY.get(2), (float) this.f25893p.f25574eY.get(3));
        }
        if (-1 < this.f25859N) {
            this.f25860O = mo22815s() + 1;
            mo22777a(this.f25859N, this.f25860O);
            this.f25894q.mo22213D(C7056e.f25175cX + this.f25860O);
            this.f25893p.mo22467bf();
            return;
        }
        this.f25860O = -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo22819w() {
        if (this.f25893p == null) {
            mo22783a(this.f25892o.mo22423aD());
            mo22816t();
            mo22817u();
        }
        mo22818v();
        if (-1 < this.f25879ah) {
            this.f25894q.mo22382z(this.f25879ah);
        }
        if (-1 < this.f25880ai) {
            this.f25894q.mo22382z(this.f25880ai);
        }
        if (-1 < this.f25882ak) {
            this.f25894q.mo22382z(this.f25882ak);
        }
        if (-1 < this.f25881aj) {
            this.f25894q.mo22382z(this.f25881aj);
        }
        if (-1 < this.f25883al) {
            this.f25893p.mo22432aM();
            mo22781a(this.f25883al, this.f25893p.f25576ea);
        }
        if (-1 < this.f25886ao) {
            this.f25894q.mo22382z(this.f25886ao);
        }
        if (-1 < this.f25887ap) {
            this.f25894q.mo22382z(this.f25887ap);
        }
        if (-1 < this.f25888aq) {
            this.f25894q.mo22382z(this.f25888aq);
        }
        if (-1 < this.f25889ar) {
            this.f25894q.mo22382z(this.f25889ar);
        }
        int i = this.f25893p.f25586el;
        mo22777a(this.f25865T, i);
        if (i > 0) {
            mo22782a(this.f25866U, this.f25893p.f25588en, 4, i);
            mo22782a(this.f25867V, this.f25893p.f25589eo, 3, i);
            mo22782a(this.f25868W, this.f25893p.f25590ep, 3, i);
            mo22782a(this.f25869X, this.f25893p.f25591eq, 3, i);
            mo22782a(this.f25870Y, this.f25893p.f25592er, 3, i);
            mo22782a(this.f25871Z, this.f25893p.f25593es, 3, i);
            mo22782a(this.f25872aa, this.f25893p.f25594et, 2, i);
        }
        if (-1 < this.f25884am) {
            this.f25894q.mo22382z(this.f25884am);
        }
        if (-1 < this.f25885an) {
            this.f25894q.mo22382z(this.f25885an);
        }
        if (-1 < this.f25863R) {
            if (!this.f25893p.mo22406B(7) || !this.f25893p.mo22444aY()) {
                mo22777a(this.f25863R, 0);
            } else {
                mo22777a(this.f25863R, 1);
            }
        }
        if (-1 >= this.f25864S) {
            return;
        }
        if (this.f25893p.mo22406B(6)) {
            mo22775a(this.f25864S, 1.0f, 1.0f, 1.0f);
            return;
        }
        float f = C7056e.f25363z;
        if (this.f25893p.mo22443aX()) {
            mo22775a(this.f25864S, 1.0f, 1.0f, f);
        } else {
            mo22775a(this.f25864S, f, f, f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo22820x() {
        if (-1 < this.f25885an) {
            this.f25894q.mo22207A(this.f25885an);
        }
        if (-1 < this.f25884am) {
            this.f25894q.mo22207A(this.f25884am);
        }
        if (-1 < this.f25875ad && this.f25873ab != null) {
            this.f25894q.mo22213D(C7056e.f25175cX + this.f25874ac);
            this.f25873ab.mo22870g();
            this.f25894q.mo22213D(C7056e.f25175cX);
            this.f25873ab = null;
        }
        if (-1 < this.f25886ao) {
            this.f25894q.mo22207A(this.f25886ao);
        }
        if (-1 < this.f25887ap) {
            this.f25894q.mo22207A(this.f25887ap);
        }
        if (-1 < this.f25888aq) {
            this.f25894q.mo22207A(this.f25888aq);
        }
        if (-1 < this.f25889ar) {
            this.f25894q.mo22207A(this.f25889ar);
        }
        if (-1 < this.f25879ah) {
            this.f25894q.mo22207A(this.f25879ah);
        }
        if (-1 < this.f25880ai) {
            this.f25894q.mo22207A(this.f25880ai);
        }
        if (-1 < this.f25882ak) {
            this.f25894q.mo22207A(this.f25882ak);
        }
        if (-1 < this.f25881aj) {
            this.f25894q.mo22207A(this.f25881aj);
        }
        if (-1 < this.f25859N) {
            this.f25894q.mo22346h();
            this.f25894q.mo22213D(C7056e.f25175cX + this.f25860O);
            this.f25893p.mo22468bg();
            this.f25894q.mo22213D(C7056e.f25175cX);
        }
        this.f25894q.mo22310c(C7056e.f25187cj, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22784a(C7088l lVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        this.f25873ab = lVar;
        float f7 = 1.0f;
        if (lVar != null) {
            float f8 = -1.0f;
            if (lVar.mo22866c()) {
                f5 = -1.0f;
                f4 = 1.0f;
            } else {
                f5 = 1.0f;
                f4 = 0.0f;
            }
            if (lVar.mo22867d()) {
                f6 = 1.0f;
            } else {
                f8 = 1.0f;
                f6 = 0.0f;
            }
            float a = f5 * lVar.mo22841a();
            f2 = f4 * lVar.mo22841a();
            f3 = f8 * lVar.mo22858b();
            f = f6 * lVar.mo22858b();
            mo22774a(this.f25877af, 1.0f / ((float) lVar.f25939a), 1.0f / ((float) lVar.f25940b));
            if (-1 < this.f25875ad) {
                this.f25874ac = (-1 < this.f25860O ? this.f25860O : mo22815s()) + 1;
                mo22777a(this.f25875ad, this.f25874ac);
                this.f25894q.mo22213D(C7056e.f25175cX + this.f25874ac);
                lVar.mo22869f();
            }
            f7 = a;
        } else {
            f3 = 1.0f;
            f2 = 0.0f;
            f = 0.0f;
        }
        if (-1 < this.f25876ae) {
            if (this.f25878ag == null) {
                this.f25878ag = new float[16];
            }
            this.f25878ag[0] = f7;
            this.f25878ag[4] = 0.0f;
            this.f25878ag[8] = 0.0f;
            this.f25878ag[12] = f2;
            this.f25878ag[1] = 0.0f;
            this.f25878ag[5] = f3;
            this.f25878ag[9] = 0.0f;
            this.f25878ag[13] = f;
            this.f25878ag[2] = 0.0f;
            this.f25878ag[6] = 0.0f;
            this.f25878ag[10] = 0.0f;
            this.f25878ag[14] = 0.0f;
            this.f25878ag[3] = 0.0f;
            this.f25878ag[7] = 0.0f;
            this.f25878ag[11] = 0.0f;
            this.f25878ag[15] = 0.0f;
            mo22781a(this.f25876ae, this.f25878ag);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo22821y() {
        return -1 < this.f25882ak;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo22822z() {
        return -1 < this.f25881aj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo22771A() {
        return -1 < this.f25886ao || -1 < this.f25887ap || -1 < this.f25888aq || -1 < this.f25889ar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22779a(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25879ah, i, i2, i3, false, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22790b(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25880ai, i, i2, i3, true, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22792c(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25881aj, i, i2, i3, false, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo22794d(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25882ak, i, i2, i3, false, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo22796e(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25886ao, i, i2, i3, true, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo22798f(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25887ap, i, i2, i3, true, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo22800g(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25888aq, i, i2, i3, true, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo22802h(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25889ar, i, i2, i3, false, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo22803i(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25884am, i, i2, i3, false, i4, i5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo22806j(int i, int i2, int i3, int i4, int i5) {
        mo22780a(this.f25885an, i, i2, i3, false, i4, i5);
    }
}
