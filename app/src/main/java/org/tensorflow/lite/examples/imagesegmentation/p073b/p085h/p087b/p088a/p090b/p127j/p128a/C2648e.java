package p073b.p085h.p087b.p088a.p090b.p127j.p128a;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2278a;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;

/* renamed from: b.h.b.a.b.j.a.e */
/* compiled from: ClassData.kt */
public final class C2648e {

    /* renamed from: a */
    private final C2285c f7821a;

    /* renamed from: b */
    private final C2216c f7822b;

    /* renamed from: c */
    private final C2278a f7823c;

    /* renamed from: d */
    private final C1692am f7824d;

    /* renamed from: a */
    public final C2285c mo9699a() {
        return this.f7821a;
    }

    /* renamed from: b */
    public final C2216c mo9700b() {
        return this.f7822b;
    }

    /* renamed from: c */
    public final C2278a mo9701c() {
        return this.f7823c;
    }

    /* renamed from: d */
    public final C1692am mo9702d() {
        return this.f7824d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f7824d, (java.lang.Object) r3.f7824d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2648e
            if (r0 == 0) goto L_0x0031
            b.h.b.a.b.j.a.e r3 = (p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2648e) r3
            b.h.b.a.b.e.a.c r0 = r2.f7821a
            b.h.b.a.b.e.a.c r1 = r3.f7821a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x0031
            b.h.b.a.b.e.a$c r0 = r2.f7822b
            b.h.b.a.b.e.a$c r1 = r3.f7822b
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x0031
            b.h.b.a.b.e.a.a r0 = r2.f7823c
            b.h.b.a.b.e.a.a r1 = r3.f7823c
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x0031
            b.h.b.a.b.b.am r0 = r2.f7824d
            b.h.b.a.b.b.am r3 = r3.f7824d
            boolean r3 = p073b.p079e.p081b.C1489j.m6971a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2648e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2285c cVar = this.f7821a;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        C2216c cVar2 = this.f7822b;
        int hashCode2 = (hashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        C2278a aVar = this.f7823c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C1692am amVar = this.f7824d;
        if (amVar != null) {
            i = amVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassData(nameResolver=");
        sb.append(this.f7821a);
        sb.append(", classProto=");
        sb.append(this.f7822b);
        sb.append(", metadataVersion=");
        sb.append(this.f7823c);
        sb.append(", sourceElement=");
        sb.append(this.f7824d);
        sb.append(")");
        return sb.toString();
    }

    public C2648e(C2285c cVar, C2216c cVar2, C2278a aVar, C1692am amVar) {
        C1489j.m6972b(cVar, "nameResolver");
        C1489j.m6972b(cVar2, "classProto");
        C1489j.m6972b(aVar, "metadataVersion");
        C1489j.m6972b(amVar, "sourceElement");
        this.f7821a = cVar;
        this.f7822b = cVar2;
        this.f7823c = aVar;
        this.f7824d = amVar;
    }
}
