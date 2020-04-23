package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import java.util.Map;
import p073b.C1511g;
import p073b.C1521h;
import p073b.C3217l;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.a.k */
/* compiled from: BuiltInAnnotationDescriptor.kt */
public final class C1666k implements C1651c {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5253a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1666k.class), "type", "getType()Lorg/jetbrains/kotlin/types/KotlinType;"))};

    /* renamed from: b */
    private final C1511g f5254b = C1521h.m14707a(C3217l.PUBLICATION, new C1667a(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1627g f5255c;

    /* renamed from: d */
    private final C2355b f5256d;

    /* renamed from: e */
    private final Map<C2360f, C2500f<?>> f5257e;

    /* renamed from: b.h.b.a.b.b.a.k$a */
    /* compiled from: BuiltInAnnotationDescriptor.kt */
    static final class C1667a extends C1490k implements C1449a<C2755ad> {

        /* renamed from: a */
        final /* synthetic */ C1666k f5258a;

        C1667a(C1666k kVar) {
            this.f5258a = kVar;
            super(0);
        }

        /* renamed from: b */
        public final C2755ad mo6823a() {
            C1796e b = this.f5258a.f5255c.mo7188b(this.f5258a.mo7240b());
            C1489j.m6969a((Object) b, "builtIns.getBuiltInClassByFqName(fqName)");
            return b.mo7346A_();
        }
    }

    /* renamed from: a */
    public C2841w mo7239a() {
        C1511g gVar = this.f5254b;
        C3135k kVar = f5253a[0];
        return (C2841w) gVar.mo6918a();
    }

    public C1666k(C1627g gVar, C2355b bVar, Map<C2360f, ? extends C2500f<?>> map) {
        C1489j.m6972b(gVar, "builtIns");
        C1489j.m6972b(bVar, "fqName");
        C1489j.m6972b(map, "allValueArguments");
        this.f5255c = gVar;
        this.f5256d = bVar;
        this.f5257e = map;
    }

    /* renamed from: b */
    public C2355b mo7240b() {
        return this.f5256d;
    }

    /* renamed from: c */
    public Map<C2360f, C2500f<?>> mo7241c() {
        return this.f5257e;
    }

    /* renamed from: d */
    public C1692am mo7242d() {
        C1692am amVar = C1692am.f5331a;
        C1489j.m6969a((Object) amVar, "SourceElement.NO_SOURCE");
        return amVar;
    }
}
