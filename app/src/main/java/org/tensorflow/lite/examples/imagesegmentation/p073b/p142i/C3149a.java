package p073b.p142i;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0007*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo10386c = {"Lkotlin/sequences/ConstrainedOnceSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "(Lkotlin/sequences/Sequence;)V", "sequenceRef", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "iterator", "", "kotlin-stdlib"})
/* renamed from: b.i.a */
/* compiled from: SequencesJVM.kt */
public final class C3149a<T> implements C3160h<T> {

    /* renamed from: a */
    private final AtomicReference<C3160h<T>> f8549a;

    public C3149a(C3160h<? extends T> hVar) {
        C1489j.m6972b(hVar, "sequence");
        this.f8549a = new AtomicReference<>(hVar);
    }

    /* renamed from: a */
    public Iterator<T> mo6822a() {
        C3160h hVar = (C3160h) this.f8549a.getAndSet(null);
        if (hVar != null) {
            return hVar.mo6822a();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
