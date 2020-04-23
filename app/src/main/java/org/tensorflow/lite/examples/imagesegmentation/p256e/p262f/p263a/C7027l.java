package p256e.p262f.p263a;

/* renamed from: e.f.a.l */
/* compiled from: Normal */
class C7027l {

    /* renamed from: a */
    static boolean f24975a = false;

    /* renamed from: b */
    static double f24976b;

    /* renamed from: c */
    static double f24977c;

    /* renamed from: d */
    static final /* synthetic */ boolean f24978d = (!C7027l.class.desiredAssertionStatus());

    static {
        if (f24975a) {
            f24976b = 0.5094153956495538d;
            f24977c = 0.8605207462201063d;
            return;
        }
        f24976b = 1.0d;
        f24977c = 0.0d;
    }

    private C7027l() {
    }

    /* renamed from: a */
    private static double m36911a(double[] dArr, double[] dArr2) {
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    /* renamed from: a */
    static int m36912a(double[] dArr) {
        int i = 1;
        if (Math.abs(dArr[1]) <= Math.abs(dArr[0])) {
            i = 0;
        }
        if (Math.abs(dArr[2]) > Math.abs(dArr[i])) {
            return 2;
        }
        return i;
    }

    /* renamed from: a */
    static void m36914a(C7023h hVar, double[] dArr) {
        C7024i iVar = hVar.f24940a.f24927a;
        double[] dArr2 = {-2.0E150d, -2.0E150d, -2.0E150d};
        double[] dArr3 = {2.0E150d, 2.0E150d, 2.0E150d};
        C7024i[] iVarArr = new C7024i[3];
        C7024i[] iVarArr2 = new C7024i[3];
        double[] dArr4 = new double[3];
        double[] dArr5 = new double[3];
        double[] dArr6 = new double[3];
        C7024i iVar2 = iVar.f24965a;
        while (true) {
            if (iVar2 == iVar) {
                break;
            }
            for (int i = 0; i < 3; i++) {
                double d = iVar2.f24969e[i];
                if (d < dArr3[i]) {
                    dArr3[i] = d;
                    iVarArr[i] = iVar2;
                }
                if (d > dArr2[i]) {
                    dArr2[i] = d;
                    iVarArr2[i] = iVar2;
                }
            }
            iVar2 = iVar2.f24965a;
        }
        char c = dArr2[1] - dArr3[1] > dArr2[0] - dArr3[0] ? (char) 1 : 0;
        if (dArr2[2] - dArr3[2] > dArr2[c] - dArr3[c]) {
            c = 2;
        }
        if (dArr3[c] >= dArr2[c]) {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 1.0d;
            return;
        }
        C7024i iVar3 = iVarArr[c];
        C7024i iVar4 = iVarArr2[c];
        dArr4[0] = iVar3.f24969e[0] - iVar4.f24969e[0];
        dArr4[1] = iVar3.f24969e[1] - iVar4.f24969e[1];
        dArr4[2] = iVar3.f24969e[2] - iVar4.f24969e[2];
        double d2 = 0.0d;
        for (C7024i iVar5 = iVar.f24965a; iVar5 != iVar; iVar5 = iVar5.f24965a) {
            dArr5[0] = iVar5.f24969e[0] - iVar4.f24969e[0];
            dArr5[1] = iVar5.f24969e[1] - iVar4.f24969e[1];
            dArr5[2] = iVar5.f24969e[2] - iVar4.f24969e[2];
            dArr6[0] = (dArr4[1] * dArr5[2]) - (dArr4[2] * dArr5[1]);
            dArr6[1] = (dArr4[2] * dArr5[0]) - (dArr4[0] * dArr5[2]);
            dArr6[2] = (dArr4[0] * dArr5[1]) - (dArr4[1] * dArr5[0]);
            double d3 = (dArr6[0] * dArr6[0]) + (dArr6[1] * dArr6[1]) + (dArr6[2] * dArr6[2]);
            if (d3 > d2) {
                dArr[0] = dArr6[0];
                dArr[1] = dArr6[1];
                dArr[2] = dArr6[2];
                d2 = d3;
            }
        }
        if (d2 <= 0.0d) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[m36912a(dArr4)] = 1.0d;
        }
    }

    /* renamed from: a */
    static void m36913a(C7023h hVar) {
        C7020e eVar = hVar.f24940a.f24928b;
        C7024i iVar = hVar.f24940a.f24927a;
        double d = 0.0d;
        for (C7020e eVar2 = eVar.f24911a; eVar2 != eVar; eVar2 = eVar2.f24911a) {
            C7021f fVar = eVar2.f24913c;
            if (fVar.f24925h > 0) {
                do {
                    d += (fVar.f24922e.f24970f - fVar.f24919b.f24922e.f24970f) * (fVar.f24922e.f24971g + fVar.f24919b.f24922e.f24971g);
                    fVar = fVar.f24921d;
                } while (fVar != eVar2.f24913c);
            }
        }
        if (d < 0.0d) {
            for (C7024i iVar2 = iVar.f24965a; iVar2 != iVar; iVar2 = iVar2.f24965a) {
                iVar2.f24971g = -iVar2.f24971g;
            }
            hVar.f24943d[0] = -hVar.f24943d[0];
            hVar.f24943d[1] = -hVar.f24943d[1];
            hVar.f24943d[2] = -hVar.f24943d[2];
        }
    }

    /* renamed from: b */
    public static void m36915b(C7023h hVar) {
        C7024i iVar = hVar.f24940a.f24927a;
        boolean z = false;
        double[] dArr = {hVar.f24941b[0], hVar.f24941b[1], hVar.f24941b[2]};
        if (dArr[0] == 0.0d && dArr[1] == 0.0d && dArr[2] == 0.0d) {
            m36914a(hVar, dArr);
            z = true;
        }
        double[] dArr2 = hVar.f24942c;
        double[] dArr3 = hVar.f24943d;
        int a = m36912a(dArr);
        dArr2[a] = 0.0d;
        int i = (a + 1) % 3;
        dArr2[i] = f24976b;
        int i2 = (a + 2) % 3;
        dArr2[i2] = f24977c;
        dArr3[a] = 0.0d;
        dArr3[i] = dArr[a] > 0.0d ? -f24977c : f24977c;
        dArr3[i2] = dArr[a] > 0.0d ? f24976b : -f24976b;
        for (C7024i iVar2 = iVar.f24965a; iVar2 != iVar; iVar2 = iVar2.f24965a) {
            iVar2.f24970f = m36911a(iVar2.f24969e, dArr2);
            iVar2.f24971g = m36911a(iVar2.f24969e, dArr3);
        }
        if (z) {
            m36913a(hVar);
        }
    }
}
