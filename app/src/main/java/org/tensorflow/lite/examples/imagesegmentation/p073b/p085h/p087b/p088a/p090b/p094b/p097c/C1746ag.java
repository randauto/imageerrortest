package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.List;
import p073b.p079e.p080a.C1450b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap.C1698a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p130k.C2691b;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2843y;

/* renamed from: b.h.b.a.b.b.c.ag */
/* compiled from: TypeParameterDescriptorImpl */
public class C1746ag extends C1756e {

    /* renamed from: a */
    private final C1450b<C2841w, Void> f5389a;

    /* renamed from: b */
    private final List<C2841w> f5390b = new ArrayList(1);

    /* renamed from: c */
    private boolean f5391c = false;

    /* renamed from: a */
    public static C1700ar m7832a(C1804m mVar, C1659h hVar, boolean z, C2792ba baVar, C2360f fVar, int i) {
        C1746ag a = m7833a(mVar, hVar, z, baVar, fVar, i, C1692am.f5331a);
        a.mo7388b(C2524a.m12627d(mVar).mo7208u());
        a.mo7390o();
        return a;
    }

    /* renamed from: a */
    public static C1746ag m7833a(C1804m mVar, C1659h hVar, boolean z, C2792ba baVar, C2360f fVar, int i, C1692am amVar) {
        return m7834a(mVar, hVar, z, baVar, fVar, i, amVar, null, C1698a.f5333a);
    }

    /* renamed from: a */
    public static C1746ag m7834a(C1804m mVar, C1659h hVar, boolean z, C2792ba baVar, C2360f fVar, int i, C1692am amVar, C1450b<C2841w, Void> bVar, C1697ap apVar) {
        C1746ag agVar = new C1746ag(mVar, hVar, z, baVar, fVar, i, amVar, bVar, apVar);
        return agVar;
    }

    private C1746ag(C1804m mVar, C1659h hVar, boolean z, C2792ba baVar, C2360f fVar, int i, C1692am amVar, C1450b<C2841w, Void> bVar, C1697ap apVar) {
        super(C2691b.f7924a, mVar, hVar, fVar, baVar, z, i, amVar, apVar);
        this.f5389a = bVar;
    }

    /* renamed from: p */
    private void m7836p() {
        if (!this.f5391c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Type parameter descriptor is not initialized: ");
            sb.append(m7838r());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: q */
    private void m7837q() {
        if (this.f5391c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Type parameter descriptor is already initialized: ");
            sb.append(m7838r());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: r */
    private String m7838r() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo7351z_());
        sb.append(" declared in ");
        sb.append(C2523c.m12596d(mo7065b()));
        return sb.toString();
    }

    /* renamed from: o */
    public void mo7390o() {
        m7837q();
        this.f5391c = true;
    }

    /* renamed from: b */
    public void mo7388b(C2841w wVar) {
        m7837q();
        m7835c(wVar);
    }

    /* renamed from: c */
    private void m7835c(C2841w wVar) {
        if (!C2843y.m13884a(wVar)) {
            this.f5390b.add(wVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7387a(C2841w wVar) {
        if (this.f5389a != null) {
            this.f5389a.mo6756a(wVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public List<C2841w> mo7389m() {
        m7836p();
        return this.f5390b;
    }
}
