package p073b.p085h.p087b.p088a.p090b.p131l;

import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1658g;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.l.ad */
/* compiled from: KotlinType.kt */
public abstract class C2755ad extends C2788az {
    /* renamed from: a */
    public abstract C2755ad mo7894a(boolean z);

    /* renamed from: c */
    public abstract C2755ad mo7896c(C1659h hVar);

    public C2755ad() {
        super(null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C1658g gVar : mo7086x().mo7258c()) {
            C3199m.m14743a(sb, "[", C2443c.f7423h.mo9343a(gVar.mo7249c(), gVar.mo7250d()), "] ");
        }
        sb.append(mo9507g());
        if (!mo9501a().isEmpty()) {
            C1415k.m6857a(mo9501a(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (mo7897c()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        C1489j.m6969a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
