package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.C3219n;
import p073b.C3232z;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p085h.p087b.p088a.p090b.p118h.C2469h;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2717c;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.l.r */
/* compiled from: flexibleTypes.kt */
public final class C2835r extends C2834q implements C2815f {

    /* renamed from: a */
    public static boolean f8113a;

    /* renamed from: b */
    public static final C2836a f8114b = new C2836a(null);

    /* renamed from: c */
    private boolean f8115c;

    /* renamed from: b.h.b.a.b.l.r$a */
    /* compiled from: flexibleTypes.kt */
    public static final class C2836a {
        private C2836a() {
        }

        public /* synthetic */ C2836a(C1486g gVar) {
            this();
        }
    }

    public C2835r(C2755ad adVar, C2755ad adVar2) {
        C1489j.m6972b(adVar, "lowerBound");
        C1489j.m6972b(adVar2, "upperBound");
        super(adVar, adVar2);
    }

    /* renamed from: i */
    private final void m13844i() {
        if (f8113a && !this.f8115c) {
            this.f8115c = true;
            boolean z = !C2838t.m13858a(mo9945f());
            if (!C3232z.f8648a || z) {
                boolean z2 = !C2838t.m13858a(mo9946h());
                if (!C3232z.f8648a || z2) {
                    boolean a = true ^ C1489j.m6971a((Object) mo9945f(), (Object) mo9946h());
                    if (!C3232z.f8648a || a) {
                        boolean a2 = C2717c.f7961a.mo9823a(mo9945f(), mo9946h());
                        if (C3232z.f8648a && !a2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Lower bound ");
                            sb.append(mo9945f());
                            sb.append(" of a flexible type must be a subtype of the upper bound ");
                            sb.append(mo9946h());
                            throw new AssertionError(sb.toString());
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Lower and upper bounds are equal: ");
                    sb2.append(mo9945f());
                    sb2.append(" == ");
                    sb2.append(mo9946h());
                    throw new AssertionError(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Upper bound of a flexible type can not be flexible: ");
                sb3.append(mo9946h());
                throw new AssertionError(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Lower bound of a flexible type can not be flexible: ");
            sb4.append(mo9945f());
            throw new AssertionError(sb4.toString());
        }
    }

    /* renamed from: H_ */
    public C2755ad mo7783H_() {
        m13844i();
        return mo9945f();
    }

    /* renamed from: I_ */
    public boolean mo7892I_() {
        return (mo9945f().mo9507g().mo7096d() instanceof C1700ar) && C1489j.m6971a((Object) mo9945f().mo9507g(), (Object) mo9946h().mo9507g());
    }

    /* renamed from: a_ */
    public C2841w mo7895a_(C2841w wVar) {
        C2788az azVar;
        C1489j.m6972b(wVar, "replacement");
        C2788az l = wVar.mo9892l();
        if (l instanceof C2834q) {
            azVar = l;
        } else if (l instanceof C2755ad) {
            C2755ad adVar = (C2755ad) l;
            azVar = C2842x.m13883a(adVar, adVar.mo7894a(true));
        } else {
            throw new C3219n();
        }
        return C2786ax.m13593a(azVar, l);
    }

    /* renamed from: b */
    public C2788az mo7788b(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return C2842x.m13883a(mo9945f().mo7896c(hVar), mo9946h().mo7896c(hVar));
    }

    /* renamed from: a */
    public String mo7786a(C2443c cVar, C2469h hVar) {
        C1489j.m6972b(cVar, "renderer");
        C1489j.m6972b(hVar, "options");
        if (!hVar.mo9408h()) {
            return cVar.mo9349a(cVar.mo9348a((C2841w) mo9945f()), cVar.mo9348a((C2841w) mo9946h()), C2803a.m13674a((C2841w) this));
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(cVar.mo9348a((C2841w) mo9945f()));
        sb.append("..");
        sb.append(cVar.mo9348a((C2841w) mo9946h()));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: b */
    public C2788az mo7789b(boolean z) {
        return C2842x.m13883a(mo9945f().mo7894a(z), mo9946h().mo7894a(z));
    }
}
