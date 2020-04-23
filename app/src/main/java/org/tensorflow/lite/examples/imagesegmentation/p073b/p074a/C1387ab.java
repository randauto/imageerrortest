package p073b.p074a;

import java.util.Iterator;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "(Ljava/util/Iterator;)V", "index", "", "hasNext", "", "next", "kotlin-stdlib"})
/* renamed from: b.a.ab */
/* compiled from: Iterators.kt */
public final class C1387ab<T> implements C1474a, Iterator<C1433z<? extends T>> {

    /* renamed from: a */
    private int f4821a;

    /* renamed from: b */
    private final Iterator<T> f4822b;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C1387ab(Iterator<? extends T> it) {
        C1489j.m6972b(it, "iterator");
        this.f4822b = it;
    }

    public final boolean hasNext() {
        return this.f4822b.hasNext();
    }

    /* renamed from: a */
    public final C1433z<T> next() {
        int i = this.f4821a;
        this.f4821a = i + 1;
        return new C1433z<>(i, this.f4822b.next());
    }
}
