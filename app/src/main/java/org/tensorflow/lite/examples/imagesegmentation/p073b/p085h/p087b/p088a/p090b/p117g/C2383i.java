package p073b.p085h.p087b.p088a.p090b.p117g;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import p073b.p085h.p087b.p088a.p090b.p117g.C2364a.C2365a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2380h.C2382a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2392j.C2393a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2392j.C2394b;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q.C2407a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2430z.C2432a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2430z.C2437b;

/* renamed from: b.h.b.a.b.g.i */
/* compiled from: GeneratedMessageLite */
public abstract class C2383i extends C2364a implements Serializable {

    /* renamed from: b.h.b.a.b.g.i$a */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C2385a<MessageType extends C2383i, BuilderType extends C2385a> extends C2365a<BuilderType> {

        /* renamed from: a */
        private C2371d f7292a = C2371d.f7253a;

        /* renamed from: a */
        public abstract BuilderType mo8128a(MessageType messagetype);

        /* renamed from: i */
        public abstract MessageType mo8112o();

        protected C2385a() {
        }

        /* renamed from: j */
        public BuilderType mo8140k() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: x */
        public final C2371d mo9199x() {
            return this.f7292a;
        }

        /* renamed from: a */
        public final BuilderType mo9198a(C2371d dVar) {
            this.f7292a = dVar;
            return this;
        }
    }

