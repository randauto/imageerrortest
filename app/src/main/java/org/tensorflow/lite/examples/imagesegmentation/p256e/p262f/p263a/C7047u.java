package p256e.p262f.p263a;

import p256e.p262f.p263a.C7017c.C7018a;
import p256e.p262f.p263a.C7032q.C7033a;

/* renamed from: e.f.a.u */
/* compiled from: Sweep */
class C7047u {

    /* renamed from: a */
    static final /* synthetic */ boolean f25013a = (!C7047u.class.desiredAssertionStatus());

    /* renamed from: g */
    private static void m37028g(C7023h hVar) {
    }

    private C7047u() {
    }

    /* renamed from: a */
    private static void m36997a(C7021f fVar, C7021f fVar2) {
        fVar.f24925h += fVar2.f24925h;
        fVar.f24919b.f24925h += fVar2.f24919b.f24925h;
    }

    /* renamed from: c */
    private static C7015a m37018c(C7015a aVar) {
        return (C7015a) C7017c.m36854a(C7017c.m36860c(aVar.f24897b));
    }

    /* renamed from: d */
    private static C7015a m37021d(C7015a aVar) {
        return (C7015a) C7017c.m36854a(C7017c.m36859b(aVar.f24897b));
    }

    /* renamed from: a */
    static boolean m37011a(C7023h hVar, C7015a aVar, C7015a aVar2) {
        C7024i iVar = hVar.f24948i;
        C7021f fVar = aVar.f24896a;
        C7021f fVar2 = aVar2.f24896a;
        boolean z = false;
        if (fVar.f24919b.f24922e == iVar) {
            if (fVar2.f24919b.f24922e != iVar) {
                if (C7025j.m36887b(fVar2.f24919b.f24922e, iVar, fVar2.f24922e) <= 0.0d) {
                    z = true;
                }
                return z;
            } else if (C7025j.m36889b(fVar.f24922e, fVar2.f24922e)) {
                if (C7025j.m36887b(fVar2.f24919b.f24922e, fVar.f24922e, fVar2.f24922e) <= 0.0d) {
                    z = true;
                }
                return z;
            } else {
                if (C7025j.m36887b(fVar.f24919b.f24922e, fVar2.f24922e, fVar.f24922e) >= 0.0d) {
                    z = true;
                }
                return z;
            }
        } else if (fVar2.f24919b.f24922e == iVar) {
            if (C7025j.m36887b(fVar.f24919b.f24922e, iVar, fVar.f24922e) >= 0.0d) {
                z = true;
            }
            return z;
        } else {
            if (C7025j.m36883a(fVar.f24919b.f24922e, iVar, fVar.f24922e) >= C7025j.m36883a(fVar2.f24919b.f24922e, iVar, fVar2.f24922e)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    static void m37000a(C7023h hVar, C7015a aVar) {
        if (!aVar.f24902g || f25013a || aVar.f24896a.f24925h == 0) {
            aVar.f24896a.f24924g = null;
            C7017c.m36856a(hVar.f24946g, aVar.f24897b);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    static boolean m37008a(C7015a aVar, C7021f fVar) {
        if (!f25013a && !aVar.f24902g) {
            throw new AssertionError();
        } else if (!C7026k.m36908c(aVar.f24896a)) {
            return false;
        } else {
            aVar.f24902g = false;
            aVar.f24896a = fVar;
            fVar.f24924g = aVar;
            return true;
        }
    }

    /* renamed from: a */
    static C7015a m36995a(C7015a aVar) {
        C7024i iVar = aVar.f24896a.f24922e;
        do {
            aVar = m37021d(aVar);
        } while (aVar.f24896a.f24922e == iVar);
        if (aVar.f24902g) {
            C7021f c = C7026k.m36906c(m37018c(aVar).f24896a.f24919b, aVar.f24896a.f24921d);
            if (c == null || !m37008a(aVar, c)) {
                return null;
            }
            aVar = m37021d(aVar);
        }
        return aVar;
    }

    /* renamed from: b */
    static C7015a m37012b(C7015a aVar) {
        C7024i iVar = aVar.f24896a.f24919b.f24922e;
        do {
            aVar = m37021d(aVar);
        } while (aVar.f24896a.f24919b.f24922e == iVar);
        return aVar;
    }

    /* renamed from: a */
    static C7015a m36996a(C7023h hVar, C7015a aVar, C7021f fVar) {
        C7015a aVar2 = new C7015a();
        aVar2.f24896a = fVar;
        aVar2.f24897b = C7017c.m36852a(hVar.f24946g, aVar.f24897b, aVar2);
        if (aVar2.f24897b != null) {
            aVar2.f24902g = false;
            aVar2.f24900e = false;
            aVar2.f24901f = false;
            fVar.f24924g = aVar2;
            return aVar2;
        }
        throw new RuntimeException();
    }

    /* renamed from: a */
    static boolean m37010a(C7023h hVar, int i) {
        boolean z = false;
        switch (hVar.f24944e) {
            case 100130:
                if ((i & 1) != 0) {
                    z = true;
                }
                return z;
            case 100131:
                if (i != 0) {
                    z = true;
                }
                return z;
            case 100132:
                if (i > 0) {
                    z = true;
                }
                return z;
            case 100133:
                if (i < 0) {
                    z = true;
                }
                return z;
            case 100134:
                if (i >= 2 || i <= -2) {
                    z = true;
                }
                return z;
            default:
                throw new InternalError();
        }
    }

    /* renamed from: b */
    static void m37015b(C7023h hVar, C7015a aVar) {
        aVar.f24898c = m37021d(aVar).f24898c + aVar.f24896a.f24925h;
        aVar.f24899d = m37010a(hVar, aVar.f24898c);
    }

    /* renamed from: c */
    static void m37020c(C7023h hVar, C7015a aVar) {
        C7021f fVar = aVar.f24896a;
        C7020e eVar = fVar.f24923f;
        eVar.f24917g = aVar.f24899d;
        eVar.f24913c = fVar;
        m37000a(hVar, aVar);
    }

    /* renamed from: b */
    static C7021f m37013b(C7023h hVar, C7015a aVar, C7015a aVar2) {
        C7021f fVar = aVar.f24896a;
        while (true) {
            if (aVar == aVar2) {
                break;
            }
            aVar.f24902g = false;
            C7015a c = m37018c(aVar);
            C7021f fVar2 = c.f24896a;
            if (fVar2.f24922e != fVar.f24922e) {
                if (!c.f24902g) {
                    m37020c(hVar, aVar);
                    break;
                }
                fVar2 = C7026k.m36906c(fVar.f24920c.f24919b, fVar2.f24919b);
                if (fVar2 == null) {
                    throw new RuntimeException();
                } else if (!m37008a(c, fVar2)) {
                    throw new RuntimeException();
                }
            }
            if (fVar.f24920c != fVar2) {
                if (!C7026k.m36905b(fVar2.f24919b.f24921d, fVar2)) {
                    throw new RuntimeException();
                } else if (!C7026k.m36905b(fVar, fVar2)) {
                    throw new RuntimeException();
                }
            }
            m37020c(hVar, aVar);
            fVar = c.f24896a;
            aVar = c;
        }
        return fVar;
    }

    /* renamed from: a */
    static void m37001a(C7023h hVar, C7015a aVar, C7021f fVar, C7021f fVar2, C7021f fVar3, boolean z) {
        do {
            if (f25013a || C7025j.m36889b(fVar.f24922e, fVar.f24919b.f24922e)) {
                m36996a(hVar, aVar, fVar.f24919b);
                fVar = fVar.f24920c;
            } else {
                throw new AssertionError();
            }
        } while (fVar != fVar2);
        if (fVar3 == null) {
            fVar3 = m37018c(aVar).f24896a.f24919b.f24920c;
        }
        boolean z2 = true;
        while (true) {
            C7015a c = m37018c(aVar);
            C7021f fVar4 = c.f24896a.f24919b;
            if (fVar4.f24922e != fVar3.f24922e) {
                aVar.f24901f = true;
                if (!f25013a && aVar.f24898c - fVar4.f24925h != c.f24898c) {
                    throw new AssertionError();
                } else if (z) {
                    m37029g(hVar, aVar);
                    return;
                } else {
                    return;
                }
            } else {
                if (fVar4.f24920c != fVar3) {
                    if (!C7026k.m36905b(fVar4.f24919b.f24921d, fVar4)) {
                        throw new RuntimeException();
                    } else if (!C7026k.m36905b(fVar3.f24919b.f24921d, fVar4)) {
                        throw new RuntimeException();
                    }
                }
                c.f24898c = aVar.f24898c - fVar4.f24925h;
                c.f24899d = m37010a(hVar, c.f24898c);
                aVar.f24901f = true;
                if (!z2 && m37023d(hVar, aVar)) {
                    m36997a(fVar4, fVar3);
                    m37000a(hVar, aVar);
                    if (!C7026k.m36908c(fVar3)) {
                        throw new RuntimeException();
                    }
                }
                z2 = false;
                aVar = c;
                fVar3 = fVar4;
            }
        }
    }

    /* renamed from: a */
    static void m37006a(C7023h hVar, C7024i iVar, Object[] objArr, float[] fArr, boolean z) {
        Object[] objArr2 = new Object[1];
        hVar.mo22140a(new double[]{iVar.f24969e[0], iVar.f24969e[1], iVar.f24969e[2]}, objArr, fArr, objArr2);
        iVar.f24968d = objArr2[0];
        if (iVar.f24968d != null) {
            return;
        }
        if (!z) {
            iVar.f24968d = objArr[0];
        } else if (!hVar.f24945f) {
            hVar.mo22142b(100156);
            hVar.f24945f = true;
        }
    }

    /* renamed from: a */
    static void m37003a(C7023h hVar, C7021f fVar, C7021f fVar2) {
        Object[] objArr = new Object[4];
        float[] fArr = {0.5f, 0.5f, 0.0f, 0.0f};
        objArr[0] = fVar.f24922e.f24968d;
        objArr[1] = fVar2.f24922e.f24968d;
        m37006a(hVar, fVar.f24922e, objArr, fArr, false);
        if (!C7026k.m36905b(fVar, fVar2)) {
            throw new RuntimeException();
        }
    }

    /* renamed from: a */
    static void m37007a(C7024i iVar, C7024i iVar2, C7024i iVar3, float[] fArr) {
        double d = C7025j.m36892d(iVar2, iVar);
        double d2 = C7025j.m36892d(iVar3, iVar);
        double d3 = d2 * 0.5d;
        double d4 = d2 + d;
        fArr[0] = (float) (d3 / d4);
        fArr[1] = (float) ((d * 0.5d) / d4);
        double[] dArr = iVar.f24969e;
        dArr[0] = dArr[0] + (((double) fArr[0]) * iVar2.f24969e[0]) + (((double) fArr[1]) * iVar3.f24969e[0]);
        double[] dArr2 = iVar.f24969e;
        dArr2[1] = dArr2[1] + (((double) fArr[0]) * iVar2.f24969e[1]) + (((double) fArr[1]) * iVar3.f24969e[1]);
        double[] dArr3 = iVar.f24969e;
        dArr3[2] = dArr3[2] + (((double) fArr[0]) * iVar2.f24969e[2]) + (((double) fArr[1]) * iVar3.f24969e[2]);
    }

    /* renamed from: a */
    static void m37005a(C7023h hVar, C7024i iVar, C7024i iVar2, C7024i iVar3, C7024i iVar4, C7024i iVar5) {
        C7024i iVar6 = iVar;
        C7024i iVar7 = iVar2;
        C7024i iVar8 = iVar3;
        C7024i iVar9 = iVar4;
        C7024i iVar10 = iVar5;
        float[] fArr = new float[4];
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        Object[] objArr = {iVar7.f24968d, iVar8.f24968d, iVar9.f24968d, iVar10.f24968d};
        double[] dArr = iVar6.f24969e;
        double[] dArr2 = iVar6.f24969e;
        iVar6.f24969e[2] = 0.0d;
        dArr2[1] = 0.0d;
        dArr[0] = 0.0d;
        m37007a(iVar6, iVar7, iVar8, fArr2);
        m37007a(iVar6, iVar9, iVar10, fArr3);
        System.arraycopy(fArr2, 0, fArr, 0, 2);
        System.arraycopy(fArr3, 0, fArr, 2, 2);
        m37006a(hVar, iVar6, objArr, fArr, true);
    }

    /* renamed from: d */
    static boolean m37023d(C7023h hVar, C7015a aVar) {
        C7015a c = m37018c(aVar);
        C7021f fVar = aVar.f24896a;
        C7021f fVar2 = c.f24896a;
        if (C7025j.m36889b(fVar.f24922e, fVar2.f24922e)) {
            if (C7025j.m36887b(fVar2.f24919b.f24922e, fVar.f24922e, fVar2.f24922e) > 0.0d) {
                return false;
            }
            if (!C7025j.m36886a(fVar.f24922e, fVar2.f24922e)) {
                if (C7026k.m36910e(fVar2.f24919b) == null) {
                    throw new RuntimeException();
                } else if (C7026k.m36905b(fVar, fVar2.f24919b.f24921d)) {
                    c.f24901f = true;
                    aVar.f24901f = true;
                } else {
                    throw new RuntimeException();
                }
            } else if (fVar.f24922e != fVar2.f24922e) {
                hVar.f24947h.mo22161a(fVar.f24922e.f24972h);
                m37003a(hVar, fVar2.f24919b.f24921d, fVar);
            }
        } else if (C7025j.m36887b(fVar.f24919b.f24922e, fVar2.f24922e, fVar.f24922e) < 0.0d) {
            return false;
        } else {
            C7015a d = m37021d(aVar);
            aVar.f24901f = true;
            d.f24901f = true;
            if (C7026k.m36910e(fVar.f24919b) == null) {
                throw new RuntimeException();
            } else if (!C7026k.m36905b(fVar2.f24919b.f24921d, fVar)) {
                throw new RuntimeException();
            }
        }
        return true;
    }

    /* renamed from: e */
    static boolean m37025e(C7023h hVar, C7015a aVar) {
        C7015a c = m37018c(aVar);
        C7021f fVar = aVar.f24896a;
        C7021f fVar2 = c.f24896a;
        if (f25013a || !C7025j.m36886a(fVar.f24919b.f24922e, fVar2.f24919b.f24922e)) {
            if (C7025j.m36889b(fVar.f24919b.f24922e, fVar2.f24919b.f24922e)) {
                if (C7025j.m36887b(fVar.f24919b.f24922e, fVar2.f24919b.f24922e, fVar.f24922e) < 0.0d) {
                    return false;
                }
                C7015a d = m37021d(aVar);
                aVar.f24901f = true;
                d.f24901f = true;
                C7021f e = C7026k.m36910e(fVar);
                if (e == null) {
                    throw new RuntimeException();
                } else if (C7026k.m36905b(fVar2.f24919b, e)) {
                    e.f24923f.f24917g = aVar.f24899d;
                } else {
                    throw new RuntimeException();
                }
            } else if (C7025j.m36887b(fVar2.f24919b.f24922e, fVar.f24919b.f24922e, fVar2.f24922e) > 0.0d) {
                return false;
            } else {
                c.f24901f = true;
                aVar.f24901f = true;
                C7021f e2 = C7026k.m36910e(fVar2);
                if (e2 == null) {
                    throw new RuntimeException();
                } else if (C7026k.m36905b(fVar.f24921d, fVar2.f24919b)) {
                    e2.f24919b.f24923f.f24917g = aVar.f24899d;
                } else {
                    throw new RuntimeException();
                }
            }
            return true;
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016e, code lost:
        if (p256e.p262f.p263a.C7025j.m36887b(r5, r0.f24948i, r9) < 0.0d) goto L_0x0173;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m37027f(p256e.p262f.p263a.C7023h r18, p256e.p262f.p263a.C7015a r19) {
        /*
            r0 = r18
            r6 = r19
            e.f.a.a r7 = m37018c(r19)
            e.f.a.f r1 = r6.f24896a
            e.f.a.f r2 = r7.f24896a
            e.f.a.i r3 = r1.f24922e
            e.f.a.i r4 = r2.f24922e
            e.f.a.f r5 = r1.f24919b
            e.f.a.i r5 = r5.f24922e
            e.f.a.f r8 = r2.f24919b
            e.f.a.i r8 = r8.f24922e
            e.f.a.i r9 = new e.f.a.i
            r9.<init>()
            boolean r10 = f25013a
            if (r10 != 0) goto L_0x002e
            boolean r10 = p256e.p262f.p263a.C7025j.m36886a(r8, r5)
            if (r10 != 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x002e:
            boolean r10 = f25013a
            r11 = 0
            if (r10 != 0) goto L_0x0045
            e.f.a.i r10 = r0.f24948i
            double r13 = p256e.p262f.p263a.C7025j.m36887b(r5, r10, r3)
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0045:
            boolean r10 = f25013a
            if (r10 != 0) goto L_0x005a
            e.f.a.i r10 = r0.f24948i
            double r13 = p256e.p262f.p263a.C7025j.m36887b(r8, r10, r4)
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x0054
            goto L_0x005a
        L_0x0054:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x005a:
            boolean r10 = f25013a
            if (r10 != 0) goto L_0x006d
            e.f.a.i r10 = r0.f24948i
            if (r3 == r10) goto L_0x0067
            e.f.a.i r10 = r0.f24948i
            if (r4 == r10) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x006d:
            boolean r10 = f25013a
            if (r10 != 0) goto L_0x0080
            boolean r10 = r6.f24902g
            if (r10 != 0) goto L_0x007a
            boolean r10 = r7.f24902g
            if (r10 != 0) goto L_0x007a
            goto L_0x0080
        L_0x007a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0080:
            r10 = 0
            if (r3 != r4) goto L_0x0084
            return r10
        L_0x0084:
            double r13 = r3.f24971g
            double r11 = r5.f24971g
            double r11 = java.lang.Math.min(r13, r11)
            double r13 = r4.f24971g
            r17 = r7
            double r6 = r8.f24971g
            double r6 = java.lang.Math.max(r13, r6)
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x009b
            return r10
        L_0x009b:
            boolean r6 = p256e.p262f.p263a.C7025j.m36889b(r3, r4)
            if (r6 == 0) goto L_0x00ac
            double r6 = p256e.p262f.p263a.C7025j.m36887b(r8, r3, r4)
            r11 = 0
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x00b7
            return r10
        L_0x00ac:
            r11 = 0
            double r6 = p256e.p262f.p263a.C7025j.m36887b(r5, r4, r3)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b7
            return r10
        L_0x00b7:
            m37028g(r18)
            p256e.p262f.p263a.C7025j.m36884a(r5, r3, r8, r4, r9)
            boolean r6 = f25013a
            if (r6 != 0) goto L_0x00d6
            double r6 = r3.f24971g
            double r11 = r5.f24971g
            double r6 = java.lang.Math.min(r6, r11)
            double r11 = r9.f24971g
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x00d0
            goto L_0x00d6
        L_0x00d0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00d6:
            boolean r6 = f25013a
            if (r6 != 0) goto L_0x00ef
            double r6 = r9.f24971g
            double r11 = r4.f24971g
            double r13 = r8.f24971g
            double r11 = java.lang.Math.max(r11, r13)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x00e9
            goto L_0x00ef
        L_0x00e9:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00ef:
            boolean r6 = f25013a
            if (r6 != 0) goto L_0x0108
            double r6 = r8.f24970f
            double r11 = r5.f24970f
            double r6 = java.lang.Math.min(r6, r11)
            double r11 = r9.f24970f
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0108:
            boolean r6 = f25013a
            if (r6 != 0) goto L_0x0121
            double r6 = r9.f24970f
            double r11 = r4.f24970f
            double r13 = r3.f24970f
            double r11 = java.lang.Math.max(r11, r13)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x011b
            goto L_0x0121
        L_0x011b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0121:
            e.f.a.i r6 = r0.f24948i
            boolean r6 = p256e.p262f.p263a.C7025j.m36889b(r9, r6)
            if (r6 == 0) goto L_0x0135
            e.f.a.i r6 = r0.f24948i
            double r6 = r6.f24970f
            r9.f24970f = r6
            e.f.a.i r6 = r0.f24948i
            double r6 = r6.f24971g
            r9.f24971g = r6
        L_0x0135:
            boolean r6 = p256e.p262f.p263a.C7025j.m36889b(r3, r4)
            if (r6 == 0) goto L_0x013d
            r6 = r3
            goto L_0x013e
        L_0x013d:
            r6 = r4
        L_0x013e:
            boolean r7 = p256e.p262f.p263a.C7025j.m36889b(r6, r9)
            if (r7 == 0) goto L_0x014c
            double r11 = r6.f24970f
            r9.f24970f = r11
            double r6 = r6.f24971g
            r9.f24971g = r6
        L_0x014c:
            boolean r6 = p256e.p262f.p263a.C7025j.m36886a(r9, r3)
            if (r6 != 0) goto L_0x02f9
            boolean r6 = p256e.p262f.p263a.C7025j.m36886a(r9, r4)
            if (r6 == 0) goto L_0x015a
            goto L_0x02f9
        L_0x015a:
            e.f.a.i r6 = r0.f24948i
            boolean r6 = p256e.p262f.p263a.C7025j.m36886a(r5, r6)
            r7 = 0
            r11 = 1
            if (r6 != 0) goto L_0x0171
            e.f.a.i r6 = r0.f24948i
            double r12 = p256e.p262f.p263a.C7025j.m36887b(r5, r6, r9)
            r14 = 0
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x0185
            goto L_0x0173
        L_0x0171:
            r14 = 0
        L_0x0173:
            e.f.a.i r6 = r0.f24948i
            boolean r6 = p256e.p262f.p263a.C7025j.m36886a(r8, r6)
            if (r6 != 0) goto L_0x0281
            e.f.a.i r6 = r0.f24948i
            double r12 = p256e.p262f.p263a.C7025j.m36887b(r8, r6, r9)
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 > 0) goto L_0x0281
        L_0x0185:
            e.f.a.i r3 = r0.f24948i
            if (r8 != r3) goto L_0x01cc
            e.f.a.f r3 = r1.f24919b
            e.f.a.f r3 = p256e.p262f.p263a.C7026k.m36910e(r3)
            if (r3 == 0) goto L_0x01c6
            e.f.a.f r2 = r2.f24919b
            boolean r1 = p256e.p262f.p263a.C7026k.m36905b(r2, r1)
            if (r1 == 0) goto L_0x01c0
            e.f.a.a r1 = m36995a(r19)
            if (r1 == 0) goto L_0x01ba
            e.f.a.a r2 = m37018c(r1)
            e.f.a.f r4 = r2.f24896a
            e.f.a.a r2 = m37018c(r1)
            r6 = r17
            m37013b(r0, r2, r6)
            e.f.a.f r2 = r4.f24919b
            e.f.a.f r2 = r2.f24921d
            r5 = 1
            r0 = r18
            r3 = r4
            m37001a(r0, r1, r2, r3, r4, r5)
            return r11
        L_0x01ba:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x01c0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x01c6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x01cc:
            r6 = r17
            e.f.a.i r3 = r0.f24948i
            if (r5 != r3) goto L_0x021c
            e.f.a.f r3 = r2.f24919b
            e.f.a.f r3 = p256e.p262f.p263a.C7026k.m36910e(r3)
            if (r3 == 0) goto L_0x0216
            e.f.a.f r3 = r1.f24921d
            e.f.a.f r4 = r2.f24919b
            e.f.a.f r4 = r4.f24921d
            boolean r3 = p256e.p262f.p263a.C7026k.m36905b(r3, r4)
            if (r3 == 0) goto L_0x0210
            e.f.a.a r3 = m37012b(r19)
            e.f.a.a r4 = m37018c(r3)
            e.f.a.f r4 = r4.f24896a
            e.f.a.f r4 = r4.f24919b
            e.f.a.f r4 = r4.f24920c
            e.f.a.f r2 = r2.f24919b
            e.f.a.f r2 = r2.f24921d
            r12 = r19
            r12.f24896a = r2
            e.f.a.f r2 = m37013b(r0, r12, r7)
            e.f.a.f r2 = r2.f24920c
            e.f.a.f r1 = r1.f24919b
            e.f.a.f r5 = r1.f24920c
            r6 = 1
            r0 = r18
            r1 = r3
            r3 = r5
            r5 = r6
            m37001a(r0, r1, r2, r3, r4, r5)
            return r11
        L_0x0210:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0216:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x021c:
            r12 = r19
            e.f.a.i r3 = r0.f24948i
            double r3 = p256e.p262f.p263a.C7025j.m36887b(r5, r3, r9)
            r13 = 0
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x0251
            e.f.a.a r3 = m37021d(r19)
            r12.f24901f = r11
            r3.f24901f = r11
            e.f.a.f r3 = r1.f24919b
            e.f.a.f r3 = p256e.p262f.p263a.C7026k.m36910e(r3)
            if (r3 == 0) goto L_0x024b
            e.f.a.i r3 = r1.f24922e
            e.f.a.i r4 = r0.f24948i
            double r4 = r4.f24970f
            r3.f24970f = r4
            e.f.a.i r1 = r1.f24922e
            e.f.a.i r3 = r0.f24948i
            double r3 = r3.f24971g
            r1.f24971g = r3
            goto L_0x0251
        L_0x024b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0251:
            e.f.a.i r1 = r0.f24948i
            double r3 = p256e.p262f.p263a.C7025j.m36887b(r8, r1, r9)
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0280
            r6.f24901f = r11
            r12.f24901f = r11
            e.f.a.f r1 = r2.f24919b
            e.f.a.f r1 = p256e.p262f.p263a.C7026k.m36910e(r1)
            if (r1 == 0) goto L_0x027a
            e.f.a.i r1 = r2.f24922e
            e.f.a.i r3 = r0.f24948i
            double r3 = r3.f24970f
            r1.f24970f = r3
            e.f.a.i r1 = r2.f24922e
            e.f.a.i r0 = r0.f24948i
            double r2 = r0.f24971g
            r1.f24971g = r2
            goto L_0x0280
        L_0x027a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0280:
            return r10
        L_0x0281:
            r6 = r17
            r12 = r19
            e.f.a.f r13 = r1.f24919b
            e.f.a.f r13 = p256e.p262f.p263a.C7026k.m36910e(r13)
            if (r13 == 0) goto L_0x02f3
            e.f.a.f r13 = r2.f24919b
            e.f.a.f r13 = p256e.p262f.p263a.C7026k.m36910e(r13)
            if (r13 == 0) goto L_0x02ed
            e.f.a.f r2 = r2.f24919b
            e.f.a.f r2 = r2.f24921d
            boolean r2 = p256e.p262f.p263a.C7026k.m36905b(r2, r1)
            if (r2 == 0) goto L_0x02e7
            e.f.a.i r2 = r1.f24922e
            double r13 = r9.f24970f
            r2.f24970f = r13
            e.f.a.i r2 = r1.f24922e
            double r13 = r9.f24971g
            r2.f24971g = r13
            e.f.a.i r2 = r1.f24922e
            e.f.a.q r9 = r0.f24947h
            e.f.a.i r13 = r1.f24922e
            int r9 = r9.mo22159a(r13)
            r2.f24972h = r9
            e.f.a.i r2 = r1.f24922e
            int r2 = r2.f24972h
            long r13 = (long) r2
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 == 0) goto L_0x02da
            e.f.a.i r1 = r1.f24922e
            r0 = r18
            r2 = r3
            r3 = r5
            r5 = r8
            m37005a(r0, r1, r2, r3, r4, r5)
            e.f.a.a r0 = m37021d(r19)
            r6.f24901f = r11
            r12.f24901f = r11
            r0.f24901f = r11
            return r10
        L_0x02da:
            e.f.a.q r1 = r0.f24947h
            r1.mo22160a()
            r0.f24947h = r7
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x02e7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x02ed:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x02f3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x02f9:
            r12 = r19
            m37023d(r18, r19)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p256e.p262f.p263a.C7047u.m37027f(e.f.a.h, e.f.a.a):boolean");
    }

    /* renamed from: g */
    static void m37029g(C7023h hVar, C7015a aVar) {
        C7015a aVar2;
        C7015a c = m37018c(aVar);
        loop0:
        while (true) {
            C7015a aVar3 = c;
            C7015a aVar4 = aVar;
            aVar = aVar3;
            while (!aVar.f24901f) {
                if (!aVar4.f24901f) {
                    aVar2 = m37021d(aVar4);
                    if (aVar2 == null || !aVar2.f24901f) {
                    }
                } else {
                    C7015a aVar5 = aVar4;
                    aVar4 = aVar;
                    aVar2 = aVar5;
                }
                aVar2.f24901f = false;
                C7021f fVar = aVar2.f24896a;
                C7021f fVar2 = aVar4.f24896a;
                if (fVar.f24919b.f24922e != fVar2.f24919b.f24922e && m37025e(hVar, aVar2)) {
                    if (aVar4.f24902g) {
                        m37000a(hVar, aVar4);
                        if (C7026k.m36908c(fVar2)) {
                            aVar4 = m37018c(aVar2);
                            fVar2 = aVar4.f24896a;
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (aVar2.f24902g) {
                        m37000a(hVar, aVar2);
                        if (C7026k.m36908c(fVar)) {
                            aVar2 = m37021d(aVar4);
                            fVar = aVar2.f24896a;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
                C7015a aVar6 = aVar4;
                aVar4 = aVar2;
                aVar = aVar6;
                if (fVar.f24922e != fVar2.f24922e) {
                    if (fVar.f24919b.f24922e == fVar2.f24919b.f24922e || aVar4.f24902g || aVar.f24902g || !(fVar.f24919b.f24922e == hVar.f24948i || fVar2.f24919b.f24922e == hVar.f24948i)) {
                        m37023d(hVar, aVar4);
                    } else if (m37027f(hVar, aVar4)) {
                        return;
                    }
                }
                if (fVar.f24922e == fVar2.f24922e && fVar.f24919b.f24922e == fVar2.f24919b.f24922e) {
                    m36997a(fVar2, fVar);
                    m37000a(hVar, aVar4);
                    if (C7026k.m36908c(fVar)) {
                        aVar4 = m37021d(aVar);
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            c = m37018c(aVar);
        }
    }

    /* renamed from: b */
    static void m37016b(C7023h hVar, C7015a aVar, C7021f fVar) {
        C7021f fVar2;
        boolean z;
        C7021f fVar3 = fVar.f24920c;
        C7015a c = m37018c(aVar);
        C7021f fVar4 = aVar.f24896a;
        C7021f fVar5 = c.f24896a;
        if (fVar4.f24919b.f24922e != fVar5.f24919b.f24922e) {
            m37027f(hVar, aVar);
        }
        if (!C7025j.m36886a(fVar4.f24922e, hVar.f24948i)) {
            z = false;
            fVar2 = fVar3;
        } else if (C7026k.m36905b(fVar3.f24919b.f24921d, fVar4)) {
            aVar = m36995a(aVar);
            if (aVar != null) {
                C7021f fVar6 = m37018c(aVar).f24896a;
                m37013b(hVar, m37018c(aVar), c);
                fVar2 = fVar6;
                z = true;
            } else {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
        if (C7025j.m36886a(fVar5.f24922e, hVar.f24948i)) {
            if (C7026k.m36905b(fVar, fVar5.f24919b.f24921d)) {
                fVar = m37013b(hVar, c, (C7015a) null);
                z = true;
            } else {
                throw new RuntimeException();
            }
        }
        if (z) {
            m37001a(hVar, aVar, fVar.f24920c, fVar2, fVar2, true);
            return;
        }
        if (C7025j.m36889b(fVar5.f24922e, fVar4.f24922e)) {
            fVar4 = fVar5.f24919b.f24921d;
        }
        C7021f c2 = C7026k.m36906c(fVar.f24920c.f24919b, fVar4);
        if (c2 != null) {
            m37001a(hVar, aVar, c2, c2.f24920c, c2.f24920c, false);
            c2.f24919b.f24924g.f24902g = true;
            m37029g(hVar, aVar);
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: a */
    static void m37002a(C7023h hVar, C7015a aVar, C7024i iVar) {
        C7021f fVar = aVar.f24896a;
        if (C7025j.m36886a(fVar.f24922e, iVar)) {
            if (f25013a) {
                m37003a(hVar, fVar, iVar.f24967c);
                return;
            }
            throw new AssertionError();
        } else if (!C7025j.m36886a(fVar.f24919b.f24922e, iVar)) {
            if (C7026k.m36910e(fVar.f24919b) != null) {
                if (aVar.f24902g) {
                    if (C7026k.m36908c(fVar.f24920c)) {
                        aVar.f24902g = false;
                    } else {
                        throw new RuntimeException();
                    }
                }
                if (C7026k.m36905b(iVar.f24967c, fVar)) {
                    m37017b(hVar, iVar);
                    return;
                }
                throw new RuntimeException();
            }
            throw new RuntimeException();
        } else if (f25013a) {
            C7015a b = m37012b(aVar);
            C7015a c = m37018c(b);
            C7021f fVar2 = c.f24896a.f24919b;
            C7021f fVar3 = fVar2.f24920c;
            if (c.f24902g) {
                if (f25013a || fVar3 != fVar2) {
                    m37000a(hVar, c);
                    if (C7026k.m36908c(fVar2)) {
                        fVar2 = fVar3.f24919b.f24921d;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    throw new AssertionError();
                }
            }
            if (C7026k.m36905b(iVar.f24967c, fVar2)) {
                m37001a(hVar, b, fVar2.f24920c, fVar3, !C7025j.m36885a(fVar3) ? null : fVar3, true);
                return;
            }
            throw new RuntimeException();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    static void m37004a(C7023h hVar, C7024i iVar) {
        C7021f fVar;
        C7015a aVar = new C7015a();
        aVar.f24896a = iVar.f24967c.f24919b;
        C7015a aVar2 = (C7015a) C7017c.m36854a(C7017c.m36858b(hVar.f24946g, aVar));
        C7015a c = m37018c(aVar2);
        C7021f fVar2 = aVar2.f24896a;
        C7021f fVar3 = c.f24896a;
        if (C7025j.m36887b(fVar2.f24919b.f24922e, iVar, fVar2.f24922e) == 0.0d) {
            m37002a(hVar, aVar2, iVar);
            return;
        }
        if (C7025j.m36889b(fVar3.f24919b.f24922e, fVar2.f24919b.f24922e)) {
            c = aVar2;
        }
        if (aVar2.f24899d || c.f24902g) {
            if (c == aVar2) {
                fVar = C7026k.m36906c(iVar.f24967c.f24919b, fVar2.f24921d);
                if (fVar == null) {
                    throw new RuntimeException();
                }
            } else {
                C7021f c2 = C7026k.m36906c(fVar3.f24919b.f24920c.f24919b, iVar.f24967c);
                if (c2 != null) {
                    fVar = c2.f24919b;
                } else {
                    throw new RuntimeException();
                }
            }
            if (!c.f24902g) {
                m37015b(hVar, m36996a(hVar, aVar2, fVar));
            } else if (!m37008a(c, fVar)) {
                throw new RuntimeException();
            }
            m37017b(hVar, iVar);
        } else {
            m37001a(hVar, aVar2, iVar.f24967c, iVar.f24967c, (C7021f) null, true);
        }
    }

    /* renamed from: b */
    static void m37017b(C7023h hVar, C7024i iVar) {
        hVar.f24948i = iVar;
        m37028g(hVar);
        C7021f fVar = iVar.f24967c;
        while (fVar.f24924g == null) {
            fVar = fVar.f24920c;
            if (fVar == iVar.f24967c) {
                m37004a(hVar, iVar);
                return;
            }
        }
        C7015a a = m36995a(fVar.f24924g);
        if (a != null) {
            C7015a c = m37018c(a);
            C7021f fVar2 = c.f24896a;
            C7021f b = m37013b(hVar, c, (C7015a) null);
            if (b.f24920c == fVar2) {
                m37016b(hVar, a, b);
            } else {
                m37001a(hVar, a, b.f24920c, fVar2, fVar2, true);
            }
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: a */
    static void m36999a(C7023h hVar, double d) {
        C7015a aVar = new C7015a();
        C7021f a = C7026k.m36896a(hVar.f24940a);
        if (a != null) {
            a.f24922e.f24970f = 4.0E150d;
            a.f24922e.f24971g = d;
            a.f24919b.f24922e.f24970f = -4.0E150d;
            a.f24919b.f24922e.f24971g = d;
            hVar.f24948i = a.f24919b.f24922e;
            aVar.f24896a = a;
            aVar.f24898c = 0;
            aVar.f24899d = false;
            aVar.f24902g = false;
            aVar.f24900e = true;
            aVar.f24901f = false;
            aVar.f24897b = C7017c.m36853a(hVar.f24946g, (Object) aVar);
            if (aVar.f24897b == null) {
                throw new RuntimeException();
            }
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: a */
    static void m36998a(final C7023h hVar) {
        hVar.f24946g = C7017c.m36851a((Object) hVar, (C7018a) new C7018a() {
            /* renamed from: a */
            public boolean mo22133a(Object obj, Object obj2, Object obj3) {
                return C7047u.m37011a(hVar, (C7015a) obj2, (C7015a) obj3);
            }
        });
        if (hVar.f24946g != null) {
            m36999a(hVar, -4.0E150d);
            m36999a(hVar, 4.0E150d);
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: b */
    static void m37014b(C7023h hVar) {
        int i = 0;
        while (true) {
            C7015a aVar = (C7015a) C7017c.m36854a(C7017c.m36857b(hVar.f24946g));
            if (aVar != null) {
                if (!aVar.f24900e) {
                    if (!f25013a && !aVar.f24902g) {
                        throw new AssertionError();
                    } else if (!f25013a) {
                        i++;
                        if (i != 1) {
                            throw new AssertionError();
                        }
                    }
                }
                if (f25013a || aVar.f24898c == 0) {
                    m37000a(hVar, aVar);
                } else {
                    throw new AssertionError();
                }
            } else {
                C7017c.m36855a(hVar.f24946g);
                return;
            }
        }
    }

    /* renamed from: c */
    static void m37019c(C7023h hVar) {
        C7021f fVar;
        C7021f fVar2;
        C7021f fVar3 = hVar.f24940a.f24929c;
        for (C7021f fVar4 = fVar3.f24918a; fVar4 != fVar3; fVar4 = fVar) {
            fVar = fVar4.f24918a;
            C7021f fVar5 = fVar4.f24921d;
            if (!C7025j.m36886a(fVar4.f24922e, fVar4.f24919b.f24922e) || fVar4.f24921d.f24921d == fVar4) {
                C7021f fVar6 = fVar5;
                fVar5 = fVar4;
                fVar2 = fVar6;
            } else {
                m37003a(hVar, fVar5, fVar4);
                if (C7026k.m36908c(fVar4)) {
                    fVar2 = fVar5.f24921d;
                } else {
                    throw new RuntimeException();
                }
            }
            if (fVar2.f24921d == fVar5) {
                if (fVar2 != fVar5) {
                    if (fVar2 == fVar || fVar2 == fVar.f24919b) {
                        fVar = fVar.f24918a;
                    }
                    if (!C7026k.m36908c(fVar2)) {
                        throw new RuntimeException();
                    }
                }
                if (fVar5 == fVar || fVar5 == fVar.f24919b) {
                    fVar = fVar.f24918a;
                }
                if (!C7026k.m36908c(fVar5)) {
                    throw new RuntimeException();
                }
            }
        }
    }

    /* renamed from: d */
    static boolean m37022d(C7023h hVar) {
        C7032q a = C7032q.m36949a((C7033a) new C7033a() {
        });
        hVar.f24947h = a;
        if (a == null) {
            return false;
        }
        C7024i iVar = hVar.f24940a.f24927a;
        C7024i iVar2 = iVar.f24965a;
        while (iVar2 != iVar) {
            iVar2.f24972h = a.mo22159a((Object) iVar2);
            if (((long) iVar2.f24972h) == Long.MAX_VALUE) {
                break;
            }
            iVar2 = iVar2.f24965a;
        }
        if (iVar2 == iVar && a.mo22162b()) {
            return true;
        }
        hVar.f24947h.mo22160a();
        hVar.f24947h = null;
        return false;
    }

    /* renamed from: e */
    static void m37024e(C7023h hVar) {
        hVar.f24947h.mo22160a();
    }

    /* renamed from: a */
    static boolean m37009a(C7022g gVar) {
        C7020e eVar = gVar.f24928b.f24911a;
        while (eVar != gVar.f24928b) {
            C7020e eVar2 = eVar.f24911a;
            C7021f fVar = eVar.f24913c;
            if (f25013a || fVar.f24921d != fVar) {
                if (fVar.f24921d.f24921d == fVar) {
                    m36997a(fVar.f24920c, fVar);
                    if (!C7026k.m36908c(fVar)) {
                        return false;
                    }
                }
                eVar = eVar2;
            } else {
                throw new AssertionError();
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m37026f(C7023h hVar) {
        hVar.f24945f = false;
        m37019c(hVar);
        if (!m37022d(hVar)) {
            return false;
        }
        m36998a(hVar);
        while (true) {
            C7024i iVar = (C7024i) hVar.f24947h.mo22163c();
            if (iVar == null) {
                break;
            }
            while (true) {
                C7024i iVar2 = (C7024i) hVar.f24947h.mo22164d();
                if (iVar2 == null || !C7025j.m36886a(iVar2, iVar)) {
                    m37017b(hVar, iVar);
                } else {
                    m37003a(hVar, iVar.f24967c, ((C7024i) hVar.f24947h.mo22163c()).f24967c);
                }
            }
            m37017b(hVar, iVar);
        }
        hVar.f24948i = ((C7015a) C7017c.m36854a(C7017c.m36857b(hVar.f24946g))).f24896a.f24922e;
        m37028g(hVar);
        m37014b(hVar);
        m37024e(hVar);
        if (!m37009a(hVar.f24940a)) {
            return false;
        }
        C7026k.m36907c(hVar.f24940a);
        return true;
    }
}
