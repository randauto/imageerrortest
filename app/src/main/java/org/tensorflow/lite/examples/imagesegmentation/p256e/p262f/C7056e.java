package p256e.p262f;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.regex.Pattern;
import p256e.p259c.C6982a;
import p256e.p259c.C6989c;
import p256e.p259c.C6992d;

/* renamed from: e.f.e */
/* compiled from: PGL */
public abstract class C7056e {

    /* renamed from: B */
    protected static boolean f25094B = false;

    /* renamed from: aO */
    protected static int f25095aO = 2;

    /* renamed from: aP */
    protected static int f25096aP = 4;

    /* renamed from: aQ */
    protected static int f25097aQ = 4;

    /* renamed from: aR */
    protected static int f25098aR = 1;

    /* renamed from: aS */
    protected static int f25099aS = f25095aO;

    /* renamed from: aT */
    protected static int f25100aT = 5123;

    /* renamed from: aU */
    protected static float f25101aU = 0.0f;

    /* renamed from: aV */
    protected static boolean f25102aV = false;

    /* renamed from: at */
    protected static String[] f25103at = {"attribute vec2 position;", "attribute vec2 texCoord;", "varying vec2 vertTexCoord;", "void main() {", "  gl_Position = vec4(position, 0, 1);", "  vertTexCoord = texCoord;", "}"};

    /* renamed from: au */
    protected static String[] f25104au = {"#ifdef GL_ES\nprecision mediump float;\nprecision mediump int;\n#endif\n", "uniform sampler2D texMap;", "varying vec2 vertTexCoord;", "void main() {", "  gl_FragColor = texture2D(texMap, vertTexCoord.st);", "}"};

    /* renamed from: av */
    protected static String[] f25105av = {"#ifdef GL_ES\nprecision mediump float;\nprecision mediump int;\n#endif\n", "uniform sampler2DRect texMap;", "varying vec2 vertTexCoord;", "void main() {", "  gl_FragColor = texture2DRect(texMap, vertTexCoord.st);", "}"};

    /* renamed from: bA */
    public static int f25106bA = 0;

    /* renamed from: bB */
    public static int f25107bB = 0;

    /* renamed from: bC */
    public static int f25108bC = 0;

    /* renamed from: bD */
    public static int f25109bD = 0;

    /* renamed from: bE */
    public static int f25110bE = 0;

    /* renamed from: bF */
    public static int f25111bF = 0;

    /* renamed from: bG */
    public static int f25112bG = 0;

    /* renamed from: bH */
    public static int f25113bH = 0;

    /* renamed from: bI */
    public static int f25114bI = 0;

    /* renamed from: bJ */
    public static int f25115bJ = 0;

    /* renamed from: bK */
    public static int f25116bK = 0;

    /* renamed from: bL */
    public static int f25117bL = 0;

    /* renamed from: bM */
    public static int f25118bM = 0;

    /* renamed from: bN */
    public static int f25119bN = 0;

    /* renamed from: bO */
    public static int f25120bO = 0;

    /* renamed from: bP */
    public static int f25121bP = 0;

    /* renamed from: bQ */
    public static int f25122bQ = 0;

    /* renamed from: bR */
    public static int f25123bR = 0;

    /* renamed from: bS */
    public static int f25124bS = 0;

    /* renamed from: bT */
    public static int f25125bT = 0;

    /* renamed from: bU */
    public static int f25126bU = 0;

    /* renamed from: bV */
    public static int f25127bV = 0;

    /* renamed from: bW */
    public static int f25128bW = 0;

    /* renamed from: bX */
    public static int f25129bX = 0;

    /* renamed from: bY */
    public static int f25130bY = 0;

    /* renamed from: bZ */
    public static int f25131bZ = 0;

