package p073b.p085h.p087b.p088a.p090b.p136m;

import java.util.Arrays;
import java.util.Collection;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p136m.C2852c.C2854b;
import p073b.p085h.p087b.p088a.p090b.p136m.C2852c.C2855c;
import p073b.p143j.C3193j;

/* renamed from: b.h.b.a.b.m.d */
/* compiled from: modifierChecks.kt */
public final class C2856d {

    /* renamed from: a */
    private final C2360f f8133a;

    /* renamed from: b */
    private final C3193j f8134b;

    /* renamed from: c */
    private final Collection<C2360f> f8135c;

    /* renamed from: d */
    private final C1450b<C1813t, String> f8136d;

    /* renamed from: e */
    private final C2849b[] f8137e;

    private C2856d(C2360f fVar, C3193j jVar, Collection<C2360f> collection, C1450b<? super C1813t, String> bVar, C2849b... bVarArr) {
        this.f8133a = fVar;
        this.f8134b = jVar;
        this.f8135c = collection;
        this.f8136d = bVar;
        this.f8137e = bVarArr;
    }

    /* renamed from: a */
    public final boolean mo9965a(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        if (this.f8133a != null && (!C1489j.m6971a((Object) tVar.mo7351z_(), (Object) this.f8133a))) {
            return false;
        }
        if (this.f8134b != null) {
            String a = tVar.mo7351z_().mo9039a();
            C1489j.m6969a((Object) a, "functionDescriptor.name.asString()");
            if (!this.f8134b.mo10377a(a)) {
                return false;
            }
        }
        return this.f8135c == null || this.f8135c.contains(tVar.mo7351z_());
    }

    /* renamed from: b */
    public final C2852c mo9966b(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        for (C2849b b : this.f8137e) {
            String b2 = b.mo9963b(tVar);
            if (b2 != null) {
                return new C2854b(b2);
            }
        }
        String str = (String) this.f8136d.mo6756a(tVar);
        if (str != null) {
            return new C2854b(str);
        }
        return C2855c.f8132a;
    }

    public /* synthetic */ C2856d(C2360f fVar, C2849b[] bVarArr, C1450b bVar, int i, C1486g gVar) {
        if ((i & 4) != 0) {
            bVar = C28571.f8138a;
        }
        this(fVar, bVarArr, bVar);
    }

    public C2856d(C2360f fVar, C2849b[] bVarArr, C1450b<? super C1813t, String> bVar) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(bVarArr, "checks");
        C1489j.m6972b(bVar, "additionalChecks");
        this(fVar, (C3193j) null, null, bVar, (C2849b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public /* synthetic */ C2856d(C3193j jVar, C2849b[] bVarArr, C1450b bVar, int i, C1486g gVar) {
        if ((i & 4) != 0) {
            bVar = C28582.f8139a;
        }
        this(jVar, bVarArr, bVar);
    }

    public C2856d(C3193j jVar, C2849b[] bVarArr, C1450b<? super C1813t, String> bVar) {
        C1489j.m6972b(jVar, "regex");
        C1489j.m6972b(bVarArr, "checks");
        C1489j.m6972b(bVar, "additionalChecks");
        this((C2360f) null, jVar, null, bVar, (C2849b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public /* synthetic */ C2856d(Collection collection, C2849b[] bVarArr, C1450b bVar, int i, C1486g gVar) {
        if ((i & 4) != 0) {
            bVar = C28593.f8140a;
        }
        this(collection, bVarArr, bVar);
    }

    public C2856d(Collection<C2360f> collection, C2849b[] bVarArr, C1450b<? super C1813t, String> bVar) {
        C1489j.m6972b(collection, "nameList");
        C1489j.m6972b(bVarArr, "checks");
        C1489j.m6972b(bVar, "additionalChecks");
        this((C2360f) null, (C3193j) null, collection, bVar, (C2849b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }
}
