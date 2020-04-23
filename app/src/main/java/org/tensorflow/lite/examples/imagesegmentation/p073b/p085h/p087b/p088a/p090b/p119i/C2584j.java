package p073b.p085h.p087b.p088a.p090b.p119i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import p073b.C3221p;
import p073b.C3230x;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p080a.C1461m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1686ag;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1808q;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.C1817v;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1775o;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1791x;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1792y;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2531d.C2532a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2717c;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2717c.C2718a;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2719d;
import p073b.p085h.p087b.p088a.p090b.p139n.C2913j;

/* renamed from: b.h.b.a.b.i.j */
/* compiled from: OverridingUtil */
public class C2584j {

    /* renamed from: a */
    public static final C2584j f7683a = new C2584j(new C2718a() {
        /* renamed from: a */
        public boolean mo9496a(C2767an anVar, C2767an anVar2) {
            return anVar.equals(anVar2);
        }
    });

    /* renamed from: b */
    static final /* synthetic */ boolean f7684b = (!C2584j.class.desiredAssertionStatus());

    /* renamed from: c */
    private static final List<C2531d> f7685c = C1415k.m6893k((Iterable<? extends T>) ServiceLoader.load(C2531d.class, C2531d.class.getClassLoader()));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2718a f7686d;

    /* renamed from: b.h.b.a.b.i.j$a */
    /* compiled from: OverridingUtil */
    public static class C2594a {

        /* renamed from: a */
        private static final C2594a f7696a = new C2594a(C2595a.OVERRIDABLE, "SUCCESS");

        /* renamed from: b */
        private final C2595a f7697b;

        /* renamed from: c */
        private final String f7698c;

        /* renamed from: b.h.b.a.b.i.j$a$a */
        /* compiled from: OverridingUtil */
        public enum C2595a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        /* renamed from: a */
        public static C2594a m12861a() {
            return f7696a;
        }

        /* renamed from: a */
        public static C2594a m12862a(String str) {
            return new C2594a(C2595a.INCOMPATIBLE, str);
        }

        /* renamed from: b */
        public static C2594a m12863b(String str) {
            return new C2594a(C2595a.CONFLICT, str);
        }

        public C2594a(C2595a aVar, String str) {
            this.f7697b = aVar;
            this.f7698c = str;
        }

        /* renamed from: b */
        public C2595a mo9622b() {
            return this.f7697b;
        }
    }

    /* renamed from: a */
    public static C2584j m12813a(C2718a aVar) {
        return new C2584j(aVar);
    }

    private C2584j(C2718a aVar) {
        this.f7686d = aVar;
    }

    /* renamed from: a */
    public static <D extends C1648a> Set<D> m12823a(Set<D> set) {
        return m12824a(set, (C1461m<? super D, ? super D, C3221p<C1648a, C1648a>>) new C1461m<D, D, C3221p<C1648a, C1648a>>() {
            /* renamed from: a */
            public C3221p<C1648a, C1648a> mo6920a(D d, D d2) {
                return new C3221p<>(d, d2);
            }
        });
    }

