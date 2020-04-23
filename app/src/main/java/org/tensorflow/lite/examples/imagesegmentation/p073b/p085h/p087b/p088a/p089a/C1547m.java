package p073b.p085h.p087b.p088a.p089a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p141d.C2958b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/SignatureSerializer;", "", "()V", "constructorDesc", "", "constructor", "Ljava/lang/reflect/Constructor;", "fieldDesc", "field", "Ljava/lang/reflect/Field;", "methodDesc", "method", "Ljava/lang/reflect/Method;", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.m */
/* compiled from: ReflectKotlinClass.kt */
final class C1547m {

    /* renamed from: a */
    public static final C1547m f4916a = new C1547m();

    private C1547m() {
    }

    /* renamed from: a */
    public final String mo7025a(Method method) {
        Class[] parameterTypes;
        C1489j.m6972b(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class cls : method.getParameterTypes()) {
            C1489j.m6969a((Object) cls, "parameterType");
            sb.append(C2958b.m14090f(cls));
        }
        sb.append(")");
        Class returnType = method.getReturnType();
        C1489j.m6969a((Object) returnType, "method.returnType");
        sb.append(C2958b.m14090f(returnType));
        String sb2 = sb.toString();
        C1489j.m6969a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final String mo7023a(Constructor<?> constructor) {
        Class[] parameterTypes;
        C1489j.m6972b(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class cls : constructor.getParameterTypes()) {
            C1489j.m6969a((Object) cls, "parameterType");
            sb.append(C2958b.m14090f(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        C1489j.m6969a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final String mo7024a(Field field) {
        C1489j.m6972b(field, "field");
        Class type = field.getType();
        C1489j.m6969a((Object) type, "field.type");
        return C2958b.m14090f(type);
    }
}
