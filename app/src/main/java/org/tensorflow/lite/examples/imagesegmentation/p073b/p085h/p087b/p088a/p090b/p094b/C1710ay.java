package p073b.p085h.p087b.p088a.p090b.p094b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import p073b.p074a.C1395aj;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1742ae;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.p126a.C2543e;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.p126a.C2544f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.p126a.C2545g;
import p073b.p085h.p087b.p088a.p090b.p131l.C2825n;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p136m.C2864g;
import p073b.p085h.p087b.p088a.p090b.p136m.C2864g.C2865a;
import p073b.p085h.p087b.p088a.p090b.p139n.C2885a;

/* renamed from: b.h.b.a.b.b.ay */
/* compiled from: Visibilities */
public class C1710ay {

    /* renamed from: a */
    public static final C1723az f5336a = new C1723az("private", false) {
        /* renamed from: a */
        private boolean m7697a(C1804m mVar) {
            return C2523c.m12610r(mVar) != C1694an.f5332a;
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=b.h.b.a.b.b.q, code=b.h.b.a.b.b.m, for r5v0, types: [b.h.b.a.b.b.q, b.h.b.a.b.b.m] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo7334a(p073b.p085h.p087b.p088a.p090b.p119i.p125e.p126a.C2543e r4, p073b.p085h.p087b.p088a.p090b.p094b.C1804m r5, p073b.p085h.p087b.p088a.p090b.p094b.C1804m r6) {
            /*
                r3 = this;
                boolean r4 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12598f(r5)
                if (r4 == 0) goto L_0x0011
                boolean r4 = r3.m7697a(r6)
                if (r4 == 0) goto L_0x0011
                boolean r4 = p073b.p085h.p087b.p088a.p090b.p094b.C1710ay.m7693a(r5, r6)
                return r4
            L_0x0011:
                boolean r4 = r5 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1803l
                r0 = 1
                if (r4 == 0) goto L_0x003e
                r4 = r5
                b.h.b.a.b.b.l r4 = (p073b.p085h.p087b.p088a.p090b.p094b.C1803l) r4
                b.h.b.a.b.b.i r4 = r4.mo7384q()
                boolean r1 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12602j(r4)
                if (r1 == 0) goto L_0x003e
                boolean r4 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12598f(r4)
                if (r4 == 0) goto L_0x003e
                boolean r4 = r6 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1803l
                if (r4 == 0) goto L_0x003e
                b.h.b.a.b.b.m r4 = r6.mo7065b()
                boolean r4 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12598f(r4)
                if (r4 == 0) goto L_0x003e
                boolean r4 = p073b.p085h.p087b.p088a.p090b.p094b.C1710ay.m7693a(r5, r6)
                if (r4 == 0) goto L_0x003e
                return r0
            L_0x003e:
                if (r5 == 0) goto L_0x0052
                b.h.b.a.b.b.m r5 = r5.mo7065b()
                boolean r4 = r5 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1796e
                if (r4 == 0) goto L_0x004e
                boolean r4 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12601i(r5)
                if (r4 == 0) goto L_0x0052
            L_0x004e:
                boolean r4 = r5 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1680ab
                if (r4 == 0) goto L_0x003e
            L_0x0052:
                r4 = 0
                if (r5 != 0) goto L_0x0056
                return r4
            L_0x0056:
                if (r6 == 0) goto L_0x0084
                if (r5 != r6) goto L_0x005b
                return r0
            L_0x005b:
                boolean r1 = r6 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1680ab
                if (r1 == 0) goto L_0x007f
                boolean r1 = r5 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1680ab
                if (r1 == 0) goto L_0x007e
                r1 = r5
                b.h.b.a.b.b.ab r1 = (p073b.p085h.p087b.p088a.p090b.p094b.C1680ab) r1
                b.h.b.a.b.f.b r1 = r1.mo7284f()
                r2 = r6
                b.h.b.a.b.b.ab r2 = (p073b.p085h.p087b.p088a.p090b.p094b.C1680ab) r2
                b.h.b.a.b.f.b r2 = r2.mo7284f()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x007e
                boolean r5 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12587a(r6, r5)
                if (r5 == 0) goto L_0x007e
                r4 = 1
            L_0x007e:
                return r4
            L_0x007f:
                b.h.b.a.b.b.m r6 = r6.mo7065b()
                goto L_0x0056
            L_0x0084:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p094b.C1710ay.C17111.mo7334a(b.h.b.a.b.i.e.a.e, b.h.b.a.b.b.q, b.h.b.a.b.b.m):boolean");
        }
    };

    /* renamed from: b */
    public static final C1723az f5337b = new C1723az("private_to_this", false) {
        /* renamed from: a */
        public String mo7336a() {
            return "private/*private to this*/";
        }

        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            if (C1710ay.f5336a.mo7334a(eVar, qVar, mVar)) {
                if (eVar == C1710ay.f5347l) {
                    return true;
                }
                if (eVar == C1710ay.f5350o) {
                    return false;
                }
                C1804m a = C2523c.m12578a((C1804m) qVar, C1796e.class);
                if (a != null && (eVar instanceof C2545g)) {
                    return ((C2545g) eVar).mo9566c().mo7354E().equals(a.mo7347E_());
                }
            }
            return false;
        }
    };

    /* renamed from: c */
    public static final C1723az f5338c = new C1723az("protected", true) {
        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            C1796e eVar2 = (C1796e) C2523c.m12578a((C1804m) qVar, C1796e.class);
            C1796e eVar3 = (C1796e) C2523c.m12579a(mVar, C1796e.class, false);
            if (eVar3 == null) {
                return false;
            }
            if (eVar2 != null && C2523c.m12601i(eVar2)) {
                C1796e eVar4 = (C1796e) C2523c.m12578a((C1804m) eVar2, C1796e.class);
                if (eVar4 != null && C2523c.m12592b(eVar3, eVar4)) {
                    return true;
                }
            }
            C1808q a = C2523c.m12580a(qVar);
            C1796e eVar5 = (C1796e) C2523c.m12578a((C1804m) a, C1796e.class);
            if (eVar5 == null) {
                return false;
            }
            if (!C2523c.m12592b(eVar3, eVar5) || !m7707a(eVar, a, eVar3)) {
                return mo7334a(eVar, qVar, eVar3.mo7065b());
            }
            return true;
        }

        /* renamed from: a */
        private boolean m7707a(C2543e eVar, C1808q qVar, C1796e eVar2) {
            boolean z = false;
            if (eVar == C1710ay.f5348m) {
                return false;
            }
            if (!(qVar instanceof C1724b) || (qVar instanceof C1803l) || eVar == C1710ay.f5347l) {
                return true;
            }
            if (eVar == C1710ay.f5350o || eVar == null) {
                return false;
            }
            C2841w b = eVar instanceof C2544f ? ((C2544f) eVar).mo9570b() : eVar.mo7335a();
            if (C2523c.m12588a(b, (C1804m) eVar2) || C2825n.m13766a(b)) {
                z = true;
            }
            return z;
        }
    };

    /* renamed from: d */
    public static final C1723az f5339d = new C1723az("internal", false) {
        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            if (!C2523c.m12599g(mVar).mo7530a(C2523c.m12599g(qVar))) {
                return false;
            }
            return C1710ay.f5351p.mo9970a(qVar, mVar);
        }
    };

