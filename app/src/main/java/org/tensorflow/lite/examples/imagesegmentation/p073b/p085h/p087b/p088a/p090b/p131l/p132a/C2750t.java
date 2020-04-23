package p073b.p085h.p087b.p088a.p090b.p131l.p132a;

import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p135d.C2806b;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.l.a.t */
/* compiled from: utils.kt */
public final class C2750t {

    /* renamed from: b.h.b.a.b.l.a.t$a */
    /* compiled from: utils.kt */
    static final class C2751a extends C1490k implements C1450b<String, StringBuilder> {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f8012a;

        C2751a(StringBuilder sb) {
            this.f8012a = sb;
            super(1);
        }

        /* renamed from: a */
        public final StringBuilder mo6756a(String str) {
            C1489j.m6972b(str, "$receiver");
            StringBuilder sb = this.f8012a;
            sb.append(str);
            C1489j.m6969a((Object) sb, "append(value)");
            return C3199m.m14742a(sb);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p073b.p085h.p087b.p088a.p090b.p131l.C2841w m13452a(p073b.p085h.p087b.p088a.p090b.p131l.C2841w r9, p073b.p085h.p087b.p088a.p090b.p131l.C2841w r10, p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2743r r11) {
        /*
            java.lang.String r0 = "subtype"
            p073b.p079e.p081b.C1489j.m6972b(r9, r0)
            java.lang.String r0 = "supertype"
            p073b.p079e.p081b.C1489j.m6972b(r10, r0)
            java.lang.String r0 = "typeCheckingProcedureCallbacks"
            p073b.p079e.p081b.C1489j.m6972b(r11, r0)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            b.h.b.a.b.l.a.n r1 = new b.h.b.a.b.l.a.n
            r2 = 0
            r1.<init>(r9, r2)
            r0.add(r1)
            b.h.b.a.b.l.an r9 = r10.mo9507g()
        L_0x0021:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x0135
            java.lang.Object r10 = r0.poll()
            b.h.b.a.b.l.a.n r10 = (p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2730n) r10
            b.h.b.a.b.l.w r1 = r10.mo9843a()
            b.h.b.a.b.l.an r3 = r1.mo9507g()
            boolean r4 = r11.mo9825a(r3, r9)
            if (r4 == 0) goto L_0x0113
            boolean r0 = r1.mo7897c()
            b.h.b.a.b.l.a.n r10 = r10.mo9844b()
        L_0x0043:
            if (r10 == 0) goto L_0x00c5
            b.h.b.a.b.l.w r3 = r10.mo9843a()
            java.util.List r4 = r3.mo9501a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0060
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0060
        L_0x005e:
            r4 = 0
            goto L_0x007e
        L_0x0060:
            java.util.Iterator r4 = r4.iterator()
        L_0x0064:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r4.next()
            b.h.b.a.b.l.ap r5 = (p073b.p085h.p087b.p088a.p090b.p131l.C2771ap) r5
            b.h.b.a.b.l.ba r5 = r5.mo9868b()
            b.h.b.a.b.l.ba r8 = p073b.p085h.p087b.p088a.p090b.p131l.C2792ba.INVARIANT
            if (r5 == r8) goto L_0x007a
            r5 = 1
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            if (r5 == 0) goto L_0x0064
            r4 = 1
        L_0x007e:
            if (r4 == 0) goto L_0x009e
            b.h.b.a.b.l.ao$a r4 = p073b.p085h.p087b.p088a.p090b.p131l.C2768ao.f8029b
            b.h.b.a.b.l.as r4 = r4.mo9874a(r3)
            b.h.b.a.b.l.as r4 = p073b.p085h.p087b.p088a.p090b.p119i.p120a.p121a.C2490c.m12500a(r4, r7, r6, r2)
            b.h.b.a.b.l.au r4 = r4.mo9881f()
            b.h.b.a.b.l.ba r5 = p073b.p085h.p087b.p088a.p090b.p131l.C2792ba.INVARIANT
            b.h.b.a.b.l.w r1 = r4.mo9885a(r1, r5)
            java.lang.String r4 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)"
            p073b.p079e.p081b.C1489j.m6969a(r1, r4)
            b.h.b.a.b.l.w r1 = m13451a(r1)
            goto L_0x00b3
        L_0x009e:
            b.h.b.a.b.l.ao$a r4 = p073b.p085h.p087b.p088a.p090b.p131l.C2768ao.f8029b
            b.h.b.a.b.l.as r4 = r4.mo9874a(r3)
            b.h.b.a.b.l.au r4 = r4.mo9881f()
            b.h.b.a.b.l.ba r5 = p073b.p085h.p087b.p088a.p090b.p131l.C2792ba.INVARIANT
            b.h.b.a.b.l.w r1 = r4.mo9885a(r1, r5)
            java.lang.String r4 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)"
            p073b.p079e.p081b.C1489j.m6969a(r1, r4)
        L_0x00b3:
            if (r0 != 0) goto L_0x00be
            boolean r0 = r3.mo7897c()
            if (r0 == 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r0 = 0
            goto L_0x00bf
        L_0x00be:
            r0 = 1
        L_0x00bf:
            b.h.b.a.b.l.a.n r10 = r10.mo9844b()
            goto L_0x0043
        L_0x00c5:
            b.h.b.a.b.l.an r10 = r1.mo9507g()
            boolean r2 = r11.mo9825a(r10, r9)
            if (r2 == 0) goto L_0x00d4
            b.h.b.a.b.l.w r9 = p073b.p085h.p087b.p088a.p090b.p131l.C2783av.m13571a(r1, r0)
            return r9
        L_0x00d4:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type constructors should be equals!\n"
            r1.append(r2)
            java.lang.String r2 = "substitutedSuperType: "
            r1.append(r2)
            java.lang.String r2 = m13453a(r10)
            r1.append(r2)
            java.lang.String r2 = ", \n\n"
            r1.append(r2)
            java.lang.String r2 = "supertype: "
            r1.append(r2)
            java.lang.String r2 = m13453a(r9)
            r1.append(r2)
            java.lang.String r2 = " \n"
            r1.append(r2)
            boolean r9 = r11.mo9825a(r10, r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0113:
            java.util.Collection r1 = r3.mo7405C_()
            java.util.Iterator r1 = r1.iterator()
        L_0x011b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r1.next()
            b.h.b.a.b.l.w r3 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r3
            b.h.b.a.b.l.a.n r4 = new b.h.b.a.b.l.a.n
            java.lang.String r5 = "immediateSupertype"
            p073b.p079e.p081b.C1489j.m6969a(r3, r5)
            r4.<init>(r3, r10)
            r0.add(r4)
            goto L_0x011b
        L_0x0135:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2750t.m13452a(b.h.b.a.b.l.w, b.h.b.a.b.l.w, b.h.b.a.b.l.a.r):b.h.b.a.b.l.w");
    }

    /* renamed from: a */
    private static final C2841w m13451a(C2841w wVar) {
        return (C2841w) C2806b.m13693a(wVar).mo9916b();
    }

    /* renamed from: a */
    private static final String m13453a(C2767an anVar) {
        StringBuilder sb = new StringBuilder();
        C2751a aVar = new C2751a(sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type: ");
        sb2.append(anVar);
        aVar.mo6756a(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("hashCode: ");
        sb3.append(anVar.hashCode());
        aVar.mo6756a(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("javaClass: ");
        sb4.append(anVar.getClass().getCanonicalName());
        aVar.mo6756a(sb4.toString());
        for (C1804m d = anVar.mo7096d(); d != null; d = d.mo7065b()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("fqName: ");
            sb5.append(C2443c.f7421f.mo9344a(d));
            aVar.mo6756a(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("javaClass: ");
            sb6.append(d.getClass().getCanonicalName());
            aVar.mo6756a(sb6.toString());
        }
        String sb7 = sb.toString();
        C1489j.m6969a((Object) sb7, "StringBuilder().apply(builderAction).toString()");
        return sb7;
    }
}
