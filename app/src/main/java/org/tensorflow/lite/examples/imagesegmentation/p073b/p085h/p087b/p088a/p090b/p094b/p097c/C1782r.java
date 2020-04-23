package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2570l;
import p073b.p085h.p087b.p088a.p090b.p130k.C2691b;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2774as;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2814e;
import p073b.p085h.p087b.p088a.p090b.p131l.C2821k;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;

/* renamed from: b.h.b.a.b.b.c.r */
/* compiled from: LazySubstitutingClassDescriptor */
public class C1782r implements C1796e {

    /* renamed from: a */
    private final C1796e f5518a;

    /* renamed from: b */
    private final C2778au f5519b;

    /* renamed from: c */
    private C2778au f5520c;

    /* renamed from: d */
    private List<C1700ar> f5521d;

    /* renamed from: e */
    private List<C1700ar> f5522e;

    /* renamed from: f */
    private C2767an f5523f;

    public C1782r(C1796e eVar, C2778au auVar) {
        this.f5518a = eVar;
        this.f5519b = auVar;
    }

    /* renamed from: a */
    private C2778au m8186a() {
        if (this.f5520c == null) {
            if (this.f5519b.mo9886a()) {
                this.f5520c = this.f5519b;
            } else {
                List b = this.f5518a.mo7067e().mo7094b();
                this.f5521d = new ArrayList(b.size());
                this.f5520c = C2821k.m13748a(b, this.f5519b.mo9888b(), this, this.f5521d);
                this.f5522e = C1415k.m6868b((Iterable<? extends T>) this.f5521d, (C1450b<? super T, Boolean>) new C1450b<C1700ar, Boolean>() {
                    /* renamed from: a */
                    public Boolean mo6756a(C1700ar arVar) {
                        return Boolean.valueOf(!arVar.mo7312a());
                    }
                });
            }
        }
        return this.f5520c;
    }

    /* renamed from: e */
    public C2767an mo7067e() {
        C2767an e = this.f5518a.mo7067e();
        if (this.f5519b.mo9886a()) {
            return e;
        }
        if (this.f5523f == null) {
            C2778au a = m8186a();
            Collection<C2841w> C_ = e.mo7405C_();
            ArrayList arrayList = new ArrayList(C_.size());
            for (C2841w b : C_) {
                arrayList.add(a.mo9889b(b, C2792ba.INVARIANT));
            }
            this.f5523f = new C2814e(this, this.f5521d, arrayList, C2691b.f7924a);
        }
        return this.f5523f;
    }

    /* renamed from: a */
    public C2560h mo7356a(C2774as asVar) {
        C2560h a = this.f5518a.mo7356a(asVar);
        if (this.f5519b.mo9886a()) {
            return a;
        }
        return new C2570l(a, m8186a());
    }

    /* renamed from: g */
    public C2560h mo7068g() {
        C2560h g = this.f5518a.mo7068g();
        if (this.f5519b.mo9886a()) {
            return g;
        }
        return new C2570l(g, m8186a());
    }

    /* renamed from: x_ */
    public C2560h mo7087x_() {
        return this.f5518a.mo7087x_();
    }

    /* renamed from: A_ */
    public C2755ad mo7346A_() {
        return C2842x.m13880a(mo7086x(), this, C2783av.m13572a(mo7067e().mo7094b()));
    }

    /* renamed from: D */
    public C1690ak mo7353D() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public Collection<C1795d> mo7072k() {
        Collection<C1795d> k = this.f5518a.mo7072k();
        ArrayList arrayList = new ArrayList(k.size());
        for (C1795d dVar : k) {
            arrayList.add(dVar.mo7421b(this, dVar.mo7074m(), dVar.mo7077p(), dVar.mo7344n(), false).mo7419a(m8186a()));
        }
        return arrayList;
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return this.f5518a.mo7086x();
    }

    /* renamed from: z_ */
    public C2360f mo7351z_() {
        return this.f5518a.mo7351z_();
    }

    /* renamed from: E */
    public C1796e mo7349f() {
        return this.f5518a.mo7354E();
    }

    /* renamed from: b */
    public C1804m mo7065b() {
        return this.f5518a.mo7065b();
    }

    /* renamed from: a */
    public C1796e mo7307d(C2778au auVar) {
        if (auVar.mo9886a()) {
            return this;
        }
        return new C1782r(this, C2778au.m13551a(auVar.mo9888b(), m8186a().mo9888b()));
    }

    /* renamed from: i */
    public C1796e mo7070i() {
        return this.f5518a.mo7070i();
    }

    /* renamed from: l */
    public C1797f mo7073l() {
        return this.f5518a.mo7073l();
    }

    /* renamed from: m */
    public C1818w mo7074m() {
        return this.f5518a.mo7074m();
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return this.f5518a.mo7077p();
    }

    /* renamed from: r */
    public boolean mo7079r() {
        return this.f5518a.mo7079r();
    }

    /* renamed from: s */
    public boolean mo7080s() {
        return this.f5518a.mo7080s();
    }

    /* renamed from: t */
    public boolean mo7081t() {
        return this.f5518a.mo7081t();
    }

    /* renamed from: w */
    public boolean mo7085w() {
        return this.f5518a.mo7085w();
    }

    /* renamed from: q */
    public boolean mo7078q() {
        return this.f5518a.mo7078q();
    }

    /* renamed from: u */
    public boolean mo7083u() {
        return this.f5518a.mo7083u();
    }

    /* renamed from: v */
    public boolean mo7084v() {
        return this.f5518a.mo7084v();
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        return oVar.mo7434a((C1796e) this, d);
    }

    /* renamed from: C */
    public C2560h mo7352C() {
        return this.f5518a.mo7352C();
    }

    /* renamed from: o */
    public C1795d mo7076o() {
        return this.f5518a.mo7076o();
    }

    /* renamed from: y */
    public C1692am mo7088y() {
        return C1692am.f5331a;
    }

    /* renamed from: z */
    public List<C1700ar> mo7090z() {
        m8186a();
        return this.f5522e;
    }
}
