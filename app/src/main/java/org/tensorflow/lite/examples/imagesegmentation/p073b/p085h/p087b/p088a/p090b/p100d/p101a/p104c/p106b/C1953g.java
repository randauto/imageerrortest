package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p106b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3221p;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p080a.C1461m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p085h.p087b.p088a.p090b.p118h.C2469h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2754ac;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2834q;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p132a.C2717c;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.d.a.c.b.g */
/* compiled from: RawType.kt */
public final class C1953g extends C2834q implements C2754ac {

    /* renamed from: b.h.b.a.b.d.a.c.b.g$a */
    /* compiled from: RawType.kt */
    static final class C1954a extends C1490k implements C1461m<String, String, Boolean> {

        /* renamed from: a */
        public static final C1954a f5900a = new C1954a();

        C1954a() {
            super(2);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6920a(Object obj, Object obj2) {
            return Boolean.valueOf(mo7790a((String) obj, (String) obj2));
        }

        /* renamed from: a */
        public final boolean mo7790a(String str, String str2) {
            C1489j.m6972b(str, "first");
            C1489j.m6972b(str2, "second");
            return C1489j.m6971a((Object) str, (Object) C3199m.m14786a(str2, (CharSequence) "out ")) || C1489j.m6971a((Object) str2, (Object) "*");
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.b.g$b */
    /* compiled from: RawType.kt */
    static final class C1955b extends C1490k implements C1450b<C2841w, List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ C2443c f5901a;

        C1955b(C2443c cVar) {
            this.f5901a = cVar;
            super(1);
        }

        /* renamed from: a */
        public final List<String> mo6756a(C2841w wVar) {
            C1489j.m6972b(wVar, "type");
            Iterable<C2771ap> a = wVar.mo9501a();
            Collection arrayList = new ArrayList(C1415k.m6842a(a, 10));
            for (C2771ap a2 : a) {
                arrayList.add(this.f5901a.mo9347a(a2));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.b.g$c */
    /* compiled from: RawType.kt */
    static final class C1956c extends C1490k implements C1461m<String, String, String> {

        /* renamed from: a */
        public static final C1956c f5902a = new C1956c();

        C1956c() {
            super(2);
        }

        /* renamed from: a */
        public final String mo6920a(String str, String str2) {
            C1489j.m6972b(str, "$receiver");
            C1489j.m6972b(str2, "newArgs");
            if (!C3199m.m14813c((CharSequence) str, '<', false, 2, (Object) null)) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C3199m.m14785a(str, '<', (String) null, 2, (Object) null));
            sb.append('<');
            sb.append(str2);
            sb.append('>');
            sb.append(C3199m.m14810c(str, '>', (String) null, 2, (Object) null));
            return sb.toString();
        }
    }

    /* renamed from: b.h.b.a.b.d.a.c.b.g$d */
    /* compiled from: RawType.kt */
    static final class C1957d extends C1490k implements C1450b<String, String> {

        /* renamed from: a */
        public static final C1957d f5903a = new C1957d();

        C1957d() {
            super(1);
        }

        /* renamed from: a */
        public final String mo6756a(String str) {
            C1489j.m6972b(str, "it");
            StringBuilder sb = new StringBuilder();
            sb.append("(raw) ");
            sb.append(str);
            return sb.toString();
        }
    }

    public C1953g(C2755ad adVar, C2755ad adVar2) {
        C1489j.m6972b(adVar, "lowerBound");
        C1489j.m6972b(adVar2, "upperBound");
        super(adVar, adVar2);
        boolean a = C2717c.f7961a.mo9823a(adVar, adVar2);
        if (C3232z.f8648a && !a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Lower bound ");
            sb.append(adVar);
            sb.append(" of a flexible type must be a subtype of the upper bound ");
            sb.append(adVar2);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: H_ */
    public C2755ad mo7783H_() {
        return mo9945f();
    }

    /* renamed from: b */
    public C2560h mo7787b() {
        C1799h d = mo9507g().mo7096d();
        if (!(d instanceof C1796e)) {
            d = null;
        }
        C1796e eVar = (C1796e) d;
        if (eVar != null) {
            C2560h a = eVar.mo7356a(C1951e.f5896a);
            C1489j.m6969a((Object) a, "classDescriptor.getMemberScope(RawSubstitution)");
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Incorrect classifier: ");
        sb.append(mo9507g().mo7096d());
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public C1953g mo7788b(C1659h hVar) {
        C1489j.m6972b(hVar, "newAnnotations");
        return new C1953g(mo9945f().mo7896c(hVar), mo9946h().mo7896c(hVar));
    }

    /* renamed from: a */
    public C1953g mo7789b(boolean z) {
        return new C1953g(mo9945f().mo7894a(z), mo9946h().mo7894a(z));
    }

    /* renamed from: a */
    public String mo7786a(C2443c cVar, C2469h hVar) {
        C1489j.m6972b(cVar, "renderer");
        C1489j.m6972b(hVar, "options");
        C1954a aVar = C1954a.f5900a;
        C1955b bVar = new C1955b(cVar);
        C1956c cVar2 = C1956c.f5902a;
        String a = cVar.mo9348a((C2841w) mo9945f());
        String a2 = cVar.mo9348a((C2841w) mo9946h());
        if (hVar.mo9408h()) {
            StringBuilder sb = new StringBuilder();
            sb.append("raw (");
            sb.append(a);
            sb.append("..");
            sb.append(a2);
            sb.append(')');
            return sb.toString();
        } else if (mo9946h().mo9501a().isEmpty()) {
            return cVar.mo9349a(a, a2, C2803a.m13674a((C2841w) this));
        } else {
            List a3 = bVar.mo6756a((C2841w) mo9945f());
            List a4 = bVar.mo6756a((C2841w) mo9946h());
            Iterable iterable = a3;
            String a5 = C1415k.m6859a(iterable, ", ", null, null, 0, null, C1957d.f5903a, 30, null);
            Iterable a6 = C1415k.m6861a(iterable, (Iterable<? extends R>) a4);
            boolean z = true;
            if (!(a6 instanceof Collection) || !((Collection) a6).isEmpty()) {
                Iterator it = a6.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3221p pVar = (C3221p) it.next();
                    if (!C1954a.f5900a.mo7790a((String) pVar.mo10387a(), (String) pVar.mo10388b())) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                a2 = cVar2.mo6920a(a2, a5);
            }
            String a7 = cVar2.mo6920a(a, a5);
            if (C1489j.m6971a((Object) a7, (Object) a2)) {
                return a7;
            }
            return cVar.mo9349a(a7, a2, C2803a.m13674a((C2841w) this));
        }
    }
}
