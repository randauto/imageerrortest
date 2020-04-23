package p073b.p079e.p081b;

import java.io.Serializable;
import p073b.p079e.C1472b;
import p073b.p085h.C1522a;
import p073b.p085h.C3123d;

/* renamed from: b.e.b.c */
/* compiled from: CallableReference */
public abstract class C1481c implements C1522a, Serializable {

    /* renamed from: b */
    public static final Object f4849b = C1482a.f4852a;

    /* renamed from: a */
    protected final Object f4850a;

    /* renamed from: c */
    private transient C1522a f4851c;

    /* renamed from: b.e.b.c$a */
    /* compiled from: CallableReference */
    private static class C1482a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C1482a f4852a = new C1482a();

        private C1482a() {
        }

        private Object readResolve() {
            return f4852a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1522a mo6926b();

    public C1481c() {
        this(f4849b);
    }

    protected C1481c(Object obj) {
        this.f4850a = obj;
    }

    /* renamed from: c */
    public Object mo6927c() {
        return this.f4850a;
    }

    /* renamed from: d */
    public C1522a mo6928d() {
        C1522a aVar = this.f4851c;
        if (aVar != null) {
            return aVar;
        }
        C1522a b = mo6926b();
        this.f4851c = b;
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1522a mo6929e() {
        C1522a d = mo6928d();
        if (d != this) {
            return d;
        }
        throw new C1472b();
    }

    /* renamed from: f */
    public C3123d mo6930f() {
        throw new AbstractMethodError();
    }

    /* renamed from: g */
    public String mo6931g() {
        throw new AbstractMethodError();
    }

    /* renamed from: h */
    public String mo6932h() {
        throw new AbstractMethodError();
    }

    /* renamed from: a */
    public Object mo6925a(Object... objArr) {
        return mo6929e().mo6925a(objArr);
    }
}
