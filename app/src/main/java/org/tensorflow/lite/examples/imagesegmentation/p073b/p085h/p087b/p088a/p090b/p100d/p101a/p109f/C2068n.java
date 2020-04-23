package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f;

import java.util.Set;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.d.a.f.n */
/* compiled from: signatureEnhancement.kt */
public final class C2068n {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2016d m9292b(C2020g gVar, C2018e eVar, boolean z, boolean z2) {
        if (!z2 || gVar != C2020g.NOT_NULL) {
            return new C2016d(gVar, eVar, false, z);
        }
        return new C2016d(gVar, eVar, true, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final <T> T m9294b(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (C1489j.m6971a((Object) t4, (Object) t) && C1489j.m6971a((Object) t3, (Object) t2)) {
                t4 = null;
            } else if (t3 != null) {
                t4 = t3;
            }
            return t4;
        }
        if (t3 != null) {
            Set<? extends T> m = C1415k.m6895m(C1395aj.m6764a(set, t3));
            if (m != null) {
                set = m;
            }
        }
        return C1415k.m6884g((Iterable<? extends T>) set);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2020g m9293b(Set<? extends C2020g> set, C2020g gVar, boolean z) {
        if (gVar == C2020g.FORCE_FLEXIBILITY) {
            return C2020g.FORCE_FLEXIBILITY;
        }
        return (C2020g) m9294b(set, C2020g.NOT_NULL, C2020g.NULLABLE, gVar, z);
    }
}
