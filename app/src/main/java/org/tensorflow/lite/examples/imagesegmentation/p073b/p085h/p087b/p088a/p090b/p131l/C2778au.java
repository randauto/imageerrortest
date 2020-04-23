package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.ArrayList;
import java.util.List;
import p073b.p079e.p080a.C1450b;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1668l;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1671m;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p119i.p120a.p121a.C2490c;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;
import p073b.p085h.p087b.p088a.p090b.p131l.p135d.C2806b;
import p073b.p085h.p087b.p088a.p090b.p139n.C2893c;

/* renamed from: b.h.b.a.b.l.au */
/* compiled from: TypeSubstitutor */
public class C2778au {

    /* renamed from: a */
    public static final C2778au f8036a = m13550a(C2774as.f8034d);

    /* renamed from: b */
    static final /* synthetic */ boolean f8037b = (!C2778au.class.desiredAssertionStatus());

    /* renamed from: c */
    private final C2774as f8038c;

    /* renamed from: b.h.b.a.b.l.au$a */
    /* compiled from: TypeSubstitutor */
    private static final class C2781a extends Exception {
        public C2781a(String str) {
            super(str);
        }
    }

    /* renamed from: b.h.b.a.b.l.au$b */
    /* compiled from: TypeSubstitutor */
    private enum C2782b {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* renamed from: a */
    public static C2778au m13550a(C2774as asVar) {
        return new C2778au(asVar);
    }

    /* renamed from: a */
    public static C2778au m13551a(C2774as asVar, C2774as asVar2) {
        return m13550a(C2822l.m13750a(asVar, asVar2));
    }

    /* renamed from: a */
    public static C2778au m13552a(C2841w wVar) {
        return m13550a(C2768ao.m13517a(wVar.mo9507g(), wVar.mo9501a()));
    }

    protected C2778au(C2774as asVar) {
        this.f8038c = asVar;
    }

    /* renamed from: a */
    public boolean mo9886a() {
        return this.f8038c.mo7781a();
    }

    /* renamed from: b */
    public C2774as mo9888b() {
        return this.f8038c;
    }

    /* renamed from: a */
    public C2841w mo9885a(C2841w wVar, C2792ba baVar) {
        if (mo9886a()) {
            return wVar;
        }
        try {
            return m13549a((C2771ap) new C2773ar(baVar, wVar), 0).mo9869c();
        } catch (C2781a e) {
            return C2827p.m13791c(e.getMessage());
        }
    }

    /* renamed from: b */
    public C2841w mo9889b(C2841w wVar, C2792ba baVar) {
        C2771ap a = mo9884a((C2771ap) new C2773ar(baVar, mo9888b().mo9880a(wVar, baVar)));
        if (a == null) {
            return null;
        }
        return a.mo9869c();
    }

    /* renamed from: a */
    public C2771ap mo9884a(C2771ap apVar) {
        C2771ap b = mo9887b(apVar);
        if (this.f8038c.mo9875c() || this.f8038c.mo9515b()) {
            return C2806b.m13691a(b, this.f8038c.mo9515b());
        }
        return b;
    }

