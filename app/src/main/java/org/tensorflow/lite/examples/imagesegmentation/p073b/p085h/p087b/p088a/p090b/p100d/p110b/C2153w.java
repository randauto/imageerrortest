package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import java.util.Collection;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.d.b.w */
/* compiled from: methodSignatureMapping.kt */
public final class C2153w implements C2152v<C2130j> {

    /* renamed from: a */
    public static final C2153w f6455a = new C2153w();

    /* renamed from: a */
    public void mo8088a(C2841w wVar, C1796e eVar) {
        C1489j.m6972b(wVar, "kotlinType");
        C1489j.m6972b(eVar, "descriptor");
    }

    /* renamed from: a */
    public boolean mo8089a() {
        return false;
    }

    /* renamed from: b */
    public String mo8090b(C1796e eVar) {
        C1489j.m6972b(eVar, "classDescriptor");
        return null;
    }

    /* renamed from: c */
    public Void mo8087a(C1796e eVar) {
        C1489j.m6972b(eVar, "classDescriptor");
        return null;
    }

    private C2153w() {
    }

    /* renamed from: a */
    public C2841w mo8086a(Collection<? extends C2841w> collection) {
        C1489j.m6972b(collection, "types");
        StringBuilder sb = new StringBuilder();
        sb.append("There should be no intersection type in existing descriptors, but found: ");
        sb.append(C1415k.m6859a(collection, null, null, null, 0, null, null, 63, null));
        throw new AssertionError(sb.toString());
    }
}
