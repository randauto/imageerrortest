package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3219n;
import p073b.C3227u;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.p093b.C1595c;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1668l;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C2088o;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p106b.C1953g;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2786ax;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2834q;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.d.a.f.s */
/* compiled from: typeEnhancement.kt */
public final class C2073s {

    /* renamed from: a */
    private static final C2014b f6309a;

    /* renamed from: b */
    private static final C2014b f6310b;

    /* renamed from: a */
    public static final C2841w m9307a(C2841w wVar, C1450b<? super Integer, C2016d> bVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1489j.m6972b(bVar, "qualifiers");
        return m9305a(wVar.mo9892l(), bVar, 0).mo7935a();
    }

    /* renamed from: a */
    public static final boolean m9309a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1659h x = wVar.mo7086x();
        C2355b bVar = C2088o.f6333k;
        C1489j.m6969a((Object) bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        return x.mo7254a(bVar) != null;
    }

    /* renamed from: a */
    private static final C2052k m9305a(C2788az azVar, C1450b<? super Integer, C2016d> bVar, int i) {
        C2052k kVar;
        C2788az azVar2;
        C2841w wVar = azVar;
        boolean z = false;
        if (C2843y.m13884a(wVar)) {
            return new C2052k(wVar, 1, false);
        }
        if (azVar instanceof C2834q) {
            C2834q qVar = (C2834q) azVar;
            C2069o a = m9306a(qVar.mo9945f(), bVar, i, C2071q.FLEXIBLE_LOWER);
            C2069o a2 = m9306a(qVar.mo9946h(), bVar, i, C2071q.FLEXIBLE_UPPER);
            boolean z2 = a.mo7937c() == a2.mo7937c();
            if (!C3232z.f8648a || z2) {
                if (a.mo7938d() || a2.mo7938d()) {
                    z = true;
                }
                C2841w a3 = C2786ax.m13594a(a.mo7936b());
                if (a3 == null) {
                    a3 = C2786ax.m13594a(a2.mo7936b());
                }
                if (z) {
                    if (azVar instanceof C1953g) {
                        azVar2 = new C1953g(a.mo7936b(), a2.mo7936b());
                    } else {
                        azVar2 = C2842x.m13883a(a.mo7936b(), a2.mo7936b());
                    }
                    azVar = C2786ax.m13595b(azVar2, a3);
                }
                kVar = new C2052k(azVar, a.mo7937c(), z);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Different tree sizes of bounds: ");
                sb.append("lower = (");
                sb.append(qVar.mo9945f());
                sb.append(", ");
                sb.append(a.mo7937c());
                sb.append("), ");
                sb.append("upper = (");
                sb.append(qVar.mo9946h());
                sb.append(", ");
                sb.append(a2.mo7937c());
                sb.append(')');
                throw new AssertionError(sb.toString());
            }
        } else if (azVar instanceof C2755ad) {
            kVar = m9306a((C2755ad) azVar, bVar, i, C2071q.INFLEXIBLE);
        } else {
            throw new C3219n();
        }
        return kVar;
    }

