package p073b.p085h.p087b.p088a.p090b.p094b;

import java.util.Collection;
import p073b.C3230x;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.ap */
/* compiled from: SupertypeLoopChecker.kt */
public interface C1697ap {

    /* renamed from: b.h.b.a.b.b.ap$a */
    /* compiled from: SupertypeLoopChecker.kt */
    public static final class C1698a implements C1697ap {

        /* renamed from: a */
        public static final C1698a f5333a = new C1698a();

        /* renamed from: a */
        public Collection<C2841w> mo7308a(C2767an anVar, Collection<? extends C2841w> collection, C1450b<? super C2767an, ? extends Iterable<? extends C2841w>> bVar, C1450b<? super C2841w, C3230x> bVar2) {
            C1489j.m6972b(anVar, "currentTypeConstructor");
            C1489j.m6972b(collection, "superTypes");
            C1489j.m6972b(bVar, "neighbors");
            C1489j.m6972b(bVar2, "reportLoop");
            return collection;
        }

        private C1698a() {
        }
    }

    /* renamed from: a */
    Collection<C2841w> mo7308a(C2767an anVar, Collection<? extends C2841w> collection, C1450b<? super C2767an, ? extends Iterable<? extends C2841w>> bVar, C1450b<? super C2841w, C3230x> bVar2);
}
