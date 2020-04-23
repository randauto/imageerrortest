package p000a.p013b.p020e.p029h;

/* renamed from: a.b.e.h.a */
/* compiled from: ExceptionHelper */
public final class C0250a {

    /* renamed from: a */
    public static final Throwable f506a = new C0251a();

    /* renamed from: a.b.e.h.a$a */
    /* compiled from: ExceptionHelper */
    static final class C0251a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public Throwable fillInStackTrace() {
            return this;
        }

        C0251a() {
            super("No further exceptions");
        }
    }

    /* renamed from: a */
    public static RuntimeException m658a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}
