package p000a.p013b.p017b;

import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.p020e.p022b.C0209b;

/* renamed from: a.b.b.d */
/* compiled from: ReferenceDisposable */
abstract class C0168d<T> extends AtomicReference<T> implements C0166b {
    private static final long serialVersionUID = 6537757548749041217L;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo363a(T t);

    C0168d(T t) {
        super(C0209b.m547a(t, "value is null"));
    }

    /* renamed from: a */
    public final void mo349a() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                mo363a(andSet);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo364b() {
        return get() == null;
    }
}
