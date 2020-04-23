package p073b.p142i;

import java.util.Iterator;
import p073b.C3218m;
import p073b.p074a.C1406e;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00050\u000bH\u0002¢\u0006\u0002\b\u0016\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00170\u0001H\u0007¢\u0006\u0002\b\u0018\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\u0019\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001b0\u001a\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u001a0\u0001¨\u0006\u001c"}, mo10386c = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"})
/* renamed from: b.i.k */
/* compiled from: Sequences.kt */
class C3163k extends C3162j {

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"})
    /* renamed from: b.i.k$a */
    /* compiled from: Sequences.kt */
    static final class C3164a extends C1490k implements C1450b<C3160h<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C3164a f8574a = new C3164a();

        C3164a() {
            super(1);
        }

        /* renamed from: a */
        public final Iterator<T> mo6756a(C3160h<? extends T> hVar) {
            C1489j.m6972b(hVar, "it");
            return hVar.mo6822a();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo10386c = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"})
    /* renamed from: b.i.k$b */
    /* compiled from: Sequences.kt */
    static final class C3165b extends C1490k implements C1450b<T, T> {

        /* renamed from: a */
        public static final C3165b f8575a = new C3165b();

        C3165b() {
            super(1);
        }

        /* renamed from: a */
        public final T mo6756a(T t) {
            return t;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo10386c = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"})
    /* renamed from: b.i.k$c */
    /* compiled from: Sequences.kt */
    static final class C3166c extends C1490k implements C1450b<T, T> {

        /* renamed from: a */
        final /* synthetic */ C1449a f8576a;

        C3166c(C1449a aVar) {
            this.f8576a = aVar;
            super(1);
        }

        /* renamed from: a */
        public final T mo6756a(T t) {
            C1489j.m6972b(t, "it");
            return this.f8576a.mo6823a();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo10386c = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"})
    /* renamed from: b.i.k$d */
    /* compiled from: Sequences.kt */
    static final class C3167d extends C1490k implements C1449a<T> {

        /* renamed from: a */
        final /* synthetic */ Object f8577a;

        C3167d(Object obj) {
            this.f8577a = obj;
            super(0);
        }

        /* renamed from: a */
        public final T mo6823a() {
            return this.f8577a;
        }
    }

    /* renamed from: a */
    public static final <T> C3160h<T> m14669a(T... tArr) {
        C1489j.m6972b(tArr, "elements");
        return tArr.length == 0 ? C3161i.m14664a() : C1406e.m6827l(tArr);
    }

    /* renamed from: a */
    public static final <T> C3160h<T> m14664a() {
        return C3153d.f8555a;
    }

    /* renamed from: a */
    public static final <T> C3160h<T> m14666a(C3160h<? extends C3160h<? extends T>> hVar) {
        C1489j.m6972b(hVar, "$receiver");
        return m14667a(hVar, (C1450b<? super T, ? extends Iterator<? extends R>>) C3164a.f8574a);
    }

    /* renamed from: a */
    private static final <T, R> C3160h<R> m14667a(C3160h<? extends T> hVar, C1450b<? super T, ? extends Iterator<? extends R>> bVar) {
        if (hVar instanceof C3175o) {
            return ((C3175o) hVar).mo10354a(bVar);
        }
        return new C3156f<>(hVar, C3165b.f8575a, bVar);
    }

    /* renamed from: b */
    public static final <T> C3160h<T> m14670b(C3160h<? extends T> hVar) {
        C1489j.m6972b(hVar, "$receiver");
        return hVar instanceof C3149a ? hVar : new C3149a<>(hVar);
    }

    /* renamed from: a */
    public static final <T> C3160h<T> m14665a(C1449a<? extends T> aVar) {
        C1489j.m6972b(aVar, "nextFunction");
        return C3161i.m14670b(new C3158g(aVar, new C3166c(aVar)));
    }

    /* renamed from: a */
    public static final <T> C3160h<T> m14668a(T t, C1450b<? super T, ? extends T> bVar) {
        C1489j.m6972b(bVar, "nextFunction");
        if (t == null) {
            return C3153d.f8555a;
        }
        return new C3158g<>(new C3167d(t), bVar);
    }
}
