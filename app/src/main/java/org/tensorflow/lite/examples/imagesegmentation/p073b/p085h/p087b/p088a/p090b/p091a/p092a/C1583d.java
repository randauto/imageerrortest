package p073b.p085h.p087b.p088a.p090b.p091a.p092a;

import java.util.List;
import p073b.C3227u;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2555e;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.a.a.d */
/* compiled from: FunctionClassScope.kt */
public final class C1583d extends C2555e {
    public C1583d(C2713i iVar, C1576b bVar) {
        C1489j.m6972b(iVar, "storageManager");
        C1489j.m6972b(bVar, "containingClass");
        super(iVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C1813t> mo7105a() {
        C1796e c = mo9590c();
        if (c != null) {
            switch (C1584e.f4983a[((C1576b) c).mo7062A().ordinal()]) {
                case 1:
                    return C1415k.m6832a(C1585f.f4984a.mo7110a((C1576b) mo9590c(), false));
                case 2:
                    return C1415k.m6832a(C1585f.f4984a.mo7110a((C1576b) mo9590c(), true));
                default:
                    return C1415k.m6837a();
            }
        } else {
            throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        }
    }
}
