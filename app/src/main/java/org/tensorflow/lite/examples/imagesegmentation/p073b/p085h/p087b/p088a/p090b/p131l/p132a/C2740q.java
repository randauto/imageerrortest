package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2766am;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;

/* renamed from: b.h.b.a.b.l.a.q */
/* compiled from: TypeCheckingProcedure */
public class C2740q {

    /* renamed from: a */
    static final /* synthetic */ boolean f7998a = (!C2740q.class.desiredAssertionStatus());

    /* renamed from: b */
    private final C2743r f7999b;

    /* renamed from: b.h.b.a.b.l.a.q$a */
    /* compiled from: TypeCheckingProcedure */
    public enum C2742a {
        IN,
        OUT,
        INV,
        STAR;

        /* renamed from: a */
        public static C2742a m13435a(C2792ba baVar) {
            switch (baVar) {
                case INVARIANT:
                    return INV;
                case IN_VARIANCE:
                    return IN;
                case OUT_VARIANCE:
                    return OUT;
                default:
                    throw new IllegalStateException("Unknown variance");
            }
        }
    }

    /* renamed from: a */
    public static C2841w m13425a(C2841w wVar, C2841w wVar2) {
        return m13426a(wVar, wVar2, (C2743r) new C2739p());
    }

    /* renamed from: a */
    public static C2841w m13426a(C2841w wVar, C2841w wVar2, C2743r rVar) {
        return C2750t.m13452a(wVar, wVar2, rVar);
    }

    /* renamed from: b */
    private static C2841w m13428b(C1700ar arVar, C2771ap apVar) {
        return apVar.mo9868b() == C2792ba.IN_VARIANCE || arVar.mo7316k() == C2792ba.IN_VARIANCE ? C2524a.m12627d(arVar).mo7207t() : apVar.mo9869c();
    }

    /* renamed from: c */
    private static C2841w m13429c(C1700ar arVar, C2771ap apVar) {
        return apVar.mo9868b() == C2792ba.OUT_VARIANCE || arVar.mo7316k() == C2792ba.OUT_VARIANCE ? C2524a.m12627d(arVar).mo7204q() : apVar.mo9869c();
    }

    public C2740q(C2743r rVar) {
        this.f7999b = rVar;
    }

