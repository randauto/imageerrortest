package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2007v;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "()V", "reflectType", "Ljava/lang/reflect/Type;", "getReflectType", "()Ljava/lang/reflect/Type;", "equals", "", "other", "", "hashCode", "", "toString", "", "Factory", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.w */
/* compiled from: ReflectJavaType.kt */
public abstract class C2992w implements C2007v {

    /* renamed from: a */
    public static final C2993a f8326a = new C2993a(null);

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaType$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "type", "Ljava/lang/reflect/Type;", "descriptors.runtime"})
    /* renamed from: b.h.b.a.d.w$a */
    /* compiled from: ReflectJavaType.kt */
    public static final class C2993a {
        private C2993a() {
        }

        public /* synthetic */ C2993a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2992w mo10126a(Type type) {
            C1489j.m6972b(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C2991v(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new C2969i(type);
            }
            if (type instanceof WildcardType) {
                return new C2996z((WildcardType) type);
            }
            return new C2980l(type);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J_ */
    public abstract Type mo10082J_();

    public boolean equals(Object obj) {
        return (obj instanceof C2992w) && C1489j.m6971a((Object) mo10082J_(), (Object) ((C2992w) obj).mo10082J_());
    }

    public int hashCode() {
        return mo10082J_().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(mo10082J_());
        return sb.toString();
    }
}
