package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3227u;
import p073b.C3230x;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2768ao;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;
import p073b.p085h.p087b.p088a.p090b.p139n.C2894d;

/* renamed from: b.h.b.a.b.l.a.g */
/* compiled from: NewCapturedType.kt */
public final class C2723g {
    /* renamed from: a */
    public static /* synthetic */ C2755ad m13368a(C2755ad adVar, C2715a aVar, C1461m mVar, int i, Object obj) {
        if ((i & 4) != 0) {
            mVar = C2894d.m13972b();
        }
        return m13367a(adVar, aVar, mVar);
    }

    /* renamed from: a */
    public static final C2755ad m13367a(C2755ad adVar, C2715a aVar, C1461m<? super Integer, ? super C2721e, C3230x> mVar) {
        boolean z;
        C1489j.m6972b(adVar, "type");
        C1489j.m6972b(aVar, "status");
        C1489j.m6972b(mVar, "acceptNewCapturedType");
        if (adVar.mo9501a().size() != adVar.mo9507g().mo7094b().size()) {
            return null;
        }
        List a = adVar.mo9501a();
        Iterable<C2771ap> iterable = a;
        boolean z2 = true;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C2771ap) it.next()).mo9868b() == C2792ba.INVARIANT) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C2771ap apVar : iterable) {
            if (apVar.mo9868b() != C2792ba.INVARIANT) {
                apVar = C2803a.m13683f(new C2721e(aVar, (apVar.mo9867a() || apVar.mo9868b() != C2792ba.IN_VARIANCE) ? null : apVar.mo9869c().mo9892l(), apVar));
            }
            arrayList.add(apVar);
        }
        List list = (List) arrayList;
        C2778au f = C2768ao.f8029b.mo9873a(adVar.mo9507g(), list).mo9881f();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C2771ap apVar2 = (C2771ap) a.get(i);
            C2771ap apVar3 = (C2771ap) list.get(i);
            if (apVar2.mo9868b() != C2792ba.INVARIANT) {
                Object obj = adVar.mo9507g().mo7094b().get(i);
                C1489j.m6969a(obj, "type.constructor.parameters[index]");
                List j = ((C1700ar) obj).mo7315j();
                C1489j.m6969a((Object) j, "type.constructor.parameters[index].upperBounds");
                Iterable<C2841w> iterable2 = j;
                Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable2, 10));
                for (C2841w a2 : iterable2) {
                    arrayList2.add(C2724h.f7971b.mo9834a(f.mo9885a(a2, C2792ba.INVARIANT).mo9892l()));
                }
                List list2 = (List) arrayList2;
                if (!apVar2.mo9867a() && apVar2.mo9868b() == C2792ba.OUT_VARIANCE) {
                    list2 = C1415k.m6862a((Collection<? extends T>) list2, C2724h.f7971b.mo9834a(apVar2.mo9869c().mo9892l()));
                }
                C2841w c = apVar3.mo9869c();
                if (c != null) {
                    C2721e eVar = (C2721e) c;
                    eVar.mo9507g().mo9831a(list2);
                    mVar.mo6920a(Integer.valueOf(i), eVar);
                } else {
                    throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                }
            }
        }
        return C2842x.m13881a(adVar.mo7086x(), adVar.mo9507g(), list, adVar.mo7897c());
    }
}
