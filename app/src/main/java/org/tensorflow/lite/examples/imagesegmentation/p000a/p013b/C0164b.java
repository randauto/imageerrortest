package p000a.p013b;

import java.util.concurrent.Callable;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p019d.C0182a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p020e.p022b.C0196a;
import p000a.p013b.p020e.p022b.C0209b;
import p000a.p013b.p020e.p024d.C0217c;
import p000a.p013b.p020e.p025e.p026a.C0219b;
import p000a.p013b.p020e.p025e.p026a.C0220c;
import p000a.p013b.p020e.p025e.p026a.C0222d;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.b */
/* compiled from: Observable */
public abstract class C0164b<T> implements C0170c<T> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo357b(C0181d<? super T> dVar);

    /* renamed from: a */
    public static int m465a() {
        return C0156a.m452a();
    }

    /* renamed from: a */
    public static <T> C0164b<T> m466a(Callable<? extends T> callable) {
        C0209b.m547a(callable, "supplier is null");
        return C0254a.m666a((C0164b<T>) new C0219b<T>(callable));
    }

    /* renamed from: a */
    public final C0164b<T> mo353a(C0189e eVar) {
        return mo354a(eVar, false, m465a());
    }

    /* renamed from: a */
    public final C0164b<T> mo354a(C0189e eVar, boolean z, int i) {
        C0209b.m547a(eVar, "scheduler is null");
        C0209b.m545a(i, "bufferSize");
        return C0254a.m666a((C0164b<T>) new C0220c<T>(this, eVar, z, i));
    }

    /* renamed from: a */
    public final C0166b mo351a(C0185d<? super T> dVar) {
        return mo352a(dVar, C0196a.f388f, C0196a.f385c, C0196a.m534a());
    }

    /* renamed from: a */
    public final C0166b mo352a(C0185d<? super T> dVar, C0185d<? super Throwable> dVar2, C0182a aVar, C0185d<? super C0166b> dVar3) {
        C0209b.m547a(dVar, "onNext is null");
        C0209b.m547a(dVar2, "onError is null");
        C0209b.m547a(aVar, "onComplete is null");
        C0209b.m547a(dVar3, "onSubscribe is null");
        C0217c cVar = new C0217c(dVar, dVar2, aVar, dVar3);
        mo355a((C0181d<? super T>) cVar);
        return cVar;
    }

    /* renamed from: a */
    public final void mo355a(C0181d<? super T> dVar) {
        C0209b.m547a(dVar, "observer is null");
        try {
            C0181d a = C0254a.m667a(this, dVar);
            C0209b.m547a(a, "Plugin returned null Observer");
            mo357b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C0176b.m498b(th);
            C0254a.m674a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final C0164b<T> mo356b(C0189e eVar) {
        C0209b.m547a(eVar, "scheduler is null");
        return C0254a.m666a((C0164b<T>) new C0222d<T>(this, eVar));
    }
}
