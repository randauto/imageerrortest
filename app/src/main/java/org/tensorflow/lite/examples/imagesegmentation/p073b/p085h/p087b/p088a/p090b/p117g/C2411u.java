package p073b.p085h.p087b.p088a.p090b.p117g;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import p073b.p085h.p087b.p088a.p090b.p117g.C2371d.C2372a;

/* renamed from: b.h.b.a.b.g.u */
/* compiled from: RopeByteString */
class C2411u extends C2371d {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int[] f7328c;

    /* renamed from: d */
    private final int f7329d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2371d f7330e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2371d f7331f;

    /* renamed from: g */
    private final int f7332g;

    /* renamed from: h */
    private final int f7333h;

    /* renamed from: i */
    private int f7334i;

    /* renamed from: b.h.b.a.b.g.u$a */
    /* compiled from: RopeByteString */
    private static class C2413a {

        /* renamed from: a */
        private final Stack<C2371d> f7335a;

        private C2413a() {
            this.f7335a = new Stack<>();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C2371d m12065a(C2371d dVar, C2371d dVar2) {
            m12067a(dVar);
            m12067a(dVar2);
            C2371d dVar3 = (C2371d) this.f7335a.pop();
            while (!this.f7335a.isEmpty()) {
                dVar3 = new C2411u((C2371d) this.f7335a.pop(), dVar3);
            }
            return dVar3;
        }

        /* renamed from: a */
        private void m12067a(C2371d dVar) {
            if (dVar.mo9087k()) {
                m12068b(dVar);
            } else if (dVar instanceof C2411u) {
                C2411u uVar = (C2411u) dVar;
                m12067a(uVar.f7330e);
                m12067a(uVar.f7331f);
            } else {
                String valueOf = String.valueOf(String.valueOf(dVar.getClass()));
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: b */
        private void m12068b(C2371d dVar) {
            int a = m12064a(dVar.mo9064a());
            int i = C2411u.f7328c[a + 1];
            if (this.f7335a.isEmpty() || ((C2371d) this.f7335a.peek()).mo9064a() >= i) {
                this.f7335a.push(dVar);
                return;
            }
            int i2 = C2411u.f7328c[a];
            C2371d dVar2 = (C2371d) this.f7335a.pop();
            while (!this.f7335a.isEmpty() && ((C2371d) this.f7335a.peek()).mo9064a() < i2) {
                dVar2 = new C2411u((C2371d) this.f7335a.pop(), dVar2);
            }
            C2411u uVar = new C2411u(dVar2, dVar);
            while (!this.f7335a.isEmpty()) {
                if (((C2371d) this.f7335a.peek()).mo9064a() >= C2411u.f7328c[m12064a(uVar.mo9064a()) + 1]) {
                    break;
                }
                uVar = new C2411u((C2371d) this.f7335a.pop(), uVar);
            }
            this.f7335a.push(uVar);
        }

        /* renamed from: a */
        private int m12064a(int i) {
            int binarySearch = Arrays.binarySearch(C2411u.f7328c, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }
    }

    /* renamed from: b.h.b.a.b.g.u$b */
    /* compiled from: RopeByteString */
    private static class C2414b implements Iterator<C2403p> {

        /* renamed from: a */
        private final Stack<C2411u> f7336a;

        /* renamed from: b */
        private C2403p f7337b;

        private C2414b(C2371d dVar) {
            this.f7336a = new Stack<>();
            this.f7337b = m12069a(dVar);
        }

        /* renamed from: a */
        private C2403p m12069a(C2371d dVar) {
            while (dVar instanceof C2411u) {
                C2411u uVar = (C2411u) dVar;
                this.f7336a.push(uVar);
                dVar = uVar.f7330e;
            }
            return (C2403p) dVar;
        }

        /* renamed from: b */
        private C2403p m12070b() {
            while (!this.f7336a.isEmpty()) {
                C2403p a = m12069a(((C2411u) this.f7336a.pop()).f7331f);
                if (!a.mo9081d()) {
                    return a;
                }
            }
            return null;
        }

        public boolean hasNext() {
            return this.f7337b != null;
        }

        /* renamed from: a */
        public C2403p next() {
            if (this.f7337b != null) {
                C2403p pVar = this.f7337b;
                this.f7337b = m12070b();
                return pVar;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b.h.b.a.b.g.u$c */
    /* compiled from: RopeByteString */
    private class C2415c implements C2372a {

        /* renamed from: a */
        int f7338a;

        /* renamed from: c */
        private final C2414b f7340c;

        /* renamed from: d */
        private C2372a f7341d;

        private C2415c() {
            this.f7340c = new C2414b(C2411u.this);
            this.f7341d = this.f7340c.next().iterator();
            this.f7338a = C2411u.this.mo9064a();
        }

        public boolean hasNext() {
            return this.f7338a > 0;
        }

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo9070b());
        }

        /* renamed from: b */
        public byte mo9070b() {
            if (!this.f7341d.hasNext()) {
                this.f7341d = this.f7340c.next().iterator();
            }
            this.f7338a--;
            return this.f7341d.mo9070b();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b.h.b.a.b.g.u$d */
    /* compiled from: RopeByteString */
    private class C2416d extends InputStream {

        /* renamed from: b */
        private C2414b f7343b;

        /* renamed from: c */
        private C2403p f7344c;

        /* renamed from: d */
        private int f7345d;

        /* renamed from: e */
        private int f7346e;

        /* renamed from: f */
        private int f7347f;

        /* renamed from: g */
        private int f7348g;

        public boolean markSupported() {
            return true;
        }

        public C2416d() {
            m12075a();
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException();
            } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m12074a(bArr, i, i2);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) m12074a(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        private int m12074a(byte[] bArr, int i, int i2) {
            int i3 = i;
            int i4 = i2;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                m12076b();
                if (this.f7344c != null) {
                    int min = Math.min(this.f7345d - this.f7346e, i4);
                    if (bArr != null) {
                        this.f7344c.mo9080b(bArr, this.f7346e, i3, min);
                        i3 += min;
                    }
                    this.f7346e += min;
                    i4 -= min;
                } else if (i4 == i2) {
                    return -1;
                }
            }
            return i2 - i4;
        }

        public int read() {
            m12076b();
            if (this.f7344c == null) {
                return -1;
            }
            C2403p pVar = this.f7344c;
            int i = this.f7346e;
            this.f7346e = i + 1;
            return pVar.mo9063a(i) & 255;
        }

        public int available() {
            return C2411u.this.mo9064a() - (this.f7347f + this.f7346e);
        }

        public void mark(int i) {
            this.f7348g = this.f7347f + this.f7346e;
        }

        public synchronized void reset() {
            m12075a();
            m12074a(null, 0, this.f7348g);
        }

        /* renamed from: a */
        private void m12075a() {
            this.f7343b = new C2414b(C2411u.this);
            this.f7344c = this.f7343b.next();
            this.f7345d = this.f7344c.mo9064a();
            this.f7346e = 0;
            this.f7347f = 0;
        }

        /* renamed from: b */
        private void m12076b() {
            if (this.f7344c != null && this.f7346e == this.f7345d) {
                this.f7347f += this.f7345d;
                this.f7346e = 0;
                if (this.f7343b.hasNext()) {
                    this.f7344c = this.f7343b.next();
                    this.f7345d = this.f7344c.mo9064a();
                    return;
                }
                this.f7344c = null;
                this.f7345d = 0;
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Integer.MAX_VALUE));
        f7328c = new int[arrayList.size()];
        for (int i4 = 0; i4 < f7328c.length; i4++) {
            f7328c[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
    }

    private C2411u(C2371d dVar, C2371d dVar2) {
        this.f7334i = 0;
        this.f7330e = dVar;
        this.f7331f = dVar2;
        this.f7332g = dVar.mo9064a();
        this.f7329d = this.f7332g + dVar2.mo9064a();
        this.f7333h = Math.max(dVar.mo9086j(), dVar2.mo9086j()) + 1;
    }

    /* renamed from: a */
    static C2371d m12046a(C2371d dVar, C2371d dVar2) {
        C2411u uVar = dVar instanceof C2411u ? (C2411u) dVar : null;
        if (dVar2.mo9064a() == 0) {
            return dVar;
        }
        if (dVar.mo9064a() != 0) {
            int a = dVar.mo9064a() + dVar2.mo9064a();
            if (a < 128) {
                return m12049b(dVar, dVar2);
            }
            if (uVar != null && uVar.f7331f.mo9064a() + dVar2.mo9064a() < 128) {
                dVar2 = new C2411u(uVar.f7330e, m12049b(uVar.f7331f, dVar2));
            } else if (uVar == null || uVar.f7330e.mo9086j() <= uVar.f7331f.mo9086j() || uVar.mo9086j() <= dVar2.mo9086j()) {
                if (a >= f7328c[Math.max(dVar.mo9086j(), dVar2.mo9086j()) + 1]) {
                    return new C2411u(dVar, dVar2);
                }
                return new C2413a().m12065a(dVar, dVar2);
            } else {
                dVar2 = new C2411u(uVar.f7330e, new C2411u(uVar.f7331f, dVar2));
            }
        }
        return dVar2;
    }

    /* renamed from: b */
    private static C2403p m12049b(C2371d dVar, C2371d dVar2) {
        int a = dVar.mo9064a();
        int a2 = dVar2.mo9064a();
        byte[] bArr = new byte[(a + a2)];
        dVar.mo9080b(bArr, 0, 0, a);
        dVar2.mo9080b(bArr, 0, a, a2);
        return new C2403p(bArr);
    }

    /* renamed from: a */
    public int mo9064a() {
        return this.f7329d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo9086j() {
        return this.f7333h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo9087k() {
        return this.f7329d >= f7328c[this.f7333h];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9065a(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.f7332g) {
            this.f7330e.mo9065a(bArr, i, i2, i3);
        } else if (i >= this.f7332g) {
            this.f7331f.mo9065a(bArr, i - this.f7332g, i2, i3);
        } else {
            int i4 = this.f7332g - i;
            this.f7330e.mo9065a(bArr, i, i2, i4);
            this.f7331f.mo9065a(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9079b(OutputStream outputStream, int i, int i2) {
        if (i + i2 <= this.f7332g) {
            this.f7330e.mo9079b(outputStream, i, i2);
        } else if (i >= this.f7332g) {
            this.f7331f.mo9079b(outputStream, i - this.f7332g, i2);
        } else {
            int i3 = this.f7332g - i;
            this.f7330e.mo9079b(outputStream, i, i3);
            this.f7331f.mo9079b(outputStream, 0, i2 - i3);
        }
    }

    /* renamed from: b */
    public String mo9078b(String str) {
        return new String(mo9082e(), str);
    }

    /* renamed from: g */
    public boolean mo9084g() {
        if (this.f7331f.mo9074a(this.f7330e.mo9074a(0, 0, this.f7332g), 0, this.f7331f.mo9064a()) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo9074a(int i, int i2, int i3) {
        if (i2 + i3 <= this.f7332g) {
            return this.f7330e.mo9074a(i, i2, i3);
        }
        if (i2 >= this.f7332g) {
            return this.f7331f.mo9074a(i, i2 - this.f7332g, i3);
        }
        int i4 = this.f7332g - i2;
        return this.f7331f.mo9074a(this.f7330e.mo9074a(i, i2, i4), 0, i3 - i4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2371d)) {
            return false;
        }
        C2371d dVar = (C2371d) obj;
        if (this.f7329d != dVar.mo9064a()) {
            return false;
        }
        if (this.f7329d == 0) {
            return true;
        }
        if (this.f7334i != 0) {
            int l = dVar.mo9088l();
            if (!(l == 0 || this.f7334i == l)) {
                return false;
            }
        }
        return m12050b(dVar);
    }

    /* renamed from: b */
    private boolean m12050b(C2371d dVar) {
        C2414b bVar = new C2414b(this);
        C2403p pVar = (C2403p) bVar.next();
        C2414b bVar2 = new C2414b(dVar);
        C2403p pVar2 = (C2403p) bVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int a = pVar.mo9064a() - i;
            int a2 = pVar2.mo9064a() - i2;
            int min = Math.min(a, a2);
            if (!(i == 0 ? pVar.mo9252a(pVar2, i2, min) : pVar2.mo9252a(pVar, i, min))) {
                return false;
            }
            i3 += min;
            if (i3 < this.f7329d) {
                if (min == a) {
                    pVar = (C2403p) bVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == a2) {
                    pVar2 = (C2403p) bVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == this.f7329d) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int i = this.f7334i;
        if (i == 0) {
            i = mo9077b(this.f7329d, 0, this.f7329d);
            if (i == 0) {
                i = 1;
            }
            this.f7334i = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo9088l() {
        return this.f7334i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo9077b(int i, int i2, int i3) {
        if (i2 + i3 <= this.f7332g) {
            return this.f7330e.mo9077b(i, i2, i3);
        }
        if (i2 >= this.f7332g) {
            return this.f7331f.mo9077b(i, i2 - this.f7332g, i3);
        }
        int i4 = this.f7332g - i2;
        return this.f7331f.mo9077b(this.f7330e.mo9077b(i, i2, i4), 0, i3 - i4);
    }

    /* renamed from: h */
    public C2374e mo9085h() {
        return C2374e.m11772a((InputStream) new C2416d());
    }

    /* renamed from: c */
    public C2372a iterator() {
        return new C2415c();
    }
}
