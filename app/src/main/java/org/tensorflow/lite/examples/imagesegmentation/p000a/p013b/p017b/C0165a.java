package p000a.p013b.p017b;

import java.util.ArrayList;
import java.util.List;
import p000a.p013b.p018c.C0171a;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p020e.p021a.C0192a;
import p000a.p013b.p020e.p022b.C0209b;
import p000a.p013b.p020e.p029h.C0250a;
import p000a.p013b.p020e.p029h.C0252b;

/* renamed from: a.b.b.a */
/* compiled from: CompositeDisposable */
public final class C0165a implements C0166b, C0192a {

    /* renamed from: a */
    C0252b<C0166b> f365a;

    /* renamed from: b */
    volatile boolean f366b;

    /* renamed from: a */
    public void mo349a() {
        if (!this.f366b) {
            synchronized (this) {
                if (!this.f366b) {
                    this.f366b = true;
                    C0252b<C0166b> bVar = this.f365a;
                    this.f365a = null;
                    mo358a(bVar);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo360b() {
        return this.f366b;
    }

    /* renamed from: a */
    public boolean mo359a(C0166b bVar) {
        C0209b.m547a(bVar, "d is null");
        if (!this.f366b) {
            synchronized (this) {
                if (!this.f366b) {
                    C0252b<C0166b> bVar2 = this.f365a;
                    if (bVar2 == null) {
                        bVar2 = new C0252b<>();
                        this.f365a = bVar2;
                    }
                    bVar2.mo445a(bVar);
                    return true;
                }
            }
        }
        bVar.mo349a();
        return false;
    }

    /* renamed from: b */
    public boolean mo361b(C0166b bVar) {
        if (!mo362c(bVar)) {
            return false;
        }
        bVar.mo349a();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo362c(p000a.p013b.p017b.C0166b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p000a.p013b.p020e.p022b.C0209b.m547a(r3, r0)
            boolean r0 = r2.f366b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f366b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            a.b.e.h.b<a.b.b.b> r0 = r2.f365a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo446b(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p013b.p017b.C0165a.mo362c(a.b.b.b):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo358a(C0252b<C0166b> bVar) {
        Object[] b;
        if (bVar != null) {
            List list = null;
            for (Object obj : bVar.mo447b()) {
                if (obj instanceof C0166b) {
                    try {
                        ((C0166b) obj).mo349a();
                    } catch (Throwable th) {
                        C0176b.m498b(th);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(th);
                    }
                }
            }
            if (list == null) {
                return;
            }
            if (list.size() == 1) {
                throw C0250a.m658a((Throwable) list.get(0));
            }
            throw new C0171a((Iterable<? extends Throwable>) list);
        }
    }
}
