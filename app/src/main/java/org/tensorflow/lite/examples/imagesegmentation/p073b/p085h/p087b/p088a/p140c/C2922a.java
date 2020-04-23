package p073b.p085h.p087b.p088a.p140c;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: b.h.b.a.c.a */
/* compiled from: ConsPStack */
final class C2922a<E> implements Iterable<E> {

    /* renamed from: c */
    private static final C2922a<Object> f8258c = new C2922a<>();

    /* renamed from: a */
    final E f8259a;

    /* renamed from: b */
    final C2922a<E> f8260b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f8261d;

    /* renamed from: b.h.b.a.c.a$a */
    /* compiled from: ConsPStack */
    private static class C2923a<E> implements Iterator<E> {

        /* renamed from: a */
        private C2922a<E> f8262a;

        public C2923a(C2922a<E> aVar) {
            this.f8262a = aVar;
        }

        public boolean hasNext() {
            return this.f8262a.f8261d > 0;
        }

        public E next() {
            E e = this.f8262a.f8259a;
            this.f8262a = this.f8262a.f8260b;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static <E> C2922a<E> m14027a() {
        return f8258c;
    }

    private C2922a() {
        this.f8261d = 0;
        this.f8259a = null;
        this.f8260b = null;
    }

    private C2922a(E e, C2922a<E> aVar) {
        this.f8259a = e;
        this.f8260b = aVar;
        this.f8261d = aVar.f8261d + 1;
    }

    /* renamed from: a */
    public E mo10044a(int i) {
        if (i < 0 || i > this.f8261d) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return m14029c(i).next();
        } catch (NoSuchElementException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public Iterator<E> iterator() {
        return m14029c(0);
    }

    /* renamed from: b */
    public int mo10045b() {
        return this.f8261d;
    }

    /* renamed from: c */
    private Iterator<E> m14029c(int i) {
        return new C2923a(m14030d(i));
    }

    /* renamed from: a */
    public C2922a<E> mo10043a(E e) {
        return new C2922a<>(e, this);
    }

    /* renamed from: b */
    private C2922a<E> m14028b(Object obj) {
        if (this.f8261d == 0) {
            return this;
        }
        if (this.f8259a.equals(obj)) {
            return this.f8260b;
        }
        C2922a<E> b = this.f8260b.m14028b(obj);
        if (b == this.f8260b) {
            return this;
        }
        return new C2922a<>(this.f8259a, b);
    }

    /* renamed from: b */
    public C2922a<E> mo10046b(int i) {
        return m14028b(mo10044a(i));
    }

    /* renamed from: d */
    private C2922a<E> m14030d(int i) {
        if (i < 0 || i > this.f8261d) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.f8260b.m14030d(i - 1);
        }
    }
}
