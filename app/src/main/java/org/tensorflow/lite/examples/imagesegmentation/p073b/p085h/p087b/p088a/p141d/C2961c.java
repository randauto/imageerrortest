package p073b.p085h.p087b.p088a.p141d;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.C1448a;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1985a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1987b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p141d.C2962d.C2963a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "annotation", "", "(Ljava/lang/annotation/Annotation;)V", "getAnnotation", "()Ljava/lang/annotation/Annotation;", "arguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "getArguments", "()Ljava/util/Collection;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "equals", "", "other", "", "hashCode", "", "resolve", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "toString", "", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.c */
/* compiled from: ReflectJavaAnnotation.kt */
public final class C2961c extends C2982n implements C1985a {

    /* renamed from: a */
    private final Annotation f8300a;

    public C2961c(Annotation annotation) {
        C1489j.m6972b(annotation, "annotation");
        this.f8300a = annotation;
    }

    /* renamed from: e */
    public final Annotation mo10076e() {
        return this.f8300a;
    }

    /* renamed from: a */
    public Collection<C1987b> mo7825a() {
        Method[] declaredMethods = C1448a.m6938a(C1448a.m6937a(this.f8300a)).getDeclaredMethods();
        C1489j.m6969a((Object) declaredMethods, "annotation.annotationClass.java.declaredMethods");
        Collection arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            C2963a aVar = C2962d.f8301a;
            Object invoke = method.invoke(this.f8300a, new Object[0]);
            C1489j.m6969a(invoke, "method.invoke(annotation)");
            C1489j.m6969a((Object) method, "method");
            arrayList.add(aVar.mo10080a(invoke, C2360f.m11701a(method.getName())));
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    public C2354a mo7826b() {
        return C2958b.m14089e(C1448a.m6938a(C1448a.m6937a(this.f8300a)));
    }

    /* renamed from: d */
    public C2970j mo7827c() {
        return new C2970j(C1448a.m6938a(C1448a.m6937a(this.f8300a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2961c) && C1489j.m6971a((Object) this.f8300a, (Object) ((C2961c) obj).f8300a);
    }

    public int hashCode() {
        return this.f8300a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.f8300a);
        return sb.toString();
    }
}
