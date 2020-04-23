package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h.C2564c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2814e;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.c.h */
/* compiled from: ClassDescriptorImpl */
public class C1763h extends C1762g {

    /* renamed from: c */
    static final /* synthetic */ boolean f5430c = (!C1763h.class.desiredAssertionStatus());

    /* renamed from: d */
    private final C1818w f5431d;

    /* renamed from: e */
    private final C1797f f5432e;

    /* renamed from: f */
    private final C2767an f5433f;

    /* renamed from: g */
    private C2560h f5434g;

    /* renamed from: h */
    private Set<C1795d> f5435h;

    /* renamed from: i */
    private C1795d f5436i;

    /* renamed from: i */
    public C1796e mo7070i() {
        return null;
    }

    /* renamed from: q */
    public boolean mo7078q() {
        return false;
    }

    /* renamed from: r */
    public boolean mo7079r() {
        return false;
    }

    /* renamed from: s */
    public boolean mo7080s() {
        return false;
    }

    /* renamed from: t */
    public boolean mo7081t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo7083u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo7084v() {
        return false;
    }

    public C1763h(C1804m mVar, C2360f fVar, C1818w wVar, C1797f fVar2, Collection<C2841w> collection, C1692am amVar, boolean z, C2713i iVar) {
        super(iVar, mVar, fVar, amVar, z);
        if (f5430c || wVar != C1818w.SEALED) {
            this.f5431d = wVar;
            this.f5432e = fVar2;
            this.f5433f = new C2814e(this, Collections.emptyList(), collection, iVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Implement getSealedSubclasses() for this class: ");
        sb.append(getClass());
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final void mo7422a(C2560h hVar, Set<C1795d> set, C1795d dVar) {
        this.f5434g = hVar;
        this.f5435h = set;
        this.f5436i = dVar;
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return C1659h.f5247a.mo7260a();
    }

    /* renamed from: e */
    public C2767an mo7067e() {
        return this.f5433f;
    }

    /* renamed from: k */
    public Collection<C1795d> mo7072k() {
        return this.f5435h;
    }

    /* renamed from: g */
    public C2560h mo7068g() {
        return this.f5434g;
    }

    /* renamed from: x_ */
    public C2560h mo7087x_() {
        return C2564c.f7661a;
    }

    /* renamed from: l */
    public C1797f mo7073l() {
        return this.f5432e;
    }

    /* renamed from: o */
    public C1795d mo7076o() {
        return this.f5436i;
    }

    /* renamed from: m */
    public C1818w mo7074m() {
        return this.f5431d;
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return C1710ay.f5340e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        sb.append(mo7351z_());
        return sb.toString();
    }

    /* renamed from: z */
    public List<C1700ar> mo7090z() {
        return Collections.emptyList();
    }
}
