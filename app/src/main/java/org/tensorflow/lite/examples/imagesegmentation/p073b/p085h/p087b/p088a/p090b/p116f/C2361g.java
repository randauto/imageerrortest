package p073b.p085h.p087b.p088a.p090b.p116f;

import p000a.p001a.p002a.p003a.p004a.p009d.C0081b;
import p073b.p079e.p081b.C1489j;
import p073b.p143j.C3193j;

/* renamed from: b.h.b.a.b.f.g */
/* compiled from: NameUtils.kt */
public final class C2361g {

    /* renamed from: a */
    public static final C2361g f7234a = new C2361g();

    /* renamed from: b */
    private static final C3193j f7235b = new C3193j("[^\\p{L}\\p{Digit}]");

    private C2361g() {
    }

    /* renamed from: a */
    public static final String m11709a(String str) {
        C1489j.m6972b(str, "name");
        return f7235b.mo10376a(str, C0081b.ROLL_OVER_FILE_NAME_SEPARATOR);
    }
}
