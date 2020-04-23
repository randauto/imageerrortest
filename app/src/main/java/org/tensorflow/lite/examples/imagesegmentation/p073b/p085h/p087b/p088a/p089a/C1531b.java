package p073b.p085h.p087b.p088a.p089a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p074a.C1406e;
import p073b.p079e.C1448a;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n.C2138a;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n.C2139b;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n.C2140c;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n.C2141d;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2137n.C2142e;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p141d.C2958b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0001H\u0002J$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u001a\u0010\u0018\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u0019"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/ReflectClassStructure;", "", "()V", "loadClassAnnotations", "", "klass", "Ljava/lang/Class;", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "loadConstructorAnnotations", "memberVisitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "loadFieldAnnotations", "loadMethodAnnotations", "processAnnotation", "annotation", "", "processAnnotationArgumentValue", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationArgumentVisitor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "processAnnotationArguments", "annotationType", "visitMembers", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.b */
/* compiled from: ReflectKotlinClass.kt */
final class C1531b {

    /* renamed from: a */
    public static final C1531b f4898a = new C1531b();

    private C1531b() {
    }

    /* renamed from: a */
    public final void mo6990a(Class<?> cls, C2140c cVar) {
        Annotation[] declaredAnnotations;
        C1489j.m6972b(cls, "klass");
        C1489j.m6972b(cVar, "visitor");
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            C1489j.m6969a((Object) annotation, "annotation");
            m7061a(cVar, annotation);
        }
        cVar.mo8001a();
    }

    /* renamed from: a */
    public final void mo6991a(Class<?> cls, C2141d dVar) {
        C1489j.m6972b(cls, "klass");
        C1489j.m6972b(dVar, "memberVisitor");
        m7062b(cls, dVar);
        m7063c(cls, dVar);
        m7064d(cls, dVar);
    }

    /* renamed from: b */
    private final void m7062b(Class<?> cls, C2141d dVar) {
        Method[] methodArr;
        Annotation[] declaredAnnotations;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            C1489j.m6969a((Object) method, "method");
            C2360f a = C2360f.m11701a(method.getName());
            C1489j.m6969a((Object) a, "Name.identifier(method.name)");
            C2142e a2 = dVar.mo7998a(a, C1547m.f4916a.mo7025a(method));
            if (a2 != null) {
                for (Annotation annotation : method.getDeclaredAnnotations()) {
                    C2140c cVar = a2;
                    C1489j.m6969a((Object) annotation, "annotation");
                    m7061a(cVar, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C1489j.m6969a((Object) parameterAnnotations, "method.parameterAnnotations");
                int length2 = parameterAnnotations.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    Annotation[] annotationArr = parameterAnnotations[i2];
                    int length3 = annotationArr.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        Annotation annotation2 = annotationArr[i3];
                        Class a3 = C1448a.m6938a(C1448a.m6937a(annotation2));
                        C2354a e = C2958b.m14089e(a3);
                        Method[] methodArr2 = declaredMethods;
                        C1489j.m6969a((Object) annotation2, "annotation");
                        C2138a a4 = a2.mo7999a(i2, e, new C1530a(annotation2));
                        if (a4 != null) {
                            f4898a.m7060a(a4, annotation2, a3);
                        }
                        i3++;
                        declaredMethods = methodArr2;
                    }
                    Method[] methodArr3 = declaredMethods;
                }
                methodArr = declaredMethods;
                a2.mo8001a();
            } else {
                methodArr = declaredMethods;
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    /* renamed from: c */
    private final void m7063c(Class<?> cls, C2141d dVar) {
        int i;
        Constructor[] constructorArr;
        Annotation[] declaredAnnotations;
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor constructor = declaredConstructors[i2];
            C2360f c = C2360f.m11703c("<init>");
            C1489j.m6969a((Object) c, "Name.special(\"<init>\")");
            C1547m mVar = C1547m.f4916a;
            C1489j.m6969a((Object) constructor, "constructor");
            C2142e a = dVar.mo7998a(c, mVar.mo7023a(constructor));
            if (a != null) {
                for (Annotation annotation : constructor.getDeclaredAnnotations()) {
                    C2140c cVar = a;
                    C1489j.m6969a((Object) annotation, "annotation");
                    m7061a(cVar, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C1489j.m6969a((Object) parameterAnnotations, "parameterAnnotations");
                Object[] objArr = (Object[]) parameterAnnotations;
                if (!(objArr.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - objArr.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        int length4 = annotationArr.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotationArr[i4];
                            Class a2 = C1448a.m6938a(C1448a.m6937a(annotation2));
                            int i5 = i3 + length2;
                            Constructor[] constructorArr2 = declaredConstructors;
                            C2354a e = C2958b.m14089e(a2);
                            int i6 = length;
                            int i7 = length2;
                            C1489j.m6969a((Object) annotation2, "annotation");
                            C2138a a3 = a.mo7999a(i5, e, new C1530a(annotation2));
                            if (a3 != null) {
                                f4898a.m7060a(a3, annotation2, a2);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i6;
                            length2 = i7;
                        }
                        Constructor[] constructorArr3 = declaredConstructors;
                        int i8 = length;
                        int i9 = length2;
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                a.mo8001a();
            } else {
                constructorArr = declaredConstructors;
                i = length;
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    /* renamed from: d */
    private final void m7064d(Class<?> cls, C2141d dVar) {
        Field[] declaredFields;
        Annotation[] declaredAnnotations;
        for (Field field : cls.getDeclaredFields()) {
            C1489j.m6969a((Object) field, "field");
            C2360f a = C2360f.m11701a(field.getName());
            C1489j.m6969a((Object) a, "Name.identifier(field.name)");
            C2140c a2 = dVar.mo7997a(a, C1547m.f4916a.mo7024a(field), null);
            if (a2 != null) {
                for (Annotation annotation : field.getDeclaredAnnotations()) {
                    C1489j.m6969a((Object) annotation, "annotation");
                    m7061a(a2, annotation);
                }
                a2.mo8001a();
            }
        }
    }

    /* renamed from: a */
    private final void m7061a(C2140c cVar, Annotation annotation) {
        Class a = C1448a.m6938a(C1448a.m6937a(annotation));
        C2138a a2 = cVar.mo8000a(C2958b.m14089e(a), new C1530a(annotation));
        if (a2 != null) {
            f4898a.m7060a(a2, annotation, a);
        }
    }

    /* renamed from: a */
    private final void m7060a(C2138a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                if (invoke == null) {
                    C1489j.m6968a();
                }
                C1489j.m6969a((Object) method, "method");
                C2360f a = C2360f.m11701a(method.getName());
                C1489j.m6969a((Object) a, "Name.identifier(method.name)");
                m7059a(aVar, a, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo8021a();
    }

    /* renamed from: a */
    private final void m7059a(C2138a aVar, C2360f fVar, Object obj) {
        Class cls = obj.getClass();
        if (C1538h.f4904a.contains(cls)) {
            aVar.mo8023a(fVar, obj);
        } else if (C2958b.m14086b(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            C1489j.m6969a((Object) cls, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
            C2354a e = C2958b.m14089e(cls);
            if (obj != null) {
                C2360f a = C2360f.m11701a(((Enum) obj).name());
                C1489j.m6969a((Object) a, "Name.identifier((value as Enum<*>).name)");
                aVar.mo8022a(fVar, e, a);
            } else {
                throw new C3227u("null cannot be cast to non-null type kotlin.Enum<*>");
            }
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Class[] interfaces = cls.getInterfaces();
            C1489j.m6969a((Object) interfaces, "clazz.interfaces");
            Class cls2 = (Class) C1406e.m6821f(interfaces);
            C1489j.m6969a((Object) cls2, "annotationClass");
            C2138a a2 = aVar.mo8019a(fVar, C2958b.m14089e(cls2));
            if (a2 == null) {
                return;
            }
            if (obj != null) {
                m7060a(a2, (Annotation) obj, cls2);
            } else {
                throw new C3227u("null cannot be cast to non-null type kotlin.Annotation");
            }
        } else if (cls.isArray()) {
            C2139b a3 = aVar.mo8020a(fVar);
            if (a3 != null) {
                Class componentType = cls.getComponentType();
                C1489j.m6969a((Object) componentType, "componentType");
                int i = 0;
                if (componentType.isEnum()) {
                    C2354a e2 = C2958b.m14089e(componentType);
                    if (obj != null) {
                        Object[] objArr = (Object[]) obj;
                        int length = objArr.length;
                        while (i < length) {
                            Object obj2 = objArr[i];
                            if (obj2 != null) {
                                C2360f a4 = C2360f.m11701a(((Enum) obj2).name());
                                C1489j.m6969a((Object) a4, "Name.identifier((element as Enum<*>).name)");
                                a3.mo8016a(e2, a4);
                                i++;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.Enum<*>");
                            }
                        }
                    } else {
                        throw new C3227u("null cannot be cast to non-null type kotlin.Array<*>");
                    }
                } else if (obj != null) {
                    Object[] objArr2 = (Object[]) obj;
                    int length2 = objArr2.length;
                    while (i < length2) {
                        a3.mo8017a(objArr2[i]);
                        i++;
                    }
                } else {
                    throw new C3227u("null cannot be cast to non-null type kotlin.Array<*>");
                }
                a3.mo8015a();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported annotation argument value (");
            sb.append(cls);
            sb.append("): ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
    }
}
