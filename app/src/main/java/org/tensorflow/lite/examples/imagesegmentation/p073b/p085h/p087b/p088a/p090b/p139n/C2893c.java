package p073b.p085h.p087b.p088a.p090b.p139n;

import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.n.c */
/* compiled from: exceptionUtils.kt */
public final class C2893c {
    /* renamed from: a */
    public static final RuntimeException m13969a(Throwable th) {
        C1489j.m6972b(th, "e");
        throw th;
    }

    /* renamed from: b */
    public static final boolean m13970b(Throwable th) {
        C1489j.m6972b(th, "$receiver");
        Class cls = th.getClass();
        while (!C1489j.m6971a((Object) cls.getCanonicalName(), (Object) "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }
}
