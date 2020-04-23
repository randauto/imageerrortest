package p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p073b.C3230x;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p084g.C1512a;
import p073b.p084g.C1517d;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.e.b.a.c */
/* compiled from: ClassMapperLite.kt */
public final class C2311c {

    /* renamed from: a */
    public static final C2311c f7095a = new C2311c();

    /* renamed from: b */
    private static final Map<String, String> f7096b;

    /* renamed from: b.h.b.a.b.e.b.a.c$a */
    /* compiled from: ClassMapperLite.kt */
    static final class C2312a extends C1490k implements C1461m<String, String, C3230x> {

        /* renamed from: a */
        final /* synthetic */ Map f7097a;

        C2312a(Map map) {
            this.f7097a = map;
            super(2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6920a(Object obj, Object obj2) {
            mo8881a((String) obj, (String) obj2);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo8881a(String str, String str2) {
            C1489j.m6972b(str, "kotlinSimpleName");
            C1489j.m6972b(str2, "javaInternalName");
            Map map = this.f7097a;
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin/");
            sb.append(str);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append('L');
            sb3.append(str2);
            sb3.append(';');
            map.put(sb2, sb3.toString());
        }
    }

    static {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        List b = C1415k.m6840b((T[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        C1512a a = C1517d.m7046a((C1512a) C1415k.m6835a((Collection<?>) b), 2);
        int a2 = a.mo6973a();
        int b2 = a.mo6974b();
        int c = a.mo6975c();
        if (c <= 0 ? a2 >= b2 : a2 <= b2) {
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append("kotlin/");
                sb.append((String) b.get(a2));
                int i = a2 + 1;
                linkedHashMap.put(sb.toString(), b.get(i));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("kotlin/");
                sb2.append((String) b.get(a2));
                sb2.append("Array");
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append('[');
                sb4.append((String) b.get(i));
                linkedHashMap.put(sb3, sb4.toString());
                if (a2 == b2) {
                    break;
                }
                a2 += c;
            }
        }
        linkedHashMap.put("kotlin/Unit", "V");
        C2312a aVar = new C2312a(linkedHashMap);
        aVar.mo8881a("Any", "java/lang/Object");
        aVar.mo8881a("Nothing", "java/lang/Void");
        aVar.mo8881a("Annotation", "java/lang/annotation/Annotation");
        for (String str : C1415k.m6840b((T[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("java/lang/");
            sb5.append(str);
            aVar.mo8881a(str, sb5.toString());
        }
        for (String str2 : C1415k.m6840b((T[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("collections/");
            sb6.append(str2);
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append("java/util/");
            sb8.append(str2);
            aVar.mo8881a(sb7, sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append("collections/Mutable");
            sb9.append(str2);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append("java/util/");
            sb11.append(str2);
            aVar.mo8881a(sb10, sb11.toString());
        }
        aVar.mo8881a("collections/Iterable", "java/lang/Iterable");
        aVar.mo8881a("collections/MutableIterable", "java/lang/Iterable");
        aVar.mo8881a("collections/Map.Entry", "java/util/Map$Entry");
        aVar.mo8881a("collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i2 = 0; i2 <= 22; i2++) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Function");
            sb12.append(i2);
            String sb13 = sb12.toString();
            StringBuilder sb14 = new StringBuilder();
            sb14.append("kotlin/jvm/functions/Function");
            sb14.append(i2);
            aVar.mo8881a(sb13, sb14.toString());
            StringBuilder sb15 = new StringBuilder();
            sb15.append("reflect/KFunction");
            sb15.append(i2);
            aVar.mo8881a(sb15.toString(), "kotlin/reflect/KFunction");
        }
        for (String str3 : C1415k.m6840b((T[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            StringBuilder sb16 = new StringBuilder();
            sb16.append(str3);
            sb16.append(".Companion");
            String sb17 = sb16.toString();
            StringBuilder sb18 = new StringBuilder();
            sb18.append("kotlin/jvm/internal/");
            sb18.append(str3);
            sb18.append("CompanionObject");
            aVar.mo8881a(sb17, sb18.toString());
        }
        f7096b = linkedHashMap;
    }

    private C2311c() {
    }

    /* renamed from: a */
    public static final String m11370a(String str) {
        C1489j.m6972b(str, "classId");
        String str2 = (String) f7096b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        sb.append(C3199m.m14754a(str, '.', '$', false, 4, (Object) null));
        sb.append(';');
        return sb.toString();
    }
}
