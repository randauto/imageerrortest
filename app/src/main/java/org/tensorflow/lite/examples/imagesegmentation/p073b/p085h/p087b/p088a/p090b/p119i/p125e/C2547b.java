package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1800i;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p136m.p138b.C2851a;

/* renamed from: b.h.b.a.b.i.e.b */
/* compiled from: ChainedMemberScope.kt */
public final class C2547b implements C2560h {

    /* renamed from: a */
    public static final C2548a f7615a = new C2548a(null);

    /* renamed from: b */
    private final String f7616b;

    /* renamed from: d */
    private final List<C2560h> f7617d;

    /* renamed from: b.h.b.a.b.i.e.b$a */
    /* compiled from: ChainedMemberScope.kt */
    public static final class C2548a {
        private C2548a() {
        }

        public /* synthetic */ C2548a(C1486g gVar) {
            this();
        }
    }

    public C2547b(String str, List<? extends C2560h> list) {
        C1489j.m6972b(str, "debugName");
        C1489j.m6972b(list, "scopes");
        this.f7616b = str;
        this.f7617d = list;
    }

    /* renamed from: c */
    public C1799h mo7649c(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        C1799h hVar = null;
        for (C2560h c : this.f7617d) {
            C1799h c2 = c.mo7649c(fVar, bVar);
            if (c2 != null) {
                if (!(c2 instanceof C1800i) || !((C1800i) c2).mo7083u()) {
                    return c2;
                }
                if (hVar == null) {
                    hVar = c2;
                }
            }
        }
        return hVar;
    }

    /* renamed from: a */
    public Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        List<C2560h> list = this.f7617d;
        if (list.isEmpty()) {
            return C1395aj.m6759a();
        }
        Collection collection = null;
        for (C2560h a : list) {
            collection = C2851a.m13901a(collection, a.mo7443a(fVar, bVar));
        }
        return collection != null ? collection : C1395aj.m6759a();
    }

    /* renamed from: b */
    public Collection<C1691al> mo7444b(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        List<C2560h> list = this.f7617d;
        if (list.isEmpty()) {
            return C1395aj.m6759a();
        }
        Collection collection = null;
        for (C2560h b : list) {
            collection = C2851a.m13901a(collection, b.mo7444b(fVar, bVar));
        }
        return collection != null ? collection : C1395aj.m6759a();
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        List<C2560h> list = this.f7617d;
        if (list.isEmpty()) {
            return C1395aj.m6759a();
        }
        Collection collection = null;
        for (C2560h a : list) {
            collection = C2851a.m13901a(collection, a.mo7373a(dVar, bVar));
        }
        return collection != null ? collection : C1395aj.m6759a();
    }

    /* renamed from: D_ */
    public Set<C2360f> mo7441D_() {
        Iterable<C2560h> iterable = this.f7617d;
        Collection linkedHashSet = new LinkedHashSet();
        for (C2560h D_ : iterable) {
            C1415k.m6849a(linkedHashSet, (Iterable<? extends T>) D_.mo7441D_());
        }
        return (Set) linkedHashSet;
    }

    /* renamed from: G_ */
    public Set<C2360f> mo7442G_() {
        Iterable<C2560h> iterable = this.f7617d;
        Collection linkedHashSet = new LinkedHashSet();
        for (C2560h G_ : iterable) {
            C1415k.m6849a(linkedHashSet, (Iterable<? extends T>) G_.mo7442G_());
        }
        return (Set) linkedHashSet;
    }

    public String toString() {
        return this.f7616b;
    }
}
