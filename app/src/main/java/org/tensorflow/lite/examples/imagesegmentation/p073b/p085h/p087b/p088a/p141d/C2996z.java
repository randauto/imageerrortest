package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import p073b.C3218m;
import p073b.p074a.C1406e;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2011z;
import p073b.p085h.p087b.p088a.p141d.C2992w.C2993a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaWildcardType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaWildcardType;", "reflectType", "Ljava/lang/reflect/WildcardType;", "(Ljava/lang/reflect/WildcardType;)V", "bound", "getBound", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "isExtends", "", "()Z", "getReflectType", "()Ljava/lang/reflect/WildcardType;", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.z */
/* compiled from: ReflectJavaWildcardType.kt */
public final class C2996z extends C2992w implements C2011z {

    /* renamed from: b */
    private final WildcardType f8332b;

    public C2996z(WildcardType wildcardType) {
        C1489j.m6972b(wildcardType, "reflectType");
        this.f8332b = wildcardType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public WildcardType mo10082J_() {
        return this.f8332b;
    }

    /* renamed from: d */
    public C2992w mo7877a() {
        Type[] upperBounds = mo10082J_().getUpperBounds();
        Type[] lowerBounds = mo10082J_().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Wildcard types with many bounds are not yet supported: ");
            sb.append(mo10082J_());
            throw new UnsupportedOperationException(sb.toString());
        } else if (lowerBounds.length == 1) {
            C2993a aVar = C2992w.f8326a;
            C1489j.m6969a((Object) lowerBounds, "lowerBounds");
            Object f = C1406e.m6821f(lowerBounds);
            C1489j.m6969a(f, "lowerBounds.single()");
            return aVar.mo10126a((Type) f);
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            C1489j.m6969a((Object) upperBounds, "upperBounds");
            Type type = (Type) C1406e.m6821f(upperBounds);
            if (!(!C1489j.m6971a((Object) type, (Object) Object.class))) {
                return null;
            }
            C2993a aVar2 = C2992w.f8326a;
            C1489j.m6969a((Object) type, "ub");
            return aVar2.mo10126a(type);
        }
    }

    /* renamed from: b */
    public boolean mo7878b() {
        Type[] upperBounds = mo10082J_().getUpperBounds();
        C1489j.m6969a((Object) upperBounds, "reflectType.upperBounds");
        return !C1489j.m6971a((Object) (Type) C1406e.m6817d((T[]) upperBounds), (Object) Object.class);
    }
}
