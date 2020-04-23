package p000a.p013b.p020e.p025e.p026a;

import java.util.concurrent.atomic.AtomicReference;
import p000a.p013b.C0170c;
import p000a.p013b.C0181d;
import p000a.p013b.C0189e;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p020e.p021a.C0193b;

/* renamed from: a.b.e.e.a.d */
/* compiled from: ObservableSubscribeOn */
public final class C0222d<T> extends C0218a<T, T> {

    /* renamed from: b */
    final C0189e f418b;

    /* renamed from: a.b.e.e.a.d$a */
    /* compiled from: ObservableSubscribeOn */
    static final class C0223a<T> extends AtomicReference<C0166b> implements C0166b, C0181d<T> {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: a */
        final C0181d<? super T> f419a;

        /* renamed from: b */
        final AtomicReference<C0166b> f420b = new AtomicReference<>();

        C0223a(C0181d<? super T> dVar) {
            this.f419a = dVar;
        }

        /* renamed from: a */
        public void mo375a(C0166b bVar) {
            C0193b.m520a(this.f420b, bVar);
        }

        /* renamed from: a_ */
        public void mo377a_(T t) {
            this.f419a.mo377a_(t);
        }

        /* renamed from: a */
        public void mo376a(Throwable th) {
            this.f419a.mo376a(th);
        }

        /* renamed from: s_ */
        public void mo378s_() {
            this.f419a.mo378s_();
        }

        /* renamed from: a */
        public void mo349a() {
            C0193b.m519a(this.f420b);
            C0193b.m519a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo413b(C0166b bVar) {
            C0193b.m520a((AtomicReference<C0166b>) this, bVar);
        }
    }

    /* renamed from: a.b.e.e.a.d$b */
    /* compiled from: ObservableSubscribeOn */
    final class C0224b implements Runnable {

        /* renamed from: b */
        private final C0223a<T> f422b;

        C0224b(C0223a<T> aVar) {
            this.f422b = aVar;
        }

        public void run() {
            C0222d.this.f402a.mo355a(this.f422b);
        }
    }

    public C0222d(C0170c<T> cVar, C0189e eVar) {
        super(cVar);
        this.f418b = eVar;
    }

    /* renamed from: b */
    public void mo357b(C0181d<? super T> dVar) {
        C0223a aVar = new C0223a(dVar);
        dVar.mo375a((C0166b) aVar);
        aVar.mo413b(this.f418b.mo383a(new C0224b(aVar)));
    }
}
