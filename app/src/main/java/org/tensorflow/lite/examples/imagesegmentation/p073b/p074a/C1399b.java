package p073b.p074a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, mo10386c = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"})
/* renamed from: b.a.b */
/* compiled from: AbstractList.kt */
public abstract class C1399b<E> extends C1384a<E> implements C1474a, List<E> {

    /* renamed from: a */
    public static final C1400a f4824a = new C1400a(null);

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\nJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000eJ%\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000¢\u0006\u0002\b\u0016¨\u0006\u0017"}, mo10386c = {"Lkotlin/collections/AbstractList$Companion;", "", "()V", "checkElementIndex", "", "index", "", "size", "checkElementIndex$kotlin_stdlib", "checkPositionIndex", "checkPositionIndex$kotlin_stdlib", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "orderedEquals", "", "c", "", "other", "orderedEquals$kotlin_stdlib", "orderedHashCode", "orderedHashCode$kotlin_stdlib", "kotlin-stdlib"})
    /* renamed from: b.a.b$a */
    /* compiled from: AbstractList.kt */
    public static final class C1400a {
        private C1400a() {
        }

        public /* synthetic */ C1400a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo6787a(int i, int i2) {
            if (i < 0 || i >= i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        /* renamed from: b */
        public final void mo6790b(int i, int i2) {
            if (i < 0 || i > i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        /* renamed from: a */
        public final void mo6788a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sb = new StringBuilder();
                sb.append("fromIndex: ");
                sb.append(i);
                sb.append(", toIndex: ");
                sb.append(i2);
                sb.append(", size: ");
                sb.append(i3);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i > i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fromIndex: ");
                sb2.append(i);
                sb2.append(" > toIndex: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: a */
        public final int mo6786a(Collection<?> collection) {
            C1489j.m6972b(collection, "c");
            int i = 1;
            for (Object next : collection) {
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        /* renamed from: a */
        public final boolean mo6789a(Collection<?> collection, Collection<?> collection2) {
            C1489j.m6972b(collection, "c");
            C1489j.m6972b(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a : collection) {
                if (!C1489j.m6971a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, mo10386c = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "(Lkotlin/collections/AbstractList;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    /* renamed from: b.a.b$b */
    /* compiled from: AbstractList.kt */
    private class C1401b implements C1474a, Iterator<E> {

        /* renamed from: b */
        private int f4826b;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C1401b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo6791a() {
            return this.f4826b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo6792a(int i) {
            this.f4826b = i;
        }

        public boolean hasNext() {
            return this.f4826b < C1399b.this.size();
        }

        public E next() {
            if (hasNext()) {
                C1399b bVar = C1399b.this;
                int i = this.f4826b;
                this.f4826b = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\r\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, mo10386c = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"})
    /* renamed from: b.a.b$c */
    /* compiled from: AbstractList.kt */
    private class C1402c extends C1401b implements C1474a, ListIterator<E> {
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C1402c(int i) {
            super();
            C1399b.f4824a.mo6790b(i, C1399b.this.size());
            mo6792a(i);
        }

        public boolean hasPrevious() {
            return mo6791a() > 0;
        }

        public int nextIndex() {
            return mo6791a();
        }

        public E previous() {
            if (hasPrevious()) {
                C1399b bVar = C1399b.this;
                mo6792a(mo6791a() - 1);
                return bVar.get(mo6791a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo6791a() - 1;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo10386c = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"})
    /* renamed from: b.a.b$d */
    /* compiled from: AbstractList.kt */
    private static final class C1403d<E> extends C1399b<E> implements RandomAccess {

        /* renamed from: b */
        private int f4828b;

        /* renamed from: c */
        private final C1399b<E> f4829c;

        /* renamed from: d */
        private final int f4830d;

        public C1403d(C1399b<? extends E> bVar, int i, int i2) {
            C1489j.m6972b(bVar, "list");
            this.f4829c = bVar;
            this.f4830d = i;
            C1399b.f4824a.mo6788a(this.f4830d, i2, this.f4829c.size());
            this.f4828b = i2 - this.f4830d;
        }

        public E get(int i) {
            C1399b.f4824a.mo6787a(i, this.f4828b);
            return this.f4829c.get(this.f4830d + i);
        }

        /* renamed from: a */
        public int mo6742a() {
            return this.f4828b;
        }
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int i);

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected C1399b() {
    }

    public Iterator<E> iterator() {
        return new C1401b<>();
    }

    public ListIterator<E> listIterator() {
        return new C1402c<>(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new C1402c<>(i);
    }

    public List<E> subList(int i, int i2) {
        return new C1403d<>(this, i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f4824a.mo6789a((Collection<?>) this, (Collection) obj);
    }

    public int hashCode() {
        return f4824a.mo6786a(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C1489j.m6971a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C1489j.m6971a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
}
