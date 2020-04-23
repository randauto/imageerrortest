package p073b.p074a;

import java.util.Enumeration;
import java.util.Iterator;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0002¨\u0006\u0004"}, mo10386c = {"iterator", "", "T", "Ljava/util/Enumeration;", "kotlin-stdlib"})
/* renamed from: b.a.o */
/* compiled from: IteratorsJVM.kt */
class C1419o extends C1418n {

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo10386c = {"kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    /* renamed from: b.a.o$a */
    /* compiled from: IteratorsJVM.kt */
    public static final class C1420a implements C1474a, Iterator<T> {

        /* renamed from: a */
        final /* synthetic */ Enumeration f4836a;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C1420a(Enumeration<T> enumeration) {
            this.f4836a = enumeration;
        }

        public boolean hasNext() {
            return this.f4836a.hasMoreElements();
        }

        public T next() {
            return this.f4836a.nextElement();
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m6844a(Enumeration<T> enumeration) {
        C1489j.m6972b(enumeration, "$receiver");
        return new C1420a<>(enumeration);
    }
}