    /* renamed from: b */
    public boolean mo9857b(C2841w wVar, C2841w wVar2) {
        boolean z = true;
        if (wVar == wVar2) {
            return true;
        }
        if (C2838t.m13858a(wVar)) {
            if (!C2838t.m13858a(wVar2)) {
                return mo9858c(wVar2, wVar);
            }
            if (C2843y.m13884a(wVar) || C2843y.m13884a(wVar2) || !mo9859d(wVar, wVar2) || !mo9859d(wVar2, wVar)) {
                z = false;
            }
            return z;
        } else if (C2838t.m13858a(wVar2)) {
            return mo9858c(wVar, wVar2);
        } else {
            if (wVar.mo7897c() != wVar2.mo7897c()) {
                return false;
            }
            if (wVar.mo7897c()) {
                return this.f7999b.mo9855a(C2783av.m13578d(wVar), C2783av.m13578d(wVar2), this);
            }
            C2767an g = wVar.mo9507g();
            C2767an g2 = wVar2.mo9507g();
            if (!this.f7999b.mo9825a(g, g2)) {
                return false;
            }
            List a = wVar.mo9501a();
            List a2 = wVar2.mo9501a();
            if (a.size() != a2.size()) {
                return false;
            }
            for (int i = 0; i < a.size(); i++) {
                C2771ap apVar = (C2771ap) a.get(i);
                C2771ap apVar2 = (C2771ap) a2.get(i);
                if (!apVar.mo9867a() || !apVar2.mo9867a()) {
                    C1700ar arVar = (C1700ar) g.mo7094b().get(i);
                    C1700ar arVar2 = (C1700ar) g2.mo7094b().get(i);
                    if (!m13427a(apVar, apVar2, arVar) && (m13424a(arVar, apVar) != m13424a(arVar2, apVar2) || !this.f7999b.mo9855a(apVar.mo9869c(), apVar2.mo9869c(), this))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo9858c(C2841w wVar, C2841w wVar2) {
        if (f7998a || !C2838t.m13858a(wVar)) {
            return mo9859d(C2838t.m13859b(wVar2).mo9945f(), wVar) && mo9859d(wVar, C2838t.m13859b(wVar2).mo9946h());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Only inflexible types are allowed here: ");
        sb.append(wVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public static C2742a m13424a(C1700ar arVar, C2771ap apVar) {
        C2792ba k = arVar.mo7316k();
        C2792ba b = apVar.mo9868b();
        if (b == C2792ba.INVARIANT) {
            C2792ba baVar = b;
            b = k;
            k = baVar;
        }
        if (k == C2792ba.IN_VARIANCE && b == C2792ba.OUT_VARIANCE) {
            return C2742a.STAR;
        }
        if (k == C2792ba.OUT_VARIANCE && b == C2792ba.IN_VARIANCE) {
            return C2742a.STAR;
        }
        return C2742a.m13435a(b);
    }

    /* renamed from: d */
    public boolean mo9859d(C2841w wVar, C2841w wVar2) {
        if (C2766am.m13507a(wVar, wVar2)) {
            return !wVar.mo7897c() || wVar2.mo7897c();
        }
        C2841w c = C2766am.m13509c(wVar);
        C2841w d = C2766am.m13510d(wVar2);
        if (c == wVar && d == wVar2) {
            return m13430e(wVar, wVar2);
        }
        return mo9859d(c, d);
    }

    /* renamed from: e */
    private boolean m13430e(C2841w wVar, C2841w wVar2) {
        if (C2843y.m13884a(wVar) || C2843y.m13884a(wVar2)) {
            return true;
        }
        if (!wVar2.mo7897c() && wVar.mo7897c()) {
            return false;
        }
        if (C1627g.m7430r(wVar)) {
            return true;
        }
        C2841w a = m13426a(wVar, wVar2, this.f7999b);
        if (a == null) {
            return this.f7999b.mo9854a(wVar, wVar2);
        }
        if (wVar2.mo7897c() || !a.mo7897c()) {
            return m13431f(a, wVar2);
        }
        return false;
    }

    /* renamed from: f */
    private boolean m13431f(C2841w wVar, C2841w wVar2) {
        C2767an g = wVar.mo9507g();
        List a = wVar.mo9501a();
        List a2 = wVar2.mo9501a();
        if (a.size() != a2.size()) {
            return false;
        }
        List b = g.mo7094b();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= b.size()) {
                return true;
            }
            C1700ar arVar = (C1700ar) b.get(i);
            C2771ap apVar = (C2771ap) a2.get(i);
            C2771ap apVar2 = (C2771ap) a.get(i);
            if (!apVar.mo9867a() && !m13427a(apVar2, apVar, arVar)) {
                if (!C2843y.m13884a(apVar2.mo9869c()) && !C2843y.m13884a(apVar.mo9869c())) {
                    z = false;
                }
                if (z || arVar.mo7316k() != C2792ba.INVARIANT || apVar2.mo9868b() != C2792ba.INVARIANT || apVar.mo9868b() != C2792ba.INVARIANT) {
                    C2841w b2 = m13428b(arVar, apVar);
                    if (!this.f7999b.mo9856b(m13428b(arVar, apVar2), b2, this)) {
                        return false;
                    }
                    C2841w c = m13429c(arVar, apVar);
                    C2841w c2 = m13429c(arVar, apVar2);
                    if (apVar.mo9868b() != C2792ba.OUT_VARIANCE) {
                        if (!this.f7999b.mo9856b(c, c2, this)) {
                            return false;
                        }
                    } else if (!f7998a && !C1627g.m7429q(c)) {
                        throw new AssertionError("In component must be Nothing for out-projection");
                    }
                } else if (!this.f7999b.mo9855a(apVar2.mo9869c(), apVar.mo9869c(), this)) {
                    return false;
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    private boolean m13427a(C2771ap apVar, C2771ap apVar2, C1700ar arVar) {
        if (arVar.mo7316k() == C2792ba.INVARIANT && apVar.mo9868b() != C2792ba.INVARIANT && apVar2.mo9868b() == C2792ba.INVARIANT) {
            return this.f7999b.mo9853a(apVar2.mo9869c(), apVar);
        }
        return false;
    }
}
