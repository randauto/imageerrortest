package p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p073b.C3227u;
import p073b.p074a.C1395aj;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1506y;

/* renamed from: b.h.b.a.b.e.b.a.m */
/* compiled from: ModuleMapping.kt */
public final class C2328m {

    /* renamed from: a */
    private final LinkedHashMap<String, String> f7126a = new LinkedHashMap<>();

    /* renamed from: b */
    private final Set<String> f7127b = new LinkedHashSet();

    /* renamed from: c */
    private final String f7128c;

    public C2328m(String str) {
        C1489j.m6972b(str, "packageFqName");
        this.f7128c = str;
    }

    /* renamed from: a */
    public final Set<String> mo8901a() {
        Set<String> keySet = this.f7126a.keySet();
        C1489j.m6969a((Object) keySet, "packageParts.keys");
        return keySet;
    }

    /* renamed from: a */
    public final void mo8903a(String str, String str2) {
        C1489j.m6972b(str, "partInternalName");
        this.f7126a.put(str, str2);
    }

    /* renamed from: a */
    public final void mo8902a(String str) {
        C1489j.m6972b(str, "shortName");
        Set<String> set = this.f7127b;
        if (set != null) {
            C1506y.m7020a((Object) set).add(str);
            return;
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2328m) {
            C2328m mVar = (C2328m) obj;
            if (C1489j.m6971a((Object) mVar.f7128c, (Object) this.f7128c) && C1489j.m6971a((Object) mVar.f7126a, (Object) this.f7126a) && C1489j.m6971a((Object) mVar.f7127b, (Object) this.f7127b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f7128c.hashCode() * 31) + this.f7126a.hashCode()) * 31) + this.f7127b.hashCode();
    }

    public String toString() {
        return C1395aj.m6763a(mo8901a(), (Iterable<? extends T>) this.f7127b).toString();
    }
}