    /* renamed from: e */
    public static final C1723az f5340e = new C1723az("public", true) {
        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            return true;
        }
    };

    /* renamed from: f */
    public static final C1723az f5341f = new C1723az("local", false) {
        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    };

    /* renamed from: g */
    public static final C1723az f5342g = new C1723az("inherited", false) {
        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            throw new IllegalStateException("Visibility is unknown yet");
        }
    };

    /* renamed from: h */
    public static final C1723az f5343h = new C1723az("invisible_fake", false) {
        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            return false;
        }
    };

    /* renamed from: i */
    public static final C1723az f5344i = new C1723az("unknown", false) {
        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            return false;
        }
    };

    /* renamed from: j */
    public static final Set<C1723az> f5345j = Collections.unmodifiableSet(C1395aj.m6761a((T[]) new C1723az[]{f5336a, f5337b, f5339d, f5341f}));

    /* renamed from: k */
    public static final C1723az f5346k = f5340e;

    /* renamed from: l */
    public static final C2543e f5347l = new C2543e() {
        /* renamed from: a */
        public C2841w mo7335a() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    @Deprecated

    /* renamed from: m */
    public static final C2543e f5348m = new C2543e() {
        /* renamed from: a */
        public C2841w mo7335a() {
            throw new IllegalStateException("This method should not be called");
        }
    };

    /* renamed from: n */
    private static final Map<C1723az, Integer> f5349n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C2543e f5350o = new C2543e() {
        /* renamed from: a */
        public C2841w mo7335a() {
            throw new IllegalStateException("This method should not be called");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C2864g f5351p;

    static {
        HashMap a = C2885a.m13947a(4);
        a.put(f5337b, Integer.valueOf(0));
        a.put(f5336a, Integer.valueOf(0));
        a.put(f5339d, Integer.valueOf(1));
        a.put(f5338c, Integer.valueOf(1));
        a.put(f5340e, Integer.valueOf(2));
        f5349n = Collections.unmodifiableMap(a);
        Iterator it = ServiceLoader.load(C2864g.class, C2864g.class.getClassLoader()).iterator();
        f5351p = it.hasNext() ? (C2864g) it.next() : C2865a.f8146a;
    }

    /* renamed from: a */
    public static boolean m7694a(C1808q qVar, C1804m mVar) {
        return m7689a(f5347l, qVar, mVar) == null;
    }

    /* renamed from: a */
    public static boolean m7693a(C1804m mVar, C1804m mVar2) {
        C1694an r = C2523c.m12610r(mVar2);
        if (r != C1694an.f5332a) {
            return r.equals(C2523c.m12610r(mVar));
        }
        return false;
    }

    /* renamed from: a */
    public static C1808q m7689a(C2543e eVar, C1808q qVar, C1804m mVar) {
        C1808q qVar2 = (C1808q) qVar.mo7347E_();
        while (qVar2 != null && qVar2.mo7077p() != f5341f) {
            if (!qVar2.mo7077p().mo7334a(eVar, qVar2, mVar)) {
                return qVar2;
            }
            qVar2 = (C1808q) C2523c.m12578a((C1804m) qVar2, C1808q.class);
        }
        if (qVar instanceof C1742ae) {
            C1808q a = m7689a(eVar, ((C1742ae) qVar).mo7374o(), mVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    static Integer m7691a(C1723az azVar, C1723az azVar2) {
        if (azVar == azVar2) {
            return Integer.valueOf(0);
        }
        Integer num = (Integer) f5349n.get(azVar);
        Integer num2 = (Integer) f5349n.get(azVar2);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public static Integer m7696b(C1723az azVar, C1723az azVar2) {
        Integer a = azVar.mo7337a(azVar2);
        if (a != null) {
            return a;
        }
        Integer a2 = azVar2.mo7337a(azVar);
        if (a2 != null) {
            return Integer.valueOf(-a2.intValue());
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m7692a(C1723az azVar) {
        return azVar == f5336a || azVar == f5337b;
    }
}
