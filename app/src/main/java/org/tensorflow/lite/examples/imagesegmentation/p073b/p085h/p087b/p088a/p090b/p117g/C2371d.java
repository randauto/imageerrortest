package p073b.p085h.p087b.p088a.p090b.p117g;

import android.support.p072v8.renderscript.Allocation;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: b.h.b.a.b.g.d */
/* compiled from: ByteString */
public abstract class C2371d implements Iterable<Byte> {

    /* renamed from: a */
    public static final C2371d f7253a = new C2403p(new byte[0]);

    /* renamed from: b */
    static final /* synthetic */ boolean f7254b = (!C2371d.class.desiredAssertionStatus());

    /* renamed from: b.h.b.a.b.g.d$a */
    /* compiled from: ByteString */
    public interface C2372a extends Iterator<Byte> {
        /* renamed from: b */
        byte mo9070b();
    }

    /* renamed from: b.h.b.a.b.g.d$b */
    /* compiled from: ByteString */
    public static final class C2373b extends OutputStream {

        /* renamed from: a */
        private static final byte[] f7255a = new byte[0];

        /* renamed from: b */
        private final int f7256b;

        /* renamed from: c */
        private final ArrayList<C2371d> f7257c;

        /* renamed from: d */
        private int f7258d;

        /* renamed from: e */
        private byte[] f7259e;

        /* renamed from: f */
        private int f7260f;

        C2373b(int i) {
            if (i >= 0) {
                this.f7256b = i;
                this.f7257c = new ArrayList<>();
                this.f7259e = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public synchronized void write(int i) {
            if (this.f7260f == this.f7259e.length) {
                m11763a(1);
            }
            byte[] bArr = this.f7259e;
            int i2 = this.f7260f;
            this.f7260f = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.f7259e.length - this.f7260f) {
                System.arraycopy(bArr, i, this.f7259e, this.f7260f, i2);
                this.f7260f += i2;
            } else {
                int length = this.f7259e.length - this.f7260f;
                System.arraycopy(bArr, i, this.f7259e, this.f7260f, length);
                int i3 = i + length;
                int i4 = i2 - length;
                m11763a(i4);
                System.arraycopy(bArr, i3, this.f7259e, 0, i4);
                this.f7260f = i4;
            }
        }

        /* renamed from: a */
        public synchronized C2371d mo9090a() {
            m11765c();
            return C2371d.m11738a((Iterable<C2371d>) this.f7257c);
        }

        /* renamed from: a */
        private byte[] m11764a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: b */
        public synchronized int mo9091b() {
            return this.f7258d + this.f7260f;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo9091b())});
        }

        /* renamed from: a */
        private void m11763a(int i) {
            this.f7257c.add(new C2403p(this.f7259e));
            this.f7258d += this.f7259e.length;
            this.f7259e = new byte[Math.max(this.f7256b, Math.max(i, this.f7258d >>> 1))];
            this.f7260f = 0;
        }

        /* renamed from: c */
        private void m11765c() {
            if (this.f7260f >= this.f7259e.length) {
                this.f7257c.add(new C2403p(this.f7259e));
                this.f7259e = f7255a;
            } else if (this.f7260f > 0) {
                this.f7257c.add(new C2403p(m11764a(this.f7259e, this.f7260f)));
            }
            this.f7258d += this.f7260f;
            this.f7260f = 0;
        }
    }

    /* renamed from: a */
    public abstract int mo9064a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo9074a(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9065a(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo9077b(int i, int i2, int i3);

    /* renamed from: b */
    public abstract String mo9078b(String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo9079b(OutputStream outputStream, int i, int i2);

    /* renamed from: c */
    public abstract C2372a iterator();

    /* renamed from: g */
    public abstract boolean mo9084g();

    /* renamed from: h */
    public abstract C2374e mo9085h();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo9086j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract boolean mo9087k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo9088l();

    C2371d() {
    }

    /* renamed from: d */
    public boolean mo9081d() {
        return mo9064a() == 0;
    }

    /* renamed from: a */
    public static C2371d m11742a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C2403p(bArr2);
    }

    /* renamed from: a */
    public static C2371d m11741a(byte[] bArr) {
        return m11742a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C2371d m11739a(String str) {
        try {
            return new C2403p(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: a */
    public C2371d mo9075a(C2371d dVar) {
        int a = mo9064a();
        int a2 = dVar.mo9064a();
        if (((long) a) + ((long) a2) < 2147483647L) {
            return C2411u.m12046a(this, dVar);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(a);
        sb.append("+");
        sb.append(a2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static C2371d m11738a(Iterable<C2371d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (C2371d add : iterable) {
                collection.add(add);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f7253a;
        }
        return m11740a(collection.iterator(), collection.size());
    }

    /* renamed from: a */
    private static C2371d m11740a(Iterator<C2371d> it, int i) {
        if (!f7254b && i < 1) {
            throw new AssertionError();
        } else if (i == 1) {
            return (C2371d) it.next();
        } else {
            int i2 = i >>> 1;
            return m11740a(it, i2).mo9075a(m11740a(it, i - i2));
        }
    }

    /* renamed from: b */
    public void mo9080b(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= mo9064a()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Target end offset < 0: ");
                    sb3.append(i5);
                    throw new IndexOutOfBoundsException(sb3.toString());
                } else if (i3 > 0) {
                    mo9065a(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Source end offset < 0: ");
                sb4.append(i4);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* renamed from: e */
    public byte[] mo9082e() {
        int a = mo9064a();
        if (a == 0) {
            return C2392j.f7311a;
        }
        byte[] bArr = new byte[a];
        mo9065a(bArr, 0, 0, a);
        return bArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9076a(OutputStream outputStream, int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > mo9064a()) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 > 0) {
                mo9079b(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: f */
    public String mo9083f() {
        try {
            return mo9078b("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: i */
    public static C2373b m11743i() {
        return new C2373b(Allocation.USAGE_SHARED);
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo9064a())});
    }
}
