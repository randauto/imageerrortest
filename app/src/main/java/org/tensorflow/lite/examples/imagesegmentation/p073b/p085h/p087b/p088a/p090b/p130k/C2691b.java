package p073b.p085h.p087b.p088a.p090b.p130k;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p073b.C3230x;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p085h.p087b.p088a.p090b.p139n.C2893c;
import p073b.p085h.p087b.p088a.p090b.p139n.C2917k;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.k.b */
/* compiled from: LockBasedStorageManager */
public class C2691b implements C2713i {

    /* renamed from: a */
    public static final C2713i f7924a = new C2691b("NO_LOCKS", C2698c.f7936a, C2709e.f7954a) {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public <T> C2706j<T> mo9790a() {
            return C2706j.m13316a();
        }
    };

    /* renamed from: c */
    static final /* synthetic */ boolean f7925c = (!C2691b.class.desiredAssertionStatus());

    /* renamed from: d */
    private static final String f7926d = C3199m.m14811c(C2691b.class.getCanonicalName(), ".", "");

    /* renamed from: b */
    protected final Lock f7927b;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2698c f7928e;

    /* renamed from: f */
    private final String f7929f;

    /* renamed from: b.h.b.a.b.k.b$a */
    /* compiled from: LockBasedStorageManager */
    private static class C2695a<K, V> extends C2696b<K, V> implements C2690a<K, V> {

        /* renamed from: a */
        static final /* synthetic */ boolean f7935a = (!C2691b.class.desiredAssertionStatus());

        private C2695a(C2691b bVar, ConcurrentMap<C2700d<K, V>, Object> concurrentMap) {
            super(concurrentMap);
        }

