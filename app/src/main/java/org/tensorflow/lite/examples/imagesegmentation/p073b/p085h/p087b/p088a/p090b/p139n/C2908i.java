package p073b.p085h.p087b.p088a.p090b.p139n;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: b.h.b.a.b.n.i */
/* compiled from: SmartList */
public class C2908i<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a */
    private int f8241a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Object f8242b;

    /* renamed from: b.h.b.a.b.n.i$a */
    /* compiled from: SmartList */
    private static class C2910a<T> implements Iterator<T> {

        /* renamed from: a */
        private static final C2910a f8243a = new C2910a();

        public boolean hasNext() {
            return false;
        }

        private C2910a() {
        }

        /* renamed from: a */
        public static <T> C2910a<T> m14002a() {
            return f8243a;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b.h.b.a.b.n.i$b */
    /* compiled from: SmartList */
    private class C2911b extends C2912c<E> {

        /* renamed from: b */
        private final int f8245b;

        public C2911b() {
            super();
            this.f8245b = C2908i.this.modCount;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo10014a() {
            return C2908i.this.f8242b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo10015b() {
            if (C2908i.this.modCount != this.f8245b) {
                StringBuilder sb = new StringBuilder();
                sb.append("ModCount: ");
                sb.append(C2908i.this.modCount);
                sb.append("; expected: ");
                sb.append(this.f8245b);
                throw new ConcurrentModificationException(sb.toString());
            }
        }

        public void remove() {
            mo10015b();
            C2908i.this.clear();
        }
    }

    /* renamed from: b.h.b.a.b.n.i$c */
    /* compiled from: SmartList */
    private static abstract class C2912c<T> implements Iterator<T> {

        /* renamed from: a */
        private boolean f8246a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo10014a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo10015b();

        private C2912c() {
        }

        public final boolean hasNext() {
            return !this.f8246a;
        }

        public final T next() {
            if (!this.f8246a) {
                this.f8246a = true;
                mo10015b();
                return mo10014a();
            }
            throw new NoSuchElementException();
        }
    }

    public E get(int i) {
        if (i < 0 || i >= this.f8241a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.f8241a);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (this.f8241a == 1) {
            return this.f8242b;
        } else {
            return ((Object[]) this.f8242b)[i];
        }
    }

    public boolean add(E e) {
        if (this.f8241a == 0) {
            this.f8242b = e;
        } else if (this.f8241a == 1) {
            this.f8242b = new Object[]{this.f8242b, e};
        } else {
            Object[] objArr = (Object[]) this.f8242b;
            int length = objArr.length;
            if (this.f8241a >= length) {
                int i = ((length * 3) / 2) + 1;
                int i2 = this.f8241a + 1;
                if (i >= i2) {
                    i2 = i;
                }
                Object[] objArr2 = new Object[i2];
                this.f8242b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f8241a] = e;
        }
        this.f8241a++;
        this.modCount++;
        return true;
    }

    public void add(int i, E e) {
        if (i < 0 || i > this.f8241a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.f8241a);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (this.f8241a == 0) {
            this.f8242b = e;
        } else if (this.f8241a == 1 && i == 0) {
            this.f8242b = new Object[]{e, this.f8242b};
        } else {
            Object[] objArr = new Object[(this.f8241a + 1)];
            if (this.f8241a == 1) {
                objArr[0] = this.f8242b;
            } else {
                Object[] objArr2 = (Object[]) this.f8242b;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f8241a - i);
            }
            objArr[i] = e;
            this.f8242b = objArr;
        }
        this.f8241a++;
        this.modCount++;
    }

    public int size() {
        return this.f8241a;
    }

    public void clear() {
        this.f8242b = null;
        this.f8241a = 0;
        this.modCount++;
    }

    public E set(int i, E e) {
        if (i < 0 || i >= this.f8241a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.f8241a);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (this.f8241a == 1) {
            E e2 = this.f8242b;
            this.f8242b = e;
            return e2;
        } else {
            Object[] objArr = (Object[]) this.f8242b;
            Object obj = objArr[i];
            objArr[i] = e;
            return obj;
        }
    }

    public E remove(int i) {
        E e;
        if (i < 0 || i >= this.f8241a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(this.f8241a);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (this.f8241a == 1) {
            e = this.f8242b;
            this.f8242b = null;
        } else {
            E[] eArr = (Object[]) this.f8242b;
            E e2 = eArr[i];
            if (this.f8241a == 2) {
                this.f8242b = eArr[1 - i];
            } else {
                int i2 = (this.f8241a - i) - 1;
                if (i2 > 0) {
                    System.arraycopy(eArr, i + 1, eArr, i, i2);
                }
                eArr[this.f8241a - 1] = null;
            }
            e = e2;
        }
        this.f8241a--;
        this.modCount++;
        return e;
    }

    public Iterator<E> iterator() {
        if (this.f8241a == 0) {
            return C2910a.m14002a();
        }
        if (this.f8241a == 1) {
            return new C2911b();
        }
        return super.iterator();
    }

    public <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        if (this.f8241a == 1) {
            if (length != 0) {
                tArr[0] = this.f8242b;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                tArr2[0] = this.f8242b;
                return tArr2;
            }
        } else if (length < this.f8241a) {
            return Arrays.copyOf((Object[]) this.f8242b, this.f8241a, tArr.getClass());
        } else {
            if (this.f8241a != 0) {
                System.arraycopy(this.f8242b, 0, tArr, 0, this.f8241a);
            }
        }
        if (length > this.f8241a) {
            tArr[this.f8241a] = null;
        }
        return tArr;
    }
}
