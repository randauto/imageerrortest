package p073b.p085h.p087b.p088a.p090b.p117g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2391f;

/* renamed from: b.h.b.a.b.g.g */
/* compiled from: ExtensionRegistryLite */
public class C2378g {

    /* renamed from: a */
    private static volatile boolean f7280a = false;

    /* renamed from: c */
    private static final C2378g f7281c = new C2378g(true);

    /* renamed from: b */
    private final Map<C2379a, C2391f<?, ?>> f7282b;

    /* renamed from: b.h.b.a.b.g.g$a */
    /* compiled from: ExtensionRegistryLite */
    private static final class C2379a {

        /* renamed from: a */
        private final Object f7283a;

        /* renamed from: b */
        private final int f7284b;

        C2379a(Object obj, int i) {
            this.f7283a = obj;
            this.f7284b = i;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f7283a) * 65535) + this.f7284b;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C2379a)) {
                return false;
            }
            C2379a aVar = (C2379a) obj;
            if (this.f7283a == aVar.f7283a && this.f7284b == aVar.f7284b) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public static C2378g m11893a() {
        return new C2378g();
    }

    /* renamed from: b */
    public static C2378g m11894b() {
        return f7281c;
    }

    /* renamed from: a */
    public <ContainingType extends C2406q> C2391f<ContainingType, ?> mo9173a(ContainingType containingtype, int i) {
        return (C2391f) this.f7282b.get(new C2379a(containingtype, i));
    }

    /* renamed from: a */
    public final void mo9174a(C2391f<?, ?> fVar) {
        this.f7282b.put(new C2379a(fVar.mo9213a(), fVar.mo9215b()), fVar);
    }

    C2378g() {
        this.f7282b = new HashMap();
    }

    private C2378g(boolean z) {
        this.f7282b = Collections.emptyMap();
    }
}
