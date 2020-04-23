package p073b.p085h.p087b.p088a.p090b.p094b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1388ac;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p084g.C1517d;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1746ag;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1762g;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1768m;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h.C2564c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2707c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2814e;

/* renamed from: b.h.b.a.b.b.aa */
/* compiled from: NotFoundClasses.kt */
public final class C1675aa {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2707c<C2355b, C1680ab> f5317a = this.f5319c.mo9791a((C1450b<? super K, ? extends V>) new C1679d<Object,Object>(this));

    /* renamed from: b */
    private final C2707c<C1676a, C1796e> f5318b = this.f5319c.mo9791a((C1450b<? super K, ? extends V>) new C1678c<Object,Object>(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2713i f5319c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1821y f5320d;

    /* renamed from: b.h.b.a.b.b.aa$a */
    /* compiled from: NotFoundClasses.kt */
    private static final class C1676a {

        /* renamed from: a */
        private final C2354a f5321a;

        /* renamed from: b */
        private final List<Integer> f5322b;

        /* renamed from: a */
        public final C2354a mo7272a() {
            return this.f5321a;
        }

        /* renamed from: b */
        public final List<Integer> mo7273b() {
            return this.f5322b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f5322b, (java.lang.Object) r3.f5322b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1675aa.C1676a
                if (r0 == 0) goto L_0x001d
                b.h.b.a.b.b.aa$a r3 = (p073b.p085h.p087b.p088a.p090b.p094b.C1675aa.C1676a) r3
                b.h.b.a.b.f.a r0 = r2.f5321a
                b.h.b.a.b.f.a r1 = r3.f5321a
                boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.List<java.lang.Integer> r0 = r2.f5322b
                java.util.List<java.lang.Integer> r3 = r3.f5322b
                boolean r3 = p073b.p079e.p081b.C1489j.m6971a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p094b.C1675aa.C1676a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            C2354a aVar = this.f5321a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            List<Integer> list = this.f5322b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassRequest(classId=");
            sb.append(this.f5321a);
            sb.append(", typeParametersCount=");
            sb.append(this.f5322b);
            sb.append(")");
            return sb.toString();
        }

        public C1676a(C2354a aVar, List<Integer> list) {
            C1489j.m6972b(aVar, "classId");
            C1489j.m6972b(list, "typeParametersCount");
            this.f5321a = aVar;
            this.f5322b = list;
        }
    }

    /* renamed from: b.h.b.a.b.b.aa$b */
    /* compiled from: NotFoundClasses.kt */
    public static final class C1677b extends C1762g {

        /* renamed from: c */
        private final List<C1700ar> f5323c;

        /* renamed from: d */
        private final C2814e f5324d;

        /* renamed from: e */
        private final boolean f5325e;

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

        /* renamed from: w */
        public boolean mo7085w() {
            return false;
        }

        public C1677b(C2713i iVar, C1804m mVar, C2360f fVar, boolean z, int i) {
            C1489j.m6972b(iVar, "storageManager");
            C1489j.m6972b(mVar, "container");
            C1489j.m6972b(fVar, "name");
            super(iVar, mVar, fVar, C1692am.f5331a, false);
            this.f5325e = z;
            Iterable b = C1517d.m7047b(0, i);
            Collection arrayList = new ArrayList(C1415k.m6842a(b, 10));
            Iterator it = b.iterator();
            while (it.hasNext()) {
                int b2 = ((C1388ac) it).mo6764b();
                C1804m mVar2 = this;
                C1659h a = C1659h.f5247a.mo7260a();
                C2792ba baVar = C2792ba.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(b2);
                arrayList.add(C1746ag.m7832a(mVar2, a, false, baVar, C2360f.m11701a(sb.toString()), b2));
            }
            this.f5323c = (List) arrayList;
            this.f5324d = new C2814e(this, this.f5323c, C1395aj.m6758a(C2524a.m12626c(this).mo7522a().mo7206s()), iVar);
        }

        /* renamed from: l */
        public C1797f mo7073l() {
            return C1797f.CLASS;
        }

        /* renamed from: m */
        public C1818w mo7074m() {
            return C1818w.FINAL;
        }

        /* renamed from: p */
        public C1723az mo7077p() {
            return C1710ay.f5340e;
        }

        /* renamed from: a */
        public C2814e mo7067e() {
            return this.f5324d;
        }

        /* renamed from: z */
        public List<C1700ar> mo7090z() {
            return this.f5323c;
        }

        /* renamed from: r */
        public boolean mo7079r() {
            return this.f5325e;
        }

        /* renamed from: x */
        public C1659h mo7086x() {
            return C1659h.f5247a.mo7260a();
        }

        /* renamed from: c */
        public C2564c mo7068g() {
            return C2564c.f7661a;
        }

        /* renamed from: j */
        public C2564c mo7087x_() {
            return C2564c.f7661a;
        }

        /* renamed from: k */
        public Collection<C1795d> mo7072k() {
            return C1395aj.m6759a();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ");
            sb.append(mo7351z_());
            sb.append(" (not found)");
            return sb.toString();
        }
    }

    /* renamed from: b.h.b.a.b.b.aa$c */
    /* compiled from: NotFoundClasses.kt */
    static final class C1678c extends C1490k implements C1450b<C1676a, C1677b> {

        /* renamed from: a */
        final /* synthetic */ C1675aa f5326a;

        C1678c(C1675aa aaVar) {
            this.f5326a = aaVar;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x006c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p073b.p085h.p087b.p088a.p090b.p094b.C1675aa.C1677b mo6756a(p073b.p085h.p087b.p088a.p090b.p094b.C1675aa.C1676a r10) {
            /*
                r9 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                p073b.p079e.p081b.C1489j.m6972b(r10, r0)
                b.h.b.a.b.f.a r0 = r10.mo7272a()
                java.util.List r10 = r10.mo7273b()
                boolean r1 = r0.mo9004d()
                if (r1 != 0) goto L_0x0073
                b.h.b.a.b.f.a r1 = r0.mo9005e()
                if (r1 == 0) goto L_0x0031
                b.h.b.a.b.b.aa r2 = r9.f5326a
                java.lang.String r3 = "outerClassId"
                p073b.p079e.p081b.C1489j.m6969a(r1, r3)
                r3 = r10
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                r4 = 1
                java.util.List r3 = p073b.p074a.C1415k.m6867b(r3, r4)
                b.h.b.a.b.b.e r1 = r2.mo7271a(r1, r3)
                if (r1 == 0) goto L_0x0031
                b.h.b.a.b.b.g r1 = (p073b.p085h.p087b.p088a.p090b.p094b.C1798g) r1
                goto L_0x0046
            L_0x0031:
                b.h.b.a.b.b.aa r1 = r9.f5326a
                b.h.b.a.b.k.c r1 = r1.f5317a
                b.h.b.a.b.f.b r2 = r0.mo9001a()
                java.lang.String r3 = "classId.packageFqName"
                p073b.p079e.p081b.C1489j.m6969a(r2, r3)
                java.lang.Object r1 = r1.mo6756a(r2)
                b.h.b.a.b.b.g r1 = (p073b.p085h.p087b.p088a.p090b.p094b.C1798g) r1
            L_0x0046:
                boolean r6 = r0.mo9007f()
                b.h.b.a.b.b.aa$b r8 = new b.h.b.a.b.b.aa$b
                b.h.b.a.b.b.aa r2 = r9.f5326a
                b.h.b.a.b.k.i r3 = r2.f5319c
                r4 = r1
                b.h.b.a.b.b.m r4 = (p073b.p085h.p087b.p088a.p090b.p094b.C1804m) r4
                b.h.b.a.b.f.f r5 = r0.mo9003c()
                java.lang.String r0 = "classId.shortClassName"
                p073b.p079e.p081b.C1489j.m6969a(r5, r0)
                java.lang.Object r10 = p073b.p074a.C1415k.m6885g(r10)
                java.lang.Integer r10 = (java.lang.Integer) r10
                if (r10 == 0) goto L_0x006c
                int r10 = r10.intValue()
                r7 = r10
                goto L_0x006e
            L_0x006c:
                r10 = 0
                r7 = 0
            L_0x006e:
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                return r8
            L_0x0073:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unresolved local class: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p094b.C1675aa.C1678c.mo6756a(b.h.b.a.b.b.aa$a):b.h.b.a.b.b.aa$b");
        }
    }

    /* renamed from: b.h.b.a.b.b.aa$d */
    /* compiled from: NotFoundClasses.kt */
    static final class C1679d extends C1490k implements C1450b<C2355b, C1768m> {

        /* renamed from: a */
        final /* synthetic */ C1675aa f5327a;

        C1679d(C1675aa aaVar) {
            this.f5327a = aaVar;
            super(1);
        }

        /* renamed from: a */
        public final C1768m mo6756a(C2355b bVar) {
            C1489j.m6972b(bVar, "fqName");
            return new C1768m(this.f5327a.f5320d, bVar);
        }
    }

    public C1675aa(C2713i iVar, C1821y yVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(yVar, "module");
        this.f5319c = iVar;
        this.f5320d = yVar;
    }

    /* renamed from: a */
    public final C1796e mo7271a(C2354a aVar, List<Integer> list) {
        C1489j.m6972b(aVar, "classId");
        C1489j.m6972b(list, "typeParametersCount");
        return (C1796e) this.f5318b.mo6756a(new C1676a(aVar, list));
    }
}
