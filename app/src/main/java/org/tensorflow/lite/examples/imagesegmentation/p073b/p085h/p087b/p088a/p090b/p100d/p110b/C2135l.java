package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import p073b.C3219n;
import p073b.C3232z;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2130j.C2131a;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2130j.C2132b;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2130j.C2133c;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2535b;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2536c;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.d.b.l */
/* compiled from: methodSignatureMapping.kt */
final class C2135l implements C2134k<C2130j> {

    /* renamed from: a */
    public static final C2135l f6446a = new C2135l();

    private C2135l() {
    }

    /* renamed from: a */
    public C2130j mo8053a(C2130j jVar) {
        C1489j.m6972b(jVar, "possiblyPrimitiveType");
        if (!(jVar instanceof C2133c)) {
            return jVar;
        }
        C2133c cVar = (C2133c) jVar;
        if (cVar.mo8051a() == null) {
            return jVar;
        }
        C2535b a = C2535b.m12654a(cVar.mo8051a().mo9562d());
        C1489j.m6969a((Object) a, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
        String c = a.mo9555c();
        C1489j.m6969a((Object) c, "JvmClassName.byFqNameWit…apperFqName).internalName");
        return mo8055b(c);
    }

    /* renamed from: c */
    public C2130j mo8054a(String str) {
        C2536c cVar;
        C2130j jVar;
        C1489j.m6972b(str, "representation");
        boolean z = false;
        boolean z2 = str.length() > 0;
        if (!C3232z.f8648a || z2) {
            char charAt = str.charAt(0);
            C2536c[] values = C2536c.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = values[i];
                if (cVar.mo9561c().charAt(0) == charAt) {
                    break;
                }
                i++;
            }
            if (cVar != null) {
                return new C2133c(cVar);
            }
            if (charAt == 'V') {
                jVar = new C2133c(null);
            } else if (charAt != '[') {
                if (charAt == 'L' && C3199m.m14806b((CharSequence) str, ';', false, 2, (Object) null)) {
                    z = true;
                }
                if (!C3232z.f8648a || z) {
                    String substring = str.substring(1, str.length() - 1);
                    C1489j.m6969a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    jVar = new C2132b(substring);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Type that is not primitive nor array should be Object, but '");
                    sb.append(str);
                    sb.append("' was found");
                    throw new AssertionError(sb.toString());
                }
            } else {
                String substring2 = str.substring(1);
                C1489j.m6969a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                jVar = new C2131a(mo8054a(substring2));
            }
            return jVar;
        }
        throw new AssertionError("empty string as JvmType");
    }

    /* renamed from: d */
    public C2132b mo8055b(String str) {
        C1489j.m6972b(str, "internalName");
        return new C2132b(str);
    }

    /* renamed from: b */
    public String mo8056b(C2130j jVar) {
        C1489j.m6972b(jVar, "type");
        if (jVar instanceof C2131a) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(mo8056b(((C2131a) jVar).mo8049a()));
            return sb.toString();
        } else if (jVar instanceof C2133c) {
            C2536c a = ((C2133c) jVar).mo8051a();
            if (a != null) {
                String c = a.mo9561c();
                if (c != null) {
                    return c;
                }
            }
            return "V";
        } else if (jVar instanceof C2132b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("L");
            sb2.append(((C2132b) jVar).mo8050a());
            sb2.append(";");
            return sb2.toString();
        } else {
            throw new C3219n();
        }
    }

    /* renamed from: b */
    public C2130j mo8052a() {
        return mo8055b("java/lang/Class");
    }
}
