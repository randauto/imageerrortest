package p073b.p085h.p087b.p088a.p090b.p136m;

import java.util.Collection;
import java.util.List;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p136m.C2849b.C2850a;

/* renamed from: b.h.b.a.b.m.h */
/* compiled from: modifierChecks.kt */
final class C2866h implements C2849b {

    /* renamed from: a */
    public static final C2866h f8147a = new C2866h();

    /* renamed from: b */
    private static final String f8148b = f8148b;

    private C2866h() {
    }

    /* renamed from: b */
    public String mo9963b(C1813t tVar) {
        C1489j.m6972b(tVar, "functionDescriptor");
        return C2850a.m13900a(this, tVar);
    }

    /* renamed from: a */
    public String mo9961a() {
        return f8148b;
    }

    /* renamed from: a */
    public boolean mo9962a(C1813t tVar) {
        boolean z;
        C1489j.m6972b(tVar, "functionDescriptor");
        List i = tVar.mo7236i();
        C1489j.m6969a((Object) i, "functionDescriptor.valueParameters");
        Iterable<C1705au> iterable = i;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (C1705au auVar : iterable) {
            C1489j.m6969a((Object) auVar, "it");
            if (C2524a.m12622a(auVar) || auVar.mo7325m() != null) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
