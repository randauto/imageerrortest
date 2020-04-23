package p073b.p085h.p087b.p088a.p089a;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo10386c = {"tryLoadClass", "Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "fqName", "", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.d */
/* compiled from: ReflectJavaClassFinder.kt */
public final class C1533d {
    /* renamed from: a */
    public static final Class<?> m7070a(ClassLoader classLoader, String str) {
        C1489j.m6972b(classLoader, "$receiver");
        C1489j.m6972b(str, "fqName");
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
