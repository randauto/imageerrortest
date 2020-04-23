package p073b.p074a;

import java.util.List;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p084g.C1515c;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\n¨\u0006\u000b"}, mo10386c = {"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"})
/* renamed from: b.a.s */
/* compiled from: ReversedViews.kt */
class C1424s extends C1423r {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final int m6852c(List<?> list, int i) {
        int a = C1415k.m6834a(list);
        if (i >= 0 && a >= i) {
            return C1415k.m6834a(list) - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C1515c(0, C1415k.m6834a(list)));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final int m6853d(List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new C1515c(0, list.size()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: d */
    public static final <T> List<T> m6854d(List<T> list) {
        C1489j.m6972b(list, "$receiver");
        return new C1394ai<>(list);
    }
}
