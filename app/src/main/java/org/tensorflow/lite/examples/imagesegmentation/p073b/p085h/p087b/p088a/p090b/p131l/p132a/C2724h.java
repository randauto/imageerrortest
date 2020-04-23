package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p073b.C3219n;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1820x;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p120a.p121a.C2489b;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2512n;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2758ag;
import p073b.p085h.p087b.p088a.p090b.p131l.C2763aj;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2768ao;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2786ax;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2825n;
import p073b.p085h.p087b.p088a.p090b.p131l.C2834q;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2840v;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2734c;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2734c.C2735a;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2734c.C2736b;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2734c.C2737c;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;
import p073b.p085h.p087b.p088a.p090b.p139n.C2908i;

/* renamed from: b.h.b.a.b.l.a.h */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C2724h implements C2717c {

    /* renamed from: b */
    public static final C2724h f7971b = new C2724h();

    private C2724h() {
    }

    /* renamed from: a */
    public boolean mo9823a(C2841w wVar, C2841w wVar2) {
        C1489j.m6972b(wVar, "subtype");
        C1489j.m6972b(wVar2, "supertype");
        return mo9838b(new C2731o(true, false, 2, null), wVar.mo9892l(), wVar2.mo9892l());
    }

    /* renamed from: b */
    public boolean mo9824b(C2841w wVar, C2841w wVar2) {
        C1489j.m6972b(wVar, "a");
        C1489j.m6972b(wVar2, "b");
        return mo9837a(new C2731o(false, false, 2, null), wVar.mo9892l(), wVar2.mo9892l());
    }

    /* renamed from: a */
    public final boolean mo9837a(C2731o oVar, C2788az azVar, C2788az azVar2) {
        C1489j.m6972b(oVar, "$receiver");
        C1489j.m6972b(azVar, "a");
        C1489j.m6972b(azVar2, "b");
        boolean z = true;
        if (azVar == azVar2) {
            return true;
        }
        C2841w wVar = azVar;
        if (m13377b(wVar)) {
            C2841w wVar2 = azVar2;
            if (m13377b(wVar2)) {
                if (!oVar.mo9848a(azVar.mo9507g(), azVar2.mo9507g())) {
                    return false;
                }
                if (azVar.mo9501a().isEmpty()) {
                    if (m13374a(wVar) || m13374a(wVar2)) {
                        return true;
                    }
                    if (azVar.mo7897c() != azVar2.mo7897c()) {
                        z = false;
                    }
                    return z;
                }
            }
        }
        if (!mo9838b(oVar, azVar, azVar2) || !mo9838b(oVar, azVar2, azVar)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private final boolean m13374a(C2841w wVar) {
        return C2838t.m13860c(wVar).mo7897c() != C2838t.m13861d(wVar).mo7897c();
    }

    /* renamed from: b */
    private final boolean m13377b(C2841w wVar) {
        return wVar.mo9507g().mo7097f() && !C2825n.m13766a(wVar) && !C2758ag.m13481c(wVar) && C1489j.m6971a((Object) C2838t.m13860c(wVar).mo9507g(), (Object) C2838t.m13861d(wVar).mo9507g());
    }

    /* renamed from: b */
    public final boolean mo9838b(C2731o oVar, C2788az azVar, C2788az azVar2) {
        C1489j.m6972b(oVar, "$receiver");
        C1489j.m6972b(azVar, "subType");
        C1489j.m6972b(azVar2, "superType");
        if (azVar == azVar2) {
            return true;
        }
        C2788az a = mo9834a(azVar);
        C2788az a2 = mo9834a(azVar2);
        C2841w wVar = a;
        C2841w wVar2 = a2;
        Boolean a3 = m13369a(oVar, C2838t.m13860c(wVar), C2838t.m13861d(wVar2));
        if (a3 != null) {
            boolean booleanValue = a3.booleanValue();
            oVar.mo9847a(a, a2);
            return booleanValue;
        }
        Boolean a4 = oVar.mo9847a(a, a2);
        if (a4 != null) {
            return a4.booleanValue();
        }
        return m13376b(oVar, C2838t.m13860c(wVar), C2838t.m13861d(wVar2));
    }

    /* renamed from: a */
    public final C2755ad mo9833a(C2755ad adVar) {
        C1489j.m6972b(adVar, "type");
        C2767an g = adVar.mo9507g();
        boolean z = false;
        if (g instanceof C2489b) {
            C2489b bVar = (C2489b) g;
            C2771ap h = bVar.mo9512h();
            if (h.mo9868b() == C2792ba.IN_VARIANCE) {
                z = true;
            }
            C2788az azVar = null;
            if (!z) {
                h = null;
            }
            if (h != null) {
                C2841w c = h.mo9869c();
                if (c != null) {
                    azVar = c.mo9892l();
                }
            }
            C2788az azVar2 = azVar;
            if (bVar.mo9509a() == null) {
                C2771ap h2 = bVar.mo9512h();
                Iterable<C2841w> C_ = bVar.mo7405C_();
                Collection arrayList = new ArrayList(C1415k.m6842a(C_, 10));
                for (C2841w l : C_) {
                    arrayList.add(l.mo9892l());
                }
                bVar.mo9510a(new C2722f(h2, (List) arrayList));
            }
            C2715a aVar = C2715a.FOR_SUBTYPING;
            C2722f a = bVar.mo9509a();
            if (a == null) {
                C1489j.m6968a();
            }
            C2721e eVar = new C2721e(aVar, a, azVar2, adVar.mo7086x(), adVar.mo7897c());
            return eVar;
        } else if (g instanceof C2512n) {
            Iterable<C2841w> C_2 = ((C2512n) g).mo7405C_();
            Collection arrayList2 = new ArrayList(C1415k.m6842a(C_2, 10));
            for (C2841w a2 : C_2) {
                arrayList2.add(C2783av.m13571a(a2, adVar.mo7897c()));
            }
            return C2842x.m13882a(adVar.mo7086x(), new C2840v((List) arrayList2), C1415k.m6837a(), false, adVar.mo7787b());
        } else if (!(g instanceof C2840v) || !adVar.mo7897c()) {
            return adVar;
        } else {
            Collection C_3 = ((C2840v) g).mo7405C_();
            C1489j.m6969a((Object) C_3, "constructor.supertypes");
            Iterable<C2841w> iterable = C_3;
            Collection arrayList3 = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C2841w wVar : iterable) {
                C1489j.m6969a((Object) wVar, "it");
                arrayList3.add(C2803a.m13679b(wVar));
            }
            C2840v vVar = new C2840v((List) arrayList3);
            C1659h x = adVar.mo7086x();
            C2767an anVar = vVar;
            List a3 = C1415k.m6837a();
            C2560h a4 = vVar.mo9951a();
            C1489j.m6969a((Object) a4, "newConstructor.createScopeForKotlinType()");
            return C2842x.m13882a(x, anVar, a3, false, a4);
        }
    }

    /* renamed from: a */
    public final C2788az mo9834a(C2788az azVar) {
        C2788az azVar2;
        C1489j.m6972b(azVar, "type");
        if (azVar instanceof C2755ad) {
            azVar2 = mo9833a((C2755ad) azVar);
        } else if (azVar instanceof C2834q) {
            C2834q qVar = (C2834q) azVar;
            C2755ad a = mo9833a(qVar.mo9945f());
            C2755ad a2 = mo9833a(qVar.mo9946h());
            if (a == qVar.mo9945f() && a2 == qVar.mo9946h()) {
                azVar2 = azVar;
            } else {
                azVar2 = C2842x.m13883a(a, a2);
            }
        } else {
            throw new C3219n();
        }
        return C2786ax.m13593a(azVar2, azVar);
    }

    /* renamed from: a */
    private final Boolean m13369a(C2731o oVar, C2755ad adVar, C2755ad adVar2) {
        boolean z = true;
        if (C2843y.m13884a(adVar) || C2843y.m13884a(adVar2)) {
            if (oVar.mo9850b()) {
                return Boolean.valueOf(true);
            }
            if (!adVar.mo7897c() || adVar2.mo7897c()) {
                return Boolean.valueOf(C2729m.f7976a.mo9841a(adVar.mo7894a(false), adVar2.mo7894a(false)));
            }
            return Boolean.valueOf(false);
        } else if ((adVar instanceof C2763aj) || (adVar2 instanceof C2763aj)) {
            return Boolean.valueOf(true);
        } else {
            if (adVar2 instanceof C2721e) {
                C2721e eVar = (C2721e) adVar2;
                if (eVar.mo9829e() != null) {
                    switch (C2725i.f7972a[oVar.mo9845a(adVar, eVar).ordinal()]) {
                        case 1:
                            return Boolean.valueOf(mo9838b(oVar, (C2788az) adVar, eVar.mo9829e()));
                        case 2:
                            if (mo9838b(oVar, (C2788az) adVar, eVar.mo9829e())) {
                                return Boolean.valueOf(true);
                            }
                            break;
                    }
                }
            }
            C2767an g = adVar2.mo9507g();
            if (!(g instanceof C2840v)) {
                g = null;
            }
            C2840v vVar = (C2840v) g;
            if (vVar == null) {
                return null;
            }
            boolean z2 = !adVar2.mo7897c();
            if (!C3232z.f8648a || z2) {
                Collection C_ = vVar.mo7405C_();
                C1489j.m6969a((Object) C_, "it.supertypes");
                Iterable iterable = C_;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!f7971b.mo9838b(oVar, (C2788az) adVar, ((C2841w) it.next()).mo9892l())) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Intersection type should not be marked nullable!: ");
            sb.append(adVar2);
            throw new AssertionError(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m13376b(p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o r17, p073b.p085h.p087b.p088a.p090b.p131l.C2755ad r18, p073b.p085h.p087b.p088a.p090b.p131l.C2755ad r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2726j.m13388b(r18)
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x0022
            boolean r4 = p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2726j.m13389c(r18)
            if (r4 != 0) goto L_0x0022
            r4 = r2
            b.h.b.a.b.l.az r4 = (p073b.p085h.p087b.p088a.p090b.p131l.C2788az) r4
            boolean r4 = r1.mo9849a(r4)
            if (r4 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r4 = 0
            goto L_0x0023
        L_0x0022:
            r4 = 1
        L_0x0023:
            boolean r7 = p073b.C3232z.f8648a
            if (r7 == 0) goto L_0x0043
            if (r4 == 0) goto L_0x002a
            goto L_0x0043
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Not singleClassifierType and not intersection subType: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x0043:
            boolean r4 = p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2726j.m13388b(r19)
            if (r4 != 0) goto L_0x0055
            r4 = r3
            b.h.b.a.b.l.az r4 = (p073b.p085h.p087b.p088a.p090b.p131l.C2788az) r4
            boolean r4 = r1.mo9849a(r4)
            if (r4 == 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r4 = 0
            goto L_0x0056
        L_0x0055:
            r4 = 1
        L_0x0056:
            boolean r7 = p073b.C3232z.f8648a
            if (r7 == 0) goto L_0x0076
            if (r4 == 0) goto L_0x005d
            goto L_0x0076
        L_0x005d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not singleClassifierType superType: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x0076:
            b.h.b.a.b.l.a.l r4 = p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2728l.f7975a
            boolean r4 = r4.mo9839a(r1, r2, r3)
            if (r4 != 0) goto L_0x007f
            return r6
        L_0x007f:
            b.h.b.a.b.l.an r4 = r19.mo9507g()
            b.h.b.a.b.l.an r7 = r18.mo9507g()
            boolean r7 = p073b.p079e.p081b.C1489j.m6971a(r7, r4)
            if (r7 == 0) goto L_0x0098
            java.util.List r7 = r4.mo7094b()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0098
            return r5
        L_0x0098:
            r7 = r3
            b.h.b.a.b.l.w r7 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r7
            boolean r7 = p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a.m13681d(r7)
            if (r7 == 0) goto L_0x00a2
            return r5
        L_0x00a2:
            java.util.List r7 = r0.mo9836a(r1, r2, r4)
            int r8 = r7.size()
            switch(r8) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x00bd;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            b.h.b.a.b.l.a.o$b r8 = r17.mo9846a()
            int[] r9 = p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2725i.f7973b
            int r8 = r8.ordinal()
            r8 = r9[r8]
            switch(r8) {
                case 1: goto L_0x0112;
                case 2: goto L_0x0103;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00d1;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            goto L_0x0113
        L_0x00bd:
            java.lang.Object r2 = p073b.p074a.C1415k.m6883f(r7)
            b.h.b.a.b.l.ad r2 = (p073b.p085h.p087b.p088a.p090b.p131l.C2755ad) r2
            java.util.List r2 = r2.mo9501a()
            boolean r1 = r0.m13373a(r1, r2, r3)
            return r1
        L_0x00cc:
            boolean r1 = r16.m13372a(r17, r18)
            return r1
        L_0x00d1:
            r8 = r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x00e3
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00e3
        L_0x00e1:
            r8 = 0
            goto L_0x0100
        L_0x00e3:
            java.util.Iterator r8 = r8.iterator()
        L_0x00e7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e1
            java.lang.Object r9 = r8.next()
            b.h.b.a.b.l.ad r9 = (p073b.p085h.p087b.p088a.p090b.p131l.C2755ad) r9
            b.h.b.a.b.l.a.h r10 = f7971b
            java.util.List r9 = r9.mo9501a()
            boolean r9 = r10.m13373a(r1, r9, r3)
            if (r9 == 0) goto L_0x00e7
            r8 = 1
        L_0x0100:
            if (r8 == 0) goto L_0x0113
            return r5
        L_0x0103:
            java.lang.Object r2 = p073b.p074a.C1415k.m6883f(r7)
            b.h.b.a.b.l.ad r2 = (p073b.p085h.p087b.p088a.p090b.p131l.C2755ad) r2
            java.util.List r2 = r2.mo9501a()
            boolean r1 = r0.m13373a(r1, r2, r3)
            return r1
        L_0x0112:
            return r6
        L_0x0113:
            b.h.b.a.b.l.a.o$b r8 = r17.mo9846a()
            b.h.b.a.b.l.a.o$b r9 = p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2731o.C2733b.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
            if (r8 == r9) goto L_0x011c
            return r6
        L_0x011c:
            java.util.List r4 = r4.mo7094b()
            java.lang.String r8 = "superConstructor.parameters"
            p073b.p079e.p081b.C1489j.m6969a(r4, r8)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r10 = p073b.p074a.C1415k.m6842a(r4, r9)
            r8.<init>(r10)
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r4 = r4.iterator()
            r10 = 0
        L_0x0139:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x01d5
            java.lang.Object r11 = r4.next()
            int r12 = r10 + 1
            b.h.b.a.b.b.ar r11 = (p073b.p085h.p087b.p088a.p090b.p094b.C1700ar) r11
            r11 = r7
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = p073b.p074a.C1415k.m6842a(r11, r9)
            r13.<init>(r14)
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.Iterator r11 = r11.iterator()
        L_0x0159:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x01c1
            java.lang.Object r14 = r11.next()
            b.h.b.a.b.l.ad r14 = (p073b.p085h.p087b.p088a.p090b.p131l.C2755ad) r14
            java.util.List r15 = r14.mo9501a()
            java.lang.Object r15 = p073b.p074a.C1415k.m6872c(r15, r10)
            b.h.b.a.b.l.ap r15 = (p073b.p085h.p087b.p088a.p090b.p131l.C2771ap) r15
            if (r15 == 0) goto L_0x0194
            b.h.b.a.b.l.ba r5 = r15.mo9868b()
            b.h.b.a.b.l.ba r6 = p073b.p085h.p087b.p088a.p090b.p131l.C2792ba.INVARIANT
            if (r5 != r6) goto L_0x017b
            r5 = 1
            goto L_0x017c
        L_0x017b:
            r5 = 0
        L_0x017c:
            if (r5 == 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r15 = 0
        L_0x0180:
            if (r15 == 0) goto L_0x0194
            b.h.b.a.b.l.w r5 = r15.mo9869c()
            if (r5 == 0) goto L_0x0194
            b.h.b.a.b.l.az r5 = r5.mo9892l()
            if (r5 == 0) goto L_0x0194
            r13.add(r5)
            r5 = 1
            r6 = 0
            goto L_0x0159
        L_0x0194:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Incorrect type: "
            r1.append(r4)
            r1.append(r14)
            java.lang.String r4 = ", subType: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = ", superType: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        L_0x01c1:
            java.util.List r13 = (java.util.List) r13
            b.h.b.a.b.l.az r5 = p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2716b.m13339a(r13)
            b.h.b.a.b.l.w r5 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r5
            b.h.b.a.b.l.ap r5 = p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a.m13683f(r5)
            r8.add(r5)
            r10 = r12
            r5 = 1
            r6 = 0
            goto L_0x0139
        L_0x01d5:
            java.util.List r8 = (java.util.List) r8
            boolean r1 = r0.m13373a(r1, r8, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2724h.m13376b(b.h.b.a.b.l.a.o, b.h.b.a.b.l.ad, b.h.b.a.b.l.ad):boolean");
    }

    /* renamed from: b */
    private final List<C2755ad> m13375b(C2731o oVar, C2755ad adVar, C2767an anVar) {
        return m13370a(m13378c(oVar, adVar, anVar));
    }

    /* renamed from: a */
    public final List<C2755ad> mo9836a(C2731o oVar, C2755ad adVar, C2767an anVar) {
        C2734c cVar;
        C1489j.m6972b(oVar, "$receiver");
        C1489j.m6972b(adVar, "baseType");
        C1489j.m6972b(anVar, "constructor");
        if (C2726j.m13387a(adVar)) {
            return m13375b(oVar, adVar, anVar);
        }
        if (!(anVar.mo7096d() instanceof C1796e)) {
            return m13378c(oVar, adVar, anVar);
        }
        C2908i iVar = new C2908i();
        oVar.m13403c();
        ArrayDeque c = oVar.f7981c;
        if (c == null) {
            C1489j.m6968a();
        }
        Set d = oVar.f7982d;
        if (d == null) {
            C1489j.m6968a();
        }
        c.push(adVar);
        while (!c.isEmpty()) {
            if (d.size() <= 1000) {
                C2755ad adVar2 = (C2755ad) c.pop();
                C1489j.m6969a((Object) adVar2, "current");
                if (d.add(adVar2)) {
                    if (C2726j.m13387a(adVar2)) {
                        iVar.add(adVar2);
                        cVar = C2737c.f7996a;
                    } else {
                        cVar = C2735a.f7994a;
                    }
                    if (!(!C1489j.m6971a((Object) cVar, (Object) C2737c.f7996a))) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        for (C2841w wVar : adVar2.mo9507g().mo7405C_()) {
                            C1489j.m6969a((Object) wVar, "supertype");
                            c.add(cVar.mo9851a(wVar));
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(adVar);
                sb.append(". Supertypes = ");
                sb.append(C1415k.m6859a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        oVar.m13405d();
        Iterable<C2755ad> iterable = iVar;
        Collection arrayList = new ArrayList();
        for (C2755ad adVar3 : iterable) {
            C2724h hVar = f7971b;
            C1489j.m6969a((Object) adVar3, "it");
            C1415k.m6849a(arrayList, (Iterable<? extends T>) hVar.m13375b(oVar, adVar3, anVar));
        }
        return (List) arrayList;
    }

    /* renamed from: c */
    private final List<C2755ad> m13378c(C2731o oVar, C2755ad adVar, C2767an anVar) {
        C2734c cVar;
        List<C2755ad> list;
        C2731o oVar2 = oVar;
        C2755ad adVar2 = adVar;
        C2767an anVar2 = anVar;
        C1799h d = anVar.mo7096d();
        if (!(d instanceof C1796e)) {
            d = null;
        }
        C1796e eVar = (C1796e) d;
        if (eVar != null) {
            if (m13371a(eVar)) {
                if (oVar2.mo9848a(adVar.mo9507g(), anVar2)) {
                    C2755ad a = C2723g.m13368a(adVar2, C2715a.FOR_SUBTYPING, null, 4, null);
                    if (a == null) {
                        a = adVar2;
                    }
                    list = C1415k.m6832a(a);
                } else {
                    list = C1415k.m6837a();
                }
                return list;
            }
        }
        List<C2755ad> iVar = new C2908i<>();
        oVar.m13403c();
        ArrayDeque c = oVar.f7981c;
        if (c == null) {
            C1489j.m6968a();
        }
        Set d2 = oVar.f7982d;
        if (d2 == null) {
            C1489j.m6968a();
        }
        c.push(adVar2);
        while (!c.isEmpty()) {
            if (d2.size() <= 1000) {
                C2755ad adVar3 = (C2755ad) c.pop();
                C1489j.m6969a((Object) adVar3, "current");
                if (d2.add(adVar3)) {
                    C2755ad a2 = C2723g.m13368a(adVar3, C2715a.FOR_SUBTYPING, null, 4, null);
                    if (a2 == null) {
                        a2 = adVar3;
                    }
                    if (oVar2.mo9848a(a2.mo9507g(), anVar2)) {
                        iVar.add(a2);
                        cVar = C2737c.f7996a;
                    } else if (a2.mo9501a().isEmpty()) {
                        cVar = C2735a.f7994a;
                    } else {
                        cVar = new C2736b(C2768ao.f8029b.mo9874a(a2).mo9881f());
                    }
                    if (!(!C1489j.m6971a((Object) cVar, (Object) C2737c.f7996a))) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        for (C2841w wVar : adVar3.mo9507g().mo7405C_()) {
                            C1489j.m6969a((Object) wVar, "supertype");
                            c.add(cVar.mo9851a(wVar));
                        }
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(adVar2);
                sb.append(". Supertypes = ");
                sb.append(C1415k.m6859a(d2, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        oVar.m13405d();
        return iVar;
    }

    /* renamed from: a */
    private final boolean m13371a(C1796e eVar) {
        return (!C1820x.m8491a(eVar) || eVar.mo7073l() == C1797f.ENUM_ENTRY || eVar.mo7073l() == C1797f.ANNOTATION_CLASS) ? false : true;
    }

    /* renamed from: a */
    private final List<C2755ad> m13370a(List<? extends C2755ad> list) {
        if (list.size() < 2) {
            return list;
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Iterable a = ((C2755ad) next).mo9501a();
            if (!(a instanceof Collection) || !((Collection) a).isEmpty()) {
                Iterator it2 = a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C2841w c = ((C2771ap) it2.next()).mo9869c();
                    C1489j.m6969a((Object) c, "it.type");
                    if (!(!C2838t.m13858a(c))) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List<? extends C2755ad> list2 = (List) arrayList;
        if (!list2.isEmpty()) {
            list = list2;
        }
        return list;
    }

    /* renamed from: a */
    public final C2792ba mo9835a(C2792ba baVar, C2792ba baVar2) {
        C1489j.m6972b(baVar, "declared");
        C1489j.m6972b(baVar2, "useSite");
        if (baVar == C2792ba.INVARIANT) {
            return baVar2;
        }
        if (baVar2 == C2792ba.INVARIANT || baVar == baVar2) {
            return baVar;
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m13373a(C2731o oVar, List<? extends C2771ap> list, C2755ad adVar) {
        boolean z;
        if (list == adVar.mo9501a()) {
            return true;
        }
        List b = adVar.mo9507g().mo7094b();
        C1489j.m6969a((Object) b, "parameters");
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C2771ap apVar = (C2771ap) adVar.mo9501a().get(i);
            if (!apVar.mo9867a()) {
                C2788az l = apVar.mo9869c().mo9892l();
                C2771ap apVar2 = (C2771ap) list.get(i);
                boolean z2 = apVar2.mo9868b() == C2792ba.INVARIANT;
                if (!C3232z.f8648a || z2) {
                    C2788az l2 = apVar2.mo9869c().mo9892l();
                    Object obj = b.get(i);
                    C1489j.m6969a(obj, "parameters[index]");
                    C2792ba k = ((C1700ar) obj).mo7316k();
                    C1489j.m6969a((Object) k, "parameters[index].variance");
                    C2792ba b2 = apVar.mo9868b();
                    C1489j.m6969a((Object) b2, "superProjection.projectionKind");
                    C2792ba a = mo9835a(k, b2);
                    if (a == null) {
                        return oVar.mo9850b();
                    }
                    if (oVar.f7979a <= 100) {
                        oVar.f7979a = oVar.f7979a + 1;
                        switch (C2725i.f7974c[a.ordinal()]) {
                            case 1:
                                z = f7971b.mo9837a(oVar, l2, l);
                                break;
                            case 2:
                                z = f7971b.mo9838b(oVar, l2, l);
                                break;
                            case 3:
                                z = f7971b.mo9838b(oVar, l, l2);
                                break;
                            default:
                                throw new C3219n();
                        }
                        oVar.f7979a = oVar.f7979a - 1;
                        if (!z) {
                            return false;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Arguments depth is too high. Some related argument: ");
                        sb.append(l2);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Incorrect sub argument: ");
                    sb2.append(apVar2);
                    throw new AssertionError(sb2.toString());
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m13372a(C2731o oVar, C2755ad adVar) {
        C2734c cVar;
        if (C1627g.m7430r(adVar)) {
            return true;
        }
        oVar.m13403c();
        ArrayDeque c = oVar.f7981c;
        if (c == null) {
            C1489j.m6968a();
        }
        Set d = oVar.f7982d;
        if (d == null) {
            C1489j.m6968a();
        }
        c.push(adVar);
        while (!c.isEmpty()) {
            if (d.size() <= 1000) {
                C2755ad adVar2 = (C2755ad) c.pop();
                C1489j.m6969a((Object) adVar2, "current");
                if (d.add(adVar2)) {
                    if (C2726j.m13387a(adVar2)) {
                        cVar = C2737c.f7996a;
                    } else {
                        cVar = C2735a.f7994a;
                    }
                    if (!(!C1489j.m6971a((Object) cVar, (Object) C2737c.f7996a))) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        for (C2841w wVar : adVar2.mo9507g().mo7405C_()) {
                            C1489j.m6969a((Object) wVar, "supertype");
                            C2755ad a = cVar.mo9851a(wVar);
                            if (C1627g.m7430r(a)) {
                                oVar.m13405d();
                                return true;
                            }
                            c.add(a);
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too many supertypes for type: ");
                sb.append(adVar);
                sb.append(". Supertypes = ");
                sb.append(C1415k.m6859a(d, null, null, null, 0, null, null, 63, null));
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        oVar.m13405d();
        return false;
    }
}
