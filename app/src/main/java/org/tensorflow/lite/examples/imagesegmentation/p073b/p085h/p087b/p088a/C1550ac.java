package p073b.p085h.p087b.p088a;

import java.lang.ref.SoftReference;
import p073b.p079e.p080a.C1449a;

/* renamed from: b.h.b.a.ac */
/* compiled from: ReflectProperties */
public class C1550ac {

    /* renamed from: b.h.b.a.ac$a */
    /* compiled from: ReflectProperties */
    public static class C1551a<T> extends C1553c<T> {

        /* renamed from: a */
        private final C1449a<T> f4918a;

        /* renamed from: b */
        private SoftReference<Object> f4919b = null;

        public C1551a(T t, C1449a<T> aVar) {
            this.f4918a = aVar;
            if (t != null) {
                this.f4919b = new SoftReference<>(mo7027a(t));
            }
        }

        /* renamed from: a */
        public T mo7026a() {
            SoftReference<Object> softReference = this.f4919b;
            if (softReference != null) {
                Object obj = softReference.get();
                if (obj != null) {
                    return mo7029b(obj);
                }
            }
            T a = this.f4918a.mo6823a();
            this.f4919b = new SoftReference<>(mo7027a(a));
            return a;
        }
    }

    /* renamed from: b.h.b.a.ac$b */
    /* compiled from: ReflectProperties */
    public static class C1552b<T> extends C1553c<T> {

        /* renamed from: a */
        private final C1449a<T> f4920a;

        /* renamed from: b */
        private Object f4921b = null;

        public C1552b(C1449a<T> aVar) {
            this.f4920a = aVar;
        }

        /* renamed from: a */
        public T mo7026a() {
            Object obj = this.f4921b;
            if (obj != null) {
                return mo7029b(obj);
            }
            T a = this.f4920a.mo6823a();
            this.f4921b = mo7027a(a);
            return a;
        }
    }

    /* renamed from: b.h.b.a.ac$c */
    /* compiled from: ReflectProperties */
    public static abstract class C1553c<T> {

        /* renamed from: a */
        private static final Object f4922a = new Object() {
        };

        /* renamed from: a */
        public abstract T mo7026a();

        /* renamed from: a */
        public final T mo7028a(Object obj, Object obj2) {
            return mo7026a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo7027a(T t) {
            return t == null ? f4922a : t;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo7029b(Object obj) {
            if (obj == f4922a) {
                return null;
            }
            return obj;
        }
    }

    /* renamed from: a */
    public static <T> C1552b<T> m7104a(C1449a<T> aVar) {
        return new C1552b<>(aVar);
    }

    /* renamed from: a */
    public static <T> C1551a<T> m7103a(T t, C1449a<T> aVar) {
        return new C1551a<>(t, aVar);
    }

    /* renamed from: b */
    public static <T> C1551a<T> m7105b(C1449a<T> aVar) {
        return m7103a(null, aVar);
    }
}
