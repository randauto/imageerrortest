package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
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

/* renamed from: b.h.b.a.b.b.c.v */
/* compiled from: MutableClassDescriptor */
public class C1789v extends C1762g {

    /* renamed from: c */
    static final /* synthetic */ boolean f5540c = (!C1789v.class.desiredAssertionStatus());

    /* renamed from: d */
    private final C1797f f5541d;

    /* renamed from: e */
    private final boolean f5542e;

    /* renamed from: f */
    private C1818w f5543f;

    /* renamed from: g */
    private C1723az f5544g;

    /* renamed from: h */
    private C2767an f5545h;

    /* renamed from: i */
    private List<C1700ar> f5546i;

    /* renamed from: j */
    private final Collection<C2841w> f5547j = new ArrayList();

    /* renamed from: k */
    private final C2713i f5548k;

    /* renamed from: i */
    public C1796e mo7070i() {
        return null;
    }

    /* renamed from: o */
    public C1795d mo7076o() {
        return null;
    }

    /* renamed from: q */
    public boolean mo7078q() {
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

    public C1789v(C1804m mVar, C1797f fVar, boolean z, boolean z2, C2360f fVar2, C1692am amVar, C2713i iVar) {
        super(iVar, mVar, fVar2, amVar, z2);
        this.f5548k = iVar;
        if (f5540c || fVar != C1797f.OBJECT) {
            this.f5541d = fVar;
            this.f5542e = z;
            return;
        }
        throw new AssertionError("Fix isCompanionObject()");
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return C1659h.f5247a.mo7260a();
    }

    /* renamed from: a */
    public void mo7539a(C1818w wVar) {
        if (f5540c || wVar != C1818w.SEALED) {
            this.f5543f = wVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Implement getSealedSubclasses() for this class: ");
        sb.append(getClass());
        throw new AssertionError(sb.toString());
    }

    /* renamed from: m */
    public C1818w mo7074m() {
        return this.f5543f;
    }

    /* renamed from: l */
    public C1797f mo7073l() {
        return this.f5541d;
    }

    /* renamed from: a */
    public void mo7538a(C1723az azVar) {
        this.f5544g = azVar;
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return this.f5544g;
    }

    /* renamed from: r */
    public boolean mo7079r() {
        return this.f5542e;
    }

    /* renamed from: e */
    public C2767an mo7067e() {
        return this.f5545h;
    }

    /* renamed from: a */
    public Set<C1795d> mo7072k() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public void mo7540a(List<C1700ar> list) {
        if (this.f5546i == null) {
            this.f5546i = new ArrayList(list);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Type parameters are already set for ");
        sb.append(mo7351z_());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: z */
    public List<C1700ar> mo7090z() {
        return this.f5546i;
    }

    /* renamed from: c */
    public void mo7541c() {
        if (f5540c || this.f5545h == null) {
            this.f5545h = new C2814e(this, this.f5546i, this.f5547j, this.f5548k);
            for (C1795d dVar : mo7072k()) {
                ((C1761f) dVar).mo7457a((C2841w) mo7346A_());
            }
            return;
        }
        throw new AssertionError(this.f5545h);
    }

    /* renamed from: g */
    public C2560h mo7068g() {
        return C2564c.f7661a;
    }

    /* renamed from: x_ */
    public C2560h mo7087x_() {
        return C2564c.f7661a;
    }

    public String toString() {
        return C1765j.m8000a(this);
    }
}
