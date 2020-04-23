package p000a.p013b.p020e.p022b;

import java.util.Comparator;
import java.util.concurrent.Callable;
import org.p278a.C7373a;
import p000a.p013b.p018c.C0178d;
import p000a.p013b.p019d.C0182a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p019d.C0186e;
import p000a.p013b.p019d.C0187f;
import p000a.p013b.p019d.C0188g;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.b.a */
/* compiled from: Functions */
public final class C0196a {

    /* renamed from: a */
    static final C0186e<Object, Object> f383a = new C0203g();

    /* renamed from: b */
    public static final Runnable f384b = new C0200d();

    /* renamed from: c */
    public static final C0182a f385c = new C0197a();

    /* renamed from: d */
    static final C0185d<Object> f386d = new C0198b();

    /* renamed from: e */
    public static final C0185d<Throwable> f387e = new C0201e();

    /* renamed from: f */
    public static final C0185d<Throwable> f388f = new C0207k();

    /* renamed from: g */
    public static final C0187f f389g = new C0199c();

    /* renamed from: h */
    static final C0188g<Object> f390h = new C0208l();

    /* renamed from: i */
    static final C0188g<Object> f391i = new C0202f();

    /* renamed from: j */
    static final Callable<Object> f392j = new C0206j();

    /* renamed from: k */
    static final Comparator<Object> f393k = new C0205i();

    /* renamed from: l */
    public static final C0185d<C7373a> f394l = new C0204h();

    /* renamed from: a.b.e.b.a$a */
    /* compiled from: Functions */
    static final class C0197a implements C0182a {
        /* renamed from: a */
        public void mo379a() {
        }

        public String toString() {
            return "EmptyAction";
        }

        C0197a() {
        }
    }

    /* renamed from: a.b.e.b.a$b */
    /* compiled from: Functions */
    static final class C0198b implements C0185d<Object> {
        /* renamed from: a */
        public void mo381a(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        C0198b() {
        }
    }

    /* renamed from: a.b.e.b.a$c */
    /* compiled from: Functions */
    static final class C0199c implements C0187f {
        C0199c() {
        }
    }

    /* renamed from: a.b.e.b.a$d */
    /* compiled from: Functions */
    static final class C0200d implements Runnable {
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        C0200d() {
        }
    }

    /* renamed from: a.b.e.b.a$e */
    /* compiled from: Functions */
    static final class C0201e implements C0185d<Throwable> {
        C0201e() {
        }

        /* renamed from: a */
        public void mo381a(Throwable th) {
            C0254a.m674a(th);
        }
    }

    /* renamed from: a.b.e.b.a$f */
    /* compiled from: Functions */
    static final class C0202f implements C0188g<Object> {
        C0202f() {
        }
    }

    /* renamed from: a.b.e.b.a$g */
    /* compiled from: Functions */
    static final class C0203g implements C0186e<Object, Object> {
        /* renamed from: a */
        public Object mo382a(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }

        C0203g() {
        }
    }

    /* renamed from: a.b.e.b.a$h */
    /* compiled from: Functions */
    static final class C0204h implements C0185d<C7373a> {
        C0204h() {
        }

        /* renamed from: a */
        public void mo381a(C7373a aVar) {
            aVar.mo23468a(Long.MAX_VALUE);
        }
    }

    /* renamed from: a.b.e.b.a$i */
    /* compiled from: Functions */
    static final class C0205i implements Comparator<Object> {
        C0205i() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: a.b.e.b.a$j */
    /* compiled from: Functions */
    static final class C0206j implements Callable<Object> {
        public Object call() {
            return null;
        }

        C0206j() {
        }
    }

    /* renamed from: a.b.e.b.a$k */
    /* compiled from: Functions */
    static final class C0207k implements C0185d<Throwable> {
        C0207k() {
        }

        /* renamed from: a */
        public void mo381a(Throwable th) {
            C0254a.m674a((Throwable) new C0178d(th));
        }
    }

    /* renamed from: a.b.e.b.a$l */
    /* compiled from: Functions */
    static final class C0208l implements C0188g<Object> {
        C0208l() {
        }
    }

    /* renamed from: a */
    public static <T> C0185d<T> m534a() {
        return f386d;
    }
}
