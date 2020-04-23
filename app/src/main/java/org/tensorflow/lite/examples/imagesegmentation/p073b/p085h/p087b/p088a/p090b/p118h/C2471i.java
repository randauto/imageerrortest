package p073b.p085h.p087b.p088a.p090b.p118h;

import java.lang.reflect.Field;
import java.util.Set;
import p073b.C3232z;
import p073b.p074a.C1395aj;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1492m;
import p073b.p079e.p081b.C1493n;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p083f.C1508a;
import p073b.p083f.C1509b;
import p073b.p083f.C1510c;
import p073b.p085h.C3123d;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p118h.C2439b.C2442c;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c.C2454k;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c.C2454k.C2455a;
import p073b.p085h.p087b.p088a.p090b.p118h.C2469h.C2470a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.h.i */
/* compiled from: DescriptorRendererOptionsImpl.kt */
public final class C2471i implements C2469h {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f7469a = {C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "withDefinedIn", "getWithDefinedIn()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "modifiers", "getModifiers()Ljava/util/Set;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "startFromName", "getStartFromName()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "debugMode", "getDebugMode()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "verbose", "getVerbose()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "unitReturnType", "getUnitReturnType()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "withoutReturnType", "getWithoutReturnType()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "enhancedTypes", "getEnhancedTypes()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "receiverAfterName", "getReceiverAfterName()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "renderAccessors", "getRenderAccessors()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), C1503v.m7002a((C1492m) new C1493n(C1503v.m6999a(C2471i.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z"))};

    /* renamed from: A */
    private final C1510c f7470A = m12383a((T) C2478m.ALL);

    /* renamed from: B */
    private final C1510c f7471B = m12383a((T) Boolean.valueOf(false));

    /* renamed from: C */
    private final C1510c f7472C = m12383a((T) Boolean.valueOf(false));

    /* renamed from: D */
    private final C1510c f7473D = m12383a((T) Boolean.valueOf(false));

    /* renamed from: E */
    private final C1510c f7474E = m12383a((T) Boolean.valueOf(false));

    /* renamed from: F */
    private final C1510c f7475F = m12383a((T) Boolean.valueOf(false));

    /* renamed from: G */
    private final C1510c f7476G = m12383a((T) C1395aj.m6759a());

    /* renamed from: H */
    private final C1510c f7477H = m12383a((T) C2475j.f7517a.mo9491a());

    /* renamed from: I */
    private final C1510c f7478I = m12383a((T) null);

    /* renamed from: J */
    private final C1510c f7479J = m12383a((T) C2438a.NO_ARGUMENTS);

    /* renamed from: K */
    private final C1510c f7480K = m12383a((T) Boolean.valueOf(false));

    /* renamed from: L */
    private final C1510c f7481L = m12383a((T) Boolean.valueOf(true));

    /* renamed from: M */
    private final C1510c f7482M = m12383a((T) Boolean.valueOf(true));

    /* renamed from: N */
    private final C1510c f7483N = m12383a((T) Boolean.valueOf(true));

    /* renamed from: O */
    private final C1510c f7484O = m12383a((T) Boolean.valueOf(true));

    /* renamed from: P */
    private final C1510c f7485P = m12383a((T) Boolean.valueOf(false));

    /* renamed from: Q */
    private final C1510c f7486Q = m12383a((T) Boolean.valueOf(false));

    /* renamed from: R */
    private final C1510c f7487R = m12383a((T) Boolean.valueOf(false));

    /* renamed from: b */
    private boolean f7488b;

    /* renamed from: c */
    private final C1510c f7489c = m12383a((T) C2442c.f7415a);

    /* renamed from: d */
    private final C1510c f7490d = m12383a((T) Boolean.valueOf(true));

    /* renamed from: e */
    private final C1510c f7491e = m12383a((T) Boolean.valueOf(true));

    /* renamed from: f */
    private final C1510c f7492f = m12383a((T) C2467g.f7464k);

    /* renamed from: g */
    private final C1510c f7493g = m12383a((T) Boolean.valueOf(false));

    /* renamed from: h */
    private final C1510c f7494h = m12383a((T) Boolean.valueOf(false));

    /* renamed from: i */
    private final C1510c f7495i = m12383a((T) Boolean.valueOf(false));

    /* renamed from: j */
    private final C1510c f7496j = m12383a((T) Boolean.valueOf(false));

    /* renamed from: k */
    private final C1510c f7497k = m12383a((T) Boolean.valueOf(false));

    /* renamed from: l */
    private final C1510c f7498l = m12383a((T) Boolean.valueOf(true));

    /* renamed from: m */
    private final C1510c f7499m = m12383a((T) Boolean.valueOf(false));

    /* renamed from: n */
    private final C1510c f7500n = m12383a((T) Boolean.valueOf(false));

    /* renamed from: o */
    private final C1510c f7501o = m12383a((T) Boolean.valueOf(false));

    /* renamed from: p */
    private final C1510c f7502p = m12383a((T) Boolean.valueOf(true));

    /* renamed from: q */
    private final C1510c f7503q = m12383a((T) Boolean.valueOf(false));

    /* renamed from: r */
    private final C1510c f7504r = m12383a((T) Boolean.valueOf(false));

    /* renamed from: s */
    private final C1510c f7505s = m12383a((T) Boolean.valueOf(false));

    /* renamed from: t */
    private final C1510c f7506t = m12383a((T) Boolean.valueOf(false));

    /* renamed from: u */
    private final C1510c f7507u = m12383a((T) C2474c.f7516a);

    /* renamed from: v */
    private final C1510c f7508v = m12383a((T) C2472a.f7513a);

    /* renamed from: w */
    private final C1510c f7509w = m12383a((T) Boolean.valueOf(true));

    /* renamed from: x */
    private final C1510c f7510x = m12383a((T) C2477l.RENDER_OPEN);

    /* renamed from: y */
    private final C1510c f7511y = m12383a((T) C2455a.f7435a);

    /* renamed from: z */
    private final C1510c f7512z = m12383a((T) C2479n.f7528a);

    /* renamed from: b.h.b.a.b.h.i$a */
    /* compiled from: DescriptorRendererOptionsImpl.kt */
    static final class C2472a extends C1490k implements C1450b<C1705au, String> {

        /* renamed from: a */
        public static final C2472a f7513a = new C2472a();

        C2472a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(C1705au auVar) {
            C1489j.m6972b(auVar, "it");
            return "...";
        }
    }

    /* renamed from: b.h.b.a.b.h.i$b */
    /* compiled from: Delegates.kt */
    public static final class C2473b extends C1509b<T> {

        /* renamed from: a */
        final /* synthetic */ Object f7514a;

        /* renamed from: b */
        final /* synthetic */ C2471i f7515b;

        public C2473b(Object obj, Object obj2, C2471i iVar) {
            this.f7514a = obj;
            this.f7515b = iVar;
            super(obj2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo6971a(C3135k<?> kVar, T t, T t2) {
            C1489j.m6972b(kVar, "property");
            if (!this.f7515b.mo9467a()) {
                return true;
            }
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }

    /* renamed from: b.h.b.a.b.h.i$c */
    /* compiled from: DescriptorRendererOptionsImpl.kt */
    static final class C2474c extends C1490k implements C1450b<C2841w, C2841w> {

        /* renamed from: a */
        public static final C2474c f7516a = new C2474c();

        C2474c() {
            super(1);
        }

        /* renamed from: a */
        public final C2841w mo6756a(C2841w wVar) {
            C1489j.m6972b(wVar, "it");
            return wVar;
        }
    }

    /* renamed from: A */
    public C2477l mo9447A() {
        return (C2477l) this.f7510x.mo6969a(this, f7469a[21]);
    }

    /* renamed from: B */
    public C2454k mo9448B() {
        return (C2454k) this.f7511y.mo6969a(this, f7469a[22]);
    }

    /* renamed from: C */
    public C2479n mo9449C() {
        return (C2479n) this.f7512z.mo6969a(this, f7469a[23]);
    }

    /* renamed from: D */
    public C2478m mo9450D() {
        return (C2478m) this.f7470A.mo6969a(this, f7469a[24]);
    }

    /* renamed from: E */
    public boolean mo9451E() {
        return ((Boolean) this.f7471B.mo6969a(this, f7469a[25])).booleanValue();
    }

    /* renamed from: F */
    public boolean mo9452F() {
        return ((Boolean) this.f7472C.mo6969a(this, f7469a[26])).booleanValue();
    }

    /* renamed from: G */
    public boolean mo9453G() {
        return ((Boolean) this.f7473D.mo6969a(this, f7469a[27])).booleanValue();
    }

    /* renamed from: H */
    public boolean mo9454H() {
        return ((Boolean) this.f7474E.mo6969a(this, f7469a[28])).booleanValue();
    }

    /* renamed from: I */
    public boolean mo9455I() {
        return ((Boolean) this.f7475F.mo6969a(this, f7469a[29])).booleanValue();
    }

    /* renamed from: J */
    public Set<C2355b> mo9456J() {
        return (Set) this.f7476G.mo6969a(this, f7469a[30]);
    }

    /* renamed from: K */
    public C1450b<C1651c, Boolean> mo9457K() {
        return (C1450b) this.f7478I.mo6969a(this, f7469a[32]);
    }

    /* renamed from: L */
    public boolean mo9458L() {
        return ((Boolean) this.f7480K.mo6969a(this, f7469a[34])).booleanValue();
    }

    /* renamed from: M */
    public boolean mo9459M() {
        return ((Boolean) this.f7481L.mo6969a(this, f7469a[35])).booleanValue();
    }

    /* renamed from: N */
    public boolean mo9460N() {
        return ((Boolean) this.f7482M.mo6969a(this, f7469a[36])).booleanValue();
    }

    /* renamed from: O */
    public boolean mo9461O() {
        return ((Boolean) this.f7483N.mo6969a(this, f7469a[37])).booleanValue();
    }

    /* renamed from: P */
    public boolean mo9462P() {
        return ((Boolean) this.f7484O.mo6969a(this, f7469a[38])).booleanValue();
    }

    /* renamed from: Q */
    public boolean mo9463Q() {
        return ((Boolean) this.f7486Q.mo6969a(this, f7469a[40])).booleanValue();
    }

    /* renamed from: R */
    public boolean mo9464R() {
        return ((Boolean) this.f7487R.mo6969a(this, f7469a[41])).booleanValue();
    }

    /* renamed from: a */
    public void mo9388a(C2438a aVar) {
        C1489j.m6972b(aVar, "<set-?>");
        this.f7479J.mo6970a(this, f7469a[33], aVar);
    }

    /* renamed from: a */
    public void mo9389a(C2439b bVar) {
        C1489j.m6972b(bVar, "<set-?>");
        this.f7489c.mo6970a(this, f7469a[0], bVar);
    }

    /* renamed from: a */
    public void mo9390a(C2478m mVar) {
        C1489j.m6972b(mVar, "<set-?>");
        this.f7470A.mo6970a(this, f7469a[24], mVar);
    }

    /* renamed from: a */
    public void mo9391a(C2479n nVar) {
        C1489j.m6972b(nVar, "<set-?>");
        this.f7512z.mo6970a(this, f7469a[23], nVar);
    }

    /* renamed from: a */
    public void mo9392a(Set<C2355b> set) {
        C1489j.m6972b(set, "<set-?>");
        this.f7477H.mo6970a(this, f7469a[31], set);
    }

    /* renamed from: a */
    public void mo9393a(boolean z) {
        this.f7495i.mo6970a(this, f7469a[6], Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo9394b(Set<? extends C2467g> set) {
        C1489j.m6972b(set, "<set-?>");
        this.f7492f.mo6970a(this, f7469a[3], set);
    }

    /* renamed from: b */
    public void mo9395b(boolean z) {
        this.f7471B.mo6970a(this, f7469a[25], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public C2438a mo9397c() {
        return (C2438a) this.f7479J.mo6969a(this, f7469a[33]);
    }

    /* renamed from: c */
    public void mo9398c(boolean z) {
        this.f7472C.mo6970a(this, f7469a[26], Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo9400d(boolean z) {
        this.f7493g.mo6970a(this, f7469a[4], Boolean.valueOf(z));
    }

    /* renamed from: e */
    public C2439b mo9470e() {
        return (C2439b) this.f7489c.mo6969a(this, f7469a[0]);
    }

    /* renamed from: e */
    public void mo9401e(boolean z) {
        this.f7497k.mo6970a(this, f7469a[8], Boolean.valueOf(z));
    }

    /* renamed from: f */
    public void mo9403f(boolean z) {
        this.f7490d.mo6970a(this, f7469a[1], Boolean.valueOf(z));
    }

    /* renamed from: f */
    public boolean mo9471f() {
        return ((Boolean) this.f7490d.mo6969a(this, f7469a[1])).booleanValue();
    }

    /* renamed from: g */
    public void mo9406g(boolean z) {
        this.f7506t.mo6970a(this, f7469a[17], Boolean.valueOf(z));
    }

    /* renamed from: g */
    public boolean mo9472g() {
        return ((Boolean) this.f7491e.mo6969a(this, f7469a[2])).booleanValue();
    }

    /* renamed from: h */
    public void mo9407h(boolean z) {
        this.f7505s.mo6970a(this, f7469a[16], Boolean.valueOf(z));
    }

    /* renamed from: h */
    public boolean mo9408h() {
        return ((Boolean) this.f7495i.mo6969a(this, f7469a[6])).booleanValue();
    }

    /* renamed from: i */
    public Set<C2467g> mo9473i() {
        return (Set) this.f7492f.mo6969a(this, f7469a[3]);
    }

    /* renamed from: j */
    public boolean mo9474j() {
        return ((Boolean) this.f7493g.mo6969a(this, f7469a[4])).booleanValue();
    }

    /* renamed from: k */
    public boolean mo9411k() {
        return ((Boolean) this.f7500n.mo6969a(this, f7469a[11])).booleanValue();
    }

    /* renamed from: l */
    public boolean mo9475l() {
        return ((Boolean) this.f7494h.mo6969a(this, f7469a[5])).booleanValue();
    }

    /* renamed from: m */
    public Set<C2355b> mo9413m() {
        return (Set) this.f7477H.mo6969a(this, f7469a[31]);
    }

    /* renamed from: n */
    public boolean mo9476n() {
        return ((Boolean) this.f7496j.mo6969a(this, f7469a[7])).booleanValue();
    }

    /* renamed from: o */
    public boolean mo9477o() {
        return ((Boolean) this.f7497k.mo6969a(this, f7469a[8])).booleanValue();
    }

    /* renamed from: p */
    public boolean mo9478p() {
        return ((Boolean) this.f7498l.mo6969a(this, f7469a[9])).booleanValue();
    }

    /* renamed from: q */
    public boolean mo9479q() {
        return ((Boolean) this.f7499m.mo6969a(this, f7469a[10])).booleanValue();
    }

    /* renamed from: r */
    public boolean mo9480r() {
        return ((Boolean) this.f7501o.mo6969a(this, f7469a[12])).booleanValue();
    }

    /* renamed from: s */
    public boolean mo9481s() {
        return ((Boolean) this.f7502p.mo6969a(this, f7469a[13])).booleanValue();
    }

    /* renamed from: t */
    public boolean mo9482t() {
        return ((Boolean) this.f7503q.mo6969a(this, f7469a[14])).booleanValue();
    }

    /* renamed from: u */
    public boolean mo9483u() {
        return ((Boolean) this.f7504r.mo6969a(this, f7469a[15])).booleanValue();
    }

    /* renamed from: v */
    public boolean mo9484v() {
        return ((Boolean) this.f7505s.mo6969a(this, f7469a[16])).booleanValue();
    }

    /* renamed from: w */
    public boolean mo9485w() {
        return ((Boolean) this.f7506t.mo6969a(this, f7469a[17])).booleanValue();
    }

    /* renamed from: x */
    public C1450b<C2841w, C2841w> mo9486x() {
        return (C1450b) this.f7507u.mo6969a(this, f7469a[18]);
    }

    /* renamed from: y */
    public C1450b<C1705au, String> mo9487y() {
        return (C1450b) this.f7508v.mo6969a(this, f7469a[19]);
    }

    /* renamed from: z */
    public boolean mo9488z() {
        return ((Boolean) this.f7509w.mo6969a(this, f7469a[20])).booleanValue();
    }

    /* renamed from: S */
    public boolean mo9465S() {
        return C2470a.m12381a(this);
    }

    /* renamed from: T */
    public boolean mo9466T() {
        return C2470a.m12382b(this);
    }

    /* renamed from: a */
    public final boolean mo9467a() {
        return this.f7488b;
    }

    /* renamed from: b */
    public final void mo9468b() {
        boolean z = !this.f7488b;
        if (!C3232z.f8648a || z) {
            this.f7488b = true;
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* renamed from: d */
    public final C2471i mo9469d() {
        Field[] declaredFields;
        C2471i iVar = new C2471i();
        for (Field field : getClass().getDeclaredFields()) {
            C1489j.m6969a((Object) field, "field");
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (!(obj instanceof C1509b)) {
                    obj = null;
                }
                C1509b bVar = (C1509b) obj;
                if (bVar != null) {
                    String name = field.getName();
                    C1489j.m6969a((Object) name, "field.name");
                    boolean b = true ^ C3199m.m14761b(name, "is", false, 2, null);
                    if (!C3232z.f8648a || b) {
                        C3123d a = C1503v.m6999a(C2471i.class);
                        String name2 = field.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("get");
                        String name3 = field.getName();
                        C1489j.m6969a((Object) name3, "field.name");
                        sb.append(C3199m.m14764d(name3));
                        field.set(iVar, iVar.m12383a((T) bVar.mo6969a(this, new C1499t(a, name2, sb.toString()))));
                    } else {
                        throw new AssertionError("Fields named is* are not supported here yet");
                    }
                } else {
                    continue;
                }
            }
        }
        return iVar;
    }

    /* renamed from: a */
    private final <T> C1510c<C2471i, T> m12383a(T t) {
        C1508a aVar = C1508a.f4873a;
        return new C2473b<>(t, t, this);
    }
}
