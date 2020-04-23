package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1985a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1994i;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1995j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2007v;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p141d.C2992w.C2993a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/Collection;", "classifier", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifier;", "getClassifier", "()Lorg/jetbrains/kotlin/load/java/structure/JavaClassifier;", "classifierQualifiedName", "", "getClassifierQualifiedName", "()Ljava/lang/String;", "isDeprecatedInJavaDoc", "", "()Z", "isRaw", "presentableText", "getPresentableText", "getReflectType", "()Ljava/lang/reflect/Type;", "typeArguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "getTypeArguments", "()Ljava/util/List;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.l */
/* compiled from: ReflectJavaClassifierType.kt */
public final class C2980l extends C2992w implements C1995j {

    /* renamed from: b */
    private final C1994i f8317b;

    /* renamed from: c */
    private final Type f8318c;

    /* renamed from: a */
    public C1985a mo7830a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return null;
    }

    /* renamed from: b */
    public boolean mo7832b() {
        return false;
    }

    public C2980l(Type type) {
        C1994i iVar;
        C1489j.m6972b(type, "reflectType");
        this.f8318c = type;
        Type J_ = mo10082J_();
        if (J_ instanceof Class) {
            iVar = new C2970j((Class) J_);
        } else if (J_ instanceof TypeVariable) {
            iVar = new C2994x((TypeVariable) J_);
        } else if (J_ instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) J_).getRawType();
            if (rawType != null) {
                iVar = new C2970j((Class) rawType);
            } else {
                throw new C3227u("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a classifier type (");
            sb.append(J_.getClass());
            sb.append("): ");
            sb.append(J_);
            throw new IllegalStateException(sb.toString());
        }
        this.f8317b = iVar;
    }

    /* renamed from: J_ */
    public Type mo10082J_() {
        return this.f8318c;
    }

    /* renamed from: c */
    public C1994i mo7847c() {
        return this.f8317b;
    }

    /* renamed from: f */
    public String mo7850f() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type not found: ");
        sb.append(mo10082J_());
        throw new UnsupportedOperationException(sb.toString());
    }

    /* renamed from: g */
    public String mo7851g() {
        return mo10082J_().toString();
    }

    /* renamed from: e */
    public boolean mo7849e() {
        Type J_ = mo10082J_();
        if (!(J_ instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) J_).getTypeParameters();
        C1489j.m6969a((Object) typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    /* renamed from: d */
    public List<C2007v> mo7848d() {
        Iterable<Type> a = C2958b.m14085a(mo10082J_());
        C2993a aVar = C2992w.f8326a;
        Collection arrayList = new ArrayList(C1415k.m6842a(a, 10));
        for (Type a2 : a) {
            arrayList.add(aVar.mo10126a(a2));
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public Collection<C1985a> mo7831a() {
        return C1415k.m6837a();
    }
}
