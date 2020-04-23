package p073b.p079e.p081b;

import p073b.p085h.C1522a;
import p073b.p085h.C3135k;

/* renamed from: b.e.b.p */
/* compiled from: PropertyReference */
public abstract class C1495p extends C1481c implements C3135k {
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C3135k mo6929e() {
        return (C3135k) super.mo6929e();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1495p) {
            C1495p pVar = (C1495p) obj;
            if (!mo6930f().equals(pVar.mo6930f()) || !mo6931g().equals(pVar.mo6931g()) || !mo6932h().equals(pVar.mo6932h()) || !C1489j.m6971a(mo6927c(), pVar.mo6927c())) {
                z = false;
            }
            return z;
        } else if (obj instanceof C3135k) {
            return obj.equals(mo6928d());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((mo6930f().hashCode() * 31) + mo6931g().hashCode()) * 31) + mo6932h().hashCode();
    }

    public String toString() {
        C1522a d = mo6928d();
        if (d != this) {
            return d.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(mo6931g());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
