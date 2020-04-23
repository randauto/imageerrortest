package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c;

import java.util.List;
import p073b.C1521h;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1681ac;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1973m.C1974a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1908h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2005t;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2690a;

/* renamed from: b.h.b.a.b.d.a.c.g */
/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class C1965g implements C1681ac {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1967h f5912a;

    /* renamed from: b */
    private final C2690a<C2355b, C1908h> f5913b = this.f5912a.mo7803c().mo9796b();

    /* renamed from: b.h.b.a.b.d.a.c.g$a */
    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    static final class C1966a extends C1490k implements C1449a<C1908h> {

        /* renamed from: a */
        final /* synthetic */ C1965g f5914a;

        /* renamed from: b */
        final /* synthetic */ C2005t f5915b;

        C1966a(C1965g gVar, C2005t tVar) {
            this.f5914a = gVar;
            this.f5915b = tVar;
            super(0);
        }

        /* renamed from: b */
        public final C1908h mo6823a() {
            C1967h a = this.f5914a.f5912a;
            C2005t tVar = this.f5915b;
            C1489j.m6969a((Object) tVar, "jPackage");
            return new C1908h(a, tVar);
        }
    }

    public C1965g(C1941b bVar) {
        C1489j.m6972b(bVar, "components");
        this.f5912a = new C1967h(bVar, C1974a.f5931a, C1521h.m14825a(null));
    }

    /* renamed from: b */
    private final C1908h m9048b(C2355b bVar) {
        C2005t a = this.f5912a.mo7805e().mo7745b().mo6993a(bVar);
        if (a != null) {
            return (C1908h) this.f5913b.mo9789a(bVar, new C1966a(this, a));
        }
        return null;
    }

    /* renamed from: a */
    public List<C1908h> mo7286a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C1415k.m6838b(m9048b(bVar));
    }

    /* renamed from: b */
    public List<C2355b> mo7285a(C2355b bVar, C1450b<? super C2360f, Boolean> bVar2) {
        C1489j.m6972b(bVar, "fqName");
        C1489j.m6972b(bVar2, "nameFilter");
        C1908h b = m9048b(bVar);
        List<C2355b> g = b != null ? b.mo7695g() : null;
        return g != null ? g : C1415k.m6837a();
    }
}
