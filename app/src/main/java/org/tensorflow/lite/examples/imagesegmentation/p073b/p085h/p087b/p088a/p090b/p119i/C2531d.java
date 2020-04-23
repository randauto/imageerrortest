package p073b.p085h.p087b.p088a.p090b.p119i;

import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;

/* renamed from: b.h.b.a.b.i.d */
/* compiled from: ExternalOverridabilityCondition */
public interface C2531d {

    /* renamed from: b.h.b.a.b.i.d$a */
    /* compiled from: ExternalOverridabilityCondition */
    public enum C2532a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* renamed from: b.h.b.a.b.i.d$b */
    /* compiled from: ExternalOverridabilityCondition */
    public enum C2533b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    C2532a mo7969a();

    /* renamed from: a */
    C2533b mo7970a(C1648a aVar, C1648a aVar2, C1796e eVar);
}
