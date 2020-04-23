package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.Collection;
import java.util.Set;
import p073b.p074a.C1395aj;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2566j.C2567a;

/* renamed from: b.h.b.a.b.i.e.h */
/* compiled from: MemberScope.kt */
public interface C2560h extends C2566j {

    /* renamed from: c */
    public static final C2561a f7657c = C2561a.f7658a;

    /* renamed from: b.h.b.a.b.i.e.h$a */
    /* compiled from: MemberScope.kt */
    public static final class C2561a {

        /* renamed from: a */
        static final /* synthetic */ C2561a f7658a = new C2561a();

        /* renamed from: b */
        private static final C1450b<C2360f, Boolean> f7659b = C2562a.f7660a;

        /* renamed from: b.h.b.a.b.i.e.h$a$a */
        /* compiled from: MemberScope.kt */
        static final class C2562a extends C1490k implements C1450b<C2360f, Boolean> {

            /* renamed from: a */
            public static final C2562a f7660a = new C2562a();

            C2562a() {
                super(1);
            }

            /* renamed from: a */
            public final boolean mo9595a(C2360f fVar) {
                C1489j.m6972b(fVar, "it");
                return true;
            }

            /* renamed from: a */
            public /* synthetic */ Object mo6756a(Object obj) {
                return Boolean.valueOf(mo9595a((C2360f) obj));
            }
        }

        private C2561a() {
        }

        /* renamed from: a */
        public final C1450b<C2360f, Boolean> mo9594a() {
            return f7659b;
        }
    }

    /* renamed from: b.h.b.a.b.i.e.h$b */
    /* compiled from: MemberScope.kt */
    public static final class C2563b {
        /* renamed from: a */
        public static void m12745a(C2560h hVar, C2360f fVar, C1827b bVar) {
            C1489j.m6972b(fVar, "name");
            C1489j.m6972b(bVar, "location");
            C2567a.m12759a(hVar, fVar, bVar);
        }
    }

    /* renamed from: b.h.b.a.b.i.e.h$c */
    /* compiled from: MemberScope.kt */
    public static final class C2564c extends C2565i {

        /* renamed from: a */
        public static final C2564c f7661a = new C2564c();

        private C2564c() {
        }

        /* renamed from: D_ */
        public Set<C2360f> mo7441D_() {
            return C1395aj.m6759a();
        }

        /* renamed from: G_ */
        public Set<C2360f> mo7442G_() {
            return C1395aj.m6759a();
        }
    }

    /* renamed from: D_ */
    Set<C2360f> mo7441D_();

    /* renamed from: G_ */
    Set<C2360f> mo7442G_();

    /* renamed from: a */
    Collection<C1687ah> mo7443a(C2360f fVar, C1827b bVar);

    /* renamed from: b */
    Collection<C1691al> mo7444b(C2360f fVar, C1827b bVar);
}
