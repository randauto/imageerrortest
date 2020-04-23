package p256e.p262f;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.support.p072v8.renderscript.Allocation;
import android.view.SurfaceView;
import com.facebook.ads.AdError;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import p256e.p262f.p263a.C7028m;
import p256e.p262f.p263a.C7029n;
import p256e.p262f.p263a.C7030o;
import p256e.p262f.p263a.C7031p;

/* renamed from: e.f.f */
/* compiled from: PGLES */
public class C7060f extends C7056e {

    /* renamed from: fN */
    public static boolean f25441fN = false;

    /* renamed from: fO */
    public static boolean f25442fO = false;

    /* renamed from: fP */
    public static int f25443fP = 1;

    /* renamed from: fJ */
    public GL10 f25444fJ;

    /* renamed from: fK */
    public C7028m f25445fK = new C7028m();

    /* renamed from: fL */
    public EGLContext f25446fL;

    /* renamed from: fM */
    public GLSurfaceView f25447fM;

    /* renamed from: e.f.f$a */
    /* compiled from: PGLES */
    protected class C7061a implements C7058b {

        /* renamed from: a */
        protected C7029n f25448a = C7028m.m36916a();

        /* renamed from: b */
        protected C7059c f25449b;

        /* renamed from: c */
        protected C7062a f25450c = new C7062a();

        /* renamed from: e.f.f$a$a */
        /* compiled from: PGLES */
        protected class C7062a extends C7031p {
            protected C7062a() {
            }

            /* renamed from: a */
            public void mo22148a(int i) {
                C7061a.this.f25449b.mo22393a(i);
            }

            /* renamed from: a */
            public void mo22147a() {
                C7061a.this.f25449b.mo22392a();
            }

            /* renamed from: a */
            public void mo22150a(Object obj) {
                C7061a.this.f25449b.mo22394a(obj);
            }

            /* renamed from: a */
            public void mo22154a(double[] dArr, Object[] objArr, float[] fArr, Object[] objArr2) {
                C7061a.this.f25449b.mo22395a(dArr, objArr, fArr, objArr2);
            }

            /* renamed from: b */
            public void mo22156b(int i) {
                C7061a.this.f25449b.mo22396b(i);
            }
        }

        public C7061a(C7059c cVar) {
            this.f25449b = cVar;
            C7028m.m36920a(this.f25448a, 100100, (C7030o) this.f25450c);
            C7028m.m36920a(this.f25448a, 100102, (C7030o) this.f25450c);
            C7028m.m36920a(this.f25448a, 100101, (C7030o) this.f25450c);
            C7028m.m36920a(this.f25448a, 100105, (C7030o) this.f25450c);
            C7028m.m36920a(this.f25448a, 100103, (C7030o) this.f25450c);
        }

        /* renamed from: a */
        public void mo22387a(int i) {
            mo22400a(100140, i);
        }

        /* renamed from: a */
        public void mo22400a(int i, int i2) {
            C7028m.m36919a(this.f25448a, i, (double) i2);
        }

        /* renamed from: a */
        public void mo22386a() {
            mo22401a((Object) null);
        }

        /* renamed from: a */
        public void mo22401a(Object obj) {
            C7028m.m36921a(this.f25448a, obj);
        }

        /* renamed from: b */
        public void mo22389b() {
            C7028m.m36918a(this.f25448a);
        }

        /* renamed from: c */
        public void mo22390c() {
            C7028m.m36923b(this.f25448a);
        }

        /* renamed from: d */
        public void mo22391d() {
            C7028m.m36924c(this.f25448a);
        }

        /* renamed from: a */
        public void mo22388a(double[] dArr) {
            mo22402a(dArr, 0, dArr);
        }

