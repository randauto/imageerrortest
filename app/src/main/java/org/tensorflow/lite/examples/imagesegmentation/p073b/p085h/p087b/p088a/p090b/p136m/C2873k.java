package p073b.p085h.p087b.p088a.p090b.p136m;

import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p136m.C2849b.C2850a;

/* renamed from: b.h.b.a.b.m.k */
/* compiled from: modifierChecks.kt */
public abstract class C2873k implements C2849b {

    /* renamed from: a */
    private final String f8193a;

    /* renamed from: b */
    private final String f8194b;

    /* renamed from: c */
    private final C1450b<C1627g, C2841w> f8195c;

    /* renamed from: b.h.b.a.b.m.k$a */
    /* compiled from: modifierChecks.kt */
    public static final class C2874a extends C2873k {

        /* renamed from: a */
        public static final C2874a f8196a = new C2874a();

        private C2874a() {
            super("Boolean", C28751.f8197a, null);
        }
    }

    /* renamed from: b.h.b.a.b.m.k$b */
    /* compiled from: modifierChecks.kt */
    public static final class C2876b extends C2873k {

        /* renamed from: a */
        public static final C2876b f8198a = new C2876b();

        private C2876b() {
            super("Int", C28771.f8199a, null);
        }
    }

    /* renamed from: b.h.b.a.b.m.k$c */
    /* compiled from: modifierChecks.kt */
    public static final class C2878c extends C2873k {

        /* renamed from: a */
        public static final C2878c f8200a = new C2878c();

        private C2878c() {
            super("Unit", C28791.f8201a, null);
        }
    }

    private C2873k(String str, C1450b<? super C1627g, ? extends C2841w> bVar) {
        this.f8194b = str;
        this.f8195c = bVar;
        StringBuilder sb = new StringBuilder();
        sb.append("must return ");
        sb.append(this.f8194b);
        this.f8193a = sb.toString();
    }

    public /* synthetic */ C2873k(String str, C1450b bVar, C1486g gVar) {
        this(str, bVar);
    }

    /* renamed from: b */
    public String mo9963b(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        return C2850a.m13900a(this, tVar);
    }

    /* renamed from: a */
    public String mo9961a() {
        return this.f8193a;
    }

    /* renamed from: a */
    public boolean mo9962a(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        return C1489j.m6971a((Object) tVar.mo7234g(), (Object) (C2841w) this.f8195c.mo6756a(C2524a.m12627d(tVar)));
    }
}
