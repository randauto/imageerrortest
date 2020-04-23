package p073b.p085h.p087b.p088a.p090b.p131l;

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
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;

/* renamed from: b.h.b.a.b.l.ah */
/* compiled from: StarProjectionImpl.kt */
public final class C2759ah extends C2772aq {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f8019a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C2759ah.class), "_type", "get_type()Lorg/jetbrains/kotlin/types/KotlinType;"))};

    /* renamed from: b */
    private final C1511g f8020b = C1521h.m14707a(C3217l.PUBLICATION, new C2760a(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1700ar f8021c;

    /* renamed from: b.h.b.a.b.l.ah$a */
    /* compiled from: StarProjectionImpl.kt */
    static final class C2760a extends C1490k implements C1449a<C2841w> {

        /* renamed from: a */
        final /* synthetic */ C2759ah f8022a;

        C2760a(C2759ah ahVar) {
            this.f8022a = ahVar;
            super(0);
        }

        /* renamed from: b */
        public final C2841w mo6823a() {
            return C2761ai.m13489a(this.f8022a.f8021c);
        }
    }

    /* renamed from: d */
    private final C2841w m13483d() {
        C1511g gVar = this.f8020b;
        C3135k kVar = f8019a[0];
        return (C2841w) gVar.mo6918a();
    }

    /* renamed from: a */
    public boolean mo9867a() {
        return true;
    }

    public C2759ah(C1700ar arVar) {
        C1489j.m6972b(arVar, "typeParameter");
        this.f8021c = arVar;
    }

    /* renamed from: b */
    public C2792ba mo9868b() {
        return C2792ba.OUT_VARIANCE;
    }

    /* renamed from: c */
    public C2841w mo9869c() {
        return m13483d();
    }
}
