package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2008w;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p141d.C2965f.C2966a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "typeVariable", "Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/reflect/TypeVariable;)V", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "getTypeVariable", "()Ljava/lang/reflect/TypeVariable;", "upperBounds", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "getUpperBounds", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "toString", "", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.x */
/* compiled from: ReflectJavaTypeParameter.kt */
public final class C2994x extends C2982n implements C2008w, C2965f {

    /* renamed from: a */
    private final TypeVariable<?> f8327a;

    /* renamed from: b */
    public C2961c mo7830a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C2966a.m14105a(this, bVar);
    }

    /* renamed from: b */
    public boolean mo7832b() {
        return C2966a.m14107b(this);
    }

    /* renamed from: e */
    public List<C2961c> mo7831a() {
        return C2966a.m14106a(this);
    }

    public C2994x(TypeVariable<?> typeVariable) {
        C1489j.m6972b(typeVariable, "typeVariable");
        this.f8327a = typeVariable;
    }

    /* renamed from: d */
    public List<C2980l> mo7872c() {
        Type[] bounds = this.f8327a.getBounds();
        C1489j.m6969a((Object) bounds, "typeVariable.bounds");
        Collection arrayList = new ArrayList(bounds.length);
        for (Type lVar : bounds) {
            arrayList.add(new C2980l(lVar));
        }
        List<C2980l> list = (List) arrayList;
        C2980l lVar2 = (C2980l) C1415k.m6892k(list);
        return C1489j.m6971a((Object) lVar2 != null ? lVar2.mo10082J_() : null, (Object) Object.class) ? C1415k.m6837a() : list;
    }

    /* renamed from: t */
    public AnnotatedElement mo10081t() {
        TypeVariable<?> typeVariable = this.f8327a;
        if (!(typeVariable instanceof AnnotatedElement)) {
            typeVariable = null;
        }
        return (AnnotatedElement) typeVariable;
    }

    /* renamed from: r */
    public C2360f mo7867r() {
        C2360f a = C2360f.m11701a(this.f8327a.getName());
        C1489j.m6969a((Object) a, "Name.identifier(typeVariable.name)");
        return a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2994x) && C1489j.m6971a((Object) this.f8327a, (Object) ((C2994x) obj).f8327a);
    }

    public int hashCode() {
        return this.f8327a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.f8327a);
        return sb.toString();
    }
}
