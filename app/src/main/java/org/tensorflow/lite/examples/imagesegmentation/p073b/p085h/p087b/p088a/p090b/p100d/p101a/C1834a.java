package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1488i;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3123d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1971k;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2021h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2496b;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2505i;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p130k.C2708d;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p139n.C2901e;
import p073b.p085h.p087b.p088a.p090b.p139n.C2906h;

/* renamed from: b.h.b.a.b.d.a.a */
/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class C1834a {

    /* renamed from: a */
    private final C2708d<C1796e, C1651c> f5638a;

    /* renamed from: b */
    private final boolean f5639b = this.f5640c.mo9985a();

    /* renamed from: c */
    private final C2901e f5640c;

    /* renamed from: b.h.b.a.b.d.a.a$a */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public enum C1835a {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    /* renamed from: b.h.b.a.b.d.a.a$b */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class C1836b {

        /* renamed from: a */
        private final C1651c f5646a;

        /* renamed from: b */
        private final int f5647b;

        public C1836b(C1651c cVar, int i) {
            C1489j.m6972b(cVar, "typeQualifier");
            this.f5646a = cVar;
            this.f5647b = i;
        }

        /* renamed from: a */
        public final C1651c mo7589a() {
            return this.f5646a;
        }

        /* renamed from: b */
        public final List<C1835a> mo7590b() {
            C1835a[] values = C1835a.values();
            Collection arrayList = new ArrayList();
            for (C1835a aVar : values) {
                if (m8523a(aVar)) {
                    arrayList.add(aVar);
                }
            }
            return (List) arrayList;
        }

        /* renamed from: a */
        private final boolean m8523a(C1835a aVar) {
            return m8524b(C1835a.TYPE_USE) || m8524b(aVar);
        }

        /* renamed from: b */
        private final boolean m8524b(C1835a aVar) {
            return ((1 << aVar.ordinal()) & this.f5647b) != 0;
        }
    }

    /* renamed from: b.h.b.a.b.d.a.a$c */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    static final class C1837c extends C1488i implements C1450b<C1796e, C1651c> {
        C1837c(C1834a aVar) {
            super(1, aVar);
        }

        /* renamed from: f */
        public final C3123d mo6930f() {
            return C1503v.m6999a(C1834a.class);
        }

        /* renamed from: g */
        public final String mo6931g() {
            return "computeTypeQualifierNickname";
        }

        /* renamed from: h */
        public final String mo6932h() {
            return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
        }

        /* renamed from: a */
        public final C1651c mo6756a(C1796e eVar) {
            C1489j.m6972b(eVar, "p1");
            return ((C1834a) this.f4850a).m8512a(eVar);
        }
    }

    public C1834a(C2713i iVar, C2901e eVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(eVar, "jsr305State");
        this.f5640c = eVar;
        this.f5638a = iVar.mo9797b((C1450b<? super K, ? extends V>) new C1837c<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1651c m8512a(C1796e eVar) {
        C1651c cVar;
        if (!eVar.mo7086x().mo7257b(C1862b.f5696a)) {
            return null;
        }
        Iterator it = eVar.mo7086x().iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = mo7583a((C1651c) it.next());
            if (cVar != null) {
                break;
            }
        }
        return cVar;
    }

    /* renamed from: b */
    private final C1651c m8515b(C1796e eVar) {
        if (eVar.mo7073l() != C1797f.ANNOTATION_CLASS) {
            return null;
        }
        return (C1651c) this.f5638a.mo6756a(eVar);
    }

    /* renamed from: a */
    public final C1651c mo7583a(C1651c cVar) {
        C1489j.m6972b(cVar, "annotationDescriptor");
        if (this.f5640c.mo9985a()) {
            return null;
        }
        C1796e a = C2524a.m12616a(cVar);
        if (a == null) {
            return null;
        }
        if (C1862b.m8597b(a)) {
            return cVar;
        }
        return m8515b(a);
    }

    /* renamed from: b */
    public final C1971k mo7585b(C1651c cVar) {
        C1489j.m6972b(cVar, "annotationDescriptor");
        if (this.f5640c.mo9985a()) {
            return null;
        }
        C1971k kVar = (C1971k) C1862b.f5700e.get(cVar.mo7240b());
        if (kVar == null) {
            return null;
        }
        C2021h a = kVar.mo7811a();
        Collection b = kVar.mo7812b();
        C2906h d = mo7587d(cVar);
        if (!(d != C2906h.IGNORE)) {
            d = null;
        }
        if (d != null) {
            return new C1971k(C2021h.m9176a(a, null, d.mo9999a(), 1, null), b);
        }
        return null;
    }

    /* renamed from: c */
    public final C1836b mo7586c(C1651c cVar) {
        Object obj;
        boolean z;
        List list;
        C1489j.m6972b(cVar, "annotationDescriptor");
        if (this.f5640c.mo9985a()) {
            return null;
        }
        C1796e a = C2524a.m12616a(cVar);
        if (a != null) {
            if (!a.mo7086x().mo7257b(C1862b.f5698c)) {
                a = null;
            }
            if (a != null) {
                C1796e a2 = C2524a.m12616a(cVar);
                if (a2 == null) {
                    C1489j.m6968a();
                }
                C1651c a3 = a2.mo7086x().mo7254a(C1862b.f5698c);
                if (a3 == null) {
                    C1489j.m6968a();
                }
                Map c = a3.mo7241c();
                Collection arrayList = new ArrayList();
                for (Entry entry : c.entrySet()) {
                    C2360f fVar = (C2360f) entry.getKey();
                    C2500f fVar2 = (C2500f) entry.getValue();
                    if (C1489j.m6971a((Object) fVar, (Object) C2088o.f6325c)) {
                        list = m8514a(fVar2);
                    } else {
                        list = C1415k.m6837a();
                    }
                    C1415k.m6849a(arrayList, (Iterable<? extends T>) list);
                }
                int i = 0;
                for (C1835a ordinal : (List) arrayList) {
                    i |= 1 << ordinal.ordinal();
                }
                Iterator it = a.mo7086x().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (mo7583a((C1651c) obj) != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C1651c cVar2 = (C1651c) obj;
                if (cVar2 != null) {
                    return new C1836b(cVar2, i);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C2906h mo7587d(C1651c cVar) {
        C1489j.m6972b(cVar, "annotationDescriptor");
        C2906h e = mo7588e(cVar);
        if (e != null) {
            return e;
        }
        return this.f5640c.mo9986b();
    }

    /* renamed from: e */
    public final C2906h mo7588e(C1651c cVar) {
        C1489j.m6972b(cVar, "annotationDescriptor");
        Map d = this.f5640c.mo9988d();
        C2355b b = cVar.mo7240b();
        C2906h hVar = null;
        C2906h hVar2 = (C2906h) d.get(b != null ? b.mo9013a() : null);
        if (hVar2 != null) {
            return hVar2;
        }
        C1796e a = C2524a.m12616a(cVar);
        if (a != null) {
            hVar = m8516c(a);
        }
        return hVar;
    }

    /* renamed from: c */
    private final C2906h m8516c(C1796e eVar) {
        C1651c a = eVar.mo7086x().mo7254a(C1862b.f5699d);
        C2906h hVar = null;
        C2500f b = a != null ? C2524a.m12624b(a) : null;
        if (!(b instanceof C2505i)) {
            b = null;
        }
        C2505i iVar = (C2505i) b;
        if (iVar == null) {
            return null;
        }
        C2906h c = this.f5640c.mo9987c();
        if (c != null) {
            return c;
        }
        String a2 = iVar.mo9529b().mo9039a();
        int hashCode = a2.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && a2.equals("WARN")) {
                    hVar = C2906h.WARN;
                }
            } else if (a2.equals("STRICT")) {
                hVar = C2906h.STRICT;
            }
        } else if (a2.equals("IGNORE")) {
            hVar = C2906h.IGNORE;
        }
        return hVar;
    }

    /* renamed from: a */
    private final List<C1835a> m8514a(C2500f<?> fVar) {
        C1835a aVar;
        if (fVar instanceof C2496b) {
            Iterable<C2500f> iterable = (Iterable) ((C2496b) fVar).mo9521a();
            Collection arrayList = new ArrayList();
            for (C2500f a : iterable) {
                C1415k.m6849a(arrayList, (Iterable<? extends T>) m8514a(a));
            }
            return (List) arrayList;
        } else if (!(fVar instanceof C2505i)) {
            return C1415k.m6837a();
        } else {
            String b = ((C2505i) fVar).mo9529b().mo9040b();
            int hashCode = b.hashCode();
            if (hashCode != -2024225567) {
                if (hashCode != 66889946) {
                    if (hashCode != 107598562) {
                        if (hashCode == 446088073 && b.equals("PARAMETER")) {
                            aVar = C1835a.VALUE_PARAMETER;
                            return C1415k.m6838b(aVar);
                        }
                    } else if (b.equals("TYPE_USE")) {
                        aVar = C1835a.TYPE_USE;
                        return C1415k.m6838b(aVar);
                    }
                } else if (b.equals("FIELD")) {
                    aVar = C1835a.FIELD;
                    return C1415k.m6838b(aVar);
                }
            } else if (b.equals("METHOD")) {
                aVar = C1835a.METHOD_RETURN_TYPE;
                return C1415k.m6838b(aVar);
            }
            aVar = null;
            return C1415k.m6838b(aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo7584a() {
        return this.f5639b;
    }
}
