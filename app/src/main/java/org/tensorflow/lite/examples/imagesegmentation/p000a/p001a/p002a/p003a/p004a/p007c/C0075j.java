package p000a.p001a.p002a.p003a.p004a.p007c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.a.a.a.a.c.j */
/* compiled from: PriorityTask */
public class C0075j implements C0065b<C0078l>, C0074i, C0078l {
    private final List<C0078l> dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final AtomicReference<Throwable> throwable = new AtomicReference<>(null);

    public synchronized Collection<C0078l> getDependencies() {
        return Collections.unmodifiableCollection(this.dependencies);
    }

    public synchronized void addDependency(C0078l lVar) {
        this.dependencies.add(lVar);
    }

    public boolean areDependenciesMet() {
        for (C0078l isFinished : getDependencies()) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public synchronized void setFinished(boolean z) {
        this.hasRun.set(z);
    }

    public boolean isFinished() {
        return this.hasRun.get();
    }

    public C0068e getPriority() {
        return C0068e.NORMAL;
    }

    public void setError(Throwable th) {
        this.throwable.set(th);
    }

    public Throwable getError() {
        return (Throwable) this.throwable.get();
    }

    public int compareTo(Object obj) {
        return C0068e.m195a(this, obj);
    }

    public static boolean isProperDelegate(Object obj) {
        boolean z = false;
        try {
            C0065b bVar = (C0065b) obj;
            C0078l lVar = (C0078l) obj;
            C0074i iVar = (C0074i) obj;
            if (!(bVar == null || lVar == null || iVar == null)) {
                z = true;
            }
            return z;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
