package p073b.p079e.p081b;

import java.util.Set;
import p073b.p079e.p081b.p082a.C1474a;
import p073b.p079e.p081b.p082a.C1479f;

/* renamed from: b.e.b.y */
/* compiled from: TypeIntrinsics */
public class C1506y {
    /* renamed from: a */
    private static <T extends Throwable> T m7019a(T t) {
        return C1489j.m6967a(t, C1506y.class.getName());
    }

    /* renamed from: a */
    public static void m7021a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        m7022a(sb.toString());
    }

    /* renamed from: a */
    public static void m7022a(String str) {
        throw m7018a(new ClassCastException(str));
    }

    /* renamed from: a */
    public static ClassCastException m7018a(ClassCastException classCastException) {
        throw ((ClassCastException) m7019a((T) classCastException));
    }

    /* renamed from: a */
    public static Set m7020a(Object obj) {
        if ((obj instanceof C1474a) && !(obj instanceof C1479f)) {
            m7021a(obj, "kotlin.collections.MutableSet");
        }
        return m7023b(obj);
    }

    /* renamed from: b */
    public static Set m7023b(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m7018a(e);
        }
    }
}
