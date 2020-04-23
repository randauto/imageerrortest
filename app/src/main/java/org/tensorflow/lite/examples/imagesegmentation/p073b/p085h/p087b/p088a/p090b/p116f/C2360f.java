package p073b.p085h.p087b.p088a.p090b.p116f;

/* renamed from: b.h.b.a.b.f.f */
/* compiled from: Name */
public final class C2360f implements Comparable<C2360f> {

    /* renamed from: a */
    private final String f7232a;

    /* renamed from: b */
    private final boolean f7233b;

    private C2360f(String str, boolean z) {
        this.f7232a = str;
        this.f7233b = z;
    }

    /* renamed from: a */
    public String mo9039a() {
        return this.f7232a;
    }

    /* renamed from: b */
    public String mo9040b() {
        if (!this.f7233b) {
            return mo9039a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("not identifier: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public boolean mo9041c() {
        return this.f7233b;
    }

    /* renamed from: a */
    public int compareTo(C2360f fVar) {
        return this.f7232a.compareTo(fVar.f7232a);
    }

    /* renamed from: a */
    public static C2360f m11701a(String str) {
        return new C2360f(str, false);
    }

    /* renamed from: b */
    public static boolean m11702b(String str) {
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static C2360f m11703c(String str) {
        if (str.startsWith("<")) {
            return new C2360f(str, true);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("special name must start with '<': ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public static C2360f m11704d(String str) {
        if (str.startsWith("<")) {
            return m11703c(str);
        }
        return m11701a(str);
    }

    public String toString() {
        return this.f7232a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2360f)) {
            return false;
        }
        C2360f fVar = (C2360f) obj;
        return this.f7233b == fVar.f7233b && this.f7232a.equals(fVar.f7232a);
    }

    public int hashCode() {
        return (this.f7232a.hashCode() * 31) + (this.f7233b ? 1 : 0);
    }
}
