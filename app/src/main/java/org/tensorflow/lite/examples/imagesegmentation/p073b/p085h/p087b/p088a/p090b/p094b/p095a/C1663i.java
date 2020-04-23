package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h.C1662b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.b.a.i */
/* compiled from: AnnotationsImpl.kt */
public final class C1663i implements C1659h {

    /* renamed from: b */
    public static final C1664a f5250b = new C1664a(null);

    /* renamed from: c */
    private final List<C1651c> f5251c;

    /* renamed from: d */
    private final List<C1658g> f5252d;

    /* renamed from: b.h.b.a.b.b.a.i$a */
    /* compiled from: AnnotationsImpl.kt */
    public static final class C1664a {
        private C1664a() {
        }

        public /* synthetic */ C1664a(C1486g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public C1651c mo7254a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C1662b.m7562a(this, bVar);
    }

    /* renamed from: b */
    public boolean mo7257b(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C1662b.m7563b(this, bVar);
    }

    public C1663i(List<? extends C1651c> list) {
        C1489j.m6972b(list, "annotations");
        this.f5251c = list;
        Iterable<C1651c> iterable = list;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C1651c gVar : iterable) {
            arrayList.add(new C1658g(gVar, null));
        }
        this.f5252d = (List) arrayList;
    }

    /* renamed from: a */
    public boolean mo7255a() {
        return this.f5252d.isEmpty();
    }

    /* renamed from: b */
    public List<C1658g> mo7256b() {
        Iterable iterable = this.f5252d;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((C1658g) next).mo7248b() != null) {
                arrayList.add(next);
            }
        }
        Iterable<C1658g> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable2, 10));
        for (C1658g gVar : iterable2) {
            C1651c a = gVar.mo7247a();
            C1654e b = gVar.mo7248b();
            if (b == null) {
                C1489j.m6968a();
            }
            arrayList2.add(new C1658g(a, b));
        }
        return (List) arrayList2;
    }

    /* renamed from: c */
    public List<C1658g> mo7258c() {
        return this.f5252d;
    }

    public Iterator<C1651c> iterator() {
        return this.f5251c.iterator();
    }

    public String toString() {
        return this.f5251c.toString();
    }
}
