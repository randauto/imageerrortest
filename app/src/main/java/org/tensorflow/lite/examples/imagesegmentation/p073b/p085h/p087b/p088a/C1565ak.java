package p073b.p085h.p087b.p088a;

import java.lang.ref.WeakReference;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004¨\u0006\u0017"}, mo10386c = {"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "identityHashCode", "", "getIdentityHashCode", "()I", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "temporaryStrongRef", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "setTemporaryStrongRef", "equals", "", "other", "hashCode", "toString", "", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.ak */
/* compiled from: moduleByClassLoader.kt */
final class C1565ak {

    /* renamed from: a */
    private final WeakReference<ClassLoader> f4934a;

    /* renamed from: b */
    private final int f4935b;

    /* renamed from: c */
    private ClassLoader f4936c;

    public C1565ak(ClassLoader classLoader) {
        C1489j.m6972b(classLoader, "classLoader");
        this.f4934a = new WeakReference<>(classLoader);
        this.f4935b = System.identityHashCode(classLoader);
        this.f4936c = classLoader;
    }

    /* renamed from: a */
    public final void mo7042a(ClassLoader classLoader) {
        this.f4936c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1565ak) && ((ClassLoader) this.f4934a.get()) == ((ClassLoader) ((C1565ak) obj).f4934a.get());
    }

    public int hashCode() {
        return this.f4935b;
    }

    public String toString() {
        ClassLoader classLoader = (ClassLoader) this.f4934a.get();
        if (classLoader != null) {
            String classLoader2 = classLoader.toString();
            if (classLoader2 != null) {
                return classLoader2;
            }
        }
        return "<null>";
    }
}
