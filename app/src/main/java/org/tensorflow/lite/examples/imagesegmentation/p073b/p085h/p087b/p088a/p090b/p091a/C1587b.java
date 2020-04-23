package p073b.p085h.p087b.p088a.p090b.p091a;

import java.util.ServiceLoader;
import p073b.C1511g;
import p073b.C1521h;
import p073b.C3217l;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1681ac;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1726a;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1728b;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1729c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.a.b */
/* compiled from: BuiltInsLoader.kt */
public interface C1587b {

    /* renamed from: a */
    public static final C1588a f4985a = C1588a.f4987b;

    /* renamed from: b.h.b.a.b.a.b$a */
    /* compiled from: BuiltInsLoader.kt */
    public static final class C1588a {

        /* renamed from: a */
        static final /* synthetic */ C3135k[] f4986a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1588a.class), "Instance", "getInstance()Lorg/jetbrains/kotlin/builtins/BuiltInsLoader;"))};

        /* renamed from: b */
        static final /* synthetic */ C1588a f4987b = new C1588a();

        /* renamed from: c */
        private static final C1511g f4988c = C1521h.m14707a(C3217l.PUBLICATION, C1589a.f4989a);

        /* renamed from: b.h.b.a.b.a.b$a$a */
        /* compiled from: BuiltInsLoader.kt */
        static final class C1589a extends C1490k implements C1449a<C1587b> {

            /* renamed from: a */
            public static final C1589a f4989a = new C1589a();

            C1589a() {
                super(0);
            }

            /* renamed from: b */
            public final C1587b mo6823a() {
                ServiceLoader load = ServiceLoader.load(C1587b.class, C1587b.class.getClassLoader());
                C1489j.m6969a((Object) load, "implementations");
                C1587b bVar = (C1587b) C1415k.m6871c(load);
                if (bVar != null) {
                    return bVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        /* renamed from: a */
        public final C1587b mo7112a() {
            C1511g gVar = f4988c;
            C3135k kVar = f4986a[0];
            return (C1587b) gVar.mo6918a();
        }

        private C1588a() {
        }
    }

    /* renamed from: a */
    C1681ac mo7111a(C2713i iVar, C1821y yVar, Iterable<? extends C1728b> iterable, C1729c cVar, C1726a aVar);
}
