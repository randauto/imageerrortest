package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import java.util.ArrayDeque;
import java.util.Set;
import p073b.C3232z;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2777at;
import p073b.p085h.p087b.p088a.p090b.p131l.C2778au;
import p073b.p085h.p087b.p088a.p090b.p131l.C2788az;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2838t;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p139n.C2913j;

/* renamed from: b.h.b.a.b.l.a.o */
/* compiled from: TypeCheckerContext.kt */
public class C2731o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f7979a;

    /* renamed from: b */
    private boolean f7980b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ArrayDeque<C2755ad> f7981c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Set<C2755ad> f7982d;

    /* renamed from: e */
    private final boolean f7983e;

    /* renamed from: f */
    private final boolean f7984f;

    /* renamed from: b.h.b.a.b.l.a.o$a */
    /* compiled from: TypeCheckerContext.kt */
    public enum C2732a {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* renamed from: b.h.b.a.b.l.a.o$b */
    /* compiled from: TypeCheckerContext.kt */
    public enum C2733b {
        TAKE_FIRST_FOR_SUBTYPING,
        FORCE_NOT_SUBTYPE,
        CHECK_ANY_OF_THEM,
        INTERSECT_ARGUMENTS_AND_CHECK_AGAIN
    }

    /* renamed from: b.h.b.a.b.l.a.o$c */
    /* compiled from: TypeCheckerContext.kt */
    public static abstract class C2734c {

        /* renamed from: b.h.b.a.b.l.a.o$c$a */
        /* compiled from: TypeCheckerContext.kt */
        public static final class C2735a extends C2734c {

            /* renamed from: a */
            public static final C2735a f7994a = new C2735a();

            private C2735a() {
                super(null);
            }

            /* renamed from: a */
            public C2755ad mo9851a(C2841w wVar) {
                C1489j.m6972b(wVar, "type");
                return C2838t.m13860c(wVar);
            }
        }

        /* renamed from: b.h.b.a.b.l.a.o$c$b */
        /* compiled from: TypeCheckerContext.kt */
        public static final class C2736b extends C2734c {

            /* renamed from: a */
            private final C2778au f7995a;

            public C2736b(C2778au auVar) {
                C1489j.m6972b(auVar, "substitutor");
                super(null);
                this.f7995a = auVar;
            }

            /* renamed from: a */
            public C2755ad mo9851a(C2841w wVar) {
                C1489j.m6972b(wVar, "type");
                C2841w a = this.f7995a.mo9885a((C2841w) C2838t.m13860c(wVar), C2792ba.INVARIANT);
                C1489j.m6969a((Object) a, "substitutor.safeSubstitu…le(), Variance.INVARIANT)");
                return C2777at.m13545a(a);
            }
        }

        /* renamed from: b.h.b.a.b.l.a.o$c$c */
        /* compiled from: TypeCheckerContext.kt */
        public static final class C2737c extends C2734c {

            /* renamed from: a */
            public static final C2737c f7996a = new C2737c();

            private C2737c() {
                super(null);
            }

            /* renamed from: a */
            public /* synthetic */ C2755ad mo9851a(C2841w wVar) {
                return (C2755ad) mo9852b(wVar);
            }

            /* renamed from: b */
            public Void mo9852b(C2841w wVar) {
                C1489j.m6972b(wVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: b.h.b.a.b.l.a.o$c$d */
        /* compiled from: TypeCheckerContext.kt */
        public static final class C2738d extends C2734c {

            /* renamed from: a */
            public static final C2738d f7997a = new C2738d();

            private C2738d() {
                super(null);
            }

            /* renamed from: a */
            public C2755ad mo9851a(C2841w wVar) {
                C1489j.m6972b(wVar, "type");
                return C2838t.m13861d(wVar);
            }
        }

        /* renamed from: a */
        public abstract C2755ad mo9851a(C2841w wVar);

        private C2734c() {
        }

        public /* synthetic */ C2734c(C1486g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public Boolean mo9847a(C2788az azVar, C2788az azVar2) {
        C1489j.m6972b(azVar, "subType");
        C1489j.m6972b(azVar2, "superType");
        return null;
    }

    public C2731o(boolean z, boolean z2) {
        this.f7983e = z;
        this.f7984f = z2;
    }

    public /* synthetic */ C2731o(boolean z, boolean z2, int i, C1486g gVar) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        this(z, z2);
    }

    /* renamed from: b */
    public final boolean mo9850b() {
        return this.f7983e;
    }

    /* renamed from: a */
    public boolean mo9848a(C2767an anVar, C2767an anVar2) {
        C1489j.m6972b(anVar, "a");
        C1489j.m6972b(anVar2, "b");
        return C1489j.m6971a((Object) anVar, (Object) anVar2);
    }

    /* renamed from: a */
    public C2732a mo9845a(C2755ad adVar, C2721e eVar) {
        C1489j.m6972b(adVar, "subType");
        C1489j.m6972b(eVar, "superType");
        return C2732a.CHECK_SUBTYPE_AND_LOWER;
    }

    /* renamed from: a */
    public C2733b mo9846a() {
        return C2733b.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m13403c() {
        boolean z = !this.f7980b;
        if (!C3232z.f8648a || z) {
            this.f7980b = true;
            if (this.f7981c == null) {
                this.f7981c = new ArrayDeque<>(4);
            }
            if (this.f7982d == null) {
                this.f7982d = C2913j.f8247a.mo10030a();
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m13405d() {
        ArrayDeque<C2755ad> arrayDeque = this.f7981c;
        if (arrayDeque == null) {
            C1489j.m6968a();
        }
        arrayDeque.clear();
        Set<C2755ad> set = this.f7982d;
        if (set == null) {
            C1489j.m6968a();
        }
        set.clear();
        this.f7980b = false;
    }

    /* renamed from: a */
    public final boolean mo9849a(C2788az azVar) {
        C1489j.m6972b(azVar, "$receiver");
        return this.f7984f && (azVar.mo9507g() instanceof C2727k);
    }
}
