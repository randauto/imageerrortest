package p000a.p013b.p018c;

/* renamed from: a.b.c.d */
/* compiled from: OnErrorNotImplementedException */
public final class C0178d extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public C0178d(Throwable th) {
        String message = th != null ? th.getMessage() : null;
        if (th == null) {
            th = new NullPointerException();
        }
        super(message, th);
    }
}
