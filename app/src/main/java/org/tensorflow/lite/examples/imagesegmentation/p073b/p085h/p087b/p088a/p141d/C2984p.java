package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1999n;
import p073b.p085h.p087b.p088a.p141d.C2992w.C2993a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaField;", "member", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "hasConstantNotNullInitializer", "", "getHasConstantNotNullInitializer", "()Z", "initializerValue", "", "getInitializerValue", "()Ljava/lang/Void;", "isEnumEntry", "getMember", "()Ljava/lang/reflect/Field;", "type", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.p */
/* compiled from: ReflectJavaField.kt */
public final class C2984p extends C2986r implements C1999n {

    /* renamed from: a */
    private final Field f8321a;

    /* renamed from: e */
    public boolean mo7857e() {
        return false;
    }

    public C2984p(Field field) {
        C1489j.m6972b(field, "member");
        this.f8321a = field;
    }

    /* renamed from: h */
    public Field mo10104K_() {
        return this.f8321a;
    }

    /* renamed from: c */
    public boolean mo7855c() {
        return mo10104K_().isEnumConstant();
    }

    /* renamed from: g */
    public C2992w mo7856d() {
        C2993a aVar = C2992w.f8326a;
        Type genericType = mo10104K_().getGenericType();
        C1489j.m6969a((Object) genericType, "member.genericType");
        return aVar.mo10126a(genericType);
    }
}
