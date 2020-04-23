package p073b.p085h.p087b.p088a.p141d;

import java.lang.annotation.Annotation;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1987b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "Factory", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.d */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public abstract class C2962d implements C1987b {

    /* renamed from: a */
    public static final C2963a f8301a = new C2963a(null);

    /* renamed from: b */
    private final C2360f f8302b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "value", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "descriptors.runtime"})
    /* renamed from: b.h.b.a.d.d$a */
    /* compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class C2963a {
        private C2963a() {
        }

        public /* synthetic */ C2963a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C2962d mo10080a(Object obj, C2360f fVar) {
            C1489j.m6972b(obj, "value");
            if (C2958b.m14086b(obj.getClass())) {
                return new C2983o(fVar, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new C2964e(fVar, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new C2968h(fVar, (Object[]) obj);
            }
            if (obj instanceof Class) {
                return new C2979k(fVar, (Class) obj);
            }
            return new C2985q(fVar, obj);
        }
    }

    public C2962d(C2360f fVar) {
        this.f8302b = fVar;
    }

    /* renamed from: a */
    public C2360f mo7828a() {
        return this.f8302b;
    }
}
