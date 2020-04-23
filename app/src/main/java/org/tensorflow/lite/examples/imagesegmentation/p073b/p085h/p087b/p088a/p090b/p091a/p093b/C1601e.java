package p073b.p085h.p087b.p088a.p090b.p091a.p093b;

import java.util.List;
import p073b.C3232z;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1726a;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1728b;
import p073b.p085h.p087b.p088a.p090b.p094b.p096b.C1729c;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1786u;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.a.b.e */
/* compiled from: JvmBuiltIns.kt */
public final class C1601e extends C1627g {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5020a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1601e.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSettings;"))};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1821y f5021k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f5022l;

    /* renamed from: m */
    private final C2710f f5023m;

    /* renamed from: b.h.b.a.b.a.b.e$a */
    /* compiled from: JvmBuiltIns.kt */
    static final class C1602a extends C1490k implements C1449a<C1605f> {

        /* renamed from: a */
        final /* synthetic */ C1601e f5024a;

        /* renamed from: b */
        final /* synthetic */ C2713i f5025b;

        C1602a(C1601e eVar, C2713i iVar) {
            this.f5024a = eVar;
            this.f5025b = iVar;
            super(0);
        }

        /* renamed from: b */
        public final C1605f mo6823a() {
            C1786u h = this.f5024a.mo7195h();
            C1489j.m6969a((Object) h, "builtInsModule");
            return new C1605f(h, this.f5025b, new C1449a<C1821y>(this) {

                /* renamed from: a */
                final /* synthetic */ C1602a f5026a;

                {
                    this.f5026a = r1;
                }

                /* renamed from: b */
                public final C1821y mo6823a() {
                    C1821y a = this.f5026a.f5024a.f5021k;
                    if (a != null) {
                        return a;
                    }
                    throw new AssertionError("JvmBuiltins has not been initialized properly");
                }
            }, new C1449a<Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C1602a f5027a;

                {
                    this.f5027a = r1;
                }

                /* renamed from: a */
                public /* synthetic */ Object mo6823a() {
                    return Boolean.valueOf(mo7147b());
                }

                /* renamed from: b */
                public final boolean mo7147b() {
                    if (this.f5027a.f5024a.f5021k != null) {
                        return this.f5027a.f5024a.f5022l;
                    }
                    throw new AssertionError("JvmBuiltins has not been initialized properly");
                }
            });
        }
    }

    /* renamed from: a */
    public final C1605f mo7140a() {
        return (C1605f) C2712h.m13321a(this.f5023m, (Object) this, f5020a[0]);
    }

    public /* synthetic */ C1601e(C2713i iVar, boolean z, int i, C1486g gVar) {
        if ((i & 2) != 0) {
            z = true;
        }
        this(iVar, z);
    }

    public C1601e(C2713i iVar, boolean z) {
        C1489j.m6972b(iVar, "storageManager");
        super(iVar);
        this.f5022l = true;
        this.f5023m = iVar.mo9793a((C1449a<? extends T>) new C1602a<Object>(this, iVar));
        if (z) {
            mo7192c();
        }
    }

    /* renamed from: a */
    public final void mo7141a(C1821y yVar, boolean z) {
        C1489j.m6972b(yVar, "moduleDescriptor");
        boolean z2 = this.f5021k == null;
        if (!C3232z.f8648a || z2) {
            this.f5021k = yVar;
            this.f5022l = z;
            return;
        }
        throw new AssertionError("JvmBuiltins repeated initialization");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1729c mo7116e() {
        return mo7140a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1726a mo7143d() {
        return mo7140a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<C1728b> mo7144f() {
        Iterable f = super.mo7144f();
        C1489j.m6969a((Object) f, "super.getClassDescriptorFactories()");
        C2713i g = mo7194g();
        C1489j.m6969a((Object) g, "storageManager");
        C1786u h = mo7195h();
        C1489j.m6969a((Object) h, "builtInsModule");
        C1597d dVar = new C1597d(g, h, null, 4, null);
        return C1415k.m6877d(f, dVar);
    }
}
