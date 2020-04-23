package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1991f;
import p073b.p085h.p087b.p088a.p141d.C2992w.C2993a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "componentType", "getComponentType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReflectType", "()Ljava/lang/reflect/Type;", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.i */
/* compiled from: ReflectJavaArrayType.kt */
public final class C2969i extends C2992w implements C1991f {

    /* renamed from: b */
    private final C2992w f8305b;

    /* renamed from: c */
    private final Type f8306c;

    public C2969i(Type type) {
        C2992w wVar;
        C1489j.m6972b(type, "reflectType");
        this.f8306c = type;
        Type J_ = mo10082J_();
        if (J_ instanceof GenericArrayType) {
            C2993a aVar = C2992w.f8326a;
            Type genericComponentType = ((GenericArrayType) J_).getGenericComponentType();
            C1489j.m6969a((Object) genericComponentType, "genericComponentType");
            wVar = aVar.mo10126a(genericComponentType);
        } else {
            if (J_ instanceof Class) {
                Class cls = (Class) J_;
                if (cls.isArray()) {
                    C2993a aVar2 = C2992w.f8326a;
                    Class componentType = cls.getComponentType();
                    C1489j.m6969a((Object) componentType, "getComponentType()");
                    wVar = aVar2.mo10126a(componentType);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Not an array type (");
            sb.append(mo10082J_().getClass());
            sb.append("): ");
            sb.append(mo10082J_());
            throw new IllegalArgumentException(sb.toString());
        }
        this.f8305b = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J_ */
    public Type mo10082J_() {
        return this.f8306c;
    }

    /* renamed from: b */
    public C2992w mo7834a() {
        return this.f8305b;
    }
}
