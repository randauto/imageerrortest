package p073b.p085h.p087b.p088a.p090b.p136m;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p136m.C2849b.C2850a;

/* renamed from: b.h.b.a.b.m.f */
/* compiled from: modifierChecks.kt */
public abstract class C2861f implements C2849b {

    /* renamed from: a */
    private final String f8143a;

    /* renamed from: b.h.b.a.b.m.f$a */
    /* compiled from: modifierChecks.kt */
    public static final class C2862a extends C2861f {

        /* renamed from: a */
        public static final C2862a f8144a = new C2862a();

        private C2862a() {
            super("must be a member function", null);
        }

        /* renamed from: a */
        public boolean mo9962a(C1813t tVar) {
            C1489j.m6972b(tVar, "functionDescriptor");
            return tVar.mo7232e() != null;
        }
    }

    /* renamed from: b.h.b.a.b.m.f$b */
    /* compiled from: modifierChecks.kt */
    public static final class C2863b extends C2861f {

        /* renamed from: a */
        public static final C2863b f8145a = new C2863b();

        private C2863b() {
            super("must be a member or an extension function", null);
        }

        /* renamed from: a */
        public boolean mo9962a(C1813t tVar) {
            C1489j.m6972b(tVar, "functionDescriptor");
            return (tVar.mo7232e() == null && tVar.mo7231d() == null) ? false : true;
        }
    }

    private C2861f(String str) {
        this.f8143a = str;
    }

    public /* synthetic */ C2861f(String str, C1486g gVar) {
        this(str);
    }

    /* renamed from: a */
    public String mo9961a() {
        return this.f8143a;
    }

    /* renamed from: b */
    public String mo9963b(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        return C2850a.m13900a(this, tVar);
    }
}
