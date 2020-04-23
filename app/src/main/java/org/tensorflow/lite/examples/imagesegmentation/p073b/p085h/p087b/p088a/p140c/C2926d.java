package p073b.p085h.p087b.p088a.p140c;

/* renamed from: b.h.b.a.c.d */
/* compiled from: IntTreePMap */
final class C2926d<V> {

    /* renamed from: a */
    private static final C2926d<Object> f8272a = new C2926d<>(C2925c.f8266a);

    /* renamed from: b */
    private final C2925c<V> f8273b;

    /* renamed from: a */
    public static <V> C2926d<V> m14045a() {
        return f8272a;
    }

    private C2926d(C2925c<V> cVar) {
        this.f8273b = cVar;
    }

    /* renamed from: a */
    private C2926d<V> m14046a(C2925c<V> cVar) {
        if (cVar == this.f8273b) {
            return this;
        }
        return new C2926d<>(cVar);
    }

    /* renamed from: a */
    public V mo10056a(int i) {
        return this.f8273b.mo10054a((long) i);
    }

    /* renamed from: a */
    public C2926d<V> mo10055a(int i, V v) {
        return m14046a(this.f8273b.mo10053a((long) i, v));
    }
}
