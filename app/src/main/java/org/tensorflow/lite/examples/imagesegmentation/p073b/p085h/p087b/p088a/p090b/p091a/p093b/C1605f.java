package p073b.p085h.p087b.p088a.p090b.p091a.p093b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p073b.C1511g;
import p073b.C1521h;
import p073b.C3227u;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1500u.C1502b;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1675aa;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1803l;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1809r;
import p073b.p085h.p087b.p088a.p090b.p094b.C1810s;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t.C1814a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1656f;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1663i;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1726a;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1729c;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1732d;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1763h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1790w;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1850g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1891f;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1896g;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2147r;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2150u;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2584j;
import p073b.p085h.p087b.p088a.p090b.p119i.C2584j.C2594a.C2595a;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2536c;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h.C2564c;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2608e;
import p073b.p085h.p087b.p088a.p090b.p130k.C2690a;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2844z;
import p073b.p085h.p087b.p088a.p090b.p139n.C2886b;
import p073b.p085h.p087b.p088a.p090b.p139n.C2886b.C2888a;
import p073b.p085h.p087b.p088a.p090b.p139n.C2886b.C2889b;
import p073b.p085h.p087b.p088a.p090b.p139n.C2886b.C2890c;
import p073b.p085h.p087b.p088a.p090b.p139n.C2913j;
import p073b.p085h.p087b.p088a.p090b.p139n.C2913j.C2915b;

