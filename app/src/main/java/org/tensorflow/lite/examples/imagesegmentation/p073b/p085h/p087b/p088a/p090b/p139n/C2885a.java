package p073b.p085h.p087b.p088a.p090b.p139n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.n.a */
/* compiled from: collections.kt */
public final class C2885a {
    /* renamed from: a */
    public static final <K> Map<K, Integer> m13949a(Iterable<? extends K> iterable) {
        C1489j.m6972b(iterable, "$receiver");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final <T> void m13950a(Collection<T> collection, T t) {
        C1489j.m6972b(collection, "$receiver");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: a */
    public static final <K, V> HashMap<K, V> m13947a(int i) {
        return new HashMap<>(m13953d(i));
    }

    /* renamed from: b */
    public static final <E> HashSet<E> m13951b(int i) {
        return new HashSet<>(m13953d(i));
    }

    /* renamed from: c */
    public static final <E> LinkedHashSet<E> m13952c(int i) {
        return new LinkedHashSet<>(m13953d(i));
    }

    /* renamed from: d */
    private static final int m13953d(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    /* renamed from: a */
    public static final <T> List<T> m13948a(ArrayList<T> arrayList) {
        C1489j.m6972b(arrayList, "$receiver");
        switch (arrayList.size()) {
            case 0:
                return C1415k.m6837a();
            case 1:
                return C1415k.m6832a(C1415k.m6883f((List<? extends T>) arrayList));
            default:
                arrayList.trimToSize();
                return arrayList;
        }
    }
}
