package p073b.p085h.p087b.p088a.p141d;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1639h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2006u;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2536c;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaPrimitiveType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPrimitiveType;", "reflectType", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getReflectType", "()Ljava/lang/Class;", "type", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getType", "()Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.v */
/* compiled from: ReflectJavaPrimitiveType.kt */
public final class C2991v extends C2992w implements C2006u {

    /* renamed from: b */
    private final Class<?> f8325b;

    public C2991v(Class<?> cls) {
        C1489j.m6972b(cls, "reflectType");
        this.f8325b = cls;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Class<?> mo10082J_() {
        return this.f8325b;
    }

    /* renamed from: a */
    public C1639h mo7871a() {
        if (C1489j.m6971a((Object) mo10082J_(), (Object) Void.TYPE)) {
            return null;
        }
        C2536c a = C2536c.m12660a(mo10082J_().getName());
        C1489j.m6969a((Object) a, "JvmPrimitiveType.get(reflectType.name)");
        return a.mo9559a();
    }
}
