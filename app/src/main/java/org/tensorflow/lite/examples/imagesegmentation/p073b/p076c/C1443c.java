package p073b.p076c;

import p073b.C3218m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, mo10386c = {"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"})
/* renamed from: b.c.c */
/* compiled from: progressionUtil.kt */
public final class C1443c {
    /* renamed from: a */
    private static final int m6927a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: b */
    private static final int m6929b(int i, int i2, int i3) {
        return m6927a(m6927a(i, i3) - m6927a(i2, i3), i3);
    }

    /* renamed from: a */
    public static final int m6928a(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m6929b(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m6929b(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
