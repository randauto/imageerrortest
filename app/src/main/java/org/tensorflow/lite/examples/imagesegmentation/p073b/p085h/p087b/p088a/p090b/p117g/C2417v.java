package p073b.p085h.p087b.p088a.p090b.p117g;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p073b.p085h.p087b.p088a.p090b.p117g.C2380h.C2382a;

/* renamed from: b.h.b.a.b.g.v */
/* compiled from: SmallSortedMap */
class C2417v<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f7349a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C2422b> f7350b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<K, V> f7351c;

    /* renamed from: d */
    private boolean f7352d;

    /* renamed from: e */
    private volatile C2424d f7353e;

    /* renamed from: b.h.b.a.b.g.v$a */
    /* compiled from: SmallSortedMap */
    private static class C2419a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator<Object> f7354a = new Iterator<Object>() {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        /* renamed from: b */
        private static final Iterable<Object> f7355b = new Iterable<Object>() {
            public Iterator<Object> iterator() {
                return C2419a.f7354a;
            }
        };

        /* renamed from: a */
        static <T> Iterable<T> m12094a() {
            return f7355b;
        }
    }

    /* renamed from: b.h.b.a.b.g.v$b */
    /* compiled from: SmallSortedMap */
    private class C2422b implements Comparable<C2422b>, Entry<K, V> {

        /* renamed from: b */
        private final K f7357b;

        /* renamed from: c */
        private V f7358c;

        C2422b(C2417v vVar, Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        C2422b(K k, V v) {
            this.f7357b = k;
            this.f7358c = v;
        }

        /* renamed from: a */
        public K getKey() {
            return this.f7357b;
        }

        public V getValue() {
            return this.f7358c;
        }

        /* renamed from: a */
        public int compareTo(C2422b bVar) {
            return getKey().compareTo(bVar.getKey());
        }

        public V setValue(V v) {
            C2417v.this.m12084e();
            V v2 = this.f7358c;
            this.f7358c = v;
            return v2;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!m12096a(this.f7357b, entry.getKey()) || !m12096a(this.f7358c, entry.getValue())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f7357b == null ? 0 : this.f7357b.hashCode();
            if (this.f7358c != null) {
                i = this.f7358c.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            String valueOf = String.valueOf(String.valueOf(this.f7357b));
            String valueOf2 = String.valueOf(String.valueOf(this.f7358c));
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }

        /* renamed from: a */
        private boolean m12096a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    /* renamed from: b.h.b.a.b.g.v$c */
    /* compiled from: SmallSortedMap */
    private class C2423c implements Iterator<Entry<K, V>> {

        /* renamed from: b */
        private int f7360b;

        /* renamed from: c */
        private boolean f7361c;

        /* renamed from: d */
        private Iterator<Entry<K, V>> f7362d;

        private C2423c() {
            this.f7360b = -1;
        }

        public boolean hasNext() {
            return this.f7360b + 1 < C2417v.this.f7350b.size() || m12099b().hasNext();
        }

        /* renamed from: a */
        public Entry<K, V> next() {
            this.f7361c = true;
            int i = this.f7360b + 1;
            this.f7360b = i;
            if (i < C2417v.this.f7350b.size()) {
                return (Entry) C2417v.this.f7350b.get(this.f7360b);
            }
            return (Entry) m12099b().next();
        }

        public void remove() {
            if (this.f7361c) {
                this.f7361c = false;
                C2417v.this.m12084e();
                if (this.f7360b < C2417v.this.f7350b.size()) {
                    C2417v vVar = C2417v.this;
                    int i = this.f7360b;
                    this.f7360b = i - 1;
                    vVar.m12082c(i);
                    return;
                }
                m12099b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* renamed from: b */
        private Iterator<Entry<K, V>> m12099b() {
            if (this.f7362d == null) {
                this.f7362d = C2417v.this.f7351c.entrySet().iterator();
            }
            return this.f7362d;
        }
    }

    /* renamed from: b.h.b.a.b.g.v$d */
    /* compiled from: SmallSortedMap */
    private class C2424d extends AbstractSet<Entry<K, V>> {
        private C2424d() {
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C2423c();
        }

        public int size() {
            return C2417v.this.size();
        }

        public boolean contains(Object obj) {
            Entry entry = (Entry) obj;
            Object obj2 = C2417v.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        /* renamed from: a */
        public boolean add(Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C2417v.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public boolean remove(Object obj) {
            Entry entry = (Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C2417v.this.remove(entry.getKey());
            return true;
        }

        public void clear() {
            C2417v.this.clear();
        }
    }

    /* renamed from: a */
    static <FieldDescriptorType extends C2382a<FieldDescriptorType>> C2417v<FieldDescriptorType, Object> m12078a(int i) {
        return new C2417v<FieldDescriptorType, Object>(i) {
            public /* synthetic */ Object put(Object obj, Object obj2) {
                return C2417v.super.put((C2382a) obj, obj2);
            }

            /* renamed from: a */
            public void mo9277a() {
                if (!mo9279b()) {
                    for (int i = 0; i < mo9280c(); i++) {
                        Entry b = mo9278b(i);
                        if (((C2382a) b.getKey()).mo9194d()) {
                            b.setValue(Collections.unmodifiableList((List) b.getValue()));
                        }
                    }
                    for (Entry entry : mo9283d()) {
                        if (((C2382a) entry.getKey()).mo9194d()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                C2417v.super.mo9277a();
            }
        };
    }

    private C2417v(int i) {
        this.f7349a = i;
        this.f7350b = Collections.emptyList();
        this.f7351c = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo9277a() {
        if (!this.f7352d) {
            this.f7351c = this.f7351c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7351c);
            this.f7352d = true;
        }
    }

    /* renamed from: b */
    public boolean mo9279b() {
        return this.f7352d;
    }

    /* renamed from: c */
    public int mo9280c() {
        return this.f7350b.size();
    }

    /* renamed from: b */
    public Entry<K, V> mo9278b(int i) {
        return (Entry) this.f7350b.get(i);
    }

    /* renamed from: d */
    public Iterable<Entry<K, V>> mo9283d() {
        return this.f7351c.isEmpty() ? C2419a.m12094a() : this.f7351c.entrySet();
    }

    public int size() {
        return this.f7350b.size() + this.f7351c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m12077a((K) comparable) >= 0 || this.f7351c.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m12077a((K) comparable);
        if (a >= 0) {
            return ((C2422b) this.f7350b.get(a)).getValue();
        }
        return this.f7351c.get(comparable);
    }

    /* renamed from: a */
    public V put(K k, V v) {
        m12084e();
        int a = m12077a(k);
        if (a >= 0) {
            return ((C2422b) this.f7350b.get(a)).setValue(v);
        }
        m12086g();
        int i = -(a + 1);
        if (i >= this.f7349a) {
            return m12085f().put(k, v);
        }
        if (this.f7350b.size() == this.f7349a) {
            C2422b bVar = (C2422b) this.f7350b.remove(this.f7349a - 1);
            m12085f().put(bVar.getKey(), bVar.getValue());
        }
        this.f7350b.add(i, new C2422b(k, v));
        return null;
    }

    public void clear() {
        m12084e();
        if (!this.f7350b.isEmpty()) {
            this.f7350b.clear();
        }
        if (!this.f7351c.isEmpty()) {
            this.f7351c.clear();
        }
    }

    public V remove(Object obj) {
        m12084e();
        Comparable comparable = (Comparable) obj;
        int a = m12077a((K) comparable);
        if (a >= 0) {
            return m12082c(a);
        }
        if (this.f7351c.isEmpty()) {
            return null;
        }
        return this.f7351c.remove(comparable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public V m12082c(int i) {
        m12084e();
        V value = ((C2422b) this.f7350b.remove(i)).getValue();
        if (!this.f7351c.isEmpty()) {
            Iterator it = m12085f().entrySet().iterator();
            this.f7350b.add(new C2422b(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    private int m12077a(K k) {
        int size = this.f7350b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(((C2422b) this.f7350b.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(((C2422b) this.f7350b.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f7353e == null) {
            this.f7353e = new C2424d<>();
        }
        return this.f7353e;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m12084e() {
        if (this.f7352d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private SortedMap<K, V> m12085f() {
        m12084e();
        if (this.f7351c.isEmpty() && !(this.f7351c instanceof TreeMap)) {
            this.f7351c = new TreeMap();
        }
        return (SortedMap) this.f7351c;
    }

    /* renamed from: g */
    private void m12086g() {
        m12084e();
        if (this.f7350b.isEmpty() && !(this.f7350b instanceof ArrayList)) {
            this.f7350b = new ArrayList(this.f7349a);
        }
    }
}
