package p073b.p085h.p087b.p088a.p090b.p112e.p113a;

import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2201ak;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2209am;

/* renamed from: b.h.b.a.b.e.a.k */
/* compiled from: VersionRequirement.kt */
public final class C2296k {

    /* renamed from: a */
    public static final C2297a f7049a = new C2297a(null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C2296k f7050c = new C2296k(C1415k.m6837a());

    /* renamed from: b */
    private final List<C2201ak> f7051b;

    /* renamed from: b.h.b.a.b.e.a.k$a */
    /* compiled from: VersionRequirement.kt */
    public static final class C2297a {
        private C2297a() {
        }

        public /* synthetic */ C2297a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2296k mo8826a() {
            return C2296k.f7050c;
        }

        /* renamed from: a */
        public final C2296k mo8827a(C2209am amVar) {
            C1489j.m6972b(amVar, "table");
            if (amVar.mo8434e() == 0) {
                return mo8826a();
            }
            List d = amVar.mo8433d();
            C1489j.m6969a((Object) d, "table.requirementList");
            return new C2296k(d, null);
        }
    }

    private C2296k(List<C2201ak> list) {
        this.f7051b = list;
    }

    public /* synthetic */ C2296k(List list, C1486g gVar) {
        this(list);
    }

    /* renamed from: a */
    public final C2201ak mo8825a(int i) {
        return (C2201ak) C1415k.m6872c(this.f7051b, i);
    }
}
