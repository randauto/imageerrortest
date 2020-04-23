package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1684ae;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.p126a.C2546h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.c.c */
/* compiled from: AbstractReceiverParameterDescriptor */
public abstract class C1752c extends C1765j implements C1690ak {

    /* renamed from: a */
    private static final C2360f f5404a = C2360f.m11703c("<this>");

    /* renamed from: c */
    public C1684ae mo7235h() {
        return this;
    }

    /* renamed from: d */
    public C1690ak mo7231d() {
        return null;
    }

    /* renamed from: e */
    public C1690ak mo7232e() {
        return null;
    }

    /* renamed from: j */
    public boolean mo7237j() {
        return false;
    }

    public C1752c() {
        super(C1659h.f5247a.mo7260a(), f5404a);
    }

    /* renamed from: a */
    public C1690ak mo7307d(C2778au auVar) {
        C2841w wVar;
        if (auVar.mo9886a()) {
            return this;
        }
        if (mo7065b() instanceof C1796e) {
            wVar = auVar.mo9889b(mo7320r(), C2792ba.OUT_VARIANCE);
        } else {
            wVar = auVar.mo9889b(mo7320r(), C2792ba.INVARIANT);
        }
        if (wVar == null) {
            return null;
        }
        if (wVar == mo7320r()) {
            return this;
        }
        return new C1739ab(mo7065b(), new C2546h(wVar));
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        return oVar.mo7429a((C1690ak) this, d);
    }

    /* renamed from: f */
    public List<C1700ar> mo7233f() {
        return Collections.emptyList();
    }

    /* renamed from: g */
    public C2841w mo7234g() {
        return mo7320r();
    }

    /* renamed from: r */
    public C2841w mo7320r() {
        return mo7303a().mo7335a();
    }

    /* renamed from: i */
    public List<C1705au> mo7236i() {
        return Collections.emptyList();
    }

    /* renamed from: k */
    public Collection<? extends C1648a> mo7238k() {
        return Collections.emptySet();
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return C1710ay.f5341f;
    }

    /* renamed from: y */
    public C1692am mo7088y() {
        return C1692am.f5331a;
    }
}
