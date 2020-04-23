package p073b.p085h.p087b.p088a.p090b.p136m;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p136m.C2849b.C2850a;

/* renamed from: b.h.b.a.b.m.l */
/* compiled from: modifierChecks.kt */
public abstract class C2880l implements C2849b {

    /* renamed from: a */
    private final String f8202a;

    /* renamed from: b.h.b.a.b.m.l$a */
    /* compiled from: modifierChecks.kt */
    public static final class C2881a extends C2880l {

        /* renamed from: a */
        private final int f8203a;

        public C2881a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? "s" : "");
            super(sb.toString(), null);
            this.f8203a = i;
        }

        /* renamed from: a */
        public boolean mo9962a(C1813t tVar) {
            C1489j.m6972b(tVar, "functionDescriptor");
            return tVar.mo7236i().size() >= this.f8203a;
        }
    }

    /* renamed from: b.h.b.a.b.m.l$b */
    /* compiled from: modifierChecks.kt */
    public static final class C2882b extends C2880l {

        /* renamed from: a */
        private final int f8204a;

        public C2882b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("must have exactly ");
            sb.append(i);
            sb.append(" value parameters");
            super(sb.toString(), null);
            this.f8204a = i;
        }

        /* renamed from: a */
        public boolean mo9962a(C1813t tVar) {
            C1489j.m6972b(tVar, "functionDescriptor");
            return tVar.mo7236i().size() == this.f8204a;
        }
    }

    /* renamed from: b.h.b.a.b.m.l$c */
    /* compiled from: modifierChecks.kt */
    public static final class C2883c extends C2880l {

        /* renamed from: a */
        public static final C2883c f8205a = new C2883c();

        private C2883c() {
            super("must have no value parameters", null);
        }

        /* renamed from: a */
        public boolean mo9962a(C1813t tVar) {
            C1489j.m6972b(tVar, "functionDescriptor");
            return tVar.mo7236i().isEmpty();
        }
    }

    /* renamed from: b.h.b.a.b.m.l$d */
    /* compiled from: modifierChecks.kt */
    public static final class C2884d extends C2880l {

        /* renamed from: a */
        public static final C2884d f8206a = new C2884d();

        private C2884d() {
            super("must have a single value parameter", null);
        }

        /* renamed from: a */
        public boolean mo9962a(C1813t tVar) {
            C1489j.m6972b(tVar, "functionDescriptor");
            return tVar.mo7236i().size() == 1;
        }
    }

    private C2880l(String str) {
        this.f8202a = str;
    }

    public /* synthetic */ C2880l(String str, C1486g gVar) {
        this(str);
    }

    /* renamed from: a */
    public String mo9961a() {
        return this.f8202a;
    }

    /* renamed from: b */
    public String mo9963b(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        return C2850a.m13900a(this, tVar);
    }
}