    /* renamed from: bg */
    protected static int[] f25132bg = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, -1, -1, -1, -1, -1, 0, 0, 0, -1, -1, -1, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, -1, -1, 0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1, -1, 0, -1, -1, 0, 0, -1, -1, 0, -1, -1, 0, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, -1, -1, -1, 0, 0, 0, -1, -1, -1, 0, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0};

    /* renamed from: bh */
    protected static boolean f25133bh = false;

    /* renamed from: bi */
    protected static int f25134bi = 0;

    /* renamed from: bj */
    protected static int f25135bj = 0;

    /* renamed from: bk */
    protected static int f25136bk = 0;

    /* renamed from: bl */
    protected static int f25137bl = 0;

    /* renamed from: bm */
    protected static int f25138bm = 0;

    /* renamed from: bn */
    public static int f25139bn = 0;

    /* renamed from: bo */
    public static int f25140bo = 0;

    /* renamed from: bp */
    public static int f25141bp = 0;

    /* renamed from: bq */
    public static int f25142bq = 0;

    /* renamed from: br */
    public static int f25143br = 0;

    /* renamed from: bs */
    public static int f25144bs = 0;

    /* renamed from: bt */
    public static int f25145bt = 0;

    /* renamed from: bu */
    public static int f25146bu = 0;

    /* renamed from: bv */
    public static int f25147bv = 0;

    /* renamed from: bw */
    public static int f25148bw = 0;

    /* renamed from: bx */
    public static int f25149bx = 0;

    /* renamed from: by */
    public static int f25150by = 0;

    /* renamed from: bz */
    public static int f25151bz = 0;

    /* renamed from: cA */
    public static int f25152cA = 0;

    /* renamed from: cB */
    public static int f25153cB = 0;

    /* renamed from: cC */
    public static int f25154cC = 0;

    /* renamed from: cD */
    public static int f25155cD = 0;

    /* renamed from: cE */
    public static int f25156cE = 0;

    /* renamed from: cF */
    public static int f25157cF = 0;

    /* renamed from: cG */
    public static int f25158cG = 0;

    /* renamed from: cH */
    public static int f25159cH = 0;

    /* renamed from: cI */
    public static int f25160cI = 0;

    /* renamed from: cJ */
    public static int f25161cJ = 0;

    /* renamed from: cK */
    public static int f25162cK = 0;

    /* renamed from: cL */
    public static int f25163cL = 0;

    /* renamed from: cM */
    public static int f25164cM = 0;

    /* renamed from: cN */
    public static int f25165cN = 0;

    /* renamed from: cO */
    public static int f25166cO = 0;

    /* renamed from: cP */
    public static int f25167cP = 0;

    /* renamed from: cQ */
    public static int f25168cQ = 0;

    /* renamed from: cR */
    public static int f25169cR = 0;

    /* renamed from: cS */
    public static int f25170cS = 0;

    /* renamed from: cT */
    public static int f25171cT = 0;

    /* renamed from: cU */
    public static int f25172cU = 0;

    /* renamed from: cV */
    public static int f25173cV = 0;

    /* renamed from: cW */
    public static int f25174cW = 0;

    /* renamed from: cX */
    public static int f25175cX = 0;

    /* renamed from: cY */
    public static int f25176cY = 0;

    /* renamed from: cZ */
    public static int f25177cZ = 0;

    /* renamed from: ca */
    public static int f25178ca = 0;

    /* renamed from: cb */
    public static int f25179cb = 0;

    /* renamed from: cc */
    public static int f25180cc = 0;

    /* renamed from: cd */
    public static int f25181cd = 0;

    /* renamed from: ce */
    public static int f25182ce = 0;

    /* renamed from: cf */
    public static int f25183cf = 0;

    /* renamed from: cg */
    public static int f25184cg = 0;

    /* renamed from: ch */
    public static int f25185ch = 0;

    /* renamed from: ci */
    public static int f25186ci = 0;

    /* renamed from: cj */
    public static int f25187cj = 0;

    /* renamed from: ck */
    public static int f25188ck = 0;

    /* renamed from: cl */
    public static int f25189cl = 0;

    /* renamed from: cm */
    public static int f25190cm = 0;

    /* renamed from: cn */
    public static int f25191cn = 0;

    /* renamed from: co */
    public static int f25192co = 0;

    /* renamed from: cp */
    public static int f25193cp = 0;

    /* renamed from: cq */
    public static int f25194cq = 0;

    /* renamed from: cr */
    public static int f25195cr = 0;

    /* renamed from: cs */
    public static int f25196cs = 0;

    /* renamed from: ct */
    public static int f25197ct = 0;

    /* renamed from: cu */
    public static int f25198cu = 0;

    /* renamed from: cv */
    public static int f25199cv = 0;

    /* renamed from: cw */
    public static int f25200cw = 0;

    /* renamed from: cx */
    public static int f25201cx = 0;

    /* renamed from: cy */
    public static int f25202cy = 0;

    /* renamed from: cz */
    public static int f25203cz = 0;

    /* renamed from: dA */
    public static int f25204dA = 0;

    /* renamed from: dB */
    public static int f25205dB = 0;

    /* renamed from: dC */
    public static int f25206dC = 0;

    /* renamed from: dD */
    public static int f25207dD = 0;

    /* renamed from: dE */
    public static int f25208dE = 0;

    /* renamed from: dF */
    public static int f25209dF = 0;

    /* renamed from: dG */
    public static int f25210dG = 0;

    /* renamed from: dH */
    public static int f25211dH = 0;

    /* renamed from: dI */
    public static int f25212dI = 0;

    /* renamed from: dJ */
    public static int f25213dJ = 0;

    /* renamed from: dK */
    public static int f25214dK = 0;

    /* renamed from: dL */
    public static int f25215dL = 0;

    /* renamed from: dM */
    public static int f25216dM = 0;

    /* renamed from: dN */
    public static int f25217dN = 0;

    /* renamed from: dO */
    public static int f25218dO = 0;

    /* renamed from: dP */
    public static int f25219dP = 0;

    /* renamed from: dQ */
    public static int f25220dQ = 0;

    /* renamed from: dR */
    public static int f25221dR = 0;

    /* renamed from: dS */
    public static int f25222dS = 0;

    /* renamed from: dT */
    public static int f25223dT = 0;

    /* renamed from: dU */
    public static int f25224dU = 0;

    /* renamed from: dV */
    public static int f25225dV = 0;

    /* renamed from: dW */
    public static int f25226dW = 0;

    /* renamed from: dX */
    public static int f25227dX = 0;

    /* renamed from: dY */
    public static int f25228dY = 0;

    /* renamed from: dZ */
    public static int f25229dZ = 0;

    /* renamed from: da */
    public static int f25230da = 0;

    /* renamed from: db */
    public static int f25231db = 0;

    /* renamed from: dc */
    public static int f25232dc = 0;

    /* renamed from: dd */
    public static int f25233dd = 0;

    /* renamed from: de */
    public static int f25234de = 0;

    /* renamed from: df */
    public static int f25235df = 0;

    /* renamed from: dg */
    public static int f25236dg = 0;

    /* renamed from: dh */
    public static int f25237dh = 0;

    /* renamed from: di */
    public static int f25238di = 0;

    /* renamed from: dj */
    public static int f25239dj = 0;

    /* renamed from: dk */
    public static int f25240dk = 0;

    /* renamed from: dl */
    public static int f25241dl = 0;

    /* renamed from: dm */
    public static int f25242dm = 0;

    /* renamed from: dn */
    public static int f25243dn = 0;

    /* renamed from: do */
    public static int f25244do = 0;

    /* renamed from: dp */
    public static int f25245dp = 0;

    /* renamed from: dq */
    public static int f25246dq = 0;

    /* renamed from: dr */
    public static int f25247dr = 0;

    /* renamed from: ds */
    public static int f25248ds = 0;

    /* renamed from: dt */
    public static int f25249dt = 0;

    /* renamed from: du */
    public static int f25250du = 0;

    /* renamed from: dv */
    public static int f25251dv = 0;

    /* renamed from: dw */
    public static int f25252dw = 0;

    /* renamed from: dx */
    public static int f25253dx = 0;

    /* renamed from: dy */
    public static int f25254dy = 0;

    /* renamed from: dz */
    public static int f25255dz = 0;

    /* renamed from: eA */
    public static int f25256eA = 0;

    /* renamed from: eB */
    public static int f25257eB = 0;

    /* renamed from: eC */
    public static int f25258eC = 0;

    /* renamed from: eD */
    public static int f25259eD = 0;

    /* renamed from: eE */
    public static int f25260eE = 0;

    /* renamed from: eF */
    public static int f25261eF = 0;

    /* renamed from: eG */
    public static int f25262eG = 0;

    /* renamed from: eH */
    public static int f25263eH = 0;

    /* renamed from: eI */
    public static int f25264eI = 0;

    /* renamed from: eJ */
    public static int f25265eJ = 0;

    /* renamed from: eK */
    public static int f25266eK = 0;

    /* renamed from: eL */
    public static int f25267eL = 0;

    /* renamed from: eM */
    public static int f25268eM = 0;

    /* renamed from: eN */
    public static int f25269eN = 0;

    /* renamed from: eO */
    public static int f25270eO = 0;

    /* renamed from: eP */
    public static int f25271eP = 0;

    /* renamed from: eQ */
    public static int f25272eQ = 0;

    /* renamed from: eR */
    public static int f25273eR = 0;

    /* renamed from: eS */
    public static int f25274eS = 0;

    /* renamed from: eT */
    public static int f25275eT = 0;

    /* renamed from: eU */
    public static int f25276eU = 0;

    /* renamed from: eV */
    public static int f25277eV = 0;

    /* renamed from: eW */
    public static int f25278eW = 0;

    /* renamed from: eX */
    public static int f25279eX = 0;

    /* renamed from: eY */
    public static int f25280eY = 0;

    /* renamed from: eZ */
    public static int f25281eZ = 0;

    /* renamed from: ea */
    public static int f25282ea = 0;

    /* renamed from: eb */
    public static int f25283eb = 0;

    /* renamed from: ec */
    public static int f25284ec = 0;

    /* renamed from: ed */
    public static int f25285ed = 0;

    /* renamed from: ee */
    public static int f25286ee = 0;

    /* renamed from: ef */
    public static int f25287ef = 0;

    /* renamed from: eg */
    public static int f25288eg = 0;

    /* renamed from: eh */
    public static int f25289eh = 0;

    /* renamed from: ei */
    public static int f25290ei = 0;

    /* renamed from: ej */
    public static int f25291ej = 0;

    /* renamed from: ek */
    public static int f25292ek = 0;

    /* renamed from: el */
    public static int f25293el = 0;

    /* renamed from: em */
    public static int f25294em = 0;

    /* renamed from: en */
    public static int f25295en = 0;

    /* renamed from: eo */
    public static int f25296eo = 0;

    /* renamed from: ep */
    public static int f25297ep = 0;

    /* renamed from: eq */
    public static int f25298eq = 0;

    /* renamed from: er */
    public static int f25299er = 0;

    /* renamed from: es */
    public static int f25300es = 0;

    /* renamed from: et */
    public static int f25301et = 0;

    /* renamed from: eu */
    public static int f25302eu = 0;

    /* renamed from: ev */
    public static int f25303ev = 0;

    /* renamed from: ew */
    public static int f25304ew = 0;

    /* renamed from: ex */
    public static int f25305ex = 0;

    /* renamed from: ey */
    public static int f25306ey = 0;

    /* renamed from: ez */
    public static int f25307ez = 0;

    /* renamed from: f */
    public static int f25308f = 24;

    /* renamed from: fA */
    public static int f25309fA = 0;

    /* renamed from: fB */
    public static int f25310fB = 0;

    /* renamed from: fC */
    public static int f25311fC = 0;

    /* renamed from: fD */
    public static int f25312fD = 0;

    /* renamed from: fE */
    public static int f25313fE = 0;

    /* renamed from: fF */
    public static int f25314fF = 0;

    /* renamed from: fG */
    public static int f25315fG = 0;

    /* renamed from: fH */
    public static int f25316fH = 0;

    /* renamed from: fI */
    public static int f25317fI = 0;

    /* renamed from: fa */
    public static int f25318fa = 0;

    /* renamed from: fb */
    public static int f25319fb = 0;

    /* renamed from: fc */
    public static int f25320fc = 0;

    /* renamed from: fd */
    public static int f25321fd = 0;

    /* renamed from: fe */
    public static int f25322fe = 0;

    /* renamed from: ff */
    public static int f25323ff = 0;

    /* renamed from: fg */
    public static int f25324fg = 0;

    /* renamed from: fh */
    public static int f25325fh = 0;

    /* renamed from: fi */
    public static int f25326fi = 0;

    /* renamed from: fj */
    public static int f25327fj = 0;

    /* renamed from: fk */
    public static int f25328fk = 0;

    /* renamed from: fl */
    public static int f25329fl = 0;

    /* renamed from: fm */
    public static int f25330fm = 0;

    /* renamed from: fn */
    public static int f25331fn = 0;

    /* renamed from: fo */
    public static int f25332fo = 0;

    /* renamed from: fp */
    public static int f25333fp = 0;

    /* renamed from: fq */
    public static int f25334fq = 0;

    /* renamed from: fr */
    public static int f25335fr = 0;

    /* renamed from: fs */
    public static int f25336fs = 0;

    /* renamed from: ft */
    public static int f25337ft = 0;

    /* renamed from: fu */
    public static int f25338fu = 0;

    /* renamed from: fv */
    public static int f25339fv = 0;

    /* renamed from: fw */
    public static int f25340fw = 0;

    /* renamed from: fx */
    public static int f25341fx = 0;

    /* renamed from: fy */
    public static int f25342fy = 0;

    /* renamed from: fz */
    public static int f25343fz = 0;

    /* renamed from: g */
    public static int f25344g = 8;

    /* renamed from: h */
    public static int f25345h = 8;

    /* renamed from: i */
    protected static boolean f25346i = true;

    /* renamed from: j */
    protected static int f25347j = 1;

    /* renamed from: k */
    protected static boolean f25348k = true;

    /* renamed from: l */
    protected static int f25349l = 64;

    /* renamed from: m */
    protected static int f25350m = 128;

    /* renamed from: n */
    protected static int f25351n = 64;

    /* renamed from: o */
    protected static int f25352o = 64;

    /* renamed from: p */
    protected static int f25353p = 128;

    /* renamed from: q */
    protected static int f25354q = 8;

    /* renamed from: r */
    protected static int f25355r = 32767;

    /* renamed from: s */
    protected static int f25356s = (f25355r + 1);

    /* renamed from: t */
    protected static int f25357t = f25356s;

    /* renamed from: u */
    protected static int f25358u = 256;

    /* renamed from: v */
    protected static int f25359v = 1024;

    /* renamed from: w */
    protected static float f25360w = 2.0f;

    /* renamed from: x */
    protected static int f25361x = 5000;

    /* renamed from: y */
    protected static int f25362y = 2;

    /* renamed from: z */
    protected static float f25363z = 0.999f;

    /* renamed from: A */
    protected IntBuffer f25364A;

    /* renamed from: C */
    protected boolean f25365C = false;

    /* renamed from: D */
    protected boolean f25366D = false;

    /* renamed from: E */
    protected boolean f25367E = false;

    /* renamed from: F */
    protected boolean f25368F = false;

    /* renamed from: G */
    protected boolean f25369G = false;

    /* renamed from: H */
    public int f25370H;

    /* renamed from: I */
    protected int f25371I;

    /* renamed from: J */
    protected IntBuffer f25372J;

    /* renamed from: K */
    protected IntBuffer f25373K;

    /* renamed from: L */
    protected IntBuffer f25374L;

    /* renamed from: M */
    protected IntBuffer f25375M;

    /* renamed from: N */
    protected IntBuffer f25376N;

    /* renamed from: O */
    protected IntBuffer f25377O;

    /* renamed from: P */
    protected IntBuffer f25378P;

    /* renamed from: Q */
    protected IntBuffer f25379Q;

    /* renamed from: R */
    protected IntBuffer f25380R;

    /* renamed from: S */
    protected IntBuffer f25381S;

    /* renamed from: T */
    protected int f25382T;

    /* renamed from: U */
    protected int f25383U;

    /* renamed from: V */
    protected int f25384V;

    /* renamed from: W */
    protected int f25385W;

    /* renamed from: X */
    protected boolean f25386X = false;

    /* renamed from: Y */
    protected boolean f25387Y = false;

    /* renamed from: Z */
    protected boolean f25388Z = false;

    /* renamed from: a */
    protected C7065i f25389a;

    /* renamed from: aA */
    protected float f25390aA = 60.0f;

    /* renamed from: aB */
    protected float f25391aB = 60.0f;

    /* renamed from: aC */
    protected boolean f25392aC = false;

    /* renamed from: aD */
    protected ByteBuffer f25393aD;

    /* renamed from: aE */
    protected IntBuffer f25394aE;

    /* renamed from: aF */
    protected IntBuffer f25395aF;

    /* renamed from: aG */
    protected int f25396aG = 0;

    /* renamed from: aH */
    protected int f25397aH;

    /* renamed from: aI */
    protected boolean f25398aI = false;

    /* renamed from: aJ */
    protected boolean f25399aJ;

    /* renamed from: aK */
    protected boolean f25400aK = false;

    /* renamed from: aL */
    protected boolean f25401aL;

    /* renamed from: aM */
    protected boolean f25402aM = false;

    /* renamed from: aN */
    protected boolean f25403aN;

    /* renamed from: aW */
    protected boolean f25404aW = false;

    /* renamed from: aX */
    protected boolean f25405aX = true;

    /* renamed from: aY */
    public float f25406aY;

    /* renamed from: aZ */
    public float f25407aZ;

    /* renamed from: aa */
    protected int f25408aa;

    /* renamed from: ab */
    protected int f25409ab;

    /* renamed from: ac */
    protected int f25410ac;

    /* renamed from: ad */
    protected int f25411ad;

    /* renamed from: ae */
    protected int f25412ae;

    /* renamed from: af */
    protected int f25413af;

    /* renamed from: ag */
    protected int f25414ag;

    /* renamed from: ah */
    protected int f25415ah;

    /* renamed from: ai */
    protected boolean f25416ai = false;

    /* renamed from: aj */
    protected int f25417aj;

    /* renamed from: ak */
    protected int f25418ak;

    /* renamed from: al */
    protected int f25419al;

    /* renamed from: am */
    protected int f25420am;

    /* renamed from: an */
    protected int f25421an;

    /* renamed from: ao */
    protected int f25422ao;

    /* renamed from: ap */
    protected int f25423ap;

    /* renamed from: aq */
    protected int f25424aq;

    /* renamed from: ar */
    protected float[] f25425ar = {-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: as */
    protected FloatBuffer f25426as;

    /* renamed from: aw */
    protected boolean[] f25427aw = {false, false};

    /* renamed from: ax */
    protected int f25428ax;

    /* renamed from: ay */
    protected int f25429ay = 0;

    /* renamed from: az */
    protected int[][] f25430az;

    /* renamed from: b */
    protected C6982a f25431b;

    /* renamed from: ba */
    protected IntBuffer f25432ba;

    /* renamed from: bb */
    protected int f25433bb;

    /* renamed from: bc */
    protected int f25434bc = 28;

    /* renamed from: bd */
    protected int f25435bd = 12;

    /* renamed from: be */
    protected int f25436be = 21;

    /* renamed from: bf */
    protected int f25437bf = 21;

    /* renamed from: c */
    protected Thread f25438c;

    /* renamed from: d */
    protected int f25439d;

    /* renamed from: e */
    public boolean f25440e;

    /* renamed from: e.f.e$a */
    /* compiled from: PGL */
    protected interface C7057a {
        /* renamed from: a */
        int mo22383a(float[] fArr);

        /* renamed from: a */
        boolean mo22384a();

        /* renamed from: b */
        void mo22385b();
    }

    /* renamed from: e.f.e$b */
    /* compiled from: PGL */
    protected interface C7058b {
        /* renamed from: a */
        void mo22386a();

        /* renamed from: a */
        void mo22387a(int i);

        /* renamed from: a */
        void mo22388a(double[] dArr);

        /* renamed from: b */
        void mo22389b();

        /* renamed from: c */
        void mo22390c();

        /* renamed from: d */
        void mo22391d();
    }

    /* renamed from: e.f.e$c */
    /* compiled from: PGL */
    protected interface C7059c {
        /* renamed from: a */
        void mo22392a();

        /* renamed from: a */
        void mo22393a(int i);

        /* renamed from: a */
        void mo22394a(Object obj);

        /* renamed from: a */
        void mo22395a(double[] dArr, Object[] objArr, float[] fArr, Object[] objArr2);

        /* renamed from: b */
        void mo22396b(int i);
    }

    /* renamed from: a */
    public static int m37103a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        return i;
    }

    /* renamed from: h */
    protected static int m37126h(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo22206A() {
        return -1;
    }

    /* renamed from: A */
    public abstract void mo22207A(int i);

    /* renamed from: B */
    public abstract void mo22209B(int i);

    /* renamed from: C */
    public abstract void mo22211C(int i);

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract int mo22214E();

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo22215E(int i);

    /* renamed from: F */
    public abstract int mo22216F(int i);

    /* renamed from: G */
    public abstract void mo22218G(int i);

    /* renamed from: H */
    public abstract void mo22220H(int i);

    /* renamed from: I */
    public abstract void mo22222I(int i);

    /* renamed from: J */
    public abstract void mo22224J(int i);

    /* renamed from: K */
    public abstract void mo22226K(int i);

    /* renamed from: L */
    public abstract void mo22228L(int i);

    /* renamed from: M */
    public abstract String mo22230M(int i);

    /* renamed from: N */
    public abstract String mo22232N(int i);

    /* renamed from: O */
    public abstract void mo22234O(int i);

    /* renamed from: P */
    public abstract void mo22236P(int i);

    /* renamed from: Q */
    public abstract void mo22238Q(int i);

    /* renamed from: R */
    public abstract void mo22241R(int i);

    /* renamed from: S */
    public abstract int mo22243S(int i);

    /* renamed from: T */
    public abstract void mo22244T();

    /* renamed from: T */
    public abstract void mo22245T(int i);

    /* renamed from: U */
    public abstract int mo22246U();

    /* renamed from: U */
    public abstract void mo22247U(int i);

    /* renamed from: V */
    public abstract int mo22248V();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo22250a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo22251a(Object obj, char[] cArr, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7057a mo22252a(char c, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7058b mo22253a(C7059c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo22255a(Object obj, float f);

    /* renamed from: a */
    public abstract void mo22257a(float f);

    /* renamed from: a */
    public abstract void mo22258a(float f, float f2, float f3, float f4);

    /* renamed from: a */
    public abstract void mo22260a(int i, float f);

    /* renamed from: a */
    public abstract void mo22261a(int i, float f, float f2);

    /* renamed from: a */
    public abstract void mo22262a(int i, float f, float f2, float f3);

    /* renamed from: a */
    public abstract void mo22263a(int i, float f, float f2, float f3, float f4);

    /* renamed from: a */
    public abstract void mo22264a(int i, int i2, float f);

    /* renamed from: a */
    public abstract void mo22269a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    /* renamed from: a */
    public abstract void mo22272a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22274a(int i, int i2, int i3, int i4, int i5, int i6, Buffer buffer);

    /* renamed from: a */
    public abstract void mo22275a(int i, int i2, int i3, boolean z, int i4, int i5);

    /* renamed from: a */
    public abstract void mo22276a(int i, int i2, Buffer buffer, int i3);

    /* renamed from: a */
    public abstract void mo22277a(int i, int i2, FloatBuffer floatBuffer);

    /* renamed from: a */
    public abstract void mo22278a(int i, int i2, IntBuffer intBuffer);

    /* renamed from: a */
    public abstract void mo22279a(int i, int i2, boolean z, FloatBuffer floatBuffer);

    /* renamed from: a */
    public abstract void mo22280a(int i, FloatBuffer floatBuffer);

    /* renamed from: a */
    public abstract void mo22281a(int i, IntBuffer intBuffer);

    /* renamed from: a */
    public abstract void mo22282a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22283a(C7056e eVar);

    /* renamed from: a */
    public abstract void mo22284a(Runnable runnable);

    /* renamed from: a */
    public abstract void mo22287a(boolean z, boolean z2, boolean z3, boolean z4);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo22291b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo22293b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo22294b(int i);

    /* renamed from: b */
    public abstract void mo22295b(int i, int i2, int i3);

    /* renamed from: b */
    public abstract void mo22296b(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract void mo22297b(int i, int i2, int i3, int i4, int i5);

    /* renamed from: b */
    public abstract void mo22299b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Buffer buffer);

    /* renamed from: b */
    public abstract void mo22300b(int i, int i2, FloatBuffer floatBuffer);

    /* renamed from: b */
    public abstract void mo22301b(int i, int i2, IntBuffer intBuffer);

    /* renamed from: b */
    public abstract void mo22302b(int i, int i2, boolean z, FloatBuffer floatBuffer);

    /* renamed from: b */
    public abstract void mo22303b(int i, String str);

    /* renamed from: b */
    public abstract void mo22304b(int i, IntBuffer intBuffer);

    /* renamed from: b */
    public abstract void mo22305b(boolean z);

    /* renamed from: c */
    public abstract int mo22308c(int i, String str);

    /* renamed from: c */
    public abstract void mo22310c(int i, int i2);

    /* renamed from: c */
    public abstract void mo22311c(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo22312c(int i, int i2, int i3, int i4);

    /* renamed from: c */
    public abstract void mo22313c(int i, int i2, int i3, int i4, int i5);

    /* renamed from: c */
    public abstract void mo22315c(int i, int i2, FloatBuffer floatBuffer);

    /* renamed from: c */
    public abstract void mo22316c(int i, int i2, IntBuffer intBuffer);

    /* renamed from: c */
    public abstract void mo22317c(int i, int i2, boolean z, FloatBuffer floatBuffer);

    /* renamed from: c */
    public abstract void mo22318c(int i, IntBuffer intBuffer);

    /* renamed from: d */
    public abstract int mo22320d(int i, String str);

    /* renamed from: d */
    public abstract void mo22322d(int i, int i2, int i3);

    /* renamed from: d */
    public abstract void mo22324d(int i, int i2, int i3, int i4, int i5);

    /* renamed from: d */
    public abstract void mo22325d(int i, int i2, FloatBuffer floatBuffer);

    /* renamed from: d */
    public abstract void mo22326d(int i, int i2, IntBuffer intBuffer);

    /* renamed from: d */
    public abstract void mo22327d(int i, IntBuffer intBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo22331e(int i, int i2);

    /* renamed from: e */
    public abstract void mo22332e(int i, int i2, int i3, int i4);

    /* renamed from: e */
    public abstract void mo22333e(int i, int i2, IntBuffer intBuffer);

    /* renamed from: e */
    public abstract void mo22334e(int i, IntBuffer intBuffer);

    /* renamed from: f */
    public abstract void mo22337f(int i, int i2);

    /* renamed from: f */
    public abstract void mo22338f(int i, int i2, int i3, int i4);

    /* renamed from: f */
    public abstract void mo22339f(int i, int i2, IntBuffer intBuffer);

    /* renamed from: f */
    public abstract void mo22340f(int i, IntBuffer intBuffer);

    /* renamed from: g */
    public abstract void mo22341g(int i, int i2);

    /* renamed from: g */
    public abstract void mo22342g(int i, int i2, int i3, int i4);

    /* renamed from: g */
    public abstract void mo22343g(int i, IntBuffer intBuffer);

    /* renamed from: h */
    public abstract void mo22347h(int i, int i2);

    /* renamed from: h */
    public abstract void mo22348h(int i, int i2, int i3, int i4);

    /* renamed from: h */
    public abstract void mo22349h(int i, IntBuffer intBuffer);

    /* renamed from: i */
    public abstract void mo22351i(int i, int i2);

    /* renamed from: i */
    public abstract void mo22352i(int i, int i2, int i3, int i4);

    /* renamed from: i */
    public abstract void mo22353i(int i, IntBuffer intBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo22354j(int i, int i2);

    /* renamed from: j */
    public abstract void mo22355j(int i, int i2, int i3, int i4);

    /* renamed from: j */
    public abstract void mo22356j(int i, IntBuffer intBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo22358k();

    /* renamed from: k */
    public abstract void mo22359k(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo22360l();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract float mo22368r();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo22371u(int i) {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo22373v();

    /* renamed from: v */
    public abstract void mo22374v(int i);

    /* renamed from: w */
    public abstract void mo22376w(int i);

    /* renamed from: x */
    public abstract String mo22377x(int i);

    /* renamed from: y */
    public abstract String mo22379y(int i);

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo22381z() {
    }

    /* renamed from: z */
    public abstract void mo22382z(int i);

    static {
        boolean z = true;
        f25101aU = Float.MIN_VALUE;
        float f = 1.0f;
        do {
            f /= 2.0f;
        } while (((double) ((float) ((((double) f) / 2.0d) + 1.0d))) != 1.0d);
        f25101aU = f;
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z = false;
        }
        f25102aV = z;
    }

    public C7056e(C7065i iVar) {
        this.f25389a = iVar;
        if (this.f25373K == null) {
            this.f25372J = m37134r(1);
            this.f25373K = m37134r(2);
            this.f25374L = m37134r(1);
            this.f25375M = m37134r(1);
            this.f25376N = m37134r(1);
            this.f25377O = m37134r(1);
            this.f25378P = m37134r(1);
            this.f25379Q = m37134r(1);
            this.f25380R = m37134r(1);
            this.f25381S = m37134r(1);
        }
        this.f25393aD = m37131o(1);
        this.f25394aE = m37134r(1);
        this.f25395aF = m37134r(4);
    }

    /* renamed from: a */
    public void mo22256a() {
        mo22380y();
        this.f25389a = null;
        this.f25431b = null;
    }

    /* renamed from: a */
    public void mo22286a(boolean z) {
        this.f25440e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo22307c() {
        if (this.f25365C) {
            return this.f25372J.get(0);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo22319d() {
        int i;
        if (!this.f25365C) {
            return 0;
        }
        if (1 < this.f25371I) {
            i = this.f25377O.get(0);
        } else {
            i = this.f25372J.get(0);
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo22329e() {
        return this.f25365C ? f25274eS : f25152cA;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo22335f() {
        return this.f25365C ? f25274eS : f25203cz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo22344g() {
        return this.f25365C;
    }

    /* renamed from: h */
    public void mo22346h() {
        this.f25367E = true;
    }

    /* renamed from: i */
    public void mo22350i() {
        this.f25369G = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo22357j() {
        return 1 < this.f25371I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo22362m() {
        this.f25394aE.rewind();
        mo22281a(f25268eM, this.f25394aE);
        return this.f25394aE.get(0) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo22364n() {
        this.f25394aE.rewind();
        mo22281a(f25269eN, this.f25394aE);
        return this.f25394aE.get(0) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7088l mo22254a(C7088l lVar) {
        if (lVar == null) {
            C7088l lVar2 = new C7088l(this.f25389a);
            lVar2.mo22845a(this.f25389a.f24750ce, this.f25389a.f24751cf, this.f25373K.get(this.f25384V), f25157cF, f25150by, this.f25382T, this.f25383U, f25169cR, f25169cR, f25173cV, f25173cV);
            lVar2.mo22861b(!this.f25389a.f25523dQ);
            lVar2.mo22864c(true);
            this.f25389a.mo21942a((C6992d) this.f25389a, (Object) lVar2);
            return lVar2;
        }
        lVar.f25941c = this.f25373K.get(this.f25384V);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C7088l mo22292b(C7088l lVar) {
        if (lVar == null) {
            C7088l lVar2 = new C7088l(this.f25389a);
            lVar2.mo22845a(this.f25389a.f24750ce, this.f25389a.f24751cf, this.f25373K.get(this.f25385W), f25157cF, f25150by, this.f25382T, this.f25383U, f25169cR, f25169cR, f25173cV, f25173cV);
            lVar2.mo22861b(!this.f25389a.f25523dQ);
            lVar2.mo22864c(true);
            return lVar2;
        }
        lVar.f25941c = this.f25373K.get(this.f25385W);
        return lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo22365o() {
        this.f25386X = true;
        if (!mo22345g(f25157cF)) {
            mo22330e(f25157cF);
        }
        mo22321d(f25157cF, this.f25373K.get(this.f25385W));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22366p() {
        if (!mo22288a(f25157cF, this.f25373K.get(this.f25385W))) {
            return;
        }
        if (!mo22345g(f25157cF)) {
            mo22330e(f25157cF);
            mo22321d(f25157cF, 0);
            mo22336f(f25157cF);
            return;
        }
        mo22321d(f25157cF, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo22367q() {
        if (this.f25386X) {
            this.f25387Y = true;
        }
        if (1 < this.f25371I) {
            mo22354j(f25281eZ, this.f25377O.get(0));
            mo22354j(f25318fa, this.f25372J.get(0));
            int i = f25270eO;
            if (this.f25389a.mo22406B(10)) {
                i |= f25271eP | f25272eQ;
            }
            mo22269a(0, 0, this.f25382T, this.f25383U, 0, 0, this.f25382T, this.f25383U, i, f25169cR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo22369s() {
        if (!this.f25401aL && !this.f25403aN) {
            mo22305b(true);
            mo22257a(1.0f);
            mo22238Q(0);
            mo22241R(f25271eP | f25272eQ);
        } else if (!this.f25401aL) {
            mo22305b(true);
            mo22257a(1.0f);
            mo22241R(f25271eP);
        } else if (!this.f25403aN) {
            mo22238Q(0);
            mo22241R(f25272eQ);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22259a(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        mo22258a(f, f2, f3, f4);
        if (z && z2) {
            mo22257a(1.0f);
            mo22238Q(0);
            mo22241R(f25271eP | f25272eQ | f25270eO);
            if (this.f25431b.f24514Q > 0) {
                this.f25398aI = true;
                this.f25400aK = true;
                this.f25402aM = true;
            }
        } else if (z) {
            mo22257a(1.0f);
            mo22241R(f25271eP | f25270eO);
            if (this.f25431b.f24514Q > 0) {
                this.f25398aI = true;
                this.f25400aK = true;
            }
        } else if (z2) {
            mo22238Q(0);
            mo22241R(f25272eQ | f25270eO);
            if (this.f25431b.f24514Q > 0) {
                this.f25398aI = true;
                this.f25402aM = true;
            }
        } else {
            mo22241R(f25270eO);
            if (this.f25431b.f24514Q > 0) {
                this.f25398aI = true;
            }
        }
        if (this.f25365C) {
            mo22381z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22370t() {
        int i;
        int i2;
        if (this.f25431b == null) {
            this.f25431b = this.f25389a.f24755cj;
        }
        this.f25397aH = this.f25396aG;
        this.f25396aG = 0;
        this.f25399aJ = this.f25398aI;
        this.f25398aI = false;
        this.f25401aL = this.f25400aK;
        this.f25400aK = false;
        this.f25403aN = this.f25402aM;
        this.f25402aM = false;
        if (this.f25367E) {
            this.f25365C = true;
            this.f25367E = false;
        }
        if (this.f25365C) {
            if (this.f25369G) {
                mo22380y();
                this.f25369G = false;
            }
            if (!this.f25366D) {
                m37102W();
            }
            mo22354j(f25273eR, this.f25372J.get(0));
            mo22313c(f25273eR, f25274eS, f25157cF, this.f25373K.get(this.f25384V), 0);
            if (1 < this.f25371I) {
                mo22354j(f25273eR, this.f25377O.get(0));
            }
            if (this.f25431b.f24514Q == 0) {
                int i3 = this.f25389a.f24644aR;
                mo22258a(((float) ((i3 >> 16) & 255)) / 255.0f, ((float) ((i3 >> 8) & 255)) / 255.0f, ((float) (i3 & 255)) / 255.0f, ((float) ((i3 >> 24) & 255)) / 255.0f);
                mo22241R(f25270eO);
            } else if (!this.f25399aJ || !this.f25389a.mo21908C()) {
                if (this.f25404aW) {
                    i2 = (int) this.f25406aY;
                    i = (int) this.f25407aZ;
                } else {
                    i2 = 0;
                    i = 0;
                }
                float r = mo22368r();
                mo22270a(f25157cF, this.f25373K.get(this.f25385W), this.f25382T, this.f25383U, i2, i, this.f25389a.f24750ce, this.f25389a.f24751cf, 0, 0, (int) (((float) this.f25389a.f24750ce) * r), (int) (r * ((float) this.f25389a.f24751cf)), 0, 0, this.f25389a.f24750ce, this.f25389a.f24751cf);
                return;
            }
        } else if (!f25094B) {
        } else if (this.f25431b.f24514Q == 1) {
            mo22378x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22309c(int i) {
        C7056e eVar;
        int i2;
        int i3;
        int i4 = i;
        if (this.f25365C) {
            mo22367q();
            mo22354j(f25273eR, 0);
            if (this.f25404aW) {
                float f = ((float) ((i4 >> 24) & 255)) / 255.0f;
                float f2 = ((float) ((i4 >> 16) & 255)) / 255.0f;
                float f3 = ((float) ((i4 >> 8) & 255)) / 255.0f;
                float f4 = ((float) (i4 & 255)) / 255.0f;
                mo22257a(1.0f);
                mo22258a(f2, f3, f4, f);
                mo22241R(f25270eO | f25271eP);
                if (this.f25405aX) {
                    if (this.f25432ba == null) {
                        this.f25432ba = m37134r(1);
                        mo22334e(1, this.f25432ba);
                        mo22321d(f25157cF, this.f25432ba.get(0));
                        mo22311c(f25157cF, f25231db, f25169cR);
                        mo22311c(f25157cF, f25232dc, f25169cR);
                        mo22311c(f25157cF, f25233dd, f25173cV);
                        mo22311c(f25157cF, f25234de, f25173cV);
                        mo22272a(f25157cF, 0, f25150by, this.f25434bc, this.f25435bd, 0, f25150by, f25147bv, null);
                        int[] iArr = new int[f25132bg.length];
                        C6982a.m36407a((Object) f25132bg, (Object) iArr);
                        float f5 = ((float) ((this.f25433bb >> 24) & 255)) / 255.0f;
                        float f6 = ((float) ((this.f25433bb >> 16) & 255)) / 255.0f;
                        float f7 = ((float) ((this.f25433bb >> 8) & 255)) / 255.0f;
                        float f8 = ((float) ((this.f25433bb >> 0) & 255)) / 255.0f;
                        for (int i5 = 0; i5 < iArr.length; i5++) {
                            int i6 = f25132bg[i5];
                            iArr[i5] = m37128j(((int) (((float) ((i6 >> 0) & 255)) * f8)) | (((int) (((float) ((i6 >> 24) & 255)) * f5)) << 24) | (((int) (((float) ((i6 >> 16) & 255)) * f6)) << 16) | (((int) (((float) ((i6 >> 8) & 255)) * f7)) << 8));
                        }
                        IntBuffer a = m37108a(iArr);
                        mo22273a(f25157cF, f25150by, this.f25432ba.get(0), 0, 0, this.f25434bc, this.f25435bd, a);
                        mo22321d(f25157cF, 0);
                    }
                    mo22270a(f25157cF, this.f25432ba.get(0), this.f25434bc, this.f25435bd, 0, 0, this.f25434bc + this.f25436be, this.f25435bd + this.f25437bf, 0, this.f25435bd, this.f25434bc, 0, this.f25436be, this.f25437bf, this.f25436be + this.f25434bc, this.f25437bf + this.f25435bd);
                }
                eVar = this;
            } else {
                eVar = this;
                eVar.mo22257a(1.0f);
                eVar.mo22258a(0.0f, 0.0f, 0.0f, 0.0f);
                eVar.mo22241R(f25270eO | f25271eP);
            }
            eVar.mo22376w(f25228dY);
            if (eVar.f25404aW) {
                i3 = (int) eVar.f25406aY;
                i2 = (int) eVar.f25407aZ;
            } else {
                i3 = 0;
                i2 = 0;
            }
            float r = mo22368r();
            mo22270a(f25157cF, eVar.f25373K.get(eVar.f25384V), eVar.f25382T, eVar.f25383U, i3, i2, eVar.f25389a.f24750ce, eVar.f25389a.f24751cf, 0, 0, (int) (((float) eVar.f25389a.f24750ce) * r), (int) (r * ((float) eVar.f25389a.f24751cf)), 0, 0, eVar.f25389a.f24750ce, eVar.f25389a.f24751cf);
            int i7 = this.f25385W;
            this.f25385W = this.f25384V;
            this.f25384V = i7;
            if (this.f25368F) {
                this.f25365C = false;
                this.f25368F = false;
                return;
            }
            return;
        }
        if (f25094B && this.f25431b.f24514Q == 0) {
            mo22375w();
        }
        if ((!this.f25398aI && this.f25431b.f24514Q > 0) || !this.f25389a.mo21908C()) {
            mo22346h();
            if (f25094B) {
                m37102W();
            }
        }
    }

    /* renamed from: u */
    public boolean mo22372u() {
        return Thread.currentThread() == this.f25438c;
    }

    /* renamed from: a */
    public void mo22285a(Thread thread) {
        this.f25438c = thread;
    }

    /* renamed from: W */
    private void m37102W() {
        int i;
        float r = mo22368r();
        if (mo22227K()) {
            this.f25382T = (int) (((float) this.f25389a.f24750ce) * r);
            this.f25383U = (int) (r * ((float) this.f25389a.f24751cf));
        } else {
            this.f25382T = m37126h((int) (((float) this.f25389a.f24750ce) * r));
            this.f25383U = m37126h((int) (r * ((float) this.f25389a.f24751cf)));
        }
        if (mo22231M()) {
            this.f25371I = C6982a.m36422d(this.f25370H, mo22240R());
        } else {
            this.f25371I = 1;
        }
        boolean z = 1 < this.f25371I;
        boolean N = mo22233N();
        int d = C6982a.m36422d(f25308f, mo22358k());
        int d2 = C6982a.m36422d(f25344g, mo22360l());
        this.f25384V = 0;
        this.f25385W = 1;
        boolean z2 = f25094B && this.f25431b.f24514Q == 0 && this.f25364A != null;
        mo22334e(2, this.f25373K);
        int i2 = 0;
        for (int i3 = 2; i2 < i3; i3 = 2) {
            mo22321d(f25157cF, this.f25373K.get(i2));
            mo22311c(f25157cF, f25231db, f25169cR);
            mo22311c(f25157cF, f25232dc, f25169cR);
            mo22311c(f25157cF, f25233dd, f25173cV);
            mo22311c(f25157cF, f25234de, f25173cV);
            int i4 = i2;
            int i5 = d2;
            mo22272a(f25157cF, 0, f25150by, this.f25382T, this.f25383U, 0, f25150by, f25147bv, null);
            if (i4 != this.f25385W || !z2) {
                mo22267a(f25157cF, f25150by, this.f25382T, this.f25383U, this.f25389a.f24644aR);
            } else {
                mo22299b(f25157cF, 0, 0, 0, this.f25389a.f24750ce, this.f25389a.f24751cf, f25150by, f25147bv, this.f25364A);
            }
            i2 = i4 + 1;
            d2 = i5;
        }
        int i6 = d2;
        mo22321d(f25157cF, 0);
        mo22349h(1, this.f25372J);
        mo22354j(f25273eR, this.f25372J.get(0));
        mo22313c(f25273eR, f25274eS, f25157cF, this.f25373K.get(this.f25384V), 0);
        if (!z || this.f25389a.mo22406B(10)) {
            i = i6;
            m37117a(false, d, i, N);
        } else {
            i = i6;
        }
        if (z) {
            mo22349h(1, this.f25377O);
            mo22354j(f25273eR, this.f25377O.get(0));
            mo22356j(1, this.f25378P);
            mo22359k(f25278eW, this.f25378P.get(0));
            mo22324d(f25278eW, this.f25371I, f25115bJ, this.f25382T, this.f25383U);
            mo22355j(f25273eR, f25274eS, f25278eW, this.f25378P.get(0));
            m37117a(true, d, i, N);
        }
        mo22217F();
        mo22257a(1.0f);
        mo22238Q(0);
        int i7 = this.f25389a.f24644aR;
        mo22258a(((float) ((i7 >> 16) & 255)) / 255.0f, ((float) ((i7 >> 8) & 255)) / 255.0f, ((float) (i7 & 255)) / 255.0f, ((float) ((i7 >> 24) & 255)) / 255.0f);
        mo22241R(f25271eP | f25272eQ | f25270eO);
        mo22354j(f25273eR, 0);
        mo22373v();
        this.f25366D = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo22375w() {
        this.f25364A = m37133q(this.f25389a.f24750ce * this.f25389a.f24751cf);
        if (mo22237P()) {
            mo22245T(f25152cA);
        }
        mo22274a(0, 0, this.f25389a.f24750ce, this.f25389a.f24751cf, f25150by, f25147bv, this.f25364A);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo22378x() {
        int h;
        int h2;
        if (this.f25364A != null) {
            IntBuffer r = m37134r(1);
            mo22334e(1, r);
            float r2 = mo22368r();
            if (mo22227K()) {
                h = (int) (((float) this.f25389a.f24750ce) * r2);
                h2 = (int) (((float) this.f25389a.f24751cf) * r2);
            } else {
                h = m37126h((int) (((float) this.f25389a.f24750ce) * r2));
                h2 = m37126h((int) (((float) this.f25389a.f24751cf) * r2));
            }
            int i = h;
            int i2 = h2;
            mo22321d(f25157cF, r.get(0));
            mo22311c(f25157cF, f25231db, f25169cR);
            mo22311c(f25157cF, f25232dc, f25169cR);
            mo22311c(f25157cF, f25233dd, f25173cV);
            mo22311c(f25157cF, f25234de, f25173cV);
            mo22272a(f25157cF, 0, f25150by, i, i2, 0, f25150by, f25147bv, null);
            mo22299b(f25157cF, 0, 0, 0, this.f25389a.f24750ce, this.f25389a.f24751cf, f25150by, f25147bv, this.f25364A);
            IntBuffer intBuffer = r;
            IntBuffer intBuffer2 = intBuffer;
            mo22270a(f25157cF, r.get(0), i, i2, 0, 0, this.f25389a.f24750ce, this.f25389a.f24751cf, 0, 0, (int) (((float) this.f25389a.f24750ce) * r2), (int) (r2 * ((float) this.f25389a.f24751cf)), 0, 0, this.f25389a.f24750ce, this.f25389a.f24751cf);
            mo22340f(1, intBuffer2);
            this.f25364A.clear();
            this.f25364A = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo22380y() {
        if (mo22372u() && this.f25366D) {
            mo22343g(1, this.f25372J);
            mo22340f(2, this.f25373K);
            mo22353i(1, this.f25374L);
            mo22353i(1, this.f25375M);
            mo22353i(1, this.f25376N);
            mo22343g(1, this.f25377O);
            mo22353i(1, this.f25378P);
            mo22353i(1, this.f25379Q);
            mo22353i(1, this.f25380R);
            mo22353i(1, this.f25381S);
        }
        this.f25366D = false;
    }

    /* renamed from: a */
    private void m37117a(boolean z, int i, int i2, boolean z2) {
        if (z2 && i == 24 && i2 == 8) {
            IntBuffer intBuffer = z ? this.f25379Q : this.f25374L;
            mo22356j(1, intBuffer);
            mo22359k(f25278eW, intBuffer.get(0));
            if (z) {
                mo22324d(f25278eW, this.f25371I, f25319fb, this.f25382T, this.f25383U);
            } else {
                mo22352i(f25278eW, f25319fb, this.f25382T, this.f25383U);
            }
            mo22355j(f25273eR, f25279eX, f25278eW, intBuffer.get(0));
            mo22355j(f25273eR, f25280eY, f25278eW, intBuffer.get(0));
            return;
        }
        if (i > 0) {
            int i3 = f25321fd;
            if (i == 32) {
                i3 = f25323ff;
            } else if (i == 24) {
                i3 = f25322fe;
            } else if (i == 16) {
                i3 = f25321fd;
            }
            int i4 = i3;
            IntBuffer intBuffer2 = z ? this.f25380R : this.f25375M;
            mo22356j(1, intBuffer2);
            mo22359k(f25278eW, intBuffer2.get(0));
            if (z) {
                mo22324d(f25278eW, this.f25371I, i4, this.f25382T, this.f25383U);
            } else {
                mo22352i(f25278eW, i4, this.f25382T, this.f25383U);
            }
            mo22355j(f25273eR, f25279eX, f25278eW, intBuffer2.get(0));
        }
        if (i2 > 0) {
            int i5 = f25325fh;
            if (i2 == 8) {
                i5 = f25327fj;
            } else if (i2 == 4) {
                i5 = f25326fi;
            } else if (i2 == 1) {
                i5 = f25325fh;
            }
            int i6 = i5;
            IntBuffer intBuffer3 = z ? this.f25381S : this.f25376N;
            mo22356j(1, intBuffer3);
            mo22359k(f25278eW, intBuffer3.get(0));
            if (z) {
                mo22324d(f25278eW, this.f25371I, i6, this.f25382T, this.f25383U);
            } else {
                mo22352i(f25278eW, i6, this.f25382T, this.f25383U);
            }
            mo22355j(f25273eR, f25280eY, f25278eW, intBuffer3.get(0));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo22208B() {
        return this.f25439d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo22328d(int i) {
        return i == -1 || i == this.f25439d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo22330e(int i) {
        if (i == f25157cF) {
            this.f25427aw[0] = true;
        } else if (i == f25158cG) {
            this.f25427aw[1] = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo22336f(int i) {
        if (i == f25157cF) {
            this.f25427aw[0] = false;
        } else if (i == f25158cG) {
            this.f25427aw[1] = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo22345g(int i) {
        if (i == f25157cF) {
            return this.f25427aw[0];
        }
        if (i == f25158cG) {
            return this.f25427aw[1];
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22288a(int i, int i2) {
        boolean z = false;
        if (this.f25430az == null) {
            return false;
        }
        if (i == f25157cF) {
            if (this.f25430az[this.f25429ay][0] == i2) {
                z = true;
            }
            return z;
        } else if (i != f25158cG) {
            return false;
        } else {
            if (this.f25430az[this.f25429ay][1] == i2) {
                z = true;
            }
            return z;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22266a(int i, int i2, int i3, int i4) {
        mo22267a(i, i2, i3, i4, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22267a(int i, int i2, int i3, int i4, int i5) {
        int i6 = i3;
        int i7 = i4;
        int[] iArr = new int[256];
        Arrays.fill(iArr, m37128j(i5));
        IntBuffer q = m37133q(256);
        q.put(iArr);
        q.rewind();
        for (int i8 = 0; i8 < i7; i8 += 16) {
            int d = C6982a.m36422d(16, i7 - i8);
            int i9 = 0;
            while (i9 < i6) {
                int i10 = i9;
                mo22299b(i, 0, i9, i8, C6982a.m36422d(16, i6 - i9), d, i2, f25147bv, q);
                i9 = i10 + 16;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22273a(int i, int i2, int i3, int i4, int i5, int i6, int i7, IntBuffer intBuffer) {
        boolean z;
        int i8;
        int i9 = i;
        mo22213D(f25175cX);
        if (!mo22345g(i)) {
            mo22330e(i);
            i8 = i3;
            z = true;
        } else {
            i8 = i3;
            z = false;
        }
        mo22321d(i, i8);
        mo22299b(i, 0, i4, i5, i6, i7, i2, f25147bv, intBuffer);
        mo22321d(i, 0);
        if (z) {
            mo22336f(i);
        }
    }

    /* renamed from: a */
    public void mo22268a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mo22271a(i, i2, i3, i4, 0, 0, i3, i4, 1, i5, i6, i7, i8, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public void mo22270a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        mo22271a(i, i2, i3, i4, i5, i6, i7, i8, (int) mo22368r(), i9, i10, i11, i12, i13, i14, i15, i16);
    }

    /* renamed from: a */
    public void mo22271a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i;
        if (i18 == f25157cF) {
            mo22298b(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17);
        } else if (i18 == f25158cG) {
            mo22314c(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C7056e mo22210C() {
        C7056e aE = this.f25440e ? this : this.f25389a.mo22424aE();
        if (!aE.f25388Z || aE.f25411ad != aE.f25439d) {
            String a = C6982a.m36404a(m37124b(f25103at, mo22214E()), "\n");
            String a2 = C6982a.m36404a(m37120a(f25104au, mo22214E()), "\n");
            aE.f25409ab = mo22249a(f25243dn, a);
            aE.f25410ac = mo22249a(f25244do, a2);
            if (aE.f25409ab > 0 && aE.f25410ac > 0) {
                aE.f25408aa = mo22290b(aE.f25409ab, aE.f25410ac);
            }
            if (aE.f25408aa > 0) {
                aE.f25412ae = mo22308c(aE.f25408aa, "position");
                aE.f25413af = mo22308c(aE.f25408aa, "texCoord");
                aE.f25414ag = mo22320d(aE.f25408aa, "texMap");
            }
            aE.f25388Z = true;
            aE.f25411ad = aE.f25439d;
            mo22318c(1, this.f25394aE);
            aE.f25415ah = this.f25394aE.get(0);
            mo22310c(f25187cj, aE.f25415ah);
            mo22276a(f25187cj, f25097aQ * 16, (Buffer) null, f25190cm);
        }
        if (this.f25426as == null) {
            this.f25426as = m37135s(this.f25425ar.length);
        }
        return aE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22298b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z;
        int i17 = i6;
        int i18 = i7;
        C7056e C = mo22210C();
        if (C.f25408aa > 0) {
            boolean m = mo22362m();
            mo22376w(f25268eM);
            boolean n = mo22364n();
            mo22305b(false);
            this.f25395aF.rewind();
            mo22304b(f25186ci, this.f25395aF);
            mo22312c(i8 * i4, i8 * i5, i8 * i17, i8 * i18);
            mo22224J(C.f25408aa);
            mo22382z(C.f25412ae);
            mo22382z(C.f25413af);
            float f = (float) i17;
            float f2 = ((((float) i13) * 2.0f) / f) - 1.0f;
            this.f25425ar[0] = f2;
            float f3 = (float) i18;
            float f4 = ((((float) i14) * 2.0f) / f3) - 1.0f;
            this.f25425ar[1] = f4;
            float f5 = (float) i2;
            float f6 = ((float) i9) / f5;
            this.f25425ar[2] = f6;
            float f7 = (float) i3;
            float f8 = ((float) i10) / f7;
            this.f25425ar[3] = f8;
            float f9 = ((((float) i15) * 2.0f) / f) - 1.0f;
            this.f25425ar[4] = f9;
            this.f25425ar[5] = f4;
            float f10 = ((float) i11) / f5;
            this.f25425ar[6] = f10;
            this.f25425ar[7] = f8;
            this.f25425ar[8] = f2;
            float f11 = ((((float) i16) * 2.0f) / f3) - 1.0f;
            this.f25425ar[9] = f11;
            this.f25425ar[10] = f6;
            float f12 = ((float) i12) / f7;
            this.f25425ar[11] = f12;
            this.f25425ar[12] = f9;
            this.f25425ar[13] = f11;
            this.f25425ar[14] = f10;
            this.f25425ar[15] = f12;
            this.f25426as.rewind();
            this.f25426as.put(this.f25425ar);
            mo22213D(f25175cX);
            if (!mo22345g(f25157cF)) {
                mo22330e(f25157cF);
                z = true;
            } else {
                z = false;
            }
            mo22321d(f25157cF, i);
            mo22341g(C.f25414ag, 0);
            this.f25426as.position(0);
            mo22310c(f25187cj, C.f25415ah);
            mo22276a(f25187cj, f25097aQ * 16, (Buffer) this.f25426as, f25190cm);
            mo22275a(C.f25412ae, 2, f25144bs, false, f25097aQ * 4, 0);
            mo22275a(C.f25413af, 2, f25144bs, false, f25097aQ * 4, f25097aQ * 2);
            mo22265a(f25200cw, 0, 4);
            mo22310c(f25187cj, 0);
            mo22321d(f25157cF, 0);
            if (z) {
                mo22336f(f25157cF);
            }
            mo22207A(C.f25412ae);
            mo22207A(C.f25413af);
            mo22224J(0);
            if (m) {
                mo22374v(f25268eM);
            } else {
                mo22376w(f25268eM);
            }
            mo22305b(n);
            mo22312c(this.f25395aF.get(0), this.f25395aF.get(1), this.f25395aF.get(2), this.f25395aF.get(3));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C7056e mo22212D() {
        C7056e aE = this.f25440e ? this : this.f25389a.mo22424aE();
        if (!aE.f25416ai || aE.f25420am != aE.f25439d) {
            String a = C6982a.m36404a(m37124b(f25103at, mo22214E()), "\n");
            String a2 = C6982a.m36404a(m37120a(f25105av, mo22214E()), "\n");
            aE.f25418ak = mo22249a(f25243dn, a);
            aE.f25419al = mo22249a(f25244do, a2);
            if (aE.f25418ak > 0 && aE.f25419al > 0) {
                aE.f25417aj = mo22290b(aE.f25418ak, aE.f25419al);
            }
            if (aE.f25417aj > 0) {
                aE.f25421an = mo22308c(aE.f25417aj, "position");
                aE.f25422ao = mo22308c(aE.f25417aj, "texCoord");
                aE.f25423ap = mo22320d(aE.f25417aj, "texMap");
            }
            aE.f25416ai = true;
            aE.f25420am = aE.f25439d;
            mo22318c(1, this.f25394aE);
            aE.f25424aq = this.f25394aE.get(0);
            mo22310c(f25187cj, aE.f25424aq);
            mo22276a(f25187cj, f25097aQ * 16, (Buffer) null, f25190cm);
        }
        return aE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo22314c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z;
        int i17 = i6;
        int i18 = i7;
        C7056e D = mo22212D();
        if (this.f25426as == null) {
            this.f25426as = m37135s(this.f25425ar.length);
        }
        if (D.f25417aj > 0) {
            boolean m = mo22362m();
            mo22376w(f25268eM);
            boolean n = mo22364n();
            mo22305b(false);
            this.f25395aF.rewind();
            mo22304b(f25186ci, this.f25395aF);
            mo22312c(i8 * i4, i8 * i5, i8 * i17, i8 * i18);
            mo22224J(D.f25417aj);
            mo22382z(D.f25421an);
            mo22382z(D.f25422ao);
            float f = (float) i17;
            float f2 = ((((float) i13) * 2.0f) / f) - 1.0f;
            this.f25425ar[0] = f2;
            float f3 = (float) i18;
            float f4 = ((((float) i14) * 2.0f) / f3) - 1.0f;
            this.f25425ar[1] = f4;
            float f5 = (float) i9;
            this.f25425ar[2] = f5;
            float f6 = (float) i10;
            this.f25425ar[3] = f6;
            float f7 = ((((float) i15) * 2.0f) / f) - 1.0f;
            this.f25425ar[4] = f7;
            this.f25425ar[5] = f4;
            float f8 = (float) i11;
            this.f25425ar[6] = f8;
            this.f25425ar[7] = f6;
            this.f25425ar[8] = f2;
            float f9 = ((((float) i16) * 2.0f) / f3) - 1.0f;
            this.f25425ar[9] = f9;
            this.f25425ar[10] = f5;
            float f10 = (float) i12;
            this.f25425ar[11] = f10;
            this.f25425ar[12] = f7;
            this.f25425ar[13] = f9;
            this.f25425ar[14] = f8;
            this.f25425ar[15] = f10;
            this.f25426as.rewind();
            this.f25426as.put(this.f25425ar);
            mo22213D(f25175cX);
            if (!mo22345g(f25158cG)) {
                mo22330e(f25158cG);
                z = true;
            } else {
                z = false;
            }
            mo22321d(f25158cG, i);
            mo22341g(D.f25423ap, 0);
            this.f25426as.position(0);
            mo22310c(f25187cj, D.f25424aq);
            mo22276a(f25187cj, f25097aQ * 16, (Buffer) this.f25426as, f25190cm);
            mo22275a(D.f25421an, 2, f25144bs, false, f25097aQ * 4, 0);
            mo22275a(D.f25422ao, 2, f25144bs, false, f25097aQ * 4, f25097aQ * 2);
            mo22265a(f25200cw, 0, 4);
            mo22310c(f25187cj, 0);
            mo22321d(f25158cG, 0);
            if (z) {
                mo22336f(f25158cG);
            }
            mo22207A(D.f25421an);
            mo22207A(D.f25422ao);
            mo22224J(0);
            if (m) {
                mo22374v(f25268eM);
            } else {
                mo22376w(f25268eM);
            }
            mo22305b(n);
            mo22312c(this.f25395aF.get(0), this.f25395aF.get(1), this.f25395aF.get(2), this.f25395aF.get(3));
        }
    }

    /* renamed from: i */
    protected static int m37127i(int i) {
        if (f25102aV) {
            return (i << 24) | (i >>> 8);
        }
        int i2 = 16711935 & i;
        return (i & -16711936) | (i2 << 16) | (i2 >> 16);
    }

    /* renamed from: a */
    protected static void m37118a(int[] iArr, int i, int i2) {
        int i3;
        int i4 = (i2 - 1) * i;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i3 = i2 / 2;
            if (i5 >= i3) {
                break;
            }
            int i7 = i6;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = iArr[i4];
                int i10 = iArr[i7];
                if (f25102aV) {
                    iArr[i7] = (i9 << 24) | (i9 >>> 8);
                    iArr[i4] = (i10 >>> 8) | (i10 << 24);
                } else {
                    int i11 = i10 & 16711935;
                    int i12 = i9 & 16711935;
                    iArr[i7] = (i9 & -16711936) | (i12 << 16) | (i12 >> 16);
                    iArr[i4] = (i10 & -16711936) | (i11 << 16) | (i11 >> 16);
                }
                i7++;
                i4++;
            }
            i4 -= i * 2;
            i5++;
            i6 = i7;
        }
        if (i2 % 2 == 1) {
            int i13 = i3 * i;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = iArr[i13];
                if (f25102aV) {
                    iArr[i13] = (i15 << 24) | (i15 >>> 8);
                } else {
                    int i16 = i15 & 16711935;
                    iArr[i13] = (i15 & -16711936) | (i16 << 16) | (i16 >> 16);
                }
                i13++;
            }
        }
    }

    /* renamed from: b */
    protected static void m37123b(int[] iArr, int i, int i2) {
        int i3;
        int i4 = (i2 - 1) * i;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i3 = i2 / 2;
            if (i5 >= i3) {
                break;
            }
            int i7 = i6;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = iArr[i4];
                int i10 = iArr[i7];
                if (f25102aV) {
                    iArr[i7] = (i9 >>> 8) | -16777216;
                    iArr[i4] = (i10 >>> 8) | -16777216;
                } else {
                    int i11 = i10 & 16711935;
                    int i12 = i9 & 16711935;
                    iArr[i7] = (i9 & 65280) | (i12 << 16) | -16777216 | (i12 >> 16);
                    iArr[i4] = (i11 << 16) | -16777216 | (i10 & 65280) | (i11 >> 16);
                }
                i7++;
                i4++;
            }
            i4 -= i * 2;
            i5++;
            i6 = i7;
        }
        if (i2 % 2 == 1) {
            int i13 = i3 * i;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = iArr[i13];
                if (f25102aV) {
                    iArr[i13] = (i15 >>> 8) | -16777216;
                } else {
                    int i16 = i15 & 16711935;
                    iArr[i13] = (i15 & 65280) | (i16 << 16) | -16777216 | (i16 >> 16);
                }
                i13++;
            }
        }
    }

    /* renamed from: j */
    protected static int m37128j(int i) {
        if (f25102aV) {
            return (i << 8) | (i >>> 24);
        }
        int i2 = 16711935 & i;
        return (i & -16711936) | (i2 << 16) | (i2 >> 16);
    }

    /* renamed from: c */
    protected static void m37125c(int[] iArr, int i, int i2) {
        int i3;
        int i4 = (i2 - 1) * i;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i3 = i2 / 2;
            if (i5 >= i3) {
                break;
            }
            int i7 = i6;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = iArr[i4];
                int i10 = iArr[i7];
                if (f25102aV) {
                    iArr[i7] = (i9 << 8) | (i9 >>> 24);
                    iArr[i4] = (i10 >>> 24) | (i10 << 8);
                } else {
                    int i11 = i10 & 16711935;
                    int i12 = i9 & 16711935;
                    iArr[i7] = (i9 & -16711936) | (i12 << 16) | (i12 >> 16);
                    iArr[i4] = (i10 & -16711936) | (i11 << 16) | (i11 >> 16);
                }
                i7++;
                i4++;
            }
            i4 -= i * 2;
            i5++;
            i6 = i7;
        }
        if (i2 % 2 == 1) {
            int i13 = i3 * i;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = iArr[i13];
                if (f25102aV) {
                    iArr[i13] = (i15 << 8) | (i15 >>> 24);
                } else {
                    int i16 = i15 & 16711935;
                    iArr[i13] = (i15 & -16711936) | (i16 << 16) | (i16 >> 16);
                }
                i13++;
            }
        }
    }

    /* renamed from: k */
    protected static int m37129k(int i) {
        if (i <= 1) {
            return 1;
        }
        return (i / 2) * 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String[] mo22289a(URL url) {
        try {
            return C6982a.m36409a(url.openStream());
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot load fragment shader ");
            sb.append(url.getFile());
            C6989c.m36564f(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String[] mo22306b(URL url) {
        try {
            return C6982a.m36409a(url.openStream());
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot load vertex shader ");
            sb.append(url.getFile());
            C6989c.m36564f(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    protected static String[] m37120a(String[] strArr, int i) {
        String[] strArr2;
        if (m37119a(strArr)) {
            return strArr;
        }
        if (i < 130) {
            strArr2 = m37121a(strArr, new Pattern[0], new String[0], 1);
            StringBuilder sb = new StringBuilder();
            sb.append("#version ");
            sb.append(i);
            strArr2[0] = sb.toString();
        } else {
            strArr2 = m37121a(strArr, new Pattern[]{Pattern.compile(String.format("(?<![0-9A-Z_a-z])(%s)(?![0-9A-Z_a-z]|\\s*\\()", new Object[]{"varying|attribute"})), Pattern.compile(String.format("(?<![0-9A-Z_a-z])(%s)(?![0-9A-Z_a-z]|\\s*\\()", new Object[]{"texture"})), Pattern.compile(String.format("(?<![0-9A-Z_a-z])(%s)(?=\\s*\\()", new Object[]{"textureRect|texture2D|texture3D|textureCube"})), Pattern.compile(String.format("(?<![0-9A-Z_a-z])(%s)(?![0-9A-Z_a-z]|\\s*\\()", new Object[]{"gl_FragColor"}))}, new String[]{"in", "texMap", "texture", "_fragColor"}, 2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#version ");
            sb2.append(i);
            strArr2[0] = sb2.toString();
            strArr2[1] = "out vec4 _fragColor;";
        }
        return strArr2;
    }

    /* renamed from: b */
    protected static String[] m37124b(String[] strArr, int i) {
        String[] strArr2;
        if (m37119a(strArr)) {
            return strArr;
        }
        if (i < 130) {
            strArr2 = m37121a(strArr, new Pattern[0], new String[0], 1);
            StringBuilder sb = new StringBuilder();
            sb.append("#version ");
            sb.append(i);
            strArr2[0] = sb.toString();
        } else {
            strArr2 = m37121a(strArr, new Pattern[]{Pattern.compile(String.format("(?<![0-9A-Z_a-z])(%s)(?![0-9A-Z_a-z]|\\s*\\()", new Object[]{"varying"})), Pattern.compile(String.format("(?<![0-9A-Z_a-z])(%s)(?![0-9A-Z_a-z]|\\s*\\()", new Object[]{"attribute"})), Pattern.compile(String.format("(?<![0-9A-Z_a-z])(%s)(?![0-9A-Z_a-z]|\\s*\\()", new Object[]{"texture"})), Pattern.compile(String.format("(?<![0-9A-Z_a-z])(%s)(?=\\s*\\()", new Object[]{"textureRect|texture2D|texture3D|textureCube"}))}, new String[]{"out", "in", "texMap", "texture"}, 1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("#version ");
            sb2.append(i);
            strArr2[0] = sb2.toString();
        }
        return strArr2;
    }

    /* renamed from: a */
    protected static String[] m37121a(String[] strArr, Pattern[] patternArr, String[] strArr2, int i) {
        String[] strArr3 = new String[(strArr.length + i)];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            int indexOf = str.indexOf("#version");
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
            String str2 = str;
            for (int i3 = 0; i3 < patternArr.length; i3++) {
                str2 = patternArr[i3].matcher(str2).replaceAll(strArr2[i3]);
            }
            strArr3[i2 + i] = str2;
        }
        return strArr3;
    }

    /* renamed from: a */
    protected static boolean m37119a(String[] strArr) {
        for (String str : strArr) {
            int indexOf = str.indexOf("#version");
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("//");
                if (indexOf2 < 0 || indexOf < indexOf2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22249a(int i, String str) {
        int F = mo22216F(i);
        if (F == 0) {
            return F;
        }
        mo22303b(F, str);
        mo22218G(F);
        if (mo22361l(F)) {
            return F;
        }
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder();
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        printStream.println(sb.toString());
        System.err.println(mo22230M(F));
        mo22220H(F);
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo22290b(int i, int i2) {
        int V = mo22248V();
        if (V == 0) {
            return V;
        }
        mo22337f(V, i);
        mo22337f(V, i2);
        mo22222I(V);
        if (mo22363m(V)) {
            return V;
        }
        System.err.println("Could not link program: ");
        System.err.println(mo22232N(V));
        mo22226K(V);
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo22361l(int i) {
        this.f25394aE.rewind();
        mo22333e(i, f25247dr, this.f25394aE);
        return this.f25394aE.get(0) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo22363m(int i) {
        this.f25394aE.rewind();
        mo22339f(i, f25248ds, this.f25394aE);
        return this.f25394aE.get(0) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo22217F() {
        int S = mo22243S(f25273eR);
        if (S == f25329fl) {
            return true;
        }
        if (S == f25330fm) {
            System.err.println(String.format("Framebuffer error (%1$s), rendering will probably not work as expected Read http://wiki.processing.org/w/OpenGL_Issues for help.", new Object[]{"incomplete attachment"}));
        } else if (S == f25331fn) {
            System.err.println(String.format("Framebuffer error (%1$s), rendering will probably not work as expected Read http://wiki.processing.org/w/OpenGL_Issues for help.", new Object[]{"incomplete missing attachment"}));
        } else if (S == f25332fo) {
            System.err.println(String.format("Framebuffer error (%1$s), rendering will probably not work as expected Read http://wiki.processing.org/w/OpenGL_Issues for help.", new Object[]{"incomplete dimensions"}));
        } else if (S == f25333fp) {
            System.err.println(String.format("Framebuffer error (%1$s), rendering will probably not work as expected Read http://wiki.processing.org/w/OpenGL_Issues for help.", new Object[]{"incomplete formats"}));
        } else if (S == f25336fs) {
            System.err.println(String.format("Framebuffer error (%1$s), rendering will probably not work as expected Read http://wiki.processing.org/w/OpenGL_Issues for help.", new Object[]{"framebuffer unsupported"}));
        } else {
            System.err.println(String.format("Framebuffer error (%1$s), rendering will probably not work as expected Read http://wiki.processing.org/w/OpenGL_Issues for help.", new Object[]{"unknown error"}));
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo22219G() {
        return mo22377x(f25129bX).trim().toLowerCase().contains("opengl es");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public int[] mo22221H() {
        String lowerCase = mo22377x(f25129bX).trim().toLowerCase();
        String str = "opengl es";
        int indexOf = lowerCase.indexOf(str);
        if (indexOf >= 0) {
            lowerCase = lowerCase.substring(indexOf + str.length()).trim();
        }
        int[] iArr = {0, 0, 0};
        String[] split = lowerCase.split(" ");
        int i = 0;
        while (true) {
            if (i >= split.length) {
                break;
            } else if (split[i].indexOf(".") > 0) {
                String[] split2 = split[i].split("\\.");
                try {
                    iArr[0] = Integer.parseInt(split2[0]);
                } catch (NumberFormatException unused) {
                }
                if (1 < split2.length) {
                    try {
                        iArr[1] = Integer.parseInt(split2[1]);
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (2 < split2.length) {
                    try {
                        iArr[2] = Integer.parseInt(split2[2]);
                    } catch (NumberFormatException unused3) {
                    }
                }
            } else {
                i++;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo22223I() {
        boolean z = false;
        if (mo22221H()[0] >= 2) {
            return true;
        }
        String x = mo22377x(f25130bY);
        if (!(x.indexOf("_framebuffer_object") == -1 || x.indexOf("_vertex_shader") == -1 || x.indexOf("_shader_objects") == -1 || x.indexOf("_shading_language") == -1)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo22225J() {
        boolean z = false;
        if (mo22221H()[0] >= 2) {
            return true;
        }
        String x = mo22377x(f25130bY);
        if (!(x.indexOf("_fragment_shader") == -1 || x.indexOf("_vertex_shader") == -1 || x.indexOf("_shader_objects") == -1 || x.indexOf("_shading_language") == -1)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo22227K() {
        boolean z = false;
        if (mo22221H()[0] >= 3) {
            return true;
        }
        if (-1 < mo22377x(f25130bY).indexOf("_texture_non_power_of_two")) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo22229L() {
        boolean z = false;
        if (mo22221H()[0] >= 3) {
            return true;
        }
        if (-1 < mo22377x(f25130bY).indexOf("_generate_mipmap")) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public boolean mo22231M() {
        boolean z = false;
        if (mo22221H()[0] >= 3) {
            return true;
        }
        if (-1 < mo22377x(f25130bY).indexOf("_framebuffer_multisample")) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public boolean mo22233N() {
        boolean z = false;
        if (mo22221H()[0] >= 3) {
            return true;
        }
        if (-1 < mo22377x(f25130bY).indexOf("_packed_depth_stencil")) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public boolean mo22235O() {
        boolean z = false;
        if (mo22221H()[0] >= 3) {
            return true;
        }
        if (-1 < mo22377x(f25130bY).indexOf("_texture_filter_anisotropic")) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo22237P() {
        int[] H = mo22221H();
        boolean z = true;
        if (mo22219G()) {
            if (H[0] < 3) {
                z = false;
            }
            return z;
        }
        if (H[0] < 2) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public boolean mo22239Q() {
        int[] H = mo22221H();
        boolean z = true;
        if (mo22219G()) {
            if (H[0] < 3) {
                z = false;
            }
            return z;
        }
        if (H[0] < 2) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public int mo22240R() {
        this.f25394aE.rewind();
        mo22304b(f25178ca, this.f25394aE);
        return this.f25394aE.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public int mo22242S() {
        this.f25394aE.rewind();
        mo22304b(f25165cN, this.f25394aE);
        return this.f25394aE.get(0);
    }

    /* renamed from: n */
    protected static ByteBuffer m37130n(int i) {
        return ByteBuffer.allocateDirect(C6982a.m36420c(f25347j, i) * f25098aR).order(ByteOrder.nativeOrder());
    }

    /* renamed from: o */
    protected static ByteBuffer m37131o(int i) {
        if (f25346i) {
            return m37130n(i);
        }
        return ByteBuffer.allocate(i);
    }

    /* renamed from: a */
    protected static ByteBuffer m37104a(byte[] bArr) {
        if (!f25346i) {
            return ByteBuffer.wrap(bArr);
        }
        ByteBuffer n = m37130n(bArr.length);
        n.put(bArr);
        n.position(0);
        return n;
    }

    /* renamed from: a */
    protected static void m37110a(ByteBuffer byteBuffer, byte[] bArr, int i, int i2) {
        if (f25346i || (byteBuffer.hasArray() && byteBuffer.array() != bArr)) {
            byteBuffer.position(i);
            byteBuffer.put(bArr, i, i2);
            byteBuffer.rewind();
        }
    }

    /* renamed from: p */
    protected static ShortBuffer m37132p(int i) {
        return ByteBuffer.allocateDirect(C6982a.m36420c(f25347j, i) * f25095aO).order(ByteOrder.nativeOrder()).asShortBuffer();
    }

    /* renamed from: a */
    protected static ShortBuffer m37109a(short[] sArr) {
        if (!f25346i) {
            return ShortBuffer.wrap(sArr);
        }
        ShortBuffer p = m37132p(sArr.length);
        p.put(sArr);
        p.position(0);
        return p;
    }

    /* renamed from: a */
    protected static void m37116a(ShortBuffer shortBuffer, short[] sArr, int i, int i2) {
        if (f25346i || (shortBuffer.hasArray() && shortBuffer.array() != sArr)) {
            shortBuffer.position(i);
            shortBuffer.put(sArr, i, i2);
            shortBuffer.rewind();
        }
    }

    /* renamed from: q */
    protected static IntBuffer m37133q(int i) {
        return ByteBuffer.allocateDirect(C6982a.m36420c(f25347j, i) * f25096aP).order(ByteOrder.nativeOrder()).asIntBuffer();
    }

    /* renamed from: r */
    protected static IntBuffer m37134r(int i) {
        if (f25346i) {
            return m37133q(i);
        }
        return IntBuffer.allocate(i);
    }

    /* renamed from: a */
    protected static IntBuffer m37108a(int[] iArr) {
        if (!f25346i) {
            return IntBuffer.wrap(iArr);
        }
        IntBuffer q = m37133q(iArr.length);
        q.put(iArr);
        q.position(0);
        return q;
    }

    /* renamed from: a */
    protected static IntBuffer m37107a(IntBuffer intBuffer, int[] iArr, boolean z) {
        if (f25346i) {
            if (intBuffer == null || intBuffer.capacity() < iArr.length) {
                intBuffer = m37133q(iArr.length);
            }
            intBuffer.position(0);
            intBuffer.put(iArr);
            intBuffer.rewind();
            return intBuffer;
        } else if (z) {
            return IntBuffer.wrap(iArr);
        } else {
            if (intBuffer == null || intBuffer.capacity() < iArr.length) {
                intBuffer = IntBuffer.allocate(iArr.length);
            }
            intBuffer.position(0);
            intBuffer.put(iArr);
            intBuffer.rewind();
            return intBuffer;
        }
    }

    /* renamed from: a */
    protected static void m37115a(IntBuffer intBuffer, int[] iArr, int i, int i2) {
        if (f25346i || (intBuffer.hasArray() && intBuffer.array() != iArr)) {
            intBuffer.position(i);
            intBuffer.put(iArr, i, i2);
            intBuffer.rewind();
        }
    }

    /* renamed from: a */
    protected static void m37114a(IntBuffer intBuffer, int[] iArr) {
        if (!intBuffer.hasArray() || intBuffer.array() != iArr) {
            intBuffer.position(0);
            intBuffer.get(iArr);
            intBuffer.rewind();
        }
    }

    /* renamed from: b */
    protected static void m37122b(IntBuffer intBuffer, int[] iArr) {
        if (!intBuffer.hasArray() || intBuffer.array() != iArr) {
            intBuffer.position(0);
            intBuffer.put(iArr);
            intBuffer.rewind();
        }
    }

    /* renamed from: a */
    protected static void m37113a(IntBuffer intBuffer, int i, int i2, int i3) {
        int i4 = i2 - i;
        int[] iArr = new int[i4];
        Arrays.fill(iArr, 0, i4, i3);
        intBuffer.position(i);
        intBuffer.put(iArr, 0, i4);
        intBuffer.rewind();
    }

    /* renamed from: s */
    protected static FloatBuffer m37135s(int i) {
        return ByteBuffer.allocateDirect(C6982a.m36420c(f25347j, i) * f25097aQ).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: t */
    protected static FloatBuffer m37136t(int i) {
        if (f25346i) {
            return m37135s(i);
        }
        return FloatBuffer.allocate(i);
    }

    /* renamed from: a */
    protected static FloatBuffer m37106a(float[] fArr) {
        if (!f25346i) {
            return FloatBuffer.wrap(fArr);
        }
        FloatBuffer s = m37135s(fArr.length);
        s.put(fArr);
        s.position(0);
        return s;
    }

    /* renamed from: a */
    protected static FloatBuffer m37105a(FloatBuffer floatBuffer, float[] fArr, boolean z) {
        if (f25346i) {
            if (floatBuffer == null || floatBuffer.capacity() < fArr.length) {
                floatBuffer = m37135s(fArr.length);
            }
            floatBuffer.position(0);
            floatBuffer.put(fArr);
            floatBuffer.rewind();
            return floatBuffer;
        } else if (z) {
            return FloatBuffer.wrap(fArr);
        } else {
            if (floatBuffer == null || floatBuffer.capacity() < fArr.length) {
                floatBuffer = FloatBuffer.allocate(fArr.length);
            }
            floatBuffer.position(0);
            floatBuffer.put(fArr);
            floatBuffer.rewind();
            return floatBuffer;
        }
    }

    /* renamed from: a */
    protected static void m37112a(FloatBuffer floatBuffer, float[] fArr, int i, int i2) {
        if (f25346i || (floatBuffer.hasArray() && floatBuffer.array() != fArr)) {
            floatBuffer.position(i);
            floatBuffer.put(fArr, i, i2);
            floatBuffer.rewind();
        }
    }

    /* renamed from: a */
    protected static void m37111a(FloatBuffer floatBuffer, int i, int i2, float f) {
        int i3 = i2 - i;
        float[] fArr = new float[i3];
        Arrays.fill(fArr, 0, i3, f);
        floatBuffer.position(i);
        floatBuffer.put(fArr, 0, i3);
        floatBuffer.rewind();
    }

    /* renamed from: a */
    public void mo22265a(int i, int i2, int i3) {
        this.f25396aG += i3;
        mo22295b(i, i2, i3);
    }

    /* renamed from: d */
    public void mo22323d(int i, int i2, int i3, int i4) {
        this.f25396aG += i2;
        mo22332e(i, i2, i3, i4);
    }

    /* renamed from: D */
    public void mo22213D(int i) {
        this.f25429ay = i - f25175cX;
        mo22215E(i);
    }

    /* renamed from: d */
    public void mo22321d(int i, int i2) {
        mo22331e(i, i2);
        if (this.f25430az == null) {
            this.f25428ax = mo22242S();
            this.f25430az = (int[][]) Array.newInstance(int.class, new int[]{this.f25428ax, 2});
        }
        if (this.f25428ax <= this.f25429ay) {
            throw new RuntimeException("Number of texture units not supported by this hardware (or driver) Read http://wiki.processing.org/w/OpenGL_Issues for help.");
        } else if (i == f25157cF) {
            this.f25430az[this.f25429ay][0] = i2;
        } else if (i == f25158cG) {
            this.f25430az[this.f25429ay][1] = i2;
        }
    }
}
