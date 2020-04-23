package p073b.p085h.p087b.p088a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import p073b.C3218m;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p075b.C1435a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2316f.C2318b;
import p073b.p085h.p087b.p088a.p141d.C2958b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.f */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class C2999f {

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.f$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3000a extends C2999f {

        /* renamed from: a */
        private final List<Method> f8333a;

        /* renamed from: b */
        private final Class<?> f8334b;

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo10386c = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
        /* renamed from: b.h.b.a.f$a$a */
        /* compiled from: Comparisons.kt */
        public static final class C3001a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Method method = (Method) t;
                C1489j.m6969a((Object) method, "it");
                Comparable name = method.getName();
                Method method2 = (Method) t2;
                C1489j.m6969a((Object) method2, "it");
                return C1435a.m6922a(name, method2.getName());
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"})
        /* renamed from: b.h.b.a.f$a$b */
        /* compiled from: RuntimeTypeMapper.kt */
        static final class C3002b extends C1490k implements C1450b<Method, String> {

            /* renamed from: a */
            public static final C3002b f8335a = new C3002b();

            C3002b() {
                super(1);
            }

            /* renamed from: a */
            public final String mo6756a(Method method) {
                C1489j.m6969a((Object) method, "it");
                Class returnType = method.getReturnType();
                C1489j.m6969a((Object) returnType, "it.returnType");
                return C2958b.m14090f(returnType);
            }
        }

        public C3000a(Class<?> cls) {
            C1489j.m6972b(cls, "jClass");
            super(null);
            this.f8334b = cls;
            Method[] declaredMethods = this.f8334b.getDeclaredMethods();
            C1489j.m6969a((Object) declaredMethods, "jClass.declaredMethods");
            this.f8333a = C1406e.m6815c((T[]) declaredMethods, (Comparator<? super T>) new C3001a<Object>());
        }

        /* renamed from: b */
        public final List<Method> mo10140b() {
            return this.f8333a;
        }

        /* renamed from: a */
        public String mo10139a() {
            return C1415k.m6859a(this.f8333a, "", "<init>(", ")V", 0, null, C3002b.f8335a, 24, null);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.f$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3003b extends C2999f {

        /* renamed from: a */
        private final Constructor<?> f8336a;

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
        /* renamed from: b.h.b.a.f$b$a */
        /* compiled from: RuntimeTypeMapper.kt */
        static final class C3004a extends C1490k implements C1450b<Class<?>, String> {

            /* renamed from: a */
            public static final C3004a f8337a = new C3004a();

            C3004a() {
                super(1);
            }

            /* renamed from: a */
            public final String mo6756a(Class<?> cls) {
                C1489j.m6969a((Object) cls, "it");
                return C2958b.m14090f(cls);
            }
        }

        public C3003b(Constructor<?> constructor) {
            C1489j.m6972b(constructor, "constructor");
            super(null);
            this.f8336a = constructor;
        }

        /* renamed from: b */
        public final Constructor<?> mo10143b() {
            return this.f8336a;
        }

        /* renamed from: a */
        public String mo10139a() {
            Class[] parameterTypes = this.f8336a.getParameterTypes();
            C1489j.m6969a((Object) parameterTypes, "constructor.parameterTypes");
            return C1406e.m6788a(parameterTypes, "", "<init>(", ")V", 0, null, C3004a.f8337a, 24, null);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "getMethod", "()Ljava/lang/reflect/Method;", "asString", "", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.f$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3005c extends C2999f {

        /* renamed from: a */
        private final Method f8338a;

        public C3005c(Method method) {
            C1489j.m6972b(method, "method");
            super(null);
            this.f8338a = method;
        }

        /* renamed from: b */
        public final Method mo10145b() {
            return this.f8338a;
        }

        /* renamed from: a */
        public String mo10139a() {
            return C1561ah.m7141b(this.f8338a);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", "", "constructorDesc", "getConstructorDesc", "()Ljava/lang/String;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.f$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3006d extends C2999f {

        /* renamed from: a */
        private final String f8339a = this.f8340b.mo8885c();

        /* renamed from: b */
        private final C2318b f8340b;

        public C3006d(C2318b bVar) {
            C1489j.m6972b(bVar, "signature");
            super(null);
            this.f8340b = bVar;
        }

        /* renamed from: b */
        public final String mo10146b() {
            return this.f8340b.mo8884b();
        }

        /* renamed from: a */
        public String mo10139a() {
            return this.f8339a;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", "", "methodDesc", "getMethodDesc", "()Ljava/lang/String;", "methodName", "getMethodName", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.f$e */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C3007e extends C2999f {

        /* renamed from: a */
        private final String f8341a = this.f8342b.mo8885c();

        /* renamed from: b */
        private final C2318b f8342b;

        public C3007e(C2318b bVar) {
            C1489j.m6972b(bVar, "signature");
            super(null);
            this.f8342b = bVar;
        }

        /* renamed from: b */
        public final String mo10147b() {
            return this.f8342b.mo8883a();
        }

        /* renamed from: c */
        public final String mo10148c() {
            return this.f8342b.mo8884b();
        }

        /* renamed from: a */
        public String mo10139a() {
            return this.f8341a;
        }
    }

    /* renamed from: a */
    public abstract String mo10139a();

    private C2999f() {
    }

    public /* synthetic */ C2999f(C1486g gVar) {
        this();
    }
}
