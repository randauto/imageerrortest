package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p106b;

import java.util.List;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1861l;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2759ah;
import p073b.p085h.p087b.p088a.p090b.p131l.C2761ai;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2773ar;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.d.a.c.b.d */
/* compiled from: JavaTypeResolver.kt */
public final class C1949d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C2355b f5894a = new C2355b("java.lang.Class");

    /* renamed from: b.h.b.a.b.d.a.c.b.d$a */
    /* compiled from: JavaTypeResolver.kt */
    static final class C1950a extends C1490k implements C1449a<C2755ad> {

        /* renamed from: a */
        final /* synthetic */ C1700ar f5895a;

        C1950a(C1700ar arVar) {
            this.f5895a = arVar;
            super(0);
        }

        /* renamed from: b */
        public final C2755ad mo6823a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't compute erased upper bound of type parameter `");
            sb.append(this.f5895a);
            sb.append('`');
            C2755ad c = C2827p.m13791c(sb.toString());
            C1489j.m6969a((Object) c, "ErrorUtils.createErrorTy… type parameter `$this`\")");
            return c;
        }
    }

    /* renamed from: a */
    public static final C2771ap m9007a(C1700ar arVar, C1942a aVar) {
        C1489j.m6972b(arVar, "typeParameter");
        C1489j.m6972b(aVar, "attr");
        if (aVar.mo7763a() == C1861l.SUPERTYPE) {
            return new C2773ar(C2761ai.m13489a(arVar));
        }
        return new C2759ah(arVar);
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C1942a m9005a(C1861l lVar, boolean z, C1700ar arVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            arVar = null;
        }
        return m9004a(lVar, z, arVar);
    }

    /* renamed from: a */
    public static final C1942a m9004a(C1861l lVar, boolean z, C1700ar arVar) {
        C1489j.m6972b(lVar, "$receiver");
        C1942a aVar = new C1942a(lVar, null, z, arVar, 2, null);
        return aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C2841w m9009a(C1700ar arVar, C1700ar arVar2, C1449a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            arVar2 = null;
        }
        if ((i & 2) != 0) {
            aVar = new C1950a(arVar);
        }
        return m9008a(arVar, arVar2, aVar);
    }

    /* renamed from: a */
    public static final C2841w m9008a(C1700ar arVar, C1700ar arVar2, C1449a<? extends C2841w> aVar) {
        C1489j.m6972b(arVar, "$receiver");
        C1489j.m6972b(aVar, "defaultValue");
        if (arVar == arVar2) {
            return (C2841w) aVar.mo6823a();
        }
        List j = arVar.mo7315j();
        C1489j.m6969a((Object) j, "upperBounds");
        C2841w wVar = (C2841w) C1415k.m6883f(j);
        if (wVar.mo9507g().mo7096d() instanceof C1796e) {
            C1489j.m6969a((Object) wVar, "firstUpperBound");
            return C2803a.m13684g(wVar);
        }
        if (arVar2 != null) {
            arVar = arVar2;
        }
        C1799h d = wVar.mo9507g().mo7096d();
        if (d != null) {
            while (true) {
                C1700ar arVar3 = (C1700ar) d;
                if (!(!C1489j.m6971a((Object) arVar3, (Object) arVar))) {
                    return (C2841w) aVar.mo6823a();
                }
                List j2 = arVar3.mo7315j();
                C1489j.m6969a((Object) j2, "current.upperBounds");
                C2841w wVar2 = (C2841w) C1415k.m6883f(j2);
                if (wVar2.mo9507g().mo7096d() instanceof C1796e) {
                    C1489j.m6969a((Object) wVar2, "nextUpperBound");
                    return C2803a.m13684g(wVar2);
                }
                d = wVar2.mo9507g().mo7096d();
                if (d == null) {
                    throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                }
            }
        } else {
            throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }
}
