package p256e.p262f.p263a;

/* renamed from: e.f.a.t */
/* compiled from: Render */
class C7040t {

    /* renamed from: a */
    static final /* synthetic */ boolean f25003a = (!C7040t.class.desiredAssertionStatus());

    /* renamed from: b */
    private static final C7043b f25004b = new C7043b();

    /* renamed from: c */
    private static final C7044c f25005c = new C7044c();

    /* renamed from: d */
    private static final C7045d f25006d = new C7045d();

    /* renamed from: e.f.a.t$a */
    /* compiled from: Render */
    private static class C7042a {

        /* renamed from: a */
        long f25007a;

        /* renamed from: b */
        C7021f f25008b;

        /* renamed from: c */
        C7046e f25009c;

        public C7042a() {
        }

        public C7042a(long j, C7021f fVar, C7046e eVar) {
            this.f25007a = j;
            this.f25008b = fVar;
            this.f25009c = eVar;
        }
    }

    /* renamed from: e.f.a.t$b */
    /* compiled from: Render */
    private static class C7043b implements C7046e {

        /* renamed from: a */
        static final /* synthetic */ boolean f25010a = (!C7040t.class.desiredAssertionStatus());

        private C7043b() {
        }

        /* renamed from: a */
        public void mo22168a(C7023h hVar, C7021f fVar, long j) {
            hVar.mo22134a(6);
            hVar.mo22143b(fVar.f24922e.f24968d);
            hVar.mo22143b(fVar.f24919b.f24922e.f24968d);
            while (!C7040t.m36989b(fVar.f24923f)) {
                fVar.f24923f.f24916f = true;
                j--;
                fVar = fVar.f24920c;
                hVar.mo22143b(fVar.f24919b.f24922e.f24968d);
            }
            if (f25010a || j == 0) {
                hVar.mo22146e();
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: e.f.a.t$c */
    /* compiled from: Render */
    private static class C7044c implements C7046e {

        /* renamed from: a */
        static final /* synthetic */ boolean f25011a = (!C7040t.class.desiredAssertionStatus());

        private C7044c() {
        }

        /* renamed from: a */
        public void mo22168a(C7023h hVar, C7021f fVar, long j) {
            hVar.mo22134a(5);
            hVar.mo22143b(fVar.f24922e.f24968d);
            hVar.mo22143b(fVar.f24919b.f24922e.f24968d);
            while (!C7040t.m36989b(fVar.f24923f)) {
                fVar.f24923f.f24916f = true;
                j--;
                C7021f fVar2 = fVar.f24921d.f24919b;
                hVar.mo22143b(fVar2.f24922e.f24968d);
                if (C7040t.m36989b(fVar2.f24923f)) {
                    break;
                }
                fVar2.f24923f.f24916f = true;
                j--;
                fVar = fVar2.f24920c;
                hVar.mo22143b(fVar.f24919b.f24922e.f24968d);
            }
            if (f25011a || j == 0) {
                hVar.mo22146e();
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: e.f.a.t$d */
    /* compiled from: Render */
    private static class C7045d implements C7046e {

        /* renamed from: a */
        static final /* synthetic */ boolean f25012a = (!C7040t.class.desiredAssertionStatus());

        private C7045d() {
        }

        /* renamed from: a */
        public void mo22168a(C7023h hVar, C7021f fVar, long j) {
            if (f25012a || j == 1) {
                hVar.f24952m = C7040t.m36985b(fVar.f24923f, hVar.f24952m);
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: e.f.a.t$e */
    /* compiled from: Render */
    private interface C7046e {
        /* renamed from: a */
        void mo22168a(C7023h hVar, C7021f fVar, long j);
    }

    /* renamed from: a */
    private static boolean m36982a(long j) {
        return (j & 1) == 0;
    }

    private C7040t() {
    }

    /* renamed from: a */
    public static void m36981a(C7023h hVar, C7022g gVar) {
        hVar.f24952m = null;
        C7020e eVar = gVar.f24928b;
        while (true) {
            eVar = eVar.f24911a;
            if (eVar == gVar.f24928b) {
                break;
            }
            eVar.f24916f = false;
        }
        C7020e eVar2 = gVar.f24928b;
        while (true) {
            eVar2 = eVar2.f24911a;
            if (eVar2 != gVar.f24928b) {
                if (eVar2.f24917g && !eVar2.f24916f) {
                    m36980a(hVar, eVar2);
                    if (!f25003a && !eVar2.f24916f) {
                        throw new AssertionError();
                    }
                }
            } else if (hVar.f24952m != null) {
                m36987b(hVar, hVar.f24952m);
                hVar.f24952m = null;
                return;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static void m36980a(C7023h hVar, C7020e eVar) {
        C7021f fVar = eVar.f24913c;
        C7042a aVar = new C7042a();
        new C7042a();
        aVar.f25007a = 1;
        aVar.f25008b = fVar;
        aVar.f25009c = f25006d;
        if (!hVar.f24949j) {
            C7042a a = m36979a(fVar);
            if (a.f25007a > aVar.f25007a) {
                aVar = a;
            }
            C7042a a2 = m36979a(fVar.f24921d);
            if (a2.f25007a > aVar.f25007a) {
                aVar = a2;
            }
            C7042a a3 = m36979a(fVar.f24920c.f24919b);
            if (a3.f25007a > aVar.f25007a) {
                aVar = a3;
            }
            C7042a b = m36986b(fVar);
            if (b.f25007a > aVar.f25007a) {
                aVar = b;
            }
            C7042a b2 = m36986b(fVar.f24921d);
            if (b2.f25007a > aVar.f25007a) {
                aVar = b2;
            }
            C7042a b3 = m36986b(fVar.f24920c.f24919b);
            if (b3.f25007a > aVar.f25007a) {
                aVar = b3;
            }
        }
        aVar.f25009c.mo22168a(hVar, aVar.f25008b, aVar.f25007a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m36989b(C7020e eVar) {
        return !eVar.f24917g || eVar.f24916f;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C7020e m36985b(C7020e eVar, C7020e eVar2) {
        eVar.f24915e = eVar2;
        eVar.f24916f = true;
        return eVar;
    }

    /* renamed from: c */
    private static void m36990c(C7020e eVar) {
        while (eVar != null) {
            eVar.f24916f = false;
            eVar = eVar.f24915e;
        }
    }

    /* renamed from: a */
    static C7042a m36979a(C7021f fVar) {
        C7020e eVar = null;
        C7042a aVar = new C7042a(0, null, f25004b);
        for (C7021f fVar2 = fVar; !m36989b(fVar2.f24923f); fVar2 = fVar2.f24920c) {
            eVar = m36985b(fVar2.f24923f, eVar);
            aVar.f25007a++;
        }
        while (!m36989b(fVar.f24919b.f24923f)) {
            eVar = m36985b(fVar.f24919b.f24923f, eVar);
            aVar.f25007a++;
            fVar = fVar.f24919b.f24921d;
        }
        aVar.f25008b = fVar;
        m36990c(eVar);
        return aVar;
    }

    /* renamed from: b */
    static C7042a m36986b(C7021f fVar) {
        C7020e eVar = null;
        long j = 0;
        C7042a aVar = new C7042a(0, null, f25005c);
        C7021f fVar2 = fVar;
        long j2 = 0;
        while (!m36989b(fVar2.f24923f)) {
            eVar = m36985b(fVar2.f24923f, eVar);
            j2++;
            fVar2 = fVar2.f24921d.f24919b;
            if (m36989b(fVar2.f24923f)) {
                break;
            }
            eVar = m36985b(fVar2.f24923f, eVar);
            j2++;
            fVar2 = fVar2.f24920c;
        }
        while (!m36989b(fVar.f24919b.f24923f)) {
            eVar = m36985b(fVar.f24919b.f24923f, eVar);
            j++;
            fVar = fVar.f24919b.f24921d;
            if (m36989b(fVar.f24919b.f24923f)) {
                break;
            }
            eVar = m36985b(fVar.f24919b.f24923f, eVar);
            j++;
            fVar = fVar.f24919b.f24920c.f24919b;
        }
        aVar.f25007a = j2 + j;
        if (m36982a(j2)) {
            aVar.f25008b = fVar2.f24919b;
        } else if (m36982a(j)) {
            aVar.f25008b = fVar;
        } else {
            aVar.f25007a--;
            aVar.f25008b = fVar.f24920c;
        }
        m36990c(eVar);
        return aVar;
    }

    /* renamed from: b */
    static void m36987b(C7023h hVar, C7020e eVar) {
        hVar.mo22134a(4);
        char c = 65535;
        while (eVar != null) {
            C7021f fVar = eVar.f24913c;
            do {
                if (hVar.f24949j) {
                    boolean z = true;
                    boolean z2 = !fVar.f24919b.f24923f.f24917g;
                    if (c != z2) {
                        if (!z2) {
                            z = false;
                        }
                        hVar.mo22138a(z);
                        c = z2;
                    }
                }
                hVar.mo22143b(fVar.f24922e.f24968d);
                fVar = fVar.f24921d;
            } while (fVar != eVar.f24913c);
            eVar = eVar.f24915e;
        }
        hVar.mo22146e();
    }

    /* renamed from: b */
    public static void m36988b(C7023h hVar, C7022g gVar) {
        C7020e eVar = gVar.f24928b;
        while (true) {
            eVar = eVar.f24911a;
            if (eVar == gVar.f24928b) {
                return;
            }
            if (eVar.f24917g) {
                hVar.mo22134a(2);
                C7021f fVar = eVar.f24913c;
                do {
                    hVar.mo22143b(fVar.f24922e.f24968d);
                    fVar = fVar.f24921d;
                } while (fVar != eVar.f24913c);
                hVar.mo22146e();
            }
        }
    }

    /* renamed from: a */
    static int m36977a(C7023h hVar, double[] dArr, boolean z) {
        long j;
        C7023h hVar2 = hVar;
        C7016b[] bVarArr = hVar2.f24954o;
        int i = hVar2.f24953n;
        double[] dArr2 = new double[3];
        if (!z) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
        }
        double d = bVarArr[1].f24903a[0] - bVarArr[0].f24903a[0];
        double d2 = bVarArr[1].f24903a[1] - bVarArr[0].f24903a[1];
        double d3 = bVarArr[1].f24903a[2] - bVarArr[0].f24903a[2];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            i2++;
            if (i2 >= i) {
                return i3;
            }
            double d4 = bVarArr[i2].f24903a[0] - bVarArr[0].f24903a[0];
            double d5 = bVarArr[i2].f24903a[1] - bVarArr[0].f24903a[1];
            double d6 = bVarArr[i2].f24903a[2] - bVarArr[0].f24903a[2];
            dArr2[0] = (d2 * d6) - (d3 * d5);
            dArr2[1] = (d3 * d4) - (d * d6);
            dArr2[2] = (d * d5) - (d2 * d4);
            double d7 = (dArr2[0] * dArr[0]) + (dArr2[1] * dArr[1]) + (dArr2[2] * dArr[2]);
            if (!z) {
                if (d7 >= 0.0d) {
                    dArr[0] = dArr[0] + dArr2[0];
                    dArr[1] = dArr[1] + dArr2[1];
                    dArr[2] = dArr[2] + dArr2[2];
                } else {
                    dArr[0] = dArr[0] - dArr2[0];
                    dArr[1] = dArr[1] - dArr2[1];
                    dArr[2] = dArr[2] - dArr2[2];
                }
                j = 0;
            } else {
                j = 0;
                int i4 = (d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1));
                if (i4 != 0) {
                    if (i4 > 0) {
                        if (i3 < 0) {
                            return 2;
                        }
                        d = d4;
                        d2 = d5;
                        d3 = d6;
                        i3 = 1;
                    } else if (i3 > 0) {
                        return 2;
                    } else {
                        i3 = -1;
                    }
                }
            }
            d = d4;
            long j2 = j;
            d2 = d5;
            d3 = d6;
        }
    }

    /* renamed from: a */
    public static boolean m36984a(C7023h hVar) {
        C7016b[] bVarArr = hVar.f24954o;
        int i = hVar.f24953n;
        double[] dArr = new double[3];
        if (hVar.f24953n < 3) {
            return true;
        }
        dArr[0] = hVar.f24941b[0];
        dArr[1] = hVar.f24941b[1];
        dArr[2] = hVar.f24941b[2];
        if (dArr[0] == 0.0d && dArr[1] == 0.0d && dArr[2] == 0.0d) {
            m36977a(hVar, dArr, false);
        }
        int a = m36977a(hVar, dArr, true);
        if (a != 2 && a == 0) {
            return true;
        }
        return false;
    }
}
