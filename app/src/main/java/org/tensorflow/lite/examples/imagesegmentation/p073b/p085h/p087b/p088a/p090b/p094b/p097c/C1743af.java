package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.List;
import p073b.C3227u;
import p073b.C3232z;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1699aq;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2711g;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2758ag;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.c.af */
/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class C1743af extends C1775o implements C1742ae {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5381a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1743af.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: b */
    public static final C1744a f5382b = new C1744a(null);

    /* renamed from: d */
    private final C2711g f5383d;

    /* renamed from: e */
    private C1795d f5384e;

    /* renamed from: f */
    private final C2713i f5385f;

    /* renamed from: g */
    private final C1699aq f5386g;

    /* renamed from: b.h.b.a.b.b.c.af$a */
    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class C1744a {
        private C1744a() {
        }

        public /* synthetic */ C1744a(C1486g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final C2778au m7827a(C1699aq aqVar) {
            if (aqVar.mo7311g() == null) {
                return null;
            }
            return C2778au.m13552a((C2841w) aqVar.mo7310c());
        }

        /* renamed from: a */
        public final C1742ae mo7385a(C2713i iVar, C1699aq aqVar, C1795d dVar) {
            C1699aq aqVar2 = aqVar;
            C1795d dVar2 = dVar;
            C1489j.m6972b(iVar, "storageManager");
            C1489j.m6972b(aqVar2, "typeAliasDescriptor");
            C1489j.m6972b(dVar2, "constructor");
            C2778au a = m7827a(aqVar2);
            C2841w wVar = null;
            if (a == null) {
                return null;
            }
            C1795d a2 = dVar2.mo7419a(a);
            if (a2 == null) {
                return null;
            }
            C1659h x = dVar.mo7086x();
            C1725a n = dVar.mo7344n();
            C1489j.m6969a((Object) n, "constructor.kind");
            C1692am y = aqVar.mo7088y();
            C1489j.m6969a((Object) y, "typeAliasDescriptor.source");
            C1743af afVar = new C1743af(iVar, aqVar, a2, null, x, n, y, null);
            List a3 = C1775o.m8066a(afVar, dVar.mo7236i(), a);
            if (a3 == null) {
                return null;
            }
            C2755ad c = C2838t.m13860c(a2.mo7234g().mo9892l());
            C2755ad A_ = aqVar.mo7346A_();
            C1489j.m6969a((Object) A_, "typeAliasDescriptor.defaultType");
            C2755ad a4 = C2758ag.m13478a(c, A_);
            C1690ak e = dVar.mo7232e();
            if (e != null) {
                C1489j.m6969a((Object) e, "it");
                wVar = a.mo9885a(e.mo7320r(), C2792ba.INVARIANT);
            }
            afVar.mo7367a(wVar, null, aqVar.mo7090z(), a3, a4, C1818w.FINAL, aqVar.mo7077p());
            return afVar;
        }
    }

    /* renamed from: b.h.b.a.b.b.c.af$b */
    /* compiled from: TypeAliasConstructorDescriptor.kt */
    static final class C1745b extends C1490k implements C1449a<C1743af> {

        /* renamed from: a */
        final /* synthetic */ C1743af f5387a;

        /* renamed from: b */
        final /* synthetic */ C1795d f5388b;

        C1745b(C1743af afVar, C1795d dVar) {
            this.f5387a = afVar;
            this.f5388b = dVar;
            super(0);
        }

        /* renamed from: b */
        public final C1743af mo6823a() {
            C2713i H = this.f5387a.mo7377H();
            C1699aq I = this.f5387a.mo7378I();
            C1795d dVar = this.f5388b;
            C1742ae aeVar = this.f5387a;
            C1659h x = this.f5388b.mo7086x();
            C1725a n = this.f5388b.mo7344n();
            C1489j.m6969a((Object) n, "underlyingConstructorDescriptor.kind");
            C1692am y = this.f5387a.mo7378I().mo7088y();
            C1489j.m6969a((Object) y, "typeAliasDescriptor.source");
            C1743af afVar = new C1743af(H, I, dVar, aeVar, x, n, y, null);
            C2778au a = C1743af.f5382b.m7827a(this.f5387a.mo7378I());
            if (a == null) {
                return null;
            }
            C1690ak e = this.f5388b.mo7232e();
            afVar.mo7367a(null, e != null ? e.mo7302a(a) : null, this.f5387a.mo7378I().mo7090z(), this.f5387a.mo7236i(), this.f5387a.mo7234g(), C1818w.FINAL, this.f5387a.mo7378I().mo7077p());
            return afVar;
        }
    }

    public /* synthetic */ C1743af(C2713i iVar, C1699aq aqVar, C1795d dVar, C1742ae aeVar, C1659h hVar, C1725a aVar, C1692am amVar, C1486g gVar) {
        this(iVar, aqVar, dVar, aeVar, hVar, aVar, amVar);
    }

    /* renamed from: H */
    public final C2713i mo7377H() {
        return this.f5385f;
    }

    /* renamed from: I */
    public C1699aq mo7378I() {
        return this.f5386g;
    }

    private C1743af(C2713i iVar, C1699aq aqVar, C1795d dVar, C1742ae aeVar, C1659h hVar, C1725a aVar, C1692am amVar) {
        super(aqVar, aeVar, hVar, C2360f.m11703c("<init>"), aVar, amVar);
        this.f5385f = iVar;
        this.f5386g = aqVar;
        mo7465g(mo7378I().mo7084v());
        this.f5383d = this.f5385f.mo9799b((C1449a<? extends T>) new C1745b<Object>(this, dVar));
        this.f5384e = dVar;
    }

    /* renamed from: a */
    private void m7804a(C1795d dVar) {
        this.f5384e = dVar;
    }

    /* renamed from: o */
    public C1795d mo7371o() {
        return this.f5384e;
    }

    /* renamed from: E */
    public C1699aq mo7384q() {
        return mo7378I();
    }

    /* renamed from: g */
    public C2841w mo7234g() {
        C2841w g = super.mo7234g();
        if (g == null) {
            C1489j.m6968a();
        }
        return g;
    }

    /* renamed from: F */
    public C1742ae mo7365r() {
        C1813t r = super.mo7343l();
        if (r != null) {
            return (C1742ae) r;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* renamed from: a */
    public C1742ae mo7307d(C2778au auVar) {
        C1489j.m6972b(auVar, "substitutor");
        C1813t c = super.mo7307d(auVar);
        if (c != null) {
            C1743af afVar = (C1743af) c;
            C2778au a = C2778au.m13552a(afVar.mo7234g());
            C1795d o = mo7371o().mo7371o();
            C1489j.m6969a((Object) a, "underlyingConstructorSubstitutor");
            C1795d a2 = o.mo7419a(a);
            if (a2 == null) {
                return null;
            }
            afVar.m7804a(a2);
            return afVar;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
    }

    /* renamed from: b */
    public C1742ae mo7370c(C1804m mVar, C1818w wVar, C1723az azVar, C1725a aVar, boolean z) {
        C1489j.m6972b(mVar, "newOwner");
        C1489j.m6972b(wVar, "modality");
        C1489j.m6972b(azVar, "visibility");
        C1489j.m6972b(aVar, "kind");
        C1813t f = mo7304D().mo7479a(mVar).mo7480a(wVar).mo7477a(azVar).mo7478a(aVar).mo7485a(z).mo7505f();
        if (f != null) {
            return (C1742ae) f;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1743af mo7106a(C1804m mVar, C1813t tVar, C1725a aVar, C2360f fVar, C1659h hVar, C1692am amVar) {
        C1489j.m6972b(mVar, "newOwner");
        C1489j.m6972b(aVar, "kind");
        C1489j.m6972b(hVar, "annotations");
        C1489j.m6972b(amVar, "source");
        boolean z = false;
        boolean z2 = aVar == C1725a.DECLARATION || aVar == C1725a.SYNTHESIZED;
        if (!C3232z.f8648a || z2) {
            if (fVar == null) {
                z = true;
            }
            if (!C3232z.f8648a || z) {
                C1743af afVar = new C1743af(this.f5385f, mo7378I(), mo7371o(), this, hVar, C1725a.DECLARATION, amVar);
                return afVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Renaming type alias constructor: ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creating a type alias constructor that is not a declaration: \ncopy from: ");
        sb2.append(this);
        sb2.append("\nnewOwner: ");
        sb2.append(mVar);
        sb2.append("\nkind: ");
        sb2.append(aVar);
        throw new AssertionError(sb2.toString());
    }
}
