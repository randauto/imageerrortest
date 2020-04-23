package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import android.support.p072v8.renderscript.Allocation;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;

/* renamed from: b.h.b.a.b.d.b.x */
/* compiled from: TypeMappingMode.kt */
public final class C2154x {

    /* renamed from: a */
    public static final C2154x f6456a;

    /* renamed from: b */
    public static final C2154x f6457b;

    /* renamed from: c */
    public static final C2154x f6458c;

    /* renamed from: d */
    public static final C2154x f6459d;

    /* renamed from: e */
    public static final C2154x f6460e;

    /* renamed from: f */
    public static final C2154x f6461f;

    /* renamed from: g */
    public static final C2154x f6462g;

    /* renamed from: h */
    public static final C2155a f6463h = new C2155a(null);

    /* renamed from: i */
    private final boolean f6464i;

    /* renamed from: j */
    private final boolean f6465j;

    /* renamed from: k */
    private final boolean f6466k;

    /* renamed from: l */
    private final boolean f6467l;

    /* renamed from: m */
    private final boolean f6468m;

    /* renamed from: n */
    private final C2154x f6469n;

    /* renamed from: o */
    private final boolean f6470o;

    /* renamed from: p */
    private final C2154x f6471p;

    /* renamed from: q */
    private final C2154x f6472q;

    /* renamed from: b.h.b.a.b.d.b.x$a */
    /* compiled from: TypeMappingMode.kt */
    public static final class C2155a {
        private C2155a() {
        }

        public /* synthetic */ C2155a(C1486g gVar) {
            this();
        }
    }

    private C2154x(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C2154x xVar, boolean z6, C2154x xVar2, C2154x xVar3) {
        this.f6464i = z;
        this.f6465j = z2;
        this.f6466k = z3;
        this.f6467l = z4;
        this.f6468m = z5;
        this.f6469n = xVar;
        this.f6470o = z6;
        this.f6471p = xVar2;
        this.f6472q = xVar3;
    }

    /* renamed from: b */
    public final boolean mo8094b() {
        return this.f6464i;
    }

    /* renamed from: c */
    public final boolean mo8095c() {
        return this.f6465j;
    }

    /* renamed from: d */
    public final boolean mo8096d() {
        return this.f6466k;
    }

    /* synthetic */ C2154x(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C2154x xVar, boolean z6, C2154x xVar2, C2154x xVar3, int i, C1486g gVar) {
        int i2 = i;
        boolean z7 = true;
        boolean z8 = (i2 & 1) != 0 ? true : z;
        boolean z9 = (i2 & 2) != 0 ? true : z2;
        boolean z10 = false;
        boolean z11 = (i2 & 4) != 0 ? false : z3;
        boolean z12 = (i2 & 8) != 0 ? false : z4;
        if ((i2 & 16) == 0) {
            z10 = z5;
        }
        C2154x xVar4 = (i2 & 32) != 0 ? null : xVar;
        if ((i2 & 64) == 0) {
            z7 = z6;
        }
        this(z8, z9, z11, z12, z10, xVar4, z7, (i2 & Allocation.USAGE_SHARED) != 0 ? xVar4 : xVar2, (i2 & 256) != 0 ? xVar4 : xVar3);
    }

    /* renamed from: e */
    public final boolean mo8097e() {
        return this.f6470o;
    }

    static {
        C2154x xVar = new C2154x(false, false, false, false, false, null, false, null, null, 511, null);
        f6456a = xVar;
        C2154x xVar2 = new C2154x(false, true, false, false, false, null, false, null, null, 509, null);
        f6457b = xVar2;
        C2154x xVar3 = new C2154x(false, false, false, false, false, f6456a, false, null, null, 476, null);
        f6458c = xVar3;
        C2154x xVar4 = new C2154x(false, true, false, false, false, f6456a, false, null, null, 476, null);
        f6459d = xVar4;
        C2154x xVar5 = new C2154x(false, false, false, true, false, f6456a, false, null, null, 471, null);
        f6460e = xVar5;
        C2154x xVar6 = new C2154x(false, false, false, true, false, f6456a, false, null, null, 407, null);
        f6461f = xVar6;
        C2154x xVar7 = new C2154x(false, false, true, false, false, f6456a, false, null, null, 475, null);
        C2154x xVar8 = new C2154x(false, false, true, false, false, xVar7, false, null, null, 472, null);
        f6462g = xVar8;
    }

    /* renamed from: a */
    public final C2154x mo8093a(C2792ba baVar) {
        C1489j.m6972b(baVar, "effectiveVariance");
        switch (C2156y.f6473a[baVar.ordinal()]) {
            case 1:
                C2154x xVar = this.f6471p;
                if (xVar != null) {
                    return xVar;
                }
                break;
            case 2:
                C2154x xVar2 = this.f6472q;
                if (xVar2 != null) {
                    return xVar2;
                }
                break;
            default:
                C2154x xVar3 = this.f6469n;
                if (xVar3 != null) {
                    return xVar3;
                }
                break;
        }
        return this;
    }

    /* renamed from: a */
    public final C2154x mo8092a() {
        C2154x xVar = new C2154x(this.f6464i, true, this.f6466k, this.f6467l, this.f6468m, this.f6469n, this.f6470o, this.f6471p, this.f6472q);
        return xVar;
    }
}
