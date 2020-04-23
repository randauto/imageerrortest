package p073b.p085h.p087b.p088a.p090b.p118h;

import java.util.List;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.h.o */
/* compiled from: RenderingUtils.kt */
public final class C2482o {
    /* renamed from: a */
    public static final String m12454a(C2360f fVar) {
        C1489j.m6972b(fVar, "$receiver");
        if (m12456b(fVar)) {
            StringBuilder sb = new StringBuilder();
            String a = fVar.mo9039a();
            C1489j.m6969a((Object) a, "asString()");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf('`'));
            sb2.append(a);
            sb.append(sb2.toString());
            sb.append('`');
            return sb.toString();
        }
        String a2 = fVar.mo9039a();
        C1489j.m6969a((Object) a2, "asString()");
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != false) goto L_0x003e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m12456b(p073b.p085h.p087b.p088a.p090b.p116f.C2360f r5) {
        /*
            boolean r0 = r5.mo9041c()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r5 = r5.mo9039a()
            java.util.Set<java.lang.String> r0 = p073b.p085h.p087b.p088a.p090b.p118h.C2476k.f7519a
            boolean r0 = r0.contains(r5)
            r2 = 1
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "string"
            p073b.p079e.p081b.C1489j.m6969a(r5, r0)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0 = 0
        L_0x001d:
            int r3 = r5.length()
            if (r0 >= r3) goto L_0x003b
            char r3 = r5.charAt(r0)
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 != 0) goto L_0x0033
            r4 = 95
            if (r3 == r4) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 == 0) goto L_0x0038
            r5 = 1
            goto L_0x003c
        L_0x0038:
            int r0 = r0 + 1
            goto L_0x001d
        L_0x003b:
            r5 = 0
        L_0x003c:
            if (r5 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p118h.C2482o.m12456b(b.h.b.a.b.f.f):boolean");
    }

    /* renamed from: a */
    public static final String m12453a(C2356c cVar) {
        C1489j.m6972b(cVar, "$receiver");
        List h = cVar.mo9034h();
        C1489j.m6969a((Object) h, "pathSegments()");
        return m12455a(h);
    }

    /* renamed from: a */
    public static final String m12455a(List<C2360f> list) {
        C1489j.m6972b(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C2360f fVar : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m12454a(fVar));
        }
        String sb2 = sb.toString();
        C1489j.m6969a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
