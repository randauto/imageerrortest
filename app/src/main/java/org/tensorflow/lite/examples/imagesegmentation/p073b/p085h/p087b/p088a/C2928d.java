package p073b.p085h.p087b.p088a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p073b.C3218m;
import p073b.C3227u;
import p073b.C3230x;
import p073b.p074a.C1406e;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001f\b \u0018\u0000 /*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\u00020\u0003:\u001b#$%&'()*+,-./0123456789:;<=B1\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\nH&¢\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001f2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\nH\u0014¢\u0006\u0002\u0010 J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0004R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00028\u0000X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006>"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller;", "M", "Ljava/lang/reflect/Member;", "", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", "", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "arity", "", "getArity", "()I", "getInstanceClass$kotlin_reflect_api", "()Ljava/lang/Class;", "getMember$kotlin_reflect_api", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "getReturnType$kotlin_reflect_api", "()Ljava/lang/reflect/Type;", "call", "args", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "checkObjectInstance", "obj", "BoundClassCompanionFieldGetter", "BoundClassCompanionFieldSetter", "BoundConstructor", "BoundInstanceFieldGetter", "BoundInstanceFieldSetter", "BoundInstanceMethod", "BoundJvmStaticInObject", "BoundJvmStaticInObjectFieldGetter", "BoundJvmStaticInObjectFieldSetter", "BoundStaticMethod", "ClassCompanionFieldGetter", "ClassCompanionFieldSetter", "Companion", "Constructor", "FieldGetter", "FieldSetter", "InstanceFieldGetter", "InstanceFieldSetter", "InstanceMethod", "JvmStaticInObject", "JvmStaticInObjectFieldGetter", "JvmStaticInObjectFieldSetter", "Method", "StaticFieldGetter", "StaticFieldSetter", "StaticMethod", "ThrowingCaller", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.d */
/* compiled from: FunctionCaller.kt */
public abstract class C2928d<M extends Member> {

    /* renamed from: a */
    public static final C2942m f8276a = new C2942m(null);

    /* renamed from: b */
    private final List<Type> f8277b;

    /* renamed from: c */
    private final M f8278c;

    /* renamed from: d */
    private final Type f8279d;

    /* renamed from: e */
    private final Class<?> f8280e;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundClassCompanionFieldGetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "boundReceiver", "", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$a */
    /* compiled from: FunctionCaller.kt */
    public static final class C2929a extends C2944o {

        /* renamed from: b */
        private final Object f8281b;

