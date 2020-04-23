package p073b.p085h.p087b.p088a.p090b.p091a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.a.m */
/* compiled from: UnsignedType.kt */
public final class C1647m {

    /* renamed from: a */
    public static final C1647m f5220a = new C1647m();

    /* renamed from: b */
    private static final Set<C2360f> f5221b;

    static {
        C1646l[] values = C1646l.values();
        Collection arrayList = new ArrayList(values.length);
        for (C1646l a : values) {
            arrayList.add(a.mo7226a());
        }
        f5221b = C1415k.m6895m((List) arrayList);
    }

    private C1647m() {
    }

    /* renamed from: a */
    public final boolean mo7230a(C2841w wVar) {
        C1489j.m6972b(wVar, "type");
        if (C2783av.m13573a(wVar)) {
            return false;
        }
        C1799h d = wVar.mo9507g().mo7096d();
        if (d == null) {
            return false;
        }
        C1489j.m6969a((Object) d, "descriptor");
        return mo7229a((C1804m) d);
    }

    /* renamed from: a */
    public final boolean mo7229a(C1804m mVar) {
        C1489j.m6972b(mVar, "descriptor");
        C1804m b = mVar.mo7065b();
        return (b instanceof C1680ab) && C1489j.m6971a((Object) ((C1680ab) b).mo7284f(), (Object) C1627g.f5071c) && f5221b.contains(mVar.mo7351z_());
    }
}
