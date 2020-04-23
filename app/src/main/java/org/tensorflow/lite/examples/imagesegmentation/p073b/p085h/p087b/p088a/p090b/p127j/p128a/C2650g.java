package p073b.p085h.p087b.p088a.p090b.p127j.p128a;

import java.util.Set;
import p073b.p074a.C1395aj;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;

/* renamed from: b.h.b.a.b.j.a.g */
/* compiled from: ClassDeserializer.kt */
public final class C2650g {

    /* renamed from: a */
    public static final C2652b f7825a = new C2652b(null);

    /* renamed from: d */
    private static final Set<C2354a> f7826d = C1395aj.m6758a(C2354a.m11661a(C1627g.f5076h.f5146c.mo9028c()));

    /* renamed from: b */
    private final C1450b<C2651a, C1796e> f7827b = this.f7828c.mo9717b().mo9797b((C1450b<? super K, ? extends V>) new C2653c<Object,Object>(this));

    /* renamed from: c */
    private final C2657i f7828c;

    /* renamed from: b.h.b.a.b.j.a.g$a */
    /* compiled from: ClassDeserializer.kt */
    private static final class C2651a {

        /* renamed from: a */
        private final C2354a f7829a;

        /* renamed from: b */
        private final C2648e f7830b;

        public C2651a(C2354a aVar, C2648e eVar) {
            C1489j.m6972b(aVar, "classId");
            this.f7829a = aVar;
            this.f7830b = eVar;
        }

        /* renamed from: a */
        public final C2354a mo9707a() {
            return this.f7829a;
        }

        /* renamed from: b */
        public final C2648e mo9708b() {
            return this.f7830b;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C2651a) && C1489j.m6971a((Object) this.f7829a, (Object) ((C2651a) obj).f7829a);
        }

