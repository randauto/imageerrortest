package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a;

import com.facebook.C4103m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1838a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1992g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1999n;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2001p;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2002q;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p142i.C3160h;
import p073b.p142i.C3161i;

/* renamed from: b.h.b.a.b.d.a.c.a.a */
/* compiled from: DeclaredMemberIndex.kt */
public class C1880a implements C1882b {

    /* renamed from: a */
    private final C1450b<C2002q, Boolean> f5731a = new C1881a(this);

    /* renamed from: b */
    private final Map<C2360f, List<C2002q>> f5732b;

    /* renamed from: c */
    private final Map<C2360f, C1999n> f5733c;

    /* renamed from: d */
    private final C1992g f5734d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1450b<C2001p, Boolean> f5735e;

    /* renamed from: b.h.b.a.b.d.a.c.a.a$a */
    /* compiled from: DeclaredMemberIndex.kt */
    static final class C1881a extends C1490k implements C1450b<C2002q, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1880a f5736a;

        C1881a(C1880a aVar) {
            this.f5736a = aVar;
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7647a((C2002q) obj));
        }

        /* renamed from: a */
        public final boolean mo7647a(C2002q qVar) {
            C1489j.m6972b(qVar, C4103m.f10541a);
            return ((Boolean) this.f5736a.f5735e.mo6756a(qVar)).booleanValue() && !C1838a.m8535a((C2001p) qVar);
        }
    }

    public C1880a(C1992g gVar, C1450b<? super C2001p, Boolean> bVar) {
        C1489j.m6972b(gVar, "jClass");
        C1489j.m6972b(bVar, "memberFilter");
        this.f5734d = gVar;
        this.f5735e = bVar;
        C3160h a = C3161i.m14677a(C1415k.m6899q(this.f5734d.mo7843k()), (C1450b) this.f5731a);
        Map<C2360f, List<C2002q>> linkedHashMap = new LinkedHashMap<>();
        Iterator a2 = a.mo6822a();
        while (a2.hasNext()) {
            Object next = a2.next();
            C2360f r = ((C2002q) next).mo7867r();
            Object obj = linkedHashMap.get(r);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(r, obj);
            }
            ((List) obj).add(next);
        }
        this.f5732b = linkedHashMap;
        C3160h a3 = C3161i.m14677a(C1415k.m6899q(this.f5734d.mo7844l()), (C1450b) this.f5735e);
        Map<C2360f, C1999n> linkedHashMap2 = new LinkedHashMap<>();
        Iterator a4 = a3.mo6822a();
        while (a4.hasNext()) {
            Object next2 = a4.next();
            linkedHashMap2.put(((C1999n) next2).mo7867r(), next2);
        }
        this.f5733c = linkedHashMap2;
    }

    /* renamed from: a */
    public Collection<C2002q> mo7643a(C2360f fVar) {
        C1489j.m6972b(fVar, "name");
        List list = (List) this.f5732b.get(fVar);
        if (list == null) {
            list = C1415k.m6837a();
        }
        return list;
    }

    /* renamed from: a */
    public Set<C2360f> mo7644a() {
        C3160h a = C3161i.m14677a(C1415k.m6899q(this.f5734d.mo7843k()), (C1450b) this.f5731a);
        Collection linkedHashSet = new LinkedHashSet();
        Iterator a2 = a.mo6822a();
        while (a2.hasNext()) {
            linkedHashSet.add(((C2002q) a2.next()).mo7867r());
        }
        return (Set) linkedHashSet;
    }

    /* renamed from: b */
    public C1999n mo7645b(C2360f fVar) {
        C1489j.m6972b(fVar, "name");
        return (C1999n) this.f5733c.get(fVar);
    }

    /* renamed from: b */
    public Set<C2360f> mo7646b() {
        C3160h a = C3161i.m14677a(C1415k.m6899q(this.f5734d.mo7844l()), (C1450b) this.f5735e);
        Collection linkedHashSet = new LinkedHashSet();
        Iterator a2 = a.mo6822a();
        while (a2.hasNext()) {
            linkedHashSet.add(((C1999n) a2.next()).mo7867r());
        }
        return (Set) linkedHashSet;
    }
}
