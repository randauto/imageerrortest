package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c;

import java.util.Collection;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.C1834a.C1835a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f.C2021h;

/* renamed from: b.h.b.a.b.d.a.c.k */
/* compiled from: context.kt */
public final class C1971k {

    /* renamed from: a */
    private final C2021h f5928a;

    /* renamed from: b */
    private final Collection<C1835a> f5929b;

    /* renamed from: a */
    public final C2021h mo7811a() {
        return this.f5928a;
    }

    /* renamed from: b */
    public final Collection<C1835a> mo7812b() {
        return this.f5929b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f5929b, (java.lang.Object) r3.f5929b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1971k
            if (r0 == 0) goto L_0x001d
            b.h.b.a.b.d.a.c.k r3 = (p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1971k) r3
            b.h.b.a.b.d.a.f.h r0 = r2.f5928a
            b.h.b.a.b.d.a.f.h r1 = r3.f5928a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.Collection<b.h.b.a.b.d.a.a$a> r0 = r2.f5929b
            java.util.Collection<b.h.b.a.b.d.a.a$a> r3 = r3.f5929b
            boolean r3 = p073b.p079e.p081b.C1489j.m6971a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1971k.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2021h hVar = this.f5928a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        Collection<C1835a> collection = this.f5929b;
        if (collection != null) {
            i = collection.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NullabilityQualifierWithApplicability(nullabilityQualifier=");
        sb.append(this.f5928a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f5929b);
        sb.append(")");
        return sb.toString();
    }

    public C1971k(C2021h hVar, Collection<? extends C1835a> collection) {
        C1489j.m6972b(hVar, "nullabilityQualifier");
        C1489j.m6972b(collection, "qualifierApplicabilityTypes");
        this.f5928a = hVar;
        this.f5929b = collection;
    }
}
