package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p073b.C1511g;
import p073b.C3232z;
import p073b.p074a.C1389ad;
import p073b.p074a.C1395aj;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1681ac;
import p073b.p085h.p087b.p088a.p090b.p094b.C1682ad;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1806o;
import p073b.p085h.p087b.p088a.p090b.p094b.C1816u;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y.C1822a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y.C1823b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2580g;
import p073b.p085h.p087b.p088a.p090b.p130k.C2707c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.b.c.u */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C1786u extends C1765j implements C1821y {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5528a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1786u.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};

    /* renamed from: b */
    private final Map<C1822a<? extends Object>, Object> f5529b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1784s f5530c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1681ac f5531d;

    /* renamed from: e */
    private boolean f5532e;

    /* renamed from: f */
    private final C2707c<C2355b, C1682ad> f5533f;

    /* renamed from: g */
    private final C1511g f5534g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2713i f5535h;

    /* renamed from: i */
    private final C1627g f5536i;

    /* renamed from: j */
    private final C2360f f5537j;

    /* renamed from: b.h.b.a.b.b.c.u$a */
    /* compiled from: ModuleDescriptorImpl.kt */
    static final class C1787a extends C1490k implements C1449a<C1764i> {

        /* renamed from: a */
        final /* synthetic */ C1786u f5538a;

        C1787a(C1786u uVar) {
            this.f5538a = uVar;
            super(0);
        }

        /* renamed from: b */
        public final C1764i mo6823a() {
            C1784s b = this.f5538a.f5530c;
            if (b != null) {
                List a = b.mo7519a();
                boolean contains = a.contains(this.f5538a);
                if (!C3232z.f8648a || contains) {
                    Iterable<C1786u> iterable = a;
                    for (C1786u uVar : iterable) {
                        boolean d = uVar.m8232j();
                        if (C3232z.f8648a && !d) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Dependency module ");
                            sb.append(uVar.m8233k());
                            sb.append(" was not initialized by the time contents of dependent module ");
                            sb.append(this.f5538a.m8233k());
                            sb.append(" were queried");
                            throw new AssertionError(sb.toString());
                        }
                    }
                    Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
                    for (C1786u e : iterable) {
                        C1681ac e2 = e.f5531d;
                        if (e2 == null) {
                            C1489j.m6968a();
                        }
                        arrayList.add(e2);
                    }
                    return new C1764i((List) arrayList);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Module ");
                sb2.append(this.f5538a.m8233k());
                sb2.append(" is not contained in his own dependencies, this is probably a misconfiguration");
                throw new AssertionError(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Dependencies of module ");
            sb3.append(this.f5538a.m8233k());
            sb3.append(" were not set before querying module content");
            throw new AssertionError(sb3.toString());
        }
    }

    /* renamed from: b.h.b.a.b.b.c.u$b */
    /* compiled from: ModuleDescriptorImpl.kt */
    static final class C1788b extends C1490k implements C1450b<C2355b, C1779q> {

        /* renamed from: a */
        final /* synthetic */ C1786u f5539a;

        C1788b(C1786u uVar) {
            this.f5539a = uVar;
            super(1);
        }

        /* renamed from: a */
        public final C1779q mo6756a(C2355b bVar) {
            C1489j.m6972b(bVar, "fqName");
            return new C1779q(this.f5539a, bVar, this.f5539a.f5535h);
        }
    }

    public C1786u(C2360f fVar, C2713i iVar, C1627g gVar, C2580g gVar2) {
        this(fVar, iVar, gVar, gVar2, null, null, 48, null);
    }

    /* renamed from: h */
    private final C1764i m8231h() {
        C1511g gVar = this.f5534g;
        C3135k kVar = f5528a[0];
        return (C1764i) gVar.mo6918a();
    }

    /* renamed from: a */
    public <R, D> R mo7348a(C1806o<R, D> oVar, D d) {
        C1489j.m6972b(oVar, "visitor");
        return C1823b.m8497a(this, oVar, d);
    }

    /* renamed from: b */
    public C1804m mo7065b() {
        return C1823b.m8496a(this);
    }

    /* renamed from: a */
    public C1627g mo7522a() {
        return this.f5536i;
    }

    public /* synthetic */ C1786u(C2360f fVar, C2713i iVar, C1627g gVar, C2580g gVar2, Map map, C2360f fVar2, int i, C1486g gVar3) {
        this(fVar, iVar, gVar, (i & 8) != 0 ? null : gVar2, (i & 16) != 0 ? C1389ad.m6747a() : map, (i & 32) != 0 ? null : fVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0035, code lost:
        if (r2 != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1786u(p073b.p085h.p087b.p088a.p090b.p116f.C2360f r2, p073b.p085h.p087b.p088a.p090b.p130k.C2713i r3, p073b.p085h.p087b.p088a.p090b.p091a.C1627g r4, p073b.p085h.p087b.p088a.p090b.p119i.C2580g r5, java.util.Map<p073b.p085h.p087b.p088a.p090b.p094b.C1821y.C1822a<?>, ? extends java.lang.Object> r6, p073b.p085h.p087b.p088a.p090b.p116f.C2360f r7) {
        /*
            r1 = this;
            java.lang.String r0 = "moduleName"
            p073b.p079e.p081b.C1489j.m6972b(r2, r0)
            java.lang.String r0 = "storageManager"
            p073b.p079e.p081b.C1489j.m6972b(r3, r0)
            java.lang.String r0 = "builtIns"
            p073b.p079e.p081b.C1489j.m6972b(r4, r0)
            java.lang.String r0 = "capabilities"
            p073b.p079e.p081b.C1489j.m6972b(r6, r0)
            b.h.b.a.b.b.a.h$a r0 = p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h.f5247a
            b.h.b.a.b.b.a.h r0 = r0.mo7260a()
            r1.<init>(r0, r2)
            r1.f5535h = r3
            r1.f5536i = r4
            r1.f5537j = r7
            boolean r3 = r2.mo9041c()
            if (r3 == 0) goto L_0x0062
            if (r5 == 0) goto L_0x0038
            b.h.b.a.b.b.y$a<b.h.b.a.b.i.g> r2 = p073b.p085h.p087b.p088a.p090b.p119i.C2580g.f7681a
            b.p r2 = p073b.C3226t.m14841a(r2, r5)
            java.util.Map r2 = p073b.p074a.C1389ad.m6743a(r2)
            if (r2 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            java.util.Map r2 = p073b.p074a.C1389ad.m6747a()
        L_0x003c:
            java.util.Map r2 = p073b.p074a.C1389ad.m6750a(r6, r2)
            r1.f5529b = r2
            r2 = 1
            r1.f5532e = r2
            b.h.b.a.b.k.i r2 = r1.f5535h
            b.h.b.a.b.b.c.u$b r3 = new b.h.b.a.b.b.c.u$b
            r3.<init>(r1)
            b.e.a.b r3 = (p073b.p079e.p080a.C1450b) r3
            b.h.b.a.b.k.c r2 = r2.mo9791a(r3)
            r1.f5533f = r2
            b.h.b.a.b.b.c.u$a r2 = new b.h.b.a.b.b.c.u$a
            r2.<init>(r1)
            b.e.a.a r2 = (p073b.p079e.p080a.C1449a) r2
            b.g r2 = p073b.C1521h.m14706a(r2)
            r1.f5534g = r2
            return
        L_0x0062:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Module name must be special: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1786u.<init>(b.h.b.a.b.f.f, b.h.b.a.b.k.i, b.h.b.a.b.a.g, b.h.b.a.b.i.g, java.util.Map, b.h.b.a.b.f.f):void");
    }

    /* renamed from: c */
    public boolean mo7531c() {
        return this.f5532e;
    }

    /* renamed from: e */
    public void mo7532e() {
        if (!mo7531c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Accessing invalid module descriptor ");
            sb.append(this);
            throw new C1816u(sb.toString());
        }
    }

    /* renamed from: f */
    public List<C1821y> mo7533f() {
        C1784s sVar = this.f5530c;
        if (sVar != null) {
            return sVar.mo7521c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of module ");
        sb.append(m8233k());
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public C1682ad mo7523a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        mo7532e();
        return (C1682ad) this.f5533f.mo6756a(bVar);
    }

    /* renamed from: a */
    public Collection<C2355b> mo7524a(C2355b bVar, C1450b<? super C2360f, Boolean> bVar2) {
        C1489j.m6972b(bVar, "fqName");
        C1489j.m6972b(bVar2, "nameFilter");
        mo7532e();
        return mo7534g().mo7285a(bVar, bVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m8232j() {
        return this.f5531d != null;
    }

    /* renamed from: a */
    public final void mo7526a(C1784s sVar) {
        C1489j.m6972b(sVar, "dependencies");
        boolean z = this.f5530c == null;
        if (!C3232z.f8648a || z) {
            this.f5530c = sVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of ");
        sb.append(m8233k());
        sb.append(" were already set");
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final void mo7529a(C1786u... uVarArr) {
        C1489j.m6972b(uVarArr, "descriptors");
        mo7527a(C1406e.m6823h(uVarArr));
    }

    /* renamed from: a */
    public final void mo7527a(List<C1786u> list) {
        C1489j.m6972b(list, "descriptors");
        mo7528a(list, C1395aj.m6759a());
    }

    /* renamed from: a */
    public final void mo7528a(List<C1786u> list, Set<C1786u> set) {
        C1489j.m6972b(list, "descriptors");
        C1489j.m6972b(set, "friends");
        mo7526a((C1784s) new C1785t(list, set, C1415k.m6837a()));
    }

    /* renamed from: a */
    public boolean mo7530a(C1821y yVar) {
        C1489j.m6972b(yVar, "targetModule");
        if (!C1489j.m6971a((Object) this, (Object) yVar)) {
            C1784s sVar = this.f5530c;
            if (sVar == null) {
                C1489j.m6968a();
            }
            if (!C1415k.m6863a((Iterable<? extends T>) sVar.mo7520b(), yVar) && !mo7533f().contains(yVar)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final String m8233k() {
        String fVar = mo7351z_().toString();
        C1489j.m6969a((Object) fVar, "name.toString()");
        return fVar;
    }

    /* renamed from: a */
    public final void mo7525a(C1681ac acVar) {
        C1489j.m6972b(acVar, "providerForModuleContent");
        boolean z = !m8232j();
        if (!C3232z.f8648a || z) {
            this.f5531d = acVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt to initialize module ");
        sb.append(m8233k());
        sb.append(" twice");
        throw new AssertionError(sb.toString());
    }

    /* renamed from: g */
    public final C1681ac mo7534g() {
        mo7532e();
        return m8231h();
    }
}
