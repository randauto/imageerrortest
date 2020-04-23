package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c;

import java.util.Map;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a.C1940n;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2008w;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2009x;
import p073b.p085h.p087b.p088a.p090b.p130k.C2708d;
import p073b.p085h.p087b.p088a.p090b.p139n.C2885a;

/* renamed from: b.h.b.a.b.d.a.c.i */
/* compiled from: resolvers.kt */
public final class C1968i implements C1973m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C2008w, Integer> f5922a;

    /* renamed from: b */
    private final C2708d<C2008w, C1940n> f5923b = this.f5924c.mo7803c().mo9797b((C1450b<? super K, ? extends V>) new C1969a<Object,Object>(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1967h f5924c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1804m f5925d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f5926e;

    /* renamed from: b.h.b.a.b.d.a.c.i$a */
    /* compiled from: resolvers.kt */
    static final class C1969a extends C1490k implements C1450b<C2008w, C1940n> {

        /* renamed from: a */
        final /* synthetic */ C1968i f5927a;

        C1969a(C1968i iVar) {
            this.f5927a = iVar;
            super(1);
        }

        /* renamed from: a */
        public final C1940n mo6756a(C2008w wVar) {
            C1489j.m6972b(wVar, "typeParameter");
            Integer num = (Integer) this.f5927a.f5922a.get(wVar);
            if (num == null) {
                return null;
            }
            return new C1940n(C1877a.m8650a(this.f5927a.f5924c, (C1973m) this.f5927a), wVar, this.f5927a.f5926e + num.intValue(), this.f5927a.f5925d);
        }
    }

    public C1968i(C1967h hVar, C1804m mVar, C2009x xVar, int i) {
        C1489j.m6972b(hVar, "c");
        C1489j.m6972b(mVar, "containingDeclaration");
        C1489j.m6972b(xVar, "typeParameterOwner");
        this.f5924c = hVar;
        this.f5925d = mVar;
        this.f5926e = i;
        this.f5922a = C2885a.m13949a((Iterable<? extends K>) xVar.mo7873s());
    }

    /* renamed from: a */
    public C1700ar mo7808a(C2008w wVar) {
        C1489j.m6972b(wVar, "javaTypeParameter");
        C1940n nVar = (C1940n) this.f5923b.mo6756a(wVar);
        return nVar != null ? nVar : this.f5924c.mo7806f().mo7808a(wVar);
    }
}
