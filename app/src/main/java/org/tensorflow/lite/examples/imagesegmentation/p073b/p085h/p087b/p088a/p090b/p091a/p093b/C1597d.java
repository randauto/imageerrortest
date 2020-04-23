package p073b.p085h.p087b.p088a.p090b.p091a.p093b;

import java.util.Collection;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1728b;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1763h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.a.b.d */
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class C1597d implements C1728b {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5009a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1597d.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: b */
    public static final C1599a f5010b = new C1599a(null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C2355b f5011f = C1627g.f5071c;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C2360f f5012g = C1627g.f5076h.f5146c.mo9032f();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C2354a f5013h = C2354a.m11661a(C1627g.f5076h.f5146c.mo9028c());

    /* renamed from: c */
    private final C2710f f5014c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1821y f5015d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1450b<C1821y, C1804m> f5016e;

    /* renamed from: b.h.b.a.b.a.b.d$a */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class C1599a {
        private C1599a() {
        }

        public /* synthetic */ C1599a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2354a mo7138a() {
            return C1597d.f5013h;
        }
    }

    /* renamed from: b.h.b.a.b.a.b.d$b */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    static final class C1600b extends C1490k implements C1449a<C1763h> {

        /* renamed from: a */
        final /* synthetic */ C1597d f5018a;

        /* renamed from: b */
        final /* synthetic */ C2713i f5019b;

        C1600b(C1597d dVar, C2713i iVar) {
            this.f5018a = dVar;
            this.f5019b = iVar;
            super(0);
        }

        /* renamed from: b */
        public final C1763h mo6823a() {
            C1763h hVar = new C1763h((C1804m) this.f5018a.f5016e.mo6756a(this.f5018a.f5015d), C1597d.f5012g, C1818w.ABSTRACT, C1797f.INTERFACE, C1415k.m6832a(this.f5018a.f5015d.mo7522a().mo7206s()), C1692am.f5331a, false, this.f5019b);
            hVar.mo7422a(new C1590a(this.f5019b, hVar), C1395aj.m6759a(), null);
            return hVar;
        }
    }

    /* renamed from: d */
    private final C1763h m7279d() {
        return (C1763h) C2712h.m13321a(this.f5014c, (Object) this, f5009a[0]);
    }

    public C1597d(C2713i iVar, C1821y yVar, C1450b<? super C1821y, ? extends C1804m> bVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(yVar, "moduleDescriptor");
        C1489j.m6972b(bVar, "computeContainingDeclaration");
        this.f5015d = yVar;
        this.f5016e = bVar;
        this.f5014c = iVar.mo9793a((C1449a<? extends T>) new C1600b<Object>(this, iVar));
    }

    public /* synthetic */ C1597d(C2713i iVar, C1821y yVar, C1450b bVar, int i, C1486g gVar) {
        if ((i & 4) != 0) {
            bVar = C15981.f5017a;
        }
        this(iVar, yVar, bVar);
    }

    /* renamed from: a */
    public boolean mo7054a(C2355b bVar, C2360f fVar) {
        C1489j.m6972b(bVar, "packageFqName");
        C1489j.m6972b(fVar, "name");
        return C1489j.m6971a((Object) fVar, (Object) f5012g) && C1489j.m6971a((Object) bVar, (Object) f5011f);
    }

    /* renamed from: a */
    public C1796e mo7052a(C2354a aVar) {
        C1489j.m6972b(aVar, "classId");
        if (C1489j.m6971a((Object) aVar, (Object) f5013h)) {
            return m7279d();
        }
        return null;
    }

    /* renamed from: a */
    public Collection<C1796e> mo7053a(C2355b bVar) {
        C1489j.m6972b(bVar, "packageFqName");
        if (C1489j.m6971a((Object) bVar, (Object) f5011f)) {
            return C1395aj.m6758a(m7279d());
        }
        return C1395aj.m6759a();
    }
}
