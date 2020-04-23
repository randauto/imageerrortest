package p073b.p085h.p087b.p088a.p090b.p094b;

import java.util.Collection;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.b.y */
/* compiled from: ModuleDescriptor.kt */
public interface C1821y extends C1804m {

    /* renamed from: b.h.b.a.b.b.y$a */
    /* compiled from: ModuleDescriptor.kt */
    public static final class C1822a<T> {

        /* renamed from: a */
        private final String f5605a;

        public C1822a(String str) {
            C1489j.m6972b(str, "name");
            this.f5605a = str;
        }

        public String toString() {
            return this.f5605a;
        }
    }

    /* renamed from: b.h.b.a.b.b.y$b */
    /* compiled from: ModuleDescriptor.kt */
    public static final class C1823b {
        /* renamed from: a */
        public static C1804m m8496a(C1821y yVar) {
            return null;
        }

        /* renamed from: a */
        public static <R, D> R m8497a(C1821y yVar, C1806o<R, D> oVar, D d) {
            C1489j.m6972b(oVar, "visitor");
            return oVar.mo7438a(yVar, d);
        }
    }

    /* renamed from: a */
    C1627g mo7522a();

    /* renamed from: a */
    C1682ad mo7523a(C2355b bVar);

    /* renamed from: a */
    Collection<C2355b> mo7524a(C2355b bVar, C1450b<? super C2360f, Boolean> bVar2);

    /* renamed from: a */
    boolean mo7530a(C1821y yVar);
}
