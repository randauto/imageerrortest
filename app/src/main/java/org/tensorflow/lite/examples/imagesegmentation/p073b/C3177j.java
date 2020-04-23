package p073b;

import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, mo10386c = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"})
/* renamed from: b.j */
/* compiled from: LazyJVM.kt */
class C3177j {
    /* renamed from: a */
    public static final <T> C1511g<T> m14706a(C1449a<? extends T> aVar) {
        C1489j.m6972b(aVar, "initializer");
        return new C3224r<>(aVar, null, 2, null);
    }

    /* renamed from: a */
    public static final <T> C1511g<T> m14707a(C3217l lVar, C1449a<? extends T> aVar) {
        C1489j.m6972b(lVar, "mode");
        C1489j.m6972b(aVar, "initializer");
        switch (lVar) {
            case SYNCHRONIZED:
                return new C3224r<>(aVar, null, 2, null);
            case PUBLICATION:
                return new C3222q<>(aVar);
            case NONE:
                return new C3231y<>(aVar);
            default:
                throw new C3219n();
        }
    }
}
