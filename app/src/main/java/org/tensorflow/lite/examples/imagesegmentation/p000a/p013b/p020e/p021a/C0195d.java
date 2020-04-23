package p000a.p013b.p020e.p021a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p018c.C0171a;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p020e.p022b.C0209b;
import p000a.p013b.p020e.p029h.C0250a;

/* renamed from: a.b.e.a.d */
/* compiled from: ListCompositeDisposable */
public final class C0195d implements C0166b, C0192a {

    /* renamed from: a */
    List<C0166b> f381a;

    /* renamed from: b */
    volatile boolean f382b;

    /* renamed from: a */
    public void mo349a() {
        if (!this.f382b) {
            synchronized (this) {
                if (!this.f382b) {
                    this.f382b = true;
                    List<C0166b> list = this.f381a;
                    this.f381a = null;
                    mo393a(list);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo359a(C0166b bVar) {
        C0209b.m547a(bVar, "d is null");
        if (!this.f382b) {
            synchronized (this) {
                if (!this.f382b) {
                    List list = this.f381a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f381a = list;
                    }
                    list.add(bVar);
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
            boolean r0 = r2.f382b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f382b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<a.b.b.b> r0 = r2.f381a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p000a.p013b.p020e.p021a.C0195d.mo362c(a.b.b.b):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo393a(List<C0166b> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C0166b a : list) {
                try {
                    a.mo349a();
                } catch (Throwable th) {
                    C0176b.m498b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C0250a.m658a((Throwable) arrayList.get(0));
            }
            throw new C0171a((Iterable<? extends Throwable>) arrayList);
        }
    }
}
