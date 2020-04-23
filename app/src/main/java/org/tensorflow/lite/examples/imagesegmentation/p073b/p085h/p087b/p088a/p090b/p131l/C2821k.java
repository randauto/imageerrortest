package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1746ag;

/* renamed from: b.h.b.a.b.l.k */
/* compiled from: DescriptorSubstitutor */
public class C2821k {
    /* renamed from: a */
    public static C2778au m13748a(List<C1700ar> list, C2774as asVar, C1804m mVar, List<C1700ar> list2) {
        C2778au a = m13749a(list, asVar, mVar, list2, null);
        if (a != null) {
            return a;
        }
        throw new AssertionError("Substitution failed");
    }

    /* renamed from: a */
    public static C2778au m13749a(List<C1700ar> list, C2774as asVar, C1804m mVar, List<C1700ar> list2, boolean[] zArr) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        for (C1700ar arVar : list) {
            int i2 = i + 1;
            C1746ag a = C1746ag.m7833a(mVar, arVar.mo7086x(), arVar.mo7317l(), arVar.mo7316k(), arVar.mo7351z_(), i, C1692am.f5331a);
            hashMap.put(arVar.mo7067e(), new C2773ar(a.mo7346A_()));
            hashMap2.put(arVar, a);
            list2.add(a);
            i = i2;
        }
        C2774as asVar2 = asVar;
        C2778au a2 = C2778au.m13551a(asVar, (C2774as) C2768ao.m13516a((Map<C2767an, ? extends C2771ap>) hashMap));
        for (C1700ar arVar2 : list) {
            C1746ag agVar = (C1746ag) hashMap2.get(arVar2);
            for (C2841w wVar : arVar2.mo7315j()) {
                C2841w b = a2.mo9889b(wVar, C2792ba.IN_VARIANCE);
                if (b == null) {
                    return null;
                }
                if (!(b == wVar || zArr == null)) {
                    zArr[0] = true;
                }
                agVar.mo7388b(b);
            }
            agVar.mo7390o();
        }
        return a2;
    }
}
