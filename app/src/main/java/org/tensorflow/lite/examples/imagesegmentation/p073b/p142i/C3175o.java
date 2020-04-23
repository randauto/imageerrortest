package p073b.p142i;

import java.util.Iterator;
import p073b.C3218m;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo10386c = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"})
/* renamed from: b.i.o */
/* compiled from: Sequences.kt */
public final class C3175o<T, R> implements C3160h<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3160h<T> f8587a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1450b<T, R> f8588b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, mo10386c = {"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    /* renamed from: b.i.o$a */
    /* compiled from: Sequences.kt */
    public static final class C3176a implements C1474a, Iterator<R> {

        /* renamed from: a */
        final /* synthetic */ C3175o f8589a;

        /* renamed from: b */
        private final Iterator<T> f8590b;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C3176a(C3175o oVar) {
            this.f8589a = oVar;
            this.f8590b = oVar.f8587a.mo6822a();
        }

        public R next() {
            return this.f8589a.f8588b.mo6756a(this.f8590b.next());
        }

        public boolean hasNext() {
            return this.f8590b.hasNext();
        }
    }

    public C3175o(C3160h<? extends T> hVar, C1450b<? super T, ? extends R> bVar) {
        C1489j.m6972b(hVar, "sequence");
        C1489j.m6972b(bVar, "transformer");
        this.f8587a = hVar;
        this.f8588b = bVar;
    }

    /* renamed from: a */
    public Iterator<R> mo6822a() {
        return new C3176a<>(this);
    }

    /* renamed from: a */
    public final <E> C3160h<E> mo10354a(C1450b<? super R, ? extends Iterator<? extends E>> bVar) {
        C1489j.m6972b(bVar, "iterator");
        return new C3156f<>(this.f8587a, this.f8588b, bVar);
    }
}
