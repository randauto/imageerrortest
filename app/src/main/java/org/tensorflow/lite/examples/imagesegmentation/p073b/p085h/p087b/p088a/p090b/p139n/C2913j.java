package p073b.p085h.p087b.p088a.p090b.p139n;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import p073b.C3227u;
import p073b.p074a.C1395aj;
import p073b.p074a.C1406e;
import p073b.p079e.p081b.C1480b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1506y;
import p073b.p079e.p081b.p082a.C1477d;

/* renamed from: b.h.b.a.b.n.j */
/* compiled from: SmartSet.kt */
public final class C2913j<T> extends AbstractSet<T> {

    /* renamed from: a */
    public static final C2915b f8247a = new C2915b(null);

    /* renamed from: d */
    private static final int f8248d = 5;

    /* renamed from: b */
    private Object f8249b;

    /* renamed from: c */
    private int f8250c;

    /* renamed from: b.h.b.a.b.n.j$a */
    /* compiled from: SmartSet.kt */
    private static final class C2914a<T> implements C1477d, Iterator<T> {

        /* renamed from: a */
        private final Iterator<T> f8251a;

        public C2914a(T[] tArr) {
            C1489j.m6972b(tArr, "array");
            this.f8251a = C1480b.m6945a(tArr);
        }

        public boolean hasNext() {
            return this.f8251a.hasNext();
        }

        public T next() {
            return this.f8251a.next();
        }

        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b.h.b.a.b.n.j$b */
    /* compiled from: SmartSet.kt */
    public static final class C2915b {
        private C2915b() {
        }

        public /* synthetic */ C2915b(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final <T> C2913j<T> mo10030a() {
            return new C2913j<>(null);
        }

        /* renamed from: a */
        public final <T> C2913j<T> mo10031a(Collection<? extends T> collection) {
            C1489j.m6972b(collection, "set");
            C2913j<T> jVar = new C2913j<>(null);
            jVar.addAll(collection);
            return jVar;
        }
    }

    /* renamed from: b.h.b.a.b.n.j$c */
    /* compiled from: SmartSet.kt */
    private static final class C2916c<T> implements C1477d, Iterator<T> {

        /* renamed from: a */
        private boolean f8252a = true;

        /* renamed from: b */
        private final T f8253b;

        public C2916c(T t) {
            this.f8253b = t;
        }

        public T next() {
            if (this.f8252a) {
                this.f8252a = false;
                return this.f8253b;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f8252a;
        }

        /* renamed from: a */
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public static final <T> C2913j<T> m14007b() {
        return f8247a.mo10030a();
    }

    private C2913j() {
    }

    public /* synthetic */ C2913j(C1486g gVar) {
        this();
    }

    public final int size() {
        return mo10019a();
    }

    /* renamed from: a */
    public int mo10019a() {
        return this.f8250c;
    }

    /* renamed from: a */
    public void mo10020a(int i) {
        this.f8250c = i;
    }

    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new C2916c<>(this.f8249b);
        }
        if (size() < f8248d) {
            Object obj = this.f8249b;
            if (obj != null) {
                return new C2914a<>((Object[]) obj);
            }
            throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj2 = this.f8249b;
        if (obj2 != null) {
            return C1506y.m7020a(obj2).iterator();
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
    }

    public boolean add(T t) {
        Object obj;
        if (size() == 0) {
            this.f8249b = t;
        } else if (size() == 1) {
            if (C1489j.m6971a(this.f8249b, (Object) t)) {
                return false;
            }
            this.f8249b = new Object[]{this.f8249b, t};
        } else if (size() < f8248d) {
            Object obj2 = this.f8249b;
            if (obj2 != null) {
                Object[] objArr = (Object[]) obj2;
                if (C1406e.m6799a((T[]) objArr, t)) {
                    return false;
                }
                if (size() == f8248d - 1) {
                    LinkedHashSet b = C1395aj.m6762b(Arrays.copyOf(objArr, objArr.length));
                    b.add(t);
                    obj = b;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr, size() + 1);
                    copyOf[copyOf.length - 1] = t;
                    obj = copyOf;
                }
                this.f8249b = obj;
            } else {
                throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            Object obj3 = this.f8249b;
            if (obj3 == null) {
                throw new C3227u("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
            } else if (!C1506y.m7020a(obj3).add(t)) {
                return false;
            }
        }
        mo10020a(size() + 1);
        return true;
    }

    public void clear() {
        this.f8249b = null;
        mo10020a(0);
    }

    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return C1489j.m6971a(this.f8249b, obj);
        }
        if (size() < f8248d) {
            Object obj2 = this.f8249b;
            if (obj2 != null) {
                return C1406e.m6799a((T[]) (Object[]) obj2, obj);
            }
            throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object obj3 = this.f8249b;
        if (obj3 != null) {
            return ((Set) obj3).contains(obj);
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.collections.Set<T>");
    }
}
