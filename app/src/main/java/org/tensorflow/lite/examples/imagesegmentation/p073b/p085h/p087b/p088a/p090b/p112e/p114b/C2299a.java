package p073b.p085h.p087b.p088a.p090b.p112e.p114b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2264w;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2274y;
import p073b.p085h.p087b.p088a.p090b.p117g.C2367b;
import p073b.p085h.p087b.p088a.p090b.p117g.C2371d;
import p073b.p085h.p087b.p088a.p090b.p117g.C2371d.C2373b;
import p073b.p085h.p087b.p088a.p090b.p117g.C2374e;
import p073b.p085h.p087b.p088a.p090b.p117g.C2376f;
import p073b.p085h.p087b.p088a.p090b.p117g.C2378g;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2385a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2395k;
import p073b.p085h.p087b.p088a.p090b.p117g.C2401n;
import p073b.p085h.p087b.p088a.p090b.p117g.C2402o;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q;
import p073b.p085h.p087b.p088a.p090b.p117g.C2408r;
import p073b.p085h.p087b.p088a.p090b.p117g.C2409s;
import p073b.p085h.p087b.p088a.p090b.p117g.C2410t;

/* renamed from: b.h.b.a.b.e.b.a */
/* compiled from: JvmModuleProtoBuf */
public final class C2299a {

    /* renamed from: b.h.b.a.b.e.b.a$a */
    /* compiled from: JvmModuleProtoBuf */
    public static final class C2301a extends C2383i implements C2304b {

