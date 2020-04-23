package p073b.p085h.p087b.p088a.p090b.p118h;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import p073b.C3219n;
import p073b.C3230x;
import p073b.p074a.C1395aj;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1699aq;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1800i;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1654e;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p118h.C2439b.C2440a;
import p073b.p085h.p087b.p088a.p090b.p118h.C2439b.C2441b;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.h.c */
/* compiled from: DescriptorRenderer.kt */
public abstract class C2443c {

    /* renamed from: a */
    public static final C2443c f7416a = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2447d.f7428a);

    /* renamed from: b */
    public static final C2443c f7417b = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2445b.f7426a);

    /* renamed from: c */
    public static final C2443c f7418c = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2446c.f7427a);

    /* renamed from: d */
    public static final C2443c f7419d = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2448e.f7429a);

    /* renamed from: e */
    public static final C2443c f7420e = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2452i.f7433a);

    /* renamed from: f */
    public static final C2443c f7421f = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2450g.f7431a);

    /* renamed from: g */
    public static final C2443c f7422g = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2453j.f7434a);

    /* renamed from: h */
    public static final C2443c f7423h = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2449f.f7430a);

    /* renamed from: i */
    public static final C2443c f7424i = f7425j.mo9350a((C1450b<? super C2469h, C3230x>) C2451h.f7432a);

    /* renamed from: j */
    public static final C2444a f7425j = new C2444a(null);

    /* renamed from: b.h.b.a.b.h.c$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class C2444a {
        private C2444a() {
        }

        public /* synthetic */ C2444a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2443c mo9350a(C1450b<? super C2469h, C3230x> bVar) {
            C1489j.m6972b(bVar, "changeOptions");
            C2471i iVar = new C2471i();
            bVar.mo6756a(iVar);
            iVar.mo9468b();
            return new C2457e(iVar);
        }

        /* renamed from: a */
        public final String mo9351a(C1800i iVar) {
            C1489j.m6972b(iVar, "classifier");
            if (iVar instanceof C1699aq) {
                return "typealias";
            }
            if (iVar instanceof C1796e) {
                C1796e eVar = (C1796e) iVar;
                if (eVar.mo7078q()) {
                    return "companion object";
                }
                switch (C2456d.f7436a[eVar.mo7073l().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new C3219n();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected classifier: ");
                sb.append(iVar);
                throw new AssertionError(sb.toString());
            }
        }
    }

    /* renamed from: b.h.b.a.b.h.c$b */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2445b extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2445b f7426a = new C2445b();

        C2445b() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9352a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9352a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9403f(false);
            hVar.mo9394b(C1395aj.m6759a());
        }
    }

    /* renamed from: b.h.b.a.b.h.c$c */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2446c extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2446c f7427a = new C2446c();

        C2446c() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9353a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9353a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9403f(false);
            hVar.mo9394b(C1395aj.m6759a());
            hVar.mo9406g(true);
        }
    }

    /* renamed from: b.h.b.a.b.h.c$d */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2447d extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2447d f7428a = new C2447d();

        C2447d() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9354a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9354a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9403f(false);
        }
    }

    /* renamed from: b.h.b.a.b.h.c$e */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2448e extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2448e f7429a = new C2448e();

        C2448e() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9355a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9355a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9394b(C1395aj.m6759a());
            hVar.mo9389a((C2439b) C2441b.f7414a);
            hVar.mo9390a(C2478m.ONLY_NON_SYNTHESIZED);
        }
    }

    /* renamed from: b.h.b.a.b.h.c$f */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2449f extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2449f f7430a = new C2449f();

        C2449f() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9356a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9356a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9393a(true);
            hVar.mo9389a((C2439b) C2440a.f7413a);
            hVar.mo9394b(C2467g.f7465l);
        }
    }

    /* renamed from: b.h.b.a.b.h.c$g */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2450g extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2450g f7431a = new C2450g();

        C2450g() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9357a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9357a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9394b(C2467g.f7465l);
        }
    }

    /* renamed from: b.h.b.a.b.h.c$h */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2451h extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2451h f7432a = new C2451h();

        C2451h() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9358a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9358a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9391a(C2479n.f7529b);
            hVar.mo9394b(C2467g.f7465l);
        }
    }

    /* renamed from: b.h.b.a.b.h.c$i */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2452i extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2452i f7433a = new C2452i();

        C2452i() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9359a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9359a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9403f(false);
            hVar.mo9394b(C1395aj.m6759a());
            hVar.mo9389a((C2439b) C2441b.f7414a);
            hVar.mo9407h(true);
            hVar.mo9390a(C2478m.NONE);
            hVar.mo9395b(true);
            hVar.mo9398c(true);
            hVar.mo9406g(true);
            hVar.mo9400d(true);
        }
    }

    /* renamed from: b.h.b.a.b.h.c$j */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2453j extends C1490k implements C1450b<C2469h, C3230x> {

        /* renamed from: a */
        public static final C2453j f7434a = new C2453j();

        C2453j() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9360a((C2469h) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9360a(C2469h hVar) {
            C1489j.m6972b(hVar, "$receiver");
            hVar.mo9389a((C2439b) C2441b.f7414a);
            hVar.mo9390a(C2478m.ONLY_NON_SYNTHESIZED);
        }
    }

    /* renamed from: b.h.b.a.b.h.c$k */
    /* compiled from: DescriptorRenderer.kt */
    public interface C2454k {

        /* renamed from: b.h.b.a.b.h.c$k$a */
        /* compiled from: DescriptorRenderer.kt */
        public static final class C2455a implements C2454k {

            /* renamed from: a */
            public static final C2455a f7435a = new C2455a();

            /* renamed from: a */
            public void mo9362a(C1705au auVar, int i, int i2, StringBuilder sb) {
                C1489j.m6972b(auVar, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                C1489j.m6972b(sb, "builder");
            }

            private C2455a() {
            }

            /* renamed from: a */
            public void mo9361a(int i, StringBuilder sb) {
                C1489j.m6972b(sb, "builder");
                sb.append("(");
            }

            /* renamed from: b */
            public void mo9363b(int i, StringBuilder sb) {
                C1489j.m6972b(sb, "builder");
                sb.append(")");
            }

            /* renamed from: b */
            public void mo9364b(C1705au auVar, int i, int i2, StringBuilder sb) {
                C1489j.m6972b(auVar, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                C1489j.m6972b(sb, "builder");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }
        }

        /* renamed from: a */
        void mo9361a(int i, StringBuilder sb);

        /* renamed from: a */
        void mo9362a(C1705au auVar, int i, int i2, StringBuilder sb);

        /* renamed from: b */
        void mo9363b(int i, StringBuilder sb);

        /* renamed from: b */
        void mo9364b(C1705au auVar, int i, int i2, StringBuilder sb);
    }

    /* renamed from: a */
    public abstract String mo9343a(C1651c cVar, C1654e eVar);

    /* renamed from: a */
    public abstract String mo9344a(C1804m mVar);

    /* renamed from: a */
    public abstract String mo9345a(C2356c cVar);

    /* renamed from: a */
    public abstract String mo9346a(C2360f fVar, boolean z);

    /* renamed from: a */
    public abstract String mo9347a(C2771ap apVar);

    /* renamed from: a */
    public abstract String mo9348a(C2841w wVar);

    /* renamed from: a */
    public abstract String mo9349a(String str, String str2, C1627g gVar);

    /* renamed from: a */
    public final C2443c mo9342a(C1450b<? super C2469h, C3230x> bVar) {
        C1489j.m6972b(bVar, "changeOptions");
        C2471i d = ((C2457e) this).mo9383a().mo9469d();
        bVar.mo6756a(d);
        d.mo9468b();
        return new C2457e(d);
    }

    /* renamed from: a */
    public static /* synthetic */ String m12141a(C2443c cVar, C1651c cVar2, C1654e eVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                eVar = null;
            }
            return cVar.mo9343a(cVar2, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
    }
}
