package p256e.p262f;

import java.nio.IntBuffer;
import p256e.p259c.C6982a;

/* renamed from: e.f.b */
/* compiled from: FrameBuffer */
public class C7051b {

    /* renamed from: a */
    protected C7065i f25016a;

    /* renamed from: b */
    protected C7056e f25017b;

    /* renamed from: c */
    protected int f25018c;

    /* renamed from: d */
    public int f25019d;

    /* renamed from: e */
    public int f25020e;

    /* renamed from: f */
    public int f25021f;

    /* renamed from: g */
    public int f25022g;

    /* renamed from: h */
    public int f25023h;

    /* renamed from: i */
    public int f25024i;

    /* renamed from: j */
    public int f25025j;

    /* renamed from: k */
    protected int f25026k;

    /* renamed from: l */
    protected int f25027l;

    /* renamed from: m */
    protected boolean f25028m;

    /* renamed from: n */
    protected boolean f25029n;

    /* renamed from: o */
    protected int f25030o;

    /* renamed from: p */
    protected int f25031p;

    /* renamed from: q */
    protected C7088l[] f25032q;

    /* renamed from: r */
    protected boolean f25033r;

    /* renamed from: s */
    protected boolean f25034s;

    /* renamed from: t */
    protected IntBuffer f25035t;

    /* renamed from: u */
    private C7071e f25036u;

    C7051b(C7065i iVar) {
        this.f25016a = iVar;
        this.f25017b = iVar.f25493a;
        this.f25018c = this.f25017b.mo22206A();
    }

    C7051b(C7065i iVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this(iVar);
        this.f25019d = 0;
        this.f25020e = 0;
        this.f25021f = 0;
        this.f25022g = 0;
        this.f25023h = 0;
        if (z2) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        this.f25024i = i;
        this.f25025j = i2;
        if (1 < i3) {
            this.f25029n = true;
            this.f25030o = i3;
        } else {
            this.f25029n = false;
            this.f25030o = 1;
        }
        this.f25031p = i4;
        this.f25032q = new C7088l[this.f25031p];
        for (int i7 = 0; i7 < this.f25031p; i7++) {
            this.f25032q[i7] = null;
        }
        if (i5 < 1 && i6 < 1) {
            this.f25026k = 0;
            this.f25027l = 0;
            this.f25028m = false;
        } else if (z) {
            this.f25026k = 24;
            this.f25027l = 8;
            this.f25028m = true;
        } else {
            this.f25026k = i5;
            this.f25027l = i6;
            this.f25028m = false;
        }
        this.f25033r = z2;
        mo22180g();
        this.f25034s = false;
        this.f25035t = null;
    }

    C7051b(C7065i iVar, int i, int i2) {
        this(iVar, i, i2, 1, 1, 0, 0, false, false);
    }

    C7051b(C7065i iVar, int i, int i2, boolean z) {
        this(iVar, i, i2, 1, 1, 0, 0, false, z);
    }

    /* renamed from: a */
    public void mo22169a() {
        this.f25016a.mo22446an();
        this.f25016a.mo22416a(this);
        this.f25017b.mo22257a(1.0f);
        this.f25017b.mo22238Q(0);
        this.f25017b.mo22258a(0.0f, 0.0f, 0.0f, 0.0f);
        this.f25017b.mo22241R(C7056e.f25271eP | C7056e.f25272eQ | C7056e.f25270eO);
        this.f25016a.mo22447ao();
    }

    /* renamed from: a */
    public void mo22171a(C7051b bVar) {
        mo22172a(bVar, C7056e.f25270eO);
    }

    /* renamed from: a */
    public void mo22172a(C7051b bVar, int i) {
        C7051b bVar2 = bVar;
        this.f25017b.mo22354j(C7056e.f25281eZ, this.f25019d);
        this.f25017b.mo22354j(C7056e.f25318fa, bVar2.f25019d);
        this.f25017b.mo22269a(0, 0, this.f25024i, this.f25025j, 0, 0, bVar2.f25024i, bVar2.f25025j, i, C7056e.f25169cR);
        this.f25017b.mo22354j(C7056e.f25281eZ, this.f25016a.mo22448ap().f25019d);
        this.f25017b.mo22354j(C7056e.f25318fa, this.f25016a.mo22448ap().f25019d);
    }

    /* renamed from: b */
    public void mo22175b() {
        this.f25017b.mo22354j(C7056e.f25273eR, this.f25019d);
    }

    /* renamed from: c */
    public void mo22176c() {
        this.f25034s = true;
    }

    /* renamed from: d */
    public void mo22177d() {
        if (!this.f25034s) {
            return;
        }
        if (this.f25016a.mo22406B(-2)) {
            this.f25017b.mo22374v(C7056e.f25268eM);
        } else {
            this.f25017b.mo22376w(C7056e.f25268eM);
        }
    }

    /* renamed from: a */
    public void mo22170a(int i) {
        if (this.f25033r) {
            this.f25019d = i;
        }
    }

    /* renamed from: a */
    public void mo22173a(C7088l lVar) {
        mo22174a(new C7088l[]{lVar}, 1);
    }

    /* renamed from: a */
    public void mo22174a(C7088l[] lVarArr, int i) {
        if (!this.f25033r) {
            if (this.f25031p == C6982a.m36422d(i, lVarArr.length)) {
                for (int i2 = 0; i2 < this.f25031p; i2++) {
                    this.f25032q[i2] = lVarArr[i2];
                }
                this.f25016a.mo22446an();
                this.f25016a.mo22416a(this);
                for (int i3 = 0; i3 < this.f25031p; i3++) {
                    this.f25017b.mo22313c(C7056e.f25273eR, C7056e.f25274eS + i3, C7056e.f25157cF, 0, 0);
                }
                for (int i4 = 0; i4 < this.f25031p; i4++) {
                    this.f25017b.mo22313c(C7056e.f25273eR, C7056e.f25274eS + i4, this.f25032q[i4].f25942d, this.f25032q[i4].f25941c, 0);
                }
                this.f25017b.mo22217F();
                this.f25016a.mo22447ao();
                return;
            }
            throw new RuntimeException("Wrong number of textures to set the color buffers.");
        }
    }

