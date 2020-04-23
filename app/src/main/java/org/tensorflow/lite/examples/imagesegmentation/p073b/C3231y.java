package p073b;

import java.io.Serializable;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo10386c = {"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"})
/* renamed from: b.y */
/* compiled from: Lazy.kt */
public final class C3231y<T> implements C1511g<T>, Serializable {

    /* renamed from: a */
    private C1449a<? extends T> f8646a;

    /* renamed from: b */
    private Object f8647b = C3228v.f8644a;

    public C3231y(C1449a<? extends T> aVar) {
        C1489j.m6972b(aVar, "initializer");
        this.f8646a = aVar;
    }

    /* renamed from: a */
    public T mo6918a() {
        if (this.f8647b == C3228v.f8644a) {
            C1449a<? extends T> aVar = this.f8646a;
            if (aVar == null) {
                C1489j.m6968a();
            }
            this.f8647b = aVar.mo6823a();
            this.f8646a = null;
        }
        return this.f8647b;
    }

    /* renamed from: b */
    public boolean mo10406b() {
        return this.f8647b != C3228v.f8644a;
    }

    public String toString() {
        return mo10406b() ? String.valueOf(mo6918a()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C1447e(mo6918a());
    }
}
