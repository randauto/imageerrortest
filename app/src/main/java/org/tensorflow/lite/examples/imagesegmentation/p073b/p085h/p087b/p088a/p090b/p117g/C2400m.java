package p073b.p085h.p087b.p088a.p090b.p117g;

/* renamed from: b.h.b.a.b.g.m */
/* compiled from: LazyFieldLite */
public class C2400m {

    /* renamed from: a */
    protected volatile C2406q f7317a;

    /* renamed from: b */
    private C2371d f7318b;

    /* renamed from: c */
    private C2378g f7319c;

    /* renamed from: d */
    private volatile boolean f7320d;

    /* renamed from: a */
    public C2406q mo9232a(C2406q qVar) {
        mo9235c(qVar);
        return this.f7317a;
    }

    /* renamed from: b */
    public C2406q mo9234b(C2406q qVar) {
        C2406q qVar2 = this.f7317a;
        this.f7317a = qVar;
        this.f7318b = null;
        this.f7320d = true;
        return qVar2;
    }

    /* renamed from: b */
    public int mo9233b() {
        if (this.f7320d) {
            return this.f7317a.mo8107i();
        }
        return this.f7318b.mo9064a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(1:12)(1:13)|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0023 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9235c(p073b.p085h.p087b.p088a.p090b.p117g.C2406q r3) {
        /*
            r2 = this;
            b.h.b.a.b.g.q r0 = r2.f7317a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r2)
            b.h.b.a.b.g.q r0 = r2.f7317a     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x000c:
            b.h.b.a.b.g.d r0 = r2.f7318b     // Catch:{ IOException -> 0x0023 }
            if (r0 == 0) goto L_0x0021
            b.h.b.a.b.g.s r3 = r3.mo8101c()     // Catch:{ IOException -> 0x0023 }
            b.h.b.a.b.g.d r0 = r2.f7318b     // Catch:{ IOException -> 0x0023 }
            b.h.b.a.b.g.g r1 = r2.f7319c     // Catch:{ IOException -> 0x0023 }
            java.lang.Object r3 = r3.mo9059c(r0, r1)     // Catch:{ IOException -> 0x0023 }
            b.h.b.a.b.g.q r3 = (p073b.p085h.p087b.p088a.p090b.p117g.C2406q) r3     // Catch:{ IOException -> 0x0023 }
            r2.f7317a = r3     // Catch:{ IOException -> 0x0023 }
            goto L_0x0023
        L_0x0021:
            r2.f7317a = r3     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p117g.C2400m.mo9235c(b.h.b.a.b.g.q):void");
    }
}
