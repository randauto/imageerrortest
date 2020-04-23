package p073b.p085h.p087b.p088a.p090b.p098c.p099a;

import java.io.Serializable;

/* renamed from: b.h.b.a.b.c.a.e */
/* compiled from: LookupLocation.kt */
public final class C1831e implements Serializable {

    /* renamed from: a */
    public static final C1832a f5631a = new C1832a(null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C1831e f5632d = new C1831e(-1, -1);

    /* renamed from: b */
    private final int f5633b;

    /* renamed from: c */
    private final int f5634c;

    /* renamed from: b.h.b.a.b.c.a.e$a */
    /* compiled from: LookupLocation.kt */
    public static final class C1832a {
        private C1832a() {
        }

        public /* synthetic */ C1832a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1831e mo7582a() {
            return C1831e.f5632d;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1831e) {
                C1831e eVar = (C1831e) obj;
                if (this.f5633b == eVar.f5633b) {
                    if (this.f5634c == eVar.f5634c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f5633b * 31) + this.f5634c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Position(line=");
        sb.append(this.f5633b);
        sb.append(", column=");
        sb.append(this.f5634c);
        sb.append(")");
        return sb.toString();
    }

    public C1831e(int i, int i2) {
        this.f5633b = i;
        this.f5634c = i2;
    }
}
