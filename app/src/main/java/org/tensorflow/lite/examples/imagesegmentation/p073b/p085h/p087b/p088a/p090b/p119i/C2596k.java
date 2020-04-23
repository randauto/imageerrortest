package p073b.p085h.p087b.p088a.p090b.p119i;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import p073b.C3230x;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p139n.C2913j;

/* renamed from: b.h.b.a.b.i.k */
/* compiled from: overridingUtils.kt */
public final class C2596k {

    /* renamed from: b.h.b.a.b.i.k$a */
    /* compiled from: overridingUtils.kt */
    static final class C2597a extends C1490k implements C1450b<D, D> {

        /* renamed from: a */
        public static final C2597a f7703a = new C2597a();

        C2597a() {
            super(1);
        }

        /* renamed from: a */
        public final D mo6756a(D d) {
            C1489j.m6972b(d, "$receiver");
            return d;
        }
    }

    /* renamed from: b.h.b.a.b.i.k$b */
    /* compiled from: overridingUtils.kt */
    static final class C2598b extends C1490k implements C1450b<H, C3230x> {

        /* renamed from: a */
        final /* synthetic */ C2913j f7704a;

        C2598b(C2913j jVar) {
            this.f7704a = jVar;
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            mo9624b(obj);
            return C3230x.f8645a;
        }

        /* renamed from: b */
        public final void mo9624b(H h) {
            C2913j jVar = this.f7704a;
            C1489j.m6969a((Object) h, "it");
            jVar.add(h);
        }
    }

    /* renamed from: a */
    public static final <H> Collection<H> m12865a(Collection<? extends H> collection, C1450b<? super H, ? extends C1648a> bVar) {
        C1489j.m6972b(collection, "$receiver");
        C1489j.m6972b(bVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C2913j a = C2913j.f8247a.mo10030a();
        while (true) {
            Collection collection2 = linkedList;
            if (!(!collection2.isEmpty())) {
                return a;
            }
            Object f = C1415k.m6883f((List<? extends T>) linkedList);
            C2913j a2 = C2913j.f8247a.mo10030a();
            Collection a3 = C2584j.m12820a(f, collection2, bVar, (C1450b<H, C3230x>) new C2598b<H,C3230x>(a2));
            if (a3.size() != 1 || !a2.isEmpty()) {
                Object a4 = C2584j.m12816a(a3, bVar);
                C1489j.m6969a(a4, "mostSpecific");
                C1648a aVar = (C1648a) bVar.mo6756a(a4);
                C1489j.m6969a((Object) a3, "overridableGroup");
                for (Object next : a3) {
                    C1489j.m6969a(next, "it");
                    if (!C2584j.m12841c(aVar, (C1648a) bVar.mo6756a(next))) {
                        a2.add(next);
                    }
                }
                Collection collection3 = a2;
                if (!collection3.isEmpty()) {
                    a.addAll(collection3);
                }
                a.add(a4);
            } else {
                C1489j.m6969a((Object) a3, "overridableGroup");
                Object f2 = C1415k.m6882f((Iterable<? extends T>) a3);
                C1489j.m6969a(f2, "overridableGroup.single()");
                a.add(f2);
            }
        }
    }

    /* renamed from: a */
    public static final <D extends C1648a> void m12866a(Collection<D> collection) {
        C1489j.m6972b(collection, "$receiver");
        Collection a = m12865a(collection, C2597a.f7703a);
        if (collection.size() != a.size()) {
            collection.retainAll(a);
        }
    }
}
