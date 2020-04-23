package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a;

import java.util.Map;
import p073b.C3226t;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1985a;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1987b;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1990e;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1998m;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;

/* renamed from: b.h.b.a.b.d.a.a.i */
/* compiled from: JavaAnnotationMapper.kt */
public final class C1854i extends C1841b {

    /* renamed from: b */
    static final /* synthetic */ C3135k[] f5682b = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1854i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: c */
    private final C2710f f5683c;

    /* renamed from: b.h.b.a.b.d.a.a.i$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C1855a extends C1490k implements C1449a<Map<C2360f, ? extends C2500f<?>>> {

        /* renamed from: a */
        final /* synthetic */ C1854i f5684a;

        C1855a(C1854i iVar) {
            this.f5684a = iVar;
            super(0);
        }

        /* renamed from: b */
        public final Map<C2360f, C2500f<?>> mo6823a() {
            C1987b f = this.f5684a.mo7595f();
            Map<C2360f, C2500f<?>> map = null;
            Object obj = f instanceof C1990e ? C1844d.f5670a.mo7603a(((C1990e) this.f5684a.mo7595f()).mo7833b()) : f instanceof C1998m ? C1844d.f5670a.mo7603a(C1415k.m6832a(this.f5684a.mo7595f())) : null;
            if (obj != null) {
                map = C1389ad.m6743a(C3226t.m14841a(C1843c.f5659a.mo7600b(), obj));
            }
            return map != null ? map : C1389ad.m6747a();
        }
    }

    /* renamed from: c */
    public Map<C2360f, C2500f<?>> mo7241c() {
        return (Map) C2712h.m13321a(this.f5683c, (Object) this, f5682b[0]);
    }

    public C1854i(C1985a aVar, C1967h hVar) {
        C1489j.m6972b(aVar, "annotation");
        C1489j.m6972b(hVar, "c");
        C2355b bVar = C1627g.f5076h.f5099E;
        C1489j.m6969a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.target");
        super(hVar, aVar, bVar);
        this.f5683c = hVar.mo7803c().mo9793a((C1449a<? extends T>) new C1855a<Object>(this));
    }
}
