package p073b.p085h.p087b.p088a.p090b.p119i;

import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.i.e */
/* compiled from: inlineClassesUtils.kt */
public final class C2537e {
    /* renamed from: a */
    public static final C1705au m12665a(C1796e eVar) {
        C1489j.m6972b(eVar, "$receiver");
        C1705au auVar = null;
        if (!eVar.mo7081t()) {
            return null;
        }
        C1795d o = eVar.mo7076o();
        if (o != null) {
            List i = o.mo7236i();
            if (i != null) {
                auVar = (C1705au) C1415k.m6892k(i);
            }
        }
        return auVar;
    }

    /* renamed from: a */
    public static final boolean m12667a(C1804m mVar) {
        C1489j.m6972b(mVar, "$receiver");
        return (mVar instanceof C1796e) && ((C1796e) mVar).mo7081t();
    }

    /* renamed from: a */
    public static final C1705au m12666a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1799h d = wVar.mo9507g().mo7096d();
        if (!(d instanceof C1796e)) {
            d = null;
        }
        C1796e eVar = (C1796e) d;
        if (eVar != null) {
            return m12665a(eVar);
        }
        return null;
    }

    /* renamed from: b */
    public static final C2841w m12668b(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1705au a = m12666a(wVar);
        if (a != null) {
            return a.mo7320r();
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m12669c(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1799h d = wVar.mo9507g().mo7096d();
        if (d != null) {
            return m12667a((C1804m) d);
        }
        return false;
    }

    /* renamed from: d */
    public static final C2841w m12670d(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1705au a = m12666a(wVar);
        C2841w wVar2 = null;
        if (a == null) {
            return null;
        }
        C2560h b = wVar.mo7787b();
        C2360f z_ = a.mo7351z_();
        C1489j.m6969a((Object) z_, "parameter.name");
        C1687ah ahVar = (C1687ah) C1415k.m6884g((Iterable<? extends T>) b.mo7443a(z_, C1830d.FOR_ALREADY_TRACKED));
        if (ahVar != null) {
            wVar2 = ahVar.mo7320r();
        }
        return wVar2;
    }
}
