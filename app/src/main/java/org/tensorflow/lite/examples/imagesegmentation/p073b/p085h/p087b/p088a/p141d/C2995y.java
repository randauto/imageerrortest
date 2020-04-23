package p073b.p085h.p087b.p088a.p141d;

import java.lang.annotation.Annotation;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2010y;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaValueParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "type", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "reflectAnnotations", "", "", "reflectName", "", "isVararg", "", "(Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;[Ljava/lang/annotation/Annotation;Ljava/lang/String;Z)V", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "isDeprecatedInJavaDoc", "()Z", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "[Ljava/lang/annotation/Annotation;", "getType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "toString", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.y */
/* compiled from: ReflectJavaValueParameter.kt */
public final class C2995y extends C2982n implements C2010y {

    /* renamed from: a */
    private final C2992w f8328a;

    /* renamed from: b */
    private final Annotation[] f8329b;

    /* renamed from: c */
    private final String f8330c;

    /* renamed from: d */
    private final boolean f8331d;

    /* renamed from: b */
    public boolean mo7832b() {
        return false;
    }

    /* renamed from: g */
    public C2992w mo7875d() {
        return this.f8328a;
    }

    /* renamed from: e */
    public boolean mo7876e() {
        return this.f8331d;
    }

    public C2995y(C2992w wVar, Annotation[] annotationArr, String str, boolean z) {
        C1489j.m6972b(wVar, "type");
        C1489j.m6972b(annotationArr, "reflectAnnotations");
        this.f8328a = wVar;
        this.f8329b = annotationArr;
        this.f8330c = str;
        this.f8331d = z;
    }

    /* renamed from: f */
    public List<C2961c> mo7831a() {
        return C2967g.m14109a(this.f8329b);
    }

    /* renamed from: b */
    public C2961c mo7830a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C2967g.m14108a(this.f8329b, bVar);
    }

    /* renamed from: c */
    public C2360f mo7874c() {
        String str = this.f8330c;
        if (str != null) {
            return C2360f.m11704d(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(mo7876e() ? "vararg " : "");
        sb.append(mo7874c());
        sb.append(": ");
        sb.append(mo7875d());
        return sb.toString();
    }
}
