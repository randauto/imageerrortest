package p073b.p085h.p087b.p088a.p141d;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "()V", "cache", "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "getCache", "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "setCache", "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V", "buildCache", "member", "Ljava/lang/reflect/Member;", "loadParameterNames", "", "", "Cache", "descriptors.runtime"})
/* renamed from: b.h.b.a.d.a */
/* compiled from: ReflectJavaMember.kt */
final class C2956a {

    /* renamed from: a */
    public static final C2956a f8290a = new C2956a();

    /* renamed from: b */
    private static C2957a f8291b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, mo10386c = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "", "getParameters", "Ljava/lang/reflect/Method;", "getName", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetName", "()Ljava/lang/reflect/Method;", "getGetParameters", "descriptors.runtime"})
    /* renamed from: b.h.b.a.d.a$a */
    /* compiled from: ReflectJavaMember.kt */
    public static final class C2957a {

        /* renamed from: a */
        private final Method f8292a;

        /* renamed from: b */
        private final Method f8293b;

        public C2957a(Method method, Method method2) {
            this.f8292a = method;
            this.f8293b = method2;
        }

        /* renamed from: a */
        public final Method mo10071a() {
            return this.f8292a;
        }

        /* renamed from: b */
        public final Method mo10072b() {
            return this.f8293b;
        }
    }

    private C2956a() {
    }

    /* renamed from: a */
    public final C2957a mo10069a(Member member) {
        C1489j.m6972b(member, "member");
        Class cls = member.getClass();
        try {
            return new C2957a(cls.getMethod("getParameters", new Class[0]), C2958b.m14084a(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C2957a(null, null);
        }
    }

    /* renamed from: b */
    public final List<String> mo10070b(Member member) {
        C1489j.m6972b(member, "member");
        C2957a aVar = f8291b;
        if (aVar == null) {
            aVar = mo10069a(member);
            f8291b = aVar;
        }
        Method a = aVar.mo10071a();
        if (a == null) {
            return null;
        }
        Method b = aVar.mo10072b();
        if (b == null) {
            return null;
        }
        Object invoke = a.invoke(member, new Object[0]);
        if (invoke != null) {
            Object[] objArr = (Object[]) invoke;
            Collection arrayList = new ArrayList(objArr.length);
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object invoke2 = b.invoke(objArr[i], new Object[0]);
                if (invoke2 != null) {
                    arrayList.add((String) invoke2);
                    i++;
                } else {
                    throw new C3227u("null cannot be cast to non-null type kotlin.String");
                }
            }
            return (List) arrayList;
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.Array<*>");
    }
}
