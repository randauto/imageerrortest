package p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a;

/* renamed from: b.h.b.a.b.e.b.a.b */
/* compiled from: BitEncoding */
public class C2310b {

    /* renamed from: a */
    static final /* synthetic */ boolean f7093a = (!C2310b.class.desiredAssertionStatus());

    /* renamed from: b */
    private static final boolean f7094b;

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        f7094b = "true".equals(str);
    }

    private C2310b() {
    }

    /* renamed from: a */
    private static void m11365a(byte[] bArr, int i) {
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((bArr[i2] + i) & 127);
        }
    }

    /* renamed from: a */
    public static byte[] m11367a(String[] strArr) {
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                return C2329n.m11408a(m11368b(strArr));
            }
            if (charAt == 65535) {
                strArr = m11368b(strArr);
            }
        }
        byte[] c = m11369c(strArr);
        m11365a(c, 127);
        return m11366a(c);
    }

    /* renamed from: b */
    private static String[] m11368b(String[] strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }

    /* renamed from: c */
    private static byte[] m11369c(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            if (f7093a || str.length() <= 65535) {
                i2 += str.length();
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("String is too long: ");
                sb.append(str.length());
                throw new AssertionError(sb.toString());
            }
        }
        byte[] bArr = new byte[i2];
        int length2 = strArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            String str2 = strArr[i3];
            int length3 = str2.length();
            int i5 = i4;
            int i6 = 0;
            while (i6 < length3) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) str2.charAt(i6);
                i6++;
                i5 = i7;
            }
            i3++;
            i4 = i5;
        }
        return bArr;
    }

    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v2
      assigns: []
      uses: []
      mth insns count: 30
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m11366a(byte[] r11) {
        /*
            int r0 = r11.length
            int r0 = r0 * 7
            int r0 = r0 / 8
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x002f
            byte r6 = r11[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 >>> r5
            r7 = 1
            int r4 = r4 + r7
            byte r8 = r11[r4]
            int r9 = r5 + 1
            int r10 = r7 << r9
            int r10 = r10 - r7
            r7 = r8 & r10
            int r8 = 7 - r5
            int r7 = r7 << r8
            int r6 = r6 + r7
            byte r6 = (byte) r6
            r1[r3] = r6
            r6 = 6
            if (r5 != r6) goto L_0x002b
            int r4 = r4 + 1
            r5 = 0
            goto L_0x002c
        L_0x002b:
            r5 = r9
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2310b.m11366a(byte[]):byte[]");
    }
}
