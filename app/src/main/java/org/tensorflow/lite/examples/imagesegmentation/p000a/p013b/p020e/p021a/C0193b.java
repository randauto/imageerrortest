package p000a.p013b.p020e.p021a;

import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p018c.C0179e;
import p000a.p013b.p020e.p022b.C0209b;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.a.b */
/* compiled from: DisposableHelper */
public enum C0193b implements C0166b {
    DISPOSED;

    /* renamed from: a */
    public void mo349a() {
    }

    /* renamed from: a */
    public static boolean m520a(AtomicReference<C0166b> atomicReference, C0166b bVar) {
        C0209b.m547a(bVar, "d is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.mo349a();
        if (atomicReference.get() != DISPOSED) {
            m521b();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m519a(AtomicReference<C0166b> atomicReference) {
        C0166b bVar = (C0166b) atomicReference.get();
        C0193b bVar2 = DISPOSED;
        if (bVar != bVar2) {
            C0166b bVar3 = (C0166b) atomicReference.getAndSet(bVar2);
            if (bVar3 != bVar2) {
                if (bVar3 != null) {
                    bVar3.mo349a();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m518a(C0166b bVar, C0166b bVar2) {
        if (bVar2 == null) {
            C0254a.m674a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.mo349a();
            m521b();
            return false;
        }
    }

    /* renamed from: b */
    public static void m521b() {
        C0254a.m674a((Throwable) new C0179e("Disposable already set!"));
    }
}
