package p000a.p001a.p002a.p003a.p004a.p007c.p008a;

/* renamed from: a.a.a.a.a.c.a.c */
/* compiled from: ExponentialBackoff */
public class C0062c implements C0060a {

    /* renamed from: a */
    private final long f137a;

    /* renamed from: b */
    private final int f138b;

    public C0062c(long j, int i) {
        this.f137a = j;
        this.f138b = i;
    }

    public long getDelayMillis(int i) {
        return (long) (((double) this.f137a) * Math.pow((double) this.f138b, (double) i));
    }
}
