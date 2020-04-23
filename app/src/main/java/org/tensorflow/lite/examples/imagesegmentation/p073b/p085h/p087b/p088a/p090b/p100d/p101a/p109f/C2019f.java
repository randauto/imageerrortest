package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2786ax;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2815f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2819i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2834q;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.d.a.f.f */
/* compiled from: typeEnhancement.kt */
public final class C2019f extends C2819i implements C2815f {

    /* renamed from: a */
    private final C2755ad f5977a;

    /* renamed from: I_ */
    public boolean mo7892I_() {
        return true;
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return false;
    }

    public C2019f(C2755ad adVar) {
        C1489j.m6972b(adVar, "delegate");
        this.f5977a = adVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2755ad mo7898d() {
        return this.f5977a;
    }

    /* renamed from: a_ */
    public C2841w mo7895a_(C2841w wVar) {
        C2841w wVar2;
        C1489j.m6972b(wVar, "replacement");
        C2788az l = wVar.mo9892l();
        C2841w wVar3 = l;
        if (!C2783av.m13580f(wVar3) && !C2803a.m13682e(wVar3)) {
            return wVar3;
        }
        if (l instanceof C2755ad) {
            wVar2 = m9166a((C2755ad) l);
        } else if (l instanceof C2834q) {
            C2834q qVar = (C2834q) l;
            wVar2 = C2786ax.m13595b(C2842x.m13883a(m9166a(qVar.mo9945f()), m9166a(qVar.mo9946h())), C2786ax.m13594a(wVar3));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Incorrect type: ");
            sb.append(l);
            throw new IllegalStateException(sb.toString().toString());
        }
        return wVar2;
    }

    /* renamed from: a */
    private final C2755ad m9166a(C2755ad adVar) {
        C2755ad a = adVar.mo7894a(false);
        if (!C2803a.m13682e(adVar)) {
            return a;
        }
        return new C2019f(a);
    }

    /* renamed from: a */
    public C2019f mo7896c(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return new C2019f(mo7898d().mo7896c(hVar));
    }

    /* renamed from: a */
    public C2755ad mo7789b(boolean z) {
        return z ? mo7898d().mo7894a(true) : this;
    }
}
