package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p103b;

import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1689aj;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1801j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1738aa;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1792y;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1794z;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2073s;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.d.a.b.f */
/* compiled from: JavaPropertyDescriptor */
public class C1870f extends C1792y implements C1864b {

    /* renamed from: e */
    private final boolean f5715e;

    /* renamed from: j */
    public boolean mo7237j() {
        return false;
    }

    private C1870f(C1804m mVar, C1659h hVar, C1818w wVar, C1723az azVar, boolean z, C2360f fVar, C1692am amVar, C1687ah ahVar, C1725a aVar, boolean z2) {
        super(mVar, ahVar, hVar, wVar, azVar, z, fVar, aVar, amVar, false, false, false, false, false, false);
        this.f5715e = z2;
    }

    /* renamed from: a */
    public static C1870f m8622a(C1804m mVar, C1659h hVar, C1818w wVar, C1723az azVar, boolean z, C2360f fVar, C1692am amVar, boolean z2) {
        C1870f fVar2 = new C1870f(mVar, hVar, wVar, azVar, z, fVar, amVar, null, C1725a.DECLARATION, z2);
        return fVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1792y mo7552a(C1804m mVar, C1818w wVar, C1723az azVar, C1687ah ahVar, C1725a aVar, C2360f fVar) {
        C1870f fVar2 = new C1870f(mVar, mo7086x(), wVar, azVar, mo7330s(), fVar, C1692am.f5331a, ahVar, aVar, this.f5715e);
        return fVar2;
    }

    /* renamed from: a */
    public C1864b mo7624a(C2841w wVar, List<C1874j> list, C2841w wVar2) {
        C1794z zVar;
        C1738aa aaVar;
        C2841w wVar3 = wVar2;
        C1870f fVar = new C1870f(mo7065b(), mo7086x(), mo7074m(), mo7077p(), mo7330s(), mo7351z_(), mo7088y(), mo7343l(), mo7344n(), this.f5715e);
        C1794z C = mo7298a();
        if (C != null) {
            zVar = r2;
            C1794z zVar2 = new C1794z(fVar, C.mo7086x(), C.mo7074m(), C.mo7077p(), C.mo7295o(), C.mo7085w(), C.mo7108a(), mo7344n(), C, C.mo7088y());
            zVar.mo7544a(C.mo7469s());
            zVar.mo7568a(wVar3);
        } else {
            zVar = null;
        }
        C1689aj c = mo7299c();
        if (c != null) {
            C1738aa aaVar2 = r2;
            C1738aa aaVar3 = new C1738aa(fVar, c.mo7086x(), c.mo7074m(), c.mo7077p(), c.mo7295o(), c.mo7085w(), c.mo7108a(), mo7344n(), c, c.mo7088y());
            aaVar = aaVar2;
            aaVar.mo7544a(aaVar2.mo7469s());
            aaVar.mo7364a((C1705au) c.mo7236i().get(0));
        } else {
            aaVar = null;
        }
        fVar.mo7554a(zVar, (C1689aj) aaVar);
        fVar.mo7557a(mo7549D());
        if (this.f5402a != null) {
            fVar.mo7395a(this.f5402a);
        }
        fVar.mo7342a(mo7238k());
        fVar.mo7556a(wVar3, mo7233f(), mo7232e(), wVar);
        return fVar;
    }

    /* renamed from: z */
    public boolean mo7332z() {
        C2841w r = mo7320r();
        return this.f5715e && C1801j.m8417a(r) && (!C2073s.m9309a(r) || C1627g.m7435w(r));
    }
}
