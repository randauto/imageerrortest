package p073b.p085h.p087b.p088a.p090b.p136m.p138b;

import java.util.Collection;
import java.util.LinkedHashSet;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.m.b.a */
/* compiled from: scopeUtils.kt */
public final class C2851a {
    /* renamed from: a */
    public static final <T> Collection<T> m13901a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C1489j.m6972b(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }
}
