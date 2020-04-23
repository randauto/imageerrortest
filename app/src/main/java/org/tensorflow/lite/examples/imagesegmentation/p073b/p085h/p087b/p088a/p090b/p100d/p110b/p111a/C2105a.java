package p073b.p085h.p087b.p088a.p090b.p100d.p110b.p111a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p073b.p074a.C1389ad;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p084g.C1517d;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2313d;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2319g;

/* renamed from: b.h.b.a.b.d.b.a.a */
/* compiled from: KotlinClassHeader.kt */
public final class C2105a {

    /* renamed from: a */
    private final C2106a f6370a;

    /* renamed from: b */
    private final C2319g f6371b;

    /* renamed from: c */
    private final C2313d f6372c;

    /* renamed from: d */
    private final String[] f6373d;

    /* renamed from: e */
    private final String[] f6374e;

    /* renamed from: f */
    private final String[] f6375f;

    /* renamed from: g */
    private final String f6376g;

    /* renamed from: h */
    private final int f6377h;

    /* renamed from: i */
    private final String f6378i;

    /* renamed from: b.h.b.a.b.d.b.a.a$a */
    /* compiled from: KotlinClassHeader.kt */
    public enum C2106a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: g */
        public static final C2107a f6385g = null;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static final Map<Integer, C2106a> f6387j = null;

        /* renamed from: i */
        private final int f6388i;

        /* renamed from: b.h.b.a.b.d.b.a.a$a$a */
        /* compiled from: KotlinClassHeader.kt */
        public static final class C2107a {
            private C2107a() {
            }

            public /* synthetic */ C2107a(C1486g gVar) {
                this();
            }

            /* renamed from: a */
            public final C2106a mo8013a(int i) {
                C2106a aVar = (C2106a) C2106a.f6387j.get(Integer.valueOf(i));
                return aVar != null ? aVar : C2106a.UNKNOWN;
            }
        }

        /* renamed from: a */
        public static final C2106a m9437a(int i) {
            return f6385g.mo8013a(i);
        }

        protected C2106a(int i) {
            this.f6388i = i;
        }

        static {
            int i;
            f6385g = new C2107a(null);
            C2106a[] values = values();
            Map<Integer, C2106a> linkedHashMap = new LinkedHashMap<>(C1517d.m7048c(C1389ad.m6746a(values.length), 16));
            for (C2106a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f6388i), aVar);
            }
            f6387j = linkedHashMap;
        }
    }

    public C2105a(C2106a aVar, C2319g gVar, C2313d dVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        C1489j.m6972b(aVar, "kind");
        C1489j.m6972b(gVar, "metadataVersion");
        C1489j.m6972b(dVar, "bytecodeVersion");
        this.f6370a = aVar;
        this.f6371b = gVar;
        this.f6372c = dVar;
        this.f6373d = strArr;
        this.f6374e = strArr2;
        this.f6375f = strArr3;
        this.f6376g = str;
        this.f6377h = i;
        this.f6378i = str2;
    }

    /* renamed from: d */
    public final C2106a mo8007d() {
        return this.f6370a;
    }

    /* renamed from: e */
    public final C2319g mo8008e() {
        return this.f6371b;
    }

    /* renamed from: f */
    public final String[] mo8009f() {
        return this.f6373d;
    }

    /* renamed from: g */
    public final String[] mo8010g() {
        return this.f6374e;
    }

    /* renamed from: h */
    public final String[] mo8011h() {
        return this.f6375f;
    }

    /* renamed from: a */
    public final String mo8004a() {
        String str = this.f6376g;
        if (this.f6370a == C2106a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    /* renamed from: b */
    public final List<String> mo8005b() {
        String[] strArr = this.f6373d;
        List<String> list = null;
        if (!(this.f6370a == C2106a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        if (strArr != null) {
            list = C1406e.m6777a((T[]) strArr);
        }
        return list != null ? list : C1415k.m6837a();
    }

    /* renamed from: c */
    public final boolean mo8006c() {
        return (this.f6377h & 2) != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6370a);
        sb.append(" version=");
        sb.append(this.f6371b);
        return sb.toString();
    }
}
