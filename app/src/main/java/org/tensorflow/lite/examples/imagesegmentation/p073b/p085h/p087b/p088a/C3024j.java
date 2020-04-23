package p073b.p085h.p087b.p088a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.C1448a;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1488i;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C1525b;
import p073b.p085h.C3123d;
import p073b.p085h.C3124e;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.C1550ac.C1551a;
import p073b.p085h.p087b.p088a.C1550ac.C1552b;
import p073b.p085h.p087b.p088a.C3048l.C3050b;
import p073b.p085h.p087b.p088a.p089a.C1540j;
import p073b.p085h.p087b.p088a.p090b.p091a.C1622d;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1803l;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1810s;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1649a;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2260u;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2288f;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2387c;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2391f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2566j.C2567a;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2669q;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a.C2608e;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p139n.C2885a;
import p073b.p143j.C3199m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001^B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010M\u001a\u00020%2\b\u0010N\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00132\u0006\u0010Q\u001a\u00020RH\u0016J\u0012\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010U\u001a\u00020VH\u0016J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020T0\u00132\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010X\u001a\u00020VH\u0016J\u0012\u0010Y\u001a\u00020%2\b\u0010Z\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010[\u001a\u00020\\H\u0002J\b\u0010]\u001a\u00020<H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R3\u0010\u001a\u001a$\u0012 \u0012\u001e \u001d*\u000e\u0018\u00010\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R\u0016\u00108\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0014\u0010A\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\bB\u00102R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\rR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\rR\u0016\u0010I\u001a\u0004\u0018\u00010J8VX\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006_"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", "", "()Z", "isCompanion", "isData", "isFinal", "isInner", "isOpen", "isSealed", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflect_api", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflect_api", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", "", "toString", "Data", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.j */
/* compiled from: KClassImpl.kt */
public final class C3024j<T> extends C3048l implements C1525b<T> {

    /* renamed from: a */
    private final C1552b<C3025a> f8368a = C1550ac.m7104a(new C3045b(this));

    /* renamed from: c */
    private final Class<T> f8369c;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010K\u001a\u00020<2\n\u0010L\u001a\u0006\u0012\u0002\b\u00030MH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R\u001d\u0010@\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010>R!\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00128FX\u0002¢\u0006\f\n\u0004\bF\u0010\n\u001a\u0004\bE\u0010\u0015R!\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00128FX\u0002¢\u0006\f\n\u0004\bJ\u0010\n\u001a\u0004\bI\u0010\u0015¨\u0006N"}, mo10386c = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "constructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "objectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.j$a */
    /* compiled from: KClassImpl.kt */
    public final class C3025a extends C3050b {

        /* renamed from: a */
        static final /* synthetic */ C3135k[] f8370a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "annotations", "getAnnotations()Ljava/util/List;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "constructors", "getConstructors()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "supertypes", "getSupertypes()Ljava/util/List;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C3025a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: e */
        private final C1551a f8372e = C1550ac.m7105b(new C3034i(this));

        /* renamed from: f */
        private final C1551a f8373f = C1550ac.m7105b(new C3029d(this));

        /* renamed from: g */
        private final C1551a f8374g = C1550ac.m7105b(new C3040o(this));

        /* renamed from: h */
        private final C1551a f8375h = C1550ac.m7105b(new C3039n(this));

        /* renamed from: i */
        private final C1551a f8376i = C1550ac.m7105b(new C3030e(this));

        /* renamed from: j */
        private final C1551a f8377j = C1550ac.m7105b(new C3037l(this));

        /* renamed from: k */
        private final C1552b f8378k = C1550ac.m7104a(new C3038m(this));

        /* renamed from: l */
        private final C1551a f8379l = C1550ac.m7105b(new C3044q(this));

        /* renamed from: m */
        private final C1551a f8380m = C1550ac.m7105b(new C3041p(this));

        /* renamed from: n */
        private final C1551a f8381n = C1550ac.m7105b(new C3032g(this));

        /* renamed from: o */
        private final C1551a f8382o = C1550ac.m7105b(new C3033h(this));

        /* renamed from: p */
        private final C1551a f8383p = C1550ac.m7105b(new C3035j(this));

        /* renamed from: q */
        private final C1551a f8384q = C1550ac.m7105b(new C3036k(this));

        /* renamed from: r */
        private final C1551a f8385r = C1550ac.m7105b(new C3027b(this));

        /* renamed from: s */
        private final C1551a f8386s = C1550ac.m7105b(new C3028c(this));

