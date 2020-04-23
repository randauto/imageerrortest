package p073b.p085h.p087b.p088a.p141d;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.C1448a;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, mo10386c = {"findAnnotation", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "", "", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "([Ljava/lang/annotation/Annotation;Lorg/jetbrains/kotlin/name/FqName;)Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "", "([Ljava/lang/annotation/Annotation;)Ljava/util/List;", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.g */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public final class C2967g {
    /* renamed from: a */
    public static final List<C2961c> m14109a(Annotation[] annotationArr) {
        C1489j.m6972b(annotationArr, "$receiver");
        Collection arrayList = new ArrayList(annotationArr.length);
        for (Annotation cVar : annotationArr) {
            arrayList.add(new C2961c(cVar));
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public static final C2961c m14108a(Annotation[] annotationArr, C2355b bVar) {
        Annotation annotation;
        C1489j.m6972b(annotationArr, "$receiver");
        C1489j.m6972b(bVar, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (C1489j.m6971a((Object) C2958b.m14089e(C1448a.m6938a(C1448a.m6937a(annotation))).mo9008g(), (Object) bVar)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C2961c(annotation);
        }
        return null;
    }
}
