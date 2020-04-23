package p073b.p085h.p087b.p088a.p141d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1996k;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2010y;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaConstructor;", "member", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getMember", "()Ljava/lang/reflect/Constructor;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.m */
/* compiled from: ReflectJavaConstructor.kt */
public final class C2981m extends C2986r implements C1996k {

    /* renamed from: a */
    private final Constructor<?> f8319a;

    public C2981m(Constructor<?> constructor) {
        C1489j.m6972b(constructor, "member");
        this.f8319a = constructor;
    }

    /* renamed from: d */
    public Constructor<?> mo10104K_() {
        return this.f8319a;
    }

    /* renamed from: c */
    public List<C2010y> mo7852c() {
        Type[] genericParameterTypes = mo10104K_().getGenericParameterTypes();
        C1489j.m6969a((Object) genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return C1415k.m6837a();
        }
        Class declaringClass = mo10104K_().getDeclaringClass();
        C1489j.m6969a((Object) declaringClass, "klass");
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            Object[] copyOfRange = Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
            C1489j.m6969a((Object) copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            genericParameterTypes = (Type[]) copyOfRange;
        }
        Annotation[][] parameterAnnotations = mo10104K_().getParameterAnnotations();
        Object[] objArr = (Object[]) parameterAnnotations;
        if (objArr.length >= genericParameterTypes.length) {
            if (objArr.length > genericParameterTypes.length) {
                C1489j.m6969a((Object) parameterAnnotations, "annotations");
                Object[] copyOfRange2 = Arrays.copyOfRange(objArr, objArr.length - genericParameterTypes.length, objArr.length);
                C1489j.m6969a((Object) copyOfRange2, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
                parameterAnnotations = (Annotation[][]) copyOfRange2;
            }
            C1489j.m6969a((Object) genericParameterTypes, "realTypes");
            C1489j.m6969a((Object) parameterAnnotations, "realAnnotations");
            return mo10108a(genericParameterTypes, parameterAnnotations, mo10104K_().isVarArgs());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal generic signature: ");
        sb.append(mo10104K_());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: s */
    public List<C2994x> mo7873s() {
        TypeVariable[] typeParameters = mo10104K_().getTypeParameters();
        C1489j.m6969a((Object) typeParameters, "member.typeParameters");
        Collection arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable xVar : typeParameters) {
            arrayList.add(new C2994x(xVar));
        }
        return (List) arrayList;
    }
}
