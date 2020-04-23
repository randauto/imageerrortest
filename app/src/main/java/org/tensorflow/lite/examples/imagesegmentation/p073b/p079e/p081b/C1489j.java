package p073b.p079e.p081b;

import java.util.Arrays;
import java.util.List;
import p073b.C1507f;
import p073b.C3229w;

/* renamed from: b.e.b.j */
/* compiled from: Intrinsics */
public class C1489j {
    /* renamed from: a */
    public static int m6965a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private C1489j() {
    }

    /* renamed from: a */
    public static void m6968a() {
        throw ((C1507f) m6966a((T) new C1507f()));
    }

    /* renamed from: a */
    public static void m6970a(String str) {
        throw ((C3229w) m6966a((T) new C3229w(str)));
    }

    /* renamed from: b */
    public static void m6973b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        m6970a(sb.toString());
    }

    /* renamed from: a */
    public static void m6969a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((IllegalStateException) m6966a((T) new IllegalStateException(sb.toString())));
        }
    }

    /* renamed from: b */
    public static void m6972b(Object obj, String str) {
        if (obj == null) {
            m6974c(str);
        }
    }

    /* renamed from: c */
    private static void m6974c(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        throw ((IllegalArgumentException) m6966a((T) new IllegalArgumentException(sb.toString())));
    }

    /* renamed from: a */
    public static boolean m6971a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    private static <T extends Throwable> T m6966a(T t) {
        return m6967a(t, C1489j.class.getName());
    }

    /* renamed from: a */
    static <T extends Throwable> T m6967a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }
}
