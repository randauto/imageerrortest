package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au.C1706a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.c.ah */
/* compiled from: ValueParameterDescriptorImpl.kt */
public class C1747ah extends C1749ai implements C1705au {

    /* renamed from: a */
    public static final C1748a f5392a = new C1748a(null);

    /* renamed from: d */
    private final C1705au f5393d;

    /* renamed from: e */
    private final int f5394e;

    /* renamed from: f */
    private final boolean f5395f;

    /* renamed from: g */
    private final boolean f5396g;

    /* renamed from: h */
    private final boolean f5397h;

    /* renamed from: i */
    private final C2841w f5398i;

    /* renamed from: b.h.b.a.b.b.c.ah$a */
    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class C1748a {
        private C1748a() {
        }

        public /* synthetic */ C1748a(C1486g gVar) {
            this();
        }
    }

    /* renamed from: s */
    public boolean mo7330s() {
        return false;
    }

    /* renamed from: u */
    public Void mo7393u() {
        return null;
    }

    /* renamed from: A */
    public boolean mo7329A() {
        return C1706a.m7683a(this);
    }

    /* renamed from: t */
    public /* synthetic */ C2500f mo7331t() {
        return (C2500f) mo7393u();
    }

    /* renamed from: c */
    public int mo7323c() {
        return this.f5394e;
    }

    /* renamed from: o */
    public boolean mo7327o() {
        return this.f5396g;
    }

    /* renamed from: q */
    public boolean mo7328q() {
        return this.f5397h;
    }

    /* renamed from: m */
    public C2841w mo7325m() {
        return this.f5398i;
    }

    public C1747ah(C1648a aVar, C1705au auVar, int i, C1659h hVar, C2360f fVar, C2841w wVar, boolean z, boolean z2, boolean z3, C2841w wVar2, C1692am amVar) {
        C1648a aVar2 = aVar;
        C1489j.m6972b(aVar, "containingDeclaration");
        C1659h hVar2 = hVar;
        C1489j.m6972b(hVar, "annotations");
        C2360f fVar2 = fVar;
        C1489j.m6972b(fVar, "name");
        C2841w wVar3 = wVar;
        C1489j.m6972b(wVar, "outType");
        C1692am amVar2 = amVar;
        C1489j.m6972b(amVar2, "source");
        super(aVar2, hVar2, fVar2, wVar3, amVar2);
        this.f5394e = i;
        this.f5395f = z;
        this.f5396g = z2;
        this.f5397h = z3;
        this.f5398i = wVar2;
        this.f5393d = auVar != null ? auVar : this;
    }

    /* renamed from: a */
    public C1648a mo7065b() {
        C1804m b = super.mo7065b();
        if (b != null) {
            return (C1648a) b;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    /* renamed from: l */
    public boolean mo7324l() {
        if (this.f5395f) {
            C1648a a = mo7065b();
            if (a != null) {
                C1725a n = ((C1724b) a).mo7344n();
                C1489j.m6969a((Object) n, "(containingDeclaration a…bleMemberDescriptor).kind");
                if (n.mo7345a()) {
                    return true;
                }
            } else {
                throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            }
        }
        return false;
    }

    /* renamed from: n */
    public C1705au mo7235h() {
        return this.f5393d == this ? this : this.f5393d.mo7326n();
    }

    /* renamed from: a */
    public C1705au mo7307d(C2778au auVar) {
        C1489j.m6972b(auVar, "substitutor");
        if (auVar.mo9886a()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        C1489j.m6972b(oVar, "visitor");
        return oVar.mo7432a((C1705au) this, d);
    }

    /* renamed from: a */
    public C1705au mo7322a(C1648a aVar, C2360f fVar, int i) {
        C1648a aVar2 = aVar;
        C1489j.m6972b(aVar, "newOwner");
        C2360f fVar2 = fVar;
        C1489j.m6972b(fVar, "newName");
        C1659h x = mo7086x();
        C1489j.m6969a((Object) x, "annotations");
        C2841w r = mo7320r();
        C1489j.m6969a((Object) r, "type");
        boolean l = mo7324l();
        boolean o = mo7327o();
        boolean q = mo7328q();
        C2841w m = mo7325m();
        C1692am amVar = C1692am.f5331a;
        C1489j.m6969a((Object) amVar, "SourceElement.NO_SOURCE");
        C1747ah ahVar = new C1747ah(aVar2, null, i, x, fVar2, r, l, o, q, m, amVar);
        return ahVar;
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return C1710ay.f5341f;
    }

    /* renamed from: k */
    public Collection<C1705au> mo7238k() {
        Collection k = mo7065b().mo7238k();
        C1489j.m6969a((Object) k, "containingDeclaration.overriddenDescriptors");
        Iterable<C1648a> iterable = k;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C1648a aVar : iterable) {
            C1489j.m6969a((Object) aVar, "it");
            arrayList.add((C1705au) aVar.mo7236i().get(mo7323c()));
        }
        return (List) arrayList;
    }
}
