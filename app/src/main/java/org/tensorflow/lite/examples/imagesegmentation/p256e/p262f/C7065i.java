package p256e.p262f;

import android.content.Context;
import android.os.Environment;
import android.view.SurfaceHolder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p256e.p258b.C6977a;
import p256e.p259c.C6982a;
import p256e.p259c.C6987b;
import p256e.p259c.C6987b.C6988a;
import p256e.p259c.C6989c;
import p256e.p259c.C6992d;
import p256e.p259c.C6993e;
import p256e.p259c.C6994f;
import p256e.p259c.C6995g;
import p256e.p259c.C6997i;
import p256e.p262f.C7052c.C7054a;
import p256e.p262f.C7088l.C7090b;

/* renamed from: e.f.i */
/* compiled from: PGraphicsOpenGL */
public class C7065i extends C6989c {

    /* renamed from: cC */
    protected static boolean f25453cC = false;

    /* renamed from: cD */
    public static boolean f25454cD;

    /* renamed from: cE */
    public static boolean f25455cE;

    /* renamed from: cF */
    public static boolean f25456cF;

    /* renamed from: cG */
    public static boolean f25457cG;

    /* renamed from: cH */
    public static boolean f25458cH;

    /* renamed from: cI */
    public static boolean f25459cI;

    /* renamed from: cJ */
    public static boolean f25460cJ;

    /* renamed from: cK */
    public static boolean f25461cK;

    /* renamed from: cL */
    public static int f25462cL;

    /* renamed from: cM */
    public static int f25463cM;

    /* renamed from: cN */
    public static float f25464cN;

    /* renamed from: cO */
    public static int f25465cO;

    /* renamed from: cP */
    public static int f25466cP;

    /* renamed from: cQ */
    public static String f25467cQ;

    /* renamed from: cR */
    public static String f25468cR;

    /* renamed from: cS */
    public static String f25469cS;

    /* renamed from: cT */
    public static String f25470cT;

    /* renamed from: cU */
    public static String f25471cU;

    /* renamed from: cV */
    protected static URL f25472cV = C7065i.class.getResource("/assets/shaders/ColorVert.glsl");

    /* renamed from: cW */
    protected static URL f25473cW = C7065i.class.getResource("/assets/shaders/TexVert.glsl");

    /* renamed from: cX */
    protected static URL f25474cX = C7065i.class.getResource("/assets/shaders/LightVert.glsl");

    /* renamed from: cY */
    protected static URL f25475cY = C7065i.class.getResource("/assets/shaders/TexLightVert.glsl");

    /* renamed from: cZ */
    protected static URL f25476cZ = C7065i.class.getResource("/assets/shaders/ColorFrag.glsl");

    /* renamed from: da */
    protected static URL f25477da = C7065i.class.getResource("/assets/shaders/TexFrag.glsl");

    /* renamed from: db */
    protected static URL f25478db = C7065i.class.getResource("/assets/shaders/LightFrag.glsl");

    /* renamed from: dc */
    protected static URL f25479dc = C7065i.class.getResource("/assets/shaders/TexLightFrag.glsl");

    /* renamed from: dd */
    protected static URL f25480dd = C7065i.class.getResource("/assets/shaders/LineVert.glsl");

    /* renamed from: de */
    protected static URL f25481de = C7065i.class.getResource("/assets/shaders/LineFrag.glsl");

    /* renamed from: df */
    protected static URL f25482df = C7065i.class.getResource("/assets/shaders/PointVert.glsl");

    /* renamed from: dg */
    protected static URL f25483dg = C7065i.class.getResource("/assets/shaders/PointFrag.glsl");

    /* renamed from: dh */
    protected static URL f25484dh = C7065i.class.getResource("/assets/shaders/MaskFrag.glsl");

    /* renamed from: dy */
    protected static final Set<C7067a> f25485dy = new HashSet();

    /* renamed from: dz */
    protected static final List<C7067a> f25486dz = new ArrayList();

    /* renamed from: eb */
    protected static C6995g f25487eb = new C6995g();

    /* renamed from: fc */
    protected static final float[][] f25488fc = {new float[]{-1.0f, 1.0f}, new float[]{-1.0f, -1.0f}, new float[]{1.0f, -1.0f}, new float[]{1.0f, 1.0f}};

    /* renamed from: fd */
    protected static IntBuffer f25489fd;

    /* renamed from: fe */
    protected static FloatBuffer f25490fe;
    /* access modifiers changed from: private */

    /* renamed from: ff */
    public static ReferenceQueue<Object> f25491ff = new ReferenceQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: fg */
    public static List<C7070d<? extends Object>> f25492fg = new LinkedList();

    /* renamed from: a */
    public C7056e f25493a = mo22409a(this);

    /* renamed from: b */
    public C7065i f25494b;

    /* renamed from: c */
    protected WeakHashMap<C6987b, C7013a> f25495c;

    /* renamed from: cA */
    protected int f25496cA;

    /* renamed from: cB */
    protected C7068b f25497cB;

    /* renamed from: cs */
    protected C7091m f25498cs;

    /* renamed from: ct */
    protected boolean f25499ct = false;

    /* renamed from: cu */
    protected int f25500cu;

    /* renamed from: cv */
    protected C7091m f25501cv;

    /* renamed from: cw */
    protected C7091m f25502cw;

    /* renamed from: cx */
    protected C7091m f25503cx;

    /* renamed from: cy */
    protected C7091m f25504cy;

    /* renamed from: cz */
    protected boolean f25505cz = false;

    /* renamed from: d */
    public boolean f25506d;

    /* renamed from: dA */
    public float f25507dA;

    /* renamed from: dB */
    public float f25508dB;

    /* renamed from: dC */
    public float f25509dC;

    /* renamed from: dD */
    public float f25510dD;

    /* renamed from: dE */
    public float f25511dE;

    /* renamed from: dF */
    public float f25512dF;

    /* renamed from: dG */
    public float f25513dG;

    /* renamed from: dH */
    public float f25514dH;

    /* renamed from: dI */
    public float f25515dI;

    /* renamed from: dJ */
    public float f25516dJ;

    /* renamed from: dK */
    public float f25517dK;

    /* renamed from: dL */
    public float f25518dL;

    /* renamed from: dM */
    public float f25519dM;

    /* renamed from: dN */
    public float f25520dN;

    /* renamed from: dO */
    protected float f25521dO;

    /* renamed from: dP */
    protected boolean f25522dP;

    /* renamed from: dQ */
    protected boolean f25523dQ = false;

    /* renamed from: dR */
    public C6995g f25524dR;

    /* renamed from: dS */
    public C6995g f25525dS;

    /* renamed from: dT */
    public C6995g f25526dT;

    /* renamed from: dU */
    public C6995g f25527dU;

    /* renamed from: dV */
    public C6995g f25528dV;

    /* renamed from: dW */
    public C6995g f25529dW;

    /* renamed from: dX */
    protected float[] f25530dX;

    /* renamed from: dY */
    protected float[] f25531dY;

    /* renamed from: dZ */
    protected float[] f25532dZ;

    /* renamed from: di */
    protected C7082j f25533di;

    /* renamed from: dj */
    protected C7082j f25534dj;

    /* renamed from: dk */
    protected C7082j f25535dk;

    /* renamed from: dl */
    protected C7082j f25536dl;

    /* renamed from: dm */
    protected C7082j f25537dm;

    /* renamed from: dn */
    protected C7082j f25538dn;

    /* renamed from: do */
    protected C7082j f25539do;

    /* renamed from: dp */
    protected C7082j f25540dp;

    /* renamed from: dq */
    protected C7082j f25541dq;

    /* renamed from: dr */
    protected C7075i f25542dr;

    /* renamed from: ds */
    protected C7077k f25543ds;

    /* renamed from: dt */
    protected C7080m f25544dt;

    /* renamed from: du */
    protected C7078l f25545du;

    /* renamed from: dv */
    protected C7069c f25546dv;

    /* renamed from: dw */
    protected boolean f25547dw;

    /* renamed from: dx */
    protected C7067a f25548dx;

    /* renamed from: e */
    protected int f25549e = 1;

    /* renamed from: eA */
    protected boolean f25550eA = false;

    /* renamed from: eB */
    protected int[] f25551eB = {0, 0, 0, 0};

    /* renamed from: eC */
    C7013a f25552eC;

    /* renamed from: eD */
    protected int f25553eD;

    /* renamed from: eE */
    protected C7051b[] f25554eE;

    /* renamed from: eF */
    protected C7051b f25555eF;

    /* renamed from: eG */
    protected C7051b f25556eG;

    /* renamed from: eH */
    protected C7051b f25557eH;

    /* renamed from: eI */
    protected C7051b f25558eI;

    /* renamed from: eJ */
    protected C7051b f25559eJ;

    /* renamed from: eK */
    protected boolean f25560eK;

    /* renamed from: eL */
    protected boolean f25561eL;

    /* renamed from: eM */
    protected C7088l f25562eM = null;

    /* renamed from: eN */
    protected C7088l f25563eN = null;

    /* renamed from: eO */
    protected IntBuffer f25564eO;

    /* renamed from: eP */
    protected int[] f25565eP;

    /* renamed from: eQ */
    protected IntBuffer f25566eQ;

    /* renamed from: eR */
    protected C7088l f25567eR = null;

    /* renamed from: eS */
    protected boolean f25568eS = false;

    /* renamed from: eT */
    protected boolean f25569eT = false;

    /* renamed from: eU */
    protected int f25570eU = 0;

    /* renamed from: eV */
    protected int f25571eV = -10;

    /* renamed from: eW */
    protected int f25572eW = -1;

    /* renamed from: eX */
    protected int f25573eX = 0;

    /* renamed from: eY */
    protected IntBuffer f25574eY;

    /* renamed from: eZ */
    protected boolean f25575eZ = false;

    /* renamed from: ea */
    protected float[] f25576ea;

    /* renamed from: ec */
    protected boolean f25577ec;

    /* renamed from: ed */
    protected boolean f25578ed;

    /* renamed from: ee */
    protected int f25579ee;

    /* renamed from: ef */
    protected float[][] f25580ef = ((float[][]) Array.newInstance(float.class, new int[]{32, 16}));

    /* renamed from: eg */
    protected float[][] f25581eg = ((float[][]) Array.newInstance(float.class, new int[]{32, 16}));

    /* renamed from: eh */
    protected float[][] f25582eh = ((float[][]) Array.newInstance(float.class, new int[]{32, 16}));

    /* renamed from: ei */
    protected float[][] f25583ei = ((float[][]) Array.newInstance(float.class, new int[]{32, 16}));

    /* renamed from: ej */
    protected float[][] f25584ej = ((float[][]) Array.newInstance(float.class, new int[]{32, 16}));

    /* renamed from: ek */
    public boolean f25585ek;

    /* renamed from: el */
    public int f25586el = 0;

    /* renamed from: em */
    public int[] f25587em;

    /* renamed from: en */
    public float[] f25588en;

    /* renamed from: eo */
    public float[] f25589eo;

    /* renamed from: ep */
    public float[] f25590ep;

    /* renamed from: eq */
    public float[] f25591eq;

    /* renamed from: er */
    public float[] f25592er;

    /* renamed from: es */
    public float[] f25593es;

    /* renamed from: et */
    public float[] f25594et;

    /* renamed from: eu */
    public float[] f25595eu;

    /* renamed from: ev */
    public float f25596ev;

    /* renamed from: ew */
    public float f25597ew;

    /* renamed from: ex */
    public float f25598ex;

    /* renamed from: ey */
    protected int f25599ey = 0;

    /* renamed from: ez */
    protected int f25600ez = 5;

    /* renamed from: f */
    protected C7091m f25601f;

    /* renamed from: fa */
    protected boolean f25602fa = false;

    /* renamed from: fb */
    protected boolean f25603fb = false;

    /* renamed from: g */
    protected C7091m f25604g;

    /* renamed from: h */
    protected C7091m f25605h;

    /* renamed from: i */
    protected C7091m f25606i;

    /* renamed from: j */
    protected C7091m f25607j;

    /* renamed from: k */
    protected C7091m f25608k;

    /* renamed from: l */
    protected C7091m f25609l;

    /* renamed from: m */
    protected C7091m f25610m;

    /* renamed from: n */
    protected C7091m f25611n;

    /* renamed from: o */
    protected boolean f25612o = false;

    /* renamed from: p */
    protected int f25613p;

    /* renamed from: q */
    protected C7091m f25614q;

    /* renamed from: r */
    protected C7091m f25615r;

    /* renamed from: s */
    protected C7091m f25616s;

    /* renamed from: e.f.i$a */
    /* compiled from: PGraphicsOpenGL */
    protected class C7067a {

        /* renamed from: a */
        int[] f25618a;

        /* renamed from: b */
        long[] f25619b;

        /* renamed from: c */
        String[] f25620c;

        /* renamed from: d */
        int[] f25621d;

        /* renamed from: e */
        int[] f25622e;

        /* renamed from: f */
        int f25623f;

        /* renamed from: g */
        int f25624g;

        /* renamed from: h */
        int f25625h;

        /* renamed from: i */
        boolean f25626i;

        /* renamed from: j */
        final /* synthetic */ C7065i f25627j;

        /* renamed from: a */
        public void mo22497a() {
            if (this.f25619b != null) {
                while (this.f25625h > 0) {
                    this.f25627j.f25493a.mo22282a(this.f25619b[this.f25624g]);
                    this.f25625h--;
                    this.f25624g = (this.f25624g + 1) % 3;
                }
                this.f25619b = null;
            }
            if (this.f25618a != null) {
                for (int i = 0; i < 3; i++) {
                    this.f25627j.f25493a.mo22327d(3, C7056e.m37108a(this.f25618a));
                }
                this.f25618a = null;
            }
            this.f25620c = null;
            this.f25621d = null;
            this.f25622e = null;
            this.f25625h = 0;
            this.f25623f = 0;
            this.f25624g = 0;
            this.f25626i = false;
            C7065i.f25485dy.remove(this);
        }
    }

    /* renamed from: e.f.i$b */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7068b extends HashMap<String, C7081n> {

        /* renamed from: a */
        public ArrayList<String> f25628a = new ArrayList<>();

        /* renamed from: b */
        public int f25629b = 0;

        protected C7068b() {
        }

        /* renamed from: a */
        public C7081n put(String str, C7081n nVar) {
            C7081n nVar2 = (C7081n) super.put(str, nVar);
            this.f25628a.add(str);
            if (nVar.f25822c == 2) {
                this.f25629b += 4;
            } else {
                this.f25629b += nVar.f25824e;
            }
            return nVar2;
        }

        /* renamed from: a */
        public C7081n mo22498a(int i) {
            return (C7081n) super.get(this.f25628a.get(i));
        }
    }

    /* renamed from: e.f.i$c */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7069c {

        /* renamed from: a */
        int[] f25630a;

        /* renamed from: b */
        int[] f25631b;

        /* renamed from: c */
        int[] f25632c;

        /* renamed from: d */
        float[] f25633d;

        /* renamed from: e */
        float[] f25634e;

        /* renamed from: f */
        float[] f25635f;

        /* renamed from: g */
        float[] f25636g;

        /* renamed from: h */
        float[] f25637h;

        /* renamed from: i */
        float[] f25638i;

        /* renamed from: j */
        float[] f25639j;

        /* renamed from: k */
        float[] f25640k;

        /* renamed from: l */
        float[] f25641l;

        /* renamed from: m */
        BitSet f25642m;

        /* renamed from: n */
        BitSet f25643n;

        /* renamed from: o */
        C7065i f25644o;

        /* renamed from: a */
        static float m37691a(float f, float f2, float f3, float f4, float f5, float f6) {
            return (f * f4) + (f2 * f5) + (f3 * f6);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22501a(int i) {
            if (this.f25630a.length < i) {
                int i2 = ((i / 4) + 1) * 5;
                this.f25630a = new int[i2];
                this.f25631b = new int[i2];
                this.f25632c = new int[i2];
                this.f25633d = new float[i2];
                this.f25634e = new float[i2];
                this.f25635f = new float[i2];
                this.f25636g = new float[i2];
                this.f25637h = new float[i2];
                this.f25638i = new float[i2];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22503b(int i) {
            int i2 = i * 3;
            if (this.f25639j.length < i2) {
                this.f25639j = new float[(((i2 / 4) + 1) * 5)];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22502a(C7077k kVar) {
            int i;
            int i2;
            int i3;
            float[] fArr;
            int[] iArr;
            int[] iArr2;
            int i4;
            BitSet bitSet;
            int i5;
            int i6;
            C7080m mVar;
            C7077k kVar2 = kVar;
            int i7 = 3;
            int i8 = kVar2.f25751p / 3;
            mo22501a(i8);
            int[] iArr3 = this.f25630a;
            int[] iArr4 = this.f25631b;
            int[] iArr5 = this.f25632c;
            for (int i9 = 0; i9 < i8; i9++) {
                iArr3[i9] = i9;
            }
            C7080m mVar2 = this.f25644o.f25544dt;
            C7076j jVar = kVar2.f25755t;
            int i10 = 0;
            while (true) {
                int i11 = 1;
                if (i10 >= mVar2.f25813b) {
                    break;
                }
                int i12 = mVar2.f25817f[i10];
                int i13 = mVar2.f25818g[i10];
                int i14 = i12;
                while (i14 <= i13) {
                    int i15 = i14 == i12 ? mVar2.f25815d[i10] : jVar.f25696c[i14];
                    int i16 = i14 == i13 ? (mVar2.f25816e[i10] - i15) + i11 : (jVar.f25696c[i14] + jVar.f25695b[i14]) - i15;
                    int i17 = i15 / 3;
                    while (true) {
                        mVar = mVar2;
                        if (i17 >= (i15 + i16) / 3) {
                            break;
                        }
                        iArr4[i17] = i10;
                        iArr5[i17] = i14;
                        i17++;
                        mVar2 = mVar;
                    }
                    i14++;
                    mVar2 = mVar;
                    i11 = 1;
                }
                C7080m mVar3 = mVar2;
                i10++;
            }
            int i18 = kVar2.f25739d;
            mo22503b(i18);
            float[] fArr2 = this.f25639j;
            float[] fArr3 = kVar2.f25716Q;
            C6995g gVar = this.f25644o.f25524dR;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = i19 * 4;
                float f = fArr3[i20 + 0];
                float f2 = fArr3[i20 + 1];
                float f3 = fArr3[i20 + 2];
                float f4 = fArr3[i20 + i7];
                float f5 = (gVar.f24769a * f) + (gVar.f24770b * f2) + (gVar.f24771c * f3) + (gVar.f24772d * f4);
                int i21 = i18;
                float f6 = (gVar.f24773e * f) + (gVar.f24774f * f2) + (gVar.f24775g * f3) + (gVar.f24776h * f4);
                float[] fArr4 = fArr3;
                float f7 = (gVar.f24777i * f) + (gVar.f24778j * f2) + (gVar.f24779k * f3) + (gVar.f24780l * f4);
                float f8 = (gVar.f24781m * f) + (gVar.f24782n * f2) + (gVar.f24783o * f3) + (gVar.f24784p * f4);
                if (C7065i.m37511j(f8)) {
                    f5 /= f8;
                    f6 /= f8;
                    f7 /= f8;
                }
                int i22 = i19 * 3;
                fArr2[i22 + 0] = f5;
                fArr2[i22 + 1] = f6;
                fArr2[i22 + 2] = -f7;
                i19++;
                i18 = i21;
                fArr3 = fArr4;
                i7 = 3;
            }
            float[] fArr5 = this.f25639j;
            int[] iArr6 = kVar2.f25755t.f25698e;
            short[] sArr = kVar2.f25724Y;
            float[] fArr6 = this.f25640k;
            float[] fArr7 = this.f25641l;
            int i23 = 0;
            while (i23 < i8) {
                int i24 = i23;
                m37694a(fArr6, i23, iArr6, iArr5, fArr5, sArr);
                this.f25633d[i24] = C6982a.m36415b(fArr6[0], fArr6[3], fArr6[6]);
                this.f25636g[i24] = C6982a.m36399a(fArr6[0], fArr6[3], fArr6[6]);
                this.f25634e[i24] = C6982a.m36415b(fArr6[1], fArr6[4], fArr6[7]);
                this.f25637h[i24] = C6982a.m36399a(fArr6[1], fArr6[4], fArr6[7]);
                this.f25635f[i24] = C6982a.m36415b(fArr6[2], fArr6[5], fArr6[8]);
                this.f25638i[i24] = C6982a.m36399a(fArr6[2], fArr6[5], fArr6[8]);
                i23 = i24 + 1;
            }
            m37693a(0, i8 - 1, iArr3, this.f25635f);
            BitSet bitSet2 = this.f25642m;
            BitSet bitSet3 = this.f25643n;
            bitSet2.clear();
            int i25 = 0;
            while (i25 < i8) {
                int i26 = i25 + 1;
                bitSet3.clear();
                int i27 = iArr3[i25];
                float f9 = this.f25633d[i27];
                float f10 = this.f25636g[i27];
                float f11 = this.f25634e[i27];
                float f12 = this.f25637h[i27];
                float f13 = this.f25638i[i27];
                int[] iArr7 = iArr4;
                int i28 = i25;
                BitSet bitSet4 = bitSet3;
                BitSet bitSet5 = bitSet2;
                m37694a(fArr6, i27, iArr6, iArr5, fArr5, sArr);
                int i29 = i26;
                int i30 = i27;
                boolean z = false;
                while (!z && i29 < i8) {
                    int i31 = iArr3[i29];
                    if (f13 > this.f25635f[i31] || bitSet5.get(i31)) {
                        if (f10 <= this.f25633d[i31] || f12 <= this.f25634e[i31] || f9 >= this.f25636g[i31] || f11 >= this.f25637h[i31]) {
                            fArr = fArr5;
                            iArr = iArr5;
                            iArr2 = iArr6;
                            i4 = i28;
                            bitSet = bitSet4;
                            i5 = i30;
                            i6 = i29 + 1;
                        } else {
                            int i32 = i31;
                            int[] iArr8 = iArr6;
                            iArr2 = iArr6;
                            int i33 = i31;
                            int[] iArr9 = iArr5;
                            iArr = iArr5;
                            i5 = i30;
                            float[] fArr8 = fArr5;
                            fArr = fArr5;
                            int i34 = i29;
                            m37694a(fArr7, i32, iArr8, iArr9, fArr8, sArr);
                            if (m37692a(fArr7, fArr6, -1.0f) > 0) {
                                i29 = i34 + 1;
                            } else if (m37692a(fArr6, fArr7, 1.0f) > 0) {
                                i29 = i34 + 1;
                            } else {
                                bitSet = bitSet4;
                                if (!bitSet.get(i33)) {
                                    bitSet.set(i5);
                                    bitSet5.set(i33);
                                    i4 = i28;
                                    m37696b(iArr3, i4, i34);
                                    System.arraycopy(fArr7, 0, fArr6, 0, 9);
                                    float f14 = this.f25633d[i33];
                                    f9 = f14;
                                    f10 = this.f25636g[i33];
                                    f11 = this.f25634e[i33];
                                    f12 = this.f25637h[i33];
                                    f13 = this.f25638i[i33];
                                    i30 = i33;
                                    i29 = i26;
                                } else {
                                    i4 = i28;
                                    i6 = i34 + 1;
                                }
                            }
                            i30 = i5;
                            i4 = i28;
                            bitSet = bitSet4;
                        }
                        i30 = i5;
                    } else {
                        fArr = fArr5;
                        iArr = iArr5;
                        iArr2 = iArr6;
                        i4 = i28;
                        bitSet = bitSet4;
                        z = true;
                    }
                    bitSet4 = bitSet;
                    i28 = i4;
                    iArr6 = iArr2;
                    iArr5 = iArr;
                    fArr5 = fArr;
                }
                bitSet2 = bitSet5;
                bitSet3 = bitSet4;
                i25 = i26;
                iArr4 = iArr7;
                iArr6 = iArr6;
                iArr5 = iArr5;
                fArr5 = fArr5;
            }
            int[] iArr10 = iArr4;
            int[] iArr11 = iArr5;
            for (int i35 = 0; i35 < i8; i35++) {
                int i36 = iArr3[i35];
                if (i35 != i36) {
                    int i37 = i35 * 3;
                    short s = sArr[i37 + 0];
                    short s2 = sArr[i37 + 1];
                    short s3 = sArr[i37 + 2];
                    int i38 = iArr10[i35];
                    int i39 = iArr11[i35];
                    int i40 = i36;
                    int i41 = i35;
                    while (true) {
                        iArr3[i41] = i41;
                        int i42 = i41 * 3;
                        int i43 = i40 * 3;
                        i = i43 + 0;
                        sArr[i42 + 0] = sArr[i];
                        i2 = i43 + 1;
                        sArr[i42 + 1] = sArr[i2];
                        i3 = i43 + 2;
                        sArr[i42 + 2] = sArr[i3];
                        iArr10[i41] = iArr10[i40];
                        iArr11[i41] = iArr11[i40];
                        int i44 = iArr3[i40];
                        if (i44 == i35) {
                            break;
                        }
                        int i45 = i40;
                        i40 = i44;
                        i41 = i45;
                    }
                    iArr3[i40] = i40;
                    sArr[i] = s;
                    sArr[i2] = s2;
                    sArr[i3] = s3;
                    iArr10[i40] = i38;
                    iArr11[i40] = i39;
                }
            }
        }

        /* renamed from: a */
        static void m37694a(float[] fArr, int i, int[] iArr, int[] iArr2, float[] fArr2, short[] sArr) {
            int i2 = iArr[iArr2[i]];
            int i3 = i * 3;
            int i4 = (sArr[i3 + 0] + i2) * 3;
            int i5 = (sArr[i3 + 1] + i2) * 3;
            int i6 = (i2 + sArr[i3 + 2]) * 3;
            fArr[0] = fArr2[i4 + 0];
            fArr[1] = fArr2[i4 + 1];
            fArr[2] = fArr2[i4 + 2];
            fArr[3] = fArr2[i5 + 0];
            fArr[4] = fArr2[i5 + 1];
            fArr[5] = fArr2[i5 + 2];
            fArr[6] = fArr2[i6 + 0];
            fArr[7] = fArr2[i6 + 1];
            fArr[8] = fArr2[i6 + 2];
        }

        /* renamed from: a */
        static void m37693a(int i, int i2, int[] iArr, float[] fArr) {
            m37695a(iArr, i, (i + i2) / 2);
            float f = fArr[iArr[i]];
            int i3 = i;
            for (int i4 = i + 1; i4 <= i2; i4++) {
                if (fArr[iArr[i4]] < f) {
                    i3++;
                    m37695a(iArr, i3, i4);
                }
            }
            m37695a(iArr, i, i3);
            int i5 = i3 - 1;
            if (i < i5) {
                m37693a(i, i5, iArr, fArr);
            }
            int i6 = i3 + 1;
            if (i6 < i2) {
                m37693a(i6, i2, iArr, fArr);
            }
        }

        /* renamed from: a */
        static int m37692a(float[] fArr, float[] fArr2, float f) {
            float f2 = fArr[3] - fArr[0];
            float f3 = fArr[6] - fArr[0];
            float f4 = fArr[4] - fArr[1];
            float f5 = fArr[7] - fArr[1];
            float f6 = fArr[5] - fArr[2];
            float f7 = fArr[8] - fArr[2];
            float f8 = (f4 * f7) - (f6 * f5);
            float f9 = (f6 * f3) - (f7 * f2);
            float f10 = (f2 * f5) - (f4 * f3);
            float sqrt = 1.0f / ((float) Math.sqrt((double) (((f8 * f8) + (f9 * f9)) + (f10 * f10))));
            float f11 = f8 * sqrt;
            float f12 = f9 * sqrt;
            float f13 = f10 * sqrt;
            float f14 = -m37691a(f11, f12, f13, fArr[0], fArr[1], fArr[2]);
            float a = m37691a(f11, f12, f13, fArr[0], fArr[1], fArr[2] + (100.0f * f)) + f14;
            float a2 = m37691a(f11, f12, f13, fArr2[0], fArr2[1], fArr2[2]) + f14;
            float a3 = m37691a(f11, f12, f13, fArr2[3], fArr2[4], fArr2[5]) + f14;
            float a4 = m37691a(f11, f12, f13, fArr2[6], fArr2[7], fArr2[8]) + f14;
            float a5 = C6982a.m36397a(a2);
            float a6 = C6982a.m36397a(a3);
            float a7 = C6982a.m36397a(a4);
            float a8 = C6982a.m36399a(a5, a6, a7) * 0.1f;
            if (a5 < a8) {
                a2 = 0.0f;
            }
            float f15 = a2 * a;
            if (a6 < a8) {
                a3 = 0.0f;
            }
            float f16 = a3 * a;
            if (a7 < a8) {
                a4 = 0.0f;
            }
            float f17 = a4 * a;
            boolean z = f15 >= 0.0f && f16 >= 0.0f && f17 >= 0.0f;
            boolean z2 = f15 <= 0.0f && f16 <= 0.0f && f17 <= 0.0f;
            if (z) {
                return 1;
            }
            if (z2) {
                return -1;
            }
            return 0;
        }

        /* renamed from: a */
        static void m37695a(int[] iArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
        }

        /* renamed from: b */
        static void m37696b(int[] iArr, int i, int i2) {
            if (i != i2) {
                int i3 = iArr[i2];
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
                iArr[i] = i3;
            }
        }
    }

    /* renamed from: e.f.i$d */
    /* compiled from: PGraphicsOpenGL */
    private static abstract class C7070d<T> extends WeakReference<T> {
        /* renamed from: b */
        public abstract void mo22505b();

        protected C7070d(T t) {
            super(t, C7065i.f25491ff);
            C7065i.m37510j();
            C7065i.f25492fg.add(this);
        }

        /* renamed from: a */
        public void mo22504a() {
            C7065i.f25492fg.remove(this);
            mo22505b();
        }
    }

    /* renamed from: e.f.i$e */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7071e extends C7070d<C7051b> {

        /* renamed from: a */
        int f25645a;

        /* renamed from: b */
        int f25646b;

        /* renamed from: c */
        int f25647c;

        /* renamed from: d */
        int f25648d;

        /* renamed from: e */
        int f25649e;

        /* renamed from: f */
        private C7056e f25650f;

        /* renamed from: g */
        private int f25651g;

        public C7071e(C7051b bVar) {
            super(bVar);
            this.f25650f = bVar.f25016a.mo22424aE();
            if (!bVar.f25033r) {
                this.f25650f.mo22349h(1, C7065i.f25489fd);
                bVar.f25019d = C7065i.f25489fd.get(0);
                if (bVar.f25029n) {
                    this.f25650f.mo22356j(1, C7065i.f25489fd);
                    bVar.f25023h = C7065i.f25489fd.get(0);
                }
                if (bVar.f25028m) {
                    this.f25650f.mo22356j(1, C7065i.f25489fd);
                    bVar.f25022g = C7065i.f25489fd.get(0);
                } else {
                    if (bVar.f25026k > 0) {
                        this.f25650f.mo22356j(1, C7065i.f25489fd);
                        bVar.f25020e = C7065i.f25489fd.get(0);
                    }
                    if (bVar.f25027l > 0) {
                        this.f25650f.mo22356j(1, C7065i.f25489fd);
                        bVar.f25021f = C7065i.f25489fd.get(0);
                    }
                }
                this.f25645a = bVar.f25019d;
                this.f25646b = bVar.f25020e;
                this.f25647c = bVar.f25021f;
                this.f25648d = bVar.f25022g;
                this.f25649e = bVar.f25023h;
            }
            this.f25651g = bVar.f25018c;
        }

        /* renamed from: b */
        public void mo22505b() {
            if (this.f25650f != null) {
                if (this.f25645a != 0) {
                    C7065i.f25489fd.put(0, this.f25645a);
                    this.f25650f.mo22343g(1, C7065i.f25489fd);
                    this.f25645a = 0;
                }
                if (this.f25646b != 0) {
                    C7065i.f25489fd.put(0, this.f25646b);
                    this.f25650f.mo22353i(1, C7065i.f25489fd);
                    this.f25646b = 0;
                }
                if (this.f25647c != 0) {
                    C7065i.f25489fd.put(0, this.f25647c);
                    this.f25650f.mo22353i(1, C7065i.f25489fd);
                    this.f25647c = 0;
                }
                if (this.f25648d != 0) {
                    C7065i.f25489fd.put(0, this.f25648d);
                    this.f25650f.mo22353i(1, C7065i.f25489fd);
                    this.f25648d = 0;
                }
                if (this.f25649e != 0) {
                    C7065i.f25489fd.put(0, this.f25649e);
                    this.f25650f.mo22353i(1, C7065i.f25489fd);
                    this.f25649e = 0;
                }
                this.f25650f = null;
            }
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C7071e)) {
                return false;
            }
            C7071e eVar = (C7071e) obj;
            if (eVar.f25645a == this.f25645a && eVar.f25646b == this.f25646b && eVar.f25647c == this.f25647c && eVar.f25648d == this.f25648d && eVar.f25649e == this.f25649e && eVar.f25651g == this.f25651g) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return ((((((((((527 + this.f25645a) * 31) + this.f25646b) * 31) + this.f25647c) * 31) + this.f25648d) * 31) + this.f25649e) * 31) + this.f25651g;
        }
    }

    /* renamed from: e.f.i$f */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7072f extends C7070d<C7082j> {

        /* renamed from: a */
        int f25652a;

        /* renamed from: b */
        int f25653b;

        /* renamed from: c */
        int f25654c;

        /* renamed from: d */
        private C7056e f25655d;

        /* renamed from: e */
        private int f25656e;

        public C7072f(C7082j jVar) {
            super(jVar);
            this.f25655d = jVar.f25894q.f25389a.mo22424aE();
            jVar.f25897t = this.f25655d.mo22248V();
            jVar.f25898u = this.f25655d.mo22216F(C7056e.f25243dn);
            jVar.f25899v = this.f25655d.mo22216F(C7056e.f25244do);
            this.f25652a = jVar.f25897t;
            this.f25653b = jVar.f25898u;
            this.f25654c = jVar.f25899v;
            this.f25656e = jVar.f25895r;
        }

        /* renamed from: b */
        public void mo22505b() {
            if (this.f25655d != null) {
                if (this.f25654c != 0) {
                    this.f25655d.mo22220H(this.f25654c);
                    this.f25654c = 0;
                }
                if (this.f25653b != 0) {
                    this.f25655d.mo22220H(this.f25653b);
                    this.f25653b = 0;
                }
                if (this.f25652a != 0) {
                    this.f25655d.mo22226K(this.f25652a);
                    this.f25652a = 0;
                }
                this.f25655d = null;
            }
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C7072f)) {
                return false;
            }
            C7072f fVar = (C7072f) obj;
            if (fVar.f25652a == this.f25652a && fVar.f25653b == this.f25653b && fVar.f25654c == this.f25654c && fVar.f25656e == this.f25656e) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return ((((((527 + this.f25652a) * 31) + this.f25653b) * 31) + this.f25654c) * 31) + this.f25656e;
        }
    }

    /* renamed from: e.f.i$g */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7073g extends C7070d<C7088l> {

        /* renamed from: a */
        int f25657a;

        /* renamed from: b */
        private C7056e f25658b;

        /* renamed from: c */
        private int f25659c;

        public C7073g(C7088l lVar) {
            super(lVar);
            this.f25658b = lVar.f25950l.mo22424aE();
            this.f25658b.mo22334e(1, C7065i.f25489fd);
            lVar.f25941c = C7065i.f25489fd.get(0);
            this.f25657a = lVar.f25941c;
            this.f25659c = lVar.f25952n;
        }

        /* renamed from: b */
        public void mo22505b() {
            if (this.f25658b != null) {
                if (this.f25657a != 0) {
                    C7065i.f25489fd.put(0, this.f25657a);
                    this.f25658b.mo22340f(1, C7065i.f25489fd);
                    this.f25657a = 0;
                }
                this.f25658b = null;
            }
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C7073g)) {
                return false;
            }
            C7073g gVar = (C7073g) obj;
            if (gVar.f25657a == this.f25657a && gVar.f25659c == this.f25659c) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return ((527 + this.f25657a) * 31) + this.f25659c;
        }
    }

    /* renamed from: e.f.i$h */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7074h extends C7070d<C7091m> {

        /* renamed from: a */
        int f25660a;

        /* renamed from: b */
        private C7056e f25661b;

        /* renamed from: c */
        private int f25662c;

        public C7074h(C7091m mVar) {
            super(mVar);
            this.f25661b = mVar.f25979f.f25389a.mo22424aE();
            this.f25661b.mo22318c(1, C7065i.f25489fd);
            mVar.f25974a = C7065i.f25489fd.get(0);
            this.f25660a = mVar.f25974a;
            this.f25662c = mVar.f25980g;
        }

        /* renamed from: b */
        public void mo22505b() {
            if (this.f25661b != null) {
                if (this.f25660a != 0) {
                    C7065i.f25489fd.put(0, this.f25660a);
                    this.f25661b.mo22327d(1, C7065i.f25489fd);
                    this.f25660a = 0;
                }
                this.f25661b = null;
            }
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C7074h)) {
                return false;
            }
            C7074h hVar = (C7074h) obj;
            if (hVar.f25660a == this.f25660a && hVar.f25662c == this.f25662c) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return ((527 + this.f25660a) * 31) + this.f25662c;
        }
    }

    /* renamed from: e.f.i$i */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7075i {

        /* renamed from: A */
        int f25663A;

        /* renamed from: B */
        float f25664B;

        /* renamed from: C */
        float f25665C;

        /* renamed from: D */
        float f25666D;

        /* renamed from: E */
        float f25667E;

        /* renamed from: a */
        C7065i f25668a;

        /* renamed from: b */
        int f25669b;

        /* renamed from: c */
        C7068b f25670c;

        /* renamed from: d */
        int f25671d;

        /* renamed from: e */
        int f25672e;

        /* renamed from: f */
        int f25673f;

        /* renamed from: g */
        float[] f25674g;

        /* renamed from: h */
        int[] f25675h;

        /* renamed from: i */
        float[] f25676i;

        /* renamed from: j */
        float[] f25677j;

        /* renamed from: k */
        int[] f25678k;

        /* renamed from: l */
        float[] f25679l;

        /* renamed from: m */
        int[] f25680m;

        /* renamed from: n */
        int[][] f25681n;

        /* renamed from: o */
        int[] f25682o;

        /* renamed from: p */
        int[] f25683p;

        /* renamed from: q */
        int[] f25684q;

        /* renamed from: r */
        float[] f25685r;

        /* renamed from: s */
        HashMap<String, float[]> f25686s;

        /* renamed from: t */
        HashMap<String, int[]> f25687t;

        /* renamed from: u */
        HashMap<String, byte[]> f25688u;

        /* renamed from: v */
        int f25689v;

        /* renamed from: w */
        int f25690w;

        /* renamed from: x */
        float f25691x;

        /* renamed from: y */
        int f25692y;

        /* renamed from: z */
        int f25693z;

        C7075i(C7065i iVar, C7068b bVar, int i) {
            this.f25668a = iVar;
            this.f25670c = bVar;
            this.f25669b = i;
            mo22532b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22521a() {
            this.f25671d = 0;
            this.f25672e = 0;
            this.f25673f = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22532b() {
            this.f25674g = new float[(C7056e.f25349l * 3)];
            this.f25675h = new int[C7056e.f25349l];
            this.f25676i = new float[(C7056e.f25349l * 3)];
            this.f25677j = new float[(C7056e.f25349l * 2)];
            this.f25678k = new int[C7056e.f25349l];
            this.f25679l = new float[C7056e.f25349l];
            this.f25682o = new int[C7056e.f25349l];
            this.f25683p = new int[C7056e.f25349l];
            this.f25684q = new int[C7056e.f25349l];
            this.f25685r = new float[C7056e.f25349l];
            this.f25681n = (int[][]) Array.newInstance(int.class, new int[]{C7056e.f25350m, 3});
            this.f25686s = new HashMap<>();
            this.f25687t = new HashMap<>();
            this.f25688u = new HashMap<>();
            mo22521a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22535c() {
            if (this.f25671d == this.f25674g.length / 3) {
                int i = this.f25671d << 1;
                mo22533b(i);
                mo22536c(i);
                mo22539d(i);
                mo22541e(i);
                mo22543f(i);
                mo22545g(i);
                mo22547h(i);
                mo22549i(i);
                mo22551j(i);
                mo22553k(i);
                mo22555l(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22538d() {
            if (this.f25672e == this.f25680m.length) {
                mo22557m(this.f25672e << 1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22540e() {
            if (this.f25673f == this.f25681n.length) {
                mo22559n(this.f25673f << 1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo22542f() {
            int i = 0;
            for (int i2 = 0; i2 < this.f25673f; i2++) {
                if (this.f25681n[i2][2] == -1) {
                    i++;
                }
            }
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22520a(boolean z) {
            int i;
            int i2 = this.f25673f;
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < this.f25673f; i3++) {
                    int[] iArr = this.f25681n[i3];
                    if (iArr[2] == 0 || iArr[2] == 1) {
                        i += 3;
                    }
                    if (iArr[2] == -1) {
                        i += 5;
                        i2--;
                    }
                }
            } else {
                i2 -= mo22542f();
                i = 0;
            }
            return (i2 * 4) + i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo22531b(boolean z) {
            int i;
            int i2 = this.f25673f;
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < this.f25673f; i3++) {
                    int[] iArr = this.f25681n[i3];
                    if (iArr[2] == 0 || iArr[2] == 1) {
                        i++;
                    }
                    if (iArr[2] == -1) {
                        i++;
                        i2--;
                    }
                }
            } else {
                i2 -= mo22542f();
                i = 0;
            }
            return (i2 + i) * 6;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public double[] mo22530a(int i) {
            int i2;
            double[] dArr = new double[this.f25670c.f25629b];
            int i3 = 0;
            for (int i4 = 0; i4 < this.f25670c.size(); i4++) {
                C7081n a = this.f25670c.mo22498a(i4);
                String str = a.f25821b;
                int i5 = a.f25824e * i;
                if (a.mo22765c()) {
                    int i6 = ((int[]) this.f25687t.get(str))[i5];
                    int i7 = i3 + 1;
                    dArr[i3] = (double) ((i6 >> 24) & 255);
                    int i8 = i7 + 1;
                    dArr[i7] = (double) ((i6 >> 16) & 255);
                    int i9 = i8 + 1;
                    dArr[i8] = (double) ((i6 >> 8) & 255);
                    i3 = i9 + 1;
                    dArr[i9] = (double) ((i6 >> 0) & 255);
                } else {
                    if (a.mo22767e()) {
                        float[] fArr = (float[]) this.f25686s.get(str);
                        int i10 = i5;
                        i2 = i3;
                        int i11 = 0;
                        while (i11 < a.f25824e) {
                            int i12 = i2 + 1;
                            int i13 = i10 + 1;
                            dArr[i2] = (double) fArr[i10];
                            i11++;
                            i2 = i12;
                            i10 = i13;
                        }
                    } else if (a.mo22768f()) {
                        int[] iArr = (int[]) this.f25687t.get(str);
                        int i14 = i5;
                        int i15 = i3;
                        int i16 = 0;
                        while (i16 < a.f25824e) {
                            int i17 = i2 + 1;
                            int i18 = i14 + 1;
                            dArr[i2] = (double) iArr[i14];
                            i16++;
                            i15 = i17;
                            i14 = i18;
                        }
                    } else if (a.mo22769g()) {
                        byte[] bArr = (byte[]) this.f25688u.get(str);
                        int i19 = i5;
                        int i20 = i3;
                        int i21 = 0;
                        while (i21 < a.f25824e) {
                            int i22 = i2 + 1;
                            int i23 = i19 + 1;
                            dArr[i2] = (double) bArr[i19];
                            i21++;
                            i20 = i22;
                            i19 = i23;
                        }
                    }
                    i3 = i2;
                }
            }
            return dArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22533b(int i) {
            float[] fArr = new float[(i * 3)];
            C6982a.m36406a((Object) this.f25674g, 0, (Object) fArr, 0, this.f25671d * 3);
            this.f25674g = fArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22536c(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25675h, 0, (Object) iArr, 0, this.f25671d);
            this.f25675h = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22539d(int i) {
            float[] fArr = new float[(i * 3)];
            C6982a.m36406a((Object) this.f25676i, 0, (Object) fArr, 0, this.f25671d * 3);
            this.f25676i = fArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22541e(int i) {
            float[] fArr = new float[(i * 2)];
            C6982a.m36406a((Object) this.f25677j, 0, (Object) fArr, 0, this.f25671d * 2);
            this.f25677j = fArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo22543f(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25678k, 0, (Object) iArr, 0, this.f25671d);
            this.f25678k = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo22545g(int i) {
            float[] fArr = new float[i];
            C6982a.m36406a((Object) this.f25679l, 0, (Object) fArr, 0, this.f25671d);
            this.f25679l = fArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo22547h(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25682o, 0, (Object) iArr, 0, this.f25671d);
            this.f25682o = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo22549i(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25683p, 0, (Object) iArr, 0, this.f25671d);
            this.f25683p = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo22551j(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25684q, 0, (Object) iArr, 0, this.f25671d);
            this.f25684q = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo22553k(int i) {
            float[] fArr = new float[i];
            C6982a.m36406a((Object) this.f25685r, 0, (Object) fArr, 0, this.f25671d);
            this.f25685r = fArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo22555l(int i) {
            for (String str : this.f25670c.keySet()) {
                C7081n nVar = (C7081n) this.f25670c.get(str);
                if (nVar.f25823d == C7056e.f25144bs) {
                    mo22529a(nVar, i);
                } else if (nVar.f25823d == C7056e.f25141bp) {
                    mo22534b(nVar, i);
                } else if (nVar.f25823d == C7056e.f25145bt) {
                    mo22537c(nVar, i);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22529a(C7081n nVar, int i) {
            float[] fArr = new float[(nVar.f25824e * i)];
            C6982a.m36406a((Object) (float[]) this.f25686s.get(nVar.f25821b), 0, (Object) fArr, 0, nVar.f25824e * this.f25671d);
            this.f25686s.put(nVar.f25821b, fArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22534b(C7081n nVar, int i) {
            int[] iArr = new int[(nVar.f25824e * i)];
            C6982a.m36406a((Object) (int[]) this.f25687t.get(nVar.f25821b), 0, (Object) iArr, 0, nVar.f25824e * this.f25671d);
            this.f25687t.put(nVar.f25821b, iArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22537c(C7081n nVar, int i) {
            byte[] bArr = new byte[(nVar.f25824e * i)];
            C6982a.m36406a((Object) (byte[]) this.f25688u.get(nVar.f25821b), 0, (Object) bArr, 0, nVar.f25824e * this.f25671d);
            this.f25688u.put(nVar.f25821b, bArr);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo22557m(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25680m, 0, (Object) iArr, 0, this.f25672e);
            this.f25680m = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo22559n(int i) {
            int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{i, 3});
            C6982a.m36406a((Object) this.f25681n, 0, (Object) iArr, 0, this.f25673f);
            this.f25681n = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22517a(float f, float f2, int i, boolean z) {
            return mo22515a(f, f2, 0.0f, this.f25689v, this.f25665C, this.f25666D, this.f25667E, 0.0f, 0.0f, this.f25690w, this.f25691x, this.f25692y, this.f25693z, this.f25663A, this.f25664B, i, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22516a(float f, float f2, float f3, int i, boolean z) {
            return mo22515a(f, f2, f3, this.f25689v, this.f25665C, this.f25666D, this.f25667E, 0.0f, 0.0f, this.f25690w, this.f25691x, this.f25692y, this.f25693z, this.f25663A, this.f25664B, i, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22514a(float f, float f2, float f3, float f4, float f5, int i, boolean z) {
            float f6 = f4;
            float f7 = f5;
            int i2 = i;
            boolean z2 = z;
            return mo22515a(f, f2, f3, this.f25689v, this.f25665C, this.f25666D, this.f25667E, f6, f7, this.f25690w, this.f25691x, this.f25692y, this.f25693z, this.f25663A, this.f25664B, i2, z2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22515a(float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, float f8, int i2, float f9, int i3, int i4, int i5, float f10, int i6, boolean z) {
            int i7 = i6;
            mo22535c();
            int i8 = this.f25671d * 3;
            int i9 = i8 + 1;
            this.f25674g[i8] = f;
            int i10 = i9 + 1;
            this.f25674g[i9] = f2;
            this.f25674g[i10] = f3;
            this.f25675h[this.f25671d] = C7056e.m37128j(i);
            int i11 = this.f25671d * 3;
            int i12 = i11 + 1;
            this.f25676i[i11] = f4;
            int i13 = i12 + 1;
            this.f25676i[i12] = f5;
            this.f25676i[i13] = f6;
            int i14 = this.f25671d * 2;
            int i15 = i14 + 1;
            this.f25677j[i14] = f7;
            this.f25677j[i15] = f8;
            this.f25678k[this.f25671d] = C7056e.m37128j(i2);
            this.f25679l[this.f25671d] = f9;
            this.f25682o[this.f25671d] = C7056e.m37128j(i3);
            this.f25683p[this.f25671d] = C7056e.m37128j(i4);
            this.f25684q[this.f25671d] = C7056e.m37128j(i5);
            this.f25685r[this.f25671d] = f10;
            for (String str : this.f25670c.keySet()) {
                C7081n nVar = (C7081n) this.f25670c.get(str);
                int i16 = nVar.f25824e * this.f25671d;
                if (nVar.f25823d == C7056e.f25144bs) {
                    nVar.mo22758a((float[]) this.f25686s.get(str), i16);
                } else if (nVar.f25823d == C7056e.f25141bp) {
                    nVar.mo22759a((int[]) this.f25687t.get(str), i16);
                } else if (nVar.f25823d == C7056e.f25145bt) {
                    nVar.mo22757a((byte[]) this.f25688u.get(str), i16);
                }
            }
            if (z || ((i7 == 0 && this.f25680m != null) || i7 == 1 || i7 == 2 || i7 == 3)) {
                if (this.f25680m == null) {
                    this.f25680m = new int[C6982a.m36420c(C7056e.f25349l, this.f25671d)];
                    Arrays.fill(this.f25680m, 0, this.f25671d, 0);
                    this.f25672e = this.f25671d;
                }
                if (z) {
                    mo22538d();
                    this.f25680m[this.f25672e] = 4;
                    this.f25672e++;
                }
                if (i7 != -1) {
                    mo22538d();
                    this.f25680m[this.f25672e] = i7;
                    this.f25672e++;
                }
            }
            this.f25671d++;
            return this.f25671d - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22519a(int i, int i2, boolean z, boolean z2) {
            mo22540e();
            int[] iArr = this.f25681n[this.f25673f];
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = (z ? 1 : 0) + ((z2 ? 1 : 0) * true);
            this.f25673f++;
            return this.f25673f - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22518a(int i, int i2) {
            mo22540e();
            int[] iArr = this.f25681n[this.f25673f];
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = -1;
            this.f25673f++;
            return this.f25673f - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo22544g() {
            for (int i = 0; i < this.f25671d / 3; i++) {
                int i2 = i * 3;
                int i3 = i2 + 0;
                int i4 = i2 + 1;
                int i5 = i2 + 2;
                mo22519a(i3, i4, true, false);
                mo22519a(i4, i5, false, false);
                mo22519a(i5, i3, false, false);
                mo22518a(i5, i3);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo22546h() {
            int i = 1;
            while (i < this.f25671d - 1) {
                int i2 = i + 1;
                mo22519a(0, i, true, false);
                mo22519a(i, i2, false, false);
                mo22519a(i2, 0, false, false);
                mo22518a(i2, 0);
                i = i2;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo22548i() {
            int i;
            int i2;
            for (int i3 = 1; i3 < this.f25671d - 1; i3++) {
                if (i3 % 2 == 0) {
                    i2 = i3 - 1;
                    i = i3 + 1;
                } else {
                    i2 = i3 + 1;
                    i = i3 - 1;
                }
                mo22519a(i3, i2, true, false);
                mo22519a(i2, i, false, false);
                mo22519a(i, i3, false, false);
                mo22518a(i, i3);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo22550j() {
            for (int i = 0; i < this.f25671d / 4; i++) {
                int i2 = i * 4;
                int i3 = i2 + 0;
                int i4 = i2 + 1;
                int i5 = i2 + 2;
                int i6 = i2 + 3;
                mo22519a(i3, i4, true, false);
                mo22519a(i4, i5, false, false);
                mo22519a(i5, i6, false, false);
                mo22519a(i6, i3, false, false);
                mo22518a(i6, i3);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo22552k() {
            for (int i = 1; i < this.f25671d / 2; i++) {
                int i2 = (i - 1) * 2;
                int i3 = i2 + 1;
                int i4 = i * 2;
                int i5 = i4 + 1;
                mo22519a(i2, i3, true, false);
                mo22519a(i3, i5, false, false);
                mo22519a(i5, i4, false, false);
                mo22519a(i4, i2, false, false);
                mo22518a(i4, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22528a(int i, int i2, int i3) {
            int i4 = i * 3;
            int i5 = i4 + 1;
            float f = this.f25674g[i4];
            int i6 = i5 + 1;
            float f2 = this.f25674g[i5];
            float f3 = this.f25674g[i6];
            int i7 = i2 * 3;
            int i8 = i7 + 1;
            float f4 = this.f25674g[i7];
            int i9 = i8 + 1;
            float f5 = this.f25674g[i8];
            float f6 = this.f25674g[i9];
            int i10 = i3 * 3;
            int i11 = i10 + 1;
            float f7 = this.f25674g[i10];
            int i12 = i10;
            int i13 = i11 + 1;
            int i14 = i11;
            float f8 = f7 - f4;
            float f9 = this.f25674g[i11] - f5;
            float f10 = this.f25674g[i13] - f6;
            float f11 = f - f4;
            float f12 = f2 - f5;
            float f13 = f3 - f6;
            float f14 = (f9 * f13) - (f12 * f10);
            float f15 = (f10 * f11) - (f13 * f8);
            float f16 = (f8 * f12) - (f11 * f9);
            float c = C6982a.m36418c((f14 * f14) + (f15 * f15) + (f16 * f16));
            float f17 = f14 / c;
            float f18 = f15 / c;
            float f19 = f16 / c;
            this.f25676i[i4] = f17;
            this.f25676i[i5] = f18;
            this.f25676i[i6] = f19;
            this.f25676i[i7] = f17;
            this.f25676i[i8] = f18;
            this.f25676i[i9] = f19;
            this.f25676i[i12] = f17;
            this.f25676i[i14] = f18;
            this.f25676i[i13] = f19;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo22554l() {
            for (int i = 0; i < this.f25671d / 3; i++) {
                int i2 = i * 3;
                mo22528a(i2 + 0, i2 + 1, i2 + 2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo22556m() {
            int i = 1;
            while (i < this.f25671d - 1) {
                int i2 = i + 1;
                mo22528a(0, i, i2);
                i = i2;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo22558n() {
            int i;
            int i2;
            for (int i3 = 1; i3 < this.f25671d - 1; i3++) {
                if (i3 % 2 == 1) {
                    i2 = i3 - 1;
                    i = i3 + 1;
                } else {
                    i2 = i3 + 1;
                    i = i3 - 1;
                }
                mo22528a(i2, i3, i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo22560o() {
            for (int i = 0; i < this.f25671d / 4; i++) {
                int i2 = i * 4;
                int i3 = i2 + 0;
                int i4 = i2 + 1;
                int i5 = i2 + 2;
                int i6 = i2 + 3;
                mo22528a(i3, i4, i5);
                mo22528a(i5, i6, i3);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public void mo22561p() {
            for (int i = 1; i < this.f25671d / 2; i++) {
                int i2 = (i - 1) * 2;
                int i3 = i2 + 1;
                int i4 = i * 2;
                int i5 = i4 + 1;
                mo22528a(i2, i3, i4);
                mo22528a(i4, i3, i5);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22527a(int i, int i2, float f, int i3, int i4, int i5, float f2) {
            this.f25689v = i;
            this.f25690w = i2;
            this.f25691x = f;
            this.f25692y = i3;
            this.f25693z = i4;
            this.f25663A = i5;
            this.f25664B = f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22522a(float f, float f2, float f3) {
            this.f25665C = f;
            this.f25666D = f2;
            this.f25667E = f3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22525a(float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2) {
            int a = mo22516a(f, f2, f3, 0, true);
            int a2 = mo22516a(f4, f5, f6, 0, false);
            if (z2) {
                mo22519a(a, a2, true, true);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22524a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z, boolean z2) {
            int a = mo22516a(f, f2, f3, 0, true);
            int a2 = mo22516a(f4, f5, f6, 0, false);
            int a3 = mo22516a(f7, f8, f9, 0, false);
            if (z2) {
                mo22519a(a, a2, true, false);
                mo22519a(a2, a3, false, false);
                mo22519a(a3, a, false, false);
                mo22518a(a3, a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22523a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z) {
            int a = mo22514a(f, f2, f3, 0.0f, 0.0f, 0, true);
            int a2 = mo22514a(f4, f5, f6, 1.0f, 0.0f, 0, false);
            int a3 = mo22514a(f7, f8, f9, 1.0f, 1.0f, 0, false);
            int a4 = mo22514a(f10, f11, f12, 0.0f, 1.0f, 0, false);
            if (z) {
                mo22519a(a, a2, true, false);
                mo22519a(a2, a3, false, false);
                mo22519a(a3, a4, false, false);
                mo22519a(a4, a, false, false);
                mo22518a(a4, a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22526a(float f, float f2, float f3, float f4, boolean z, boolean z2) {
            int i;
            boolean z3;
            float f5 = f;
            float f6 = f2;
            float f7 = f3 / 2.0f;
            float f8 = f4 / 2.0f;
            float f9 = f5 + f7;
            float f10 = f6 + f8;
            float b = this.f25668a.mo21721b(f5, f6);
            float c = this.f25668a.mo21727c(f5, f6);
            float f11 = f5 + f3;
            float f12 = f6 + f4;
            int d = C6982a.m36422d(200, C6982a.m36420c(20, (int) ((C6982a.m36400a(b, c, this.f25668a.mo21721b(f11, f12), this.f25668a.mo21727c(f11, f12)) * 6.2831855f) / 10.0f)));
            float f13 = 720.0f / ((float) d);
            if (z) {
                mo22517a(f9, f10, 0, true);
            }
            int i2 = 0;
            float f14 = 0.0f;
            int i3 = 0;
            int i4 = 0;
            while (i2 < d) {
                int i5 = (int) f14;
                float f15 = f9 + (C7065i.f24598bE[i5] * f7);
                float f16 = (C7065i.f24597bD[i5] * f8) + f10;
                if (i2 != 0 || z) {
                    i = d;
                    z3 = false;
                } else {
                    i = d;
                    z3 = true;
                }
                int a = mo22517a(f15, f16, 0, z3);
                f14 = (f14 + f13) % 720.0f;
                if (i2 <= 0) {
                    i4 = a;
                } else if (z2) {
                    mo22519a(i3, a, i2 == 1, false);
                }
                i2++;
                i3 = a;
                d = i;
            }
            mo22517a(f9 + (C7065i.f24598bE[0] * f7), f10 + (C7065i.f24597bD[0] * f8), 0, false);
            if (z2) {
                mo22519a(i3, i4, false, false);
                mo22518a(i3, i4);
            }
        }
    }

    /* renamed from: e.f.i$j */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7076j {

        /* renamed from: a */
        int f25694a;

        /* renamed from: b */
        int[] f25695b;

        /* renamed from: c */
        int[] f25696c;

        /* renamed from: d */
        int[] f25697d;

        /* renamed from: e */
        int[] f25698e;

        /* renamed from: f */
        int[] f25699f;

        C7076j() {
            mo22562a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22562a() {
            this.f25694a = 0;
            this.f25695b = new int[2];
            this.f25696c = new int[2];
            this.f25697d = new int[2];
            this.f25698e = new int[2];
            this.f25699f = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22566b() {
            this.f25694a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo22568c() {
            mo22572e();
            mo22563a(this.f25694a);
            this.f25694a++;
            return this.f25694a - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo22570d() {
            if (this.f25694a == 0) {
                mo22572e();
                mo22563a(0);
                this.f25694a = 1;
            }
            return this.f25694a - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22565a(int[] iArr) {
            this.f25699f = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22564a(int i, int i2, int i3) {
            int[] iArr = this.f25695b;
            iArr[i] = iArr[i] + i2;
            int[] iArr2 = this.f25697d;
            iArr2[i] = iArr2[i] + i3;
            if (this.f25699f != null) {
                int[] iArr3 = this.f25699f;
                iArr3[0] = iArr3[0] + i2;
                int[] iArr4 = this.f25699f;
                iArr4[1] = iArr4[1] + i3;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22563a(int i) {
            if (i > 0) {
                int i2 = i - 1;
                this.f25696c[i] = this.f25696c[i2] + this.f25695b[i2];
                this.f25698e[i] = this.f25698e[i2] + this.f25697d[i2];
            } else {
                this.f25696c[i] = 0;
                this.f25698e[i] = 0;
            }
            this.f25695b[i] = 0;
            this.f25697d[i] = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22572e() {
            if (this.f25694a == this.f25695b.length) {
                int i = this.f25694a << 1;
                mo22567b(i);
                mo22569c(i);
                mo22571d(i);
                mo22573e(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22567b(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25695b, 0, (Object) iArr, 0, this.f25694a);
            this.f25695b = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22569c(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25696c, 0, (Object) iArr, 0, this.f25694a);
            this.f25696c = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22571d(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25697d, 0, (Object) iArr, 0, this.f25694a);
            this.f25697d = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22573e(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25698e, 0, (Object) iArr, 0, this.f25694a);
            this.f25698e = iArr;
        }
    }

    /* renamed from: e.f.i$k */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7077k {

        /* renamed from: A */
        int f25700A;

        /* renamed from: B */
        int f25701B;

        /* renamed from: C */
        int f25702C;

        /* renamed from: D */
        ShortBuffer f25703D;

        /* renamed from: E */
        C7076j f25704E = new C7076j();

        /* renamed from: F */
        int f25705F;

        /* renamed from: G */
        int f25706G;

        /* renamed from: H */
        int f25707H;

        /* renamed from: I */
        FloatBuffer f25708I;

        /* renamed from: J */
        IntBuffer f25709J;

        /* renamed from: K */
        FloatBuffer f25710K;

        /* renamed from: L */
        int f25711L;

        /* renamed from: M */
        int f25712M;

        /* renamed from: N */
        int f25713N;

        /* renamed from: O */
        ShortBuffer f25714O;

        /* renamed from: P */
        C7076j f25715P = new C7076j();

        /* renamed from: Q */
        float[] f25716Q;

        /* renamed from: R */
        int[] f25717R;

        /* renamed from: S */
        float[] f25718S;

        /* renamed from: T */
        float[] f25719T;

        /* renamed from: U */
        int[] f25720U;

        /* renamed from: V */
        int[] f25721V;

        /* renamed from: W */
        int[] f25722W;

        /* renamed from: X */
        float[] f25723X;

        /* renamed from: Y */
        short[] f25724Y;

        /* renamed from: Z */
        float[] f25725Z;

        /* renamed from: a */
        int f25726a;

        /* renamed from: aa */
        int[] f25727aa;

        /* renamed from: ab */
        float[] f25728ab;

        /* renamed from: ac */
        short[] f25729ac;

        /* renamed from: ad */
        float[] f25730ad;

        /* renamed from: ae */
        int[] f25731ae;

        /* renamed from: af */
        float[] f25732af;

        /* renamed from: ag */
        short[] f25733ag;

        /* renamed from: ah */
        HashMap<String, float[]> f25734ah = new HashMap<>();

        /* renamed from: ai */
        HashMap<String, int[]> f25735ai = new HashMap<>();

        /* renamed from: aj */
        HashMap<String, byte[]> f25736aj = new HashMap<>();

        /* renamed from: b */
        C7065i f25737b;

        /* renamed from: c */
        C7068b f25738c;

        /* renamed from: d */
        int f25739d;

        /* renamed from: e */
        int f25740e;

        /* renamed from: f */
        int f25741f;

        /* renamed from: g */
        FloatBuffer f25742g;

        /* renamed from: h */
        IntBuffer f25743h;

        /* renamed from: i */
        FloatBuffer f25744i;

        /* renamed from: j */
        FloatBuffer f25745j;

        /* renamed from: k */
        IntBuffer f25746k;

        /* renamed from: l */
        IntBuffer f25747l;

        /* renamed from: m */
        IntBuffer f25748m;

        /* renamed from: n */
        FloatBuffer f25749n;

        /* renamed from: o */
        HashMap<String, Buffer> f25750o = new HashMap<>();

        /* renamed from: p */
        int f25751p;

        /* renamed from: q */
        int f25752q;

        /* renamed from: r */
        int f25753r;

        /* renamed from: s */
        ShortBuffer f25754s;

        /* renamed from: t */
        C7076j f25755t = new C7076j();

        /* renamed from: u */
        int f25756u;

        /* renamed from: v */
        int f25757v;

        /* renamed from: w */
        int f25758w;

        /* renamed from: x */
        FloatBuffer f25759x;

        /* renamed from: y */
        IntBuffer f25760y;

        /* renamed from: z */
        FloatBuffer f25761z;

        C7077k(C7065i iVar, C7068b bVar, int i) {
            this.f25737b = iVar;
            this.f25738c = bVar;
            this.f25726a = i;
            mo22574a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22574a() {
            this.f25716Q = new float[(C7056e.f25352o * 4)];
            this.f25717R = new int[C7056e.f25352o];
            this.f25718S = new float[(C7056e.f25352o * 3)];
            this.f25719T = new float[(C7056e.f25352o * 2)];
            this.f25720U = new int[C7056e.f25352o];
            this.f25721V = new int[C7056e.f25352o];
            this.f25722W = new int[C7056e.f25352o];
            this.f25723X = new float[C7056e.f25352o];
            this.f25724Y = new short[C7056e.f25352o];
            this.f25725Z = new float[(C7056e.f25352o * 4)];
            this.f25727aa = new int[C7056e.f25352o];
            this.f25728ab = new float[(C7056e.f25352o * 4)];
            this.f25729ac = new short[C7056e.f25352o];
            this.f25730ad = new float[(C7056e.f25352o * 4)];
            this.f25731ae = new int[C7056e.f25352o];
            this.f25732af = new float[(C7056e.f25352o * 2)];
            this.f25733ag = new short[C7056e.f25352o];
            this.f25742g = C7056e.m37106a(this.f25716Q);
            this.f25743h = C7056e.m37108a(this.f25717R);
            this.f25744i = C7056e.m37106a(this.f25718S);
            this.f25745j = C7056e.m37106a(this.f25719T);
            this.f25746k = C7056e.m37108a(this.f25720U);
            this.f25747l = C7056e.m37108a(this.f25721V);
            this.f25748m = C7056e.m37108a(this.f25722W);
            this.f25749n = C7056e.m37106a(this.f25723X);
            this.f25754s = C7056e.m37109a(this.f25724Y);
            this.f25759x = C7056e.m37106a(this.f25725Z);
            this.f25760y = C7056e.m37108a(this.f25727aa);
            this.f25761z = C7056e.m37106a(this.f25728ab);
            this.f25703D = C7056e.m37109a(this.f25729ac);
            this.f25708I = C7056e.m37106a(this.f25730ad);
            this.f25709J = C7056e.m37108a(this.f25731ae);
            this.f25710K = C7056e.m37106a(this.f25732af);
            this.f25714O = C7056e.m37109a(this.f25733ag);
            mo22590b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22590b() {
            this.f25739d = 0;
            this.f25741f = 0;
            this.f25740e = 0;
            this.f25751p = 0;
            this.f25753r = 0;
            this.f25752q = 0;
            this.f25756u = 0;
            this.f25758w = 0;
            this.f25757v = 0;
            this.f25700A = 0;
            this.f25702C = 0;
            this.f25701B = 0;
            this.f25705F = 0;
            this.f25707H = 0;
            this.f25706G = 0;
            this.f25711L = 0;
            this.f25713N = 0;
            this.f25712M = 0;
            this.f25755t.mo22566b();
            this.f25704E.mo22566b();
            this.f25715P.mo22566b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22594c() {
            if (this.f25739d == this.f25716Q.length / 4) {
                int i = this.f25739d << 1;
                mo22608g(i);
                mo22611h(i);
                mo22614i(i);
                mo22617j(i);
                mo22620k(i);
                mo22623l(i);
                mo22626m(i);
                mo22629n(i);
                mo22632o(i);
            }
            this.f25740e = this.f25739d;
            this.f25739d++;
            this.f25741f = this.f25739d - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22576a(int i) {
            int length = this.f25716Q.length / 4;
            if (this.f25739d + i > length) {
                int f = C7065i.m37501f(length, this.f25739d + i);
                mo22608g(f);
                mo22611h(f);
                mo22614i(f);
                mo22617j(f);
                mo22620k(f);
                mo22623l(f);
                mo22626m(f);
                mo22629n(f);
                mo22632o(f);
            }
            this.f25740e = this.f25739d;
            this.f25739d += i;
            this.f25741f = this.f25739d - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22591b(int i) {
            int length = this.f25724Y.length;
            if (this.f25751p + i > length) {
                mo22635p(C7065i.m37501f(length, this.f25751p + i));
            }
            this.f25752q = this.f25751p;
            this.f25751p += i;
            this.f25753r = this.f25751p - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22598d() {
            if (this.f25751p == this.f25724Y.length) {
                mo22635p(this.f25751p << 1);
            }
            this.f25752q = this.f25751p;
            this.f25751p++;
            this.f25753r = this.f25751p - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22595c(int i) {
            int length = this.f25725Z.length / 4;
            if (this.f25756u + i > length) {
                int f = C7065i.m37501f(length, this.f25756u + i);
                mo22638q(f);
                mo22641r(f);
                mo22643s(f);
            }
            this.f25757v = this.f25756u;
            this.f25756u += i;
            this.f25758w = this.f25756u - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22599d(int i) {
            int length = this.f25729ac.length;
            if (this.f25700A + i > length) {
                mo22645t(C7065i.m37501f(length, this.f25700A + i));
            }
            this.f25701B = this.f25700A;
            this.f25700A += i;
            this.f25702C = this.f25700A - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22601e(int i) {
            int length = this.f25730ad.length / 4;
            if (this.f25705F + i > length) {
                int f = C7065i.m37501f(length, this.f25705F + i);
                mo22647u(f);
                mo22649v(f);
                mo22650w(f);
            }
            this.f25706G = this.f25705F;
            this.f25705F += i;
            this.f25707H = this.f25705F - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo22605f(int i) {
            int length = this.f25733ag.length;
            if (this.f25711L + i > length) {
                mo22651x(C7065i.m37501f(length, this.f25711L + i));
            }
            this.f25712M = this.f25711L;
            this.f25711L += i;
            this.f25713N = this.f25711L - 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo22603e() {
            return C7056e.f25357t <= this.f25739d || C7056e.f25357t <= this.f25756u || C7056e.f25357t <= this.f25705F;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo22604f() {
            mo22579a(0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22579a(int i, int i2) {
            C7056e.m37112a(this.f25742g, this.f25716Q, i * 4, i2 * 4);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo22607g() {
            mo22592b(0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo22592b(int i, int i2) {
            C7056e.m37115a(this.f25743h, this.f25717R, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo22610h() {
            mo22596c(0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo22596c(int i, int i2) {
            C7056e.m37112a(this.f25744i, this.f25718S, i * 3, i2 * 3);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo22613i() {
            mo22600d(0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo22600d(int i, int i2) {
            C7056e.m37112a(this.f25745j, this.f25719T, i * 2, i2 * 2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo22616j() {
            mo22602e(0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo22602e(int i, int i2) {
            C7056e.m37115a(this.f25746k, this.f25720U, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo22619k() {
            mo22606f(0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo22606f(int i, int i2) {
            C7056e.m37115a(this.f25747l, this.f25721V, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo22622l() {
            mo22609g(0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo22609g(int i, int i2) {
            C7056e.m37115a(this.f25748m, this.f25722W, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo22625m() {
            mo22612h(0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo22612h(int i, int i2) {
            C7056e.m37112a(this.f25749n, this.f25723X, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22587a(String str) {
            mo22588a(str, 0, this.f25739d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22588a(String str, int i, int i2) {
            C7081n nVar = (C7081n) this.f25738c.get(str);
            if (nVar.f25823d == C7056e.f25144bs) {
                C7056e.m37112a((FloatBuffer) this.f25750o.get(str), (float[]) this.f25734ah.get(str), nVar.f25825f * i, nVar.f25825f * i2);
            } else if (nVar.f25823d == C7056e.f25141bp) {
                C7056e.m37115a((IntBuffer) this.f25750o.get(str), (int[]) this.f25735ai.get(str), nVar.f25825f * i, nVar.f25825f * i2);
            } else if (nVar.f25823d == C7056e.f25145bt) {
                C7056e.m37110a((ByteBuffer) this.f25750o.get(str), (byte[]) this.f25736aj.get(str), nVar.f25825f * i, nVar.f25825f * i2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo22628n() {
            mo22615i(0, this.f25751p);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo22615i(int i, int i2) {
            C7056e.m37116a(this.f25754s, this.f25724Y, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo22631o() {
            mo22618j(0, this.f25756u);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo22618j(int i, int i2) {
            C7056e.m37112a(this.f25759x, this.f25725Z, i * 4, i2 * 4);
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22634p() {
            mo22621k(0, this.f25756u);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo22621k(int i, int i2) {
            C7056e.m37115a(this.f25760y, this.f25727aa, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo22637q() {
            mo22624l(0, this.f25756u);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo22624l(int i, int i2) {
            C7056e.m37112a(this.f25761z, this.f25728ab, i * 4, i2 * 4);
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo22640r() {
            mo22627m(0, this.f25700A);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo22627m(int i, int i2) {
            C7056e.m37116a(this.f25703D, this.f25729ac, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public void mo22642s() {
            mo22630n(0, this.f25705F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo22630n(int i, int i2) {
            C7056e.m37112a(this.f25708I, this.f25730ad, i * 4, i2 * 4);
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo22644t() {
            mo22633o(0, this.f25705F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo22633o(int i, int i2) {
            C7056e.m37115a(this.f25709J, this.f25731ae, i, i2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public void mo22646u() {
            mo22636p(0, this.f25705F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public void mo22636p(int i, int i2) {
            C7056e.m37112a(this.f25710K, this.f25732af, i * 2, i2 * 2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo22648v() {
            mo22639q(0, this.f25711L);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void mo22639q(int i, int i2) {
            C7056e.m37116a(this.f25714O, this.f25733ag, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo22608g(int i) {
            float[] fArr = new float[(i * 4)];
            C6982a.m36406a((Object) this.f25716Q, 0, (Object) fArr, 0, this.f25739d * 4);
            this.f25716Q = fArr;
            this.f25742g = C7056e.m37106a(this.f25716Q);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo22611h(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25717R, 0, (Object) iArr, 0, this.f25739d);
            this.f25717R = iArr;
            this.f25743h = C7056e.m37108a(this.f25717R);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo22614i(int i) {
            float[] fArr = new float[(i * 3)];
            C6982a.m36406a((Object) this.f25718S, 0, (Object) fArr, 0, this.f25739d * 3);
            this.f25718S = fArr;
            this.f25744i = C7056e.m37106a(this.f25718S);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo22617j(int i) {
            float[] fArr = new float[(i * 2)];
            C6982a.m36406a((Object) this.f25719T, 0, (Object) fArr, 0, this.f25739d * 2);
            this.f25719T = fArr;
            this.f25745j = C7056e.m37106a(this.f25719T);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo22620k(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25720U, 0, (Object) iArr, 0, this.f25739d);
            this.f25720U = iArr;
            this.f25746k = C7056e.m37108a(this.f25720U);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo22623l(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25721V, 0, (Object) iArr, 0, this.f25739d);
            this.f25721V = iArr;
            this.f25747l = C7056e.m37108a(this.f25721V);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo22626m(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25722W, 0, (Object) iArr, 0, this.f25739d);
            this.f25722W = iArr;
            this.f25748m = C7056e.m37108a(this.f25722W);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo22629n(int i) {
            float[] fArr = new float[i];
            C6982a.m36406a((Object) this.f25723X, 0, (Object) fArr, 0, this.f25739d);
            this.f25723X = fArr;
            this.f25749n = C7056e.m37106a(this.f25723X);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public void mo22632o(int i) {
            for (String str : this.f25738c.keySet()) {
                C7081n nVar = (C7081n) this.f25738c.get(str);
                if (nVar.f25823d == C7056e.f25144bs) {
                    mo22586a(nVar, i);
                } else if (nVar.f25823d == C7056e.f25141bp) {
                    mo22593b(nVar, i);
                } else if (nVar.f25823d == C7056e.f25145bt) {
                    mo22597c(nVar, i);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22586a(C7081n nVar, int i) {
            float[] fArr = new float[(nVar.f25825f * i)];
            C6982a.m36406a((Object) (float[]) this.f25734ah.get(nVar.f25821b), 0, (Object) fArr, 0, nVar.f25825f * this.f25739d);
            this.f25734ah.put(nVar.f25821b, fArr);
            this.f25750o.put(nVar.f25821b, C7056e.m37106a(fArr));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22593b(C7081n nVar, int i) {
            int[] iArr = new int[(nVar.f25825f * i)];
            C6982a.m36406a((Object) (int[]) this.f25735ai.get(nVar.f25821b), 0, (Object) iArr, 0, nVar.f25825f * this.f25739d);
            this.f25735ai.put(nVar.f25821b, iArr);
            this.f25750o.put(nVar.f25821b, C7056e.m37108a(iArr));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22597c(C7081n nVar, int i) {
            byte[] bArr = new byte[(nVar.f25825f * i)];
            C6982a.m36406a((Object) (byte[]) this.f25736aj.get(nVar.f25821b), 0, (Object) bArr, 0, nVar.f25825f * this.f25739d);
            this.f25736aj.put(nVar.f25821b, bArr);
            this.f25750o.put(nVar.f25821b, C7056e.m37104a(bArr));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public void mo22635p(int i) {
            short[] sArr = new short[i];
            C6982a.m36406a((Object) this.f25724Y, 0, (Object) sArr, 0, this.f25751p);
            this.f25724Y = sArr;
            this.f25754s = C7056e.m37109a(this.f25724Y);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public void mo22638q(int i) {
            float[] fArr = new float[(i * 4)];
            C6982a.m36406a((Object) this.f25725Z, 0, (Object) fArr, 0, this.f25756u * 4);
            this.f25725Z = fArr;
            this.f25759x = C7056e.m37106a(this.f25725Z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public void mo22641r(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25727aa, 0, (Object) iArr, 0, this.f25756u);
            this.f25727aa = iArr;
            this.f25760y = C7056e.m37108a(this.f25727aa);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public void mo22643s(int i) {
            float[] fArr = new float[(i * 4)];
            C6982a.m36406a((Object) this.f25728ab, 0, (Object) fArr, 0, this.f25756u * 4);
            this.f25728ab = fArr;
            this.f25761z = C7056e.m37106a(this.f25728ab);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public void mo22645t(int i) {
            short[] sArr = new short[i];
            C6982a.m36406a((Object) this.f25729ac, 0, (Object) sArr, 0, this.f25700A);
            this.f25729ac = sArr;
            this.f25703D = C7056e.m37109a(this.f25729ac);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public void mo22647u(int i) {
            float[] fArr = new float[(i * 4)];
            C6982a.m36406a((Object) this.f25730ad, 0, (Object) fArr, 0, this.f25705F * 4);
            this.f25730ad = fArr;
            this.f25708I = C7056e.m37106a(this.f25730ad);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo22649v(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25731ae, 0, (Object) iArr, 0, this.f25705F);
            this.f25731ae = iArr;
            this.f25709J = C7056e.m37108a(this.f25731ae);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public void mo22650w(int i) {
            float[] fArr = new float[(i * 2)];
            C6982a.m36406a((Object) this.f25732af, 0, (Object) fArr, 0, this.f25705F * 2);
            this.f25732af = fArr;
            this.f25710K = C7056e.m37106a(this.f25732af);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public void mo22651x(int i) {
            short[] sArr = new short[i];
            C6982a.m36406a((Object) this.f25733ag, 0, (Object) sArr, 0, this.f25711L);
            this.f25733ag = sArr;
            this.f25714O = C7056e.m37109a(this.f25733ag);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22580a(int i, int i2, int i3) {
            int i4 = i * 4;
            int i5 = i4 + 1;
            float f = this.f25716Q[i4];
            int i6 = i5 + 1;
            float f2 = this.f25716Q[i5];
            float f3 = this.f25716Q[i6];
            int i7 = i2 * 4;
            int i8 = i7 + 1;
            float f4 = this.f25716Q[i7];
            int i9 = i8 + 1;
            float f5 = this.f25716Q[i8];
            float f6 = this.f25716Q[i9];
            int i10 = i3 * 4;
            int i11 = i10 + 1;
            float f7 = this.f25716Q[i10];
            int i12 = i11 + 1;
            float f8 = f7 - f4;
            float f9 = this.f25716Q[i11] - f5;
            float f10 = this.f25716Q[i12] - f6;
            float f11 = f - f4;
            float f12 = f2 - f5;
            float f13 = f3 - f6;
            float f14 = (f9 * f13) - (f12 * f10);
            float f15 = (f10 * f11) - (f13 * f8);
            float f16 = (f8 * f12) - (f11 * f9);
            float c = C6982a.m36418c((f14 * f14) + (f15 * f15) + (f16 * f16));
            float f17 = f14 / c;
            float f18 = f15 / c;
            float f19 = f16 / c;
            int i13 = i * 3;
            int i14 = i13 + 1;
            this.f25718S[i13] = f17;
            int i15 = i14 + 1;
            this.f25718S[i14] = f18;
            this.f25718S[i15] = f19;
            int i16 = i2 * 3;
            int i17 = i16 + 1;
            this.f25718S[i16] = f17;
            int i18 = i17 + 1;
            this.f25718S[i17] = f18;
            this.f25718S[i18] = f19;
            int i19 = i3 * 3;
            int i20 = i19 + 1;
            this.f25718S[i19] = f17;
            int i21 = i20 + 1;
            this.f25718S[i20] = f18;
            this.f25718S[i21] = f19;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22581a(int i, C7075i iVar, int i2) {
            int i3 = i2 * 3;
            int i4 = i3 + 1;
            float f = iVar.f25674g[i3];
            int i5 = i4 + 1;
            float f2 = iVar.f25674g[i4];
            float f3 = iVar.f25674g[i5];
            if (this.f25726a == 0 && this.f25737b.f25549e == 1) {
                C6995g gVar = this.f25737b.f25527dU;
                int i6 = i * 4;
                int i7 = i6 + 1;
                this.f25730ad[i6] = (gVar.f24769a * f) + (gVar.f24770b * f2) + (gVar.f24771c * f3) + gVar.f24772d;
                int i8 = i7 + 1;
                this.f25730ad[i7] = (gVar.f24773e * f) + (gVar.f24774f * f2) + (gVar.f24775g * f3) + gVar.f24776h;
                int i9 = i8 + 1;
                this.f25730ad[i8] = (gVar.f24777i * f) + (gVar.f24778j * f2) + (gVar.f24779k * f3) + gVar.f24780l;
                this.f25730ad[i9] = (f * gVar.f24781m) + (f2 * gVar.f24782n) + (f3 * gVar.f24783o) + gVar.f24784p;
            } else {
                int i10 = i * 4;
                int i11 = i10 + 1;
                this.f25730ad[i10] = f;
                int i12 = i11 + 1;
                this.f25730ad[i11] = f2;
                int i13 = i12 + 1;
                this.f25730ad[i12] = f3;
                this.f25730ad[i13] = 1.0f;
            }
            this.f25731ae[i] = iVar.f25678k[i2];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22582a(int i, float[] fArr, int i2, int i3) {
            int i4 = i2 * 3;
            int i5 = i4 + 1;
            float f = fArr[i4];
            int i6 = i5 + 1;
            float f2 = fArr[i5];
            float f3 = fArr[i6];
            if (this.f25726a == 0 && this.f25737b.f25549e == 1) {
                C6995g gVar = this.f25737b.f25527dU;
                int i7 = i * 4;
                int i8 = i7 + 1;
                this.f25725Z[i7] = (gVar.f24769a * f) + (gVar.f24770b * f2) + (gVar.f24771c * f3) + gVar.f24772d;
                int i9 = i8 + 1;
                this.f25725Z[i8] = (gVar.f24773e * f) + (gVar.f24774f * f2) + (gVar.f24775g * f3) + gVar.f24776h;
                int i10 = i9 + 1;
                this.f25725Z[i9] = (gVar.f24777i * f) + (gVar.f24778j * f2) + (gVar.f24779k * f3) + gVar.f24780l;
                this.f25725Z[i10] = (f * gVar.f24781m) + (f2 * gVar.f24782n) + (f3 * gVar.f24783o) + gVar.f24784p;
            } else {
                int i11 = i * 4;
                int i12 = i11 + 1;
                this.f25725Z[i11] = f;
                int i13 = i12 + 1;
                this.f25725Z[i12] = f2;
                int i14 = i13 + 1;
                this.f25725Z[i13] = f3;
                this.f25725Z[i14] = 1.0f;
            }
            this.f25727aa[i] = i3;
            int i15 = i * 4;
            int i16 = i15 + 1;
            this.f25728ab[i15] = 0.0f;
            int i17 = i16 + 1;
            this.f25728ab[i16] = 0.0f;
            int i18 = i17 + 1;
            this.f25728ab[i17] = 0.0f;
            this.f25728ab[i18] = 0.0f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22583a(int i, float[] fArr, int i2, int i3, int i4, float f) {
            int i5 = i2 * 3;
            int i6 = i5 + 1;
            float f2 = fArr[i5];
            int i7 = i6 + 1;
            float f3 = fArr[i6];
            float f4 = fArr[i7];
            int i8 = i3 * 3;
            int i9 = i8 + 1;
            float f5 = fArr[i8];
            int i10 = i9 + 1;
            float f6 = f5 - f2;
            float f7 = fArr[i9] - f3;
            float f8 = fArr[i10] - f4;
            if (this.f25726a == 0 && this.f25737b.f25549e == 1) {
                C6995g gVar = this.f25737b.f25527dU;
                int i11 = i * 4;
                int i12 = i11 + 1;
                this.f25725Z[i11] = (gVar.f24769a * f2) + (gVar.f24770b * f3) + (gVar.f24771c * f4) + gVar.f24772d;
                int i13 = i12 + 1;
                this.f25725Z[i12] = (gVar.f24773e * f2) + (gVar.f24774f * f3) + (gVar.f24775g * f4) + gVar.f24776h;
                int i14 = i13 + 1;
                this.f25725Z[i13] = (gVar.f24777i * f2) + (gVar.f24778j * f3) + (gVar.f24779k * f4) + gVar.f24780l;
                this.f25725Z[i14] = (f2 * gVar.f24781m) + (f3 * gVar.f24782n) + (f4 * gVar.f24783o) + gVar.f24784p;
                this.f25728ab[i11] = (gVar.f24769a * f6) + (gVar.f24770b * f7) + (gVar.f24771c * f8);
                this.f25728ab[i12] = (gVar.f24773e * f6) + (gVar.f24774f * f7) + (gVar.f24775g * f8);
                this.f25728ab[i13] = (f6 * gVar.f24777i) + (f7 * gVar.f24778j) + (f8 * gVar.f24779k);
            } else {
                int i15 = i * 4;
                int i16 = i15 + 1;
                this.f25725Z[i15] = f2;
                int i17 = i16 + 1;
                this.f25725Z[i16] = f3;
                int i18 = i17 + 1;
                this.f25725Z[i17] = f4;
                this.f25725Z[i18] = 1.0f;
                this.f25728ab[i15] = f6;
                this.f25728ab[i16] = f7;
                this.f25728ab[i17] = f8;
            }
            this.f25727aa[i] = i4;
            this.f25728ab[(i * 4) + 3] = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22589a(double[] dArr, boolean z) {
            int i;
            int i2;
            double[] dArr2 = dArr;
            float f = (float) dArr2[0];
            float f2 = (float) dArr2[1];
            float f3 = (float) dArr2[2];
            float f4 = (float) dArr2[7];
            float f5 = (float) dArr2[8];
            float f6 = (float) dArr2[9];
            float f7 = (float) dArr2[10];
            float f8 = (float) dArr2[11];
            double[] dArr3 = dArr2;
            mo22575a(f, f2, f3, (((int) dArr2[3]) << 24) | (((int) dArr2[4]) << 16) | (((int) dArr2[5]) << 8) | ((int) dArr2[6]), f4, f5, f6, f7, f8, (((int) dArr2[12]) << 24) | (((int) dArr2[13]) << 16) | (((int) dArr2[14]) << 8) | ((int) dArr2[15]), (((int) dArr2[16]) << 24) | (((int) dArr2[17]) << 16) | (((int) dArr2[18]) << 8) | ((int) dArr2[19]), (((int) dArr2[20]) << 24) | (((int) dArr2[21]) << 16) | (((int) dArr2[22]) << 8) | ((int) dArr2[23]), (float) dArr2[24], z);
            if (25 < dArr3.length) {
                double[] dArr4 = dArr3;
                C6995g gVar = this.f25737b.f25527dU;
                C6995g gVar2 = this.f25737b.f25528dV;
                int i3 = 1;
                int i4 = this.f25739d - 1;
                int i5 = 0;
                int i6 = 25;
                while (i5 < this.f25738c.size()) {
                    C7081n a = this.f25738c.mo22498a(i5);
                    String str = a.f25821b;
                    int i7 = a.f25825f * i4;
                    if (a.mo22765c()) {
                        ((int[]) this.f25735ai.get(str))[i7] = (((int) dArr4[i6 + 0]) << 24) | (((int) dArr4[i6 + 1]) << 16) | (((int) dArr4[i6 + 2]) << 8) | ((int) dArr4[i6 + 3]);
                        i6 += 4;
                    } else if (a.mo22760a()) {
                        float[] fArr = (float[]) this.f25734ah.get(str);
                        int i8 = i6 + 1;
                        float f9 = (float) dArr4[i6];
                        int i9 = i8 + 1;
                        float f10 = (float) dArr4[i8];
                        int i10 = i9 + 1;
                        float f11 = (float) dArr4[i9];
                        if (this.f25726a == 0 && this.f25737b.f25549e == i3) {
                            if (z) {
                                int i11 = i7 + 1;
                                fArr[i7] = (float) C6982a.m36424f((gVar.f24769a * f9) + (gVar.f24770b * f10) + (gVar.f24771c * f11) + gVar.f24772d);
                                i2 = i11 + 1;
                                fArr[i11] = (float) C6982a.m36424f((gVar.f24773e * f9) + (gVar.f24774f * f10) + (gVar.f24775g * f11) + gVar.f24776h);
                            } else {
                                int i12 = i7 + 1;
                                fArr[i7] = (gVar.f24769a * f9) + (gVar.f24770b * f10) + (gVar.f24771c * f11) + gVar.f24772d;
                                int i13 = i12 + 1;
                                fArr[i12] = (gVar.f24773e * f9) + (gVar.f24774f * f10) + (gVar.f24775g * f11) + gVar.f24776h;
                                i2 = i13;
                            }
                            int i14 = i2 + 1;
                            fArr[i2] = (gVar.f24777i * f9) + (gVar.f24778j * f10) + (gVar.f24779k * f11) + gVar.f24780l;
                            fArr[i14] = (f9 * gVar.f24781m) + (f10 * gVar.f24782n) + (f11 * gVar.f24783o) + gVar.f24784p;
                        } else {
                            int i15 = i7 + 1;
                            fArr[i7] = f9;
                            int i16 = i15 + 1;
                            fArr[i15] = f10;
                            int i17 = i16 + 1;
                            fArr[i16] = f11;
                            fArr[i17] = 1.0f;
                        }
                        i6 = i10;
                    } else if (a.mo22763b()) {
                        float[] fArr2 = (float[]) this.f25734ah.get(str);
                        float f12 = (float) dArr4[i6 + 0];
                        float f13 = (float) dArr4[i6 + 1];
                        float f14 = (float) dArr4[i6 + 2];
                        if (this.f25726a == 0 && this.f25737b.f25549e == 1) {
                            int i18 = i7 + 1;
                            fArr2[i7] = (gVar2.f24769a * f12) + (gVar2.f24773e * f13) + (gVar2.f24777i * f14);
                            int i19 = i18 + 1;
                            fArr2[i18] = (gVar2.f24770b * f12) + (gVar2.f24774f * f13) + (gVar2.f24778j * f14);
                            fArr2[i19] = (f12 * gVar2.f24771c) + (f13 * gVar2.f24775g) + (f14 * gVar2.f24779k);
                        } else {
                            int i20 = i7 + 1;
                            fArr2[i7] = f12;
                            int i21 = i20 + 1;
                            fArr2[i20] = f13;
                            fArr2[i21] = f14;
                        }
                        i6 += 3;
                    } else {
                        if (a.mo22767e()) {
                            float[] fArr3 = (float[]) this.f25734ah.get(str);
                            i = i6;
                            int i22 = 0;
                            while (i22 < a.f25824e) {
                                int i23 = i7 + 1;
                                int i24 = i + 1;
                                fArr3[i7] = (float) dArr4[i];
                                i22++;
                                i7 = i23;
                                i = i24;
                            }
                        } else if (a.mo22768f()) {
                            int[] iArr = (int[]) this.f25735ai.get(str);
                            int i25 = i6;
                            int i26 = 0;
                            while (i26 < a.f25824e) {
                                int i27 = i7 + 1;
                                int i28 = i + 1;
                                iArr[i7] = (int) dArr4[i];
                                i26++;
                                i7 = i27;
                                i25 = i28;
                            }
                        } else if (a.mo22769g()) {
                            byte[] bArr = (byte[]) this.f25736aj.get(str);
                            int i29 = i6;
                            int i30 = 0;
                            while (i30 < a.f25824e) {
                                int i31 = i7 + 1;
                                int i32 = i + 1;
                                bArr[i7] = (byte) ((int) dArr4[i]);
                                i30++;
                                i7 = i31;
                                i29 = i32;
                            }
                        } else {
                            i = i6;
                        }
                        i6 = i + a.f25824e;
                    }
                    i5++;
                    i3 = 1;
                }
                return;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22575a(float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, float f8, int i2, int i3, int i4, float f9, boolean z) {
            mo22594c();
            mo22577a(this.f25739d - 1, f, f2, f3, i, f4, f5, f6, f7, f8, i2, i3, i4, f9, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22578a(int i, float f, float f2, float f3, int i2, boolean z) {
            mo22577a(i, f, f2, f3, i2, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0, 0, 0, 0.0f, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22577a(int i, float f, float f2, float f3, int i2, float f4, float f5, float f6, float f7, float f8, int i3, int i4, int i5, float f9, boolean z) {
            int i6;
            if (this.f25726a == 0 && this.f25737b.f25549e == 1) {
                C6995g gVar = this.f25737b.f25527dU;
                C6995g gVar2 = this.f25737b.f25528dV;
                int i7 = i * 4;
                if (z) {
                    int i8 = i7 + 1;
                    this.f25716Q[i7] = (float) C6982a.m36424f((gVar.f24769a * f) + (gVar.f24770b * f2) + (gVar.f24771c * f3) + gVar.f24772d);
                    i6 = i8 + 1;
                    this.f25716Q[i8] = (float) C6982a.m36424f((gVar.f24773e * f) + (gVar.f24774f * f2) + (gVar.f24775g * f3) + gVar.f24776h);
                } else {
                    int i9 = i7 + 1;
                    this.f25716Q[i7] = (gVar.f24769a * f) + (gVar.f24770b * f2) + (gVar.f24771c * f3) + gVar.f24772d;
                    i6 = i9 + 1;
                    this.f25716Q[i9] = (gVar.f24773e * f) + (gVar.f24774f * f2) + (gVar.f24775g * f3) + gVar.f24776h;
                }
                int i10 = i6 + 1;
                this.f25716Q[i6] = (gVar.f24777i * f) + (gVar.f24778j * f2) + (gVar.f24779k * f3) + gVar.f24780l;
                this.f25716Q[i10] = (f * gVar.f24781m) + (f2 * gVar.f24782n) + (gVar.f24783o * f3) + gVar.f24784p;
                int i11 = i * 3;
                int i12 = i11 + 1;
                this.f25718S[i11] = (gVar2.f24769a * f4) + (gVar2.f24773e * f5) + (gVar2.f24777i * f6);
                int i13 = i12 + 1;
                this.f25718S[i12] = (gVar2.f24770b * f4) + (gVar2.f24774f * f5) + (gVar2.f24778j * f6);
                this.f25718S[i13] = (gVar2.f24771c * f4) + (gVar2.f24775g * f5) + (gVar2.f24779k * f6);
            } else {
                int i14 = i * 4;
                int i15 = i14 + 1;
                this.f25716Q[i14] = f;
                int i16 = i15 + 1;
                this.f25716Q[i15] = f2;
                int i17 = i16 + 1;
                this.f25716Q[i16] = f3;
                this.f25716Q[i17] = 1.0f;
                int i18 = i * 3;
                int i19 = i18 + 1;
                this.f25718S[i18] = f4;
                int i20 = i19 + 1;
                this.f25718S[i19] = f5;
                this.f25718S[i20] = f6;
            }
            this.f25717R[i] = i2;
            int i21 = i * 2;
            int i22 = i21 + 1;
            this.f25719T[i21] = f7;
            this.f25719T[i22] = f8;
            this.f25720U[i] = i3;
            this.f25721V[i] = i4;
            this.f25722W[i] = i5;
            this.f25723X[i] = f9;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22585a(C7075i iVar, int i, boolean z) {
            mo22584a(iVar, i, i, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22584a(C7075i iVar, int i, int i2, boolean z) {
            int i3 = (i2 - i) + 1;
            mo22576a(i3);
            if (this.f25726a == 0 && this.f25737b.f25549e == 1) {
                m37767a(iVar, i, 0, i3, z);
            } else if (i3 <= C7056e.f25362y) {
                m37766a(iVar, i, 0, i3);
            } else {
                m37768b(iVar, i, 0, i3);
            }
            if (i3 <= C7056e.f25362y) {
                m37769c(iVar, i, 0, i3);
            } else {
                m37770d(iVar, i, 0, i3);
            }
        }

        /* renamed from: a */
        private void m37767a(C7075i iVar, int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            C7077k kVar = this;
            C7075i iVar2 = iVar;
            C6995g gVar = kVar.f25737b.f25527dU;
            C6995g gVar2 = kVar.f25737b.f25528dV;
            int i9 = i3;
            int i10 = 0;
            while (i10 < i9) {
                int i11 = kVar.f25740e + i10;
                int i12 = (i + i10) * 3;
                int i13 = i12 + 1;
                float f = iVar2.f25674g[i12];
                int i14 = i13 + 1;
                float f2 = iVar2.f25674g[i13];
                float f3 = iVar2.f25674g[i14];
                float f4 = iVar2.f25676i[i12];
                float f5 = iVar2.f25676i[i13];
                float f6 = iVar2.f25676i[i14];
                int i15 = i11 * 4;
                if (z) {
                    i7 = i10;
                    int i16 = i15 + 1;
                    i6 = i14;
                    kVar.f25716Q[i15] = (float) C6982a.m36424f((gVar.f24769a * f) + (gVar.f24770b * f2) + (gVar.f24771c * f3) + gVar.f24772d);
                    i5 = i16 + 1;
                    kVar.f25716Q[i16] = (float) C6982a.m36424f((gVar.f24773e * f) + (gVar.f24774f * f2) + (gVar.f24775g * f3) + gVar.f24776h);
                    i4 = i13;
                } else {
                    i7 = i10;
                    i6 = i14;
                    int i17 = i15 + 1;
                    i4 = i13;
                    kVar.f25716Q[i15] = (gVar.f24769a * f) + (gVar.f24770b * f2) + (gVar.f24771c * f3) + gVar.f24772d;
                    int i18 = i17 + 1;
                    kVar.f25716Q[i17] = (gVar.f24773e * f) + (gVar.f24774f * f2) + (gVar.f24775g * f3) + gVar.f24776h;
                    i5 = i18;
                }
                int i19 = i5 + 1;
                kVar.f25716Q[i5] = (gVar.f24777i * f) + (gVar.f24778j * f2) + (gVar.f24779k * f3) + gVar.f24780l;
                kVar.f25716Q[i19] = (f * gVar.f24781m) + (f2 * gVar.f24782n) + (f3 * gVar.f24783o) + gVar.f24784p;
                int i20 = i11 * 3;
                int i21 = i20 + 1;
                kVar.f25718S[i20] = (gVar2.f24769a * f4) + (gVar2.f24773e * f5) + (gVar2.f24777i * f6);
                int i22 = i21 + 1;
                kVar.f25718S[i21] = (gVar2.f24770b * f4) + (gVar2.f24774f * f5) + (gVar2.f24778j * f6);
                kVar.f25718S[i22] = (f4 * gVar2.f24771c) + (f5 * gVar2.f24775g) + (f6 * gVar2.f24779k);
                for (String str : kVar.f25738c.keySet()) {
                    C7081n nVar = (C7081n) kVar.f25738c.get(str);
                    if (!nVar.mo22765c()) {
                        if (!nVar.mo22766d()) {
                            float[] fArr = (float[]) iVar2.f25686s.get(str);
                            float f7 = fArr[i12];
                            float f8 = fArr[i4];
                            float f9 = fArr[i6];
                            float[] fArr2 = (float[]) kVar.f25734ah.get(str);
                            if (nVar.mo22760a()) {
                                if (z) {
                                    int i23 = i15 + 1;
                                    fArr2[i15] = (float) C6982a.m36424f((gVar.f24769a * f7) + (gVar.f24770b * f8) + (gVar.f24771c * f9) + gVar.f24772d);
                                    int i24 = i23 + 1;
                                    fArr2[i23] = (float) C6982a.m36424f((gVar.f24773e * f7) + (gVar.f24774f * f8) + (gVar.f24775g * f9) + gVar.f24776h);
                                    i8 = i24;
                                } else {
                                    int i25 = i15 + 1;
                                    fArr2[i15] = (gVar.f24769a * f7) + (gVar.f24770b * f8) + (gVar.f24771c * f9) + gVar.f24772d;
                                    i8 = i25 + 1;
                                    fArr2[i25] = (gVar.f24773e * f7) + (gVar.f24774f * f8) + (gVar.f24775g * f9) + gVar.f24776h;
                                }
                                int i26 = i8 + 1;
                                fArr2[i8] = (gVar.f24777i * f7) + (gVar.f24778j * f8) + (gVar.f24779k * f9) + gVar.f24780l;
                                fArr2[i26] = (f7 * gVar.f24781m) + (f8 * gVar.f24782n) + (f9 * gVar.f24783o) + gVar.f24784p;
                            } else {
                                fArr2[i20] = (gVar2.f24769a * f7) + (gVar2.f24773e * f8) + (gVar2.f24777i * f9);
                                fArr2[i21] = (gVar2.f24770b * f7) + (gVar2.f24774f * f8) + (gVar2.f24778j * f9);
                                fArr2[i22] = (f7 * gVar2.f24771c) + (f8 * gVar2.f24775g) + (f9 * gVar2.f24779k);
                            }
                        }
                    }
                    kVar = this;
                    iVar2 = iVar;
                }
                i10 = i7 + 1;
                kVar = this;
                iVar2 = iVar;
                i9 = i3;
            }
        }

        /* renamed from: a */
        private void m37766a(C7075i iVar, int i, int i2, int i3) {
            C7075i iVar2 = iVar;
            int i4 = i3;
            int i5 = 0;
            while (i5 < i4) {
                int i6 = this.f25740e + i5;
                int i7 = (i + i5) * 3;
                int i8 = i7 + 1;
                float f = iVar2.f25674g[i7];
                int i9 = i8 + 1;
                float f2 = iVar2.f25674g[i8];
                float f3 = iVar2.f25674g[i9];
                float f4 = iVar2.f25676i[i7];
                float f5 = iVar2.f25676i[i8];
                float f6 = iVar2.f25676i[i9];
                int i10 = i6 * 4;
                int i11 = i10 + 1;
                this.f25716Q[i10] = f;
                int i12 = i11 + 1;
                this.f25716Q[i11] = f2;
                int i13 = i12 + 1;
                this.f25716Q[i12] = f3;
                this.f25716Q[i13] = 1.0f;
                int i14 = i6 * 3;
                int i15 = i14 + 1;
                this.f25718S[i14] = f4;
                int i16 = i15 + 1;
                this.f25718S[i15] = f5;
                this.f25718S[i16] = f6;
                for (String str : this.f25738c.keySet()) {
                    C7081n nVar = (C7081n) this.f25738c.get(str);
                    if (nVar.mo22765c()) {
                        iVar2 = iVar;
                    } else if (!nVar.mo22766d()) {
                        float[] fArr = (float[]) iVar2.f25686s.get(str);
                        float f7 = fArr[i7];
                        float f8 = fArr[i8];
                        float f9 = fArr[i9];
                        float[] fArr2 = (float[]) this.f25734ah.get(str);
                        if (nVar.mo22760a()) {
                            fArr2[i10] = f7;
                            fArr2[i11] = f8;
                            fArr2[i12] = f9;
                            fArr2[i13] = 1.0f;
                        } else {
                            fArr2[i14] = f7;
                            fArr2[i15] = f8;
                            fArr2[i16] = f9;
                        }
                        iVar2 = iVar;
                    }
                }
                i5++;
                iVar2 = iVar;
                i4 = i3;
            }
        }

        /* renamed from: b */
        private void m37768b(C7075i iVar, int i, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = (i + i4) * 3;
                int i6 = (this.f25740e + i4) * 4;
                C6982a.m36406a((Object) iVar.f25674g, i5, (Object) this.f25716Q, i6, 3);
                int i7 = i6 + 3;
                this.f25716Q[i7] = 1.0f;
                for (String str : this.f25738c.keySet()) {
                    if (((C7081n) this.f25738c.get(str)).mo22760a()) {
                        float[] fArr = (float[]) iVar.f25686s.get(str);
                        float[] fArr2 = (float[]) this.f25734ah.get(str);
                        C6982a.m36406a((Object) fArr, i5, (Object) fArr2, i6, 3);
                        fArr2[i7] = 1.0f;
                    }
                }
            }
            int i8 = i * 3;
            int i9 = i3 * 3;
            C6982a.m36406a((Object) iVar.f25676i, i8, (Object) this.f25718S, this.f25740e * 3, i9);
            for (String str2 : this.f25738c.keySet()) {
                if (((C7081n) this.f25738c.get(str2)).mo22763b()) {
                    C6982a.m36406a((Object) (float[]) iVar.f25686s.get(str2), i8, (Object) (float[]) this.f25734ah.get(str2), this.f25740e * 3, i9);
                }
            }
        }

        /* renamed from: c */
        private void m37769c(C7075i iVar, int i, int i2, int i3) {
            C7075i iVar2 = iVar;
            int i4 = i3;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i + i5;
                int i7 = this.f25740e + i5;
                int i8 = i6 * 2;
                int i9 = i8 + 1;
                float f = iVar2.f25677j[i8];
                float f2 = iVar2.f25677j[i9];
                this.f25717R[i7] = iVar2.f25675h[i6];
                int i10 = i7 * 2;
                int i11 = i10 + 1;
                this.f25719T[i10] = f;
                this.f25719T[i11] = f2;
                this.f25720U[i7] = iVar2.f25682o[i6];
                this.f25721V[i7] = iVar2.f25683p[i6];
                this.f25722W[i7] = iVar2.f25684q[i6];
                this.f25723X[i7] = iVar2.f25685r[i6];
                for (String str : this.f25738c.keySet()) {
                    C7081n nVar = (C7081n) this.f25738c.get(str);
                    if (!nVar.mo22760a() && !nVar.mo22763b()) {
                        int i12 = nVar.f25824e * i6;
                        int i13 = nVar.f25824e * i7;
                        if (nVar.mo22767e()) {
                            float[] fArr = (float[]) iVar2.f25686s.get(str);
                            float[] fArr2 = (float[]) this.f25734ah.get(str);
                            int i14 = i12;
                            int i15 = 0;
                            while (i15 < nVar.f25824e) {
                                int i16 = i13 + 1;
                                int i17 = i14 + 1;
                                fArr2[i13] = fArr[i14];
                                i15++;
                                i13 = i16;
                                i14 = i17;
                            }
                        } else if (nVar.mo22768f()) {
                            int[] iArr = (int[]) iVar2.f25687t.get(str);
                            int[] iArr2 = (int[]) this.f25735ai.get(str);
                            int i18 = i12;
                            int i19 = 0;
                            while (i19 < nVar.f25824e) {
                                int i20 = i13 + 1;
                                int i21 = i18 + 1;
                                iArr2[i13] = iArr[i18];
                                i19++;
                                i13 = i20;
                                i18 = i21;
                            }
                        } else if (nVar.mo22769g()) {
                            byte[] bArr = (byte[]) iVar2.f25688u.get(str);
                            byte[] bArr2 = (byte[]) this.f25736aj.get(str);
                            int i22 = i12;
                            int i23 = 0;
                            while (i23 < nVar.f25824e) {
                                int i24 = i13 + 1;
                                int i25 = i22 + 1;
                                bArr2[i13] = bArr[i22];
                                i23++;
                                i13 = i24;
                                i22 = i25;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m37770d(C7075i iVar, int i, int i2, int i3) {
            Object obj;
            C6982a.m36406a((Object) iVar.f25675h, i, (Object) this.f25717R, this.f25740e, i3);
            C6982a.m36406a((Object) iVar.f25677j, i * 2, (Object) this.f25719T, this.f25740e * 2, i3 * 2);
            C6982a.m36406a((Object) iVar.f25682o, i, (Object) this.f25720U, this.f25740e, i3);
            C6982a.m36406a((Object) iVar.f25683p, i, (Object) this.f25721V, this.f25740e, i3);
            C6982a.m36406a((Object) iVar.f25684q, i, (Object) this.f25722W, this.f25740e, i3);
            C6982a.m36406a((Object) iVar.f25685r, i, (Object) this.f25723X, this.f25740e, i3);
            for (String str : this.f25738c.keySet()) {
                C7081n nVar = (C7081n) this.f25738c.get(str);
                if (!nVar.mo22760a() && !nVar.mo22763b()) {
                    Object obj2 = null;
                    if (nVar.mo22767e()) {
                        obj2 = iVar.f25686s.get(str);
                        obj = this.f25734ah.get(str);
                    } else if (nVar.mo22768f()) {
                        obj2 = iVar.f25687t.get(str);
                        obj = this.f25735ai.get(str);
                    } else if (nVar.mo22769g()) {
                        obj2 = iVar.f25688u.get(str);
                        obj = this.f25736aj.get(str);
                    } else {
                        obj = null;
                    }
                    C6982a.m36406a(obj2, nVar.f25824e * i, obj, nVar.f25825f * this.f25740e, nVar.f25824e * i3);
                }
            }
        }
    }

    /* renamed from: e.f.i$l */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7078l {

        /* renamed from: A */
        int f25762A;

        /* renamed from: B */
        int f25763B;

        /* renamed from: C */
        int f25764C;

        /* renamed from: D */
        int f25765D;

        /* renamed from: E */
        int f25766E;

        /* renamed from: F */
        float[] f25767F;

        /* renamed from: G */
        int[] f25768G;

        /* renamed from: H */
        float[] f25769H;

        /* renamed from: I */
        int f25770I;

        /* renamed from: J */
        float[] f25771J;

        /* renamed from: K */
        int[] f25772K;

        /* renamed from: L */
        float[] f25773L;

        /* renamed from: M */
        int f25774M;

        /* renamed from: a */
        C7075i f25775a;

        /* renamed from: b */
        C7077k f25776b;

        /* renamed from: c */
        C7080m f25777c;

        /* renamed from: d */
        C6992d f25778d;

        /* renamed from: e */
        C6992d f25779e;

        /* renamed from: f */
        int f25780f;

        /* renamed from: g */
        int f25781g;

        /* renamed from: h */
        C7058b f25782h;

        /* renamed from: i */
        C7079a f25783i;

        /* renamed from: j */
        boolean f25784j;

        /* renamed from: k */
        boolean f25785k;

        /* renamed from: l */
        int f25786l;

        /* renamed from: m */
        float f25787m;

        /* renamed from: n */
        int f25788n;

        /* renamed from: o */
        int f25789o;

        /* renamed from: p */
        boolean f25790p = true;

        /* renamed from: q */
        C6993e f25791q = null;

        /* renamed from: r */
        float f25792r;

        /* renamed from: s */
        boolean f25793s = false;

        /* renamed from: t */
        boolean f25794t = true;

        /* renamed from: u */
        protected C7065i f25795u;

        /* renamed from: v */
        int[] f25796v = new int[512];

        /* renamed from: w */
        int f25797w;

        /* renamed from: x */
        int[] f25798x;

        /* renamed from: y */
        int f25799y;

        /* renamed from: z */
        int f25800z;

        /* renamed from: e.f.i$l$a */
        /* compiled from: PGraphicsOpenGL */
        protected class C7079a implements C7059c {

            /* renamed from: a */
            C7068b f25801a;

            /* renamed from: b */
            boolean f25802b;

            /* renamed from: c */
            boolean f25803c;

            /* renamed from: d */
            boolean f25804d;

            /* renamed from: e */
            C7076j f25805e;

            /* renamed from: f */
            int f25806f;

            /* renamed from: g */
            int f25807g;

            /* renamed from: h */
            int f25808h;

            /* renamed from: i */
            int f25809i;

            /* renamed from: j */
            int f25810j;

            public C7079a(C7068b bVar) {
                this.f25801a = bVar;
            }

            /* renamed from: a */
            public void mo22740a(boolean z, boolean z2, boolean z3, boolean z4) {
                this.f25803c = z2;
                this.f25802b = z3;
                this.f25804d = z4;
                this.f25805e = C7078l.this.f25776b.f25755t;
                if (z) {
                    this.f25805e.mo22568c();
                }
            }

            /* renamed from: a */
            public void mo22393a(int i) {
                this.f25806f = this.f25805e.mo22570d();
                if (C7078l.this.f25800z == -1) {
                    C7078l.this.f25800z = this.f25806f;
                }
                if (this.f25803c && C7078l.this.f25763B == -1) {
                    C7078l.this.f25763B = this.f25806f;
                }
                this.f25807g = this.f25805e.f25697d[this.f25806f];
                this.f25809i = this.f25805e.f25698e[this.f25806f];
                this.f25808h = 0;
                if (i == C7056e.f25199cv) {
                    this.f25810j = 11;
                } else if (i == C7056e.f25200cw) {
                    this.f25810j = 10;
                } else if (i == C7056e.f25201cx) {
                    this.f25810j = 9;
                }
            }

            /* renamed from: a */
            public void mo22392a() {
                int i;
                if (C7056e.f25356s <= this.f25807g + this.f25808h) {
                    this.f25806f = this.f25805e.mo22568c();
                    this.f25807g = this.f25805e.f25697d[this.f25806f];
                    this.f25809i = this.f25805e.f25698e[this.f25806f];
                }
                switch (this.f25810j) {
                    case 9:
                        i = this.f25808h;
                        for (int i2 = 0; i2 < this.f25808h; i2++) {
                            mo22741c(i2);
                        }
                        if (this.f25802b) {
                            for (int i3 = 0; i3 < this.f25808h / 3; i3++) {
                                int i4 = i3 * 3;
                                mo22739a(i4 + 0, i4 + 1, i4 + 2);
                            }
                            break;
                        }
                        break;
                    case 10:
                        int i5 = (this.f25808h - 2) * 3;
                        for (int i6 = 1; i6 < this.f25808h - 1; i6++) {
                            if (i6 % 2 == 0) {
                                int i7 = i6 + 1;
                                mo22741c(i7);
                                mo22741c(i6);
                                int i8 = i6 - 1;
                                mo22741c(i8);
                                if (this.f25802b) {
                                    mo22739a(i7, i6, i8);
                                }
                            } else {
                                int i9 = i6 - 1;
                                mo22741c(i9);
                                mo22741c(i6);
                                int i10 = i6 + 1;
                                mo22741c(i10);
                                if (this.f25802b) {
                                    mo22739a(i9, i6, i10);
                                }
                            }
                        }
                        i = i5;
                        break;
                    case 11:
                        i = (this.f25808h - 2) * 3;
                        int i11 = 1;
                        while (i11 < this.f25808h - 1) {
                            mo22741c(0);
                            mo22741c(i11);
                            int i12 = i11 + 1;
                            mo22741c(i12);
                            if (this.f25802b) {
                                mo22739a(0, i11, i12);
                            }
                            i11 = i12;
                        }
                        break;
                    default:
                        i = 0;
                        break;
                }
                this.f25805e.mo22564a(this.f25806f, i, this.f25808h);
                C7078l.this.f25762A = this.f25806f;
                if (this.f25803c) {
                    C7078l.this.f25764C = this.f25806f;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public void mo22741c(int i) {
                C7078l.this.f25776b.mo22598d();
                C7078l.this.f25776b.f25724Y[C7078l.this.f25776b.f25751p - 1] = (short) (this.f25807g + i);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo22739a(int i, int i2, int i3) {
                C7078l.this.f25776b.mo22580a(this.f25807g + this.f25809i + i, this.f25807g + this.f25809i + i2, this.f25807g + this.f25809i + i3);
            }

            /* renamed from: a */
            public void mo22394a(Object obj) {
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    if (dArr.length < 25) {
                        throw new RuntimeException("TessCallback vertex() data is too small");
                    } else if (this.f25808h < C7056e.f25356s) {
                        C7078l.this.f25776b.mo22589a(dArr, this.f25804d);
                        this.f25808h++;
                    } else {
                        throw new RuntimeException("The tessellator is generating too many vertices, reduce complexity of shape.");
                    }
                } else {
                    throw new RuntimeException("TessCallback vertex() data not understood");
                }
            }

            /* renamed from: b */
            public void mo22396b(int i) {
                C6989c.m36559a("Tessellation Error: %1$s", C7078l.this.f25795u.f25493a.mo22371u(i));
            }

            /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object[]] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object[], code=null, for r15v0, types: [java.lang.Object[]] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo22395a(double[] r12, java.lang.Object[] r13, float[] r14, java.lang.Object[] r15) {
                /*
                    r11 = this;
                    r0 = 0
                    r1 = r13[r0]
                    double[] r1 = (double[]) r1
                    int r1 = r1.length
                    double[] r2 = new double[r1]
                    r3 = r12[r0]
                    r2[r0] = r3
                    r3 = 1
                    r4 = r12[r3]
                    r2[r3] = r4
                    r3 = 2
                    r4 = r12[r3]
                    r2[r3] = r4
                    r12 = 3
                L_0x0017:
                    if (r12 >= r1) goto L_0x0039
                    r3 = 0
                    r2[r12] = r3
                    r3 = 0
                L_0x001e:
                    r4 = 4
                    if (r3 >= r4) goto L_0x0036
                    r4 = r13[r3]
                    double[] r4 = (double[]) r4
                    if (r4 == 0) goto L_0x0033
                    r5 = r2[r12]
                    r7 = r14[r3]
                    double r7 = (double) r7
                    r9 = r4[r12]
                    double r7 = r7 * r9
                    double r5 = r5 + r7
                    r2[r12] = r5
                L_0x0033:
                    int r3 = r3 + 1
                    goto L_0x001e
                L_0x0036:
                    int r12 = r12 + 1
                    goto L_0x0017
                L_0x0039:
                    r12 = 7
                    r11.m37936a(r2, r12)
                    r12 = 25
                    if (r12 >= r1) goto L_0x0064
                    r12 = 0
                    r13 = 25
                L_0x0044:
                    e.f.i$b r14 = r11.f25801a
                    int r14 = r14.size()
                    if (r12 >= r14) goto L_0x0064
                    e.f.i$b r14 = r11.f25801a
                    e.f.i$n r14 = r14.mo22498a(r12)
                    boolean r1 = r14.mo22763b()
                    if (r1 == 0) goto L_0x005e
                    r11.m37936a(r2, r13)
                    int r13 = r13 + 3
                    goto L_0x0061
                L_0x005e:
                    int r14 = r14.f25824e
                    int r13 = r13 + r14
                L_0x0061:
                    int r12 = r12 + 1
                    goto L_0x0044
                L_0x0064:
                    r15[r0] = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p256e.p262f.C7065i.C7078l.C7079a.mo22395a(double[], java.lang.Object[], float[], java.lang.Object[]):void");
            }

            /* renamed from: a */
            private void m37936a(double[] dArr, int i) {
                int i2 = i + 1;
                int i3 = i + 2;
                double sqrt = Math.sqrt((dArr[i] * dArr[i]) + (dArr[i2] * dArr[i2]) + (dArr[i3] * dArr[i3]));
                if (0.0d < sqrt) {
                    dArr[i] = dArr[i] / sqrt;
                    dArr[i2] = dArr[i2] / sqrt;
                    dArr[i3] = dArr[i3] / sqrt;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: D */
        public void mo22655D() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: G */
        public boolean mo22658G() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22662a() {
            if (this.f25782h == null) {
                this.f25783i = new C7079a(this.f25776b.f25738c);
                this.f25782h = this.f25795u.f25493a.mo22253a((C7059c) this.f25783i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22673a(C7075i iVar) {
            this.f25775a = iVar;
            this.f25800z = -1;
            this.f25762A = -1;
            this.f25763B = -1;
            this.f25764C = -1;
            this.f25765D = -1;
            this.f25766E = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22674a(C7077k kVar) {
            this.f25776b = kVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22677a(boolean z) {
            this.f25784j = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22675a(C7080m mVar, C6992d dVar) {
            this.f25777c = mVar;
            this.f25779e = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22685b(boolean z) {
            this.f25785k = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22665a(int i) {
            this.f25786l = C7056e.m37128j(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22663a(float f) {
            this.f25787m = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22682b(int i) {
            this.f25789o = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22688c(int i) {
            this.f25788n = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo22676a(C7065i iVar) {
            this.f25795u = iVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22689c(boolean z) {
            if (z) {
                this.f25793s = false;
                this.f25794t = true;
                return;
            }
            this.f25793s = true;
            this.f25794t = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22671a(C6993e eVar) {
            this.f25791q = eVar;
            this.f25792r = -1.0f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22681b() {
            if (this.f25789o == 2) {
                mo22687c();
            } else {
                mo22691d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22687c() {
            int i = this.f25775a.f25671d;
            if (this.f25785k && 1 <= i) {
                int d = C6982a.m36422d(200, C6982a.m36420c(20, (int) ((this.f25787m * 6.2831855f) / 10.0f))) + 1;
                if (C7056e.f25356s > d) {
                    mo22653B();
                    int i2 = d * i;
                    int i3 = (d - 1) * 3 * i;
                    if (this.f25794t) {
                        mo22670a(i2, i3, d);
                    } else if (this.f25793s) {
                        mo22738z();
                        mo22684b(i2, i3, d);
                        mo22652A();
                    }
                } else {
                    throw new RuntimeException("Error in point tessellation.");
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22670a(int i, int i2, int i3) {
            int i4 = i3;
            int i5 = i4 - 1;
            this.f25776b.mo22601e(i);
            this.f25776b.mo22605f(i2);
            int i6 = this.f25776b.f25706G;
            int i7 = this.f25776b.f25706G;
            int i8 = this.f25776b.f25712M;
            C7076j jVar = this.f25776b.f25715P;
            int i9 = 1;
            int c = this.f25775a.f25669b == 1 ? jVar.mo22568c() : jVar.mo22570d();
            this.f25765D = c;
            int i10 = i8;
            int i11 = i7;
            int i12 = i6;
            int i13 = 0;
            while (i13 < this.f25775a.f25671d) {
                int i14 = jVar.f25697d[c];
                if (C7056e.f25356s <= i14 + i4) {
                    c = jVar.mo22568c();
                    i14 = 0;
                }
                int i15 = i12;
                for (int i16 = 0; i16 < i4; i16++) {
                    this.f25776b.mo22581a(i15, this.f25775a, i13);
                    i15++;
                }
                int i17 = i11 * 2;
                float f = 0.0f;
                this.f25776b.f25732af[i17 + 0] = 0.0f;
                this.f25776b.f25732af[i17 + i9] = 0.0f;
                float f2 = 720.0f / ((float) i5);
                int i18 = i11 + i9;
                for (int i19 = 0; i19 < i5; i19++) {
                    int i20 = i18 * 2;
                    int i21 = (int) f;
                    this.f25776b.f25732af[i20 + 0] = C7065i.f24598bE[i21] * 0.5f * mo22717o() * this.f25787m;
                    this.f25776b.f25732af[i20 + 1] = C7065i.f24597bD[i21] * 0.5f * mo22717o() * this.f25787m;
                    f = (f + f2) % 720.0f;
                    i18++;
                }
                int i22 = 1;
                while (i22 < i5) {
                    int i23 = i10 + 1;
                    this.f25776b.f25733ag[i10] = (short) (i14 + 0);
                    int i24 = i23 + 1;
                    int i25 = i14 + i22;
                    this.f25776b.f25733ag[i23] = (short) i25;
                    int i26 = i24 + 1;
                    this.f25776b.f25733ag[i24] = (short) (i25 + 1);
                    i22++;
                    i10 = i26;
                }
                int i27 = i10 + 1;
                this.f25776b.f25733ag[i10] = (short) (i14 + 0);
                int i28 = i27 + 1;
                this.f25776b.f25733ag[i27] = (short) (i14 + 1);
                i10 = i28 + 1;
                this.f25776b.f25733ag[i28] = (short) ((i14 + i4) - 1);
                jVar.mo22564a(c, i5 * 3, i4);
                i13++;
                i12 = i15;
                i11 = i18;
                i9 = 1;
            }
            this.f25766E = c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22684b(int i, int i2, int i3) {
            int i4;
            int i5;
            int i6 = i3;
            int i7 = i6 - 1;
            this.f25776b.mo22576a(i);
            this.f25776b.mo22591b(i2);
            int i8 = this.f25776b.f25740e;
            int i9 = this.f25776b.f25752q;
            C7076j jVar = this.f25776b.f25755t;
            int c = this.f25775a.f25669b == 1 ? jVar.mo22568c() : jVar.mo22570d();
            this.f25765D = c;
            if (this.f25800z == -1) {
                this.f25800z = c;
            }
            int i10 = i9;
            int i11 = i8;
            int i12 = 0;
            while (i12 < this.f25775a.f25671d) {
                int i13 = jVar.f25697d[c];
                if (C7056e.f25356s <= i13 + i6) {
                    i4 = jVar.mo22568c();
                    i5 = 0;
                } else {
                    i4 = c;
                    i5 = i13;
                }
                int i14 = i12 * 3;
                float f = this.f25775a.f25674g[i14 + 0];
                float f2 = this.f25775a.f25674g[i14 + 1];
                int i15 = this.f25775a.f25678k[i12];
                float f3 = 720.0f / ((float) i7);
                int i16 = i4;
                this.f25776b.mo22578a(i11, f, f2, 0.0f, i15, false);
                int i17 = i11 + 1;
                float f4 = 0.0f;
                for (int i18 = 0; i18 < i7; i18++) {
                    int i19 = (int) f4;
                    this.f25776b.mo22578a(i17, f + (C7065i.f24598bE[i19] * 0.5f * this.f25787m), f2 + (C7065i.f24597bD[i19] * 0.5f * this.f25787m), 0.0f, i15, false);
                    i17++;
                    f4 = (f4 + f3) % 720.0f;
                }
                for (int i20 = 1; i20 < i7; i20++) {
                    int i21 = i10 + 1;
                    this.f25776b.f25724Y[i10] = (short) (i5 + 0);
                    int i22 = i21 + 1;
                    int i23 = i5 + i20;
                    this.f25776b.f25724Y[i21] = (short) i23;
                    i10 = i22 + 1;
                    this.f25776b.f25724Y[i22] = (short) (i23 + 1);
                }
                int i24 = i10 + 1;
                this.f25776b.f25724Y[i10] = (short) (i5 + 0);
                int i25 = i24 + 1;
                this.f25776b.f25724Y[i24] = (short) (i5 + 1);
                i10 = i25 + 1;
                this.f25776b.f25724Y[i25] = (short) ((i5 + i6) - 1);
                jVar.mo22564a(i16, i7 * 3, i6);
                i12++;
                c = i16;
                i11 = i17;
            }
            this.f25762A = c;
            this.f25766E = c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22691d() {
            int i = this.f25775a.f25671d;
            if (this.f25785k && 1 <= i) {
                mo22653B();
                int i2 = i * 5;
                int i3 = i * 12;
                if (this.f25794t) {
                    mo22669a(i2, i3);
                } else if (this.f25793s) {
                    mo22738z();
                    mo22683b(i2, i3);
                    mo22652A();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22669a(int i, int i2) {
            this.f25776b.mo22601e(i);
            this.f25776b.mo22605f(i2);
            int i3 = this.f25776b.f25706G;
            int i4 = this.f25776b.f25706G;
            int i5 = this.f25776b.f25712M;
            C7076j jVar = this.f25776b.f25715P;
            int c = this.f25775a.f25669b == 1 ? jVar.mo22568c() : jVar.mo22570d();
            this.f25765D = c;
            char c2 = 0;
            int i6 = i5;
            int i7 = i4;
            int i8 = i3;
            int i9 = 0;
            while (i9 < this.f25775a.f25671d) {
                int i10 = jVar.f25697d[c];
                if (C7056e.f25356s <= i10 + 5) {
                    c = jVar.mo22568c();
                    i10 = 0;
                }
                int i11 = i8;
                for (int i12 = 0; i12 < 5; i12++) {
                    this.f25776b.mo22581a(i11, this.f25775a, i9);
                    i11++;
                }
                int i13 = i7 * 2;
                this.f25776b.f25732af[i13 + 0] = 0.0f;
                this.f25776b.f25732af[i13 + 1] = 0.0f;
                i7++;
                int i14 = 0;
                while (i14 < 4) {
                    int i15 = i7 * 2;
                    this.f25776b.f25732af[i15 + 0] = C7065i.f25488fc[i14][c2] * 0.5f * mo22717o() * this.f25787m;
                    this.f25776b.f25732af[i15 + 1] = C7065i.f25488fc[i14][1] * 0.5f * mo22717o() * this.f25787m;
                    i7++;
                    i14++;
                    c2 = 0;
                }
                int i16 = 1;
                while (i16 < 4) {
                    int i17 = i6 + 1;
                    this.f25776b.f25733ag[i6] = (short) (i10 + 0);
                    int i18 = i17 + 1;
                    int i19 = i10 + i16;
                    this.f25776b.f25733ag[i17] = (short) i19;
                    int i20 = i18 + 1;
                    this.f25776b.f25733ag[i18] = (short) (i19 + 1);
                    i16++;
                    i6 = i20;
                }
                int i21 = i6 + 1;
                this.f25776b.f25733ag[i6] = (short) (i10 + 0);
                int i22 = i21 + 1;
                this.f25776b.f25733ag[i21] = (short) (i10 + 1);
                int i23 = i22 + 1;
                this.f25776b.f25733ag[i22] = (short) ((i10 + 5) - 1);
                jVar.mo22564a(c, 12, 5);
                i9++;
                i6 = i23;
                i8 = i11;
                c2 = 0;
            }
            this.f25766E = c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22683b(int i, int i2) {
            int i3;
            int i4;
            this.f25776b.mo22576a(i);
            this.f25776b.mo22591b(i2);
            boolean f = mo22699f();
            int i5 = this.f25776b.f25740e;
            int i6 = this.f25776b.f25752q;
            C7076j jVar = this.f25776b.f25755t;
            int c = this.f25775a.f25669b == 1 ? jVar.mo22568c() : jVar.mo22570d();
            this.f25765D = c;
            if (this.f25800z == -1) {
                this.f25800z = c;
            }
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            while (i9 < this.f25775a.f25671d) {
                int i10 = jVar.f25697d[c];
                if (C7056e.f25356s <= i10 + 5) {
                    i4 = jVar.mo22568c();
                    i3 = 0;
                } else {
                    i3 = i10;
                    i4 = c;
                }
                int i11 = i9 * 3;
                float f2 = this.f25775a.f25674g[i11 + 0];
                float f3 = this.f25775a.f25674g[i11 + 1];
                int i12 = this.f25775a.f25678k[i9];
                int i13 = i4;
                this.f25776b.mo22578a(i7, f2, f3, 0.0f, i12, f);
                int i14 = i7 + 1;
                for (int i15 = 0; i15 < 4; i15++) {
                    this.f25776b.mo22578a(i14, f2 + (C7065i.f25488fc[i15][0] * 0.5f * this.f25787m), f3 + (C7065i.f25488fc[i15][1] * 0.5f * this.f25787m), 0.0f, i12, f);
                    i14++;
                }
                for (int i16 = 1; i16 < 4; i16++) {
                    int i17 = i8 + 1;
                    this.f25776b.f25724Y[i8] = (short) (i3 + 0);
                    int i18 = i17 + 1;
                    int i19 = i3 + i16;
                    this.f25776b.f25724Y[i17] = (short) i19;
                    i8 = i18 + 1;
                    this.f25776b.f25724Y[i18] = (short) (i19 + 1);
                }
                int i20 = i8 + 1;
                this.f25776b.f25724Y[i8] = (short) (i3 + 0);
                int i21 = i20 + 1;
                this.f25776b.f25724Y[i20] = (short) (i3 + 1);
                i8 = i21 + 1;
                this.f25776b.f25724Y[i21] = (short) ((i3 + 5) - 1);
                c = i13;
                jVar.mo22564a(c, 12, 5);
                i9++;
                i7 = i14;
            }
            this.f25762A = c;
            this.f25766E = c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo22698e() {
            return this.f25793s && this.f25776b.f25726a == 0 && C7065i.m37509i(this.f25795u.f25527dU.f24770b) && C7065i.m37509i(this.f25795u.f25527dU.f24773e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo22699f() {
            return mo22698e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo22701g() {
            int i = this.f25775a.f25671d;
            if (this.f25785k && 2 <= i) {
                this.f25767F = this.f25775a.f25674g;
                this.f25768G = this.f25775a.f25678k;
                this.f25769H = this.f25775a.f25679l;
                mo22653B();
                int i2 = i / 2;
                if (this.f25794t) {
                    mo22692d(i2);
                } else if (this.f25793s) {
                    mo22738z();
                    mo22695e(i2);
                    mo22652A();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22692d(int i) {
            int i2;
            int i3 = i * 4;
            int i4 = i * 2 * 3;
            int i5 = this.f25776b.f25756u;
            int i6 = this.f25776b.f25700A;
            this.f25776b.mo22595c(i3);
            this.f25776b.mo22599d(i4);
            if (this.f25775a.f25669b == 1) {
                i2 = this.f25776b.f25704E.mo22568c();
            } else {
                i2 = this.f25776b.f25704E.mo22570d();
            }
            this.f25763B = i2;
            int[] iArr = {0, 0};
            this.f25776b.f25704E.mo22565a(iArr);
            int i7 = i2;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 * 2;
                int i10 = i9 + 0;
                int i11 = i9 + 1;
                i7 = mo22660a(i10, i11, i10 - 2, i11 - 1, i7, null, false);
            }
            this.f25776b.f25704E.mo22565a((int[]) null);
            this.f25776b.f25700A = i6 + iArr[0];
            this.f25776b.f25756u = i5 + iArr[1];
            this.f25764C = i7;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22695e(int i) {
            int i2;
            int i3 = i * 4;
            int i4 = i * 2 * 3;
            int i5 = 0;
            if (mo22714m(i3)) {
                this.f25776b.mo22576a(i3);
                this.f25776b.mo22591b(i4);
                if (this.f25775a.f25669b == 1) {
                    i2 = this.f25776b.f25755t.mo22568c();
                } else {
                    i2 = this.f25776b.f25755t.mo22570d();
                }
                this.f25763B = i2;
                if (this.f25800z == -1) {
                    this.f25800z = i2;
                }
                boolean f = mo22700f(i);
                int i6 = i2;
                while (i5 < i) {
                    int i7 = i5 * 2;
                    i6 = mo22661a(i7 + 0, i7 + 1, i6, false, f);
                    i5++;
                }
                this.f25762A = i6;
                this.f25764C = i6;
                return;
            }
            C7052c cVar = new C7052c(1);
            while (i5 < i) {
                int i8 = i5 * 2;
                int i9 = i8 + 0;
                int i10 = i8 + 1;
                int i11 = i9 * 3;
                cVar.mo22188a(this.f25775a.f25674g[i11 + 0], this.f25775a.f25674g[i11 + 1], this.f25775a.f25678k[i9]);
                int i12 = i10 * 3;
                cVar.mo22192b(this.f25775a.f25674g[i12 + 0], this.f25775a.f25674g[i12 + 1], this.f25775a.f25678k[i10]);
                i5++;
            }
            mo22672a(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo22700f(int i) {
            boolean e = mo22698e();
            if (e) {
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = i2 * 2;
                    e = mo22690c(i3 + 0, i3 + 1);
                    if (!e) {
                        break;
                    }
                }
            }
            return e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo22703h() {
            int i = this.f25775a.f25671d;
            if (this.f25785k && 2 <= i) {
                this.f25767F = this.f25775a.f25674g;
                this.f25768G = this.f25775a.f25678k;
                this.f25769H = this.f25775a.f25679l;
                mo22653B();
                int i2 = i - 1;
                if (this.f25794t) {
                    mo22702g(i2);
                } else if (this.f25793s) {
                    mo22738z();
                    mo22704h(i2);
                    mo22652A();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo22702g(int i) {
            int i2;
            int[] iArr;
            int a;
            int i3 = i;
            int i4 = mo22715n() ? 0 : i3 - 1;
            int i5 = (i3 * 4) + (i4 * 3);
            int i6 = (i3 * 2 * 3) + (i4 * 2 * 3);
            int i7 = this.f25776b.f25756u;
            int i8 = this.f25776b.f25700A;
            this.f25776b.mo22595c(i5);
            this.f25776b.mo22599d(i6);
            if (this.f25775a.f25669b == 1) {
                i2 = this.f25776b.f25704E.mo22568c();
            } else {
                i2 = this.f25776b.f25704E.mo22570d();
            }
            this.f25763B = i2;
            short[] sArr = {-1, -1};
            int[] iArr2 = {0, 0};
            this.f25776b.f25704E.mo22565a(iArr2);
            int i9 = i2;
            int i10 = 0;
            int i11 = 0;
            while (i10 < i3) {
                int i12 = i10 + 1;
                if (i4 > 0) {
                    iArr = iArr2;
                    a = mo22660a(i11, i12, i12 - 2, i12 - 1, i9, sArr, false);
                } else {
                    iArr = iArr2;
                    a = mo22660a(i11, i12, i12 - 2, i12 - 1, i9, null, false);
                }
                i9 = a;
                i10 = i12;
                i11 = i10;
                iArr2 = iArr;
            }
            int[] iArr3 = iArr2;
            this.f25776b.f25704E.mo22565a((int[]) null);
            this.f25776b.f25700A = i8 + iArr3[0];
            this.f25776b.f25756u = i7 + iArr3[1];
            this.f25764C = i9;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo22704h(int i) {
            int i2;
            int i3 = i * 4;
            int i4 = i * 2 * 3;
            int i5 = 0;
            if (mo22714m(i3)) {
                this.f25776b.mo22576a(i3);
                this.f25776b.mo22591b(i4);
                if (this.f25775a.f25669b == 1) {
                    i2 = this.f25776b.f25755t.mo22568c();
                } else {
                    i2 = this.f25776b.f25755t.mo22570d();
                }
                this.f25763B = i2;
                if (this.f25800z == -1) {
                    this.f25800z = i2;
                }
                boolean i6 = mo22706i(i);
                int i7 = i2;
                int i8 = 0;
                while (i5 < i) {
                    int i9 = i5 + 1;
                    i7 = mo22661a(i8, i9, i7, false, i6);
                    i5 = i9;
                    i8 = i5;
                }
                this.f25762A = i7;
                this.f25764C = i7;
                return;
            }
            C7052c cVar = new C7052c(1);
            cVar.mo22188a(this.f25775a.f25674g[0], this.f25775a.f25674g[1], this.f25775a.f25678k[0]);
            while (i5 < i) {
                i5++;
                int i10 = i5 * 3;
                cVar.mo22192b(this.f25775a.f25674g[i10 + 0], this.f25775a.f25674g[i10 + 1], this.f25775a.f25678k[i5]);
            }
            mo22672a(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public boolean mo22706i(int i) {
            boolean e = mo22698e();
            if (!e) {
                return e;
            }
            boolean z = e;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                z = mo22690c(0, i2);
                if (!z) {
                    return z;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo22705i() {
            int i = this.f25775a.f25671d;
            if (this.f25785k && 2 <= i) {
                this.f25767F = this.f25775a.f25674g;
                this.f25768G = this.f25775a.f25678k;
                this.f25769H = this.f25775a.f25679l;
                mo22653B();
                if (this.f25794t) {
                    mo22708j(i);
                } else if (this.f25793s) {
                    mo22738z();
                    mo22710k(i);
                    mo22652A();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo22708j(int i) {
            int i2;
            int[] iArr;
            int a;
            int i3 = mo22715n() ? 0 : i;
            int i4 = (i * 4) + (i3 * 3);
            int i5 = (i * 2 * 3) + (i3 * 2 * 3);
            int i6 = this.f25776b.f25756u;
            int i7 = this.f25776b.f25700A;
            this.f25776b.mo22595c(i4);
            this.f25776b.mo22599d(i5);
            if (this.f25775a.f25669b == 1) {
                i2 = this.f25776b.f25704E.mo22568c();
            } else {
                i2 = this.f25776b.f25704E.mo22570d();
            }
            this.f25763B = i2;
            int i8 = -1;
            short[] sArr = {-1, -1};
            int[] iArr2 = {0, 0};
            this.f25776b.f25704E.mo22565a(iArr2);
            int i9 = i2;
            int i10 = 0;
            int i11 = 0;
            while (i10 < i - 1) {
                int i12 = i10 + 1;
                if (i3 > 0) {
                    iArr = iArr2;
                    a = mo22660a(i11, i12, i12 - 2, i12 - 1, i9, sArr, false);
                } else {
                    iArr = iArr2;
                    a = mo22660a(i11, i12, i12 - 2, i12 - 1, i9, null, false);
                }
                i9 = a;
                i10 = i12;
                i8 = i10;
                i11 = i8;
                iArr2 = iArr;
            }
            int[] iArr3 = iArr2;
            int a2 = mo22660a(this.f25775a.f25671d - 1, 0, i8 - 2, i8 - 1, i9, sArr, false);
            if (i3 > 0) {
                a2 = mo22680b(0, 1, this.f25775a.f25671d - 1, 0, a2, sArr, false);
            }
            this.f25776b.f25704E.mo22565a((int[]) null);
            this.f25776b.f25700A = i7 + iArr3[0];
            this.f25776b.f25756u = i6 + iArr3[1];
            this.f25764C = a2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo22710k(int i) {
            int i2;
            int i3 = i * 4;
            int i4 = i * 2 * 3;
            int i5 = 0;
            if (mo22714m(i3)) {
                this.f25776b.mo22576a(i3);
                this.f25776b.mo22591b(i4);
                if (this.f25775a.f25669b == 1) {
                    i2 = this.f25776b.f25755t.mo22568c();
                } else {
                    i2 = this.f25776b.f25755t.mo22570d();
                }
                this.f25763B = i2;
                if (this.f25800z == -1) {
                    this.f25800z = i2;
                }
                boolean l = mo22712l(i);
                int i6 = i2;
                int i7 = 0;
                while (i5 < i - 1) {
                    int i8 = i5 + 1;
                    i6 = mo22661a(i7, i8, i6, false, l);
                    i5 = i8;
                    i7 = i5;
                }
                int a = mo22661a(0, this.f25775a.f25671d - 1, i6, false, l);
                this.f25762A = a;
                this.f25764C = a;
                return;
            }
            C7052c cVar = new C7052c(1);
            cVar.mo22188a(this.f25775a.f25674g[0], this.f25775a.f25674g[1], this.f25775a.f25678k[0]);
            while (i5 < i - 1) {
                i5++;
                int i9 = i5 * 3;
                cVar.mo22192b(this.f25775a.f25674g[i9 + 0], this.f25775a.f25674g[i9 + 1], this.f25775a.f25678k[i5]);
            }
            cVar.mo22191b();
            mo22672a(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public boolean mo22712l(int i) {
            boolean e = mo22698e();
            if (!e) {
                return e;
            }
            boolean z = e;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                z = mo22690c(0, i2);
                if (!z) {
                    return z;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo22707j() {
            if (this.f25785k && this.f25775a.f25673f != 0) {
                this.f25767F = this.f25775a.f25674g;
                this.f25768G = this.f25775a.f25678k;
                this.f25769H = this.f25775a.f25679l;
                if (this.f25794t) {
                    mo22709k();
                } else if (this.f25793s) {
                    mo22738z();
                    mo22711l();
                    mo22652A();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo22709k() {
            int i;
            int i2;
            short s;
            boolean z = !mo22715n();
            int a = this.f25775a.mo22520a(z);
            int b = this.f25775a.mo22531b(z);
            int i3 = this.f25776b.f25756u;
            int i4 = this.f25776b.f25700A;
            this.f25776b.mo22595c(a);
            this.f25776b.mo22599d(b);
            if (this.f25775a.f25669b == 1) {
                i = this.f25776b.f25704E.mo22568c();
            } else {
                i = this.f25776b.f25704E.mo22570d();
            }
            this.f25763B = i;
            short[] sArr = {-1, -1};
            int[] iArr = {0, 0};
            this.f25776b.f25704E.mo22565a(iArr);
            int i5 = -1;
            int i6 = i;
            int i7 = -1;
            int i8 = -1;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 1; i9 <= this.f25775a.f25673f - i12; i12 = 1) {
                int[] iArr2 = this.f25775a.f25681n[i9];
                int i13 = iArr2[0];
                int i14 = iArr2[i12];
                if (!z) {
                    i2 = i9;
                    s = -1;
                    if (iArr2[2] != -1) {
                        i6 = mo22660a(i13, i14, i7, i8, i6, null, false);
                    }
                } else if (iArr2[2] == i5) {
                    i2 = i9;
                    s = -1;
                    i6 = mo22680b(i10, i11, i7, i8, i6, sArr, false);
                } else {
                    i2 = i9;
                    s = -1;
                    i6 = mo22660a(i13, i14, i7, i8, i6, sArr, false);
                }
                if (iArr2[2] == 1) {
                    i10 = i13;
                    i11 = i14;
                }
                if (iArr2[2] == 2 || iArr2[2] == 3 || iArr2[2] == s) {
                    sArr[1] = s;
                    sArr[0] = s;
                    i7 = -1;
                    i8 = -1;
                } else {
                    i7 = i13;
                    i8 = i14;
                }
                i9 = i2 + 1;
                i5 = -1;
            }
            this.f25776b.f25704E.mo22565a((int[]) null);
            this.f25776b.f25700A = i4 + iArr[0];
            this.f25776b.f25756u = i3 + iArr[1];
            this.f25764C = i6;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo22711l() {
            int i;
            int a = this.f25775a.mo22520a(false);
            if (mo22714m(a)) {
                int b = this.f25775a.mo22531b(false);
                this.f25776b.mo22576a(a);
                this.f25776b.mo22591b(b);
                if (this.f25775a.f25669b == 1) {
                    i = this.f25776b.f25755t.mo22568c();
                } else {
                    i = this.f25776b.f25755t.mo22570d();
                }
                this.f25763B = i;
                if (this.f25800z == -1) {
                    this.f25800z = i;
                }
                boolean m = mo22713m();
                int i2 = i;
                for (int i3 = 0; i3 <= this.f25775a.f25673f - 1; i3++) {
                    int[] iArr = this.f25775a.f25681n[i3];
                    if (iArr[2] != -1) {
                        i2 = mo22661a(iArr[0], iArr[1], i2, false, m);
                    }
                }
                this.f25762A = i2;
                this.f25764C = i2;
                return;
            }
            C7052c cVar = new C7052c(1);
            for (int i4 = 0; i4 <= this.f25775a.f25673f - 1; i4++) {
                int[] iArr2 = this.f25775a.f25681n[i4];
                int i5 = iArr2[0];
                int i6 = iArr2[1];
                switch (iArr2[2]) {
                    case -1:
                        cVar.mo22191b();
                        break;
                    case 0:
                        int i7 = i6 * 3;
                        cVar.mo22192b(this.f25767F[i7 + 0], this.f25767F[i7 + 1], this.f25768G[i6]);
                        break;
                    case 1:
                        int i8 = i5 * 3;
                        cVar.mo22188a(this.f25767F[i8 + 0], this.f25767F[i8 + 1], this.f25768G[i5]);
                        int i9 = i6 * 3;
                        cVar.mo22192b(this.f25767F[i9 + 0], this.f25767F[i9 + 1], this.f25768G[i6]);
                        break;
                    case 2:
                        int i10 = i6 * 3;
                        int i11 = i10 + 0;
                        int i12 = i10 + 1;
                        cVar.mo22192b(this.f25767F[i11], this.f25767F[i12], this.f25768G[i6]);
                        cVar.mo22188a(this.f25767F[i11], this.f25767F[i12], this.f25768G[i6]);
                        break;
                    case 3:
                        int i13 = i5 * 3;
                        cVar.mo22188a(this.f25767F[i13 + 0], this.f25767F[i13 + 1], this.f25768G[i5]);
                        int i14 = i6 * 3;
                        int i15 = i14 + 0;
                        int i16 = i14 + 1;
                        cVar.mo22192b(this.f25767F[i15], this.f25767F[i16], this.f25768G[i6]);
                        cVar.mo22188a(this.f25767F[i15], this.f25767F[i16], this.f25768G[i6]);
                        break;
                }
            }
            mo22672a(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public boolean mo22713m() {
            boolean e = mo22698e();
            if (!e) {
                return e;
            }
            boolean z = e;
            for (int i = 0; i <= this.f25775a.f25673f - 1; i++) {
                int[] iArr = this.f25775a.f25681n[i];
                if (iArr[2] != -1) {
                    z = mo22679a(this.f25767F, iArr[0], iArr[1]);
                    if (!z) {
                        return z;
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22660a(int i, int i2, int i3, int i4, int i5, short[] sArr, boolean z) {
            boolean z2;
            int i6;
            int i7;
            short s;
            int i8;
            char c;
            int i9 = i;
            int i10 = i3;
            int i11 = i4;
            C7076j jVar = this.f25776b.f25704E;
            int i12 = jVar.f25697d[i5];
            if (C7056e.f25356s <= i12 + 4 + ((sArr == null || -1 >= sArr[0] || -1 >= sArr[1]) ? 0 : 1)) {
                i7 = jVar.mo22568c();
                i6 = 0;
                z2 = true;
            } else {
                i7 = i5;
                i6 = i12;
                z2 = false;
            }
            int i13 = jVar.f25696c[i7] + jVar.f25695b[i7];
            int i14 = jVar.f25697d[i7] + jVar.f25698e[i7];
            float o = (z ? this.f25787m : this.f25769H[i9]) * mo22717o();
            int i15 = i14 + 1;
            float f = o / 2.0f;
            float f2 = o;
            int i16 = i;
            int i17 = z ? this.f25786l : this.f25768G[i9];
            int i18 = i2;
            int i19 = i7;
            int i20 = i17;
            this.f25776b.mo22583a(i14, this.f25767F, i16, i18, i20, f);
            int i21 = i13 + 1;
            short s2 = (short) (i6 + 0);
            this.f25776b.f25729ac[i13] = s2;
            int i22 = i15 + 1;
            int i23 = i15;
            short s3 = s2;
            this.f25776b.mo22583a(i23, this.f25767F, i16, i18, i20, (-f2) / 2.0f);
            int i24 = i21 + 1;
            short s4 = (short) (i6 + 1);
            this.f25776b.f25729ac[i21] = s4;
            int i25 = z ? this.f25786l : this.f25768G[i2];
            float o2 = (z ? this.f25787m : this.f25769H[i2]) * mo22717o();
            int i26 = i22 + 1;
            int i27 = i22;
            int i28 = i2;
            int i29 = i;
            float f3 = o2;
            short s5 = s4;
            this.f25776b.mo22583a(i27, this.f25767F, i28, i29, i25, (-o2) / 2.0f);
            int i30 = i24 + 1;
            short s6 = (short) (i6 + 2);
            this.f25776b.f25729ac[i24] = s6;
            int i31 = i30 + 1;
            this.f25776b.f25729ac[i30] = s6;
            int i32 = i31 + 1;
            this.f25776b.f25729ac[i31] = s5;
            int i33 = i26 + 1;
            int i34 = i25;
            short s7 = s6;
            this.f25776b.mo22583a(i26, this.f25767F, i28, i29, i34, f3 / 2.0f);
            int i35 = i32 + 1;
            short s8 = (short) (i6 + 3);
            this.f25776b.f25729ac[i32] = s8;
            jVar.mo22564a(i19, 6, 4);
            if (sArr == null) {
                return i19;
            }
            if (-1 < sArr[0] && -1 < sArr[1]) {
                if (!z2) {
                    s = s8;
                    i8 = i19;
                    this.f25776b.mo22582a(i33, this.f25767F, i, i17);
                    int i36 = i35 + 1;
                    short s9 = (short) (i6 + 4);
                    this.f25776b.f25729ac[i35] = s9;
                    int i37 = i36 + 1;
                    this.f25776b.f25729ac[i36] = sArr[0];
                    int i38 = i37 + 1;
                    this.f25776b.f25729ac[i37] = s3;
                    int i39 = i38 + 1;
                    this.f25776b.f25729ac[i38] = s9;
                    int i40 = i39 + 1;
                    c = 1;
                    this.f25776b.f25729ac[i39] = sArr[1];
                    this.f25776b.f25729ac[i40] = s5;
                    jVar.mo22564a(i8, 6, 1);
                    sArr[0] = s7;
                    sArr[c] = s;
                    return i8;
                } else if (-1 < i10) {
                    int i41 = i4;
                    if (-1 < i41) {
                        int i42 = z ? this.f25786l : this.f25768G[i10];
                        float o3 = (z ? this.f25787m : this.f25769H[i10]) * mo22717o();
                        int i43 = i33 + 1;
                        this.f25776b.mo22582a(i33, this.f25767F, i41, i42);
                        int i44 = i43 + 1;
                        int i45 = i4;
                        int i46 = i42;
                        int i47 = i3;
                        int i48 = i46;
                        s = s8;
                        this.f25776b.mo22583a(i43, this.f25767F, i45, i47, i48, (-o3) / 2.0f);
                        this.f25776b.mo22583a(i44, this.f25767F, i45, i47, i48, o3 / 2.0f);
                        int i49 = i35 + 1;
                        short s10 = (short) (i6 + 4);
                        this.f25776b.f25729ac[i35] = s10;
                        int i50 = i49 + 1;
                        this.f25776b.f25729ac[i49] = (short) (i6 + 5);
                        int i51 = i50 + 1;
                        this.f25776b.f25729ac[i50] = s3;
                        int i52 = i51 + 1;
                        this.f25776b.f25729ac[i51] = s10;
                        int i53 = i52 + 1;
                        this.f25776b.f25729ac[i52] = (short) (i6 + 6);
                        this.f25776b.f25729ac[i53] = s5;
                        jVar.mo22564a(i19, 6, 3);
                        i8 = i19;
                        c = 1;
                        sArr[0] = s7;
                        sArr[c] = s;
                        return i8;
                    }
                }
            }
            s = s8;
            i8 = i19;
            c = 1;
            sArr[0] = s7;
            sArr[c] = s;
            return i8;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo22680b(int i, int i2, int i3, int i4, int i5, short[] sArr, boolean z) {
            int i6;
            boolean z2;
            int i7;
            int i8;
            int i9 = i;
            int i10 = i4;
            C7076j jVar = this.f25776b.f25704E;
            int i11 = jVar.f25697d[i5];
            if (C7056e.f25356s <= i11 + 3) {
                i7 = jVar.mo22568c();
                z2 = true;
                i6 = 0;
            } else {
                i7 = i5;
                i6 = i11;
                z2 = false;
            }
            int i12 = jVar.f25696c[i7] + jVar.f25695b[i7];
            int i13 = jVar.f25698e[i7] + jVar.f25697d[i7];
            int i14 = z ? this.f25786l : this.f25768G[i9];
            float o = (z ? this.f25787m : this.f25769H[i9]) * mo22717o();
            int i15 = i13 + 1;
            this.f25776b.mo22582a(i13, this.f25767F, i9, i14);
            int i16 = i15 + 1;
            int i17 = i;
            int i18 = i2;
            float f = o;
            int i19 = i14;
            this.f25776b.mo22583a(i15, this.f25767F, i17, i18, i14, o / 2.0f);
            int i20 = i16 + 1;
            this.f25776b.mo22583a(i16, this.f25767F, i17, i18, i19, (-f) / 2.0f);
            if (!z2 || -1 >= i3 || -1 >= i10) {
                i8 = 0;
            } else {
                float o2 = (z ? this.f25787m : this.f25769H[i10]) * mo22717o();
                int i21 = i20 + 1;
                int i22 = i4;
                int i23 = i3;
                int i24 = z ? this.f25786l : this.f25768G[i10];
                this.f25776b.mo22583a(i20, this.f25767F, i22, i23, i24, (-o2) / 2.0f);
                this.f25776b.mo22583a(i21, this.f25767F, i22, i23, i24, o2 / 2.0f);
                sArr[0] = (short) (i6 + 3);
                sArr[1] = (short) (i6 + 4);
                i8 = 2;
            }
            int i25 = i12 + 1;
            short s = (short) (i6 + 0);
            this.f25776b.f25729ac[i12] = s;
            int i26 = i25 + 1;
            this.f25776b.f25729ac[i25] = sArr[0];
            int i27 = i26 + 1;
            this.f25776b.f25729ac[i26] = (short) (i6 + 1);
            int i28 = i27 + 1;
            this.f25776b.f25729ac[i27] = s;
            int i29 = i28 + 1;
            this.f25776b.f25729ac[i28] = (short) (i6 + 2);
            this.f25776b.f25729ac[i29] = sArr[1];
            jVar.mo22564a(i7, 6, i8 + 3);
            return i7;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22661a(int i, int i2, int i3, boolean z, boolean z2) {
            int i4;
            int i5;
            float f;
            float f2;
            float f3;
            float f4;
            int i6;
            float f5;
            int i7;
            float f6;
            C7076j jVar = this.f25776b.f25755t;
            int i8 = jVar.f25697d[i3];
            if (C7056e.f25356s <= i8 + 4) {
                i5 = jVar.mo22568c();
                i4 = 0;
            } else {
                i4 = i8;
                i5 = i3;
            }
            int i9 = jVar.f25696c[i5] + jVar.f25695b[i5];
            int i10 = jVar.f25698e[i5] + jVar.f25697d[i5];
            int i11 = z ? this.f25786l : this.f25768G[i];
            float f7 = z ? this.f25787m : this.f25769H[i];
            boolean z3 = mo22686b(f7) ? false : z2;
            int i12 = i * 3;
            float f8 = this.f25767F[i12 + 0];
            float f9 = this.f25767F[i12 + 1];
            int i13 = i2 * 3;
            float f10 = this.f25767F[i13 + 0];
            float f11 = this.f25767F[i13 + 1];
            float f12 = f10 - f8;
            float f13 = f11 - f9;
            float c = C6982a.m36418c((f12 * f12) + (f13 * f13));
            if (C7065i.m37511j(c)) {
                float f14 = f12 / c;
                float f15 = f7 / 2.0f;
                f = C6982a.m36398a(0.75f, f15) * (f13 / c);
                f3 = f14;
                f4 = (-f13) / c;
                f2 = C6982a.m36398a(0.75f, f15) * f14;
            } else {
                f4 = 0.0f;
                f3 = 0.0f;
                f2 = 0.0f;
                f = 0.0f;
            }
            float f16 = (f4 * f7) / 2.0f;
            float f17 = (f7 * f3) / 2.0f;
            int i14 = i10 + 1;
            float f18 = (f8 + f16) - f2;
            float f19 = (f9 + f17) - f;
            float f20 = f19;
            C7076j jVar2 = jVar;
            float f21 = f18;
            this.f25776b.mo22578a(i10, f18, f19, 0.0f, i11, z3);
            int i15 = i9 + 1;
            short s = (short) (i4 + 0);
            this.f25776b.f25724Y[i9] = s;
            int i16 = i14 + 1;
            float f22 = (f8 - f16) - f2;
            float f23 = (f9 - f17) - f;
            short s2 = s;
            this.f25776b.mo22578a(i14, f22, f23, 0.0f, i11, z3);
            int i17 = i15 + 1;
            this.f25776b.f25724Y[i15] = (short) (i4 + 1);
            if (z3) {
                int i18 = i16 - 2;
                int i19 = i18 * 4;
                float f24 = this.f25776b.f25716Q[i19 + 0];
                i7 = i11;
                float f25 = this.f25776b.f25716Q[i19 + 1];
                f5 = f17;
                int i20 = i16 - 1;
                int i21 = i20 * 4;
                float f26 = this.f25776b.f25716Q[i21 + 0];
                i6 = i5;
                float f27 = this.f25776b.f25716Q[i21 + 1];
                if (C7065i.m37505g(f24, f26) && C7065i.m37505g(f25, f27)) {
                    mo22666a(i18, f21, f20);
                    mo22666a(i20, f22, f23);
                }
            } else {
                i6 = i5;
                i7 = i11;
                f5 = f17;
            }
            if (!z) {
                int i22 = this.f25768G[i2];
                float f28 = this.f25769H[i2];
                f16 = (f4 * f28) / 2.0f;
                f6 = (f3 * f28) / 2.0f;
                if (mo22686b(f28)) {
                    i7 = i22;
                    z3 = false;
                } else {
                    i7 = i22;
                }
            } else {
                f6 = f5;
            }
            int i23 = i16 + 1;
            float f29 = (f10 - f16) + f2;
            float f30 = (f11 - f6) + f;
            this.f25776b.mo22578a(i16, f29, f30, 0.0f, i7, z3);
            int i24 = i17 + 1;
            short s3 = (short) (i4 + 2);
            this.f25776b.f25724Y[i17] = s3;
            int i25 = i24 + 1;
            this.f25776b.f25724Y[i24] = s3;
            int i26 = i25 + 1;
            this.f25776b.f25724Y[i25] = s2;
            int i27 = i23 + 1;
            float f31 = f10 + f16 + f2;
            float f32 = f11 + f6 + f;
            this.f25776b.mo22578a(i23, f31, f32, 0.0f, i7, z3);
            this.f25776b.f25724Y[i26] = (short) (i4 + 3);
            if (z3) {
                int i28 = i27 - 2;
                int i29 = i28 * 4;
                float f33 = this.f25776b.f25716Q[i29 + 0];
                float f34 = this.f25776b.f25716Q[i29 + 1];
                int i30 = i27 - 1;
                int i31 = i30 * 4;
                float f35 = this.f25776b.f25716Q[i31 + 0];
                float f36 = this.f25776b.f25716Q[i31 + 1];
                if (C7065i.m37505g(f33, f35) && C7065i.m37505g(f34, f36)) {
                    mo22666a(i28, f29, f30);
                    mo22666a(i30, f31, f32);
                }
            }
            int i32 = i6;
            jVar2.mo22564a(i32, 6, 4);
            return i32;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22666a(int i, float f, float f2) {
            C6995g gVar = this.f25795u.f25527dU;
            int i2 = i * 4;
            int i3 = i2 + 1;
            this.f25776b.f25716Q[i2] = (gVar.f24769a * f) + (gVar.f24770b * f2) + gVar.f24772d;
            this.f25776b.f25716Q[i3] = (f * gVar.f24773e) + (f2 * gVar.f24774f) + gVar.f24776h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public boolean mo22714m(int i) {
            if (this.f25790p && C7056e.f25361x > i) {
                return mo22715n();
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo22686b(float f) {
            float o = mo22717o() * f;
            return C6982a.m36397a(o - ((float) ((int) o))) > 0.0f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public boolean mo22715n() {
            return this.f25776b.f25726a == 0 && mo22717o() * this.f25787m < C7056e.f25360w;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public float mo22717o() {
            if (-1.0f < this.f25792r) {
                return this.f25792r;
            }
            float a = C7065i.m37476a(this.f25791q);
            this.f25792r = a;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo22690c(int i, int i2) {
            int i3 = i * 3;
            int i4 = i2 * 3;
            if (C7065i.m37509i(this.f25775a.f25674g[i3 + 0] - this.f25775a.f25674g[i4 + 0]) || C7065i.m37509i(this.f25775a.f25674g[i3 + 1] - this.f25775a.f25674g[i4 + 1])) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo22679a(float[] fArr, int i, int i2) {
            int i3 = i * 3;
            int i4 = i2 * 3;
            if (C7065i.m37509i(fArr[i3 + 0] - fArr[i4 + 0]) || C7065i.m37509i(fArr[i3 + 1] - fArr[i4 + 1])) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public void mo22719p() {
            mo22735x();
            int i = this.f25775a.f25671d / 3;
            if (this.f25784j && 1 <= i) {
                int i2 = i * 3;
                mo22724r(i2);
                boolean q = mo22722q();
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                    int i5 = i4 + 1;
                    this.f25796v[i4] = i3;
                    i3++;
                    i4 = i5;
                }
                mo22694d(q);
            }
            mo22737y();
            mo22707j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public boolean mo22722q() {
            boolean e = mo22698e();
            if (!e) {
                return e;
            }
            int i = this.f25775a.f25671d / 3;
            boolean z = e;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 3;
                int i4 = i3 + 0;
                int i5 = i3 + 1;
                int i6 = i3 + 2;
                int i7 = mo22690c(i4, i5) ? 1 : 0;
                if (mo22690c(i4, i6)) {
                    i7++;
                }
                if (mo22690c(i5, i6)) {
                    i7++;
                }
                z = 1 < i7;
                if (!z) {
                    return z;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public void mo22723r() {
            mo22735x();
            int i = this.f25775a.f25671d;
            if (this.f25784j && 3 <= i) {
                mo22724r((i - 2) * 3);
                boolean s = mo22726s();
                int i2 = 1;
                int i3 = 0;
                while (i2 < this.f25775a.f25671d - 1) {
                    int i4 = i3 + 1;
                    this.f25796v[i3] = 0;
                    int i5 = i4 + 1;
                    this.f25796v[i4] = i2;
                    int i6 = i5 + 1;
                    i2++;
                    this.f25796v[i5] = i2;
                    i3 = i6;
                }
                mo22694d(s);
            }
            mo22737y();
            mo22707j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public boolean mo22726s() {
            boolean e = mo22698e();
            if (!e) {
                return e;
            }
            boolean z = e;
            int i = 1;
            while (i < this.f25775a.f25671d - 1) {
                int i2 = i + 1;
                boolean z2 = false;
                int i3 = mo22690c(0, i) ? 1 : 0;
                if (mo22690c(0, i2)) {
                    i3++;
                }
                if (mo22690c(i, i2)) {
                    i3++;
                }
                if (1 < i3) {
                    z2 = true;
                }
                if (!z2) {
                    return z2;
                }
                i = i2;
                z = z2;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public void mo22727t() {
            int i;
            mo22735x();
            int i2 = this.f25775a.f25671d;
            if (this.f25784j && 3 <= i2) {
                mo22724r((i2 - 2) * 3);
                boolean u = mo22730u();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f25775a.f25671d - 1; i4++) {
                    int i5 = i3 + 1;
                    this.f25796v[i3] = i4;
                    if (i4 % 2 == 0) {
                        int i6 = i5 + 1;
                        this.f25796v[i5] = i4 - 1;
                        i = i6 + 1;
                        this.f25796v[i6] = i4 + 1;
                    } else {
                        int i7 = i5 + 1;
                        this.f25796v[i5] = i4 + 1;
                        i = i7 + 1;
                        this.f25796v[i7] = i4 - 1;
                    }
                    i3 = i;
                }
                mo22694d(u);
            }
            mo22737y();
            mo22707j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public boolean mo22730u() {
            int i;
            int i2;
            boolean e = mo22698e();
            if (!e) {
                return e;
            }
            boolean z = e;
            for (int i3 = 1; i3 < this.f25775a.f25671d - 1; i3++) {
                if (i3 % 2 == 0) {
                    i2 = i3 - 1;
                    i = i3 + 1;
                } else {
                    i2 = i3 + 1;
                    i = i3 - 1;
                }
                int i4 = mo22690c(i3, i2) ? 1 : 0;
                if (mo22690c(i3, i)) {
                    i4++;
                }
                if (mo22690c(i2, i)) {
                    i4++;
                }
                z = 1 < i4;
                if (!z) {
                    return z;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo22731v() {
            mo22735x();
            int i = this.f25775a.f25671d / 4;
            if (this.f25784j && 1 <= i) {
                mo22724r(i * 6);
                boolean n = mo22716n(i);
                int i2 = 0;
                int i3 = 0;
                while (i2 < i) {
                    int i4 = i2 * 4;
                    int i5 = i4 + 0;
                    int i6 = i4 + 1;
                    int i7 = i4 + 2;
                    int i8 = i4 + 3;
                    int i9 = i3 + 1;
                    this.f25796v[i3] = i5;
                    int i10 = i9 + 1;
                    this.f25796v[i9] = i6;
                    int i11 = i10 + 1;
                    this.f25796v[i10] = i7;
                    int i12 = i11 + 1;
                    this.f25796v[i11] = i7;
                    int i13 = i12 + 1;
                    this.f25796v[i12] = i8;
                    int i14 = i13 + 1;
                    this.f25796v[i13] = i5;
                    i2++;
                    i3 = i14;
                }
                mo22694d(n);
            }
            mo22737y();
            mo22707j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public boolean mo22716n(int i) {
            boolean e = mo22698e();
            if (!e) {
                return e;
            }
            boolean z = e;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 4;
                int i4 = i3 + 1;
                int i5 = i3 + 2;
                z = mo22690c(i3 + 0, i4) && mo22690c(i4, i5) && mo22690c(i5, i3 + 3);
                if (!z) {
                    return z;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public void mo22733w() {
            mo22735x();
            int i = (this.f25775a.f25671d / 2) - 1;
            if (this.f25784j && 1 <= i) {
                mo22724r(i * 6);
                boolean o = mo22718o(i);
                int i2 = 1;
                int i3 = 0;
                while (i2 < i + 1) {
                    int i4 = (i2 - 1) * 2;
                    int i5 = i4 + 1;
                    int i6 = i2 * 2;
                    int i7 = i6 + 1;
                    int i8 = i3 + 1;
                    this.f25796v[i3] = i4;
                    int i9 = i8 + 1;
                    this.f25796v[i8] = i5;
                    int i10 = i9 + 1;
                    this.f25796v[i9] = i6;
                    int i11 = i10 + 1;
                    this.f25796v[i10] = i5;
                    int i12 = i11 + 1;
                    this.f25796v[i11] = i7;
                    int i13 = i12 + 1;
                    this.f25796v[i12] = i6;
                    i2++;
                    i3 = i13;
                }
                mo22694d(o);
            }
            mo22737y();
            mo22707j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public boolean mo22718o(int i) {
            boolean e = mo22698e();
            if (!e) {
                return e;
            }
            boolean z = e;
            for (int i2 = 1; i2 < i + 1; i2++) {
                int i3 = (i2 - 1) * 2;
                int i4 = i3 + 1;
                int i5 = i2 * 2;
                int i6 = i5 + 1;
                z = mo22690c(i3, i4) && mo22690c(i4, i6) && mo22690c(i6, i5);
                if (!z) {
                    return z;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22694d(boolean z) {
            int i;
            C7076j jVar;
            boolean z2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            boolean z3 = z;
            this.f25776b.mo22591b(this.f25797w);
            int i9 = this.f25776b.f25752q;
            this.f25799y = 0;
            C7076j jVar2 = this.f25776b.f25755t;
            int c = this.f25775a.f25669b == 1 ? jVar2.mo22568c() : jVar2.mo22570d();
            this.f25800z = c;
            int i10 = this.f25797w / 3;
            int i11 = -1;
            int i12 = c;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = -1;
            int i18 = 0;
            while (i13 < i10) {
                if (i12 == i11) {
                    i12 = jVar2.mo22568c();
                }
                int i19 = i13 * 3;
                int i20 = this.f25796v[i19 + 0];
                int i21 = this.f25796v[i19 + 1];
                int i22 = i19 + 2;
                int i23 = this.f25796v[i22];
                int i24 = i18;
                int i25 = i20 - i14;
                int i26 = i21 - i14;
                int i27 = i22;
                int i28 = i23 - i14;
                int i29 = i14;
                int i30 = jVar2.f25697d[i12];
                if (i25 < 0) {
                    mo22720p(i25);
                } else {
                    i25 += i30;
                }
                if (i26 < 0) {
                    mo22720p(i26);
                } else {
                    i26 += i30;
                }
                if (i28 < 0) {
                    mo22720p(i28);
                } else {
                    i28 += i30;
                }
                int i31 = i9 + i19;
                C7076j jVar3 = jVar2;
                this.f25776b.f25724Y[i31 + 0] = (short) i25;
                int i32 = i12;
                this.f25776b.f25724Y[i31 + 1] = (short) i26;
                this.f25776b.f25724Y[i31 + 2] = (short) i28;
                i15 = C6982a.m36420c(i15, C6982a.m36401a(i20, i21, i23));
                int d = C6982a.m36422d(i16, C6982a.m36417b(i20, i21, i23));
                int c2 = C6982a.m36420c(i17, C6982a.m36401a(i25, i26, i28));
                if ((C7056e.f25356s - 3 > this.f25799y + c2 || this.f25799y + c2 >= C7056e.f25356s) && i13 != i10 - 1) {
                    jVar = jVar3;
                    i = i32;
                    z2 = z;
                    i2 = d;
                    i18 = i24;
                    i3 = c2;
                    i4 = i29;
                } else {
                    if (this.f25799y > 0) {
                        i6 = i27;
                        for (int i33 = i24; i33 <= i6; i33++) {
                            int i34 = i9 + i33;
                            short s = this.f25776b.f25724Y[i34];
                            if (s < 0) {
                                this.f25776b.f25724Y[i34] = (short) (c2 + 1 + mo22721q(s));
                            }
                        }
                        int i35 = i29;
                        if (i35 <= i15) {
                            z2 = z;
                            this.f25776b.mo22584a(this.f25775a, i35, i15, z2);
                            i7 = (i15 - i35) + 1;
                        } else {
                            z2 = z;
                            i7 = 0;
                        }
                        for (int i36 = 0; i36 < this.f25799y; i36++) {
                            this.f25776b.mo22585a(this.f25775a, this.f25798x[i36] + i35, z2);
                        }
                        i5 = 1;
                    } else {
                        i6 = i27;
                        z2 = z;
                        this.f25776b.mo22584a(this.f25775a, d, i15, z2);
                        i5 = 1;
                        i7 = (i15 - d) + 1;
                    }
                    jVar = jVar3;
                    int i37 = i32;
                    jVar.mo22564a(i37, (i6 - i24) + i5, i7 + this.f25799y);
                    this.f25762A = i37;
                    i4 = i15 + 1;
                    int i38 = i6 + 1;
                    if (this.f25798x != null) {
                        i8 = 0;
                        Arrays.fill(this.f25798x, 0, this.f25799y, 0);
                    } else {
                        i8 = 0;
                    }
                    this.f25799y = i8;
                    i2 = i4;
                    i18 = i38;
                    i3 = -1;
                    i = -1;
                }
                i13++;
                i17 = i3;
                i12 = i;
                i16 = i2;
                jVar2 = jVar;
                i14 = i4;
                boolean z4 = z2;
                i11 = -1;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public void mo22720p(int i) {
            if (this.f25798x == null) {
                this.f25798x = new int[16];
            }
            int i2 = 0;
            if (this.f25798x.length == this.f25799y) {
                int[] iArr = new int[(this.f25799y << 1)];
                C6982a.m36406a((Object) this.f25798x, 0, (Object) iArr, 0, this.f25799y);
                this.f25798x = iArr;
            }
            if (i < this.f25798x[0]) {
                for (int i3 = this.f25799y; i3 > 0; i3--) {
                    this.f25798x[i3] = this.f25798x[i3 - 1];
                }
                this.f25798x[0] = i;
                this.f25799y++;
            } else if (this.f25798x[this.f25799y - 1] < i) {
                this.f25798x[this.f25799y] = i;
                this.f25799y++;
            } else {
                while (i2 < this.f25799y - 1 && this.f25798x[i2] != i) {
                    if (this.f25798x[i2] < i) {
                        int i4 = i2 + 1;
                        if (i < this.f25798x[i4]) {
                            for (int i5 = this.f25799y; i5 > i4; i5--) {
                                this.f25798x[i5] = this.f25798x[i5 - 1];
                            }
                            this.f25798x[i4] = i;
                            this.f25799y++;
                            return;
                        }
                    }
                    i2++;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public int mo22721q(int i) {
            for (int i2 = 0; i2 < this.f25799y; i2++) {
                if (this.f25798x[i2] == i) {
                    return i2;
                }
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public void mo22724r(int i) {
            int length = this.f25796v.length;
            if (length < i) {
                mo22725s(C7065i.m37501f(length, i));
            }
            this.f25797w = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public void mo22725s(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25796v, 0, (Object) iArr, 0, this.f25797w);
            this.f25796v = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public void mo22735x() {
            mo22693d(this.f25776b.f25751p, this.f25776b.f25755t.f25694a - 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: y */
        public void mo22737y() {
            mo22696e(this.f25776b.f25753r, this.f25776b.f25755t.f25694a - 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public void mo22738z() {
            this.f25779e = null;
            mo22693d(this.f25776b.f25751p, this.f25776b.f25755t.f25694a - 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A */
        public void mo22652A() {
            mo22696e(this.f25776b.f25753r, this.f25776b.f25755t.f25694a - 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: B */
        public void mo22653B() {
            mo22735x();
            mo22737y();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22693d(int i, int i2) {
            if (this.f25777c != null) {
                this.f25780f = i;
                this.f25781g = C6982a.m36420c(0, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22696e(int i, int i2) {
            if (this.f25777c != null) {
                if (this.f25778d != this.f25779e || this.f25777c.f25813b == 0) {
                    this.f25777c.mo22745a(this.f25779e, this.f25780f, this.f25781g, i, i2);
                } else {
                    this.f25777c.mo22744a(i, i2);
                }
                this.f25778d = this.f25779e;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22678a(boolean z, boolean z2, boolean z3) {
            boolean z4;
            int i;
            int i2;
            mo22735x();
            if (3 <= this.f25775a.f25671d) {
                this.f25800z = -1;
                mo22662a();
                this.f25783i.mo22740a(this.f25775a.f25669b == 1, false, z3, mo22658G());
                if (this.f25784j) {
                    this.f25782h.mo22386a();
                    if (z) {
                        this.f25782h.mo22387a(C7056e.f25120bO);
                    } else {
                        this.f25782h.mo22387a(C7056e.f25121bP);
                    }
                    this.f25782h.mo22390c();
                }
                if (this.f25785k) {
                    mo22654C();
                    mo22656E();
                }
                int i3 = 0;
                int i4 = 0;
                while (i3 < this.f25775a.f25671d) {
                    if (this.f25775a.f25680m == null || i4 >= this.f25775a.f25672e) {
                        i = i4;
                        z4 = false;
                        i2 = 0;
                    } else {
                        i = i4 + 1;
                        int i5 = this.f25775a.f25680m[i4];
                        if (i5 != 4 || i >= this.f25775a.f25672e) {
                            i2 = i5;
                            z4 = false;
                        } else {
                            int i6 = i + 1;
                            int i7 = this.f25775a.f25680m[i];
                            i = i6;
                            i2 = i7;
                            z4 = true;
                        }
                    }
                    if (z4) {
                        if (this.f25785k) {
                            mo22697e(z2);
                            mo22656E();
                        }
                        if (this.f25784j) {
                            this.f25782h.mo22391d();
                            this.f25782h.mo22390c();
                        }
                    }
                    if (i2 == 1) {
                        mo22728t(i3);
                        i3 += 3;
                    } else if (i2 == 2) {
                        mo22729u(i3);
                        i3 += 2;
                    } else if (i2 == 3) {
                        mo22732v(i3);
                        i3++;
                    } else {
                        mo22734w(i3);
                        i3++;
                    }
                    i4 = i;
                }
                if (this.f25785k) {
                    mo22697e(z2);
                    mo22655D();
                }
                if (this.f25784j) {
                    this.f25782h.mo22391d();
                    this.f25782h.mo22389b();
                }
            }
            mo22737y();
            if (this.f25785k) {
                mo22657F();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public void mo22728t(int i) {
            float f;
            int i2;
            double[] dArr;
            float f2;
            int i3 = i;
            this.f25795u.f24681bC = 0;
            this.f25795u.mo21916K();
            this.f25795u.mo21965c(20, i3);
            C6995g g = this.f25795u.f24722bt;
            int i4 = (i3 - 1) * 3;
            float f3 = this.f25775a.f25674g[i4 + 0];
            float f4 = this.f25775a.f25674g[i4 + 1];
            float f5 = this.f25775a.f25674g[i4 + 2];
            if (this.f25785k) {
                int i5 = this.f25775a.f25678k[i3];
                f = this.f25775a.f25679l[i3];
                i2 = i5;
            } else {
                i2 = 0;
                f = 0.0f;
            }
            double[] x = this.f25784j ? mo22736x(i) : null;
            int i6 = i3 * 3;
            float f6 = this.f25775a.f25674g[i6 + 0];
            float f7 = this.f25775a.f25674g[i6 + 1];
            float f8 = this.f25775a.f25674g[i6 + 2];
            int i7 = (i3 + 1) * 3;
            float f9 = this.f25775a.f25674g[i7 + 0];
            float f10 = this.f25775a.f25674g[i7 + 1];
            float f11 = f;
            float f12 = this.f25775a.f25674g[i7 + 2];
            int i8 = (i3 + 2) * 3;
            float f13 = this.f25775a.f25674g[i8 + 0];
            float f14 = this.f25775a.f25674g[i8 + 1];
            int i9 = i2;
            float f15 = this.f25775a.f25674g[i8 + 2];
            double[] dArr2 = x;
            float f16 = (g.f24773e * f3) + (g.f24774f * f6) + (g.f24775g * f9) + (g.f24776h * f13);
            float f17 = (g.f24777i * f3) + (g.f24778j * f6) + (g.f24779k * f9) + (g.f24780l * f13);
            float f18 = f3;
            float f19 = (g.f24781m * f3) + (g.f24782n * f6) + (g.f24783o * f9) + (g.f24784p * f13);
            float f20 = (g.f24773e * f4) + (g.f24774f * f7) + (g.f24775g * f10) + (g.f24776h * f14);
            float f21 = (g.f24777i * f4) + (g.f24778j * f7) + (g.f24779k * f10) + (g.f24780l * f14);
            float f22 = (g.f24781m * f4) + (g.f24782n * f7) + (g.f24783o * f10) + (g.f24784p * f14);
            float f23 = (g.f24777i * f5) + (g.f24778j * f8) + (g.f24779k * f12) + (g.f24780l * f15);
            float f24 = (g.f24781m * f5) + (g.f24782n * f8) + (g.f24783o * f12) + (g.f24784p * f15);
            float f25 = (g.f24773e * f5) + (g.f24774f * f8) + (g.f24775g * f12) + (g.f24776h * f15);
            int i10 = 0;
            while (i10 < this.f25795u.f24720br) {
                float f26 = f18 + f16;
                f16 += f17;
                f17 += f19;
                float f27 = f4 + f20;
                float f28 = f20 + f21;
                float f29 = f21 + f22;
                float f30 = f5 + f25;
                float f31 = f25 + f23;
                f23 += f24;
                if (this.f25784j) {
                    dArr = dArr2;
                    double[] copyOf = Arrays.copyOf(dArr, dArr.length);
                    copyOf[0] = (double) f26;
                    copyOf[1] = (double) f27;
                    copyOf[2] = (double) f30;
                    this.f25782h.mo22388a(copyOf);
                } else {
                    dArr = dArr2;
                }
                if (this.f25785k) {
                    dArr2 = dArr;
                    f2 = f30;
                    mo22664a(f26, f27, f30, i9, f11);
                } else {
                    dArr2 = dArr;
                    f2 = f30;
                }
                i10++;
                f4 = f27;
                f20 = f28;
                f21 = f29;
                f25 = f31;
                f5 = f2;
                f18 = f26;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public void mo22729u(int i) {
            float f;
            int i2;
            float f2;
            float f3;
            int i3 = i;
            this.f25795u.f24681bC = 0;
            this.f25795u.mo21916K();
            this.f25795u.mo21965c(20, i3);
            C6995g i4 = this.f25795u.f24722bt;
            int i5 = (i3 - 1) * 3;
            float f4 = this.f25775a.f25674g[i5 + 0];
            float f5 = this.f25775a.f25674g[i5 + 1];
            float f6 = this.f25775a.f25674g[i5 + 2];
            if (this.f25785k) {
                int i6 = this.f25775a.f25678k[i3];
                f = this.f25775a.f25679l[i3];
                i2 = i6;
            } else {
                i2 = 0;
                f = 0.0f;
            }
            double[] x = this.f25784j ? mo22736x(i) : null;
            int i7 = i3 * 3;
            float f7 = this.f25775a.f25674g[i7 + 0];
            float f8 = this.f25775a.f25674g[i7 + 1];
            float f9 = this.f25775a.f25674g[i7 + 2];
            int i8 = (i3 + 1) * 3;
            float f10 = this.f25775a.f25674g[i8 + 0];
            float f11 = this.f25775a.f25674g[i8 + 1];
            float f12 = this.f25775a.f25674g[i8 + 2];
            float f13 = (((f7 - f4) * 2.0f) / 3.0f) + f4;
            float f14 = f5 + (((f8 - f5) * 2.0f) / 3.0f);
            float f15 = f6 + (((f9 - f6) * 2.0f) / 3.0f);
            float f16 = (((f7 - f10) * 2.0f) / 3.0f) + f10;
            float f17 = (((f8 - f11) * 2.0f) / 3.0f) + f11;
            float f18 = (((f9 - f12) * 2.0f) / 3.0f) + f12;
            float f19 = f;
            float f20 = (i4.f24773e * f4) + (i4.f24774f * f13) + (i4.f24775g * f16) + (i4.f24776h * f10);
            float f21 = (i4.f24777i * f4) + (i4.f24778j * f13) + (i4.f24779k * f16) + (i4.f24780l * f10);
            float f22 = f4;
            float f23 = (i4.f24781m * f4) + (i4.f24782n * f13) + (i4.f24783o * f16) + (i4.f24784p * f10);
            float f24 = (i4.f24773e * f5) + (i4.f24774f * f14) + (i4.f24775g * f17) + (i4.f24776h * f11);
            float f25 = (i4.f24777i * f5) + (i4.f24778j * f14) + (i4.f24779k * f17) + (i4.f24780l * f11);
            float f26 = (i4.f24781m * f5) + (i4.f24782n * f14) + (i4.f24783o * f17) + (i4.f24784p * f11);
            float f27 = (i4.f24773e * f6) + (i4.f24774f * f15) + (i4.f24775g * f18) + (i4.f24776h * f12);
            float f28 = (i4.f24777i * f6) + (i4.f24778j * f15) + (i4.f24779k * f18) + (i4.f24780l * f12);
            float f29 = f6;
            float f30 = (i4.f24781m * f6) + (i4.f24782n * f15) + (i4.f24783o * f18) + (i4.f24784p * f12);
            float f31 = f21;
            int i9 = 0;
            while (i9 < this.f25795u.f24720br) {
                float f32 = f22 + f20;
                f20 += f31;
                float f33 = f31 + f23;
                float f34 = f5 + f24;
                float f35 = f24 + f25;
                float f36 = f25 + f26;
                float f37 = f29 + f27;
                f27 += f28;
                f28 += f30;
                if (this.f25784j) {
                    double[] copyOf = Arrays.copyOf(x, x.length);
                    copyOf[0] = (double) f32;
                    copyOf[1] = (double) f34;
                    copyOf[2] = (double) f37;
                    this.f25782h.mo22388a(copyOf);
                }
                if (this.f25785k) {
                    f3 = f34;
                    f2 = f37;
                    mo22664a(f32, f34, f37, i2, f19);
                } else {
                    f3 = f34;
                    f2 = f37;
                }
                i9++;
                f31 = f33;
                f24 = f35;
                f25 = f36;
                f5 = f3;
                f29 = f2;
                f22 = f32;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo22732v(int i) {
            int i2 = i;
            this.f25795u.mo21991i(20);
            float[] fArr = this.f25795u.f24680bB[this.f25795u.f24681bC];
            int i3 = i2 * 3;
            fArr[0] = this.f25775a.f25674g[i3 + 0];
            fArr[1] = this.f25775a.f25674g[i3 + 1];
            fArr[2] = this.f25775a.f25674g[i3 + 2];
            this.f25795u.f24681bC = this.f25795u.f24681bC + 1;
            if (this.f25795u.f24681bC == 3) {
                float[] fArr2 = this.f25795u.f24680bB[this.f25795u.f24681bC - 2];
                mo22667a(i2, fArr2[0], fArr2[1], fArr2[2]);
            }
            if (this.f25795u.f24681bC > 3) {
                float[] fArr3 = this.f25795u.f24680bB[this.f25795u.f24681bC - 4];
                float[] fArr4 = this.f25795u.f24680bB[this.f25795u.f24681bC - 3];
                float[] fArr5 = this.f25795u.f24680bB[this.f25795u.f24681bC - 2];
                float[] fArr6 = this.f25795u.f24680bB[this.f25795u.f24681bC - 1];
                mo22668a(i, fArr3[0], fArr3[1], fArr3[2], fArr4[0], fArr4[1], fArr4[2], fArr5[0], fArr5[1], fArr5[2], fArr6[0], fArr6[1], fArr6[2]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22667a(int i, float f, float f2, float f3) {
            if (this.f25784j) {
                double[] x = mo22736x(i);
                x[0] = (double) f;
                x[1] = (double) f2;
                x[2] = (double) f3;
                this.f25782h.mo22388a(x);
            }
            if (this.f25785k) {
                mo22664a(f, f2, f3, this.f25775a.f25678k[i], this.f25787m);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22668a(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
            float f13;
            int i2;
            float f14;
            float f15;
            float f16;
            double[] dArr;
            if (this.f25785k) {
                i2 = this.f25775a.f25678k[i];
                f13 = this.f25775a.f25679l[i];
            } else {
                i2 = 0;
                f13 = 0.0f;
            }
            double[] dArr2 = this.f25784j ? mo22736x(i) : null;
            float f17 = f13;
            C6995g y = this.f25795u.f24727by;
            int i3 = i2;
            double[] dArr3 = dArr2;
            float f18 = (y.f24773e * f) + (y.f24774f * f4) + (y.f24775g * f7) + (y.f24776h * f10);
            float f19 = (y.f24781m * f) + (y.f24782n * f4) + (y.f24783o * f7) + (y.f24784p * f10);
            float f20 = (y.f24777i * f2) + (y.f24778j * f5) + (y.f24779k * f8) + (y.f24780l * f11);
            float f21 = (y.f24781m * f2) + (y.f24782n * f5) + (y.f24783o * f8) + (y.f24784p * f11);
            float f22 = (y.f24777i * f3) + (y.f24778j * f6) + (y.f24779k * f9) + (y.f24780l * f12);
            float f23 = (y.f24781m * f3) + (y.f24782n * f6) + (y.f24783o * f9) + (y.f24784p * f12);
            float f24 = f4;
            float f25 = f5;
            float f26 = f6;
            float f27 = (y.f24773e * f3) + (y.f24774f * f6) + (y.f24775g * f9) + (y.f24776h * f12);
            float f28 = (y.f24773e * f2) + (y.f24774f * f5) + (y.f24775g * f8) + (y.f24776h * f11);
            float f29 = (y.f24777i * f) + (y.f24778j * f4) + (y.f24779k * f7) + (y.f24780l * f10);
            int i4 = 0;
            while (i4 < this.f25795u.f24724bv) {
                f24 += f18;
                f18 += f29;
                float f30 = f29 + f19;
                f25 += f28;
                float f31 = f28 + f20;
                f20 += f21;
                f26 += f27;
                float f32 = f27 + f22;
                f22 += f23;
                if (this.f25784j) {
                    dArr = dArr3;
                    double[] copyOf = Arrays.copyOf(dArr, dArr.length);
                    f16 = f30;
                    f15 = f31;
                    copyOf[0] = (double) f24;
                    copyOf[1] = (double) f25;
                    f14 = f32;
                    copyOf[2] = (double) f26;
                    this.f25782h.mo22388a(copyOf);
                } else {
                    f16 = f30;
                    f15 = f31;
                    f14 = f32;
                    dArr = dArr3;
                }
                if (this.f25785k) {
                    mo22664a(f24, f25, f26, i3, f17);
                }
                i4++;
                dArr3 = dArr;
                f29 = f16;
                f28 = f15;
                f27 = f14;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public void mo22734w(int i) {
            this.f25795u.f24681bC = 0;
            int i2 = i * 3;
            float f = this.f25775a.f25674g[i2 + 0];
            float f2 = this.f25775a.f25674g[i2 + 1];
            float f3 = this.f25775a.f25674g[i2 + 2];
            if (this.f25784j) {
                double[] x = mo22736x(i);
                x[0] = (double) f;
                x[1] = (double) f2;
                x[2] = (double) f3;
                this.f25782h.mo22388a(x);
            }
            if (this.f25785k) {
                mo22664a(f, f2, f3, this.f25775a.f25678k[i], this.f25775a.f25679l[i]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public double[] mo22736x(int i) {
            double[] a = this.f25775a.mo22530a(i);
            double[] dArr = new double[(a.length + 25)];
            int i2 = this.f25775a.f25675h[i];
            dArr[3] = (double) ((i2 >> 24) & 255);
            dArr[4] = (double) ((i2 >> 16) & 255);
            dArr[5] = (double) ((i2 >> 8) & 255);
            dArr[6] = (double) ((i2 >> 0) & 255);
            int i3 = i * 3;
            dArr[7] = (double) this.f25775a.f25676i[i3 + 0];
            dArr[8] = (double) this.f25775a.f25676i[i3 + 1];
            dArr[9] = (double) this.f25775a.f25676i[i3 + 2];
            int i4 = i * 2;
            dArr[10] = (double) this.f25775a.f25677j[i4 + 0];
            dArr[11] = (double) this.f25775a.f25677j[i4 + 1];
            int i5 = this.f25775a.f25682o[i];
            dArr[12] = (double) ((i5 >> 24) & 255);
            dArr[13] = (double) ((i5 >> 16) & 255);
            dArr[14] = (double) ((i5 >> 8) & 255);
            dArr[15] = (double) ((i5 >> 0) & 255);
            int i6 = this.f25775a.f25683p[i];
            dArr[16] = (double) ((i6 >> 24) & 255);
            dArr[17] = (double) ((i6 >> 16) & 255);
            dArr[18] = (double) ((i6 >> 8) & 255);
            dArr[19] = (double) ((i6 >> 0) & 255);
            int i7 = this.f25775a.f25684q[i];
            dArr[20] = (double) ((i7 >> 24) & 255);
            dArr[21] = (double) ((i7 >> 16) & 255);
            dArr[22] = (double) ((i7 >> 8) & 255);
            dArr[23] = (double) ((i7 >> 0) & 255);
            dArr[24] = (double) this.f25775a.f25685r[i];
            System.arraycopy(a, 0, dArr, 25, a.length);
            return dArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: C */
        public void mo22654C() {
            this.f25770I = 0;
            if (this.f25771J == null) {
                this.f25771J = new float[(C7056e.f25349l * 3)];
                this.f25772K = new int[C7056e.f25349l];
                this.f25773L = new float[C7056e.f25349l];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: E */
        public void mo22656E() {
            this.f25774M = this.f25770I;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22697e(boolean z) {
            int i = this.f25770I;
            if (this.f25774M + 1 < i) {
                int i2 = i - 2;
                boolean z2 = this.f25774M == i2;
                boolean z3 = z2 || !z;
                int i3 = i - 1;
                this.f25775a.mo22519a(i2, i3, z2, z3);
                if (!z3) {
                    this.f25775a.mo22519a(i3, this.f25774M, false, false);
                    this.f25775a.mo22518a(i3, this.f25774M);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22664a(float f, float f2, float f3, int i, float f4) {
            int i2 = this.f25770I;
            if (this.f25774M + 1 < i2) {
                int i3 = i2 - 2;
                this.f25775a.mo22519a(i3, i2 - 1, this.f25774M == i3, false);
            }
            if (this.f25770I == this.f25771J.length / 3) {
                int i4 = this.f25770I << 1;
                float[] fArr = new float[(i4 * 3)];
                C6982a.m36406a((Object) this.f25771J, 0, (Object) fArr, 0, this.f25770I * 3);
                this.f25771J = fArr;
                int[] iArr = new int[i4];
                C6982a.m36406a((Object) this.f25772K, 0, (Object) iArr, 0, this.f25770I);
                this.f25772K = iArr;
                float[] fArr2 = new float[i4];
                C6982a.m36406a((Object) this.f25773L, 0, (Object) fArr2, 0, this.f25770I);
                this.f25773L = fArr2;
            }
            int i5 = i2 * 3;
            this.f25771J[i5 + 0] = f;
            this.f25771J[i5 + 1] = f2;
            this.f25771J[i5 + 2] = f3;
            this.f25772K[i2] = i;
            this.f25773L[i2] = f4;
            this.f25770I++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: F */
        public void mo22657F() {
            if (this.f25775a.f25673f != 0) {
                this.f25767F = this.f25771J;
                this.f25768G = this.f25772K;
                this.f25769H = this.f25773L;
                if (this.f25794t) {
                    mo22709k();
                } else if (this.f25793s) {
                    mo22738z();
                    mo22711l();
                    mo22652A();
                }
            }
        }

        /* renamed from: a */
        public void mo22672a(C7052c cVar) {
            mo22662a();
            this.f25783i.mo22740a(this.f25775a.f25669b == 1, true, false, mo22659H());
            int i = this.f25789o == 2 ? 1 : this.f25789o == 4 ? 2 : 0;
            int i2 = this.f25788n == 2 ? 1 : this.f25788n == 32 ? 2 : 0;
            C7052c a = C7052c.m37056a(cVar, this.f25787m, i, i2);
            this.f25782h.mo22386a();
            float[] fArr = new float[6];
            C7054a a2 = a.mo22187a();
            switch (a2.mo22199a()) {
                case 0:
                    this.f25782h.mo22387a(C7056e.f25121bP);
                    break;
                case 1:
                    this.f25782h.mo22387a(C7056e.f25120bO);
                    break;
            }
            while (!a2.mo22201b()) {
                switch (a2.mo22200a(fArr)) {
                    case 0:
                        this.f25782h.mo22390c();
                        break;
                    case 1:
                        break;
                    case 2:
                        this.f25782h.mo22391d();
                        continue;
                }
                this.f25782h.mo22388a(new double[]{(double) fArr[0], (double) fArr[1], 0.0d, (double) fArr[2], (double) fArr[3], (double) fArr[4], (double) fArr[5], 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d});
                a2.mo22202c();
            }
            this.f25782h.mo22389b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: H */
        public boolean mo22659H() {
            return mo22698e() && this.f25789o == 4 && this.f25788n == 32 && !mo22686b(this.f25787m);
        }
    }

    /* renamed from: e.f.i$m */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7080m {

        /* renamed from: a */
        C7065i f25812a;

        /* renamed from: b */
        int f25813b;

        /* renamed from: c */
        C6992d[] f25814c;

        /* renamed from: d */
        int[] f25815d;

        /* renamed from: e */
        int[] f25816e;

        /* renamed from: f */
        int[] f25817f;

        /* renamed from: g */
        int[] f25818g;

        /* renamed from: h */
        boolean f25819h;

        C7080m(C7065i iVar) {
            this.f25812a = iVar;
            mo22743a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22743a() {
            this.f25814c = new C6992d[C7056e.f25351n];
            this.f25815d = new int[C7056e.f25351n];
            this.f25816e = new int[C7056e.f25351n];
            this.f25817f = new int[C7056e.f25351n];
            this.f25818g = new int[C7056e.f25351n];
            this.f25813b = 0;
            this.f25819h = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22748b() {
            Arrays.fill(this.f25814c, 0, this.f25813b, null);
            this.f25813b = 0;
            this.f25819h = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo22746a(C6992d dVar) {
            for (int i = 0; i < this.f25813b; i++) {
                if (this.f25814c[i] == dVar) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C6992d mo22742a(int i) {
            return this.f25814c[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7088l mo22747b(int i) {
            C6992d dVar = this.f25814c[i];
            if (dVar != null) {
                return this.f25812a.mo22486e(dVar);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22745a(C6992d dVar, int i, int i2, int i3, int i4) {
            mo22749c();
            this.f25814c[this.f25813b] = dVar;
            this.f25815d[this.f25813b] = i;
            this.f25816e[this.f25813b] = i3;
            this.f25817f[this.f25813b] = i2;
            this.f25818g[this.f25813b] = i4;
            this.f25819h = (dVar != null) | this.f25819h;
            this.f25813b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22744a(int i, int i2) {
            this.f25816e[this.f25813b - 1] = i;
            this.f25818g[this.f25813b - 1] = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22749c() {
            if (this.f25813b == this.f25814c.length) {
                int i = this.f25813b << 1;
                mo22750c(i);
                mo22751d(i);
                mo22752e(i);
                mo22753f(i);
                mo22754g(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22750c(int i) {
            C6992d[] dVarArr = new C6992d[i];
            C6982a.m36406a((Object) this.f25814c, 0, (Object) dVarArr, 0, this.f25813b);
            this.f25814c = dVarArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo22751d(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25815d, 0, (Object) iArr, 0, this.f25813b);
            this.f25815d = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo22752e(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25816e, 0, (Object) iArr, 0, this.f25813b);
            this.f25816e = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo22753f(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25817f, 0, (Object) iArr, 0, this.f25813b);
            this.f25817f = iArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo22754g(int i) {
            int[] iArr = new int[i];
            C6982a.m36406a((Object) this.f25818g, 0, (Object) iArr, 0, this.f25813b);
            this.f25818g = iArr;
        }
    }

    /* renamed from: e.f.i$n */
    /* compiled from: PGraphicsOpenGL */
    protected static class C7081n {

        /* renamed from: a */
        C7065i f25820a;

        /* renamed from: b */
        String f25821b;

        /* renamed from: c */
        int f25822c;

        /* renamed from: d */
        int f25823d;

        /* renamed from: e */
        int f25824e;

        /* renamed from: f */
        int f25825f;

        /* renamed from: g */
        int f25826g;

        /* renamed from: h */
        C7091m f25827h;

        /* renamed from: i */
        int f25828i;

        /* renamed from: j */
        float[] f25829j;

        /* renamed from: k */
        int[] f25830k;

        /* renamed from: l */
        byte[] f25831l;

        /* renamed from: m */
        boolean f25832m;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo22760a() {
            return this.f25822c == 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo22763b() {
            return this.f25822c == 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo22765c() {
            return this.f25822c == 2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo22766d() {
            return this.f25822c == 3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo22767e() {
            return this.f25823d == C7056e.f25144bs;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo22768f() {
            return this.f25823d == C7056e.f25141bp;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public boolean mo22769g() {
            return this.f25823d == C7056e.f25145bt;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public boolean mo22770h() {
            return this.f25827h != null && this.f25827h.f25974a > 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22756a(C7056e eVar) {
            C7091m mVar = new C7091m(this.f25820a, C7056e.f25187cj, this.f25824e, this.f25826g, false);
            this.f25827h = mVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo22762b(C7056e eVar) {
            eVar.mo22382z(this.f25828i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo22764c(C7056e eVar) {
            eVar.mo22207A(this.f25828i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo22761a(C7082j jVar) {
            if (this.f25832m && this.f25828i == -1) {
                this.f25828i = jVar.mo22772a(this.f25821b);
                if (this.f25828i == -1) {
                    this.f25832m = false;
                }
            }
            return this.f25832m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22755a(int i) {
            return i * this.f25825f * this.f25826g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22758a(float[] fArr, int i) {
            C6982a.m36406a((Object) this.f25829j, 0, (Object) fArr, i, this.f25824e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22759a(int[] iArr, int i) {
            C6982a.m36406a((Object) this.f25830k, 0, (Object) iArr, i, this.f25824e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22757a(byte[] bArr, int i) {
            C6982a.m36406a((Object) this.f25831l, 0, (Object) bArr, i, this.f25824e);
        }
    }

    /* renamed from: f */
    protected static int m37501f(int i, int i2) {
        while (i < i2) {
            i <<= 1;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo21907B() {
        return true;
    }

    /* renamed from: ae */
    public boolean mo21951ae() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public boolean mo22470bi() {
        return true;
    }

    /* renamed from: j */
    static void m37510j() {
        int i = 0;
        while (i < 10) {
            C7070d dVar = (C7070d) f25491ff.poll();
            if (dVar != null) {
                dVar.mo22504a();
                i++;
            } else {
                return;
            }
        }
    }

    public C7065i() {
        if (f25489fd == null) {
            f25489fd = C7056e.m37134r(2);
            f25490fe = C7056e.m37136t(2);
        }
        this.f25574eY = C7056e.m37134r(4);
        this.f25497cB = m37489bu();
        this.f25542dr = m37478a(this, this.f25497cB, 0);
        this.f25543ds = m37482b(this, this.f25497cB, 0);
        this.f25544dt = m37496c(this);
        this.f25524dR = new C6995g();
        this.f25525dS = new C6995g();
        this.f25526dT = new C6995g();
        this.f25527dU = new C6995g();
        this.f25528dV = new C6995g();
        this.f25529dW = new C6995g();
        this.f25587em = new int[C7056e.f25354q];
        this.f25588en = new float[(C7056e.f25354q * 4)];
        this.f25589eo = new float[(C7056e.f25354q * 3)];
        this.f25590ep = new float[(C7056e.f25354q * 3)];
        this.f25591eq = new float[(C7056e.f25354q * 3)];
        this.f25592er = new float[(C7056e.f25354q * 3)];
        this.f25593es = new float[(C7056e.f25354q * 3)];
        this.f25594et = new float[(C7056e.f25354q * 2)];
        this.f25595eu = new float[3];
        this.f25506d = false;
    }

    /* renamed from: a */
    public void mo21939a(C6982a aVar) {
        super.mo21939a(aVar);
        if (this.f25493a != null) {
            this.f25493a.f25431b = aVar;
        }
    }

    /* renamed from: a */
    public void mo21946a(boolean z) {
        super.mo21946a(z);
        this.f25493a.mo22286a(z);
        this.f24748cc = 2;
        if (z) {
            this.f25554eE = new C7051b[16];
            this.f25495c = new WeakHashMap<>();
            this.f25545du = new C7078l();
            return;
        }
        this.f25545du = mo22421aB().f25545du;
    }

    /* renamed from: a */
    public void mo21706a() {
        this.f25578ed = true;
    }

    /* renamed from: a */
    public void mo21715a(int i, int i2) {
        this.f25577ec = (i == this.f24750ce && i2 == this.f24751cf) ? false : true;
        super.mo21715a(i, i2);
        mo22495k();
        this.f25514dH = 1.0471976f;
        this.f25515dI = ((float) this.f24750ce) / 2.0f;
        this.f25516dJ = ((float) this.f24751cf) / 2.0f;
        this.f25517dK = this.f25516dJ / ((float) Math.tan((double) (this.f25514dH / 2.0f)));
        this.f25518dL = this.f25517dK / 10.0f;
        this.f25519dM = this.f25517dK * 10.0f;
        this.f25520dN = ((float) this.f24750ce) / ((float) this.f24751cf);
        this.f25507dA = this.f25514dH;
        this.f25508dB = this.f25515dI;
        this.f25509dC = this.f25516dJ;
        this.f25510dD = this.f25517dK;
        this.f25511dE = this.f25518dL;
        this.f25512dF = this.f25519dM;
        this.f25513dG = this.f25520dN;
    }

    /* renamed from: b */
    public void mo21723b() {
        if (this.f25548dx != null) {
            this.f25548dx.mo22497a();
            this.f25548dx = null;
        }
        if (!this.f24733x) {
            mo22469bh();
            C7051b bVar = this.f25558eI;
            C7051b bVar2 = this.f25559eJ;
            if (bVar != null) {
                bVar.mo22181h();
            }
            if (bVar2 != null) {
                bVar2.mo22181h();
            }
        }
        this.f25493a.mo22256a();
        super.mo21723b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo22495k() {
        float r = this.f25493a.mo22368r();
        this.f24753ch = (int) (((float) this.f24750ce) * r);
        this.f24754ci = (int) (((float) this.f24751cf) * r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7056e mo22409a(C7065i iVar) {
        return new C7060f(iVar);
    }

    /* renamed from: a */
    public C6997i mo21705a(C6977a aVar, SurfaceHolder surfaceHolder, boolean z) {
        if (z) {
            this.f25493a.mo22350i();
        }
        return new C7084k(this, aVar, surfaceHolder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo21908C() {
        return super.mo21908C();
    }

    /* renamed from: i */
    public boolean mo22492i(String str) {
        return super.mo21990h(str);
    }

    /* renamed from: a */
    public void mo21942a(C6992d dVar, Object obj) {
        if (dVar instanceof C7065i) {
            mo22421aB().f24735z.put(dVar, new WeakReference(obj));
        } else {
            mo22421aB().f24735z.put(dVar, obj);
        }
    }

    /* renamed from: b */
    public Object mo21954b(C6992d dVar) {
        Object obj = mo22421aB().f24735z.get(dVar);
        return (obj == null || obj.getClass() != WeakReference.class) ? obj : ((WeakReference) obj).get();
    }

    /* renamed from: c */
    public void mo21966c(C6992d dVar) {
        mo22421aB().f24735z.remove(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22413a(C6987b bVar, C7013a aVar) {
        mo22421aB().f25495c.put(bVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7013a mo22408a(C6987b bVar) {
        return (C7013a) mo22421aB().f25495c.get(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: an */
    public void mo22446an() {
        C7065i aB = mo22421aB();
        if (aB.f25553eD != 16) {
            aB.f25554eE[aB.f25553eD] = aB.f25557eH;
            aB.f25553eD++;
            return;
        }
        throw new RuntimeException("Too many pushFramebuffer calls");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22416a(C7051b bVar) {
        C7065i aB = mo22421aB();
        if (aB.f25557eH != bVar) {
            aB.f25557eH = bVar;
            if (aB.f25557eH != null) {
                aB.f25557eH.mo22175b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ao */
    public void mo22447ao() {
        C7065i aB = mo22421aB();
        if (aB.f25553eD != 0) {
            aB.f25553eD--;
            C7051b bVar = aB.f25554eE[aB.f25553eD];
            if (aB.f25557eH != bVar) {
                aB.f25557eH.mo22177d();
                aB.f25557eH = bVar;
                if (aB.f25557eH != null) {
                    aB.f25557eH.mo22175b();
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("popFramebuffer call is unbalanced.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public C7051b mo22448ap() {
        return mo22421aB().f25557eH;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aq */
    public void mo22449aq() {
        if (!this.f25612o || mo22451as()) {
            this.f25613p = this.f25493a.mo22208B();
            this.f25601f = new C7091m(this, C7056e.f25187cj, 3, C7056e.f25097aQ);
            this.f25604g = new C7091m(this, C7056e.f25187cj, 1, C7056e.f25096aP);
            this.f25605h = new C7091m(this, C7056e.f25187cj, 3, C7056e.f25097aQ);
            this.f25606i = new C7091m(this, C7056e.f25187cj, 2, C7056e.f25097aQ);
            this.f25607j = new C7091m(this, C7056e.f25187cj, 1, C7056e.f25096aP);
            this.f25608k = new C7091m(this, C7056e.f25187cj, 1, C7056e.f25096aP);
            this.f25609l = new C7091m(this, C7056e.f25187cj, 1, C7056e.f25096aP);
            this.f25610m = new C7091m(this, C7056e.f25187cj, 1, C7056e.f25097aQ);
            this.f25493a.mo22310c(C7056e.f25187cj, 0);
            C7091m mVar = new C7091m(this, C7056e.f25188ck, 1, C7056e.f25099aS, true);
            this.f25611n = mVar;
            this.f25493a.mo22310c(C7056e.f25188ck, 0);
            this.f25612o = true;
        }
        boolean z = false;
        for (String str : this.f25497cB.keySet()) {
            C7081n nVar = (C7081n) this.f25497cB.get(str);
            if (!nVar.mo22770h() || mo22451as()) {
                nVar.mo22756a(this.f25493a);
                z = true;
            }
        }
        if (z) {
            this.f25493a.mo22310c(C7056e.f25187cj, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22418a(boolean z, boolean z2, boolean z3, boolean z4) {
        mo22449aq();
        int i = this.f25543ds.f25739d;
        int i2 = C7056e.f25097aQ * i;
        int i3 = C7056e.f25096aP * i;
        this.f25543ds.mo22604f();
        this.f25493a.mo22310c(C7056e.f25187cj, this.f25601f.f25974a);
        this.f25493a.mo22276a(C7056e.f25187cj, i2 * 4, (Buffer) this.f25543ds.f25742g, C7056e.f25190cm);
        this.f25543ds.mo22607g();
        this.f25493a.mo22310c(C7056e.f25187cj, this.f25604g.f25974a);
        this.f25493a.mo22276a(C7056e.f25187cj, i3, (Buffer) this.f25543ds.f25743h, C7056e.f25190cm);
        if (z) {
            this.f25543ds.mo22616j();
            this.f25493a.mo22310c(C7056e.f25187cj, this.f25607j.f25974a);
            this.f25493a.mo22276a(C7056e.f25187cj, i3, (Buffer) this.f25543ds.f25746k, C7056e.f25190cm);
            this.f25543ds.mo22619k();
            this.f25493a.mo22310c(C7056e.f25187cj, this.f25608k.f25974a);
            this.f25493a.mo22276a(C7056e.f25187cj, i3, (Buffer) this.f25543ds.f25747l, C7056e.f25190cm);
            this.f25543ds.mo22622l();
            this.f25493a.mo22310c(C7056e.f25187cj, this.f25609l.f25974a);
            this.f25493a.mo22276a(C7056e.f25187cj, i3, (Buffer) this.f25543ds.f25748m, C7056e.f25190cm);
            this.f25543ds.mo22625m();
            this.f25493a.mo22310c(C7056e.f25187cj, this.f25610m.f25974a);
            this.f25493a.mo22276a(C7056e.f25187cj, i2, (Buffer) this.f25543ds.f25749n, C7056e.f25190cm);
        }
        if (z || z3) {
            this.f25543ds.mo22610h();
            this.f25493a.mo22310c(C7056e.f25187cj, this.f25605h.f25974a);
            this.f25493a.mo22276a(C7056e.f25187cj, i2 * 3, (Buffer) this.f25543ds.f25744i, C7056e.f25190cm);
        }
        if (z2 || z4) {
            this.f25543ds.mo22613i();
            this.f25493a.mo22310c(C7056e.f25187cj, this.f25606i.f25974a);
            this.f25493a.mo22276a(C7056e.f25187cj, i2 * 2, (Buffer) this.f25543ds.f25745j, C7056e.f25190cm);
        }
        for (String str : this.f25497cB.keySet()) {
            C7081n nVar = (C7081n) this.f25497cB.get(str);
            this.f25543ds.mo22587a(str);
            this.f25493a.mo22310c(C7056e.f25187cj, nVar.f25827h.f25974a);
            this.f25493a.mo22276a(C7056e.f25187cj, nVar.mo22755a(i), (Buffer) this.f25543ds.f25750o.get(str), C7056e.f25190cm);
        }
        this.f25543ds.mo22628n();
        this.f25493a.mo22310c(C7056e.f25188ck, this.f25611n.f25974a);
        this.f25493a.mo22276a(C7056e.f25188ck, this.f25543ds.f25751p * C7056e.f25099aS, (Buffer) this.f25543ds.f25754s, C7056e.f25190cm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ar */
    public void mo22450ar() {
        this.f25493a.mo22310c(C7056e.f25187cj, 0);
        this.f25493a.mo22310c(C7056e.f25188ck, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public boolean mo22451as() {
        return !this.f25493a.mo22328d(this.f25613p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: at */
    public void mo22452at() {
        if (!this.f25499ct || mo22455aw()) {
            this.f25500cu = this.f25493a.mo22208B();
            this.f25614q = new C7091m(this, C7056e.f25187cj, 3, C7056e.f25097aQ);
            this.f25615r = new C7091m(this, C7056e.f25187cj, 1, C7056e.f25096aP);
            this.f25616s = new C7091m(this, C7056e.f25187cj, 4, C7056e.f25097aQ);
            this.f25493a.mo22310c(C7056e.f25187cj, 0);
            C7091m mVar = new C7091m(this, C7056e.f25188ck, 1, C7056e.f25099aS, true);
            this.f25498cs = mVar;
            this.f25493a.mo22310c(C7056e.f25188ck, 0);
            this.f25499ct = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: au */
    public void mo22453au() {
        mo22452at();
        int i = this.f25543ds.f25756u;
        int i2 = C7056e.f25097aQ * i;
        int i3 = i * C7056e.f25096aP;
        this.f25543ds.mo22631o();
        this.f25493a.mo22310c(C7056e.f25187cj, this.f25614q.f25974a);
        int i4 = i2 * 4;
        this.f25493a.mo22276a(C7056e.f25187cj, i4, (Buffer) this.f25543ds.f25759x, C7056e.f25190cm);
        this.f25543ds.mo22634p();
        this.f25493a.mo22310c(C7056e.f25187cj, this.f25615r.f25974a);
        this.f25493a.mo22276a(C7056e.f25187cj, i3, (Buffer) this.f25543ds.f25760y, C7056e.f25190cm);
        this.f25543ds.mo22637q();
        this.f25493a.mo22310c(C7056e.f25187cj, this.f25616s.f25974a);
        this.f25493a.mo22276a(C7056e.f25187cj, i4, (Buffer) this.f25543ds.f25761z, C7056e.f25190cm);
        this.f25543ds.mo22640r();
        this.f25493a.mo22310c(C7056e.f25188ck, this.f25498cs.f25974a);
        this.f25493a.mo22276a(C7056e.f25188ck, this.f25543ds.f25700A * C7056e.f25099aS, (Buffer) this.f25543ds.f25703D, C7056e.f25190cm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: av */
    public void mo22454av() {
        this.f25493a.mo22310c(C7056e.f25187cj, 0);
        this.f25493a.mo22310c(C7056e.f25188ck, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aw */
    public boolean mo22455aw() {
        return !this.f25493a.mo22328d(this.f25500cu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ax */
    public void mo22456ax() {
        if (!this.f25505cz || mo22420aA()) {
            this.f25496cA = this.f25493a.mo22208B();
            this.f25501cv = new C7091m(this, C7056e.f25187cj, 3, C7056e.f25097aQ);
            this.f25502cw = new C7091m(this, C7056e.f25187cj, 1, C7056e.f25096aP);
            this.f25503cx = new C7091m(this, C7056e.f25187cj, 2, C7056e.f25097aQ);
            this.f25493a.mo22310c(C7056e.f25187cj, 0);
            C7091m mVar = new C7091m(this, C7056e.f25188ck, 1, C7056e.f25099aS, true);
            this.f25504cy = mVar;
            this.f25493a.mo22310c(C7056e.f25188ck, 0);
            this.f25505cz = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public void mo22457ay() {
        mo22456ax();
        int i = this.f25543ds.f25705F;
        int i2 = C7056e.f25097aQ * i;
        int i3 = i * C7056e.f25096aP;
        this.f25543ds.mo22642s();
        this.f25493a.mo22310c(C7056e.f25187cj, this.f25501cv.f25974a);
        this.f25493a.mo22276a(C7056e.f25187cj, i2 * 4, (Buffer) this.f25543ds.f25708I, C7056e.f25190cm);
        this.f25543ds.mo22644t();
        this.f25493a.mo22310c(C7056e.f25187cj, this.f25502cw.f25974a);
        this.f25493a.mo22276a(C7056e.f25187cj, i3, (Buffer) this.f25543ds.f25709J, C7056e.f25190cm);
        this.f25543ds.mo22646u();
        this.f25493a.mo22310c(C7056e.f25187cj, this.f25503cx.f25974a);
        this.f25493a.mo22276a(C7056e.f25187cj, i2 * 2, (Buffer) this.f25543ds.f25710K, C7056e.f25190cm);
        this.f25543ds.mo22648v();
        this.f25493a.mo22310c(C7056e.f25188ck, this.f25504cy.f25974a);
        this.f25493a.mo22276a(C7056e.f25188ck, this.f25543ds.f25711L * C7056e.f25099aS, (Buffer) this.f25543ds.f25714O, C7056e.f25190cm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public void mo22458az() {
        this.f25493a.mo22310c(C7056e.f25187cj, 0);
        this.f25493a.mo22310c(C7056e.f25188ck, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public boolean mo22420aA() {
        return !this.f25493a.mo22328d(this.f25496cA);
    }

    /* renamed from: d */
    public void mo21731d() {
        if (this.f24733x) {
            mo22471bj();
            mo22461b(this);
        } else {
            this.f25493a.mo22283a(mo22424aE());
            mo22421aB().mo22461b(this);
        }
        mo22494j("top beginDraw()");
        if (mo22470bi() && !this.f25568eS) {
            if (!this.f24733x && mo22421aB().f25544dt.mo22746a((C6992d) this)) {
                mo22421aB().mo22004v();
            }
            if (!f25453cC) {
                mo22479br();
            }
            mo22477bp();
            if (this.f24733x) {
                mo22472bk();
            } else {
                mo22475bn();
            }
            mo22006w();
            this.f25568eS = true;
            mo22494j("bot beginDraw()");
        }
    }

    /* renamed from: e */
    public void mo21734e() {
        mo22494j("top endDraw()");
        if (this.f25568eS) {
            mo22004v();
            if (this.f24733x) {
                mo22473bl();
            } else {
                mo22476bo();
            }
            if (this.f24733x) {
                mo22461b((C7065i) null);
            } else {
                mo22421aB().mo22422aC();
            }
            this.f25568eS = false;
            mo22494j("bot endDraw()");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aB */
    public C7065i mo22421aB() {
        if (this.f24733x) {
            return this;
        }
        return (C7065i) this.f24755cj.f24532d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22461b(C7065i iVar) {
        this.f25494b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aC */
    public void mo22422aC() {
        this.f25494b = this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aD */
    public C7065i mo22423aD() {
        return this.f25494b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aE */
    public C7056e mo22424aE() {
        if (this.f24733x) {
            return this.f25493a;
        }
        return ((C7065i) this.f24755cj.f24532d).f25493a;
    }

    /* renamed from: aF */
    public void mo22425aF() {
        this.f25529dW.mo22042a((C6993e) this.f25524dR);
        this.f25529dW.mo22043a(this.f25527dU);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aG */
    public void mo22426aG() {
        this.f25506d = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aH */
    public void mo22427aH() {
        mo21989h(this.f24704bb);
        if (this.f24734y[2]) {
            this.f25493a.mo22376w(C7056e.f25268eM);
        } else {
            this.f25493a.mo22374v(C7056e.f25268eM);
        }
        this.f25493a.mo22234O(C7056e.f25303ev);
        if (this.f24729t < 1) {
            this.f25493a.mo22376w(C7056e.f25315fG);
        } else {
            this.f25493a.mo22374v(C7056e.f25315fG);
            this.f25493a.mo22376w(C7056e.f25317fI);
        }
        this.f25493a.mo22296b(this.f25574eY.get(0), this.f25574eY.get(1), this.f25574eY.get(2), this.f25574eY.get(3));
        if (this.f25550eA) {
            this.f25493a.mo22374v(C7056e.f25266eK);
            this.f25493a.mo22342g(this.f25551eB[0], this.f25551eB[1], this.f25551eB[2], this.f25551eB[3]);
        } else {
            this.f25493a.mo22376w(C7056e.f25266eK);
        }
        this.f25493a.mo22209B(this.f25523dQ ? C7056e.f25184cg : C7056e.f25185ch);
        this.f25493a.mo22376w(C7056e.f25202cy);
        this.f25493a.mo22213D(C7056e.f25175cX);
        if (this.f24734y[5]) {
            this.f25493a.mo22305b(false);
        } else {
            this.f25493a.mo22305b(true);
        }
        C7051b ap = mo22448ap();
        if (ap != null) {
            ap.mo22175b();
            if (f25461cK) {
                this.f25493a.mo22247U(ap.mo22179f());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r8 == 2) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r7.f25560eK != false) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[ADDED_TO_REGION] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22405A(int r8) {
        /*
            r7 = this;
            e.f.b r0 = r7.mo22448ap()
            boolean r1 = r7.f24733x
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002f
            e.f.b r1 = r7.f25556eG
            e.f.b r5 = r7.f25555eF
            if (r0 == r1) goto L_0x0013
            if (r0 != r5) goto L_0x005d
        L_0x0013:
            if (r8 != r3) goto L_0x002b
            e.f.e r0 = r7.f25493a
            boolean r0 = r0.mo22344g()
            if (r0 == 0) goto L_0x002d
            e.f.e r0 = r7.f25493a
            boolean r0 = r0.mo22357j()
            if (r0 == 0) goto L_0x002d
            e.f.e r0 = r7.f25493a
            r0.mo22367q()
            goto L_0x0054
        L_0x002b:
            if (r8 != r2) goto L_0x005d
        L_0x002d:
            r4 = r5
            goto L_0x005d
        L_0x002f:
            e.f.b r1 = r7.f25558eI
            e.f.b r5 = r7.f25559eJ
            if (r0 == r1) goto L_0x0037
            if (r0 != r5) goto L_0x005d
        L_0x0037:
            if (r8 != r3) goto L_0x0056
            boolean r0 = r7.f25560eK
            if (r0 == 0) goto L_0x0054
            int r0 = p256e.p262f.C7056e.f25270eO
            boolean[] r4 = r7.f24734y
            r6 = 10
            boolean r4 = r4[r6]
            if (r4 == 0) goto L_0x004d
            int r4 = p256e.p262f.C7056e.f25271eP
            int r6 = p256e.p262f.C7056e.f25272eQ
            r4 = r4 | r6
            r0 = r0 | r4
        L_0x004d:
            if (r1 == 0) goto L_0x0054
            if (r5 == 0) goto L_0x0054
            r5.mo22172a(r1, r0)
        L_0x0054:
            r4 = r1
            goto L_0x005d
        L_0x0056:
            if (r8 != r2) goto L_0x005d
            boolean r0 = r7.f25560eK
            if (r0 == 0) goto L_0x0054
            goto L_0x002d
        L_0x005d:
            if (r4 == 0) goto L_0x006d
            e.f.b r0 = r7.mo22448ap()
            if (r4 == r0) goto L_0x006d
            r7.mo22446an()
            r7.mo22416a(r4)
            r7.f25561eL = r3
        L_0x006d:
            if (r8 != r3) goto L_0x0081
            boolean r0 = f25460cJ
            if (r0 == 0) goto L_0x0094
            e.f.e r0 = r7.f25493a
            e.f.b r1 = r7.mo22448ap()
            int r1 = r1.mo22179f()
            r0.mo22245T(r1)
            goto L_0x0094
        L_0x0081:
            if (r8 != r2) goto L_0x0094
            boolean r0 = f25461cK
            if (r0 == 0) goto L_0x0094
            e.f.e r0 = r7.f25493a
            e.f.b r1 = r7.mo22448ap()
            int r1 = r1.mo22179f()
            r0.mo22247U(r1)
        L_0x0094:
            r7.f25573eX = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p262f.C7065i.mo22405A(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: aI */
    public void mo22428aI() {
        if (this.f25561eL) {
            mo22447ao();
            this.f25561eL = false;
        }
        if (f25460cJ) {
            this.f25493a.mo22245T(mo22448ap().mo22178e());
        }
        if (f25461cK) {
            this.f25493a.mo22247U(mo22448ap().mo22179f());
        }
        this.f25573eX = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aJ */
    public void mo22429aJ() {
        if (this.f25530dX == null) {
            this.f25530dX = new float[16];
        }
        this.f25530dX[0] = this.f25524dR.f24769a;
        this.f25530dX[1] = this.f25524dR.f24773e;
        this.f25530dX[2] = this.f25524dR.f24777i;
        this.f25530dX[3] = this.f25524dR.f24781m;
        this.f25530dX[4] = this.f25524dR.f24770b;
        this.f25530dX[5] = this.f25524dR.f24774f;
        this.f25530dX[6] = this.f25524dR.f24778j;
        this.f25530dX[7] = this.f25524dR.f24782n;
        this.f25530dX[8] = this.f25524dR.f24771c;
        this.f25530dX[9] = this.f25524dR.f24775g;
        this.f25530dX[10] = this.f25524dR.f24779k;
        this.f25530dX[11] = this.f25524dR.f24783o;
        this.f25530dX[12] = this.f25524dR.f24772d;
        this.f25530dX[13] = this.f25524dR.f24776h;
        this.f25530dX[14] = this.f25524dR.f24780l;
        this.f25530dX[15] = this.f25524dR.f24784p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aK */
    public void mo22430aK() {
        if (this.f25531dY == null) {
            this.f25531dY = new float[16];
        }
        this.f25531dY[0] = this.f25527dU.f24769a;
        this.f25531dY[1] = this.f25527dU.f24773e;
        this.f25531dY[2] = this.f25527dU.f24777i;
        this.f25531dY[3] = this.f25527dU.f24781m;
        this.f25531dY[4] = this.f25527dU.f24770b;
        this.f25531dY[5] = this.f25527dU.f24774f;
        this.f25531dY[6] = this.f25527dU.f24778j;
        this.f25531dY[7] = this.f25527dU.f24782n;
        this.f25531dY[8] = this.f25527dU.f24771c;
        this.f25531dY[9] = this.f25527dU.f24775g;
        this.f25531dY[10] = this.f25527dU.f24779k;
        this.f25531dY[11] = this.f25527dU.f24783o;
        this.f25531dY[12] = this.f25527dU.f24772d;
        this.f25531dY[13] = this.f25527dU.f24776h;
        this.f25531dY[14] = this.f25527dU.f24780l;
        this.f25531dY[15] = this.f25527dU.f24784p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aL */
    public void mo22431aL() {
        if (this.f25532dZ == null) {
            this.f25532dZ = new float[16];
        }
        this.f25532dZ[0] = this.f25529dW.f24769a;
        this.f25532dZ[1] = this.f25529dW.f24773e;
        this.f25532dZ[2] = this.f25529dW.f24777i;
        this.f25532dZ[3] = this.f25529dW.f24781m;
        this.f25532dZ[4] = this.f25529dW.f24770b;
        this.f25532dZ[5] = this.f25529dW.f24774f;
        this.f25532dZ[6] = this.f25529dW.f24778j;
        this.f25532dZ[7] = this.f25529dW.f24782n;
        this.f25532dZ[8] = this.f25529dW.f24771c;
        this.f25532dZ[9] = this.f25529dW.f24775g;
        this.f25532dZ[10] = this.f25529dW.f24779k;
        this.f25532dZ[11] = this.f25529dW.f24783o;
        this.f25532dZ[12] = this.f25529dW.f24772d;
        this.f25532dZ[13] = this.f25529dW.f24776h;
        this.f25532dZ[14] = this.f25529dW.f24780l;
        this.f25532dZ[15] = this.f25529dW.f24784p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aM */
    public void mo22432aM() {
        if (this.f25576ea == null) {
            this.f25576ea = new float[9];
        }
        this.f25576ea[0] = this.f25528dV.f24769a;
        this.f25576ea[1] = this.f25528dV.f24770b;
        this.f25576ea[2] = this.f25528dV.f24771c;
        this.f25576ea[3] = this.f25528dV.f24773e;
        this.f25576ea[4] = this.f25528dV.f24774f;
        this.f25576ea[5] = this.f25528dV.f24775g;
        this.f25576ea[6] = this.f25528dV.f24777i;
        this.f25576ea[7] = this.f25528dV.f24778j;
        this.f25576ea[8] = this.f25528dV.f24779k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo22009x() {
        super.mo22009x();
        this.f25522dP = false;
        mo21985g(2);
        mo22000r(255);
        mo22001s(125);
        mo22002t(0);
        mo21978f(1.0f);
        this.f24632aF = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo22406B(int i) {
        if (i > 0) {
            return this.f24734y[i];
        }
        return !this.f24734y[-i];
    }

    /* renamed from: a */
    public void mo21714a(int i) {
        this.f24716bn = i;
        this.f25542dr.mo22521a();
        this.f24681bC = 0;
        this.f25602fa = false;
        this.f25603fb = true;
        super.mo21910E();
        this.f24685bI = 0;
    }

    /* renamed from: b */
    public void mo21726b(int i) {
        mo22407C(i);
        if (this.f25549e == 0 || (this.f25549e == 1 && this.f25543ds.mo22603e())) {
            mo22004v();
        } else {
            this.f24762cq = false;
        }
    }

    /* renamed from: G */
    public void mo21912G() {
        if (this.f25575eZ) {
            C6989c.m36558a("Already called beginContour()");
            return;
        }
        this.f25575eZ = true;
        this.f25602fa = true;
    }

    /* renamed from: H */
    public void mo21913H() {
        if (!this.f25575eZ) {
            C6989c.m36558a("Need to call beginContour() first");
        } else {
            this.f25575eZ = false;
        }
    }

    /* renamed from: a */
    public void mo21708a(float f, float f2) {
        mo22482c(f, f2, 0.0f, 0.0f, 0.0f);
        if (this.f24693bQ != null) {
            C6989c.m36558a("No uv texture coordinates supplied with vertex() call");
        }
    }

    /* renamed from: a */
    public void mo21710a(float f, float f2, float f3, float f4) {
        mo22482c(f, f2, 0.0f, f3, f4);
    }

    /* renamed from: a */
    public void mo21709a(float f, float f2, float f3) {
        mo22482c(f, f2, f3, 0.0f, 0.0f);
        if (this.f24693bQ != null) {
            C6989c.m36558a("No uv texture coordinates supplied with vertex() call");
        }
    }

    /* renamed from: a */
    public void mo21711a(float f, float f2, float f3, float f4, float f5) {
        mo22482c(f, f2, f3, f4, f5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22482c(float f, float f2, float f3, float f4, float f5) {
        int i;
        float f6;
        int i2;
        float f7;
        float f8;
        int i3;
        boolean z = this.f24693bQ != null;
        if (this.f24619S || z) {
            if (!z) {
                i3 = this.f24620T;
            } else if (this.f24608H) {
                i3 = this.f24609I;
            } else {
                i = -1;
            }
            i = i3;
        } else {
            i = 0;
        }
        if (this.f24656ad) {
            i2 = this.f24657ae;
            f6 = this.f24667ao;
        } else {
            i2 = 0;
            f6 = 0.0f;
        }
        if (!z || this.f24690bN != 2) {
            f8 = f4;
            f7 = f5;
        } else {
            f8 = f4 / ((float) this.f24693bQ.f24750ce);
            f7 = f5 / ((float) this.f24693bQ.f24751cf);
        }
        this.f25542dr.mo22515a(f, f2, f3, i, this.f24687bK, this.f24688bL, this.f24689bM, f8, f7, i2, f6, this.f24628aB, this.f24633aG, this.f24637aK, this.f24641aO, 0, mo22433aN());
    }

    /* access modifiers changed from: protected */
    /* renamed from: aN */
    public boolean mo22433aN() {
        if (!this.f25602fa) {
            return false;
        }
        this.f25602fa = false;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo22407C(int i) {
        this.f25545du.mo22673a(this.f25542dr);
        this.f25545du.mo22674a(this.f25543ds);
        boolean z = false;
        this.f25545du.mo22677a(this.f24619S || this.f24693bQ != null);
        this.f25545du.mo22675a(this.f25544dt, this.f24693bQ);
        this.f25545du.mo22685b(this.f24656ad);
        this.f25545du.mo22665a(this.f24657ae);
        this.f25545du.mo22663a(this.f24667ao);
        this.f25545du.mo22682b(this.f24669aq);
        this.f25545du.mo22688c(this.f24668ap);
        this.f25545du.mo22676a(this);
        this.f25545du.mo22671a((C6993e) this.f25527dU);
        this.f25545du.mo22689c(mo21950ad());
        if (this.f24716bn == 3) {
            this.f25545du.mo22681b();
        } else if (this.f24716bn == 5) {
            this.f25545du.mo22701g();
        } else if (this.f24716bn == 50) {
            this.f25545du.mo22703h();
        } else if (this.f24716bn == 51) {
            this.f25545du.mo22705i();
        } else if (this.f24716bn == 8 || this.f24716bn == 9) {
            if (this.f24656ad && this.f25603fb) {
                this.f25542dr.mo22544g();
            }
            if (this.f24685bI == 0) {
                this.f25542dr.mo22554l();
            }
            this.f25545du.mo22719p();
        } else if (this.f24716bn == 11) {
            if (this.f24656ad && this.f25603fb) {
                this.f25542dr.mo22546h();
            }
            if (this.f24685bI == 0) {
                this.f25542dr.mo22556m();
            }
            this.f25545du.mo22723r();
        } else if (this.f24716bn == 10) {
            if (this.f24656ad && this.f25603fb) {
                this.f25542dr.mo22548i();
            }
            if (this.f24685bI == 0) {
                this.f25542dr.mo22558n();
            }
            this.f25545du.mo22727t();
        } else if (this.f24716bn == 16 || this.f24716bn == 17) {
            if (this.f24656ad && this.f25603fb) {
                this.f25542dr.mo22550j();
            }
            if (this.f24685bI == 0) {
                this.f25542dr.mo22560o();
            }
            this.f25545du.mo22731v();
        } else if (this.f24716bn == 18) {
            if (this.f24656ad && this.f25603fb) {
                this.f25542dr.mo22552k();
            }
            if (this.f24685bI == 0) {
                this.f25542dr.mo22561p();
            }
            this.f25545du.mo22733w();
        } else if (this.f24716bn == 20) {
            C7078l lVar = this.f25545du;
            boolean z2 = i == 2;
            if (this.f24685bI == 0) {
                z = true;
            }
            lVar.mo22678a(true, z2, z);
        }
    }

    /* renamed from: v */
    public void mo22004v() {
        C6995g gVar;
        boolean z = this.f25543ds.f25739d > 0 && this.f25543ds.f25751p > 0;
        boolean z2 = this.f25543ds.f25756u > 0 && this.f25543ds.f25700A > 0;
        boolean z3 = this.f25543ds.f25705F > 0 && this.f25543ds.f25711L > 0;
        if (this.f24757cl && this.f24749cd != null) {
            mo22434aO();
        }
        if (z3 || z2 || z) {
            C6995g gVar2 = null;
            if (this.f25549e == 1) {
                gVar2 = this.f25527dU;
                gVar = this.f25528dV;
                C6995g gVar3 = f25487eb;
                this.f25528dV = gVar3;
                this.f25527dU = gVar3;
                this.f25529dW.mo22042a((C6993e) this.f25524dR);
            } else {
                gVar = null;
            }
            if (z && !this.f25547dw) {
                mo22435aP();
                if (this.f24732w != null) {
                    mo22437aR();
                }
            }
            if (mo21950ad()) {
                if (z2) {
                    mo22439aT();
                    if (this.f24732w != null) {
                        mo22440aU();
                    }
                }
                if (z3) {
                    mo22441aV();
                    if (this.f24732w != null) {
                        mo22442aW();
                    }
                }
            }
            if (z && this.f25547dw) {
                mo22436aQ();
                if (this.f24732w != null) {
                    mo22438aS();
                }
            }
            if (this.f25549e == 1) {
                this.f25527dU = gVar2;
                this.f25528dV = gVar;
                mo22425aF();
            }
            this.f24762cq = false;
        }
        this.f25543ds.mo22590b();
        this.f25544dt.mo22748b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aO */
    public void mo22434aO() {
        mo22483c(this.f24758cm, this.f24759cn, this.f24760co - this.f24758cm, this.f24761cp - this.f24759cn);
        this.f24757cl = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aP */
    public void mo22435aP() {
        int i = 1;
        boolean z = this.f25539do != null;
        boolean z2 = z ? this.f25539do.mo22822z() : false;
        boolean y = z ? this.f25539do.mo22821y() : false;
        mo22418a(this.f25585ek, this.f25544dt.f25819h, z2, y);
        int i2 = 0;
        while (i2 < this.f25544dt.f25813b) {
            C7088l b = this.f25544dt.mo22747b(i2);
            C7082j a = mo22410a(this.f25585ek, b != null);
            a.mo22773a();
            int i3 = this.f25544dt.f25817f[i2];
            int i4 = this.f25544dt.f25818g[i2];
            C7076j jVar = this.f25543ds.f25755t;
            int i5 = i3;
            while (i5 <= i4) {
                int i6 = i5 == i3 ? this.f25544dt.f25815d[i2] : jVar.f25696c[i5];
                int i7 = i5 == i4 ? (this.f25544dt.f25816e[i2] - i6) + i : (jVar.f25696c[i5] + jVar.f25695b[i5]) - i6;
                int i8 = jVar.f25698e[i5];
                int i9 = i8 * 4;
                int i10 = i8;
                int i11 = i7;
                int i12 = i6;
                int i13 = i5;
                C7076j jVar2 = jVar;
                a.mo22779a(this.f25601f.f25974a, 4, C7056e.f25144bs, 0, C7056e.f25097aQ * i9);
                a.mo22790b(this.f25604g.f25974a, 4, C7056e.f25147bv, 0, i9 * C7056e.f25098aR);
                if (this.f25585ek) {
                    a.mo22792c(this.f25605h.f25974a, 3, C7056e.f25144bs, 0, C7056e.f25097aQ * i10 * 3);
                    a.mo22796e(this.f25607j.f25974a, 4, C7056e.f25147bv, 0, i9 * C7056e.f25098aR);
                    a.mo22798f(this.f25608k.f25974a, 4, C7056e.f25147bv, 0, i9 * C7056e.f25098aR);
                    a.mo22800g(this.f25609l.f25974a, 4, C7056e.f25147bv, 0, i9 * C7056e.f25098aR);
                    a.mo22802h(this.f25610m.f25974a, 1, C7056e.f25144bs, 0, i10 * C7056e.f25097aQ);
                }
                if (this.f25585ek || z2) {
                    a.mo22792c(this.f25605h.f25974a, 3, C7056e.f25144bs, 0, C7056e.f25097aQ * i10 * 3);
                }
                if (b != null || y) {
                    a.mo22794d(this.f25606i.f25974a, 2, C7056e.f25144bs, 0, C7056e.f25097aQ * i10 * 2);
                    a.mo22784a(b);
                }
                for (C7081n nVar : this.f25497cB.values()) {
                    if (nVar.mo22761a(a)) {
                        nVar.mo22762b(this.f25493a);
                        int i14 = i4;
                        a.mo22780a(nVar.f25828i, nVar.f25827h.f25974a, nVar.f25825f, nVar.f25823d, nVar.mo22765c(), 0, nVar.mo22755a(i10));
                        i4 = i14;
                    }
                }
                int i15 = i4;
                a.mo22778a(this.f25611n.f25974a, i11, i12);
                i5 = i13 + 1;
                jVar = jVar2;
                i = 1;
            }
            for (C7081n nVar2 : this.f25497cB.values()) {
                if (nVar2.mo22761a(a)) {
                    nVar2.mo22764c(this.f25493a);
                }
            }
            a.mo22789b();
            i2++;
            i = 1;
        }
        mo22450ar();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aQ */
    public void mo22436aQ() {
        int i = 1;
        boolean z = this.f25539do != null;
        boolean z2 = z ? this.f25539do.mo22822z() : false;
        boolean y = z ? this.f25539do.mo22821y() : false;
        this.f25546dv.mo22502a(this.f25543ds);
        int i2 = this.f25543ds.f25751p / 3;
        int[] iArr = this.f25546dv.f25631b;
        int[] iArr2 = this.f25546dv.f25632c;
        int[] iArr3 = this.f25543ds.f25755t.f25698e;
        mo22418a(this.f25585ek, this.f25544dt.f25819h, z2, y);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = i3;
            do {
                i6 += i;
                if (i6 >= i2 || i4 != iArr[i6]) {
                    C7088l b = this.f25544dt.mo22747b(i4);
                    int i7 = iArr3[i5];
                    int i8 = i3 * 3;
                    int i9 = (i6 - i3) * 3;
                }
            } while (i5 == iArr2[i6]);
            C7088l b2 = this.f25544dt.mo22747b(i4);
            int i72 = iArr3[i5];
            int i82 = i3 * 3;
            int i92 = (i6 - i3) * 3;
            C7082j a = mo22410a(this.f25585ek, b2 != null);
            a.mo22773a();
            int i10 = i72 * 4;
            a.mo22779a(this.f25601f.f25974a, 4, C7056e.f25144bs, 0, i10 * C7056e.f25097aQ);
            a.mo22790b(this.f25604g.f25974a, 4, C7056e.f25147bv, 0, i10 * C7056e.f25098aR);
            if (this.f25585ek) {
                a.mo22792c(this.f25605h.f25974a, 3, C7056e.f25144bs, 0, i72 * 3 * C7056e.f25097aQ);
                a.mo22796e(this.f25607j.f25974a, 4, C7056e.f25147bv, 0, i10 * C7056e.f25098aR);
                a.mo22798f(this.f25608k.f25974a, 4, C7056e.f25147bv, 0, i10 * C7056e.f25098aR);
                a.mo22800g(this.f25609l.f25974a, 4, C7056e.f25147bv, 0, i10 * C7056e.f25098aR);
                a.mo22802h(this.f25610m.f25974a, 1, C7056e.f25144bs, 0, i72 * C7056e.f25097aQ);
            }
            if (this.f25585ek || z2) {
                a.mo22792c(this.f25605h.f25974a, 3, C7056e.f25144bs, 0, i72 * 3 * C7056e.f25097aQ);
            }
            if (b2 != null || y) {
                a.mo22794d(this.f25606i.f25974a, 2, C7056e.f25144bs, 0, i72 * 2 * C7056e.f25097aQ);
                a.mo22784a(b2);
            }
            for (C7081n nVar : this.f25497cB.values()) {
                if (nVar.mo22761a(a)) {
                    nVar.mo22762b(this.f25493a);
                    boolean z3 = y;
                    boolean z4 = z2;
                    a.mo22780a(nVar.f25828i, nVar.f25827h.f25974a, nVar.f25825f, nVar.f25823d, nVar.mo22765c(), 0, nVar.mo22755a(i72));
                    y = z3;
                    z2 = z4;
                }
            }
            boolean z5 = y;
            boolean z6 = z2;
            a.mo22778a(this.f25611n.f25974a, i92, i82);
            for (C7081n nVar2 : this.f25497cB.values()) {
                if (nVar2.mo22761a(a)) {
                    nVar2.mo22764c(this.f25493a);
                }
            }
            a.mo22789b();
            i3 = i6;
            y = z5;
            z2 = z6;
            i = 1;
        }
        mo22450ar();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aR */
    public void mo22437aR() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        float[] fArr;
        int i6 = 1;
        this.f24732w.mo22005v(1);
        this.f24732w.mo21926U();
        this.f24732w.mo21714a(9);
        float[] fArr2 = this.f25543ds.f25716Q;
        int[] iArr = this.f25543ds.f25717R;
        float[] fArr3 = this.f25543ds.f25719T;
        short[] sArr = this.f25543ds.f25724Y;
        int i7 = 0;
        while (i7 < this.f25544dt.f25813b) {
            C6992d a = this.f25544dt.mo22742a(i7);
            int i8 = this.f25544dt.f25817f[i7];
            int i9 = this.f25544dt.f25818g[i7];
            C7076j jVar = this.f25543ds.f25755t;
            int i10 = i8;
            while (i10 <= i9) {
                int i11 = i10 == i8 ? this.f25544dt.f25815d[i7] : jVar.f25696c[i10];
                int i12 = i10 == i9 ? (this.f25544dt.f25816e[i7] - i11) + i6 : (jVar.f25696c[i10] + jVar.f25695b[i10]) - i11;
                int i13 = jVar.f25698e[i10];
                int i14 = i11 / 3;
                while (i14 < (i11 + i12) / 3) {
                    int i15 = i14 * 3;
                    int i16 = i13 + sArr[i15 + 0];
                    int i17 = i13 + sArr[i15 + 1];
                    int i18 = sArr[i15 + 2] + i13;
                    short[] sArr2 = sArr;
                    int i19 = i8;
                    float[] fArr4 = {0.0f, 0.0f, 0.0f, 0.0f};
                    int i20 = i9;
                    float[] fArr5 = {0.0f, 0.0f, 0.0f, 0.0f};
                    C7076j jVar2 = jVar;
                    float[] fArr6 = {0.0f, 0.0f, 0.0f, 0.0f};
                    int i21 = C7056e.m37127i(iArr[i16]);
                    int i22 = i11;
                    int i23 = C7056e.m37127i(iArr[i17]);
                    int[] iArr2 = iArr;
                    int i24 = C7056e.m37127i(iArr[i18]);
                    int i25 = i12;
                    if (this.f25549e == 0) {
                        i5 = i13;
                        float[] fArr7 = {0.0f, 0.0f, 0.0f, 0.0f};
                        i4 = i7;
                        float[] fArr8 = {0.0f, 0.0f, 0.0f, 0.0f};
                        i3 = i10;
                        float[] fArr9 = {0.0f, 0.0f, 0.0f, 0.0f};
                        i2 = i14;
                        i = i24;
                        c = 0;
                        C6982a.m36406a((Object) fArr2, i16 * 4, (Object) fArr7, 0, 4);
                        C6982a.m36406a((Object) fArr2, i17 * 4, (Object) fArr8, 0, 4);
                        C6982a.m36406a((Object) fArr2, i18 * 4, (Object) fArr9, 0, 4);
                        this.f25527dU.mo22045a(fArr7, fArr4);
                        this.f25527dU.mo22045a(fArr8, fArr5);
                        this.f25527dU.mo22045a(fArr9, fArr6);
                    } else {
                        i2 = i14;
                        i = i24;
                        i4 = i7;
                        i3 = i10;
                        i5 = i13;
                        c = 0;
                        C6982a.m36406a((Object) fArr2, i16 * 4, (Object) fArr4, 0, 4);
                        C6982a.m36406a((Object) fArr2, i17 * 4, (Object) fArr5, 0, 4);
                        C6982a.m36406a((Object) fArr2, i18 * 4, (Object) fArr6, 0, 4);
                    }
                    if (a != null) {
                        this.f24732w.mo21718a(a);
                        if (this.f24732w.mo21950ad()) {
                            this.f24732w.mo21999q(i21);
                            int i26 = i16 * 2;
                            this.f24732w.mo21711a(fArr4[c], fArr4[1], fArr4[2], fArr3[i26 + 0], fArr3[i26 + 1]);
                            this.f24732w.mo21999q(i23);
                            int i27 = i17 * 2;
                            this.f24732w.mo21711a(fArr5[0], fArr5[1], fArr5[2], fArr3[i27 + 0], fArr3[i27 + 1]);
                            this.f24732w.mo21999q(i);
                            int i28 = i18 * 2;
                            this.f24732w.mo21711a(fArr6[0], fArr6[1], fArr6[2], fArr3[i28 + 0], fArr3[i28 + 1]);
                        } else if (this.f24732w.mo21949ac()) {
                            float i29 = mo22491i(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                            float j = mo22493j(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                            float i30 = mo22491i(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                            float j2 = mo22493j(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                            fArr = fArr2;
                            float i31 = mo22491i(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                            float j3 = mo22493j(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                            this.f24732w.mo21999q(i21);
                            int i32 = i16 * 2;
                            this.f24732w.mo21710a(i29, j, fArr3[i32 + 0], fArr3[i32 + 1]);
                            this.f24732w.mo21999q(i23);
                            int i33 = i17 * 2;
                            this.f24732w.mo21710a(i30, j2, fArr3[i33 + 0], fArr3[i33 + 1]);
                            this.f24732w.mo21999q(i23);
                            int i34 = i18 * 2;
                            this.f24732w.mo21710a(i31, j3, fArr3[i34 + 0], fArr3[i34 + 1]);
                        }
                        fArr = fArr2;
                    } else {
                        fArr = fArr2;
                        int i35 = i;
                        if (this.f24732w.mo21950ad()) {
                            this.f24732w.mo21999q(i21);
                            this.f24732w.mo21709a(fArr4[0], fArr4[1], fArr4[2]);
                            this.f24732w.mo21999q(i23);
                            this.f24732w.mo21709a(fArr5[0], fArr5[1], fArr5[2]);
                            this.f24732w.mo21999q(i35);
                            this.f24732w.mo21709a(fArr6[0], fArr6[1], fArr6[2]);
                        } else if (this.f24732w.mo21949ac()) {
                            float i36 = mo22491i(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                            float j4 = mo22493j(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                            float i37 = mo22491i(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                            float j5 = mo22493j(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                            float i38 = mo22491i(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                            float j6 = mo22493j(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                            this.f24732w.mo21999q(i21);
                            this.f24732w.mo21708a(i36, j4);
                            this.f24732w.mo21999q(i23);
                            this.f24732w.mo21708a(i37, j5);
                            this.f24732w.mo21999q(i35);
                            this.f24732w.mo21708a(i38, j6);
                            i14 = i2 + 1;
                            sArr = sArr2;
                            i8 = i19;
                            i9 = i20;
                            jVar = jVar2;
                            i11 = i22;
                            iArr = iArr2;
                            i12 = i25;
                            i13 = i5;
                            i7 = i4;
                            i10 = i3;
                            fArr2 = fArr;
                        }
                    }
                    i14 = i2 + 1;
                    sArr = sArr2;
                    i8 = i19;
                    i9 = i20;
                    jVar = jVar2;
                    i11 = i22;
                    iArr = iArr2;
                    i12 = i25;
                    i13 = i5;
                    i7 = i4;
                    i10 = i3;
                    fArr2 = fArr;
                }
                float[] fArr10 = fArr2;
                int[] iArr3 = iArr;
                short[] sArr3 = sArr;
                int i39 = i7;
                int i40 = i8;
                int i41 = i9;
                C7076j jVar3 = jVar;
                i10++;
                i6 = 1;
            }
            float[] fArr11 = fArr2;
            int[] iArr4 = iArr;
            short[] sArr4 = sArr;
            i7++;
            i6 = 1;
        }
        this.f24732w.mo21914I();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aS */
    public void mo22438aS() {
        int i;
        int i2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        char c;
        float[] fArr;
        this.f24732w.mo22005v(1);
        this.f24732w.mo21926U();
        this.f24732w.mo21714a(9);
        float[] fArr2 = this.f25543ds.f25716Q;
        int[] iArr4 = this.f25543ds.f25717R;
        float[] fArr3 = this.f25543ds.f25719T;
        short[] sArr = this.f25543ds.f25724Y;
        this.f25546dv.mo22502a(this.f25543ds);
        int[] iArr5 = this.f25546dv.f25630a;
        int[] iArr6 = this.f25546dv.f25631b;
        int[] iArr7 = this.f25546dv.f25632c;
        int[] iArr8 = this.f25543ds.f25755t.f25698e;
        int i3 = 0;
        while (i3 < this.f25543ds.f25751p / 3) {
            int i4 = iArr5[i3];
            C6992d a = this.f25544dt.mo22742a(iArr6[i4]);
            int i5 = iArr8[iArr7[i4]];
            int i6 = i4 * 3;
            int i7 = i5 + sArr[i6 + 0];
            int i8 = i5 + sArr[i6 + 1];
            int i9 = i5 + sArr[i6 + 2];
            float[] fArr4 = {0.0f, 0.0f, 0.0f, 0.0f};
            float[] fArr5 = {0.0f, 0.0f, 0.0f, 0.0f};
            float[] fArr6 = {0.0f, 0.0f, 0.0f, 0.0f};
            int i10 = C7056e.m37127i(iArr4[i7]);
            short[] sArr2 = sArr;
            int i11 = C7056e.m37127i(iArr4[i8]);
            int[] iArr9 = iArr4;
            int i12 = C7056e.m37127i(iArr4[i9]);
            int[] iArr10 = iArr5;
            if (this.f25549e == 0) {
                iArr3 = iArr6;
                float[] fArr7 = {0.0f, 0.0f, 0.0f, 0.0f};
                iArr2 = iArr7;
                float[] fArr8 = {0.0f, 0.0f, 0.0f, 0.0f};
                iArr = iArr8;
                float[] fArr9 = {0.0f, 0.0f, 0.0f, 0.0f};
                i2 = i3;
                i = i12;
                c = 0;
                C6982a.m36406a((Object) fArr2, i7 * 4, (Object) fArr7, 0, 4);
                C6982a.m36406a((Object) fArr2, i8 * 4, (Object) fArr8, 0, 4);
                C6982a.m36406a((Object) fArr2, i9 * 4, (Object) fArr9, 0, 4);
                this.f25527dU.mo22045a(fArr7, fArr4);
                this.f25527dU.mo22045a(fArr8, fArr5);
                this.f25527dU.mo22045a(fArr9, fArr6);
            } else {
                i = i12;
                iArr3 = iArr6;
                iArr2 = iArr7;
                iArr = iArr8;
                i2 = i3;
                c = 0;
                C6982a.m36406a((Object) fArr2, i7 * 4, (Object) fArr4, 0, 4);
                C6982a.m36406a((Object) fArr2, i8 * 4, (Object) fArr5, 0, 4);
                C6982a.m36406a((Object) fArr2, i9 * 4, (Object) fArr6, 0, 4);
            }
            if (a != null) {
                this.f24732w.mo21718a(a);
                if (this.f24732w.mo21950ad()) {
                    this.f24732w.mo21999q(i10);
                    int i13 = i7 * 2;
                    this.f24732w.mo21711a(fArr4[c], fArr4[1], fArr4[2], fArr3[i13 + 0], fArr3[i13 + 1]);
                    this.f24732w.mo21999q(i11);
                    int i14 = i8 * 2;
                    this.f24732w.mo21711a(fArr5[0], fArr5[1], fArr5[2], fArr3[i14 + 0], fArr3[i14 + 1]);
                    this.f24732w.mo21999q(i);
                    int i15 = i9 * 2;
                    this.f24732w.mo21711a(fArr6[0], fArr6[1], fArr6[2], fArr3[i15 + 0], fArr3[i15 + 1]);
                } else if (this.f24732w.mo21949ac()) {
                    float i16 = mo22491i(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                    float j = mo22493j(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                    float i17 = mo22491i(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                    float j2 = mo22493j(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                    fArr = fArr2;
                    float i18 = mo22491i(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                    float j3 = mo22493j(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                    this.f24732w.mo21999q(i10);
                    int i19 = i7 * 2;
                    this.f24732w.mo21710a(i16, j, fArr3[i19 + 0], fArr3[i19 + 1]);
                    this.f24732w.mo21999q(i11);
                    int i20 = i8 * 2;
                    this.f24732w.mo21710a(i17, j2, fArr3[i20 + 0], fArr3[i20 + 1]);
                    this.f24732w.mo21999q(i11);
                    int i21 = i9 * 2;
                    this.f24732w.mo21710a(i18, j3, fArr3[i21 + 0], fArr3[i21 + 1]);
                }
                fArr = fArr2;
            } else {
                fArr = fArr2;
                int i22 = i;
                if (this.f24732w.mo21950ad()) {
                    this.f24732w.mo21999q(i10);
                    this.f24732w.mo21709a(fArr4[0], fArr4[1], fArr4[2]);
                    this.f24732w.mo21999q(i11);
                    this.f24732w.mo21709a(fArr5[0], fArr5[1], fArr5[2]);
                    this.f24732w.mo21999q(i22);
                    this.f24732w.mo21709a(fArr6[0], fArr6[1], fArr6[2]);
                } else if (this.f24732w.mo21949ac()) {
                    float i23 = mo22491i(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                    float j4 = mo22493j(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                    float i24 = mo22491i(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                    float j5 = mo22493j(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                    float i25 = mo22491i(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                    float j6 = mo22493j(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                    this.f24732w.mo21999q(i10);
                    this.f24732w.mo21708a(i23, j4);
                    this.f24732w.mo21999q(i11);
                    this.f24732w.mo21708a(i24, j5);
                    this.f24732w.mo21999q(i22);
                    this.f24732w.mo21708a(i25, j6);
                    i3 = i2 + 1;
                    sArr = sArr2;
                    iArr4 = iArr9;
                    iArr5 = iArr10;
                    iArr6 = iArr3;
                    iArr7 = iArr2;
                    iArr8 = iArr;
                    fArr2 = fArr;
                }
            }
            i3 = i2 + 1;
            sArr = sArr2;
            iArr4 = iArr9;
            iArr5 = iArr10;
            iArr6 = iArr3;
            iArr7 = iArr2;
            iArr8 = iArr;
            fArr2 = fArr;
        }
        this.f24732w.mo21914I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aT */
    public void mo22439aT() {
        mo22453au();
        C7082j bs = mo22480bs();
        bs.mo22773a();
        C7076j jVar = this.f25543ds.f25704E;
        for (int i = 0; i < jVar.f25694a; i++) {
            int i2 = jVar.f25696c[i];
            int i3 = jVar.f25695b[i];
            int i4 = jVar.f25698e[i];
            int i5 = i4 * 4;
            bs.mo22779a(this.f25614q.f25974a, 4, C7056e.f25144bs, 0, i5 * C7056e.f25097aQ);
            bs.mo22790b(this.f25615r.f25974a, 4, C7056e.f25147bv, 0, i5 * C7056e.f25098aR);
            bs.mo22803i(this.f25616s.f25974a, 4, C7056e.f25144bs, 0, i5 * C7056e.f25097aQ);
            bs.mo22778a(this.f25498cs.f25974a, i3, i2);
        }
        bs.mo22789b();
        mo22454av();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aU */
    public void mo22440aU() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        C7076j jVar;
        short[] sArr;
        char c;
        this.f24732w.mo22005v(1);
        this.f24732w.mo21928W();
        this.f24732w.mo21735e(this.f24669aq);
        this.f24732w.mo21737f(this.f24668ap);
        int i4 = 5;
        this.f24732w.mo21714a(5);
        float[] fArr = this.f25543ds.f25725Z;
        int[] iArr2 = this.f25543ds.f25727aa;
        float[] fArr2 = this.f25543ds.f25728ab;
        short[] sArr2 = this.f25543ds.f25729ac;
        C7076j jVar2 = this.f25543ds.f25704E;
        int i5 = 0;
        while (i5 < jVar2.f25694a) {
            int i6 = jVar2.f25696c[i5];
            int i7 = jVar2.f25695b[i5];
            int i8 = jVar2.f25698e[i5];
            int i9 = i6 / 6;
            while (i9 < (i6 + i7) / 6) {
                int i10 = i9 * 6;
                int i11 = sArr2[i10 + 0] + i8;
                int i12 = sArr2[i10 + i4] + i8;
                int i13 = i11 * 4;
                float f = fArr2[i13 + 3] * 2.0f;
                int i14 = i12 * 4;
                float[] fArr3 = fArr2;
                float f2 = fArr2[i14 + 3] * 2.0f;
                if (m37509i(f)) {
                    iArr = iArr2;
                    sArr = sArr2;
                    jVar = jVar2;
                    i3 = i6;
                    i2 = i7;
                    i = i8;
                } else {
                    sArr = sArr2;
                    jVar = jVar2;
                    float[] fArr4 = {0.0f, 0.0f, 0.0f, 0.0f};
                    i3 = i6;
                    float[] fArr5 = {0.0f, 0.0f, 0.0f, 0.0f};
                    int i15 = C7056e.m37127i(iArr2[i11]);
                    int i16 = C7056e.m37127i(iArr2[i12]);
                    iArr = iArr2;
                    if (this.f25549e == 0) {
                        float[] fArr6 = {0.0f, 0.0f, 0.0f, 0.0f};
                        i2 = i7;
                        float[] fArr7 = {0.0f, 0.0f, 0.0f, 0.0f};
                        i = i8;
                        c = 0;
                        C6982a.m36406a((Object) fArr, i13, (Object) fArr6, 0, 4);
                        C6982a.m36406a((Object) fArr, i14, (Object) fArr7, 0, 4);
                        this.f25527dU.mo22045a(fArr6, fArr4);
                        this.f25527dU.mo22045a(fArr7, fArr5);
                    } else {
                        i2 = i7;
                        i = i8;
                        c = 0;
                        C6982a.m36406a((Object) fArr, i13, (Object) fArr4, 0, 4);
                        C6982a.m36406a((Object) fArr, i14, (Object) fArr5, 0, 4);
                    }
                    if (this.f24732w.mo21950ad()) {
                        this.f24732w.mo21724b(f);
                        this.f24732w.mo21997o(i15);
                        this.f24732w.mo21709a(fArr4[c], fArr4[1], fArr4[2]);
                        this.f24732w.mo21724b(f2);
                        this.f24732w.mo21997o(i16);
                        this.f24732w.mo21709a(fArr5[c], fArr5[1], fArr5[2]);
                    } else if (this.f24732w.mo21949ac()) {
                        float i17 = mo22491i(fArr4[c], fArr4[1], fArr4[2], fArr4[3]);
                        float j = mo22493j(fArr4[c], fArr4[1], fArr4[2], fArr4[3]);
                        float i18 = mo22491i(fArr5[c], fArr5[1], fArr5[2], fArr5[3]);
                        float j2 = mo22493j(fArr5[c], fArr5[1], fArr5[2], fArr5[3]);
                        this.f24732w.mo21724b(f);
                        this.f24732w.mo21997o(i15);
                        this.f24732w.mo21708a(i17, j);
                        this.f24732w.mo21724b(f2);
                        this.f24732w.mo21997o(i16);
                        this.f24732w.mo21708a(i18, j2);
                    }
                }
                i9++;
                fArr2 = fArr3;
                sArr2 = sArr;
                jVar2 = jVar;
                i6 = i3;
                iArr2 = iArr;
                i7 = i2;
                i8 = i;
                i4 = 5;
            }
            int[] iArr3 = iArr2;
            float[] fArr8 = fArr2;
            short[] sArr3 = sArr2;
            C7076j jVar3 = jVar2;
            i5++;
            i4 = 5;
        }
        this.f24732w.mo21914I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aV */
    public void mo22441aV() {
        mo22457ay();
        C7082j bt = mo22481bt();
        bt.mo22773a();
        C7076j jVar = this.f25543ds.f25715P;
        for (int i = 0; i < jVar.f25694a; i++) {
            int i2 = jVar.f25696c[i];
            int i3 = jVar.f25695b[i];
            int i4 = jVar.f25698e[i];
            int i5 = i4 * 4;
            bt.mo22779a(this.f25501cv.f25974a, 4, C7056e.f25144bs, 0, i5 * C7056e.f25097aQ);
            bt.mo22790b(this.f25502cw.f25974a, 4, C7056e.f25147bv, 0, i5 * C7056e.f25098aR);
            bt.mo22806j(this.f25503cx.f25974a, 2, C7056e.f25144bs, 0, i4 * 2 * C7056e.f25097aQ);
            bt.mo22778a(this.f25504cy.f25974a, i3, i2);
        }
        bt.mo22789b();
        mo22458az();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aW */
    public void mo22442aW() {
        float f;
        int i;
        short[] sArr;
        char c;
        float[] fArr;
        int i2 = 1;
        this.f24732w.mo22005v(1);
        this.f24732w.mo21928W();
        this.f24732w.mo21735e(this.f24669aq);
        int i3 = 3;
        this.f24732w.mo21714a(3);
        float[] fArr2 = this.f25543ds.f25730ad;
        int[] iArr = this.f25543ds.f25731ae;
        float[] fArr3 = this.f25543ds.f25732af;
        short[] sArr2 = this.f25543ds.f25733ag;
        C7076j jVar = this.f25543ds.f25715P;
        int i4 = 0;
        while (i4 < jVar.f25694a) {
            int i5 = jVar.f25696c[i4];
            int i6 = jVar.f25695b[i4];
            int i7 = jVar.f25698e[i4];
            int i8 = i5;
            while (i8 < (i5 + i6) / i3) {
                float f2 = fArr3[(i8 * 2) + 2];
                if (0.0f < f2) {
                    f = f2 / 0.5f;
                    i = C6982a.m36422d(200, C6982a.m36420c(20, (int) ((6.2831855f * f) / 10.0f))) + i2;
                } else {
                    f = (-f2) / 0.5f;
                    i = 5;
                }
                int i9 = sArr2[i8 * 3] + i7;
                int i10 = C7056e.m37127i(iArr[i9]);
                int[] iArr2 = iArr;
                float[] fArr4 = {0.0f, 0.0f, 0.0f, 0.0f};
                float[] fArr5 = fArr3;
                if (this.f25549e == 0) {
                    float[] fArr6 = {0.0f, 0.0f, 0.0f, 0.0f};
                    sArr = sArr2;
                    c = 0;
                    C6982a.m36406a((Object) fArr2, i9 * 4, (Object) fArr6, 0, 4);
                    this.f25527dU.mo22045a(fArr6, fArr4);
                } else {
                    sArr = sArr2;
                    c = 0;
                    C6982a.m36406a((Object) fArr2, i9 * 4, (Object) fArr4, 0, 4);
                }
                if (this.f24732w.mo21950ad()) {
                    this.f24732w.mo21724b(f);
                    this.f24732w.mo21997o(i10);
                    this.f24732w.mo21709a(fArr4[c], fArr4[1], fArr4[2]);
                } else if (this.f24732w.mo21949ac()) {
                    fArr = fArr2;
                    float i11 = mo22491i(fArr4[c], fArr4[1], fArr4[2], fArr4[3]);
                    float j = mo22493j(fArr4[c], fArr4[1], fArr4[2], fArr4[3]);
                    this.f24732w.mo21724b(f);
                    this.f24732w.mo21997o(i10);
                    this.f24732w.mo21708a(i11, j);
                    i8 += i;
                    iArr = iArr2;
                    fArr3 = fArr5;
                    sArr2 = sArr;
                    fArr2 = fArr;
                    i2 = 1;
                    i3 = 3;
                }
                fArr = fArr2;
                i8 += i;
                iArr = iArr2;
                fArr3 = fArr5;
                sArr2 = sArr;
                fArr2 = fArr;
                i2 = 1;
                i3 = 3;
            }
            float[] fArr7 = fArr2;
            int[] iArr3 = iArr;
            float[] fArr8 = fArr3;
            i4++;
            sArr2 = sArr2;
            i2 = 1;
            i3 = 3;
        }
        this.f24732w.mo21914I();
    }

    /* renamed from: b */
    public void mo21725b(float f, float f2, float f3, float f4) {
        mo22484d(f, f2, 0.0f, f3, f4, 0.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo22484d(float f, float f2, float f3, float f4, float f5, float f6) {
        mo21714a(5);
        this.f25603fb = false;
        this.f24685bI = 1;
        this.f25542dr.mo22527a(this.f24620T, this.f24657ae, this.f24667ao, this.f24628aB, this.f24633aG, this.f24637aK, this.f24641aO);
        this.f25542dr.mo22522a(this.f24687bK, this.f24688bL, this.f24689bM);
        this.f25542dr.mo22525a(f, f2, f3, f4, f5, f6, this.f24619S, this.f24656ad);
        mo21914I();
    }

    /* renamed from: a */
    public void mo21712a(float f, float f2, float f3, float f4, float f5, float f6) {
        mo21714a(9);
        this.f25603fb = false;
        this.f24685bI = 1;
        this.f25542dr.mo22527a(this.f24620T, this.f24657ae, this.f24667ao, this.f24628aB, this.f24633aG, this.f24637aK, this.f24641aO);
        this.f25542dr.mo22522a(this.f24687bK, this.f24688bL, this.f24689bM);
        this.f25542dr.mo22524a(f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 0.0f, this.f24619S, this.f24656ad);
        mo21914I();
    }

    /* renamed from: a */
    public void mo21713a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        mo21714a(17);
        this.f25603fb = false;
        this.f24685bI = 1;
        this.f25542dr.mo22527a(this.f24620T, this.f24657ae, this.f24667ao, this.f24628aB, this.f24633aG, this.f24637aK, this.f24641aO);
        this.f25542dr.mo22522a(this.f24687bK, this.f24688bL, this.f24689bM);
        this.f25542dr.mo22523a(f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 0.0f, f7, f8, 0.0f, this.f24656ad);
        mo21914I();
    }

    /* renamed from: d */
    public void mo21732d(float f, float f2, float f3, float f4) {
        mo21714a(11);
        this.f25603fb = false;
        this.f24685bI = 1;
        this.f25542dr.mo22527a(this.f24620T, this.f24657ae, this.f24667ao, this.f24628aB, this.f24633aG, this.f24637aK, this.f24641aO);
        this.f25542dr.mo22522a(this.f24687bK, this.f24688bL, this.f24689bM);
        this.f25542dr.mo22526a(f, f2, f3, f4, this.f24619S, this.f24656ad);
        mo21914I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo21733d(int i) {
        return i == 4 || (i == 5 && C7056e.f25133bh);
    }

    /* renamed from: a */
    public void mo21945a(String str, float f, float f2) {
        if (this.f24674av == null) {
            mo21986g("text");
        }
        int i = this.f25523dQ ? -1 : 1;
        int length = str.length();
        if (length > this.f24682bF.length) {
            this.f24682bF = new char[(length + 10)];
        }
        int i2 = 0;
        str.getChars(0, length, this.f24682bF, 0);
        float f3 = 0.0f;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f24682bF[i3] == 10) {
                f3 += ((float) i) * this.f24627aA;
            }
        }
        if (this.f24676ax == 3) {
            f2 += (((float) i) * (mo21920O() - f3)) / 2.0f;
        } else if (this.f24676ax == 101) {
            f2 += ((float) i) * mo21920O();
        } else if (this.f24676ax == 102) {
            f2 -= (((float) i) * mo21921P()) + f3;
        }
        int i4 = 0;
        while (i2 < length) {
            if (this.f24682bF[i2] == 10) {
                mo21960b(this.f24682bF, i4, i2, f, f2);
                f2 += ((float) i) * this.f24627aA;
                i4 = i2 + 1;
            }
            i2++;
        }
        if (i4 < length) {
            mo21960b(this.f24682bF, i4, i2, f, f2);
        }
    }

    /* renamed from: O */
    public float mo21920O() {
        if (this.f24674av == null) {
            mo21986g("textAscent");
        }
        Object c = this.f24674av.mo21900c();
        float a = c != null ? (float) this.f25493a.mo22250a(c) : 0.0f;
        return a == 0.0f ? super.mo21920O() : a;
    }

    /* renamed from: P */
    public float mo21921P() {
        if (this.f24674av == null) {
            mo21986g("textDescent");
        }
        Object c = this.f24674av.mo21900c();
        float b = c != null ? (float) this.f25493a.mo22291b(c) : 0.0f;
        return b == 0.0f ? super.mo21921P() : b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo21704a(char[] cArr, int i, int i2) {
        Object c = this.f24674av.mo21900c();
        float a = c != null ? (float) this.f25493a.mo22251a(c, cArr, i, i2) : 0.0f;
        return a == 0.0f ? super.mo21704a(cArr, i, i2) : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo21974e(float f) {
        Object c = this.f24674av.mo21900c();
        if (c != null) {
            Object a = this.f25493a.mo22255a(c, f);
            if (a != null) {
                this.f24674av.mo21896a(a);
            }
        }
        super.mo21974e(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21720a(char[] cArr, int i, int i2, float f, float f2) {
        if (this.f24677ay == 4) {
            this.f25552eC = mo22408a(this.f24674av);
            if (this.f25552eC == null || this.f25552eC.mo22130d()) {
                this.f25552eC = new C7013a(this, this.f24674av, mo21950ad());
                mo22413a(this.f24674av, this.f25552eC);
            }
            this.f25552eC.mo22123a();
            int i3 = this.f24690bN;
            boolean z = this.f24656ad;
            float f3 = this.f24687bK;
            float f4 = this.f24688bL;
            float f5 = this.f24689bM;
            boolean z2 = this.f24608H;
            int i4 = this.f24609I;
            int i5 = this.f24704bb;
            this.f24690bN = 1;
            this.f24656ad = false;
            this.f24687bK = 0.0f;
            this.f24688bL = 0.0f;
            this.f24689bM = 1.0f;
            this.f24608H = true;
            this.f24609I = this.f24620T;
            mo21989h(1);
            super.mo21720a(cArr, i, i2, f, f2);
            this.f24690bN = i3;
            this.f24656ad = z;
            this.f24687bK = f3;
            this.f24688bL = f4;
            this.f24689bM = f5;
            this.f24608H = z2;
            this.f24609I = i4;
            mo21989h(i5);
            this.f25552eC.mo22127b();
        } else if (this.f24677ay == 5) {
            super.mo21720a(cArr, i, i2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21933a(char c, float f, float f2) {
        C6988a b = this.f24674av.mo21897b(c);
        if (b == null) {
            return;
        }
        if (this.f24677ay == 4) {
            C7014a a = this.f25552eC.mo22121a(b);
            if (a == null) {
                a = this.f25552eC.mo22122a(this, b);
            }
            float a2 = ((((float) b.f24594h) / ((float) this.f24674av.mo21892a())) * this.f24678az) + f;
            float f3 = (float) (this.f25523dQ ? -1 : 1);
            float a3 = f2 - (((((float) b.f24593g) / ((float) this.f24674av.mo21892a())) * f3) * this.f24678az);
            mo22415a(a, a2, a3, a2 + ((((float) b.f24590d) / ((float) this.f24674av.mo21892a())) * this.f24678az), a3 + (f3 * (((float) b.f24589c) / ((float) this.f24674av.mo21892a())) * this.f24678az));
        } else if (this.f24677ay == 5) {
            mo22460b(c, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22415a(C7014a aVar, float f, float f2, float f3, float f4) {
        mo21714a(17);
        mo21718a(this.f25552eC.mo22120a(aVar));
        mo21710a(f, f2, aVar.f24890e, aVar.f24892g);
        mo21710a(f3, f2, aVar.f24891f, aVar.f24892g);
        mo21710a(f3, f4, aVar.f24891f, aVar.f24893h);
        mo21710a(f, f4, aVar.f24890e, aVar.f24893h);
        mo21914I();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22460b(char c, float f, float f2) {
        boolean z;
        boolean z2 = this.f24656ad;
        char c2 = 0;
        this.f24656ad = false;
        C7057a a = this.f25493a.mo22252a(c, this.f24674av.mo21900c());
        float[] fArr = new float[6];
        mo21909D();
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (!a.mo22384a()) {
            int a2 = a.mo22383a(fArr);
            char c3 = 1;
            if (!z3) {
                mo21912G();
                z = true;
            } else {
                z = z3;
            }
            if (a2 == C7056e.f25134bi || a2 == C7056e.f25135bj) {
                mo21708a(f + fArr[0], f2 + fArr[1]);
                f3 = fArr[0];
                f4 = fArr[1];
            } else if (a2 == C7056e.f25136bk) {
                int i = 1;
                while (i < this.f24720br) {
                    float f5 = ((float) i) / ((float) this.f24720br);
                    int i2 = i;
                    mo21708a(f + mo21952b(f3, f3 + ((float) (((double) ((fArr[c2] - f3) * 2.0f)) / 3.0d)), fArr[2] + ((float) (((double) ((fArr[c2] - fArr[2]) * 2.0f)) / 3.0d)), fArr[2], f5), f2 + mo21952b(f4, f4 + ((float) (((double) ((fArr[c3] - f4) * 2.0f)) / 3.0d)), fArr[3] + ((float) (((double) ((fArr[c3] - fArr[3]) * 2.0f)) / 3.0d)), fArr[3], f5));
                    i = i2 + 1;
                    c3 = 1;
                }
                f3 = fArr[2];
                f4 = fArr[3];
            } else if (a2 == C7056e.f25137bl) {
                int i3 = 1;
                while (i3 < this.f24720br) {
                    float f6 = ((float) i3) / ((float) this.f24720br);
                    mo21708a(f + mo21952b(f3, fArr[c2], fArr[2], fArr[4], f6), f2 + mo21952b(f4, fArr[1], fArr[3], fArr[5], f6));
                    i3++;
                    c2 = 0;
                }
                f3 = fArr[4];
                f4 = fArr[5];
            } else if (a2 == C7056e.f25138bm) {
                mo21913H();
                z = false;
            }
            a.mo22385b();
            z3 = z;
            c2 = 0;
        }
        mo21914I();
        this.f24656ad = z2;
    }

    /* renamed from: g */
    public void mo21738g() {
        if (this.f25579ee != 32) {
            this.f25527dU.mo22044a(this.f25580ef[this.f25579ee]);
            this.f25528dV.mo22044a(this.f25581eg[this.f25579ee]);
            this.f25525dS.mo22044a(this.f25582eh[this.f25579ee]);
            this.f25526dT.mo22044a(this.f25583ei[this.f25579ee]);
            this.f25579ee++;
            return;
        }
        throw new RuntimeException("Too many calls to pushMatrix().");
    }

    /* renamed from: h */
    public void mo21739h() {
        if (this.f25579ee != 0) {
            this.f25579ee--;
            this.f25527dU.mo22049b(this.f25580ef[this.f25579ee]);
            this.f25528dV.mo22049b(this.f25581eg[this.f25579ee]);
            this.f25525dS.mo22049b(this.f25582eh[this.f25579ee]);
            this.f25526dT.mo22049b(this.f25583ei[this.f25579ee]);
            mo22425aF();
            return;
        }
        throw new RuntimeException("Too many calls to popMatrix(), and not enough to pushMatrix().");
    }

    /* renamed from: a */
    protected static float m37476a(C6993e eVar) {
        if (eVar != null) {
            if (eVar instanceof C6994f) {
                C6994f fVar = (C6994f) eVar;
                return (float) Math.sqrt((double) Math.abs((fVar.f24763a * fVar.f24767e) - (fVar.f24764b * fVar.f24766d)));
            } else if (eVar instanceof C6995g) {
                C6995g gVar = (C6995g) eVar;
                return (float) Math.pow((double) Math.abs((gVar.f24769a * ((gVar.f24774f * gVar.f24779k) - (gVar.f24775g * gVar.f24778j))) + (gVar.f24770b * ((gVar.f24775g * gVar.f24777i) - (gVar.f24773e * gVar.f24779k))) + (gVar.f24771c * ((gVar.f24773e * gVar.f24778j) - (gVar.f24774f * gVar.f24777i)))), 0.3333333432674408d);
            }
        }
        return 1.0f;
    }

    /* renamed from: i */
    public void mo21740i() {
        this.f25527dU.mo22038a();
        this.f25528dV.mo22038a();
        this.f25529dW.mo22042a((C6993e) this.f25524dR);
        this.f25525dS.mo22038a();
        this.f25526dT.mo22038a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aX */
    public boolean mo22443aX() {
        return m37509i(this.f25524dR.f24770b) && m37509i(this.f25524dR.f24771c) && m37509i(this.f25524dR.f24773e) && m37509i(this.f25524dR.f24775g) && m37509i(this.f25524dR.f24777i) && m37509i(this.f25524dR.f24778j) && m37509i(this.f25524dR.f24781m) && m37509i(this.f25524dR.f24782n) && m37509i(this.f25524dR.f24783o) && m37505g(this.f25524dR.f24784p, 1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: aY */
    public boolean mo22444aY() {
        return m37511j(this.f25524dR.f24770b) || m37511j(this.f25524dR.f24771c) || m37511j(this.f25524dR.f24773e) || m37511j(this.f25524dR.f24775g) || m37511j(this.f25524dR.f24777i) || m37511j(this.f25524dR.f24778j) || m37511j(this.f25524dR.f24781m) || m37511j(this.f25524dR.f24782n) || m37511j(this.f25524dR.f24783o) || m37507h(this.f25524dR.f24784p, 1.0f);
    }

    /* renamed from: g */
    protected static boolean m37505g(float f, float f2) {
        return Math.abs(f - f2) < C7056e.f25101aU;
    }

    /* renamed from: h */
    protected static boolean m37507h(float f, float f2) {
        return C7056e.f25101aU <= Math.abs(f - f2);
    }

    /* renamed from: i */
    protected static boolean m37509i(float f) {
        return Math.abs(f) < C7056e.f25101aU;
    }

    /* renamed from: j */
    protected static boolean m37511j(float f) {
        return C7056e.f25101aU <= Math.abs(f);
    }

    /* renamed from: Q */
    public void mo21922Q() {
        mo21934a(this.f25515dI, this.f25516dJ, this.f25517dK, this.f25515dI, this.f25516dJ, 0.0f, 0.0f, 1.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo21934a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = f;
        float f11 = f2;
        float f12 = f3;
        float f13 = f7;
        this.f25508dB = f10;
        this.f25509dC = f11;
        this.f25510dD = f12;
        float f14 = f10 - f4;
        float f15 = f11 - f5;
        float f16 = f12 - f6;
        this.f25521dO = C6982a.m36418c((f14 * f14) + (f15 * f15) + (f16 * f16));
        if (m37511j(this.f25521dO)) {
            f14 /= this.f25521dO;
            f15 /= this.f25521dO;
            f16 /= this.f25521dO;
        }
        float f17 = (f8 * f16) - (f9 * f15);
        float f18 = ((-f13) * f16) + (f9 * f14);
        float f19 = (f13 * f15) - (f8 * f14);
        float f20 = (f15 * f19) - (f16 * f18);
        float f21 = ((-f14) * f19) + (f16 * f17);
        float f22 = (f14 * f18) - (f15 * f17);
        float c = C6982a.m36418c((f17 * f17) + (f18 * f18) + (f19 * f19));
        if (m37511j(c)) {
            f17 /= c;
            f18 /= c;
            f19 /= c;
        }
        float f23 = f19;
        float f24 = f17;
        float f25 = f18;
        float c2 = C6982a.m36418c((f20 * f20) + (f21 * f21) + (f22 * f22));
        if (m37511j(c2)) {
            f20 /= c2;
            f21 /= c2;
            f22 /= c2;
        }
        float f26 = f22;
        float f27 = f24;
        float f28 = f21;
        float f29 = f16;
        this.f25527dU.mo22041a(f27, f25, f23, 0.0f, f20, f28, f26, 0.0f, f14, f15, f29, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        float f30 = -f10;
        float f31 = -f11;
        float f32 = -f12;
        this.f25527dU.mo22039a(f30, f31, f32);
        this.f25528dV.mo22041a(f27, f20, f14, 0.0f, f25, f28, f15, 0.0f, f23, f26, f29, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        this.f25528dV.mo22039a(-f30, -f31, -f32);
        this.f25525dS.mo22042a((C6993e) this.f25527dU);
        this.f25526dT.mo22042a((C6993e) this.f25528dV);
        mo22425aF();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo22404f() {
        mo21922Q();
    }

    /* renamed from: b */
    public void mo21956b(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 - f;
        float f8 = f4 - f3;
        float f9 = f6 - f5;
        mo22004v();
        float f10 = -2.0f / f9;
        float f11 = (-(f2 + f)) / f7;
        float f12 = (-(f4 + f3)) / f8;
        float f13 = (-(f6 + f5)) / f9;
        this.f25524dR.mo22041a(2.0f / f7, 0.0f, 0.0f, f11, 0.0f, -(2.0f / f8), 0.0f, f12, 0.0f, 0.0f, f10, f13, 0.0f, 0.0f, 0.0f, 1.0f);
        mo22425aF();
    }

    /* renamed from: R */
    public void mo21923R() {
        mo21984g(this.f25514dH, this.f25520dN, this.f25518dL, this.f25519dM);
    }

    /* renamed from: g */
    public void mo21984g(float f, float f2, float f3, float f4) {
        float tan = f3 * ((float) Math.tan((double) (f / 2.0f)));
        float f5 = -tan;
        mo21963c(f5 * f2, tan * f2, f5, tan, f3, f4);
    }

    /* renamed from: c */
    public void mo21963c(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4;
        float f8 = f5;
        float f9 = f6;
        mo22004v();
        this.f25507dA = ((float) Math.atan2((double) f7, (double) f8)) * 2.0f;
        this.f25513dG = f / f3;
        this.f25511dE = f8;
        this.f25512dF = f9;
        float f10 = f8 * 2.0f;
        float f11 = f2 - f;
        float f12 = f7 - f3;
        float f13 = f9 - f8;
        this.f25524dR.mo22041a(f10 / f11, 0.0f, (f2 + f) / f11, 0.0f, 0.0f, (-f10) / f12, (f7 + f3) / f12, 0.0f, 0.0f, 0.0f, (-(f9 + f8)) / f13, (-(f10 * f9)) / f13, 0.0f, 0.0f, -1.0f, 0.0f);
        mo22425aF();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22403c() {
        mo21923R();
    }

    /* renamed from: b */
    public float mo21721b(float f, float f2) {
        return mo22489h(f, f2, 0.0f);
    }

    /* renamed from: c */
    public float mo21727c(float f, float f2) {
        return mo22490i(f, f2, 0.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public float mo22489h(float f, float f2, float f3) {
        return mo22491i((this.f25527dU.f24769a * f) + (this.f25527dU.f24770b * f2) + (this.f25527dU.f24771c * f3) + this.f25527dU.f24772d, (this.f25527dU.f24773e * f) + (this.f25527dU.f24774f * f2) + (this.f25527dU.f24775g * f3) + this.f25527dU.f24776h, (this.f25527dU.f24777i * f) + (this.f25527dU.f24778j * f2) + (this.f25527dU.f24779k * f3) + this.f25527dU.f24780l, (this.f25527dU.f24781m * f) + (this.f25527dU.f24782n * f2) + (this.f25527dU.f24783o * f3) + this.f25527dU.f24784p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public float mo22491i(float f, float f2, float f3, float f4) {
        float f5 = (this.f25524dR.f24769a * f) + (this.f25524dR.f24770b * f2) + (this.f25524dR.f24771c * f3) + (this.f25524dR.f24772d * f4);
        float f6 = (this.f25524dR.f24781m * f) + (this.f25524dR.f24782n * f2) + (this.f25524dR.f24783o * f3) + (this.f25524dR.f24784p * f4);
        if (m37511j(f6)) {
            f5 /= f6;
        }
        return (((float) this.f24750ce) * (f5 + 1.0f)) / 2.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public float mo22490i(float f, float f2, float f3) {
        return mo22493j((this.f25527dU.f24769a * f) + (this.f25527dU.f24770b * f2) + (this.f25527dU.f24771c * f3) + this.f25527dU.f24772d, (this.f25527dU.f24773e * f) + (this.f25527dU.f24774f * f2) + (this.f25527dU.f24775g * f3) + this.f25527dU.f24776h, (this.f25527dU.f24777i * f) + (this.f25527dU.f24778j * f2) + (this.f25527dU.f24779k * f3) + this.f25527dU.f24780l, (this.f25527dU.f24781m * f) + (this.f25527dU.f24782n * f2) + (this.f25527dU.f24783o * f3) + this.f25527dU.f24784p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public float mo22493j(float f, float f2, float f3, float f4) {
        float f5 = (this.f25524dR.f24773e * f) + (this.f25524dR.f24774f * f2) + (this.f25524dR.f24775g * f3) + (this.f25524dR.f24776h * f4);
        float f6 = (this.f25524dR.f24781m * f) + (this.f25524dR.f24782n * f2) + (this.f25524dR.f24783o * f3) + (this.f25524dR.f24784p * f4);
        if (m37511j(f6)) {
            f5 /= f6;
        }
        return ((float) this.f24751cf) - ((((float) this.f24751cf) * (f5 + 1.0f)) / 2.0f);
    }

    /* renamed from: T */
    public void mo21925T() {
        boolean z = this.f24632aF;
        super.mo21925T();
        if (!z) {
            this.f24632aF = false;
        }
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

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo21745n() {
        super.mo21745n();
        if (!this.f24632aF) {
            mo21929X();
            this.f24632aF = false;
        }
    }

    /* renamed from: aa */
    public void mo21947aa() {
        mo22445aZ();
        this.f25586el = 0;
    }

    /* renamed from: e */
    public void mo21976e(float f, float f2, float f3) {
        this.f25596ev = f;
        this.f25597ew = f2;
        this.f25598ex = f3;
    }

    /* renamed from: f */
    public void mo21980f(float f, float f2, float f3) {
        mo21983g(f, f2, f3);
        this.f25595eu[0] = this.f24705bc;
        this.f25595eu[1] = this.f24706bd;
        this.f25595eu[2] = this.f24707be;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aZ */
    public void mo22445aZ() {
        mo22004v();
        this.f25585ek = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo21746o() {
        mo22004v();
        this.f25493a.mo22259a(this.f24646aT, this.f24647aU, this.f24648aV, this.f24649aW, !this.f24734y[5], true);
        this.f24762cq = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo22494j(String str) {
        if (!this.f24734y[4]) {
            int U = this.f25493a.mo22246U();
            if (U != 0) {
                String y = this.f25493a.mo22379y(U);
                StringBuilder sb = new StringBuilder();
                sb.append("OpenGL error ");
                sb.append(U);
                sb.append(" at ");
                sb.append(str);
                sb.append(": ");
                sb.append(y);
                C6989c.m36558a(sb.toString());
            }
        }
    }

    /* renamed from: p */
    public void mo21747p() {
        if (!this.f24733x || !this.f25577ec) {
            boolean z = false;
            if (!this.f25568eS) {
                mo21731d();
                z = true;
            }
            if (!this.f24762cq) {
                mo22004v();
            }
            mo22462ba();
            if (!this.f24762cq) {
                mo22463bb();
            }
            this.f24762cq = true;
            if (z) {
                mo21734e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ba */
    public void mo22462ba() {
        mo22495k();
        if (this.f24749cd == null || this.f24749cd.length != this.f24753ch * this.f24754ci) {
            this.f24749cd = new int[(this.f24753ch * this.f24754ci)];
            this.f25564eO = C7056e.m37108a(this.f24749cd);
            this.f24762cq = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bb */
    public void mo22463bb() {
        mo22495k();
        mo22405A(1);
        try {
            this.f25493a.mo22274a(0, 0, this.f24753ch, this.f24754ci, C7056e.f25150by, C7056e.f25147bv, this.f25564eO);
        } catch (IndexOutOfBoundsException unused) {
        }
        mo22428aI();
        try {
            C7056e.m37114a(this.f25564eO, this.f24749cd);
            C7056e.m37118a(this.f24749cd, this.f24753ch, this.f24754ci);
        } catch (ArrayIndexOutOfBoundsException unused2) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22483c(int i, int i2, int i3, int i4) {
        mo22419a(this.f24749cd, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22419a(int[] r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            e.f.e r6 = r0.f25493a
            float r6 = r6.mo22368r()
            int r6 = (int) r6
            int r13 = r6 * r4
            int r7 = r13 * r6
            int r7 = r7 * r5
            int[] r8 = r0.f25565eP
            if (r8 == 0) goto L_0x0022
            int[] r8 = r0.f25565eP
            int r8 = r8.length
            if (r8 >= r7) goto L_0x002e
        L_0x0022:
            int[] r8 = new int[r7]
            r0.f25565eP = r8
            int[] r8 = r0.f25565eP
            java.nio.IntBuffer r8 = p256e.p262f.C7056e.m37108a(r8)
            r0.f25566eQ = r8
        L_0x002e:
            r8 = 0
            if (r2 > 0) goto L_0x0042
            if (r3 > 0) goto L_0x0042
            int r9 = r0.f24750ce     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            if (r4 < r9) goto L_0x0042
            int r9 = r0.f24751cf     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            if (r5 >= r9) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            int[] r9 = r0.f25565eP     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            p256e.p259c.C6982a.m36406a(r1, r8, r9, r8, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            goto L_0x0060
        L_0x0042:
            int r7 = r0.f24750ce     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            int r7 = r7 * r3
            int r7 = r7 + r2
            int r7 = r7 * r6
            int r9 = r6 * r3
            r10 = 0
        L_0x004c:
            int r11 = r3 + r5
            int r11 = r11 * r6
            if (r9 >= r11) goto L_0x0060
            int[] r11 = r0.f25565eP     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            java.lang.System.arraycopy(r1, r7, r11, r10, r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            int r11 = r0.f24750ce     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            int r11 = r11 * r6
            int r7 = r7 + r11
            int r10 = r10 + r13
            int r9 = r9 + 1
            goto L_0x004c
        L_0x0060:
            int[] r1 = r0.f25565eP     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
            int r7 = r6 * r5
            p256e.p262f.C7056e.m37125c(r1, r13, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0067 }
        L_0x0067:
            java.nio.IntBuffer r1 = r0.f25566eQ
            int[] r7 = r0.f25565eP
            p256e.p262f.C7056e.m37122b(r1, r7)
            boolean r1 = r0.f24733x
            r7 = 2
            if (r1 == 0) goto L_0x007e
            e.f.e r1 = r0.f25493a
            boolean r1 = r1.mo22344g()
            if (r1 != 0) goto L_0x007e
            r0.mo22412a(r7, r8)
        L_0x007e:
            boolean r1 = r0.f24733x
            if (r1 == 0) goto L_0x009a
            e.f.e r1 = r0.f25493a
            boolean r1 = r1.mo22344g()
            if (r1 == 0) goto L_0x009e
            e.f.e r1 = r0.f25493a
            boolean r1 = r1.mo22344g()
            if (r1 == 0) goto L_0x009a
            e.f.e r1 = r0.f25493a
            boolean r1 = r1.mo22357j()
            if (r1 != 0) goto L_0x009e
        L_0x009a:
            boolean r1 = r0.f25560eK
            if (r1 == 0) goto L_0x009f
        L_0x009e:
            r8 = 1
        L_0x009f:
            e.f.l r1 = r0.f25562eM
            if (r1 != 0) goto L_0x00a4
            return
        L_0x00a4:
            if (r8 == 0) goto L_0x00e3
            e.f.l r1 = r0.f25562eM
            int r1 = r1.f25948j
            int r18 = r6 * r2
            int r1 = r1 - r18
            int r20 = p256e.p259c.C6982a.m36422d(r1, r13)
            e.f.l r1 = r0.f25562eM
            int r1 = r1.f25949k
            int r19 = r6 * r3
            int r1 = r1 - r19
            int r6 = r6 * r5
            int r21 = p256e.p259c.C6982a.m36422d(r1, r6)
            e.f.e r14 = r0.f25493a
            e.f.l r1 = r0.f25562eM
            int r15 = r1.f25942d
            e.f.l r1 = r0.f25562eM
            int r1 = r1.f25943e
            e.f.l r6 = r0.f25562eM
            int r6 = r6.f25941c
            java.nio.IntBuffer r8 = r0.f25566eQ
            r16 = r1
            r17 = r6
            r22 = r8
            r14.mo22273a(r15, r16, r17, r18, r19, r20, r21, r22)
            r0.mo22405A(r7)
            r0.mo22485d(r2, r3, r4, r5)
            r23.mo22428aI()
            goto L_0x0101
        L_0x00e3:
            e.f.e r7 = r0.f25493a
            e.f.l r1 = r0.f25562eM
            int r8 = r1.f25942d
            e.f.l r1 = r0.f25562eM
            int r9 = r1.f25943e
            e.f.l r1 = r0.f25562eM
            int r10 = r1.f25941c
            int r11 = r6 * r2
            int r1 = r0.f24751cf
            int r2 = r3 + r5
            int r1 = r1 - r2
            int r12 = r6 * r1
            int r14 = r6 * r5
            java.nio.IntBuffer r15 = r0.f25566eQ
            r7.mo22273a(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p262f.C7065i.mo22419a(int[], int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo21749r() {
        super.mo21749r();
        if (this.f24696bT != null) {
            new File(this.f24696bT).delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo21750s() {
        super.mo21750s();
        this.f25493a.mo22284a((Runnable) new Runnable() {
            public void run() {
                File file;
                Context e = C7065i.this.f24755cj.mo21850e();
                if (e != null && !C7065i.this.f24755cj.mo21845d().mo22053a().mo21768f()) {
                    try {
                        C7065i.this.f24697bU = C7065i.this.f24753ch;
                        C7065i.this.f24698bV = C7065i.this.f24754ci;
                        int[] iArr = new int[(C7065i.this.f24697bU * C7065i.this.f24698bV)];
                        IntBuffer wrap = IntBuffer.wrap(iArr);
                        wrap.position(0);
                        C7065i.this.mo22405A(1);
                        C7065i.this.f25493a.mo22274a(0, 0, C7065i.this.f24753ch, C7065i.this.f24754ci, C7056e.f25150by, C7056e.f25147bv, wrap);
                        C7065i.this.mo22428aI();
                        if ("mounted" != Environment.getExternalStorageState()) {
                            if (Environment.isExternalStorageRemovable()) {
                                file = e.getCacheDir();
                                StringBuilder sb = new StringBuilder();
                                sb.append(file);
                                sb.append(File.separator);
                                sb.append("restore_pixels");
                                File file2 = new File(sb.toString());
                                C7065i.this.f24696bT = file2.getAbsolutePath();
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                                objectOutputStream.writeObject(iArr);
                                objectOutputStream.flush();
                                fileOutputStream.getFD().sync();
                                fileOutputStream.close();
                            }
                        }
                        file = e.getExternalCacheDir();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(file);
                        sb2.append(File.separator);
                        sb2.append("restore_pixels");
                        File file22 = new File(sb2.toString());
                        C7065i.this.f24696bT = file22.getAbsolutePath();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file22);
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
                        objectOutputStream2.writeObject(iArr);
                        objectOutputStream2.flush();
                        fileOutputStream2.getFD().sync();
                        fileOutputStream2.close();
                    } catch (Exception e2) {
                        C6989c.m36558a("Could not save screen contents to cache");
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo21751t() {
        if (this.f25578ed) {
            this.f25578ed = false;
            if (this.f24696bT != null && this.f24697bU == this.f24753ch && this.f24698bV == this.f24754ci) {
                this.f24699bW = 2;
            }
        } else if (this.f24699bW > 0) {
            this.f24699bW--;
            if (this.f24699bW == 0) {
                if (this.f24755cj.mo21850e() != null) {
                    try {
                        File file = new File(this.f24696bT);
                        FileInputStream fileInputStream = new FileInputStream(file);
                        int[] iArr = (int[]) new ObjectInputStream(fileInputStream).readObject();
                        if (iArr.length == this.f24753ch * this.f24754ci) {
                            C7056e.m37118a(iArr, this.f24753ch, this.f24754ci);
                            mo22419a(iArr, 0, 0, this.f24753ch, this.f24754ci);
                        }
                        fileInputStream.close();
                        file.delete();
                    } catch (Exception e) {
                        C6989c.m36558a("Could not restore screen contents from cache");
                        e.printStackTrace();
                    } catch (Throwable th) {
                        this.f24696bT = null;
                        this.f24697bU = -1;
                        this.f24698bV = -1;
                        this.f24701bY = true;
                        throw th;
                    }
                    this.f24696bT = null;
                    this.f24697bU = -1;
                    this.f24698bV = -1;
                    this.f24701bY = true;
                } else {
                    return;
                }
            }
        }
        super.mo21751t();
    }

    /* renamed from: b */
    public int mo21722b(int i, int i2) {
        mo21747p();
        return super.mo21722b(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22018a(int i, int i2, int i3, int i4, C6992d dVar, int i5, int i6) {
        mo21747p();
        super.mo22018a(i, i2, i3, i4, dVar, i5, i6);
    }

    /* renamed from: a */
    public void mo21716a(int i, int i2, int i3) {
        mo21747p();
        super.mo21716a(i, i2, i3);
    }

    /* renamed from: h */
    public boolean mo21990h(String str) {
        return mo22492i(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21972d(C6992d dVar) {
        if (dVar.f24748cc == -1) {
            C7056e.m37118a(dVar.f24749cd, dVar.f24750ce, dVar.f24751cf);
            dVar.f24748cc = 2;
        } else if (dVar.f24748cc == -2) {
            C7056e.m37123b(dVar.f24749cd, dVar.f24750ce, dVar.f24751cf);
            dVar.f24748cc = 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22412a(int i, boolean z) {
        mo22495k();
        if (this.f24753ch != 0 && this.f24754ci != 0) {
            if (this.f25562eM == null || this.f25562eM.mo22877n()) {
                this.f25562eM = new C7088l(this, this.f24753ch, this.f24754ci, new C7090b(2, i, z));
                this.f25562eM.mo22861b(!this.f25523dQ);
                this.f25562eM.mo22864c(true);
                mo21942a((C6992d) this, (Object) this.f25562eM);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public void mo22464bc() {
        mo22495k();
        if (this.f25562eM != null) {
            this.f25563eN = new C7088l(this, this.f24753ch, this.f24754ci, this.f25562eM.mo22881r());
            this.f25563eN.mo22861b(!this.f25523dQ);
            this.f25563eN.mo22864c(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bd */
    public void mo22465bd() {
        C7051b bVar = this.f25558eI;
        if (this.f25562eM != null && this.f25563eN != null && bVar != null) {
            int i = this.f25562eM.f25941c;
            this.f25562eM.f25941c = this.f25563eN.f25941c;
            this.f25563eN.f25941c = i;
            bVar.mo22173a(this.f25562eM);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo22485d(int i, int i2, int i3, int i4) {
        if (this.f25562eM != null) {
            this.f25493a.mo22376w(C7056e.f25228dY);
            int i5 = i + i3;
            int i6 = i2 + i4;
            this.f25493a.mo22270a(this.f25562eM.f25942d, this.f25562eM.f25941c, this.f25562eM.f25948j, this.f25562eM.f25949k, 0, 0, this.f24750ce, this.f24751cf, i, i2, i5, i6, i, this.f24751cf - i6, i5, this.f24751cf - i2);
            this.f25493a.mo22374v(C7056e.f25228dY);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: be */
    public void mo22466be() {
        if (this.f25563eN != null) {
            this.f25493a.mo22376w(C7056e.f25228dY);
            this.f25493a.mo22268a(this.f25563eN.f25942d, this.f25563eN.f25941c, this.f25563eN.f25948j, this.f25563eN.f25949k, 0, 0, this.f24750ce, this.f24751cf);
            this.f25493a.mo22374v(C7056e.f25228dY);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo21915J() {
        if (this.f24704bb != this.f25572eW) {
            mo22004v();
        }
        this.f25493a.mo22374v(C7056e.f25228dY);
        if (this.f24704bb == 0) {
            if (f25459cI) {
                this.f25493a.mo22236P(C7056e.f25307ez);
            }
            this.f25493a.mo22351i(C7056e.f25229dZ, C7056e.f25282ea);
        } else if (this.f24704bb == 1) {
            if (f25459cI) {
                this.f25493a.mo22347h(C7056e.f25307ez, C7056e.f25307ez);
            }
            this.f25493a.mo22348h(C7056e.f25283eb, C7056e.f25285ed, C7056e.f25229dZ, C7056e.f25229dZ);
        } else if (this.f24704bb == 2) {
            if (f25459cI) {
                this.f25493a.mo22347h(C7056e.f25307ez, C7056e.f25307ez);
            }
            this.f25493a.mo22348h(C7056e.f25283eb, C7056e.f25229dZ, C7056e.f25229dZ, C7056e.f25229dZ);
        } else if (this.f24704bb == 4) {
            if (f25459cI) {
                this.f25493a.mo22347h(C7056e.f25258eC, C7056e.f25307ez);
                this.f25493a.mo22348h(C7056e.f25283eb, C7056e.f25229dZ, C7056e.f25229dZ, C7056e.f25229dZ);
            } else {
                C6989c.m36559a("blendMode(%1$s) is not supported by this hardware (or driver)", "SUBTRACT");
            }
        } else if (this.f24704bb == 8) {
            if (f25459cI) {
                this.f25493a.mo22347h(C7056e.f25257eB, C7056e.f25307ez);
                this.f25493a.mo22348h(C7056e.f25229dZ, C7056e.f25229dZ, C7056e.f25229dZ, C7056e.f25229dZ);
            } else {
                C6989c.m36559a("blendMode(%1$s) is not supported by this hardware (or driver)", "LIGHTEST");
            }
        } else if (this.f24704bb == 16) {
            if (f25459cI) {
                this.f25493a.mo22347h(C7056e.f25256eA, C7056e.f25307ez);
                this.f25493a.mo22348h(C7056e.f25229dZ, C7056e.f25229dZ, C7056e.f25229dZ, C7056e.f25229dZ);
            } else {
                C6989c.m36559a("blendMode(%1$s) is not supported by this hardware (or driver)", "DARKEST");
            }
        } else if (this.f24704bb == 64) {
            if (f25459cI) {
                this.f25493a.mo22347h(C7056e.f25307ez, C7056e.f25307ez);
            }
            this.f25493a.mo22348h(C7056e.f25286ee, C7056e.f25287ef, C7056e.f25229dZ, C7056e.f25229dZ);
        } else if (this.f24704bb == 128) {
            if (f25459cI) {
                this.f25493a.mo22347h(C7056e.f25307ez, C7056e.f25307ez);
            }
            this.f25493a.mo22348h(C7056e.f25282ea, C7056e.f25289eh, C7056e.f25229dZ, C7056e.f25229dZ);
        } else if (this.f24704bb == 256) {
            if (f25459cI) {
                this.f25493a.mo22347h(C7056e.f25307ez, C7056e.f25307ez);
            }
            this.f25493a.mo22348h(C7056e.f25286ee, C7056e.f25229dZ, C7056e.f25229dZ, C7056e.f25229dZ);
        } else if (this.f24704bb == 32) {
            C6989c.m36559a("blendMode(%1$s) is not supported by this renderer", "DIFFERENCE");
        } else if (this.f24704bb == 512) {
            C6989c.m36559a("blendMode(%1$s) is not supported by this renderer", "OVERLAY");
        } else if (this.f24704bb == 1024) {
            C6989c.m36559a("blendMode(%1$s) is not supported by this renderer", "HARD_LIGHT");
        } else if (this.f24704bb == 2048) {
            C6989c.m36559a("blendMode(%1$s) is not supported by this renderer", "SOFT_LIGHT");
        } else if (this.f24704bb == 4096) {
            C6989c.m36559a("blendMode(%1$s) is not supported by this renderer", "DODGE");
        } else if (this.f24704bb == 8192) {
            C6989c.m36559a("blendMode(%1$s) is not supported by this renderer", "BURN");
        }
        this.f25572eW = this.f24704bb;
    }

    /* renamed from: e */
    public C7088l mo22486e(C6992d dVar) {
        C7088l lVar = (C7088l) mo22487f(dVar);
        if (lVar == null) {
            return null;
        }
        if (dVar.mo22022ag()) {
            if (!(dVar.f24750ce == lVar.f25939a && dVar.f24751cf == lVar.f25940b)) {
                lVar.mo22843a(dVar.f24750ce, dVar.f24751cf);
            }
            mo22414a(dVar, lVar);
        }
        if (lVar.mo22873j()) {
            lVar.mo22874k();
        }
        mo22417a(lVar);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object mo22487f(C6992d dVar) {
        if (!mo22470bi()) {
            return null;
        }
        C7088l lVar = (C7088l) mo21954b(dVar);
        if (lVar == null || lVar.mo22877n()) {
            lVar = mo22488g(dVar);
            if (lVar != null) {
                boolean z = !dVar.f24762cq;
                dVar.mo21747p();
                lVar.mo22854a(dVar.f24749cd, dVar.f24748cc);
                dVar.mo22023ah();
                if (z) {
                    dVar.f24749cd = null;
                    dVar.f24762cq = false;
                }
            }
        }
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bf */
    public void mo22467bf() {
        if (this.f24733x) {
            this.f25493a.mo22365o();
            return;
        }
        if (this.f25563eN == null) {
            mo22464bc();
        }
        this.f25563eN.mo22869f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bg */
    public void mo22468bg() {
        if (this.f24733x) {
            this.f25493a.mo22366p();
        } else {
            this.f25563eN.mo22870g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C7088l mo22488g(C6992d dVar) {
        return mo22411a(dVar, new C7090b(2, this.f25600ez, mo22406B(-8), this.f25599ey));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7088l mo22411a(C6992d dVar, C7090b bVar) {
        if (dVar.f24750ce == 0 || dVar.f24751cf == 0) {
            return null;
        }
        if (dVar.f24755cj == null) {
            dVar.f24755cj = this.f24755cj;
        }
        C7088l lVar = new C7088l(this, dVar.f24753ch, dVar.f24754ci, bVar);
        lVar.mo22861b(this.f25523dQ);
        mo21942a(dVar, (Object) lVar);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22417a(C7088l lVar) {
        if (!lVar.mo22878o() && (lVar.f25954p == this.f24734y[8] || lVar.mo22868e() != this.f25600ez)) {
            if (this.f24734y[8]) {
                lVar.mo22852a(false, this.f25600ez);
            } else {
                lVar.mo22852a(true, this.f25600ez);
            }
        }
        if ((lVar.f25955q && this.f25599ey == 0) || (!lVar.f25955q && this.f25599ey == 1)) {
            if (this.f25599ey == 0) {
                lVar.mo22851a(false);
            } else {
                lVar.mo22851a(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6992d mo22459b(C7088l lVar) {
        C6992d dVar = new C6992d();
        dVar.f24755cj = this.f24755cj;
        dVar.f24750ce = lVar.f25939a;
        dVar.f24751cf = lVar.f25940b;
        dVar.f24748cc = 2;
        mo21942a(dVar, (Object) lVar);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22414a(C6992d dVar, C7088l lVar) {
        if (lVar != null && dVar.mo22022ag()) {
            int ai = dVar.mo22024ai();
            int ak = dVar.mo22026ak();
            C7088l lVar2 = lVar;
            lVar2.mo22857a(dVar.f24749cd, ai, ak, dVar.mo22025aj() - ai, dVar.mo22027al() - ak, dVar.f24748cc);
        }
        dVar.mo22031b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bh */
    public void mo22469bh() {
        if (this.f25562eM != null) {
            this.f25562eM.mo22876m();
        }
        if (this.f25563eN != null) {
            this.f25563eN.mo22876m();
        }
        if (this.f25567eR != null) {
            this.f25567eR.mo22876m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bj */
    public void mo22471bj() {
        if (!this.f25506d) {
            this.f25493a.mo22294b(this.f24729t);
            if (this.f25562eM != null) {
                mo21966c((C6992d) this);
                this.f25562eM = null;
                this.f25563eN = null;
            }
            this.f25506d = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bk */
    public void mo22472bk() {
        mo22495k();
        mo21751t();
        this.f25493a.mo22370t();
        if (this.f25555eF == null) {
            this.f25555eF = new C7051b(this, this.f24753ch, this.f24754ci, true);
        }
        this.f25555eF.mo22170a(this.f25493a.mo22319d());
        if (this.f25556eG == null) {
            this.f25556eG = new C7051b(this, this.f24753ch, this.f24754ci, true);
        }
        this.f25556eG.mo22170a(this.f25493a.mo22307c());
        if (this.f25557eH == null) {
            mo22416a(this.f25555eF);
        }
        if (this.f25493a.mo22344g()) {
            this.f25562eM = this.f25493a.mo22254a(this.f25562eM);
            this.f25563eN = this.f25493a.mo22292b(this.f25563eN);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bl */
    public void mo22473bl() {
        this.f25493a.mo22309c(this.f24755cj.mo21875q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: bm */
    public void mo22474bm() {
        C7051b bVar;
        mo22412a(this.f25600ez, false);
        C7051b bVar2 = this.f25558eI;
        C7051b bVar3 = this.f25559eJ;
        if (bVar2 != null) {
            bVar2.mo22181h();
        }
        if (bVar3 != null) {
            bVar3.mo22181h();
        }
        boolean z = f25465cO == 24 && f25466cP == 8 && f25457cG;
        if (!f25456cF || 1 >= C7056e.m37103a(this.f24729t)) {
            this.f24729t = 0;
            C7051b bVar4 = new C7051b(this, this.f25562eM.f25948j, this.f25562eM.f25949k, 1, 1, f25465cO, f25466cP, z, false);
            this.f25560eK = false;
            bVar = bVar4;
        } else {
            C7051b bVar5 = new C7051b(this, this.f25562eM.f25948j, this.f25562eM.f25949k, C7056e.m37103a(this.f24729t), 0, f25465cO, f25466cP, z, false);
            bVar5.mo22169a();
            this.f25559eJ = bVar5;
            this.f25560eK = true;
            if (this.f24734y[10]) {
                bVar = new C7051b(this, this.f25562eM.f25948j, this.f25562eM.f25949k, 1, 1, f25465cO, f25466cP, z, false);
            } else {
                bVar = new C7051b(this, this.f25562eM.f25948j, this.f25562eM.f25949k, 1, 1, 0, 0, false, false);
            }
        }
        bVar.mo22173a(this.f25562eM);
        bVar.mo22169a();
        this.f25558eI = bVar;
        this.f25506d = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bn */
    public void mo22475bn() {
        if (!this.f25506d) {
            mo22474bm();
        } else {
            C7051b bVar = this.f25558eI;
            C7051b bVar2 = this.f25559eJ;
            boolean z = bVar != null && bVar.mo22182i();
            boolean z2 = bVar2 != null && bVar2.mo22182i();
            if (z || z2) {
                mo22426aG();
                mo22474bm();
            } else {
                mo22465bd();
            }
        }
        mo22446an();
        if (this.f25560eK) {
            C7051b bVar3 = this.f25559eJ;
            if (bVar3 != null) {
                mo22416a(bVar3);
            }
        } else {
            C7051b bVar4 = this.f25558eI;
            if (bVar4 != null) {
                mo22416a(bVar4);
            }
        }
        mo22466be();
        if (this.f25550eA) {
            this.f25493a.mo22374v(C7056e.f25266eK);
            this.f25493a.mo22342g(this.f25551eB[0], this.f25551eB[1], this.f25551eB[2], this.f25551eB[3]);
            return;
        }
        this.f25493a.mo22376w(C7056e.f25266eK);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bo */
    public void mo22476bo() {
        if (this.f25560eK) {
            C7051b bVar = this.f25558eI;
            C7051b bVar2 = this.f25559eJ;
            if (!(bVar == null || bVar2 == null)) {
                bVar2.mo22171a(bVar);
            }
        }
        mo22447ao();
        if (this.f24649aW == 1.0f) {
            this.f25493a.mo22287a(false, false, false, true);
            this.f25493a.mo22258a(0.0f, 0.0f, 0.0f, this.f24649aW);
            this.f25493a.mo22241R(C7056e.f25270eO);
            this.f25493a.mo22287a(true, true, true, true);
        }
        if (this.f25562eM != null) {
            this.f25562eM.mo22871h();
        }
        mo22421aB().mo22427aH();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bp */
    public void mo22477bp() {
        this.f25574eY.put(0, 0);
        this.f25574eY.put(1, 0);
        this.f25574eY.put(2, this.f24750ce);
        this.f25574eY.put(3, this.f24751cf);
        this.f25493a.mo22296b(this.f25574eY.get(0), this.f25574eY.get(1), this.f25574eY.get(2), this.f25574eY.get(3));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo22006w() {
        super.mo22006w();
        mo22478bq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: bq */
    public void mo22478bq() {
        this.f25542dr.mo22521a();
        this.f25543ds.mo22590b();
        this.f25544dt.mo22748b();
        super.mo21910E();
        mo21915J();
        if (this.f24734y[2]) {
            this.f25493a.mo22376w(C7056e.f25268eM);
        } else {
            this.f25493a.mo22374v(C7056e.f25268eM);
        }
        this.f25493a.mo22234O(C7056e.f25303ev);
        if (this.f24734y[6]) {
            this.f25549e = 0;
        } else {
            this.f25549e = 1;
        }
        boolean z = this.f24733x;
        if (this.f24729t < 1) {
            this.f25493a.mo22376w(C7056e.f25315fG);
        } else if (!f25468cR.equals("VideoCore IV HW")) {
            this.f25493a.mo22374v(C7056e.f25315fG);
        }
        if (!f25468cR.equals("VideoCore IV HW")) {
            this.f25493a.mo22376w(C7056e.f25317fI);
        }
        if (this.f25577ec || this.f24755cj.f24514Q == 0) {
            if (this.f24733x) {
                mo22003u(this.f24644aR);
            } else {
                mo22003u((this.f24644aR & 16777215) | 0);
            }
            mo22403c();
            mo22404f();
            this.f25577ec = false;
        } else {
            this.f25527dU.mo22042a((C6993e) this.f25525dS);
            this.f25528dV.mo22042a((C6993e) this.f25526dT);
            mo22425aF();
        }
        if (mo21950ad()) {
            mo21947aa();
            mo21976e(1.0f, 0.0f, 0.0f);
            mo21980f(0.0f, 0.0f, 0.0f);
        }
        this.f25493a.mo22209B(this.f25523dQ ? C7056e.f25184cg : C7056e.f25185ch);
        this.f25493a.mo22376w(C7056e.f25202cy);
        this.f25493a.mo22213D(C7056e.f25175cX);
        this.f24688bL = 0.0f;
        this.f24687bK = 0.0f;
        this.f24689bM = 1.0f;
        this.f25493a.mo22369s();
        if (this.f24734y[5]) {
            this.f25493a.mo22305b(false);
        } else {
            this.f25493a.mo22305b(true);
        }
        this.f25573eX = 0;
        this.f24757cl = false;
        this.f24762cq = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: br */
    public void mo22479br() {
        f25467cQ = this.f25493a.mo22377x(C7056e.f25127bV);
        f25468cR = this.f25493a.mo22377x(C7056e.f25128bW);
        f25469cS = this.f25493a.mo22377x(C7056e.f25129bX);
        f25470cT = this.f25493a.mo22377x(C7056e.f25130bY);
        f25471cU = this.f25493a.mo22377x(C7056e.f25131bZ);
        f25454cD = this.f25493a.mo22227K();
        f25455cE = this.f25493a.mo22229L();
        f25456cF = this.f25493a.mo22231M();
        f25457cG = this.f25493a.mo22233N();
        f25458cH = this.f25493a.mo22235O();
        f25460cJ = this.f25493a.mo22237P();
        f25461cK = this.f25493a.mo22239Q();
        try {
            this.f25493a.mo22236P(C7056e.f25307ez);
            f25459cI = true;
        } catch (Exception unused) {
            f25459cI = false;
        }
        f25465cO = this.f25493a.mo22358k();
        f25466cP = this.f25493a.mo22360l();
        this.f25493a.mo22304b(C7056e.f25161cJ, f25489fd);
        f25462cL = f25489fd.get(0);
        if (!f25468cR.equals("VideoCore IV HW")) {
            this.f25493a.mo22304b(C7056e.f25178ca, f25489fd);
            f25463cM = f25489fd.get(0);
        }
        if (f25458cH) {
            this.f25493a.mo22280a(C7056e.f25163cL, f25490fe);
            f25464cN = f25490fe.get(0);
        }
        if (f25468cR.equals("VideoCore IV HW") || f25468cR.equals("Gallium 0.4 on VC4")) {
            f25474cX = C7065i.class.getResource("/assets/shaders/LightVert-vc4.glsl");
            f25475cY = C7065i.class.getResource("/assets/shaders/TexLightVert-vc4.glsl");
        }
        f25453cC = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7082j mo22410a(boolean z, boolean z2) {
        C7082j jVar;
        C7065i aB = mo22421aB();
        boolean z3 = this.f25539do == null;
        if (this.f25539do != null) {
            this.f25539do.mo22783a(this);
            this.f25539do.mo22816t();
            this.f25539do.mo22817u();
        }
        if (!z) {
            if (this.f25539do != null && this.f25539do.mo22771A()) {
                C6989c.m36558a("The provided shader needs light attributes (ambient, diffuse, etc.), but the current scene is unlit, so the default shader will be used instead");
                z3 = true;
            }
            if (z2) {
                if (z3 || !this.f25539do.mo22787a(5)) {
                    if (aB.f25534dj == null) {
                        aB.f25534dj = new C7082j(this.f24755cj, this.f25493a.mo22306b(f25473cW), this.f25493a.mo22289a(f25477da));
                    }
                    jVar = aB.f25534dj;
                } else {
                    jVar = this.f25539do;
                }
            } else if (z3 || !this.f25539do.mo22787a(3)) {
                if (aB.f25533di == null) {
                    aB.f25533di = new C7082j(this.f24755cj, this.f25493a.mo22306b(f25472cV), this.f25493a.mo22289a(f25476cZ));
                }
                jVar = aB.f25533di;
            } else {
                jVar = this.f25539do;
            }
        } else if (z2) {
            if (z3 || !this.f25539do.mo22787a(6)) {
                if (aB.f25536dl == null) {
                    aB.f25536dl = new C7082j(this.f24755cj, this.f25493a.mo22306b(f25475cY), this.f25493a.mo22289a(f25479dc));
                }
                jVar = aB.f25536dl;
            } else {
                jVar = this.f25539do;
            }
        } else if (z3 || !this.f25539do.mo22787a(4)) {
            if (aB.f25535dk == null) {
                aB.f25535dk = new C7082j(this.f24755cj, this.f25493a.mo22306b(f25474cX), this.f25493a.mo22289a(f25478db));
            }
            jVar = aB.f25535dk;
        } else {
            jVar = this.f25539do;
        }
        if (jVar != this.f25539do) {
            jVar.mo22783a(this);
            jVar.mo22816t();
            jVar.mo22817u();
        }
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bs */
    public C7082j mo22480bs() {
        C7082j jVar;
        C7065i aB = mo22421aB();
        if (this.f25540dp == null) {
            if (aB.f25537dm == null) {
                aB.f25537dm = new C7082j(this.f24755cj, this.f25493a.mo22306b(f25480dd), this.f25493a.mo22289a(f25481de));
            }
            jVar = aB.f25537dm;
        } else {
            jVar = this.f25540dp;
        }
        jVar.mo22783a(this);
        jVar.mo22816t();
        jVar.mo22817u();
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bt */
    public C7082j mo22481bt() {
        C7082j jVar;
        C7065i aB = mo22421aB();
        if (this.f25541dq == null) {
            if (aB.f25538dn == null) {
                aB.f25538dn = new C7082j(this.f24755cj, this.f25493a.mo22306b(f25482df), this.f25493a.mo22289a(f25483dg));
            }
            jVar = aB.f25538dn;
        } else {
            jVar = this.f25541dq;
        }
        jVar.mo22783a(this);
        jVar.mo22816t();
        jVar.mo22817u();
        return jVar;
    }

    /* renamed from: bu */
    protected static C7068b m37489bu() {
        return new C7068b();
    }

    /* renamed from: a */
    protected static C7075i m37478a(C7065i iVar, C7068b bVar, int i) {
        return new C7075i(iVar, bVar, i);
    }

    /* renamed from: b */
    protected static C7077k m37482b(C7065i iVar, C7068b bVar, int i) {
        return new C7077k(iVar, bVar, i);
    }

    /* renamed from: c */
    protected static C7080m m37496c(C7065i iVar) {
        return new C7080m(iVar);
    }
}
