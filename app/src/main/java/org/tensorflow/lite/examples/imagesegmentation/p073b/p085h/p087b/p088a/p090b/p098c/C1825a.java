package p073b.p085h.p087b.p088a.p090b.p098c;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1826a;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1828c;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1828c.C1829a;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1831e;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1833f;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;

/* renamed from: b.h.b.a.b.c.a */
/* compiled from: utils.kt */
public final class C1825a {
    /* renamed from: a */
    public static final void m8500a(C1828c cVar, C1827b bVar, C1796e eVar, C2360f fVar) {
        C1489j.m6972b(cVar, "$receiver");
        C1489j.m6972b(bVar, "from");
        C1489j.m6972b(eVar, "scopeOwner");
        C1489j.m6972b(fVar, "name");
        if (cVar != C1829a.f5606a) {
            C1826a a = bVar.mo7576a();
            if (a != null) {
                C1831e b = cVar.mo7578a() ? a.mo7575b() : C1831e.f5631a.mo7582a();
                String a2 = a.mo7574a();
                String a3 = C2523c.m12596d(eVar).mo9025a();
                C1489j.m6969a((Object) a3, "DescriptorUtils.getFqName(scopeOwner).asString()");
                C1833f fVar2 = C1833f.CLASSIFIER;
                String a4 = fVar.mo9039a();
                C1489j.m6969a((Object) a4, "name.asString()");
                cVar.mo7577a(a2, b, a3, fVar2, a4);
            }
        }
    }

    /* renamed from: a */
    public static final void m8499a(C1828c cVar, C1827b bVar, C1680ab abVar, C2360f fVar) {
        C1489j.m6972b(cVar, "$receiver");
        C1489j.m6972b(bVar, "from");
        C1489j.m6972b(abVar, "scopeOwner");
        C1489j.m6972b(fVar, "name");
        String a = abVar.mo7284f().mo9013a();
        C1489j.m6969a((Object) a, "scopeOwner.fqName.asString()");
        String a2 = fVar.mo9039a();
        C1489j.m6969a((Object) a2, "name.asString()");
        m8501a(cVar, bVar, a, a2);
    }

    /* renamed from: a */
    public static final void m8501a(C1828c cVar, C1827b bVar, String str, String str2) {
        C1489j.m6972b(cVar, "$receiver");
        C1489j.m6972b(bVar, "from");
        C1489j.m6972b(str, "packageFqName");
        C1489j.m6972b(str2, "name");
        if (cVar != C1829a.f5606a) {
            C1826a a = bVar.mo7576a();
            if (a != null) {
                cVar.mo7577a(a.mo7574a(), cVar.mo7578a() ? a.mo7575b() : C1831e.f5631a.mo7582a(), str, C1833f.PACKAGE, str2);
            }
        }
    }
}