    /* renamed from: a */
    public static <D> Set<D> m12824a(Set<D> set, C1461m<? super D, ? super D, C3221p<C1648a, C1648a>> mVar) {
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : set) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(next);
                    break;
                }
                C3221p pVar = (C3221p) mVar.mo6920a(next, it.next());
                C1648a aVar = (C1648a) pVar.mo10389c();
                C1648a aVar2 = (C1648a) pVar.mo10390d();
                if (m12830a((D) aVar, (D) aVar2)) {
                    it.remove();
                } else if (m12830a((D) aVar2, (D) aVar)) {
                    break;
                }
            }
        }
        if (f7684b || !linkedHashSet.isEmpty()) {
            return linkedHashSet;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("All candidates filtered out from ");
        sb.append(set);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public static <D extends C1648a> boolean m12830a(D d, D d2) {
        if (!d.equals(d2) && C2483a.f7531a.mo9494a((C1804m) d.mo7235h(), (C1804m) d2.mo7235h())) {
            return true;
        }
        C1648a h = d2.mo7235h();
        for (C1648a a : C2523c.m12582a(d)) {
            if (C2483a.f7531a.mo9494a((C1804m) h, (C1804m) a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Set<C1724b> m12822a(C1724b bVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m12826a(bVar, (Set<C1724b>) linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: a */
    private static void m12826a(C1724b bVar, Set<C1724b> set) {
        if (bVar.mo7344n().mo7345a()) {
            set.add(bVar);
        } else if (!bVar.mo7238k().isEmpty()) {
            for (C1724b a : bVar.mo7238k()) {
                m12826a(a, set);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("No overridden descriptors found for (fake override) ");
            sb.append(bVar);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public C2594a mo9613a(C1648a aVar, C1648a aVar2, C1796e eVar) {
        return mo9614a(aVar, aVar2, eVar, false);
    }

    /* renamed from: a */
    public C2594a mo9614a(C1648a aVar, C1648a aVar2, C1796e eVar, boolean z) {
        C2594a a = mo9615a(aVar, aVar2, z);
        boolean z2 = a.mo9622b() == C2595a.OVERRIDABLE;
        for (C2531d dVar : f7685c) {
            if (dVar.mo7969a() != C2532a.CONFLICTS_ONLY && (!z2 || dVar.mo7969a() != C2532a.SUCCESS_ONLY)) {
                switch (dVar.mo7970a(aVar, aVar2, eVar)) {
                    case OVERRIDABLE:
                        z2 = true;
                        break;
                    case CONFLICT:
                        return C2594a.m12863b("External condition failed");
                    case INCOMPATIBLE:
                        return C2594a.m12862a("External condition");
                }
            }
        }
        if (!z2) {
            return a;
        }
        for (C2531d dVar2 : f7685c) {
            if (dVar2.mo7969a() == C2532a.CONFLICTS_ONLY) {
                switch (dVar2.mo7970a(aVar, aVar2, eVar)) {
                    case OVERRIDABLE:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Contract violation in ");
                        sb.append(dVar2.getClass().getName());
                        sb.append(" condition. It's not supposed to end with success");
                        throw new IllegalStateException(sb.toString());
                    case CONFLICT:
                        return C2594a.m12863b("External condition failed");
                    case INCOMPATIBLE:
                        return C2594a.m12862a("External condition");
                }
            }
        }
        return C2594a.m12861a();
    }

    /* renamed from: a */
    public C2594a mo9615a(C1648a aVar, C1648a aVar2, boolean z) {
        C2594a b = m12839b(aVar, aVar2);
        if (b != null) {
            return b;
        }
        List a = m12821a(aVar);
        List a2 = m12821a(aVar2);
        List f = aVar.mo7233f();
        List f2 = aVar2.mo7233f();
        int i = 0;
        if (f.size() != f2.size()) {
            while (i < a.size()) {
                if (!C2717c.f7961a.mo9824b((C2841w) a.get(i), (C2841w) a2.get(i))) {
                    return C2594a.m12862a("Type parameter number mismatch");
                }
                i++;
            }
            return C2594a.m12863b("Type parameter number mismatch");
        }
        C2717c a3 = m12815a(f, f2);
        for (int i2 = 0; i2 < f.size(); i2++) {
            if (!m12834a((C1700ar) f.get(i2), (C1700ar) f2.get(i2), a3)) {
                return C2594a.m12862a("Type parameter bounds mismatch");
            }
        }
        for (int i3 = 0; i3 < a.size(); i3++) {
            if (!m12837a((C2841w) a.get(i3), (C2841w) a2.get(i3), a3)) {
                return C2594a.m12862a("Value parameter type mismatch");
            }
        }
        if ((aVar instanceof C1813t) && (aVar2 instanceof C1813t) && ((C1813t) aVar).mo7452C() != ((C1813t) aVar2).mo7452C()) {
            return C2594a.m12863b("Incompatible suspendability");
        }
        if (z) {
            C2841w g = aVar.mo7234g();
            C2841w g2 = aVar2.mo7234g();
            if (!(g == null || g2 == null)) {
                if (C2843y.m13884a(g2) && C2843y.m13884a(g)) {
                    i = 1;
                }
                if (i == 0 && !a3.mo9823a(g2, g)) {
                    return C2594a.m12863b("Return type mismatch");
                }
            }
        }
        return C2594a.m12861a();
    }

    /* renamed from: b */
    public static C2594a m12839b(C1648a aVar, C1648a aVar2) {
        boolean z = aVar instanceof C1813t;
        if (!z || (aVar2 instanceof C1813t)) {
            boolean z2 = aVar instanceof C1687ah;
            if (!z2 || (aVar2 instanceof C1687ah)) {
                if (!z && !z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("This type of CallableDescriptor cannot be checked for overridability: ");
                    sb.append(aVar);
                    throw new IllegalArgumentException(sb.toString());
                } else if (!aVar.mo7351z_().equals(aVar2.mo7351z_())) {
                    return C2594a.m12862a("Name mismatch");
                } else {
                    C2594a e = m12843e(aVar, aVar2);
                    if (e != null) {
                        return e;
                    }
                    return null;
                }
            }
        }
        return C2594a.m12862a("Member kind mismatch");
    }

    /* renamed from: a */
    private C2717c m12815a(List<C1700ar> list, List<C1700ar> list2) {
        if (!f7684b && list.size() != list2.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Should be the same number of type parameters: ");
            sb.append(list);
            sb.append(" vs ");
            sb.append(list2);
            throw new AssertionError(sb.toString());
        } else if (list.isEmpty()) {
            return C2719d.m13343a(this.f7686d);
        } else {
            final HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(((C1700ar) list.get(i)).mo7067e(), ((C1700ar) list2.get(i)).mo7067e());
            }
            return C2719d.m13343a(new C2718a() {
                /* renamed from: a */
                public boolean mo9496a(C2767an anVar, C2767an anVar2) {
                    boolean z = true;
                    if (C2584j.this.f7686d.mo9496a(anVar, anVar2)) {
                        return true;
                    }
                    C2767an anVar3 = (C2767an) hashMap.get(anVar);
                    C2767an anVar4 = (C2767an) hashMap.get(anVar2);
                    if ((anVar3 == null || !anVar3.equals(anVar2)) && (anVar4 == null || !anVar4.equals(anVar))) {
                        z = false;
                    }
                    return z;
                }
            });
        }
    }

    /* renamed from: e */
    private static C2594a m12843e(C1648a aVar, C1648a aVar2) {
        boolean z = false;
        boolean z2 = aVar.mo7231d() == null;
        if (aVar2.mo7231d() == null) {
            z = true;
        }
        if (z2 != z) {
            return C2594a.m12862a("Receiver presence mismatch");
        }
        if (aVar.mo7236i().size() != aVar2.mo7236i().size()) {
            return C2594a.m12862a("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m12837a(C2841w wVar, C2841w wVar2, C2717c cVar) {
        if ((C2843y.m13884a(wVar) && C2843y.m13884a(wVar2)) || cVar.mo9824b(wVar, wVar2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m12834a(C1700ar arVar, C1700ar arVar2, C2717c cVar) {
        List<C2841w> j = arVar.mo7315j();
        ArrayList arrayList = new ArrayList(arVar2.mo7315j());
        if (j.size() != arrayList.size()) {
            return false;
        }
        for (C2841w wVar : j) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (m12837a(wVar, (C2841w) listIterator.next(), cVar)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static List<C2841w> m12821a(C1648a aVar) {
        C1690ak d = aVar.mo7231d();
        ArrayList arrayList = new ArrayList();
        if (d != null) {
            arrayList.add(d.mo7320r());
        }
        for (C1705au r : aVar.mo7236i()) {
            arrayList.add(r.mo7320r());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m12828a(C2360f fVar, Collection<? extends C1724b> collection, Collection<? extends C1724b> collection2, C1796e eVar, C2583i iVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (C1724b a : collection2) {
            linkedHashSet.removeAll(m12817a(a, collection, eVar, iVar));
        }
        m12827a(eVar, (Collection<C1724b>) linkedHashSet, iVar);
    }

    /* renamed from: a */
    public static boolean m12836a(C1817v vVar, C1817v vVar2) {
        return !C1710ay.m7692a(vVar2.mo7077p()) && C1710ay.m7694a((C1808q) vVar2, (C1804m) vVar);
    }

    /* renamed from: a */
    private static Collection<C1724b> m12817a(C1724b bVar, Collection<? extends C1724b> collection, C1796e eVar, C2583i iVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        C2913j b = C2913j.m14007b();
        for (C1724b bVar2 : collection) {
            C2595a b2 = f7683a.mo9613a((C1648a) bVar2, (C1648a) bVar, eVar).mo9622b();
            boolean a = m12836a((C1817v) bVar, (C1817v) bVar2);
            switch (b2) {
                case OVERRIDABLE:
                    if (a) {
                        b.add(bVar2);
                    }
                    arrayList.add(bVar2);
                    break;
                case CONFLICT:
                    if (a) {
                        iVar.mo9611b(bVar2, bVar);
                    }
                    arrayList.add(bVar2);
                    break;
            }
        }
        iVar.mo7592a(bVar, b);
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m12840b(Collection<C1724b> collection) {
        if (collection.size() < 2) {
            return true;
        }
        final C1804m b = ((C1724b) collection.iterator().next()).mo7065b();
        return C1415k.m6879d((Iterable<? extends T>) collection, (C1450b<? super T, Boolean>) new C1450b<C1724b, Boolean>() {
            /* renamed from: a */
            public Boolean mo6756a(C1724b bVar) {
                return Boolean.valueOf(bVar.mo7065b() == b);
            }
        });
    }

    /* renamed from: a */
    private static void m12827a(C1796e eVar, Collection<C1724b> collection, C2583i iVar) {
        if (m12840b(collection)) {
            for (C1724b singleton : collection) {
                m12829a((Collection<C1724b>) Collections.singleton(singleton), eVar, iVar);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            m12829a(m12818a(C2599l.m12871a(linkedList), (Queue<C1724b>) linkedList, iVar), eVar, iVar);
        }
    }

    /* renamed from: c */
    public static boolean m12841c(C1648a aVar, C1648a aVar2) {
        C2841w g = aVar.mo7234g();
        C2841w g2 = aVar2.mo7234g();
        if (!f7684b && g == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Return type of ");
            sb.append(aVar);
            sb.append(" is null");
            throw new AssertionError(sb.toString());
        } else if (f7684b || g2 != null) {
            boolean z = false;
            if (!m12835a((C1808q) aVar, (C1808q) aVar2)) {
                return false;
            }
            if (aVar instanceof C1813t) {
                if (f7684b || (aVar2 instanceof C1813t)) {
                    return m12831a(aVar, g, aVar2, g2);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("b is ");
                sb2.append(aVar2.getClass());
                throw new AssertionError(sb2.toString());
            } else if (!(aVar instanceof C1687ah)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unexpected callable: ");
                sb3.append(aVar.getClass());
                throw new IllegalArgumentException(sb3.toString());
            } else if (f7684b || (aVar2 instanceof C1687ah)) {
                C1687ah ahVar = (C1687ah) aVar;
                C1687ah ahVar2 = (C1687ah) aVar2;
                if (!m12833a((C1686ag) ahVar.mo7299c(), (C1686ag) ahVar2.mo7299c())) {
                    return false;
                }
                if (ahVar.mo7330s() && ahVar2.mo7330s()) {
                    return f7683a.m12815a(aVar.mo7233f(), aVar2.mo7233f()).mo9824b(g, g2);
                }
                if ((ahVar.mo7330s() || !ahVar2.mo7330s()) && m12831a(aVar, g, aVar2, g2)) {
                    z = true;
                }
                return z;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("b is ");
                sb4.append(aVar2.getClass());
                throw new AssertionError(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Return type of ");
            sb5.append(aVar2);
            sb5.append(" is null");
            throw new AssertionError(sb5.toString());
        }
    }

    /* renamed from: a */
    private static boolean m12835a(C1808q qVar, C1808q qVar2) {
        Integer b = C1710ay.m7696b(qVar.mo7077p(), qVar2.mo7077p());
        return b == null || b.intValue() >= 0;
    }

    /* renamed from: a */
    private static boolean m12833a(C1686ag agVar, C1686ag agVar2) {
        if (agVar == null || agVar2 == null) {
            return true;
        }
        return m12835a((C1808q) agVar, (C1808q) agVar2);
    }

    /* renamed from: a */
    private static boolean m12832a(C1648a aVar, Collection<C1648a> collection) {
        for (C1648a c : collection) {
            if (!m12841c(aVar, c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m12831a(C1648a aVar, C2841w wVar, C1648a aVar2, C2841w wVar2) {
        return f7683a.m12815a(aVar.mo7233f(), aVar2.mo7233f()).mo9823a(wVar, wVar2);
    }

    /* renamed from: a */
    public static <H> H m12816a(Collection<H> collection, C1450b<H, C1648a> bVar) {
        if (!f7684b && collection.isEmpty()) {
            throw new AssertionError("Should have at least one overridable descriptor");
        } else if (collection.size() == 1) {
            return C1415k.m6865b((Iterable<? extends T>) collection);
        } else {
            ArrayList arrayList = new ArrayList(2);
            List c = C1415k.m6874c((Iterable<? extends T>) collection, bVar);
            H b = C1415k.m6865b((Iterable<? extends T>) collection);
            C1648a aVar = (C1648a) bVar.mo6756a(b);
            for (H next : collection) {
                C1648a aVar2 = (C1648a) bVar.mo6756a(next);
                if (m12832a(aVar2, (Collection<C1648a>) c)) {
                    arrayList.add(next);
                }
                if (m12841c(aVar2, aVar) && !m12841c(aVar, aVar2)) {
                    b = next;
                }
            }
            if (arrayList.isEmpty()) {
                return b;
            }
            if (arrayList.size() == 1) {
                return C1415k.m6865b((Iterable<? extends T>) arrayList);
            }
            H h = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                H next2 = it.next();
                if (!C2838t.m13858a(((C1648a) bVar.mo6756a(next2)).mo7234g())) {
                    h = next2;
                    break;
                }
            }
            if (h != null) {
                return h;
            }
            return C1415k.m6865b((Iterable<? extends T>) arrayList);
        }
    }

    /* renamed from: a */
    private static void m12829a(Collection<C1724b> collection, C1796e eVar, C2583i iVar) {
        Collection<C1724b> a = m12819a(eVar, collection);
        boolean isEmpty = a.isEmpty();
        if (!isEmpty) {
            collection = a;
        }
        C1724b a2 = ((C1724b) m12816a(collection, (C1450b<H, C1648a>) new C1450b<C1724b, C1648a>() {
            /* renamed from: a */
            public C1724b mo6756a(C1724b bVar) {
                return bVar;
            }
        })).mo7341a(eVar, m12811a(collection, eVar), isEmpty ? C1710ay.f5343h : C1710ay.f5342g, C1725a.FAKE_OVERRIDE, false);
        iVar.mo7592a(a2, collection);
        if (f7684b || !a2.mo7238k().isEmpty()) {
            iVar.mo7448a(a2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Overridden descriptors should be set for ");
        sb.append(C1725a.FAKE_OVERRIDE);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    private static C1818w m12811a(Collection<C1724b> collection, C1796e eVar) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (C1724b m : collection) {
            switch (m.mo7074m()) {
                case FINAL:
                    return C1818w.FINAL;
                case SEALED:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Member cannot have SEALED modality: ");
                    sb.append(m);
                    throw new IllegalStateException(sb.toString());
                case OPEN:
                    z2 = true;
                    break;
                case ABSTRACT:
                    z3 = true;
                    break;
            }
        }
        if (!(!eVar.mo7083u() || eVar.mo7074m() == C1818w.ABSTRACT || eVar.mo7074m() == C1818w.SEALED)) {
            z = true;
        }
        if (z2 && !z3) {
            return C1818w.OPEN;
        }
        if (z2 || !z3) {
            HashSet hashSet = new HashSet();
            for (C1724b a : collection) {
                hashSet.addAll(m12822a(a));
            }
            return m12812a((Collection<C1724b>) m12823a((Set<D>) hashSet), z, eVar.mo7074m());
        }
        return z ? eVar.mo7074m() : C1818w.ABSTRACT;
    }

    /* renamed from: a */
    private static C1818w m12812a(Collection<C1724b> collection, boolean z, C1818w wVar) {
        C1818w wVar2 = C1818w.ABSTRACT;
        for (C1724b bVar : collection) {
            C1818w m = (!z || bVar.mo7074m() != C1818w.ABSTRACT) ? bVar.mo7074m() : wVar;
            if (m.compareTo(wVar2) < 0) {
                wVar2 = m;
            }
        }
        return wVar2;
    }

    /* renamed from: a */
    private static Collection<C1724b> m12819a(final C1796e eVar, Collection<C1724b> collection) {
        return C1415k.m6868b((Iterable<? extends T>) collection, (C1450b<? super T, Boolean>) new C1450b<C1724b, Boolean>() {
            /* renamed from: a */
            public Boolean mo6756a(C1724b bVar) {
                return Boolean.valueOf(!C1710ay.m7692a(bVar.mo7077p()) && C1710ay.m7694a((C1808q) bVar, (C1804m) eVar));
            }
        });
    }

    /* renamed from: a */
    public static <H> Collection<H> m12820a(H h, Collection<H> collection, C1450b<H, C1648a> bVar, C1450b<H, C3230x> bVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        C1648a aVar = (C1648a) bVar.mo6756a(h);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            C1648a aVar2 = (C1648a) bVar.mo6756a(next);
            if (h == next) {
                it.remove();
            } else {
                C2595a d = m12842d(aVar, aVar2);
                if (d == C2595a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (d == C2595a.CONFLICT) {
                    bVar2.mo6756a(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static C2595a m12842d(C1648a aVar, C1648a aVar2) {
        C2595a b = f7683a.mo9613a(aVar2, aVar, (C1796e) null).mo9622b();
        C2595a b2 = f7683a.mo9613a(aVar, aVar2, (C1796e) null).mo9622b();
        if (b == C2595a.OVERRIDABLE && b2 == C2595a.OVERRIDABLE) {
            return C2595a.OVERRIDABLE;
        }
        return (b == C2595a.CONFLICT || b2 == C2595a.CONFLICT) ? C2595a.CONFLICT : C2595a.INCOMPATIBLE;
    }

    /* renamed from: a */
    private static Collection<C1724b> m12818a(final C1724b bVar, Queue<C1724b> queue, final C2583i iVar) {
        return m12820a((H) bVar, (Collection<H>) queue, (C1450b<H, C1648a>) new C1450b<C1724b, C1648a>() {
            /* renamed from: a */
            public C1648a mo6756a(C1724b bVar) {
                return bVar;
            }
        }, (C1450b<H, C3230x>) new C1450b<C1724b, C3230x>() {
            /* renamed from: a */
            public C3230x mo6756a(C1724b bVar) {
                iVar.mo9612c(bVar, bVar);
                return C3230x.f8645a;
            }
        });
    }

    /* renamed from: a */
    public static void m12825a(C1724b bVar, C1450b<C1724b, C3230x> bVar2) {
        C1723az azVar;
        for (C1724b bVar3 : bVar.mo7238k()) {
            if (bVar3.mo7077p() == C1710ay.f5342g) {
                m12825a(bVar3, bVar2);
            }
        }
        if (bVar.mo7077p() == C1710ay.f5342g) {
            C1723az b = m12838b(bVar);
            if (b == null) {
                if (bVar2 != null) {
                    bVar2.mo6756a(bVar);
                }
                azVar = C1710ay.f5340e;
            } else {
                azVar = b;
            }
            if (bVar instanceof C1792y) {
                ((C1792y) bVar).mo7553a(azVar);
                for (C1686ag a : ((C1687ah) bVar).mo7300o()) {
                    m12825a((C1724b) a, b == null ? null : bVar2);
                }
            } else if (bVar instanceof C1775o) {
                ((C1775o) bVar).mo7455a(azVar);
            } else if (f7684b || (bVar instanceof C1791x)) {
                C1791x xVar = (C1791x) bVar;
                xVar.mo7543a(azVar);
                if (azVar != xVar.mo7296q().mo7077p()) {
                    xVar.mo7545a(false);
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: b */
    private static C1723az m12838b(C1724b bVar) {
        Collection<C1724b> k = bVar.mo7238k();
        C1723az a = m12810a(k);
        if (a == null) {
            return null;
        }
        if (bVar.mo7344n() != C1725a.FAKE_OVERRIDE) {
            return a.mo7338b();
        }
        for (C1724b bVar2 : k) {
            if (bVar2.mo7074m() != C1818w.ABSTRACT && !bVar2.mo7077p().equals(a)) {
                return null;
            }
        }
        return a;
    }

    /* renamed from: a */
    public static C1723az m12810a(Collection<? extends C1724b> collection) {
        if (collection.isEmpty()) {
            return C1710ay.f5346k;
        }
        Iterator it = collection.iterator();
        while (true) {
            C1723az azVar = null;
            while (true) {
                if (it.hasNext()) {
                    C1724b bVar = (C1724b) it.next();
                    C1723az p = bVar.mo7077p();
                    if (f7684b || p != C1710ay.f5342g) {
                        if (azVar != null) {
                            Integer b = C1710ay.m7696b(p, azVar);
                            if (b != null) {
                                if (b.intValue() <= 0) {
                                }
                            }
                        }
                        azVar = p;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Visibility should have been computed for ");
                        sb.append(bVar);
                        throw new AssertionError(sb.toString());
                    }
                } else if (azVar == null) {
                    return null;
                } else {
                    for (C1724b p2 : collection) {
                        Integer b2 = C1710ay.m7696b(azVar, p2.mo7077p());
                        if (b2 != null) {
                            if (b2.intValue() < 0) {
                            }
                        }
                        return null;
                    }
                    return azVar;
                }
            }
        }
    }
}
