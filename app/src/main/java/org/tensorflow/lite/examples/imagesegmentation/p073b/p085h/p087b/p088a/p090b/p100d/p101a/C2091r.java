package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import java.util.List;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p136m.p137a.C2846a;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.d.a.r */
/* compiled from: propertiesConventionUtil.kt */
public final class C2091r {
    /* renamed from: a */
    public static final C2360f m9362a(C2360f fVar) {
        C1489j.m6972b(fVar, "methodName");
        C2360f a = m9364a(fVar, "get", false, null, 12, null);
        if (a != null) {
            return a;
        }
        return m9364a(fVar, "is", false, null, 8, null);
    }

    /* renamed from: a */
    public static final C2360f m9365a(C2360f fVar, boolean z) {
        C1489j.m6972b(fVar, "methodName");
        return m9364a(fVar, "set", false, z ? "is" : null, 4, null);
    }

    /* renamed from: b */
    public static final List<C2360f> m9366b(C2360f fVar) {
        C1489j.m6972b(fVar, "methodName");
        return C1415k.m6887h((Iterable<? extends T>) C1415k.m6840b((T[]) new C2360f[]{m9365a(fVar, false), m9365a(fVar, true)}));
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ C2360f m9364a(C2360f fVar, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m9363a(fVar, str, z, str2);
    }

    /* renamed from: a */
    private static final C2360f m9363a(C2360f fVar, String str, boolean z, String str2) {
        if (fVar.mo9041c()) {
            return null;
        }
        String b = fVar.mo9040b();
        C1489j.m6969a((Object) b, "identifier");
        if (!C3199m.m14761b(b, str, false, 2, null) || b.length() == str.length()) {
            return null;
        }
        char charAt = b.charAt(str.length());
        if ('a' <= charAt && 'z' >= charAt) {
            return null;
        }
        if (str2 != null) {
            if (!C3232z.f8648a || z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(C3199m.m14786a(b, (CharSequence) str));
                return C2360f.m11701a(sb.toString());
            }
            throw new AssertionError("Assertion failed");
        } else if (!z) {
            return fVar;
        } else {
            String a = C2846a.m13890a(C3199m.m14786a(b, (CharSequence) str), true);
            if (!C2360f.m11702b(a)) {
                return null;
            }
            return C2360f.m11701a(a);
        }
    }

    /* renamed from: c */
    public static final List<C2360f> m9367c(C2360f fVar) {
        C1489j.m6972b(fVar, "name");
        String a = fVar.mo9039a();
        if (C2087n.m9345a(a)) {
            return C1415k.m6838b(m9362a(fVar));
        }
        if (C2087n.m9346b(a)) {
            return m9366b(fVar);
        }
        return C1983e.f5954a.mo7820a(fVar);
    }
}
