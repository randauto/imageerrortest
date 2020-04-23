package p073b.p085h.p087b.p088a.p090b.p139n;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import p073b.p079e.p080a.C1450b;

/* renamed from: b.h.b.a.b.n.b */
/* compiled from: DFS */
public class C2886b {

    /* renamed from: b.h.b.a.b.n.b$a */
    /* compiled from: DFS */
    public static abstract class C2888a<N, R> implements C2890c<N, R> {
        /* renamed from: a */
        public boolean mo7169a(N n) {
            return true;
        }

        /* renamed from: b */
        public void mo9549b(N n) {
        }
    }

    /* renamed from: b.h.b.a.b.n.b$b */
    /* compiled from: DFS */
    public interface C2889b<N> {
        /* renamed from: a */
        Iterable<? extends N> mo7165a(N n);
    }

    /* renamed from: b.h.b.a.b.n.b$c */
    /* compiled from: DFS */
    public interface C2890c<N, R> {
        /* renamed from: a */
        boolean mo7169a(N n);

        /* renamed from: b */
        R mo7170b();

        /* renamed from: b */
        void mo9549b(N n);
    }

    /* renamed from: b.h.b.a.b.n.b$d */
    /* compiled from: DFS */
    public interface C2891d<N> {
        /* renamed from: a */
        boolean mo9979a(N n);
    }

    /* renamed from: b.h.b.a.b.n.b$e */
    /* compiled from: DFS */
    public static class C2892e<N> implements C2891d<N> {

        /* renamed from: a */
        private final Set<N> f8209a;

        public C2892e() {
            this(new HashSet());
        }

        public C2892e(Set<N> set) {
            this.f8209a = set;
        }

        /* renamed from: a */
        public boolean mo9979a(N n) {
            return this.f8209a.add(n);
        }
    }

    /* renamed from: a */
    public static <N, R> R m13956a(Collection<N> collection, C2889b<N> bVar, C2891d<N> dVar, C2890c<N, R> cVar) {
        for (N a : collection) {
            m13957a(a, bVar, dVar, cVar);
        }
        return cVar.mo7170b();
    }

    /* renamed from: a */
    public static <N, R> R m13955a(Collection<N> collection, C2889b<N> bVar, C2890c<N, R> cVar) {
        return m13956a(collection, bVar, (C2891d<N>) new C2892e<N>(), cVar);
    }

    /* renamed from: a */
    public static <N> Boolean m13954a(Collection<N> collection, C2889b<N> bVar, final C1450b<N, Boolean> bVar2) {
        final boolean[] zArr = new boolean[1];
        return (Boolean) m13955a(collection, bVar, (C2890c<N, R>) new C2888a<N, Boolean>() {
            /* renamed from: a */
            public boolean mo7169a(N n) {
                if (((Boolean) bVar2.mo6756a(n)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            }

            /* renamed from: a */
            public Boolean mo7170b() {
                return Boolean.valueOf(zArr[0]);
            }
        });
    }

    /* renamed from: a */
    public static <N> void m13957a(N n, C2889b<N> bVar, C2891d<N> dVar, C2890c<N, ?> cVar) {
        if (dVar.mo9979a(n) && cVar.mo7169a(n)) {
            for (Object a : bVar.mo7165a(n)) {
                m13957a((N) a, bVar, dVar, cVar);
            }
            cVar.mo9549b(n);
        }
    }
}
