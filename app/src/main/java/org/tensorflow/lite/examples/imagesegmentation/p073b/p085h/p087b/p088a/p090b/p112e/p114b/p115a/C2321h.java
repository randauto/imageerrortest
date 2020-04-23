package p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p073b.C3227u;
import p073b.p074a.C1389ad;
import p073b.p074a.C1395aj;
import p073b.p074a.C1415k;
import p073b.p074a.C1433z;
import p073b.p079e.p081b.C1489j;
import p073b.p084g.C1517d;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2344g;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2344g.C2347b;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.C2330b.C2344g.C2347b.C2350b;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.e.b.a.h */
/* compiled from: JvmNameResolver.kt */
public final class C2321h implements C2285c {

    /* renamed from: a */
    public static final C2322a f7110a = new C2322a(null);

    /* renamed from: f */
    private static final List<String> f7111f = C1415k.m6840b((T[]) new String[]{"kotlin/Any", "kotlin/Nothing", "kotlin/Unit", "kotlin/Throwable", "kotlin/Number", "kotlin/Byte", "kotlin/Double", "kotlin/Float", "kotlin/Int", "kotlin/Long", "kotlin/Short", "kotlin/Boolean", "kotlin/Char", "kotlin/CharSequence", "kotlin/String", "kotlin/Comparable", "kotlin/Enum", "kotlin/Array", "kotlin/ByteArray", "kotlin/DoubleArray", "kotlin/FloatArray", "kotlin/IntArray", "kotlin/LongArray", "kotlin/ShortArray", "kotlin/BooleanArray", "kotlin/CharArray", "kotlin/Cloneable", "kotlin/Annotation", "kotlin/collections/Iterable", "kotlin/collections/MutableIterable", "kotlin/collections/Collection", "kotlin/collections/MutableCollection", "kotlin/collections/List", "kotlin/collections/MutableList", "kotlin/collections/Set", "kotlin/collections/MutableSet", "kotlin/collections/Map", "kotlin/collections/MutableMap", "kotlin/collections/Map.Entry", "kotlin/collections/MutableMap.MutableEntry", "kotlin/collections/Iterator", "kotlin/collections/MutableIterator", "kotlin/collections/ListIterator", "kotlin/collections/MutableListIterator"});

    /* renamed from: g */
    private static final Map<String, Integer> f7112g;

    /* renamed from: b */
    private final Set<Integer> f7113b;

    /* renamed from: c */
    private final List<C2347b> f7114c;

    /* renamed from: d */
    private final C2344g f7115d;

    /* renamed from: e */
    private final String[] f7116e;

    /* renamed from: b.h.b.a.b.e.b.a.h$a */
    /* compiled from: JvmNameResolver.kt */
    public static final class C2322a {
        private C2322a() {
        }

        public /* synthetic */ C2322a(C1486g gVar) {
            this();
        }
    }

    public C2321h(C2344g gVar, String[] strArr) {
        C1489j.m6972b(gVar, "types");
        C1489j.m6972b(strArr, "strings");
        this.f7115d = gVar;
        this.f7116e = strArr;
        List e = this.f7115d.mo8963e();
        this.f7113b = e.isEmpty() ? C1395aj.m6759a() : C1415k.m6895m(e);
        ArrayList arrayList = new ArrayList();
        List<C2347b> d = this.f7115d.mo8962d();
        arrayList.ensureCapacity(d.size());
        for (C2347b bVar : d) {
            C1489j.m6969a((Object) bVar, "record");
            int e2 = bVar.mo8975e();
            for (int i = 0; i < e2; i++) {
                arrayList.add(bVar);
            }
        }
        arrayList.trimToSize();
        this.f7114c = arrayList;
    }

    /* renamed from: a */
    public String mo8811a(int i) {
        String str;
        C2347b bVar = (C2347b) this.f7114c.get(i);
        if (bVar.mo8978j()) {
            str = bVar.mo8979k();
        } else {
            if (bVar.mo8976f()) {
                int size = f7111f.size();
                int g = bVar.mo8977g();
                if (g >= 0 && size > g) {
                    str = (String) f7111f.get(bVar.mo8977g());
                }
            }
            str = this.f7116e[i];
        }
        if (bVar.mo8984s() >= 2) {
            List r = bVar.mo8983r();
            Integer num = (Integer) r.get(0);
            Integer num2 = (Integer) r.get(1);
            C1489j.m6969a((Object) num, "begin");
            if (C1489j.m6965a(0, num.intValue()) <= 0) {
                int intValue = num.intValue();
                C1489j.m6969a((Object) num2, "end");
                if (C1489j.m6965a(intValue, num2.intValue()) <= 0 && C1489j.m6965a(num2.intValue(), str.length()) <= 0) {
                    C1489j.m6969a((Object) str, "string");
                    int intValue2 = num.intValue();
                    int intValue3 = num2.intValue();
                    if (str != null) {
                        str = str.substring(intValue2, intValue3);
                        C1489j.m6969a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new C3227u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
        String str2 = str;
        if (bVar.mo8986u() >= 2) {
            List t = bVar.mo8985t();
            Integer num3 = (Integer) t.get(0);
            Integer num4 = (Integer) t.get(1);
            C1489j.m6969a((Object) str2, "string");
            str2 = C3199m.m14754a(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, (Object) null);
        }
        String str3 = str2;
        C2350b q = bVar.mo8982q();
        if (q == null) {
            q = C2350b.NONE;
        }
        switch (C2323i.f7117a[q.ordinal()]) {
            case 2:
                C1489j.m6969a((Object) str3, "string");
                str3 = C3199m.m14754a(str3, '$', '.', false, 4, (Object) null);
                break;
            case 3:
                if (str3.length() >= 2) {
                    C1489j.m6969a((Object) str3, "string");
                    int length = str3.length() - 1;
                    if (str3 != null) {
                        str3 = str3.substring(1, length);
                        C1489j.m6969a((Object) str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new C3227u("null cannot be cast to non-null type java.lang.String");
                    }
                }
                String str4 = str3;
                C1489j.m6969a((Object) str4, "string");
                str3 = C3199m.m14754a(str4, '$', '.', false, 4, (Object) null);
                break;
        }
        C1489j.m6969a((Object) str3, "string");
        return str3;
    }

    /* renamed from: b */
    public String mo8812b(int i) {
        return mo8811a(i);
    }

    /* renamed from: c */
    public boolean mo8813c(int i) {
        return this.f7113b.contains(Integer.valueOf(i));
    }

    static {
        Iterable<C1433z> n = C1415k.m6896n(f7111f);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(C1517d.m7048c(C1389ad.m6746a(C1415k.m6842a(n, 10)), 16));
        for (C1433z zVar : n) {
            linkedHashMap.put((String) zVar.mo6911b(), Integer.valueOf(zVar.mo6910a()));
        }
        f7112g = linkedHashMap;
    }
}
