package p073b.p084g;

import java.util.NoSuchElementException;
import p073b.C3218m;
import p073b.p074a.C1388ac;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo10386c = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"})
/* renamed from: b.g.b */
/* compiled from: ProgressionIterators.kt */
public final class C1514b extends C1388ac {

    /* renamed from: a */
    private final int f4879a;

    /* renamed from: b */
    private boolean f4880b;

    /* renamed from: c */
    private int f4881c;

    /* renamed from: d */
    private final int f4882d;

    public C1514b(int i, int i2, int i3) {
        this.f4882d = i3;
        this.f4879a = i2;
        boolean z = false;
        if (this.f4882d <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f4880b = z;
        if (!this.f4880b) {
            i = this.f4879a;
        }
        this.f4881c = i;
    }

    public boolean hasNext() {
        return this.f4880b;
    }

    /* renamed from: b */
    public int mo6764b() {
        int i = this.f4881c;
        if (i != this.f4879a) {
            this.f4881c += this.f4882d;
        } else if (this.f4880b) {
            this.f4880b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
