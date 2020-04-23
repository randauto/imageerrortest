package p073b.p085h.p087b.p088a.p090b.p136m;

import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.m.c */
/* compiled from: modifierChecks.kt */
public abstract class C2852c {

    /* renamed from: a */
    private final boolean f8129a;

    /* renamed from: b.h.b.a.b.m.c$a */
    /* compiled from: modifierChecks.kt */
    public static final class C2853a extends C2852c {

        /* renamed from: a */
        public static final C2853a f8130a = new C2853a();

        private C2853a() {
            super(false, null);
        }
    }

    /* renamed from: b.h.b.a.b.m.c$b */
    /* compiled from: modifierChecks.kt */
    public static final class C2854b extends C2852c {

        /* renamed from: a */
        private final String f8131a;

        public C2854b(String str) {
            C1489j.m6972b(str, "error");
            super(false, null);
            this.f8131a = str;
        }
    }

    /* renamed from: b.h.b.a.b.m.c$c */
    /* compiled from: modifierChecks.kt */
    public static final class C2855c extends C2852c {

        /* renamed from: a */
        public static final C2855c f8132a = new C2855c();

        private C2855c() {
            super(true, null);
        }
    }

    private C2852c(boolean z) {
        this.f8129a = z;
    }

    public /* synthetic */ C2852c(boolean z, C1486g gVar) {
        this(z);
    }

    /* renamed from: a */
    public final boolean mo9964a() {
        return this.f8129a;
    }
}
