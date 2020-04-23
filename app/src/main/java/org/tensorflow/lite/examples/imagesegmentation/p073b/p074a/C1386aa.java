package p073b.p074a;

import java.util.Iterator;
import p073b.C3218m;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo10386c = {"Lkotlin/collections/IndexingIterable;", "T", "", "Lkotlin/collections/IndexedValue;", "iteratorFactory", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "iterator", "kotlin-stdlib"})
/* renamed from: b.a.aa */
/* compiled from: Iterables.kt */
public final class C1386aa<T> implements C1474a, Iterable<C1433z<? extends T>> {

    /* renamed from: a */
    private final C1449a<Iterator<T>> f4820a;

    public C1386aa(C1449a<? extends Iterator<? extends T>> aVar) {
        C1489j.m6972b(aVar, "iteratorFactory");
        this.f4820a = aVar;
    }

    public Iterator<C1433z<T>> iterator() {
        return new C1387ab<>((Iterator) this.f4820a.mo6823a());
    }
}