        /* renamed from: t */
        private final C1551a f8387t = C1550ac.m7105b(new C3031f(this));

        /* renamed from: u */
        private final C1551a f8388u = C1550ac.m7105b(new C3026a(this));

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$a */
        /* compiled from: KClassImpl.kt */
        static final class C3026a extends C1490k implements C1449a<List<? extends C3013h<?>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8389a;

            C3026a(C3025a aVar) {
                this.f8389a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<C3013h<?>> mo6823a() {
                return C1415k.m6870b(this.f8389a.mo10186e(), (Iterable<? extends T>) this.f8389a.mo10187f());
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$b */
        /* compiled from: KClassImpl.kt */
        static final class C3027b extends C1490k implements C1449a<List<? extends C3013h<?>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8390a;

            C3027b(C3025a aVar) {
                this.f8390a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<C3013h<?>> mo6823a() {
                return C1415k.m6870b(this.f8390a.mo10185d(), (Iterable<? extends T>) this.f8390a.m14339i());
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$c */
        /* compiled from: KClassImpl.kt */
        static final class C3028c extends C1490k implements C1449a<List<? extends C3013h<?>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8391a;

            C3028c(C3025a aVar) {
                this.f8391a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<C3013h<?>> mo6823a() {
                return C1415k.m6870b(this.f8391a.m14338h(), (Iterable<? extends T>) this.f8391a.m14340j());
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$d */
        /* compiled from: KClassImpl.kt */
        static final class C3029d extends C1490k implements C1449a<List<? extends Annotation>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8392a;

            C3029d(C3025a aVar) {
                this.f8392a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<Annotation> mo6823a() {
                return C1563ai.m7150a((C1649a) this.f8392a.mo10182a());
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/KFunction;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$e */
        /* compiled from: KClassImpl.kt */
        static final class C3030e extends C1490k implements C1449a<List<? extends C3124e<? extends T>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8393a;

            C3030e(C3025a aVar) {
                this.f8393a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<C3124e<T>> mo6823a() {
                Iterable<C1803l> b = C3024j.this.mo10041b();
                Collection arrayList = new ArrayList(C1415k.m6842a(b, 10));
                for (C1803l mVar : b) {
                    arrayList.add(new C3057m(C3024j.this, mVar));
                }
                return (List) arrayList;
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$f */
        /* compiled from: KClassImpl.kt */
        static final class C3031f extends C1490k implements C1449a<List<? extends C3013h<?>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8394a;

            C3031f(C3025a aVar) {
                this.f8394a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<C3013h<?>> mo6823a() {
                return C1415k.m6870b(this.f8394a.mo10185d(), (Iterable<? extends T>) this.f8394a.m14338h());
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$g */
        /* compiled from: KClassImpl.kt */
        static final class C3032g extends C1490k implements C1449a<Collection<? extends C3013h<?>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8395a;

            C3032g(C3025a aVar) {
                this.f8395a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final Collection<C3013h<?>> mo6823a() {
                return C3024j.this.mo10212a(C3024j.this.mo10178f(), C3052c.DECLARED);
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$h */
        /* compiled from: KClassImpl.kt */
        static final class C3033h extends C1490k implements C1449a<Collection<? extends C3013h<?>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8396a;

            C3033h(C3025a aVar) {
                this.f8396a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final Collection<C3013h<?>> mo6823a() {
                return C3024j.this.mo10212a(C3024j.this.mo10179g(), C3052c.DECLARED);
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$i */
        /* compiled from: KClassImpl.kt */
        static final class C3034i extends C1490k implements C1449a<C1796e> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8397a;

            C3034i(C3025a aVar) {
                this.f8397a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final C1796e mo6823a() {
                C1796e eVar;
                C2354a a = C3024j.this.m14320j();
                C1540j g = ((C3025a) C3024j.this.mo10175d().mo7026a()).mo10217g();
                if (a.mo9004d()) {
                    eVar = g.mo7010b().mo9714a(a);
                } else {
                    eVar = C1810s.m8443a(g.mo7009a(), a);
                }
                if (eVar != null) {
                    return eVar;
                }
                C3024j.this.m14321k();
                throw null;
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$j */
        /* compiled from: KClassImpl.kt */
        static final class C3035j extends C1490k implements C1449a<Collection<? extends C3013h<?>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8398a;

            C3035j(C3025a aVar) {
                this.f8398a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final Collection<C3013h<?>> mo6823a() {
                return C3024j.this.mo10212a(C3024j.this.mo10178f(), C3052c.INHERITED);
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$k */
        /* compiled from: KClassImpl.kt */
        static final class C3036k extends C1490k implements C1449a<Collection<? extends C3013h<?>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8399a;

            C3036k(C3025a aVar) {
                this.f8399a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final Collection<C3013h<?>> mo6823a() {
                return C3024j.this.mo10212a(C3024j.this.mo10179g(), C3052c.INHERITED);
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "", "kotlin.jvm.PlatformType", "T", "invoke"})
        /* renamed from: b.h.b.a.j$a$l */
        /* compiled from: KClassImpl.kt */
        static final class C3037l extends C1490k implements C1449a<List<? extends C3024j<? extends Object>>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8400a;

            C3037l(C3025a aVar) {
                this.f8400a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<C3024j<? extends Object>> mo6823a() {
                Iterable a = C2567a.m12758a(this.f8400a.mo10182a().mo7352C(), null, null, 3, null);
                Collection arrayList = new ArrayList();
                for (Object next : a) {
                    if (!C2523c.m12604l((C1804m) next)) {
                        arrayList.add(next);
                    }
                }
                Iterable<C1804m> iterable = (List) arrayList;
                Collection arrayList2 = new ArrayList();
                for (C1804m mVar : iterable) {
                    if (mVar != null) {
                        Class a2 = C1563ai.m7147a((C1796e) mVar);
                        Object jVar = a2 != null ? new C3024j(a2) : null;
                        if (jVar != null) {
                            arrayList2.add(jVar);
                        }
                    } else {
                        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                }
                return (List) arrayList2;
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo10386c = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"})
        /* renamed from: b.h.b.a.j$a$m */
        /* compiled from: KClassImpl.kt */
        static final class C3038m extends C1490k implements C1449a<T> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8401a;

            C3038m(C3025a aVar) {
                this.f8401a = aVar;
                super(0);
            }

            /* renamed from: a */
            public final T mo6823a() {
                Field field;
                C1796e a = this.f8401a.mo10182a();
                if (a.mo7073l() != C1797f.OBJECT) {
                    return null;
                }
                if (!a.mo7078q() || C1622d.f5064a.mo7175a(a)) {
                    field = C3024j.this.mo6933a().getDeclaredField("INSTANCE");
                } else {
                    field = C3024j.this.mo6933a().getEnclosingClass().getDeclaredField(a.mo7351z_().mo9039a());
                }
                T t = field.get(null);
                if (t != null) {
                    return t;
                }
                throw new C3227u("null cannot be cast to non-null type T");
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$n */
        /* compiled from: KClassImpl.kt */
        static final class C3039n extends C1490k implements C1449a<String> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8402a;

            C3039n(C3025a aVar) {
                this.f8402a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final String mo6823a() {
                String str = null;
                if (C3024j.this.mo6933a().isAnonymousClass()) {
                    return null;
                }
                C2354a a = C3024j.this.m14320j();
                if (!a.mo9004d()) {
                    str = a.mo9008g().mo9013a();
                }
                return str;
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$o */
        /* compiled from: KClassImpl.kt */
        static final class C3040o extends C1490k implements C1449a<String> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8403a;

            C3040o(C3025a aVar) {
                this.f8403a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final String mo6823a() {
                String str;
                if (C3024j.this.mo6933a().isAnonymousClass()) {
                    return null;
                }
                C2354a a = C3024j.this.m14320j();
                if (a.mo9004d()) {
                    str = this.f8403a.m14334a(C3024j.this.mo6933a());
                } else {
                    str = a.mo9003c().mo9039a();
                    C1489j.m6969a((Object) str, "classId.shortClassName.asString()");
                }
                return str;
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$p */
        /* compiled from: KClassImpl.kt */
        static final class C3041p extends C1490k implements C1449a<List<? extends C3111x>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8404a;

            @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo10386c = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke", "kotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2$1$1"})
            /* renamed from: b.h.b.a.j$a$p$a */
            /* compiled from: KClassImpl.kt */
            static final class C3043a extends C1490k implements C1449a<Type> {

                /* renamed from: a */
                final /* synthetic */ C2841w f8406a;

                /* renamed from: b */
                final /* synthetic */ C3041p f8407b;

                C3043a(C2841w wVar, C3041p pVar) {
                    this.f8406a = wVar;
                    this.f8407b = pVar;
                    super(0);
                }

                /* renamed from: b */
                public final Type mo6823a() {
                    C1799h d = this.f8406a.mo9507g().mo7096d();
                    if (d instanceof C1796e) {
                        Class a = C1563ai.m7147a((C1796e) d);
                        if (a == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unsupported superclass of ");
                            sb.append(this.f8407b.f8404a);
                            sb.append(": ");
                            sb.append(d);
                            throw new C1548aa(sb.toString());
                        } else if (C1489j.m6971a((Object) C3024j.this.mo6933a().getSuperclass(), (Object) a)) {
                            Type genericSuperclass = C3024j.this.mo6933a().getGenericSuperclass();
                            C1489j.m6969a((Object) genericSuperclass, "jClass.genericSuperclass");
                            return genericSuperclass;
                        } else {
                            Class[] interfaces = C3024j.this.mo6933a().getInterfaces();
                            C1489j.m6969a((Object) interfaces, "jClass.interfaces");
                            int b = C1406e.m6800b((T[]) interfaces, a);
                            if (b >= 0) {
                                Type type = C3024j.this.mo6933a().getGenericInterfaces()[b];
                                C1489j.m6969a((Object) type, "jClass.genericInterfaces[index]");
                                return type;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("No superclass of ");
                            sb2.append(this.f8407b.f8404a);
                            sb2.append(" in Java reflection for ");
                            sb2.append(d);
                            throw new C1548aa(sb2.toString());
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Supertype not a class: ");
                        sb3.append(d);
                        throw new C1548aa(sb3.toString());
                    }
                }
            }

            C3041p(C3025a aVar) {
                this.f8404a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<C3111x> mo6823a() {
                boolean z;
                C2767an e = this.f8404a.mo10182a().mo7067e();
                C1489j.m6969a((Object) e, "descriptor.typeConstructor");
                Collection<C2841w> C_ = e.mo7405C_();
                ArrayList arrayList = new ArrayList(C_.size());
                C1489j.m6969a((Object) C_, "kotlinTypes");
                for (C2841w wVar : C_) {
                    Collection collection = arrayList;
                    C1489j.m6969a((Object) wVar, "kotlinType");
                    collection.add(new C3111x(wVar, new C3043a(wVar, this)));
                }
                Collection collection2 = arrayList;
                if (!C1627g.m7408c(this.f8404a.mo10182a())) {
                    Iterable iterable = arrayList;
                    boolean z2 = true;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C1796e b = C2523c.m12591b(((C3111x) it.next()).mo10310c());
                            C1489j.m6969a((Object) b, "DescriptorUtils.getClassDescriptorForType(it.type)");
                            C1797f l = b.mo7073l();
                            if (l == C1797f.INTERFACE || l == C1797f.ANNOTATION_CLASS) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (!z) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        C2755ad s = C2524a.m12627d(this.f8404a.mo10182a()).mo7206s();
                        C1489j.m6969a((Object) s, "descriptor.builtIns.anyType");
                        collection2.add(new C3111x(s, C30421.f8405a));
                    }
                }
                return C2885a.m13948a(arrayList);
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "T", "", "invoke"})
        /* renamed from: b.h.b.a.j$a$q */
        /* compiled from: KClassImpl.kt */
        static final class C3044q extends C1490k implements C1449a<List<? extends C3117z>> {

            /* renamed from: a */
            final /* synthetic */ C3025a f8408a;

            C3044q(C3025a aVar) {
                this.f8408a = aVar;
                super(0);
            }

            /* renamed from: b */
            public final List<C3117z> mo6823a() {
                List z = this.f8408a.mo10182a().mo7090z();
                C1489j.m6969a((Object) z, "descriptor.declaredTypeParameters");
                Iterable<C1700ar> iterable = z;
                Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
                for (C1700ar zVar : iterable) {
                    arrayList.add(new C3117z(zVar));
                }
                return (List) arrayList;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final Collection<C3013h<?>> m14338h() {
            return (Collection) this.f8382o.mo7028a(this, f8370a[10]);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final Collection<C3013h<?>> m14339i() {
            return (Collection) this.f8383p.mo7028a(this, f8370a[11]);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final Collection<C3013h<?>> m14340j() {
            return (Collection) this.f8384q.mo7028a(this, f8370a[12]);
        }

        /* renamed from: a */
        public final C1796e mo10182a() {
            return (C1796e) this.f8372e.mo7028a(this, f8370a[0]);
        }

        /* renamed from: b */
        public final String mo10183b() {
            return (String) this.f8374g.mo7028a(this, f8370a[2]);
        }

        /* renamed from: c */
        public final String mo10184c() {
            return (String) this.f8375h.mo7028a(this, f8370a[3]);
        }

        /* renamed from: d */
        public final Collection<C3013h<?>> mo10185d() {
            return (Collection) this.f8381n.mo7028a(this, f8370a[9]);
        }

        /* renamed from: e */
        public final Collection<C3013h<?>> mo10186e() {
            return (Collection) this.f8385r.mo7028a(this, f8370a[13]);
        }

        /* renamed from: f */
        public final Collection<C3013h<?>> mo10187f() {
            return (Collection) this.f8386s.mo7028a(this, f8370a[14]);
        }

        public C3025a() {
            super();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final String m14334a(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C1489j.m6969a((Object) simpleName, "name");
                StringBuilder sb = new StringBuilder();
                sb.append(enclosingMethod.getName());
                sb.append("$");
                return C3199m.m14804b(simpleName, sb.toString(), (String) null, 2, (Object) null);
            }
            Constructor enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C1489j.m6969a((Object) simpleName, "name");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(enclosingConstructor.getName());
                sb2.append("$");
                return C3199m.m14804b(simpleName, sb2.toString(), (String) null, 2, (Object) null);
            }
            C1489j.m6969a((Object) simpleName, "name");
            return C3199m.m14802b(simpleName, '$', (String) null, 2, (Object) null);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "invoke"})
    /* renamed from: b.h.b.a.j$b */
    /* compiled from: KClassImpl.kt */
    static final class C3045b extends C1490k implements C1449a<C3025a> {

        /* renamed from: a */
        final /* synthetic */ C3024j f8409a;

        C3045b(C3024j jVar) {
            this.f8409a = jVar;
            super(0);
        }

        /* renamed from: b */
        public final C3025a mo6823a() {
            return new C3025a<>();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "T", "", "p1", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p2", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "Lkotlin/ParameterName;", "name", "proto", "invoke"})
    /* renamed from: b.h.b.a.j$c */
    /* compiled from: KClassImpl.kt */
    static final class C3046c extends C1488i implements C1461m<C2669q, C2260u, C1687ah> {

        /* renamed from: c */
        public static final C3046c f8410c = new C3046c();

        C3046c() {
            super(2);
        }

        /* renamed from: f */
        public final C3123d mo6930f() {
            return C1503v.m6999a(C2669q.class);
        }

        /* renamed from: g */
        public final String mo6931g() {
            return "loadProperty";
        }

        /* renamed from: h */
        public final String mo6932h() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        /* renamed from: a */
        public final C1687ah mo6920a(C2669q qVar, C2260u uVar) {
            C1489j.m6972b(qVar, "p1");
            C1489j.m6972b(uVar, "p2");
            return qVar.mo9753a(uVar);
        }
    }

    public C3024j(Class<T> cls) {
        C1489j.m6972b(cls, "jClass");
        this.f8369c = cls;
    }

    /* renamed from: a */
    public Class<T> mo6933a() {
        return this.f8369c;
    }

    /* renamed from: d */
    public final C1552b<C3025a> mo10175d() {
        return this.f8368a;
    }

    /* renamed from: e */
    public C1796e mo10176e() {
        return ((C3025a) this.f8368a.mo7026a()).mo10182a();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C2354a m14320j() {
        return C1560ag.f4929a.mo7038a(mo6933a());
    }

    /* renamed from: f */
    public final C2560h mo10178f() {
        return mo10176e().mo7346A_().mo7787b();
    }

    /* renamed from: g */
    public final C2560h mo10179g() {
        C2560h x_ = mo10176e().mo7087x_();
        C1489j.m6969a((Object) x_, "descriptor.staticScope");
        return x_;
    }

    /* renamed from: b */
    public Collection<C1803l> mo10041b() {
        C1796e e = mo10176e();
        if (e.mo7073l() == C1797f.INTERFACE || e.mo7073l() == C1797f.OBJECT) {
            return C1415k.m6837a();
        }
        Collection<C1803l> k = e.mo7072k();
        C1489j.m6969a((Object) k, "descriptor.constructors");
        return k;
    }

    /* renamed from: a */
    public Collection<C1687ah> mo10040a(C2360f fVar) {
        C1489j.m6972b(fVar, "name");
        return C1415k.m6870b(mo10178f().mo7443a(fVar, C1830d.FROM_REFLECTION), (Iterable<? extends T>) mo10179g().mo7443a(fVar, C1830d.FROM_REFLECTION));
    }

    /* renamed from: b */
    public Collection<C1813t> mo10042b(C2360f fVar) {
        C1489j.m6972b(fVar, "name");
        return C1415k.m6870b(mo10178f().mo7444b(fVar, C1830d.FROM_REFLECTION), (Iterable<? extends T>) mo10179g().mo7444b(fVar, C1830d.FROM_REFLECTION));
    }

    /* renamed from: a */
    public C1687ah mo10039a(int i) {
        if (C1489j.m6971a((Object) mo6933a().getSimpleName(), (Object) "DefaultImpls")) {
            Class declaringClass = mo6933a().getDeclaringClass();
            if (declaringClass != null && declaringClass.isInterface()) {
                C1525b a = C1448a.m6936a(declaringClass);
                if (a != null) {
                    return ((C3024j) a).mo10039a(i);
                }
                throw new C3227u("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            }
        }
        C1796e e = mo10176e();
        C1687ah ahVar = null;
        if (!(e instanceof C2608e)) {
            e = null;
        }
        C2608e eVar = (C2608e) e;
        if (eVar != null) {
            C2387c H = eVar.mo9643H();
            C2391f<C2216c, List<C2260u>> fVar = C2330b.f7138j;
            C1489j.m6969a((Object) fVar, "JvmProtoBuf.classLocalVariable");
            C2260u uVar = (C2260u) C2288f.m11198a(H, fVar, i);
            if (uVar != null) {
                ahVar = (C1687ah) C1563ai.m7144a(mo6933a(), uVar, eVar.mo9645a().mo9743e(), eVar.mo9645a().mo9745g(), eVar.mo9644I(), C3046c.f8410c);
            }
        }
        return ahVar;
    }

    /* renamed from: w_ */
    public String mo6938w_() {
        return ((C3025a) this.f8368a.mo7026a()).mo10183b();
    }

    /* renamed from: c */
    public String mo6934c() {
        return ((C3025a) this.f8368a.mo7026a()).mo10184c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3024j) && C1489j.m6971a((Object) C1448a.m6940c(this), (Object) C1448a.m6940c((C1525b) obj));
    }

    public int hashCode() {
        return C1448a.m6940c(this).hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        C2354a j = m14320j();
        C2355b a = j.mo9001a();
        C1489j.m6969a((Object) a, "packageFqName");
        if (a.mo9016c()) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.mo9013a());
            sb2.append(".");
            str = sb2.toString();
        }
        String a2 = j.mo9002b().mo9013a();
        C1489j.m6969a((Object) a2, "classId.relativeClassName.asString()");
        String a3 = C3199m.m14754a(a2, '.', '$', false, 4, (Object) null);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(a3);
        sb.append(sb3.toString());
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void m14321k() {
        /*
            r4 = this;
            b.h.b.a.a.e$a r0 = p073b.p085h.p087b.p088a.p089a.C1534e.f4900a
            java.lang.Class r1 = r4.mo6933a()
            b.h.b.a.a.e r0 = r0.mo7004a(r1)
            if (r0 == 0) goto L_0x0017
            b.h.b.a.b.d.b.a.a r0 = r0.mo7000d()
            if (r0 == 0) goto L_0x0017
            b.h.b.a.b.d.b.a.a$a r0 = r0.mo8007d()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0099
            int[] r1 = p073b.p085h.p087b.p088a.C3047k.f8411a
            int r2 = r0.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L_0x0077;
                case 2: goto L_0x0077;
                case 3: goto L_0x0077;
                case 4: goto L_0x0055;
                case 5: goto L_0x002b;
                case 6: goto L_0x0099;
                default: goto L_0x0025;
            }
        L_0x0025:
            b.n r0 = new b.n
            r0.<init>()
            throw r0
        L_0x002b:
            b.h.b.a.aa r1 = new b.h.b.a.aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown class: "
            r2.append(r3)
            java.lang.Class r3 = r4.mo6933a()
            r2.append(r3)
            java.lang.String r3 = " (kind = "
            r2.append(r3)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0055:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection "
            r1.append(r2)
            java.lang.String r2 = "library has no idea what declarations does it have. Please use Java reflection to inspect this class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo6933a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0077:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Packages and file facades are not yet supported in Kotlin reflection. "
            r1.append(r2)
            java.lang.String r2 = "Meanwhile please use Java reflection to inspect this class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo6933a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0099:
            b.h.b.a.aa r0 = new b.h.b.a.aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unresolved class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo6933a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.C3024j.m14321k():java.lang.Void");
    }
}
