package p073b.p085h.p087b.p088a.p090b.p091a;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;

/* renamed from: b.h.b.a.b.a.h */
/* compiled from: PrimitiveType */
public enum C1639h {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: i */
    public static final Set<C1639h> f5187i = null;

    /* renamed from: j */
    private final C2360f f5189j;

    /* renamed from: k */
    private final C2360f f5190k;

    /* renamed from: l */
    private C2355b f5191l;

    /* renamed from: m */
    private C2355b f5192m;

    static {
        f5187i = Collections.unmodifiableSet(EnumSet.of(CHAR, new C1639h[]{BYTE, SHORT, INT, FLOAT, LONG, DOUBLE}));
    }

    private C1639h(String str) {
        this.f5191l = null;
        this.f5192m = null;
        this.f5189j = C2360f.m11701a(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Array");
        this.f5190k = C2360f.m11701a(sb.toString());
    }

    /* renamed from: a */
    public C2360f mo7220a() {
        return this.f5189j;
    }

    /* renamed from: b */
    public C2360f mo7221b() {
        return this.f5190k;
    }
}
