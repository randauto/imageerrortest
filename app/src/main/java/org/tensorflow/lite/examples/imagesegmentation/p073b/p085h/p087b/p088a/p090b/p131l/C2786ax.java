package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.C3219n;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.l.ax */
/* compiled from: TypeWithEnhancement.kt */
public final class C2786ax {
    /* renamed from: a */
    public static final C2841w m13594a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        if (wVar instanceof C2785aw) {
            return ((C2785aw) wVar).mo9866k();
        }
        return null;
    }

    /* renamed from: b */
    public static final C2841w m13596b(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C2841w a = m13594a(wVar);
        return a != null ? a : wVar;
    }

    /* renamed from: a */
    public static final C2788az m13593a(C2788az azVar, C2841w wVar) {
        C1489j.m6972b(azVar, "$receiver");
        C1489j.m6972b(wVar, "origin");
        return m13595b(azVar, m13594a(wVar));
    }

    /* renamed from: b */
    public static final C2788az m13595b(C2788az azVar, C2841w wVar) {
        C2788az azVar2;
        C1489j.m6972b(azVar, "$receiver");
        if (wVar == null) {
            return azVar;
        }
        if (azVar instanceof C2755ad) {
            azVar2 = new C2757af((C2755ad) azVar, wVar);
        } else if (azVar instanceof C2834q) {
            azVar2 = new C2837s((C2834q) azVar, wVar);
        } else {
            throw new C3219n();
        }
        return azVar2;
    }
}
