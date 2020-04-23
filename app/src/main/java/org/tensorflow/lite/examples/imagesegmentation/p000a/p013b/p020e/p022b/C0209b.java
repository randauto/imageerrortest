package p000a.p013b.p020e.p022b;

import p000a.p013b.p019d.C0184c;

/* renamed from: a.b.e.b.b */
/* compiled from: ObjectHelper */
public final class C0209b {

    /* renamed from: a */
    static final C0184c<Object, Object> f395a = new C0210a();

    /* renamed from: a.b.e.b.b$a */
    /* compiled from: ObjectHelper */
    static final class C0210a implements C0184c<Object, Object> {
        C0210a() {
        }
    }

    /* renamed from: a */
    public static int m544a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: a */
    public static int m546a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: a */
    public static <T> T m547a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static int m545a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
