package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import p073b.p079e.p080a.C1449a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2558f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2570l;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2774as;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;

/* renamed from: b.h.b.a.b.b.c.a */
/* compiled from: AbstractClassDescriptor */
public abstract class C1734a implements C1796e {

    /* renamed from: b */
    static final /* synthetic */ boolean f5366b = (!C1734a.class.desiredAssertionStatus());

    /* renamed from: a */
    protected final C2710f<C2755ad> f5367a;

    /* renamed from: c */
    private final C2360f f5368c;

    /* renamed from: d */
    private final C2710f<C2560h> f5369d;

    /* renamed from: e */
    private final C2710f<C1690ak> f5370e;

    /* renamed from: E */
    public C1796e mo7349f() {
        return this;
    }

    public C1734a(C2713i iVar, C2360f fVar) {
        this.f5368c = fVar;
        this.f5367a = iVar.mo9793a((C1449a<? extends T>) new C1449a<C2755ad>() {
            /* renamed from: b */
            public C2755ad mo6823a() {
                return C2783av.m13568a((C1799h) C1734a.this, C1734a.this.mo7068g());
            }
        });
        this.f5369d = iVar.mo9793a((C1449a<? extends T>) new C1449a<C2560h>() {
            /* renamed from: b */
            public C2560h mo6823a() {
                return new C2558f(C1734a.this.mo7068g());
            }
        });
        this.f5370e = iVar.mo9793a((C1449a<? extends T>) new C1449a<C1690ak>() {
            /* renamed from: b */
            public C1690ak mo6823a() {
                return new C1778p(C1734a.this);
            }
        });
    }

    /* renamed from: z_ */
    public C2360f mo7351z_() {
        return this.f5368c;
    }

    /* renamed from: C */
    public C2560h mo7352C() {
        return (C2560h) this.f5369d.mo6823a();
    }

    /* renamed from: D */
    public C1690ak mo7353D() {
        return (C1690ak) this.f5370e.mo6823a();
    }

    /* renamed from: a */
    public C2560h mo7356a(C2774as asVar) {
        if (asVar.mo7781a()) {
            return mo7068g();
        }
        return new C2570l(mo7068g(), C2778au.m13550a(asVar));
    }

    /* renamed from: a */
    public C1796e mo7307d(C2778au auVar) {
        if (auVar.mo9886a()) {
            return this;
        }
        return new C1782r(this, auVar);
    }

    /* renamed from: A_ */
    public C2755ad mo7346A_() {
        return (C2755ad) this.f5367a.mo6823a();
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        return oVar.mo7434a((C1796e) this, d);
    }
}
