package p073b.p085h.p087b.p088a.p090b.p112e.p113a;

import java.util.ArrayList;
import java.util.List;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.e.a.a */
/* compiled from: BinaryVersion.kt */
public abstract class C2278a {

    /* renamed from: a */
    public static final C2279a f6987a = new C2279a(null);

    /* renamed from: b */
    private final int f6988b;

    /* renamed from: c */
    private final int f6989c;

    /* renamed from: d */
    private final int f6990d;

    /* renamed from: e */
    private final List<Integer> f6991e;

    /* renamed from: f */
    private final int[] f6992f;

    /* renamed from: b.h.b.a.b.e.a.a$a */
    /* compiled from: BinaryVersion.kt */
    public static final class C2279a {
        private C2279a() {
        }

        public /* synthetic */ C2279a(C1486g gVar) {
            this();
        }
    }

    public C2278a(int... iArr) {
        C1489j.m6972b(iArr, "numbers");
        this.f6992f = iArr;
        Integer b = C1406e.m6802b(this.f6992f, 0);
        int i = -1;
        this.f6988b = b != null ? b.intValue() : -1;
        Integer b2 = C1406e.m6802b(this.f6992f, 1);
        this.f6989c = b2 != null ? b2.intValue() : -1;
        Integer b3 = C1406e.m6802b(this.f6992f, 2);
        if (b3 != null) {
            i = b3.intValue();
        }
        this.f6990d = i;
        this.f6991e = this.f6992f.length > 3 ? C1415k.m6893k((Iterable<? extends T>) C1406e.m6776a(this.f6992f).subList(3, this.f6992f.length)) : C1415k.m6837a();
    }

    /* renamed from: a */
    public final int mo8802a() {
        return this.f6988b;
    }

    /* renamed from: b */
    public final int mo8803b() {
        return this.f6989c;
    }

    /* renamed from: c */
    public final int[] mo8804c() {
        return this.f6992f;
    }

    public String toString() {
        int[] c = mo8804c();
        ArrayList arrayList = new ArrayList();
        int length = c.length;
        for (int i = 0; i < length; i++) {
            int i2 = c[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        List list = arrayList;
        return list.isEmpty() ? "unknown" : C1415k.m6859a(list, ".", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (obj != null && C1489j.m6971a((Object) getClass(), (Object) obj.getClass())) {
            C2278a aVar = (C2278a) obj;
            if (this.f6988b == aVar.f6988b && this.f6989c == aVar.f6989c && this.f6990d == aVar.f6990d && C1489j.m6971a((Object) this.f6991e, (Object) aVar.f6991e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f6988b;
        int i2 = i + (i * 31) + this.f6989c;
        int i3 = i2 + (i2 * 31) + this.f6990d;
        return i3 + (i3 * 31) + this.f6991e.hashCode();
    }
}
