package p073b.p085h.p087b.p088a.p090b.p100d.p101a;

import p073b.p085h.p087b.p088a.p090b.p091a.C1622d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1654e;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1658g;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p136m.p137a.C2846a;

/* renamed from: b.h.b.a.b.d.a.n */
/* compiled from: JvmAbi */
public final class C2087n {

    /* renamed from: a */
    public static final C2355b f6321a = new C2355b("kotlin.jvm.JvmField");

    /* renamed from: b */
    public static final C2354a f6322b = C2354a.m11661a(new C2355b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));

    /* renamed from: a */
    public static boolean m9345a(String str) {
        return str.startsWith("get") || str.startsWith("is");
    }

    /* renamed from: b */
    public static boolean m9346b(String str) {
        return str.startsWith("set");
    }

    /* renamed from: c */
    public static String m9347c(String str) {
        if (m9349e(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("get");
        sb.append(C2846a.m13889a(str));
        return sb.toString();
    }

    /* renamed from: d */
    public static String m9348d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        sb.append(m9349e(str) ? str.substring("is".length()) : C2846a.m13889a(str));
        return sb.toString();
    }

    /* renamed from: e */
    public static boolean m9349e(String str) {
        boolean z = false;
        if (!str.startsWith("is") || str.length() == "is".length()) {
            return false;
        }
        char charAt = str.charAt("is".length());
        if ('a' > charAt || charAt > 'z') {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m9341a(C1687ah ahVar) {
        if (ahVar.mo7344n() == C1725a.FAKE_OVERRIDE) {
            return false;
        }
        boolean z = true;
        if (m9344a(ahVar.mo7065b())) {
            return true;
        }
        if (!C2523c.m12601i(ahVar.mo7065b()) || !m9342a((C1724b) ahVar)) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m9344a(C1804m mVar) {
        return C2523c.m12601i(mVar) && C2523c.m12609q(mVar.mo7065b()) && !m9343a((C1796e) mVar);
    }

    /* renamed from: a */
    public static boolean m9343a(C1796e eVar) {
        return C1622d.f5064a.mo7175a(eVar);
    }

    /* renamed from: a */
    public static boolean m9342a(C1724b bVar) {
        for (C1658g gVar : bVar.mo7086x().mo7256b()) {
            if (C1654e.FIELD.equals(gVar.mo7248b()) && f6321a.equals(gVar.mo7247a().mo7240b())) {
                return true;
            }
        }
        return bVar.mo7086x().mo7257b(f6321a);
    }
}
