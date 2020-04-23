package p073b.p085h.p087b.p088a.p090b.p139n;

/* renamed from: b.h.b.a.b.n.k */
/* compiled from: WrappedValues */
public class C2917k {

    /* renamed from: a */
    public static volatile boolean f8254a = false;

    /* renamed from: b */
    private static final Object f8255b = new Object() {
        public String toString() {
            return "NULL_VALUE";
        }
    };

    /* renamed from: b.h.b.a.b.n.k$a */
    /* compiled from: WrappedValues */
    private static final class C2919a {

        /* renamed from: a */
        private final Throwable f8256a;

        private C2919a(Throwable th) {
            this.f8256a = th;
        }

        /* renamed from: a */
        public Throwable mo10037a() {
            return this.f8256a;
        }

        public String toString() {
            return this.f8256a.toString();
        }
    }

    /* renamed from: b.h.b.a.b.n.k$b */
    /* compiled from: WrappedValues */
    public static class C2920b extends RuntimeException {
        public C2920b(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* renamed from: a */
    public static <V> V m14014a(Object obj) {
        if (obj == f8255b) {
            return null;
        }
        return obj;
    }

    /* renamed from: b */
    public static <V> Object m14016b(V v) {
        return v == null ? f8255b : v;
    }

    /* renamed from: a */
    public static Object m14015a(Throwable th) {
        return new C2919a(th);
    }

    /* renamed from: c */
    public static <V> V m14017c(Object obj) {
        return m14014a(m14018d(obj));
    }

    /* renamed from: d */
    public static <V> V m14018d(Object obj) {
        if (!(obj instanceof C2919a)) {
            return obj;
        }
        Throwable a = ((C2919a) obj).mo10037a();
        if (!f8254a || !C2893c.m13970b(a)) {
            throw C2893c.m13969a(a);
        }
        throw new C2920b(a);
    }
}
