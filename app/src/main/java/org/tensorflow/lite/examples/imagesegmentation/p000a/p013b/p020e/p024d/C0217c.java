package p000a.p013b.p020e.p024d;

import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0181d;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p018c.C0171a;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p019d.C0182a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p020e.p021a.C0193b;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.d.c */
/* compiled from: LambdaObserver */
public final class C0217c<T> extends AtomicReference<C0166b> implements C0166b, C0181d<T> {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a */
    final C0185d<? super T> f398a;

    /* renamed from: b */
    final C0185d<? super Throwable> f399b;

    /* renamed from: c */
    final C0182a f400c;

    /* renamed from: d */
    final C0185d<? super C0166b> f401d;

    public C0217c(C0185d<? super T> dVar, C0185d<? super Throwable> dVar2, C0182a aVar, C0185d<? super C0166b> dVar3) {
        this.f398a = dVar;
        this.f399b = dVar2;
        this.f400c = aVar;
        this.f401d = dVar3;
    }

    /* renamed from: a */
    public void mo375a(C0166b bVar) {
        if (C0193b.m520a((AtomicReference<C0166b>) this, bVar)) {
            try {
                this.f401d.mo381a(this);
            } catch (Throwable th) {
                C0176b.m498b(th);
                bVar.mo349a();
                mo376a(th);
            }
        }
    }

    /* renamed from: a_ */
    public void mo377a_(T t) {
        if (!mo406b()) {
            try {
                this.f398a.mo381a(t);
            } catch (Throwable th) {
                C0176b.m498b(th);
                ((C0166b) get()).mo349a();
                mo376a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo376a(Throwable th) {
        if (!mo406b()) {
            lazySet(C0193b.DISPOSED);
            try {
                this.f399b.mo381a(th);
            } catch (Throwable th2) {
                C0176b.m498b(th2);
                C0254a.m674a((Throwable) new C0171a(th, th2));
            }
        }
    }

    /* renamed from: s_ */
    public void mo378s_() {
        if (!mo406b()) {
            lazySet(C0193b.DISPOSED);
            try {
                this.f400c.mo379a();
            } catch (Throwable th) {
                C0176b.m498b(th);
                C0254a.m674a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo349a() {
        C0193b.m519a(this);
    }

    /* renamed from: b */
    public boolean mo406b() {
        return get() == C0193b.DISPOSED;
    }
}
