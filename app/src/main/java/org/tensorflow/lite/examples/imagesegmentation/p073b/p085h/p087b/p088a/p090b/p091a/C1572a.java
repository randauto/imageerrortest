package p073b.p085h.p087b.p088a.p090b.p091a;

import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;

/* renamed from: b.h.b.a.b.a.a */
/* compiled from: BuiltInsInitializer.kt */
public final class C1572a<T extends C1627g> {

    /* renamed from: a */
    private volatile T f4952a;

    /* renamed from: b */
    private volatile boolean f4953b;

    /* renamed from: c */
    private Throwable f4954c;

    /* renamed from: d */
    private final C1449a<T> f4955d;

    public C1572a(C1449a<? extends T> aVar) {
        C1489j.m6972b(aVar, "constructor");
        this.f4955d = aVar;
    }

    /* renamed from: b */
    private final synchronized void m7168b() {
        if (this.f4952a == null) {
            if (this.f4954c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Built-in library initialization failed previously: ");
                Throwable th = this.f4954c;
                if (th == null) {
                    C1489j.m6968a();
                }
                sb.append(th);
                throw new IllegalStateException(sb.toString(), this.f4954c);
            } else if (!this.f4953b) {
                this.f4953b = true;
                try {
                    this.f4952a = (C1627g) this.f4955d.mo6823a();
                    this.f4953b = false;
                } catch (Throwable th2) {
                    this.f4953b = false;
                    throw th2;
                }
            } else {
                throw new IllegalStateException("Built-in library initialization loop");
            }
        }
    }

    /* renamed from: a */
    public final T mo7051a() {
        T t;
        if (this.f4953b) {
            synchronized (this) {
                t = this.f4952a;
                if (t == null) {
                    throw new AssertionError("Built-ins are not initialized (note: We are under the same lock as initializing and instance)");
                }
            }
            return t;
        }
        if (this.f4952a == null) {
            m7168b();
        }
        T t2 = this.f4952a;
        if (t2 == null) {
            C1489j.m6968a();
        }
        return t2;
    }
}
