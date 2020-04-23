package p073b.p142i;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p073b.C3218m;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"})
/* renamed from: b.i.e */
/* compiled from: Sequences.kt */
public final class C3154e<T> implements C3160h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3160h<T> f8556a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f8557b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1450b<T, Boolean> f8558c;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo10386c = {"kotlin/sequences/FilteringSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
    /* renamed from: b.i.e$a */
    /* compiled from: Sequences.kt */
    public static final class C3155a implements C1474a, Iterator<T> {

        /* renamed from: a */
        final /* synthetic */ C3154e f8559a;

        /* renamed from: b */
        private final Iterator<T> f8560b;

        /* renamed from: c */
        private int f8561c = -1;

        /* renamed from: d */
        private T f8562d;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C3155a(C3154e eVar) {
            this.f8559a = eVar;
            this.f8560b = eVar.f8556a.mo6822a();
        }

        /* renamed from: a */
        private final void m14653a() {
            while (this.f8560b.hasNext()) {
                T next = this.f8560b.next();
                if (((Boolean) this.f8559a.f8558c.mo6756a(next)).booleanValue() == this.f8559a.f8557b) {
                    this.f8562d = next;
                    this.f8561c = 1;
                    return;
                }
            }
            this.f8561c = 0;
        }

        public T next() {
            if (this.f8561c == -1) {
                m14653a();
            }
            if (this.f8561c != 0) {
                T t = this.f8562d;
                this.f8562d = null;
                this.f8561c = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f8561c == -1) {
                m14653a();
            }
            return this.f8561c == 1;
        }
    }

    public C3154e(C3160h<? extends T> hVar, boolean z, C1450b<? super T, Boolean> bVar) {
        C1489j.m6972b(hVar, "sequence");
        C1489j.m6972b(bVar, "predicate");
        this.f8556a = hVar;
        this.f8557b = z;
        this.f8558c = bVar;
    }

    /* renamed from: a */
    public Iterator<T> mo6822a() {
        return new C3155a<>(this);
    }
}
