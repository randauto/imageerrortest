package p073b.p085h.p087b.p088a.p090b.p119i.p124d;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p073b.p085h.p087b.p088a.p090b.p091a.C1639h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.i.d.c */
/* compiled from: JvmPrimitiveType */
public enum C2536c {
    BOOLEAN(C1639h.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(C1639h.CHAR, "char", "C", "java.lang.Character"),
    BYTE(C1639h.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(C1639h.SHORT, "short", "S", "java.lang.Short"),
    INT(C1639h.INT, "int", "I", "java.lang.Integer"),
    FLOAT(C1639h.FLOAT, "float", "F", "java.lang.Float"),
    LONG(C1639h.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(C1639h.DOUBLE, "double", "D", "java.lang.Double");
    

    /* renamed from: i */
    private static final Set<C2355b> f7601i = null;

    /* renamed from: j */
    private static final Map<String, C2536c> f7602j = null;

    /* renamed from: k */
    private static final Map<C1639h, C2536c> f7603k = null;

    /* renamed from: l */
    private final C1639h f7605l;

    /* renamed from: m */
    private final String f7606m;

    /* renamed from: n */
    private final String f7607n;

    /* renamed from: o */
    private final C2355b f7608o;

    static {
        int i;
        C2536c[] values;
        f7601i = new HashSet();
        f7602j = new HashMap();
        f7603k = new EnumMap(C1639h.class);
        for (C2536c cVar : values()) {
            f7601i.add(cVar.mo9562d());
            f7602j.put(cVar.mo9560b(), cVar);
            f7603k.put(cVar.mo9559a(), cVar);
        }
    }

    /* renamed from: a */
    public static C2536c m12660a(String str) {
        C2536c cVar = (C2536c) f7602j.get(str);
        if (cVar != null) {
            return cVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Non-primitive type name passed: ");
        sb.append(str);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public static C2536c m12659a(C1639h hVar) {
        return (C2536c) f7603k.get(hVar);
    }

    private C2536c(C1639h hVar, String str, String str2, String str3) {
        this.f7605l = hVar;
        this.f7606m = str;
        this.f7607n = str2;
        this.f7608o = new C2355b(str3);
    }

    /* renamed from: a */
    public C1639h mo9559a() {
        return this.f7605l;
    }

    /* renamed from: b */
    public String mo9560b() {
        return this.f7606m;
    }

    /* renamed from: c */
    public String mo9561c() {
        return this.f7607n;
    }

    /* renamed from: d */
    public C2355b mo9562d() {
        return this.f7608o;
    }
}
