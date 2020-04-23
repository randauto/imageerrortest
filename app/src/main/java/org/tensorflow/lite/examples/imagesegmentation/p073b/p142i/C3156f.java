package p073b.p142i;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p073b.C3218m;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"})
/* renamed from: b.i.f */
/* compiled from: Sequences.kt */
public final class C3156f<T, R, E> implements C3160h<E> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3160h<T> f8563a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1450b<T, R> f8564b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1450b<R, Iterator<E>> f8565c;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\t\u001a\u00020\nH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, mo10386c = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    /* renamed from: b.i.f$a */
    /* compiled from: Sequences.kt */
    public static final class C3157a implements C1474a, Iterator<E> {

        /* renamed from: a */
        final /* synthetic */ C3156f f8566a;

        /* renamed from: b */
        private final Iterator<T> f8567b;

        /* renamed from: c */
        private Iterator<? extends E> f8568c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C3157a(C3156f fVar) {
            this.f8566a = fVar;
            this.f8567b = fVar.f8563a.mo6822a();
        }

        public E next() {
            if (m14658a()) {
                Iterator<? extends E> it = this.f8568c;
                if (it == null) {
                    C1489j.m6968a();
                }
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return m14658a();
        }

        /* renamed from: a */
        private final boolean m14658a() {
            Iterator<? extends E> it = this.f8568c;
            if (it != null && !it.hasNext()) {
                this.f8568c = null;
            }
            while (this.f8568c == null) {
                if (!this.f8567b.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) this.f8566a.f8565c.mo6756a(this.f8566a.f8564b.mo6756a(this.f8567b.next()));
                if (it2.hasNext()) {
                    this.f8568c = it2;
                    return true;
                }
            }
            return true;
        }
    }

    public C3156f(C3160h<? extends T> hVar, C1450b<? super T, ? extends R> bVar, C1450b<? super R, ? extends Iterator<? extends E>> bVar2) {
        C1489j.m6972b(hVar, "sequence");
        C1489j.m6972b(bVar, "transformer");
        C1489j.m6972b(bVar2, "iterator");
        this.f8563a = hVar;
        this.f8564b = bVar;
        this.f8565c = bVar2;
    }

    /* renamed from: a */
    public Iterator<E> mo6822a() {
        return new C3157a<>(this);
    }
}
