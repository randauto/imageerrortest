package p000a.p001a.p002a.p003a.p004a.p006b;

/* renamed from: a.a.a.a.a.b.m */
/* compiled from: DeliveryMechanism */
public enum C0028m {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: e */
    private final int f49e;

    private C0028m(int i) {
        this.f49e = i;
    }

    /* renamed from: a */
    public int mo54a() {
        return this.f49e;
    }

    public String toString() {
        return Integer.toString(this.f49e);
    }

    /* renamed from: a */
    public static C0028m m94a(String str) {
        if ("io.crash.air".equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }
}
