package p073b.p085h.p087b.p088a.p090b.p139n;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p073b.C1511g;
import p073b.C1521h;
import p073b.C3227u;
import p073b.p074a.C1389ad;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;

/* renamed from: b.h.b.a.b.n.e */
/* compiled from: Jsr305State.kt */
public final class C2901e {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f8222a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C2901e.class), "description", "getDescription()[Ljava/lang/String;"))};

    /* renamed from: b */
    public static final C2901e f8223b;

    /* renamed from: c */
    public static final C2901e f8224c;

    /* renamed from: d */
    public static final C2901e f8225d;

    /* renamed from: e */
    public static final C2902a f8226e = new C2902a(null);

    /* renamed from: f */
    private final C1511g f8227f;

    /* renamed from: g */
    private final C2906h f8228g;

    /* renamed from: h */
    private final C2906h f8229h;

    /* renamed from: i */
    private final Map<String, C2906h> f8230i;

    /* renamed from: j */
    private final boolean f8231j;

    /* renamed from: b.h.b.a.b.n.e$a */
    /* compiled from: Jsr305State.kt */
    public static final class C2902a {
        private C2902a() {
        }

        public /* synthetic */ C2902a(C1486g gVar) {
            this();
        }
    }

    /* renamed from: b.h.b.a.b.n.e$b */
    /* compiled from: Jsr305State.kt */
    static final class C2903b extends C1490k implements C1449a<String[]> {

        /* renamed from: a */
        final /* synthetic */ C2901e f8232a;

        C2903b(C2901e eVar) {
            this.f8232a = eVar;
            super(0);
        }

        /* renamed from: b */
        public final String[] mo6823a() {
            List arrayList = new ArrayList();
            arrayList.add(this.f8232a.mo9986b().mo10001c());
            C2906h c = this.f8232a.mo9987c();
            if (c != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("under-migration:");
                sb.append(c.mo10001c());
                arrayList.add(sb.toString());
            }
            for (Entry entry : this.f8232a.mo9988d().entrySet()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                sb2.append((String) entry.getKey());
                sb2.append(':');
                sb2.append(((C2906h) entry.getValue()).mo10001c());
                arrayList.add(sb2.toString());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2901e) {
                C2901e eVar = (C2901e) obj;
                if (C1489j.m6971a((Object) this.f8228g, (Object) eVar.f8228g) && C1489j.m6971a((Object) this.f8229h, (Object) eVar.f8229h) && C1489j.m6971a((Object) this.f8230i, (Object) eVar.f8230i)) {
                    if (this.f8231j == eVar.f8231j) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C2906h hVar = this.f8228g;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C2906h hVar2 = this.f8229h;
        int hashCode2 = (hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        Map<String, C2906h> map = this.f8230i;
        if (map != null) {
            i = map.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f8231j;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jsr305State(global=");
        sb.append(this.f8228g);
        sb.append(", migration=");
        sb.append(this.f8229h);
        sb.append(", user=");
        sb.append(this.f8230i);
        sb.append(", enableCompatqualCheckerFrameworkAnnotations=");
        sb.append(this.f8231j);
        sb.append(")");
        return sb.toString();
    }

    public C2901e(C2906h hVar, C2906h hVar2, Map<String, ? extends C2906h> map, boolean z) {
        C1489j.m6972b(hVar, "global");
        C1489j.m6972b(map, "user");
        this.f8228g = hVar;
        this.f8229h = hVar2;
        this.f8230i = map;
        this.f8231j = z;
        this.f8227f = C1521h.m14706a(new C2903b(this));
    }

    /* renamed from: b */
    public final C2906h mo9986b() {
        return this.f8228g;
    }

    /* renamed from: c */
    public final C2906h mo9987c() {
        return this.f8229h;
    }

    /* renamed from: d */
    public final Map<String, C2906h> mo9988d() {
        return this.f8230i;
    }

    public /* synthetic */ C2901e(C2906h hVar, C2906h hVar2, Map map, boolean z, int i, C1486g gVar) {
        if ((i & 8) != 0) {
            z = true;
        }
        this(hVar, hVar2, map, z);
    }

    /* renamed from: e */
    public final boolean mo9989e() {
        return this.f8231j;
    }

    /* renamed from: a */
    public final boolean mo9985a() {
        return this == f8224c;
    }

    static {
        C2901e eVar = new C2901e(C2906h.WARN, null, C1389ad.m6747a(), false, 8, null);
        f8223b = eVar;
        C2901e eVar2 = new C2901e(C2906h.IGNORE, C2906h.IGNORE, C1389ad.m6747a(), false, 8, null);
        f8224c = eVar2;
        C2901e eVar3 = new C2901e(C2906h.STRICT, C2906h.STRICT, C1389ad.m6747a(), false, 8, null);
        f8225d = eVar3;
    }
}
