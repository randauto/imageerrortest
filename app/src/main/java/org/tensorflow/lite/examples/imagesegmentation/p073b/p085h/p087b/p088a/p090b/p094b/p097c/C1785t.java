package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.List;
import java.util.Set;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.b.c.t */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C1785t implements C1784s {

    /* renamed from: a */
    private final List<C1786u> f5525a;

    /* renamed from: b */
    private final Set<C1786u> f5526b;

    /* renamed from: c */
    private final List<C1786u> f5527c;

    public C1785t(List<C1786u> list, Set<C1786u> set, List<C1786u> list2) {
        C1489j.m6972b(list, "allDependencies");
        C1489j.m6972b(set, "modulesWhoseInternalsAreVisible");
        C1489j.m6972b(list2, "expectedByDependencies");
        this.f5525a = list;
        this.f5526b = set;
        this.f5527c = list2;
    }

    /* renamed from: a */
    public List<C1786u> mo7519a() {
        return this.f5525a;
    }

    /* renamed from: b */
    public Set<C1786u> mo7520b() {
        return this.f5526b;
    }

    /* renamed from: c */
    public List<C1786u> mo7521c() {
        return this.f5527c;
    }
}
