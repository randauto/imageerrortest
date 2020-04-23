package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1699aq;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.C1807p;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1743af.C1744a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2783av;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;

/* renamed from: b.h.b.a.b.b.c.d */
/* compiled from: AbstractTypeAliasDescriptor.kt */
public abstract class C1753d extends C1766k implements C1699aq {

    /* renamed from: a */
    private List<? extends C1700ar> f5405a;

    /* renamed from: b */
    private final C1755b f5406b = new C1755b(this);

    /* renamed from: c */
    private final C1723az f5407c;

    /* renamed from: b.h.b.a.b.b.c.d$a */
    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class C1754a extends C1490k implements C1450b<C2788az, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C1753d f5408a;

        C1754a(C1753d dVar) {
            this.f5408a = dVar;
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7404a((C2788az) obj));
        }

        /* renamed from: a */
        public final boolean mo7404a(C2788az azVar) {
            C1489j.m6969a((Object) azVar, "type");
            if (C2843y.m13884a(azVar)) {
                return false;
            }
            C1753d dVar = this.f5408a;
            C1799h d = azVar.mo9507g().mo7096d();
            if ((d instanceof C1700ar) && (C1489j.m6971a((Object) ((C1700ar) d).mo7065b(), (Object) this.f5408a) ^ true)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b.h.b.a.b.b.c.d$b */
    /* compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class C1755b implements C2767an {

        /* renamed from: a */
        final /* synthetic */ C1753d f5409a;

        /* renamed from: f */
        public boolean mo7097f() {
            return true;
        }

        C1755b(C1753d dVar) {
            this.f5409a = dVar;
        }

        /* renamed from: a */
        public C1699aq mo7096d() {
            return this.f5409a;
        }

        /* renamed from: b */
        public List<C1700ar> mo7094b() {
            return this.f5409a.mo7402o();
        }

        /* renamed from: C_ */
        public Collection<C2841w> mo7405C_() {
            Collection<C2841w> C_ = mo7096d().mo7309a().mo9507g().mo7405C_();
            C1489j.m6969a((Object) C_, "declarationDescriptor.un…pe.constructor.supertypes");
            return C_;
        }

        /* renamed from: e */
        public C1627g mo7407e() {
            return C2524a.m12627d(mo7096d());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[typealias ");
            sb.append(mo7096d().mo7351z_().mo9039a());
            sb.append(']');
            return sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C2713i mo7399j();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract List<C1700ar> mo7402o();

    /* renamed from: u */
    public boolean mo7083u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo7084v() {
        return false;
    }

    /* renamed from: w */
    public boolean mo7085w() {
        return false;
    }

    public C1753d(C1804m mVar, C1659h hVar, C2360f fVar, C1692am amVar, C1723az azVar) {
        C1489j.m6972b(mVar, "containingDeclaration");
        C1489j.m6972b(hVar, "annotations");
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(amVar, "sourceElement");
        C1489j.m6972b(azVar, "visibilityImpl");
        super(mVar, hVar, fVar, amVar);
        this.f5407c = azVar;
    }

    /* renamed from: a */
    public final void mo7398a(List<? extends C1700ar> list) {
        C1489j.m6972b(list, "declaredTypeParameters");
        this.f5405a = list;
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        C1489j.m6972b(oVar, "visitor");
        return oVar.mo7430a((C1699aq) this, d);
    }

    /* renamed from: r */
    public boolean mo7079r() {
        return C2783av.m13574a((C2841w) mo7309a(), (C1450b<C2788az, Boolean>) new C1754a<C2788az,Boolean>(this));
    }

    /* renamed from: k */
    public final Collection<C1742ae> mo7400k() {
        C1796e g = mo7311g();
        if (g == null) {
            return C1415k.m6837a();
        }
        Collection k = g.mo7072k();
        C1489j.m6969a((Object) k, "classDescriptor.constructors");
        Iterable<C1795d> iterable = k;
        Collection arrayList = new ArrayList();
        for (C1795d dVar : iterable) {
            C1744a aVar = C1743af.f5382b;
            C2713i j = mo7399j();
            C1699aq aqVar = this;
            C1489j.m6969a((Object) dVar, "it");
            C1742ae a = aVar.mo7385a(j, aqVar, dVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: z */
    public List<C1700ar> mo7090z() {
        List<? extends C1700ar> list = this.f5405a;
        if (list == null) {
            C1489j.m6973b("declaredTypeParametersImpl");
        }
        return list;
    }

    /* renamed from: m */
    public C1818w mo7074m() {
        return C1818w.FINAL;
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return this.f5407c;
    }

    /* renamed from: e */
    public C2767an mo7067e() {
        return this.f5406b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("typealias ");
        sb.append(mo7351z_().mo9039a());
        return sb.toString();
    }

    /* renamed from: l */
    public C1699aq mo7349f() {
        C1807p F_ = super.mo7347E_();
        if (F_ != null) {
            return (C1699aq) F_;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 != null) goto L_0x0014;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073b.p085h.p087b.p088a.p090b.p131l.C2755ad mo7403q() {
        /*
            r2 = this;
            r0 = r2
            b.h.b.a.b.b.h r0 = (p073b.p085h.p087b.p088a.p090b.p094b.C1799h) r0
            b.h.b.a.b.b.e r1 = r2.mo7311g()
            if (r1 == 0) goto L_0x0010
            b.h.b.a.b.i.e.h r1 = r1.mo7068g()
            if (r1 == 0) goto L_0x0010
            goto L_0x0014
        L_0x0010:
            b.h.b.a.b.i.e.h$c r1 = p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h.C2564c.f7661a
            b.h.b.a.b.i.e.h r1 = (p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h) r1
        L_0x0014:
            b.h.b.a.b.l.ad r0 = p073b.p085h.p087b.p088a.p090b.p131l.C2783av.m13568a(r0, r1)
            java.lang.String r1 = "TypeUtils.makeUnsubstitu…ope ?: MemberScope.Empty)"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1753d.mo7403q():b.h.b.a.b.l.ad");
    }
}
