package p000a.p013b.p020e.p025e.p026a;

import java.util.concurrent.Callable;
import p000a.p013b.C0164b;
import p000a.p013b.C0181d;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p020e.p022b.C0209b;
import p000a.p013b.p020e.p024d.C0216b;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.e.a.b */
/* compiled from: ObservableFromCallable */
public final class C0219b<T> extends C0164b<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f403a;

    public C0219b(Callable<? extends T> callable) {
        this.f403a = callable;
    }

    /* renamed from: b */
    public void mo357b(C0181d<? super T> dVar) {
        C0216b bVar = new C0216b(dVar);
        dVar.mo375a((C0166b) bVar);
        if (!bVar.mo405e()) {
            try {
                bVar.mo404b(C0209b.m547a(this.f403a.call(), "Callable returned null"));
            } catch (Throwable th) {
                C0176b.m498b(th);
                if (!bVar.mo405e()) {
                    dVar.mo376a(th);
                } else {
                    C0254a.m674a(th);
                }
            }
        }
    }

    public T call() {
        return C0209b.m547a(this.f403a.call(), "The callable returned a null value");
    }
}
