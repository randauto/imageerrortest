package p073b.p085h.p087b.p088a.p090b.p117g;

import android.support.p072v8.renderscript.Allocation;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: b.h.b.a.b.g.f */
/* compiled from: CodedOutputStream */
public final class C2376f {

    /* renamed from: a */
    private final byte[] f7275a;

    /* renamed from: b */
    private final int f7276b;

    /* renamed from: c */
    private int f7277c;

    /* renamed from: d */
    private int f7278d = 0;

    /* renamed from: e */
    private final OutputStream f7279e;

    /* renamed from: b.h.b.a.b.g.f$a */
    /* compiled from: CodedOutputStream */
    public static class C2377a extends IOException {
        C2377a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    /* renamed from: a */
    static int m11815a(int i) {
        return i > 4096 ? CodedOutputStream.DEFAULT_BUFFER_SIZE : i;
    }

    /* renamed from: b */
    public static int m11818b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m11819b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m11827b(boolean z) {
        return 1;
    }

    /* renamed from: h */
    public static int m11838h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m11839i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m11840i(long j) {
        return 8;
    }

    /* renamed from: l */
    public static int m11844l(int i) {
        return 4;
    }

    /* renamed from: l */
    public static int m11845l(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: n */
    public static long m11847n(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: q */
    public static int m11849q(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: s */
    public static int m11850s(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private C2376f(OutputStream outputStream, byte[] bArr) {
        this.f7279e = outputStream;
        this.f7275a = bArr;
        this.f7277c = 0;
        this.f7276b = bArr.length;
    }

    /* renamed from: a */
    public static C2376f m11817a(OutputStream outputStream, int i) {
        return new C2376f(outputStream, new byte[i]);
    }

    /* renamed from: a */
    public void mo9135a(int i, double d) {
        mo9166f(i, 1);
        mo9133a(d);
    }

    /* renamed from: a */
    public void mo9136a(int i, float f) {
        mo9166f(i, 5);
        mo9134a(f);
    }

    /* renamed from: a */
    public void mo9137a(int i, int i2) {
        mo9166f(i, 0);
        mo9150b(i2);
    }

    /* renamed from: a */
    public void mo9141a(int i, boolean z) {
        mo9166f(i, 0);
        mo9147a(z);
    }

    /* renamed from: a */
    public void mo9140a(int i, C2406q qVar) {
        mo9166f(i, 3);
        mo9145a(qVar);
        mo9166f(i, 4);
    }

    /* renamed from: b */
    public void mo9152b(int i, C2406q qVar) {
        mo9166f(i, 2);
        mo9154b(qVar);
    }

    /* renamed from: a */
    public void mo9139a(int i, C2371d dVar) {
        mo9166f(i, 2);
        mo9143a(dVar);
    }

    /* renamed from: b */
    public void mo9151b(int i, int i2) {
        mo9166f(i, 0);
        mo9161d(i2);
    }

    /* renamed from: c */
    public void mo9156c(int i, int i2) {
        mo9166f(i, 0);
        mo9163e(i2);
    }

    /* renamed from: a */
    public void mo9138a(int i, long j) {
        mo9166f(i, 0);
        mo9164e(j);
    }

    /* renamed from: c */
    public void mo9157c(int i, C2406q qVar) {
        mo9166f(1, 3);
        mo9151b(2, i);
        mo9152b(3, qVar);
        mo9166f(1, 4);
    }

    /* renamed from: a */
    public void mo9133a(double d) {
        mo9169m(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public void mo9134a(float f) {
        mo9172r(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public void mo9142a(long j) {
        mo9168k(j);
    }

    /* renamed from: b */
    public void mo9153b(long j) {
        mo9168k(j);
    }

    /* renamed from: b */
    public void mo9150b(int i) {
        if (i >= 0) {
            mo9171p(i);
        } else {
            mo9168k((long) i);
        }
    }

    /* renamed from: c */
    public void mo9158c(long j) {
        mo9169m(j);
    }

    /* renamed from: c */
    public void mo9155c(int i) {
        mo9172r(i);
    }

    /* renamed from: a */
    public void mo9147a(boolean z) {
        mo9170n(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo9146a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        mo9171p(bytes.length);
        mo9160c(bytes);
    }

    /* renamed from: a */
    public void mo9145a(C2406q qVar) {
        qVar.mo8099a(this);
    }

    /* renamed from: b */
    public void mo9154b(C2406q qVar) {
        mo9171p(qVar.mo8107i());
        qVar.mo8099a(this);
    }

    /* renamed from: a */
    public void mo9143a(C2371d dVar) {
        mo9171p(dVar.mo9064a());
        mo9159c(dVar);
    }

    /* renamed from: a */
    public void mo9148a(byte[] bArr) {
        mo9171p(bArr.length);
        mo9160c(bArr);
    }

    /* renamed from: d */
    public void mo9161d(int i) {
        mo9171p(i);
    }

    /* renamed from: e */
    public void mo9163e(int i) {
        mo9150b(i);
    }

    /* renamed from: f */
    public void mo9165f(int i) {
        mo9172r(i);
    }

    /* renamed from: d */
    public void mo9162d(long j) {
        mo9169m(j);
    }

    /* renamed from: g */
    public void mo9167g(int i) {
        mo9171p(m11850s(i));
    }

    /* renamed from: e */
    public void mo9164e(long j) {
        mo9168k(m11847n(j));
    }

    /* renamed from: b */
    public static int m11820b(int i, double d) {
        return m11848o(i) + m11818b(d);
    }

    /* renamed from: b */
    public static int m11821b(int i, float f) {
        return m11848o(i) + m11819b(f);
    }

    /* renamed from: d */
    public static int m11831d(int i, int i2) {
        return m11848o(i) + m11837h(i2);
    }

    /* renamed from: b */
    public static int m11824b(int i, boolean z) {
        return m11848o(i) + m11827b(z);
    }

    /* renamed from: d */
    public static int m11832d(int i, C2406q qVar) {
        return m11848o(i) + m11833d(qVar);
    }

    /* renamed from: b */
    public static int m11823b(int i, C2371d dVar) {
        return m11848o(i) + m11825b(dVar);
    }

    /* renamed from: e */
    public static int m11834e(int i, int i2) {
        return m11848o(i) + m11843k(i2);
    }

    /* renamed from: b */
    public static int m11822b(int i, long j) {
        return m11848o(i) + m11842j(j);
    }

    /* renamed from: f */
    public static int m11835f(long j) {
        return m11845l(j);
    }

    /* renamed from: g */
    public static int m11836g(long j) {
        return m11845l(j);
    }

    /* renamed from: h */
    public static int m11837h(int i) {
        if (i >= 0) {
            return m11849q(i);
        }
        return 10;
    }

    /* renamed from: b */
    public static int m11826b(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m11849q(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: c */
    public static int m11830c(C2406q qVar) {
        return qVar.mo8107i();
    }

    /* renamed from: d */
    public static int m11833d(C2406q qVar) {
        int i = qVar.mo8107i();
        return m11849q(i) + i;
    }

    /* renamed from: a */
    public static int m11816a(C2400m mVar) {
        int b = mVar.mo9233b();
        return m11849q(b) + b;
    }

    /* renamed from: b */
    public static int m11825b(C2371d dVar) {
        return m11849q(dVar.mo9064a()) + dVar.mo9064a();
    }

    /* renamed from: b */
    public static int m11828b(byte[] bArr) {
        return m11849q(bArr.length) + bArr.length;
    }

    /* renamed from: j */
    public static int m11841j(int i) {
        return m11849q(i);
    }

    /* renamed from: k */
    public static int m11843k(int i) {
        return m11837h(i);
    }

    /* renamed from: m */
    public static int m11846m(int i) {
        return m11849q(m11850s(i));
    }

    /* renamed from: j */
    public static int m11842j(long j) {
        return m11845l(m11847n(j));
    }

    /* renamed from: b */
    private void m11829b() {
        if (this.f7279e != null) {
            this.f7279e.write(this.f7275a, 0, this.f7277c);
            this.f7277c = 0;
            return;
        }
        throw new C2377a();
    }

    /* renamed from: a */
    public void mo9131a() {
        if (this.f7279e != null) {
            m11829b();
        }
    }

    /* renamed from: a */
    public void mo9132a(byte b) {
        if (this.f7277c == this.f7276b) {
            m11829b();
        }
        byte[] bArr = this.f7275a;
        int i = this.f7277c;
        this.f7277c = i + 1;
        bArr[i] = b;
        this.f7278d++;
    }

    /* renamed from: n */
    public void mo9170n(int i) {
        mo9132a((byte) i);
    }

    /* renamed from: c */
    public void mo9159c(C2371d dVar) {
        mo9144a(dVar, 0, dVar.mo9064a());
    }

    /* renamed from: c */
    public void mo9160c(byte[] bArr) {
        mo9149a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo9149a(byte[] bArr, int i, int i2) {
        if (this.f7276b - this.f7277c >= i2) {
            System.arraycopy(bArr, i, this.f7275a, this.f7277c, i2);
            this.f7277c += i2;
            this.f7278d += i2;
            return;
        }
        int i3 = this.f7276b - this.f7277c;
        System.arraycopy(bArr, i, this.f7275a, this.f7277c, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.f7277c = this.f7276b;
        this.f7278d += i3;
        m11829b();
        if (i5 <= this.f7276b) {
            System.arraycopy(bArr, i4, this.f7275a, 0, i5);
            this.f7277c = i5;
        } else {
            this.f7279e.write(bArr, i4, i5);
        }
        this.f7278d += i5;
    }

    /* renamed from: a */
    public void mo9144a(C2371d dVar, int i, int i2) {
        if (this.f7276b - this.f7277c >= i2) {
            dVar.mo9080b(this.f7275a, i, this.f7277c, i2);
            this.f7277c += i2;
            this.f7278d += i2;
            return;
        }
        int i3 = this.f7276b - this.f7277c;
        dVar.mo9080b(this.f7275a, i, this.f7277c, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.f7277c = this.f7276b;
        this.f7278d += i3;
        m11829b();
        if (i5 <= this.f7276b) {
            dVar.mo9080b(this.f7275a, i4, 0, i5);
            this.f7277c = i5;
        } else {
            dVar.mo9076a(this.f7279e, i4, i5);
        }
        this.f7278d += i5;
    }

    /* renamed from: f */
    public void mo9166f(int i, int i2) {
        mo9171p(C2430z.m12124a(i, i2));
    }

    /* renamed from: o */
    public static int m11848o(int i) {
        return m11849q(C2430z.m12124a(i, 0));
    }

    /* renamed from: p */
    public void mo9171p(int i) {
        while ((i & -128) != 0) {
            mo9170n((i & 127) | Allocation.USAGE_SHARED);
            i >>>= 7;
        }
        mo9170n(i);
    }

    /* renamed from: k */
    public void mo9168k(long j) {
        while ((-128 & j) != 0) {
            mo9170n((((int) j) & 127) | Allocation.USAGE_SHARED);
            j >>>= 7;
        }
        mo9170n((int) j);
    }

    /* renamed from: r */
    public void mo9172r(int i) {
        mo9170n(i & 255);
        mo9170n((i >> 8) & 255);
        mo9170n((i >> 16) & 255);
        mo9170n((i >> 24) & 255);
    }

    /* renamed from: m */
    public void mo9169m(long j) {
        mo9170n(((int) j) & 255);
        mo9170n(((int) (j >> 8)) & 255);
        mo9170n(((int) (j >> 16)) & 255);
        mo9170n(((int) (j >> 24)) & 255);
        mo9170n(((int) (j >> 32)) & 255);
        mo9170n(((int) (j >> 40)) & 255);
        mo9170n(((int) (j >> 48)) & 255);
        mo9170n(((int) (j >> 56)) & 255);
    }
}
