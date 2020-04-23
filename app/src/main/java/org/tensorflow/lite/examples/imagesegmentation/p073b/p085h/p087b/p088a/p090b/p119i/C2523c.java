package p073b.p085h.p087b.p088a.p090b.p119i;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p091a.C1647m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1682ad;
import p073b.p085h.p087b.p088a.p090b.p094b.C1686ag;
import p073b.p085h.p087b.p088a.p090b.p094b.C1689aj;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1694an;
import p073b.p085h.p087b.p088a.p090b.p094b.C1708aw;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1807p;
import p073b.p085h.p087b.p088a.p090b.p094b.C1808q;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p116f.C2362h;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2717c;

/* renamed from: b.h.b.a.b.i.c */
/* compiled from: DescriptorUtils */
public class C2523c {

    /* renamed from: a */
    public static final C2360f f7559a = C2360f.m11701a("values");

    /* renamed from: b */
    public static final C2360f f7560b = C2360f.m11701a("valueOf");

    /* renamed from: c */
    public static final C2355b f7561c = new C2355b("kotlin.jvm.JvmName");

    /* renamed from: d */
    public static final C2355b f7562d = new C2355b("kotlin.coroutines");

    /* renamed from: e */
    public static final C2355b f7563e = f7562d.mo9012a(C2360f.m11701a("experimental"));

    /* renamed from: f */
    public static final C2355b f7564f = f7563e.mo9012a(C2360f.m11701a("intrinsics"));

    /* renamed from: g */
    public static final C2355b f7565g = f7563e.mo9012a(C2360f.m11701a("Continuation"));

    /* renamed from: h */
    public static final C2355b f7566h = f7562d.mo9012a(C2360f.m11701a("Continuation"));

    /* renamed from: i */
    public static final C2355b f7567i = new C2355b("kotlin.SuccessOrFailure");

    /* renamed from: j */
    static final /* synthetic */ boolean f7568j = (!C2523c.class.desiredAssertionStatus());

    /* renamed from: k */
    private static final C2355b f7569k = new C2355b("kotlin.jvm.Volatile");

    /* renamed from: l */
    private static final C2355b f7570l = new C2355b("kotlin.jvm.Synchronized");

    private C2523c() {
    }

