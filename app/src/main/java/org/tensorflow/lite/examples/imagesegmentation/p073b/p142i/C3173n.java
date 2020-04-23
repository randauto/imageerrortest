package p073b.p142i;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p073b.C3218m;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo10386c = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
/* renamed from: b.i.n */
/* compiled from: Sequences.kt */
public final class C3173n<T> implements C3160h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3160h<T> f8581a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1450b<T, Boolean> f8582b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo10386c = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
    /* renamed from: b.i.n$a */
    /* compiled from: Sequences.kt */
    public static final class C3174a implements C1474a, Iterator<T> {

        /* renamed from: a */
        final /* synthetic */ C3173n f8583a;

        /* renamed from: b */
        private final Iterator<T> f8584b;

        /* renamed from: c */
        private int f8585c = -1;

        /* renamed from: d */
        private T f8586d;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C3174a(C3173n nVar) {
            this.f8583a = nVar;
            this.f8584b = nVar.f8581a.mo6822a();
        }

        /* renamed from: a */
        private final void m14701a() {
            if (this.f8584b.hasNext()) {
                T next = this.f8584b.next();
                if (((Boolean) this.f8583a.f8582b.mo6756a(next)).booleanValue()) {
                    this.f8585c = 1;
                    this.f8586d = next;
                    return;
                }
            }
            this.f8585c = 0;
        }

        public T next() {
            if (this.f8585c == -1) {
                m14701a();
            }
            if (this.f8585c != 0) {
                T t = this.f8586d;
                this.f8586d = null;
                this.f8585c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f8585c == -1) {
                m14701a();
            }
            return this.f8585c == 1;
        }
    }

    public C3173n(C3160h<? extends T> hVar, C1450b<? super T, Boolean> bVar) {
        C1489j.m6972b(hVar, "sequence");
        C1489j.m6972b(bVar, "predicate");
        this.f8581a = hVar;
        this.f8582b = bVar;
    }

    /* renamed from: a */
    public Iterator<T> mo6822a() {
        return new C3174a<>(this);
    }
}
