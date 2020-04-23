package p073b.p085h.p087b.p088a.p090b.p139n;

import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.n.f */
/* compiled from: numbers.kt */
public final class C2904f {

    /* renamed from: a */
    private final String f8233a;

    /* renamed from: b */
    private final int f8234b;

    /* renamed from: a */
    public final String mo9994a() {
        return this.f8233a;
    }

    /* renamed from: b */
    public final int mo9995b() {
        return this.f8234b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2904f) {
                C2904f fVar = (C2904f) obj;
                if (C1489j.m6971a((Object) this.f8233a, (Object) fVar.f8233a)) {
                    if (this.f8234b == fVar.f8234b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f8233a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f8234b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberWithRadix(number=");
        sb.append(this.f8233a);
        sb.append(", radix=");
        sb.append(this.f8234b);
        sb.append(")");
        return sb.toString();
    }

    public C2904f(String str, int i) {
        C1489j.m6972b(str, "number");
        this.f8233a = str;
        this.f8234b = i;
    }
}
