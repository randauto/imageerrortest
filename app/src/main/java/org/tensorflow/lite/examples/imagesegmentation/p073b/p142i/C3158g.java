package p073b.p142i;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
/* renamed from: b.i.g */
/* compiled from: Sequences.kt */
final class C3158g<T> implements C3160h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1449a<T> f8569a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1450b<T, T> f8570b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\t\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, mo10386c = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
    /* renamed from: b.i.g$a */
    /* compiled from: Sequences.kt */
    public static final class C3159a implements C1474a, Iterator<T> {

        /* renamed from: a */
        final /* synthetic */ C3158g f8571a;

        /* renamed from: b */
        private T f8572b;

        /* renamed from: c */
        private int f8573c = -2;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C3159a(C3158g gVar) {
            this.f8571a = gVar;
        }

        /* renamed from: a */
        private final void m14662a() {
            T t;
            if (this.f8573c == -2) {
                t = this.f8571a.f8569a.mo6823a();
            } else {
                C1450b b = this.f8571a.f8570b;
                T t2 = this.f8572b;
                if (t2 == null) {
                    C1489j.m6968a();
                }
                t = b.mo6756a(t2);
            }
            this.f8572b = t;
            this.f8573c = this.f8572b == null ? 0 : 1;
        }

        public T next() {
            if (this.f8573c < 0) {
                m14662a();
            }
            if (this.f8573c != 0) {
                T t = this.f8572b;
                if (t != null) {
                    this.f8573c = -1;
                    return t;
                }
                throw new C3227u("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f8573c < 0) {
                m14662a();
            }
            return this.f8573c == 1;
        }
    }

    public C3158g(C1449a<? extends T> aVar, C1450b<? super T, ? extends T> bVar) {
        C1489j.m6972b(aVar, "getInitialValue");
        C1489j.m6972b(bVar, "getNextValue");
        this.f8569a = aVar;
        this.f8570b = bVar;
    }

    /* renamed from: a */
    public Iterator<T> mo6822a() {
        return new C3159a<>(this);
    }
}
