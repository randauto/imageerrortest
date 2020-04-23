package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p142i.C3160h;
import p073b.p142i.C3161i;

/* renamed from: b.h.b.a.b.b.a.l */
/* compiled from: Annotations.kt */
public final class C1668l implements C1659h {

    /* renamed from: b */
    private final List<C1659h> f5259b;

    /* renamed from: b.h.b.a.b.b.a.l$a */
    /* compiled from: Annotations.kt */
    static final class C1669a extends C1490k implements C1450b<C1659h, C1651c> {

        /* renamed from: a */
        final /* synthetic */ C2355b f5260a;

        C1669a(C2355b bVar) {
            this.f5260a = bVar;
            super(1);
        }

        /* renamed from: a */
        public final C1651c mo6756a(C1659h hVar) {
            C1489j.m6972b(hVar, "it");
            return hVar.mo7254a(this.f5260a);
        }
    }

    /* renamed from: b.h.b.a.b.b.a.l$b */
    /* compiled from: Annotations.kt */
    static final class C1670b extends C1490k implements C1450b<C1659h, C3160h<? extends C1651c>> {

        /* renamed from: a */
        public static final C1670b f5261a = new C1670b();

        C1670b() {
            super(1);
        }

        /* renamed from: a */
        public final C3160h<C1651c> mo6756a(C1659h hVar) {
            C1489j.m6972b(hVar, "it");
            return C1415k.m6899q(hVar);
        }
    }

    public C1668l(List<? extends C1659h> list) {
        C1489j.m6972b(list, "delegates");
        this.f5259b = list;
    }

    public C1668l(C1659h... hVarArr) {
        C1489j.m6972b(hVarArr, "delegates");
        this(C1406e.m6823h(hVarArr));
    }

    /* renamed from: a */
    public boolean mo7255a() {
        Iterable<C1659h> iterable = this.f5259b;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (C1659h a : iterable) {
            if (!a.mo7255a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo7257b(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        Iterator a = C1415k.m6899q(this.f5259b).mo6822a();
        while (a.hasNext()) {
            if (((C1659h) a.next()).mo7257b(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C1651c mo7254a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return (C1651c) C3161i.m14685c(C3161i.m14690f(C1415k.m6899q(this.f5259b), new C1669a(bVar)));
    }

    /* renamed from: b */
    public List<C1658g> mo7256b() {
        Iterable<C1659h> iterable = this.f5259b;
        Collection arrayList = new ArrayList();
        for (C1659h b : iterable) {
            C1415k.m6849a(arrayList, (Iterable<? extends T>) b.mo7256b());
        }
        return (List) arrayList;
    }

    /* renamed from: c */
    public List<C1658g> mo7258c() {
        Iterable<C1659h> iterable = this.f5259b;
        Collection arrayList = new ArrayList();
        for (C1659h c : iterable) {
            C1415k.m6849a(arrayList, (Iterable<? extends T>) c.mo7258c());
        }
        return (List) arrayList;
    }

    public Iterator<C1651c> iterator() {
        return C3161i.m14687d(C1415k.m6899q(this.f5259b), C1670b.f5261a).mo6822a();
    }
}
