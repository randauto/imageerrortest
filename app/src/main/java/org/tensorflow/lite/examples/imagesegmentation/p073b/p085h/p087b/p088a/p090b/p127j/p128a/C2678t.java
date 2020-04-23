package p073b.p085h.p087b.p088a.p090b.p127j.p128a;

import p073b.C3219n;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b.C1725a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa.C2175a.C2178b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2187ae.C2190b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2213ao;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c.C2219b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2252q;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2254r;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;

/* renamed from: b.h.b.a.b.j.a.t */
/* compiled from: ProtoEnumFlags.kt */
public final class C2678t {

    /* renamed from: a */
    public static final C2678t f7895a = new C2678t();

    private C2678t() {
    }

    /* renamed from: a */
    public final C1725a mo9771a(C2252q qVar) {
        if (qVar != null) {
            switch (C2679u.f7896a[qVar.ordinal()]) {
                case 1:
                    return C1725a.DECLARATION;
                case 2:
                    return C1725a.FAKE_OVERRIDE;
                case 3:
                    return C1725a.DELEGATION;
                case 4:
                    return C1725a.SYNTHESIZED;
            }
        }
        return C1725a.DECLARATION;
    }

    /* renamed from: a */
    public final C1818w mo9773a(C2254r rVar) {
        if (rVar != null) {
            switch (C2679u.f7898c[rVar.ordinal()]) {
                case 1:
                    return C1818w.FINAL;
                case 2:
                    return C1818w.OPEN;
                case 3:
                    return C1818w.ABSTRACT;
                case 4:
                    return C1818w.SEALED;
            }
        }
        return C1818w.FINAL;
    }

    /* renamed from: a */
    public final C1723az mo9770a(C2213ao aoVar) {
        if (aoVar != null) {
            switch (C2679u.f7900e[aoVar.ordinal()]) {
                case 1:
                    return C1710ay.f5339d;
                case 2:
                    return C1710ay.f5336a;
                case 3:
                    return C1710ay.f5337b;
                case 4:
                    return C1710ay.f5338c;
                case 5:
                    return C1710ay.f5340e;
                case 6:
                    return C1710ay.f5341f;
            }
        }
        return C1710ay.f5336a;
    }

    /* renamed from: a */
    public final C1797f mo9772a(C2219b bVar) {
        if (bVar != null) {
            switch (C2679u.f7901f[bVar.ordinal()]) {
                case 1:
                    return C1797f.CLASS;
                case 2:
                    return C1797f.INTERFACE;
                case 3:
                    return C1797f.ENUM_CLASS;
                case 4:
                    return C1797f.ENUM_ENTRY;
                case 5:
                    return C1797f.ANNOTATION_CLASS;
                case 6:
                case 7:
                    return C1797f.OBJECT;
            }
        }
        return C1797f.CLASS;
    }

    /* renamed from: a */
    public final C2792ba mo9775a(C2190b bVar) {
        C1489j.m6972b(bVar, "variance");
        switch (C2679u.f7903h[bVar.ordinal()]) {
            case 1:
                return C2792ba.IN_VARIANCE;
            case 2:
                return C2792ba.OUT_VARIANCE;
            case 3:
                return C2792ba.INVARIANT;
            default:
                throw new C3219n();
        }
    }

    /* renamed from: a */
    public final C2792ba mo9774a(C2178b bVar) {
        C1489j.m6972b(bVar, "projection");
        switch (C2679u.f7904i[bVar.ordinal()]) {
            case 1:
                return C2792ba.IN_VARIANCE;
            case 2:
                return C2792ba.OUT_VARIANCE;
            case 3:
                return C2792ba.INVARIANT;
            case 4:
                StringBuilder sb = new StringBuilder();
                sb.append("Only IN, OUT and INV are supported. Actual argument: ");
                sb.append(bVar);
                throw new IllegalArgumentException(sb.toString());
            default:
                throw new C3219n();
        }
    }
}
