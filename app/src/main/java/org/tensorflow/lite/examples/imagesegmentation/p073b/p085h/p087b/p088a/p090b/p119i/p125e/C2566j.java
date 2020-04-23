package p073b.p085h.p087b.p088a.p090b.p119i.p125e;

import java.util.Collection;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.i.e.j */
/* compiled from: ResolutionScope.kt */
public interface C2566j {

    /* renamed from: b.h.b.a.b.i.e.j$a */
    /* compiled from: ResolutionScope.kt */
    public static final class C2567a {
        /* renamed from: a */
        public static /* synthetic */ Collection m12758a(C2566j jVar, C2552d dVar, C1450b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    dVar = C2552d.f7621a;
                }
                if ((i & 2) != 0) {
                    bVar = C2560h.f7657c.mo9594a();
                }
                return jVar.mo7373a(dVar, bVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }

        /* renamed from: a */
        public static void m12759a(C2566j jVar, C2360f fVar, C1827b bVar) {
            C1489j.m6972b(fVar, "name");
            C1489j.m6972b(bVar, "location");
            jVar.mo7444b(fVar, bVar);
        }
    }

    /* renamed from: a */
    Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar);

    /* renamed from: b */
    Collection<C1813t> mo7444b(C2360f fVar, C1827b bVar);

    /* renamed from: c */
    C1799h mo7649c(C2360f fVar, C1827b bVar);
}
