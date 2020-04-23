package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1658g;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h.C1662b;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1843c;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1985a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1989d;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p130k.C2708d;
import p073b.p142i.C3160h;
import p073b.p142i.C3161i;

/* renamed from: b.h.b.a.b.d.a.c.e */
/* compiled from: LazyJavaAnnotations.kt */
public final class C1962e implements C1659h {

    /* renamed from: b */
    private final C2708d<C1985a, C1651c> f5908b = this.f5909c.mo7805e().mo7744a().mo9797b((C1450b<? super K, ? extends V>) new C1963a<Object,Object>(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1967h f5909c;

    /* renamed from: d */
    private final C1989d f5910d;

    /* renamed from: b.h.b.a.b.d.a.c.e$a */
    /* compiled from: LazyJavaAnnotations.kt */
    static final class C1963a extends C1490k implements C1450b<C1985a, C1651c> {

        /* renamed from: a */
        final /* synthetic */ C1962e f5911a;

        C1963a(C1962e eVar) {
            this.f5911a = eVar;
            super(1);
        }

        /* renamed from: a */
        public final C1651c mo6756a(C1985a aVar) {
            C1489j.m6972b(aVar, "annotation");
            return C1843c.f5659a.mo7597a(aVar, this.f5911a.f5909c);
        }
    }

    public C1962e(C1967h hVar, C1989d dVar) {
        C1489j.m6972b(hVar, "c");
        C1489j.m6972b(dVar, "annotationOwner");
        this.f5909c = hVar;
        this.f5910d = dVar;
    }

    /* renamed from: b */
    public boolean mo7257b(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C1662b.m7563b(this, bVar);
    }

    /* renamed from: a */
    public C1651c mo7254a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        C1985a a = this.f5910d.mo7830a(bVar);
        if (a != null) {
            C1651c cVar = (C1651c) this.f5908b.mo6756a(a);
            if (cVar != null) {
                return cVar;
            }
        }
        return C1843c.f5659a.mo7598a(bVar, this.f5910d, this.f5909c);
    }

    /* renamed from: b */
    public List<C1658g> mo7256b() {
        return C1415k.m6837a();
    }

    /* renamed from: c */
    public List<C1658g> mo7258c() {
        Iterable<C1651c> iterable = this;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C1651c gVar : iterable) {
            arrayList.add(new C1658g(gVar, null));
        }
        return (List) arrayList;
    }

    public Iterator<C1651c> iterator() {
        C3160h e = C3161i.m14688e(C1415k.m6899q(this.f5910d.mo7831a()), this.f5908b);
        C1843c cVar = C1843c.f5659a;
        C2355b bVar = C1627g.f5076h.f5168y;
        C1489j.m6969a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return C3161i.m14686d(C3161i.m14678a(e, (Object) cVar.mo7598a(bVar, this.f5910d, this.f5909c))).mo6822a();
    }

    /* renamed from: a */
    public boolean mo7255a() {
        return this.f5910d.mo7831a().isEmpty() && !this.f5910d.mo7832b();
    }
}