    /* renamed from: a */
    public static C1690ak m12574a(C1804m mVar) {
        if (mVar instanceof C1796e) {
            return ((C1796e) mVar).mo7353D();
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m12593b(C1804m mVar) {
        while (mVar != null) {
            if (m12603k(mVar) || m12595c(mVar)) {
                return true;
            }
            mVar = mVar.mo7065b();
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m12595c(C1804m mVar) {
        return (mVar instanceof C1808q) && ((C1808q) mVar).mo7077p() == C1710ay.f5341f;
    }

    /* renamed from: d */
    public static C2356c m12596d(C1804m mVar) {
        C2355b s = m12611s(mVar);
        return s != null ? s.mo9014b() : m12612t(mVar);
    }

    /* renamed from: e */
    public static C2355b m12597e(C1804m mVar) {
        C2355b s = m12611s(mVar);
        return s != null ? s : m12612t(mVar).mo9028c();
    }

    /* renamed from: s */
    private static C2355b m12611s(C1804m mVar) {
        if ((mVar instanceof C1821y) || C2827p.m13783a(mVar)) {
            return C2355b.f7221a;
        }
        if (mVar instanceof C1682ad) {
            return ((C1682ad) mVar).mo7287a();
        }
        if (mVar instanceof C1680ab) {
            return ((C1680ab) mVar).mo7284f();
        }
        return null;
    }

    /* renamed from: t */
    private static C2356c m12612t(C1804m mVar) {
        C1804m b = mVar.mo7065b();
        if (f7568j || b != null) {
            return m12596d(b).mo9024a(mVar.mo7351z_());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not package/module descriptor doesn't have containing declaration: ");
        sb.append(mVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: f */
    public static boolean m12598f(C1804m mVar) {
        return mVar != null && (mVar.mo7065b() instanceof C1680ab);
    }

    /* renamed from: a */
    public static boolean m12587a(C1804m mVar, C1804m mVar2) {
        return m12599g(mVar).equals(m12599g(mVar2));
    }

    /* renamed from: a */
    public static <D extends C1804m> D m12578a(C1804m mVar, Class<D> cls) {
        return m12579a(mVar, cls, true);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=b.h.b.a.b.b.m, code=D, for r1v0, types: [b.h.b.a.b.b.m] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <D extends p073b.p085h.p087b.p088a.p090b.p094b.C1804m> D m12579a(D r1, java.lang.Class<D> r2, boolean r3) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r3 == 0) goto L_0x000a
            b.h.b.a.b.b.m r1 = r1.mo7065b()
        L_0x000a:
            if (r1 == 0) goto L_0x0018
            boolean r3 = r2.isInstance(r1)
            if (r3 == 0) goto L_0x0013
            return r1
        L_0x0013:
            b.h.b.a.b.b.m r1 = r1.mo7065b()
            goto L_0x000a
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12579a(b.h.b.a.b.b.m, java.lang.Class, boolean):b.h.b.a.b.b.m");
    }

    /* renamed from: a */
    public static C1821y m12581a(C2841w wVar) {
        C1799h d = wVar.mo9507g().mo7096d();
        if (d == null) {
            return null;
        }
        return m12600h(d);
    }

    /* renamed from: g */
    public static C1821y m12599g(C1804m mVar) {
        C1821y h = m12600h(mVar);
        if (f7568j || h != null) {
            return h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Descriptor without a containing module: ");
        sb.append(mVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: h */
    public static C1821y m12600h(C1804m mVar) {
        while (mVar != null) {
            if (mVar instanceof C1821y) {
                return (C1821y) mVar;
            }
            if (mVar instanceof C1682ad) {
                return ((C1682ad) mVar).mo7289e();
            }
            mVar = mVar.mo7065b();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m12585a(C1796e eVar, C1796e eVar2) {
        for (C2841w b : eVar.mo7067e().mo7405C_()) {
            if (m12594b(b, (C1804m) eVar2.mo7354E())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m12592b(C1796e eVar, C1796e eVar2) {
        return m12588a((C2841w) eVar.mo7346A_(), (C1804m) eVar2.mo7354E());
    }

    /* renamed from: b */
    private static boolean m12594b(C2841w wVar, C1804m mVar) {
        C1799h d = wVar.mo9507g().mo7096d();
        if (d != null) {
            C1804m E_ = d.mo7347E_();
            if ((E_ instanceof C1799h) && (mVar instanceof C1799h) && ((C1799h) mVar).mo7067e().equals(((C1799h) E_).mo7067e())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m12588a(C2841w wVar, C1804m mVar) {
        if (m12594b(wVar, mVar)) {
            return true;
        }
        for (C2841w a : wVar.mo9507g().mo7405C_()) {
            if (m12588a(a, mVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m12601i(C1804m mVar) {
        return m12586a(mVar, C1797f.OBJECT) && ((C1796e) mVar).mo7078q();
    }

    /* renamed from: j */
    public static boolean m12602j(C1804m mVar) {
        return m12586a(mVar, C1797f.CLASS) && ((C1796e) mVar).mo7074m() == C1818w.SEALED;
    }

    /* renamed from: k */
    public static boolean m12603k(C1804m mVar) {
        return m12608p(mVar) && mVar.mo7351z_().equals(C2362h.f7236a);
    }

    /* renamed from: l */
    public static boolean m12604l(C1804m mVar) {
        return m12586a(mVar, C1797f.ENUM_ENTRY);
    }

    /* renamed from: m */
    public static boolean m12605m(C1804m mVar) {
        return m12586a(mVar, C1797f.ENUM_CLASS);
    }

    /* renamed from: n */
    public static boolean m12606n(C1804m mVar) {
        return m12586a(mVar, C1797f.ANNOTATION_CLASS);
    }

    /* renamed from: o */
    public static boolean m12607o(C1804m mVar) {
        return m12586a(mVar, C1797f.INTERFACE);
    }

    /* renamed from: p */
    public static boolean m12608p(C1804m mVar) {
        return m12586a(mVar, C1797f.CLASS);
    }

    /* renamed from: q */
    public static boolean m12609q(C1804m mVar) {
        return m12608p(mVar) || m12605m(mVar);
    }

    /* renamed from: a */
    private static boolean m12586a(C1804m mVar, C1797f fVar) {
        return (mVar instanceof C1796e) && ((C1796e) mVar).mo7073l() == fVar;
    }

    /* renamed from: a */
    public static C1796e m12576a(C1796e eVar) {
        for (C2841w b : eVar.mo7067e().mo7405C_()) {
            C1796e b2 = m12591b(b);
            if (b2.mo7073l() != C1797f.INTERFACE) {
                return b2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C1796e m12591b(C2841w wVar) {
        return m12577a(wVar.mo9507g());
    }

    /* renamed from: a */
    public static C1796e m12577a(C2767an anVar) {
        C1799h d = anVar.mo7096d();
        if (f7568j || (d instanceof C1796e)) {
            return (C1796e) d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Classifier descriptor of a type should be of type ClassDescriptor: ");
        sb.append(anVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: b */
    public static C1723az m12589b(C1796e eVar) {
        C1797f l = eVar.mo7073l();
        if (l == C1797f.ENUM_CLASS || l.mo7569a() || m12602j(eVar)) {
            return C1710ay.f5336a;
        }
        if (m12603k(eVar)) {
            return C1710ay.f5346k;
        }
        if (f7568j || l == C1797f.CLASS || l == C1797f.INTERFACE || l == C1797f.ANNOTATION_CLASS) {
            return C1710ay.f5340e;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static <D extends C1724b> D m12575a(D d) {
        while (d.mo7344n() == C1725a.FAKE_OVERRIDE) {
            Collection k = d.mo7238k();
            if (!k.isEmpty()) {
                d = (C1724b) k.iterator().next();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Fake override should have at least one overridden descriptor: ");
                sb.append(d);
                throw new IllegalStateException(sb.toString());
            }
        }
        return d;
    }

    /* renamed from: a */
    public static <D extends C1808q> D m12580a(D d) {
        return d instanceof C1724b ? m12575a((D) (C1724b) d) : d;
    }

    /* renamed from: a */
    public static boolean m12584a(C1708aw awVar, C2841w wVar) {
        boolean z = false;
        if (awVar.mo7330s() || C2843y.m13884a(wVar)) {
            return false;
        }
        if (C2783av.m13581g(wVar)) {
            return true;
        }
        C1627g d = C2524a.m12627d(awVar);
        if (C1627g.m7417e(wVar) || C2717c.f7961a.mo9824b(d.mo7182E(), wVar) || C2717c.f7961a.mo9824b(d.mo7200m().mo7346A_(), wVar) || C2717c.f7961a.mo9824b(d.mo7206s(), wVar) || C1647m.f5220a.mo7230a(wVar)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static <D extends C1648a> Set<D> m12582a(D d) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m12583a((D) d.mo7235h(), (Set<D>) linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: a */
    private static <D extends C1648a> void m12583a(D d, Set<D> set) {
        if (!set.contains(d)) {
            for (C1648a h : d.mo7235h().mo7238k()) {
                C1648a h2 = h.mo7235h();
                m12583a((D) h2, set);
                set.add(h2);
            }
        }
    }

    /* renamed from: r */
    public static C1694an m12610r(C1804m mVar) {
        if (mVar instanceof C1689aj) {
            mVar = ((C1689aj) mVar).mo7296q();
        }
        if (mVar instanceof C1807p) {
            return ((C1807p) mVar).mo7088y().mo6988a();
        }
        return C1694an.f5332a;
    }

    /* renamed from: b */
    public static C1724b m12590b(C1724b bVar) {
        return bVar instanceof C1686ag ? ((C1686ag) bVar).mo7296q() : bVar;
    }
}
