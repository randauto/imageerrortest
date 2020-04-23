package p000a.p013b.p020e.p029h;

/* renamed from: a.b.e.h.b */
/* compiled from: OpenHashSet */
public final class C0252b<T> {

    /* renamed from: a */
    final float f507a;

    /* renamed from: b */
    int f508b;

    /* renamed from: c */
    int f509c;

    /* renamed from: d */
    int f510d;

    /* renamed from: e */
    T[] f511e;

    /* renamed from: a */
    static int m659a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    public C0252b() {
        this(16, 0.75f);
    }

    public C0252b(int i, float f) {
        this.f507a = f;
        int a = C0253c.m665a(i);
        this.f508b = a - 1;
        this.f510d = (int) (f * ((float) a));
        this.f511e = (Object[]) new Object[a];
    }

    /* renamed from: a */
    public boolean mo445a(T t) {
        T t2;
        T[] tArr = this.f511e;
        int i = this.f508b;
        int a = m659a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f509c + 1;
        this.f509c = i2;
        if (i2 >= this.f510d) {
            mo443a();
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo446b(T t) {
        T t2;
        T[] tArr = this.f511e;
        int i = this.f508b;
        int a = m659a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo444a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo444a(a, tArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo444a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f509c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m659a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo443a() {
        T[] tArr = this.f511e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (Object[]) new Object[i];
        int i3 = this.f509c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m659a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f508b = i2;
                this.f510d = (int) (((float) i) * this.f507a);
                this.f511e = tArr2;
                return;
            }
        }
    }

    /* renamed from: b */
    public Object[] mo447b() {
        return this.f511e;
    }
}
