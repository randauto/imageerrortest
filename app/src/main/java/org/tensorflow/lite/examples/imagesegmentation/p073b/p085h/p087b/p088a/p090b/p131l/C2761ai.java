package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1800i;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;

/* renamed from: b.h.b.a.b.l.ai */
/* compiled from: StarProjectionImpl.kt */
public final class C2761ai {

    /* renamed from: b.h.b.a.b.l.ai$a */
    /* compiled from: StarProjectionImpl.kt */
    public static final class C2762a extends C2768ao {

        /* renamed from: a */
        final /* synthetic */ List f8023a;

        C2762a(List list) {
            this.f8023a = list;
        }

        /* renamed from: a */
        public C2771ap mo9871a(C2767an anVar) {
            C1489j.m6972b(anVar, "key");
            if (!this.f8023a.contains(anVar)) {
                return null;
            }
            C1799h d = anVar.mo7096d();
            if (d != null) {
                return C2783av.m13569a((C1700ar) d);
            }
            throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    /* renamed from: a */
    public static final C2841w m13489a(C1700ar arVar) {
        C1489j.m6972b(arVar, "$receiver");
        C1804m b = arVar.mo7065b();
        if (b != null) {
            C2767an e = ((C1800i) b).mo7067e();
            C1489j.m6969a((Object) e, "classDescriptor.typeConstructor");
            List b2 = e.mo7094b();
            C1489j.m6969a((Object) b2, "classDescriptor.typeConstructor.parameters");
            Iterable<C1700ar> iterable = b2;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C1700ar arVar2 : iterable) {
                C1489j.m6969a((Object) arVar2, "it");
                arrayList.add(arVar2.mo7067e());
            }
            C2778au a = C2778au.m13550a((C2774as) new C2762a((List) arrayList));
            List j = arVar.mo7315j();
            C1489j.m6969a((Object) j, "this.upperBounds");
            C2841w b3 = a.mo9889b((C2841w) C1415k.m6883f(j), C2792ba.OUT_VARIANCE);
            if (b3 != null) {
                return b3;
            }
            C2755ad u = C2524a.m12627d(arVar).mo7208u();
            C1489j.m6969a((Object) u, "builtIns.defaultBound");
            return u;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
    }
}
