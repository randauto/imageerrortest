package p256e.p262f.p263a;

/* renamed from: e.f.a.h */
/* compiled from: GLUtessellatorImpl */
public class C7023h implements C7029n {

    /* renamed from: H */
    private static C7030o f24931H = new C7031p();

    /* renamed from: p */
    static final /* synthetic */ boolean f24932p = (!C7023h.class.desiredAssertionStatus());

    /* renamed from: A */
    private C7030o f24933A;

    /* renamed from: B */
    private C7030o f24934B;

    /* renamed from: C */
    private C7030o f24935C;

    /* renamed from: D */
    private C7030o f24936D;

    /* renamed from: E */
    private C7030o f24937E;

    /* renamed from: F */
    private C7030o f24938F;

    /* renamed from: G */
    private C7030o f24939G;

    /* renamed from: a */
    C7022g f24940a;

    /* renamed from: b */
    double[] f24941b = new double[3];

    /* renamed from: c */
    double[] f24942c = new double[3];

    /* renamed from: d */
    double[] f24943d = new double[3];

    /* renamed from: e */
    int f24944e;

    /* renamed from: f */
    boolean f24945f;

    /* renamed from: g */
    C7017c f24946g;

    /* renamed from: h */
    C7032q f24947h;

    /* renamed from: i */
    C7024i f24948i;

    /* renamed from: j */
    boolean f24949j;

    /* renamed from: k */
    boolean f24950k;

    /* renamed from: l */
    boolean f24951l;

    /* renamed from: m */
    C7020e f24952m;

    /* renamed from: n */
    int f24953n;

    /* renamed from: o */
    C7016b[] f24954o = new C7016b[100];

    /* renamed from: q */
    private int f24955q;

    /* renamed from: r */
    private C7021f f24956r;

    /* renamed from: s */
    private double f24957s;

    /* renamed from: t */
    private boolean f24958t;

    /* renamed from: u */
    private Object f24959u;

    /* renamed from: v */
    private C7030o f24960v;

    /* renamed from: w */
    private C7030o f24961w;

    /* renamed from: x */
    private C7030o f24962x;

    /* renamed from: y */
    private C7030o f24963y;

    /* renamed from: z */
    private C7030o f24964z;

    private C7023h() {
        this.f24955q = 0;
        this.f24941b[0] = 0.0d;
        this.f24941b[1] = 0.0d;
        this.f24941b[2] = 0.0d;
        this.f24957s = 0.0d;
        this.f24944e = 100130;
        this.f24949j = false;
        this.f24950k = false;
        this.f24960v = f24931H;
        this.f24961w = f24931H;
        this.f24962x = f24931H;
        this.f24963y = f24931H;
        this.f24964z = f24931H;
        this.f24933A = f24931H;
        this.f24934B = f24931H;
        this.f24935C = f24931H;
        this.f24936D = f24931H;
        this.f24937E = f24931H;
        this.f24938F = f24931H;
        this.f24939G = f24931H;
        this.f24959u = null;
        for (int i = 0; i < this.f24954o.length; i++) {
            this.f24954o[i] = new C7016b();
        }
    }

    /* renamed from: a */
    public static C7029n m36862a() {
        return new C7023h();
    }

    /* renamed from: f */
    private void m36867f() {
        if (this.f24940a != null) {
            C7026k.m36904b(this.f24940a);
        }
        this.f24955q = 0;
        this.f24956r = null;
        this.f24940a = null;
    }

    /* renamed from: c */
    private void m36865c(int i) {
        if (this.f24955q != i) {
            m36866d(i);
        }
    }

