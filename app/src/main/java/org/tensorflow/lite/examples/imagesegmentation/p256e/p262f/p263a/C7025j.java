package p256e.p262f.p263a;

/* renamed from: e.f.a.j */
/* compiled from: Geom */
class C7025j {

    /* renamed from: a */
    static final /* synthetic */ boolean f24973a = (!C7025j.class.desiredAssertionStatus());

    /* renamed from: a */
    static double m36882a(double d, double d2, double d3, double d4) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        if (d3 < 0.0d) {
            d3 = 0.0d;
        }
        return d <= d3 ? d3 == 0.0d ? (d2 + d4) / 2.0d : d2 + ((d4 - d2) * (d / (d3 + d))) : d4 + ((d2 - d4) * (d3 / (d + d3)));
    }

    private C7025j() {
    }

    /* renamed from: a */
    static double m36883a(C7024i iVar, C7024i iVar2, C7024i iVar3) {
        if (f24973a || (m36889b(iVar, iVar2) && m36889b(iVar2, iVar3))) {
            double d = iVar2.f24970f - iVar.f24970f;
            double d2 = iVar3.f24970f - iVar2.f24970f;
            double d3 = d + d2;
            if (d3 <= 0.0d) {
                return 0.0d;
            }
            if (d < d2) {
                return (iVar2.f24971g - iVar.f24971g) + ((iVar.f24971g - iVar3.f24971g) * (d / d3));
            }
            return (iVar2.f24971g - iVar3.f24971g) + ((iVar3.f24971g - iVar.f24971g) * (d2 / d3));
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    static double m36887b(C7024i iVar, C7024i iVar2, C7024i iVar3) {
        if (f24973a || (m36889b(iVar, iVar2) && m36889b(iVar2, iVar3))) {
            double d = iVar2.f24970f - iVar.f24970f;
            double d2 = iVar3.f24970f - iVar2.f24970f;
            if (d + d2 > 0.0d) {
                return ((iVar2.f24971g - iVar3.f24971g) * d) + ((iVar2.f24971g - iVar.f24971g) * d2);
            }
            return 0.0d;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    static double m36890c(C7024i iVar, C7024i iVar2, C7024i iVar3) {
        if (f24973a || (m36891c(iVar, iVar2) && m36891c(iVar2, iVar3))) {
            double d = iVar2.f24971g - iVar.f24971g;
            double d2 = iVar3.f24971g - iVar2.f24971g;
            double d3 = d + d2;
            if (d3 <= 0.0d) {
                return 0.0d;
            }
            if (d < d2) {
                return (iVar2.f24970f - iVar.f24970f) + ((iVar.f24970f - iVar3.f24970f) * (d / d3));
            }
            return (iVar2.f24970f - iVar3.f24970f) + ((iVar3.f24970f - iVar.f24970f) * (d2 / d3));
        }
        throw new AssertionError();
    }

    /* renamed from: d */
    static double m36893d(C7024i iVar, C7024i iVar2, C7024i iVar3) {
        if (f24973a || (m36891c(iVar, iVar2) && m36891c(iVar2, iVar3))) {
            double d = iVar2.f24971g - iVar.f24971g;
            double d2 = iVar3.f24971g - iVar2.f24971g;
            if (d + d2 > 0.0d) {
                return ((iVar2.f24970f - iVar3.f24970f) * d) + ((iVar2.f24970f - iVar.f24970f) * d2);
            }
            return 0.0d;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    static void m36884a(C7024i iVar, C7024i iVar2, C7024i iVar3, C7024i iVar4, C7024i iVar5) {
        C7024i iVar6;
        C7024i iVar7;
        C7024i iVar8;
        C7024i iVar9;
        C7024i iVar10 = iVar5;
        if (!m36889b(iVar, iVar2)) {
            iVar6 = iVar;
            iVar7 = iVar2;
        } else {
            iVar7 = iVar;
            iVar6 = iVar2;
        }
        if (!m36889b(iVar3, iVar4)) {
            iVar8 = iVar3;
            iVar9 = iVar4;
        } else {
            iVar9 = iVar3;
            iVar8 = iVar4;
        }
        if (!m36889b(iVar7, iVar9)) {
            C7024i iVar11 = iVar8;
            iVar8 = iVar6;
            iVar6 = iVar11;
        } else {
            C7024i iVar12 = iVar9;
            iVar9 = iVar7;
            iVar7 = iVar12;
        }
        if (!m36889b(iVar7, iVar6)) {
            iVar10.f24970f = (iVar7.f24970f + iVar6.f24970f) / 2.0d;
        } else if (m36889b(iVar6, iVar8)) {
            double a = m36883a(iVar9, iVar7, iVar6);
            double a2 = m36883a(iVar7, iVar6, iVar8);
            if (a + a2 < 0.0d) {
                a = -a;
                a2 = -a2;
            }
            double d = a2;
            iVar10.f24970f = m36882a(a, iVar7.f24970f, d, iVar6.f24970f);
        } else {
            double b = m36887b(iVar9, iVar7, iVar6);
            double d2 = -m36887b(iVar9, iVar8, iVar6);
            if (b + d2 < 0.0d) {
                b = -b;
                d2 = -d2;
            }
            double d3 = d2;
            iVar10.f24970f = m36882a(b, iVar7.f24970f, d3, iVar8.f24970f);
        }
        if (m36891c(iVar9, iVar6)) {
            C7024i iVar13 = iVar9;
            iVar9 = iVar6;
            iVar6 = iVar13;
        }
        if (!m36891c(iVar7, iVar8)) {
            C7024i iVar14 = iVar8;
            iVar8 = iVar7;
            iVar7 = iVar14;
        }
        if (!m36891c(iVar6, iVar7)) {
            C7024i iVar15 = iVar6;
            iVar6 = iVar7;
            iVar7 = iVar15;
            C7024i iVar16 = iVar8;
            iVar8 = iVar9;
            iVar9 = iVar16;
        }
        if (!m36891c(iVar7, iVar9)) {
            iVar10.f24971g = (iVar7.f24971g + iVar9.f24971g) / 2.0d;
        } else if (m36891c(iVar9, iVar8)) {
            double c = m36890c(iVar6, iVar7, iVar9);
            double c2 = m36890c(iVar7, iVar9, iVar8);
            if (c + c2 < 0.0d) {
                c = -c;
                c2 = -c2;
            }
            iVar10.f24971g = m36882a(c, iVar7.f24971g, c2, iVar9.f24971g);
        } else {
            double d4 = m36893d(iVar6, iVar7, iVar9);
            double d5 = -m36893d(iVar6, iVar8, iVar9);
            if (d4 + d5 < 0.0d) {
                d4 = -d4;
                d5 = -d5;
            }
            iVar10.f24971g = m36882a(d4, iVar7.f24971g, d5, iVar8.f24971g);
        }
    }

    /* renamed from: a */
    static boolean m36886a(C7024i iVar, C7024i iVar2) {
        return iVar.f24970f == iVar2.f24970f && iVar.f24971g == iVar2.f24971g;
    }

    /* renamed from: b */
    static boolean m36889b(C7024i iVar, C7024i iVar2) {
        return iVar.f24970f < iVar2.f24970f || (iVar.f24970f == iVar2.f24970f && iVar.f24971g <= iVar2.f24971g);
    }

    /* renamed from: c */
    static boolean m36891c(C7024i iVar, C7024i iVar2) {
        return iVar.f24971g < iVar2.f24971g || (iVar.f24971g == iVar2.f24971g && iVar.f24970f <= iVar2.f24970f);
    }

    /* renamed from: a */
    static boolean m36885a(C7021f fVar) {
        return m36889b(fVar.f24919b.f24922e, fVar.f24922e);
    }

    /* renamed from: b */
    static boolean m36888b(C7021f fVar) {
        return m36889b(fVar.f24922e, fVar.f24919b.f24922e);
    }

    /* renamed from: d */
    static double m36892d(C7024i iVar, C7024i iVar2) {
        return Math.abs(iVar.f24970f - iVar2.f24970f) + Math.abs(iVar.f24971g - iVar2.f24971g);
    }

    /* renamed from: e */
    static double m36894e(C7024i iVar, C7024i iVar2, C7024i iVar3) {
        double d = iVar2.f24970f - iVar.f24970f;
        double d2 = iVar2.f24971g - iVar.f24971g;
        double d3 = iVar3.f24970f - iVar.f24970f;
        double d4 = iVar3.f24971g - iVar.f24971g;
        double d5 = (d * d3) + (d2 * d4);
        double sqrt = Math.sqrt((d * d) + (d2 * d2)) * Math.sqrt((d3 * d3) + (d4 * d4));
        return sqrt > 0.0d ? d5 / sqrt : d5;
    }
}
