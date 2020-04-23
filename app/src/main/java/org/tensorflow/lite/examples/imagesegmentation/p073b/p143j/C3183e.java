package p073b.p143j;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p084g.C1515c;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo10386c = {"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-stdlib"})
/* renamed from: b.j.e */
/* compiled from: Regex.kt */
public final class C3183e {

    /* renamed from: a */
    private final String f8601a;

    /* renamed from: b */
    private final C1515c f8602b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p073b.p079e.p081b.C1489j.m6971a((java.lang.Object) r2.f8602b, (java.lang.Object) r3.f8602b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p073b.p143j.C3183e
            if (r0 == 0) goto L_0x001d
            b.j.e r3 = (p073b.p143j.C3183e) r3
            java.lang.String r0 = r2.f8601a
            java.lang.String r1 = r3.f8601a
            boolean r0 = p073b.p079e.p081b.C1489j.m6971a(r0, r1)
            if (r0 == 0) goto L_0x001d
            b.g.c r0 = r2.f8602b
            b.g.c r3 = r3.f8602b
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
        throw new UnsupportedOperationException("Method not decompiled: p073b.p143j.C3183e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f8601a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C1515c cVar = this.f8602b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MatchGroup(value=");
        sb.append(this.f8601a);
        sb.append(", range=");
        sb.append(this.f8602b);
        sb.append(")");
        return sb.toString();
    }

    public C3183e(String str, C1515c cVar) {
        C1489j.m6972b(str, "value");
        C1489j.m6972b(cVar, "range");
        this.f8601a = str;
        this.f8602b = cVar;
    }
}
