package p000a.p001a.p002a.p003a.p004a.p007c.p008a;

/* renamed from: a.a.a.a.a.c.a.e */
/* compiled from: RetryState */
public class C0064e {

    /* renamed from: a */
    private final int f139a;

    /* renamed from: b */
    private final C0060a f140b;

    /* renamed from: c */
    private final C0063d f141c;

    public C0064e(C0060a aVar, C0063d dVar) {
        this(0, aVar, dVar);
    }

    public C0064e(int i, C0060a aVar, C0063d dVar) {
        this.f139a = i;
        this.f140b = aVar;
        this.f141c = dVar;
    }

    /* renamed from: a */
    public long mo113a() {
        return this.f140b.getDelayMillis(this.f139a);
    }

    /* renamed from: b */
    public C0064e mo114b() {
        return new C0064e(this.f139a + 1, this.f140b, this.f141c);
    }

    /* renamed from: c */
    public C0064e mo115c() {
        return new C0064e(this.f140b, this.f141c);
    }
}
