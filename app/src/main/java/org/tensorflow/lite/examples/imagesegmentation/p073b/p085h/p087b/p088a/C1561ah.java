package p073b.p085h.p087b.p088a;

import java.lang.reflect.Method;
import p073b.C3218m;
import p073b.p074a.C1406e;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p141d.C2958b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo10386c = {"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflect-api"})
/* renamed from: b.h.b.a.ah */
/* compiled from: RuntimeTypeMapper.kt */
public final class C1561ah {

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
    /* renamed from: b.h.b.a.ah$a */
    /* compiled from: RuntimeTypeMapper.kt */
    static final class C1562a extends C1490k implements C1450b<Class<?>, String> {

        /* renamed from: a */
        public static final C1562a f4931a = new C1562a();

        C1562a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(Class<?> cls) {
            C1489j.m6969a((Object) cls, "it");
            return C2958b.m14090f(cls);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m7141b(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C1489j.m6969a((Object) parameterTypes, "parameterTypes");
        sb.append(C1406e.m6788a(parameterTypes, "", "(", ")", 0, null, C1562a.f4931a, 24, null));
        Class returnType = method.getReturnType();
        C1489j.m6969a((Object) returnType, "returnType");
        sb.append(C2958b.m14090f(returnType));
        return sb.toString();
    }
}
