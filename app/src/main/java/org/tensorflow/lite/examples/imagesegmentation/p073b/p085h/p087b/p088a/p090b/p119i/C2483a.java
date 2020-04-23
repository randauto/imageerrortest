package p073b.p085h.p087b.p088a.p090b.p119i;

import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2717c.C2718a;

/* renamed from: b.h.b.a.b.i.a */
/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class C2483a {

    /* renamed from: a */
    public static final C2483a f7531a = new C2483a();

    /* renamed from: b.h.b.a.b.i.a$a */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C2484a extends C1490k implements C1461m<C1804m, C1804m, Boolean> {

        /* renamed from: a */
        public static final C2484a f7532a = new C2484a();

        C2484a() {
            super(2);
        }

        /* renamed from: a */
        public final boolean mo9495a(C1804m mVar, C1804m mVar2) {
            return false;
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6920a(Object obj, Object obj2) {
            return Boolean.valueOf(mo9495a((C1804m) obj, (C1804m) obj2));
        }
    }

    /* renamed from: b.h.b.a.b.i.a$b */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C2485b implements C2718a {

        /* renamed from: a */
        final /* synthetic */ C1648a f7533a;

        /* renamed from: b */
        final /* synthetic */ C1648a f7534b;

        C2485b(C1648a aVar, C1648a aVar2) {
            this.f7533a = aVar;
            this.f7534b = aVar2;
        }

        /* renamed from: b */
        public final boolean mo9496a(C2767an anVar, C2767an anVar2) {
            C1489j.m6972b(anVar, "c1");
            C1489j.m6972b(anVar2, "c2");
            if (C1489j.m6971a((Object) anVar, (Object) anVar2)) {
                return true;
            }
            C1799h d = anVar.mo7096d();
            C1799h d2 = anVar2.mo7096d();
            if (!(d instanceof C1700ar) || !(d2 instanceof C1700ar)) {
                return false;
            }
            return C2483a.f7531a.m12457a((C1700ar) d, (C1700ar) d2, (C1461m<? super C1804m, ? super C1804m, Boolean>) new C1461m<C1804m, C1804m, Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C2485b f7535a;

                {
                    this.f7535a = r1;
                }

                /* renamed from: a */
                public /* synthetic */ Object mo6920a(Object obj, Object obj2) {
                    return Boolean.valueOf(mo9498a((C1804m) obj, (C1804m) obj2));
                }

                /* renamed from: a */
                public final boolean mo9498a(C1804m mVar, C1804m mVar2) {
                    return C1489j.m6971a((Object) mVar, (Object) this.f7535a.f7533a) && C1489j.m6971a((Object) mVar2, (Object) this.f7535a.f7534b);
                }
            });
        }
    }

    /* renamed from: b.h.b.a.b.i.a$c */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C2487c extends C1490k implements C1461m<C1804m, C1804m, Boolean> {

        /* renamed from: a */
        public static final C2487c f7536a = new C2487c();

        C2487c() {
            super(2);
        }

        /* renamed from: a */
        public final boolean mo9499a(C1804m mVar, C1804m mVar2) {
            return false;
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6920a(Object obj, Object obj2) {
            return Boolean.valueOf(mo9499a((C1804m) obj, (C1804m) obj2));
        }
    }

    private C2483a() {
    }

    /* renamed from: a */
    public final boolean mo9494a(C1804m mVar, C1804m mVar2) {
        if ((mVar instanceof C1796e) && (mVar2 instanceof C1796e)) {
            return m12458a((C1796e) mVar, (C1796e) mVar2);
        }
        if ((mVar instanceof C1700ar) && (mVar2 instanceof C1700ar)) {
            return m12462a(this, (C1700ar) mVar, (C1700ar) mVar2, (C1461m) null, 4, (Object) null);
        } else if ((mVar instanceof C1648a) && (mVar2 instanceof C1648a)) {
            return m12460a(this, (C1648a) mVar, (C1648a) mVar2, false, 4, (Object) null);
        } else if (!(mVar instanceof C1680ab) || !(mVar2 instanceof C1680ab)) {
            return C1489j.m6971a((Object) mVar, (Object) mVar2);
        } else {
            return C1489j.m6971a((Object) ((C1680ab) mVar).mo7284f(), (Object) ((C1680ab) mVar2).mo7284f());
        }
    }

    /* renamed from: a */
    private final boolean m12458a(C1796e eVar, C1796e eVar2) {
        return C1489j.m6971a((Object) eVar.mo7067e(), (Object) eVar2.mo7067e());
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ boolean m12462a(C2483a aVar, C1700ar arVar, C1700ar arVar2, C1461m mVar, int i, Object obj) {
        if ((i & 4) != 0) {
            mVar = C2487c.f7536a;
        }
        return aVar.m12457a(arVar, arVar2, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m12457a(C1700ar arVar, C1700ar arVar2, C1461m<? super C1804m, ? super C1804m, Boolean> mVar) {
        boolean z = true;
        if (C1489j.m6971a((Object) arVar, (Object) arVar2)) {
            return true;
        }
        if (C1489j.m6971a((Object) arVar.mo7065b(), (Object) arVar2.mo7065b()) || !m12459a((C1804m) arVar, (C1804m) arVar2, mVar)) {
            return false;
        }
        if (arVar.mo7314g() != arVar2.mo7314g()) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ boolean m12460a(C2483a aVar, C1648a aVar2, C1648a aVar3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return aVar.mo9493a(aVar2, aVar3, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        if (r7.mo9622b() == p073b.p085h.p087b.p088a.p090b.p119i.C2584j.C2594a.C2595a.OVERRIDABLE) goto L_0x0083;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9493a(p073b.p085h.p087b.p088a.p090b.p094b.C1648a r7, p073b.p085h.p087b.p088a.p090b.p094b.C1648a r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = "a"
            p073b.p079e.p081b.C1489j.m6972b(r7, r0)
            java.lang.String r0 = "b"
            p073b.p079e.p081b.C1489j.m6972b(r8, r0)
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r7, r8)
            r1 = 1
            if (r0 == 0) goto L_0x0012
            return r1
        L_0x0012:
            b.h.b.a.b.f.f r0 = r7.mo7351z_()
            b.h.b.a.b.f.f r2 = r8.mo7351z_()
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r2)
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            return r2
        L_0x0023:
            b.h.b.a.b.b.m r0 = r7.mo7065b()
            b.h.b.a.b.b.m r3 = r8.mo7065b()
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r3)
            if (r0 == 0) goto L_0x0032
            return r2
        L_0x0032:
            r0 = r7
            b.h.b.a.b.b.m r0 = (p073b.p085h.p087b.p088a.p090b.p094b.C1804m) r0
            boolean r3 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12593b(r0)
            if (r3 != 0) goto L_0x0084
            r3 = r8
            b.h.b.a.b.b.m r3 = (p073b.p085h.p087b.p088a.p090b.p094b.C1804m) r3
            boolean r4 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12593b(r3)
            if (r4 == 0) goto L_0x0045
            goto L_0x0084
        L_0x0045:
            b.h.b.a.b.i.a$a r4 = p073b.p085h.p087b.p088a.p090b.p119i.C2483a.C2484a.f7532a
            b.e.a.m r4 = (p073b.p079e.p080a.C1461m) r4
            boolean r0 = r6.m12459a(r0, r3, r4)
            if (r0 != 0) goto L_0x0050
            return r2
        L_0x0050:
            b.h.b.a.b.i.a$b r0 = new b.h.b.a.b.i.a$b
            r0.<init>(r7, r8)
            b.h.b.a.b.l.a.c$a r0 = (p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2717c.C2718a) r0
            b.h.b.a.b.i.j r0 = p073b.p085h.p087b.p088a.p090b.p119i.C2584j.m12813a(r0)
            r3 = r9 ^ 1
            r4 = 0
            b.h.b.a.b.i.j$a r3 = r0.mo9614a(r7, r8, r4, r3)
            java.lang.String r5 = "overridingUtil.isOverrid… null, !ignoreReturnType)"
            p073b.p079e.p081b.C1489j.m6969a(r3, r5)
            b.h.b.a.b.i.j$a$a r3 = r3.mo9622b()
            b.h.b.a.b.i.j$a$a r5 = p073b.p085h.p087b.p088a.p090b.p119i.C2584j.C2594a.C2595a.OVERRIDABLE
            if (r3 != r5) goto L_0x0082
            r9 = r9 ^ r1
            b.h.b.a.b.i.j$a r7 = r0.mo9614a(r8, r7, r4, r9)
            java.lang.String r8 = "overridingUtil.isOverrid… null, !ignoreReturnType)"
            p073b.p079e.p081b.C1489j.m6969a(r7, r8)
            b.h.b.a.b.i.j$a$a r7 = r7.mo9622b()
            b.h.b.a.b.i.j$a$a r8 = p073b.p085h.p087b.p088a.p090b.p119i.C2584j.C2594a.C2595a.OVERRIDABLE
            if (r7 != r8) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            return r1
        L_0x0084:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p119i.C2483a.mo9493a(b.h.b.a.b.b.a, b.h.b.a.b.b.a, boolean):boolean");
    }

    /* renamed from: a */
    private final boolean m12459a(C1804m mVar, C1804m mVar2, C1461m<? super C1804m, ? super C1804m, Boolean> mVar3) {
        C1804m b = mVar.mo7065b();
        C1804m b2 = mVar2.mo7065b();
        if ((b instanceof C1724b) || (b2 instanceof C1724b)) {
            return ((Boolean) mVar3.mo6920a(b, b2)).booleanValue();
        }
        return mo9494a(b, b2);
    }
}
