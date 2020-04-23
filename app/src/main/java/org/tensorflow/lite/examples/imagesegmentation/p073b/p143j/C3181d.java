package p073b.p143j;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p073b.C3218m;
import p073b.C3221p;
import p073b.C3227u;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.p082a.C1474a;
import p073b.p084g.C1515c;
import p073b.p084g.C1517d;
import p073b.p142i.C3160h;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BJ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012+\u0010\b\u001a'\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\t¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002R3\u0010\b\u001a'\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\t¢\u0006\u0002\b\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo10386c = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"})
/* renamed from: b.j.d */
/* compiled from: Strings.kt */
final class C3181d implements C3160h<C1515c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f8591a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f8592b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f8593c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1461m<CharSequence, Integer, C3221p<Integer, Integer>> f8594d;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, mo10386c = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"})
    /* renamed from: b.j.d$a */
    /* compiled from: Strings.kt */
    public static final class C3182a implements C1474a, Iterator<C1515c> {

        /* renamed from: a */
        final /* synthetic */ C3181d f8595a;

        /* renamed from: b */
        private int f8596b = -1;

        /* renamed from: c */
        private int f8597c;

        /* renamed from: d */
        private int f8598d;

        /* renamed from: e */
        private C1515c f8599e;

        /* renamed from: f */
        private int f8600f;

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C3182a(C3181d dVar) {
            this.f8595a = dVar;
            this.f8597c = C1517d.m7044a(dVar.f8592b, 0, dVar.f8591a.length());
            this.f8598d = this.f8597c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
            if (r6.f8600f < p073b.p143j.C3181d.m14711a(r6.f8595a)) goto L_0x0027;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m14716b() {
            /*
                r6 = this;
                int r0 = r6.f8598d
                r1 = 0
                if (r0 >= 0) goto L_0x000e
                r6.f8596b = r1
                r0 = 0
                b.g.c r0 = (p073b.p084g.C1515c) r0
                r6.f8599e = r0
                goto L_0x00a4
            L_0x000e:
                b.j.d r0 = r6.f8595a
                int r0 = r0.f8593c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0027
                int r0 = r6.f8600f
                int r0 = r0 + r3
                r6.f8600f = r0
                int r0 = r6.f8600f
                b.j.d r4 = r6.f8595a
                int r4 = r4.f8593c
                if (r0 >= r4) goto L_0x0035
            L_0x0027:
                int r0 = r6.f8598d
                b.j.d r4 = r6.f8595a
                java.lang.CharSequence r4 = r4.f8591a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x004b
            L_0x0035:
                int r0 = r6.f8597c
                b.g.c r1 = new b.g.c
                b.j.d r4 = r6.f8595a
                java.lang.CharSequence r4 = r4.f8591a
                int r4 = p073b.p143j.C3199m.m14794b(r4)
                r1.<init>(r0, r4)
                r6.f8599e = r1
                r6.f8598d = r2
                goto L_0x00a2
            L_0x004b:
                b.j.d r0 = r6.f8595a
                b.e.a.m r0 = r0.f8594d
                b.j.d r4 = r6.f8595a
                java.lang.CharSequence r4 = r4.f8591a
                int r5 = r6.f8598d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo6920a(r4, r5)
                b.p r0 = (p073b.C3221p) r0
                if (r0 != 0) goto L_0x007b
                int r0 = r6.f8597c
                b.g.c r1 = new b.g.c
                b.j.d r4 = r6.f8595a
                java.lang.CharSequence r4 = r4.f8591a
                int r4 = p073b.p143j.C3199m.m14794b(r4)
                r1.<init>(r0, r4)
                r6.f8599e = r1
                r6.f8598d = r2
                goto L_0x00a2
            L_0x007b:
                java.lang.Object r2 = r0.mo10389c()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo10390d()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f8597c
                b.g.c r4 = p073b.p084g.C1517d.m7047b(r4, r2)
                r6.f8599e = r4
                int r2 = r2 + r0
                r6.f8597c = r2
                int r2 = r6.f8597c
                if (r0 != 0) goto L_0x009f
                r1 = 1
            L_0x009f:
                int r2 = r2 + r1
                r6.f8598d = r2
            L_0x00a2:
                r6.f8596b = r3
            L_0x00a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p143j.C3181d.C3182a.m14716b():void");
        }

        /* renamed from: a */
        public C1515c next() {
            if (this.f8596b == -1) {
                m14716b();
            }
            if (this.f8596b != 0) {
                C1515c cVar = this.f8599e;
                if (cVar != null) {
                    this.f8599e = null;
                    this.f8596b = -1;
                    return cVar;
                }
                throw new C3227u("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f8596b == -1) {
                m14716b();
            }
            return this.f8596b == 1;
        }
    }

    public C3181d(CharSequence charSequence, int i, int i2, C1461m<? super CharSequence, ? super Integer, C3221p<Integer, Integer>> mVar) {
        C1489j.m6972b(charSequence, "input");
        C1489j.m6972b(mVar, "getNextMatch");
        this.f8591a = charSequence;
        this.f8592b = i;
        this.f8593c = i2;
        this.f8594d = mVar;
    }

    /* renamed from: a */
    public Iterator<C1515c> mo6822a() {
        return new C3182a<>(this);
    }
}
