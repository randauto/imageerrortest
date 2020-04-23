package p073b.p085h.p087b.p088a.p090b.p139n;

import p073b.p079e.p081b.C1489j;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.n.g */
/* compiled from: numbers.kt */
public final class C2905g {
    /* renamed from: a */
    public static final C2904f m13994a(String str) {
        C1489j.m6972b(str, "value");
        if (C3199m.m14761b(str, "0x", false, 2, null) || C3199m.m14761b(str, "0X", false, 2, null)) {
            String substring = str.substring(2);
            C1489j.m6969a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new C2904f(substring, 16);
        } else if (!C3199m.m14761b(str, "0b", false, 2, null) && !C3199m.m14761b(str, "0B", false, 2, null)) {
            return new C2904f(str, 10);
        } else {
            String substring2 = str.substring(2);
            C1489j.m6969a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            return new C2904f(substring2, 2);
        }
    }
}
