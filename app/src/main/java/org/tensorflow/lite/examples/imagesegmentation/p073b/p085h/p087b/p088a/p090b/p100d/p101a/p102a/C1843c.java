package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1389ad;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1887e;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1985a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1989d;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.d.a.a.c */
/* compiled from: JavaAnnotationMapper.kt */
public final class C1843c {

    /* renamed from: a */
    public static final C1843c f5659a = new C1843c();

    /* renamed from: b */
    private static final C2355b f5660b = new C2355b(Target.class.getCanonicalName());

    /* renamed from: c */
    private static final C2355b f5661c = new C2355b(Retention.class.getCanonicalName());

    /* renamed from: d */
    private static final C2355b f5662d = new C2355b(Deprecated.class.getCanonicalName());

    /* renamed from: e */
    private static final C2355b f5663e = new C2355b(Documented.class.getCanonicalName());

    /* renamed from: f */
    private static final C2355b f5664f = new C2355b("java.lang.annotation.Repeatable");

    /* renamed from: g */
    private static final C2360f f5665g = C2360f.m11701a("message");

    /* renamed from: h */
    private static final C2360f f5666h = C2360f.m11701a("allowedTargets");

    /* renamed from: i */
    private static final C2360f f5667i = C2360f.m11701a("value");

    /* renamed from: j */
    private static final Map<C2355b, C2355b> f5668j = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(C1627g.f5076h.f5099E, f5660b), C3226t.m14841a(C1627g.f5076h.f5102H, f5661c), C3226t.m14841a(C1627g.f5076h.f5103I, f5664f), C3226t.m14841a(C1627g.f5076h.f5104J, f5663e)});

    /* renamed from: k */
    private static final Map<C2355b, C2355b> f5669k = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(f5660b, C1627g.f5076h.f5099E), C3226t.m14841a(f5661c, C1627g.f5076h.f5102H), C3226t.m14841a(f5662d, C1627g.f5076h.f5168y), C3226t.m14841a(f5664f, C1627g.f5076h.f5103I), C3226t.m14841a(f5663e, C1627g.f5076h.f5104J)});

    private C1843c() {
    }

    /* renamed from: a */
    public final C2360f mo7599a() {
        return f5665g;
    }

    /* renamed from: b */
    public final C2360f mo7600b() {
        return f5666h;
    }

    /* renamed from: c */
    public final C2360f mo7601c() {
        return f5667i;
    }

    /* renamed from: a */
    public final C1651c mo7597a(C1985a aVar, C1967h hVar) {
        C1489j.m6972b(aVar, "annotation");
        C1489j.m6972b(hVar, "c");
        C2354a b = aVar.mo7826b();
        if (C1489j.m6971a((Object) b, (Object) C2354a.m11661a(f5660b))) {
            return new C1854i(aVar, hVar);
        }
        if (C1489j.m6971a((Object) b, (Object) C2354a.m11661a(f5661c))) {
            return new C1852h(aVar, hVar);
        }
        if (C1489j.m6971a((Object) b, (Object) C2354a.m11661a(f5664f))) {
            C2355b bVar = C1627g.f5076h.f5103I;
            C1489j.m6969a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new C1841b(hVar, aVar, bVar);
        } else if (C1489j.m6971a((Object) b, (Object) C2354a.m11661a(f5663e))) {
            C2355b bVar2 = C1627g.f5076h.f5104J;
            C1489j.m6969a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new C1841b(hVar, aVar, bVar2);
        } else if (C1489j.m6971a((Object) b, (Object) C2354a.m11661a(f5662d))) {
            return null;
        } else {
            return new C1887e(hVar, aVar);
        }
    }

    /* renamed from: a */
    public final C1651c mo7598a(C2355b bVar, C1989d dVar, C1967h hVar) {
        C1489j.m6972b(bVar, "kotlinName");
        C1489j.m6972b(dVar, "annotationOwner");
        C1489j.m6972b(hVar, "c");
        if (C1489j.m6971a((Object) bVar, (Object) C1627g.f5076h.f5168y)) {
            C1985a a = dVar.mo7830a(f5662d);
            if (a != null || dVar.mo7832b()) {
                return new C1846e(a, hVar);
            }
        }
        C2355b bVar2 = (C2355b) f5668j.get(bVar);
        C1651c cVar = null;
        if (bVar2 != null) {
            C1985a a2 = dVar.mo7830a(bVar2);
            if (a2 != null) {
                cVar = f5659a.mo7597a(a2, hVar);
            }
        }
        return cVar;
    }
}
