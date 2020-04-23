package p073b.p085h.p087b.p088a.p090b.p139n;

import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.n.h */
/* compiled from: Jsr305State.kt */
public enum C2906h {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    

    /* renamed from: d */
    public static final C2907a f8238d = null;

    /* renamed from: f */
    private final String f8240f;

    /* renamed from: b.h.b.a.b.n.h$a */
    /* compiled from: Jsr305State.kt */
    public static final class C2907a {
        private C2907a() {
        }

        public /* synthetic */ C2907a(C1486g gVar) {
            this();
        }
    }

    protected C2906h(String str) {
        C1489j.m6972b(str, "description");
        this.f8240f = str;
    }

    /* renamed from: c */
    public final String mo10001c() {
        return this.f8240f;
    }

    static {
        f8238d = new C2907a(null);
    }

    /* renamed from: a */
    public final boolean mo9999a() {
        return this == WARN;
    }

    /* renamed from: b */
    public final boolean mo10000b() {
        return this == IGNORE;
    }
}