        public C2929a(Field field, Object obj) {
            C1489j.m6972b(field, "field");
            super(field, false);
            this.f8281b = obj;
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return ((Field) mo10062b()).get(this.f8281b);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$ThrowingCaller;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "", "()V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$aa */
    /* compiled from: FunctionCaller.kt */
    public static final class C2930aa extends C2928d {

        /* renamed from: b */
        public static final C2930aa f8282b = new C2930aa();

        private C2930aa() {
            Class cls = Void.TYPE;
            C1489j.m6969a((Object) cls, "Void.TYPE");
            super(null, cls, null, new Type[0]);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundClassCompanionFieldSetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Field;", "field", "klass", "Ljava/lang/Class;", "(Ljava/lang/reflect/Field;Ljava/lang/Class;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$b */
    /* compiled from: FunctionCaller.kt */
    public static final class C2931b extends C2928d<Field> {
        public C2931b(Field field, Class<?> cls) {
            C1489j.m6972b(field, "field");
            C1489j.m6972b(cls, "klass");
            Member member = field;
            Class cls2 = Void.TYPE;
            C1489j.m6969a((Object) cls2, "Void.TYPE");
            Type type = cls2;
            Type genericType = field.getGenericType();
            C1489j.m6969a((Object) genericType, "field.genericType");
            super(member, type, cls, new Type[]{genericType});
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            ((Field) mo10062b()).set(null, C1406e.m6819e((T[]) objArr));
            return C3230x.f8645a;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundConstructor;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Constructor;", "constructor", "boundReceiver", "", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$c */
    /* compiled from: FunctionCaller.kt */
    public static final class C2932c extends C2928d<Constructor<?>> {

        /* renamed from: b */
        private final Object f8283b;

        public C2932c(Constructor<?> constructor, Object obj) {
            C1489j.m6972b(constructor, "constructor");
            Member member = constructor;
            Class declaringClass = constructor.getDeclaringClass();
            C1489j.m6969a((Object) declaringClass, "constructor.declaringClass");
            Type type = declaringClass;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C1489j.m6969a((Object) genericParameterTypes, "constructor.genericParameterTypes");
            super(member, type, null, genericParameterTypes);
            this.f8283b = obj;
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            Constructor constructor = (Constructor) mo10062b();
            Object[] a = C2928d.f8276a.mo10066a(this.f8283b, objArr);
            return constructor.newInstance(Arrays.copyOf(a, a.length));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundInstanceFieldGetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "boundReceiver", "", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$d */
    /* compiled from: FunctionCaller.kt */
    public static final class C2933d extends C2944o {

        /* renamed from: b */
        private final Object f8284b;

        public C2933d(Field field, Object obj) {
            C1489j.m6972b(field, "field");
            super(field, false);
            this.f8284b = obj;
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return ((Field) mo10062b()).get(this.f8284b);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundInstanceFieldSetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "boundReceiver", "", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$e */
    /* compiled from: FunctionCaller.kt */
    public static final class C2934e extends C2945p {

        /* renamed from: b */
        private final Object f8285b;

        public C2934e(Field field, boolean z, Object obj) {
            C1489j.m6972b(field, "field");
            super(field, z, false);
            this.f8285b = obj;
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            ((Field) mo10062b()).set(this.f8285b, C1406e.m6813c((T[]) objArr));
            return C3230x.f8645a;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundInstanceMethod;", "Lkotlin/reflect/jvm/internal/FunctionCaller$Method;", "method", "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$f */
    /* compiled from: FunctionCaller.kt */
    public static final class C2935f extends C2952w {

        /* renamed from: b */
        private final Object f8286b;

        public C2935f(Method method, Object obj) {
            C1489j.m6972b(method, "method");
            super(method, false, null, 4, null);
            this.f8286b = obj;
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return mo10068a(this.f8286b, objArr);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/FunctionCaller$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$g */
    /* compiled from: FunctionCaller.kt */
    public static final class C2936g extends C2952w {
        public C2936g(Method method) {
            C1489j.m6972b(method, "method");
            super(method, false, null, 4, null);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return mo10068a(null, objArr);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundJvmStaticInObjectFieldGetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$h */
    /* compiled from: FunctionCaller.kt */
    public static final class C2937h extends C2944o {
        public C2937h(Field field) {
            C1489j.m6972b(field, "field");
            super(field, false);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundJvmStaticInObjectFieldSetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$i */
    /* compiled from: FunctionCaller.kt */
    public static final class C2938i extends C2945p {
        public C2938i(Field field, boolean z) {
            C1489j.m6972b(field, "field");
            super(field, z, false);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            ((Field) mo10062b()).set(null, C1406e.m6819e((T[]) objArr));
            return C3230x.f8645a;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$BoundStaticMethod;", "Lkotlin/reflect/jvm/internal/FunctionCaller$Method;", "method", "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$j */
    /* compiled from: FunctionCaller.kt */
    public static final class C2939j extends C2952w {

        /* renamed from: b */
        private final Object f8287b;

        public C2939j(Method method, Object obj) {
            Object obj2;
            C1489j.m6972b(method, "method");
            C2942m mVar = C2928d.f8276a;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            C1489j.m6969a((Object) genericParameterTypes, "method.genericParameterTypes");
            if (genericParameterTypes.length <= 1) {
                obj2 = new Type[0];
            } else {
                obj2 = Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                C1489j.m6969a(obj2, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
                if (obj2 == null) {
                    throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            super(method, false, (Type[]) obj2);
            this.f8287b = obj;
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return mo10068a(null, C2928d.f8276a.mo10066a(this.f8287b, objArr));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$ClassCompanionFieldGetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Field;", "field", "klass", "Ljava/lang/Class;", "(Ljava/lang/reflect/Field;Ljava/lang/Class;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$k */
    /* compiled from: FunctionCaller.kt */
    public static final class C2940k extends C2928d<Field> {
        public C2940k(Field field, Class<?> cls) {
            C1489j.m6972b(field, "field");
            C1489j.m6972b(cls, "klass");
            Member member = field;
            Type genericType = field.getGenericType();
            C1489j.m6969a((Object) genericType, "field.genericType");
            super(member, genericType, cls, new Type[0]);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return ((Field) mo10062b()).get(C1406e.m6813c((T[]) objArr));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$ClassCompanionFieldSetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Field;", "field", "klass", "Ljava/lang/Class;", "(Ljava/lang/reflect/Field;Ljava/lang/Class;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$l */
    /* compiled from: FunctionCaller.kt */
    public static final class C2941l extends C2928d<Field> {
        public C2941l(Field field, Class<?> cls) {
            C1489j.m6972b(field, "field");
            C1489j.m6972b(cls, "klass");
            Member member = field;
            Class cls2 = Void.TYPE;
            C1489j.m6969a((Object) cls2, "Void.TYPE");
            Type type = cls2;
            Type genericType = field.getGenericType();
            C1489j.m6969a((Object) genericType, "field.genericType");
            super(member, type, cls, new Type[]{genericType});
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            ((Field) mo10062b()).set(null, C1406e.m6819e((T[]) objArr));
            return C3230x.f8645a;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0004\"\u0006\b\u0001\u0010\t\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\t0\u0004H\b¢\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004*\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\n¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$Companion;", "", "()V", "argsWithReceiver", "", "receiver", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirst", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstArg", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$m */
    /* compiled from: FunctionCaller.kt */
    public static final class C2942m {
        private C2942m() {
        }

        public /* synthetic */ C2942m(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final Object[] mo10066a(Object obj, Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            Object[] objArr2 = new Object[(objArr.length + 1)];
            objArr2[0] = obj;
            System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
            return objArr2;
        }

        /* renamed from: a */
        public final Object[] mo10067a(Object[] objArr) {
            C1489j.m6972b(objArr, "$receiver");
            C2942m mVar = this;
            if (objArr.length <= 1) {
                return new Object[0];
            }
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
            C1489j.m6969a((Object) copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            if (copyOfRange != null) {
                return copyOfRange;
            }
            throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$Constructor;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$n */
    /* compiled from: FunctionCaller.kt */
    public static final class C2943n extends C2928d<Constructor<?>> {
        public C2943n(Constructor<?> constructor) {
            C1489j.m6972b(constructor, "constructor");
            Member member = constructor;
            Class declaringClass = constructor.getDeclaringClass();
            C1489j.m6969a((Object) declaringClass, "constructor.declaringClass");
            Type type = declaringClass;
            Class declaringClass2 = constructor.getDeclaringClass();
            C1489j.m6969a((Object) declaringClass2, "klass");
            Class declaringClass3 = declaringClass2.getDeclaringClass();
            if (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) {
                declaringClass3 = null;
            }
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            C1489j.m6969a((Object) genericParameterTypes, "constructor.genericParameterTypes");
            super(member, type, declaringClass3, genericParameterTypes);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return ((Constructor) mo10062b()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$FieldGetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$o */
    /* compiled from: FunctionCaller.kt */
    public static abstract class C2944o extends C2928d<Field> {
        public /* synthetic */ C2944o(Field field, boolean z, int i, C1486g gVar) {
            if ((i & 2) != 0) {
                z = !Modifier.isStatic(field.getModifiers());
            }
            this(field, z);
        }

        public C2944o(Field field, boolean z) {
            Class cls;
            C1489j.m6972b(field, "field");
            Member member = field;
            Type genericType = field.getGenericType();
            C1489j.m6969a((Object) genericType, "field.genericType");
            if (z) {
                cls = field.getDeclaringClass();
            } else {
                cls = null;
            }
            super(member, genericType, cls, new Type[0]);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return ((Field) mo10062b()).get(mo10065d() != null ? C1406e.m6813c((T[]) objArr) : null);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0014¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$FieldSetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Field;", "field", "notNull", "", "requiresInstance", "(Ljava/lang/reflect/Field;ZZ)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$p */
    /* compiled from: FunctionCaller.kt */
    public static abstract class C2945p extends C2928d<Field> {

        /* renamed from: b */
        private final boolean f8288b;

        public /* synthetic */ C2945p(Field field, boolean z, boolean z2, int i, C1486g gVar) {
            if ((i & 4) != 0) {
                z2 = !Modifier.isStatic(field.getModifiers());
            }
            this(field, z, z2);
        }

        public C2945p(Field field, boolean z, boolean z2) {
            C1489j.m6972b(field, "field");
            Member member = field;
            Class cls = Void.TYPE;
            C1489j.m6969a((Object) cls, "Void.TYPE");
            Type type = cls;
            Class declaringClass = z2 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            C1489j.m6969a((Object) genericType, "field.genericType");
            super(member, type, declaringClass, new Type[]{genericType});
            this.f8288b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo10063b(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            C2928d.super.mo10063b(objArr);
            if (this.f8288b && C1406e.m6819e((T[]) objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            ((Field) mo10062b()).set(mo10065d() != null ? C1406e.m6813c((T[]) objArr) : null, C1406e.m6819e((T[]) objArr));
            return C3230x.f8645a;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$InstanceFieldGetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$q */
    /* compiled from: FunctionCaller.kt */
    public static final class C2946q extends C2944o {
        public C2946q(Field field) {
            C1489j.m6972b(field, "field");
            super(field, false, 2, null);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$InstanceFieldSetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$r */
    /* compiled from: FunctionCaller.kt */
    public static final class C2947r extends C2945p {
        public C2947r(Field field, boolean z) {
            C1489j.m6972b(field, "field");
            super(field, z, false, 4, null);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$InstanceMethod;", "Lkotlin/reflect/jvm/internal/FunctionCaller$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$s */
    /* compiled from: FunctionCaller.kt */
    public static final class C2948s extends C2952w {
        public C2948s(Method method) {
            C1489j.m6972b(method, "method");
            super(method, false, null, 6, null);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return mo10068a(objArr[0], C2928d.f8276a.mo10067a(objArr));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/FunctionCaller$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$t */
    /* compiled from: FunctionCaller.kt */
    public static final class C2949t extends C2952w {
        public C2949t(Method method) {
            C1489j.m6972b(method, "method");
            super(method, true, null, 4, null);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            mo10061a(C1406e.m6817d((T[]) objArr));
            return mo10068a(null, C2928d.f8276a.mo10067a(objArr));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0014¢\u0006\u0002\u0010\t¨\u0006\n"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$JvmStaticInObjectFieldGetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$u */
    /* compiled from: FunctionCaller.kt */
    public static final class C2950u extends C2944o {
        public C2950u(Field field) {
            C1489j.m6972b(field, "field");
            super(field, true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo10063b(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            super.mo10063b(objArr);
            mo10061a(C1406e.m6817d((T[]) objArr));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0014¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$JvmStaticInObjectFieldSetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$v */
    /* compiled from: FunctionCaller.kt */
    public static final class C2951v extends C2945p {
        public C2951v(Field field, boolean z) {
            C1489j.m6972b(field, "field");
            super(field, z, true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo10063b(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            super.mo10063b(objArr);
            mo10061a(C1406e.m6817d((T[]) objArr));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ%\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0004¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$Method;", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Method;", "method", "requiresInstance", "", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "isVoidMethod", "callMethod", "", "instance", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$w */
    /* compiled from: FunctionCaller.kt */
    public static abstract class C2952w extends C2928d<Method> {

        /* renamed from: b */
        private final boolean f8289b;

        public /* synthetic */ C2952w(Method method, boolean z, Type[] typeArr, int i, C1486g gVar) {
            if ((i & 2) != 0) {
                z = !Modifier.isStatic(method.getModifiers());
            }
            if ((i & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                C1489j.m6969a((Object) typeArr, "method.genericParameterTypes");
            }
            this(method, z, typeArr);
        }

        public C2952w(Method method, boolean z, Type[] typeArr) {
            C1489j.m6972b(method, "method");
            C1489j.m6972b(typeArr, "parameterTypes");
            Member member = method;
            Type genericReturnType = method.getGenericReturnType();
            C1489j.m6969a((Object) genericReturnType, "method.genericReturnType");
            super(member, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
            this.f8289b = C1489j.m6971a((Object) mo10064c(), (Object) Void.TYPE);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo10068a(Object obj, Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            return this.f8289b ? C3230x.f8645a : ((Method) mo10062b()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$StaticFieldGetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$x */
    /* compiled from: FunctionCaller.kt */
    public static final class C2953x extends C2944o {
        public C2953x(Field field) {
            C1489j.m6972b(field, "field");
            super(field, false, 2, null);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$StaticFieldSetter;", "Lkotlin/reflect/jvm/internal/FunctionCaller$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$y */
    /* compiled from: FunctionCaller.kt */
    public static final class C2954y extends C2945p {
        public C2954y(Field field, boolean z) {
            C1489j.m6972b(field, "field");
            super(field, z, false, 4, null);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, mo10386c = {"Lkotlin/reflect/jvm/internal/FunctionCaller$StaticMethod;", "Lkotlin/reflect/jvm/internal/FunctionCaller$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* renamed from: b.h.b.a.d$z */
    /* compiled from: FunctionCaller.kt */
    public static final class C2955z extends C2952w {
        public C2955z(Method method) {
            C1489j.m6972b(method, "method");
            super(method, false, null, 6, null);
        }

        /* renamed from: a */
        public Object mo6987a(Object[] objArr) {
            C1489j.m6972b(objArr, "args");
            mo10063b(objArr);
            return mo10068a(null, objArr);
        }
    }

    /* renamed from: a */
    public abstract Object mo6987a(Object[] objArr);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        if (r2 != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2928d(M r2, java.lang.reflect.Type r3, java.lang.Class<?> r4, java.lang.reflect.Type[] r5) {
        /*
            r1 = this;
            java.lang.String r0 = "returnType"
            p073b.p079e.p081b.C1489j.m6972b(r3, r0)
            java.lang.String r0 = "valueParameterTypes"
            p073b.p079e.p081b.C1489j.m6972b(r5, r0)
            r1.<init>()
            r1.f8278c = r2
            r1.f8279d = r3
            r1.f8280e = r4
            java.lang.Class<?> r2 = r1.f8280e
            if (r2 == 0) goto L_0x0038
            b.e.b.x r3 = new b.e.b.x
            r4 = 2
            r3.<init>(r4)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            r3.mo6968b(r2)
            r3.mo6966a(r5)
            int r2 = r3.mo6965a()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r2 = r3.mo6967a(r2)
            java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
            java.util.List r2 = p073b.p074a.C1415k.m6840b((T[]) r2)
            if (r2 == 0) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            java.util.List r2 = p073b.p074a.C1406e.m6823h(r5)
        L_0x003c:
            r1.f8277b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.C2928d.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    /* renamed from: b */
    public final M mo10062b() {
        return this.f8278c;
    }

    /* renamed from: c */
    public final Type mo10064c() {
        return this.f8279d;
    }

    /* renamed from: d */
    public final Class<?> mo10065d() {
        return this.f8280e;
    }

    /* renamed from: a */
    public final int mo10060a() {
        return this.f8277b.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10063b(Object[] objArr) {
        C1489j.m6972b(objArr, "args");
        if (mo10060a() != objArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Callable expects ");
            sb.append(mo10060a());
            sb.append(" arguments, but ");
            sb.append(objArr.length);
            sb.append(" were provided.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10061a(Object obj) {
        if (obj != null) {
            M m = this.f8278c;
            if (m == null) {
                C1489j.m6968a();
            }
            if (m.getDeclaringClass().isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
    }
}
