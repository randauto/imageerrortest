package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p073b.C1444d;
import p073b.C3218m;
import p073b.C3221p;
import p073b.C3226t;
import p073b.C3227u;
import p073b.p074a.C1389ad;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.C1448a;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p080a.C1451c;
import p073b.p079e.p080a.C1452d;
import p073b.p079e.p080a.C1453e;
import p073b.p079e.p080a.C1454f;
import p073b.p079e.p080a.C1455g;
import p073b.p079e.p080a.C1456h;
import p073b.p079e.p080a.C1457i;
import p073b.p079e.p080a.C1458j;
import p073b.p079e.p080a.C1459k;
import p073b.p079e.p080a.C1460l;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p080a.C1462n;
import p073b.p079e.p080a.C1463o;
import p073b.p079e.p080a.C1464p;
import p073b.p079e.p080a.C1465q;
import p073b.p079e.p080a.C1466r;
import p073b.p079e.p080a.C1467s;
import p073b.p079e.p080a.C1468t;
import p073b.p079e.p080a.C1469u;
import p073b.p079e.p080a.C1470v;
import p073b.p079e.p080a.C1471w;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C1525b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p142i.C3160h;
import p073b.p142i.C3161i;
import p073b.p143j.C3199m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000J\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010$\u001a\u00020%*\u0006\u0012\u0002\b\u00030\u0002\"&\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000\",\u0010\t\u001a \u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\",\u0010\n\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0002\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0019\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u0006&"}, mo10386c = {"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.b */
/* compiled from: reflectClassUtil.kt */
public final class C2958b {

    /* renamed from: a */
    private static final List<C1525b<? extends Object>> f8294a = C1415k.m6840b((T[]) new C1525b[]{C1503v.m6999a(Boolean.TYPE), C1503v.m6999a(Byte.TYPE), C1503v.m6999a(Character.TYPE), C1503v.m6999a(Double.TYPE), C1503v.m6999a(Float.TYPE), C1503v.m6999a(Integer.TYPE), C1503v.m6999a(Long.TYPE), C1503v.m6999a(Short.TYPE)});

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f8295b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f8296c;

    /* renamed from: d */
    private static final Map<Class<? extends C1444d<?>>, Integer> f8297d;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "Ljava/lang/reflect/ParameterizedType;", "it", "invoke"})
    /* renamed from: b.h.b.a.d.b$a */
    /* compiled from: reflectClassUtil.kt */
    static final class C2959a extends C1490k implements C1450b<ParameterizedType, ParameterizedType> {

        /* renamed from: a */
        public static final C2959a f8298a = new C2959a();

        C2959a() {
            super(1);
        }

        /* renamed from: a */
        public final ParameterizedType mo6756a(ParameterizedType parameterizedType) {
            C1489j.m6972b(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (!(ownerType instanceof ParameterizedType)) {
                ownerType = null;
            }
            return (ParameterizedType) ownerType;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/reflect/ParameterizedType;", "invoke"})
    /* renamed from: b.h.b.a.d.b$b */
    /* compiled from: reflectClassUtil.kt */
    static final class C2960b extends C1490k implements C1450b<ParameterizedType, C3160h<? extends Type>> {

        /* renamed from: a */
        public static final C2960b f8299a = new C2960b();

        C2960b() {
            super(1);
        }

        /* renamed from: a */
        public final C3160h<Type> mo6756a(ParameterizedType parameterizedType) {
            C1489j.m6972b(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C1489j.m6969a((Object) actualTypeArguments, "it.actualTypeArguments");
            return C1406e.m6827l(actualTypeArguments);
        }
    }

    /* renamed from: a */
    public static final ClassLoader m14084a(Class<?> cls) {
        C1489j.m6972b(cls, "$receiver");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C1489j.m6969a((Object) systemClassLoader, "ClassLoader.getSystemClassLoader()");
        return systemClassLoader;
    }

    /* renamed from: b */
    public static final boolean m14086b(Class<?> cls) {
        C1489j.m6972b(cls, "$receiver");
        return Enum.class.isAssignableFrom(cls);
    }

    static {
        int i = 0;
        Iterable<C1525b> iterable = f8294a;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C1525b bVar : iterable) {
            arrayList.add(C3226t.m14841a(C1448a.m6940c(bVar), C1448a.m6939b(bVar)));
        }
        f8295b = C1389ad.m6748a((Iterable<? extends C3221p<? extends K, ? extends V>>) (List) arrayList);
        Iterable<C1525b> iterable2 = f8294a;
        Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable2, 10));
        for (C1525b bVar2 : iterable2) {
            arrayList2.add(C3226t.m14841a(C1448a.m6939b(bVar2), C1448a.m6940c(bVar2)));
        }
        f8296c = C1389ad.m6748a((Iterable<? extends C3221p<? extends K, ? extends V>>) (List) arrayList2);
        Iterable<Class> b = C1415k.m6840b((T[]) new Class[]{C1449a.class, C1450b.class, C1461m.class, C1465q.class, C1466r.class, C1467s.class, C1468t.class, C1469u.class, C1470v.class, C1471w.class, C1451c.class, C1452d.class, C1453e.class, C1454f.class, C1455g.class, C1456h.class, C1457i.class, C1458j.class, C1459k.class, C1460l.class, C1462n.class, C1463o.class, C1464p.class});
        Collection arrayList3 = new ArrayList(C1415k.m6842a(b, 10));
        for (Class a : b) {
            int i2 = i + 1;
            arrayList3.add(C3226t.m14841a(a, Integer.valueOf(i)));
            i = i2;
        }
        f8297d = C1389ad.m6748a((Iterable<? extends C3221p<? extends K, ? extends V>>) (List) arrayList3);
    }

    /* renamed from: c */
    public static final Class<?> m14087c(Class<?> cls) {
        C1489j.m6972b(cls, "$receiver");
        return (Class) f8295b.get(cls);
    }

    /* renamed from: d */
    public static final Class<?> m14088d(Class<?> cls) {
        C1489j.m6972b(cls, "$receiver");
        return (Class) f8296c.get(cls);
    }

    /* renamed from: e */
    public static final C2354a m14089e(Class<?> cls) {
        C1489j.m6972b(cls, "$receiver");
        if (cls.isPrimitive()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't compute ClassId for primitive type: ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C1489j.m6969a((Object) simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null) {
                        C2354a e = m14089e(declaringClass);
                        if (e != null) {
                            C2354a a = e.mo9000a(C2360f.m11701a(cls.getSimpleName()));
                            if (a != null) {
                                return a;
                            }
                        }
                    }
                    C2354a a2 = C2354a.m11661a(new C2355b(cls.getName()));
                    C1489j.m6969a((Object) a2, "ClassId.topLevel(FqName(name))");
                    return a2;
                }
            }
            C2355b bVar = new C2355b(cls.getName());
            return new C2354a(bVar.mo9017d(), C2355b.m11673c(bVar.mo9018e()), true);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't compute ClassId for array type: ");
            sb2.append(cls);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: f */
    public static final String m14090f(Class<?> cls) {
        C1489j.m6972b(cls, "$receiver");
        if (C1489j.m6971a((Object) cls, (Object) Void.TYPE)) {
            return "V";
        }
        String name = m14091g(cls).getName();
        C1489j.m6969a((Object) name, "createArrayType().name");
        if (name != null) {
            String substring = name.substring(1);
            C1489j.m6969a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return C3199m.m14754a(substring, '.', '/', false, 4, (Object) null);
        }
        throw new C3227u("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: g */
    public static final Class<?> m14091g(Class<?> cls) {
        C1489j.m6972b(cls, "$receiver");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: a */
    public static final List<Type> m14085a(Type type) {
        C1489j.m6972b(type, "$receiver");
        if (!(type instanceof ParameterizedType)) {
            return C1415k.m6837a();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C3161i.m14689e(C3161i.m14687d(C3161i.m14668a((Object) type, (C1450b) C2959a.f8298a), C2960b.f8299a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C1489j.m6969a((Object) actualTypeArguments, "actualTypeArguments");
        return C1406e.m6823h(actualTypeArguments);
    }
}
