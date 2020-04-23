package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import p073b.C3219n;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2336c;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2316f;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2316f.C2317a;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2316f.C2318b;

/* renamed from: b.h.b.a.b.d.b.q */
/* compiled from: MemberSignature.kt */
public final class C2145q {

    /* renamed from: a */
    public static final C2146a f6451a = new C2146a(null);

    /* renamed from: b */
    private final String f6452b;

    /* renamed from: b.h.b.a.b.d.b.q$a */
    /* compiled from: MemberSignature.kt */
    public static final class C2146a {
        private C2146a() {
        }

        public /* synthetic */ C2146a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2145q mo8071a(C2285c cVar, C2336c cVar2) {
            C1489j.m6972b(cVar, "nameResolver");
            C1489j.m6972b(cVar2, "signature");
            return mo8073a(cVar.mo8811a(cVar2.mo8925e()), cVar.mo8811a(cVar2.mo8927g()));
        }

        /* renamed from: a */
        public final C2145q mo8073a(String str, String str2) {
            C1489j.m6972b(str, "name");
            C1489j.m6972b(str2, "desc");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return new C2145q(sb.toString(), null);
        }

        /* renamed from: b */
        public final C2145q mo8074b(String str, String str2) {
            C1489j.m6972b(str, "name");
            C1489j.m6972b(str2, "desc");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(str2);
            return new C2145q(sb.toString(), null);
        }

        /* renamed from: a */
        public final C2145q mo8072a(C2316f fVar) {
            C1489j.m6972b(fVar, "signature");
            if (fVar instanceof C2318b) {
                return mo8073a(fVar.mo8883a(), fVar.mo8884b());
            }
            if (fVar instanceof C2317a) {
                return mo8074b(fVar.mo8883a(), fVar.mo8884b());
            }
            throw new C3219n();
        }

        /* renamed from: a */
        public final C2145q mo8070a(C2145q qVar, int i) {
            C1489j.m6972b(qVar, "signature");
            StringBuilder sb = new StringBuilder();
            sb.append(qVar.mo8066a());
            sb.append("@");
            sb.append(i);
            return new C2145q(sb.toString(), null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r1.f6452b, (java.lang.Object) ((p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2145q) r2).f6452b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2145q
            if (r0 == 0) goto L_0x0013
            b.h.b.a.b.d.b.q r2 = (p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2145q) r2
            java.lang.String r0 = r1.f6452b
            java.lang.String r2 = r2.f6452b
            boolean r2 = p073b.p079e.p081b.C1489j.m6971a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2145q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f6452b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MemberSignature(signature=");
        sb.append(this.f6452b);
        sb.append(")");
        return sb.toString();
    }

    private C2145q(String str) {
        this.f6452b = str;
    }

    public /* synthetic */ C2145q(String str, C1486g gVar) {
        this(str);
    }

    /* renamed from: a */
    public final String mo8066a() {
        return this.f6452b;
    }
}