        /* renamed from: a */
        public static C2409s<C2301a> f7052a = new C2367b<C2301a>() {
            /* renamed from: a */
            public C2301a mo8114b(C2374e eVar, C2378g gVar) {
                return new C2301a(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2301a f7053c = new C2301a(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f7054d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f7055e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public List<C2305c> f7056f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public List<C2305c> f7057g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2402o f7058h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2274y f7059i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C2264w f7060j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public List<C2160a> f7061k;

        /* renamed from: l */
        private byte f7062l;

        /* renamed from: m */
        private int f7063m;

        /* renamed from: b.h.b.a.b.e.b.a$a$a */
        /* compiled from: JvmModuleProtoBuf */
        public static final class C2303a extends C2385a<C2301a, C2303a> implements C2304b {

            /* renamed from: a */
            private int f7064a;

            /* renamed from: b */
            private List<C2305c> f7065b = Collections.emptyList();

            /* renamed from: c */
            private List<C2305c> f7066c = Collections.emptyList();

            /* renamed from: d */
            private C2402o f7067d = C2401n.f7321a;

            /* renamed from: e */
            private C2274y f7068e = C2274y.m11139a();

            /* renamed from: f */
            private C2264w f7069f = C2264w.m11044a();

            /* renamed from: g */
            private List<C2160a> f7070g = Collections.emptyList();

            /* renamed from: q */
            private void m11272q() {
            }

            private C2303a() {
                m11272q();
            }

            /* access modifiers changed from: private */
            /* renamed from: r */
            public static C2303a m11273r() {
                return new C2303a();
            }

            /* renamed from: a */
            public C2303a mo8140k() {
                return m11273r().mo8128a(mo8856d());
            }

            /* renamed from: b */
            public C2301a mo8112o() {
                return C2301a.m11232a();
            }

            /* renamed from: c */
            public C2301a mo8141l() {
                C2301a d = mo8856d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2301a mo8856d() {
                C2301a aVar = new C2301a((C2385a) this);
                int i = this.f7064a;
                int i2 = 1;
                if ((this.f7064a & 1) == 1) {
                    this.f7065b = Collections.unmodifiableList(this.f7065b);
                    this.f7064a &= -2;
                }
                aVar.f7056f = this.f7065b;
                if ((this.f7064a & 2) == 2) {
                    this.f7066c = Collections.unmodifiableList(this.f7066c);
                    this.f7064a &= -3;
                }
                aVar.f7057g = this.f7066c;
                if ((this.f7064a & 4) == 4) {
                    this.f7067d = this.f7067d.mo9243b();
                    this.f7064a &= -5;
                }
                aVar.f7058h = this.f7067d;
                if ((i & 8) != 8) {
                    i2 = 0;
                }
                aVar.f7059i = this.f7068e;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                aVar.f7060j = this.f7069f;
                if ((this.f7064a & 32) == 32) {
                    this.f7070g = Collections.unmodifiableList(this.f7070g);
                    this.f7064a &= -33;
                }
                aVar.f7061k = this.f7070g;
                aVar.f7055e = i2;
                return aVar;
            }

            /* renamed from: a */
            public C2303a mo8128a(C2301a aVar) {
                if (aVar == C2301a.m11232a()) {
                    return this;
                }
                if (!aVar.f7056f.isEmpty()) {
                    if (this.f7065b.isEmpty()) {
                        this.f7065b = aVar.f7056f;
                        this.f7064a &= -2;
                    } else {
                        m11274s();
                        this.f7065b.addAll(aVar.f7056f);
                    }
                }
                if (!aVar.f7057g.isEmpty()) {
                    if (this.f7066c.isEmpty()) {
                        this.f7066c = aVar.f7057g;
                        this.f7064a &= -3;
                    } else {
                        m11275t();
                        this.f7066c.addAll(aVar.f7057g);
                    }
                }
                if (!aVar.f7058h.isEmpty()) {
                    if (this.f7067d.isEmpty()) {
                        this.f7067d = aVar.f7058h;
                        this.f7064a &= -5;
                    } else {
                        m11276u();
                        this.f7067d.addAll(aVar.f7058h);
                    }
                }
                if (aVar.mo8837k()) {
                    mo8848a(aVar.mo8838l());
                }
                if (aVar.mo8839p()) {
                    mo8847a(aVar.mo8840q());
                }
                if (!aVar.f7061k.isEmpty()) {
                    if (this.f7070g.isEmpty()) {
                        this.f7070g = aVar.f7061k;
                        this.f7064a &= -33;
                    } else {
                        m11277v();
                        this.f7070g.addAll(aVar.f7061k);
                    }
                }
                mo9198a(mo9199x().mo9075a(aVar.f7054d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                for (int i = 0; i < mo8857e(); i++) {
                    if (!mo8851a(i).mo8106h()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < mo8858f(); i2++) {
                    if (!mo8853b(i2).mo8106h()) {
                        return false;
                    }
                }
                if (mo8859g() && !mo8860m().mo8106h()) {
                    return false;
                }
                for (int i3 = 0; i3 < mo8861n(); i3++) {
                    if (!mo8854c(i3).mo8106h()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: a */
            public C2303a mo8132c(C2374e eVar, C2378g gVar) {
                C2301a aVar;
                C2301a aVar2 = null;
                try {
                    C2301a aVar3 = (C2301a) C2301a.f7052a.mo8114b(eVar, gVar);
                    if (aVar3 != null) {
                        mo8128a(aVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    aVar = (C2301a) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                }
                if (aVar2 != null) {
                    mo8128a(aVar2);
                }
                throw th;
            }

            /* renamed from: s */
            private void m11274s() {
                if ((this.f7064a & 1) != 1) {
                    this.f7065b = new ArrayList(this.f7065b);
                    this.f7064a |= 1;
                }
            }

            /* renamed from: e */
            public int mo8857e() {
                return this.f7065b.size();
            }

            /* renamed from: a */
            public C2305c mo8851a(int i) {
                return (C2305c) this.f7065b.get(i);
            }

            /* renamed from: t */
            private void m11275t() {
                if ((this.f7064a & 2) != 2) {
                    this.f7066c = new ArrayList(this.f7066c);
                    this.f7064a |= 2;
                }
            }

            /* renamed from: f */
            public int mo8858f() {
                return this.f7066c.size();
            }

            /* renamed from: b */
            public C2305c mo8853b(int i) {
                return (C2305c) this.f7066c.get(i);
            }

            /* renamed from: u */
            private void m11276u() {
                if ((this.f7064a & 4) != 4) {
                    this.f7067d = new C2401n(this.f7067d);
                    this.f7064a |= 4;
                }
            }

            /* renamed from: a */
            public C2303a mo8848a(C2274y yVar) {
                if ((this.f7064a & 8) != 8 || this.f7068e == C2274y.m11139a()) {
                    this.f7068e = yVar;
                } else {
                    this.f7068e = C2274y.m11138a(this.f7068e).mo8128a(yVar).mo8801d();
                }
                this.f7064a |= 8;
                return this;
            }

            /* renamed from: g */
            public boolean mo8859g() {
                return (this.f7064a & 16) == 16;
            }

            /* renamed from: m */
            public C2264w mo8860m() {
                return this.f7069f;
            }

            /* renamed from: a */
            public C2303a mo8847a(C2264w wVar) {
                if ((this.f7064a & 16) != 16 || this.f7069f == C2264w.m11044a()) {
                    this.f7069f = wVar;
                } else {
                    this.f7069f = C2264w.m11043a(this.f7069f).mo8128a(wVar).mo8767d();
                }
                this.f7064a |= 16;
                return this;
            }

            /* renamed from: v */
            private void m11277v() {
                if ((this.f7064a & 32) != 32) {
                    this.f7070g = new ArrayList(this.f7070g);
                    this.f7064a |= 32;
                }
            }

            /* renamed from: n */
            public int mo8861n() {
                return this.f7070g.size();
            }

            /* renamed from: c */
            public C2160a mo8854c(int i) {
                return (C2160a) this.f7070g.get(i);
            }
        }

        private C2301a(C2385a aVar) {
            super(aVar);
            this.f7062l = -1;
            this.f7063m = -1;
            this.f7054d = aVar.mo9199x();
        }

        private C2301a(boolean z) {
            this.f7062l = -1;
            this.f7063m = -1;
            this.f7054d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2301a m11232a() {
            return f7053c;
        }

        /* renamed from: b */
        public C2301a mo8112o() {
            return f7053c;
        }

        /* JADX WARNING: type inference failed for: r10v0 */
        /* JADX WARNING: type inference failed for: r10v1, types: [b.h.b.a.b.e.a$y$a] */
        /* JADX WARNING: type inference failed for: r10v2, types: [b.h.b.a.b.e.a$y$a] */
        /* JADX WARNING: type inference failed for: r10v3, types: [b.h.b.a.b.e.a$w$a] */
        /* JADX WARNING: type inference failed for: r10v4, types: [b.h.b.a.b.e.a$w$a] */
        /* JADX WARNING: type inference failed for: r10v5 */
        /* JADX WARNING: type inference failed for: r10v6 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r10v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], b.h.b.a.b.e.a$w$a, b.h.b.a.b.e.a$y$a]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], b.h.b.a.b.e.a$y$a, b.h.b.a.b.e.a$w$a]
          mth insns count: 164
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2301a(p073b.p085h.p087b.p088a.p090b.p117g.C2374e r12, p073b.p085h.p087b.p088a.p090b.p117g.C2378g r13) {
            /*
                r11 = this;
                r11.<init>()
                r0 = -1
                r11.f7062l = r0
                r11.f7063m = r0
                r11.m11244w()
                b.h.b.a.b.g.d$b r0 = p073b.p085h.p087b.p088a.p090b.p117g.C2371d.m11743i()
                r1 = 1
                b.h.b.a.b.g.f r2 = p073b.p085h.p087b.p088a.p090b.p117g.C2376f.m11817a(r0, r1)
                r3 = 0
                r4 = 0
            L_0x0016:
                r5 = 4
                r6 = 32
                r7 = 2
                if (r3 != 0) goto L_0x0159
                int r8 = r12.mo9095a()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                if (r8 == 0) goto L_0x00f9
                r9 = 10
                if (r8 == r9) goto L_0x00df
                r9 = 18
                if (r8 == r9) goto L_0x00c5
                r9 = 26
                if (r8 == r9) goto L_0x00ad
                r9 = 34
                r10 = 0
                if (r8 == r9) goto L_0x0084
                r9 = 42
                if (r8 == r9) goto L_0x005c
                r9 = 50
                if (r8 == r9) goto L_0x0043
                boolean r8 = r11.mo9197a(r12, r2, r13, r8)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                if (r8 != 0) goto L_0x0016
                goto L_0x00f9
            L_0x0043:
                r8 = r4 & 32
                if (r8 == r6) goto L_0x0050
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8.<init>()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r11.f7061k = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r4 = r4 | 32
            L_0x0050:
                java.util.List<b.h.b.a.b.e.a$a> r8 = r11.f7061k     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$a> r9 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a.f6474a     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.g.q r9 = r12.mo9096a(r9, r13)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8.add(r9)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                goto L_0x0016
            L_0x005c:
                int r8 = r11.f7055e     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8 = r8 & r7
                if (r8 != r7) goto L_0x0067
                b.h.b.a.b.e.a$w r8 = r11.f7060j     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.e.a$w$a r10 = r8.mo8110m()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
            L_0x0067:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$w> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2264w.f6952a     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.g.q r8 = r12.mo9096a(r8, r13)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.e.a$w r8 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2264w) r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r11.f7060j = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                if (r10 == 0) goto L_0x007e
                b.h.b.a.b.e.a$w r8 = r11.f7060j     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r10.mo8128a(r8)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.e.a$w r8 = r10.mo8767d()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r11.f7060j = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
            L_0x007e:
                int r8 = r11.f7055e     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8 = r8 | r7
                r11.f7055e = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                goto L_0x0016
            L_0x0084:
                int r8 = r11.f7055e     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8 = r8 & r1
                if (r8 != r1) goto L_0x008f
                b.h.b.a.b.e.a$y r8 = r11.f7059i     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.e.a$y$a r10 = r8.mo8110m()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
            L_0x008f:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$y> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2274y.f6979a     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.g.q r8 = r12.mo9096a(r8, r13)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.e.a$y r8 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2274y) r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r11.f7059i = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                if (r10 == 0) goto L_0x00a6
                b.h.b.a.b.e.a$y r8 = r11.f7059i     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r10.mo8128a(r8)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.e.a$y r8 = r10.mo8801d()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r11.f7059i = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
            L_0x00a6:
                int r8 = r11.f7055e     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8 = r8 | r1
                r11.f7055e = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                goto L_0x0016
            L_0x00ad:
                b.h.b.a.b.g.d r8 = r12.mo9115l()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r9 = r4 & 4
                if (r9 == r5) goto L_0x00be
                b.h.b.a.b.g.n r9 = new b.h.b.a.b.g.n     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r9.<init>()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r11.f7058h = r9     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r4 = r4 | 4
            L_0x00be:
                b.h.b.a.b.g.o r9 = r11.f7058h     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r9.mo9239a(r8)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                goto L_0x0016
            L_0x00c5:
                r8 = r4 & 2
                if (r8 == r7) goto L_0x00d2
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8.<init>()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r11.f7057g = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r4 = r4 | 2
            L_0x00d2:
                java.util.List<b.h.b.a.b.e.b.a$c> r8 = r11.f7057g     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.g.s<b.h.b.a.b.e.b.a$c> r9 = p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2299a.C2305c.f7071a     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.g.q r9 = r12.mo9096a(r9, r13)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8.add(r9)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                goto L_0x0016
            L_0x00df:
                r8 = r4 & 1
                if (r8 == r1) goto L_0x00ec
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8.<init>()     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r11.f7056f = r8     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r4 = r4 | 1
            L_0x00ec:
                java.util.List<b.h.b.a.b.e.b.a$c> r8 = r11.f7056f     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.g.s<b.h.b.a.b.e.b.a$c> r9 = p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2299a.C2305c.f7071a     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                b.h.b.a.b.g.q r9 = r12.mo9096a(r9, r13)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                r8.add(r9)     // Catch:{ k -> 0x010d, IOException -> 0x00fe }
                goto L_0x0016
            L_0x00f9:
                r3 = 1
                goto L_0x0016
            L_0x00fc:
                r12 = move-exception
                goto L_0x0113
            L_0x00fe:
                r12 = move-exception
                b.h.b.a.b.g.k r13 = new b.h.b.a.b.g.k     // Catch:{ all -> 0x00fc }
                java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x00fc }
                r13.<init>(r12)     // Catch:{ all -> 0x00fc }
                b.h.b.a.b.g.k r12 = r13.mo9219a(r11)     // Catch:{ all -> 0x00fc }
                throw r12     // Catch:{ all -> 0x00fc }
            L_0x010d:
                r12 = move-exception
                b.h.b.a.b.g.k r12 = r12.mo9219a(r11)     // Catch:{ all -> 0x00fc }
                throw r12     // Catch:{ all -> 0x00fc }
            L_0x0113:
                r13 = r4 & 1
                if (r13 != r1) goto L_0x011f
                java.util.List<b.h.b.a.b.e.b.a$c> r13 = r11.f7056f
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.f7056f = r13
            L_0x011f:
                r13 = r4 & 2
                if (r13 != r7) goto L_0x012b
                java.util.List<b.h.b.a.b.e.b.a$c> r13 = r11.f7057g
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.f7057g = r13
            L_0x012b:
                r13 = r4 & 4
                if (r13 != r5) goto L_0x0137
                b.h.b.a.b.g.o r13 = r11.f7058h
                b.h.b.a.b.g.o r13 = r13.mo9243b()
                r11.f7058h = r13
            L_0x0137:
                r13 = r4 & 32
                if (r13 != r6) goto L_0x0143
                java.util.List<b.h.b.a.b.e.a$a> r13 = r11.f7061k
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.f7061k = r13
            L_0x0143:
                r2.mo9131a()     // Catch:{ IOException -> 0x0146, all -> 0x014d }
            L_0x0146:
                b.h.b.a.b.g.d r13 = r0.mo9090a()
                r11.f7054d = r13
                goto L_0x0155
            L_0x014d:
                r12 = move-exception
                b.h.b.a.b.g.d r13 = r0.mo9090a()
                r11.f7054d = r13
                throw r12
            L_0x0155:
                r11.mo9196O()
                throw r12
            L_0x0159:
                r12 = r4 & 1
                if (r12 != r1) goto L_0x0165
                java.util.List<b.h.b.a.b.e.b.a$c> r12 = r11.f7056f
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.f7056f = r12
            L_0x0165:
                r12 = r4 & 2
                if (r12 != r7) goto L_0x0171
                java.util.List<b.h.b.a.b.e.b.a$c> r12 = r11.f7057g
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.f7057g = r12
            L_0x0171:
                r12 = r4 & 4
                if (r12 != r5) goto L_0x017d
                b.h.b.a.b.g.o r12 = r11.f7058h
                b.h.b.a.b.g.o r12 = r12.mo9243b()
                r11.f7058h = r12
            L_0x017d:
                r12 = r4 & 32
                if (r12 != r6) goto L_0x0189
                java.util.List<b.h.b.a.b.e.a$a> r12 = r11.f7061k
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.f7061k = r12
            L_0x0189:
                r2.mo9131a()     // Catch:{ IOException -> 0x018c, all -> 0x0193 }
            L_0x018c:
                b.h.b.a.b.g.d r12 = r0.mo9090a()
                r11.f7054d = r12
                goto L_0x019b
            L_0x0193:
                r12 = move-exception
                b.h.b.a.b.g.d r13 = r0.mo9090a()
                r11.f7054d = r13
                throw r12
            L_0x019b:
                r11.mo9196O()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2299a.C2301a.<init>(b.h.b.a.b.g.e, b.h.b.a.b.g.g):void");
        }

        static {
            f7053c.m11244w();
        }

        /* renamed from: c */
        public C2409s<C2301a> mo8101c() {
            return f7052a;
        }

        /* renamed from: d */
        public List<C2305c> mo8832d() {
            return this.f7056f;
        }

        /* renamed from: e */
        public int mo8833e() {
            return this.f7056f.size();
        }

        /* renamed from: a */
        public C2305c mo8828a(int i) {
            return (C2305c) this.f7056f.get(i);
        }

        /* renamed from: f */
        public List<C2305c> mo8834f() {
            return this.f7057g;
        }

        /* renamed from: g */
        public int mo8835g() {
            return this.f7057g.size();
        }

        /* renamed from: b */
        public C2305c mo8830b(int i) {
            return (C2305c) this.f7057g.get(i);
        }

        /* renamed from: j */
        public C2410t mo8836j() {
            return this.f7058h;
        }

        /* renamed from: k */
        public boolean mo8837k() {
            return (this.f7055e & 1) == 1;
        }

        /* renamed from: l */
        public C2274y mo8838l() {
            return this.f7059i;
        }

        /* renamed from: p */
        public boolean mo8839p() {
            return (this.f7055e & 2) == 2;
        }

        /* renamed from: q */
        public C2264w mo8840q() {
            return this.f7060j;
        }

        /* renamed from: r */
        public List<C2160a> mo8841r() {
            return this.f7061k;
        }

        /* renamed from: s */
        public int mo8842s() {
            return this.f7061k.size();
        }

        /* renamed from: c */
        public C2160a mo8831c(int i) {
            return (C2160a) this.f7061k.get(i);
        }

        /* renamed from: w */
        private void m11244w() {
            this.f7056f = Collections.emptyList();
            this.f7057g = Collections.emptyList();
            this.f7058h = C2401n.f7321a;
            this.f7059i = C2274y.m11139a();
            this.f7060j = C2264w.m11044a();
            this.f7061k = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f7062l;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < mo8833e(); i++) {
                if (!mo8828a(i).mo8106h()) {
                    this.f7062l = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo8835g(); i2++) {
                if (!mo8830b(i2).mo8106h()) {
                    this.f7062l = 0;
                    return false;
                }
            }
            if (!mo8839p() || mo8840q().mo8106h()) {
                for (int i3 = 0; i3 < mo8842s(); i3++) {
                    if (!mo8831c(i3).mo8106h()) {
                        this.f7062l = 0;
                        return false;
                    }
                }
                this.f7062l = 1;
                return true;
            }
            this.f7062l = 0;
            return false;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            for (int i = 0; i < this.f7056f.size(); i++) {
                fVar.mo9152b(1, (C2406q) this.f7056f.get(i));
            }
            for (int i2 = 0; i2 < this.f7057g.size(); i2++) {
                fVar.mo9152b(2, (C2406q) this.f7057g.get(i2));
            }
            for (int i3 = 0; i3 < this.f7058h.size(); i3++) {
                fVar.mo9139a(3, this.f7058h.mo9246c(i3));
            }
            if ((this.f7055e & 1) == 1) {
                fVar.mo9152b(4, (C2406q) this.f7059i);
            }
            if ((this.f7055e & 2) == 2) {
                fVar.mo9152b(5, (C2406q) this.f7060j);
            }
            for (int i4 = 0; i4 < this.f7061k.size(); i4++) {
                fVar.mo9152b(6, (C2406q) this.f7061k.get(i4));
            }
            fVar.mo9159c(this.f7054d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f7063m;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f7056f.size(); i3++) {
                i2 += C2376f.m11832d(1, (C2406q) this.f7056f.get(i3));
            }
            for (int i4 = 0; i4 < this.f7057g.size(); i4++) {
                i2 += C2376f.m11832d(2, (C2406q) this.f7057g.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f7058h.size(); i6++) {
                i5 += C2376f.m11825b(this.f7058h.mo9246c(i6));
            }
            int size = i2 + i5 + (mo8836j().size() * 1);
            if ((this.f7055e & 1) == 1) {
                size += C2376f.m11832d(4, (C2406q) this.f7059i);
            }
            if ((this.f7055e & 2) == 2) {
                size += C2376f.m11832d(5, (C2406q) this.f7060j);
            }
            for (int i7 = 0; i7 < this.f7061k.size(); i7++) {
                size += C2376f.m11832d(6, (C2406q) this.f7061k.get(i7));
            }
            int a = size + this.f7054d.mo9064a();
            this.f7063m = a;
            return a;
        }

        /* renamed from: a */
        public static C2301a m11233a(InputStream inputStream) {
            return (C2301a) f7052a.mo9057b(inputStream);
        }

        /* renamed from: t */
        public static C2303a m11243t() {
            return C2303a.m11273r();
        }

        /* renamed from: u */
        public C2303a mo8111n() {
            return m11243t();
        }

        /* renamed from: a */
        public static C2303a m11231a(C2301a aVar) {
            return m11243t().mo8128a(aVar);
        }

        /* renamed from: v */
        public C2303a mo8110m() {
            return m11231a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.b.a$b */
    public interface C2304b extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.b.a$c */
    /* compiled from: JvmModuleProtoBuf */
    public static final class C2305c extends C2383i implements C2308d {

        /* renamed from: a */
        public static C2409s<C2305c> f7071a = new C2367b<C2305c>() {
            /* renamed from: a */
            public C2305c mo8114b(C2374e eVar, C2378g gVar) {
                return new C2305c(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2305c f7072c = new C2305c(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f7073d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f7074e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Object f7075f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C2402o f7076g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public List<Integer> f7077h;

        /* renamed from: i */
        private int f7078i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C2402o f7079j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C2402o f7080k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public List<Integer> f7081l;

        /* renamed from: m */
        private int f7082m;

        /* renamed from: n */
        private byte f7083n;

        /* renamed from: o */
        private int f7084o;

        /* renamed from: b.h.b.a.b.e.b.a$c$a */
        /* compiled from: JvmModuleProtoBuf */
        public static final class C2307a extends C2385a<C2305c, C2307a> implements C2308d {

            /* renamed from: a */
            private int f7085a;

            /* renamed from: b */
            private Object f7086b = "";

            /* renamed from: c */
            private C2402o f7087c = C2401n.f7321a;

            /* renamed from: d */
            private List<Integer> f7088d = Collections.emptyList();

            /* renamed from: e */
            private C2402o f7089e = C2401n.f7321a;

            /* renamed from: f */
            private C2402o f7090f = C2401n.f7321a;

            /* renamed from: g */
            private List<Integer> f7091g = Collections.emptyList();

            /* renamed from: g */
            private void m11342g() {
            }

            private C2307a() {
                m11342g();
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public static C2307a m11343m() {
                return new C2307a();
            }

            /* renamed from: a */
            public C2307a mo8140k() {
                return m11343m().mo8128a(mo8879d());
            }

            /* renamed from: b */
            public C2305c mo8112o() {
                return C2305c.m11305a();
            }

            /* renamed from: c */
            public C2305c mo8141l() {
                C2305c d = mo8879d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2305c mo8879d() {
                C2305c cVar = new C2305c((C2385a) this);
                int i = 1;
                if ((this.f7085a & 1) != 1) {
                    i = 0;
                }
                cVar.f7075f = this.f7086b;
                if ((this.f7085a & 2) == 2) {
                    this.f7087c = this.f7087c.mo9243b();
                    this.f7085a &= -3;
                }
                cVar.f7076g = this.f7087c;
                if ((this.f7085a & 4) == 4) {
                    this.f7088d = Collections.unmodifiableList(this.f7088d);
                    this.f7085a &= -5;
                }
                cVar.f7077h = this.f7088d;
                if ((this.f7085a & 8) == 8) {
                    this.f7089e = this.f7089e.mo9243b();
                    this.f7085a &= -9;
                }
                cVar.f7079j = this.f7089e;
                if ((this.f7085a & 16) == 16) {
                    this.f7090f = this.f7090f.mo9243b();
                    this.f7085a &= -17;
                }
                cVar.f7080k = this.f7090f;
                if ((this.f7085a & 32) == 32) {
                    this.f7091g = Collections.unmodifiableList(this.f7091g);
                    this.f7085a &= -33;
                }
                cVar.f7081l = this.f7091g;
                cVar.f7074e = i;
                return cVar;
            }

            /* renamed from: a */
            public C2307a mo8128a(C2305c cVar) {
                if (cVar == C2305c.m11305a()) {
                    return this;
                }
                if (cVar.mo8863d()) {
                    this.f7085a |= 1;
                    this.f7086b = cVar.f7075f;
                }
                if (!cVar.f7076g.isEmpty()) {
                    if (this.f7087c.isEmpty()) {
                        this.f7087c = cVar.f7076g;
                        this.f7085a &= -3;
                    } else {
                        m11344n();
                        this.f7087c.addAll(cVar.f7076g);
                    }
                }
                if (!cVar.f7077h.isEmpty()) {
                    if (this.f7088d.isEmpty()) {
                        this.f7088d = cVar.f7077h;
                        this.f7085a &= -5;
                    } else {
                        m11345p();
                        this.f7088d.addAll(cVar.f7077h);
                    }
                }
                if (!cVar.f7079j.isEmpty()) {
                    if (this.f7089e.isEmpty()) {
                        this.f7089e = cVar.f7079j;
                        this.f7085a &= -9;
                    } else {
                        m11346q();
                        this.f7089e.addAll(cVar.f7079j);
                    }
                }
                if (!cVar.f7080k.isEmpty()) {
                    if (this.f7090f.isEmpty()) {
                        this.f7090f = cVar.f7080k;
                        this.f7085a &= -17;
                    } else {
                        m11347r();
                        this.f7090f.addAll(cVar.f7080k);
                    }
                }
                if (!cVar.f7081l.isEmpty()) {
                    if (this.f7091g.isEmpty()) {
                        this.f7091g = cVar.f7081l;
                        this.f7085a &= -33;
                    } else {
                        m11348s();
                        this.f7091g.addAll(cVar.f7081l);
                    }
                }
                mo9198a(mo9199x().mo9075a(cVar.f7073d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                return mo8880e();
            }

            /* renamed from: a */
            public C2307a mo8132c(C2374e eVar, C2378g gVar) {
                C2305c cVar;
                C2305c cVar2 = null;
                try {
                    C2305c cVar3 = (C2305c) C2305c.f7071a.mo8114b(eVar, gVar);
                    if (cVar3 != null) {
                        mo8128a(cVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    cVar = (C2305c) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    mo8128a(cVar2);
                }
                throw th;
            }

            /* renamed from: e */
            public boolean mo8880e() {
                return (this.f7085a & 1) == 1;
            }

            /* renamed from: n */
            private void m11344n() {
                if ((this.f7085a & 2) != 2) {
                    this.f7087c = new C2401n(this.f7087c);
                    this.f7085a |= 2;
                }
            }

            /* renamed from: p */
            private void m11345p() {
                if ((this.f7085a & 4) != 4) {
                    this.f7088d = new ArrayList(this.f7088d);
                    this.f7085a |= 4;
                }
            }

            /* renamed from: q */
            private void m11346q() {
                if ((this.f7085a & 8) != 8) {
                    this.f7089e = new C2401n(this.f7089e);
                    this.f7085a |= 8;
                }
            }

            /* renamed from: r */
            private void m11347r() {
                if ((this.f7085a & 16) != 16) {
                    this.f7090f = new C2401n(this.f7090f);
                    this.f7085a |= 16;
                }
            }

            /* renamed from: s */
            private void m11348s() {
                if ((this.f7085a & 32) != 32) {
                    this.f7091g = new ArrayList(this.f7091g);
                    this.f7085a |= 32;
                }
            }
        }

        private C2305c(C2385a aVar) {
            super(aVar);
            this.f7078i = -1;
            this.f7082m = -1;
            this.f7083n = -1;
            this.f7084o = -1;
            this.f7073d = aVar.mo9199x();
        }

        private C2305c(boolean z) {
            this.f7078i = -1;
            this.f7082m = -1;
            this.f7083n = -1;
            this.f7084o = -1;
            this.f7073d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2305c m11305a() {
            return f7072c;
        }

        /* renamed from: b */
        public C2305c mo8112o() {
            return f7072c;
        }

        private C2305c(C2374e eVar, C2378g gVar) {
            this.f7078i = -1;
            this.f7082m = -1;
            this.f7083n = -1;
            this.f7084o = -1;
            m11320t();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 10) {
                            C2371d l = eVar.mo9115l();
                            this.f7074e |= 1;
                            this.f7075f = l;
                        } else if (a2 == 18) {
                            C2371d l2 = eVar.mo9115l();
                            if (!(z2 & true)) {
                                this.f7076g = new C2401n();
                                z2 |= true;
                            }
                            this.f7076g.mo9239a(l2);
                        } else if (a2 == 24) {
                            if (!(z2 & true)) {
                                this.f7077h = new ArrayList();
                                z2 |= true;
                            }
                            this.f7077h.add(Integer.valueOf(eVar.mo9109f()));
                        } else if (a2 == 26) {
                            int c = eVar.mo9104c(eVar.mo9122s());
                            if (!(z2 & true) && eVar.mo9127x() > 0) {
                                this.f7077h = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.mo9127x() > 0) {
                                this.f7077h.add(Integer.valueOf(eVar.mo9109f()));
                            }
                            eVar.mo9106d(c);
                        } else if (a2 == 34) {
                            C2371d l3 = eVar.mo9115l();
                            if (!(z2 & true)) {
                                this.f7079j = new C2401n();
                                z2 |= true;
                            }
                            this.f7079j.mo9239a(l3);
                        } else if (a2 == 42) {
                            C2371d l4 = eVar.mo9115l();
                            if (!(z2 & true)) {
                                this.f7080k = new C2401n();
                                z2 |= true;
                            }
                            this.f7080k.mo9239a(l4);
                        } else if (a2 == 48) {
                            if (!(z2 & true)) {
                                this.f7081l = new ArrayList();
                                z2 |= true;
                            }
                            this.f7081l.add(Integer.valueOf(eVar.mo9109f()));
                        } else if (a2 == 50) {
                            int c2 = eVar.mo9104c(eVar.mo9122s());
                            if (!(z2 & true) && eVar.mo9127x() > 0) {
                                this.f7081l = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.mo9127x() > 0) {
                                this.f7081l.add(Integer.valueOf(eVar.mo9109f()));
                            }
                            eVar.mo9106d(c2);
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f7076g = this.f7076g.mo9243b();
                    }
                    if (z2 & true) {
                        this.f7077h = Collections.unmodifiableList(this.f7077h);
                    }
                    if (z2 & true) {
                        this.f7079j = this.f7079j.mo9243b();
                    }
                    if (z2 & true) {
                        this.f7080k = this.f7080k.mo9243b();
                    }
                    if (z2 & true) {
                        this.f7081l = Collections.unmodifiableList(this.f7081l);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7073d = i.mo9090a();
                        throw th2;
                    }
                    this.f7073d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f7076g = this.f7076g.mo9243b();
            }
            if (z2 & true) {
                this.f7077h = Collections.unmodifiableList(this.f7077h);
            }
            if (z2 & true) {
                this.f7079j = this.f7079j.mo9243b();
            }
            if (z2 & true) {
                this.f7080k = this.f7080k.mo9243b();
            }
            if (z2 & true) {
                this.f7081l = Collections.unmodifiableList(this.f7081l);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f7073d = i.mo9090a();
                throw th3;
            }
            this.f7073d = i.mo9090a();
            mo9196O();
        }

        static {
            f7072c.m11320t();
        }

        /* renamed from: c */
        public C2409s<C2305c> mo8101c() {
            return f7071a;
        }

        /* renamed from: d */
        public boolean mo8863d() {
            return (this.f7074e & 1) == 1;
        }

        /* renamed from: e */
        public String mo8864e() {
            Object obj = this.f7075f;
            if (obj instanceof String) {
                return (String) obj;
            }
            C2371d dVar = (C2371d) obj;
            String f = dVar.mo9083f();
            if (dVar.mo9084g()) {
                this.f7075f = f;
            }
            return f;
        }

        /* renamed from: f */
        public C2371d mo8865f() {
            Object obj = this.f7075f;
            if (!(obj instanceof String)) {
                return (C2371d) obj;
            }
            C2371d a = C2371d.m11739a((String) obj);
            this.f7075f = a;
            return a;
        }

        /* renamed from: g */
        public C2410t mo8866g() {
            return this.f7076g;
        }

        /* renamed from: j */
        public List<Integer> mo8867j() {
            return this.f7077h;
        }

        /* renamed from: k */
        public C2410t mo8868k() {
            return this.f7079j;
        }

        /* renamed from: l */
        public C2410t mo8869l() {
            return this.f7080k;
        }

        /* renamed from: p */
        public List<Integer> mo8870p() {
            return this.f7081l;
        }

        /* renamed from: t */
        private void m11320t() {
            this.f7075f = "";
            this.f7076g = C2401n.f7321a;
            this.f7077h = Collections.emptyList();
            this.f7079j = C2401n.f7321a;
            this.f7080k = C2401n.f7321a;
            this.f7081l = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f7083n;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8863d()) {
                this.f7083n = 0;
                return false;
            }
            this.f7083n = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            if ((this.f7074e & 1) == 1) {
                fVar.mo9139a(1, mo8865f());
            }
            for (int i = 0; i < this.f7076g.size(); i++) {
                fVar.mo9139a(2, this.f7076g.mo9246c(i));
            }
            if (mo8867j().size() > 0) {
                fVar.mo9171p(26);
                fVar.mo9171p(this.f7078i);
            }
            for (int i2 = 0; i2 < this.f7077h.size(); i2++) {
                fVar.mo9150b(((Integer) this.f7077h.get(i2)).intValue());
            }
            for (int i3 = 0; i3 < this.f7079j.size(); i3++) {
                fVar.mo9139a(4, this.f7079j.mo9246c(i3));
            }
            for (int i4 = 0; i4 < this.f7080k.size(); i4++) {
                fVar.mo9139a(5, this.f7080k.mo9246c(i4));
            }
            if (mo8870p().size() > 0) {
                fVar.mo9171p(50);
                fVar.mo9171p(this.f7082m);
            }
            for (int i5 = 0; i5 < this.f7081l.size(); i5++) {
                fVar.mo9150b(((Integer) this.f7081l.get(i5)).intValue());
            }
            fVar.mo9159c(this.f7073d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f7084o;
            if (i != -1) {
                return i;
            }
            int b = (this.f7074e & 1) == 1 ? C2376f.m11823b(1, mo8865f()) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f7076g.size(); i3++) {
                i2 += C2376f.m11825b(this.f7076g.mo9246c(i3));
            }
            int size = b + i2 + (mo8866g().size() * 1);
            int i4 = 0;
            for (int i5 = 0; i5 < this.f7077h.size(); i5++) {
                i4 += C2376f.m11837h(((Integer) this.f7077h.get(i5)).intValue());
            }
            int i6 = size + i4;
            if (!mo8867j().isEmpty()) {
                i6 = i6 + 1 + C2376f.m11837h(i4);
            }
            this.f7078i = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < this.f7079j.size(); i8++) {
                i7 += C2376f.m11825b(this.f7079j.mo9246c(i8));
            }
            int size2 = i6 + i7 + (mo8868k().size() * 1);
            int i9 = 0;
            for (int i10 = 0; i10 < this.f7080k.size(); i10++) {
                i9 += C2376f.m11825b(this.f7080k.mo9246c(i10));
            }
            int size3 = size2 + i9 + (mo8869l().size() * 1);
            int i11 = 0;
            for (int i12 = 0; i12 < this.f7081l.size(); i12++) {
                i11 += C2376f.m11837h(((Integer) this.f7081l.get(i12)).intValue());
            }
            int i13 = size3 + i11;
            if (!mo8870p().isEmpty()) {
                i13 = i13 + 1 + C2376f.m11837h(i11);
            }
            this.f7082m = i11;
            int a = i13 + this.f7073d.mo9064a();
            this.f7084o = a;
            return a;
        }

        /* renamed from: q */
        public static C2307a m11319q() {
            return C2307a.m11343m();
        }

        /* renamed from: r */
        public C2307a mo8111n() {
            return m11319q();
        }

        /* renamed from: a */
        public static C2307a m11304a(C2305c cVar) {
            return m11319q().mo8128a(cVar);
        }

        /* renamed from: s */
        public C2307a mo8110m() {
            return m11304a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.b.a$d */
    public interface C2308d extends C2408r {
    }
}
