package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.b.a.h */
/* compiled from: Annotations.kt */
public interface C1659h extends C1474a, Iterable<C1651c> {

    /* renamed from: a */
    public static final C1660a f5247a = C1660a.f5248a;

    /* renamed from: b.h.b.a.b.b.a.h$a */
    /* compiled from: Annotations.kt */
    public static final class C1660a {

        /* renamed from: a */
        static final /* synthetic */ C1660a f5248a = new C1660a();

        /* renamed from: b */
        private static final C1659h f5249b = new C1661a();

        /* renamed from: b.h.b.a.b.b.a.h$a$a */
        /* compiled from: Annotations.kt */
        public static final class C1661a implements C1659h {
            /* renamed from: a */
            public boolean mo7255a() {
                return true;
            }

            /* renamed from: c */
            public Void mo7261c(C2355b bVar) {
                C1489j.m6972b(bVar, "fqName");
                return null;
            }

            public String toString() {
                return "EMPTY";
            }

            C1661a() {
            }

            /* renamed from: a */
            public /* synthetic */ C1651c mo7254a(C2355b bVar) {
                return (C1651c) mo7261c(bVar);
            }

            /* renamed from: b */
            public boolean mo7257b(C2355b bVar) {
                C1489j.m6972b(bVar, "fqName");
                return C1662b.m7563b(this, bVar);
            }

            /* renamed from: b */
            public List<C1658g> mo7256b() {
                return C1415k.m6837a();
            }

            /* renamed from: c */
            public List<C1658g> mo7258c() {
                return C1415k.m6837a();
            }

            public Iterator<C1651c> iterator() {
                return C1415k.m6837a().iterator();
            }
        }

        private C1660a() {
        }

        /* renamed from: a */
        public final C1659h mo7260a() {
            return f5249b;
        }

        /* renamed from: a */
        public final C1651c mo7259a(C1659h hVar, C1654e eVar, C2355b bVar) {
            Object obj;
            C1489j.m6972b(hVar, "annotations");
            C1489j.m6972b(eVar, "target");
            C1489j.m6972b(bVar, "fqName");
            Iterator it = m7553a(hVar, eVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C1489j.m6971a((Object) ((C1651c) obj).mo7240b(), (Object) bVar)) {
                    break;
                }
            }
            return (C1651c) obj;
        }

        /* renamed from: a */
        private final List<C1651c> m7553a(C1659h hVar, C1654e eVar) {
            Iterable<C1658g> b = hVar.mo7256b();
            Collection arrayList = new ArrayList();
            for (C1658g gVar : b) {
                C1651c c = gVar.mo7249c();
                if (!(eVar == gVar.mo7250d())) {
                    c = null;
                }
                if (c != null) {
                    arrayList.add(c);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: b.h.b.a.b.b.a.h$b */
    /* compiled from: Annotations.kt */
    public static final class C1662b {
        /* renamed from: a */
        public static C1651c m7562a(C1659h hVar, C2355b bVar) {
            Object obj;
            C1489j.m6972b(bVar, "fqName");
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C1489j.m6971a((Object) ((C1651c) obj).mo7240b(), (Object) bVar)) {
                    break;
                }
            }
            return (C1651c) obj;
        }

        /* renamed from: b */
        public static boolean m7563b(C1659h hVar, C2355b bVar) {
            C1489j.m6972b(bVar, "fqName");
            return hVar.mo7254a(bVar) != null;
        }
    }

    /* renamed from: a */
    C1651c mo7254a(C2355b bVar);

    /* renamed from: a */
    boolean mo7255a();

    /* renamed from: b */
    List<C1658g> mo7256b();

    /* renamed from: b */
    boolean mo7257b(C2355b bVar);

    /* renamed from: c */
    List<C1658g> mo7258c();
}