    /* renamed from: b */
    public C2771ap mo9887b(C2771ap apVar) {
        if (mo9886a()) {
            return apVar;
        }
        try {
            return m13549a(apVar, 0);
        } catch (C2781a unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C2771ap m13549a(C2771ap apVar, int i) {
        C2841w wVar;
        m13557a(i, apVar, this.f8038c);
        if (apVar.mo9867a()) {
            return apVar;
        }
        C2841w c = apVar.mo9869c();
        if (c instanceof C2785aw) {
            C2785aw awVar = (C2785aw) c;
            C2788az j = awVar.mo9865j();
            C2841w k = awVar.mo9866k();
            C2771ap a = m13549a((C2771ap) new C2773ar(apVar.mo9868b(), j), i + 1);
            return new C2773ar(a.mo9868b(), C2786ax.m13595b(a.mo9869c().mo9892l(), mo9889b(k, apVar.mo9868b())));
        } else if (C2825n.m13766a(c) || (c.mo9892l() instanceof C2754ac)) {
            return apVar;
        } else {
            C2771ap b = this.f8038c.mo7782b(c);
            C2792ba b2 = apVar.mo9868b();
            if (b == null && C2838t.m13858a(c) && !C2766am.m13506a(c)) {
                C2834q b3 = C2838t.m13859b(c);
                int i2 = i + 1;
                C2771ap a2 = m13549a((C2771ap) new C2773ar(b2, b3.mo9945f()), i2);
                C2771ap a3 = m13549a((C2771ap) new C2773ar(b2, b3.mo9946h()), i2);
                C2792ba b4 = a2.mo9868b();
                if (!f8037b && ((b4 != a3.mo9868b() || b2 != C2792ba.INVARIANT) && b2 != b4)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected substituted projection kind: ");
                    sb.append(b4);
                    sb.append("; original: ");
                    sb.append(b2);
                    throw new AssertionError(sb.toString());
                } else if (a2.mo9869c() == b3.mo9945f() && a3.mo9869c() == b3.mo9946h()) {
                    return apVar;
                } else {
                    return new C2773ar(b4, C2842x.m13883a(C2777at.m13545a(a2.mo9869c()), C2777at.m13545a(a3.mo9869c())));
                }
            } else if (C1627g.m7429q(c) || C2843y.m13884a(c)) {
                return apVar;
            } else {
                if (b == null) {
                    return m13558b(apVar, i);
                }
                C2782b b5 = m13559b(b2, b.mo9868b());
                if (!C2490c.m12502a(c)) {
                    switch (b5) {
                        case OUT_IN_IN_POSITION:
                            throw new C2781a("Out-projection in in-position");
                        case IN_IN_OUT_POSITION:
                            return new C2773ar(C2792ba.OUT_VARIANCE, c.mo9507g().mo7407e().mo7207t());
                    }
                }
                C2815f b6 = C2766am.m13508b(c);
                if (b.mo9867a()) {
                    return b;
                }
                if (b6 != null) {
                    wVar = b6.mo7895a_(b.mo9869c());
                } else {
                    wVar = C2783av.m13575b(b.mo9869c(), c.mo7897c());
                }
                if (!c.mo7086x().mo7255a()) {
                    wVar = C2803a.m13676a(wVar, (C1659h) new C1668l(wVar.mo7086x(), m13548a(this.f8038c.mo9879a(c.mo7086x()))));
                }
                if (b5 == C2782b.NO_CONFLICT) {
                    b2 = m13554a(b2, b.mo9868b());
                }
                return new C2773ar(b2, wVar);
            }
        }
    }

    /* renamed from: a */
    private static C1659h m13548a(C1659h hVar) {
        if (!hVar.mo7257b(C1627g.f5076h.f5105K)) {
            return hVar;
        }
        return new C1671m(hVar, new C1450b<C2355b, Boolean>() {
            /* renamed from: a */
            public Boolean mo6756a(C2355b bVar) {
                return Boolean.valueOf(!bVar.equals(C1627g.f5076h.f5105K));
            }
        });
    }

    /* renamed from: b */
    private C2771ap m13558b(C2771ap apVar, int i) {
        C2841w c = apVar.mo9869c();
        C2792ba b = apVar.mo9868b();
        if (c.mo9507g().mo7096d() instanceof C1700ar) {
            return apVar;
        }
        C2841w wVar = null;
        C2755ad b2 = C2758ag.m13480b(c);
        if (b2 != null) {
            wVar = mo9889b((C2841w) b2, C2792ba.INVARIANT);
        }
        C2841w a = C2777at.m13546a(c, m13556a(c.mo9507g().mo7094b(), c.mo9501a(), i), this.f8038c.mo9879a(c.mo7086x()));
        if ((a instanceof C2755ad) && (wVar instanceof C2755ad)) {
            a = C2758ag.m13478a((C2755ad) a, (C2755ad) wVar);
        }
        return new C2773ar(b, a);
    }

    /* renamed from: a */
    private List<C2771ap> m13556a(List<C1700ar> list, List<C2771ap> list2, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1700ar arVar = (C1700ar) list.get(i2);
            C2771ap apVar = (C2771ap) list2.get(i2);
            C2771ap a = m13549a(apVar, i + 1);
            switch (m13559b(arVar.mo7316k(), a.mo9868b())) {
                case OUT_IN_IN_POSITION:
                case IN_IN_OUT_POSITION:
                    a = C2783av.m13569a(arVar);
                    break;
                case NO_CONFLICT:
                    if (arVar.mo7316k() != C2792ba.INVARIANT && !a.mo9867a()) {
                        a = new C2773ar(C2792ba.INVARIANT, a.mo9869c());
                        break;
                    }
            }
            if (a != apVar) {
                z = true;
            }
            arrayList.add(a);
        }
        return !z ? list2 : arrayList;
    }

    /* renamed from: a */
    public static C2792ba m13553a(C2792ba baVar, C2771ap apVar) {
        if (apVar.mo9867a()) {
            return C2792ba.OUT_VARIANCE;
        }
        return m13554a(baVar, apVar.mo9868b());
    }

    /* renamed from: a */
    public static C2792ba m13554a(C2792ba baVar, C2792ba baVar2) {
        if (baVar == C2792ba.INVARIANT) {
            return baVar2;
        }
        if (baVar2 == C2792ba.INVARIANT) {
            return baVar;
        }
        if (baVar == baVar2) {
            return baVar2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Variance conflict: type parameter variance '");
        sb.append(baVar);
        sb.append("' and ");
        sb.append("projection kind '");
        sb.append(baVar2);
        sb.append("' cannot be combined");
        throw new AssertionError(sb.toString());
    }

    /* renamed from: b */
    private static C2782b m13559b(C2792ba baVar, C2792ba baVar2) {
        if (baVar == C2792ba.IN_VARIANCE && baVar2 == C2792ba.OUT_VARIANCE) {
            return C2782b.OUT_IN_IN_POSITION;
        }
        if (baVar == C2792ba.OUT_VARIANCE && baVar2 == C2792ba.IN_VARIANCE) {
            return C2782b.IN_IN_OUT_POSITION;
        }
        return C2782b.NO_CONFLICT;
    }

    /* renamed from: a */
    private static void m13557a(int i, C2771ap apVar, C2774as asVar) {
        if (i > 100) {
            StringBuilder sb = new StringBuilder();
            sb.append("Recursion too deep. Most likely infinite loop while substituting ");
            sb.append(m13555a((Object) apVar));
            sb.append("; substitution: ");
            sb.append(m13555a((Object) asVar));
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static String m13555a(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!C2893c.m13970b(th)) {
                StringBuilder sb = new StringBuilder();
                sb.append("[Exception while computing toString(): ");
                sb.append(th);
                sb.append("]");
                return sb.toString();
            }
            throw ((RuntimeException) th);
        }
    }
}
