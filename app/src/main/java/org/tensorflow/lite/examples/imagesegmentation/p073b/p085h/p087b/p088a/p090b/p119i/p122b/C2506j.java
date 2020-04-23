package p073b.p085h.p087b.p088a.p090b.p119i.p122b;

import p073b.C3230x;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;

/* renamed from: b.h.b.a.b.i.b.j */
/* compiled from: constantValues.kt */
public abstract class C2506j extends C2500f<C3230x> {

    /* renamed from: a */
    public static final C2507a f7553a = new C2507a(null);

    /* renamed from: b.h.b.a.b.i.b.j$a */
    /* compiled from: constantValues.kt */
    public static final class C2507a {
        private C2507a() {
        }

        public /* synthetic */ C2507a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2506j mo9531a(String str) {
            C1489j.m6972b(str, "message");
            return new C2508b(str);
        }
    }

    /* renamed from: b.h.b.a.b.i.b.j$b */
    /* compiled from: constantValues.kt */
    public static final class C2508b extends C2506j {

        /* renamed from: b */
        private final String f7554b;

        public C2508b(String str) {
            C1489j.m6972b(str, "message");
            this.f7554b = str;
        }

        /* renamed from: b */
        public C2755ad mo9516a(C1821y yVar) {
            C1489j.m6972b(yVar, "module");
            return C2827p.m13791c(this.f7554b);
        }

        public String toString() {
            return this.f7554b;
        }
    }

    public C2506j() {
        super(C3230x.f8645a);
    }

    /* renamed from: b */
    public C3230x mo9521a() {
        throw new UnsupportedOperationException();
    }
}
