package p073b.p085h.p087b.p088a.p140c;

import java.io.Serializable;

/* renamed from: b.h.b.a.c.e */
/* compiled from: MapEntry */
final class C2927e<K, V> implements Serializable {

    /* renamed from: a */
    public final K f8274a;

    /* renamed from: b */
    public final V f8275b;

    public C2927e(K k, V v) {
        this.f8274a = k;
        this.f8275b = v;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C2927e)) {
            return false;
        }
        C2927e eVar = (C2927e) obj;
        if (this.f8274a != null ? this.f8274a.equals(eVar.f8274a) : eVar.f8274a == null) {
            if (this.f8275b != null ? this.f8275b.equals(eVar.f8275b) : eVar.f8275b == null) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f8274a == null ? 0 : this.f8274a.hashCode();
        if (this.f8275b != null) {
            i = this.f8275b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8274a);
        sb.append("=");
        sb.append(this.f8275b);
        return sb.toString();
    }
}
