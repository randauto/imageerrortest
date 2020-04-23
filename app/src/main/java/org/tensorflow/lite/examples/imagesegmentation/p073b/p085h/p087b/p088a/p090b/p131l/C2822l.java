package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;

/* renamed from: b.h.b.a.b.l.l */
/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
public final class C2822l extends C2774as {

    /* renamed from: a */
    public static final C2823a f8091a = new C2823a(null);

    /* renamed from: b */
    private final C2774as f8092b;

    /* renamed from: c */
    private final C2774as f8093c;

    /* renamed from: b.h.b.a.b.l.l$a */
    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class C2823a {
        private C2823a() {
        }

        public /* synthetic */ C2823a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2774as mo9936a(C2774as asVar, C2774as asVar2) {
            C1489j.m6972b(asVar, "first");
            C1489j.m6972b(asVar2, "second");
            if (asVar.mo7781a()) {
                return asVar2;
            }
            if (asVar2.mo7781a()) {
                return asVar;
            }
            return new C2822l(asVar, asVar2, null);
        }
    }

    /* renamed from: a */
    public static final C2774as m13750a(C2774as asVar, C2774as asVar2) {
        return f8091a.mo9936a(asVar, asVar2);
    }

    /* renamed from: a */
    public boolean mo7781a() {
        return false;
    }

    public /* synthetic */ C2822l(C2774as asVar, C2774as asVar2, C1486g gVar) {
        this(asVar, asVar2);
    }

    private C2822l(C2774as asVar, C2774as asVar2) {
        this.f8092b = asVar;
        this.f8093c = asVar2;
    }

    /* renamed from: b */
    public C2771ap mo7782b(C2841w wVar) {
        C1489j.m6972b(wVar, "key");
        C2771ap b = this.f8092b.mo7782b(wVar);
        return b != null ? b : this.f8093c.mo7782b(wVar);
    }

    /* renamed from: a */
    public C2841w mo9880a(C2841w wVar, C2792ba baVar) {
        C1489j.m6972b(wVar, "topLevelType");
        C1489j.m6972b(baVar, "position");
        return this.f8093c.mo9880a(this.f8092b.mo9880a(wVar, baVar), baVar);
    }

    /* renamed from: c */
    public boolean mo9875c() {
        return this.f8092b.mo9875c() || this.f8093c.mo9875c();
    }

    /* renamed from: b */
    public boolean mo9515b() {
        return this.f8092b.mo9515b() || this.f8093c.mo9515b();
    }

    /* renamed from: a */
    public C1659h mo9879a(C1659h hVar) {
        C1489j.m6972b(hVar, "annotations");
        return this.f8093c.mo9879a(this.f8092b.mo9879a(hVar));
    }
}
