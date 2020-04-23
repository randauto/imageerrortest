package p073b.p085h.p087b.p088a.p141d;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import p073b.C3218m;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1989d;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationOwner;", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "isDeprecatedInJavaDoc", "", "()Z", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.f */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public interface C2965f extends C1989d {

    @C3218m(mo10384a = {1, 1, 11})
    /* renamed from: b.h.b.a.d.f$a */
    /* compiled from: ReflectJavaAnnotationOwner.kt */
    public static final class C2966a {
        /* renamed from: b */
        public static boolean m14107b(C2965f fVar) {
            return false;
        }

        /* renamed from: a */
        public static List<C2961c> m14106a(C2965f fVar) {
            AnnotatedElement t = fVar.mo10081t();
            if (t != null) {
                Annotation[] declaredAnnotations = t.getDeclaredAnnotations();
                if (declaredAnnotations != null) {
                    List<C2961c> a = C2967g.m14109a(declaredAnnotations);
                    if (a != null) {
                        return a;
                    }
                }
            }
            return C1415k.m6837a();
        }

        /* renamed from: a */
        public static C2961c m14105a(C2965f fVar, C2355b bVar) {
            C1489j.m6972b(bVar, "fqName");
            AnnotatedElement t = fVar.mo10081t();
            if (t != null) {
                Annotation[] declaredAnnotations = t.getDeclaredAnnotations();
                if (declaredAnnotations != null) {
                    return C2967g.m14108a(declaredAnnotations, bVar);
                }
            }
            return null;
        }
    }

    /* renamed from: t */
    AnnotatedElement mo10081t();
}
