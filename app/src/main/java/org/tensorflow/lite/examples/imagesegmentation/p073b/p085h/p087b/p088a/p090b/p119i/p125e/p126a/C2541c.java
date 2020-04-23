package p073b.p085h.p087b.p088a.p090b.p119i.p125e.p126a;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;

/* renamed from: b.h.b.a.b.i.e.a.c */
/* compiled from: ImplicitClassReceiver.kt */
public class C2541c implements C2542d, C2545g {

    /* renamed from: a */
    private final C2541c f7612a;

    /* renamed from: b */
    private final C1796e f7613b;

    /* renamed from: c */
    private final C1796e f7614c;

    public C2541c(C1796e eVar, C2541c cVar) {
        C1489j.m6972b(eVar, "classDescriptor");
        this.f7614c = eVar;
        if (cVar == null) {
            cVar = this;
        }
        this.f7612a = cVar;
        this.f7613b = this.f7614c;
    }

    /* renamed from: c */
    public final C1796e mo9566c() {
        return this.f7614c;
    }

    /* renamed from: b */
    public C2755ad mo7335a() {
        return this.f7614c.mo7346A_();
    }

    public boolean equals(Object obj) {
        C1796e eVar = this.f7614c;
        C1796e eVar2 = null;
        if (!(obj instanceof C2541c)) {
            obj = null;
        }
        C2541c cVar = (C2541c) obj;
        if (cVar != null) {
            eVar2 = cVar.f7614c;
        }
        return C1489j.m6971a((Object) eVar, (Object) eVar2);
    }

    public int hashCode() {
        return this.f7614c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class{");
        sb.append(mo7335a());
        sb.append('}');
        return sb.toString();
    }
}