    /* renamed from: e */
    public int mo22178e() {
        if (this.f25033r) {
            return this.f25017b.mo22335f();
        }
        return C7056e.f25274eS;
    }

    /* renamed from: f */
    public int mo22179f() {
        if (this.f25033r) {
            return this.f25017b.mo22329e();
        }
        return C7056e.f25274eS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo22180g() {
        mo22181h();
        this.f25018c = this.f25017b.mo22208B();
        this.f25036u = new C7071e(this);
        if (this.f25033r) {
            this.f25019d = 0;
            return;
        }
        if (this.f25029n) {
            mo22183j();
        }
        if (this.f25028m) {
            mo22184k();
            return;
        }
        if (this.f25026k > 0) {
            mo22185l();
        }
        if (this.f25027l > 0) {
            mo22186m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo22181h() {
        if (!this.f25033r && this.f25036u != null) {
            this.f25036u.mo22504a();
            this.f25019d = 0;
            this.f25020e = 0;
            this.f25021f = 0;
            this.f25023h = 0;
            this.f25022g = 0;
            this.f25036u = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo22182i() {
        if (this.f25033r) {
            return false;
        }
        boolean z = !this.f25017b.mo22328d(this.f25018c);
        if (z) {
            mo22181h();
            for (int i = 0; i < this.f25031p; i++) {
                this.f25032q[i] = null;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo22183j() {
        if (!this.f25033r) {
            this.f25016a.mo22446an();
            this.f25016a.mo22416a(this);
            this.f25017b.mo22359k(C7056e.f25278eW, this.f25023h);
            this.f25017b.mo22324d(C7056e.f25278eW, this.f25030o, C7056e.f25115bJ, this.f25024i, this.f25025j);
            this.f25017b.mo22355j(C7056e.f25273eR, C7056e.f25274eS, C7056e.f25278eW, this.f25023h);
            this.f25016a.mo22447ao();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo22184k() {
        if (!this.f25033r) {
            if (this.f25024i == 0 || this.f25025j == 0) {
                throw new RuntimeException("PFramebuffer: size undefined.");
            }
            this.f25016a.mo22446an();
            this.f25016a.mo22416a(this);
            this.f25017b.mo22359k(C7056e.f25278eW, this.f25022g);
            if (this.f25029n) {
                this.f25017b.mo22324d(C7056e.f25278eW, this.f25030o, C7056e.f25319fb, this.f25024i, this.f25025j);
            } else {
                this.f25017b.mo22352i(C7056e.f25278eW, C7056e.f25319fb, this.f25024i, this.f25025j);
            }
            this.f25017b.mo22355j(C7056e.f25273eR, C7056e.f25279eX, C7056e.f25278eW, this.f25022g);
            this.f25017b.mo22355j(C7056e.f25273eR, C7056e.f25280eY, C7056e.f25278eW, this.f25022g);
            this.f25016a.mo22447ao();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo22185l() {
        if (!this.f25033r) {
            if (this.f25024i == 0 || this.f25025j == 0) {
                throw new RuntimeException("PFramebuffer: size undefined.");
            }
            this.f25016a.mo22446an();
            this.f25016a.mo22416a(this);
            this.f25017b.mo22359k(C7056e.f25278eW, this.f25020e);
            int i = C7056e.f25321fd;
            if (this.f25026k == 16) {
                i = C7056e.f25321fd;
            } else if (this.f25026k == 24) {
                i = C7056e.f25322fe;
            } else if (this.f25026k == 32) {
                i = C7056e.f25323ff;
            }
            int i2 = i;
            if (this.f25029n) {
                this.f25017b.mo22324d(C7056e.f25278eW, this.f25030o, i2, this.f25024i, this.f25025j);
            } else {
                this.f25017b.mo22352i(C7056e.f25278eW, i2, this.f25024i, this.f25025j);
            }
            this.f25017b.mo22355j(C7056e.f25273eR, C7056e.f25279eX, C7056e.f25278eW, this.f25020e);
            this.f25016a.mo22447ao();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo22186m() {
        if (!this.f25033r) {
            if (this.f25024i == 0 || this.f25025j == 0) {
                throw new RuntimeException("PFramebuffer: size undefined.");
            }
            this.f25016a.mo22446an();
            this.f25016a.mo22416a(this);
            this.f25017b.mo22359k(C7056e.f25278eW, this.f25021f);
            int i = C7056e.f25325fh;
            if (this.f25027l == 1) {
                i = C7056e.f25325fh;
            } else if (this.f25027l == 4) {
                i = C7056e.f25326fi;
            } else if (this.f25027l == 8) {
                i = C7056e.f25327fj;
            }
            int i2 = i;
            if (this.f25029n) {
                this.f25017b.mo22324d(C7056e.f25278eW, this.f25030o, i2, this.f25024i, this.f25025j);
            } else {
                this.f25017b.mo22352i(C7056e.f25278eW, i2, this.f25024i, this.f25025j);
            }
            this.f25017b.mo22355j(C7056e.f25273eR, C7056e.f25280eY, C7056e.f25278eW, this.f25021f);
            this.f25016a.mo22447ao();
        }
    }
}
