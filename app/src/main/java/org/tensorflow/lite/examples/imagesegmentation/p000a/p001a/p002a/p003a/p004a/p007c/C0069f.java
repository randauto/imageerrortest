package p000a.p001a.p002a.p003a.p004a.p007c;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000a.p001a.p002a.p003a.p004a.p007c.C0049a.C0058d;

/* renamed from: a.a.a.a.a.c.f */
/* compiled from: PriorityAsyncTask */
public abstract class C0069f<Params, Progress, Result> extends C0049a<Params, Progress, Result> implements C0065b<C0078l>, C0074i, C0078l {

    /* renamed from: a */
    private final C0075j f149a = new C0075j();

    /* renamed from: a.a.a.a.a.c.f$a */
    /* compiled from: PriorityAsyncTask */
    private static class C0070a<Result> implements Executor {

        /* renamed from: a */
        private final Executor f150a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C0069f f151b;

        public C0070a(Executor executor, C0069f fVar) {
            this.f150a = executor;
            this.f151b = fVar;
        }

        public void execute(Runnable runnable) {
            this.f150a.execute(new C0073h<Result>(runnable, null) {
                /* renamed from: a */
                public <T extends C0065b<C0078l> & C0074i & C0078l> T mo152a() {
                    return C0070a.this.f151b;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo144a(ExecutorService executorService, Params... paramsArr) {
        super.mo95a((Executor) new C0070a(executorService, this), paramsArr);
    }

    public int compareTo(Object obj) {
        return C0068e.m195a(this, obj);
    }

    /* renamed from: a */
    public void addDependency(C0078l lVar) {
        if (mo100b() == C0058d.PENDING) {
            ((C0065b) ((C0074i) mo146e())).addDependency(lVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public Collection<C0078l> getDependencies() {
        return ((C0065b) ((C0074i) mo146e())).getDependencies();
    }

    public boolean areDependenciesMet() {
        return ((C0065b) ((C0074i) mo146e())).areDependenciesMet();
    }

    public C0068e getPriority() {
        return ((C0074i) mo146e()).getPriority();
    }

    public void setFinished(boolean z) {
        ((C0078l) ((C0074i) mo146e())).setFinished(z);
    }

    public boolean isFinished() {
        return ((C0078l) ((C0074i) mo146e())).isFinished();
    }

    public void setError(Throwable th) {
        ((C0078l) ((C0074i) mo146e())).setError(th);
    }

    /* renamed from: e */
    public <T extends C0065b<C0078l> & C0074i & C0078l> T mo146e() {
        return this.f149a;
    }
}
