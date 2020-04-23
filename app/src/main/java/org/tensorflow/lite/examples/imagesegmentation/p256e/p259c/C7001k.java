package p256e.p259c;

import java.io.Serializable;

/* renamed from: e.c.k */
/* compiled from: PVector */
public class C7001k implements Serializable {

    /* renamed from: a */
    public float f24838a;

    /* renamed from: b */
    public float f24839b;

    /* renamed from: c */
    public float f24840c;

    public C7001k() {
    }

    public C7001k(float f, float f2, float f3) {
        this.f24838a = f;
        this.f24839b = f2;
        this.f24840c = f3;
    }

    public C7001k(float f, float f2) {
        this.f24838a = f;
        this.f24839b = f2;
        this.f24840c = 0.0f;
    }

    /* renamed from: a */
    public C7001k mo22081a() {
        return new C7001k(this.f24838a, this.f24839b, this.f24840c);
    }

    /* renamed from: a */
    public float mo22080a(C7001k kVar) {
        float f = this.f24838a - kVar.f24838a;
        float f2 = this.f24839b - kVar.f24839b;
        float f3 = this.f24840c - kVar.f24840c;
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(this.f24838a);
        sb.append(", ");
        sb.append(this.f24839b);
        sb.append(", ");
        sb.append(this.f24840c);
        sb.append(" ]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C7001k)) {
            return false;
        }
        C7001k kVar = (C7001k) obj;
        if (this.f24838a == kVar.f24838a && this.f24839b == kVar.f24839b && this.f24840c == kVar.f24840c) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(this.f24838a) + 31) * 31) + Float.floatToIntBits(this.f24839b)) * 31) + Float.floatToIntBits(this.f24840c);
    }
}
