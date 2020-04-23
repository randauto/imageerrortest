package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import p073b.C3232z;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2648e;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2649f;

/* renamed from: b.h.b.a.b.d.b.f */
/* compiled from: JavaClassDataFinder.kt */
public final class C2126f implements C2649f {

    /* renamed from: a */
    private final C2136m f6431a;

    /* renamed from: b */
    private final C2123e f6432b;

    public C2126f(C2136m mVar, C2123e eVar) {
        C1489j.m6972b(mVar, "kotlinClassFinder");
        C1489j.m6972b(eVar, "deserializedDescriptorResolver");
        this.f6431a = mVar;
        this.f6432b = eVar;
    }

    /* renamed from: a */
    public C2648e mo8035a(C2354a aVar) {
        C1489j.m6972b(aVar, "classId");
        C2137n a = this.f6431a.mo7006a(aVar);
        if (a == null) {
            return null;
        }
        boolean a2 = C1489j.m6971a((Object) a.mo6998b(), (Object) aVar);
        if (!C3232z.f8648a || a2) {
            return this.f6432b.mo8033b(a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class with incorrect id found: expected ");
        sb.append(aVar);
        sb.append(", actual ");
        sb.append(a.mo6998b());
        throw new AssertionError(sb.toString());
    }
}
