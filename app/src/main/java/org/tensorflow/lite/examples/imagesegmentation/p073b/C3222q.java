package p073b;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\b@\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, mo10386c = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"})
/* renamed from: b.q */
/* compiled from: LazyJVM.kt */
final class C3222q<T> implements C1511g<T>, Serializable {

    /* renamed from: a */
    public static final C3223a f8633a = new C3223a(null);

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater<C3222q<?>, Object> f8634e = AtomicReferenceFieldUpdater.newUpdater(C3222q.class, Object.class, "c");

    /* renamed from: b */
    private volatile C1449a<? extends T> f8635b;

    /* renamed from: c */
    private volatile Object f8636c = C3228v.f8644a;

    /* renamed from: d */
    private final Object f8637d = C3228v.f8644a;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R^\u0010\u0003\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo10386c = {"Lkotlin/SafePublicationLazyImpl$Companion;", "", "()V", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "kotlin-stdlib"})
    /* renamed from: b.q$a */
    /* compiled from: LazyJVM.kt */
    public static final class C3223a {
        private C3223a() {
        }

        public /* synthetic */ C3223a(C1486g gVar) {
            this();
        }
    }

    public C3222q(C1449a<? extends T> aVar) {
        C1489j.m6972b(aVar, "initializer");
        this.f8635b = aVar;
    }

    /* renamed from: a */
    public T mo6918a() {
        T t = this.f8636c;
        if (t != C3228v.f8644a) {
            return t;
        }
        C1449a<? extends T> aVar = this.f8635b;
        if (aVar != null) {
            T a = aVar.mo6823a();
            if (f8634e.compareAndSet(this, C3228v.f8644a, a)) {
                this.f8635b = null;
                return a;
            }
        }
        return this.f8636c;
    }

    /* renamed from: b */
    public boolean mo10394b() {
        return this.f8636c != C3228v.f8644a;
    }

    public String toString() {
        return mo10394b() ? String.valueOf(mo6918a()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new C1447e(mo6918a());
    }
}
