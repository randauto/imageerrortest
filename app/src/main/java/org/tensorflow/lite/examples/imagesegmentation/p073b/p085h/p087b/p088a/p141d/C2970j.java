package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1488i;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1503v;
import p073b.p079e.p081b.C1505x;
import p073b.p085h.C3123d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1986aa;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1992g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1995j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p141d.C2965f.C2966a;
import p073b.p085h.p087b.p088a.p141d.C2988t.C2989a;
import p073b.p142i.C3161i;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0013\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010;\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020'H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000202018VX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\t8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\f¨\u0006B"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "klass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "constructors", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "getConstructors", "()Ljava/util/List;", "element", "getElement", "()Ljava/lang/Class;", "fields", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "getFields", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "innerClassNames", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getInnerClassNames", "isAnnotationType", "", "()Z", "isEnum", "isInterface", "lightClassOriginKind", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/LightClassOriginKind;", "getLightClassOriginKind", "()Lorg/jetbrains/kotlin/load/java/structure/LightClassOriginKind;", "methods", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "getMethods", "modifiers", "", "getModifiers", "()I", "name", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "outerClass", "getOuterClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "supertypes", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "getSupertypes", "()Ljava/util/Collection;", "typeParameters", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "equals", "other", "", "findInnerClass", "hashCode", "isEnumValuesOrValueOf", "method", "Ljava/lang/reflect/Method;", "toString", "", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.j */
/* compiled from: ReflectJavaClass.kt */
public final class C2970j extends C2982n implements C1992g, C2965f, C2988t {

