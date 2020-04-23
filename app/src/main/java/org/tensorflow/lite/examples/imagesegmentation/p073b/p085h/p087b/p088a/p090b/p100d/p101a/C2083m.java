package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1808q;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.p126a.C2543e;

/* renamed from: b.h.b.a.b.d.a.m */
/* compiled from: JavaVisibilities */
public class C2083m {

    /* renamed from: a */
    public static final C1723az f6318a = new C1723az("package", false) {
        /* renamed from: a */
        public String mo7336a() {
            return "public/*package*/";
        }

        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            return C2083m.m9328b(qVar, mVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer mo7337a(C1723az azVar) {
            if (this == azVar) {
                return Integer.valueOf(0);
            }
            if (C1710ay.m7692a(azVar)) {
                return Integer.valueOf(1);
            }
            return Integer.valueOf(-1);
        }

        /* renamed from: b */
        public C1723az mo7338b() {
            return C1710ay.f5338c;
        }
    };

    /* renamed from: b */
    public static final C1723az f6319b = new C1723az("protected_static", true) {
        /* renamed from: a */
        public String mo7336a() {
            return "protected/*protected static*/";
        }

        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            return C2083m.m9329b(eVar, qVar, mVar);
        }

        /* renamed from: b */
        public C1723az mo7338b() {
            return C1710ay.f5338c;
        }
    };

    /* renamed from: c */
    public static final C1723az f6320c = new C1723az("protected_and_package", true) {
        /* renamed from: a */
        public String mo7336a() {
            return "protected/*protected and package*/";
        }

        /* renamed from: a */
        public boolean mo7334a(C2543e eVar, C1808q qVar, C1804m mVar) {
            return C2083m.m9329b(eVar, qVar, mVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer mo7337a(C1723az azVar) {
            if (this == azVar) {
                return Integer.valueOf(0);
            }
            if (azVar == C1710ay.f5339d) {
                return null;
            }
            if (C1710ay.m7692a(azVar)) {
                return Integer.valueOf(1);
            }
            return Integer.valueOf(-1);
        }

        /* renamed from: b */
        public C1723az mo7338b() {
            return C1710ay.f5338c;
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m9329b(C2543e eVar, C1808q qVar, C1804m mVar) {
        if (m9328b(C2523c.m12580a(qVar), mVar)) {
            return true;
        }
        return C1710ay.f5338c.mo7334a(eVar, qVar, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m9328b(C1804m mVar, C1804m mVar2) {
        C1680ab abVar = (C1680ab) C2523c.m12579a(mVar, C1680ab.class, false);
        C1680ab abVar2 = (C1680ab) C2523c.m12579a(mVar2, C1680ab.class, false);
        if (abVar2 == null || abVar == null || !abVar.mo7284f().equals(abVar2.mo7284f())) {
            return false;
        }
        return true;
    }
}
