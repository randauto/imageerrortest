package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c;

import java.util.List;
import p073b.C1511g;
import p073b.C1521h;
import p073b.C3217l;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1798g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C1834a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C1834a.C1836b;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2009x;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2021h;
import p073b.p085h.p087b.p088a.p090b.p139n.C2906h;

/* renamed from: b.h.b.a.b.d.a.c.a */
/* compiled from: context.kt */
public final class C1877a {

    /* renamed from: b.h.b.a.b.d.a.c.a$a */
    /* compiled from: context.kt */
    static final class C1878a extends C1490k implements C1449a<C1961d> {

        /* renamed from: a */
        final /* synthetic */ C1967h f5727a;

        /* renamed from: b */
        final /* synthetic */ C1798g f5728b;

        C1878a(C1967h hVar, C1798g gVar) {
            this.f5727a = hVar;
            this.f5728b = gVar;
            super(0);
        }

        /* renamed from: b */
        public final C1961d mo6823a() {
            return C1877a.m8643a(this.f5727a, this.f5728b.mo7086x());
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.a$b */
    /* compiled from: context.kt */
    static final class C1879b extends C1490k implements C1449a<C1961d> {

        /* renamed from: a */
        final /* synthetic */ C1967h f5729a;

        /* renamed from: b */
        final /* synthetic */ C1659h f5730b;

        C1879b(C1967h hVar, C1659h hVar2) {
            this.f5729a = hVar;
            this.f5730b = hVar2;
            super(0);
        }

        /* renamed from: b */
        public final C1961d mo6823a() {
            return C1877a.m8643a(this.f5729a, this.f5730b);
        }
    }

    /* renamed from: a */
    public static final C1967h m8650a(C1967h hVar, C1973m mVar) {
        C1489j.m6972b(hVar, "$receiver");
        C1489j.m6972b(mVar, "typeParameterResolver");
        return new C1967h(hVar.mo7805e(), mVar, hVar.mo7807g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1961d m8643a(p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h r5, p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h r6) {
        /*
            java.lang.String r0 = "$receiver"
            p073b.p079e.p081b.C1489j.m6972b(r5, r0)
            java.lang.String r0 = "additionalAnnotations"
            p073b.p079e.p081b.C1489j.m6972b(r6, r0)
            b.h.b.a.b.d.a.c.b r0 = r5.mo7805e()
            b.h.b.a.b.d.a.a r0 = r0.mo7759p()
            boolean r0 = r0.mo7584a()
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.d.a.c.d r5 = r5.mo7801a()
            return r5
        L_0x001d:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r6 = r6.iterator()
        L_0x002a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r6.next()
            b.h.b.a.b.b.a.c r1 = (p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c) r1
            b.h.b.a.b.d.a.c.k r1 = m8651a(r5, r1)
            if (r1 == 0) goto L_0x002a
            r0.add(r1)
            goto L_0x002a
        L_0x0040:
            java.util.List r0 = (java.util.List) r0
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L_0x004d
            b.h.b.a.b.d.a.c.d r5 = r5.mo7801a()
            return r5
        L_0x004d:
            b.h.b.a.b.d.a.c.d r6 = r5.mo7801a()
            if (r6 == 0) goto L_0x005f
            java.util.EnumMap r6 = r6.mo7796a()
            if (r6 == 0) goto L_0x005f
            java.util.EnumMap r1 = new java.util.EnumMap
            r1.<init>(r6)
            goto L_0x0066
        L_0x005f:
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<b.h.b.a.b.d.a.a$a> r6 = p073b.p085h.p087b.p088a.p090b.p100d.p101a.C1834a.C1835a.class
            r1.<init>(r6)
        L_0x0066:
            r6 = 0
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r0.next()
            b.h.b.a.b.d.a.c.k r2 = (p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1971k) r2
            b.h.b.a.b.d.a.f.h r3 = r2.mo7811a()
            java.util.Collection r2 = r2.mo7812b()
            java.util.Iterator r2 = r2.iterator()
        L_0x0083:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r6 = r2.next()
            b.h.b.a.b.d.a.a$a r6 = (p073b.p085h.p087b.p088a.p090b.p100d.p101a.C1834a.C1835a) r6
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            r4.put(r6, r3)
            r6 = 1
            goto L_0x0083
        L_0x0097:
            if (r6 != 0) goto L_0x009e
            b.h.b.a.b.d.a.c.d r5 = r5.mo7801a()
            goto L_0x00a3
        L_0x009e:
            b.h.b.a.b.d.a.c.d r5 = new b.h.b.a.b.d.a.c.d
            r5.<init>(r1)
        L_0x00a3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1877a.m8643a(b.h.b.a.b.d.a.c.h, b.h.b.a.b.b.a.h):b.h.b.a.b.d.a.c.d");
    }

    /* renamed from: a */
    private static final C1971k m8651a(C1967h hVar, C1651c cVar) {
        C1834a p = hVar.mo7805e().mo7759p();
        C1971k b = p.mo7585b(cVar);
        if (b != null) {
            return b;
        }
        C1836b c = p.mo7586c(cVar);
        if (c == null) {
            return null;
        }
        C1651c a = c.mo7589a();
        List b2 = c.mo7590b();
        C2906h e = p.mo7588e(cVar);
        if (e == null) {
            e = p.mo7587d(a);
        }
        if (e.mo10000b()) {
            return null;
        }
        C2021h a2 = hVar.mo7805e().mo7760q().mo7939a(a);
        if (a2 != null) {
            C2021h a3 = C2021h.m9176a(a2, null, e.mo9999a(), 1, null);
            if (a3 != null) {
                return new C1971k(a3, b2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C1967h m8649a(C1967h hVar, C1941b bVar) {
        C1489j.m6972b(hVar, "$receiver");
        C1489j.m6972b(bVar, "components");
        return new C1967h(bVar, hVar.mo7806f(), hVar.mo7807g());
    }

    /* renamed from: a */
    private static final C1967h m8648a(C1967h hVar, C1804m mVar, C2009x xVar, int i, C1511g<C1961d> gVar) {
        C1973m mVar2;
        C1941b e = hVar.mo7805e();
        if (xVar != null) {
            mVar2 = new C1968i(hVar, mVar, xVar, i);
        } else {
            mVar2 = hVar.mo7806f();
        }
        return new C1967h(e, mVar2, gVar);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C1967h m8647a(C1967h hVar, C1804m mVar, C2009x xVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m8646a(hVar, mVar, xVar, i);
    }

    /* renamed from: a */
    public static final C1967h m8646a(C1967h hVar, C1804m mVar, C2009x xVar, int i) {
        C1489j.m6972b(hVar, "$receiver");
        C1489j.m6972b(mVar, "containingDeclaration");
        C1489j.m6972b(xVar, "typeParameterOwner");
        return m8648a(hVar, mVar, xVar, i, hVar.mo7807g());
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C1967h m8645a(C1967h hVar, C1798g gVar, C2009x xVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            xVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m8644a(hVar, gVar, xVar, i);
    }

    /* renamed from: a */
    public static final C1967h m8644a(C1967h hVar, C1798g gVar, C2009x xVar, int i) {
        C1489j.m6972b(hVar, "$receiver");
        C1489j.m6972b(gVar, "containingDeclaration");
        return m8648a(hVar, gVar, xVar, i, C1521h.m14707a(C3217l.NONE, new C1878a(hVar, gVar)));
    }

    /* renamed from: b */
    public static final C1967h m8652b(C1967h hVar, C1659h hVar2) {
        C1489j.m6972b(hVar, "$receiver");
        C1489j.m6972b(hVar2, "additionalAnnotations");
        return hVar2.mo7255a() ? hVar : new C1967h(hVar.mo7805e(), hVar.mo7806f(), C1521h.m14707a(C3217l.NONE, new C1879b(hVar, hVar2)));
    }
}