        public int hashCode() {
            return this.f7829a.hashCode();
        }
    }

    /* renamed from: b.h.b.a.b.j.a.g$b */
    /* compiled from: ClassDeserializer.kt */
    public static final class C2652b {
        private C2652b() {
        }

        public /* synthetic */ C2652b(C1486g gVar) {
            this();
        }
    }

    /* renamed from: b.h.b.a.b.j.a.g$c */
    /* compiled from: ClassDeserializer.kt */
    static final class C2653c extends C1490k implements C1450b<C2651a, C1796e> {

        /* renamed from: a */
        final /* synthetic */ C2650g f7831a;

        C2653c(C2650g gVar) {
            this.f7831a = gVar;
            super(1);
        }

        /* renamed from: a */
        public final C1796e mo6756a(C2651a aVar) {
            C1489j.m6972b(aVar, "key");
            return this.f7831a.m13136a(aVar);
        }
    }

    public C2650g(C2657i iVar) {
        C1489j.m6972b(iVar, "components");
        this.f7828c = iVar;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C1796e m13137a(C2650g gVar, C2354a aVar, C2648e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        return gVar.mo9706a(aVar, eVar);
    }

    /* renamed from: a */
    public final C1796e mo9706a(C2354a aVar, C2648e eVar) {
        C1489j.m6972b(aVar, "classId");
        return (C1796e) this.f7827b.mo6756a(new C2651a(aVar, eVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd A[EDGE_INSN: B:47:0x00bd->B:37:0x00bd ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073b.p085h.p087b.p088a.p090b.p094b.C1796e m13136a(p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2650g.C2651a r13) {
        /*
            r12 = this;
            b.h.b.a.b.f.a r0 = r13.mo9707a()
            b.h.b.a.b.j.a.i r1 = r12.f7828c
            java.lang.Iterable r1 = r1.mo9727l()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            b.h.b.a.b.b.b.b r2 = (p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1728b) r2
            b.h.b.a.b.b.e r2 = r2.mo7052a(r0)
            if (r2 == 0) goto L_0x000e
            return r2
        L_0x0021:
            java.util.Set<b.h.b.a.b.f.a> r1 = f7826d
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            b.h.b.a.b.j.a.e r13 = r13.mo9708b()
            if (r13 == 0) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            b.h.b.a.b.j.a.i r13 = r12.f7828c
            b.h.b.a.b.j.a.f r13 = r13.mo9720e()
            b.h.b.a.b.j.a.e r13 = r13.mo8035a(r0)
        L_0x003c:
            if (r13 == 0) goto L_0x00f6
            b.h.b.a.b.e.a.c r1 = r13.mo9699a()
            b.h.b.a.b.e.a$c r10 = r13.mo9700b()
            b.h.b.a.b.e.a.a r11 = r13.mo9701c()
            b.h.b.a.b.b.am r13 = r13.mo9702d()
            b.h.b.a.b.f.a r3 = r0.mo9005e()
            if (r3 == 0) goto L_0x007a
            r4 = 2
            b.h.b.a.b.b.e r3 = m13137a(r12, r3, r2, r4, r2)
            boolean r4 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2608e
            if (r4 != 0) goto L_0x005e
            r3 = r2
        L_0x005e:
            b.h.b.a.b.j.a.a.e r3 = (p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2608e) r3
            if (r3 == 0) goto L_0x0079
            b.h.b.a.b.f.f r0 = r0.mo9003c()
            java.lang.String r4 = "classId.shortClassName"
            p073b.p079e.p081b.C1489j.m6969a(r0, r4)
            boolean r0 = r3.mo9646a(r0)
            if (r0 != 0) goto L_0x0072
            return r2
        L_0x0072:
            b.h.b.a.b.j.a.k r0 = r3.mo9645a()
        L_0x0076:
            r4 = r0
            goto L_0x00e8
        L_0x0079:
            return r2
        L_0x007a:
            b.h.b.a.b.j.a.i r3 = r12.f7828c
            b.h.b.a.b.b.ac r3 = r3.mo9722g()
            b.h.b.a.b.f.b r4 = r0.mo9001a()
            java.lang.String r5 = "classId.packageFqName"
            p073b.p079e.p081b.C1489j.m6969a(r4, r5)
            java.util.List r3 = r3.mo7286a(r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0093:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r3.next()
            r5 = r4
            b.h.b.a.b.b.ab r5 = (p073b.p085h.p087b.p088a.p090b.p094b.C1680ab) r5
            boolean r6 = r5 instanceof p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2662l
            if (r6 == 0) goto L_0x00b8
            b.h.b.a.b.j.a.l r5 = (p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2662l) r5
            b.h.b.a.b.f.f r6 = r0.mo9003c()
            java.lang.String r7 = "classId.shortClassName"
            p073b.p079e.p081b.C1489j.m6969a(r6, r7)
            boolean r5 = r5.mo9748a(r6)
            if (r5 == 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            r5 = 0
            goto L_0x00b9
        L_0x00b8:
            r5 = 1
        L_0x00b9:
            if (r5 == 0) goto L_0x0093
            goto L_0x00bd
        L_0x00bc:
            r4 = r2
        L_0x00bd:
            b.h.b.a.b.b.ab r4 = (p073b.p085h.p087b.p088a.p090b.p094b.C1680ab) r4
            if (r4 == 0) goto L_0x00f5
            b.h.b.a.b.j.a.i r3 = r12.f7828c
            b.h.b.a.b.e.a.h r6 = new b.h.b.a.b.e.a.h
            b.h.b.a.b.e.a$ag r0 = r10.mo8451G()
            java.lang.String r2 = "classProto.typeTable"
            p073b.p079e.p081b.C1489j.m6969a(r0, r2)
            r6.<init>(r0)
            b.h.b.a.b.e.a.k$a r0 = p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2296k.f7049a
            b.h.b.a.b.e.a$am r2 = r10.mo8454J()
            java.lang.String r5 = "classProto.versionRequirementTable"
            p073b.p079e.p081b.C1489j.m6969a(r2, r5)
            b.h.b.a.b.e.a.k r7 = r0.mo8827a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            b.h.b.a.b.j.a.k r0 = r3.mo9716a(r4, r5, r6, r7, r8, r9)
            goto L_0x0076
        L_0x00e8:
            b.h.b.a.b.j.a.a.e r0 = new b.h.b.a.b.j.a.a.e
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            b.h.b.a.b.b.e r0 = (p073b.p085h.p087b.p088a.p090b.p094b.C1796e) r0
            return r0
        L_0x00f5:
            return r2
        L_0x00f6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2650g.m13136a(b.h.b.a.b.j.a.g$a):b.h.b.a.b.b.e");
    }
}
