package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1688ai;
import p073b.p085h.p087b.p088a.p090b.p094b.C1689aj;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;

/* renamed from: b.h.b.a.b.b.a.e */
/* compiled from: AnnotationUseSiteTarget.kt */
public enum C1654e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: j */
    public static final C1655a f5235j = null;

    /* renamed from: l */
    private final String f5237l;

    /* renamed from: b.h.b.a.b.b.a.e$a */
    /* compiled from: AnnotationUseSiteTarget.kt */
    public static final class C1655a {
        private C1655a() {
        }

        public /* synthetic */ C1655a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1654e mo7245a(C1804m mVar) {
            C1489j.m6972b(mVar, "descriptor");
            if (mVar instanceof C1687ah) {
                return C1654e.PROPERTY;
            }
            if (mVar instanceof C1705au) {
                return C1654e.CONSTRUCTOR_PARAMETER;
            }
            if (mVar instanceof C1688ai) {
                return C1654e.PROPERTY_GETTER;
            }
            if (mVar instanceof C1689aj) {
                return C1654e.PROPERTY_SETTER;
            }
            return null;
        }
    }

    protected C1654e(String str) {
        if (str == null) {
            String name = name();
            if (name != null) {
                str = name.toLowerCase();
                C1489j.m6969a((Object) str, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new C3227u("null cannot be cast to non-null type java.lang.String");
            }
        }
        this.f5237l = str;
    }

    static {
        f5235j = new C1655a(null);
    }

    /* renamed from: a */
    public final String mo7244a() {
        return this.f5237l;
    }
}
