package p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1728b;
import p073b.p085h.p087b.p088a.p090b.p098c.C1825a;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2209am;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2256s;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2278a;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2290h;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2296k;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2296k.C2297a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2552d;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2657i;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2661k;

/* renamed from: b.h.b.a.b.j.a.a.i */
/* compiled from: DeserializedPackageMemberScope.kt */
public class C2637i extends C2628h {

    /* renamed from: a */
    private final C2355b f7787a = this.f7788d.mo7284f();

    /* renamed from: d */
    private final C1680ab f7788d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9653a(Collection<C1804m> collection, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(collection, "result");
        C1489j.m6972b(bVar, "nameFilter");
    }

    public C2637i(C1680ab abVar, C2256s sVar, C2285c cVar, C2278a aVar, C2625f fVar, C2657i iVar, C1449a<? extends Collection<C2360f>> aVar2) {
        C1680ab abVar2 = abVar;
        C1489j.m6972b(abVar2, "packageDescriptor");
        C1489j.m6972b(sVar, "proto");
        C1489j.m6972b(cVar, "nameResolver");
        C1489j.m6972b(aVar, "metadataVersion");
        C1489j.m6972b(iVar, "components");
        C1449a<? extends Collection<C2360f>> aVar3 = aVar2;
        C1489j.m6972b(aVar3, "classNames");
        C2193ag p = sVar.mo8684p();
        C1489j.m6969a((Object) p, "proto.typeTable");
        C2290h hVar = new C2290h(p);
        C2297a aVar4 = C2296k.f7049a;
        C2209am r = sVar.mo8686r();
        C1489j.m6969a((Object) r, "proto.versionRequirementTable");
        C2661k a = iVar.mo9716a(abVar, cVar, hVar, aVar4.mo8827a(r), aVar, fVar);
        List d = sVar.mo8677d();
        C1489j.m6969a((Object) d, "proto.functionList");
        Collection collection = d;
        List f = sVar.mo8679f();
        C1489j.m6969a((Object) f, "proto.propertyList");
        Collection collection2 = f;
        List j = sVar.mo8681j();
        C1489j.m6969a((Object) j, "proto.typeAliasList");
        super(a, collection, collection2, j, aVar3);
        this.f7788d = abVar2;
    }

    /* renamed from: b */
    public List<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
        C1489j.m6972b(dVar, "kindFilter");
        C1489j.m6972b(bVar, "nameFilter");
        Collection a = mo9673a(dVar, bVar, C1830d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<C1728b> l = mo9676f().mo9742d().mo9727l();
        Collection arrayList = new ArrayList();
        for (C1728b a2 : l) {
            C1415k.m6849a(arrayList, (Iterable<? extends T>) a2.mo7053a(this.f7787a));
        }
        return C1415k.m6870b(a, (Iterable<? extends T>) (List) arrayList);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9674b(p073b.p085h.p087b.p088a.p090b.p116f.C2360f r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            p073b.p079e.p081b.C1489j.m6972b(r6, r0)
            boolean r0 = super.mo9674b(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0045
            b.h.b.a.b.j.a.k r0 = r5.mo9676f()
            b.h.b.a.b.j.a.i r0 = r0.mo9742d()
            java.lang.Iterable r0 = r0.mo9727l()
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0028
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0028
        L_0x0026:
            r6 = 0
            goto L_0x0041
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0026
            java.lang.Object r3 = r0.next()
            b.h.b.a.b.b.b.b r3 = (p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1728b) r3
            b.h.b.a.b.f.b r4 = r5.f7787a
            boolean r3 = r3.mo7054a(r4, r6)
            if (r3 == 0) goto L_0x002c
            r6 = 1
        L_0x0041:
            if (r6 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2637i.mo9674b(b.h.b.a.b.f.f):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2354a mo9651a(C2360f fVar) {
        C1489j.m6972b(fVar, "name");
        return new C2354a(this.f7787a, fVar);
    }

    /* renamed from: c */
    public C1799h mo7649c(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        mo7675d(fVar, bVar);
        return super.mo7649c(fVar, bVar);
    }

    /* renamed from: d */
    public void mo7675d(C2360f fVar, C1827b bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVar, "location");
        C1825a.m8499a(mo9676f().mo9742d().mo9725j(), bVar, this.f7788d, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Set<C2360f> mo9655c() {
        return C1395aj.m6759a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Set<C2360f> mo9656d() {
        return C1395aj.m6759a();
    }
}
