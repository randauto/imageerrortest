package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;

/* renamed from: b.h.b.a.b.d.b.u */
/* compiled from: methodSignatureBuilding.kt */
public final class C2150u {

    /* renamed from: a */
    public static final C2150u f6453a = new C2150u();

    /* renamed from: b.h.b.a.b.d.b.u$a */
    /* compiled from: methodSignatureBuilding.kt */
    static final class C2151a extends C1490k implements C1450b<String, String> {

        /* renamed from: a */
        public static final C2151a f6454a = new C2151a();

        C2151a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(String str) {
            C1489j.m6972b(str, "it");
            return C2150u.f6453a.m9585d(str);
        }
    }

    private C2150u() {
    }

    /* renamed from: a */
    public final String mo8076a(String str) {
        C1489j.m6972b(str, "name");
        StringBuilder sb = new StringBuilder();
        sb.append("java/lang/");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo8081b(String str) {
        C1489j.m6972b(str, "name");
        StringBuilder sb = new StringBuilder();
        sb.append("java/util/");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo8083c(String str) {
        C1489j.m6972b(str, "name");
        StringBuilder sb = new StringBuilder();
        sb.append("java/util/function/");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final LinkedHashSet<String> mo8079a(String str, String... strArr) {
        C1489j.m6972b(str, "name");
        C1489j.m6972b(strArr, "signatures");
        return mo8084c(mo8076a(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public final LinkedHashSet<String> mo8082b(String str, String... strArr) {
        C1489j.m6972b(str, "name");
        C1489j.m6972b(strArr, "signatures");
        return mo8084c(mo8081b(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: c */
    public final LinkedHashSet<String> mo8084c(String str, String... strArr) {
        C1489j.m6972b(str, "internalName");
        C1489j.m6972b(strArr, "signatures");
        Collection linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            linkedHashSet.add(sb.toString());
        }
        return (LinkedHashSet) linkedHashSet;
    }

    /* renamed from: a */
    public final String mo8075a(C1796e eVar, String str) {
        C1489j.m6972b(eVar, "classDescriptor");
        C1489j.m6972b(str, "jvmDescriptor");
        return mo8077a(C2147r.m9576a(eVar), str);
    }

    /* renamed from: a */
    public final String mo8077a(String str, String str2) {
        C1489j.m6972b(str, "internalName");
        C1489j.m6972b(str2, "jvmDescriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo8078a(String str, List<String> list, String str2) {
        C1489j.m6972b(str, "name");
        C1489j.m6972b(list, "parameters");
        C1489j.m6972b(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(C1415k.m6859a(list, "", null, null, 0, null, C2151a.f6454a, 30, null));
        sb.append(')');
        sb.append(m9585d(str2));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String m9585d(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        sb.append(str);
        sb.append(';');
        return sb.toString();
    }

    /* renamed from: a */
    public final String[] mo8080a(String... strArr) {
        C1489j.m6972b(strArr, "signatures");
        Collection arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("<init>(");
            sb.append(str);
            sb.append(")V");
            arrayList.add(sb.toString());
        }
        Object[] array = ((List) arrayList).toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
