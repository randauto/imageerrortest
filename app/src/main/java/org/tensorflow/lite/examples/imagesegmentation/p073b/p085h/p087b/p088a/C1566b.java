package p073b.p085h.p087b.p088a;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p073b.C1511g;
import p073b.C1521h;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.C1448a;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1496q;
import p073b.p079e.p081b.C1497r;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C1525b;
import p073b.p085h.C3135k;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a6\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0002\u001a$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¨\u0006\u0012²\u0006\r\u0010\u0013\u001a\u00020\rX\u0002¢\u0006\u0000²\u0006\r\u0010\u0014\u001a\u00020\tX\u0002¢\u0006\u0000"}, mo10386c = {"createAnnotationInstance", "", "annotationClass", "Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "values", "", "", "throwIllegalArgumentType", "", "index", "", "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflect-api", "hashCode", "toString"})
/* renamed from: b.h.b.a.b */
/* compiled from: AnnotationConstructorCaller.kt */
public final class C1566b {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f4937a = {C1503v.m7003a((C1496q) new C1497r(C1503v.m7000a(C1566b.class, "kotlin-reflect-api"), "hashCode", "<v#0>")), C1503v.m7003a((C1496q) new C1497r(C1503v.m7000a(C1566b.class, "kotlin-reflect-api"), "toString", "<v#1>"))};

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"equals", "", "other", "", "invoke"})
    /* renamed from: b.h.b.a.b$a */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C1567a extends C1490k implements C1450b<Object, Boolean> {

        /* renamed from: a */
        final /* synthetic */ Class f4938a;

        /* renamed from: b */
        final /* synthetic */ List f4939b;

        /* renamed from: c */
        final /* synthetic */ Map f4940c;

        C1567a(Class cls, List list, Map map) {
            this.f4938a = cls;
            this.f4939b = list;
            this.f4940c = map;
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo7046b(obj));
        }

        /* renamed from: b */
        public final boolean mo7046b(Object obj) {
            boolean z;
            boolean z2;
            Class cls = null;
            Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
            if (annotation != null) {
                C1525b a = C1448a.m6937a(annotation);
                if (a != null) {
                    cls = C1448a.m6938a(a);
                }
            }
            if (C1489j.m6971a((Object) cls, (Object) this.f4938a)) {
                Iterable iterable = this.f4939b;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Method method = (Method) it.next();
                        Object obj2 = this.f4940c.get(method.getName());
                        Object invoke = method.invoke(obj, new Object[0]);
                        if (obj2 instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(zArr, (boolean[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.BooleanArray");
                            }
                        } else if (obj2 instanceof char[]) {
                            char[] cArr = (char[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(cArr, (char[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.CharArray");
                            }
                        } else if (obj2 instanceof byte[]) {
                            byte[] bArr = (byte[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(bArr, (byte[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        } else if (obj2 instanceof short[]) {
                            short[] sArr = (short[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(sArr, (short[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.ShortArray");
                            }
                        } else if (obj2 instanceof int[]) {
                            int[] iArr = (int[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(iArr, (int[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.IntArray");
                            }
                        } else if (obj2 instanceof float[]) {
                            float[] fArr = (float[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(fArr, (float[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.FloatArray");
                            }
                        } else if (obj2 instanceof long[]) {
                            long[] jArr = (long[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(jArr, (long[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.LongArray");
                            }
                        } else if (obj2 instanceof double[]) {
                            double[] dArr = (double[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(dArr, (double[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.DoubleArray");
                            }
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (invoke != null) {
                                z2 = Arrays.equals(objArr, (Object[]) invoke);
                                continue;
                            } else {
                                throw new C3227u("null cannot be cast to non-null type kotlin.Array<*>");
                            }
                        } else {
                            z2 = C1489j.m6971a(obj2, invoke);
                            continue;
                        }
                        if (!z2) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052,\u0010\u0006\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, mo10386c = {"<anonymous>", "", "<anonymous parameter 0>", "kotlin.jvm.PlatformType", "method", "Ljava/lang/reflect/Method;", "args", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"})
    /* renamed from: b.h.b.a.b$b */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C1568b implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Class f4941a;

        /* renamed from: b */
        final /* synthetic */ C1511g f4942b;

        /* renamed from: c */
        final /* synthetic */ C3135k f4943c;

        /* renamed from: d */
        final /* synthetic */ C1511g f4944d;

        /* renamed from: e */
        final /* synthetic */ C3135k f4945e;

        /* renamed from: f */
        final /* synthetic */ C1567a f4946f;

        /* renamed from: g */
        final /* synthetic */ Map f4947g;

        C1568b(Class cls, C1511g gVar, C3135k kVar, C1511g gVar2, C3135k kVar2, C1567a aVar, Map map) {
            this.f4941a = cls;
            this.f4942b = gVar;
            this.f4943c = kVar;
            this.f4944d = gVar2;
            this.f4945e = kVar2;
            this.f4946f = aVar;
            this.f4947g = map;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            C1489j.m6969a((Object) method, "method");
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f4941a;
                        }
                    } else if (name.equals("hashCode")) {
                        C1511g gVar = this.f4944d;
                        C3135k kVar = this.f4945e;
                        return gVar.mo6918a();
                    }
                } else if (name.equals("toString")) {
                    C1511g gVar2 = this.f4942b;
                    C3135k kVar2 = this.f4943c;
                    return gVar2.mo6918a();
                }
            }
            if (C1489j.m6971a((Object) name, (Object) "equals") && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(this.f4946f.mo7046b(C1406e.m6821f(objArr)));
            }
            if (this.f4947g.containsKey(name)) {
                return this.f4947g.get(name);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(C1406e.m6823h(objArr));
            sb.append(')');
            throw new C1548aa(sb.toString());
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "invoke"})
    /* renamed from: b.h.b.a.b$c */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C1569c extends C1490k implements C1449a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Map f4948a;

        C1569c(Map map) {
            this.f4948a = map;
            super(0);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6823a() {
            return Integer.valueOf(mo7048b());
        }

        /* renamed from: b */
        public final int mo7048b() {
            int i;
            int i2 = 0;
            for (Entry entry : this.f4948a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    i = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    i = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    i = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    i = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    i = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    i = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    i = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    i = Arrays.hashCode((double[]) value);
                } else if (value instanceof Object[]) {
                    i = Arrays.hashCode((Object[]) value);
                } else {
                    i = value.hashCode();
                }
                i2 += i ^ (str.hashCode() * 127);
            }
            return i2;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "invoke"})
    /* renamed from: b.h.b.a.b$d */
    /* compiled from: AnnotationConstructorCaller.kt */
    static final class C1570d extends C1490k implements C1449a<String> {

        /* renamed from: a */
        final /* synthetic */ Class f4949a;

        /* renamed from: b */
        final /* synthetic */ Map f4950b;

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010&\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "entry", "", "", "invoke"})
        /* renamed from: b.h.b.a.b$d$a */
        /* compiled from: AnnotationConstructorCaller.kt */
        static final class C1571a extends C1490k implements C1450b<Entry<? extends String, ? extends Object>, String> {

            /* renamed from: a */
            public static final C1571a f4951a = new C1571a();

            C1571a() {
                super(1);
            }

            /* renamed from: a */
            public final String mo6756a(Entry<String, ? extends Object> entry) {
                String str;
                C1489j.m6972b(entry, "entry");
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    str = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    str = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    str = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    str = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    str = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    str = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    str = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    str = Arrays.toString((double[]) value);
                } else if (value instanceof Object[]) {
                    str = Arrays.toString((Object[]) value);
                } else {
                    str = value.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append('=');
                sb.append(str);
                return sb.toString();
            }
        }

        C1570d(Class cls, Map map) {
            this.f4949a = cls;
            this.f4950b = map;
            super(0);
        }

        /* renamed from: b */
        public final String mo6823a() {
            StringBuilder sb = new StringBuilder();
            sb.append('@');
            sb.append(this.f4949a.getCanonicalName());
            C1415k.m6857a(this.f4950b.entrySet(), sb, ", ", "(", ")", 0, null, C1571a.f4951a, 48, null);
            String sb2 = sb.toString();
            C1489j.m6969a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Object m7158b(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof C1525b) {
            obj = C1448a.m6938a((C1525b) obj);
        } else if (obj instanceof Object[]) {
            Object obj2 = (Object[]) obj;
            if (obj2 instanceof Class[]) {
                return null;
            }
            if (!(obj2 instanceof C1525b[])) {
                obj = obj2;
            } else if (obj != null) {
                C1525b[] bVarArr = (C1525b[]) obj;
                Collection arrayList = new ArrayList(bVarArr.length);
                for (C1525b a : bVarArr) {
                    arrayList.add(C1448a.m6938a(a));
                }
                obj = ((List) arrayList).toArray(new Class[0]);
                if (obj == null) {
                    throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new C3227u("null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
            }
        }
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Void m7159b(int i, String str, Class<?> cls) {
        C1525b bVar;
        String str2;
        if (C1489j.m6971a((Object) cls, (Object) Class.class)) {
            bVar = C1503v.m6999a(C1525b.class);
        } else if (!cls.isArray() || !C1489j.m6971a((Object) cls.getComponentType(), (Object) Class.class)) {
            bVar = C1448a.m6936a(cls);
        } else {
            bVar = C1503v.m6999a(C1525b[].class);
        }
        if (C1489j.m6971a((Object) bVar.mo6934c(), (Object) C1503v.m6999a(Object[].class).mo6934c())) {
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.mo6934c());
            sb.append('<');
            Class componentType = C1448a.m6938a(bVar).getComponentType();
            C1489j.m6969a((Object) componentType, "kotlinClass.java.componentType");
            sb.append(C1448a.m6936a(componentType).mo6934c());
            sb.append('>');
            str2 = sb.toString();
        } else {
            str2 = bVar.mo6934c();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Argument #");
        sb2.append(i);
        sb2.append(' ');
        sb2.append(str);
        sb2.append(" is not of the required type ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Object m7157b(Class<?> cls, List<Method> list, Map<String, ? extends Object> map) {
        C1567a aVar = new C1567a(cls, list, map);
        C1511g a = C1521h.m14706a(new C1569c(map));
        C3135k kVar = f4937a[0];
        C1511g a2 = C1521h.m14706a(new C1570d(cls, map));
        C3135k kVar2 = f4937a[1];
        ClassLoader classLoader = cls.getClassLoader();
        Class[] clsArr = {cls};
        C1568b bVar = new C1568b(cls, a2, kVar2, a, kVar, aVar, map);
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, clsArr, bVar);
        C1489j.m6969a(newProxyInstance, "Proxy.newProxyInstance(a…        }\n        }\n    }");
        return newProxyInstance;
    }
}
