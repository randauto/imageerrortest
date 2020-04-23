package p073b.p074a;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p073b.C3218m;
import p073b.p079e.p081b.C1485f;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, mo10386c = {"Lkotlin/collections/EmptySet;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "hashCode", "isEmpty", "iterator", "", "readResolve", "toString", "", "kotlin-stdlib"})
/* renamed from: b.a.y */
/* compiled from: Sets.kt */
public final class C1432y implements C1474a, Serializable, Set {

    /* renamed from: a */
    public static final C1432y f4842a = new C1432y();
    private static final long serialVersionUID = 3406603774387020532L;

    /* renamed from: a */
    public int mo6892a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo6893a(Void voidR) {
        C1489j.m6972b(voidR, "element");
        return false;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C1485f.m6960a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C1485f.m6961a(this, tArr);
    }

    public String toString() {
        return "[]";
    }

    private C1432y() {
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo6893a((Void) obj);
        }
        return false;
    }

    public final int size() {
        return mo6892a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public boolean containsAll(Collection collection) {
        C1489j.m6972b(collection, "elements");
        return collection.isEmpty();
    }

    public Iterator iterator() {
        return C1429v.f4839a;
    }

    private final Object readResolve() {
        return f4842a;
    }
}
