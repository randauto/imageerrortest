package p073b.p085h.p087b.p088a.p090b.p117g;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import p073b.p085h.p087b.p088a.p090b.p117g.C2371d.C2372a;

/* renamed from: b.h.b.a.b.g.p */
/* compiled from: LiteralByteString */
class C2403p extends C2371d {

    /* renamed from: c */
    protected final byte[] f7323c;

    /* renamed from: d */
    private int f7324d = 0;

    /* renamed from: b.h.b.a.b.g.p$a */
    /* compiled from: LiteralByteString */
    private class C2405a implements C2372a {

        /* renamed from: b */
        private int f7326b;

        /* renamed from: c */
        private final int f7327c;

        private C2405a() {
            this.f7326b = 0;
            this.f7327c = C2403p.this.mo9064a();
        }

        public boolean hasNext() {
            return this.f7326b < this.f7327c;
        }

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo9070b());
        }

        /* renamed from: b */
        public byte mo9070b() {
            try {
                byte[] bArr = C2403p.this.f7323c;
                int i = this.f7326b;
                this.f7326b = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo9066b() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo9086j() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo9087k() {
        return true;
    }

    C2403p(byte[] bArr) {
        this.f7323c = bArr;
    }

    /* renamed from: a */
    public byte mo9063a(int i) {
        return this.f7323c[i];
    }

    /* renamed from: a */
    public int mo9064a() {
        return this.f7323c.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9065a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f7323c, i, bArr, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9079b(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f7323c, mo9066b() + i, i2);
    }

    /* renamed from: b */
    public String mo9078b(String str) {
        return new String(this.f7323c, mo9066b(), mo9064a(), str);
    }

    /* renamed from: g */
    public boolean mo9084g() {
        int b = mo9066b();
        return C2429y.m12119a(this.f7323c, b, mo9064a() + b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo9074a(int i, int i2, int i3) {
        int b = mo9066b() + i2;
        return C2429y.m12117a(i, this.f7323c, b, i3 + b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2371d) || mo9064a() != ((C2371d) obj).mo9064a()) {
            return false;
        }
        if (mo9064a() == 0) {
            return true;
        }
        if (obj instanceof C2403p) {
            return mo9252a((C2403p) obj, 0, mo9064a());
        }
        if (obj instanceof C2411u) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(String.valueOf(obj.getClass()));
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9252a(C2403p pVar, int i, int i2) {
        if (i2 > pVar.mo9064a()) {
            int a = mo9064a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= pVar.mo9064a()) {
            byte[] bArr = this.f7323c;
            byte[] bArr2 = pVar.f7323c;
            int b = mo9066b() + i2;
            int b2 = mo9066b();
            int b3 = pVar.mo9066b() + i;
            while (b2 < b) {
                if (bArr[b2] != bArr2[b3]) {
                    return false;
                }
                b2++;
                b3++;
            }
            return true;
        } else {
            int a2 = pVar.mo9064a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int hashCode() {
        int i = this.f7324d;
        if (i == 0) {
            int a = mo9064a();
            i = mo9077b(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.f7324d = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo9088l() {
        return this.f7324d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo9077b(int i, int i2, int i3) {
        return m12014a(i, this.f7323c, mo9066b() + i2, i3);
    }

    /* renamed from: a */
    static int m12014a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: h */
    public C2374e mo9085h() {
        return C2374e.m11771a(this);
    }

    /* renamed from: c */
    public C2372a iterator() {
        return new C2405a();
    }
}