    /* renamed from: b.h.b.a.b.g.i$b */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C2386b<MessageType extends C2387c<MessageType>, BuilderType extends C2386b<MessageType, BuilderType>> extends C2385a<MessageType, BuilderType> implements C2389d<MessageType> {

        /* renamed from: a */
        private C2380h<C2390e> f7293a = C2380h.m11908b();

        /* renamed from: b */
        private boolean f7294b;

        protected C2386b() {
        }

        /* renamed from: a */
        private void mo8255a() {
            if (!this.f7294b) {
                this.f7293a = this.f7293a.clone();
                this.f7294b = true;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C2380h<C2390e> mo8261b() {
            this.f7293a.mo9184c();
            this.f7294b = false;
            return this.f7293a;
        }

        /* renamed from: u */
        public BuilderType mo8140k() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public boolean mo9201y() {
            return this.f7293a.mo9188f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo9200a(MessageType messagetype) {
            mo8255a();
            this.f7293a.mo9179a(messagetype.f7295a);
        }
    }

    /* renamed from: b.h.b.a.b.g.i$c */
    /* compiled from: GeneratedMessageLite */
    public static abstract class C2387c<MessageType extends C2387c<MessageType>> extends C2383i implements C2389d<MessageType> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2380h<C2390e> f7295a;

        /* renamed from: b.h.b.a.b.g.i$c$a */
        /* compiled from: GeneratedMessageLite */
        protected class C2388a {

            /* renamed from: b */
            private final Iterator<Entry<C2390e, Object>> f7297b;

            /* renamed from: c */
            private Entry<C2390e, Object> f7298c;

            /* renamed from: d */
            private final boolean f7299d;

            private C2388a(boolean z) {
                this.f7297b = C2387c.this.f7295a.mo9187e();
                if (this.f7297b.hasNext()) {
                    this.f7298c = (Entry) this.f7297b.next();
                }
                this.f7299d = z;
            }

            /* renamed from: a */
            public void mo9209a(int i, C2376f fVar) {
                while (this.f7298c != null && ((C2390e) this.f7298c.getKey()).mo9190a() < i) {
                    C2390e eVar = (C2390e) this.f7298c.getKey();
                    if (!this.f7299d || eVar.mo9193c() != C2437b.MESSAGE || eVar.mo9194d()) {
                        C2380h.m11904a((C2382a<?>) eVar, this.f7298c.getValue(), fVar);
                    } else {
                        fVar.mo9157c(eVar.mo9190a(), (C2406q) this.f7298c.getValue());
                    }
                    if (this.f7297b.hasNext()) {
                        this.f7298c = (Entry) this.f7297b.next();
                    } else {
                        this.f7298c = null;
                    }
                }
            }
        }

        protected C2387c() {
            this.f7295a = C2380h.m11899a();
        }

        protected C2387c(C2386b<MessageType, ?> bVar) {
            this.f7295a = bVar.mo8261b();
        }

        /* renamed from: d */
        private void m11954d(C2391f<MessageType, ?> fVar) {
            if (fVar.mo9213a() != mo8112o()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* renamed from: a */
        public final <Type> boolean mo9206a(C2391f<MessageType, Type> fVar) {
            m11954d(fVar);
            return this.f7295a.mo9180a(fVar.f7308d);
        }

        /* renamed from: b */
        public final <Type> int mo9207b(C2391f<MessageType, List<Type>> fVar) {
            m11954d(fVar);
            return this.f7295a.mo9183c(fVar.f7308d);
        }

        /* renamed from: c */
        public final <Type> Type mo9208c(C2391f<MessageType, Type> fVar) {
            m11954d(fVar);
            Object b = this.f7295a.mo9181b(fVar.f7308d);
            if (b == null) {
                return fVar.f7306b;
            }
            return fVar.mo9214a(b);
        }

        /* renamed from: a */
        public final <Type> Type mo9205a(C2391f<MessageType, List<Type>> fVar, int i) {
            m11954d(fVar);
            return fVar.mo9216b(this.f7295a.mo9177a(fVar.f7308d, i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public boolean mo9202P() {
            return this.f7295a.mo9188f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo9197a(C2374e eVar, C2376f fVar, C2378g gVar, int i) {
            return C2383i.m11934b(this.f7295a, mo8112o(), eVar, fVar, gVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo9196O() {
            this.f7295a.mo9184c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: Q */
        public C2388a mo9203Q() {
            return new C2388a<>(false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public int mo9204R() {
            return this.f7295a.mo9189g();
        }
    }

    /* renamed from: b.h.b.a.b.g.i$d */
    public interface C2389d extends C2408r {
    }

    /* renamed from: b.h.b.a.b.g.i$e */
    /* compiled from: GeneratedMessageLite */
    static final class C2390e implements C2382a<C2390e> {

        /* renamed from: a */
        final C2394b<?> f7300a;

        /* renamed from: b */
        final int f7301b;

        /* renamed from: c */
        final C2432a f7302c;

        /* renamed from: d */
        final boolean f7303d;

        /* renamed from: e */
        final boolean f7304e;

        C2390e(C2394b<?> bVar, int i, C2432a aVar, boolean z, boolean z2) {
            this.f7300a = bVar;
            this.f7301b = i;
            this.f7302c = aVar;
            this.f7303d = z;
            this.f7304e = z2;
        }

        /* renamed from: a */
        public int mo9190a() {
            return this.f7301b;
        }

        /* renamed from: b */
        public C2432a mo9192b() {
            return this.f7302c;
        }

        /* renamed from: c */
        public C2437b mo9193c() {
            return this.f7302c.mo9336a();
        }

        /* renamed from: d */
        public boolean mo9194d() {
            return this.f7303d;
        }

        /* renamed from: e */
        public boolean mo9195e() {
            return this.f7304e;
        }

        /* renamed from: f */
        public C2394b<?> mo9212f() {
            return this.f7300a;
        }

        /* renamed from: a */
        public C2407a mo9191a(C2407a aVar, C2406q qVar) {
            return ((C2385a) aVar).mo8128a((C2383i) qVar);
        }

        /* renamed from: a */
        public int compareTo(C2390e eVar) {
            return this.f7301b - eVar.f7301b;
        }
    }

    /* renamed from: b.h.b.a.b.g.i$f */
    /* compiled from: GeneratedMessageLite */
    public static class C2391f<ContainingType extends C2406q, Type> {

        /* renamed from: a */
        final ContainingType f7305a;

        /* renamed from: b */
        final Type f7306b;

        /* renamed from: c */
        final C2406q f7307c;

        /* renamed from: d */
        final C2390e f7308d;

        /* renamed from: e */
        final Class f7309e;

        /* renamed from: f */
        final Method f7310f;

        C2391f(ContainingType containingtype, Type type, C2406q qVar, C2390e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.mo9192b() == C2432a.MESSAGE && qVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f7305a = containingtype;
                this.f7306b = type;
                this.f7307c = qVar;
                this.f7308d = eVar;
                this.f7309e = cls;
                if (C2393a.class.isAssignableFrom(cls)) {
                    this.f7310f = C2383i.m11932a(cls, "valueOf", Integer.TYPE);
                    return;
                }
                this.f7310f = null;
            }
        }

        /* renamed from: a */
        public ContainingType mo9213a() {
            return this.f7305a;
        }

        /* renamed from: b */
        public int mo9215b() {
            return this.f7308d.mo9190a();
        }

        /* renamed from: c */
        public C2406q mo9217c() {
            return this.f7307c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo9214a(Object obj) {
            if (!this.f7308d.mo9194d()) {
                return mo9216b(obj);
            }
            if (this.f7308d.mo9193c() != C2437b.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object b : (List) obj) {
                arrayList.add(mo9216b(b));
            }
            return arrayList;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Object mo9216b(Object obj) {
            if (this.f7308d.mo9193c() != C2437b.ENUM) {
                return obj;
            }
            return C2383i.m11931a(this.f7310f, (Object) null, (Integer) obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Object mo9218c(Object obj) {
            return this.f7308d.mo9193c() == C2437b.ENUM ? Integer.valueOf(((C2393a) obj).mo8186a()) : obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo9196O() {
    }

    protected C2383i() {
    }

    protected C2383i(C2385a aVar) {
    }

    /* renamed from: c */
    public C2409s<? extends C2406q> mo8101c() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9197a(C2374e eVar, C2376f fVar, C2378g gVar, int i) {
        return eVar.mo9101a(i, fVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <MessageType extends p073b.p085h.p087b.p088a.p090b.p117g.C2406q> boolean m11934b(p073b.p085h.p087b.p088a.p090b.p117g.C2380h<p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2390e> r4, MessageType r5, p073b.p085h.p087b.p088a.p090b.p117g.C2374e r6, p073b.p085h.p087b.p088a.p090b.p117g.C2376f r7, p073b.p085h.p087b.p088a.p090b.p117g.C2378g r8, int r9) {
        /*
            int r0 = p073b.p085h.p087b.p088a.p090b.p117g.C2430z.m12123a(r9)
            int r1 = p073b.p085h.p087b.p088a.p090b.p117g.C2430z.m12125b(r9)
            b.h.b.a.b.g.i$f r5 = r8.mo9173a(r5, r1)
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L_0x0013
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            goto L_0x003f
        L_0x0013:
            b.h.b.a.b.g.i$e r3 = r5.f7308d
            b.h.b.a.b.g.z$a r3 = r3.mo9192b()
            int r3 = p073b.p085h.p087b.p088a.p090b.p117g.C2380h.m11898a(r3, r1)
            if (r0 != r3) goto L_0x0021
            r0 = 0
            goto L_0x0011
        L_0x0021:
            b.h.b.a.b.g.i$e r3 = r5.f7308d
            boolean r3 = r3.f7303d
            if (r3 == 0) goto L_0x0010
            b.h.b.a.b.g.i$e r3 = r5.f7308d
            b.h.b.a.b.g.z$a r3 = r3.f7302c
            boolean r3 = r3.mo9338c()
            if (r3 == 0) goto L_0x0010
            b.h.b.a.b.g.i$e r3 = r5.f7308d
            b.h.b.a.b.g.z$a r3 = r3.mo9192b()
            int r3 = p073b.p085h.p087b.p088a.p090b.p117g.C2380h.m11898a(r3, r2)
            if (r0 != r3) goto L_0x0010
            r0 = 0
            r3 = 1
        L_0x003f:
            if (r0 == 0) goto L_0x0046
            boolean r4 = r6.mo9101a(r9, r7)
            return r4
        L_0x0046:
            if (r3 == 0) goto L_0x0096
            int r7 = r6.mo9122s()
            int r7 = r6.mo9104c(r7)
            b.h.b.a.b.g.i$e r8 = r5.f7308d
            b.h.b.a.b.g.z$a r8 = r8.mo9192b()
            b.h.b.a.b.g.z$a r9 = p073b.p085h.p087b.p088a.p090b.p117g.C2430z.C2432a.ENUM
            if (r8 != r9) goto L_0x007b
        L_0x005a:
            int r8 = r6.mo9127x()
            if (r8 <= 0) goto L_0x0091
            int r8 = r6.mo9117n()
            b.h.b.a.b.g.i$e r9 = r5.f7308d
            b.h.b.a.b.g.j$b r9 = r9.mo9212f()
            b.h.b.a.b.g.j$a r8 = r9.mo8188b(r8)
            if (r8 != 0) goto L_0x0071
            return r2
        L_0x0071:
            b.h.b.a.b.g.i$e r9 = r5.f7308d
            java.lang.Object r8 = r5.mo9218c(r8)
            r4.mo9182b(r9, r8)
            goto L_0x005a
        L_0x007b:
            int r8 = r6.mo9127x()
            if (r8 <= 0) goto L_0x0091
            b.h.b.a.b.g.i$e r8 = r5.f7308d
            b.h.b.a.b.g.z$a r8 = r8.mo9192b()
            java.lang.Object r8 = p073b.p085h.p087b.p088a.p090b.p117g.C2380h.m11900a(r6, r8, r1)
            b.h.b.a.b.g.i$e r9 = r5.f7308d
            r4.mo9182b(r9, r8)
            goto L_0x007b
        L_0x0091:
            r6.mo9106d(r7)
            goto L_0x011e
        L_0x0096:
            int[] r0 = p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C23841.f7291a
            b.h.b.a.b.g.i$e r3 = r5.f7308d
            b.h.b.a.b.g.z$b r3 = r3.mo9193c()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            switch(r0) {
                case 1: goto L_0x00c9;
                case 2: goto L_0x00b2;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            b.h.b.a.b.g.i$e r7 = r5.f7308d
            b.h.b.a.b.g.z$a r7 = r7.mo9192b()
            java.lang.Object r8 = p073b.p085h.p087b.p088a.p090b.p117g.C2380h.m11900a(r6, r7, r1)
            goto L_0x0103
        L_0x00b2:
            int r6 = r6.mo9117n()
            b.h.b.a.b.g.i$e r8 = r5.f7308d
            b.h.b.a.b.g.j$b r8 = r8.mo9212f()
            b.h.b.a.b.g.j$a r8 = r8.mo8188b(r6)
            if (r8 != 0) goto L_0x0103
            r7.mo9171p(r9)
            r7.mo9161d(r6)
            return r2
        L_0x00c9:
            r7 = 0
            b.h.b.a.b.g.i$e r9 = r5.f7308d
            boolean r9 = r9.mo9194d()
            if (r9 != 0) goto L_0x00e0
            b.h.b.a.b.g.i$e r9 = r5.f7308d
            java.lang.Object r9 = r4.mo9181b(r9)
            b.h.b.a.b.g.q r9 = (p073b.p085h.p087b.p088a.p090b.p117g.C2406q) r9
            if (r9 == 0) goto L_0x00e0
            b.h.b.a.b.g.q$a r7 = r9.mo8110m()
        L_0x00e0:
            if (r7 != 0) goto L_0x00ea
            b.h.b.a.b.g.q r7 = r5.mo9217c()
            b.h.b.a.b.g.q$a r7 = r7.mo8111n()
        L_0x00ea:
            b.h.b.a.b.g.i$e r9 = r5.f7308d
            b.h.b.a.b.g.z$a r9 = r9.mo9192b()
            b.h.b.a.b.g.z$a r0 = p073b.p085h.p087b.p088a.p090b.p117g.C2430z.C2432a.GROUP
            if (r9 != r0) goto L_0x00fc
            int r9 = r5.mo9215b()
            r6.mo9098a(r9, r7, r8)
            goto L_0x00ff
        L_0x00fc:
            r6.mo9100a(r7, r8)
        L_0x00ff:
            b.h.b.a.b.g.q r8 = r7.mo8141l()
        L_0x0103:
            b.h.b.a.b.g.i$e r6 = r5.f7308d
            boolean r6 = r6.mo9194d()
            if (r6 == 0) goto L_0x0115
            b.h.b.a.b.g.i$e r6 = r5.f7308d
            java.lang.Object r5 = r5.mo9218c(r8)
            r4.mo9182b(r6, r5)
            goto L_0x011e
        L_0x0115:
            b.h.b.a.b.g.i$e r6 = r5.f7308d
            java.lang.Object r5 = r5.mo9218c(r8)
            r4.mo9178a(r6, r5)
        L_0x011e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p117g.C2383i.m11934b(b.h.b.a.b.g.h, b.h.b.a.b.g.q, b.h.b.a.b.g.e, b.h.b.a.b.g.f, b.h.b.a.b.g.g, int):boolean");
    }

    /* renamed from: a */
    public static <ContainingType extends C2406q, Type> C2391f<ContainingType, Type> m11930a(ContainingType containingtype, Type type, C2406q qVar, C2394b<?> bVar, int i, C2432a aVar, Class cls) {
        C2390e eVar = new C2390e(bVar, i, aVar, false, false);
        C2391f fVar = new C2391f(containingtype, type, qVar, eVar, cls);
        return fVar;
    }

    /* renamed from: a */
    public static <ContainingType extends C2406q, Type> C2391f<ContainingType, Type> m11929a(ContainingType containingtype, C2406q qVar, C2394b<?> bVar, int i, C2432a aVar, boolean z, Class cls) {
        List emptyList = Collections.emptyList();
        C2390e eVar = new C2390e(bVar, i, aVar, true, z);
        C2391f fVar = new C2391f(containingtype, emptyList, qVar, eVar, cls);
        return fVar;
    }

    /* renamed from: a */
    static Method m11932a(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String valueOf = String.valueOf(String.valueOf(cls.getName()));
            String valueOf2 = String.valueOf(String.valueOf(str));
            StringBuilder sb = new StringBuilder(valueOf.length() + 45 + valueOf2.length());
            sb.append("Generated message class \"");
            sb.append(valueOf);
            sb.append("\" missing method \"");
            sb.append(valueOf2);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    static Object m11931a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }
}
