package p073b.p085h.p087b.p088a.p141d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2002q;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2010y;
import p073b.p085h.p087b.p088a.p141d.C2992w.C2993a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMethod;", "member", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "hasAnnotationParameterDefaultValue", "", "getHasAnnotationParameterDefaultValue", "()Z", "getMember", "()Ljava/lang/reflect/Method;", "returnType", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReturnType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.s */
/* compiled from: ReflectJavaMethod.kt */
public final class C2987s extends C2986r implements C2002q {

    /* renamed from: a */
    private final Method f8323a;

    public C2987s(Method method) {
        C1489j.m6972b(method, "member");
        this.f8323a = method;
    }

    /* renamed from: h */
    public Method mo10104K_() {
        return this.f8323a;
    }

    /* renamed from: c */
    public List<C2010y> mo7860c() {
        Type[] genericParameterTypes = mo10104K_().getGenericParameterTypes();
        C1489j.m6969a((Object) genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo10104K_().getParameterAnnotations();
        C1489j.m6969a((Object) parameterAnnotations, "member.parameterAnnotations");
        return mo10108a(genericParameterTypes, parameterAnnotations, mo10104K_().isVarArgs());
    }

    /* renamed from: g */
    public C2992w mo7861d() {
        C2993a aVar = C2992w.f8326a;
        Type genericReturnType = mo10104K_().getGenericReturnType();
        C1489j.m6969a((Object) genericReturnType, "member.genericReturnType");
        return aVar.mo10126a(genericReturnType);
    }

    /* renamed from: e */
    public boolean mo7862e() {
        return mo10104K_().getDefaultValue() != null;
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
