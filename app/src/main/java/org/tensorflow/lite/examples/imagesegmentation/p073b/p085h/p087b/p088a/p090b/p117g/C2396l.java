package p073b.p085h.p087b.p088a.p090b.p117g;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: b.h.b.a.b.g.l */
/* compiled from: LazyField */
public class C2396l extends C2400m {

    /* renamed from: b */
    private final C2406q f7314b;

    /* renamed from: b.h.b.a.b.g.l$a */
    /* compiled from: LazyField */
    static class C2398a<K> implements Entry<K, Object> {

        /* renamed from: a */
        private Entry<K, C2396l> f7315a;

        private C2398a(Entry<K, C2396l> entry) {
            this.f7315a = entry;
        }

        public K getKey() {
            return this.f7315a.getKey();
        }

        public Object getValue() {
            C2396l lVar = (C2396l) this.f7315a.getValue();
            if (lVar == null) {
                return null;
            }
            return lVar.mo9221a();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C2406q) {
                return ((C2396l) this.f7315a.getValue()).mo9234b((C2406q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: b.h.b.a.b.g.l$b */
    /* compiled from: LazyField */
    static class C2399b<K> implements Iterator<Entry<K, Object>> {

        /* renamed from: a */
        private Iterator<Entry<K, Object>> f7316a;

        public C2399b(Iterator<Entry<K, Object>> it) {
            this.f7316a = it;
        }

        public boolean hasNext() {
            return this.f7316a.hasNext();
        }

        /* renamed from: a */
        public Entry<K, Object> next() {
            Entry<K, Object> entry = (Entry) this.f7316a.next();
            return entry.getValue() instanceof C2396l ? new C2398a(entry) : entry;
        }

        public void remove() {
            this.f7316a.remove();
        }
    }

    /* renamed from: a */
    public C2406q mo9221a() {
        return mo9232a(this.f7314b);
    }

    public int hashCode() {
        return mo9221a().hashCode();
    }

    public boolean equals(Object obj) {
        return mo9221a().equals(obj);
    }

    public String toString() {
        return mo9221a().toString();
    }
}
