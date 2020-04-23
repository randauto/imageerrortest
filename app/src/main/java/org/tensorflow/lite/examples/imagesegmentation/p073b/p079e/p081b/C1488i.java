package p073b.p079e.p081b;

import p073b.p085h.C1522a;
import p073b.p085h.C3124e;

/* renamed from: b.e.b.i */
/* compiled from: FunctionReference */
public class C1488i extends C1481c implements C1487h, C3124e {

    /* renamed from: c */
    private final int f4855c;

    public C1488i(int i) {
        this.f4855c = i;
    }

    public C1488i(int i, Object obj) {
        super(obj);
        this.f4855c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3124e mo6929e() {
        return (C3124e) super.mo6929e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1522a mo6926b() {
        return C1503v.m7001a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a(mo6927c(), r5.mo6927c()) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p073b.p079e.p081b.C1488i
            r2 = 0
            if (r1 == 0) goto L_0x0053
            b.e.b.i r5 = (p073b.p079e.p081b.C1488i) r5
            b.h.d r1 = r4.mo6930f()
            if (r1 != 0) goto L_0x0018
            b.h.d r1 = r5.mo6930f()
            if (r1 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0018:
            b.h.d r1 = r4.mo6930f()
            b.h.d r3 = r5.mo6930f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
        L_0x0026:
            java.lang.String r1 = r4.mo6931g()
            java.lang.String r3 = r5.mo6931g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r4.mo6932h()
            java.lang.String r3 = r5.mo6932h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r4.mo6927c()
            java.lang.Object r5 = r5.mo6927c()
            boolean r5 = p073b.p079e.p081b.C1489j.m6971a(r1, r5)
            if (r5 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            return r0
        L_0x0053:
            boolean r0 = r5 instanceof p073b.p085h.C3124e
            if (r0 == 0) goto L_0x0060
            b.h.a r0 = r4.mo6928d()
            boolean r5 = r5.equals(r0)
            return r5
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p079e.p081b.C1488i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((mo6930f() == null ? 0 : mo6930f().hashCode() * 31) + mo6931g().hashCode()) * 31) + mo6932h().hashCode();
    }

    public String toString() {
        String str;
        C1522a d = mo6928d();
        if (d != this) {
            return d.toString();
        }
        if ("<init>".equals(mo6931g())) {
            str = "constructor (Kotlin reflection is not available)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("function ");
            sb.append(mo6931g());
            sb.append(" (Kotlin reflection is not available)");
            str = sb.toString();
        }
        return str;
    }
}
