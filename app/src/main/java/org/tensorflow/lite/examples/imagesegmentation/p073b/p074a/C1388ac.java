package p073b.p074a;

import java.util.Iterator;
import p073b.C3218m;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0007"}, mo10386c = {"Lkotlin/collections/IntIterator;", "", "", "()V", "next", "()Ljava/lang/Integer;", "nextInt", "kotlin-stdlib"})
/* renamed from: b.a.ac */
/* compiled from: Iterators.kt */
public abstract class C1388ac implements C1474a, Iterator<Integer> {
    /* renamed from: b */
    public abstract int mo6764b();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: a */
    public final Integer next() {
        return Integer.valueOf(mo6764b());
    }
}
