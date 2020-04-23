package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2758ag;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2834q;

/* renamed from: b.h.b.a.b.l.a.m */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C2729m {

    /* renamed from: a */
    public static final C2729m f7976a = new C2729m();

    private C2729m() {
    }

    /* renamed from: a */
    public final boolean mo9842a(C2788az azVar, C2788az azVar2) {
        C1489j.m6972b(azVar, "a");
        C1489j.m6972b(azVar2, "b");
        boolean z = true;
        if (azVar == azVar2) {
            return true;
        }
        if ((azVar instanceof C2755ad) && (azVar2 instanceof C2755ad)) {
            return mo9841a((C2755ad) azVar, (C2755ad) azVar2);
        }
        if (!(azVar instanceof C2834q) || !(azVar2 instanceof C2834q)) {
            return false;
        }
        C2834q qVar = (C2834q) azVar;
        C2834q qVar2 = (C2834q) azVar2;
        if (!mo9841a(qVar.mo9945f(), qVar2.mo9945f()) || !mo9841a(qVar.mo9946h(), qVar2.mo9946h())) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo9841a(C2755ad adVar, C2755ad adVar2) {
        C1489j.m6972b(adVar, "a");
        C1489j.m6972b(adVar2, "b");
        if (adVar.mo7897c() != adVar2.mo7897c() || C2758ag.m13481c(adVar) != C2758ag.m13481c(adVar2) || (!C1489j.m6971a((Object) adVar.mo9507g(), (Object) adVar2.mo9507g())) || adVar.mo9501a().size() != adVar2.mo9501a().size()) {
            return false;
        }
        if (adVar.mo9501a() == adVar2.mo9501a()) {
            return true;
        }
        int size = adVar.mo9501a().size();
        for (int i = 0; i < size; i++) {
            C2771ap apVar = (C2771ap) adVar.mo9501a().get(i);
            C2771ap apVar2 = (C2771ap) adVar2.mo9501a().get(i);
            if (apVar.mo9867a() != apVar2.mo9867a()) {
                return false;
            }
            if (!apVar.mo9867a() && (apVar.mo9868b() != apVar2.mo9868b() || !mo9842a(apVar.mo9869c().mo9892l(), apVar2.mo9869c().mo9892l()))) {
                return false;
            }
        }
        return true;
    }
}