    /* renamed from: d */
    private void m36866d(int i) {
        while (this.f24955q != i) {
            if (this.f24955q < i) {
                if (this.f24955q == 0) {
                    mo22142b(100151);
                    mo22137a((Object) null);
                } else if (this.f24955q == 1) {
                    mo22142b(100152);
                    mo22141b();
                }
            } else if (this.f24955q == 2) {
                mo22142b(100154);
                mo22144c();
            } else if (this.f24955q == 1) {
                mo22142b(100153);
                m36867f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        mo22142b(100901);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r9 == 0.0d) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r7.f24950k = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22135a(int r8, double r9) {
        /*
            r7 = this;
            r0 = 100149(0x18735, float:1.40339E-40)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r8 == r0) goto L_0x003d
            switch(r8) {
                case 100140: goto L_0x0021;
                case 100141: goto L_0x0035;
                case 100142: goto L_0x0013;
                default: goto L_0x000c;
            }
        L_0x000c:
            r8 = 100900(0x18a24, float:1.41391E-40)
            r7.mo22142b(r8)
            return
        L_0x0013:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x0027
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x001e
            goto L_0x0027
        L_0x001e:
            r7.f24957s = r9
            return
        L_0x0021:
            int r8 = (int) r9
            double r5 = (double) r8
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
        L_0x0027:
            r8 = 100901(0x18a25, float:1.41392E-40)
            r7.mo22142b(r8)
            return
        L_0x002e:
            switch(r8) {
                case 100130: goto L_0x0032;
                case 100131: goto L_0x0032;
                case 100132: goto L_0x0032;
                case 100133: goto L_0x0032;
                case 100134: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0035
        L_0x0032:
            r7.f24944e = r8
            return
        L_0x0035:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x003a
            r1 = 1
        L_0x003a:
            r7.f24950k = r1
            return
        L_0x003d:
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0042
            r1 = 1
        L_0x0042:
            r7.f24951l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p262f.p263a.C7023h.mo22135a(int, double):void");
    }

    /* renamed from: a */
    public void mo22136a(int i, C7030o oVar) {
        boolean z = false;
        switch (i) {
            case 100100:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24960v = oVar;
                return;
            case 100101:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24962x = oVar;
                return;
            case 100102:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24963y = oVar;
                return;
            case 100103:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24964z = oVar;
                return;
            case 100104:
                this.f24961w = oVar == null ? f24931H : oVar;
                if (oVar != null) {
                    z = true;
                }
                this.f24949j = z;
                return;
            case 100105:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24933A = oVar;
                return;
            case 100106:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24934B = oVar;
                return;
            case 100107:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24936D = oVar;
                return;
            case 100108:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24937E = oVar;
                return;
            case 100109:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24938F = oVar;
                return;
            case 100110:
                C7030o oVar2 = oVar == null ? f24931H : oVar;
                this.f24960v = oVar2;
                this.f24935C = oVar2;
                if (oVar != null) {
                    z = true;
                }
                this.f24949j = z;
                return;
            case 100111:
                if (oVar == null) {
                    oVar = f24931H;
                }
                this.f24939G = oVar;
                return;
            default:
                mo22142b(100900);
                return;
        }
    }

    /* renamed from: a */
    private boolean m36863a(double[] dArr, Object obj) {
        C7021f fVar;
        C7021f fVar2 = this.f24956r;
        if (fVar2 == null) {
            fVar = C7026k.m36896a(this.f24940a);
            if (fVar == null || !C7026k.m36905b(fVar, fVar.f24919b)) {
                return false;
            }
        } else if (C7026k.m36910e(fVar2) == null) {
            return false;
        } else {
            fVar = fVar2.f24921d;
        }
        fVar.f24922e.f24968d = obj;
        fVar.f24922e.f24969e[0] = dArr[0];
        fVar.f24922e.f24969e[1] = dArr[1];
        fVar.f24922e.f24969e[2] = dArr[2];
        fVar.f24925h = 1;
        fVar.f24919b.f24925h = -1;
        this.f24956r = fVar;
        return true;
    }

    /* renamed from: b */
    private void m36864b(double[] dArr, Object obj) {
        if (this.f24954o[this.f24953n] == null) {
            this.f24954o[this.f24953n] = new C7016b();
        }
        C7016b bVar = this.f24954o[this.f24953n];
        bVar.f24904b = obj;
        bVar.f24903a[0] = dArr[0];
        bVar.f24903a[1] = dArr[1];
        bVar.f24903a[2] = dArr[2];
        this.f24953n++;
    }

    /* renamed from: g */
    private boolean m36868g() {
        C7016b[] bVarArr = this.f24954o;
        this.f24940a = C7026k.m36897a();
        if (this.f24940a == null) {
            return false;
        }
        for (int i = 0; i < this.f24953n; i++) {
            C7016b bVar = bVarArr[i];
            if (!m36863a(bVar.f24903a, bVar.f24904b)) {
                return false;
            }
        }
        this.f24953n = 0;
        this.f24958t = false;
        return true;
    }

    /* renamed from: a */
    public void mo22139a(double[] dArr, int i, Object obj) {
        double[] dArr2 = new double[3];
        m36865c(2);
        if (this.f24958t) {
            if (!m36868g()) {
                mo22142b(100902);
                return;
            }
            this.f24956r = null;
        }
        boolean z = false;
        for (int i2 = 0; i2 < 3; i2++) {
            double d = dArr[i2 + i];
            if (d < -1.0E150d) {
                d = -1.0E150d;
                z = true;
            }
            if (d > 1.0E150d) {
                d = 1.0E150d;
                z = true;
            }
            dArr2[i2] = d;
        }
        if (z) {
            mo22142b(100155);
        }
        if (this.f24940a == null) {
            if (this.f24953n < 100) {
                m36864b(dArr2, obj);
                return;
            } else if (!m36868g()) {
                mo22142b(100902);
                return;
            }
        }
        if (!m36863a(dArr2, obj)) {
            mo22142b(100902);
        }
    }

    /* renamed from: a */
    public void mo22137a(Object obj) {
        m36865c(0);
        this.f24955q = 1;
        this.f24953n = 0;
        this.f24958t = false;
        this.f24940a = null;
        this.f24959u = obj;
    }

    /* renamed from: b */
    public void mo22141b() {
        m36865c(1);
        this.f24955q = 2;
        this.f24956r = null;
        if (this.f24953n > 0) {
            this.f24958t = true;
        }
    }

    /* renamed from: c */
    public void mo22144c() {
        m36865c(2);
        this.f24955q = 1;
    }

    /* renamed from: d */
    public void mo22145d() {
        boolean z;
        try {
            m36865c(1);
            this.f24955q = 0;
            if (this.f24940a == null) {
                if (!this.f24949j && C7040t.m36984a(this)) {
                    this.f24959u = null;
                    return;
                } else if (!m36868g()) {
                    throw new RuntimeException();
                }
            }
            C7027l.m36915b(this);
            if (C7047u.m37026f(this)) {
                C7022g gVar = this.f24940a;
                if (!this.f24945f) {
                    if (this.f24950k) {
                        z = C7050v.m37032a(gVar, 1, true);
                    } else {
                        z = C7050v.m37033a(gVar, this.f24951l);
                    }
                    if (z) {
                        C7026k.m36907c(gVar);
                        if (!(this.f24960v == f24931H && this.f24963y == f24931H && this.f24962x == f24931H && this.f24961w == f24931H && this.f24934B == f24931H && this.f24937E == f24931H && this.f24936D == f24931H && this.f24935C == f24931H)) {
                            if (this.f24950k) {
                                C7040t.m36988b(this, gVar);
                            } else {
                                C7040t.m36981a(this, gVar);
                            }
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
                C7026k.m36904b(gVar);
                this.f24959u = null;
                return;
            }
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
            mo22142b(100902);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22134a(int i) {
        if (this.f24934B != f24931H) {
            this.f24934B.mo22149a(i, this.f24959u);
        } else {
            this.f24960v.mo22148a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22143b(Object obj) {
        if (this.f24936D != f24931H) {
            this.f24936D.mo22151a(obj, this.f24959u);
        } else {
            this.f24962x.mo22150a(obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22138a(boolean z) {
        if (this.f24935C != f24931H) {
            this.f24935C.mo22153a(z, this.f24959u);
        } else {
            this.f24961w.mo22152a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo22146e() {
        if (this.f24937E != f24931H) {
            this.f24937E.mo22158b(this.f24959u);
        } else {
            this.f24963y.mo22147a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22140a(double[] dArr, Object[] objArr, float[] fArr, Object[] objArr2) {
        if (this.f24939G != f24931H) {
            this.f24939G.mo22155a(dArr, objArr, fArr, objArr2, this.f24959u);
            return;
        }
        this.f24933A.mo22154a(dArr, objArr, fArr, objArr2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22142b(int i) {
        if (this.f24938F != f24931H) {
            this.f24938F.mo22157b(i, this.f24959u);
        } else {
            this.f24964z.mo22156b(i);
        }
    }
}