    /* renamed from: a */
    private final Class<?> f8307a;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "constructor", "Ljava/lang/reflect/Constructor;", "kotlin.jvm.PlatformType", "invoke"})
    /* renamed from: b.h.b.a.d.j$a */
    /* compiled from: ReflectJavaClass.kt */
    static final class C2971a extends C1490k implements C1450b<Constructor<?>, Boolean> {

        /* renamed from: a */
        public static final C2971a f8308a = new C2971a();

        C2971a() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo10096a((Constructor) obj));
        }

        /* renamed from: a */
        public final boolean mo10096a(Constructor<?> constructor) {
            C1489j.m6969a((Object) constructor, "constructor");
            return !constructor.isSynthetic();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0019\u0010\u0002\u001a\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "p1", "Ljava/lang/reflect/Constructor;", "Lkotlin/ParameterName;", "name", "member", "invoke"})
    /* renamed from: b.h.b.a.d.j$b */
    /* compiled from: ReflectJavaClass.kt */
    static final class C2972b extends C1488i implements C1450b<Constructor<?>, C2981m> {

        /* renamed from: c */
        public static final C2972b f8309c = new C2972b();

        C2972b() {
            super(1);
        }

        /* renamed from: f */
        public final C3123d mo6930f() {
            return C1503v.m6999a(C2981m.class);
        }

        /* renamed from: g */
        public final String mo6931g() {
            return "<init>";
        }

        /* renamed from: h */
        public final String mo6932h() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        /* renamed from: a */
        public final C2981m mo6756a(Constructor<?> constructor) {
            C1489j.m6972b(constructor, "p1");
            return new C2981m(constructor);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "field", "Ljava/lang/reflect/Field;", "kotlin.jvm.PlatformType", "invoke"})
    /* renamed from: b.h.b.a.d.j$c */
    /* compiled from: ReflectJavaClass.kt */
    static final class C2973c extends C1490k implements C1450b<Field, Boolean> {

        /* renamed from: a */
        public static final C2973c f8310a = new C2973c();

        C2973c() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo10098a((Field) obj));
        }

        /* renamed from: a */
        public final boolean mo10098a(Field field) {
            C1489j.m6969a((Object) field, "field");
            return !field.isSynthetic();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "p1", "Ljava/lang/reflect/Field;", "Lkotlin/ParameterName;", "name", "member", "invoke"})
    /* renamed from: b.h.b.a.d.j$d */
    /* compiled from: ReflectJavaClass.kt */
    static final class C2974d extends C1488i implements C1450b<Field, C2984p> {

        /* renamed from: c */
        public static final C2974d f8311c = new C2974d();

        C2974d() {
            super(1);
        }

        /* renamed from: f */
        public final C3123d mo6930f() {
            return C1503v.m6999a(C2984p.class);
        }

        /* renamed from: g */
        public final String mo6931g() {
            return "<init>";
        }

        /* renamed from: h */
        public final String mo6932h() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        /* renamed from: a */
        public final C2984p mo6756a(Field field) {
            C1489j.m6972b(field, "p1");
            return new C2984p(field);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
    /* renamed from: b.h.b.a.d.j$e */
    /* compiled from: ReflectJavaClass.kt */
    static final class C2975e extends C1490k implements C1450b<Class<?>, Boolean> {

        /* renamed from: a */
        public static final C2975e f8312a = new C2975e();

        C2975e() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo10100a((Class) obj));
        }

        /* renamed from: a */
        public final boolean mo10100a(Class<?> cls) {
            C1489j.m6969a((Object) cls, "it");
            String simpleName = cls.getSimpleName();
            C1489j.m6969a((Object) simpleName, "it.simpleName");
            return simpleName.length() == 0;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
    /* renamed from: b.h.b.a.d.j$f */
    /* compiled from: ReflectJavaClass.kt */
    static final class C2976f extends C1490k implements C1450b<Class<?>, C2360f> {

        /* renamed from: a */
        public static final C2976f f8313a = new C2976f();

        C2976f() {
            super(1);
        }

        /* renamed from: a */
        public final C2360f mo6756a(Class<?> cls) {
            C1489j.m6969a((Object) cls, "it");
            String simpleName = cls.getSimpleName();
            if (!C2360f.m11702b(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return C2360f.m11701a(simpleName);
            }
            return null;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "method", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"})
    /* renamed from: b.h.b.a.d.j$g */
    /* compiled from: ReflectJavaClass.kt */
    static final class C2977g extends C1490k implements C1450b<Method, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C2970j f8314a;

        C2977g(C2970j jVar) {
            this.f8314a = jVar;
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo10102a((Method) obj));
        }

        /* renamed from: a */
        public final boolean mo10102a(Method method) {
            C1489j.m6969a((Object) method, "method");
            return !method.isSynthetic() && (!this.f8314a.mo7841i() || !this.f8314a.m14115a(method));
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, mo10386c = {"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "p1", "Ljava/lang/reflect/Method;", "Lkotlin/ParameterName;", "name", "member", "invoke"})
    /* renamed from: b.h.b.a.d.j$h */
    /* compiled from: ReflectJavaClass.kt */
    static final class C2978h extends C1488i implements C1450b<Method, C2987s> {

        /* renamed from: c */
        public static final C2978h f8315c = new C2978h();

        C2978h() {
            super(1);
        }

        /* renamed from: f */
        public final C3123d mo6930f() {
            return C1503v.m6999a(C2987s.class);
        }

        /* renamed from: g */
        public final String mo6931g() {
            return "<init>";
        }

        /* renamed from: h */
        public final String mo6932h() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        /* renamed from: a */
        public final C2987s mo6756a(Method method) {
            C1489j.m6972b(method, "p1");
            return new C2987s(method);
        }
    }

    /* renamed from: j */
    public C1986aa mo7842j() {
        return null;
    }

    /* renamed from: B */
    public List<C2961c> mo7831a() {
        return C2966a.m14106a(this);
    }

    /* renamed from: b */
    public C2961c mo7830a(C2355b bVar) {
        C1489j.m6972b(bVar, "fqName");
        return C2966a.m14105a(this, bVar);
    }

    /* renamed from: b */
    public boolean mo7832b() {
        return C2966a.m14107b(this);
    }

    /* renamed from: n */
    public boolean mo7863n() {
        return C2989a.m14218a(this);
    }

    /* renamed from: o */
    public boolean mo7864o() {
        return C2989a.m14219b(this);
    }

    /* renamed from: p */
    public boolean mo7865p() {
        return C2989a.m14220c(this);
    }

    /* renamed from: q */
    public C1723az mo7866q() {
        return C2989a.m14221d(this);
    }

    public C2970j(Class<?> cls) {
        C1489j.m6972b(cls, "klass");
        this.f8307a = cls;
    }

    /* renamed from: u */
    public Class<?> mo10081t() {
        return this.f8307a;
    }

    /* renamed from: v */
    public int mo10091v() {
        return this.f8307a.getModifiers();
    }

    /* renamed from: w */
    public List<C2360f> mo7837e() {
        Class[] declaredClasses = this.f8307a.getDeclaredClasses();
        C1489j.m6969a((Object) declaredClasses, "klass.declaredClasses");
        return C3161i.m14689e(C3161i.m14690f(C3161i.m14683b(C1406e.m6827l(declaredClasses), C2975e.f8312a), C2976f.f8313a));
    }

    /* renamed from: c */
    public C2355b mo7835c() {
        C2355b g = C2958b.m14089e(this.f8307a).mo9008g();
        C1489j.m6969a((Object) g, "klass.classId.asSingleFqName()");
        return g;
    }

    /* renamed from: x */
    public C2970j mo7838f() {
        Class declaringClass = this.f8307a.getDeclaringClass();
        if (declaringClass != null) {
            return new C2970j(declaringClass);
        }
        return null;
    }

    /* renamed from: d */
    public Collection<C1995j> mo7836d() {
        if (C1489j.m6971a((Object) this.f8307a, (Object) Object.class)) {
            return C1415k.m6837a();
        }
        C1505x xVar = new C1505x(2);
        Type genericSuperclass = this.f8307a.getGenericSuperclass();
        if (genericSuperclass == null) {
            genericSuperclass = Object.class;
        }
        xVar.mo6968b(genericSuperclass);
        Type[] genericInterfaces = this.f8307a.getGenericInterfaces();
        C1489j.m6969a((Object) genericInterfaces, "klass.genericInterfaces");
        xVar.mo6966a((Object) genericInterfaces);
        Iterable<Type> b = C1415k.m6840b((T[]) (Type[]) xVar.mo6967a((Object[]) new Type[xVar.mo6965a()]));
        Collection arrayList = new ArrayList(C1415k.m6842a(b, 10));
        for (Type lVar : b) {
            arrayList.add(new C2980l(lVar));
        }
        return (List) arrayList;
    }

    /* renamed from: y */
    public List<C2987s> mo7843k() {
        Method[] declaredMethods = this.f8307a.getDeclaredMethods();
        C1489j.m6969a((Object) declaredMethods, "klass.declaredMethods");
        return C3161i.m14689e(C3161i.m14688e(C3161i.m14677a(C1406e.m6827l(declaredMethods), (C1450b) new C2977g(this)), C2978h.f8315c));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m14115a(Method method) {
        String name = method.getName();
        if (name == null) {
            return false;
        }
        int hashCode = name.hashCode();
        if (hashCode != -823812830) {
            if (hashCode != 231605032 || !name.equals("valueOf")) {
                return false;
            }
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        } else if (!name.equals("values")) {
            return false;
        } else {
            Class[] parameterTypes = method.getParameterTypes();
            C1489j.m6969a((Object) parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: z */
    public List<C2984p> mo7844l() {
        Field[] declaredFields = this.f8307a.getDeclaredFields();
        C1489j.m6969a((Object) declaredFields, "klass.declaredFields");
        return C3161i.m14689e(C3161i.m14688e(C3161i.m14677a(C1406e.m6827l(declaredFields), (C1450b) C2973c.f8310a), C2974d.f8311c));
    }

    /* renamed from: A */
    public List<C2981m> mo7845m() {
        Constructor[] declaredConstructors = this.f8307a.getDeclaredConstructors();
        C1489j.m6969a((Object) declaredConstructors, "klass.declaredConstructors");
        return C3161i.m14689e(C3161i.m14688e(C3161i.m14677a(C1406e.m6827l(declaredConstructors), (C1450b) C2971a.f8308a), C2972b.f8309c));
    }

    /* renamed from: r */
    public C2360f mo7867r() {
        C2360f a = C2360f.m11701a(this.f8307a.getSimpleName());
        C1489j.m6969a((Object) a, "Name.identifier(klass.simpleName)");
        return a;
    }

    /* renamed from: s */
    public List<C2994x> mo7873s() {
        TypeVariable[] typeParameters = this.f8307a.getTypeParameters();
        C1489j.m6969a((Object) typeParameters, "klass.typeParameters");
        Collection arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable xVar : typeParameters) {
            arrayList.add(new C2994x(xVar));
        }
        return (List) arrayList;
    }

    /* renamed from: g */
    public boolean mo7839g() {
        return this.f8307a.isInterface();
    }

    /* renamed from: h */
    public boolean mo7840h() {
        return this.f8307a.isAnnotation();
    }

    /* renamed from: i */
    public boolean mo7841i() {
        return this.f8307a.isEnum();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2970j) && C1489j.m6971a((Object) this.f8307a, (Object) ((C2970j) obj).f8307a);
    }

    public int hashCode() {
        return this.f8307a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.f8307a);
        return sb.toString();
    }
}
