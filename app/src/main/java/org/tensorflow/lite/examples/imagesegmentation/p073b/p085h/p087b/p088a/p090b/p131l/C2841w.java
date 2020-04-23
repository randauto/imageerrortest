package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1649a;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2729m;

/* renamed from: b.h.b.a.b.l.w */
/* compiled from: KotlinType.kt */
public abstract class C2841w implements C1649a {
    /* renamed from: a */
    public abstract List<C2771ap> mo9501a();

    /* renamed from: b */
    public abstract C2560h mo7787b();

    /* renamed from: c */
    public abstract boolean mo7897c();

    /* renamed from: g */
    public abstract C2767an mo9507g();

    /* renamed from: l */
    public abstract C2788az mo9892l();

    private C2841w() {
    }

    public /* synthetic */ C2841w(C1486g gVar) {
        this();
    }

    public final int hashCode() {
        if (C2843y.m13884a(this)) {
            return super.hashCode();
        }
        return (((mo9507g().hashCode() * 31) + mo9501a().hashCode()) * 31) + (mo7897c() ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2841w)) {
            return false;
        }
        C2841w wVar = (C2841w) obj;
        if (mo7897c() != wVar.mo7897c() || !C2729m.f7976a.mo9842a(mo9892l(), wVar.mo9892l())) {
            z = false;
        }
        return z;
    }
}