    /* renamed from: a */
    private static final C2069o m9306a(C2755ad adVar, C1450b<? super Integer, C2016d> bVar, int i, C2071q qVar) {
        C2771ap apVar;
        C2755ad adVar2 = adVar;
        C1450b<? super Integer, C2016d> bVar2 = bVar;
        C2071q qVar2 = qVar;
        if (!m9308a(qVar) && adVar.mo9501a().isEmpty()) {
            return new C2069o(adVar2, 1, false);
        }
        C1799h d = adVar.mo9507g().mo7096d();
        if (d == null) {
            return new C2069o(adVar2, 1, false);
        }
        C2016d dVar = (C2016d) bVar2.mo6756a(Integer.valueOf(i));
        C1489j.m6969a((Object) d, "originalClass");
        C2015c a = m9302a(d, dVar, qVar2);
        C1799h hVar = (C1799h) a.mo7882a();
        C1659h b = a.mo7883b();
        C2767an e = hVar.mo7067e();
        int i2 = i + 1;
        boolean z = b != null;
        Iterable<C2771ap> a2 = adVar.mo9501a();
        Collection arrayList = new ArrayList(C1415k.m6842a(a2, 10));
        int i3 = i2;
        int i4 = 0;
        for (C2771ap apVar2 : a2) {
            int i5 = i4 + 1;
            if (apVar2.mo9867a()) {
                i3++;
                C2767an e2 = hVar.mo7067e();
                C1489j.m6969a((Object) e2, "enhancedClassifier.typeConstructor");
                apVar = C2783av.m13569a((C1700ar) e2.mo7094b().get(i4));
            } else {
                C2052k a3 = m9305a(apVar2.mo9869c().mo9892l(), bVar2, i3);
                z = z || a3.mo7938d();
                i3 += a3.mo7937c();
                C2841w b2 = a3.mo7936b();
                C2792ba b3 = apVar2.mo9868b();
                C1489j.m6969a((Object) b3, "arg.projectionKind");
                C1489j.m6969a((Object) e, "typeConstructor");
                apVar = C2803a.m13675a(b2, b3, (C1700ar) e.mo7094b().get(i4));
            }
            arrayList.add(apVar);
            i4 = i5;
        }
        List list = (List) arrayList;
        C2015c a4 = m9303a((C2841w) adVar2, dVar, qVar2);
        boolean booleanValue = ((Boolean) a4.mo7882a()).booleanValue();
        C1659h b4 = a4.mo7883b();
        int i6 = i3 - i;
        if (!(z || b4 != null)) {
            return new C2069o(adVar2, i6, false);
        }
        C1659h a5 = m9301a(C1415k.m6887h((Iterable<? extends T>) C1415k.m6840b((T[]) new C1659h[]{adVar.mo7086x(), b, b4})));
        C1489j.m6969a((Object) e, "typeConstructor");
        C2755ad a6 = C2842x.m13881a(a5, e, list, booleanValue);
        if (dVar.mo7889c()) {
            a6 = new C2019f(a6);
        }
        C2788az b5 = b4 != null && dVar.mo7890d() ? C2786ax.m13595b(adVar2, a6) : a6;
        if (b5 != null) {
            return new C2069o((C2755ad) b5, i6, true);
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
    }

    /* renamed from: a */
    private static final C1659h m9301a(List<? extends C1659h> list) {
        switch (list.size()) {
            case 0:
                throw new IllegalStateException("At least one Annotations object expected".toString());
            case 1:
                return (C1659h) C1415k.m6890j(list);
            default:
                return new C1668l(C1415k.m6893k((Iterable<? extends T>) list));
        }
    }

    /* renamed from: a */
    private static final boolean m9308a(C2071q qVar) {
        return qVar != C2071q.INFLEXIBLE;
    }

    /* renamed from: a */
    private static final <T> C2015c<T> m9304a(T t) {
        return new C2015c<>(t, null);
    }

    /* renamed from: b */
    private static final <T> C2015c<T> m9310b(T t) {
        return new C2015c<>(t, f6309a);
    }

    /* renamed from: c */
    private static final <T> C2015c<T> m9311c(T t) {
        return new C2015c<>(t, f6310b);
    }

    /* renamed from: a */
    private static final C2015c<C1799h> m9302a(C1799h hVar, C2016d dVar, C2071q qVar) {
        if (!m9308a(qVar)) {
            return m9304a((T) hVar);
        }
        if (!(hVar instanceof C1796e)) {
            return m9304a((T) hVar);
        }
        C1595c cVar = C1595c.f4995a;
        C2018e b = dVar.mo7888b();
        if (b != null) {
            switch (C2074t.f6311a[b.ordinal()]) {
                case 1:
                    if (qVar == C2071q.FLEXIBLE_LOWER) {
                        C1796e eVar = (C1796e) hVar;
                        if (cVar.mo7124a(eVar)) {
                            return m9311c(cVar.mo7128c(eVar));
                        }
                    }
                    break;
                case 2:
                    if (qVar == C2071q.FLEXIBLE_UPPER) {
                        C1796e eVar2 = (C1796e) hVar;
                        if (cVar.mo7126b(eVar2)) {
                            return m9311c(cVar.mo7129d(eVar2));
                        }
                    }
                    break;
            }
        }
        return m9304a((T) hVar);
    }

    /* renamed from: a */
    private static final C2015c<Boolean> m9303a(C2841w wVar, C2016d dVar, C2071q qVar) {
        C2015c<Boolean> cVar;
        if (!m9308a(qVar)) {
            return m9304a((T) Boolean.valueOf(wVar.mo7897c()));
        }
        C2020g a = dVar.mo7887a();
        if (a != null) {
            switch (C2074t.f6312b[a.ordinal()]) {
                case 1:
                    cVar = m9310b(Boolean.valueOf(true));
                    break;
                case 2:
                    cVar = m9310b(Boolean.valueOf(false));
                    break;
            }
        }
        cVar = m9304a((T) Boolean.valueOf(wVar.mo7897c()));
        return cVar;
    }

    static {
        C2355b bVar = C2088o.f6333k;
        C1489j.m6969a((Object) bVar, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        f6309a = new C2014b(bVar);
        C2355b bVar2 = C2088o.f6334l;
        C1489j.m6969a((Object) bVar2, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        f6310b = new C2014b(bVar2);
    }
}
