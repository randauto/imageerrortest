package p073b.p085h.p087b.p088a.p090b.p117g;

/* renamed from: b.h.b.a.b.g.z */
/* compiled from: WireFormat */
public final class C2430z {

    /* renamed from: a */
    static final int f7371a = m12124a(1, 3);

    /* renamed from: b */
    static final int f7372b = m12124a(1, 4);

    /* renamed from: c */
    static final int f7373c = m12124a(2, 0);

    /* renamed from: d */
    static final int f7374d = m12124a(3, 2);

    /* renamed from: b.h.b.a.b.g.z$a */
    /* compiled from: WireFormat */
    public enum C2432a {
        DOUBLE(C2437b.DOUBLE, 1),
        FLOAT(C2437b.FLOAT, 5),
        INT64(C2437b.LONG, 0),
        UINT64(C2437b.LONG, 0),
        INT32(C2437b.INT, 0),
        FIXED64(C2437b.LONG, 1),
        FIXED32(C2437b.INT, 5),
        BOOL(C2437b.BOOLEAN, 0),
        STRING(C2437b.STRING, 2) {
            /* renamed from: c */
            public boolean mo9338c() {
                return false;
            }
        },
        GROUP(C2437b.MESSAGE, 3) {
            /* renamed from: c */
            public boolean mo9338c() {
                return false;
            }
        },
        MESSAGE(C2437b.MESSAGE, 2) {
            /* renamed from: c */
            public boolean mo9338c() {
                return false;
            }
        },
        BYTES(C2437b.BYTE_STRING, 2) {
            /* renamed from: c */
            public boolean mo9338c() {
                return false;
            }
        },
        UINT32(C2437b.INT, 0),
        ENUM(C2437b.ENUM, 0),
        SFIXED32(C2437b.INT, 5),
        SFIXED64(C2437b.LONG, 1),
        SINT32(C2437b.INT, 0),
        SINT64(C2437b.LONG, 0);
        

        /* renamed from: s */
        private final C2437b f7394s;

        /* renamed from: t */
        private final int f7395t;

        /* renamed from: c */
        public boolean mo9338c() {
            return true;
        }

        private C2432a(C2437b bVar, int i) {
            this.f7394s = bVar;
            this.f7395t = i;
        }

        /* renamed from: a */
        public C2437b mo9336a() {
            return this.f7394s;
        }

        /* renamed from: b */
        public int mo9337b() {
            return this.f7395t;
        }
    }

    /* renamed from: b.h.b.a.b.g.z$b */
    /* compiled from: WireFormat */
    public enum C2437b {
        INT(Integer.valueOf(0)),
        LONG(Long.valueOf(0)),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.valueOf(false)),
        STRING(""),
        BYTE_STRING(C2371d.f7253a),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: j */
        private final Object f7406j;

        private C2437b(Object obj) {
            this.f7406j = obj;
        }
    }

    /* renamed from: a */
    static int m12123a(int i) {
        return i & 7;
    }

    /* renamed from: a */
    static int m12124a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: b */
    public static int m12125b(int i) {
        return i >>> 3;
    }
}
