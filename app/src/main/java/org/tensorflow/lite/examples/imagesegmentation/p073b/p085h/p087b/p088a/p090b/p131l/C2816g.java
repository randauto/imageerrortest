package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.C3232z;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2727k;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2728l;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.l.g */
/* compiled from: SpecialTypes.kt */
public final class C2816g extends C2819i implements C2815f {

    /* renamed from: a */
    public static final C2817a f8087a = new C2817a(null);

    /* renamed from: b */
    private final C2755ad f8088b;

    /* renamed from: b.h.b.a.b.l.g$a */
    /* compiled from: SpecialTypes.kt */
    public static final class C2817a {
        private C2817a() {
        }

        public /* synthetic */ C2817a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2816g mo9933a(C2788az azVar) {
            C1489j.m6972b(azVar, "type");
            if (azVar instanceof C2816g) {
                return (C2816g) azVar;
            }
            if (!mo9934b(azVar)) {
                return null;
            }
            if (azVar instanceof C2834q) {
                C2834q qVar = (C2834q) azVar;
                boolean a = C1489j.m6971a((Object) qVar.mo9945f().mo9507g(), (Object) qVar.mo9946h().mo9507g());
                if (C3232z.f8648a && !a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DefinitelyNotNullType for flexible type (");
                    sb.append(azVar);
                    sb.append(") can be created only from type variable with the same constructor for bounds");
                    throw new AssertionError(sb.toString());
                }
            }
            return new C2816g(C2838t.m13860c(azVar), null);
        }

        /* renamed from: b */
        public final boolean mo9934b(C2788az azVar) {
            C1489j.m6972b(azVar, "type");
            return C2803a.m13677a(azVar) && !C2728l.f7975a.mo9840a(azVar);
        }
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return false;
    }

    private C2816g(C2755ad adVar) {
        this.f8088b = adVar;
    }

    public /* synthetic */ C2816g(C2755ad adVar, C1486g gVar) {
        this(adVar);
    }

    /* renamed from: e */
    public final C2755ad mo9932e() {
        return this.f8088b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2755ad mo7898d() {
        return this.f8088b;
    }

    /* renamed from: I_ */
    public boolean mo7892I_() {
        return (mo7898d().mo9507g() instanceof C2727k) || (mo7898d().mo9507g().mo7096d() instanceof C1700ar);
    }

    /* renamed from: a_ */
    public C2841w mo7895a_(C2841w wVar) {
        C1489j.m6972b(wVar, "replacement");
        return C2758ag.m13479a(wVar.mo9892l());
    }

    /* renamed from: a */
    public C2816g mo7896c(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return new C2816g(mo7898d().mo7896c(hVar));
    }

    /* renamed from: a */
    public C2755ad mo7789b(boolean z) {
        return z ? mo7898d().mo7894a(z) : this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo7898d());
        sb.append("!!");
        return sb.toString();
    }
}
