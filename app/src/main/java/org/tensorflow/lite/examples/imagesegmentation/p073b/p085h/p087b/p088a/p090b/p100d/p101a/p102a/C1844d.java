package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1389ad;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1672n;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1673o;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1987b;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1998m;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2496b;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2505i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.d.a.a.d */
/* compiled from: JavaAnnotationMapper.kt */
public final class C1844d {

    /* renamed from: a */
    public static final C1844d f5670a = new C1844d();

    /* renamed from: b */
    private static final Map<String, EnumSet<C1673o>> f5671b = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a("PACKAGE", EnumSet.noneOf(C1673o.class)), C3226t.m14841a("TYPE", EnumSet.of(C1673o.CLASS, C1673o.FILE)), C3226t.m14841a("ANNOTATION_TYPE", EnumSet.of(C1673o.ANNOTATION_CLASS)), C3226t.m14841a("TYPE_PARAMETER", EnumSet.of(C1673o.TYPE_PARAMETER)), C3226t.m14841a("FIELD", EnumSet.of(C1673o.FIELD)), C3226t.m14841a("LOCAL_VARIABLE", EnumSet.of(C1673o.LOCAL_VARIABLE)), C3226t.m14841a("PARAMETER", EnumSet.of(C1673o.VALUE_PARAMETER)), C3226t.m14841a("CONSTRUCTOR", EnumSet.of(C1673o.CONSTRUCTOR)), C3226t.m14841a("METHOD", EnumSet.of(C1673o.FUNCTION, C1673o.PROPERTY_GETTER, C1673o.PROPERTY_SETTER)), C3226t.m14841a("TYPE_USE", EnumSet.of(C1673o.TYPE))});

    /* renamed from: c */
    private static final Map<String, C1672n> f5672c = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a("RUNTIME", C1672n.RUNTIME), C3226t.m14841a("CLASS", C1672n.BINARY), C3226t.m14841a("SOURCE", C1672n.SOURCE)});

    /* renamed from: b.h.b.a.b.d.a.a.d$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C1845a extends C1490k implements C1450b<C1821y, C2841w> {

        /* renamed from: a */
        public static final C1845a f5673a = new C1845a();

        C1845a() {
            super(1);
        }

        /* renamed from: a */
        public final C2841w mo6756a(C1821y yVar) {
            C1489j.m6972b(yVar, "module");
            C1705au a = C1838a.m8532a(C1843c.f5659a.mo7600b(), yVar.mo7522a().mo7188b(C1627g.f5076h.f5099E));
            if (a != null) {
                C2841w r = a.mo7320r();
                if (r != null) {
                    return r;
                }
            }
            C2755ad c = C2827p.m13791c("Error: AnnotationTarget[]");
            C1489j.m6969a((Object) c, "ErrorUtils.createErrorTy…ror: AnnotationTarget[]\")");
            return c;
        }
    }

    private C1844d() {
    }

    /* renamed from: a */
    public final Set<C1673o> mo7604a(String str) {
        EnumSet enumSet = (EnumSet) f5671b.get(str);
        return enumSet != null ? enumSet : C1395aj.m6759a();
    }

    /* renamed from: a */
    public final C2500f<?> mo7603a(List<? extends C1987b> list) {
        C1489j.m6972b(list, "arguments");
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next instanceof C1998m) {
                arrayList.add(next);
            }
        }
        Iterable<C1998m> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (C1998m mVar : iterable2) {
            C1844d dVar = f5670a;
            C2360f c = mVar.mo7854c();
            C1415k.m6849a(arrayList2, (Iterable<? extends T>) dVar.mo7604a(c != null ? c.mo9039a() : null));
        }
        Iterable<C1673o> iterable3 = (List) arrayList2;
        Collection arrayList3 = new ArrayList(C1415k.m6842a(iterable3, 10));
        for (C1673o oVar : iterable3) {
            C2354a a = C2354a.m11661a(C1627g.f5076h.f5100F);
            C1489j.m6969a((Object) a, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
            C2360f a2 = C2360f.m11701a(oVar.name());
            C1489j.m6969a((Object) a2, "Name.identifier(kotlinTarget.name)");
            arrayList3.add(new C2505i(a, a2));
        }
        return new C2496b<>((List) arrayList3, C1845a.f5673a);
    }

    /* renamed from: a */
    public final C2500f<?> mo7602a(C1987b bVar) {
        C2500f<?> fVar = null;
        if (!(bVar instanceof C1998m)) {
            bVar = null;
        }
        C1998m mVar = (C1998m) bVar;
        if (mVar != null) {
            Map<String, C1672n> map = f5672c;
            C2360f c = mVar.mo7854c();
            C1672n nVar = (C1672n) map.get(c != null ? c.mo9039a() : null);
            if (nVar != null) {
                C2354a a = C2354a.m11661a(C1627g.f5076h.f5101G);
                C1489j.m6969a((Object) a, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
                C2360f a2 = C2360f.m11701a(nVar.name());
                C1489j.m6969a((Object) a2, "Name.identifier(retention.name)");
                fVar = new C2505i<>(a, a2);
            }
        }
        return fVar;
    }
}
