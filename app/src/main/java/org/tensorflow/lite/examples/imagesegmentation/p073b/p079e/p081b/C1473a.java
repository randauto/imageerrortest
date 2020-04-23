package p073b.p079e.p081b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p073b.C3218m;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eR\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo10386c = {"Lkotlin/jvm/internal/ArrayIterator;", "T", "", "array", "", "([Ljava/lang/Object;)V", "getArray", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "index", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
/* renamed from: b.e.b.a */
/* compiled from: ArrayIterator.kt */
final class C1473a<T> implements C1474a, Iterator<T> {

    /* renamed from: a */
    private int f4847a;

    /* renamed from: b */
    private final T[] f4848b;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C1473a(T[] tArr) {
        C1489j.m6972b(tArr, "array");
        this.f4848b = tArr;
    }

    public boolean hasNext() {
        return this.f4847a < this.f4848b.length;
    }

    public T next() {
        try {
            T[] tArr = this.f4848b;
            int i = this.f4847a;
            this.f4847a = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f4847a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
