package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3221p;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2596k;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.i.e.m */
/* compiled from: TypeIntersectionScope.kt */
public final class C2572m extends C2538a {

    /* renamed from: a */
    public static final C2573a f7672a = new C2573a(null);

    /* renamed from: b */
    private final C2547b f7673b;

    /* renamed from: b.h.b.a.b.i.e.m$a */
    /* compiled from: TypeIntersectionScope.kt */
    public static final class C2573a {
        private C2573a() {
        }

        public /* synthetic */ C2573a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2560h mo9602a(String str, Collection<? extends C2841w> collection) {
            C1489j.m6972b(str, "message");
            C1489j.m6972b(collection, "types");
            Iterable<C2841w> iterable = collection;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C2841w b : iterable) {
                arrayList.add(b.mo7787b());
            }
            C2547b bVar = new C2547b(str, (List) arrayList);
            if (collection.size() <= 1) {
                return bVar;
            }
            return new C2572m(bVar, null);
        }
    }

    /* renamed from: b.h.b.a.b.i.e.m$b */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C2574b extends C1490k implements C1450b<C1648a, C1648a> {

        /* renamed from: a */
        public static final C2574b f7674a = new C2574b();

        C2574b() {
            super(1);
        }

        /* renamed from: a */
        public final C1648a mo6756a(C1648a aVar) {
            C1489j.m6972b(aVar, "$receiver");
            return aVar;
        }
    }

    /* renamed from: b.h.b.a.b.i.e.m$c */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C2575c extends C1490k implements C1450b<C1691al, C1691al> {

        /* renamed from: a */
        public static final C2575c f7675a = new C2575c();

        C2575c() {
            super(1);
        }

        /* renamed from: a */
        public final C1691al mo6756a(C1691al alVar) {
            C1489j.m6972b(alVar, "$receiver");
            return alVar;
        }
    }

    /* renamed from: b.h.b.a.b.i.e.m$d */
    /* compiled from: TypeIntersectionScope.kt */
    static final class C2576d extends C1490k implements C1450b<C1687ah, C1687ah> {

        /* renamed from: a */
        public static final C2576d f7676a = new C2576d();

        C2576d() {
            super(1);
        }

        /* renamed from: a */
        public final C1687ah mo6756a(C1687ah ahVar) {
            C1489j.m6972b(ahVar, "$receiver");
            return ahVar;
        }
    }

    /* renamed from: a */
    public static final C2560h m12783a(String str, Collection<? extends C2841w> collection) {
        return f7672a.mo9602a(str, collection);
    }

    private C2572m(C2547b bVar) {
        this.f7673b = bVar;
    }

    public /* synthetic */ C2572m(C2547b bVar, C1486g gVar) {
        this(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2547b mo9563c() {
        return this.f7673b;
    }

    /* renamed from: b */
    public Collection<C1691al> mo7444b(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return C2596k.m12865a(super.mo7444b(fVar, bVar), C2575c.f7675a);
    }

    /* renamed from: a */
    public Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        return C2596k.m12865a(super.mo7443a(fVar, bVar), C2576d.f7676a);
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        Iterable a = super.mo7373a(dVar, bVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : a) {
            if (((C1804m) next) instanceof C1648a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        C3221p pVar = new C3221p(arrayList, arrayList2);
        List list = (List) pVar.mo10389c();
        List list2 = (List) pVar.mo10390d();
        if (list != null) {
            return C1415k.m6870b(C2596k.m12865a(list, C2574b.f7674a), (Iterable<? extends T>) list2);
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
    }
}
