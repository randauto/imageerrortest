package p073b.p142i;

import java.util.Iterator;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo10386c = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"})
/* renamed from: b.i.b */
/* compiled from: Sequences.kt */
public final class C3150b<T> implements C3152c<T>, C3160h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3160h<T> f8550a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f8551b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, mo10386c = {"kotlin/sequences/DropSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"})
    /* renamed from: b.i.b$a */
    /* compiled from: Sequences.kt */
    public static final class C3151a implements C1474a, Iterator<T> {

        /* renamed from: a */
        final /* synthetic */ C3150b f8552a;

        /* renamed from: b */
        private final Iterator<T> f8553b;

        /* renamed from: c */
        private int f8554c;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C3151a(C3150b bVar) {
            this.f8552a = bVar;
            this.f8553b = bVar.f8550a.mo6822a();
            this.f8554c = bVar.f8551b;
        }

        /* renamed from: a */
        private final void m14644a() {
            while (this.f8554c > 0 && this.f8553b.hasNext()) {
                this.f8553b.next();
                this.f8554c--;
            }
        }

        public T next() {
            m14644a();
            return this.f8553b.next();
        }

        public boolean hasNext() {
            m14644a();
            return this.f8553b.hasNext();
        }
    }

    public C3150b(C3160h<? extends T> hVar, int i) {
        C1489j.m6972b(hVar, "sequence");
        this.f8550a = hVar;
        this.f8551b = i;
        if (!(this.f8551b >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("count must be non-negative, but was ");
            sb.append(this.f8551b);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* renamed from: a */
    public C3160h<T> mo10333a(int i) {
        return new C3150b<>(this.f8550a, this.f8551b + i);
    }

    /* renamed from: a */
    public Iterator<T> mo6822a() {
        return new C3151a<>(this);
    }
}
