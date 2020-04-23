package p073b.p085h.p087b.p088a.p140c;

/* renamed from: b.h.b.a.c.b */
/* compiled from: HashPMap */
public final class C2924b<K, V> {

    /* renamed from: a */
    private static final C2924b<Object, Object> f8263a = new C2924b<>(C2926d.m14045a(), 0);

    /* renamed from: b */
    private final C2926d<C2922a<C2927e<K, V>>> f8264b;

    /* renamed from: c */
    private final int f8265c;

    /* renamed from: a */
    public static <K, V> C2924b<K, V> m14037a() {
        return f8263a;
    }

    private C2924b(C2926d<C2922a<C2927e<K, V>>> dVar, int i) {
        this.f8264b = dVar;
        this.f8265c = i;
    }

    /* renamed from: a */
    public V mo10052a(Object obj) {
        C2922a<E> a = m14036a(obj.hashCode());
        while (a != null && a.mo10045b() > 0) {
            C2927e eVar = (C2927e) a.f8259a;
            if (eVar.f8274a.equals(obj)) {
                return eVar.f8275b;
            }
            a = a.f8260b;
        }
        return null;
    }

    /* renamed from: a */
    public C2924b<K, V> mo10051a(K k, V v) {
        C2922a a = m14036a(k.hashCode());
        int b = a.mo10045b();
        int a2 = m14035a(a, (Object) k);
        if (a2 != -1) {
            a = a.mo10046b(a2);
        }
        C2922a a3 = a.mo10043a(new C2927e(k, v));
        return new C2924b<>(this.f8264b.mo10055a(k.hashCode(), a3), (this.f8265c - b) + a3.mo10045b());
    }

    /* renamed from: a */
    private C2922a<C2927e<K, V>> m14036a(int i) {
        C2922a<C2927e<K, V>> aVar = (C2922a) this.f8264b.mo10056a(i);
        return aVar == null ? C2922a.m14027a() : aVar;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=b.h.b.a.c.a<b.h.b.a.c.e<K, V>>, code=b.h.b.a.c.a, for r2v0, types: [b.h.b.a.c.a<b.h.b.a.c.e<K, V>>, b.h.b.a.c.a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <K, V> int m14035a(p073b.p085h.p087b.p088a.p140c.C2922a r2, java.lang.Object r3) {
        /*
            r0 = 0
        L_0x0001:
            if (r2 == 0) goto L_0x001b
            int r1 = r2.mo10045b()
            if (r1 <= 0) goto L_0x001b
            E r1 = r2.f8259a
            b.h.b.a.c.e r1 = (p073b.p085h.p087b.p088a.p140c.C2927e) r1
            K r1 = r1.f8274a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0016
            return r0
        L_0x0016:
            b.h.b.a.c.a<E> r2 = r2.f8260b
            int r0 = r0 + 1
            goto L_0x0001
        L_0x001b:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p140c.C2924b.m14035a(b.h.b.a.c.a, java.lang.Object):int");
    }
}
