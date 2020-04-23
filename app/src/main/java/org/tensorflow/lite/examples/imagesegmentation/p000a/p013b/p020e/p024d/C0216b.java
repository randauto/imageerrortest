package p000a.p013b.p020e.p024d;

import p000a.p013b.C0181d;

/* renamed from: a.b.e.d.b */
/* compiled from: DeferredScalarDisposable */
public class C0216b<T> extends C0215a<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: a */
    protected final C0181d<? super T> f396a;

    /* renamed from: b */
    protected T f397b;

    public C0216b(C0181d<? super T> dVar) {
        this.f396a = dVar;
    }

    /* renamed from: a */
    public final int mo388a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: b */
    public final void mo404b(T t) {
        int i = get();
        if ((i & 54) == 0) {
            if (i == 8) {
                this.f397b = t;
                lazySet(16);
            } else {
                lazySet(2);
            }
            C0181d<? super T> dVar = this.f396a;
            dVar.mo377a_(t);
            if (get() != 4) {
                dVar.mo378s_();
            }
        }
    }

    /* renamed from: b */
    public final T mo390b() {
        if (get() != 16) {
            return null;
        }
        T t = this.f397b;
        this.f397b = null;
        lazySet(32);
        return t;
    }

    /* renamed from: c */
    public final boolean mo391c() {
        return get() != 16;
    }

    /* renamed from: d */
    public final void mo392d() {
        lazySet(32);
        this.f397b = null;
    }

    /* renamed from: a */
    public void mo349a() {
        set(4);
        this.f397b = null;
    }

    /* renamed from: e */
    public final boolean mo405e() {
        return get() == 4;
    }
}
