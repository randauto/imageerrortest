package p073b.p085h.p087b.p088a.p090b.p117g;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: b.h.b.a.b.g.x */
/* compiled from: UnmodifiableLazyStringList */
public class C2426x extends AbstractList<String> implements C2402o, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2402o f7365a;

    /* renamed from: b */
    public C2402o mo9243b() {
        return this;
    }

    public C2426x(C2402o oVar) {
        this.f7365a = oVar;
    }

    /* renamed from: a */
    public String get(int i) {
        return (String) this.f7365a.get(i);
    }

    public int size() {
        return this.f7365a.size();
    }

    /* renamed from: c */
    public C2371d mo9246c(int i) {
        return this.f7365a.mo9246c(i);
    }

    /* renamed from: a */
    public void mo9239a(C2371d dVar) {
        throw new UnsupportedOperationException();
    }

    public ListIterator<String> listIterator(final int i) {
        return new ListIterator<String>() {

            /* renamed from: a */
            ListIterator<String> f7366a = C2426x.this.f7365a.listIterator(i);

            public boolean hasNext() {
                return this.f7366a.hasNext();
            }

            /* renamed from: a */
            public String next() {
                return (String) this.f7366a.next();
            }

            public boolean hasPrevious() {
                return this.f7366a.hasPrevious();
            }

            /* renamed from: b */
            public String previous() {
                return (String) this.f7366a.previous();
            }

            public int nextIndex() {
                return this.f7366a.nextIndex();
            }

            public int previousIndex() {
                return this.f7366a.previousIndex();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

            /* renamed from: a */
            public void set(String str) {
                throw new UnsupportedOperationException();
            }

            /* renamed from: b */
            public void add(String str) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {

            /* renamed from: a */
            Iterator<String> f7369a = C2426x.this.f7365a.iterator();

            public boolean hasNext() {
                return this.f7369a.hasNext();
            }

            /* renamed from: a */
            public String next() {
                return (String) this.f7369a.next();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    /* renamed from: a */
    public List<?> mo9238a() {
        return this.f7365a.mo9238a();
    }
}
