package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2582h;
import p073b.p085h.p087b.p088a.p090b.p119i.C2584j;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2566j.C2567a;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p139n.C2885a;

/* renamed from: b.h.b.a.b.i.e.e */
/* compiled from: GivenFunctionsMemberScope.kt */
public abstract class C2555e extends C2565i {

    /* renamed from: b */
    static final /* synthetic */ C3135k[] f7649b = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C2555e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: a */
    private final C2710f f7650a;

    /* renamed from: d */
    private final C1796e f7651d;

    /* renamed from: b.h.b.a.b.i.e.e$a */
    /* compiled from: GivenFunctionsMemberScope.kt */
    static final class C2556a extends C1490k implements C1449a<List<? extends C1804m>> {

        /* renamed from: a */
        final /* synthetic */ C2555e f7652a;

        C2556a(C2555e eVar) {
            this.f7652a = eVar;
            super(0);
        }

        /* renamed from: b */
        public final List<C1804m> mo6823a() {
            List a = this.f7652a.mo7105a();
            return C1415k.m6870b((Collection<? extends T>) a, (Iterable<? extends T>) this.f7652a.m12721a(a));
        }
    }

    /* renamed from: b.h.b.a.b.i.e.e$b */
    /* compiled from: GivenFunctionsMemberScope.kt */
    public static final class C2557b extends C2582h {

        /* renamed from: a */
        final /* synthetic */ C2555e f7653a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f7654b;

        C2557b(C2555e eVar, ArrayList arrayList) {
            this.f7653a = eVar;
            this.f7654b = arrayList;
        }

        /* renamed from: a */
        public void mo7448a(C1724b bVar) {
            C1489j.m6972b(bVar, "fakeOverride");
            C2584j.m12825a(bVar, null);
            this.f7654b.add(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo7449a(C1724b bVar, C1724b bVar2) {
            C1489j.m6972b(bVar, "fromSuper");
            C1489j.m6972b(bVar2, "fromCurrent");
            StringBuilder sb = new StringBuilder();
            sb.append("Conflict in scope of ");
            sb.append(this.f7653a.mo9590c());
            sb.append(": ");
            sb.append(bVar);
            sb.append(" vs ");
            sb.append(bVar2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: d */
    private final List<C1804m> m12722d() {
        return (List) C2712h.m13321a(this.f7650a, (Object) this, f7649b[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<C1813t> mo7105a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C1796e mo9590c() {
        return this.f7651d;
    }

    public C2555e(C2713i iVar, C1796e eVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(eVar, "containingClass");
        this.f7651d = eVar;
        this.f7650a = iVar.mo9793a((C1449a<? extends T>) new C2556a<Object>(this));
    }

    /* renamed from: a */
    public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        if (!dVar.mo9576a(C2552d.f7622b.mo9575a())) {
            return C1415k.m6837a();
        }
        return m12722d();
    }

    /* renamed from: b */
    public Collection<C1691al> mo7444b(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        Iterable d = m12722d();
        Collection arrayList = new ArrayList();
        for (Object next : d) {
            if (next instanceof C1691al) {
                arrayList.add(next);
            }
        }
        Iterable iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (C1489j.m6971a((Object) ((C1691al) next2).mo7351z_(), (Object) fVar)) {
                arrayList2.add(next2);
            }
        }
        return (List) arrayList2;
    }

    /* renamed from: a */
    public Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        Iterable d = m12722d();
        Collection arrayList = new ArrayList();
        for (Object next : d) {
            if (next instanceof C1687ah) {
                arrayList.add(next);
            }
        }
        Iterable iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (C1489j.m6971a((Object) ((C1687ah) next2).mo7351z_(), (Object) fVar)) {
                arrayList2.add(next2);
            }
        }
        return (List) arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<C1804m> m12721a(List<? extends C1813t> list) {
        List list2;
        ArrayList arrayList = new ArrayList(3);
        C2767an e = this.f7651d.mo7067e();
        C1489j.m6969a((Object) e, "containingClass.typeConstructor");
        Collection C_ = e.mo7405C_();
        C1489j.m6969a((Object) C_, "containingClass.typeConstructor.supertypes");
        Iterable<C2841w> iterable = C_;
        Collection arrayList2 = new ArrayList();
        for (C2841w b : iterable) {
            C1415k.m6849a(arrayList2, (Iterable<? extends T>) C2567a.m12758a(b.mo7787b(), null, null, 3, null));
        }
        Iterable iterable2 = (List) arrayList2;
        Collection arrayList3 = new ArrayList();
        for (Object next : iterable2) {
            if (next instanceof C1724b) {
                arrayList3.add(next);
            }
        }
        Iterable iterable3 = (List) arrayList3;
        Map linkedHashMap = new LinkedHashMap();
        for (Object next2 : iterable3) {
            C2360f z_ = ((C1724b) next2).mo7351z_();
            Object obj = linkedHashMap.get(z_);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(z_, obj);
            }
            ((List) obj).add(next2);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            C2360f fVar = (C2360f) entry.getKey();
            Iterable iterable4 = (List) entry.getValue();
            Map linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : iterable4) {
                Boolean valueOf = Boolean.valueOf(((C1724b) next3) instanceof C1813t);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                Collection collection = (List) entry2.getValue();
                if (booleanValue) {
                    Iterable iterable5 = list;
                    Collection arrayList4 = new ArrayList();
                    for (Object next4 : iterable5) {
                        if (C1489j.m6971a((Object) ((C1813t) next4).mo7351z_(), (Object) fVar)) {
                            arrayList4.add(next4);
                        }
                    }
                    list2 = (List) arrayList4;
                } else {
                    list2 = C1415k.m6837a();
                }
                C2584j.m12828a(fVar, collection, list2, this.f7651d, new C2557b(this, arrayList));
            }
        }
        return C2885a.m13948a(arrayList);
    }
}