        /* renamed from: a */
        public void mo22402a(double[] dArr, int i, Object obj) {
            C7028m.m36922a(this.f25448a, dArr, i, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public int mo22214E() {
        return 100;
    }

    /* renamed from: T */
    public void mo22245T(int i) {
    }

    /* renamed from: U */
    public void mo22247U(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22250a(Object obj) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22251a(Object obj, char[] cArr, int i, int i2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7057a mo22252a(char c, Object obj) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo22255a(Object obj, float f) {
        return null;
    }

    /* renamed from: a */
    public void mo22269a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
    }

    /* renamed from: a */
    public void mo22282a(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo22291b(Object obj) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22293b() {
    }

    /* renamed from: d */
    public void mo22324d(int i, int i2, int i3, int i4, int i5) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public float mo22368r() {
        return 1.0f;
    }

    static {
        f25094B = true;
        f25347j = 1;
        f25100aT = 5123;
        f25348k = false;
        f25349l = 16;
        f25350m = 32;
        f25351n = 16;
        f25352o = 16;
        f25353p = 32;
        f25358u = Allocation.USAGE_SHARED;
        f25359v = 512;
        f25361x = AdError.NETWORK_ERROR_CODE;
        f25133bh = false;
        f25139bn = 0;
        f25140bo = 1;
        f25141bp = 5124;
        f25142bq = 5120;
        f25143br = 5122;
        f25144bs = 5126;
        f25145bt = 35670;
        f25146bu = 5125;
        f25147bv = 5121;
        f25148bw = 5123;
        f25149bx = 6407;
        f25150by = 6408;
        f25151bz = 6406;
        f25106bA = 6409;
        f25107bB = 6410;
        f25108bC = 33635;
        f25109bD = 32819;
        f25110bE = 32820;
        f25111bF = 32854;
        f25112bG = 32855;
        f25113bH = 36194;
        f25114bI = 32849;
        f25115bJ = 32856;
        f25116bK = -1;
        f25117bL = -1;
        f25118bM = 35001;
        f25119bN = -1;
        f25120bO = 100131;
        f25121bP = 100130;
        f25122bQ = 100104;
        f25123bR = 33170;
        f25124bS = 4353;
        f25125bT = 4354;
        f25126bU = 4352;
        f25127bV = 7936;
        f25128bW = 7937;
        f25129bX = 7938;
        f25130bY = 7939;
        f25131bZ = 35724;
        f25178ca = -1;
        f25179cb = 32937;
        f25180cc = 33902;
        f25181cd = 33901;
        f25182ce = 3414;
        f25183cf = 3415;
        f25184cg = 2305;
        f25185ch = 2304;
        f25186ci = 2978;
        f25187cj = 34962;
        f25188ck = 34963;
        f25189cl = 34921;
        f25190cm = 35044;
        f25191cn = 35048;
        f25192co = 35040;
        f25193cp = 34660;
        f25194cq = 34661;
        f25195cr = 0;
        f25196cs = 3;
        f25197ct = 2;
        f25198cu = 1;
        f25199cv = 6;
        f25200cw = 5;
        f25201cx = 4;
        f25202cy = 2884;
        f25203cz = 1028;
        f25152cA = 1029;
        f25153cB = 1032;
        f25154cC = 32823;
        f25155cD = 3317;
        f25156cE = 3333;
        f25157cF = 3553;
        f25158cG = -1;
        f25159cH = 32873;
        f25160cI = -1;
        f25161cJ = 3379;
        f25162cK = 34046;
        f25163cL = 34047;
        f25164cM = 35660;
        f25165cN = 34930;
        f25166cO = 35661;
        f25167cP = 34466;
        f25168cQ = 34467;
        f25169cR = 9728;
        f25170cS = 9729;
        f25171cT = 9985;
        f25172cU = 9987;
        f25173cV = 33071;
        f25174cW = 10497;
        f25175cX = 33984;
        f25176cY = 33985;
        f25177cZ = 33986;
        f25230da = 33987;
        f25231db = 10241;
        f25232dc = 10240;
        f25233dd = 10242;
        f25234de = 10243;
        f25235df = 32882;
        f25236dg = 34067;
        f25237dh = 34069;
        f25238di = 34071;
        f25239dj = 34073;
        f25240dk = 34070;
        f25241dl = 34072;
        f25242dm = 34074;
        f25243dn = 35633;
        f25244do = 35632;
        f25245dp = 35716;
        f25246dq = 35720;
        f25247dr = 35713;
        f25248ds = 35714;
        f25249dt = 35715;
        f25250du = 35663;
        f25251dv = 35712;
        f25252dw = 35664;
        f25253dx = 35665;
        f25254dy = 35666;
        f25255dz = 35674;
        f25204dA = 35675;
        f25205dB = 35676;
        f25206dC = 35667;
        f25207dD = 35668;
        f25208dE = 35669;
        f25209dF = 35671;
        f25210dG = 35672;
        f25211dH = 35673;
        f25212dI = 35678;
        f25213dJ = 35680;
        f25214dK = 36336;
        f25215dL = 36337;
        f25216dM = 36338;
        f25217dN = 36339;
        f25218dO = 36340;
        f25219dP = 36341;
        f25220dQ = 34342;
        f25221dR = 34975;
        f25222dS = 34338;
        f25223dT = 34339;
        f25224dU = 34340;
        f25225dV = 34341;
        f25226dW = 34922;
        f25227dX = 34373;
        f25228dY = 3042;
        f25229dZ = 1;
        f25282ea = 0;
        f25283eb = 770;
        f25284ec = 772;
        f25285ed = 771;
        f25286ee = 775;
        f25287ef = 769;
        f25288eg = 774;
        f25289eh = 768;
        f25290ei = 32926;
        f25291ej = 32928;
        f25292ek = 7680;
        f25293el = 7681;
        f25294em = 7682;
        f25295en = 7683;
        f25296eo = 5386;
        f25297ep = 34055;
        f25298eq = 34056;
        f25299er = 512;
        f25300es = 519;
        f25301et = 514;
        f25302eu = 513;
        f25303ev = 515;
        f25304ew = 516;
        f25305ex = 518;
        f25306ey = 517;
        f25307ez = 32774;
        f25256eA = 32775;
        f25257eB = 32776;
        f25258eC = 32779;
        f25259eD = 32778;
        f25260eE = 3024;
        f25261eF = 32769;
        f25262eG = 32771;
        f25263eH = 32770;
        f25264eI = 32772;
        f25265eJ = 776;
        f25266eK = 3089;
        f25267eL = 2960;
        f25268eM = 2929;
        f25269eN = 2930;
        f25270eO = 16384;
        f25271eP = 256;
        f25272eQ = 1024;
        f25273eR = 36160;
        f25274eS = 36064;
        f25275eT = -1;
        f25276eU = -1;
        f25277eV = -1;
        f25278eW = 36161;
        f25279eX = 36096;
        f25280eY = 36128;
        f25281eZ = -1;
        f25318fa = -1;
        f25319fb = 35056;
        f25320fc = 6402;
        f25321fd = 33189;
        f25322fe = 33190;
        f25323ff = 33191;
        f25324fg = 6401;
        f25325fh = 36166;
        f25326fi = 36167;
        f25327fj = 36168;
        f25328fk = 34041;
        f25329fl = 36053;
        f25330fm = 36054;
        f25331fn = 36055;
        f25332fo = 36057;
        f25333fp = 36058;
        f25334fq = -1;
        f25335fr = -1;
        f25336fs = 36061;
        f25337ft = 36048;
        f25338fu = 36049;
        f25339fv = 36050;
        f25340fw = 36051;
        f25341fx = 36162;
        f25342fy = 36163;
        f25343fz = 36176;
        f25309fA = 36177;
        f25310fB = 36178;
        f25311fC = 36179;
        f25312fD = 36180;
        f25313fE = 36181;
        f25314fF = 36164;
        f25315fG = -1;
        f25316fH = -1;
        f25317fI = -1;
    }

    public C7060f(C7065i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public void mo22284a(Runnable runnable) {
        if (this.f25447fM != null) {
            this.f25447fM.queueEvent(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22294b(int i) {
        SurfaceView e = this.f25431b.mo21845d().mo22064e();
        if (e != null) {
            this.f25447fM = (GLSurfaceView) e;
        }
        this.f25370H = m37129k(i);
        mo22293b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo22358k() {
        this.f25394aE.rewind();
        mo22304b(f25182ce, this.f25394aE);
        return this.f25394aE.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo22360l() {
        this.f25394aE.rewind();
        mo22304b(f25183cf, this.f25394aE);
        return this.f25394aE.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo22329e() {
        return this.f25365C ? f25274eS : f25203cz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo22335f() {
        return this.f25365C ? f25274eS : f25203cz;
    }

    /* renamed from: a */
    public void mo22397a(GL10 gl10) {
        this.f25444fJ = gl10;
        this.f25446fL = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        this.f25439d = this.f25446fL.hashCode();
        this.f25438c = Thread.currentThread();
        if (!mo22223I()) {
            throw new RuntimeException("Framebuffer objects are not supported by this hardware (or driver) Read http://wiki.processing.org/w/OpenGL_Issues for help.");
        } else if (!mo22225J()) {
            throw new RuntimeException("GLSL shaders are not supported by this hardware (or driver) Read http://wiki.processing.org/w/OpenGL_Issues for help.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22283a(C7056e eVar) {
        C7060f fVar = (C7060f) eVar;
        this.f25444fJ = fVar.f25444fJ;
        mo22285a(fVar.f25438c);
    }

    /* renamed from: b */
    public void mo22399b(GL10 gl10) {
        this.f25444fJ = gl10;
        this.f25438c = Thread.currentThread();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo22373v() {
        if (this.f25431b.f24514Q > 0) {
            IntBuffer q = m37133q(this.f25382T * this.f25383U);
            if (mo22237P()) {
                mo22245T(f25152cA);
            }
            mo22274a(0, 0, this.f25382T, this.f25383U, f25150by, f25147bv, q);
            mo22321d(f25157cF, this.f25373K.get(this.f25385W));
            IntBuffer intBuffer = q;
            mo22299b(f25157cF, 0, 0, 0, this.f25382T, this.f25383U, f25150by, f25147bv, intBuffer);
            mo22321d(f25157cF, this.f25373K.get(this.f25384V));
            mo22299b(f25157cF, 0, 0, 0, this.f25382T, this.f25383U, f25150by, f25147bv, intBuffer);
            mo22321d(f25157cF, 0);
            mo22354j(f25273eR, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo22381z() {
        mo22313c(f25273eR, f25274eS, f25157cF, this.f25373K.get(this.f25385W), 0);
        mo22241R(f25270eO);
        mo22313c(f25273eR, f25274eS, f25157cF, this.f25373K.get(this.f25384V), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C7061a mo22253a(C7059c cVar) {
        return new C7061a(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo22371u(int i) {
        return C7028m.m36917a(i);
    }

    /* renamed from: T */
    public void mo22244T() {
        GLES20.glFlush();
    }

    /* renamed from: v */
    public void mo22374v(int i) {
        if (-1 < i) {
            GLES20.glEnable(i);
        }
    }

    /* renamed from: w */
    public void mo22376w(int i) {
        if (-1 < i) {
            GLES20.glDisable(i);
        }
    }

    /* renamed from: a */
    public void mo22281a(int i, IntBuffer intBuffer) {
        if (-1 < i) {
            GLES20.glGetBooleanv(i, intBuffer);
        } else {
            m37113a(intBuffer, 0, intBuffer.capacity(), 0);
        }
    }

    /* renamed from: b */
    public void mo22304b(int i, IntBuffer intBuffer) {
        if (-1 < i) {
            GLES20.glGetIntegerv(i, intBuffer);
        } else {
            m37113a(intBuffer, 0, intBuffer.capacity() - 1, 0);
        }
    }

    /* renamed from: a */
    public void mo22280a(int i, FloatBuffer floatBuffer) {
        if (-1 < i) {
            GLES20.glGetFloatv(i, floatBuffer);
        } else {
            m37111a(floatBuffer, 0, floatBuffer.capacity() - 1, 0.0f);
        }
    }

    /* renamed from: x */
    public String mo22377x(int i) {
        return GLES20.glGetString(i);
    }

    /* renamed from: U */
    public int mo22246U() {
        return GLES20.glGetError();
    }

    /* renamed from: y */
    public String mo22379y(int i) {
        return GLU.gluErrorString(i);
    }

    /* renamed from: c */
    public void mo22318c(int i, IntBuffer intBuffer) {
        GLES20.glGenBuffers(i, intBuffer);
    }

    /* renamed from: d */
    public void mo22327d(int i, IntBuffer intBuffer) {
        GLES20.glDeleteBuffers(i, intBuffer);
    }

    /* renamed from: c */
    public void mo22310c(int i, int i2) {
        GLES20.glBindBuffer(i, i2);
    }

    /* renamed from: a */
    public void mo22276a(int i, int i2, Buffer buffer, int i3) {
        GLES20.glBufferData(i, i2, buffer, i3);
    }

    /* renamed from: b */
    public void mo22296b(int i, int i2, int i3, int i4) {
        float r = mo22368r();
        mo22312c(((int) r) * i, (int) (((float) i2) * r), (int) (((float) i3) * r), (int) (r * ((float) i4)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22312c(int i, int i2, int i3, int i4) {
        GLES20.glViewport(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo22274a(int i, int i2, int i3, int i4, int i5, int i6, Buffer buffer) {
        GLES20.glReadPixels(i, i2, i3, i4, i5, i6, buffer);
    }

    /* renamed from: a */
    public void mo22275a(int i, int i2, int i3, boolean z, int i4, int i5) {
        GLES20.glVertexAttribPointer(i, i2, i3, z, i4, i5);
    }

    /* renamed from: z */
    public void mo22382z(int i) {
        GLES20.glEnableVertexAttribArray(i);
    }

    /* renamed from: A */
    public void mo22207A(int i) {
        GLES20.glDisableVertexAttribArray(i);
    }

    /* renamed from: b */
    public void mo22295b(int i, int i2, int i3) {
        GLES20.glDrawArrays(i, i2, i3);
    }

    /* renamed from: e */
    public void mo22332e(int i, int i2, int i3, int i4) {
        GLES20.glDrawElements(i, i2, i3, i4);
    }

    /* renamed from: B */
    public void mo22209B(int i) {
        GLES20.glFrontFace(i);
    }

    /* renamed from: a */
    public void mo22272a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer) {
        GLES20.glTexImage2D(i, i2, i3, i4, i5, i6, i7, i8, buffer);
    }

    /* renamed from: b */
    public void mo22299b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer) {
        GLES20.glTexSubImage2D(i, i2, i3, i4, i5, i6, i7, i8, buffer);
    }

    /* renamed from: c */
    public void mo22311c(int i, int i2, int i3) {
        GLES20.glTexParameteri(i, i2, i3);
    }

    /* renamed from: a */
    public void mo22264a(int i, int i2, float f) {
        GLES20.glTexParameterf(i, i2, f);
    }

    /* renamed from: C */
    public void mo22211C(int i) {
        GLES20.glGenerateMipmap(i);
    }

    /* renamed from: e */
    public void mo22334e(int i, IntBuffer intBuffer) {
        GLES20.glGenTextures(i, intBuffer);
    }

    /* renamed from: f */
    public void mo22340f(int i, IntBuffer intBuffer) {
        GLES20.glDeleteTextures(i, intBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo22215E(int i) {
        GLES20.glActiveTexture(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo22331e(int i, int i2) {
        GLES20.glBindTexture(i, i2);
    }

    /* renamed from: F */
    public int mo22216F(int i) {
        return GLES20.glCreateShader(i);
    }

    /* renamed from: b */
    public void mo22303b(int i, String str) {
        GLES20.glShaderSource(i, str);
    }

    /* renamed from: G */
    public void mo22218G(int i) {
        GLES20.glCompileShader(i);
    }

    /* renamed from: H */
    public void mo22220H(int i) {
        GLES20.glDeleteShader(i);
    }

    /* renamed from: V */
    public int mo22248V() {
        return GLES20.glCreateProgram();
    }

    /* renamed from: f */
    public void mo22337f(int i, int i2) {
        GLES20.glAttachShader(i, i2);
    }

    /* renamed from: I */
    public void mo22222I(int i) {
        GLES20.glLinkProgram(i);
    }

    /* renamed from: J */
    public void mo22224J(int i) {
        GLES20.glUseProgram(i);
    }

    /* renamed from: K */
    public void mo22226K(int i) {
        GLES20.glDeleteProgram(i);
    }

    /* renamed from: c */
    public int mo22308c(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* renamed from: d */
    public int mo22320d(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    /* renamed from: g */
    public void mo22341g(int i, int i2) {
        GLES20.glUniform1i(i, i2);
    }

    /* renamed from: d */
    public void mo22322d(int i, int i2, int i3) {
        GLES20.glUniform2i(i, i2, i3);
    }

    /* renamed from: f */
    public void mo22338f(int i, int i2, int i3, int i4) {
        GLES20.glUniform3i(i, i2, i3, i4);
    }

    /* renamed from: b */
    public void mo22297b(int i, int i2, int i3, int i4, int i5) {
        GLES20.glUniform4i(i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public void mo22260a(int i, float f) {
        GLES20.glUniform1f(i, f);
    }

    /* renamed from: a */
    public void mo22261a(int i, float f, float f2) {
        GLES20.glUniform2f(i, f, f2);
    }

    /* renamed from: a */
    public void mo22262a(int i, float f, float f2, float f3) {
        GLES20.glUniform3f(i, f, f2, f3);
    }

    /* renamed from: a */
    public void mo22263a(int i, float f, float f2, float f3, float f4) {
        GLES20.glUniform4f(i, f, f2, f3, f4);
    }

    /* renamed from: a */
    public void mo22278a(int i, int i2, IntBuffer intBuffer) {
        GLES20.glUniform1iv(i, i2, intBuffer);
    }

    /* renamed from: b */
    public void mo22301b(int i, int i2, IntBuffer intBuffer) {
        GLES20.glUniform2iv(i, i2, intBuffer);
    }

    /* renamed from: c */
    public void mo22316c(int i, int i2, IntBuffer intBuffer) {
        GLES20.glUniform3iv(i, i2, intBuffer);
    }

    /* renamed from: d */
    public void mo22326d(int i, int i2, IntBuffer intBuffer) {
        GLES20.glUniform4iv(i, i2, intBuffer);
    }

    /* renamed from: a */
    public void mo22277a(int i, int i2, FloatBuffer floatBuffer) {
        GLES20.glUniform1fv(i, i2, floatBuffer);
    }

    /* renamed from: b */
    public void mo22300b(int i, int i2, FloatBuffer floatBuffer) {
        GLES20.glUniform2fv(i, i2, floatBuffer);
    }

    /* renamed from: c */
    public void mo22315c(int i, int i2, FloatBuffer floatBuffer) {
        GLES20.glUniform3fv(i, i2, floatBuffer);
    }

    /* renamed from: d */
    public void mo22325d(int i, int i2, FloatBuffer floatBuffer) {
        GLES20.glUniform4fv(i, i2, floatBuffer);
    }

    /* renamed from: a */
    public void mo22279a(int i, int i2, boolean z, FloatBuffer floatBuffer) {
        GLES20.glUniformMatrix2fv(i, i2, z, floatBuffer);
    }

    /* renamed from: b */
    public void mo22302b(int i, int i2, boolean z, FloatBuffer floatBuffer) {
        GLES20.glUniformMatrix3fv(i, i2, z, floatBuffer);
    }

    /* renamed from: c */
    public void mo22317c(int i, int i2, boolean z, FloatBuffer floatBuffer) {
        GLES20.glUniformMatrix4fv(i, i2, z, floatBuffer);
    }

    /* renamed from: L */
    public void mo22228L(int i) {
        GLES20.glValidateProgram(i);
    }

    /* renamed from: e */
    public void mo22333e(int i, int i2, IntBuffer intBuffer) {
        GLES20.glGetShaderiv(i, i2, intBuffer);
    }

    /* renamed from: M */
    public String mo22230M(int i) {
        return GLES20.glGetShaderInfoLog(i);
    }

    /* renamed from: f */
    public void mo22339f(int i, int i2, IntBuffer intBuffer) {
        GLES20.glGetProgramiv(i, i2, intBuffer);
    }

    /* renamed from: N */
    public String mo22232N(int i) {
        return GLES20.glGetProgramInfoLog(i);
    }

    /* renamed from: g */
    public void mo22342g(int i, int i2, int i3, int i4) {
        GLES20.glScissor(i, i2, i3, i4);
    }

    /* renamed from: O */
    public void mo22234O(int i) {
        GLES20.glDepthFunc(i);
    }

    /* renamed from: P */
    public void mo22236P(int i) {
        GLES20.glBlendEquation(i);
    }

    /* renamed from: h */
    public void mo22347h(int i, int i2) {
        GLES20.glBlendEquationSeparate(i, i2);
    }

    /* renamed from: i */
    public void mo22351i(int i, int i2) {
        GLES20.glBlendFunc(i, i2);
    }

    /* renamed from: h */
    public void mo22348h(int i, int i2, int i3, int i4) {
        GLES20.glBlendFuncSeparate(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo22287a(boolean z, boolean z2, boolean z3, boolean z4) {
        GLES20.glColorMask(z, z2, z3, z4);
    }

    /* renamed from: b */
    public void mo22305b(boolean z) {
        GLES20.glDepthMask(z);
    }

    /* renamed from: R */
    public void mo22241R(int i) {
        if (f25441fN && f25442fO) {
            i |= 32768;
        }
        GLES20.glClear(i);
    }

    /* renamed from: a */
    public void mo22258a(float f, float f2, float f3, float f4) {
        GLES20.glClearColor(f, f2, f3, f4);
    }

    /* renamed from: a */
    public void mo22257a(float f) {
        GLES20.glClearDepthf(f);
    }

    /* renamed from: Q */
    public void mo22238Q(int i) {
        GLES20.glClearStencil(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo22354j(int i, int i2) {
        GLES20.glBindFramebuffer(i, i2);
    }

    /* renamed from: g */
    public void mo22343g(int i, IntBuffer intBuffer) {
        GLES20.glDeleteFramebuffers(i, intBuffer);
    }

    /* renamed from: h */
    public void mo22349h(int i, IntBuffer intBuffer) {
        GLES20.glGenFramebuffers(i, intBuffer);
    }

    /* renamed from: k */
    public void mo22359k(int i, int i2) {
        GLES20.glBindRenderbuffer(i, i2);
    }

    /* renamed from: i */
    public void mo22353i(int i, IntBuffer intBuffer) {
        GLES20.glDeleteRenderbuffers(i, intBuffer);
    }

    /* renamed from: j */
    public void mo22356j(int i, IntBuffer intBuffer) {
        GLES20.glGenRenderbuffers(i, intBuffer);
    }

    /* renamed from: i */
    public void mo22352i(int i, int i2, int i3, int i4) {
        GLES20.glRenderbufferStorage(i, i2, i3, i4);
    }

    /* renamed from: j */
    public void mo22355j(int i, int i2, int i3, int i4) {
        GLES20.glFramebufferRenderbuffer(i, i2, i3, i4);
    }

    /* renamed from: c */
    public void mo22313c(int i, int i2, int i3, int i4, int i5) {
        GLES20.glFramebufferTexture2D(i, i2, i3, i4, i5);
    }

    /* renamed from: S */
    public int mo22243S(int i) {
        return GLES20.glCheckFramebufferStatus(i);
    }
}
