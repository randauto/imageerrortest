package p073b.p085h.p087b.p088a.p090b.p118h;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;

/* renamed from: b.h.b.a.b.h.g */
/* compiled from: DescriptorRenderer.kt */
public enum C2467g {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true);
    

    /* renamed from: k */
    public static final Set<C2467g> f7464k = null;

    /* renamed from: l */
    public static final Set<C2467g> f7465l = null;

    /* renamed from: m */
    public static final C2468a f7466m = null;

    /* renamed from: o */
    private final boolean f7468o;

    /* renamed from: b.h.b.a.b.h.g$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class C2468a {
        private C2468a() {
        }

        public /* synthetic */ C2468a(C1486g gVar) {
            this();
        }
    }

    protected C2467g(boolean z) {
        this.f7468o = z;
    }

    static {
        int i;
        f7466m = new C2468a(null);
        C2467g[] values = values();
        Collection arrayList = new ArrayList();
        for (C2467g gVar : values) {
            if (gVar.f7468o) {
                arrayList.add(gVar);
            }
        }
        f7464k = C1415k.m6895m((List) arrayList);
        f7465l = C1406e.m6825j(values());
    }
}
