package p073b.p085h.p087b.p088a.p090b.p136m.p137a;

import java.util.Iterator;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.m.a.a */
/* compiled from: capitalizeDecapitalize.kt */
public final class C2846a {

    /* renamed from: b.h.b.a.b.m.a.a$a */
    /* compiled from: capitalizeDecapitalize.kt */
    static final class C2847a extends C1490k implements C1450b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f8126a;

        /* renamed from: b */
        final /* synthetic */ boolean f8127b;

        C2847a(String str, boolean z) {
            this.f8126a = str;
            this.f8127b = z;
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return Boolean.valueOf(mo9959a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        public final boolean mo9959a(int i) {
            char charAt = this.f8126a.charAt(i);
            if (this.f8127b) {
                return 'A' <= charAt && 'Z' >= charAt;
            }
            return Character.isUpperCase(charAt);
        }
    }

    /* renamed from: b.h.b.a.b.m.a.a$b */
    /* compiled from: capitalizeDecapitalize.kt */
    static final class C2848b extends C1490k implements C1450b<String, String> {

        /* renamed from: a */
        final /* synthetic */ boolean f8128a;

        C2848b(boolean z) {
            this.f8128a = z;
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(String str) {
            C1489j.m6972b(str, "string");
            if (this.f8128a) {
                return C2846a.m13892c(str);
            }
            String lowerCase = str.toLowerCase();
            C1489j.m6969a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        }
    }

    /* renamed from: a */
    public static final String m13890a(String str, boolean z) {
        Object obj;
        C1489j.m6972b(str, "$receiver");
        C2847a aVar = new C2847a(str, z);
        CharSequence charSequence = str;
        if ((charSequence.length() == 0) || !aVar.mo9959a(0)) {
            return str;
        }
        if (str.length() == 1 || !aVar.mo9959a(1)) {
            return z ? m13891b(str) : C3199m.m14765e(str);
        }
        C2848b bVar = new C2848b(z);
        Iterator it = C3199m.m14773a(charSequence).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!aVar.mo9959a(((Number) obj).intValue())) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return bVar.mo6756a(str);
        }
        int intValue = num.intValue() - 1;
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, intValue);
        C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(bVar.mo6756a(substring));
        String substring2 = str.substring(intValue);
        C1489j.m6969a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m13889a(String str) {
        C1489j.m6972b(str, "$receiver");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && 'z' >= charAt) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            C1489j.m6969a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(upperCase));
            sb.append(substring);
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: b */
    public static final String m13891b(String str) {
        C1489j.m6972b(str, "$receiver");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && 'Z' >= charAt) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            C1489j.m6969a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(lowerCase));
            sb.append(substring);
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: c */
    public static final String m13892c(String str) {
        C1489j.m6972b(str, "$receiver");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && 'Z' >= charAt) {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C1489j.m6969a((Object) sb2, "builder.toString()");
        return sb2;
    }
}
