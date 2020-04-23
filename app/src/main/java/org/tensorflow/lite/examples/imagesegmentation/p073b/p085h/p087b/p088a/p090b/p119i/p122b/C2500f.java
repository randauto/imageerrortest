package p073b.p085h.p087b.p088a.p090b.p119i.p122b;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.i.b.f */
/* compiled from: constantValues.kt */
public abstract class C2500f<T> {

    /* renamed from: a */
    private final T f7547a;

    /* renamed from: a */
    public abstract C2841w mo9516a(C1821y yVar);

    public C2500f(T t) {
        this.f7547a = t;
    }

    /* renamed from: a */
    public T mo9521a() {
        return this.f7547a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object a = mo9521a();
            Object obj2 = null;
            if (!(obj instanceof C2500f)) {
                obj = null;
            }
            C2500f fVar = (C2500f) obj;
            if (fVar != null) {
                obj2 = fVar.mo9521a();
            }
            if (!C1489j.m6971a(a, obj2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object a = mo9521a();
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo9521a());
    }
}
