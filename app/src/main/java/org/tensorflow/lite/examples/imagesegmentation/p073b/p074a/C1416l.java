package p073b.p074a;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\b¢\u0006\u0002\u0010\u0005\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\u0004\b\u0000\u0010\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001H\b¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000b\u001a\u0002H\u0006¢\u0006\u0002\u0010\f\u001a1\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0012H\b¨\u0006\u0013"}, mo10386c = {"copyToArrayImpl", "", "", "collection", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "T", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "listOf", "", "element", "(Ljava/lang/Object;)Ljava/util/List;", "copyToArrayOfAny", "isVarargs", "", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"})
/* renamed from: b.a.l */
/* compiled from: CollectionsJVM.kt */
class C1416l {
    /* renamed from: a */
    public static final <T> List<T> m6832a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C1489j.m6969a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m6833a(T[] tArr, boolean z) {
        C1489j.m6972b(tArr, "$receiver");
        if (z && C1489j.m6971a((Object) tArr.getClass(), (Object) Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C1489j.m6969a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
