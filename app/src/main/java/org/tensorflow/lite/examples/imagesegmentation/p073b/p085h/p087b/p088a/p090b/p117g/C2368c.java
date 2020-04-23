package p073b.p085h.p087b.p088a.p090b.p117g;

import java.util.NoSuchElementException;
import p073b.p085h.p087b.p088a.p090b.p117g.C2371d.C2372a;

/* renamed from: b.h.b.a.b.g.c */
/* compiled from: BoundedByteString */
class C2368c extends C2403p {

    /* renamed from: d */
    private final int f7248d;

    /* renamed from: e */
    private final int f7249e;

    /* renamed from: b.h.b.a.b.g.c$a */
    /* compiled from: BoundedByteString */
    private class C2370a implements C2372a {

        /* renamed from: b */
        private int f7251b;

        /* renamed from: c */
        private final int f7252c;

        private C2370a() {
            this.f7251b = C2368c.this.mo9066b();
            this.f7252c = this.f7251b + C2368c.this.mo9064a();
        }

        public boolean hasNext() {
            return this.f7251b < this.f7252c;
        }

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo9070b());
        }

        /* renamed from: b */
        public byte mo9070b() {
            if (this.f7251b < this.f7252c) {
                byte[] bArr = C2368c.this.f7323c;
                int i = this.f7251b;
                this.f7251b = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    C2368c(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (((long) i) + ((long) i2) <= ((long) bArr.length)) {
            this.f7248d = i;
            this.f7249e = i2;
        } else {
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append("+");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* renamed from: a */
    public byte mo9063a(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        } else if (i < mo9064a()) {
            return this.f7323c[this.f7248d + i];
        } else {
            int a = mo9064a();
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(a);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* renamed from: a */
    public int mo9064a() {
        return this.f7249e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo9066b() {
        return this.f7248d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9065a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f7323c, mo9066b() + i, bArr, i2, i3);
    }

    /* renamed from: c */
    public C2372a iterator() {
        return new C2370a();
    }
}
