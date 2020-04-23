package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a;

import java.util.Map;
import p073b.C3226t;
import p073b.p074a.C1389ad;
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
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;

/* renamed from: b.h.b.a.b.d.a.a.h */
/* compiled from: JavaAnnotationMapper.kt */
public final class C1852h extends C1841b {

    /* renamed from: b */
    static final /* synthetic */ C3135k[] f5679b = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1852h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: c */
    private final C2710f f5680c;

    /* renamed from: b.h.b.a.b.d.a.a.h$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C1853a extends C1490k implements C1449a<Map<C2360f, ? extends C2500f<?>>> {

        /* renamed from: a */
        final /* synthetic */ C1852h f5681a;

        C1853a(C1852h hVar) {
            this.f5681a = hVar;
            super(0);
        }

        /* renamed from: b */
        public final Map<C2360f, C2500f<?>> mo6823a() {
            C2500f a = C1844d.f5670a.mo7602a(this.f5681a.mo7595f());
            Map<C2360f, C2500f<?>> a2 = a != null ? C1389ad.m6743a(C3226t.m14841a(C1843c.f5659a.mo7601c(), a)) : null;
            return a2 != null ? a2 : C1389ad.m6747a();
        }
    }

    /* renamed from: c */
    public Map<C2360f, C2500f<?>> mo7241c() {
        return (Map) C2712h.m13321a(this.f5680c, (Object) this, f5679b[0]);
    }

    public C1852h(C1985a aVar, C1967h hVar) {
        C1489j.m6972b(aVar, "annotation");
        C1489j.m6972b(hVar, "c");
        C2355b bVar = C1627g.f5076h.f5102H;
        C1489j.m6969a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.retention");
        super(hVar, aVar, bVar);
        this.f5680c = hVar.mo7803c().mo9793a((C1449a<? extends T>) new C1853a<Object>(this));
    }
}
