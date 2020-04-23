package p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a;

import p073b.C3232z;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.e.b.a.n */
/* compiled from: utfEncoding.kt */
public final class C2329n {
    /* renamed from: a */
    public static final byte[] m11408a(String[] strArr) {
        int i;
        C1489j.m6972b(strArr, "strings");
        boolean z = false;
        int i2 = 0;
        for (String length : strArr) {
            i2 += length.length();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (String str : strArr) {
            int length2 = str.length() - 1;
            if (length2 >= 0) {
                int i4 = 0;
                while (true) {
                    i = i3 + 1;
                    bArr[i3] = (byte) str.charAt(i4);
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
                i3 = i;
            }
        }
        if (i3 == bArr.length) {
            z = true;
        }
        if (!C3232z.f8648a || z) {
            return bArr;
        }
        throw new AssertionError("Should have reached the end");
    }
}
