package p000a.p001a.p002a.p003a.p004a.p007c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: a.a.a.a.a.c.h */
/* compiled from: PriorityFutureTask */
public class C0073h<V> extends FutureTask<V> implements C0065b<C0078l>, C0074i, C0078l {

    /* renamed from: b */
    final Object f153b;

    public C0073h(Callable<V> callable) {
        super(callable);
        this.f153b = mo153a((Object) callable);
    }

    public C0073h(Runnable runnable, V v) {
        super(runnable, v);
        this.f153b = mo153a((Object) runnable);
    }

    public int compareTo(Object obj) {
        return ((C0074i) mo152a()).compareTo(obj);
    }

    /* renamed from: a */
    public void addDependency(C0078l lVar) {
        ((C0065b) ((C0074i) mo152a())).addDependency(lVar);
    }

    public Collection<C0078l> getDependencies() {
        return ((C0065b) ((C0074i) mo152a())).getDependencies();
    }

    public boolean areDependenciesMet() {
        return ((C0065b) ((C0074i) mo152a())).areDependenciesMet();
    }

    public C0068e getPriority() {
        return ((C0074i) mo152a()).getPriority();
    }

    public void setFinished(boolean z) {
        ((C0078l) ((C0074i) mo152a())).setFinished(z);
    }

    public boolean isFinished() {
        return ((C0078l) ((C0074i) mo152a())).isFinished();
    }

    public void setError(Throwable th) {
        ((C0078l) ((C0074i) mo152a())).setError(th);
    }

    /* renamed from: a */
    public <T extends C0065b<C0078l> & C0074i & C0078l> T mo152a() {
        return (C0065b) this.f153b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <T extends C0065b<C0078l> & C0074i & C0078l> T mo153a(Object obj) {
        if (C0075j.isProperDelegate(obj)) {
            return (C0065b) obj;
        }
        return new C0075j();
    }
}
