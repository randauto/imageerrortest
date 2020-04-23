package p073b.p085h.p087b.p088a.p090b.p127j.p128a.p129a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap.C1698a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1751b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2187ae;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2187ae.C2190b;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2289g;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2661k;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2674r;
import p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2678t;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.j.a.a.m */
/* compiled from: DeserializedTypeParameterDescriptor.kt */
public final class C2641m extends C1751b {

    /* renamed from: a */
    private final C2601a f7813a = new C2601a(this.f7814b.mo9741c(), new C2642a(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2661k f7814b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2187ae f7815c;

    /* renamed from: b.h.b.a.b.j.a.a.m$a */
    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    static final class C2642a extends C1490k implements C1449a<List<? extends C1651c>> {

        /* renamed from: a */
        final /* synthetic */ C2641m f7816a;

        C2642a(C2641m mVar) {
            this.f7816a = mVar;
            super(0);
        }

        /* renamed from: b */
        public final List<C1651c> mo6823a() {
            return C1415k.m6893k((Iterable<? extends T>) this.f7816a.f7814b.mo9742d().mo9721f().mo7986a(this.f7816a.f7815c, this.f7816a.f7814b.mo9743e()));
        }
    }

    public C2641m(C2661k kVar, C2187ae aeVar, int i) {
        C1489j.m6972b(kVar, "c");
        C1489j.m6972b(aeVar, "proto");
        C2713i c = kVar.mo9741c();
        C1804m f = kVar.mo9744f();
        C2360f b = C2674r.m13224b(kVar.mo9743e(), aeVar.mo8329g());
        C2678t tVar = C2678t.f7895a;
        C2190b p = aeVar.mo8333p();
        C1489j.m6969a((Object) p, "proto.variance");
        super(c, f, b, tVar.mo9775a(p), aeVar.mo8331k(), i, C1692am.f5331a, C1698a.f5333a);
        this.f7814b = kVar;
        this.f7815c = aeVar;
    }

    /* renamed from: o */
    public C2601a mo7086x() {
        return this.f7813a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public List<C2841w> mo7389m() {
        List a = C2289g.m11205a(this.f7815c, this.f7814b.mo9745g());
        if (a.isEmpty()) {
            return C1415k.m6832a(C2524a.m12627d(this).mo7208u());
        }
        Iterable<C2173aa> iterable = a;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C2173aa a2 : iterable) {
            arrayList.add(this.f7814b.mo9739a().mo9776a(a2, C1659h.f5247a.mo7260a()));
        }
        return (List) arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Void mo7387a(C2841w wVar) {
        C1489j.m6972b(wVar, "type");
        StringBuilder sb = new StringBuilder();
        sb.append("There should be no cycles for deserialized type parameters, but found for: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
}
