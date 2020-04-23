package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import java.util.List;
import java.util.Set;
import p073b.C3221p;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.p111a.C2105a;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.p111a.C2105a.C2106a;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2256s;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2278a;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2319g;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2321h;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2324j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p117g.C2395k;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2648e;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2657i;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2666o;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2625f;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2637i;

/* renamed from: b.h.b.a.b.d.b.e */
/* compiled from: DeserializedDescriptorResolver.kt */
public final class C2123e {

    /* renamed from: b */
    public static final C2124a f6425b = new C2124a(null);

    /* renamed from: c */
    private static final Set<C2106a> f6426c = C1395aj.m6758a(C2106a.CLASS);

    /* renamed from: d */
    private static final Set<C2106a> f6427d = C1395aj.m6761a((T[]) new C2106a[]{C2106a.FILE_FACADE, C2106a.MULTIFILE_CLASS_PART});

    /* renamed from: e */
    private static final C2319g f6428e = new C2319g(1, 1, 2);

    /* renamed from: a */
    public C2657i f6429a;

    /* renamed from: b.h.b.a.b.d.b.e$a */
    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class C2124a {
        private C2124a() {
        }

        public /* synthetic */ C2124a(C1486g gVar) {
            this();
        }
    }

    /* renamed from: b.h.b.a.b.d.b.e$b */
    /* compiled from: DeserializedDescriptorResolver.kt */
    static final class C2125b extends C1490k implements C1449a<List<? extends C2360f>> {

        /* renamed from: a */
        public static final C2125b f6430a = new C2125b();

        C2125b() {
            super(0);
        }

        /* renamed from: b */
        public final List<C2360f> mo6823a() {
            return C1415k.m6837a();
        }
    }

    /* renamed from: a */
    public final C2657i mo8030a() {
        C2657i iVar = this.f6429a;
        if (iVar == null) {
            C1489j.m6973b("components");
        }
        return iVar;
    }

    /* renamed from: a */
    public final void mo8031a(C2122d dVar) {
        C1489j.m6972b(dVar, "components");
        this.f6429a = dVar.mo8027a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m9503b() {
        C2657i iVar = this.f6429a;
        if (iVar == null) {
            C1489j.m6973b("components");
        }
        return iVar.mo9719d().mo9733a();
    }

    /* renamed from: a */
    public final C1796e mo8028a(C2137n nVar) {
        C1489j.m6972b(nVar, "kotlinClass");
        C2648e b = mo8033b(nVar);
        if (b == null) {
            return null;
        }
        C2657i iVar = this.f6429a;
        if (iVar == null) {
            C1489j.m6973b("components");
        }
        return iVar.mo9715a().mo9706a(nVar.mo6998b(), b);
    }

    /* renamed from: b */
    public final C2648e mo8033b(C2137n nVar) {
        C3221p pVar;
        C1489j.m6972b(nVar, "kotlinClass");
        String[] a = mo8032a(nVar, f6426c);
        if (a == null) {
            return null;
        }
        String[] h = nVar.mo7000d().mo8011h();
        if (h == null) {
            return null;
        }
        try {
            pVar = C2324j.m11391a(a, h);
        } catch (C2395k e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not read data from ");
            sb.append(nVar.mo6995a());
            throw new IllegalStateException(sb.toString(), e);
        } catch (Throwable th) {
            if (m9503b() || nVar.mo7000d().mo8008e().mo8893d()) {
                throw th;
            }
            pVar = null;
        }
        if (pVar == null) {
            return null;
        }
        return new C2648e((C2321h) pVar.mo10389c(), (C2216c) pVar.mo10390d(), nVar.mo7000d().mo8008e(), new C2144p(nVar, m9504c(nVar), m9505d(nVar)));
    }

    /* renamed from: a */
    public final C2560h mo8029a(C1680ab abVar, C2137n nVar) {
        C3221p pVar;
        C1489j.m6972b(abVar, "descriptor");
        C1489j.m6972b(nVar, "kotlinClass");
        String[] a = mo8032a(nVar, f6427d);
        if (a == null) {
            return null;
        }
        String[] h = nVar.mo7000d().mo8011h();
        if (h == null) {
            return null;
        }
        try {
            pVar = C2324j.m11395b(a, h);
        } catch (C2395k e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not read data from ");
            sb.append(nVar.mo6995a());
            throw new IllegalStateException(sb.toString(), e);
        } catch (Throwable th) {
            if (m9503b() || nVar.mo7000d().mo8008e().mo8893d()) {
                throw th;
            }
            pVar = null;
        }
        if (pVar == null) {
            return null;
        }
        C2321h hVar = (C2321h) pVar.mo10389c();
        C2256s sVar = (C2256s) pVar.mo10390d();
        C2285c cVar = hVar;
        C2129i iVar = new C2129i(nVar, sVar, cVar, m9504c(nVar), m9505d(nVar));
        C2278a e2 = nVar.mo7000d().mo8008e();
        C2625f fVar = iVar;
        C2657i iVar2 = this.f6429a;
        if (iVar2 == null) {
            C1489j.m6973b("components");
        }
        C2637i iVar3 = new C2637i(abVar, sVar, cVar, e2, fVar, iVar2, C2125b.f6430a);
        return iVar3;
    }

    /* renamed from: c */
    private final C2666o<C2319g> m9504c(C2137n nVar) {
        if (m9503b() || nVar.mo7000d().mo8008e().mo8893d()) {
            return null;
        }
        return new C2666o<>(nVar.mo7000d().mo8008e(), C2319g.f7107b, nVar.mo6995a(), nVar.mo6998b());
    }

    /* renamed from: d */
    private final boolean m9505d(C2137n nVar) {
        C2657i iVar = this.f6429a;
        if (iVar == null) {
            C1489j.m6973b("components");
        }
        return iVar.mo9719d().mo9734b() && (nVar.mo7000d().mo8006c() || C1489j.m6971a((Object) nVar.mo7000d().mo8008e(), (Object) f6428e));
    }

    /* renamed from: a */
    public final String[] mo8032a(C2137n nVar, Set<? extends C2106a> set) {
        C1489j.m6972b(nVar, "kotlinClass");
        C1489j.m6972b(set, "expectedKinds");
        C2105a d = nVar.mo7000d();
        String[] f = d.mo8009f();
        if (f == null) {
            f = d.mo8010g();
        }
        if (f == null || !set.contains(d.mo8007d())) {
            return null;
        }
        return f;
    }
}
