package p073b.p074a;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo10386c = {"Lkotlin/collections/IndexedValue;", "T", "", "index", "", "value", "(ILjava/lang/Object;)V", "getIndex", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "equals", "", "other", "hashCode", "toString", "", "kotlin-stdlib"})
/* renamed from: b.a.z */
/* compiled from: IndexedValue.kt */
public final class C1433z<T> {

    /* renamed from: a */
    private final int f4843a;

    /* renamed from: b */
    private final T f4844b;

    /* renamed from: c */
    public final int mo6912c() {
        return this.f4843a;
    }

    /* renamed from: d */
    public final T mo6913d() {
        return this.f4844b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1433z) {
                C1433z zVar = (C1433z) obj;
                if (!(this.f4843a == zVar.f4843a) || !C1489j.m6971a((Object) this.f4844b, (Object) zVar.f4844b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f4843a * 31;
        T t = this.f4844b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexedValue(index=");
        sb.append(this.f4843a);
        sb.append(", value=");
        sb.append(this.f4844b);
        sb.append(")");
        return sb.toString();
    }

    public C1433z(int i, T t) {
        this.f4843a = i;
        this.f4844b = t;
    }

    /* renamed from: a */
    public final int mo6910a() {
        return this.f4843a;
    }

    /* renamed from: b */
    public final T mo6911b() {
        return this.f4844b;
    }
}