/* renamed from: b.h.b.a.b.a.b.f */
/* compiled from: JvmBuiltInsSettings.kt */
public class C1605f implements C1726a, C1729c {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5028a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1605f.class), "ownerModuleDescriptor", "getOwnerModuleDescriptor()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1605f.class), "isAdditionalBuiltInsFeatureSupported", "isAdditionalBuiltInsFeatureSupported()Z")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1605f.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1605f.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationsImpl;"))};

    /* renamed from: b */
    public static final C1606a f5029b = new C1606a(null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Set<String> f5030k = C1395aj.m6764a((Set<? extends T>) C2150u.f6453a.mo8082b("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Set<String> f5031l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Set<String> f5032m;

    /* renamed from: n */
    private static final Set<String> f5033n;

    /* renamed from: o */
    private static final Set<String> f5034o;

    /* renamed from: p */
    private static final Set<String> f5035p;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1595c f5036c = C1595c.f4995a;

    /* renamed from: d */
    private final C1511g f5037d;

    /* renamed from: e */
    private final C1511g f5038e;

    /* renamed from: f */
    private final C2841w f5039f;

    /* renamed from: g */
    private final C2710f f5040g;

    /* renamed from: h */
    private final C2690a<C2355b, C1796e> f5041h;

    /* renamed from: i */
    private final C2710f f5042i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1821y f5043j;

    /* renamed from: b.h.b.a.b.a.b.f$a */
    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class C1606a {
        private C1606a() {
        }

        public /* synthetic */ C1606a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo7155a(C2356c cVar) {
            C1489j.m6972b(cVar, "fqName");
            if (m7329b(cVar)) {
                return true;
            }
            C2354a a = C1595c.f4995a.mo7121a(cVar);
            if (a == null) {
                return false;
            }
            try {
                return Serializable.class.isAssignableFrom(Class.forName(a.mo9008g().mo9013a()));
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final boolean m7329b(C2356c cVar) {
            return C1489j.m6971a((Object) cVar, (Object) C1627g.f5076h.f5151h) || C1627g.m7395a(cVar);
        }

        /* renamed from: a */
        public final Set<String> mo7154a() {
            return C1605f.f5030k;
        }

        /* renamed from: b */
        public final Set<String> mo7156b() {
            return C1605f.f5031l;
        }

        /* renamed from: c */
        public final Set<String> mo7157c() {
            return C1605f.f5032m;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final Set<String> m7330d() {
            C2150u uVar = C2150u.f6453a;
            Iterable<C2536c> b = C1415k.m6840b((T[]) new C2536c[]{C2536c.BOOLEAN, C2536c.CHAR});
            Collection linkedHashSet = new LinkedHashSet();
            for (C2536c cVar : b) {
                String a = cVar.mo9562d().mo9018e().mo9039a();
                C1489j.m6969a((Object) a, "it.wrapperFqName.shortName().asString()");
                StringBuilder sb = new StringBuilder();
                sb.append(cVar.mo9560b());
                sb.append("Value()");
                sb.append(cVar.mo9561c());
                C1415k.m6849a(linkedHashSet, (Iterable<? extends T>) uVar.mo8079a(a, sb.toString()));
            }
            return (LinkedHashSet) linkedHashSet;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final Set<String> m7331e() {
            C2150u uVar = C2150u.f6453a;
            Iterable<C2536c> b = C1415k.m6840b((T[]) new C2536c[]{C2536c.BOOLEAN, C2536c.BYTE, C2536c.DOUBLE, C2536c.FLOAT, C2536c.BYTE, C2536c.INT, C2536c.LONG, C2536c.SHORT});
            Collection linkedHashSet = new LinkedHashSet();
            for (C2536c d : b) {
                String a = d.mo9562d().mo9018e().mo9039a();
                C1489j.m6969a((Object) a, "it.wrapperFqName.shortName().asString()");
                String[] a2 = uVar.mo8080a("Ljava/lang/String;");
                C1415k.m6849a(linkedHashSet, (Iterable<? extends T>) uVar.mo8079a(a, (String[]) Arrays.copyOf(a2, a2.length)));
            }
            return (LinkedHashSet) linkedHashSet;
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$b */
    /* compiled from: JvmBuiltInsSettings.kt */
    private enum C1607b {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    /* renamed from: b.h.b.a.b.a.b.f$c */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1608c extends C1490k implements C1449a<C2755ad> {

        /* renamed from: a */
        final /* synthetic */ C1605f f5049a;

        /* renamed from: b */
        final /* synthetic */ C2713i f5050b;

        C1608c(C1605f fVar, C2713i iVar) {
            this.f5049a = fVar;
            this.f5050b = iVar;
            super(0);
        }

        /* renamed from: b */
        public final C2755ad mo6823a() {
            C1821y c = this.f5049a.m7315d();
            C2354a a = C1597d.f5010b.mo7138a();
            C1489j.m6969a((Object) a, "JvmBuiltInClassDescripto…actory.CLONEABLE_CLASS_ID");
            return C1810s.m8444a(c, a, new C1675aa(this.f5050b, this.f5049a.m7315d())).mo7346A_();
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$d */
    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class C1609d extends C1790w {

        /* renamed from: a */
        final /* synthetic */ C1605f f5051a;

        C1609d(C1605f fVar, C1821y yVar, C2355b bVar) {
            this.f5051a = fVar;
            super(yVar, bVar);
        }

        /* renamed from: c */
        public C2564c mo7159a() {
            return C2564c.f7661a;
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$e */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1610e extends C1490k implements C1449a<C2755ad> {

        /* renamed from: a */
        final /* synthetic */ C1605f f5052a;

        C1610e(C1605f fVar) {
            this.f5052a = fVar;
            super(0);
        }

        /* renamed from: b */
        public final C2755ad mo6823a() {
            C2755ad s = this.f5052a.f5043j.mo7522a().mo7206s();
            C1489j.m6969a((Object) s, "moduleDescriptor.builtIns.anyType");
            return s;
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$f */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1611f extends C1490k implements C1449a<C1891f> {

        /* renamed from: a */
        final /* synthetic */ C1891f f5053a;

        /* renamed from: b */
        final /* synthetic */ C1796e f5054b;

        C1611f(C1891f fVar, C1796e eVar) {
            this.f5053a = fVar;
            this.f5054b = eVar;
            super(0);
        }

        /* renamed from: b */
        public final C1891f mo6823a() {
            C1891f fVar = this.f5053a;
            C1850g gVar = C1850g.f5678a;
            C1489j.m6969a((Object) gVar, "JavaResolverCache.EMPTY");
            return fVar.mo7659a(gVar, this.f5054b);
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$g */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1612g extends C1490k implements C1461m<C1803l, C1803l, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C2778au f5055a;

        C1612g(C2778au auVar) {
            this.f5055a = auVar;
            super(2);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6920a(Object obj, Object obj2) {
            return Boolean.valueOf(mo7163a((C1803l) obj, (C1803l) obj2));
        }

        /* renamed from: a */
        public final boolean mo7163a(C1803l lVar, C1803l lVar2) {
            C1489j.m6972b(lVar, "$receiver");
            C1489j.m6972b(lVar2, "javaConstructor");
            return C2584j.m12842d(lVar, lVar2.mo7382b(this.f5055a)) == C2595a.OVERRIDABLE;
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$h */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1613h extends C1490k implements C1450b<C2560h, Collection<? extends C1691al>> {

        /* renamed from: a */
        final /* synthetic */ C2360f f5056a;

        C1613h(C2360f fVar) {
            this.f5056a = fVar;
            super(1);
        }

        /* renamed from: a */
        public final Collection<C1691al> mo6756a(C2560h hVar) {
            C1489j.m6972b(hVar, "it");
            return hVar.mo7444b(this.f5056a, C1830d.FROM_BUILTINS);
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$i */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1614i<N> implements C2889b<N> {

        /* renamed from: a */
        final /* synthetic */ C1605f f5057a;

        C1614i(C1605f fVar) {
            this.f5057a = fVar;
        }

        /* renamed from: a */
        public final List<C1891f> mo7165a(C1796e eVar) {
            C1489j.m6969a((Object) eVar, "it");
            C2767an e = eVar.mo7067e();
            C1489j.m6969a((Object) e, "it.typeConstructor");
            Collection C_ = e.mo7405C_();
            C1489j.m6969a((Object) C_, "it.typeConstructor.supertypes");
            Iterable<C2841w> iterable = C_;
            Collection arrayList = new ArrayList();
            for (C2841w g : iterable) {
                C1799h d = g.mo9507g().mo7096d();
                C1891f fVar = null;
                C1799h f = d != null ? d.mo7349f() : null;
                if (!(f instanceof C1796e)) {
                    f = null;
                }
                C1796e eVar2 = (C1796e) f;
                if (eVar2 != null) {
                    fVar = this.f5057a.m7316e(eVar2);
                }
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$j */
    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class C1615j extends C2888a<C1796e, C1607b> {

        /* renamed from: a */
        final /* synthetic */ String f5058a;

        /* renamed from: b */
        final /* synthetic */ C1502b f5059b;

        C1615j(String str, C1502b bVar) {
            this.f5058a = str;
            this.f5059b = bVar;
        }

        /* renamed from: a */
        public boolean mo7169a(C1796e eVar) {
            C1489j.m6972b(eVar, "javaClassDescriptor");
            String a = C2150u.f6453a.mo8075a(eVar, this.f5058a);
            if (C1605f.f5029b.mo7156b().contains(a)) {
                this.f5059b.f4869a = C1607b.BLACK_LIST;
            } else if (C1605f.f5029b.mo7157c().contains(a)) {
                this.f5059b.f4869a = C1607b.WHITE_LIST;
            } else if (C1605f.f5029b.mo7154a().contains(a)) {
                this.f5059b.f4869a = C1607b.DROP;
            }
            return ((C1607b) this.f5059b.f4869a) == null;
        }

        /* renamed from: a */
        public C1607b mo7170b() {
            C1607b bVar = (C1607b) this.f5059b.f4869a;
            return bVar != null ? bVar : C1607b.NOT_CONSIDERED;
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$k */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1616k<N> implements C2889b<N> {

        /* renamed from: a */
        public static final C1616k f5060a = new C1616k();

        C1616k() {
        }

        /* renamed from: a */
        public final Collection<? extends C1724b> mo7165a(C1724b bVar) {
            C1489j.m6969a((Object) bVar, "it");
            C1724b l = bVar.mo7343l();
            C1489j.m6969a((Object) l, "it.original");
            return l.mo7238k();
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$l */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1617l extends C1490k implements C1450b<C1724b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1605f f5061a;

        C1617l(C1605f fVar) {
            this.f5061a = fVar;
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7172a((C1724b) obj));
        }

        /* renamed from: a */
        public final boolean mo7172a(C1724b bVar) {
            C1489j.m6969a((Object) bVar, "overridden");
            if (bVar.mo7344n() == C1725a.DECLARATION) {
                C1595c b = this.f5061a.f5036c;
                C1804m b2 = bVar.mo7065b();
                if (b2 == null) {
                    throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                } else if (b.mo7124a((C1796e) b2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b.h.b.a.b.a.b.f$m */
    /* compiled from: JvmBuiltInsSettings.kt */
    static final class C1618m extends C1490k implements C1449a<C1663i> {

        /* renamed from: a */
        final /* synthetic */ C1605f f5062a;

        C1618m(C1605f fVar) {
            this.f5062a = fVar;
            super(0);
        }

        /* renamed from: b */
        public final C1663i mo6823a() {
            return new C1663i(C1415k.m6832a(C1656f.m7536a(this.f5062a.f5043j.mo7522a(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C1821y m7315d() {
        C1511g gVar = this.f5037d;
        C3135k kVar = f5028a[0];
        return (C1821y) gVar.mo6918a();
    }

    /* renamed from: e */
    private final boolean m7317e() {
        C1511g gVar = this.f5038e;
        C3135k kVar = f5028a[1];
        return ((Boolean) gVar.mo6918a()).booleanValue();
    }

    /* renamed from: f */
    private final C2755ad m7318f() {
        return (C2755ad) C2712h.m13321a(this.f5040g, (Object) this, f5028a[2]);
    }

    /* renamed from: g */
    private final C1663i m7319g() {
        return (C1663i) C2712h.m13321a(this.f5042i, (Object) this, f5028a[3]);
    }

    public C1605f(C1821y yVar, C2713i iVar, C1449a<? extends C1821y> aVar, C1449a<Boolean> aVar2) {
        C1489j.m6972b(yVar, "moduleDescriptor");
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(aVar, "deferredOwnerModuleDescriptor");
        C1489j.m6972b(aVar2, "isAdditionalBuiltInsFeatureSupported");
        this.f5043j = yVar;
        this.f5037d = C1521h.m14706a(aVar);
        this.f5038e = C1521h.m14706a(aVar2);
        this.f5039f = m7306a(iVar);
        this.f5040g = iVar.mo9793a((C1449a<? extends T>) new C1608c<Object>(this, iVar));
        this.f5041h = iVar.mo9796b();
        this.f5042i = iVar.mo9793a((C1449a<? extends T>) new C1618m<Object>(this));
    }

    /* renamed from: a */
    private final C2841w m7306a(C2713i iVar) {
        C1763h hVar = new C1763h(new C1609d(this, this.f5043j, new C2355b("java.io")), C2360f.m11701a("Serializable"), C1818w.ABSTRACT, C1797f.INTERFACE, C1415k.m6832a(new C2844z(iVar, new C1610e(this))), C1692am.f5331a, false, iVar);
        hVar.mo7422a(C2564c.f7661a, C1395aj.m6759a(), null);
        C2755ad A_ = hVar.mo7346A_();
        C1489j.m6969a((Object) A_, "mockSerializableClass.defaultType");
        return A_;
    }

    /* renamed from: a */
    public Collection<C2841w> mo7148a(C1796e eVar) {
        C1489j.m6972b(eVar, "classDescriptor");
        C2356c a = C2524a.m12621a((C1804m) eVar);
        if (f5029b.m7329b(a)) {
            C2755ad f = m7318f();
            C1489j.m6969a((Object) f, "cloneableType");
            return C1415k.m6840b((T[]) new C2841w[]{f, this.f5039f});
        } else if (f5029b.mo7155a(a)) {
            return C1415k.m6832a(this.f5039f);
        } else {
            return C1415k.m6837a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0134  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<p073b.p085h.p087b.p088a.p090b.p094b.C1691al> mo7149a(p073b.p085h.p087b.p088a.p090b.p116f.C2360f r6, p073b.p085h.p087b.p088a.p090b.p094b.C1796e r7) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            p073b.p079e.p081b.C1489j.m6972b(r6, r0)
            java.lang.String r0 = "classDescriptor"
            p073b.p079e.p081b.C1489j.m6972b(r7, r0)
            b.h.b.a.b.a.b.a$a r0 = p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1590a.f4990a
            b.h.b.a.b.f.f r0 = r0.mo7114a()
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r6, r0)
            if (r0 == 0) goto L_0x009e
            boolean r0 = r7 instanceof p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2608e
            if (r0 == 0) goto L_0x009e
            boolean r0 = p073b.p085h.p087b.p088a.p090b.p091a.C1627g.m7391a(r7)
            if (r0 == 0) goto L_0x009e
            b.h.b.a.b.j.a.a.e r7 = (p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2608e) r7
            b.h.b.a.b.e.a$c r0 = r7.mo9643H()
            java.util.List r0 = r0.mo8479w()
            java.lang.String r1 = "classDescriptor.classProto.functionList"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x0040
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0040
            goto L_0x0072
        L_0x0040:
            java.util.Iterator r0 = r0.iterator()
        L_0x0044:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r0.next()
            b.h.b.a.b.e.a$o r1 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2248o) r1
            b.h.b.a.b.j.a.k r3 = r7.mo9645a()
            b.h.b.a.b.e.a.c r3 = r3.mo9743e()
            java.lang.String r4 = "functionProto"
            p073b.p079e.p081b.C1489j.m6969a(r1, r4)
            int r1 = r1.mo8631k()
            b.h.b.a.b.f.f r1 = p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2674r.m13224b(r3, r1)
            b.h.b.a.b.a.b.a$a r3 = p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1590a.f4990a
            b.h.b.a.b.f.f r3 = r3.mo7114a()
            boolean r1 = p073b.p079e.p081b.C1489j.m6971a(r1, r3)
            if (r1 == 0) goto L_0x0044
            r2 = 1
        L_0x0072:
            if (r2 == 0) goto L_0x007b
            java.util.List r6 = p073b.p074a.C1415k.m6837a()
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
        L_0x007b:
            b.h.b.a.b.l.ad r0 = r5.m7318f()
            b.h.b.a.b.i.e.h r0 = r0.mo7787b()
            b.h.b.a.b.c.a.d r1 = p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d.FROM_BUILTINS
            b.h.b.a.b.c.a.b r1 = (p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b) r1
            java.util.Collection r6 = r0.mo7444b(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = p073b.p074a.C1415k.m6882f(r6)
            b.h.b.a.b.b.al r6 = (p073b.p085h.p087b.p088a.p090b.p094b.C1691al) r6
            b.h.b.a.b.b.al r6 = r5.m7303a(r7, r6)
            java.util.List r6 = p073b.p074a.C1415k.m6832a(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
        L_0x009e:
            boolean r0 = r5.m7317e()
            if (r0 != 0) goto L_0x00ab
            java.util.List r6 = p073b.p074a.C1415k.m6837a()
            java.util.Collection r6 = (java.util.Collection) r6
            return r6
        L_0x00ab:
            b.h.b.a.b.a.b.f$h r0 = new b.h.b.a.b.a.b.f$h
            r0.<init>(r6)
            b.e.a.b r0 = (p073b.p079e.p080a.C1450b) r0
            java.util.Collection r6 = r5.m7307a(r7, r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r6 = r6.iterator()
        L_0x00c3:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0150
            java.lang.Object r1 = r6.next()
            b.h.b.a.b.b.al r1 = (p073b.p085h.p087b.p088a.p090b.p094b.C1691al) r1
            b.h.b.a.b.b.m r2 = r1.mo7065b()
            if (r2 == 0) goto L_0x0148
            b.h.b.a.b.b.e r2 = (p073b.p085h.p087b.p088a.p090b.p094b.C1796e) r2
            b.h.b.a.b.l.ao r2 = p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1620h.m7360a(r2, r7)
            b.h.b.a.b.l.au r2 = r2.mo9881f()
            b.h.b.a.b.b.t r2 = r1.mo7383c(r2)
            if (r2 == 0) goto L_0x0140
            b.h.b.a.b.b.al r2 = (p073b.p085h.p087b.p088a.p090b.p094b.C1691al) r2
            b.h.b.a.b.b.t$a r2 = r2.mo7304D()
            r3 = r7
            b.h.b.a.b.b.m r3 = (p073b.p085h.p087b.p088a.p090b.p094b.C1804m) r3
            r2.mo7479a(r3)
            b.h.b.a.b.b.ak r3 = r7.mo7353D()
            r2.mo7476a(r3)
            r2.mo7496b()
            b.h.b.a.b.b.t r1 = (p073b.p085h.p087b.p088a.p090b.p094b.C1813t) r1
            b.h.b.a.b.a.b.f$b r1 = r5.m7302a(r1)
            int[] r3 = p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1619g.f5063a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 0
            switch(r1) {
                case 1: goto L_0x011e;
                case 2: goto L_0x010e;
                case 3: goto L_0x013a;
                case 4: goto L_0x012e;
                default: goto L_0x010d;
            }
        L_0x010d:
            goto L_0x012e
        L_0x010e:
            b.h.b.a.b.b.a.i r1 = r5.m7319g()
            b.h.b.a.b.b.a.h r1 = (p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h) r1
            b.h.b.a.b.b.t$a r1 = r2.mo7475a(r1)
            java.lang.String r3 = "setAdditionalAnnotations(notConsideredDeprecation)"
            p073b.p079e.p081b.C1489j.m6969a(r1, r3)
            goto L_0x012e
        L_0x011e:
            boolean r1 = p073b.p085h.p087b.p088a.p090b.p094b.C1820x.m8491a(r7)
            if (r1 == 0) goto L_0x0125
            goto L_0x013a
        L_0x0125:
            b.h.b.a.b.b.t$a r1 = r2.mo7504e()
            java.lang.String r3 = "setHiddenForResolutionEverywhereBesideSupercalls()"
            p073b.p079e.p081b.C1489j.m6969a(r1, r3)
        L_0x012e:
            b.h.b.a.b.b.t r1 = r2.mo7505f()
            if (r1 != 0) goto L_0x0137
            p073b.p079e.p081b.C1489j.m6968a()
        L_0x0137:
            r3 = r1
            b.h.b.a.b.b.al r3 = (p073b.p085h.p087b.p088a.p090b.p094b.C1691al) r3
        L_0x013a:
            if (r3 == 0) goto L_0x00c3
            r0.add(r3)
            goto L_0x00c3
        L_0x0140:
            b.u r6 = new b.u
            java.lang.String r7 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            r6.<init>(r7)
            throw r6
        L_0x0148:
            b.u r6 = new b.u
            java.lang.String r7 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r6.<init>(r7)
            throw r6
        L_0x0150:
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1605f.mo7149a(b.h.b.a.b.f.f, b.h.b.a.b.b.e):java.util.Collection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<p073b.p085h.p087b.p088a.p090b.p116f.C2360f> mo7152c(p073b.p085h.p087b.p088a.p090b.p094b.C1796e r2) {
        /*
            r1 = this;
            java.lang.String r0 = "classDescriptor"
            p073b.p079e.p081b.C1489j.m6972b(r2, r0)
            boolean r0 = r1.m7317e()
            if (r0 != 0) goto L_0x0010
            java.util.Set r2 = p073b.p074a.C1395aj.m6759a()
            return r2
        L_0x0010:
            b.h.b.a.b.d.a.c.a.f r2 = r1.m7316e(r2)
            if (r2 == 0) goto L_0x0023
            b.h.b.a.b.d.a.c.a.g r2 = r2.mo7068g()
            if (r2 == 0) goto L_0x0023
            java.util.Set r2 = r2.mo7441D_()
            if (r2 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            java.util.Set r2 = p073b.p074a.C1395aj.m6759a()
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1605f.mo7152c(b.h.b.a.b.b.e):java.util.Set");
    }

    /* renamed from: a */
    private final Collection<C1691al> m7307a(C1796e eVar, C1450b<? super C2560h, ? extends Collection<? extends C1691al>> bVar) {
        boolean z;
        C1891f e = m7316e(eVar);
        if (e == null) {
            return C1415k.m6837a();
        }
        C1804m mVar = e;
        Iterable<C1796e> a = this.f5036c.mo7122a(C2524a.m12623b(mVar), C1592b.f4992a.mo7117a());
        C1796e eVar2 = (C1796e) C1415k.m6880e(a);
        if (eVar2 == null) {
            return C1415k.m6837a();
        }
        C2915b bVar2 = C2913j.f8247a;
        Collection arrayList = new ArrayList(C1415k.m6842a(a, 10));
        for (C1796e b : a) {
            arrayList.add(C2524a.m12623b((C1804m) b));
        }
        C2913j a2 = bVar2.mo10031a((List) arrayList);
        boolean a3 = this.f5036c.mo7124a(eVar);
        C2560h g = ((C1796e) this.f5041h.mo9789a(C2524a.m12623b(mVar), new C1611f(e, eVar2))).mo7068g();
        C1489j.m6969a((Object) g, "scope");
        Iterable iterable = (Iterable) bVar.mo6756a(g);
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            C1691al alVar = (C1691al) next;
            boolean z2 = false;
            if (alVar.mo7344n() == C1725a.DECLARATION && alVar.mo7077p().mo7339c() && !C1627g.m7416e((C1804m) alVar)) {
                Collection k = alVar.mo7238k();
                C1489j.m6969a((Object) k, "analogueMember.overriddenDescriptors");
                Iterable iterable2 = k;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it = iterable2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1813t tVar = (C1813t) it.next();
                        C1489j.m6969a((Object) tVar, "it");
                        C1804m b2 = tVar.mo7065b();
                        C1489j.m6969a((Object) b2, "it.containingDeclaration");
                        if (a2.contains(C2524a.m12623b(b2))) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z && !m7309a(alVar, a3)) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }

    /* renamed from: a */
    private final C1691al m7303a(C2608e eVar, C1691al alVar) {
        C1814a D = alVar.mo7304D();
        D.mo7479a((C1804m) eVar);
        D.mo7477a(C1710ay.f5340e);
        D.mo7483a((C2841w) eVar.mo7346A_());
        D.mo7476a(eVar.mo7353D());
        C1813t f = D.mo7505f();
        if (f == null) {
            C1489j.m6968a();
        }
        return (C1691al) f;
    }

    /* renamed from: a */
    private final boolean m7309a(C1691al alVar, boolean z) {
        C1804m b = alVar.mo7065b();
        if (b != null) {
            if (z ^ f5033n.contains(C2150u.f6453a.mo8075a((C1796e) b, C2147r.m9578a(alVar, false, false, 3, null)))) {
                return true;
            }
            Boolean a = C2886b.m13954a((Collection<N>) C1415k.m6832a(alVar), (C2889b<N>) C1616k.f5060a, (C1450b<N, Boolean>) new C1617l<N,Boolean>(this));
            C1489j.m6969a((Object) a, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
            return a.booleanValue();
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    /* renamed from: a */
    private final C1607b m7302a(C1813t tVar) {
        C1804m b = tVar.mo7065b();
        if (b != null) {
            C1796e eVar = (C1796e) b;
            String a = C2147r.m9578a(tVar, false, false, 3, null);
            C1502b bVar = new C1502b();
            bVar.f4869a = (C1607b) null;
            Object a2 = C2886b.m13955a((Collection<N>) C1415k.m6832a(eVar), (C2889b<N>) new C1614i<N>(this), (C2890c<N, R>) new C1615j<N,R>(a, bVar));
            C1489j.m6969a(a2, "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })");
            return (C1607b) a2;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C1891f m7316e(C1796e eVar) {
        if (C1627g.m7413d(eVar)) {
            return null;
        }
        C1804m mVar = eVar;
        if (!C1627g.m7402b(mVar)) {
            return null;
        }
        C2356c a = C2524a.m12621a(mVar);
        if (!a.mo9026b()) {
            return null;
        }
        C2354a a2 = this.f5036c.mo7121a(a);
        if (a2 != null) {
            C2355b g = a2.mo9008g();
            if (g != null) {
                C1821y d = m7315d();
                C1489j.m6969a((Object) g, "javaAnalogueFqName");
                C1796e a3 = C1809r.m8442a(d, g, C1830d.FROM_BUILTINS);
                if (!(a3 instanceof C1891f)) {
                    a3 = null;
                }
                return (C1891f) a3;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0058 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<p073b.p085h.p087b.p088a.p090b.p094b.C1795d> mo7153d(p073b.p085h.p087b.p088a.p090b.p094b.C1796e r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "classDescriptor"
            p073b.p079e.p081b.C1489j.m6972b(r1, r2)
            b.h.b.a.b.b.f r2 = r18.mo7073l()
            b.h.b.a.b.b.f r3 = p073b.p085h.p087b.p088a.p090b.p094b.C1797f.CLASS
            if (r2 != r3) goto L_0x016d
            boolean r2 = r17.m7317e()
            if (r2 != 0) goto L_0x0019
            goto L_0x016d
        L_0x0019:
            b.h.b.a.b.d.a.c.a.f r2 = r17.m7316e(r18)
            if (r2 == 0) goto L_0x0166
            b.h.b.a.b.a.b.c r3 = r0.f5036c
            r4 = r2
            b.h.b.a.b.b.m r4 = (p073b.p085h.p087b.p088a.p090b.p094b.C1804m) r4
            b.h.b.a.b.f.b r4 = p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a.m12623b(r4)
            b.h.b.a.b.a.b.b$a r5 = p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1592b.f4992a
            b.h.b.a.b.a.g r5 = r5.mo7117a()
            r6 = 0
            r7 = 4
            r8 = 0
            b.h.b.a.b.b.e r3 = p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1595c.m7248a(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L_0x015f
            r4 = r2
            b.h.b.a.b.b.e r4 = (p073b.p085h.p087b.p088a.p090b.p094b.C1796e) r4
            b.h.b.a.b.l.ao r5 = p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1620h.m7360a(r3, r4)
            b.h.b.a.b.l.au r5 = r5.mo9881f()
            b.h.b.a.b.a.b.f$g r6 = new b.h.b.a.b.a.b.f$g
            r6.<init>(r5)
            java.util.List r2 = r2.mo7072k()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r8 = r2.hasNext()
            r9 = 0
            r10 = 3
            r11 = 0
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r8 = r2.next()
            r12 = r8
            b.h.b.a.b.b.d r12 = (p073b.p085h.p087b.p088a.p090b.p094b.C1795d) r12
            java.lang.String r13 = "javaConstructor"
            p073b.p079e.p081b.C1489j.m6969a(r12, r13)
            b.h.b.a.b.b.az r13 = r12.mo7077p()
            boolean r13 = r13.mo7339c()
            if (r13 == 0) goto L_0x00dd
            java.util.Collection r13 = r3.mo7072k()
            java.lang.String r15 = "defaultKotlinVersion.constructors"
            p073b.p079e.p081b.C1489j.m6969a(r13, r15)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r15 = r13 instanceof java.util.Collection
            if (r15 == 0) goto L_0x0091
            r15 = r13
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x0091
        L_0x008f:
            r14 = 1
            goto L_0x00b2
        L_0x0091:
            java.util.Iterator r13 = r13.iterator()
        L_0x0095:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x008f
            java.lang.Object r15 = r13.next()
            b.h.b.a.b.b.d r15 = (p073b.p085h.p087b.p088a.p090b.p094b.C1795d) r15
            java.lang.String r14 = "it"
            p073b.p079e.p081b.C1489j.m6969a(r15, r14)
            b.h.b.a.b.b.l r15 = (p073b.p085h.p087b.p088a.p090b.p094b.C1803l) r15
            r14 = r12
            b.h.b.a.b.b.l r14 = (p073b.p085h.p087b.p088a.p090b.p094b.C1803l) r14
            boolean r14 = r6.mo7163a(r15, r14)
            if (r14 == 0) goto L_0x0095
            r14 = 0
        L_0x00b2:
            if (r14 == 0) goto L_0x00dd
            r13 = r12
            b.h.b.a.b.b.l r13 = (p073b.p085h.p087b.p088a.p090b.p094b.C1803l) r13
            boolean r13 = r0.m7310a(r13, r1)
            if (r13 != 0) goto L_0x00dd
            r13 = r12
            b.h.b.a.b.b.m r13 = (p073b.p085h.p087b.p088a.p090b.p094b.C1804m) r13
            boolean r13 = p073b.p085h.p087b.p088a.p090b.p091a.C1627g.m7416e(r13)
            if (r13 != 0) goto L_0x00dd
            java.util.Set<java.lang.String> r13 = f5034o
            b.h.b.a.b.d.b.u r14 = p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2150u.f6453a
            b.h.b.a.b.b.t r12 = (p073b.p085h.p087b.p088a.p090b.p094b.C1813t) r12
            java.lang.String r9 = p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2147r.m9578a(r12, r11, r11, r10, r9)
            java.lang.String r9 = r14.mo8075a(r4, r9)
            boolean r9 = r13.contains(r9)
            if (r9 != 0) goto L_0x00dd
            r16 = 1
            goto L_0x00df
        L_0x00dd:
            r16 = 0
        L_0x00df:
            if (r16 == 0) goto L_0x0058
            r7.add(r8)
            goto L_0x0058
        L_0x00e6:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p073b.p074a.C1415k.m6842a(r7, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r3 = r7.iterator()
        L_0x00fb:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x015a
            java.lang.Object r6 = r3.next()
            b.h.b.a.b.b.d r6 = (p073b.p085h.p087b.p088a.p090b.p094b.C1795d) r6
            b.h.b.a.b.b.t$a r7 = r6.mo7304D()
            r8 = r1
            b.h.b.a.b.b.m r8 = (p073b.p085h.p087b.p088a.p090b.p094b.C1804m) r8
            r7.mo7479a(r8)
            b.h.b.a.b.l.ad r8 = r18.mo7346A_()
            b.h.b.a.b.l.w r8 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r8
            r7.mo7483a(r8)
            r7.mo7496b()
            b.h.b.a.b.l.as r8 = r5.mo9888b()
            r7.mo7482a(r8)
            java.util.Set<java.lang.String> r8 = f5035p
            b.h.b.a.b.d.b.u r12 = p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2150u.f6453a
            java.lang.String r13 = "javaConstructor"
            p073b.p079e.p081b.C1489j.m6969a(r6, r13)
            b.h.b.a.b.b.t r6 = (p073b.p085h.p087b.p088a.p090b.p094b.C1813t) r6
            java.lang.String r6 = p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2147r.m9578a(r6, r11, r11, r10, r9)
            java.lang.String r6 = r12.mo8075a(r4, r6)
            boolean r6 = r8.contains(r6)
            if (r6 != 0) goto L_0x0146
            b.h.b.a.b.b.a.i r6 = r17.m7319g()
            b.h.b.a.b.b.a.h r6 = (p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h) r6
            r7.mo7475a(r6)
        L_0x0146:
            b.h.b.a.b.b.t r6 = r7.mo7505f()
            if (r6 == 0) goto L_0x0152
            b.h.b.a.b.b.d r6 = (p073b.p085h.p087b.p088a.p090b.p094b.C1795d) r6
            r2.add(r6)
            goto L_0x00fb
        L_0x0152:
            b.u r1 = new b.u
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor"
            r1.<init>(r2)
            throw r1
        L_0x015a:
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            return r2
        L_0x015f:
            java.util.List r1 = p073b.p074a.C1415k.m6837a()
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
        L_0x0166:
            java.util.List r1 = p073b.p074a.C1415k.m6837a()
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
        L_0x016d:
            java.util.List r1 = p073b.p074a.C1415k.m6837a()
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1605f.mo7153d(b.h.b.a.b.b.e):java.util.Collection");
    }

    /* renamed from: a */
    public boolean mo7150a(C1796e eVar, C1691al alVar) {
        C1489j.m6972b(eVar, "classDescriptor");
        C1489j.m6972b(alVar, "functionDescriptor");
        C1891f e = m7316e(eVar);
        if (e == null || !alVar.mo7086x().mo7257b(C1732d.m7737a())) {
            return true;
        }
        boolean z = false;
        if (!m7317e()) {
            return false;
        }
        String a = C2147r.m9578a(alVar, false, false, 3, null);
        C1896g a2 = e.mo7068g();
        C2360f z_ = alVar.mo7351z_();
        C1489j.m6969a((Object) z_, "functionDescriptor.name");
        Iterable b = a2.mo7444b(z_, (C1827b) C1830d.FROM_BUILTINS);
        if (!(b instanceof Collection) || !((Collection) b).isEmpty()) {
            Iterator it = b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C1489j.m6971a((Object) C2147r.m9578a((C1691al) it.next(), false, false, 3, null), (Object) a)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private final boolean m7310a(C1803l lVar, C1796e eVar) {
        if (lVar.mo7236i().size() == 1) {
            List i = lVar.mo7236i();
            C1489j.m6969a((Object) i, "valueParameters");
            Object j = C1415k.m6890j(i);
            C1489j.m6969a(j, "valueParameters.single()");
            C1799h d = ((C1705au) j).mo7320r().mo9507g().mo7096d();
            if (C1489j.m6971a((Object) d != null ? C2524a.m12621a((C1804m) d) : null, (Object) C2524a.m12621a((C1804m) eVar))) {
                return true;
            }
        }
        return false;
    }

    static {
        C2150u uVar = C2150u.f6453a;
        f5031l = C1395aj.m6763a(C1395aj.m6763a(C1395aj.m6763a(C1395aj.m6763a(C1395aj.m6763a(f5029b.m7330d(), (Iterable<? extends T>) uVar.mo8082b("List", "sort(Ljava/util/Comparator;)V")), (Iterable<? extends T>) uVar.mo8079a("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), (Iterable<? extends T>) uVar.mo8079a("Double", "isInfinite()Z", "isNaN()Z")), (Iterable<? extends T>) uVar.mo8079a("Float", "isInfinite()Z", "isNaN()Z")), (Iterable<? extends T>) uVar.mo8079a("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        C2150u uVar2 = C2150u.f6453a;
        f5032m = C1395aj.m6763a(C1395aj.m6763a(C1395aj.m6763a(C1395aj.m6763a(C1395aj.m6763a(C1395aj.m6763a((Set<? extends T>) uVar2.mo8079a("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (Iterable<? extends T>) uVar2.mo8082b("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (Iterable<? extends T>) uVar2.mo8079a("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), (Iterable<? extends T>) uVar2.mo8079a("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), (Iterable<? extends T>) uVar2.mo8082b("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), (Iterable<? extends T>) uVar2.mo8082b("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), (Iterable<? extends T>) uVar2.mo8082b("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        C2150u uVar3 = C2150u.f6453a;
        f5033n = C1395aj.m6763a(C1395aj.m6763a((Set<? extends T>) uVar3.mo8082b("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), (Iterable<? extends T>) uVar3.mo8082b("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), (Iterable<? extends T>) uVar3.mo8082b("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        C2150u uVar4 = C2150u.f6453a;
        Set b = f5029b.m7331e();
        String[] a = uVar4.mo8080a("D");
        Set a2 = C1395aj.m6763a(b, (Iterable<? extends T>) uVar4.mo8079a("Float", (String[]) Arrays.copyOf(a, a.length)));
        String[] a3 = uVar4.mo8080a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f5034o = C1395aj.m6763a(a2, (Iterable<? extends T>) uVar4.mo8079a("String", (String[]) Arrays.copyOf(a3, a3.length)));
        C2150u uVar5 = C2150u.f6453a;
        String[] a4 = uVar5.mo8080a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f5035p = uVar5.mo8079a("Throwable", (String[]) Arrays.copyOf(a4, a4.length));
    }
}
