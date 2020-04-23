package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;

/* renamed from: b.h.b.a.b.b.c.b */
/* compiled from: AbstractLazyTypeParameterDescriptor */
public abstract class C1751b extends C1756e {
    public C1751b(C2713i iVar, C1804m mVar, C2360f fVar, C2792ba baVar, boolean z, int i, C1692am amVar, C1697ap apVar) {
        super(iVar, mVar, C1659h.f5247a.mo7260a(), fVar, baVar, z, i, amVar, apVar);
    }

    public String toString() {
        String str;
        String str2 = "%s%s%s";
        Object[] objArr = new Object[3];
        objArr[0] = mo7317l() ? "reified " : "";
        if (mo7316k() == C2792ba.INVARIANT) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(mo7316k());
            sb.append(" ");
            str = sb.toString();
        }
        objArr[1] = str;
        objArr[2] = mo7351z_();
        return String.format(str2, objArr);
    }
}
