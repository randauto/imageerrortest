package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2727k;

/* renamed from: b.h.b.a.b.l.av */
/* compiled from: TypeUtils */
public class C2783av {

    /* renamed from: a */
    public static final C2755ad f8044a = C2827p.m13792d("DONT_CARE");

    /* renamed from: b */
    public static final C2755ad f8045b = C2827p.m13791c("Cannot be inferred");

    /* renamed from: c */
    public static final C2755ad f8046c = new C2784a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final C2755ad f8047d = new C2784a("UNIT_EXPECTED_TYPE");

    /* renamed from: e */
    static final /* synthetic */ boolean f8048e = (!C2783av.class.desiredAssertionStatus());

    /* renamed from: b.h.b.a.b.l.av$a */
    /* compiled from: TypeUtils */
    public static class C2784a extends C2819i {

        /* renamed from: a */
        private final String f8049a;

        public C2784a(String str) {
            this.f8049a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C2755ad mo7898d() {
            throw new IllegalStateException(this.f8049a);
        }

        /* renamed from: c */
        public C2755ad mo7788b(C1659h hVar) {
            throw new IllegalStateException(this.f8049a);
        }

        /* renamed from: a */
        public C2755ad mo7789b(boolean z) {
            throw new IllegalStateException(this.f8049a);
        }

        public String toString() {
            return this.f8049a;
        }
    }

    /* renamed from: a */
    public static boolean m13573a(C2841w wVar) {
        return wVar == f8046c || wVar == f8047d;
    }

    /* renamed from: b */
    public static boolean m13576b(C2841w wVar) {
        return wVar != null && wVar.mo9507g() == f8044a.mo9507g();
    }

    /* renamed from: c */
    public static C2841w m13577c(C2841w wVar) {
        return m13571a(wVar, true);
    }

    /* renamed from: d */
    public static C2841w m13578d(C2841w wVar) {
        return m13571a(wVar, false);
    }

    /* renamed from: a */
    public static C2841w m13571a(C2841w wVar, boolean z) {
        return wVar.mo9892l().mo7789b(z);
    }

    /* renamed from: b */
    public static C2841w m13575b(C2841w wVar, boolean z) {
        return z ? m13577c(wVar) : wVar;
    }

    /* renamed from: a */
    public static C2755ad m13568a(C1799h hVar, C2560h hVar2) {
        if (C2827p.m13783a((C1804m) hVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsubstituted type for ");
            sb.append(hVar);
            return C2827p.m13791c(sb.toString());
        }
        C2767an e = hVar.mo7067e();
        return C2842x.m13882a(C1659h.f5247a.mo7260a(), e, m13572a(e.mo7094b()), false, hVar2);
    }

    /* renamed from: a */
    public static List<C2771ap> m13572a(List<C1700ar> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C1700ar A_ : list) {
            arrayList.add(new C2773ar(A_.mo7346A_()));
        }
        return C1415k.m6893k((Iterable<? extends T>) arrayList);
    }

    /* renamed from: e */
    public static List<C2841w> m13579e(C2841w wVar) {
        C2778au a = C2778au.m13552a(wVar);
        Collection<C2841w> C_ = wVar.mo9507g().mo7405C_();
        ArrayList arrayList = new ArrayList(C_.size());
        for (C2841w a2 : C_) {
            C2841w a3 = m13570a(wVar, a2, a);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C2841w m13570a(C2841w wVar, C2841w wVar2, C2778au auVar) {
        C2841w b = auVar.mo9889b(wVar2, C2792ba.INVARIANT);
        if (b != null) {
            return m13575b(b, wVar.mo7897c());
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m13580f(C2841w wVar) {
        if (wVar.mo7897c()) {
            return true;
        }
        if (C2838t.m13858a(wVar) && m13580f(C2838t.m13859b(wVar).mo9946h())) {
            return true;
        }
        if (m13584j(wVar)) {
            return m13582h(wVar);
        }
        C2767an g = wVar.mo9507g();
        if (g instanceof C2840v) {
            for (C2841w f : g.mo7405C_()) {
                if (m13580f(f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m13581g(C2841w wVar) {
        if (wVar.mo7897c()) {
            return true;
        }
        if (!C2838t.m13858a(wVar) || !m13581g(C2838t.m13859b(wVar).mo9946h())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m13582h(C2841w wVar) {
        if (wVar.mo9507g().mo7096d() instanceof C1796e) {
            return false;
        }
        for (C2841w f : m13579e(wVar)) {
            if (m13580f(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static C1796e m13583i(C2841w wVar) {
        C1799h d = wVar.mo9507g().mo7096d();
        if (d instanceof C1796e) {
            return (C1796e) d;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m13574a(C2841w wVar, C1450b<C2788az, Boolean> bVar) {
        if (wVar == null) {
            return false;
        }
        C2788az l = wVar.mo9892l();
        if (((Boolean) bVar.mo6756a(l)).booleanValue()) {
            return true;
        }
        C2834q qVar = l instanceof C2834q ? (C2834q) l : null;
        if (qVar != null && (m13574a((C2841w) qVar.mo9945f(), bVar) || m13574a((C2841w) qVar.mo9946h(), bVar))) {
            return true;
        }
        if ((l instanceof C2816g) && m13574a((C2841w) ((C2816g) l).mo9932e(), bVar)) {
            return true;
        }
        C2767an g = wVar.mo9507g();
        if (g instanceof C2840v) {
            for (C2841w a : ((C2840v) g).mo7405C_()) {
                if (m13574a(a, bVar)) {
                    return true;
                }
            }
            return false;
        }
        for (C2771ap apVar : wVar.mo9501a()) {
            if (!apVar.mo9867a()) {
                if (m13574a(apVar.mo9869c(), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static C2771ap m13569a(C1700ar arVar) {
        return new C2759ah(arVar);
    }

    /* renamed from: j */
    public static boolean m13584j(C2841w wVar) {
        return m13585k(wVar) != null || (wVar.mo9507g() instanceof C2727k);
    }

    /* renamed from: k */
    public static C1700ar m13585k(C2841w wVar) {
        if (wVar.mo9507g().mo7096d() instanceof C1700ar) {
            return (C1700ar) wVar.mo9507g().mo7096d();
        }
        return null;
    }
}
