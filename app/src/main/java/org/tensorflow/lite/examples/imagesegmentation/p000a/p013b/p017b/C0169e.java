package p000a.p013b.p017b;

/* renamed from: a.b.b.e */
/* compiled from: RunnableDisposable */
final class C0169e extends C0168d<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    C0169e(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo363a(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RunnableDisposable(disposed=");
        sb.append(mo364b());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
