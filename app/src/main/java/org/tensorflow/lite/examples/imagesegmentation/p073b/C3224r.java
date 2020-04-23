package p073b;

import java.io.Serializable;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, mo10386c = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"})
/* renamed from: b.r */
/* compiled from: LazyJVM.kt */
final class C3224r<T> implements C1511g<T>, Serializable {

    /* renamed from: a */
    private C1449a<? extends T> f8638a;

    /* renamed from: b */
    private volatile Object f8639b;

    /* renamed from: c */
    private final Object f8640c;

    public C3224r(C1449a<? extends T> aVar, Object obj) {
        C1489j.m6972b(aVar, "initializer");
        this.f8638a = aVar;
        this.f8639b = C3228v.f8644a;
        if (obj == 0) {
            obj = this;
        }
        this.f8640c = obj;
    }

    public /* synthetic */ C3224r(C1449a aVar, Object obj, int i, C1486g gVar) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(aVar, obj);
    }

    /* renamed from: a */
    public T mo6918a() {
        T t;
        T t2 = this.f8639b;
        if (t2 != C3228v.f8644a) {
            return t2;
        }
        synchronized (this.f8640c) {
            t = this.f8639b;
            if (t == C3228v.f8644a) {
                C1449a<? extends T> aVar = this.f8638a;
                if (aVar == null) {
                    C1489j.m6968a();
                }
                t = aVar.mo6823a();
                this.f8639b = t;
                this.f8638a = null;
            }
        }
        return t;
    }

    /* renamed from: b */
    public boolean mo10396b() {
        return this.f8639b != C3228v.f8644a;
    }

    public String toString() {
        return mo10396b() ? String.valueOf(mo6918a()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C1447e(mo6918a());
    }
}
