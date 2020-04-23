package p000a.p013b.p020e.p025e.p026a;

import p000a.p013b.C0170c;
import p000a.p013b.C0181d;
import p000a.p013b.C0189e;
import p000a.p013b.C0189e.C0191b;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p018c.C0176b;
import p000a.p013b.p020e.p021a.C0193b;
import p000a.p013b.p020e.p023c.C0211a;
import p000a.p013b.p020e.p023c.C0214d;
import p000a.p013b.p020e.p024d.C0215a;
import p000a.p013b.p020e.p027f.C0225a;
import p000a.p013b.p020e.p028g.C0245k;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.e.e.a.c */
/* compiled from: ObservableObserveOn */
public final class C0220c<T> extends C0218a<T, T> {

    /* renamed from: b */
    final C0189e f404b;

    /* renamed from: c */
    final boolean f405c;

    /* renamed from: d */
    final int f406d;

    /* renamed from: a.b.e.e.a.c$a */
    /* compiled from: ObservableObserveOn */
    static final class C0221a<T> extends C0215a<T> implements C0181d<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: a */
        final C0181d<? super T> f407a;

        /* renamed from: b */
        final C0191b f408b;

        /* renamed from: c */
        final boolean f409c;

        /* renamed from: d */
        final int f410d;

        /* renamed from: e */
        C0214d<T> f411e;

        /* renamed from: f */
        C0166b f412f;

        /* renamed from: g */
        Throwable f413g;

        /* renamed from: h */
        volatile boolean f414h;

        /* renamed from: i */
        volatile boolean f415i;

        /* renamed from: j */
        int f416j;

        /* renamed from: k */
        boolean f417k;

        C0221a(C0181d<? super T> dVar, C0191b bVar, boolean z, int i) {
            this.f407a = dVar;
            this.f408b = bVar;
            this.f409c = z;
            this.f410d = i;
        }

        /* renamed from: a */
        public void mo375a(C0166b bVar) {
            if (C0193b.m518a(this.f412f, bVar)) {
                this.f412f = bVar;
                if (bVar instanceof C0211a) {
                    C0211a aVar = (C0211a) bVar;
                    int a = aVar.mo388a(7);
                    if (a == 1) {
                        this.f416j = a;
                        this.f411e = aVar;
                        this.f414h = true;
                        this.f407a.mo375a((C0166b) this);
                        mo409e();
                        return;
                    } else if (a == 2) {
                        this.f416j = a;
                        this.f411e = aVar;
                        this.f407a.mo375a((C0166b) this);
                        return;
                    }
                }
                this.f411e = new C0225a(this.f410d);
                this.f407a.mo375a((C0166b) this);
            }
        }

        /* renamed from: a_ */
        public void mo377a_(T t) {
            if (!this.f414h) {
                if (this.f416j != 2) {
                    this.f411e.mo389a(t);
                }
                mo409e();
            }
        }

        /* renamed from: a */
        public void mo376a(Throwable th) {
            if (this.f414h) {
                C0254a.m674a(th);
                return;
            }
            this.f413g = th;
            this.f414h = true;
            mo409e();
        }

        /* renamed from: s_ */
        public void mo378s_() {
            if (!this.f414h) {
                this.f414h = true;
                mo409e();
            }
        }

        /* renamed from: a */
        public void mo349a() {
            if (!this.f415i) {
                this.f415i = true;
                this.f412f.mo349a();
                this.f408b.mo349a();
                if (getAndIncrement() == 0) {
                    this.f411e.mo392d();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo409e() {
            if (getAndIncrement() == 0) {
                this.f408b.mo387a((Runnable) this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo410f() {
            C0214d<T> dVar = this.f411e;
            C0181d<? super T> dVar2 = this.f407a;
            int i = 1;
            while (!mo408a(this.f414h, dVar.mo391c(), dVar2)) {
                while (true) {
                    boolean z = this.f414h;
                    try {
                        Object b = dVar.mo390b();
                        boolean z2 = b == null;
                        if (!mo408a(z, z2, dVar2)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                dVar2.mo377a_(b);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C0176b.m498b(th);
                        this.f412f.mo349a();
                        dVar.mo392d();
                        dVar2.mo376a(th);
                        this.f408b.mo349a();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo411g() {
            int i = 1;
            while (!this.f415i) {
                boolean z = this.f414h;
                Throwable th = this.f413g;
                if (this.f409c || !z || th == null) {
                    this.f407a.mo377a_(null);
                    if (z) {
                        Throwable th2 = this.f413g;
                        if (th2 != null) {
                            this.f407a.mo376a(th2);
                        } else {
                            this.f407a.mo378s_();
                        }
                        this.f408b.mo349a();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f407a.mo376a(this.f413g);
                    this.f408b.mo349a();
                    return;
                }
            }
        }

        public void run() {
            if (this.f417k) {
                mo411g();
            } else {
                mo410f();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo408a(boolean z, boolean z2, C0181d<? super T> dVar) {
            if (this.f415i) {
                this.f411e.mo392d();
                return true;
            }
            if (z) {
                Throwable th = this.f413g;
                if (this.f409c) {
                    if (z2) {
                        if (th != null) {
                            dVar.mo376a(th);
                        } else {
                            dVar.mo378s_();
                        }
                        this.f408b.mo349a();
                        return true;
                    }
                } else if (th != null) {
                    this.f411e.mo392d();
                    dVar.mo376a(th);
                    this.f408b.mo349a();
                    return true;
                } else if (z2) {
                    dVar.mo378s_();
                    this.f408b.mo349a();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo388a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f417k = true;
            return 2;
        }

        /* renamed from: b */
        public T mo390b() {
            return this.f411e.mo390b();
        }

        /* renamed from: d */
        public void mo392d() {
            this.f411e.mo392d();
        }

        /* renamed from: c */
        public boolean mo391c() {
            return this.f411e.mo391c();
        }
    }

    public C0220c(C0170c<T> cVar, C0189e eVar, boolean z, int i) {
        super(cVar);
        this.f404b = eVar;
        this.f405c = z;
        this.f406d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo357b(C0181d<? super T> dVar) {
        if (this.f404b instanceof C0245k) {
            this.f402a.mo355a(dVar);
            return;
        }
        this.f402a.mo355a(new C0221a(dVar, this.f404b.mo347a(), this.f405c, this.f406d));
    }
}