        /* renamed from: a */
        public V mo9789a(K k, C1449a<? extends V> aVar) {
            V a = super.mo9789a(k, aVar);
            if (f7935a || a != null) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("computeIfAbsent() returned null under ");
            sb.append(mo9808a());
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: b.h.b.a.b.k.b$b */
    /* compiled from: LockBasedStorageManager */
    private static class C2696b<K, V> extends C2703g<C2700d<K, V>, V> {
        private C2696b(C2691b bVar, ConcurrentMap<C2700d<K, V>, Object> concurrentMap) {
            super(bVar, concurrentMap, new C1450b<C2700d<K, V>, V>() {
                /* renamed from: a */
                public V mo6756a(C2700d<K, V> dVar) {
                    return dVar.f7938b.mo6823a();
                }
            });
        }

        /* renamed from: a */
        public V mo9789a(K k, C1449a<? extends V> aVar) {
            return mo6756a(new C2700d(k, aVar));
        }
    }

    /* renamed from: b.h.b.a.b.k.b$c */
    /* compiled from: LockBasedStorageManager */
    public interface C2698c {

        /* renamed from: a */
        public static final C2698c f7936a = new C2698c() {
            /* renamed from: a */
            public RuntimeException mo9804a(Throwable th) {
                throw C2893c.m13969a(th);
            }
        };

        /* renamed from: a */
        RuntimeException mo9804a(Throwable th);
    }

    /* renamed from: b.h.b.a.b.k.b$d */
    /* compiled from: LockBasedStorageManager */
    private static class C2700d<K, V> {

        /* renamed from: a */
        private final K f7937a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1449a<? extends V> f7938b;

        public C2700d(K k, C1449a<? extends V> aVar) {
            this.f7937a = k;
            this.f7938b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f7937a.equals(((C2700d) obj).f7937a);
        }

        public int hashCode() {
            return this.f7937a.hashCode();
        }
    }

    /* renamed from: b.h.b.a.b.k.b$e */
    /* compiled from: LockBasedStorageManager */
    private static class C2701e<T> implements C2711g<T> {

        /* renamed from: a */
        private final C2691b f7939a;

        /* renamed from: b */
        private final C1449a<? extends T> f7940b;

        /* renamed from: c */
        private volatile Object f7941c = C2705i.NOT_COMPUTED;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9802a(T t) {
        }

        public C2701e(C2691b bVar, C1449a<? extends T> aVar) {
            this.f7939a = bVar;
            this.f7940b = aVar;
        }

        /* renamed from: b */
        public boolean mo9807b() {
            return (this.f7941c == C2705i.NOT_COMPUTED || this.f7941c == C2705i.COMPUTING) ? false : true;
        }

        /* renamed from: a */
        public T mo6823a() {
            T a;
            Object obj = this.f7941c;
            if (!(obj instanceof C2705i)) {
                return C2917k.m14018d(obj);
            }
            this.f7939a.f7927b.lock();
            try {
                Object obj2 = this.f7941c;
                if (!(obj2 instanceof C2705i)) {
                    a = C2917k.m14018d(obj2);
                } else {
                    if (obj2 == C2705i.COMPUTING) {
                        this.f7941c = C2705i.RECURSION_WAS_DETECTED;
                        C2706j a2 = mo9801a(true);
                        if (!a2.mo9810c()) {
                            a = a2.mo9809b();
                        }
                    }
                    if (obj2 == C2705i.RECURSION_WAS_DETECTED) {
                        C2706j a3 = mo9801a(false);
                        if (!a3.mo9810c()) {
                            a = a3.mo9809b();
                        }
                    }
                    this.f7941c = C2705i.COMPUTING;
                    a = this.f7940b.mo6823a();
                    this.f7941c = a;
                    mo9802a(a);
                }
                this.f7939a.f7927b.unlock();
                return a;
            } catch (Throwable th) {
                this.f7939a.f7927b.unlock();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2706j<T> mo9801a(boolean z) {
            return this.f7939a.mo9790a();
        }
    }

    /* renamed from: b.h.b.a.b.k.b$f */
    /* compiled from: LockBasedStorageManager */
    private static class C2702f<T> extends C2701e<T> implements C2710f<T> {

        /* renamed from: d */
        static final /* synthetic */ boolean f7942d = (!C2691b.class.desiredAssertionStatus());

        public C2702f(C2691b bVar, C1449a<? extends T> aVar) {
            super(bVar, aVar);
        }

        /* renamed from: a */
        public T mo6823a() {
            T a = super.mo6823a();
            if (f7942d || a != null) {
                return a;
            }
            throw new AssertionError("compute() returned null");
        }
    }

    /* renamed from: b.h.b.a.b.k.b$g */
    /* compiled from: LockBasedStorageManager */
    private static class C2703g<K, V> implements C2708d<K, V> {

        /* renamed from: a */
        private final C2691b f7943a;

        /* renamed from: b */
        private final ConcurrentMap<K, Object> f7944b;

        /* renamed from: c */
        private final C1450b<? super K, ? extends V> f7945c;

        public C2703g(C2691b bVar, ConcurrentMap<K, Object> concurrentMap, C1450b<? super K, ? extends V> bVar2) {
            this.f7943a = bVar;
            this.f7944b = concurrentMap;
            this.f7945c = bVar2;
        }

        /* renamed from: a */
        public V mo6756a(K k) {
            Object obj = this.f7944b.get(k);
            if (obj != null && obj != C2705i.COMPUTING) {
                return C2917k.m14017c(obj);
            }
            this.f7943a.f7927b.lock();
            try {
                Object obj2 = this.f7944b.get(k);
                if (obj2 == C2705i.COMPUTING) {
                    throw m13312b(k);
                } else if (obj2 != null) {
                    V c = C2917k.m14017c(obj2);
                    return c;
                } else {
                    Throwable th = null;
                    try {
                        this.f7944b.put(k, C2705i.COMPUTING);
                        V a = this.f7945c.mo6756a(k);
                        Object put = this.f7944b.put(k, C2917k.m14016b(a));
                        if (put == C2705i.COMPUTING) {
                            this.f7943a.f7927b.unlock();
                            return a;
                        }
                        AssertionError a2 = m13311a(k, put);
                        try {
                            throw a2;
                        } catch (Throwable th2) {
                            Throwable th3 = a2;
                            th = th2;
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (C2893c.m13970b(th)) {
                            this.f7944b.remove(k);
                            throw ((RuntimeException) th);
                        } else if (th != th) {
                            Object put2 = this.f7944b.put(k, C2917k.m14015a(th));
                            if (put2 != C2705i.COMPUTING) {
                                throw m13311a(k, put2);
                            }
                            throw this.f7943a.f7928e.mo9804a(th);
                        } else {
                            throw this.f7943a.f7928e.mo9804a(th);
                        }
                    }
                }
            } finally {
                this.f7943a.f7927b.unlock();
            }
        }

        /* renamed from: b */
        private AssertionError m13312b(K k) {
            StringBuilder sb = new StringBuilder();
            sb.append("Recursion detected on input: ");
            sb.append(k);
            sb.append(" under ");
            sb.append(this.f7943a);
            return (AssertionError) C2691b.m13282b(new AssertionError(sb.toString()));
        }

        /* renamed from: a */
        private AssertionError m13311a(K k, Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Race condition detected on input ");
            sb.append(k);
            sb.append(". Old value is ");
            sb.append(obj);
            sb.append(" under ");
            sb.append(this.f7943a);
            return (AssertionError) C2691b.m13282b(new AssertionError(sb.toString()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2691b mo9808a() {
            return this.f7943a;
        }
    }

    /* renamed from: b.h.b.a.b.k.b$h */
    /* compiled from: LockBasedStorageManager */
    private static class C2704h<K, V> extends C2703g<K, V> implements C2707c<K, V> {

        /* renamed from: a */
        static final /* synthetic */ boolean f7946a = (!C2691b.class.desiredAssertionStatus());

        public C2704h(C2691b bVar, ConcurrentMap<K, Object> concurrentMap, C1450b<? super K, ? extends V> bVar2) {
            super(bVar, concurrentMap, bVar2);
        }

        /* renamed from: a */
        public V mo6756a(K k) {
            V a = super.mo6756a(k);
            if (f7946a || a != null) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("compute() returned null under ");
            sb.append(mo9808a());
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: b.h.b.a.b.k.b$i */
    /* compiled from: LockBasedStorageManager */
    private enum C2705i {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: b.h.b.a.b.k.b$j */
    /* compiled from: LockBasedStorageManager */
    private static class C2706j<T> {

        /* renamed from: a */
        static final /* synthetic */ boolean f7951a = (!C2691b.class.desiredAssertionStatus());

        /* renamed from: b */
        private final T f7952b;

        /* renamed from: c */
        private final boolean f7953c;

        /* renamed from: a */
        public static <T> C2706j<T> m13317a(T t) {
            return new C2706j<>(t, false);
        }

        /* renamed from: a */
        public static <T> C2706j<T> m13316a() {
            return new C2706j<>(null, true);
        }

        private C2706j(T t, boolean z) {
            this.f7952b = t;
            this.f7953c = z;
        }

        /* renamed from: b */
        public T mo9809b() {
            if (f7951a || !this.f7953c) {
                return this.f7952b;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("A value requested from FALL_THROUGH in ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: c */
        public boolean mo9810c() {
            return this.f7953c;
        }

        public String toString() {
            return mo9810c() ? "FALL_THROUGH" : String.valueOf(this.f7952b);
        }
    }

    /* renamed from: c */
    private static String m13283c() {
        return "<unknown creating class>";
    }

    private C2691b(String str, C2698c cVar, Lock lock) {
        this.f7927b = lock;
        this.f7928e = cVar;
        this.f7929f = str;
    }

    public C2691b() {
        this(m13283c(), C2698c.f7936a, new ReentrantLock());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        sb.append(this.f7929f);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public <K, V> C2707c<K, V> mo9791a(C1450b<? super K, ? extends V> bVar) {
        return mo9792a(bVar, m13284d());
    }

    /* renamed from: a */
    public <K, V> C2707c<K, V> mo9792a(C1450b<? super K, ? extends V> bVar, ConcurrentMap<K, Object> concurrentMap) {
        return new C2704h(this, concurrentMap, bVar);
    }

    /* renamed from: b */
    public <K, V> C2708d<K, V> mo9797b(C1450b<? super K, ? extends V> bVar) {
        return mo9798b(bVar, m13284d());
    }

    /* renamed from: b */
    public <K, V> C2708d<K, V> mo9798b(C1450b<? super K, ? extends V> bVar, ConcurrentMap<K, Object> concurrentMap) {
        return new C2703g(this, concurrentMap, bVar);
    }

    /* renamed from: a */
    public <T> C2710f<T> mo9793a(C1449a<? extends T> aVar) {
        return new C2702f(this, aVar);
    }

    /* renamed from: a */
    public <T> C2710f<T> mo9795a(C1449a<? extends T> aVar, final T t) {
        return new C2702f<T>(this, aVar) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C2706j<T> mo9801a(boolean z) {
                return C2706j.m13317a(t);
            }
        };
    }

    /* renamed from: a */
    public <T> C2710f<T> mo9794a(C1449a<? extends T> aVar, C1450b<? super Boolean, ? extends T> bVar, C1450b<? super T, C3230x> bVar2) {
        final C1450b<? super Boolean, ? extends T> bVar3 = bVar;
        final C1450b<? super T, C3230x> bVar4 = bVar2;
        C26943 r0 = new C2702f<T>(this, aVar) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C2706j<T> mo9801a(boolean z) {
                if (bVar3 == null) {
                    return super.mo9801a(z);
                }
                return C2706j.m13317a(bVar3.mo6756a(Boolean.valueOf(z)));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo9802a(T t) {
                bVar4.mo6756a(t);
            }
        };
        return r0;
    }

    /* renamed from: b */
    public <T> C2711g<T> mo9799b(C1449a<? extends T> aVar) {
        return new C2701e(this, aVar);
    }

    /* renamed from: d */
    private static <K> ConcurrentMap<K, Object> m13284d() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T> C2706j<T> mo9790a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recursive call in a lazy value under ");
        sb.append(this);
        throw ((IllegalStateException) m13282b((T) new IllegalStateException(sb.toString())));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T extends Throwable> T m13282b(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(f7926d)) {
                break;
            } else {
                i++;
            }
        }
        if (f7925c || i >= 0) {
            List subList = Arrays.asList(stackTrace).subList(i, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            return t;
        }
        throw new AssertionError("This method should only be called on exceptions created in LockBasedStorageManager");
    }

    /* renamed from: b */
    public <K, V> C2690a<K, V> mo9796b() {
        return new C2695a(m13284d());
    }
}
