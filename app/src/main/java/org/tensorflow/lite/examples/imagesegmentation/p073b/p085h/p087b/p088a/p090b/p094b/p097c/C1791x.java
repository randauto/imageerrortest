package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p094b.C1686ag;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t.C1814a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t.C1815b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;

/* renamed from: b.h.b.a.b.b.c.x */
/* compiled from: PropertyAccessorDescriptorImpl */
public abstract class C1791x extends C1766k implements C1686ag {

    /* renamed from: a */
    static final /* synthetic */ boolean f5550a = (!C1791x.class.desiredAssertionStatus());

    /* renamed from: b */
    private boolean f5551b;

    /* renamed from: c */
    private final boolean f5552c;

    /* renamed from: d */
    private final C1818w f5553d;

    /* renamed from: e */
    private final C1687ah f5554e;

    /* renamed from: f */
    private final boolean f5555f;

    /* renamed from: g */
    private final C1725a f5556g;

    /* renamed from: h */
    private C1723az f5557h;

    /* renamed from: i */
    private C1813t f5558i = null;

    /* renamed from: A */
    public boolean mo7450A() {
        return false;
    }

    /* renamed from: B */
    public boolean mo7451B() {
        return false;
    }

    /* renamed from: C */
    public boolean mo7452C() {
        return false;
    }

    /* renamed from: E */
    public abstract C1686ag mo7365r();

    /* renamed from: a */
    public <V> V mo7454a(C1815b<V> bVar) {
        return null;
    }

    /* renamed from: c */
    public boolean mo7109c() {
        return false;
    }

    /* renamed from: j */
    public boolean mo7237j() {
        return false;
    }

    /* renamed from: t */
    public boolean mo7470t() {
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

    /* renamed from: z */
    public boolean mo7471z() {
        return false;
    }

    public C1791x(C1818w wVar, C1723az azVar, C1687ah ahVar, C1659h hVar, C2360f fVar, boolean z, boolean z2, boolean z3, C1725a aVar, C1692am amVar) {
        super(ahVar.mo7065b(), hVar, fVar, amVar);
        this.f5553d = wVar;
        this.f5557h = azVar;
        this.f5554e = ahVar;
        this.f5551b = z;
        this.f5552c = z2;
        this.f5555f = z3;
        this.f5556g = aVar;
    }

    /* renamed from: o */
    public boolean mo7295o() {
        return this.f5551b;
    }

    /* renamed from: a */
    public void mo7545a(boolean z) {
        this.f5551b = z;
    }

    /* renamed from: n */
    public C1725a mo7344n() {
        return this.f5556g;
    }

    /* renamed from: w */
    public boolean mo7085w() {
        return this.f5552c;
    }

    /* renamed from: a */
    public boolean mo7108a() {
        return this.f5555f;
    }

    /* renamed from: c */
    public C1813t mo7307d(C2778au auVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public List<C1700ar> mo7233f() {
        return Collections.emptyList();
    }

    /* renamed from: m */
    public C1818w mo7074m() {
        return this.f5553d;
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return this.f5557h;
    }

    /* renamed from: a */
    public void mo7543a(C1723az azVar) {
        this.f5557h = azVar;
    }

    /* renamed from: q */
    public C1687ah mo7296q() {
        return this.f5554e;
    }

    /* renamed from: d */
    public C1690ak mo7231d() {
        return mo7296q().mo7231d();
    }

    /* renamed from: e */
    public C1690ak mo7232e() {
        return mo7296q().mo7232e();
    }

    /* renamed from: D */
    public C1814a<? extends C1813t> mo7304D() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* renamed from: b */
    public C1686ag mo7341a(C1804m mVar, C1818w wVar, C1723az azVar, C1725a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Collection<C1686ag> mo7547b(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (C1687ah ahVar : mo7296q().mo7238k()) {
            Object a = z ? ahVar.mo7298a() : ahVar.mo7299c();
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo7342a(Collection<? extends C1724b> collection) {
        if (!f5550a && !collection.isEmpty()) {
            throw new AssertionError("Overridden accessors should be empty");
        }
    }

    /* renamed from: s */
    public C1813t mo7469s() {
        return this.f5558i;
    }

    /* renamed from: a */
    public void mo7544a(C1813t tVar) {
        this.f5558i = tVar;
    }
}
