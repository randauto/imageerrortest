package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p073b.p079e.p080a.C1449a;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2559g;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2572m;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2794c;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;

/* renamed from: b.h.b.a.b.b.c.e */
/* compiled from: AbstractTypeParameterDescriptor */
public abstract class C1756e extends C1766k implements C1700ar {

    /* renamed from: a */
    private final C2792ba f5410a;

    /* renamed from: b */
    private final boolean f5411b;

    /* renamed from: c */
    private final int f5412c;

    /* renamed from: d */
    private final C2710f<C2767an> f5413d;

    /* renamed from: e */
    private final C2710f<C2755ad> f5414e;

    /* renamed from: b.h.b.a.b.b.c.e$a */
    /* compiled from: AbstractTypeParameterDescriptor */
    private class C1760a extends C2794c {

        /* renamed from: b */
        private final C1697ap f5423b;

        /* renamed from: f */
        public boolean mo7097f() {
            return true;
        }

        public C1760a(C2713i iVar, C1697ap apVar) {
            super(iVar);
            this.f5423b = apVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Collection<C2841w> mo7093a() {
            return C1756e.this.mo7389m();
        }

        /* renamed from: b */
        public List<C1700ar> mo7094b() {
            return Collections.emptyList();
        }

        /* renamed from: d */
        public C1799h mo7096d() {
            return C1756e.this;
        }

        /* renamed from: e */
        public C1627g mo7407e() {
            return C2524a.m12627d(C1756e.this);
        }

        public String toString() {
            return C1756e.this.mo7351z_().toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C1697ap mo7098g() {
            return this.f5423b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo7412a(C2841w wVar) {
            C1756e.this.mo7387a(wVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public C2841w mo7413h() {
            return C2827p.m13791c("Cyclic upper bounds");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7387a(C2841w wVar);

    /* renamed from: a */
    public boolean mo7312a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract List<C2841w> mo7389m();

    protected C1756e(final C2713i iVar, C1804m mVar, C1659h hVar, final C2360f fVar, C2792ba baVar, boolean z, int i, C1692am amVar, final C1697ap apVar) {
        super(mVar, hVar, fVar, amVar);
        this.f5410a = baVar;
        this.f5411b = z;
        this.f5412c = i;
        this.f5413d = iVar.mo9793a((C1449a<? extends T>) new C1449a<C2767an>() {
            /* renamed from: b */
            public C2767an mo6823a() {
                return new C1760a(iVar, apVar);
            }
        });
        this.f5414e = iVar.mo9793a((C1449a<? extends T>) new C1449a<C2755ad>() {
            /* renamed from: b */
            public C2755ad mo6823a() {
                return C2842x.m13882a(C1659h.f5247a.mo7260a(), C1756e.this.mo7067e(), Collections.emptyList(), false, new C2559g(iVar.mo9793a((C1449a<? extends T>) new C1449a<C2560h>() {
                    /* renamed from: b */
                    public C2560h mo6823a() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Scope for type parameter ");
                        sb.append(fVar.mo9039a());
                        return C2572m.m12783a(sb.toString(), (Collection) C1756e.this.mo7315j());
                    }
                })));
            }
        });
    }

    /* renamed from: k */
    public C2792ba mo7316k() {
        return this.f5410a;
    }

    /* renamed from: l */
    public boolean mo7317l() {
        return this.f5411b;
    }

    /* renamed from: g */
    public int mo7314g() {
        return this.f5412c;
    }

    /* renamed from: j */
    public List<C2841w> mo7315j() {
        return ((C1760a) mo7067e()).mo7405C_();
    }

    /* renamed from: e */
    public final C2767an mo7067e() {
        return (C2767an) this.f5413d.mo6823a();
    }

    /* renamed from: A_ */
    public C2755ad mo7346A_() {
        return (C2755ad) this.f5414e.mo6823a();
    }

    /* renamed from: c */
    public C1700ar mo7349f() {
        return (C1700ar) super.mo7347E_();
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        return oVar.mo7431a((C1700ar) this, d);
    }
}
