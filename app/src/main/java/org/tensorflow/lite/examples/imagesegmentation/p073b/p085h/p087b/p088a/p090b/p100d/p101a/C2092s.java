package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import p073b.C3227u;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1686ag;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b.C1866d;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2150u;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2740q;

/* renamed from: b.h.b.a.b.d.a.s */
/* compiled from: specialBuiltinMembers.kt */
public final class C2092s {

    /* renamed from: b.h.b.a.b.d.a.s$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C2093a extends C1490k implements C1450b<C1724b, Boolean> {

        /* renamed from: a */
        public static final C2093a f6351a = new C2093a();

        C2093a() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7977a((C1724b) obj));
        }

        /* renamed from: a */
        public final boolean mo7977a(C1724b bVar) {
            C1489j.m6972b(bVar, "it");
            return C1983e.f5954a.mo7822a(C2524a.m12613a(bVar));
        }
    }

    /* renamed from: b.h.b.a.b.d.a.s$b */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C2094b extends C1490k implements C1450b<C1724b, Boolean> {

        /* renamed from: a */
        public static final C2094b f6352a = new C2094b();

        C2094b() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7978a((C1724b) obj));
        }

        /* renamed from: a */
        public final boolean mo7978a(C1724b bVar) {
            C1489j.m6972b(bVar, "it");
            return C1875c.f5720a.mo7638b((C1691al) bVar);
        }
    }

    /* renamed from: b.h.b.a.b.d.a.s$c */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C2095c extends C1490k implements C1450b<C1724b, Boolean> {

        /* renamed from: a */
        public static final C2095c f6353a = new C2095c();

        C2095c() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7979a((C1724b) obj));
        }

        /* renamed from: a */
        public final boolean mo7979a(C1724b bVar) {
            C1489j.m6972b(bVar, "it");
            return C1627g.m7393a((C1804m) bVar) && C1975d.m9076a(bVar) != null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2355b m9374b(C2355b bVar, String str) {
        C2355b a = bVar.mo9012a(C2360f.m11701a(str));
        C1489j.m6969a((Object) a, "child(Name.identifier(name))");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2355b m9375b(C2356c cVar, String str) {
        C2355b c = cVar.mo9024a(C2360f.m11701a(str)).mo9028c();
        C1489j.m6969a((Object) c, "child(Name.identifier(name)).toSafe()");
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2090q m9373b(String str, String str2, String str3, String str4) {
        C2360f a = C2360f.m11701a(str2);
        C1489j.m6969a((Object) a, "Name.identifier(name)");
        C2150u uVar = C2150u.f6453a;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('(');
        sb.append(str3);
        sb.append(')');
        sb.append(str4);
        return new C2090q(a, uVar.mo8077a(str, sb.toString()));
    }

    /* renamed from: a */
    public static final <T extends C1724b> T m9368a(T t) {
        C1489j.m6972b(t, "$receiver");
        T t2 = null;
        if (!C1875c.f5720a.mo7635a().contains(t.mo7351z_()) && !C1983e.f5954a.mo7821a().contains(C2524a.m12613a((C1724b) t).mo7351z_())) {
            return null;
        }
        if ((t instanceof C1687ah) || (t instanceof C1686ag)) {
            t2 = C2524a.m12615a(t, false, C2093a.f6351a, 1, null);
        } else if (t instanceof C1691al) {
            t2 = C2524a.m12615a(t, false, C2094b.f6352a, 1, null);
        }
        return t2;
    }

    /* renamed from: b */
    public static final boolean m9376b(C1724b bVar) {
        C1489j.m6972b(bVar, "$receiver");
        return m9368a(bVar) != null;
    }

    /* renamed from: c */
    public static final <T extends C1724b> T m9377c(T t) {
        C1489j.m6972b(t, "$receiver");
        T a = m9368a(t);
        if (a != null) {
            return a;
        }
        C1975d dVar = C1975d.f5932a;
        C2360f z_ = t.mo7351z_();
        C1489j.m6969a((Object) z_, "name");
        if (!dVar.mo7817a(z_)) {
            return null;
        }
        return C2524a.m12615a(t, false, C2095c.f6353a, 1, null);
    }

    /* renamed from: d */
    public static final String m9378d(C1724b bVar) {
        C1489j.m6972b(bVar, "callableMemberDescriptor");
        C1724b g = m9381g(bVar);
        String str = null;
        if (g != null) {
            C1724b a = C2524a.m12613a(g);
            if (a != null) {
                if (a instanceof C1687ah) {
                    str = C1983e.f5954a.mo7823b(a);
                } else if (a instanceof C1691al) {
                    C2360f a2 = C1875c.f5720a.mo7634a((C1691al) a);
                    if (a2 != null) {
                        str = a2.mo9039a();
                    }
                }
                return str;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static final C1724b m9381g(C1724b bVar) {
        if (C1627g.m7393a((C1804m) bVar)) {
            return m9368a(bVar);
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m9372a(C1796e eVar, C1648a aVar) {
        C1489j.m6972b(eVar, "$receiver");
        C1489j.m6972b(aVar, "specialCallableDescriptor");
        C1804m b = aVar.mo7065b();
        if (b != null) {
            C2755ad A_ = ((C1796e) b).mo7346A_();
            C1796e a = C2523c.m12576a(eVar);
            while (true) {
                boolean z = false;
                if (a == null) {
                    return false;
                }
                if (!(a instanceof C1866d)) {
                    if (C2740q.m13425a((C2841w) a.mo7346A_(), (C2841w) A_) != null) {
                        z = true;
                    }
                    if (z) {
                        return !C1627g.m7393a((C1804m) a);
                    }
                }
                a = C2523c.m12576a(a);
            }
        } else {
            throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
    }

    /* renamed from: e */
    public static final boolean m9379e(C1724b bVar) {
        C1489j.m6972b(bVar, "$receiver");
        return C2524a.m12613a(bVar).mo7065b() instanceof C1866d;
    }

    /* renamed from: f */
    public static final boolean m9380f(C1724b bVar) {
        C1489j.m6972b(bVar, "$receiver");
        return m9379e(bVar) || C1627g.m7393a((C1804m) bVar);
    }
}
