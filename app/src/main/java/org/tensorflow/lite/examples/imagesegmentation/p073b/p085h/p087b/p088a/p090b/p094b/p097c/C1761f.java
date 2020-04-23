package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1803l;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;

/* renamed from: b.h.b.a.b.b.c.f */
/* compiled from: ClassConstructorDescriptorImpl */
public class C1761f extends C1775o implements C1795d {

    /* renamed from: b */
    static final /* synthetic */ boolean f5424b = (!C1761f.class.desiredAssertionStatus());

    /* renamed from: d */
    private static final C2360f f5425d = C2360f.m11703c("<init>");

    /* renamed from: a */
    protected final boolean f5426a;

    protected C1761f(C1796e eVar, C1803l lVar, C1659h hVar, boolean z, C1725a aVar, C1692am amVar) {
        super(eVar, lVar, hVar, f5425d, aVar, amVar);
        this.f5426a = z;
    }

    /* renamed from: a */
    public static C1761f m7952a(C1796e eVar, C1659h hVar, boolean z, C1692am amVar) {
        C1761f fVar = new C1761f(eVar, null, hVar, z, C1725a.DECLARATION, amVar);
        return fVar;
    }

    /* renamed from: a */
    public C1761f mo7418a(List<C1705au> list, C1723az azVar, List<C1700ar> list2) {
        super.mo7367a(null, mo7415E(), list2, list, null, C1818w.FINAL, azVar);
        return this;
    }

    /* renamed from: a */
    public C1761f mo7417a(List<C1705au> list, C1723az azVar) {
        mo7418a(list, azVar, mo7384q().mo7090z());
        return this;
    }

    /* renamed from: E */
    public C1690ak mo7415E() {
        C1796e F = mo7384q();
        if (F.mo7079r()) {
            C1804m b = F.mo7065b();
            if (b instanceof C1796e) {
                return ((C1796e) b).mo7353D();
            }
        }
        return null;
    }

    /* renamed from: F */
    public C1796e mo7384q() {
        return (C1796e) super.mo7065b();
    }

    /* renamed from: o */
    public C1795d mo7365r() {
        return (C1795d) super.mo7343l();
    }

    /* renamed from: a */
    public C1795d mo7307d(C2778au auVar) {
        return (C1795d) super.mo7307d(auVar);
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        return oVar.mo7435a((C1803l) this, d);
    }

    /* renamed from: k */
    public Collection<? extends C1813t> mo7238k() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public void mo7342a(Collection<? extends C1724b> collection) {
        if (!f5424b && !collection.isEmpty()) {
            throw new AssertionError("Constructors cannot override anything");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1761f mo7106a(C1804m mVar, C1813t tVar, C1725a aVar, C2360f fVar, C1659h hVar, C1692am amVar) {
        if (aVar != C1725a.DECLARATION && aVar != C1725a.SYNTHESIZED) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\n");
            sb.append("newOwner: ");
            sb.append(mVar);
            sb.append("\n");
            sb.append("kind: ");
            sb.append(aVar);
            throw new IllegalStateException(sb.toString());
        } else if (f5424b || fVar == null) {
            C1761f fVar2 = new C1761f((C1796e) mVar, this, hVar, this.f5426a, C1725a.DECLARATION, amVar);
            return fVar2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Attempt to rename constructor: ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
    }

    /* renamed from: b */
    public C1795d mo7370c(C1804m mVar, C1818w wVar, C1723az azVar, C1725a aVar, boolean z) {
        return (C1795d) super.mo7341a(mVar, wVar, azVar, aVar, z);
    }
}
