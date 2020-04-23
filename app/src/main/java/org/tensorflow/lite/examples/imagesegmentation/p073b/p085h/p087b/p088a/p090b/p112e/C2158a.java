package p073b.p085h.p087b.p088a.p090b.p112e;

import android.support.p072v8.renderscript.Allocation;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p117g.C2367b;
import p073b.p085h.p087b.p088a.p090b.p117g.C2371d;
import p073b.p085h.p087b.p088a.p090b.p117g.C2371d.C2373b;
import p073b.p085h.p087b.p088a.p090b.p117g.C2374e;
import p073b.p085h.p087b.p088a.p090b.p117g.C2376f;
import p073b.p085h.p087b.p088a.p090b.p117g.C2378g;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2385a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2386b;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2387c;
import p073b.p085h.p087b.p088a.p090b.p117g.C2383i.C2389d;
import p073b.p085h.p087b.p088a.p090b.p117g.C2392j.C2393a;
import p073b.p085h.p087b.p088a.p090b.p117g.C2392j.C2394b;
import p073b.p085h.p087b.p088a.p090b.p117g.C2395k;
import p073b.p085h.p087b.p088a.p090b.p117g.C2401n;
import p073b.p085h.p087b.p088a.p090b.p117g.C2402o;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q;
import p073b.p085h.p087b.p088a.p090b.p117g.C2408r;
import p073b.p085h.p087b.p088a.p090b.p117g.C2409s;
import p073b.p085h.p087b.p088a.p090b.p117g.C2410t;

/* renamed from: b.h.b.a.b.e.a */
/* compiled from: ProtoBuf */
public final class C2158a {

    /* renamed from: b.h.b.a.b.e.a$a */
    /* compiled from: ProtoBuf */
    public static final class C2160a extends C2383i implements C2215b {

        /* renamed from: a */
        public static C2409s<C2160a> f6474a = new C2367b<C2160a>() {
            /* renamed from: a */
            public C2160a mo8114b(C2374e eVar, C2378g gVar) {
                return new C2160a(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2160a f6475c = new C2160a(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6476d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6477e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6478f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public List<C2162a> f6479g;

        /* renamed from: h */
        private byte f6480h;

        /* renamed from: i */
        private int f6481i;

        /* renamed from: b.h.b.a.b.e.a$a$a */
        /* compiled from: ProtoBuf */
        public static final class C2162a extends C2383i implements C2171b {

            /* renamed from: a */
            public static C2409s<C2162a> f6482a = new C2367b<C2162a>() {
                /* renamed from: a */
                public C2162a mo8114b(C2374e eVar, C2378g gVar) {
                    return new C2162a(eVar, gVar);
                }
            };

            /* renamed from: c */
            private static final C2162a f6483c = new C2162a(true);
            /* access modifiers changed from: private */

            /* renamed from: d */
            public final C2371d f6484d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public int f6485e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public int f6486f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public C2165b f6487g;

            /* renamed from: h */
            private byte f6488h;

            /* renamed from: i */
            private int f6489i;

            /* renamed from: b.h.b.a.b.e.a$a$a$a */
            /* compiled from: ProtoBuf */
            public static final class C2164a extends C2385a<C2162a, C2164a> implements C2171b {

                /* renamed from: a */
                private int f6490a;

                /* renamed from: b */
                private int f6491b;

                /* renamed from: c */
                private C2165b f6492c = C2165b.m9708a();

                /* renamed from: n */
                private void m9678n() {
                }

                private C2164a() {
                    m9678n();
                }

                /* access modifiers changed from: private */
                /* renamed from: p */
                public static C2164a m9679p() {
                    return new C2164a();
                }

                /* renamed from: a */
                public C2164a mo8140k() {
                    return m9679p().mo8128a(mo8134d());
                }

                /* renamed from: b */
                public C2162a mo8112o() {
                    return C2162a.m9656a();
                }

                /* renamed from: c */
                public C2162a mo8141l() {
                    C2162a d = mo8134d();
                    if (d.mo8106h()) {
                        return d;
                    }
                    throw m11714a(d);
                }

                /* renamed from: d */
                public C2162a mo8134d() {
                    C2162a aVar = new C2162a((C2385a) this);
                    int i = this.f6490a;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    aVar.f6486f = this.f6491b;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    aVar.f6487g = this.f6492c;
                    aVar.f6485e = i2;
                    return aVar;
                }

                /* renamed from: a */
                public C2164a mo8128a(C2162a aVar) {
                    if (aVar == C2162a.m9656a()) {
                        return this;
                    }
                    if (aVar.mo8116d()) {
                        mo8124a(aVar.mo8117e());
                    }
                    if (aVar.mo8118f()) {
                        mo8125a(aVar.mo8119g());
                    }
                    mo9198a(mo9199x().mo9075a(aVar.f6484d));
                    return this;
                }

                /* renamed from: h */
                public final boolean mo8106h() {
                    if (mo8135e() && mo8136f() && mo8137g().mo8106h()) {
                        return true;
                    }
                    return false;
                }

                /* renamed from: a */
                public C2164a mo8132c(C2374e eVar, C2378g gVar) {
                    C2162a aVar;
                    C2162a aVar2 = null;
                    try {
                        C2162a aVar3 = (C2162a) C2162a.f6482a.mo8114b(eVar, gVar);
                        if (aVar3 != null) {
                            mo8128a(aVar3);
                        }
                        return this;
                    } catch (C2395k e) {
                        aVar = (C2162a) e.mo9220a();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        aVar2 = aVar;
                    }
                    if (aVar2 != null) {
                        mo8128a(aVar2);
                    }
                    throw th;
                }

                /* renamed from: e */
                public boolean mo8135e() {
                    return (this.f6490a & 1) == 1;
                }

                /* renamed from: a */
                public C2164a mo8124a(int i) {
                    this.f6490a |= 1;
                    this.f6491b = i;
                    return this;
                }

                /* renamed from: f */
                public boolean mo8136f() {
                    return (this.f6490a & 2) == 2;
                }

                /* renamed from: g */
                public C2165b mo8137g() {
                    return this.f6492c;
                }

                /* renamed from: a */
                public C2164a mo8125a(C2165b bVar) {
                    if ((this.f6490a & 2) != 2 || this.f6492c == C2165b.m9708a()) {
                        this.f6492c = bVar;
                    } else {
                        this.f6492c = C2165b.m9706a(this.f6492c).mo8128a(bVar).mo8180d();
                    }
                    this.f6490a |= 2;
                    return this;
                }
            }

            /* renamed from: b.h.b.a.b.e.a$a$a$b */
            /* compiled from: ProtoBuf */
            public static final class C2165b extends C2383i implements C2170c {

                /* renamed from: a */
                public static C2409s<C2165b> f6493a = new C2367b<C2165b>() {
                    /* renamed from: a */
                    public C2165b mo8114b(C2374e eVar, C2378g gVar) {
                        return new C2165b(eVar, gVar);
                    }
                };

                /* renamed from: c */
                private static final C2165b f6494c = new C2165b(true);
                /* access modifiers changed from: private */

                /* renamed from: d */
                public final C2371d f6495d;
                /* access modifiers changed from: private */

                /* renamed from: e */
                public int f6496e;
                /* access modifiers changed from: private */

                /* renamed from: f */
                public C2168b f6497f;
                /* access modifiers changed from: private */

                /* renamed from: g */
                public long f6498g;
                /* access modifiers changed from: private */

                /* renamed from: h */
                public float f6499h;
                /* access modifiers changed from: private */

                /* renamed from: i */
                public double f6500i;
                /* access modifiers changed from: private */

                /* renamed from: j */
                public int f6501j;
                /* access modifiers changed from: private */

                /* renamed from: k */
                public int f6502k;
                /* access modifiers changed from: private */

                /* renamed from: l */
                public int f6503l;
                /* access modifiers changed from: private */

                /* renamed from: m */
                public C2160a f6504m;
                /* access modifiers changed from: private */

                /* renamed from: n */
                public List<C2165b> f6505n;
                /* access modifiers changed from: private */

                /* renamed from: o */
                public int f6506o;

                /* renamed from: p */
                private byte f6507p;

                /* renamed from: q */
                private int f6508q;

                /* renamed from: b.h.b.a.b.e.a$a$a$b$a */
                /* compiled from: ProtoBuf */
                public static final class C2167a extends C2385a<C2165b, C2167a> implements C2170c {

                    /* renamed from: a */
                    private int f6509a;

                    /* renamed from: b */
                    private C2168b f6510b = C2168b.BYTE;

                    /* renamed from: c */
                    private long f6511c;

                    /* renamed from: d */
                    private float f6512d;

                    /* renamed from: e */
                    private double f6513e;

                    /* renamed from: f */
                    private int f6514f;

                    /* renamed from: g */
                    private int f6515g;

                    /* renamed from: h */
                    private int f6516h;

                    /* renamed from: i */
                    private C2160a f6517i = C2160a.m9629a();

                    /* renamed from: j */
                    private List<C2165b> f6518j = Collections.emptyList();

                    /* renamed from: k */
                    private int f6519k;

                    /* renamed from: n */
                    private void m9751n() {
                    }

                    private C2167a() {
                        m9751n();
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: p */
                    public static C2167a m9752p() {
                        return new C2167a();
                    }

                    /* renamed from: a */
                    public C2167a mo8140k() {
                        return m9752p().mo8128a(mo8180d());
                    }

                    /* renamed from: b */
                    public C2165b mo8112o() {
                        return C2165b.m9708a();
                    }

                    /* renamed from: c */
                    public C2165b mo8141l() {
                        C2165b d = mo8180d();
                        if (d.mo8106h()) {
                            return d;
                        }
                        throw m11714a(d);
                    }

                    /* renamed from: d */
                    public C2165b mo8180d() {
                        C2165b bVar = new C2165b((C2385a) this);
                        int i = this.f6509a;
                        int i2 = 1;
                        if ((i & 1) != 1) {
                            i2 = 0;
                        }
                        bVar.f6497f = this.f6510b;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        bVar.f6498g = this.f6511c;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        bVar.f6499h = this.f6512d;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        bVar.f6500i = this.f6513e;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        bVar.f6501j = this.f6514f;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        bVar.f6502k = this.f6515g;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        bVar.f6503l = this.f6516h;
                        if ((i & Allocation.USAGE_SHARED) == 128) {
                            i2 |= Allocation.USAGE_SHARED;
                        }
                        bVar.f6504m = this.f6517i;
                        if ((this.f6509a & 256) == 256) {
                            this.f6518j = Collections.unmodifiableList(this.f6518j);
                            this.f6509a &= -257;
                        }
                        bVar.f6505n = this.f6518j;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        bVar.f6506o = this.f6519k;
                        bVar.f6496e = i2;
                        return bVar;
                    }

                    /* renamed from: a */
                    public C2167a mo8128a(C2165b bVar) {
                        if (bVar == C2165b.m9708a()) {
                            return this;
                        }
                        if (bVar.mo8148d()) {
                            mo8172a(bVar.mo8149e());
                        }
                        if (bVar.mo8150f()) {
                            mo8171a(bVar.mo8151g());
                        }
                        if (bVar.mo8152j()) {
                            mo8169a(bVar.mo8153k());
                        }
                        if (bVar.mo8154l()) {
                            mo8168a(bVar.mo8155p());
                        }
                        if (bVar.mo8156q()) {
                            mo8170a(bVar.mo8157r());
                        }
                        if (bVar.mo8158s()) {
                            mo8176b(bVar.mo8159t());
                        }
                        if (bVar.mo8160u()) {
                            mo8178c(bVar.mo8161v());
                        }
                        if (bVar.mo8162w()) {
                            mo8174a(bVar.mo8163x());
                        }
                        if (!bVar.f6505n.isEmpty()) {
                            if (this.f6518j.isEmpty()) {
                                this.f6518j = bVar.f6505n;
                                this.f6509a &= -257;
                            } else {
                                m9753q();
                                this.f6518j.addAll(bVar.f6505n);
                            }
                        }
                        if (bVar.mo8142A()) {
                            mo8182e(bVar.mo8143B());
                        }
                        mo9198a(mo9199x().mo9075a(bVar.f6495d));
                        return this;
                    }

                    /* renamed from: h */
                    public final boolean mo8106h() {
                        if (mo8183e() && !mo8184f().mo8106h()) {
                            return false;
                        }
                        for (int i = 0; i < mo8185g(); i++) {
                            if (!mo8181d(i).mo8106h()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    /* renamed from: a */
                    public C2167a mo8132c(C2374e eVar, C2378g gVar) {
                        C2165b bVar;
                        C2165b bVar2 = null;
                        try {
                            C2165b bVar3 = (C2165b) C2165b.f6493a.mo8114b(eVar, gVar);
                            if (bVar3 != null) {
                                mo8128a(bVar3);
                            }
                            return this;
                        } catch (C2395k e) {
                            bVar = (C2165b) e.mo9220a();
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            bVar2 = bVar;
                        }
                        if (bVar2 != null) {
                            mo8128a(bVar2);
                        }
                        throw th;
                    }

                    /* renamed from: a */
                    public C2167a mo8172a(C2168b bVar) {
                        if (bVar != null) {
                            this.f6509a |= 1;
                            this.f6510b = bVar;
                            return this;
                        }
                        throw new NullPointerException();
                    }

                    /* renamed from: a */
                    public C2167a mo8171a(long j) {
                        this.f6509a |= 2;
                        this.f6511c = j;
                        return this;
                    }

                    /* renamed from: a */
                    public C2167a mo8169a(float f) {
                        this.f6509a |= 4;
                        this.f6512d = f;
                        return this;
                    }

                    /* renamed from: a */
                    public C2167a mo8168a(double d) {
                        this.f6509a |= 8;
                        this.f6513e = d;
                        return this;
                    }

                    /* renamed from: a */
                    public C2167a mo8170a(int i) {
                        this.f6509a |= 16;
                        this.f6514f = i;
                        return this;
                    }

                    /* renamed from: b */
                    public C2167a mo8176b(int i) {
                        this.f6509a |= 32;
                        this.f6515g = i;
                        return this;
                    }

                    /* renamed from: c */
                    public C2167a mo8178c(int i) {
                        this.f6509a |= 64;
                        this.f6516h = i;
                        return this;
                    }

                    /* renamed from: e */
                    public boolean mo8183e() {
                        return (this.f6509a & Allocation.USAGE_SHARED) == 128;
                    }

                    /* renamed from: f */
                    public C2160a mo8184f() {
                        return this.f6517i;
                    }

                    /* renamed from: a */
                    public C2167a mo8174a(C2160a aVar) {
                        if ((this.f6509a & Allocation.USAGE_SHARED) != 128 || this.f6517i == C2160a.m9629a()) {
                            this.f6517i = aVar;
                        } else {
                            this.f6517i = C2160a.m9628a(this.f6517i).mo8128a(aVar).mo8196d();
                        }
                        this.f6509a |= Allocation.USAGE_SHARED;
                        return this;
                    }

                    /* renamed from: q */
                    private void m9753q() {
                        if ((this.f6509a & 256) != 256) {
                            this.f6518j = new ArrayList(this.f6518j);
                            this.f6509a |= 256;
                        }
                    }

                    /* renamed from: g */
                    public int mo8185g() {
                        return this.f6518j.size();
                    }

                    /* renamed from: d */
                    public C2165b mo8181d(int i) {
                        return (C2165b) this.f6518j.get(i);
                    }

                    /* renamed from: e */
                    public C2167a mo8182e(int i) {
                        this.f6509a |= 512;
                        this.f6519k = i;
                        return this;
                    }
                }

                /* renamed from: b.h.b.a.b.e.a$a$a$b$b */
                /* compiled from: ProtoBuf */
                public enum C2168b implements C2393a {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);
                    

                    /* renamed from: n */
                    private static C2394b<C2168b> f6533n;

                    /* renamed from: o */
                    private final int f6535o;

                    static {
                        f6533n = new C2394b<C2168b>() {
                            /* renamed from: a */
                            public C2168b mo8188b(int i) {
                                return C2168b.m9782a(i);
                            }
                        };
                    }

                    /* renamed from: a */
                    public final int mo8186a() {
                        return this.f6535o;
                    }

                    /* renamed from: a */
                    public static C2168b m9782a(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }

                    private C2168b(int i, int i2) {
                        this.f6535o = i2;
                    }
                }

                private C2165b(C2385a aVar) {
                    super(aVar);
                    this.f6507p = -1;
                    this.f6508q = -1;
                    this.f6495d = aVar.mo9199x();
                }

                private C2165b(boolean z) {
                    this.f6507p = -1;
                    this.f6508q = -1;
                    this.f6495d = C2371d.f7253a;
                }

                /* renamed from: a */
                public static C2165b m9708a() {
                    return f6494c;
                }

                /* renamed from: b */
                public C2165b mo8112o() {
                    return f6494c;
                }

                private C2165b(C2374e eVar, C2378g gVar) {
                    this.f6507p = -1;
                    this.f6508q = -1;
                    m9701F();
                    C2373b i = C2371d.m11743i();
                    C2376f a = C2376f.m11817a((OutputStream) i, 1);
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int a2 = eVar.mo9095a();
                            switch (a2) {
                                case 0:
                                    z = true;
                                    break;
                                case 8:
                                    int n = eVar.mo9117n();
                                    C2168b a3 = C2168b.m9782a(n);
                                    if (a3 != null) {
                                        this.f6496e |= 1;
                                        this.f6497f = a3;
                                        break;
                                    } else {
                                        a.mo9171p(a2);
                                        a.mo9171p(n);
                                        break;
                                    }
                                case 16:
                                    this.f6496e |= 2;
                                    this.f6498g = eVar.mo9121r();
                                    break;
                                case 29:
                                    this.f6496e |= 4;
                                    this.f6499h = eVar.mo9103c();
                                    break;
                                case 33:
                                    this.f6496e |= 8;
                                    this.f6500i = eVar.mo9102b();
                                    break;
                                case 40:
                                    this.f6496e |= 16;
                                    this.f6501j = eVar.mo9109f();
                                    break;
                                case 48:
                                    this.f6496e |= 32;
                                    this.f6502k = eVar.mo9109f();
                                    break;
                                case 56:
                                    this.f6496e |= 64;
                                    this.f6503l = eVar.mo9109f();
                                    break;
                                case 66:
                                    C2172c cVar = null;
                                    if ((this.f6496e & Allocation.USAGE_SHARED) == 128) {
                                        cVar = this.f6504m.mo8110m();
                                    }
                                    this.f6504m = (C2160a) eVar.mo9096a(C2160a.f6474a, gVar);
                                    if (cVar != null) {
                                        cVar.mo8128a(this.f6504m);
                                        this.f6504m = cVar.mo8196d();
                                    }
                                    this.f6496e |= Allocation.USAGE_SHARED;
                                    break;
                                case 74:
                                    if (!(z2 & true)) {
                                        this.f6505n = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f6505n.add(eVar.mo9096a(f6493a, gVar));
                                    break;
                                case 80:
                                    this.f6496e |= 256;
                                    this.f6506o = eVar.mo9109f();
                                    break;
                                default:
                                    if (mo9197a(eVar, a, gVar, a2)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                            }
                        } catch (C2395k e) {
                            throw e.mo9219a(this);
                        } catch (IOException e2) {
                            throw new C2395k(e2.getMessage()).mo9219a(this);
                        } catch (Throwable th) {
                            if (z2 & true) {
                                this.f6505n = Collections.unmodifiableList(this.f6505n);
                            }
                            try {
                                a.mo9131a();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                this.f6495d = i.mo9090a();
                                throw th2;
                            }
                            this.f6495d = i.mo9090a();
                            mo9196O();
                            throw th;
                        }
                    }
                    if (z2 & true) {
                        this.f6505n = Collections.unmodifiableList(this.f6505n);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f6495d = i.mo9090a();
                        throw th3;
                    }
                    this.f6495d = i.mo9090a();
                    mo9196O();
                }

                static {
                    f6494c.m9701F();
                }

                /* renamed from: c */
                public C2409s<C2165b> mo8101c() {
                    return f6493a;
                }

                /* renamed from: d */
                public boolean mo8148d() {
                    return (this.f6496e & 1) == 1;
                }

                /* renamed from: e */
                public C2168b mo8149e() {
                    return this.f6497f;
                }

                /* renamed from: f */
                public boolean mo8150f() {
                    return (this.f6496e & 2) == 2;
                }

                /* renamed from: g */
                public long mo8151g() {
                    return this.f6498g;
                }

                /* renamed from: j */
                public boolean mo8152j() {
                    return (this.f6496e & 4) == 4;
                }

                /* renamed from: k */
                public float mo8153k() {
                    return this.f6499h;
                }

                /* renamed from: l */
                public boolean mo8154l() {
                    return (this.f6496e & 8) == 8;
                }

                /* renamed from: p */
                public double mo8155p() {
                    return this.f6500i;
                }

                /* renamed from: q */
                public boolean mo8156q() {
                    return (this.f6496e & 16) == 16;
                }

                /* renamed from: r */
                public int mo8157r() {
                    return this.f6501j;
                }

                /* renamed from: s */
                public boolean mo8158s() {
                    return (this.f6496e & 32) == 32;
                }

                /* renamed from: t */
                public int mo8159t() {
                    return this.f6502k;
                }

                /* renamed from: u */
                public boolean mo8160u() {
                    return (this.f6496e & 64) == 64;
                }

                /* renamed from: v */
                public int mo8161v() {
                    return this.f6503l;
                }

                /* renamed from: w */
                public boolean mo8162w() {
                    return (this.f6496e & Allocation.USAGE_SHARED) == 128;
                }

                /* renamed from: x */
                public C2160a mo8163x() {
                    return this.f6504m;
                }

                /* renamed from: y */
                public List<C2165b> mo8164y() {
                    return this.f6505n;
                }

                /* renamed from: z */
                public int mo8165z() {
                    return this.f6505n.size();
                }

                /* renamed from: a */
                public C2165b mo8146a(int i) {
                    return (C2165b) this.f6505n.get(i);
                }

                /* renamed from: A */
                public boolean mo8142A() {
                    return (this.f6496e & 256) == 256;
                }

                /* renamed from: B */
                public int mo8143B() {
                    return this.f6506o;
                }

                /* renamed from: F */
                private void m9701F() {
                    this.f6497f = C2168b.BYTE;
                    this.f6498g = 0;
                    this.f6499h = 0.0f;
                    this.f6500i = 0.0d;
                    this.f6501j = 0;
                    this.f6502k = 0;
                    this.f6503l = 0;
                    this.f6504m = C2160a.m9629a();
                    this.f6505n = Collections.emptyList();
                    this.f6506o = 0;
                }

                /* renamed from: h */
                public final boolean mo8106h() {
                    byte b = this.f6507p;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (!mo8162w() || mo8163x().mo8106h()) {
                        for (int i = 0; i < mo8165z(); i++) {
                            if (!mo8146a(i).mo8106h()) {
                                this.f6507p = 0;
                                return false;
                            }
                        }
                        this.f6507p = 1;
                        return true;
                    }
                    this.f6507p = 0;
                    return false;
                }

                /* renamed from: a */
                public void mo8099a(C2376f fVar) {
                    mo8107i();
                    if ((this.f6496e & 1) == 1) {
                        fVar.mo9156c(1, this.f6497f.mo8186a());
                    }
                    if ((this.f6496e & 2) == 2) {
                        fVar.mo9138a(2, this.f6498g);
                    }
                    if ((this.f6496e & 4) == 4) {
                        fVar.mo9136a(3, this.f6499h);
                    }
                    if ((this.f6496e & 8) == 8) {
                        fVar.mo9135a(4, this.f6500i);
                    }
                    if ((this.f6496e & 16) == 16) {
                        fVar.mo9137a(5, this.f6501j);
                    }
                    if ((this.f6496e & 32) == 32) {
                        fVar.mo9137a(6, this.f6502k);
                    }
                    if ((this.f6496e & 64) == 64) {
                        fVar.mo9137a(7, this.f6503l);
                    }
                    if ((this.f6496e & Allocation.USAGE_SHARED) == 128) {
                        fVar.mo9152b(8, (C2406q) this.f6504m);
                    }
                    for (int i = 0; i < this.f6505n.size(); i++) {
                        fVar.mo9152b(9, (C2406q) this.f6505n.get(i));
                    }
                    if ((this.f6496e & 256) == 256) {
                        fVar.mo9137a(10, this.f6506o);
                    }
                    fVar.mo9159c(this.f6495d);
                }

                /* renamed from: i */
                public int mo8107i() {
                    int i = this.f6508q;
                    if (i != -1) {
                        return i;
                    }
                    int e = (this.f6496e & 1) == 1 ? C2376f.m11834e(1, this.f6497f.mo8186a()) + 0 : 0;
                    if ((this.f6496e & 2) == 2) {
                        e += C2376f.m11822b(2, this.f6498g);
                    }
                    if ((this.f6496e & 4) == 4) {
                        e += C2376f.m11821b(3, this.f6499h);
                    }
                    if ((this.f6496e & 8) == 8) {
                        e += C2376f.m11820b(4, this.f6500i);
                    }
                    if ((this.f6496e & 16) == 16) {
                        e += C2376f.m11831d(5, this.f6501j);
                    }
                    if ((this.f6496e & 32) == 32) {
                        e += C2376f.m11831d(6, this.f6502k);
                    }
                    if ((this.f6496e & 64) == 64) {
                        e += C2376f.m11831d(7, this.f6503l);
                    }
                    if ((this.f6496e & Allocation.USAGE_SHARED) == 128) {
                        e += C2376f.m11832d(8, (C2406q) this.f6504m);
                    }
                    for (int i2 = 0; i2 < this.f6505n.size(); i2++) {
                        e += C2376f.m11832d(9, (C2406q) this.f6505n.get(i2));
                    }
                    if ((this.f6496e & 256) == 256) {
                        e += C2376f.m11831d(10, this.f6506o);
                    }
                    int a = e + this.f6495d.mo9064a();
                    this.f6508q = a;
                    return a;
                }

                /* renamed from: C */
                public static C2167a m9700C() {
                    return C2167a.m9752p();
                }

                /* renamed from: D */
                public C2167a mo8111n() {
                    return m9700C();
                }

                /* renamed from: a */
                public static C2167a m9706a(C2165b bVar) {
                    return m9700C().mo8128a(bVar);
                }

                /* renamed from: E */
                public C2167a mo8110m() {
                    return m9706a(this);
                }
            }

            /* renamed from: b.h.b.a.b.e.a$a$a$c */
            public interface C2170c extends C2408r {
            }

            private C2162a(C2385a aVar) {
                super(aVar);
                this.f6488h = -1;
                this.f6489i = -1;
                this.f6484d = aVar.mo9199x();
            }

            private C2162a(boolean z) {
                this.f6488h = -1;
                this.f6489i = -1;
                this.f6484d = C2371d.f7253a;
            }

            /* renamed from: a */
            public static C2162a m9656a() {
                return f6483c;
            }

            /* renamed from: b */
            public C2162a mo8112o() {
                return f6483c;
            }

            private C2162a(C2374e eVar, C2378g gVar) {
                this.f6488h = -1;
                this.f6489i = -1;
                m9660p();
                C2373b i = C2371d.m11743i();
                C2376f a = C2376f.m11817a((OutputStream) i, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int a2 = eVar.mo9095a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.f6485e |= 1;
                                this.f6486f = eVar.mo9109f();
                            } else if (a2 == 18) {
                                C2167a aVar = null;
                                if ((this.f6485e & 2) == 2) {
                                    aVar = this.f6487g.mo8110m();
                                }
                                this.f6487g = (C2165b) eVar.mo9096a(C2165b.f6493a, gVar);
                                if (aVar != null) {
                                    aVar.mo8128a(this.f6487g);
                                    this.f6487g = aVar.mo8180d();
                                }
                                this.f6485e |= 2;
                            } else if (!mo9197a(eVar, a, gVar, a2)) {
                            }
                        }
                        z = true;
                    } catch (C2395k e) {
                        throw e.mo9219a(this);
                    } catch (IOException e2) {
                        throw new C2395k(e2.getMessage()).mo9219a(this);
                    } catch (Throwable th) {
                        try {
                            a.mo9131a();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f6484d = i.mo9090a();
                            throw th2;
                        }
                        this.f6484d = i.mo9090a();
                        mo9196O();
                        throw th;
                    }
                }
                try {
                    a.mo9131a();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f6484d = i.mo9090a();
                    throw th3;
                }
                this.f6484d = i.mo9090a();
                mo9196O();
            }

            static {
                f6483c.m9660p();
            }

            /* renamed from: c */
            public C2409s<C2162a> mo8101c() {
                return f6482a;
            }

            /* renamed from: d */
            public boolean mo8116d() {
                return (this.f6485e & 1) == 1;
            }

            /* renamed from: e */
            public int mo8117e() {
                return this.f6486f;
            }

            /* renamed from: f */
            public boolean mo8118f() {
                return (this.f6485e & 2) == 2;
            }

            /* renamed from: g */
            public C2165b mo8119g() {
                return this.f6487g;
            }

            /* renamed from: p */
            private void m9660p() {
                this.f6486f = 0;
                this.f6487g = C2165b.m9708a();
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                byte b = this.f6488h;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!mo8116d()) {
                    this.f6488h = 0;
                    return false;
                } else if (!mo8118f()) {
                    this.f6488h = 0;
                    return false;
                } else if (!mo8119g().mo8106h()) {
                    this.f6488h = 0;
                    return false;
                } else {
                    this.f6488h = 1;
                    return true;
                }
            }

            /* renamed from: a */
            public void mo8099a(C2376f fVar) {
                mo8107i();
                if ((this.f6485e & 1) == 1) {
                    fVar.mo9137a(1, this.f6486f);
                }
                if ((this.f6485e & 2) == 2) {
                    fVar.mo9152b(2, (C2406q) this.f6487g);
                }
                fVar.mo9159c(this.f6484d);
            }

            /* renamed from: i */
            public int mo8107i() {
                int i = this.f6489i;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.f6485e & 1) == 1) {
                    i2 = 0 + C2376f.m11831d(1, this.f6486f);
                }
                if ((this.f6485e & 2) == 2) {
                    i2 += C2376f.m11832d(2, (C2406q) this.f6487g);
                }
                int a = i2 + this.f6484d.mo9064a();
                this.f6489i = a;
                return a;
            }

            /* renamed from: j */
            public static C2164a m9659j() {
                return C2164a.m9679p();
            }

            /* renamed from: k */
            public C2164a mo8111n() {
                return m9659j();
            }

            /* renamed from: a */
            public static C2164a m9654a(C2162a aVar) {
                return m9659j().mo8128a(aVar);
            }

            /* renamed from: l */
            public C2164a mo8110m() {
                return m9654a(this);
            }
        }

        /* renamed from: b.h.b.a.b.e.a$a$b */
        public interface C2171b extends C2408r {
        }

        /* renamed from: b.h.b.a.b.e.a$a$c */
        /* compiled from: ProtoBuf */
        public static final class C2172c extends C2385a<C2160a, C2172c> implements C2215b {

            /* renamed from: a */
            private int f6536a;

            /* renamed from: b */
            private int f6537b;

            /* renamed from: c */
            private List<C2162a> f6538c = Collections.emptyList();

            /* renamed from: m */
            private void m9787m() {
            }

            private C2172c() {
                m9787m();
            }

            /* access modifiers changed from: private */
            /* renamed from: n */
            public static C2172c m9788n() {
                return new C2172c();
            }

            /* renamed from: a */
            public C2172c mo8140k() {
                return m9788n().mo8128a(mo8196d());
            }

            /* renamed from: b */
            public C2160a mo8112o() {
                return C2160a.m9629a();
            }

            /* renamed from: c */
            public C2160a mo8141l() {
                C2160a d = mo8196d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2160a mo8196d() {
                C2160a aVar = new C2160a((C2385a) this);
                int i = 1;
                if ((this.f6536a & 1) != 1) {
                    i = 0;
                }
                aVar.f6478f = this.f6537b;
                if ((this.f6536a & 2) == 2) {
                    this.f6538c = Collections.unmodifiableList(this.f6538c);
                    this.f6536a &= -3;
                }
                aVar.f6479g = this.f6538c;
                aVar.f6477e = i;
                return aVar;
            }

            /* renamed from: a */
            public C2172c mo8128a(C2160a aVar) {
                if (aVar == C2160a.m9629a()) {
                    return this;
                }
                if (aVar.mo8102d()) {
                    mo8190a(aVar.mo8103e());
                }
                if (!aVar.f6479g.isEmpty()) {
                    if (this.f6538c.isEmpty()) {
                        this.f6538c = aVar.f6479g;
                        this.f6536a &= -3;
                    } else {
                        m9789p();
                        this.f6538c.addAll(aVar.f6479g);
                    }
                }
                mo9198a(mo9199x().mo9075a(aVar.f6476d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                if (!mo8197e()) {
                    return false;
                }
                for (int i = 0; i < mo8198f(); i++) {
                    if (!mo8193b(i).mo8106h()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: a */
            public C2172c mo8132c(C2374e eVar, C2378g gVar) {
                C2160a aVar;
                C2160a aVar2 = null;
                try {
                    C2160a aVar3 = (C2160a) C2160a.f6474a.mo8114b(eVar, gVar);
                    if (aVar3 != null) {
                        mo8128a(aVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    aVar = (C2160a) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                }
                if (aVar2 != null) {
                    mo8128a(aVar2);
                }
                throw th;
            }

            /* renamed from: e */
            public boolean mo8197e() {
                return (this.f6536a & 1) == 1;
            }

            /* renamed from: a */
            public C2172c mo8190a(int i) {
                this.f6536a |= 1;
                this.f6537b = i;
                return this;
            }

            /* renamed from: p */
            private void m9789p() {
                if ((this.f6536a & 2) != 2) {
                    this.f6538c = new ArrayList(this.f6538c);
                    this.f6536a |= 2;
                }
            }

            /* renamed from: f */
            public int mo8198f() {
                return this.f6538c.size();
            }

            /* renamed from: b */
            public C2162a mo8193b(int i) {
                return (C2162a) this.f6538c.get(i);
            }
        }

        private C2160a(C2385a aVar) {
            super(aVar);
            this.f6480h = -1;
            this.f6481i = -1;
            this.f6476d = aVar.mo9199x();
        }

        private C2160a(boolean z) {
            this.f6480h = -1;
            this.f6481i = -1;
            this.f6476d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2160a m9629a() {
            return f6475c;
        }

        /* renamed from: b */
        public C2160a mo8112o() {
            return f6475c;
        }

        private C2160a(C2374e eVar, C2378g gVar) {
            this.f6480h = -1;
            this.f6481i = -1;
            m9635p();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 8) {
                            this.f6477e |= 1;
                            this.f6478f = eVar.mo9109f();
                        } else if (a2 == 18) {
                            if (!(z2 & true)) {
                                this.f6479g = new ArrayList();
                                z2 |= true;
                            }
                            this.f6479g.add(eVar.mo9096a(C2162a.f6482a, gVar));
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f6479g = Collections.unmodifiableList(this.f6479g);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6476d = i.mo9090a();
                        throw th2;
                    }
                    this.f6476d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f6479g = Collections.unmodifiableList(this.f6479g);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6476d = i.mo9090a();
                throw th3;
            }
            this.f6476d = i.mo9090a();
            mo9196O();
        }

        static {
            f6475c.m9635p();
        }

        /* renamed from: c */
        public C2409s<C2160a> mo8101c() {
            return f6474a;
        }

        /* renamed from: d */
        public boolean mo8102d() {
            return (this.f6477e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8103e() {
            return this.f6478f;
        }

        /* renamed from: f */
        public List<C2162a> mo8104f() {
            return this.f6479g;
        }

        /* renamed from: g */
        public int mo8105g() {
            return this.f6479g.size();
        }

        /* renamed from: a */
        public C2162a mo8098a(int i) {
            return (C2162a) this.f6479g.get(i);
        }

        /* renamed from: p */
        private void m9635p() {
            this.f6478f = 0;
            this.f6479g = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6480h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8102d()) {
                this.f6480h = 0;
                return false;
            }
            for (int i = 0; i < mo8105g(); i++) {
                if (!mo8098a(i).mo8106h()) {
                    this.f6480h = 0;
                    return false;
                }
            }
            this.f6480h = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            if ((this.f6477e & 1) == 1) {
                fVar.mo9137a(1, this.f6478f);
            }
            for (int i = 0; i < this.f6479g.size(); i++) {
                fVar.mo9152b(2, (C2406q) this.f6479g.get(i));
            }
            fVar.mo9159c(this.f6476d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6481i;
            if (i != -1) {
                return i;
            }
            int d = (this.f6477e & 1) == 1 ? C2376f.m11831d(1, this.f6478f) + 0 : 0;
            for (int i2 = 0; i2 < this.f6479g.size(); i2++) {
                d += C2376f.m11832d(2, (C2406q) this.f6479g.get(i2));
            }
            int a = d + this.f6476d.mo9064a();
            this.f6481i = a;
            return a;
        }

        /* renamed from: j */
        public static C2172c m9634j() {
            return C2172c.m9788n();
        }

        /* renamed from: k */
        public C2172c mo8111n() {
            return m9634j();
        }

        /* renamed from: a */
        public static C2172c m9628a(C2160a aVar) {
            return m9634j().mo8128a(aVar);
        }

        /* renamed from: l */
        public C2172c mo8110m() {
            return m9628a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$aa */
    /* compiled from: ProtoBuf */
    public static final class C2173aa extends C2387c<C2173aa> implements C2186ad {

        /* renamed from: a */
        public static C2409s<C2173aa> f6539a = new C2367b<C2173aa>() {
            /* renamed from: a */
            public C2173aa mo8114b(C2374e eVar, C2378g gVar) {
                return new C2173aa(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2173aa f6540c = new C2173aa(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6541d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6542e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public List<C2175a> f6543f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f6544g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f6545h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2173aa f6546i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f6547j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f6548k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f6549l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f6550m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f6551n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C2173aa f6552o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f6553p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C2173aa f6554q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public int f6555r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public int f6556s;

        /* renamed from: t */
        private byte f6557t;

        /* renamed from: u */
        private int f6558u;

        /* renamed from: b.h.b.a.b.e.a$aa$a */
        /* compiled from: ProtoBuf */
        public static final class C2175a extends C2383i implements C2180b {

            /* renamed from: a */
            public static C2409s<C2175a> f6559a = new C2367b<C2175a>() {
                /* renamed from: a */
                public C2175a mo8114b(C2374e eVar, C2378g gVar) {
                    return new C2175a(eVar, gVar);
                }
            };

            /* renamed from: c */
            private static final C2175a f6560c = new C2175a(true);
            /* access modifiers changed from: private */

            /* renamed from: d */
            public final C2371d f6561d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public int f6562e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public C2178b f6563f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public C2173aa f6564g;
            /* access modifiers changed from: private */

            /* renamed from: h */
            public int f6565h;

            /* renamed from: i */
            private byte f6566i;

            /* renamed from: j */
            private int f6567j;

            /* renamed from: b.h.b.a.b.e.a$aa$a$a */
            /* compiled from: ProtoBuf */
            public static final class C2177a extends C2385a<C2175a, C2177a> implements C2180b {

                /* renamed from: a */
                private int f6568a;

                /* renamed from: b */
                private C2178b f6569b = C2178b.INV;

                /* renamed from: c */
                private C2173aa f6570c = C2173aa.m9813a();

                /* renamed from: d */
                private int f6571d;

                /* renamed from: m */
                private void m9899m() {
                }

                private C2177a() {
                    m9899m();
                }

                /* access modifiers changed from: private */
                /* renamed from: n */
                public static C2177a m9900n() {
                    return new C2177a();
                }

                /* renamed from: a */
                public C2177a mo8140k() {
                    return m9900n().mo8128a(mo8250d());
                }

                /* renamed from: b */
                public C2175a mo8112o() {
                    return C2175a.m9874a();
                }

                /* renamed from: c */
                public C2175a mo8141l() {
                    C2175a d = mo8250d();
                    if (d.mo8106h()) {
                        return d;
                    }
                    throw m11714a(d);
                }

                /* renamed from: d */
                public C2175a mo8250d() {
                    C2175a aVar = new C2175a((C2385a) this);
                    int i = this.f6568a;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    aVar.f6563f = this.f6569b;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    aVar.f6564g = this.f6570c;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    aVar.f6565h = this.f6571d;
                    aVar.f6562e = i2;
                    return aVar;
                }

                /* renamed from: a */
                public C2177a mo8128a(C2175a aVar) {
                    if (aVar == C2175a.m9874a()) {
                        return this;
                    }
                    if (aVar.mo8233d()) {
                        mo8244a(aVar.mo8234e());
                    }
                    if (aVar.mo8235f()) {
                        mo8246a(aVar.mo8236g());
                    }
                    if (aVar.mo8237j()) {
                        mo8243a(aVar.mo8238k());
                    }
                    mo9198a(mo9199x().mo9075a(aVar.f6561d));
                    return this;
                }

                /* renamed from: h */
                public final boolean mo8106h() {
                    return !mo8251e() || mo8252f().mo8106h();
                }

                /* renamed from: a */
                public C2177a mo8132c(C2374e eVar, C2378g gVar) {
                    C2175a aVar;
                    C2175a aVar2 = null;
                    try {
                        C2175a aVar3 = (C2175a) C2175a.f6559a.mo8114b(eVar, gVar);
                        if (aVar3 != null) {
                            mo8128a(aVar3);
                        }
                        return this;
                    } catch (C2395k e) {
                        aVar = (C2175a) e.mo9220a();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        aVar2 = aVar;
                    }
                    if (aVar2 != null) {
                        mo8128a(aVar2);
                    }
                    throw th;
                }

                /* renamed from: a */
                public C2177a mo8244a(C2178b bVar) {
                    if (bVar != null) {
                        this.f6568a |= 1;
                        this.f6569b = bVar;
                        return this;
                    }
                    throw new NullPointerException();
                }

                /* renamed from: e */
                public boolean mo8251e() {
                    return (this.f6568a & 2) == 2;
                }

                /* renamed from: f */
                public C2173aa mo8252f() {
                    return this.f6570c;
                }

                /* renamed from: a */
                public C2177a mo8246a(C2173aa aaVar) {
                    if ((this.f6568a & 2) != 2 || this.f6570c == C2173aa.m9813a()) {
                        this.f6570c = aaVar;
                    } else {
                        this.f6570c = C2173aa.m9812a(this.f6570c).mo8128a(aaVar).mo8267d();
                    }
                    this.f6568a |= 2;
                    return this;
                }

                /* renamed from: a */
                public C2177a mo8243a(int i) {
                    this.f6568a |= 4;
                    this.f6571d = i;
                    return this;
                }
            }

            /* renamed from: b.h.b.a.b.e.a$aa$a$b */
            /* compiled from: ProtoBuf */
            public enum C2178b implements C2393a {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);
                

                /* renamed from: e */
                private static C2394b<C2178b> f6576e;

                /* renamed from: f */
                private final int f6578f;

                static {
                    f6576e = new C2394b<C2178b>() {
                        /* renamed from: a */
                        public C2178b mo8188b(int i) {
                            return C2178b.m9921a(i);
                        }
                    };
                }

                /* renamed from: a */
                public final int mo8186a() {
                    return this.f6578f;
                }

                /* renamed from: a */
                public static C2178b m9921a(int i) {
                    switch (i) {
                        case 0:
                            return IN;
                        case 1:
                            return OUT;
                        case 2:
                            return INV;
                        case 3:
                            return STAR;
                        default:
                            return null;
                    }
                }

                private C2178b(int i, int i2) {
                    this.f6578f = i2;
                }
            }

            private C2175a(C2385a aVar) {
                super(aVar);
                this.f6566i = -1;
                this.f6567j = -1;
                this.f6561d = aVar.mo9199x();
            }

            private C2175a(boolean z) {
                this.f6566i = -1;
                this.f6567j = -1;
                this.f6561d = C2371d.f7253a;
            }

            /* renamed from: a */
            public static C2175a m9874a() {
                return f6560c;
            }

            /* renamed from: b */
            public C2175a mo8112o() {
                return f6560c;
            }

            private C2175a(C2374e eVar, C2378g gVar) {
                this.f6566i = -1;
                this.f6567j = -1;
                m9879r();
                C2373b i = C2371d.m11743i();
                C2376f a = C2376f.m11817a((OutputStream) i, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int a2 = eVar.mo9095a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                int n = eVar.mo9117n();
                                C2178b a3 = C2178b.m9921a(n);
                                if (a3 == null) {
                                    a.mo9171p(a2);
                                    a.mo9171p(n);
                                } else {
                                    this.f6562e |= 1;
                                    this.f6563f = a3;
                                }
                            } else if (a2 == 18) {
                                C2181c cVar = null;
                                if ((this.f6562e & 2) == 2) {
                                    cVar = this.f6564g.mo8110m();
                                }
                                this.f6564g = (C2173aa) eVar.mo9096a(C2173aa.f6539a, gVar);
                                if (cVar != null) {
                                    cVar.mo8128a(this.f6564g);
                                    this.f6564g = cVar.mo8267d();
                                }
                                this.f6562e |= 2;
                            } else if (a2 == 24) {
                                this.f6562e |= 4;
                                this.f6565h = eVar.mo9109f();
                            } else if (!mo9197a(eVar, a, gVar, a2)) {
                            }
                        }
                        z = true;
                    } catch (C2395k e) {
                        throw e.mo9219a(this);
                    } catch (IOException e2) {
                        throw new C2395k(e2.getMessage()).mo9219a(this);
                    } catch (Throwable th) {
                        try {
                            a.mo9131a();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f6561d = i.mo9090a();
                            throw th2;
                        }
                        this.f6561d = i.mo9090a();
                        mo9196O();
                        throw th;
                    }
                }
                try {
                    a.mo9131a();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f6561d = i.mo9090a();
                    throw th3;
                }
                this.f6561d = i.mo9090a();
                mo9196O();
            }

            static {
                f6560c.m9879r();
            }

            /* renamed from: c */
            public C2409s<C2175a> mo8101c() {
                return f6559a;
            }

            /* renamed from: d */
            public boolean mo8233d() {
                return (this.f6562e & 1) == 1;
            }

            /* renamed from: e */
            public C2178b mo8234e() {
                return this.f6563f;
            }

            /* renamed from: f */
            public boolean mo8235f() {
                return (this.f6562e & 2) == 2;
            }

            /* renamed from: g */
            public C2173aa mo8236g() {
                return this.f6564g;
            }

            /* renamed from: j */
            public boolean mo8237j() {
                return (this.f6562e & 4) == 4;
            }

            /* renamed from: k */
            public int mo8238k() {
                return this.f6565h;
            }

            /* renamed from: r */
            private void m9879r() {
                this.f6563f = C2178b.INV;
                this.f6564g = C2173aa.m9813a();
                this.f6565h = 0;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                byte b = this.f6566i;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!mo8235f() || mo8236g().mo8106h()) {
                    this.f6566i = 1;
                    return true;
                }
                this.f6566i = 0;
                return false;
            }

            /* renamed from: a */
            public void mo8099a(C2376f fVar) {
                mo8107i();
                if ((this.f6562e & 1) == 1) {
                    fVar.mo9156c(1, this.f6563f.mo8186a());
                }
                if ((this.f6562e & 2) == 2) {
                    fVar.mo9152b(2, (C2406q) this.f6564g);
                }
                if ((this.f6562e & 4) == 4) {
                    fVar.mo9137a(3, this.f6565h);
                }
                fVar.mo9159c(this.f6561d);
            }

            /* renamed from: i */
            public int mo8107i() {
                int i = this.f6567j;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.f6562e & 1) == 1) {
                    i2 = 0 + C2376f.m11834e(1, this.f6563f.mo8186a());
                }
                if ((this.f6562e & 2) == 2) {
                    i2 += C2376f.m11832d(2, (C2406q) this.f6564g);
                }
                if ((this.f6562e & 4) == 4) {
                    i2 += C2376f.m11831d(3, this.f6565h);
                }
                int a = i2 + this.f6561d.mo9064a();
                this.f6567j = a;
                return a;
            }

            /* renamed from: l */
            public static C2177a m9878l() {
                return C2177a.m9900n();
            }

            /* renamed from: p */
            public C2177a mo8111n() {
                return m9878l();
            }

            /* renamed from: a */
            public static C2177a m9872a(C2175a aVar) {
                return m9878l().mo8128a(aVar);
            }

            /* renamed from: q */
            public C2177a mo8110m() {
                return m9872a(this);
            }
        }

        /* renamed from: b.h.b.a.b.e.a$aa$b */
        public interface C2180b extends C2408r {
        }

        /* renamed from: b.h.b.a.b.e.a$aa$c */
        /* compiled from: ProtoBuf */
        public static final class C2181c extends C2386b<C2173aa, C2181c> implements C2186ad {

            /* renamed from: a */
            private int f6579a;

            /* renamed from: b */
            private List<C2175a> f6580b = Collections.emptyList();

            /* renamed from: c */
            private boolean f6581c;

            /* renamed from: d */
            private int f6582d;

            /* renamed from: e */
            private C2173aa f6583e = C2173aa.m9813a();

            /* renamed from: f */
            private int f6584f;

            /* renamed from: g */
            private int f6585g;

            /* renamed from: h */
            private int f6586h;

            /* renamed from: i */
            private int f6587i;

            /* renamed from: j */
            private int f6588j;

            /* renamed from: k */
            private C2173aa f6589k = C2173aa.m9813a();

            /* renamed from: l */
            private int f6590l;

            /* renamed from: m */
            private C2173aa f6591m = C2173aa.m9813a();

            /* renamed from: n */
            private int f6592n;

            /* renamed from: o */
            private int f6593o;

            /* renamed from: s */
            private void m9926s() {
            }

            private C2181c() {
                m9926s();
            }

            /* access modifiers changed from: private */
            /* renamed from: t */
            public static C2181c m9927t() {
                return new C2181c();
            }

            /* renamed from: a */
            public C2181c mo8281u() {
                return m9927t().mo8128a(mo8267d());
            }

            /* renamed from: b */
            public C2173aa mo8112o() {
                return C2173aa.m9813a();
            }

            /* renamed from: c */
            public C2173aa mo8141l() {
                C2173aa d = mo8267d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2173aa mo8267d() {
                C2173aa aaVar = new C2173aa((C2386b) this);
                int i = this.f6579a;
                int i2 = 1;
                if ((this.f6579a & 1) == 1) {
                    this.f6580b = Collections.unmodifiableList(this.f6580b);
                    this.f6579a &= -2;
                }
                aaVar.f6543f = this.f6580b;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                aaVar.f6544g = this.f6581c;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                aaVar.f6545h = this.f6582d;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                aaVar.f6546i = this.f6583e;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                aaVar.f6547j = this.f6584f;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                aaVar.f6548k = this.f6585g;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                aaVar.f6549l = this.f6586h;
                if ((i & Allocation.USAGE_SHARED) == 128) {
                    i2 |= 64;
                }
                aaVar.f6550m = this.f6587i;
                if ((i & 256) == 256) {
                    i2 |= Allocation.USAGE_SHARED;
                }
                aaVar.f6551n = this.f6588j;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                aaVar.f6552o = this.f6589k;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                aaVar.f6553p = this.f6590l;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                aaVar.f6554q = this.f6591m;
                if ((i & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 4096) {
                    i2 |= 2048;
                }
                aaVar.f6555r = this.f6592n;
                if ((i & 8192) == 8192) {
                    i2 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                }
                aaVar.f6556s = this.f6593o;
                aaVar.f6542e = i2;
                return aaVar;
            }

            /* renamed from: a */
            public C2181c mo8128a(C2173aa aaVar) {
                if (aaVar == C2173aa.m9813a()) {
                    return this;
                }
                if (!aaVar.f6543f.isEmpty()) {
                    if (this.f6580b.isEmpty()) {
                        this.f6580b = aaVar.f6543f;
                        this.f6579a &= -2;
                    } else {
                        m9928v();
                        this.f6580b.addAll(aaVar.f6543f);
                    }
                }
                if (aaVar.mo8215f()) {
                    mo8258a(aaVar.mo8216g());
                }
                if (aaVar.mo8217j()) {
                    mo8259b(aaVar.mo8218k());
                }
                if (aaVar.mo8219l()) {
                    mo8260b(aaVar.mo8220p());
                }
                if (aaVar.mo8221q()) {
                    mo8262c(aaVar.mo8222r());
                }
                if (aaVar.mo8223s()) {
                    mo8265d(aaVar.mo8224t());
                }
                if (aaVar.mo8225u()) {
                    mo8269e(aaVar.mo8226v());
                }
                if (aaVar.mo8227w()) {
                    mo8270f(aaVar.mo8228x());
                }
                if (aaVar.mo8229y()) {
                    mo8272g(aaVar.mo8230z());
                }
                if (aaVar.mo8199A()) {
                    mo8263c(aaVar.mo8200B());
                }
                if (aaVar.mo8201C()) {
                    mo8274h(aaVar.mo8202D());
                }
                if (aaVar.mo8203E()) {
                    mo8266d(aaVar.mo8204F());
                }
                if (aaVar.mo8205G()) {
                    mo8275i(aaVar.mo8206H());
                }
                if (aaVar.mo8207I()) {
                    mo8276j(aaVar.mo8208J());
                }
                mo9200a(aaVar);
                mo9198a(mo9199x().mo9075a(aaVar.f6541d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                for (int i = 0; i < mo8268e(); i++) {
                    if (!mo8254a(i).mo8106h()) {
                        return false;
                    }
                }
                if (mo8271f() && !mo8273g().mo8106h()) {
                    return false;
                }
                if (mo8277m() && !mo8278n().mo8106h()) {
                    return false;
                }
                if ((!mo8279p() || mo8280q().mo8106h()) && mo9201y()) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public C2181c mo8132c(C2374e eVar, C2378g gVar) {
                C2173aa aaVar;
                C2173aa aaVar2 = null;
                try {
                    C2173aa aaVar3 = (C2173aa) C2173aa.f6539a.mo8114b(eVar, gVar);
                    if (aaVar3 != null) {
                        mo8128a(aaVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    aaVar = (C2173aa) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aaVar2 = aaVar;
                }
                if (aaVar2 != null) {
                    mo8128a(aaVar2);
                }
                throw th;
            }

            /* renamed from: v */
            private void m9928v() {
                if ((this.f6579a & 1) != 1) {
                    this.f6580b = new ArrayList(this.f6580b);
                    this.f6579a |= 1;
                }
            }

            /* renamed from: e */
            public int mo8268e() {
                return this.f6580b.size();
            }

            /* renamed from: a */
            public C2175a mo8254a(int i) {
                return (C2175a) this.f6580b.get(i);
            }

            /* renamed from: a */
            public C2181c mo8258a(boolean z) {
                this.f6579a |= 2;
                this.f6581c = z;
                return this;
            }

            /* renamed from: b */
            public C2181c mo8259b(int i) {
                this.f6579a |= 4;
                this.f6582d = i;
                return this;
            }

            /* renamed from: f */
            public boolean mo8271f() {
                return (this.f6579a & 8) == 8;
            }

            /* renamed from: g */
            public C2173aa mo8273g() {
                return this.f6583e;
            }

            /* renamed from: b */
            public C2181c mo8260b(C2173aa aaVar) {
                if ((this.f6579a & 8) != 8 || this.f6583e == C2173aa.m9813a()) {
                    this.f6583e = aaVar;
                } else {
                    this.f6583e = C2173aa.m9812a(this.f6583e).mo8128a(aaVar).mo8267d();
                }
                this.f6579a |= 8;
                return this;
            }

            /* renamed from: c */
            public C2181c mo8262c(int i) {
                this.f6579a |= 16;
                this.f6584f = i;
                return this;
            }

            /* renamed from: d */
            public C2181c mo8265d(int i) {
                this.f6579a |= 32;
                this.f6585g = i;
                return this;
            }

            /* renamed from: e */
            public C2181c mo8269e(int i) {
                this.f6579a |= 64;
                this.f6586h = i;
                return this;
            }

            /* renamed from: f */
            public C2181c mo8270f(int i) {
                this.f6579a |= Allocation.USAGE_SHARED;
                this.f6587i = i;
                return this;
            }

            /* renamed from: g */
            public C2181c mo8272g(int i) {
                this.f6579a |= 256;
                this.f6588j = i;
                return this;
            }

            /* renamed from: m */
            public boolean mo8277m() {
                return (this.f6579a & 512) == 512;
            }

            /* renamed from: n */
            public C2173aa mo8278n() {
                return this.f6589k;
            }

            /* renamed from: c */
            public C2181c mo8263c(C2173aa aaVar) {
                if ((this.f6579a & 512) != 512 || this.f6589k == C2173aa.m9813a()) {
                    this.f6589k = aaVar;
                } else {
                    this.f6589k = C2173aa.m9812a(this.f6589k).mo8128a(aaVar).mo8267d();
                }
                this.f6579a |= 512;
                return this;
            }

            /* renamed from: h */
            public C2181c mo8274h(int i) {
                this.f6579a |= 1024;
                this.f6590l = i;
                return this;
            }

            /* renamed from: p */
            public boolean mo8279p() {
                return (this.f6579a & 2048) == 2048;
            }

            /* renamed from: q */
            public C2173aa mo8280q() {
                return this.f6591m;
            }

            /* renamed from: d */
            public C2181c mo8266d(C2173aa aaVar) {
                if ((this.f6579a & 2048) != 2048 || this.f6591m == C2173aa.m9813a()) {
                    this.f6591m = aaVar;
                } else {
                    this.f6591m = C2173aa.m9812a(this.f6591m).mo8128a(aaVar).mo8267d();
                }
                this.f6579a |= 2048;
                return this;
            }

            /* renamed from: i */
            public C2181c mo8275i(int i) {
                this.f6579a |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                this.f6592n = i;
                return this;
            }

            /* renamed from: j */
            public C2181c mo8276j(int i) {
                this.f6579a |= 8192;
                this.f6593o = i;
                return this;
            }
        }

        private C2173aa(C2386b<C2173aa, ?> bVar) {
            super(bVar);
            this.f6557t = -1;
            this.f6558u = -1;
            this.f6541d = bVar.mo9199x();
        }

        private C2173aa(boolean z) {
            this.f6557t = -1;
            this.f6558u = -1;
            this.f6541d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2173aa m9813a() {
            return f6540c;
        }

        /* renamed from: b */
        public C2173aa mo8112o() {
            return f6540c;
        }

        private C2173aa(C2374e eVar, C2378g gVar) {
            this.f6557t = -1;
            this.f6558u = -1;
            m9810S();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    C2181c cVar = null;
                    switch (a2) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.f6542e |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                            this.f6556s = eVar.mo9109f();
                            break;
                        case 18:
                            if (!z2 || !true) {
                                this.f6543f = new ArrayList();
                                z2 |= true;
                            }
                            this.f6543f.add(eVar.mo9096a(C2175a.f6559a, gVar));
                            break;
                        case 24:
                            this.f6542e |= 1;
                            this.f6544g = eVar.mo9112i();
                            break;
                        case 32:
                            this.f6542e |= 2;
                            this.f6545h = eVar.mo9109f();
                            break;
                        case 42:
                            if ((this.f6542e & 4) == 4) {
                                cVar = this.f6546i.mo8110m();
                            }
                            this.f6546i = (C2173aa) eVar.mo9096a(f6539a, gVar);
                            if (cVar != null) {
                                cVar.mo8128a(this.f6546i);
                                this.f6546i = cVar.mo8267d();
                            }
                            this.f6542e |= 4;
                            break;
                        case 48:
                            this.f6542e |= 16;
                            this.f6548k = eVar.mo9109f();
                            break;
                        case 56:
                            this.f6542e |= 32;
                            this.f6549l = eVar.mo9109f();
                            break;
                        case 64:
                            this.f6542e |= 8;
                            this.f6547j = eVar.mo9109f();
                            break;
                        case 72:
                            this.f6542e |= 64;
                            this.f6550m = eVar.mo9109f();
                            break;
                        case 82:
                            if ((this.f6542e & 256) == 256) {
                                cVar = this.f6552o.mo8110m();
                            }
                            this.f6552o = (C2173aa) eVar.mo9096a(f6539a, gVar);
                            if (cVar != null) {
                                cVar.mo8128a(this.f6552o);
                                this.f6552o = cVar.mo8267d();
                            }
                            this.f6542e |= 256;
                            break;
                        case 88:
                            this.f6542e |= 512;
                            this.f6553p = eVar.mo9109f();
                            break;
                        case 96:
                            this.f6542e |= Allocation.USAGE_SHARED;
                            this.f6551n = eVar.mo9109f();
                            break;
                        case 106:
                            if ((this.f6542e & 1024) == 1024) {
                                cVar = this.f6554q.mo8110m();
                            }
                            this.f6554q = (C2173aa) eVar.mo9096a(f6539a, gVar);
                            if (cVar != null) {
                                cVar.mo8128a(this.f6554q);
                                this.f6554q = cVar.mo8267d();
                            }
                            this.f6542e |= 1024;
                            break;
                        case 112:
                            this.f6542e |= 2048;
                            this.f6555r = eVar.mo9109f();
                            break;
                        default:
                            if (mo9197a(eVar, a, gVar, a2)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.f6543f = Collections.unmodifiableList(this.f6543f);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6541d = i.mo9090a();
                        throw th2;
                    }
                    this.f6541d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 && true) {
                this.f6543f = Collections.unmodifiableList(this.f6543f);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6541d = i.mo9090a();
                throw th3;
            }
            this.f6541d = i.mo9090a();
            mo9196O();
        }

        static {
            f6540c.m9810S();
        }

        /* renamed from: c */
        public C2409s<C2173aa> mo8101c() {
            return f6539a;
        }

        /* renamed from: d */
        public List<C2175a> mo8213d() {
            return this.f6543f;
        }

        /* renamed from: e */
        public int mo8214e() {
            return this.f6543f.size();
        }

        /* renamed from: a */
        public C2175a mo8211a(int i) {
            return (C2175a) this.f6543f.get(i);
        }

        /* renamed from: f */
        public boolean mo8215f() {
            return (this.f6542e & 1) == 1;
        }

        /* renamed from: g */
        public boolean mo8216g() {
            return this.f6544g;
        }

        /* renamed from: j */
        public boolean mo8217j() {
            return (this.f6542e & 2) == 2;
        }

        /* renamed from: k */
        public int mo8218k() {
            return this.f6545h;
        }

        /* renamed from: l */
        public boolean mo8219l() {
            return (this.f6542e & 4) == 4;
        }

        /* renamed from: p */
        public C2173aa mo8220p() {
            return this.f6546i;
        }

        /* renamed from: q */
        public boolean mo8221q() {
            return (this.f6542e & 8) == 8;
        }

        /* renamed from: r */
        public int mo8222r() {
            return this.f6547j;
        }

        /* renamed from: s */
        public boolean mo8223s() {
            return (this.f6542e & 16) == 16;
        }

        /* renamed from: t */
        public int mo8224t() {
            return this.f6548k;
        }

        /* renamed from: u */
        public boolean mo8225u() {
            return (this.f6542e & 32) == 32;
        }

        /* renamed from: v */
        public int mo8226v() {
            return this.f6549l;
        }

        /* renamed from: w */
        public boolean mo8227w() {
            return (this.f6542e & 64) == 64;
        }

        /* renamed from: x */
        public int mo8228x() {
            return this.f6550m;
        }

        /* renamed from: y */
        public boolean mo8229y() {
            return (this.f6542e & Allocation.USAGE_SHARED) == 128;
        }

        /* renamed from: z */
        public int mo8230z() {
            return this.f6551n;
        }

        /* renamed from: A */
        public boolean mo8199A() {
            return (this.f6542e & 256) == 256;
        }

        /* renamed from: B */
        public C2173aa mo8200B() {
            return this.f6552o;
        }

        /* renamed from: C */
        public boolean mo8201C() {
            return (this.f6542e & 512) == 512;
        }

        /* renamed from: D */
        public int mo8202D() {
            return this.f6553p;
        }

        /* renamed from: E */
        public boolean mo8203E() {
            return (this.f6542e & 1024) == 1024;
        }

        /* renamed from: F */
        public C2173aa mo8204F() {
            return this.f6554q;
        }

        /* renamed from: G */
        public boolean mo8205G() {
            return (this.f6542e & 2048) == 2048;
        }

        /* renamed from: H */
        public int mo8206H() {
            return this.f6555r;
        }

        /* renamed from: I */
        public boolean mo8207I() {
            return (this.f6542e & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 4096;
        }

        /* renamed from: J */
        public int mo8208J() {
            return this.f6556s;
        }

        /* renamed from: S */
        private void m9810S() {
            this.f6543f = Collections.emptyList();
            this.f6544g = false;
            this.f6545h = 0;
            this.f6546i = m9813a();
            this.f6547j = 0;
            this.f6548k = 0;
            this.f6549l = 0;
            this.f6550m = 0;
            this.f6551n = 0;
            this.f6552o = m9813a();
            this.f6553p = 0;
            this.f6554q = m9813a();
            this.f6555r = 0;
            this.f6556s = 0;
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6557t;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < mo8214e(); i++) {
                if (!mo8211a(i).mo8106h()) {
                    this.f6557t = 0;
                    return false;
                }
            }
            if (mo8219l() && !mo8220p().mo8106h()) {
                this.f6557t = 0;
                return false;
            } else if (mo8199A() && !mo8200B().mo8106h()) {
                this.f6557t = 0;
                return false;
            } else if (mo8203E() && !mo8204F().mo8106h()) {
                this.f6557t = 0;
                return false;
            } else if (!mo9202P()) {
                this.f6557t = 0;
                return false;
            } else {
                this.f6557t = 1;
                return true;
            }
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6542e & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 4096) {
                fVar.mo9137a(1, this.f6556s);
            }
            for (int i = 0; i < this.f6543f.size(); i++) {
                fVar.mo9152b(2, (C2406q) this.f6543f.get(i));
            }
            if ((this.f6542e & 1) == 1) {
                fVar.mo9141a(3, this.f6544g);
            }
            if ((this.f6542e & 2) == 2) {
                fVar.mo9137a(4, this.f6545h);
            }
            if ((this.f6542e & 4) == 4) {
                fVar.mo9152b(5, (C2406q) this.f6546i);
            }
            if ((this.f6542e & 16) == 16) {
                fVar.mo9137a(6, this.f6548k);
            }
            if ((this.f6542e & 32) == 32) {
                fVar.mo9137a(7, this.f6549l);
            }
            if ((this.f6542e & 8) == 8) {
                fVar.mo9137a(8, this.f6547j);
            }
            if ((this.f6542e & 64) == 64) {
                fVar.mo9137a(9, this.f6550m);
            }
            if ((this.f6542e & 256) == 256) {
                fVar.mo9152b(10, (C2406q) this.f6552o);
            }
            if ((this.f6542e & 512) == 512) {
                fVar.mo9137a(11, this.f6553p);
            }
            if ((this.f6542e & Allocation.USAGE_SHARED) == 128) {
                fVar.mo9137a(12, this.f6551n);
            }
            if ((this.f6542e & 1024) == 1024) {
                fVar.mo9152b(13, (C2406q) this.f6554q);
            }
            if ((this.f6542e & 2048) == 2048) {
                fVar.mo9137a(14, this.f6555r);
            }
            Q.mo9209a(200, fVar);
            fVar.mo9159c(this.f6541d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6558u;
            if (i != -1) {
                return i;
            }
            int d = (this.f6542e & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 4096 ? C2376f.m11831d(1, this.f6556s) + 0 : 0;
            for (int i2 = 0; i2 < this.f6543f.size(); i2++) {
                d += C2376f.m11832d(2, (C2406q) this.f6543f.get(i2));
            }
            if ((this.f6542e & 1) == 1) {
                d += C2376f.m11824b(3, this.f6544g);
            }
            if ((this.f6542e & 2) == 2) {
                d += C2376f.m11831d(4, this.f6545h);
            }
            if ((this.f6542e & 4) == 4) {
                d += C2376f.m11832d(5, (C2406q) this.f6546i);
            }
            if ((this.f6542e & 16) == 16) {
                d += C2376f.m11831d(6, this.f6548k);
            }
            if ((this.f6542e & 32) == 32) {
                d += C2376f.m11831d(7, this.f6549l);
            }
            if ((this.f6542e & 8) == 8) {
                d += C2376f.m11831d(8, this.f6547j);
            }
            if ((this.f6542e & 64) == 64) {
                d += C2376f.m11831d(9, this.f6550m);
            }
            if ((this.f6542e & 256) == 256) {
                d += C2376f.m11832d(10, (C2406q) this.f6552o);
            }
            if ((this.f6542e & 512) == 512) {
                d += C2376f.m11831d(11, this.f6553p);
            }
            if ((this.f6542e & Allocation.USAGE_SHARED) == 128) {
                d += C2376f.m11831d(12, this.f6551n);
            }
            if ((this.f6542e & 1024) == 1024) {
                d += C2376f.m11832d(13, (C2406q) this.f6554q);
            }
            if ((this.f6542e & 2048) == 2048) {
                d += C2376f.m11831d(14, this.f6555r);
            }
            int R = d + mo9204R() + this.f6541d.mo9064a();
            this.f6558u = R;
            return R;
        }

        /* renamed from: K */
        public static C2181c m9809K() {
            return C2181c.m9927t();
        }

        /* renamed from: L */
        public C2181c mo8111n() {
            return m9809K();
        }

        /* renamed from: a */
        public static C2181c m9812a(C2173aa aaVar) {
            return m9809K().mo8128a(aaVar);
        }

        /* renamed from: M */
        public C2181c mo8110m() {
            return m9812a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$ab */
    /* compiled from: ProtoBuf */
    public static final class C2182ab extends C2387c<C2182ab> implements C2185ac {

        /* renamed from: a */
        public static C2409s<C2182ab> f6594a = new C2367b<C2182ab>() {
            /* renamed from: a */
            public C2182ab mo8114b(C2374e eVar, C2378g gVar) {
                return new C2182ab(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2182ab f6595c = new C2182ab(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6596d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6597e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6598f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6599g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public List<C2187ae> f6600h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2173aa f6601i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f6602j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C2173aa f6603k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f6604l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public List<C2160a> f6605m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public List<Integer> f6606n;

        /* renamed from: o */
        private byte f6607o;

        /* renamed from: p */
        private int f6608p;

        /* renamed from: b.h.b.a.b.e.a$ab$a */
        /* compiled from: ProtoBuf */
        public static final class C2184a extends C2386b<C2182ab, C2184a> implements C2185ac {

            /* renamed from: a */
            private int f6609a;

            /* renamed from: b */
            private int f6610b = 6;

            /* renamed from: c */
            private int f6611c;

            /* renamed from: d */
            private List<C2187ae> f6612d = Collections.emptyList();

            /* renamed from: e */
            private C2173aa f6613e = C2173aa.m9813a();

            /* renamed from: f */
            private int f6614f;

            /* renamed from: g */
            private C2173aa f6615g = C2173aa.m9813a();

            /* renamed from: h */
            private int f6616h;

            /* renamed from: i */
            private List<C2160a> f6617i = Collections.emptyList();

            /* renamed from: j */
            private List<Integer> f6618j = Collections.emptyList();

            /* renamed from: s */
            private void m10017s() {
            }

            private C2184a() {
                m10017s();
            }

            /* access modifiers changed from: private */
            /* renamed from: t */
            public static C2184a m10018t() {
                return new C2184a();
            }

            /* renamed from: a */
            public C2184a mo8281u() {
                return m10018t().mo8128a(mo8314d());
            }

            /* renamed from: b */
            public C2182ab mo8112o() {
                return C2182ab.m9970a();
            }

            /* renamed from: c */
            public C2182ab mo8141l() {
                C2182ab d = mo8314d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2182ab mo8314d() {
                C2182ab abVar = new C2182ab((C2386b) this);
                int i = this.f6609a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                abVar.f6598f = this.f6610b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                abVar.f6599g = this.f6611c;
                if ((this.f6609a & 4) == 4) {
                    this.f6612d = Collections.unmodifiableList(this.f6612d);
                    this.f6609a &= -5;
                }
                abVar.f6600h = this.f6612d;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                abVar.f6601i = this.f6613e;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                abVar.f6602j = this.f6614f;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                abVar.f6603k = this.f6615g;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                abVar.f6604l = this.f6616h;
                if ((this.f6609a & Allocation.USAGE_SHARED) == 128) {
                    this.f6617i = Collections.unmodifiableList(this.f6617i);
                    this.f6609a &= -129;
                }
                abVar.f6605m = this.f6617i;
                if ((this.f6609a & 256) == 256) {
                    this.f6618j = Collections.unmodifiableList(this.f6618j);
                    this.f6609a &= -257;
                }
                abVar.f6606n = this.f6618j;
                abVar.f6597e = i2;
                return abVar;
            }

            /* renamed from: a */
            public C2184a mo8128a(C2182ab abVar) {
                if (abVar == C2182ab.m9970a()) {
                    return this;
                }
                if (abVar.mo8287d()) {
                    mo8305a(abVar.mo8288e());
                }
                if (abVar.mo8289f()) {
                    mo8309b(abVar.mo8290g());
                }
                if (!abVar.f6600h.isEmpty()) {
                    if (this.f6612d.isEmpty()) {
                        this.f6612d = abVar.f6600h;
                        this.f6609a &= -5;
                    } else {
                        m10019v();
                        this.f6612d.addAll(abVar.f6600h);
                    }
                }
                if (abVar.mo8293l()) {
                    mo8306a(abVar.mo8294p());
                }
                if (abVar.mo8295q()) {
                    mo8313d(abVar.mo8296r());
                }
                if (abVar.mo8297s()) {
                    mo8310b(abVar.mo8298t());
                }
                if (abVar.mo8299u()) {
                    mo8315e(abVar.mo8300v());
                }
                if (!abVar.f6605m.isEmpty()) {
                    if (this.f6617i.isEmpty()) {
                        this.f6617i = abVar.f6605m;
                        this.f6609a &= -129;
                    } else {
                        m10020w();
                        this.f6617i.addAll(abVar.f6605m);
                    }
                }
                if (!abVar.f6606n.isEmpty()) {
                    if (this.f6618j.isEmpty()) {
                        this.f6618j = abVar.f6606n;
                        this.f6609a &= -257;
                    } else {
                        m10021z();
                        this.f6618j.addAll(abVar.f6606n);
                    }
                }
                mo9200a(abVar);
                mo9198a(mo9199x().mo9075a(abVar.f6596d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                if (!mo8316e()) {
                    return false;
                }
                for (int i = 0; i < mo8317f(); i++) {
                    if (!mo8312c(i).mo8106h()) {
                        return false;
                    }
                }
                if (mo8319g() && !mo8320m().mo8106h()) {
                    return false;
                }
                if (mo8321n() && !mo8322p().mo8106h()) {
                    return false;
                }
                for (int i2 = 0; i2 < mo8323q(); i2++) {
                    if (!mo8318f(i2).mo8106h()) {
                        return false;
                    }
                }
                if (!mo9201y()) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            public C2184a mo8132c(C2374e eVar, C2378g gVar) {
                C2182ab abVar;
                C2182ab abVar2 = null;
                try {
                    C2182ab abVar3 = (C2182ab) C2182ab.f6594a.mo8114b(eVar, gVar);
                    if (abVar3 != null) {
                        mo8128a(abVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    abVar = (C2182ab) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    abVar2 = abVar;
                }
                if (abVar2 != null) {
                    mo8128a(abVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2184a mo8305a(int i) {
                this.f6609a |= 1;
                this.f6610b = i;
                return this;
            }

            /* renamed from: e */
            public boolean mo8316e() {
                return (this.f6609a & 2) == 2;
            }

            /* renamed from: b */
            public C2184a mo8309b(int i) {
                this.f6609a |= 2;
                this.f6611c = i;
                return this;
            }

            /* renamed from: v */
            private void m10019v() {
                if ((this.f6609a & 4) != 4) {
                    this.f6612d = new ArrayList(this.f6612d);
                    this.f6609a |= 4;
                }
            }

            /* renamed from: f */
            public int mo8317f() {
                return this.f6612d.size();
            }

            /* renamed from: c */
            public C2187ae mo8312c(int i) {
                return (C2187ae) this.f6612d.get(i);
            }

            /* renamed from: g */
            public boolean mo8319g() {
                return (this.f6609a & 8) == 8;
            }

            /* renamed from: m */
            public C2173aa mo8320m() {
                return this.f6613e;
            }

            /* renamed from: a */
            public C2184a mo8306a(C2173aa aaVar) {
                if ((this.f6609a & 8) != 8 || this.f6613e == C2173aa.m9813a()) {
                    this.f6613e = aaVar;
                } else {
                    this.f6613e = C2173aa.m9812a(this.f6613e).mo8128a(aaVar).mo8267d();
                }
                this.f6609a |= 8;
                return this;
            }

            /* renamed from: d */
            public C2184a mo8313d(int i) {
                this.f6609a |= 16;
                this.f6614f = i;
                return this;
            }

            /* renamed from: n */
            public boolean mo8321n() {
                return (this.f6609a & 32) == 32;
            }

            /* renamed from: p */
            public C2173aa mo8322p() {
                return this.f6615g;
            }

            /* renamed from: b */
            public C2184a mo8310b(C2173aa aaVar) {
                if ((this.f6609a & 32) != 32 || this.f6615g == C2173aa.m9813a()) {
                    this.f6615g = aaVar;
                } else {
                    this.f6615g = C2173aa.m9812a(this.f6615g).mo8128a(aaVar).mo8267d();
                }
                this.f6609a |= 32;
                return this;
            }

            /* renamed from: e */
            public C2184a mo8315e(int i) {
                this.f6609a |= 64;
                this.f6616h = i;
                return this;
            }

            /* renamed from: w */
            private void m10020w() {
                if ((this.f6609a & Allocation.USAGE_SHARED) != 128) {
                    this.f6617i = new ArrayList(this.f6617i);
                    this.f6609a |= Allocation.USAGE_SHARED;
                }
            }

            /* renamed from: q */
            public int mo8323q() {
                return this.f6617i.size();
            }

            /* renamed from: f */
            public C2160a mo8318f(int i) {
                return (C2160a) this.f6617i.get(i);
            }

            /* renamed from: z */
            private void m10021z() {
                if ((this.f6609a & 256) != 256) {
                    this.f6618j = new ArrayList(this.f6618j);
                    this.f6609a |= 256;
                }
            }
        }

        private C2182ab(C2386b<C2182ab, ?> bVar) {
            super(bVar);
            this.f6607o = -1;
            this.f6608p = -1;
            this.f6596d = bVar.mo9199x();
        }

        private C2182ab(boolean z) {
            this.f6607o = -1;
            this.f6608p = -1;
            this.f6596d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2182ab m9970a() {
            return f6595c;
        }

        /* renamed from: b */
        public C2182ab mo8112o() {
            return f6595c;
        }

        private C2182ab(C2374e eVar, C2378g gVar) {
            this.f6607o = -1;
            this.f6608p = -1;
            m9966C();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    C2181c cVar = null;
                    switch (a2) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.f6597e |= 1;
                            this.f6598f = eVar.mo9109f();
                            break;
                        case 16:
                            this.f6597e |= 2;
                            this.f6599g = eVar.mo9109f();
                            break;
                        case 26:
                            if (!(z2 & true)) {
                                this.f6600h = new ArrayList();
                                z2 |= true;
                            }
                            this.f6600h.add(eVar.mo9096a(C2187ae.f6619a, gVar));
                            break;
                        case 34:
                            if ((this.f6597e & 4) == 4) {
                                cVar = this.f6601i.mo8110m();
                            }
                            this.f6601i = (C2173aa) eVar.mo9096a(C2173aa.f6539a, gVar);
                            if (cVar != null) {
                                cVar.mo8128a(this.f6601i);
                                this.f6601i = cVar.mo8267d();
                            }
                            this.f6597e |= 4;
                            break;
                        case 40:
                            this.f6597e |= 8;
                            this.f6602j = eVar.mo9109f();
                            break;
                        case 50:
                            if ((this.f6597e & 16) == 16) {
                                cVar = this.f6603k.mo8110m();
                            }
                            this.f6603k = (C2173aa) eVar.mo9096a(C2173aa.f6539a, gVar);
                            if (cVar != null) {
                                cVar.mo8128a(this.f6603k);
                                this.f6603k = cVar.mo8267d();
                            }
                            this.f6597e |= 16;
                            break;
                        case 56:
                            this.f6597e |= 32;
                            this.f6604l = eVar.mo9109f();
                            break;
                        case 66:
                            if (!(z2 & true)) {
                                this.f6605m = new ArrayList();
                                z2 |= true;
                            }
                            this.f6605m.add(eVar.mo9096a(C2160a.f6474a, gVar));
                            break;
                        case 248:
                            if (!(z2 & true)) {
                                this.f6606n = new ArrayList();
                                z2 |= true;
                            }
                            this.f6606n.add(Integer.valueOf(eVar.mo9109f()));
                            break;
                        case 250:
                            int c = eVar.mo9104c(eVar.mo9122s());
                            if (!(z2 & true) && eVar.mo9127x() > 0) {
                                this.f6606n = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.mo9127x() > 0) {
                                this.f6606n.add(Integer.valueOf(eVar.mo9109f()));
                            }
                            eVar.mo9106d(c);
                            break;
                        default:
                            if (mo9197a(eVar, a, gVar, a2)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f6600h = Collections.unmodifiableList(this.f6600h);
                    }
                    if (z2 & true) {
                        this.f6605m = Collections.unmodifiableList(this.f6605m);
                    }
                    if (z2 & true) {
                        this.f6606n = Collections.unmodifiableList(this.f6606n);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6596d = i.mo9090a();
                        throw th2;
                    }
                    this.f6596d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f6600h = Collections.unmodifiableList(this.f6600h);
            }
            if (z2 & true) {
                this.f6605m = Collections.unmodifiableList(this.f6605m);
            }
            if (z2 & true) {
                this.f6606n = Collections.unmodifiableList(this.f6606n);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6596d = i.mo9090a();
                throw th3;
            }
            this.f6596d = i.mo9090a();
            mo9196O();
        }

        static {
            f6595c.m9966C();
        }

        /* renamed from: c */
        public C2409s<C2182ab> mo8101c() {
            return f6594a;
        }

        /* renamed from: d */
        public boolean mo8287d() {
            return (this.f6597e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8288e() {
            return this.f6598f;
        }

        /* renamed from: f */
        public boolean mo8289f() {
            return (this.f6597e & 2) == 2;
        }

        /* renamed from: g */
        public int mo8290g() {
            return this.f6599g;
        }

        /* renamed from: j */
        public List<C2187ae> mo8291j() {
            return this.f6600h;
        }

        /* renamed from: k */
        public int mo8292k() {
            return this.f6600h.size();
        }

        /* renamed from: a */
        public C2187ae mo8284a(int i) {
            return (C2187ae) this.f6600h.get(i);
        }

        /* renamed from: l */
        public boolean mo8293l() {
            return (this.f6597e & 4) == 4;
        }

        /* renamed from: p */
        public C2173aa mo8294p() {
            return this.f6601i;
        }

        /* renamed from: q */
        public boolean mo8295q() {
            return (this.f6597e & 8) == 8;
        }

        /* renamed from: r */
        public int mo8296r() {
            return this.f6602j;
        }

        /* renamed from: s */
        public boolean mo8297s() {
            return (this.f6597e & 16) == 16;
        }

        /* renamed from: t */
        public C2173aa mo8298t() {
            return this.f6603k;
        }

        /* renamed from: u */
        public boolean mo8299u() {
            return (this.f6597e & 32) == 32;
        }

        /* renamed from: v */
        public int mo8300v() {
            return this.f6604l;
        }

        /* renamed from: w */
        public List<C2160a> mo8301w() {
            return this.f6605m;
        }

        /* renamed from: x */
        public int mo8302x() {
            return this.f6605m.size();
        }

        /* renamed from: b */
        public C2160a mo8285b(int i) {
            return (C2160a) this.f6605m.get(i);
        }

        /* renamed from: y */
        public List<Integer> mo8303y() {
            return this.f6606n;
        }

        /* renamed from: C */
        private void m9966C() {
            this.f6598f = 6;
            this.f6599g = 0;
            this.f6600h = Collections.emptyList();
            this.f6601i = C2173aa.m9813a();
            this.f6602j = 0;
            this.f6603k = C2173aa.m9813a();
            this.f6604l = 0;
            this.f6605m = Collections.emptyList();
            this.f6606n = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6607o;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8289f()) {
                this.f6607o = 0;
                return false;
            }
            for (int i = 0; i < mo8292k(); i++) {
                if (!mo8284a(i).mo8106h()) {
                    this.f6607o = 0;
                    return false;
                }
            }
            if (mo8293l() && !mo8294p().mo8106h()) {
                this.f6607o = 0;
                return false;
            } else if (!mo8297s() || mo8298t().mo8106h()) {
                for (int i2 = 0; i2 < mo8302x(); i2++) {
                    if (!mo8285b(i2).mo8106h()) {
                        this.f6607o = 0;
                        return false;
                    }
                }
                if (!mo9202P()) {
                    this.f6607o = 0;
                    return false;
                }
                this.f6607o = 1;
                return true;
            } else {
                this.f6607o = 0;
                return false;
            }
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6597e & 1) == 1) {
                fVar.mo9137a(1, this.f6598f);
            }
            if ((this.f6597e & 2) == 2) {
                fVar.mo9137a(2, this.f6599g);
            }
            for (int i = 0; i < this.f6600h.size(); i++) {
                fVar.mo9152b(3, (C2406q) this.f6600h.get(i));
            }
            if ((this.f6597e & 4) == 4) {
                fVar.mo9152b(4, (C2406q) this.f6601i);
            }
            if ((this.f6597e & 8) == 8) {
                fVar.mo9137a(5, this.f6602j);
            }
            if ((this.f6597e & 16) == 16) {
                fVar.mo9152b(6, (C2406q) this.f6603k);
            }
            if ((this.f6597e & 32) == 32) {
                fVar.mo9137a(7, this.f6604l);
            }
            for (int i2 = 0; i2 < this.f6605m.size(); i2++) {
                fVar.mo9152b(8, (C2406q) this.f6605m.get(i2));
            }
            for (int i3 = 0; i3 < this.f6606n.size(); i3++) {
                fVar.mo9137a(31, ((Integer) this.f6606n.get(i3)).intValue());
            }
            Q.mo9209a(200, fVar);
            fVar.mo9159c(this.f6596d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6608p;
            if (i != -1) {
                return i;
            }
            int d = (this.f6597e & 1) == 1 ? C2376f.m11831d(1, this.f6598f) + 0 : 0;
            if ((this.f6597e & 2) == 2) {
                d += C2376f.m11831d(2, this.f6599g);
            }
            int i2 = d;
            for (int i3 = 0; i3 < this.f6600h.size(); i3++) {
                i2 += C2376f.m11832d(3, (C2406q) this.f6600h.get(i3));
            }
            if ((this.f6597e & 4) == 4) {
                i2 += C2376f.m11832d(4, (C2406q) this.f6601i);
            }
            if ((this.f6597e & 8) == 8) {
                i2 += C2376f.m11831d(5, this.f6602j);
            }
            if ((this.f6597e & 16) == 16) {
                i2 += C2376f.m11832d(6, (C2406q) this.f6603k);
            }
            if ((this.f6597e & 32) == 32) {
                i2 += C2376f.m11831d(7, this.f6604l);
            }
            for (int i4 = 0; i4 < this.f6605m.size(); i4++) {
                i2 += C2376f.m11832d(8, (C2406q) this.f6605m.get(i4));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f6606n.size(); i6++) {
                i5 += C2376f.m11837h(((Integer) this.f6606n.get(i6)).intValue());
            }
            int size = i2 + i5 + (mo8303y().size() * 2) + mo9204R() + this.f6596d.mo9064a();
            this.f6608p = size;
            return size;
        }

        /* renamed from: a */
        public static C2182ab m9971a(InputStream inputStream, C2378g gVar) {
            return (C2182ab) f6594a.mo9061e(inputStream, gVar);
        }

        /* renamed from: z */
        public static C2184a m9984z() {
            return C2184a.m10018t();
        }

        /* renamed from: A */
        public C2184a mo8111n() {
            return m9984z();
        }

        /* renamed from: a */
        public static C2184a m9969a(C2182ab abVar) {
            return m9984z().mo8128a(abVar);
        }

        /* renamed from: B */
        public C2184a mo8110m() {
            return m9969a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$ac */
    public interface C2185ac extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$ad */
    public interface C2186ad extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$ae */
    /* compiled from: ProtoBuf */
    public static final class C2187ae extends C2387c<C2187ae> implements C2192af {

        /* renamed from: a */
        public static C2409s<C2187ae> f6619a = new C2367b<C2187ae>() {
            /* renamed from: a */
            public C2187ae mo8114b(C2374e eVar, C2378g gVar) {
                return new C2187ae(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2187ae f6620c = new C2187ae(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6621d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6622e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6623f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6624g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f6625h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2190b f6626i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public List<C2173aa> f6627j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public List<Integer> f6628k;

        /* renamed from: l */
        private int f6629l;

        /* renamed from: m */
        private byte f6630m;

        /* renamed from: n */
        private int f6631n;

        /* renamed from: b.h.b.a.b.e.a$ae$a */
        /* compiled from: ProtoBuf */
        public static final class C2189a extends C2386b<C2187ae, C2189a> implements C2192af {

            /* renamed from: a */
            private int f6632a;

            /* renamed from: b */
            private int f6633b;

            /* renamed from: c */
            private int f6634c;

            /* renamed from: d */
            private boolean f6635d;

            /* renamed from: e */
            private C2190b f6636e = C2190b.INV;

            /* renamed from: f */
            private List<C2173aa> f6637f = Collections.emptyList();

            /* renamed from: g */
            private List<Integer> f6638g = Collections.emptyList();

            /* renamed from: n */
            private void m10092n() {
            }

            private C2189a() {
                m10092n();
            }

            /* access modifiers changed from: private */
            /* renamed from: p */
            public static C2189a m10093p() {
                return new C2189a();
            }

            /* renamed from: a */
            public C2189a mo8281u() {
                return m10093p().mo8128a(mo8348d());
            }

            /* renamed from: b */
            public C2187ae mo8112o() {
                return C2187ae.m10056a();
            }

            /* renamed from: c */
            public C2187ae mo8141l() {
                C2187ae d = mo8348d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2187ae mo8348d() {
                C2187ae aeVar = new C2187ae((C2386b) this);
                int i = this.f6632a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                aeVar.f6623f = this.f6633b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                aeVar.f6624g = this.f6634c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                aeVar.f6625h = this.f6635d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                aeVar.f6626i = this.f6636e;
                if ((this.f6632a & 16) == 16) {
                    this.f6637f = Collections.unmodifiableList(this.f6637f);
                    this.f6632a &= -17;
                }
                aeVar.f6627j = this.f6637f;
                if ((this.f6632a & 32) == 32) {
                    this.f6638g = Collections.unmodifiableList(this.f6638g);
                    this.f6632a &= -33;
                }
                aeVar.f6628k = this.f6638g;
                aeVar.f6622e = i2;
                return aeVar;
            }

            /* renamed from: a */
            public C2189a mo8128a(C2187ae aeVar) {
                if (aeVar == C2187ae.m10056a()) {
                    return this;
                }
                if (aeVar.mo8326d()) {
                    mo8340a(aeVar.mo8327e());
                }
                if (aeVar.mo8328f()) {
                    mo8345b(aeVar.mo8329g());
                }
                if (aeVar.mo8330j()) {
                    mo8344a(aeVar.mo8331k());
                }
                if (aeVar.mo8332l()) {
                    mo8341a(aeVar.mo8333p());
                }
                if (!aeVar.f6627j.isEmpty()) {
                    if (this.f6637f.isEmpty()) {
                        this.f6637f = aeVar.f6627j;
                        this.f6632a &= -17;
                    } else {
                        m10094q();
                        this.f6637f.addAll(aeVar.f6627j);
                    }
                }
                if (!aeVar.f6628k.isEmpty()) {
                    if (this.f6638g.isEmpty()) {
                        this.f6638g = aeVar.f6628k;
                        this.f6632a &= -33;
                    } else {
                        m10095r();
                        this.f6638g.addAll(aeVar.f6628k);
                    }
                }
                mo9200a(aeVar);
                mo9198a(mo9199x().mo9075a(aeVar.f6621d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                if (!mo8349e() || !mo8350f()) {
                    return false;
                }
                for (int i = 0; i < mo8351g(); i++) {
                    if (!mo8346c(i).mo8106h()) {
                        return false;
                    }
                }
                if (!mo9201y()) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            public C2189a mo8132c(C2374e eVar, C2378g gVar) {
                C2187ae aeVar;
                C2187ae aeVar2 = null;
                try {
                    C2187ae aeVar3 = (C2187ae) C2187ae.f6619a.mo8114b(eVar, gVar);
                    if (aeVar3 != null) {
                        mo8128a(aeVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    aeVar = (C2187ae) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aeVar2 = aeVar;
                }
                if (aeVar2 != null) {
                    mo8128a(aeVar2);
                }
                throw th;
            }

            /* renamed from: e */
            public boolean mo8349e() {
                return (this.f6632a & 1) == 1;
            }

            /* renamed from: a */
            public C2189a mo8340a(int i) {
                this.f6632a |= 1;
                this.f6633b = i;
                return this;
            }

            /* renamed from: f */
            public boolean mo8350f() {
                return (this.f6632a & 2) == 2;
            }

            /* renamed from: b */
            public C2189a mo8345b(int i) {
                this.f6632a |= 2;
                this.f6634c = i;
                return this;
            }

            /* renamed from: a */
            public C2189a mo8344a(boolean z) {
                this.f6632a |= 4;
                this.f6635d = z;
                return this;
            }

            /* renamed from: a */
            public C2189a mo8341a(C2190b bVar) {
                if (bVar != null) {
                    this.f6632a |= 8;
                    this.f6636e = bVar;
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: q */
            private void m10094q() {
                if ((this.f6632a & 16) != 16) {
                    this.f6637f = new ArrayList(this.f6637f);
                    this.f6632a |= 16;
                }
            }

            /* renamed from: g */
            public int mo8351g() {
                return this.f6637f.size();
            }

            /* renamed from: c */
            public C2173aa mo8346c(int i) {
                return (C2173aa) this.f6637f.get(i);
            }

            /* renamed from: r */
            private void m10095r() {
                if ((this.f6632a & 32) != 32) {
                    this.f6638g = new ArrayList(this.f6638g);
                    this.f6632a |= 32;
                }
            }
        }

        /* renamed from: b.h.b.a.b.e.a$ae$b */
        /* compiled from: ProtoBuf */
        public enum C2190b implements C2393a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);
            

            /* renamed from: d */
            private static C2394b<C2190b> f6642d;

            /* renamed from: e */
            private final int f6644e;

            static {
                f6642d = new C2394b<C2190b>() {
                    /* renamed from: a */
                    public C2190b mo8188b(int i) {
                        return C2190b.m10120a(i);
                    }
                };
            }

            /* renamed from: a */
            public final int mo8186a() {
                return this.f6644e;
            }

            /* renamed from: a */
            public static C2190b m10120a(int i) {
                switch (i) {
                    case 0:
                        return IN;
                    case 1:
                        return OUT;
                    case 2:
                        return INV;
                    default:
                        return null;
                }
            }

            private C2190b(int i, int i2) {
                this.f6644e = i2;
            }
        }

        private C2187ae(C2386b<C2187ae, ?> bVar) {
            super(bVar);
            this.f6629l = -1;
            this.f6630m = -1;
            this.f6631n = -1;
            this.f6621d = bVar.mo9199x();
        }

        private C2187ae(boolean z) {
            this.f6629l = -1;
            this.f6630m = -1;
            this.f6631n = -1;
            this.f6621d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2187ae m10056a() {
            return f6620c;
        }

        /* renamed from: b */
        public C2187ae mo8112o() {
            return f6620c;
        }

        private C2187ae(C2374e eVar, C2378g gVar) {
            this.f6629l = -1;
            this.f6630m = -1;
            this.f6631n = -1;
            m10066w();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 8) {
                            this.f6622e |= 1;
                            this.f6623f = eVar.mo9109f();
                        } else if (a2 == 16) {
                            this.f6622e |= 2;
                            this.f6624g = eVar.mo9109f();
                        } else if (a2 == 24) {
                            this.f6622e |= 4;
                            this.f6625h = eVar.mo9112i();
                        } else if (a2 == 32) {
                            int n = eVar.mo9117n();
                            C2190b a3 = C2190b.m10120a(n);
                            if (a3 == null) {
                                a.mo9171p(a2);
                                a.mo9171p(n);
                            } else {
                                this.f6622e |= 8;
                                this.f6626i = a3;
                            }
                        } else if (a2 == 42) {
                            if (!(z2 & true)) {
                                this.f6627j = new ArrayList();
                                z2 |= true;
                            }
                            this.f6627j.add(eVar.mo9096a(C2173aa.f6539a, gVar));
                        } else if (a2 == 48) {
                            if (!(z2 & true)) {
                                this.f6628k = new ArrayList();
                                z2 |= true;
                            }
                            this.f6628k.add(Integer.valueOf(eVar.mo9109f()));
                        } else if (a2 == 50) {
                            int c = eVar.mo9104c(eVar.mo9122s());
                            if (!(z2 & true) && eVar.mo9127x() > 0) {
                                this.f6628k = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.mo9127x() > 0) {
                                this.f6628k.add(Integer.valueOf(eVar.mo9109f()));
                            }
                            eVar.mo9106d(c);
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f6627j = Collections.unmodifiableList(this.f6627j);
                    }
                    if (z2 & true) {
                        this.f6628k = Collections.unmodifiableList(this.f6628k);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6621d = i.mo9090a();
                        throw th2;
                    }
                    this.f6621d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f6627j = Collections.unmodifiableList(this.f6627j);
            }
            if (z2 & true) {
                this.f6628k = Collections.unmodifiableList(this.f6628k);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6621d = i.mo9090a();
                throw th3;
            }
            this.f6621d = i.mo9090a();
            mo9196O();
        }

        static {
            f6620c.m10066w();
        }

        /* renamed from: c */
        public C2409s<C2187ae> mo8101c() {
            return f6619a;
        }

        /* renamed from: d */
        public boolean mo8326d() {
            return (this.f6622e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8327e() {
            return this.f6623f;
        }

        /* renamed from: f */
        public boolean mo8328f() {
            return (this.f6622e & 2) == 2;
        }

        /* renamed from: g */
        public int mo8329g() {
            return this.f6624g;
        }

        /* renamed from: j */
        public boolean mo8330j() {
            return (this.f6622e & 4) == 4;
        }

        /* renamed from: k */
        public boolean mo8331k() {
            return this.f6625h;
        }

        /* renamed from: l */
        public boolean mo8332l() {
            return (this.f6622e & 8) == 8;
        }

        /* renamed from: p */
        public C2190b mo8333p() {
            return this.f6626i;
        }

        /* renamed from: q */
        public List<C2173aa> mo8334q() {
            return this.f6627j;
        }

        /* renamed from: r */
        public int mo8335r() {
            return this.f6627j.size();
        }

        /* renamed from: a */
        public C2173aa mo8324a(int i) {
            return (C2173aa) this.f6627j.get(i);
        }

        /* renamed from: s */
        public List<Integer> mo8336s() {
            return this.f6628k;
        }

        /* renamed from: w */
        private void m10066w() {
            this.f6623f = 0;
            this.f6624g = 0;
            this.f6625h = false;
            this.f6626i = C2190b.INV;
            this.f6627j = Collections.emptyList();
            this.f6628k = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6630m;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8326d()) {
                this.f6630m = 0;
                return false;
            } else if (!mo8328f()) {
                this.f6630m = 0;
                return false;
            } else {
                for (int i = 0; i < mo8335r(); i++) {
                    if (!mo8324a(i).mo8106h()) {
                        this.f6630m = 0;
                        return false;
                    }
                }
                if (!mo9202P()) {
                    this.f6630m = 0;
                    return false;
                }
                this.f6630m = 1;
                return true;
            }
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6622e & 1) == 1) {
                fVar.mo9137a(1, this.f6623f);
            }
            if ((this.f6622e & 2) == 2) {
                fVar.mo9137a(2, this.f6624g);
            }
            if ((this.f6622e & 4) == 4) {
                fVar.mo9141a(3, this.f6625h);
            }
            if ((this.f6622e & 8) == 8) {
                fVar.mo9156c(4, this.f6626i.mo8186a());
            }
            for (int i = 0; i < this.f6627j.size(); i++) {
                fVar.mo9152b(5, (C2406q) this.f6627j.get(i));
            }
            if (mo8336s().size() > 0) {
                fVar.mo9171p(50);
                fVar.mo9171p(this.f6629l);
            }
            for (int i2 = 0; i2 < this.f6628k.size(); i2++) {
                fVar.mo9150b(((Integer) this.f6628k.get(i2)).intValue());
            }
            Q.mo9209a(AdError.NETWORK_ERROR_CODE, fVar);
            fVar.mo9159c(this.f6621d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6631n;
            if (i != -1) {
                return i;
            }
            int d = (this.f6622e & 1) == 1 ? C2376f.m11831d(1, this.f6623f) + 0 : 0;
            if ((this.f6622e & 2) == 2) {
                d += C2376f.m11831d(2, this.f6624g);
            }
            if ((this.f6622e & 4) == 4) {
                d += C2376f.m11824b(3, this.f6625h);
            }
            if ((this.f6622e & 8) == 8) {
                d += C2376f.m11834e(4, this.f6626i.mo8186a());
            }
            int i2 = d;
            for (int i3 = 0; i3 < this.f6627j.size(); i3++) {
                i2 += C2376f.m11832d(5, (C2406q) this.f6627j.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f6628k.size(); i5++) {
                i4 += C2376f.m11837h(((Integer) this.f6628k.get(i5)).intValue());
            }
            int i6 = i2 + i4;
            if (!mo8336s().isEmpty()) {
                i6 = i6 + 1 + C2376f.m11837h(i4);
            }
            this.f6629l = i4;
            int R = i6 + mo9204R() + this.f6621d.mo9064a();
            this.f6631n = R;
            return R;
        }

        /* renamed from: t */
        public static C2189a m10065t() {
            return C2189a.m10093p();
        }

        /* renamed from: u */
        public C2189a mo8111n() {
            return m10065t();
        }

        /* renamed from: a */
        public static C2189a m10054a(C2187ae aeVar) {
            return m10065t().mo8128a(aeVar);
        }

        /* renamed from: v */
        public C2189a mo8110m() {
            return m10054a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$af */
    public interface C2192af extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$ag */
    /* compiled from: ProtoBuf */
    public static final class C2193ag extends C2383i implements C2196ah {

        /* renamed from: a */
        public static C2409s<C2193ag> f6645a = new C2367b<C2193ag>() {
            /* renamed from: a */
            public C2193ag mo8114b(C2374e eVar, C2378g gVar) {
                return new C2193ag(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2193ag f6646c = new C2193ag(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6647d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6648e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public List<C2173aa> f6649f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6650g;

        /* renamed from: h */
        private byte f6651h;

        /* renamed from: i */
        private int f6652i;

        /* renamed from: b.h.b.a.b.e.a$ag$a */
        /* compiled from: ProtoBuf */
        public static final class C2195a extends C2385a<C2193ag, C2195a> implements C2196ah {

            /* renamed from: a */
            private int f6653a;

            /* renamed from: b */
            private List<C2173aa> f6654b = Collections.emptyList();

            /* renamed from: c */
            private int f6655c = -1;

            /* renamed from: g */
            private void m10151g() {
            }

            private C2195a() {
                m10151g();
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public static C2195a m10152m() {
                return new C2195a();
            }

            /* renamed from: a */
            public C2195a mo8140k() {
                return m10152m().mo8128a(mo8369d());
            }

            /* renamed from: b */
            public C2193ag mo8112o() {
                return C2193ag.m10126a();
            }

            /* renamed from: c */
            public C2193ag mo8141l() {
                C2193ag d = mo8369d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2193ag mo8369d() {
                C2193ag agVar = new C2193ag((C2385a) this);
                int i = this.f6653a;
                int i2 = 1;
                if ((this.f6653a & 1) == 1) {
                    this.f6654b = Collections.unmodifiableList(this.f6654b);
                    this.f6653a &= -2;
                }
                agVar.f6649f = this.f6654b;
                if ((i & 2) != 2) {
                    i2 = 0;
                }
                agVar.f6650g = this.f6655c;
                agVar.f6648e = i2;
                return agVar;
            }

            /* renamed from: a */
            public C2195a mo8128a(C2193ag agVar) {
                if (agVar == C2193ag.m10126a()) {
                    return this;
                }
                if (!agVar.f6649f.isEmpty()) {
                    if (this.f6654b.isEmpty()) {
                        this.f6654b = agVar.f6649f;
                        this.f6653a &= -2;
                    } else {
                        m10153n();
                        this.f6654b.addAll(agVar.f6649f);
                    }
                }
                if (agVar.mo8357f()) {
                    mo8366b(agVar.mo8358g());
                }
                mo9198a(mo9199x().mo9075a(agVar.f6647d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                for (int i = 0; i < mo8370e(); i++) {
                    if (!mo8362a(i).mo8106h()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: a */
            public C2195a mo8132c(C2374e eVar, C2378g gVar) {
                C2193ag agVar;
                C2193ag agVar2 = null;
                try {
                    C2193ag agVar3 = (C2193ag) C2193ag.f6645a.mo8114b(eVar, gVar);
                    if (agVar3 != null) {
                        mo8128a(agVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    agVar = (C2193ag) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    agVar2 = agVar;
                }
                if (agVar2 != null) {
                    mo8128a(agVar2);
                }
                throw th;
            }

            /* renamed from: n */
            private void m10153n() {
                if ((this.f6653a & 1) != 1) {
                    this.f6654b = new ArrayList(this.f6654b);
                    this.f6653a |= 1;
                }
            }

            /* renamed from: e */
            public int mo8370e() {
                return this.f6654b.size();
            }

            /* renamed from: a */
            public C2173aa mo8362a(int i) {
                return (C2173aa) this.f6654b.get(i);
            }

            /* renamed from: b */
            public C2195a mo8366b(int i) {
                this.f6653a |= 2;
                this.f6655c = i;
                return this;
            }
        }

        private C2193ag(C2385a aVar) {
            super(aVar);
            this.f6651h = -1;
            this.f6652i = -1;
            this.f6647d = aVar.mo9199x();
        }

        private C2193ag(boolean z) {
            this.f6651h = -1;
            this.f6652i = -1;
            this.f6647d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2193ag m10126a() {
            return f6646c;
        }

        /* renamed from: b */
        public C2193ag mo8112o() {
            return f6646c;
        }

        private C2193ag(C2374e eVar, C2378g gVar) {
            this.f6651h = -1;
            this.f6652i = -1;
            m10132p();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 10) {
                            if (!z2 || !true) {
                                this.f6649f = new ArrayList();
                                z2 |= true;
                            }
                            this.f6649f.add(eVar.mo9096a(C2173aa.f6539a, gVar));
                        } else if (a2 == 16) {
                            this.f6648e |= 1;
                            this.f6650g = eVar.mo9109f();
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.f6649f = Collections.unmodifiableList(this.f6649f);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6647d = i.mo9090a();
                        throw th2;
                    }
                    this.f6647d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 && true) {
                this.f6649f = Collections.unmodifiableList(this.f6649f);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6647d = i.mo9090a();
                throw th3;
            }
            this.f6647d = i.mo9090a();
            mo9196O();
        }

        static {
            f6646c.m10132p();
        }

        /* renamed from: c */
        public C2409s<C2193ag> mo8101c() {
            return f6645a;
        }

        /* renamed from: d */
        public List<C2173aa> mo8355d() {
            return this.f6649f;
        }

        /* renamed from: e */
        public int mo8356e() {
            return this.f6649f.size();
        }

        /* renamed from: a */
        public C2173aa mo8353a(int i) {
            return (C2173aa) this.f6649f.get(i);
        }

        /* renamed from: f */
        public boolean mo8357f() {
            return (this.f6648e & 1) == 1;
        }

        /* renamed from: g */
        public int mo8358g() {
            return this.f6650g;
        }

        /* renamed from: p */
        private void m10132p() {
            this.f6649f = Collections.emptyList();
            this.f6650g = -1;
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6651h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < mo8356e(); i++) {
                if (!mo8353a(i).mo8106h()) {
                    this.f6651h = 0;
                    return false;
                }
            }
            this.f6651h = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            for (int i = 0; i < this.f6649f.size(); i++) {
                fVar.mo9152b(1, (C2406q) this.f6649f.get(i));
            }
            if ((this.f6648e & 1) == 1) {
                fVar.mo9137a(2, this.f6650g);
            }
            fVar.mo9159c(this.f6647d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6652i;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f6649f.size(); i3++) {
                i2 += C2376f.m11832d(1, (C2406q) this.f6649f.get(i3));
            }
            if ((this.f6648e & 1) == 1) {
                i2 += C2376f.m11831d(2, this.f6650g);
            }
            int a = i2 + this.f6647d.mo9064a();
            this.f6652i = a;
            return a;
        }

        /* renamed from: j */
        public static C2195a m10131j() {
            return C2195a.m10152m();
        }

        /* renamed from: k */
        public C2195a mo8111n() {
            return m10131j();
        }

        /* renamed from: a */
        public static C2195a m10125a(C2193ag agVar) {
            return m10131j().mo8128a(agVar);
        }

        /* renamed from: l */
        public C2195a mo8110m() {
            return m10125a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$ah */
    public interface C2196ah extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.a$ai */
    /* compiled from: ProtoBuf */
    public static final class C2197ai extends C2387c<C2197ai> implements C2200aj {

        /* renamed from: a */
        public static C2409s<C2197ai> f6656a = new C2367b<C2197ai>() {
            /* renamed from: a */
            public C2197ai mo8114b(C2374e eVar, C2378g gVar) {
                return new C2197ai(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2197ai f6657c = new C2197ai(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6658d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6659e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6660f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6661g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2173aa f6662h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f6663i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C2173aa f6664j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f6665k;

        /* renamed from: l */
        private byte f6666l;

        /* renamed from: m */
        private int f6667m;

        /* renamed from: b.h.b.a.b.e.a$ai$a */
        /* compiled from: ProtoBuf */
        public static final class C2199a extends C2386b<C2197ai, C2199a> implements C2200aj {

            /* renamed from: a */
            private int f6668a;

            /* renamed from: b */
            private int f6669b;

            /* renamed from: c */
            private int f6670c;

            /* renamed from: d */
            private C2173aa f6671d = C2173aa.m9813a();

            /* renamed from: e */
            private int f6672e;

            /* renamed from: f */
            private C2173aa f6673f = C2173aa.m9813a();

            /* renamed from: g */
            private int f6674g;

            /* renamed from: q */
            private void m10209q() {
            }

            private C2199a() {
                m10209q();
            }

            /* access modifiers changed from: private */
            /* renamed from: r */
            public static C2199a m10210r() {
                return new C2199a();
            }

            /* renamed from: a */
            public C2199a mo8281u() {
                return m10210r().mo8128a(mo8396d());
            }

            /* renamed from: b */
            public C2197ai mo8112o() {
                return C2197ai.m10175a();
            }

            /* renamed from: c */
            public C2197ai mo8141l() {
                C2197ai d = mo8396d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2197ai mo8396d() {
                C2197ai aiVar = new C2197ai((C2386b) this);
                int i = this.f6668a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                aiVar.f6660f = this.f6669b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                aiVar.f6661g = this.f6670c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                aiVar.f6662h = this.f6671d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                aiVar.f6663i = this.f6672e;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                aiVar.f6664j = this.f6673f;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                aiVar.f6665k = this.f6674g;
                aiVar.f6659e = i2;
                return aiVar;
            }

            /* renamed from: a */
            public C2199a mo8128a(C2197ai aiVar) {
                if (aiVar == C2197ai.m10175a()) {
                    return this;
                }
                if (aiVar.mo8372d()) {
                    mo8387a(aiVar.mo8373e());
                }
                if (aiVar.mo8374f()) {
                    mo8391b(aiVar.mo8375g());
                }
                if (aiVar.mo8376j()) {
                    mo8388a(aiVar.mo8377k());
                }
                if (aiVar.mo8378l()) {
                    mo8393c(aiVar.mo8379p());
                }
                if (aiVar.mo8380q()) {
                    mo8392b(aiVar.mo8381r());
                }
                if (aiVar.mo8382s()) {
                    mo8395d(aiVar.mo8383t());
                }
                mo9200a(aiVar);
                mo9198a(mo9199x().mo9075a(aiVar.f6658d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                if (!mo8397e()) {
                    return false;
                }
                if (mo8398f() && !mo8399g().mo8106h()) {
                    return false;
                }
                if ((!mo8400m() || mo8401n().mo8106h()) && mo9201y()) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public C2199a mo8132c(C2374e eVar, C2378g gVar) {
                C2197ai aiVar;
                C2197ai aiVar2 = null;
                try {
                    C2197ai aiVar3 = (C2197ai) C2197ai.f6656a.mo8114b(eVar, gVar);
                    if (aiVar3 != null) {
                        mo8128a(aiVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    aiVar = (C2197ai) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    aiVar2 = aiVar;
                }
                if (aiVar2 != null) {
                    mo8128a(aiVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2199a mo8387a(int i) {
                this.f6668a |= 1;
                this.f6669b = i;
                return this;
            }

            /* renamed from: e */
            public boolean mo8397e() {
                return (this.f6668a & 2) == 2;
            }

            /* renamed from: b */
            public C2199a mo8391b(int i) {
                this.f6668a |= 2;
                this.f6670c = i;
                return this;
            }

            /* renamed from: f */
            public boolean mo8398f() {
                return (this.f6668a & 4) == 4;
            }

            /* renamed from: g */
            public C2173aa mo8399g() {
                return this.f6671d;
            }

            /* renamed from: a */
            public C2199a mo8388a(C2173aa aaVar) {
                if ((this.f6668a & 4) != 4 || this.f6671d == C2173aa.m9813a()) {
                    this.f6671d = aaVar;
                } else {
                    this.f6671d = C2173aa.m9812a(this.f6671d).mo8128a(aaVar).mo8267d();
                }
                this.f6668a |= 4;
                return this;
            }

            /* renamed from: c */
            public C2199a mo8393c(int i) {
                this.f6668a |= 8;
                this.f6672e = i;
                return this;
            }

            /* renamed from: m */
            public boolean mo8400m() {
                return (this.f6668a & 16) == 16;
            }

            /* renamed from: n */
            public C2173aa mo8401n() {
                return this.f6673f;
            }

            /* renamed from: b */
            public C2199a mo8392b(C2173aa aaVar) {
                if ((this.f6668a & 16) != 16 || this.f6673f == C2173aa.m9813a()) {
                    this.f6673f = aaVar;
                } else {
                    this.f6673f = C2173aa.m9812a(this.f6673f).mo8128a(aaVar).mo8267d();
                }
                this.f6668a |= 16;
                return this;
            }

            /* renamed from: d */
            public C2199a mo8395d(int i) {
                this.f6668a |= 32;
                this.f6674g = i;
                return this;
            }
        }

        private C2197ai(C2386b<C2197ai, ?> bVar) {
            super(bVar);
            this.f6666l = -1;
            this.f6667m = -1;
            this.f6658d = bVar.mo9199x();
        }

        private C2197ai(boolean z) {
            this.f6666l = -1;
            this.f6667m = -1;
            this.f6658d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2197ai m10175a() {
            return f6657c;
        }

        /* renamed from: b */
        public C2197ai mo8112o() {
            return f6657c;
        }

        private C2197ai(C2374e eVar, C2378g gVar) {
            this.f6666l = -1;
            this.f6667m = -1;
            m10183x();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 8) {
                            this.f6659e |= 1;
                            this.f6660f = eVar.mo9109f();
                        } else if (a2 != 16) {
                            C2181c cVar = null;
                            if (a2 == 26) {
                                if ((this.f6659e & 4) == 4) {
                                    cVar = this.f6662h.mo8110m();
                                }
                                this.f6662h = (C2173aa) eVar.mo9096a(C2173aa.f6539a, gVar);
                                if (cVar != null) {
                                    cVar.mo8128a(this.f6662h);
                                    this.f6662h = cVar.mo8267d();
                                }
                                this.f6659e |= 4;
                            } else if (a2 == 34) {
                                if ((this.f6659e & 16) == 16) {
                                    cVar = this.f6664j.mo8110m();
                                }
                                this.f6664j = (C2173aa) eVar.mo9096a(C2173aa.f6539a, gVar);
                                if (cVar != null) {
                                    cVar.mo8128a(this.f6664j);
                                    this.f6664j = cVar.mo8267d();
                                }
                                this.f6659e |= 16;
                            } else if (a2 == 40) {
                                this.f6659e |= 8;
                                this.f6663i = eVar.mo9109f();
                            } else if (a2 == 48) {
                                this.f6659e |= 32;
                                this.f6665k = eVar.mo9109f();
                            } else if (!mo9197a(eVar, a, gVar, a2)) {
                            }
                        } else {
                            this.f6659e |= 2;
                            this.f6661g = eVar.mo9109f();
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6658d = i.mo9090a();
                        throw th2;
                    }
                    this.f6658d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6658d = i.mo9090a();
                throw th3;
            }
            this.f6658d = i.mo9090a();
            mo9196O();
        }

        static {
            f6657c.m10183x();
        }

        /* renamed from: c */
        public C2409s<C2197ai> mo8101c() {
            return f6656a;
        }

        /* renamed from: d */
        public boolean mo8372d() {
            return (this.f6659e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8373e() {
            return this.f6660f;
        }

        /* renamed from: f */
        public boolean mo8374f() {
            return (this.f6659e & 2) == 2;
        }

        /* renamed from: g */
        public int mo8375g() {
            return this.f6661g;
        }

        /* renamed from: j */
        public boolean mo8376j() {
            return (this.f6659e & 4) == 4;
        }

        /* renamed from: k */
        public C2173aa mo8377k() {
            return this.f6662h;
        }

        /* renamed from: l */
        public boolean mo8378l() {
            return (this.f6659e & 8) == 8;
        }

        /* renamed from: p */
        public int mo8379p() {
            return this.f6663i;
        }

        /* renamed from: q */
        public boolean mo8380q() {
            return (this.f6659e & 16) == 16;
        }

        /* renamed from: r */
        public C2173aa mo8381r() {
            return this.f6664j;
        }

        /* renamed from: s */
        public boolean mo8382s() {
            return (this.f6659e & 32) == 32;
        }

        /* renamed from: t */
        public int mo8383t() {
            return this.f6665k;
        }

        /* renamed from: x */
        private void m10183x() {
            this.f6660f = 0;
            this.f6661g = 0;
            this.f6662h = C2173aa.m9813a();
            this.f6663i = 0;
            this.f6664j = C2173aa.m9813a();
            this.f6665k = 0;
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6666l;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8374f()) {
                this.f6666l = 0;
                return false;
            } else if (mo8376j() && !mo8377k().mo8106h()) {
                this.f6666l = 0;
                return false;
            } else if (mo8380q() && !mo8381r().mo8106h()) {
                this.f6666l = 0;
                return false;
            } else if (!mo9202P()) {
                this.f6666l = 0;
                return false;
            } else {
                this.f6666l = 1;
                return true;
            }
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6659e & 1) == 1) {
                fVar.mo9137a(1, this.f6660f);
            }
            if ((this.f6659e & 2) == 2) {
                fVar.mo9137a(2, this.f6661g);
            }
            if ((this.f6659e & 4) == 4) {
                fVar.mo9152b(3, (C2406q) this.f6662h);
            }
            if ((this.f6659e & 16) == 16) {
                fVar.mo9152b(4, (C2406q) this.f6664j);
            }
            if ((this.f6659e & 8) == 8) {
                fVar.mo9137a(5, this.f6663i);
            }
            if ((this.f6659e & 32) == 32) {
                fVar.mo9137a(6, this.f6665k);
            }
            Q.mo9209a(200, fVar);
            fVar.mo9159c(this.f6658d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6667m;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f6659e & 1) == 1) {
                i2 = 0 + C2376f.m11831d(1, this.f6660f);
            }
            if ((this.f6659e & 2) == 2) {
                i2 += C2376f.m11831d(2, this.f6661g);
            }
            if ((this.f6659e & 4) == 4) {
                i2 += C2376f.m11832d(3, (C2406q) this.f6662h);
            }
            if ((this.f6659e & 16) == 16) {
                i2 += C2376f.m11832d(4, (C2406q) this.f6664j);
            }
            if ((this.f6659e & 8) == 8) {
                i2 += C2376f.m11831d(5, this.f6663i);
            }
            if ((this.f6659e & 32) == 32) {
                i2 += C2376f.m11831d(6, this.f6665k);
            }
            int R = i2 + mo9204R() + this.f6658d.mo9064a();
            this.f6667m = R;
            return R;
        }

        /* renamed from: u */
        public static C2199a m10182u() {
            return C2199a.m10210r();
        }

        /* renamed from: v */
        public C2199a mo8111n() {
            return m10182u();
        }

        /* renamed from: a */
        public static C2199a m10174a(C2197ai aiVar) {
            return m10182u().mo8128a(aiVar);
        }

        /* renamed from: w */
        public C2199a mo8110m() {
            return m10174a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$aj */
    public interface C2200aj extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$ak */
    /* compiled from: ProtoBuf */
    public static final class C2201ak extends C2383i implements C2208al {

        /* renamed from: a */
        public static C2409s<C2201ak> f6675a = new C2367b<C2201ak>() {
            /* renamed from: a */
            public C2201ak mo8114b(C2374e eVar, C2378g gVar) {
                return new C2201ak(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2201ak f6676c = new C2201ak(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6677d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6678e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6679f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6680g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2204b f6681h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f6682i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f6683j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C2206c f6684k;

        /* renamed from: l */
        private byte f6685l;

        /* renamed from: m */
        private int f6686m;

        /* renamed from: b.h.b.a.b.e.a$ak$a */
        /* compiled from: ProtoBuf */
        public static final class C2203a extends C2385a<C2201ak, C2203a> implements C2208al {

            /* renamed from: a */
            private int f6687a;

            /* renamed from: b */
            private int f6688b;

            /* renamed from: c */
            private int f6689c;

            /* renamed from: d */
            private C2204b f6690d = C2204b.ERROR;

            /* renamed from: e */
            private int f6691e;

            /* renamed from: f */
            private int f6692f;

            /* renamed from: g */
            private C2206c f6693g = C2206c.LANGUAGE_VERSION;

            /* renamed from: f */
            private void m10275f() {
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                return true;
            }

            private C2203a() {
                m10275f();
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static C2203a m10276g() {
                return new C2203a();
            }

            /* renamed from: a */
            public C2203a mo8140k() {
                return m10276g().mo8128a(mo8429d());
            }

            /* renamed from: b */
            public C2201ak mo8112o() {
                return C2201ak.m10242a();
            }

            /* renamed from: c */
            public C2201ak mo8141l() {
                C2201ak d = mo8429d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2201ak mo8429d() {
                C2201ak akVar = new C2201ak((C2385a) this);
                int i = this.f6687a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                akVar.f6679f = this.f6688b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                akVar.f6680g = this.f6689c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                akVar.f6681h = this.f6690d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                akVar.f6682i = this.f6691e;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                akVar.f6683j = this.f6692f;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                akVar.f6684k = this.f6693g;
                akVar.f6678e = i2;
                return akVar;
            }

            /* renamed from: a */
            public C2203a mo8128a(C2201ak akVar) {
                if (akVar == C2201ak.m10242a()) {
                    return this;
                }
                if (akVar.mo8403d()) {
                    mo8419a(akVar.mo8404e());
                }
                if (akVar.mo8405f()) {
                    mo8424b(akVar.mo8406g());
                }
                if (akVar.mo8407j()) {
                    mo8420a(akVar.mo8408k());
                }
                if (akVar.mo8409l()) {
                    mo8426c(akVar.mo8410p());
                }
                if (akVar.mo8411q()) {
                    mo8428d(akVar.mo8412r());
                }
                if (akVar.mo8413s()) {
                    mo8421a(akVar.mo8414t());
                }
                mo9198a(mo9199x().mo9075a(akVar.f6677d));
                return this;
            }

            /* renamed from: a */
            public C2203a mo8132c(C2374e eVar, C2378g gVar) {
                C2201ak akVar;
                C2201ak akVar2 = null;
                try {
                    C2201ak akVar3 = (C2201ak) C2201ak.f6675a.mo8114b(eVar, gVar);
                    if (akVar3 != null) {
                        mo8128a(akVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    akVar = (C2201ak) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    akVar2 = akVar;
                }
                if (akVar2 != null) {
                    mo8128a(akVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2203a mo8419a(int i) {
                this.f6687a |= 1;
                this.f6688b = i;
                return this;
            }

            /* renamed from: b */
            public C2203a mo8424b(int i) {
                this.f6687a |= 2;
                this.f6689c = i;
                return this;
            }

            /* renamed from: a */
            public C2203a mo8420a(C2204b bVar) {
                if (bVar != null) {
                    this.f6687a |= 4;
                    this.f6690d = bVar;
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: c */
            public C2203a mo8426c(int i) {
                this.f6687a |= 8;
                this.f6691e = i;
                return this;
            }

            /* renamed from: d */
            public C2203a mo8428d(int i) {
                this.f6687a |= 16;
                this.f6692f = i;
                return this;
            }

            /* renamed from: a */
            public C2203a mo8421a(C2206c cVar) {
                if (cVar != null) {
                    this.f6687a |= 32;
                    this.f6693g = cVar;
                    return this;
                }
                throw new NullPointerException();
            }
        }

        /* renamed from: b.h.b.a.b.e.a$ak$b */
        /* compiled from: ProtoBuf */
        public enum C2204b implements C2393a {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);
            

            /* renamed from: d */
            private static C2394b<C2204b> f6697d;

            /* renamed from: e */
            private final int f6699e;

            static {
                f6697d = new C2394b<C2204b>() {
                    /* renamed from: a */
                    public C2204b mo8188b(int i) {
                        return C2204b.m10298a(i);
                    }
                };
            }

            /* renamed from: a */
            public final int mo8186a() {
                return this.f6699e;
            }

            /* renamed from: a */
            public static C2204b m10298a(int i) {
                switch (i) {
                    case 0:
                        return WARNING;
                    case 1:
                        return ERROR;
                    case 2:
                        return HIDDEN;
                    default:
                        return null;
                }
            }

            private C2204b(int i, int i2) {
                this.f6699e = i2;
            }
        }

        /* renamed from: b.h.b.a.b.e.a$ak$c */
        /* compiled from: ProtoBuf */
        public enum C2206c implements C2393a {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);
            

            /* renamed from: d */
            private static C2394b<C2206c> f6703d;

            /* renamed from: e */
            private final int f6705e;

            static {
                f6703d = new C2394b<C2206c>() {
                    /* renamed from: a */
                    public C2206c mo8188b(int i) {
                        return C2206c.m10302a(i);
                    }
                };
            }

            /* renamed from: a */
            public final int mo8186a() {
                return this.f6705e;
            }

            /* renamed from: a */
            public static C2206c m10302a(int i) {
                switch (i) {
                    case 0:
                        return LANGUAGE_VERSION;
                    case 1:
                        return COMPILER_VERSION;
                    case 2:
                        return API_VERSION;
                    default:
                        return null;
                }
            }

            private C2206c(int i, int i2) {
                this.f6705e = i2;
            }
        }

        private C2201ak(C2385a aVar) {
            super(aVar);
            this.f6685l = -1;
            this.f6686m = -1;
            this.f6677d = aVar.mo9199x();
        }

        private C2201ak(boolean z) {
            this.f6685l = -1;
            this.f6686m = -1;
            this.f6677d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2201ak m10242a() {
            return f6676c;
        }

        /* renamed from: b */
        public C2201ak mo8112o() {
            return f6676c;
        }

        private C2201ak(C2374e eVar, C2378g gVar) {
            this.f6685l = -1;
            this.f6686m = -1;
            m10249x();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 8) {
                            this.f6678e |= 1;
                            this.f6679f = eVar.mo9109f();
                        } else if (a2 == 16) {
                            this.f6678e |= 2;
                            this.f6680g = eVar.mo9109f();
                        } else if (a2 == 24) {
                            int n = eVar.mo9117n();
                            C2204b a3 = C2204b.m10298a(n);
                            if (a3 == null) {
                                a.mo9171p(a2);
                                a.mo9171p(n);
                            } else {
                                this.f6678e |= 4;
                                this.f6681h = a3;
                            }
                        } else if (a2 == 32) {
                            this.f6678e |= 8;
                            this.f6682i = eVar.mo9109f();
                        } else if (a2 == 40) {
                            this.f6678e |= 16;
                            this.f6683j = eVar.mo9109f();
                        } else if (a2 == 48) {
                            int n2 = eVar.mo9117n();
                            C2206c a4 = C2206c.m10302a(n2);
                            if (a4 == null) {
                                a.mo9171p(a2);
                                a.mo9171p(n2);
                            } else {
                                this.f6678e |= 32;
                                this.f6684k = a4;
                            }
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6677d = i.mo9090a();
                        throw th2;
                    }
                    this.f6677d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6677d = i.mo9090a();
                throw th3;
            }
            this.f6677d = i.mo9090a();
            mo9196O();
        }

        static {
            f6676c.m10249x();
        }

        /* renamed from: c */
        public C2409s<C2201ak> mo8101c() {
            return f6675a;
        }

        /* renamed from: d */
        public boolean mo8403d() {
            return (this.f6678e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8404e() {
            return this.f6679f;
        }

        /* renamed from: f */
        public boolean mo8405f() {
            return (this.f6678e & 2) == 2;
        }

        /* renamed from: g */
        public int mo8406g() {
            return this.f6680g;
        }

        /* renamed from: j */
        public boolean mo8407j() {
            return (this.f6678e & 4) == 4;
        }

        /* renamed from: k */
        public C2204b mo8408k() {
            return this.f6681h;
        }

        /* renamed from: l */
        public boolean mo8409l() {
            return (this.f6678e & 8) == 8;
        }

        /* renamed from: p */
        public int mo8410p() {
            return this.f6682i;
        }

        /* renamed from: q */
        public boolean mo8411q() {
            return (this.f6678e & 16) == 16;
        }

        /* renamed from: r */
        public int mo8412r() {
            return this.f6683j;
        }

        /* renamed from: s */
        public boolean mo8413s() {
            return (this.f6678e & 32) == 32;
        }

        /* renamed from: t */
        public C2206c mo8414t() {
            return this.f6684k;
        }

        /* renamed from: x */
        private void m10249x() {
            this.f6679f = 0;
            this.f6680g = 0;
            this.f6681h = C2204b.ERROR;
            this.f6682i = 0;
            this.f6683j = 0;
            this.f6684k = C2206c.LANGUAGE_VERSION;
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6685l;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f6685l = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            if ((this.f6678e & 1) == 1) {
                fVar.mo9137a(1, this.f6679f);
            }
            if ((this.f6678e & 2) == 2) {
                fVar.mo9137a(2, this.f6680g);
            }
            if ((this.f6678e & 4) == 4) {
                fVar.mo9156c(3, this.f6681h.mo8186a());
            }
            if ((this.f6678e & 8) == 8) {
                fVar.mo9137a(4, this.f6682i);
            }
            if ((this.f6678e & 16) == 16) {
                fVar.mo9137a(5, this.f6683j);
            }
            if ((this.f6678e & 32) == 32) {
                fVar.mo9156c(6, this.f6684k.mo8186a());
            }
            fVar.mo9159c(this.f6677d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6686m;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f6678e & 1) == 1) {
                i2 = 0 + C2376f.m11831d(1, this.f6679f);
            }
            if ((this.f6678e & 2) == 2) {
                i2 += C2376f.m11831d(2, this.f6680g);
            }
            if ((this.f6678e & 4) == 4) {
                i2 += C2376f.m11834e(3, this.f6681h.mo8186a());
            }
            if ((this.f6678e & 8) == 8) {
                i2 += C2376f.m11831d(4, this.f6682i);
            }
            if ((this.f6678e & 16) == 16) {
                i2 += C2376f.m11831d(5, this.f6683j);
            }
            if ((this.f6678e & 32) == 32) {
                i2 += C2376f.m11834e(6, this.f6684k.mo8186a());
            }
            int a = i2 + this.f6677d.mo9064a();
            this.f6686m = a;
            return a;
        }

        /* renamed from: u */
        public static C2203a m10248u() {
            return C2203a.m10276g();
        }

        /* renamed from: v */
        public C2203a mo8111n() {
            return m10248u();
        }

        /* renamed from: a */
        public static C2203a m10239a(C2201ak akVar) {
            return m10248u().mo8128a(akVar);
        }

        /* renamed from: w */
        public C2203a mo8110m() {
            return m10239a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$al */
    public interface C2208al extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.a$am */
    /* compiled from: ProtoBuf */
    public static final class C2209am extends C2383i implements C2212an {

        /* renamed from: a */
        public static C2409s<C2209am> f6706a = new C2367b<C2209am>() {
            /* renamed from: a */
            public C2209am mo8114b(C2374e eVar, C2378g gVar) {
                return new C2209am(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2209am f6707c = new C2209am(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6708d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public List<C2201ak> f6709e;

        /* renamed from: f */
        private byte f6710f;

        /* renamed from: g */
        private int f6711g;

        /* renamed from: b.h.b.a.b.e.a$am$a */
        /* compiled from: ProtoBuf */
        public static final class C2211a extends C2385a<C2209am, C2211a> implements C2212an {

            /* renamed from: a */
            private int f6712a;

            /* renamed from: b */
            private List<C2201ak> f6713b = Collections.emptyList();

            /* renamed from: f */
            private void m10328f() {
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                return true;
            }

            private C2211a() {
                m10328f();
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static C2211a m10329g() {
                return new C2211a();
            }

            /* renamed from: a */
            public C2211a mo8140k() {
                return m10329g().mo8128a(mo8443d());
            }

            /* renamed from: b */
            public C2209am mo8112o() {
                return C2209am.m10307a();
            }

            /* renamed from: c */
            public C2209am mo8141l() {
                C2209am d = mo8443d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2209am mo8443d() {
                C2209am amVar = new C2209am((C2385a) this);
                int i = this.f6712a;
                if ((this.f6712a & 1) == 1) {
                    this.f6713b = Collections.unmodifiableList(this.f6713b);
                    this.f6712a &= -2;
                }
                amVar.f6709e = this.f6713b;
                return amVar;
            }

            /* renamed from: a */
            public C2211a mo8128a(C2209am amVar) {
                if (amVar == C2209am.m10307a()) {
                    return this;
                }
                if (!amVar.f6709e.isEmpty()) {
                    if (this.f6713b.isEmpty()) {
                        this.f6713b = amVar.f6709e;
                        this.f6712a &= -2;
                    } else {
                        m10330m();
                        this.f6713b.addAll(amVar.f6709e);
                    }
                }
                mo9198a(mo9199x().mo9075a(amVar.f6708d));
                return this;
            }

            /* renamed from: a */
            public C2211a mo8132c(C2374e eVar, C2378g gVar) {
                C2209am amVar;
                C2209am amVar2 = null;
                try {
                    C2209am amVar3 = (C2209am) C2209am.f6706a.mo8114b(eVar, gVar);
                    if (amVar3 != null) {
                        mo8128a(amVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    amVar = (C2209am) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    amVar2 = amVar;
                }
                if (amVar2 != null) {
                    mo8128a(amVar2);
                }
                throw th;
            }

            /* renamed from: m */
            private void m10330m() {
                if ((this.f6712a & 1) != 1) {
                    this.f6713b = new ArrayList(this.f6713b);
                    this.f6712a |= 1;
                }
            }
        }

        private C2209am(C2385a aVar) {
            super(aVar);
            this.f6710f = -1;
            this.f6711g = -1;
            this.f6708d = aVar.mo9199x();
        }

        private C2209am(boolean z) {
            this.f6710f = -1;
            this.f6711g = -1;
            this.f6708d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2209am m10307a() {
            return f6707c;
        }

        /* renamed from: b */
        public C2209am mo8112o() {
            return f6707c;
        }

        private C2209am(C2374e eVar, C2378g gVar) {
            this.f6710f = -1;
            this.f6711g = -1;
            m10312k();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 10) {
                            if (!z2 || !true) {
                                this.f6709e = new ArrayList();
                                z2 |= true;
                            }
                            this.f6709e.add(eVar.mo9096a(C2201ak.f6675a, gVar));
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.f6709e = Collections.unmodifiableList(this.f6709e);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6708d = i.mo9090a();
                        throw th2;
                    }
                    this.f6708d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 && true) {
                this.f6709e = Collections.unmodifiableList(this.f6709e);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6708d = i.mo9090a();
                throw th3;
            }
            this.f6708d = i.mo9090a();
            mo9196O();
        }

        static {
            f6707c.m10312k();
        }

        /* renamed from: c */
        public C2409s<C2209am> mo8101c() {
            return f6706a;
        }

        /* renamed from: d */
        public List<C2201ak> mo8433d() {
            return this.f6709e;
        }

        /* renamed from: e */
        public int mo8434e() {
            return this.f6709e.size();
        }

        /* renamed from: k */
        private void m10312k() {
            this.f6709e = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6710f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f6710f = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            for (int i = 0; i < this.f6709e.size(); i++) {
                fVar.mo9152b(1, (C2406q) this.f6709e.get(i));
            }
            fVar.mo9159c(this.f6708d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6711g;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f6709e.size(); i3++) {
                i2 += C2376f.m11832d(1, (C2406q) this.f6709e.get(i3));
            }
            int a = i2 + this.f6708d.mo9064a();
            this.f6711g = a;
            return a;
        }

        /* renamed from: f */
        public static C2211a m10311f() {
            return C2211a.m10329g();
        }

        /* renamed from: g */
        public C2211a mo8111n() {
            return m10311f();
        }

        /* renamed from: a */
        public static C2211a m10306a(C2209am amVar) {
            return m10311f().mo8128a(amVar);
        }

        /* renamed from: j */
        public C2211a mo8110m() {
            return m10306a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$an */
    public interface C2212an extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.a$ao */
    /* compiled from: ProtoBuf */
    public enum C2213ao implements C2393a {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);
        

        /* renamed from: g */
        private static C2394b<C2213ao> f6720g;

        /* renamed from: h */
        private final int f6722h;

        static {
            f6720g = new C2394b<C2213ao>() {
                /* renamed from: a */
                public C2213ao mo8188b(int i) {
                    return C2213ao.m10346a(i);
                }
            };
        }

        /* renamed from: a */
        public final int mo8186a() {
            return this.f6722h;
        }

        /* renamed from: a */
        public static C2213ao m10346a(int i) {
            switch (i) {
                case 0:
                    return INTERNAL;
                case 1:
                    return PRIVATE;
                case 2:
                    return PROTECTED;
                case 3:
                    return PUBLIC;
                case 4:
                    return PRIVATE_TO_THIS;
                case 5:
                    return LOCAL;
                default:
                    return null;
            }
        }

        private C2213ao(int i, int i2) {
            this.f6722h = i2;
        }
    }

    /* renamed from: b.h.b.a.b.e.a$b */
    public interface C2215b extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.a$c */
    /* compiled from: ProtoBuf */
    public static final class C2216c extends C2387c<C2216c> implements C2221d {

        /* renamed from: a */
        public static C2409s<C2216c> f6723a = new C2367b<C2216c>() {
            /* renamed from: a */
            public C2216c mo8114b(C2374e eVar, C2378g gVar) {
                return new C2216c(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2216c f6724c = new C2216c(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6725d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6726e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6727f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6728g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f6729h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public List<C2187ae> f6730i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public List<C2173aa> f6731j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public List<Integer> f6732k;

        /* renamed from: l */
        private int f6733l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public List<Integer> f6734m;

        /* renamed from: n */
        private int f6735n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public List<C2222e> f6736o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public List<C2248o> f6737p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public List<C2260u> f6738q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public List<C2182ab> f6739r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public List<C2238k> f6740s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public List<Integer> f6741t;

        /* renamed from: u */
        private int f6742u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public C2193ag f6743v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public List<Integer> f6744w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public C2209am f6745x;

        /* renamed from: y */
        private byte f6746y;

        /* renamed from: z */
        private int f6747z;

        /* renamed from: b.h.b.a.b.e.a$c$a */
        /* compiled from: ProtoBuf */
        public static final class C2218a extends C2386b<C2216c, C2218a> implements C2221d {

            /* renamed from: a */
            private int f6748a;

            /* renamed from: b */
            private int f6749b = 6;

            /* renamed from: c */
            private int f6750c;

            /* renamed from: d */
            private int f6751d;

            /* renamed from: e */
            private List<C2187ae> f6752e = Collections.emptyList();

            /* renamed from: f */
            private List<C2173aa> f6753f = Collections.emptyList();

            /* renamed from: g */
            private List<Integer> f6754g = Collections.emptyList();

            /* renamed from: h */
            private List<Integer> f6755h = Collections.emptyList();

            /* renamed from: i */
            private List<C2222e> f6756i = Collections.emptyList();

            /* renamed from: j */
            private List<C2248o> f6757j = Collections.emptyList();

            /* renamed from: k */
            private List<C2260u> f6758k = Collections.emptyList();

            /* renamed from: l */
            private List<C2182ab> f6759l = Collections.emptyList();

            /* renamed from: m */
            private List<C2238k> f6760m = Collections.emptyList();

            /* renamed from: n */
            private List<Integer> f6761n = Collections.emptyList();

            /* renamed from: o */
            private C2193ag f6762o = C2193ag.m10126a();

            /* renamed from: p */
            private List<Integer> f6763p = Collections.emptyList();

            /* renamed from: q */
            private C2209am f6764q = C2209am.m10307a();

            /* renamed from: w */
            private void m10443w() {
            }

            private C2218a() {
                m10443w();
            }

            /* access modifiers changed from: private */
            /* renamed from: z */
            public static C2218a m10444z() {
                return new C2218a();
            }

            /* renamed from: a */
            public C2218a mo8281u() {
                return m10444z().mo8128a(mo8493d());
            }

            /* renamed from: b */
            public C2216c mo8112o() {
                return C2216c.m10356a();
            }

            /* renamed from: c */
            public C2216c mo8141l() {
                C2216c d = mo8493d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2216c mo8493d() {
                C2216c cVar = new C2216c((C2386b) this);
                int i = this.f6748a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                cVar.f6727f = this.f6749b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.f6728g = this.f6750c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.f6729h = this.f6751d;
                if ((this.f6748a & 8) == 8) {
                    this.f6752e = Collections.unmodifiableList(this.f6752e);
                    this.f6748a &= -9;
                }
                cVar.f6730i = this.f6752e;
                if ((this.f6748a & 16) == 16) {
                    this.f6753f = Collections.unmodifiableList(this.f6753f);
                    this.f6748a &= -17;
                }
                cVar.f6731j = this.f6753f;
                if ((this.f6748a & 32) == 32) {
                    this.f6754g = Collections.unmodifiableList(this.f6754g);
                    this.f6748a &= -33;
                }
                cVar.f6732k = this.f6754g;
                if ((this.f6748a & 64) == 64) {
                    this.f6755h = Collections.unmodifiableList(this.f6755h);
                    this.f6748a &= -65;
                }
                cVar.f6734m = this.f6755h;
                if ((this.f6748a & Allocation.USAGE_SHARED) == 128) {
                    this.f6756i = Collections.unmodifiableList(this.f6756i);
                    this.f6748a &= -129;
                }
                cVar.f6736o = this.f6756i;
                if ((this.f6748a & 256) == 256) {
                    this.f6757j = Collections.unmodifiableList(this.f6757j);
                    this.f6748a &= -257;
                }
                cVar.f6737p = this.f6757j;
                if ((this.f6748a & 512) == 512) {
                    this.f6758k = Collections.unmodifiableList(this.f6758k);
                    this.f6748a &= -513;
                }
                cVar.f6738q = this.f6758k;
                if ((this.f6748a & 1024) == 1024) {
                    this.f6759l = Collections.unmodifiableList(this.f6759l);
                    this.f6748a &= -1025;
                }
                cVar.f6739r = this.f6759l;
                if ((this.f6748a & 2048) == 2048) {
                    this.f6760m = Collections.unmodifiableList(this.f6760m);
                    this.f6748a &= -2049;
                }
                cVar.f6740s = this.f6760m;
                if ((this.f6748a & CodedOutputStream.DEFAULT_BUFFER_SIZE) == 4096) {
                    this.f6761n = Collections.unmodifiableList(this.f6761n);
                    this.f6748a &= -4097;
                }
                cVar.f6741t = this.f6761n;
                if ((i & 8192) == 8192) {
                    i2 |= 8;
                }
                cVar.f6743v = this.f6762o;
                if ((this.f6748a & 16384) == 16384) {
                    this.f6763p = Collections.unmodifiableList(this.f6763p);
                    this.f6748a &= -16385;
                }
                cVar.f6744w = this.f6763p;
                if ((i & 32768) == 32768) {
                    i2 |= 16;
                }
                cVar.f6745x = this.f6764q;
                cVar.f6726e = i2;
                return cVar;
            }

            /* renamed from: a */
            public C2218a mo8128a(C2216c cVar) {
                if (cVar == C2216c.m10356a()) {
                    return this;
                }
                if (cVar.mo8462d()) {
                    mo8484a(cVar.mo8463e());
                }
                if (cVar.mo8466f()) {
                    mo8489b(cVar.mo8467g());
                }
                if (cVar.mo8469j()) {
                    mo8490c(cVar.mo8470k());
                }
                if (!cVar.f6730i.isEmpty()) {
                    if (this.f6752e.isEmpty()) {
                        this.f6752e = cVar.f6730i;
                        this.f6748a &= -9;
                    } else {
                        m10431A();
                        this.f6752e.addAll(cVar.f6730i);
                    }
                }
                if (!cVar.f6731j.isEmpty()) {
                    if (this.f6753f.isEmpty()) {
                        this.f6753f = cVar.f6731j;
                        this.f6748a &= -17;
                    } else {
                        m10432B();
                        this.f6753f.addAll(cVar.f6731j);
                    }
                }
                if (!cVar.f6732k.isEmpty()) {
                    if (this.f6754g.isEmpty()) {
                        this.f6754g = cVar.f6732k;
                        this.f6748a &= -33;
                    } else {
                        m10433C();
                        this.f6754g.addAll(cVar.f6732k);
                    }
                }
                if (!cVar.f6734m.isEmpty()) {
                    if (this.f6755h.isEmpty()) {
                        this.f6755h = cVar.f6734m;
                        this.f6748a &= -65;
                    } else {
                        m10434D();
                        this.f6755h.addAll(cVar.f6734m);
                    }
                }
                if (!cVar.f6736o.isEmpty()) {
                    if (this.f6756i.isEmpty()) {
                        this.f6756i = cVar.f6736o;
                        this.f6748a &= -129;
                    } else {
                        m10435E();
                        this.f6756i.addAll(cVar.f6736o);
                    }
                }
                if (!cVar.f6737p.isEmpty()) {
                    if (this.f6757j.isEmpty()) {
                        this.f6757j = cVar.f6737p;
                        this.f6748a &= -257;
                    } else {
                        m10436F();
                        this.f6757j.addAll(cVar.f6737p);
                    }
                }
                if (!cVar.f6738q.isEmpty()) {
                    if (this.f6758k.isEmpty()) {
                        this.f6758k = cVar.f6738q;
                        this.f6748a &= -513;
                    } else {
                        m10437G();
                        this.f6758k.addAll(cVar.f6738q);
                    }
                }
                if (!cVar.f6739r.isEmpty()) {
                    if (this.f6759l.isEmpty()) {
                        this.f6759l = cVar.f6739r;
                        this.f6748a &= -1025;
                    } else {
                        m10438H();
                        this.f6759l.addAll(cVar.f6739r);
                    }
                }
                if (!cVar.f6740s.isEmpty()) {
                    if (this.f6760m.isEmpty()) {
                        this.f6760m = cVar.f6740s;
                        this.f6748a &= -2049;
                    } else {
                        m10439I();
                        this.f6760m.addAll(cVar.f6740s);
                    }
                }
                if (!cVar.f6741t.isEmpty()) {
                    if (this.f6761n.isEmpty()) {
                        this.f6761n = cVar.f6741t;
                        this.f6748a &= -4097;
                    } else {
                        m10440J();
                        this.f6761n.addAll(cVar.f6741t);
                    }
                }
                if (cVar.mo8450F()) {
                    mo8485a(cVar.mo8451G());
                }
                if (!cVar.f6744w.isEmpty()) {
                    if (this.f6763p.isEmpty()) {
                        this.f6763p = cVar.f6744w;
                        this.f6748a &= -16385;
                    } else {
                        m10441K();
                        this.f6763p.addAll(cVar.f6744w);
                    }
                }
                if (cVar.mo8453I()) {
                    mo8486a(cVar.mo8454J());
                }
                mo9200a(cVar);
                mo9198a(mo9199x().mo9075a(cVar.f6725d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                if (!mo8495e()) {
                    return false;
                }
                for (int i = 0; i < mo8496f(); i++) {
                    if (!mo8492d(i).mo8106h()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < mo8498g(); i2++) {
                    if (!mo8494e(i2).mo8106h()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < mo8503m(); i3++) {
                    if (!mo8497f(i3).mo8106h()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < mo8504n(); i4++) {
                    if (!mo8499g(i4).mo8106h()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < mo8505p(); i5++) {
                    if (!mo8500h(i5).mo8106h()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < mo8506q(); i6++) {
                    if (!mo8501i(i6).mo8106h()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < mo8507r(); i7++) {
                    if (!mo8502j(i7).mo8106h()) {
                        return false;
                    }
                }
                if ((!mo8508s() || mo8509t().mo8106h()) && mo9201y()) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public C2218a mo8132c(C2374e eVar, C2378g gVar) {
                C2216c cVar;
                C2216c cVar2 = null;
                try {
                    C2216c cVar3 = (C2216c) C2216c.f6723a.mo8114b(eVar, gVar);
                    if (cVar3 != null) {
                        mo8128a(cVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    cVar = (C2216c) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    mo8128a(cVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2218a mo8484a(int i) {
                this.f6748a |= 1;
                this.f6749b = i;
                return this;
            }

            /* renamed from: e */
            public boolean mo8495e() {
                return (this.f6748a & 2) == 2;
            }

            /* renamed from: b */
            public C2218a mo8489b(int i) {
                this.f6748a |= 2;
                this.f6750c = i;
                return this;
            }

            /* renamed from: c */
            public C2218a mo8490c(int i) {
                this.f6748a |= 4;
                this.f6751d = i;
                return this;
            }

            /* renamed from: A */
            private void m10431A() {
                if ((this.f6748a & 8) != 8) {
                    this.f6752e = new ArrayList(this.f6752e);
                    this.f6748a |= 8;
                }
            }

            /* renamed from: f */
            public int mo8496f() {
                return this.f6752e.size();
            }

            /* renamed from: d */
            public C2187ae mo8492d(int i) {
                return (C2187ae) this.f6752e.get(i);
            }

            /* renamed from: B */
            private void m10432B() {
                if ((this.f6748a & 16) != 16) {
                    this.f6753f = new ArrayList(this.f6753f);
                    this.f6748a |= 16;
                }
            }

            /* renamed from: g */
            public int mo8498g() {
                return this.f6753f.size();
            }

            /* renamed from: e */
            public C2173aa mo8494e(int i) {
                return (C2173aa) this.f6753f.get(i);
            }

            /* renamed from: C */
            private void m10433C() {
                if ((this.f6748a & 32) != 32) {
                    this.f6754g = new ArrayList(this.f6754g);
                    this.f6748a |= 32;
                }
            }

            /* renamed from: D */
            private void m10434D() {
                if ((this.f6748a & 64) != 64) {
                    this.f6755h = new ArrayList(this.f6755h);
                    this.f6748a |= 64;
                }
            }

            /* renamed from: E */
            private void m10435E() {
                if ((this.f6748a & Allocation.USAGE_SHARED) != 128) {
                    this.f6756i = new ArrayList(this.f6756i);
                    this.f6748a |= Allocation.USAGE_SHARED;
                }
            }

            /* renamed from: m */
            public int mo8503m() {
                return this.f6756i.size();
            }

            /* renamed from: f */
            public C2222e mo8497f(int i) {
                return (C2222e) this.f6756i.get(i);
            }

            /* renamed from: F */
            private void m10436F() {
                if ((this.f6748a & 256) != 256) {
                    this.f6757j = new ArrayList(this.f6757j);
                    this.f6748a |= 256;
                }
            }

            /* renamed from: n */
            public int mo8504n() {
                return this.f6757j.size();
            }

            /* renamed from: g */
            public C2248o mo8499g(int i) {
                return (C2248o) this.f6757j.get(i);
            }

            /* renamed from: G */
            private void m10437G() {
                if ((this.f6748a & 512) != 512) {
                    this.f6758k = new ArrayList(this.f6758k);
                    this.f6748a |= 512;
                }
            }

            /* renamed from: p */
            public int mo8505p() {
                return this.f6758k.size();
            }

            /* renamed from: h */
            public C2260u mo8500h(int i) {
                return (C2260u) this.f6758k.get(i);
            }

            /* renamed from: H */
            private void m10438H() {
                if ((this.f6748a & 1024) != 1024) {
                    this.f6759l = new ArrayList(this.f6759l);
                    this.f6748a |= 1024;
                }
            }

            /* renamed from: q */
            public int mo8506q() {
                return this.f6759l.size();
            }

            /* renamed from: i */
            public C2182ab mo8501i(int i) {
                return (C2182ab) this.f6759l.get(i);
            }

            /* renamed from: I */
            private void m10439I() {
                if ((this.f6748a & 2048) != 2048) {
                    this.f6760m = new ArrayList(this.f6760m);
                    this.f6748a |= 2048;
                }
            }

            /* renamed from: r */
            public int mo8507r() {
                return this.f6760m.size();
            }

            /* renamed from: j */
            public C2238k mo8502j(int i) {
                return (C2238k) this.f6760m.get(i);
            }

            /* renamed from: J */
            private void m10440J() {
                if ((this.f6748a & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 4096) {
                    this.f6761n = new ArrayList(this.f6761n);
                    this.f6748a |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                }
            }

            /* renamed from: s */
            public boolean mo8508s() {
                return (this.f6748a & 8192) == 8192;
            }

            /* renamed from: t */
            public C2193ag mo8509t() {
                return this.f6762o;
            }

            /* renamed from: a */
            public C2218a mo8485a(C2193ag agVar) {
                if ((this.f6748a & 8192) != 8192 || this.f6762o == C2193ag.m10126a()) {
                    this.f6762o = agVar;
                } else {
                    this.f6762o = C2193ag.m10125a(this.f6762o).mo8128a(agVar).mo8369d();
                }
                this.f6748a |= 8192;
                return this;
            }

            /* renamed from: K */
            private void m10441K() {
                if ((this.f6748a & 16384) != 16384) {
                    this.f6763p = new ArrayList(this.f6763p);
                    this.f6748a |= 16384;
                }
            }

            /* renamed from: a */
            public C2218a mo8486a(C2209am amVar) {
                if ((this.f6748a & 32768) != 32768 || this.f6764q == C2209am.m10307a()) {
                    this.f6764q = amVar;
                } else {
                    this.f6764q = C2209am.m10306a(this.f6764q).mo8128a(amVar).mo8443d();
                }
                this.f6748a |= 32768;
                return this;
            }
        }

        /* renamed from: b.h.b.a.b.e.a$c$b */
        /* compiled from: ProtoBuf */
        public enum C2219b implements C2393a {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);
            

            /* renamed from: h */
            private static C2394b<C2219b> f6772h;

            /* renamed from: i */
            private final int f6774i;

            static {
                f6772h = new C2394b<C2219b>() {
                    /* renamed from: a */
                    public C2219b mo8188b(int i) {
                        return C2219b.m10483a(i);
                    }
                };
            }

            /* renamed from: a */
            public final int mo8186a() {
                return this.f6774i;
            }

            /* renamed from: a */
            public static C2219b m10483a(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }

            private C2219b(int i, int i2) {
                this.f6774i = i2;
            }
        }

        private C2216c(C2386b<C2216c, ?> bVar) {
            super(bVar);
            this.f6733l = -1;
            this.f6735n = -1;
            this.f6742u = -1;
            this.f6746y = -1;
            this.f6747z = -1;
            this.f6725d = bVar.mo9199x();
        }

        private C2216c(boolean z) {
            this.f6733l = -1;
            this.f6735n = -1;
            this.f6742u = -1;
            this.f6746y = -1;
            this.f6747z = -1;
            this.f6725d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2216c m10356a() {
            return f6724c;
        }

        /* renamed from: b */
        public C2216c mo8112o() {
            return f6724c;
        }

        /* JADX WARNING: type inference failed for: r16v0 */
        /* JADX WARNING: type inference failed for: r16v1 */
        /* JADX WARNING: type inference failed for: r16v2, types: [b.h.b.a.b.e.a$ag$a] */
        /* JADX WARNING: type inference failed for: r16v4 */
        /* JADX WARNING: type inference failed for: r16v5, types: [b.h.b.a.b.e.a$am$a] */
        /* JADX WARNING: type inference failed for: r16v6 */
        /* JADX WARNING: type inference failed for: r16v7 */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c4, code lost:
            r7 = true;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2216c(p073b.p085h.p087b.p088a.p090b.p117g.C2374e r18, p073b.p085h.p087b.p088a.p090b.p117g.C2378g r19) {
            /*
                r17 = this;
                r1 = r17
                r2 = r18
                r3 = r19
                r17.<init>()
                r4 = -1
                r1.f6733l = r4
                r1.f6735n = r4
                r1.f6742u = r4
                r1.f6746y = r4
                r1.f6747z = r4
                r17.m10351S()
                b.h.b.a.b.g.d$b r4 = p073b.p085h.p087b.p088a.p090b.p117g.C2371d.m11743i()
                r5 = 1
                b.h.b.a.b.g.f r6 = p073b.p085h.p087b.p088a.p090b.p117g.C2376f.m11817a(r4, r5)
                r7 = 0
                r8 = 0
            L_0x0022:
                r9 = 2048(0x800, float:2.87E-42)
                r10 = 1024(0x400, float:1.435E-42)
                r14 = 16384(0x4000, float:2.2959E-41)
                r15 = 4096(0x1000, float:5.74E-42)
                r5 = 16
                r13 = 8
                if (r7 != 0) goto L_0x038d
                int r12 = r18.mo9095a()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r16 = 0
                switch(r12) {
                    case 0: goto L_0x02c3;
                    case 8: goto L_0x02b6;
                    case 16: goto L_0x0298;
                    case 18: goto L_0x0263;
                    case 24: goto L_0x0256;
                    case 32: goto L_0x0249;
                    case 42: goto L_0x0230;
                    case 50: goto L_0x0214;
                    case 56: goto L_0x01f6;
                    case 58: goto L_0x01c0;
                    case 66: goto L_0x01a4;
                    case 74: goto L_0x0188;
                    case 82: goto L_0x016c;
                    case 90: goto L_0x0152;
                    case 106: goto L_0x0138;
                    case 128: goto L_0x011c;
                    case 130: goto L_0x00e8;
                    case 242: goto L_0x00bd;
                    case 248: goto L_0x00a1;
                    case 250: goto L_0x006b;
                    case 258: goto L_0x0040;
                    default: goto L_0x0039;
                }     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
            L_0x0039:
                r11 = 1
                boolean r5 = r1.mo9197a(r2, r6, r3, r12)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02c6
            L_0x0040:
                int r12 = r1.f6726e     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r12 = r12 & r5
                if (r12 != r5) goto L_0x004b
                b.h.b.a.b.e.a$am r12 = r1.f6745x     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.e.a$am$a r16 = r12.mo8110m()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
            L_0x004b:
                r12 = r16
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$am> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2209am.f6706a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.e.a$am r11 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2209am) r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6745x = r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r12 == 0) goto L_0x0064
                b.h.b.a.b.e.a$am r11 = r1.f6745x     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r12.mo8128a(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.e.a$am r11 = r12.mo8443d()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6745x = r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
            L_0x0064:
                int r11 = r1.f6726e     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11 = r11 | r5
                r1.f6726e = r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x006b:
                int r11 = r18.mo9122s()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r11 = r2.mo9104c(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r12 = r8 & 16384(0x4000, float:2.2959E-41)
                if (r12 == r14) goto L_0x0086
                int r12 = r18.mo9127x()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r12 <= 0) goto L_0x0086
                java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r12.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6744w = r12     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 16384(0x4000, float:2.2959E-41)
            L_0x0086:
                int r12 = r18.mo9127x()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r12 <= 0) goto L_0x009c
                java.util.List<java.lang.Integer> r12 = r1.f6744w     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r16 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r12.add(r5)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5 = 16
                goto L_0x0086
            L_0x009c:
                r2.mo9106d(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x00a1:
                r5 = r8 & 16384(0x4000, float:2.2959E-41)
                if (r5 == r14) goto L_0x00ae
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6744w = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 16384(0x4000, float:2.2959E-41)
            L_0x00ae:
                java.util.List<java.lang.Integer> r5 = r1.f6744w     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r11 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x00bd:
                int r5 = r1.f6726e     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5 = r5 & r13
                if (r5 != r13) goto L_0x00c8
                b.h.b.a.b.e.a$ag r5 = r1.f6743v     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.e.a$ag$a r16 = r5.mo8110m()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
            L_0x00c8:
                r5 = r16
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ag> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag.f6645a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.e.a$ag r11 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag) r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6743v = r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r5 == 0) goto L_0x00e1
                b.h.b.a.b.e.a$ag r11 = r1.f6743v     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.mo8128a(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.e.a$ag r5 = r5.mo8369d()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6743v = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
            L_0x00e1:
                int r5 = r1.f6726e     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5 = r5 | r13
                r1.f6726e = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x00e8:
                int r5 = r18.mo9122s()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r5 = r2.mo9104c(r5)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11 = r8 & 4096(0x1000, float:5.74E-42)
                if (r11 == r15) goto L_0x0103
                int r11 = r18.mo9127x()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r11 <= 0) goto L_0x0103
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6741t = r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 4096(0x1000, float:5.74E-42)
            L_0x0103:
                int r11 = r18.mo9127x()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r11 <= 0) goto L_0x0117
                java.util.List<java.lang.Integer> r11 = r1.f6741t     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r12 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11.add(r12)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x0103
            L_0x0117:
                r2.mo9106d(r5)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x011c:
                r5 = r8 & 4096(0x1000, float:5.74E-42)
                if (r5 == r15) goto L_0x0129
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6741t = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 4096(0x1000, float:5.74E-42)
            L_0x0129:
                java.util.List<java.lang.Integer> r5 = r1.f6741t     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r11 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0138:
                r5 = r8 & 2048(0x800, float:2.87E-42)
                if (r5 == r9) goto L_0x0145
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6740s = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 2048(0x800, float:2.87E-42)
            L_0x0145:
                java.util.List<b.h.b.a.b.e.a$k> r5 = r1.f6740s     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$k> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2238k.f6823a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0152:
                r5 = r8 & 1024(0x400, float:1.435E-42)
                if (r5 == r10) goto L_0x015f
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6739r = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 1024(0x400, float:1.435E-42)
            L_0x015f:
                java.util.List<b.h.b.a.b.e.a$ab> r5 = r1.f6739r     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ab> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2182ab.f6594a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x016c:
                r5 = r8 & 512(0x200, float:7.175E-43)
                r11 = 512(0x200, float:7.175E-43)
                if (r5 == r11) goto L_0x017b
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6738q = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 512(0x200, float:7.175E-43)
            L_0x017b:
                java.util.List<b.h.b.a.b.e.a$u> r5 = r1.f6738q     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$u> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2260u.f6921a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0188:
                r5 = r8 & 256(0x100, float:3.59E-43)
                r11 = 256(0x100, float:3.59E-43)
                if (r5 == r11) goto L_0x0197
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6737p = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 256(0x100, float:3.59E-43)
            L_0x0197:
                java.util.List<b.h.b.a.b.e.a$o> r5 = r1.f6737p     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$o> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2248o.f6859a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x01a4:
                r5 = r8 & 128(0x80, float:1.794E-43)
                r11 = 128(0x80, float:1.794E-43)
                if (r5 == r11) goto L_0x01b3
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6736o = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 128(0x80, float:1.794E-43)
            L_0x01b3:
                java.util.List<b.h.b.a.b.e.a$e> r5 = r1.f6736o     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$e> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2222e.f6775a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x01c0:
                int r5 = r18.mo9122s()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r5 = r2.mo9104c(r5)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11 = r8 & 64
                r12 = 64
                if (r11 == r12) goto L_0x01dd
                int r11 = r18.mo9127x()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r11 <= 0) goto L_0x01dd
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6734m = r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 64
            L_0x01dd:
                int r11 = r18.mo9127x()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r11 <= 0) goto L_0x01f1
                java.util.List<java.lang.Integer> r11 = r1.f6734m     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r12 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11.add(r12)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x01dd
            L_0x01f1:
                r2.mo9106d(r5)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x01f6:
                r5 = r8 & 64
                r11 = 64
                if (r5 == r11) goto L_0x0205
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6734m = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 64
            L_0x0205:
                java.util.List<java.lang.Integer> r5 = r1.f6734m     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r11 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0214:
                r5 = r8 & 16
                r11 = 16
                if (r5 == r11) goto L_0x0223
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6731j = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 16
            L_0x0223:
                java.util.List<b.h.b.a.b.e.a$aa> r5 = r1.f6731j     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$aa> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa.f6539a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0230:
                r5 = r8 & 8
                if (r5 == r13) goto L_0x023d
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6730i = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 8
            L_0x023d:
                java.util.List<b.h.b.a.b.e.a$ae> r5 = r1.f6730i     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ae> r11 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2187ae.f6619a     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                b.h.b.a.b.g.q r11 = r2.mo9096a(r11, r3)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0249:
                int r5 = r1.f6726e     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5 = r5 | 4
                r1.f6726e = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r5 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6729h = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0256:
                int r5 = r1.f6726e     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5 = r5 | 2
                r1.f6726e = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r5 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6728g = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0263:
                int r5 = r18.mo9122s()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r5 = r2.mo9104c(r5)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11 = r8 & 32
                r12 = 32
                if (r11 == r12) goto L_0x0280
                int r11 = r18.mo9127x()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r11 <= 0) goto L_0x0280
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6732k = r11     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 32
            L_0x0280:
                int r11 = r18.mo9127x()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                if (r11 <= 0) goto L_0x0294
                java.util.List<java.lang.Integer> r11 = r1.f6732k     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r12 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11.add(r12)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x0280
            L_0x0294:
                r2.mo9106d(r5)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02b4
            L_0x0298:
                r5 = r8 & 32
                r11 = 32
                if (r5 == r11) goto L_0x02a7
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.<init>()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6732k = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r8 = r8 | 32
            L_0x02a7:
                java.util.List<java.lang.Integer> r5 = r1.f6732k     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r11 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r5.add(r11)     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
            L_0x02b4:
                r11 = 1
                goto L_0x02c9
            L_0x02b6:
                int r5 = r1.f6726e     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r11 = 1
                r5 = r5 | r11
                r1.f6726e = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                int r5 = r18.mo9109f()     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                r1.f6727f = r5     // Catch:{ k -> 0x02df, IOException -> 0x02cf }
                goto L_0x02c9
            L_0x02c3:
                r11 = 1
            L_0x02c4:
                r7 = 1
                goto L_0x02c9
            L_0x02c6:
                if (r5 != 0) goto L_0x02c9
                goto L_0x02c4
            L_0x02c9:
                r5 = 1
                goto L_0x0022
            L_0x02cc:
                r0 = move-exception
                r2 = r0
                goto L_0x02e6
            L_0x02cf:
                r0 = move-exception
                r2 = r0
                b.h.b.a.b.g.k r3 = new b.h.b.a.b.g.k     // Catch:{ all -> 0x02cc }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x02cc }
                r3.<init>(r2)     // Catch:{ all -> 0x02cc }
                b.h.b.a.b.g.k r2 = r3.mo9219a(r1)     // Catch:{ all -> 0x02cc }
                throw r2     // Catch:{ all -> 0x02cc }
            L_0x02df:
                r0 = move-exception
                r2 = r0
                b.h.b.a.b.g.k r2 = r2.mo9219a(r1)     // Catch:{ all -> 0x02cc }
                throw r2     // Catch:{ all -> 0x02cc }
            L_0x02e6:
                r3 = r8 & 32
                r5 = 32
                if (r3 != r5) goto L_0x02f4
                java.util.List<java.lang.Integer> r3 = r1.f6732k
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6732k = r3
            L_0x02f4:
                r3 = r8 & 8
                if (r3 != r13) goto L_0x0300
                java.util.List<b.h.b.a.b.e.a$ae> r3 = r1.f6730i
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6730i = r3
            L_0x0300:
                r3 = r8 & 16
                r5 = 16
                if (r3 != r5) goto L_0x030e
                java.util.List<b.h.b.a.b.e.a$aa> r3 = r1.f6731j
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6731j = r3
            L_0x030e:
                r3 = r8 & 64
                r5 = 64
                if (r3 != r5) goto L_0x031c
                java.util.List<java.lang.Integer> r3 = r1.f6734m
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6734m = r3
            L_0x031c:
                r3 = r8 & 128(0x80, float:1.794E-43)
                r5 = 128(0x80, float:1.794E-43)
                if (r3 != r5) goto L_0x032a
                java.util.List<b.h.b.a.b.e.a$e> r3 = r1.f6736o
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6736o = r3
            L_0x032a:
                r3 = r8 & 256(0x100, float:3.59E-43)
                r5 = 256(0x100, float:3.59E-43)
                if (r3 != r5) goto L_0x0338
                java.util.List<b.h.b.a.b.e.a$o> r3 = r1.f6737p
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6737p = r3
            L_0x0338:
                r3 = r8 & 512(0x200, float:7.175E-43)
                r5 = 512(0x200, float:7.175E-43)
                if (r3 != r5) goto L_0x0346
                java.util.List<b.h.b.a.b.e.a$u> r3 = r1.f6738q
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6738q = r3
            L_0x0346:
                r3 = r8 & 1024(0x400, float:1.435E-42)
                if (r3 != r10) goto L_0x0352
                java.util.List<b.h.b.a.b.e.a$ab> r3 = r1.f6739r
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6739r = r3
            L_0x0352:
                r3 = r8 & 2048(0x800, float:2.87E-42)
                if (r3 != r9) goto L_0x035e
                java.util.List<b.h.b.a.b.e.a$k> r3 = r1.f6740s
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6740s = r3
            L_0x035e:
                r3 = r8 & 4096(0x1000, float:5.74E-42)
                if (r3 != r15) goto L_0x036a
                java.util.List<java.lang.Integer> r3 = r1.f6741t
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6741t = r3
            L_0x036a:
                r3 = r8 & 16384(0x4000, float:2.2959E-41)
                if (r3 != r14) goto L_0x0376
                java.util.List<java.lang.Integer> r3 = r1.f6744w
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                r1.f6744w = r3
            L_0x0376:
                r6.mo9131a()     // Catch:{ IOException -> 0x0379, all -> 0x0380 }
            L_0x0379:
                b.h.b.a.b.g.d r3 = r4.mo9090a()
                r1.f6725d = r3
                goto L_0x0389
            L_0x0380:
                r0 = move-exception
                r2 = r0
                b.h.b.a.b.g.d r3 = r4.mo9090a()
                r1.f6725d = r3
                throw r2
            L_0x0389:
                r17.mo9196O()
                throw r2
            L_0x038d:
                r2 = r8 & 32
                r3 = 32
                if (r2 != r3) goto L_0x039b
                java.util.List<java.lang.Integer> r2 = r1.f6732k
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6732k = r2
            L_0x039b:
                r2 = r8 & 8
                if (r2 != r13) goto L_0x03a7
                java.util.List<b.h.b.a.b.e.a$ae> r2 = r1.f6730i
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6730i = r2
            L_0x03a7:
                r2 = r8 & 16
                r3 = 16
                if (r2 != r3) goto L_0x03b5
                java.util.List<b.h.b.a.b.e.a$aa> r2 = r1.f6731j
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6731j = r2
            L_0x03b5:
                r2 = r8 & 64
                r3 = 64
                if (r2 != r3) goto L_0x03c3
                java.util.List<java.lang.Integer> r2 = r1.f6734m
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6734m = r2
            L_0x03c3:
                r2 = r8 & 128(0x80, float:1.794E-43)
                r3 = 128(0x80, float:1.794E-43)
                if (r2 != r3) goto L_0x03d1
                java.util.List<b.h.b.a.b.e.a$e> r2 = r1.f6736o
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6736o = r2
            L_0x03d1:
                r2 = r8 & 256(0x100, float:3.59E-43)
                r3 = 256(0x100, float:3.59E-43)
                if (r2 != r3) goto L_0x03df
                java.util.List<b.h.b.a.b.e.a$o> r2 = r1.f6737p
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6737p = r2
            L_0x03df:
                r2 = r8 & 512(0x200, float:7.175E-43)
                r3 = 512(0x200, float:7.175E-43)
                if (r2 != r3) goto L_0x03ed
                java.util.List<b.h.b.a.b.e.a$u> r2 = r1.f6738q
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6738q = r2
            L_0x03ed:
                r2 = r8 & 1024(0x400, float:1.435E-42)
                if (r2 != r10) goto L_0x03f9
                java.util.List<b.h.b.a.b.e.a$ab> r2 = r1.f6739r
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6739r = r2
            L_0x03f9:
                r2 = r8 & 2048(0x800, float:2.87E-42)
                if (r2 != r9) goto L_0x0405
                java.util.List<b.h.b.a.b.e.a$k> r2 = r1.f6740s
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6740s = r2
            L_0x0405:
                r2 = r8 & 4096(0x1000, float:5.74E-42)
                if (r2 != r15) goto L_0x0411
                java.util.List<java.lang.Integer> r2 = r1.f6741t
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6741t = r2
            L_0x0411:
                r2 = r8 & 16384(0x4000, float:2.2959E-41)
                if (r2 != r14) goto L_0x041d
                java.util.List<java.lang.Integer> r2 = r1.f6744w
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f6744w = r2
            L_0x041d:
                r6.mo9131a()     // Catch:{ IOException -> 0x0420, all -> 0x0427 }
            L_0x0420:
                b.h.b.a.b.g.d r2 = r4.mo9090a()
                r1.f6725d = r2
                goto L_0x0430
            L_0x0427:
                r0 = move-exception
                r2 = r0
                b.h.b.a.b.g.d r3 = r4.mo9090a()
                r1.f6725d = r3
                throw r2
            L_0x0430:
                r17.mo9196O()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c.<init>(b.h.b.a.b.g.e, b.h.b.a.b.g.g):void");
        }

        static {
            f6724c.m10351S();
        }

        /* renamed from: c */
        public C2409s<C2216c> mo8101c() {
            return f6723a;
        }

        /* renamed from: d */
        public boolean mo8462d() {
            return (this.f6726e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8463e() {
            return this.f6727f;
        }

        /* renamed from: f */
        public boolean mo8466f() {
            return (this.f6726e & 2) == 2;
        }

        /* renamed from: g */
        public int mo8467g() {
            return this.f6728g;
        }

        /* renamed from: j */
        public boolean mo8469j() {
            return (this.f6726e & 4) == 4;
        }

        /* renamed from: k */
        public int mo8470k() {
            return this.f6729h;
        }

        /* renamed from: l */
        public List<C2187ae> mo8471l() {
            return this.f6730i;
        }

        /* renamed from: p */
        public int mo8472p() {
            return this.f6730i.size();
        }

        /* renamed from: a */
        public C2187ae mo8457a(int i) {
            return (C2187ae) this.f6730i.get(i);
        }

        /* renamed from: q */
        public List<C2173aa> mo8473q() {
            return this.f6731j;
        }

        /* renamed from: r */
        public int mo8474r() {
            return this.f6731j.size();
        }

        /* renamed from: b */
        public C2173aa mo8458b(int i) {
            return (C2173aa) this.f6731j.get(i);
        }

        /* renamed from: s */
        public List<Integer> mo8475s() {
            return this.f6732k;
        }

        /* renamed from: t */
        public List<Integer> mo8476t() {
            return this.f6734m;
        }

        /* renamed from: u */
        public List<C2222e> mo8477u() {
            return this.f6736o;
        }

        /* renamed from: v */
        public int mo8478v() {
            return this.f6736o.size();
        }

        /* renamed from: c */
        public C2222e mo8460c(int i) {
            return (C2222e) this.f6736o.get(i);
        }

        /* renamed from: w */
        public List<C2248o> mo8479w() {
            return this.f6737p;
        }

        /* renamed from: x */
        public int mo8480x() {
            return this.f6737p.size();
        }

        /* renamed from: d */
        public C2248o mo8461d(int i) {
            return (C2248o) this.f6737p.get(i);
        }

        /* renamed from: y */
        public List<C2260u> mo8481y() {
            return this.f6738q;
        }

        /* renamed from: z */
        public int mo8482z() {
            return this.f6738q.size();
        }

        /* renamed from: e */
        public C2260u mo8464e(int i) {
            return (C2260u) this.f6738q.get(i);
        }

        /* renamed from: A */
        public List<C2182ab> mo8445A() {
            return this.f6739r;
        }

        /* renamed from: B */
        public int mo8446B() {
            return this.f6739r.size();
        }

        /* renamed from: f */
        public C2182ab mo8465f(int i) {
            return (C2182ab) this.f6739r.get(i);
        }

        /* renamed from: C */
        public List<C2238k> mo8447C() {
            return this.f6740s;
        }

        /* renamed from: D */
        public int mo8448D() {
            return this.f6740s.size();
        }

        /* renamed from: g */
        public C2238k mo8468g(int i) {
            return (C2238k) this.f6740s.get(i);
        }

        /* renamed from: E */
        public List<Integer> mo8449E() {
            return this.f6741t;
        }

        /* renamed from: F */
        public boolean mo8450F() {
            return (this.f6726e & 8) == 8;
        }

        /* renamed from: G */
        public C2193ag mo8451G() {
            return this.f6743v;
        }

        /* renamed from: H */
        public List<Integer> mo8452H() {
            return this.f6744w;
        }

        /* renamed from: I */
        public boolean mo8453I() {
            return (this.f6726e & 16) == 16;
        }

        /* renamed from: J */
        public C2209am mo8454J() {
            return this.f6745x;
        }

        /* renamed from: S */
        private void m10351S() {
            this.f6727f = 6;
            this.f6728g = 0;
            this.f6729h = 0;
            this.f6730i = Collections.emptyList();
            this.f6731j = Collections.emptyList();
            this.f6732k = Collections.emptyList();
            this.f6734m = Collections.emptyList();
            this.f6736o = Collections.emptyList();
            this.f6737p = Collections.emptyList();
            this.f6738q = Collections.emptyList();
            this.f6739r = Collections.emptyList();
            this.f6740s = Collections.emptyList();
            this.f6741t = Collections.emptyList();
            this.f6743v = C2193ag.m10126a();
            this.f6744w = Collections.emptyList();
            this.f6745x = C2209am.m10307a();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6746y;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8466f()) {
                this.f6746y = 0;
                return false;
            }
            for (int i = 0; i < mo8472p(); i++) {
                if (!mo8457a(i).mo8106h()) {
                    this.f6746y = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo8474r(); i2++) {
                if (!mo8458b(i2).mo8106h()) {
                    this.f6746y = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < mo8478v(); i3++) {
                if (!mo8460c(i3).mo8106h()) {
                    this.f6746y = 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < mo8480x(); i4++) {
                if (!mo8461d(i4).mo8106h()) {
                    this.f6746y = 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < mo8482z(); i5++) {
                if (!mo8464e(i5).mo8106h()) {
                    this.f6746y = 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < mo8446B(); i6++) {
                if (!mo8465f(i6).mo8106h()) {
                    this.f6746y = 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < mo8448D(); i7++) {
                if (!mo8468g(i7).mo8106h()) {
                    this.f6746y = 0;
                    return false;
                }
            }
            if (mo8450F() && !mo8451G().mo8106h()) {
                this.f6746y = 0;
                return false;
            } else if (!mo9202P()) {
                this.f6746y = 0;
                return false;
            } else {
                this.f6746y = 1;
                return true;
            }
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6726e & 1) == 1) {
                fVar.mo9137a(1, this.f6727f);
            }
            if (mo8475s().size() > 0) {
                fVar.mo9171p(18);
                fVar.mo9171p(this.f6733l);
            }
            for (int i = 0; i < this.f6732k.size(); i++) {
                fVar.mo9150b(((Integer) this.f6732k.get(i)).intValue());
            }
            if ((this.f6726e & 2) == 2) {
                fVar.mo9137a(3, this.f6728g);
            }
            if ((this.f6726e & 4) == 4) {
                fVar.mo9137a(4, this.f6729h);
            }
            for (int i2 = 0; i2 < this.f6730i.size(); i2++) {
                fVar.mo9152b(5, (C2406q) this.f6730i.get(i2));
            }
            for (int i3 = 0; i3 < this.f6731j.size(); i3++) {
                fVar.mo9152b(6, (C2406q) this.f6731j.get(i3));
            }
            if (mo8476t().size() > 0) {
                fVar.mo9171p(58);
                fVar.mo9171p(this.f6735n);
            }
            for (int i4 = 0; i4 < this.f6734m.size(); i4++) {
                fVar.mo9150b(((Integer) this.f6734m.get(i4)).intValue());
            }
            for (int i5 = 0; i5 < this.f6736o.size(); i5++) {
                fVar.mo9152b(8, (C2406q) this.f6736o.get(i5));
            }
            for (int i6 = 0; i6 < this.f6737p.size(); i6++) {
                fVar.mo9152b(9, (C2406q) this.f6737p.get(i6));
            }
            for (int i7 = 0; i7 < this.f6738q.size(); i7++) {
                fVar.mo9152b(10, (C2406q) this.f6738q.get(i7));
            }
            for (int i8 = 0; i8 < this.f6739r.size(); i8++) {
                fVar.mo9152b(11, (C2406q) this.f6739r.get(i8));
            }
            for (int i9 = 0; i9 < this.f6740s.size(); i9++) {
                fVar.mo9152b(13, (C2406q) this.f6740s.get(i9));
            }
            if (mo8449E().size() > 0) {
                fVar.mo9171p(130);
                fVar.mo9171p(this.f6742u);
            }
            for (int i10 = 0; i10 < this.f6741t.size(); i10++) {
                fVar.mo9150b(((Integer) this.f6741t.get(i10)).intValue());
            }
            if ((this.f6726e & 8) == 8) {
                fVar.mo9152b(30, (C2406q) this.f6743v);
            }
            for (int i11 = 0; i11 < this.f6744w.size(); i11++) {
                fVar.mo9137a(31, ((Integer) this.f6744w.get(i11)).intValue());
            }
            if ((this.f6726e & 16) == 16) {
                fVar.mo9152b(32, (C2406q) this.f6745x);
            }
            Q.mo9209a(19000, fVar);
            fVar.mo9159c(this.f6725d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6747z;
            if (i != -1) {
                return i;
            }
            int d = (this.f6726e & 1) == 1 ? C2376f.m11831d(1, this.f6727f) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f6732k.size(); i3++) {
                i2 += C2376f.m11837h(((Integer) this.f6732k.get(i3)).intValue());
            }
            int i4 = d + i2;
            if (!mo8475s().isEmpty()) {
                i4 = i4 + 1 + C2376f.m11837h(i2);
            }
            this.f6733l = i2;
            if ((this.f6726e & 2) == 2) {
                i4 += C2376f.m11831d(3, this.f6728g);
            }
            if ((this.f6726e & 4) == 4) {
                i4 += C2376f.m11831d(4, this.f6729h);
            }
            int i5 = i4;
            for (int i6 = 0; i6 < this.f6730i.size(); i6++) {
                i5 += C2376f.m11832d(5, (C2406q) this.f6730i.get(i6));
            }
            for (int i7 = 0; i7 < this.f6731j.size(); i7++) {
                i5 += C2376f.m11832d(6, (C2406q) this.f6731j.get(i7));
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.f6734m.size(); i9++) {
                i8 += C2376f.m11837h(((Integer) this.f6734m.get(i9)).intValue());
            }
            int i10 = i5 + i8;
            if (!mo8476t().isEmpty()) {
                i10 = i10 + 1 + C2376f.m11837h(i8);
            }
            this.f6735n = i8;
            for (int i11 = 0; i11 < this.f6736o.size(); i11++) {
                i10 += C2376f.m11832d(8, (C2406q) this.f6736o.get(i11));
            }
            for (int i12 = 0; i12 < this.f6737p.size(); i12++) {
                i10 += C2376f.m11832d(9, (C2406q) this.f6737p.get(i12));
            }
            for (int i13 = 0; i13 < this.f6738q.size(); i13++) {
                i10 += C2376f.m11832d(10, (C2406q) this.f6738q.get(i13));
            }
            for (int i14 = 0; i14 < this.f6739r.size(); i14++) {
                i10 += C2376f.m11832d(11, (C2406q) this.f6739r.get(i14));
            }
            for (int i15 = 0; i15 < this.f6740s.size(); i15++) {
                i10 += C2376f.m11832d(13, (C2406q) this.f6740s.get(i15));
            }
            int i16 = 0;
            for (int i17 = 0; i17 < this.f6741t.size(); i17++) {
                i16 += C2376f.m11837h(((Integer) this.f6741t.get(i17)).intValue());
            }
            int i18 = i10 + i16;
            if (!mo8449E().isEmpty()) {
                i18 = i18 + 2 + C2376f.m11837h(i16);
            }
            this.f6742u = i16;
            if ((this.f6726e & 8) == 8) {
                i18 += C2376f.m11832d(30, (C2406q) this.f6743v);
            }
            int i19 = 0;
            for (int i20 = 0; i20 < this.f6744w.size(); i20++) {
                i19 += C2376f.m11837h(((Integer) this.f6744w.get(i20)).intValue());
            }
            int size = i18 + i19 + (mo8452H().size() * 2);
            if ((this.f6726e & 16) == 16) {
                size += C2376f.m11832d(32, (C2406q) this.f6745x);
            }
            int R = size + mo9204R() + this.f6725d.mo9064a();
            this.f6747z = R;
            return R;
        }

        /* renamed from: a */
        public static C2216c m10357a(InputStream inputStream, C2378g gVar) {
            return (C2216c) f6723a.mo9062f(inputStream, gVar);
        }

        /* renamed from: K */
        public static C2218a m10350K() {
            return C2218a.m10444z();
        }

        /* renamed from: L */
        public C2218a mo8111n() {
            return m10350K();
        }

        /* renamed from: a */
        public static C2218a m10355a(C2216c cVar) {
            return m10350K().mo8128a(cVar);
        }

        /* renamed from: M */
        public C2218a mo8110m() {
            return m10355a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$d */
    public interface C2221d extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$e */
    /* compiled from: ProtoBuf */
    public static final class C2222e extends C2387c<C2222e> implements C2225f {

        /* renamed from: a */
        public static C2409s<C2222e> f6775a = new C2367b<C2222e>() {
            /* renamed from: a */
            public C2222e mo8114b(C2374e eVar, C2378g gVar) {
                return new C2222e(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2222e f6776c = new C2222e(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6777d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6778e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6779f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public List<C2197ai> f6780g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public List<Integer> f6781h;

        /* renamed from: i */
        private byte f6782i;

        /* renamed from: j */
        private int f6783j;

        /* renamed from: b.h.b.a.b.e.a$e$a */
        /* compiled from: ProtoBuf */
        public static final class C2224a extends C2386b<C2222e, C2224a> implements C2225f {

            /* renamed from: a */
            private int f6784a;

            /* renamed from: b */
            private int f6785b = 6;

            /* renamed from: c */
            private List<C2197ai> f6786c = Collections.emptyList();

            /* renamed from: d */
            private List<Integer> f6787d = Collections.emptyList();

            /* renamed from: g */
            private void m10517g() {
            }

            private C2224a() {
                m10517g();
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public static C2224a m10518m() {
                return new C2224a();
            }

            /* renamed from: a */
            public C2224a mo8281u() {
                return m10518m().mo8128a(mo8526d());
            }

            /* renamed from: b */
            public C2222e mo8112o() {
                return C2222e.m10489a();
            }

            /* renamed from: c */
            public C2222e mo8141l() {
                C2222e d = mo8526d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2222e mo8526d() {
                C2222e eVar = new C2222e((C2386b) this);
                int i = 1;
                if ((this.f6784a & 1) != 1) {
                    i = 0;
                }
                eVar.f6779f = this.f6785b;
                if ((this.f6784a & 2) == 2) {
                    this.f6786c = Collections.unmodifiableList(this.f6786c);
                    this.f6784a &= -3;
                }
                eVar.f6780g = this.f6786c;
                if ((this.f6784a & 4) == 4) {
                    this.f6787d = Collections.unmodifiableList(this.f6787d);
                    this.f6784a &= -5;
                }
                eVar.f6781h = this.f6787d;
                eVar.f6778e = i;
                return eVar;
            }

            /* renamed from: a */
            public C2224a mo8128a(C2222e eVar) {
                if (eVar == C2222e.m10489a()) {
                    return this;
                }
                if (eVar.mo8513d()) {
                    mo8521a(eVar.mo8514e());
                }
                if (!eVar.f6780g.isEmpty()) {
                    if (this.f6786c.isEmpty()) {
                        this.f6786c = eVar.f6780g;
                        this.f6784a &= -3;
                    } else {
                        m10519n();
                        this.f6786c.addAll(eVar.f6780g);
                    }
                }
                if (!eVar.f6781h.isEmpty()) {
                    if (this.f6787d.isEmpty()) {
                        this.f6787d = eVar.f6781h;
                        this.f6784a &= -5;
                    } else {
                        m10520p();
                        this.f6787d.addAll(eVar.f6781h);
                    }
                }
                mo9200a(eVar);
                mo9198a(mo9199x().mo9075a(eVar.f6777d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                for (int i = 0; i < mo8527e(); i++) {
                    if (!mo8524b(i).mo8106h()) {
                        return false;
                    }
                }
                if (!mo9201y()) {
                    return false;
                }
                return true;
            }

            /* renamed from: a */
            public C2224a mo8132c(C2374e eVar, C2378g gVar) {
                C2222e eVar2;
                C2222e eVar3 = null;
                try {
                    C2222e eVar4 = (C2222e) C2222e.f6775a.mo8114b(eVar, gVar);
                    if (eVar4 != null) {
                        mo8128a(eVar4);
                    }
                    return this;
                } catch (C2395k e) {
                    eVar2 = (C2222e) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    eVar3 = eVar2;
                }
                if (eVar3 != null) {
                    mo8128a(eVar3);
                }
                throw th;
            }

            /* renamed from: a */
            public C2224a mo8521a(int i) {
                this.f6784a |= 1;
                this.f6785b = i;
                return this;
            }

            /* renamed from: n */
            private void m10519n() {
                if ((this.f6784a & 2) != 2) {
                    this.f6786c = new ArrayList(this.f6786c);
                    this.f6784a |= 2;
                }
            }

            /* renamed from: e */
            public int mo8527e() {
                return this.f6786c.size();
            }

            /* renamed from: b */
            public C2197ai mo8524b(int i) {
                return (C2197ai) this.f6786c.get(i);
            }

            /* renamed from: p */
            private void m10520p() {
                if ((this.f6784a & 4) != 4) {
                    this.f6787d = new ArrayList(this.f6787d);
                    this.f6784a |= 4;
                }
            }
        }

        private C2222e(C2386b<C2222e, ?> bVar) {
            super(bVar);
            this.f6782i = -1;
            this.f6783j = -1;
            this.f6777d = bVar.mo9199x();
        }

        private C2222e(boolean z) {
            this.f6782i = -1;
            this.f6783j = -1;
            this.f6777d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2222e m10489a() {
            return f6776c;
        }

        /* renamed from: b */
        public C2222e mo8112o() {
            return f6776c;
        }

        private C2222e(C2374e eVar, C2378g gVar) {
            this.f6782i = -1;
            this.f6783j = -1;
            m10497q();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 8) {
                            this.f6778e |= 1;
                            this.f6779f = eVar.mo9109f();
                        } else if (a2 == 18) {
                            if (!(z2 & true)) {
                                this.f6780g = new ArrayList();
                                z2 |= true;
                            }
                            this.f6780g.add(eVar.mo9096a(C2197ai.f6656a, gVar));
                        } else if (a2 == 248) {
                            if (!(z2 & true)) {
                                this.f6781h = new ArrayList();
                                z2 |= true;
                            }
                            this.f6781h.add(Integer.valueOf(eVar.mo9109f()));
                        } else if (a2 == 250) {
                            int c = eVar.mo9104c(eVar.mo9122s());
                            if (!(z2 & true) && eVar.mo9127x() > 0) {
                                this.f6781h = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.mo9127x() > 0) {
                                this.f6781h.add(Integer.valueOf(eVar.mo9109f()));
                            }
                            eVar.mo9106d(c);
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f6780g = Collections.unmodifiableList(this.f6780g);
                    }
                    if (z2 & true) {
                        this.f6781h = Collections.unmodifiableList(this.f6781h);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6777d = i.mo9090a();
                        throw th2;
                    }
                    this.f6777d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f6780g = Collections.unmodifiableList(this.f6780g);
            }
            if (z2 & true) {
                this.f6781h = Collections.unmodifiableList(this.f6781h);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6777d = i.mo9090a();
                throw th3;
            }
            this.f6777d = i.mo9090a();
            mo9196O();
        }

        static {
            f6776c.m10497q();
        }

        /* renamed from: c */
        public C2409s<C2222e> mo8101c() {
            return f6775a;
        }

        /* renamed from: d */
        public boolean mo8513d() {
            return (this.f6778e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8514e() {
            return this.f6779f;
        }

        /* renamed from: f */
        public List<C2197ai> mo8515f() {
            return this.f6780g;
        }

        /* renamed from: g */
        public int mo8516g() {
            return this.f6780g.size();
        }

        /* renamed from: a */
        public C2197ai mo8511a(int i) {
            return (C2197ai) this.f6780g.get(i);
        }

        /* renamed from: j */
        public List<Integer> mo8517j() {
            return this.f6781h;
        }

        /* renamed from: q */
        private void m10497q() {
            this.f6779f = 6;
            this.f6780g = Collections.emptyList();
            this.f6781h = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6782i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < mo8516g(); i++) {
                if (!mo8511a(i).mo8106h()) {
                    this.f6782i = 0;
                    return false;
                }
            }
            if (!mo9202P()) {
                this.f6782i = 0;
                return false;
            }
            this.f6782i = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6778e & 1) == 1) {
                fVar.mo9137a(1, this.f6779f);
            }
            for (int i = 0; i < this.f6780g.size(); i++) {
                fVar.mo9152b(2, (C2406q) this.f6780g.get(i));
            }
            for (int i2 = 0; i2 < this.f6781h.size(); i2++) {
                fVar.mo9137a(31, ((Integer) this.f6781h.get(i2)).intValue());
            }
            Q.mo9209a(19000, fVar);
            fVar.mo9159c(this.f6777d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6783j;
            if (i != -1) {
                return i;
            }
            int d = (this.f6778e & 1) == 1 ? C2376f.m11831d(1, this.f6779f) + 0 : 0;
            for (int i2 = 0; i2 < this.f6780g.size(); i2++) {
                d += C2376f.m11832d(2, (C2406q) this.f6780g.get(i2));
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f6781h.size(); i4++) {
                i3 += C2376f.m11837h(((Integer) this.f6781h.get(i4)).intValue());
            }
            int size = d + i3 + (mo8517j().size() * 2) + mo9204R() + this.f6777d.mo9064a();
            this.f6783j = size;
            return size;
        }

        /* renamed from: k */
        public static C2224a m10496k() {
            return C2224a.m10518m();
        }

        /* renamed from: l */
        public C2224a mo8111n() {
            return m10496k();
        }

        /* renamed from: a */
        public static C2224a m10488a(C2222e eVar) {
            return m10496k().mo8128a(eVar);
        }

        /* renamed from: p */
        public C2224a mo8110m() {
            return m10488a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$f */
    public interface C2225f extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$g */
    /* compiled from: ProtoBuf */
    public static final class C2226g extends C2383i implements C2229h {

        /* renamed from: a */
        public static C2409s<C2226g> f6788a = new C2367b<C2226g>() {
            /* renamed from: a */
            public C2226g mo8114b(C2374e eVar, C2378g gVar) {
                return new C2226g(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2226g f6789c = new C2226g(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6790d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public List<C2230i> f6791e;

        /* renamed from: f */
        private byte f6792f;

        /* renamed from: g */
        private int f6793g;

        /* renamed from: b.h.b.a.b.e.a$g$a */
        /* compiled from: ProtoBuf */
        public static final class C2228a extends C2385a<C2226g, C2228a> implements C2229h {

            /* renamed from: a */
            private int f6794a;

            /* renamed from: b */
            private List<C2230i> f6795b = Collections.emptyList();

            /* renamed from: g */
            private void m10562g() {
            }

            private C2228a() {
                m10562g();
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public static C2228a m10563m() {
                return new C2228a();
            }

            /* renamed from: a */
            public C2228a mo8140k() {
                return m10563m().mo8128a(mo8540d());
            }

            /* renamed from: b */
            public C2226g mo8112o() {
                return C2226g.m10541a();
            }

            /* renamed from: c */
            public C2226g mo8141l() {
                C2226g d = mo8540d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2226g mo8540d() {
                C2226g gVar = new C2226g((C2385a) this);
                int i = this.f6794a;
                if ((this.f6794a & 1) == 1) {
                    this.f6795b = Collections.unmodifiableList(this.f6795b);
                    this.f6794a &= -2;
                }
                gVar.f6791e = this.f6795b;
                return gVar;
            }

            /* renamed from: a */
            public C2228a mo8128a(C2226g gVar) {
                if (gVar == C2226g.m10541a()) {
                    return this;
                }
                if (!gVar.f6791e.isEmpty()) {
                    if (this.f6795b.isEmpty()) {
                        this.f6795b = gVar.f6791e;
                        this.f6794a &= -2;
                    } else {
                        m10564n();
                        this.f6795b.addAll(gVar.f6791e);
                    }
                }
                mo9198a(mo9199x().mo9075a(gVar.f6790d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                for (int i = 0; i < mo8541e(); i++) {
                    if (!mo8537a(i).mo8106h()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: a */
            public C2228a mo8132c(C2374e eVar, C2378g gVar) {
                C2226g gVar2;
                C2226g gVar3 = null;
                try {
                    C2226g gVar4 = (C2226g) C2226g.f6788a.mo8114b(eVar, gVar);
                    if (gVar4 != null) {
                        mo8128a(gVar4);
                    }
                    return this;
                } catch (C2395k e) {
                    gVar2 = (C2226g) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    gVar3 = gVar2;
                }
                if (gVar3 != null) {
                    mo8128a(gVar3);
                }
                throw th;
            }

            /* renamed from: n */
            private void m10564n() {
                if ((this.f6794a & 1) != 1) {
                    this.f6795b = new ArrayList(this.f6795b);
                    this.f6794a |= 1;
                }
            }

            /* renamed from: e */
            public int mo8541e() {
                return this.f6795b.size();
            }

            /* renamed from: a */
            public C2230i mo8537a(int i) {
                return (C2230i) this.f6795b.get(i);
            }
        }

        private C2226g(C2385a aVar) {
            super(aVar);
            this.f6792f = -1;
            this.f6793g = -1;
            this.f6790d = aVar.mo9199x();
        }

        private C2226g(boolean z) {
            this.f6792f = -1;
            this.f6793g = -1;
            this.f6790d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2226g m10541a() {
            return f6789c;
        }

        /* renamed from: b */
        public C2226g mo8112o() {
            return f6789c;
        }

        private C2226g(C2374e eVar, C2378g gVar) {
            this.f6792f = -1;
            this.f6793g = -1;
            m10546j();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 10) {
                            if (!z2 || !true) {
                                this.f6791e = new ArrayList();
                                z2 |= true;
                            }
                            this.f6791e.add(eVar.mo9096a(C2230i.f6796a, gVar));
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.f6791e = Collections.unmodifiableList(this.f6791e);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6790d = i.mo9090a();
                        throw th2;
                    }
                    this.f6790d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 && true) {
                this.f6791e = Collections.unmodifiableList(this.f6791e);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6790d = i.mo9090a();
                throw th3;
            }
            this.f6790d = i.mo9090a();
            mo9196O();
        }

        static {
            f6789c.m10546j();
        }

        /* renamed from: c */
        public C2409s<C2226g> mo8101c() {
            return f6788a;
        }

        /* renamed from: d */
        public int mo8530d() {
            return this.f6791e.size();
        }

        /* renamed from: a */
        public C2230i mo8528a(int i) {
            return (C2230i) this.f6791e.get(i);
        }

        /* renamed from: j */
        private void m10546j() {
            this.f6791e = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6792f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < mo8530d(); i++) {
                if (!mo8528a(i).mo8106h()) {
                    this.f6792f = 0;
                    return false;
                }
            }
            this.f6792f = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            for (int i = 0; i < this.f6791e.size(); i++) {
                fVar.mo9152b(1, (C2406q) this.f6791e.get(i));
            }
            fVar.mo9159c(this.f6790d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6793g;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f6791e.size(); i3++) {
                i2 += C2376f.m11832d(1, (C2406q) this.f6791e.get(i3));
            }
            int a = i2 + this.f6790d.mo9064a();
            this.f6793g = a;
            return a;
        }

        /* renamed from: e */
        public static C2228a m10545e() {
            return C2228a.m10563m();
        }

        /* renamed from: f */
        public C2228a mo8111n() {
            return m10545e();
        }

        /* renamed from: a */
        public static C2228a m10540a(C2226g gVar) {
            return m10545e().mo8128a(gVar);
        }

        /* renamed from: g */
        public C2228a mo8110m() {
            return m10540a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$h */
    public interface C2229h extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.a$i */
    /* compiled from: ProtoBuf */
    public static final class C2230i extends C2383i implements C2237j {

        /* renamed from: a */
        public static C2409s<C2230i> f6796a = new C2367b<C2230i>() {
            /* renamed from: a */
            public C2230i mo8114b(C2374e eVar, C2378g gVar) {
                return new C2230i(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2230i f6797c = new C2230i(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6798d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6799e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2233b f6800f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public List<C2242m> f6801g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2242m f6802h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2235c f6803i;

        /* renamed from: j */
        private byte f6804j;

        /* renamed from: k */
        private int f6805k;

        /* renamed from: b.h.b.a.b.e.a$i$a */
        /* compiled from: ProtoBuf */
        public static final class C2232a extends C2385a<C2230i, C2232a> implements C2237j {

            /* renamed from: a */
            private int f6806a;

            /* renamed from: b */
            private C2233b f6807b = C2233b.RETURNS_CONSTANT;

            /* renamed from: c */
            private List<C2242m> f6808c = Collections.emptyList();

            /* renamed from: d */
            private C2242m f6809d = C2242m.m10692a();

            /* renamed from: e */
            private C2235c f6810e = C2235c.AT_MOST_ONCE;

            /* renamed from: n */
            private void m10614n() {
            }

            private C2232a() {
                m10614n();
            }

            /* access modifiers changed from: private */
            /* renamed from: p */
            public static C2232a m10615p() {
                return new C2232a();
            }

            /* renamed from: a */
            public C2232a mo8140k() {
                return m10615p().mo8128a(mo8563d());
            }

            /* renamed from: b */
            public C2230i mo8112o() {
                return C2230i.m10586a();
            }

            /* renamed from: c */
            public C2230i mo8141l() {
                C2230i d = mo8563d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2230i mo8563d() {
                C2230i iVar = new C2230i((C2385a) this);
                int i = this.f6806a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                iVar.f6800f = this.f6807b;
                if ((this.f6806a & 2) == 2) {
                    this.f6808c = Collections.unmodifiableList(this.f6808c);
                    this.f6806a &= -3;
                }
                iVar.f6801g = this.f6808c;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                iVar.f6802h = this.f6809d;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                iVar.f6803i = this.f6810e;
                iVar.f6799e = i2;
                return iVar;
            }

            /* renamed from: a */
            public C2232a mo8128a(C2230i iVar) {
                if (iVar == C2230i.m10586a()) {
                    return this;
                }
                if (iVar.mo8544d()) {
                    mo8555a(iVar.mo8545e());
                }
                if (!iVar.f6801g.isEmpty()) {
                    if (this.f6808c.isEmpty()) {
                        this.f6808c = iVar.f6801g;
                        this.f6806a &= -3;
                    } else {
                        m10616q();
                        this.f6808c.addAll(iVar.f6801g);
                    }
                }
                if (iVar.mo8547g()) {
                    mo8558a(iVar.mo8548j());
                }
                if (iVar.mo8549k()) {
                    mo8556a(iVar.mo8550l());
                }
                mo9198a(mo9199x().mo9075a(iVar.f6798d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                for (int i = 0; i < mo8564e(); i++) {
                    if (!mo8560a(i).mo8106h()) {
                        return false;
                    }
                }
                if (!mo8565f() || mo8566g().mo8106h()) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public C2232a mo8132c(C2374e eVar, C2378g gVar) {
                C2230i iVar;
                C2230i iVar2 = null;
                try {
                    C2230i iVar3 = (C2230i) C2230i.f6796a.mo8114b(eVar, gVar);
                    if (iVar3 != null) {
                        mo8128a(iVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    iVar = (C2230i) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    iVar2 = iVar;
                }
                if (iVar2 != null) {
                    mo8128a(iVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2232a mo8555a(C2233b bVar) {
                if (bVar != null) {
                    this.f6806a |= 1;
                    this.f6807b = bVar;
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: q */
            private void m10616q() {
                if ((this.f6806a & 2) != 2) {
                    this.f6808c = new ArrayList(this.f6808c);
                    this.f6806a |= 2;
                }
            }

            /* renamed from: e */
            public int mo8564e() {
                return this.f6808c.size();
            }

            /* renamed from: a */
            public C2242m mo8560a(int i) {
                return (C2242m) this.f6808c.get(i);
            }

            /* renamed from: f */
            public boolean mo8565f() {
                return (this.f6806a & 4) == 4;
            }

            /* renamed from: g */
            public C2242m mo8566g() {
                return this.f6809d;
            }

            /* renamed from: a */
            public C2232a mo8558a(C2242m mVar) {
                if ((this.f6806a & 4) != 4 || this.f6809d == C2242m.m10692a()) {
                    this.f6809d = mVar;
                } else {
                    this.f6809d = C2242m.m10690a(this.f6809d).mo8128a(mVar).mo8608d();
                }
                this.f6806a |= 4;
                return this;
            }

            /* renamed from: a */
            public C2232a mo8556a(C2235c cVar) {
                if (cVar != null) {
                    this.f6806a |= 8;
                    this.f6810e = cVar;
                    return this;
                }
                throw new NullPointerException();
            }
        }

        /* renamed from: b.h.b.a.b.e.a$i$b */
        /* compiled from: ProtoBuf */
        public enum C2233b implements C2393a {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);
            

            /* renamed from: d */
            private static C2394b<C2233b> f6814d;

            /* renamed from: e */
            private final int f6816e;

            static {
                f6814d = new C2394b<C2233b>() {
                    /* renamed from: a */
                    public C2233b mo8188b(int i) {
                        return C2233b.m10639a(i);
                    }
                };
            }

            /* renamed from: a */
            public final int mo8186a() {
                return this.f6816e;
            }

            /* renamed from: a */
            public static C2233b m10639a(int i) {
                switch (i) {
                    case 0:
                        return RETURNS_CONSTANT;
                    case 1:
                        return CALLS;
                    case 2:
                        return RETURNS_NOT_NULL;
                    default:
                        return null;
                }
            }

            private C2233b(int i, int i2) {
                this.f6816e = i2;
            }
        }

        /* renamed from: b.h.b.a.b.e.a$i$c */
        /* compiled from: ProtoBuf */
        public enum C2235c implements C2393a {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);
            

            /* renamed from: d */
            private static C2394b<C2235c> f6820d;

            /* renamed from: e */
            private final int f6822e;

            static {
                f6820d = new C2394b<C2235c>() {
                    /* renamed from: a */
                    public C2235c mo8188b(int i) {
                        return C2235c.m10643a(i);
                    }
                };
            }

            /* renamed from: a */
            public final int mo8186a() {
                return this.f6822e;
            }

            /* renamed from: a */
            public static C2235c m10643a(int i) {
                switch (i) {
                    case 0:
                        return AT_MOST_ONCE;
                    case 1:
                        return EXACTLY_ONCE;
                    case 2:
                        return AT_LEAST_ONCE;
                    default:
                        return null;
                }
            }

            private C2235c(int i, int i2) {
                this.f6822e = i2;
            }
        }

        private C2230i(C2385a aVar) {
            super(aVar);
            this.f6804j = -1;
            this.f6805k = -1;
            this.f6798d = aVar.mo9199x();
        }

        private C2230i(boolean z) {
            this.f6804j = -1;
            this.f6805k = -1;
            this.f6798d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2230i m10586a() {
            return f6797c;
        }

        /* renamed from: b */
        public C2230i mo8112o() {
            return f6797c;
        }

        private C2230i(C2374e eVar, C2378g gVar) {
            this.f6804j = -1;
            this.f6805k = -1;
            m10592s();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 8) {
                            int n = eVar.mo9117n();
                            C2233b a3 = C2233b.m10639a(n);
                            if (a3 == null) {
                                a.mo9171p(a2);
                                a.mo9171p(n);
                            } else {
                                this.f6799e |= 1;
                                this.f6800f = a3;
                            }
                        } else if (a2 == 18) {
                            if (!(z2 & true)) {
                                this.f6801g = new ArrayList();
                                z2 |= true;
                            }
                            this.f6801g.add(eVar.mo9096a(C2242m.f6832a, gVar));
                        } else if (a2 == 26) {
                            C2244a aVar = null;
                            if ((this.f6799e & 2) == 2) {
                                aVar = this.f6802h.mo8110m();
                            }
                            this.f6802h = (C2242m) eVar.mo9096a(C2242m.f6832a, gVar);
                            if (aVar != null) {
                                aVar.mo8128a(this.f6802h);
                                this.f6802h = aVar.mo8608d();
                            }
                            this.f6799e |= 2;
                        } else if (a2 == 32) {
                            int n2 = eVar.mo9117n();
                            C2235c a4 = C2235c.m10643a(n2);
                            if (a4 == null) {
                                a.mo9171p(a2);
                                a.mo9171p(n2);
                            } else {
                                this.f6799e |= 4;
                                this.f6803i = a4;
                            }
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f6801g = Collections.unmodifiableList(this.f6801g);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6798d = i.mo9090a();
                        throw th2;
                    }
                    this.f6798d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f6801g = Collections.unmodifiableList(this.f6801g);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6798d = i.mo9090a();
                throw th3;
            }
            this.f6798d = i.mo9090a();
            mo9196O();
        }

        static {
            f6797c.m10592s();
        }

        /* renamed from: c */
        public C2409s<C2230i> mo8101c() {
            return f6796a;
        }

        /* renamed from: d */
        public boolean mo8544d() {
            return (this.f6799e & 1) == 1;
        }

        /* renamed from: e */
        public C2233b mo8545e() {
            return this.f6800f;
        }

        /* renamed from: f */
        public int mo8546f() {
            return this.f6801g.size();
        }

        /* renamed from: a */
        public C2242m mo8542a(int i) {
            return (C2242m) this.f6801g.get(i);
        }

        /* renamed from: g */
        public boolean mo8547g() {
            return (this.f6799e & 2) == 2;
        }

        /* renamed from: j */
        public C2242m mo8548j() {
            return this.f6802h;
        }

        /* renamed from: k */
        public boolean mo8549k() {
            return (this.f6799e & 4) == 4;
        }

        /* renamed from: l */
        public C2235c mo8550l() {
            return this.f6803i;
        }

        /* renamed from: s */
        private void m10592s() {
            this.f6800f = C2233b.RETURNS_CONSTANT;
            this.f6801g = Collections.emptyList();
            this.f6802h = C2242m.m10692a();
            this.f6803i = C2235c.AT_MOST_ONCE;
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6804j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < mo8546f(); i++) {
                if (!mo8542a(i).mo8106h()) {
                    this.f6804j = 0;
                    return false;
                }
            }
            if (!mo8547g() || mo8548j().mo8106h()) {
                this.f6804j = 1;
                return true;
            }
            this.f6804j = 0;
            return false;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            if ((this.f6799e & 1) == 1) {
                fVar.mo9156c(1, this.f6800f.mo8186a());
            }
            for (int i = 0; i < this.f6801g.size(); i++) {
                fVar.mo9152b(2, (C2406q) this.f6801g.get(i));
            }
            if ((this.f6799e & 2) == 2) {
                fVar.mo9152b(3, (C2406q) this.f6802h);
            }
            if ((this.f6799e & 4) == 4) {
                fVar.mo9156c(4, this.f6803i.mo8186a());
            }
            fVar.mo9159c(this.f6798d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6805k;
            if (i != -1) {
                return i;
            }
            int e = (this.f6799e & 1) == 1 ? C2376f.m11834e(1, this.f6800f.mo8186a()) + 0 : 0;
            for (int i2 = 0; i2 < this.f6801g.size(); i2++) {
                e += C2376f.m11832d(2, (C2406q) this.f6801g.get(i2));
            }
            if ((this.f6799e & 2) == 2) {
                e += C2376f.m11832d(3, (C2406q) this.f6802h);
            }
            if ((this.f6799e & 4) == 4) {
                e += C2376f.m11834e(4, this.f6803i.mo8186a());
            }
            int a = e + this.f6798d.mo9064a();
            this.f6805k = a;
            return a;
        }

        /* renamed from: p */
        public static C2232a m10591p() {
            return C2232a.m10615p();
        }

        /* renamed from: q */
        public C2232a mo8111n() {
            return m10591p();
        }

        /* renamed from: a */
        public static C2232a m10583a(C2230i iVar) {
            return m10591p().mo8128a(iVar);
        }

        /* renamed from: r */
        public C2232a mo8110m() {
            return m10583a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$j */
    public interface C2237j extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.a$k */
    /* compiled from: ProtoBuf */
    public static final class C2238k extends C2387c<C2238k> implements C2241l {

        /* renamed from: a */
        public static C2409s<C2238k> f6823a = new C2367b<C2238k>() {
            /* renamed from: a */
            public C2238k mo8114b(C2374e eVar, C2378g gVar) {
                return new C2238k(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2238k f6824c = new C2238k(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6825d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6826e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6827f;

        /* renamed from: g */
        private byte f6828g;

        /* renamed from: h */
        private int f6829h;

        /* renamed from: b.h.b.a.b.e.a$k$a */
        /* compiled from: ProtoBuf */
        public static final class C2240a extends C2386b<C2238k, C2240a> implements C2241l {

            /* renamed from: a */
            private int f6830a;

            /* renamed from: b */
            private int f6831b;

            /* renamed from: f */
            private void m10669f() {
            }

            private C2240a() {
                m10669f();
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static C2240a m10670g() {
                return new C2240a();
            }

            /* renamed from: a */
            public C2240a mo8281u() {
                return m10670g().mo8128a(mo8579d());
            }

            /* renamed from: b */
            public C2238k mo8112o() {
                return C2238k.m10649a();
            }

            /* renamed from: c */
            public C2238k mo8141l() {
                C2238k d = mo8579d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2238k mo8579d() {
                C2238k kVar = new C2238k((C2386b) this);
                int i = 1;
                if ((this.f6830a & 1) != 1) {
                    i = 0;
                }
                kVar.f6827f = this.f6831b;
                kVar.f6826e = i;
                return kVar;
            }

            /* renamed from: a */
            public C2240a mo8128a(C2238k kVar) {
                if (kVar == C2238k.m10649a()) {
                    return this;
                }
                if (kVar.mo8570d()) {
                    mo8575a(kVar.mo8571e());
                }
                mo9200a(kVar);
                mo9198a(mo9199x().mo9075a(kVar.f6825d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                return mo9201y();
            }

            /* renamed from: a */
            public C2240a mo8132c(C2374e eVar, C2378g gVar) {
                C2238k kVar;
                C2238k kVar2 = null;
                try {
                    C2238k kVar3 = (C2238k) C2238k.f6823a.mo8114b(eVar, gVar);
                    if (kVar3 != null) {
                        mo8128a(kVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    kVar = (C2238k) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    kVar2 = kVar;
                }
                if (kVar2 != null) {
                    mo8128a(kVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2240a mo8575a(int i) {
                this.f6830a |= 1;
                this.f6831b = i;
                return this;
            }
        }

        private C2238k(C2386b<C2238k, ?> bVar) {
            super(bVar);
            this.f6828g = -1;
            this.f6829h = -1;
            this.f6825d = bVar.mo9199x();
        }

        private C2238k(boolean z) {
            this.f6828g = -1;
            this.f6829h = -1;
            this.f6825d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2238k m10649a() {
            return f6824c;
        }

        /* renamed from: b */
        public C2238k mo8112o() {
            return f6824c;
        }

        private C2238k(C2374e eVar, C2378g gVar) {
            this.f6828g = -1;
            this.f6829h = -1;
            m10653k();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 8) {
                            this.f6826e |= 1;
                            this.f6827f = eVar.mo9109f();
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6825d = i.mo9090a();
                        throw th2;
                    }
                    this.f6825d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6825d = i.mo9090a();
                throw th3;
            }
            this.f6825d = i.mo9090a();
            mo9196O();
        }

        static {
            f6824c.m10653k();
        }

        /* renamed from: c */
        public C2409s<C2238k> mo8101c() {
            return f6823a;
        }

        /* renamed from: d */
        public boolean mo8570d() {
            return (this.f6826e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8571e() {
            return this.f6827f;
        }

        /* renamed from: k */
        private void m10653k() {
            this.f6827f = 0;
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6828g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo9202P()) {
                this.f6828g = 0;
                return false;
            }
            this.f6828g = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6826e & 1) == 1) {
                fVar.mo9137a(1, this.f6827f);
            }
            Q.mo9209a(200, fVar);
            fVar.mo9159c(this.f6825d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6829h;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f6826e & 1) == 1) {
                i2 = 0 + C2376f.m11831d(1, this.f6827f);
            }
            int R = i2 + mo9204R() + this.f6825d.mo9064a();
            this.f6829h = R;
            return R;
        }

        /* renamed from: f */
        public static C2240a m10652f() {
            return C2240a.m10670g();
        }

        /* renamed from: g */
        public C2240a mo8111n() {
            return m10652f();
        }

        /* renamed from: a */
        public static C2240a m10648a(C2238k kVar) {
            return m10652f().mo8128a(kVar);
        }

        /* renamed from: j */
        public C2240a mo8110m() {
            return m10648a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$l */
    public interface C2241l extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$m */
    /* compiled from: ProtoBuf */
    public static final class C2242m extends C2383i implements C2247n {

        /* renamed from: a */
        public static C2409s<C2242m> f6832a = new C2367b<C2242m>() {
            /* renamed from: a */
            public C2242m mo8114b(C2374e eVar, C2378g gVar) {
                return new C2242m(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2242m f6833c = new C2242m(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6834d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6835e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6836f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6837g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2245b f6838h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2173aa f6839i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f6840j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public List<C2242m> f6841k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public List<C2242m> f6842l;

        /* renamed from: m */
        private byte f6843m;

        /* renamed from: n */
        private int f6844n;

        /* renamed from: b.h.b.a.b.e.a$m$a */
        /* compiled from: ProtoBuf */
        public static final class C2244a extends C2385a<C2242m, C2244a> implements C2247n {

            /* renamed from: a */
            private int f6845a;

            /* renamed from: b */
            private int f6846b;

            /* renamed from: c */
            private int f6847c;

            /* renamed from: d */
            private C2245b f6848d = C2245b.TRUE;

            /* renamed from: e */
            private C2173aa f6849e = C2173aa.m9813a();

            /* renamed from: f */
            private int f6850f;

            /* renamed from: g */
            private List<C2242m> f6851g = Collections.emptyList();

            /* renamed from: h */
            private List<C2242m> f6852h = Collections.emptyList();

            /* renamed from: p */
            private void m10730p() {
            }

            private C2244a() {
                m10730p();
            }

            /* access modifiers changed from: private */
            /* renamed from: q */
            public static C2244a m10731q() {
                return new C2244a();
            }

            /* renamed from: a */
            public C2244a mo8140k() {
                return m10731q().mo8128a(mo8608d());
            }

            /* renamed from: b */
            public C2242m mo8112o() {
                return C2242m.m10692a();
            }

            /* renamed from: c */
            public C2242m mo8141l() {
                C2242m d = mo8608d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2242m mo8608d() {
                C2242m mVar = new C2242m((C2385a) this);
                int i = this.f6845a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                mVar.f6836f = this.f6846b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                mVar.f6837g = this.f6847c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                mVar.f6838h = this.f6848d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                mVar.f6839i = this.f6849e;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                mVar.f6840j = this.f6850f;
                if ((this.f6845a & 32) == 32) {
                    this.f6851g = Collections.unmodifiableList(this.f6851g);
                    this.f6845a &= -33;
                }
                mVar.f6841k = this.f6851g;
                if ((this.f6845a & 64) == 64) {
                    this.f6852h = Collections.unmodifiableList(this.f6852h);
                    this.f6845a &= -65;
                }
                mVar.f6842l = this.f6852h;
                mVar.f6835e = i2;
                return mVar;
            }

            /* renamed from: a */
            public C2244a mo8128a(C2242m mVar) {
                if (mVar == C2242m.m10692a()) {
                    return this;
                }
                if (mVar.mo8583d()) {
                    mo8599a(mVar.mo8584e());
                }
                if (mVar.mo8585f()) {
                    mo8604b(mVar.mo8586g());
                }
                if (mVar.mo8587j()) {
                    mo8601a(mVar.mo8588k());
                }
                if (mVar.mo8589l()) {
                    mo8600a(mVar.mo8590p());
                }
                if (mVar.mo8591q()) {
                    mo8606c(mVar.mo8592r());
                }
                if (!mVar.f6841k.isEmpty()) {
                    if (this.f6851g.isEmpty()) {
                        this.f6851g = mVar.f6841k;
                        this.f6845a &= -33;
                    } else {
                        m10732r();
                        this.f6851g.addAll(mVar.f6841k);
                    }
                }
                if (!mVar.f6842l.isEmpty()) {
                    if (this.f6852h.isEmpty()) {
                        this.f6852h = mVar.f6842l;
                        this.f6845a &= -65;
                    } else {
                        m10733s();
                        this.f6852h.addAll(mVar.f6842l);
                    }
                }
                mo9198a(mo9199x().mo9075a(mVar.f6834d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                if (mo8611e() && !mo8612f().mo8106h()) {
                    return false;
                }
                for (int i = 0; i < mo8613g(); i++) {
                    if (!mo8609d(i).mo8106h()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < mo8614m(); i2++) {
                    if (!mo8610e(i2).mo8106h()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: a */
            public C2244a mo8132c(C2374e eVar, C2378g gVar) {
                C2242m mVar;
                C2242m mVar2 = null;
                try {
                    C2242m mVar3 = (C2242m) C2242m.f6832a.mo8114b(eVar, gVar);
                    if (mVar3 != null) {
                        mo8128a(mVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    mVar = (C2242m) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    mVar2 = mVar;
                }
                if (mVar2 != null) {
                    mo8128a(mVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2244a mo8599a(int i) {
                this.f6845a |= 1;
                this.f6846b = i;
                return this;
            }

            /* renamed from: b */
            public C2244a mo8604b(int i) {
                this.f6845a |= 2;
                this.f6847c = i;
                return this;
            }

            /* renamed from: a */
            public C2244a mo8601a(C2245b bVar) {
                if (bVar != null) {
                    this.f6845a |= 4;
                    this.f6848d = bVar;
                    return this;
                }
                throw new NullPointerException();
            }

            /* renamed from: e */
            public boolean mo8611e() {
                return (this.f6845a & 8) == 8;
            }

            /* renamed from: f */
            public C2173aa mo8612f() {
                return this.f6849e;
            }

            /* renamed from: a */
            public C2244a mo8600a(C2173aa aaVar) {
                if ((this.f6845a & 8) != 8 || this.f6849e == C2173aa.m9813a()) {
                    this.f6849e = aaVar;
                } else {
                    this.f6849e = C2173aa.m9812a(this.f6849e).mo8128a(aaVar).mo8267d();
                }
                this.f6845a |= 8;
                return this;
            }

            /* renamed from: c */
            public C2244a mo8606c(int i) {
                this.f6845a |= 16;
                this.f6850f = i;
                return this;
            }

            /* renamed from: r */
            private void m10732r() {
                if ((this.f6845a & 32) != 32) {
                    this.f6851g = new ArrayList(this.f6851g);
                    this.f6845a |= 32;
                }
            }

            /* renamed from: g */
            public int mo8613g() {
                return this.f6851g.size();
            }

            /* renamed from: d */
            public C2242m mo8609d(int i) {
                return (C2242m) this.f6851g.get(i);
            }

            /* renamed from: s */
            private void m10733s() {
                if ((this.f6845a & 64) != 64) {
                    this.f6852h = new ArrayList(this.f6852h);
                    this.f6845a |= 64;
                }
            }

            /* renamed from: m */
            public int mo8614m() {
                return this.f6852h.size();
            }

            /* renamed from: e */
            public C2242m mo8610e(int i) {
                return (C2242m) this.f6852h.get(i);
            }
        }

        /* renamed from: b.h.b.a.b.e.a$m$b */
        /* compiled from: ProtoBuf */
        public enum C2245b implements C2393a {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);
            

            /* renamed from: d */
            private static C2394b<C2245b> f6856d;

            /* renamed from: e */
            private final int f6858e;

            static {
                f6856d = new C2394b<C2245b>() {
                    /* renamed from: a */
                    public C2245b mo8188b(int i) {
                        return C2245b.m10760a(i);
                    }
                };
            }

            /* renamed from: a */
            public final int mo8186a() {
                return this.f6858e;
            }

            /* renamed from: a */
            public static C2245b m10760a(int i) {
                switch (i) {
                    case 0:
                        return TRUE;
                    case 1:
                        return FALSE;
                    case 2:
                        return NULL;
                    default:
                        return null;
                }
            }

            private C2245b(int i, int i2) {
                this.f6858e = i2;
            }
        }

        private C2242m(C2385a aVar) {
            super(aVar);
            this.f6843m = -1;
            this.f6844n = -1;
            this.f6834d = aVar.mo9199x();
        }

        private C2242m(boolean z) {
            this.f6843m = -1;
            this.f6844n = -1;
            this.f6834d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2242m m10692a() {
            return f6833c;
        }

        /* renamed from: b */
        public C2242m mo8112o() {
            return f6833c;
        }

        private C2242m(C2374e eVar, C2378g gVar) {
            this.f6843m = -1;
            this.f6844n = -1;
            m10702x();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 8) {
                            this.f6835e |= 1;
                            this.f6836f = eVar.mo9109f();
                        } else if (a2 == 16) {
                            this.f6835e |= 2;
                            this.f6837g = eVar.mo9109f();
                        } else if (a2 == 24) {
                            int n = eVar.mo9117n();
                            C2245b a3 = C2245b.m10760a(n);
                            if (a3 == null) {
                                a.mo9171p(a2);
                                a.mo9171p(n);
                            } else {
                                this.f6835e |= 4;
                                this.f6838h = a3;
                            }
                        } else if (a2 == 34) {
                            C2181c cVar = null;
                            if ((this.f6835e & 8) == 8) {
                                cVar = this.f6839i.mo8110m();
                            }
                            this.f6839i = (C2173aa) eVar.mo9096a(C2173aa.f6539a, gVar);
                            if (cVar != null) {
                                cVar.mo8128a(this.f6839i);
                                this.f6839i = cVar.mo8267d();
                            }
                            this.f6835e |= 8;
                        } else if (a2 == 40) {
                            this.f6835e |= 16;
                            this.f6840j = eVar.mo9109f();
                        } else if (a2 == 50) {
                            if (!(z2 & true)) {
                                this.f6841k = new ArrayList();
                                z2 |= true;
                            }
                            this.f6841k.add(eVar.mo9096a(f6832a, gVar));
                        } else if (a2 == 58) {
                            if (!(z2 & true)) {
                                this.f6842l = new ArrayList();
                                z2 |= true;
                            }
                            this.f6842l.add(eVar.mo9096a(f6832a, gVar));
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.f6841k = Collections.unmodifiableList(this.f6841k);
                    }
                    if (z2 & true) {
                        this.f6842l = Collections.unmodifiableList(this.f6842l);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6834d = i.mo9090a();
                        throw th2;
                    }
                    this.f6834d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 & true) {
                this.f6841k = Collections.unmodifiableList(this.f6841k);
            }
            if (z2 & true) {
                this.f6842l = Collections.unmodifiableList(this.f6842l);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6834d = i.mo9090a();
                throw th3;
            }
            this.f6834d = i.mo9090a();
            mo9196O();
        }

        static {
            f6833c.m10702x();
        }

        /* renamed from: c */
        public C2409s<C2242m> mo8101c() {
            return f6832a;
        }

        /* renamed from: d */
        public boolean mo8583d() {
            return (this.f6835e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8584e() {
            return this.f6836f;
        }

        /* renamed from: f */
        public boolean mo8585f() {
            return (this.f6835e & 2) == 2;
        }

        /* renamed from: g */
        public int mo8586g() {
            return this.f6837g;
        }

        /* renamed from: j */
        public boolean mo8587j() {
            return (this.f6835e & 4) == 4;
        }

        /* renamed from: k */
        public C2245b mo8588k() {
            return this.f6838h;
        }

        /* renamed from: l */
        public boolean mo8589l() {
            return (this.f6835e & 8) == 8;
        }

        /* renamed from: p */
        public C2173aa mo8590p() {
            return this.f6839i;
        }

        /* renamed from: q */
        public boolean mo8591q() {
            return (this.f6835e & 16) == 16;
        }

        /* renamed from: r */
        public int mo8592r() {
            return this.f6840j;
        }

        /* renamed from: s */
        public int mo8593s() {
            return this.f6841k.size();
        }

        /* renamed from: a */
        public C2242m mo8580a(int i) {
            return (C2242m) this.f6841k.get(i);
        }

        /* renamed from: t */
        public int mo8594t() {
            return this.f6842l.size();
        }

        /* renamed from: b */
        public C2242m mo8582b(int i) {
            return (C2242m) this.f6842l.get(i);
        }

        /* renamed from: x */
        private void m10702x() {
            this.f6836f = 0;
            this.f6837g = 0;
            this.f6838h = C2245b.TRUE;
            this.f6839i = C2173aa.m9813a();
            this.f6840j = 0;
            this.f6841k = Collections.emptyList();
            this.f6842l = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6843m;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8589l() || mo8590p().mo8106h()) {
                for (int i = 0; i < mo8593s(); i++) {
                    if (!mo8580a(i).mo8106h()) {
                        this.f6843m = 0;
                        return false;
                    }
                }
                for (int i2 = 0; i2 < mo8594t(); i2++) {
                    if (!mo8582b(i2).mo8106h()) {
                        this.f6843m = 0;
                        return false;
                    }
                }
                this.f6843m = 1;
                return true;
            }
            this.f6843m = 0;
            return false;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            if ((this.f6835e & 1) == 1) {
                fVar.mo9137a(1, this.f6836f);
            }
            if ((this.f6835e & 2) == 2) {
                fVar.mo9137a(2, this.f6837g);
            }
            if ((this.f6835e & 4) == 4) {
                fVar.mo9156c(3, this.f6838h.mo8186a());
            }
            if ((this.f6835e & 8) == 8) {
                fVar.mo9152b(4, (C2406q) this.f6839i);
            }
            if ((this.f6835e & 16) == 16) {
                fVar.mo9137a(5, this.f6840j);
            }
            for (int i = 0; i < this.f6841k.size(); i++) {
                fVar.mo9152b(6, (C2406q) this.f6841k.get(i));
            }
            for (int i2 = 0; i2 < this.f6842l.size(); i2++) {
                fVar.mo9152b(7, (C2406q) this.f6842l.get(i2));
            }
            fVar.mo9159c(this.f6834d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6844n;
            if (i != -1) {
                return i;
            }
            int d = (this.f6835e & 1) == 1 ? C2376f.m11831d(1, this.f6836f) + 0 : 0;
            if ((this.f6835e & 2) == 2) {
                d += C2376f.m11831d(2, this.f6837g);
            }
            if ((this.f6835e & 4) == 4) {
                d += C2376f.m11834e(3, this.f6838h.mo8186a());
            }
            if ((this.f6835e & 8) == 8) {
                d += C2376f.m11832d(4, (C2406q) this.f6839i);
            }
            if ((this.f6835e & 16) == 16) {
                d += C2376f.m11831d(5, this.f6840j);
            }
            int i2 = d;
            for (int i3 = 0; i3 < this.f6841k.size(); i3++) {
                i2 += C2376f.m11832d(6, (C2406q) this.f6841k.get(i3));
            }
            for (int i4 = 0; i4 < this.f6842l.size(); i4++) {
                i2 += C2376f.m11832d(7, (C2406q) this.f6842l.get(i4));
            }
            int a = i2 + this.f6834d.mo9064a();
            this.f6844n = a;
            return a;
        }

        /* renamed from: u */
        public static C2244a m10701u() {
            return C2244a.m10731q();
        }

        /* renamed from: v */
        public C2244a mo8111n() {
            return m10701u();
        }

        /* renamed from: a */
        public static C2244a m10690a(C2242m mVar) {
            return m10701u().mo8128a(mVar);
        }

        /* renamed from: w */
        public C2244a mo8110m() {
            return m10690a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$n */
    public interface C2247n extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.a$o */
    /* compiled from: ProtoBuf */
    public static final class C2248o extends C2387c<C2248o> implements C2251p {

        /* renamed from: a */
        public static C2409s<C2248o> f6859a = new C2367b<C2248o>() {
            /* renamed from: a */
            public C2248o mo8114b(C2374e eVar, C2378g gVar) {
                return new C2248o(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2248o f6860c = new C2248o(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6861d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6862e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6863f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6864g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f6865h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2173aa f6866i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f6867j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public List<C2187ae> f6868k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C2173aa f6869l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f6870m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public List<C2197ai> f6871n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C2193ag f6872o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public List<Integer> f6873p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C2226g f6874q;

        /* renamed from: r */
        private byte f6875r;

        /* renamed from: s */
        private int f6876s;

        /* renamed from: b.h.b.a.b.e.a$o$a */
        /* compiled from: ProtoBuf */
        public static final class C2250a extends C2386b<C2248o, C2250a> implements C2251p {

            /* renamed from: a */
            private int f6877a;

            /* renamed from: b */
            private int f6878b = 6;

            /* renamed from: c */
            private int f6879c = 6;

            /* renamed from: d */
            private int f6880d;

            /* renamed from: e */
            private C2173aa f6881e = C2173aa.m9813a();

            /* renamed from: f */
            private int f6882f;

            /* renamed from: g */
            private List<C2187ae> f6883g = Collections.emptyList();

            /* renamed from: h */
            private C2173aa f6884h = C2173aa.m9813a();

            /* renamed from: i */
            private int f6885i;

            /* renamed from: j */
            private List<C2197ai> f6886j = Collections.emptyList();

            /* renamed from: k */
            private C2193ag f6887k = C2193ag.m10126a();

            /* renamed from: l */
            private List<Integer> f6888l = Collections.emptyList();

            /* renamed from: m */
            private C2226g f6889m = C2226g.m10541a();

            /* renamed from: z */
            private void m10828z() {
            }

            private C2250a() {
                m10828z();
            }

            /* access modifiers changed from: private */
            /* renamed from: A */
            public static C2250a m10823A() {
                return new C2250a();
            }

            /* renamed from: a */
            public C2250a mo8281u() {
                return m10823A().mo8128a(mo8656d());
            }

            /* renamed from: b */
            public C2248o mo8112o() {
                return C2248o.m10771a();
            }

            /* renamed from: c */
            public C2248o mo8141l() {
                C2248o d = mo8656d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2248o mo8656d() {
                C2248o oVar = new C2248o((C2386b) this);
                int i = this.f6877a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                oVar.f6863f = this.f6878b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                oVar.f6864g = this.f6879c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                oVar.f6865h = this.f6880d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                oVar.f6866i = this.f6881e;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                oVar.f6867j = this.f6882f;
                if ((this.f6877a & 32) == 32) {
                    this.f6883g = Collections.unmodifiableList(this.f6883g);
                    this.f6877a &= -33;
                }
                oVar.f6868k = this.f6883g;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                oVar.f6869l = this.f6884h;
                if ((i & Allocation.USAGE_SHARED) == 128) {
                    i2 |= 64;
                }
                oVar.f6870m = this.f6885i;
                if ((this.f6877a & 256) == 256) {
                    this.f6886j = Collections.unmodifiableList(this.f6886j);
                    this.f6877a &= -257;
                }
                oVar.f6871n = this.f6886j;
                if ((i & 512) == 512) {
                    i2 |= Allocation.USAGE_SHARED;
                }
                oVar.f6872o = this.f6887k;
                if ((this.f6877a & 1024) == 1024) {
                    this.f6888l = Collections.unmodifiableList(this.f6888l);
                    this.f6877a &= -1025;
                }
                oVar.f6873p = this.f6888l;
                if ((i & 2048) == 2048) {
                    i2 |= 256;
                }
                oVar.f6874q = this.f6889m;
                oVar.f6862e = i2;
                return oVar;
            }

            /* renamed from: a */
            public C2250a mo8128a(C2248o oVar) {
                if (oVar == C2248o.m10771a()) {
                    return this;
                }
                if (oVar.mo8626d()) {
                    mo8645a(oVar.mo8627e());
                }
                if (oVar.mo8628f()) {
                    mo8651b(oVar.mo8629g());
                }
                if (oVar.mo8630j()) {
                    mo8653c(oVar.mo8631k());
                }
                if (oVar.mo8632l()) {
                    mo8646a(oVar.mo8633p());
                }
                if (oVar.mo8634q()) {
                    mo8655d(oVar.mo8635r());
                }
                if (!oVar.f6868k.isEmpty()) {
                    if (this.f6883g.isEmpty()) {
                        this.f6883g = oVar.f6868k;
                        this.f6877a &= -33;
                    } else {
                        m10824B();
                        this.f6883g.addAll(oVar.f6868k);
                    }
                }
                if (oVar.mo8638u()) {
                    mo8652b(oVar.mo8639v());
                }
                if (oVar.mo8640w()) {
                    mo8659f(oVar.mo8641x());
                }
                if (!oVar.f6871n.isEmpty()) {
                    if (this.f6886j.isEmpty()) {
                        this.f6886j = oVar.f6871n;
                        this.f6877a &= -257;
                    } else {
                        m10825C();
                        this.f6886j.addAll(oVar.f6871n);
                    }
                }
                if (oVar.mo8616A()) {
                    mo8647a(oVar.mo8617B());
                }
                if (!oVar.f6873p.isEmpty()) {
                    if (this.f6888l.isEmpty()) {
                        this.f6888l = oVar.f6873p;
                        this.f6877a &= -1025;
                    } else {
                        m10826D();
                        this.f6888l.addAll(oVar.f6873p);
                    }
                }
                if (oVar.mo8619D()) {
                    mo8648a(oVar.mo8620E());
                }
                mo9200a(oVar);
                mo9198a(mo9199x().mo9075a(oVar.f6861d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                if (!mo8658e()) {
                    return false;
                }
                if (mo8660f() && !mo8661g().mo8106h()) {
                    return false;
                }
                for (int i = 0; i < mo8663m(); i++) {
                    if (!mo8657e(i).mo8106h()) {
                        return false;
                    }
                }
                if (mo8664n() && !mo8665p().mo8106h()) {
                    return false;
                }
                for (int i2 = 0; i2 < mo8666q(); i2++) {
                    if (!mo8662g(i2).mo8106h()) {
                        return false;
                    }
                }
                if (mo8667r() && !mo8668s().mo8106h()) {
                    return false;
                }
                if ((!mo8669t() || mo8670v().mo8106h()) && mo9201y()) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public C2250a mo8132c(C2374e eVar, C2378g gVar) {
                C2248o oVar;
                C2248o oVar2 = null;
                try {
                    C2248o oVar3 = (C2248o) C2248o.f6859a.mo8114b(eVar, gVar);
                    if (oVar3 != null) {
                        mo8128a(oVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    oVar = (C2248o) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    oVar2 = oVar;
                }
                if (oVar2 != null) {
                    mo8128a(oVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2250a mo8645a(int i) {
                this.f6877a |= 1;
                this.f6878b = i;
                return this;
            }

            /* renamed from: b */
            public C2250a mo8651b(int i) {
                this.f6877a |= 2;
                this.f6879c = i;
                return this;
            }

            /* renamed from: e */
            public boolean mo8658e() {
                return (this.f6877a & 4) == 4;
            }

            /* renamed from: c */
            public C2250a mo8653c(int i) {
                this.f6877a |= 4;
                this.f6880d = i;
                return this;
            }

            /* renamed from: f */
            public boolean mo8660f() {
                return (this.f6877a & 8) == 8;
            }

            /* renamed from: g */
            public C2173aa mo8661g() {
                return this.f6881e;
            }

            /* renamed from: a */
            public C2250a mo8646a(C2173aa aaVar) {
                if ((this.f6877a & 8) != 8 || this.f6881e == C2173aa.m9813a()) {
                    this.f6881e = aaVar;
                } else {
                    this.f6881e = C2173aa.m9812a(this.f6881e).mo8128a(aaVar).mo8267d();
                }
                this.f6877a |= 8;
                return this;
            }

            /* renamed from: d */
            public C2250a mo8655d(int i) {
                this.f6877a |= 16;
                this.f6882f = i;
                return this;
            }

            /* renamed from: B */
            private void m10824B() {
                if ((this.f6877a & 32) != 32) {
                    this.f6883g = new ArrayList(this.f6883g);
                    this.f6877a |= 32;
                }
            }

            /* renamed from: m */
            public int mo8663m() {
                return this.f6883g.size();
            }

            /* renamed from: e */
            public C2187ae mo8657e(int i) {
                return (C2187ae) this.f6883g.get(i);
            }

            /* renamed from: n */
            public boolean mo8664n() {
                return (this.f6877a & 64) == 64;
            }

            /* renamed from: p */
            public C2173aa mo8665p() {
                return this.f6884h;
            }

            /* renamed from: b */
            public C2250a mo8652b(C2173aa aaVar) {
                if ((this.f6877a & 64) != 64 || this.f6884h == C2173aa.m9813a()) {
                    this.f6884h = aaVar;
                } else {
                    this.f6884h = C2173aa.m9812a(this.f6884h).mo8128a(aaVar).mo8267d();
                }
                this.f6877a |= 64;
                return this;
            }

            /* renamed from: f */
            public C2250a mo8659f(int i) {
                this.f6877a |= Allocation.USAGE_SHARED;
                this.f6885i = i;
                return this;
            }

            /* renamed from: C */
            private void m10825C() {
                if ((this.f6877a & 256) != 256) {
                    this.f6886j = new ArrayList(this.f6886j);
                    this.f6877a |= 256;
                }
            }

            /* renamed from: q */
            public int mo8666q() {
                return this.f6886j.size();
            }

            /* renamed from: g */
            public C2197ai mo8662g(int i) {
                return (C2197ai) this.f6886j.get(i);
            }

            /* renamed from: r */
            public boolean mo8667r() {
                return (this.f6877a & 512) == 512;
            }

            /* renamed from: s */
            public C2193ag mo8668s() {
                return this.f6887k;
            }

            /* renamed from: a */
            public C2250a mo8647a(C2193ag agVar) {
                if ((this.f6877a & 512) != 512 || this.f6887k == C2193ag.m10126a()) {
                    this.f6887k = agVar;
                } else {
                    this.f6887k = C2193ag.m10125a(this.f6887k).mo8128a(agVar).mo8369d();
                }
                this.f6877a |= 512;
                return this;
            }

            /* renamed from: D */
            private void m10826D() {
                if ((this.f6877a & 1024) != 1024) {
                    this.f6888l = new ArrayList(this.f6888l);
                    this.f6877a |= 1024;
                }
            }

            /* renamed from: t */
            public boolean mo8669t() {
                return (this.f6877a & 2048) == 2048;
            }

            /* renamed from: v */
            public C2226g mo8670v() {
                return this.f6889m;
            }

            /* renamed from: a */
            public C2250a mo8648a(C2226g gVar) {
                if ((this.f6877a & 2048) != 2048 || this.f6889m == C2226g.m10541a()) {
                    this.f6889m = gVar;
                } else {
                    this.f6889m = C2226g.m10540a(this.f6889m).mo8128a(gVar).mo8540d();
                }
                this.f6877a |= 2048;
                return this;
            }
        }

        private C2248o(C2386b<C2248o, ?> bVar) {
            super(bVar);
            this.f6875r = -1;
            this.f6876s = -1;
            this.f6861d = bVar.mo9199x();
        }

        private C2248o(boolean z) {
            this.f6875r = -1;
            this.f6876s = -1;
            this.f6861d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2248o m10771a() {
            return f6860c;
        }

        /* renamed from: b */
        public C2248o mo8112o() {
            return f6860c;
        }

        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v1, types: [b.h.b.a.b.e.a$aa$c] */
        /* JADX WARNING: type inference failed for: r9v2, types: [b.h.b.a.b.e.a$aa$c] */
        /* JADX WARNING: type inference failed for: r9v5, types: [b.h.b.a.b.e.a$aa$c] */
        /* JADX WARNING: type inference failed for: r9v6, types: [b.h.b.a.b.e.a$aa$c] */
        /* JADX WARNING: type inference failed for: r9v9, types: [b.h.b.a.b.e.a$ag$a] */
        /* JADX WARNING: type inference failed for: r9v10, types: [b.h.b.a.b.e.a$ag$a] */
        /* JADX WARNING: type inference failed for: r9v18, types: [b.h.b.a.b.e.a$g$a] */
        /* JADX WARNING: type inference failed for: r9v19, types: [b.h.b.a.b.e.a$g$a] */
        /* JADX WARNING: type inference failed for: r9v20 */
        /* JADX WARNING: type inference failed for: r9v21 */
        /* JADX WARNING: type inference failed for: r9v22 */
        /* JADX WARNING: type inference failed for: r9v23 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], b.h.b.a.b.e.a$aa$c, b.h.b.a.b.e.a$ag$a, b.h.b.a.b.e.a$g$a]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], b.h.b.a.b.e.a$aa$c, b.h.b.a.b.e.a$ag$a, b.h.b.a.b.e.a$g$a]
          mth insns count: 225
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2248o(p073b.p085h.p087b.p088a.p090b.p117g.C2374e r12, p073b.p085h.p087b.p088a.p090b.p117g.C2378g r13) {
            /*
                r11 = this;
                r11.<init>()
                r0 = -1
                r11.f6875r = r0
                r11.f6876s = r0
                r11.m10765I()
                b.h.b.a.b.g.d$b r0 = p073b.p085h.p087b.p088a.p090b.p117g.C2371d.m11743i()
                r1 = 1
                b.h.b.a.b.g.f r2 = p073b.p085h.p087b.p088a.p090b.p117g.C2376f.m11817a(r0, r1)
                r3 = 0
                r4 = 0
            L_0x0016:
                r5 = 1024(0x400, float:1.435E-42)
                r6 = 256(0x100, float:3.59E-43)
                r7 = 32
                if (r3 != 0) goto L_0x01f2
                int r8 = r12.mo9095a()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r9 = 0
                switch(r8) {
                    case 0: goto L_0x019b;
                    case 8: goto L_0x018d;
                    case 16: goto L_0x017f;
                    case 26: goto L_0x0154;
                    case 34: goto L_0x013a;
                    case 42: goto L_0x0111;
                    case 50: goto L_0x00f7;
                    case 56: goto L_0x00e9;
                    case 64: goto L_0x00db;
                    case 72: goto L_0x00ce;
                    case 242: goto L_0x00a3;
                    case 248: goto L_0x0087;
                    case 250: goto L_0x0054;
                    case 258: goto L_0x002c;
                    default: goto L_0x0026;
                }     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x0026:
                boolean r8 = r11.mo9197a(r12, r2, r13, r8)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x019e
            L_0x002c:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 & r6
                if (r8 != r6) goto L_0x0037
                b.h.b.a.b.e.a$g r8 = r11.f6874q     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$g$a r9 = r8.mo8110m()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x0037:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$g> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2226g.f6788a     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.g.q r8 = r12.mo9096a(r8, r13)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$g r8 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2226g) r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6874q = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                if (r9 == 0) goto L_0x004e
                b.h.b.a.b.e.a$g r8 = r11.f6874q     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r9.mo8128a(r8)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$g r8 = r9.mo8540d()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6874q = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x004e:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | r6
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x0054:
                int r8 = r12.mo9122s()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                int r8 = r12.mo9104c(r8)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r9 = r4 & 1024(0x400, float:1.435E-42)
                if (r9 == r5) goto L_0x006f
                int r9 = r12.mo9127x()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                if (r9 <= 0) goto L_0x006f
                java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r9.<init>()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6873p = r9     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r4 = r4 | 1024(0x400, float:1.435E-42)
            L_0x006f:
                int r9 = r12.mo9127x()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                if (r9 <= 0) goto L_0x0083
                java.util.List<java.lang.Integer> r9 = r11.f6873p     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                int r10 = r12.mo9109f()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r9.add(r10)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x006f
            L_0x0083:
                r12.mo9106d(r8)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x0087:
                r8 = r4 & 1024(0x400, float:1.435E-42)
                if (r8 == r5) goto L_0x0094
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8.<init>()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6873p = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r4 = r4 | 1024(0x400, float:1.435E-42)
            L_0x0094:
                java.util.List<java.lang.Integer> r8 = r11.f6873p     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                int r9 = r12.mo9109f()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8.add(r9)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x00a3:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r10 = 128(0x80, float:1.794E-43)
                r8 = r8 & r10
                if (r8 != r10) goto L_0x00b0
                b.h.b.a.b.e.a$ag r8 = r11.f6872o     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$ag$a r9 = r8.mo8110m()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x00b0:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ag> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag.f6645a     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.g.q r8 = r12.mo9096a(r8, r13)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$ag r8 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag) r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6872o = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                if (r9 == 0) goto L_0x00c7
                b.h.b.a.b.e.a$ag r8 = r11.f6872o     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r9.mo8128a(r8)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$ag r8 = r9.mo8369d()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6872o = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x00c7:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | r10
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x00ce:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | r1
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                int r8 = r12.mo9109f()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6863f = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x00db:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | 64
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                int r8 = r12.mo9109f()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6870m = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x00e9:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | 16
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                int r8 = r12.mo9109f()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6867j = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x00f7:
                r8 = r4 & 256(0x100, float:3.59E-43)
                if (r8 == r6) goto L_0x0104
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8.<init>()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6871n = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r4 = r4 | 256(0x100, float:3.59E-43)
            L_0x0104:
                java.util.List<b.h.b.a.b.e.a$ai> r8 = r11.f6871n     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ai> r9 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2197ai.f6656a     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.g.q r9 = r12.mo9096a(r9, r13)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8.add(r9)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x0111:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 & r7
                if (r8 != r7) goto L_0x011c
                b.h.b.a.b.e.a$aa r8 = r11.f6869l     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$aa$c r9 = r8.mo8110m()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x011c:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$aa> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa.f6539a     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.g.q r8 = r12.mo9096a(r8, r13)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$aa r8 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa) r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6869l = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                if (r9 == 0) goto L_0x0133
                b.h.b.a.b.e.a$aa r8 = r11.f6869l     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r9.mo8128a(r8)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$aa r8 = r9.mo8267d()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6869l = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x0133:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | r7
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x013a:
                r8 = r4 & 32
                if (r8 == r7) goto L_0x0147
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8.<init>()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6868k = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r4 = r4 | 32
            L_0x0147:
                java.util.List<b.h.b.a.b.e.a$ae> r8 = r11.f6868k     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ae> r9 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2187ae.f6619a     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.g.q r9 = r12.mo9096a(r9, r13)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8.add(r9)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x0154:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r10 = 8
                r8 = r8 & r10
                if (r8 != r10) goto L_0x0161
                b.h.b.a.b.e.a$aa r8 = r11.f6866i     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$aa$c r9 = r8.mo8110m()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x0161:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$aa> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa.f6539a     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.g.q r8 = r12.mo9096a(r8, r13)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$aa r8 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa) r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6866i = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                if (r9 == 0) goto L_0x0178
                b.h.b.a.b.e.a$aa r8 = r11.f6866i     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r9.mo8128a(r8)     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                b.h.b.a.b.e.a$aa r8 = r9.mo8267d()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6866i = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
            L_0x0178:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | r10
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x017f:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | 4
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                int r8 = r12.mo9109f()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6865h = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x018d:
                int r8 = r11.f6862e     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r8 = r8 | 2
                r11.f6862e = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                int r8 = r12.mo9109f()     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                r11.f6864g = r8     // Catch:{ k -> 0x01b2, IOException -> 0x01a3 }
                goto L_0x0016
            L_0x019b:
                r3 = 1
                goto L_0x0016
            L_0x019e:
                if (r8 != 0) goto L_0x0016
                goto L_0x019b
            L_0x01a1:
                r12 = move-exception
                goto L_0x01b8
            L_0x01a3:
                r12 = move-exception
                b.h.b.a.b.g.k r13 = new b.h.b.a.b.g.k     // Catch:{ all -> 0x01a1 }
                java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x01a1 }
                r13.<init>(r12)     // Catch:{ all -> 0x01a1 }
                b.h.b.a.b.g.k r12 = r13.mo9219a(r11)     // Catch:{ all -> 0x01a1 }
                throw r12     // Catch:{ all -> 0x01a1 }
            L_0x01b2:
                r12 = move-exception
                b.h.b.a.b.g.k r12 = r12.mo9219a(r11)     // Catch:{ all -> 0x01a1 }
                throw r12     // Catch:{ all -> 0x01a1 }
            L_0x01b8:
                r13 = r4 & 32
                if (r13 != r7) goto L_0x01c4
                java.util.List<b.h.b.a.b.e.a$ae> r13 = r11.f6868k
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.f6868k = r13
            L_0x01c4:
                r13 = r4 & 256(0x100, float:3.59E-43)
                if (r13 != r6) goto L_0x01d0
                java.util.List<b.h.b.a.b.e.a$ai> r13 = r11.f6871n
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.f6871n = r13
            L_0x01d0:
                r13 = r4 & 1024(0x400, float:1.435E-42)
                if (r13 != r5) goto L_0x01dc
                java.util.List<java.lang.Integer> r13 = r11.f6873p
                java.util.List r13 = java.util.Collections.unmodifiableList(r13)
                r11.f6873p = r13
            L_0x01dc:
                r2.mo9131a()     // Catch:{ IOException -> 0x01df, all -> 0x01e6 }
            L_0x01df:
                b.h.b.a.b.g.d r13 = r0.mo9090a()
                r11.f6861d = r13
                goto L_0x01ee
            L_0x01e6:
                r12 = move-exception
                b.h.b.a.b.g.d r13 = r0.mo9090a()
                r11.f6861d = r13
                throw r12
            L_0x01ee:
                r11.mo9196O()
                throw r12
            L_0x01f2:
                r12 = r4 & 32
                if (r12 != r7) goto L_0x01fe
                java.util.List<b.h.b.a.b.e.a$ae> r12 = r11.f6868k
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.f6868k = r12
            L_0x01fe:
                r12 = r4 & 256(0x100, float:3.59E-43)
                if (r12 != r6) goto L_0x020a
                java.util.List<b.h.b.a.b.e.a$ai> r12 = r11.f6871n
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.f6871n = r12
            L_0x020a:
                r12 = r4 & 1024(0x400, float:1.435E-42)
                if (r12 != r5) goto L_0x0216
                java.util.List<java.lang.Integer> r12 = r11.f6873p
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r11.f6873p = r12
            L_0x0216:
                r2.mo9131a()     // Catch:{ IOException -> 0x0219, all -> 0x0220 }
            L_0x0219:
                b.h.b.a.b.g.d r12 = r0.mo9090a()
                r11.f6861d = r12
                goto L_0x0228
            L_0x0220:
                r12 = move-exception
                b.h.b.a.b.g.d r13 = r0.mo9090a()
                r11.f6861d = r13
                throw r12
            L_0x0228:
                r11.mo9196O()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2248o.<init>(b.h.b.a.b.g.e, b.h.b.a.b.g.g):void");
        }

        static {
            f6860c.m10765I();
        }

        /* renamed from: c */
        public C2409s<C2248o> mo8101c() {
            return f6859a;
        }

        /* renamed from: d */
        public boolean mo8626d() {
            return (this.f6862e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8627e() {
            return this.f6863f;
        }

        /* renamed from: f */
        public boolean mo8628f() {
            return (this.f6862e & 2) == 2;
        }

        /* renamed from: g */
        public int mo8629g() {
            return this.f6864g;
        }

        /* renamed from: j */
        public boolean mo8630j() {
            return (this.f6862e & 4) == 4;
        }

        /* renamed from: k */
        public int mo8631k() {
            return this.f6865h;
        }

        /* renamed from: l */
        public boolean mo8632l() {
            return (this.f6862e & 8) == 8;
        }

        /* renamed from: p */
        public C2173aa mo8633p() {
            return this.f6866i;
        }

        /* renamed from: q */
        public boolean mo8634q() {
            return (this.f6862e & 16) == 16;
        }

        /* renamed from: r */
        public int mo8635r() {
            return this.f6867j;
        }

        /* renamed from: s */
        public List<C2187ae> mo8636s() {
            return this.f6868k;
        }

        /* renamed from: t */
        public int mo8637t() {
            return this.f6868k.size();
        }

        /* renamed from: a */
        public C2187ae mo8623a(int i) {
            return (C2187ae) this.f6868k.get(i);
        }

        /* renamed from: u */
        public boolean mo8638u() {
            return (this.f6862e & 32) == 32;
        }

        /* renamed from: v */
        public C2173aa mo8639v() {
            return this.f6869l;
        }

        /* renamed from: w */
        public boolean mo8640w() {
            return (this.f6862e & 64) == 64;
        }

        /* renamed from: x */
        public int mo8641x() {
            return this.f6870m;
        }

        /* renamed from: y */
        public List<C2197ai> mo8642y() {
            return this.f6871n;
        }

        /* renamed from: z */
        public int mo8643z() {
            return this.f6871n.size();
        }

        /* renamed from: b */
        public C2197ai mo8624b(int i) {
            return (C2197ai) this.f6871n.get(i);
        }

        /* renamed from: A */
        public boolean mo8616A() {
            return (this.f6862e & Allocation.USAGE_SHARED) == 128;
        }

        /* renamed from: B */
        public C2193ag mo8617B() {
            return this.f6872o;
        }

        /* renamed from: C */
        public List<Integer> mo8618C() {
            return this.f6873p;
        }

        /* renamed from: D */
        public boolean mo8619D() {
            return (this.f6862e & 256) == 256;
        }

        /* renamed from: E */
        public C2226g mo8620E() {
            return this.f6874q;
        }

        /* renamed from: I */
        private void m10765I() {
            this.f6863f = 6;
            this.f6864g = 6;
            this.f6865h = 0;
            this.f6866i = C2173aa.m9813a();
            this.f6867j = 0;
            this.f6868k = Collections.emptyList();
            this.f6869l = C2173aa.m9813a();
            this.f6870m = 0;
            this.f6871n = Collections.emptyList();
            this.f6872o = C2193ag.m10126a();
            this.f6873p = Collections.emptyList();
            this.f6874q = C2226g.m10541a();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6875r;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8630j()) {
                this.f6875r = 0;
                return false;
            } else if (!mo8632l() || mo8633p().mo8106h()) {
                for (int i = 0; i < mo8637t(); i++) {
                    if (!mo8623a(i).mo8106h()) {
                        this.f6875r = 0;
                        return false;
                    }
                }
                if (!mo8638u() || mo8639v().mo8106h()) {
                    for (int i2 = 0; i2 < mo8643z(); i2++) {
                        if (!mo8624b(i2).mo8106h()) {
                            this.f6875r = 0;
                            return false;
                        }
                    }
                    if (mo8616A() && !mo8617B().mo8106h()) {
                        this.f6875r = 0;
                        return false;
                    } else if (mo8619D() && !mo8620E().mo8106h()) {
                        this.f6875r = 0;
                        return false;
                    } else if (!mo9202P()) {
                        this.f6875r = 0;
                        return false;
                    } else {
                        this.f6875r = 1;
                        return true;
                    }
                } else {
                    this.f6875r = 0;
                    return false;
                }
            } else {
                this.f6875r = 0;
                return false;
            }
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6862e & 2) == 2) {
                fVar.mo9137a(1, this.f6864g);
            }
            if ((this.f6862e & 4) == 4) {
                fVar.mo9137a(2, this.f6865h);
            }
            if ((this.f6862e & 8) == 8) {
                fVar.mo9152b(3, (C2406q) this.f6866i);
            }
            for (int i = 0; i < this.f6868k.size(); i++) {
                fVar.mo9152b(4, (C2406q) this.f6868k.get(i));
            }
            if ((this.f6862e & 32) == 32) {
                fVar.mo9152b(5, (C2406q) this.f6869l);
            }
            for (int i2 = 0; i2 < this.f6871n.size(); i2++) {
                fVar.mo9152b(6, (C2406q) this.f6871n.get(i2));
            }
            if ((this.f6862e & 16) == 16) {
                fVar.mo9137a(7, this.f6867j);
            }
            if ((this.f6862e & 64) == 64) {
                fVar.mo9137a(8, this.f6870m);
            }
            if ((this.f6862e & 1) == 1) {
                fVar.mo9137a(9, this.f6863f);
            }
            if ((this.f6862e & Allocation.USAGE_SHARED) == 128) {
                fVar.mo9152b(30, (C2406q) this.f6872o);
            }
            for (int i3 = 0; i3 < this.f6873p.size(); i3++) {
                fVar.mo9137a(31, ((Integer) this.f6873p.get(i3)).intValue());
            }
            if ((this.f6862e & 256) == 256) {
                fVar.mo9152b(32, (C2406q) this.f6874q);
            }
            Q.mo9209a(19000, fVar);
            fVar.mo9159c(this.f6861d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6876s;
            if (i != -1) {
                return i;
            }
            int d = (this.f6862e & 2) == 2 ? C2376f.m11831d(1, this.f6864g) + 0 : 0;
            if ((this.f6862e & 4) == 4) {
                d += C2376f.m11831d(2, this.f6865h);
            }
            if ((this.f6862e & 8) == 8) {
                d += C2376f.m11832d(3, (C2406q) this.f6866i);
            }
            int i2 = d;
            for (int i3 = 0; i3 < this.f6868k.size(); i3++) {
                i2 += C2376f.m11832d(4, (C2406q) this.f6868k.get(i3));
            }
            if ((this.f6862e & 32) == 32) {
                i2 += C2376f.m11832d(5, (C2406q) this.f6869l);
            }
            for (int i4 = 0; i4 < this.f6871n.size(); i4++) {
                i2 += C2376f.m11832d(6, (C2406q) this.f6871n.get(i4));
            }
            if ((this.f6862e & 16) == 16) {
                i2 += C2376f.m11831d(7, this.f6867j);
            }
            if ((this.f6862e & 64) == 64) {
                i2 += C2376f.m11831d(8, this.f6870m);
            }
            if ((this.f6862e & 1) == 1) {
                i2 += C2376f.m11831d(9, this.f6863f);
            }
            if ((this.f6862e & Allocation.USAGE_SHARED) == 128) {
                i2 += C2376f.m11832d(30, (C2406q) this.f6872o);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f6873p.size(); i6++) {
                i5 += C2376f.m11837h(((Integer) this.f6873p.get(i6)).intValue());
            }
            int size = i2 + i5 + (mo8618C().size() * 2);
            if ((this.f6862e & 256) == 256) {
                size += C2376f.m11832d(32, (C2406q) this.f6874q);
            }
            int R = size + mo9204R() + this.f6861d.mo9064a();
            this.f6876s = R;
            return R;
        }

        /* renamed from: a */
        public static C2248o m10772a(InputStream inputStream, C2378g gVar) {
            return (C2248o) f6859a.mo9062f(inputStream, gVar);
        }

        /* renamed from: F */
        public static C2250a m10764F() {
            return C2250a.m10823A();
        }

        /* renamed from: G */
        public C2250a mo8111n() {
            return m10764F();
        }

        /* renamed from: a */
        public static C2250a m10770a(C2248o oVar) {
            return m10764F().mo8128a(oVar);
        }

        /* renamed from: H */
        public C2250a mo8110m() {
            return m10770a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$p */
    public interface C2251p extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$q */
    /* compiled from: ProtoBuf */
    public enum C2252q implements C2393a {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);
        

        /* renamed from: e */
        private static C2394b<C2252q> f6894e;

        /* renamed from: f */
        private final int f6896f;

        static {
            f6894e = new C2394b<C2252q>() {
                /* renamed from: a */
                public C2252q mo8188b(int i) {
                    return C2252q.m10867a(i);
                }
            };
        }

        /* renamed from: a */
        public final int mo8186a() {
            return this.f6896f;
        }

        /* renamed from: a */
        public static C2252q m10867a(int i) {
            switch (i) {
                case 0:
                    return DECLARATION;
                case 1:
                    return FAKE_OVERRIDE;
                case 2:
                    return DELEGATION;
                case 3:
                    return SYNTHESIZED;
                default:
                    return null;
            }
        }

        private C2252q(int i, int i2) {
            this.f6896f = i2;
        }
    }

    /* renamed from: b.h.b.a.b.e.a$r */
    /* compiled from: ProtoBuf */
    public enum C2254r implements C2393a {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);
        

        /* renamed from: e */
        private static C2394b<C2254r> f6901e;

        /* renamed from: f */
        private final int f6903f;

        static {
            f6901e = new C2394b<C2254r>() {
                /* renamed from: a */
                public C2254r mo8188b(int i) {
                    return C2254r.m10871a(i);
                }
            };
        }

        /* renamed from: a */
        public final int mo8186a() {
            return this.f6903f;
        }

        /* renamed from: a */
        public static C2254r m10871a(int i) {
            switch (i) {
                case 0:
                    return FINAL;
                case 1:
                    return OPEN;
                case 2:
                    return ABSTRACT;
                case 3:
                    return SEALED;
                default:
                    return null;
            }
        }

        private C2254r(int i, int i2) {
            this.f6903f = i2;
        }
    }

    /* renamed from: b.h.b.a.b.e.a$s */
    /* compiled from: ProtoBuf */
    public static final class C2256s extends C2387c<C2256s> implements C2259t {

        /* renamed from: a */
        public static C2409s<C2256s> f6904a = new C2367b<C2256s>() {
            /* renamed from: a */
            public C2256s mo8114b(C2374e eVar, C2378g gVar) {
                return new C2256s(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2256s f6905c = new C2256s(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6906d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6907e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public List<C2248o> f6908f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public List<C2260u> f6909g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public List<C2182ab> f6910h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2193ag f6911i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C2209am f6912j;

        /* renamed from: k */
        private byte f6913k;

        /* renamed from: l */
        private int f6914l;

        /* renamed from: b.h.b.a.b.e.a$s$a */
        /* compiled from: ProtoBuf */
        public static final class C2258a extends C2386b<C2256s, C2258a> implements C2259t {

            /* renamed from: a */
            private int f6915a;

            /* renamed from: b */
            private List<C2248o> f6916b = Collections.emptyList();

            /* renamed from: c */
            private List<C2260u> f6917c = Collections.emptyList();

            /* renamed from: d */
            private List<C2182ab> f6918d = Collections.emptyList();

            /* renamed from: e */
            private C2193ag f6919e = C2193ag.m10126a();

            /* renamed from: f */
            private C2209am f6920f = C2209am.m10307a();

            /* renamed from: q */
            private void m10916q() {
            }

            private C2258a() {
                m10916q();
            }

            /* access modifiers changed from: private */
            /* renamed from: r */
            public static C2258a m10917r() {
                return new C2258a();
            }

            /* renamed from: a */
            public C2258a mo8281u() {
                return m10917r().mo8128a(mo8698d());
            }

            /* renamed from: b */
            public C2256s mo8112o() {
                return C2256s.m10879a();
            }

            /* renamed from: c */
            public C2256s mo8141l() {
                C2256s d = mo8698d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2256s mo8698d() {
                C2256s sVar = new C2256s((C2386b) this);
                int i = this.f6915a;
                int i2 = 1;
                if ((this.f6915a & 1) == 1) {
                    this.f6916b = Collections.unmodifiableList(this.f6916b);
                    this.f6915a &= -2;
                }
                sVar.f6908f = this.f6916b;
                if ((this.f6915a & 2) == 2) {
                    this.f6917c = Collections.unmodifiableList(this.f6917c);
                    this.f6915a &= -3;
                }
                sVar.f6909g = this.f6917c;
                if ((this.f6915a & 4) == 4) {
                    this.f6918d = Collections.unmodifiableList(this.f6918d);
                    this.f6915a &= -5;
                }
                sVar.f6910h = this.f6918d;
                if ((i & 8) != 8) {
                    i2 = 0;
                }
                sVar.f6911i = this.f6919e;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                sVar.f6912j = this.f6920f;
                sVar.f6907e = i2;
                return sVar;
            }

            /* renamed from: a */
            public C2258a mo8128a(C2256s sVar) {
                if (sVar == C2256s.m10879a()) {
                    return this;
                }
                if (!sVar.f6908f.isEmpty()) {
                    if (this.f6916b.isEmpty()) {
                        this.f6916b = sVar.f6908f;
                        this.f6915a &= -2;
                    } else {
                        m10918s();
                        this.f6916b.addAll(sVar.f6908f);
                    }
                }
                if (!sVar.f6909g.isEmpty()) {
                    if (this.f6917c.isEmpty()) {
                        this.f6917c = sVar.f6909g;
                        this.f6915a &= -3;
                    } else {
                        m10919t();
                        this.f6917c.addAll(sVar.f6909g);
                    }
                }
                if (!sVar.f6910h.isEmpty()) {
                    if (this.f6918d.isEmpty()) {
                        this.f6918d = sVar.f6910h;
                        this.f6915a &= -5;
                    } else {
                        m10920v();
                        this.f6918d.addAll(sVar.f6910h);
                    }
                }
                if (sVar.mo8683l()) {
                    mo8691a(sVar.mo8684p());
                }
                if (sVar.mo8685q()) {
                    mo8692a(sVar.mo8686r());
                }
                mo9200a(sVar);
                mo9198a(mo9199x().mo9075a(sVar.f6906d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                for (int i = 0; i < mo8699e(); i++) {
                    if (!mo8690a(i).mo8106h()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < mo8700f(); i2++) {
                    if (!mo8695b(i2).mo8106h()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < mo8701g(); i3++) {
                    if (!mo8696c(i3).mo8106h()) {
                        return false;
                    }
                }
                if ((!mo8702m() || mo8703n().mo8106h()) && mo9201y()) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public C2258a mo8132c(C2374e eVar, C2378g gVar) {
                C2256s sVar;
                C2256s sVar2 = null;
                try {
                    C2256s sVar3 = (C2256s) C2256s.f6904a.mo8114b(eVar, gVar);
                    if (sVar3 != null) {
                        mo8128a(sVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    sVar = (C2256s) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    sVar2 = sVar;
                }
                if (sVar2 != null) {
                    mo8128a(sVar2);
                }
                throw th;
            }

            /* renamed from: s */
            private void m10918s() {
                if ((this.f6915a & 1) != 1) {
                    this.f6916b = new ArrayList(this.f6916b);
                    this.f6915a |= 1;
                }
            }

            /* renamed from: e */
            public int mo8699e() {
                return this.f6916b.size();
            }

            /* renamed from: a */
            public C2248o mo8690a(int i) {
                return (C2248o) this.f6916b.get(i);
            }

            /* renamed from: t */
            private void m10919t() {
                if ((this.f6915a & 2) != 2) {
                    this.f6917c = new ArrayList(this.f6917c);
                    this.f6915a |= 2;
                }
            }

            /* renamed from: f */
            public int mo8700f() {
                return this.f6917c.size();
            }

            /* renamed from: b */
            public C2260u mo8695b(int i) {
                return (C2260u) this.f6917c.get(i);
            }

            /* renamed from: v */
            private void m10920v() {
                if ((this.f6915a & 4) != 4) {
                    this.f6918d = new ArrayList(this.f6918d);
                    this.f6915a |= 4;
                }
            }

            /* renamed from: g */
            public int mo8701g() {
                return this.f6918d.size();
            }

            /* renamed from: c */
            public C2182ab mo8696c(int i) {
                return (C2182ab) this.f6918d.get(i);
            }

            /* renamed from: m */
            public boolean mo8702m() {
                return (this.f6915a & 8) == 8;
            }

            /* renamed from: n */
            public C2193ag mo8703n() {
                return this.f6919e;
            }

            /* renamed from: a */
            public C2258a mo8691a(C2193ag agVar) {
                if ((this.f6915a & 8) != 8 || this.f6919e == C2193ag.m10126a()) {
                    this.f6919e = agVar;
                } else {
                    this.f6919e = C2193ag.m10125a(this.f6919e).mo8128a(agVar).mo8369d();
                }
                this.f6915a |= 8;
                return this;
            }

            /* renamed from: a */
            public C2258a mo8692a(C2209am amVar) {
                if ((this.f6915a & 16) != 16 || this.f6920f == C2209am.m10307a()) {
                    this.f6920f = amVar;
                } else {
                    this.f6920f = C2209am.m10306a(this.f6920f).mo8128a(amVar).mo8443d();
                }
                this.f6915a |= 16;
                return this;
            }
        }

        private C2256s(C2386b<C2256s, ?> bVar) {
            super(bVar);
            this.f6913k = -1;
            this.f6914l = -1;
            this.f6906d = bVar.mo9199x();
        }

        private C2256s(boolean z) {
            this.f6913k = -1;
            this.f6914l = -1;
            this.f6906d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2256s m10879a() {
            return f6905c;
        }

        /* renamed from: b */
        public C2256s mo8112o() {
            return f6905c;
        }

        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v1, types: [b.h.b.a.b.e.a$ag$a] */
        /* JADX WARNING: type inference failed for: r9v2, types: [b.h.b.a.b.e.a$ag$a] */
        /* JADX WARNING: type inference failed for: r9v3, types: [b.h.b.a.b.e.a$am$a] */
        /* JADX WARNING: type inference failed for: r9v4, types: [b.h.b.a.b.e.a$am$a] */
        /* JADX WARNING: type inference failed for: r9v5 */
        /* JADX WARNING: type inference failed for: r9v6 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], b.h.b.a.b.e.a$am$a, b.h.b.a.b.e.a$ag$a]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], b.h.b.a.b.e.a$ag$a, b.h.b.a.b.e.a$am$a]
          mth insns count: 144
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2256s(p073b.p085h.p087b.p088a.p090b.p117g.C2374e r11, p073b.p085h.p087b.p088a.p090b.p117g.C2378g r12) {
            /*
                r10 = this;
                r10.<init>()
                r0 = -1
                r10.f6913k = r0
                r10.f6914l = r0
                r10.m10889v()
                b.h.b.a.b.g.d$b r0 = p073b.p085h.p087b.p088a.p090b.p117g.C2371d.m11743i()
                r1 = 1
                b.h.b.a.b.g.f r2 = p073b.p085h.p087b.p088a.p090b.p117g.C2376f.m11817a(r0, r1)
                r3 = 0
                r4 = 0
            L_0x0016:
                r5 = 4
                r6 = 2
                if (r3 != 0) goto L_0x012f
                int r7 = r11.mo9095a()     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                if (r7 == 0) goto L_0x00db
                r8 = 26
                if (r7 == r8) goto L_0x00c1
                r8 = 34
                if (r7 == r8) goto L_0x00a7
                r8 = 42
                if (r7 == r8) goto L_0x008d
                r8 = 242(0xf2, float:3.39E-43)
                r9 = 0
                if (r7 == r8) goto L_0x0065
                r8 = 258(0x102, float:3.62E-43)
                if (r7 == r8) goto L_0x003d
                boolean r7 = r10.mo9197a(r11, r2, r12, r7)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                if (r7 != 0) goto L_0x0016
                goto L_0x00db
            L_0x003d:
                int r7 = r10.f6907e     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7 = r7 & r6
                if (r7 != r6) goto L_0x0048
                b.h.b.a.b.e.a$am r7 = r10.f6912j     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.e.a$am$a r9 = r7.mo8110m()     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
            L_0x0048:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$am> r7 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2209am.f6706a     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.g.q r7 = r11.mo9096a(r7, r12)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.e.a$am r7 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2209am) r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r10.f6912j = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                if (r9 == 0) goto L_0x005f
                b.h.b.a.b.e.a$am r7 = r10.f6912j     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r9.mo8128a(r7)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.e.a$am r7 = r9.mo8443d()     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r10.f6912j = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
            L_0x005f:
                int r7 = r10.f6907e     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7 = r7 | r6
                r10.f6907e = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                goto L_0x0016
            L_0x0065:
                int r7 = r10.f6907e     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7 = r7 & r1
                if (r7 != r1) goto L_0x0070
                b.h.b.a.b.e.a$ag r7 = r10.f6911i     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.e.a$ag$a r9 = r7.mo8110m()     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
            L_0x0070:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ag> r7 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag.f6645a     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.g.q r7 = r11.mo9096a(r7, r12)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.e.a$ag r7 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2193ag) r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r10.f6911i = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                if (r9 == 0) goto L_0x0087
                b.h.b.a.b.e.a$ag r7 = r10.f6911i     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r9.mo8128a(r7)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.e.a$ag r7 = r9.mo8369d()     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r10.f6911i = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
            L_0x0087:
                int r7 = r10.f6907e     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7 = r7 | r1
                r10.f6907e = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                goto L_0x0016
            L_0x008d:
                r7 = r4 & 4
                if (r7 == r5) goto L_0x009a
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7.<init>()     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r10.f6910h = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r4 = r4 | 4
            L_0x009a:
                java.util.List<b.h.b.a.b.e.a$ab> r7 = r10.f6910h     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ab> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2182ab.f6594a     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.g.q r8 = r11.mo9096a(r8, r12)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7.add(r8)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                goto L_0x0016
            L_0x00a7:
                r7 = r4 & 2
                if (r7 == r6) goto L_0x00b4
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7.<init>()     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r10.f6909g = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r4 = r4 | 2
            L_0x00b4:
                java.util.List<b.h.b.a.b.e.a$u> r7 = r10.f6909g     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$u> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2260u.f6921a     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.g.q r8 = r11.mo9096a(r8, r12)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7.add(r8)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                goto L_0x0016
            L_0x00c1:
                r7 = r4 & 1
                if (r7 == r1) goto L_0x00ce
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7.<init>()     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r10.f6908f = r7     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r4 = r4 | 1
            L_0x00ce:
                java.util.List<b.h.b.a.b.e.a$o> r7 = r10.f6908f     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$o> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2248o.f6859a     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                b.h.b.a.b.g.q r8 = r11.mo9096a(r8, r12)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                r7.add(r8)     // Catch:{ k -> 0x00ef, IOException -> 0x00e0 }
                goto L_0x0016
            L_0x00db:
                r3 = 1
                goto L_0x0016
            L_0x00de:
                r11 = move-exception
                goto L_0x00f5
            L_0x00e0:
                r11 = move-exception
                b.h.b.a.b.g.k r12 = new b.h.b.a.b.g.k     // Catch:{ all -> 0x00de }
                java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00de }
                r12.<init>(r11)     // Catch:{ all -> 0x00de }
                b.h.b.a.b.g.k r11 = r12.mo9219a(r10)     // Catch:{ all -> 0x00de }
                throw r11     // Catch:{ all -> 0x00de }
            L_0x00ef:
                r11 = move-exception
                b.h.b.a.b.g.k r11 = r11.mo9219a(r10)     // Catch:{ all -> 0x00de }
                throw r11     // Catch:{ all -> 0x00de }
            L_0x00f5:
                r12 = r4 & 1
                if (r12 != r1) goto L_0x0101
                java.util.List<b.h.b.a.b.e.a$o> r12 = r10.f6908f
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.f6908f = r12
            L_0x0101:
                r12 = r4 & 2
                if (r12 != r6) goto L_0x010d
                java.util.List<b.h.b.a.b.e.a$u> r12 = r10.f6909g
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.f6909g = r12
            L_0x010d:
                r12 = r4 & 4
                if (r12 != r5) goto L_0x0119
                java.util.List<b.h.b.a.b.e.a$ab> r12 = r10.f6910h
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.f6910h = r12
            L_0x0119:
                r2.mo9131a()     // Catch:{ IOException -> 0x011c, all -> 0x0123 }
            L_0x011c:
                b.h.b.a.b.g.d r12 = r0.mo9090a()
                r10.f6906d = r12
                goto L_0x012b
            L_0x0123:
                r11 = move-exception
                b.h.b.a.b.g.d r12 = r0.mo9090a()
                r10.f6906d = r12
                throw r11
            L_0x012b:
                r10.mo9196O()
                throw r11
            L_0x012f:
                r11 = r4 & 1
                if (r11 != r1) goto L_0x013b
                java.util.List<b.h.b.a.b.e.a$o> r11 = r10.f6908f
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.f6908f = r11
            L_0x013b:
                r11 = r4 & 2
                if (r11 != r6) goto L_0x0147
                java.util.List<b.h.b.a.b.e.a$u> r11 = r10.f6909g
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.f6909g = r11
            L_0x0147:
                r11 = r4 & 4
                if (r11 != r5) goto L_0x0153
                java.util.List<b.h.b.a.b.e.a$ab> r11 = r10.f6910h
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.f6910h = r11
            L_0x0153:
                r2.mo9131a()     // Catch:{ IOException -> 0x0156, all -> 0x015d }
            L_0x0156:
                b.h.b.a.b.g.d r11 = r0.mo9090a()
                r10.f6906d = r11
                goto L_0x0165
            L_0x015d:
                r11 = move-exception
                b.h.b.a.b.g.d r12 = r0.mo9090a()
                r10.f6906d = r12
                throw r11
            L_0x0165:
                r10.mo9196O()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2256s.<init>(b.h.b.a.b.g.e, b.h.b.a.b.g.g):void");
        }

        static {
            f6905c.m10889v();
        }

        /* renamed from: c */
        public C2409s<C2256s> mo8101c() {
            return f6904a;
        }

        /* renamed from: d */
        public List<C2248o> mo8677d() {
            return this.f6908f;
        }

        /* renamed from: e */
        public int mo8678e() {
            return this.f6908f.size();
        }

        /* renamed from: a */
        public C2248o mo8673a(int i) {
            return (C2248o) this.f6908f.get(i);
        }

        /* renamed from: f */
        public List<C2260u> mo8679f() {
            return this.f6909g;
        }

        /* renamed from: g */
        public int mo8680g() {
            return this.f6909g.size();
        }

        /* renamed from: b */
        public C2260u mo8675b(int i) {
            return (C2260u) this.f6909g.get(i);
        }

        /* renamed from: j */
        public List<C2182ab> mo8681j() {
            return this.f6910h;
        }

        /* renamed from: k */
        public int mo8682k() {
            return this.f6910h.size();
        }

        /* renamed from: c */
        public C2182ab mo8676c(int i) {
            return (C2182ab) this.f6910h.get(i);
        }

        /* renamed from: l */
        public boolean mo8683l() {
            return (this.f6907e & 1) == 1;
        }

        /* renamed from: p */
        public C2193ag mo8684p() {
            return this.f6911i;
        }

        /* renamed from: q */
        public boolean mo8685q() {
            return (this.f6907e & 2) == 2;
        }

        /* renamed from: r */
        public C2209am mo8686r() {
            return this.f6912j;
        }

        /* renamed from: v */
        private void m10889v() {
            this.f6908f = Collections.emptyList();
            this.f6909g = Collections.emptyList();
            this.f6910h = Collections.emptyList();
            this.f6911i = C2193ag.m10126a();
            this.f6912j = C2209am.m10307a();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6913k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < mo8678e(); i++) {
                if (!mo8673a(i).mo8106h()) {
                    this.f6913k = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo8680g(); i2++) {
                if (!mo8675b(i2).mo8106h()) {
                    this.f6913k = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < mo8682k(); i3++) {
                if (!mo8676c(i3).mo8106h()) {
                    this.f6913k = 0;
                    return false;
                }
            }
            if (mo8683l() && !mo8684p().mo8106h()) {
                this.f6913k = 0;
                return false;
            } else if (!mo9202P()) {
                this.f6913k = 0;
                return false;
            } else {
                this.f6913k = 1;
                return true;
            }
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            for (int i = 0; i < this.f6908f.size(); i++) {
                fVar.mo9152b(3, (C2406q) this.f6908f.get(i));
            }
            for (int i2 = 0; i2 < this.f6909g.size(); i2++) {
                fVar.mo9152b(4, (C2406q) this.f6909g.get(i2));
            }
            for (int i3 = 0; i3 < this.f6910h.size(); i3++) {
                fVar.mo9152b(5, (C2406q) this.f6910h.get(i3));
            }
            if ((this.f6907e & 1) == 1) {
                fVar.mo9152b(30, (C2406q) this.f6911i);
            }
            if ((this.f6907e & 2) == 2) {
                fVar.mo9152b(32, (C2406q) this.f6912j);
            }
            Q.mo9209a(200, fVar);
            fVar.mo9159c(this.f6906d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6914l;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f6908f.size(); i3++) {
                i2 += C2376f.m11832d(3, (C2406q) this.f6908f.get(i3));
            }
            for (int i4 = 0; i4 < this.f6909g.size(); i4++) {
                i2 += C2376f.m11832d(4, (C2406q) this.f6909g.get(i4));
            }
            for (int i5 = 0; i5 < this.f6910h.size(); i5++) {
                i2 += C2376f.m11832d(5, (C2406q) this.f6910h.get(i5));
            }
            if ((this.f6907e & 1) == 1) {
                i2 += C2376f.m11832d(30, (C2406q) this.f6911i);
            }
            if ((this.f6907e & 2) == 2) {
                i2 += C2376f.m11832d(32, (C2406q) this.f6912j);
            }
            int R = i2 + mo9204R() + this.f6906d.mo9064a();
            this.f6914l = R;
            return R;
        }

        /* renamed from: a */
        public static C2256s m10880a(InputStream inputStream, C2378g gVar) {
            return (C2256s) f6904a.mo9062f(inputStream, gVar);
        }

        /* renamed from: s */
        public static C2258a m10888s() {
            return C2258a.m10917r();
        }

        /* renamed from: t */
        public C2258a mo8111n() {
            return m10888s();
        }

        /* renamed from: a */
        public static C2258a m10878a(C2256s sVar) {
            return m10888s().mo8128a(sVar);
        }

        /* renamed from: u */
        public C2258a mo8110m() {
            return m10878a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$t */
    public interface C2259t extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$u */
    /* compiled from: ProtoBuf */
    public static final class C2260u extends C2387c<C2260u> implements C2263v {

        /* renamed from: a */
        public static C2409s<C2260u> f6921a = new C2367b<C2260u>() {
            /* renamed from: a */
            public C2260u mo8114b(C2374e eVar, C2378g gVar) {
                return new C2260u(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2260u f6922c = new C2260u(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6923d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f6924e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f6925f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f6926g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f6927h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2173aa f6928i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f6929j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public List<C2187ae> f6930k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C2173aa f6931l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f6932m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public C2197ai f6933n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f6934o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f6935p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public List<Integer> f6936q;

        /* renamed from: r */
        private byte f6937r;

        /* renamed from: s */
        private int f6938s;

        /* renamed from: b.h.b.a.b.e.a$u$a */
        /* compiled from: ProtoBuf */
        public static final class C2262a extends C2386b<C2260u, C2262a> implements C2263v {

            /* renamed from: a */
            private int f6939a;

            /* renamed from: b */
            private int f6940b = 518;

            /* renamed from: c */
            private int f6941c = 2054;

            /* renamed from: d */
            private int f6942d;

            /* renamed from: e */
            private C2173aa f6943e = C2173aa.m9813a();

            /* renamed from: f */
            private int f6944f;

            /* renamed from: g */
            private List<C2187ae> f6945g = Collections.emptyList();

            /* renamed from: h */
            private C2173aa f6946h = C2173aa.m9813a();

            /* renamed from: i */
            private int f6947i;

            /* renamed from: j */
            private C2197ai f6948j = C2197ai.m10175a();

            /* renamed from: k */
            private int f6949k;

            /* renamed from: l */
            private int f6950l;

            /* renamed from: m */
            private List<Integer> f6951m = Collections.emptyList();

            /* renamed from: t */
            private void m11004t() {
            }

            private C2262a() {
                m11004t();
            }

            /* access modifiers changed from: private */
            /* renamed from: v */
            public static C2262a m11005v() {
                return new C2262a();
            }

            /* renamed from: a */
            public C2262a mo8281u() {
                return m11005v().mo8128a(mo8742d());
            }

            /* renamed from: b */
            public C2260u mo8112o() {
                return C2260u.m10953a();
            }

            /* renamed from: c */
            public C2260u mo8141l() {
                C2260u d = mo8742d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2260u mo8742d() {
                C2260u uVar = new C2260u((C2386b) this);
                int i = this.f6939a;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                uVar.f6925f = this.f6940b;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                uVar.f6926g = this.f6941c;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                uVar.f6927h = this.f6942d;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                uVar.f6928i = this.f6943e;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                uVar.f6929j = this.f6944f;
                if ((this.f6939a & 32) == 32) {
                    this.f6945g = Collections.unmodifiableList(this.f6945g);
                    this.f6939a &= -33;
                }
                uVar.f6930k = this.f6945g;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                uVar.f6931l = this.f6946h;
                if ((i & Allocation.USAGE_SHARED) == 128) {
                    i2 |= 64;
                }
                uVar.f6932m = this.f6947i;
                if ((i & 256) == 256) {
                    i2 |= Allocation.USAGE_SHARED;
                }
                uVar.f6933n = this.f6948j;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                uVar.f6934o = this.f6949k;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                uVar.f6935p = this.f6950l;
                if ((this.f6939a & 2048) == 2048) {
                    this.f6951m = Collections.unmodifiableList(this.f6951m);
                    this.f6939a &= -2049;
                }
                uVar.f6936q = this.f6951m;
                uVar.f6924e = i2;
                return uVar;
            }

            /* renamed from: a */
            public C2262a mo8128a(C2260u uVar) {
                if (uVar == C2260u.m10953a()) {
                    return this;
                }
                if (uVar.mo8713d()) {
                    mo8732a(uVar.mo8714e());
                }
                if (uVar.mo8715f()) {
                    mo8737b(uVar.mo8716g());
                }
                if (uVar.mo8717j()) {
                    mo8739c(uVar.mo8718k());
                }
                if (uVar.mo8719l()) {
                    mo8733a(uVar.mo8720p());
                }
                if (uVar.mo8721q()) {
                    mo8741d(uVar.mo8722r());
                }
                if (!uVar.f6930k.isEmpty()) {
                    if (this.f6945g.isEmpty()) {
                        this.f6945g = uVar.f6930k;
                        this.f6939a &= -33;
                    } else {
                        m11006w();
                        this.f6945g.addAll(uVar.f6930k);
                    }
                }
                if (uVar.mo8725u()) {
                    mo8738b(uVar.mo8726v());
                }
                if (uVar.mo8727w()) {
                    mo8745f(uVar.mo8728x());
                }
                if (uVar.mo8729y()) {
                    mo8734a(uVar.mo8730z());
                }
                if (uVar.mo8704A()) {
                    mo8748g(uVar.mo8705B());
                }
                if (uVar.mo8706C()) {
                    mo8749h(uVar.mo8707D());
                }
                if (!uVar.f6936q.isEmpty()) {
                    if (this.f6951m.isEmpty()) {
                        this.f6951m = uVar.f6936q;
                        this.f6939a &= -2049;
                    } else {
                        m11007z();
                        this.f6951m.addAll(uVar.f6936q);
                    }
                }
                mo9200a(uVar);
                mo9198a(mo9199x().mo9075a(uVar.f6923d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                if (!mo8744e()) {
                    return false;
                }
                if (mo8746f() && !mo8747g().mo8106h()) {
                    return false;
                }
                for (int i = 0; i < mo8750m(); i++) {
                    if (!mo8743e(i).mo8106h()) {
                        return false;
                    }
                }
                if (mo8751n() && !mo8752p().mo8106h()) {
                    return false;
                }
                if ((!mo8753q() || mo8754r().mo8106h()) && mo9201y()) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public C2262a mo8132c(C2374e eVar, C2378g gVar) {
                C2260u uVar;
                C2260u uVar2 = null;
                try {
                    C2260u uVar3 = (C2260u) C2260u.f6921a.mo8114b(eVar, gVar);
                    if (uVar3 != null) {
                        mo8128a(uVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    uVar = (C2260u) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    uVar2 = uVar;
                }
                if (uVar2 != null) {
                    mo8128a(uVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C2262a mo8732a(int i) {
                this.f6939a |= 1;
                this.f6940b = i;
                return this;
            }

            /* renamed from: b */
            public C2262a mo8737b(int i) {
                this.f6939a |= 2;
                this.f6941c = i;
                return this;
            }

            /* renamed from: e */
            public boolean mo8744e() {
                return (this.f6939a & 4) == 4;
            }

            /* renamed from: c */
            public C2262a mo8739c(int i) {
                this.f6939a |= 4;
                this.f6942d = i;
                return this;
            }

            /* renamed from: f */
            public boolean mo8746f() {
                return (this.f6939a & 8) == 8;
            }

            /* renamed from: g */
            public C2173aa mo8747g() {
                return this.f6943e;
            }

            /* renamed from: a */
            public C2262a mo8733a(C2173aa aaVar) {
                if ((this.f6939a & 8) != 8 || this.f6943e == C2173aa.m9813a()) {
                    this.f6943e = aaVar;
                } else {
                    this.f6943e = C2173aa.m9812a(this.f6943e).mo8128a(aaVar).mo8267d();
                }
                this.f6939a |= 8;
                return this;
            }

            /* renamed from: d */
            public C2262a mo8741d(int i) {
                this.f6939a |= 16;
                this.f6944f = i;
                return this;
            }

            /* renamed from: w */
            private void m11006w() {
                if ((this.f6939a & 32) != 32) {
                    this.f6945g = new ArrayList(this.f6945g);
                    this.f6939a |= 32;
                }
            }

            /* renamed from: m */
            public int mo8750m() {
                return this.f6945g.size();
            }

            /* renamed from: e */
            public C2187ae mo8743e(int i) {
                return (C2187ae) this.f6945g.get(i);
            }

            /* renamed from: n */
            public boolean mo8751n() {
                return (this.f6939a & 64) == 64;
            }

            /* renamed from: p */
            public C2173aa mo8752p() {
                return this.f6946h;
            }

            /* renamed from: b */
            public C2262a mo8738b(C2173aa aaVar) {
                if ((this.f6939a & 64) != 64 || this.f6946h == C2173aa.m9813a()) {
                    this.f6946h = aaVar;
                } else {
                    this.f6946h = C2173aa.m9812a(this.f6946h).mo8128a(aaVar).mo8267d();
                }
                this.f6939a |= 64;
                return this;
            }

            /* renamed from: f */
            public C2262a mo8745f(int i) {
                this.f6939a |= Allocation.USAGE_SHARED;
                this.f6947i = i;
                return this;
            }

            /* renamed from: q */
            public boolean mo8753q() {
                return (this.f6939a & 256) == 256;
            }

            /* renamed from: r */
            public C2197ai mo8754r() {
                return this.f6948j;
            }

            /* renamed from: a */
            public C2262a mo8734a(C2197ai aiVar) {
                if ((this.f6939a & 256) != 256 || this.f6948j == C2197ai.m10175a()) {
                    this.f6948j = aiVar;
                } else {
                    this.f6948j = C2197ai.m10174a(this.f6948j).mo8128a(aiVar).mo8396d();
                }
                this.f6939a |= 256;
                return this;
            }

            /* renamed from: g */
            public C2262a mo8748g(int i) {
                this.f6939a |= 512;
                this.f6949k = i;
                return this;
            }

            /* renamed from: h */
            public C2262a mo8749h(int i) {
                this.f6939a |= 1024;
                this.f6950l = i;
                return this;
            }

            /* renamed from: z */
            private void m11007z() {
                if ((this.f6939a & 2048) != 2048) {
                    this.f6951m = new ArrayList(this.f6951m);
                    this.f6939a |= 2048;
                }
            }
        }

        private C2260u(C2386b<C2260u, ?> bVar) {
            super(bVar);
            this.f6937r = -1;
            this.f6938s = -1;
            this.f6923d = bVar.mo9199x();
        }

        private C2260u(boolean z) {
            this.f6937r = -1;
            this.f6938s = -1;
            this.f6923d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2260u m10953a() {
            return f6922c;
        }

        /* renamed from: b */
        public C2260u mo8112o() {
            return f6922c;
        }

        /* JADX WARNING: type inference failed for: r8v0 */
        /* JADX WARNING: type inference failed for: r8v1, types: [b.h.b.a.b.e.a$aa$c] */
        /* JADX WARNING: type inference failed for: r8v2, types: [b.h.b.a.b.e.a$aa$c] */
        /* JADX WARNING: type inference failed for: r8v5, types: [b.h.b.a.b.e.a$aa$c] */
        /* JADX WARNING: type inference failed for: r8v6, types: [b.h.b.a.b.e.a$aa$c] */
        /* JADX WARNING: type inference failed for: r8v7, types: [b.h.b.a.b.e.a$ai$a] */
        /* JADX WARNING: type inference failed for: r8v8, types: [b.h.b.a.b.e.a$ai$a] */
        /* JADX WARNING: type inference failed for: r8v16 */
        /* JADX WARNING: type inference failed for: r8v17 */
        /* JADX WARNING: type inference failed for: r8v18 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r8v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], b.h.b.a.b.e.a$aa$c, b.h.b.a.b.e.a$ai$a]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], b.h.b.a.b.e.a$aa$c, b.h.b.a.b.e.a$ai$a]
          mth insns count: 198
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2260u(p073b.p085h.p087b.p088a.p090b.p117g.C2374e r11, p073b.p085h.p087b.p088a.p090b.p117g.C2378g r12) {
            /*
                r10 = this;
                r10.<init>()
                r0 = -1
                r10.f6937r = r0
                r10.f6938s = r0
                r10.m10948I()
                b.h.b.a.b.g.d$b r0 = p073b.p085h.p087b.p088a.p090b.p117g.C2371d.m11743i()
                r1 = 1
                b.h.b.a.b.g.f r2 = p073b.p085h.p087b.p088a.p090b.p117g.C2376f.m11817a(r0, r1)
                r3 = 0
                r4 = 0
            L_0x0016:
                r5 = 2048(0x800, float:2.87E-42)
                r6 = 32
                if (r3 != 0) goto L_0x01bb
                int r7 = r11.mo9095a()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r8 = 0
                switch(r7) {
                    case 0: goto L_0x0170;
                    case 8: goto L_0x0162;
                    case 16: goto L_0x0154;
                    case 26: goto L_0x0129;
                    case 34: goto L_0x010f;
                    case 42: goto L_0x00e6;
                    case 50: goto L_0x00bb;
                    case 56: goto L_0x00ad;
                    case 64: goto L_0x009f;
                    case 72: goto L_0x0091;
                    case 80: goto L_0x0084;
                    case 88: goto L_0x0078;
                    case 248: goto L_0x005d;
                    case 250: goto L_0x002a;
                    default: goto L_0x0024;
                }     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
            L_0x0024:
                boolean r7 = r10.mo9197a(r11, r2, r12, r7)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0173
            L_0x002a:
                int r7 = r11.mo9122s()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r7 = r11.mo9104c(r7)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r8 = r4 & 2048(0x800, float:2.87E-42)
                if (r8 == r5) goto L_0x0045
                int r8 = r11.mo9127x()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                if (r8 <= 0) goto L_0x0045
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r8.<init>()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6936q = r8     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r4 = r4 | 2048(0x800, float:2.87E-42)
            L_0x0045:
                int r8 = r11.mo9127x()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                if (r8 <= 0) goto L_0x0059
                java.util.List<java.lang.Integer> r8 = r10.f6936q     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r9 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r8.add(r9)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0045
            L_0x0059:
                r11.mo9106d(r7)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x005d:
                r7 = r4 & 2048(0x800, float:2.87E-42)
                if (r7 == r5) goto L_0x006a
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7.<init>()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6936q = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r4 = r4 | 2048(0x800, float:2.87E-42)
            L_0x006a:
                java.util.List<java.lang.Integer> r7 = r10.f6936q     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r8 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7.add(r8)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x0078:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | r1
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r7 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6925f = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x0084:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | 64
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r7 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6932m = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x0091:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | 16
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r7 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6929j = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x009f:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | 512(0x200, float:7.175E-43)
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r7 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6935p = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x00ad:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | 256(0x100, float:3.59E-43)
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r7 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6934o = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x00bb:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r9 = 128(0x80, float:1.794E-43)
                r7 = r7 & r9
                if (r7 != r9) goto L_0x00c8
                b.h.b.a.b.e.a$ai r7 = r10.f6933n     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$ai$a r8 = r7.mo8110m()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
            L_0x00c8:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ai> r7 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2197ai.f6656a     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.g.q r7 = r11.mo9096a(r7, r12)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$ai r7 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2197ai) r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6933n = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                if (r8 == 0) goto L_0x00df
                b.h.b.a.b.e.a$ai r7 = r10.f6933n     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r8.mo8128a(r7)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$ai r7 = r8.mo8396d()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6933n = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
            L_0x00df:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | r9
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x00e6:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 & r6
                if (r7 != r6) goto L_0x00f1
                b.h.b.a.b.e.a$aa r7 = r10.f6931l     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$aa$c r8 = r7.mo8110m()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
            L_0x00f1:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$aa> r7 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa.f6539a     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.g.q r7 = r11.mo9096a(r7, r12)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$aa r7 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa) r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6931l = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                if (r8 == 0) goto L_0x0108
                b.h.b.a.b.e.a$aa r7 = r10.f6931l     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r8.mo8128a(r7)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$aa r7 = r8.mo8267d()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6931l = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
            L_0x0108:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | r6
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x010f:
                r7 = r4 & 32
                if (r7 == r6) goto L_0x011c
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7.<init>()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6930k = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r4 = r4 | 32
            L_0x011c:
                java.util.List<b.h.b.a.b.e.a$ae> r7 = r10.f6930k     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$ae> r8 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2187ae.f6619a     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.g.q r8 = r11.mo9096a(r8, r12)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7.add(r8)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x0129:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r9 = 8
                r7 = r7 & r9
                if (r7 != r9) goto L_0x0136
                b.h.b.a.b.e.a$aa r7 = r10.f6928i     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$aa$c r8 = r7.mo8110m()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
            L_0x0136:
                b.h.b.a.b.g.s<b.h.b.a.b.e.a$aa> r7 = p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa.f6539a     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.g.q r7 = r11.mo9096a(r7, r12)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$aa r7 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2173aa) r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6928i = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                if (r8 == 0) goto L_0x014d
                b.h.b.a.b.e.a$aa r7 = r10.f6928i     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r8.mo8128a(r7)     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                b.h.b.a.b.e.a$aa r7 = r8.mo8267d()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6928i = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
            L_0x014d:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | r9
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x0154:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | 4
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r7 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6927h = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x0162:
                int r7 = r10.f6924e     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r7 = r7 | 2
                r10.f6924e = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                int r7 = r11.mo9109f()     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                r10.f6926g = r7     // Catch:{ k -> 0x0187, IOException -> 0x0178 }
                goto L_0x0016
            L_0x0170:
                r3 = 1
                goto L_0x0016
            L_0x0173:
                if (r7 != 0) goto L_0x0016
                goto L_0x0170
            L_0x0176:
                r11 = move-exception
                goto L_0x018d
            L_0x0178:
                r11 = move-exception
                b.h.b.a.b.g.k r12 = new b.h.b.a.b.g.k     // Catch:{ all -> 0x0176 }
                java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0176 }
                r12.<init>(r11)     // Catch:{ all -> 0x0176 }
                b.h.b.a.b.g.k r11 = r12.mo9219a(r10)     // Catch:{ all -> 0x0176 }
                throw r11     // Catch:{ all -> 0x0176 }
            L_0x0187:
                r11 = move-exception
                b.h.b.a.b.g.k r11 = r11.mo9219a(r10)     // Catch:{ all -> 0x0176 }
                throw r11     // Catch:{ all -> 0x0176 }
            L_0x018d:
                r12 = r4 & 32
                if (r12 != r6) goto L_0x0199
                java.util.List<b.h.b.a.b.e.a$ae> r12 = r10.f6930k
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.f6930k = r12
            L_0x0199:
                r12 = r4 & 2048(0x800, float:2.87E-42)
                if (r12 != r5) goto L_0x01a5
                java.util.List<java.lang.Integer> r12 = r10.f6936q
                java.util.List r12 = java.util.Collections.unmodifiableList(r12)
                r10.f6936q = r12
            L_0x01a5:
                r2.mo9131a()     // Catch:{ IOException -> 0x01a8, all -> 0x01af }
            L_0x01a8:
                b.h.b.a.b.g.d r12 = r0.mo9090a()
                r10.f6923d = r12
                goto L_0x01b7
            L_0x01af:
                r11 = move-exception
                b.h.b.a.b.g.d r12 = r0.mo9090a()
                r10.f6923d = r12
                throw r11
            L_0x01b7:
                r10.mo9196O()
                throw r11
            L_0x01bb:
                r11 = r4 & 32
                if (r11 != r6) goto L_0x01c7
                java.util.List<b.h.b.a.b.e.a$ae> r11 = r10.f6930k
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.f6930k = r11
            L_0x01c7:
                r11 = r4 & 2048(0x800, float:2.87E-42)
                if (r11 != r5) goto L_0x01d3
                java.util.List<java.lang.Integer> r11 = r10.f6936q
                java.util.List r11 = java.util.Collections.unmodifiableList(r11)
                r10.f6936q = r11
            L_0x01d3:
                r2.mo9131a()     // Catch:{ IOException -> 0x01d6, all -> 0x01dd }
            L_0x01d6:
                b.h.b.a.b.g.d r11 = r0.mo9090a()
                r10.f6923d = r11
                goto L_0x01e5
            L_0x01dd:
                r11 = move-exception
                b.h.b.a.b.g.d r12 = r0.mo9090a()
                r10.f6923d = r12
                throw r11
            L_0x01e5:
                r10.mo9196O()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2260u.<init>(b.h.b.a.b.g.e, b.h.b.a.b.g.g):void");
        }

        static {
            f6922c.m10948I();
        }

        /* renamed from: c */
        public C2409s<C2260u> mo8101c() {
            return f6921a;
        }

        /* renamed from: d */
        public boolean mo8713d() {
            return (this.f6924e & 1) == 1;
        }

        /* renamed from: e */
        public int mo8714e() {
            return this.f6925f;
        }

        /* renamed from: f */
        public boolean mo8715f() {
            return (this.f6924e & 2) == 2;
        }

        /* renamed from: g */
        public int mo8716g() {
            return this.f6926g;
        }

        /* renamed from: j */
        public boolean mo8717j() {
            return (this.f6924e & 4) == 4;
        }

        /* renamed from: k */
        public int mo8718k() {
            return this.f6927h;
        }

        /* renamed from: l */
        public boolean mo8719l() {
            return (this.f6924e & 8) == 8;
        }

        /* renamed from: p */
        public C2173aa mo8720p() {
            return this.f6928i;
        }

        /* renamed from: q */
        public boolean mo8721q() {
            return (this.f6924e & 16) == 16;
        }

        /* renamed from: r */
        public int mo8722r() {
            return this.f6929j;
        }

        /* renamed from: s */
        public List<C2187ae> mo8723s() {
            return this.f6930k;
        }

        /* renamed from: t */
        public int mo8724t() {
            return this.f6930k.size();
        }

        /* renamed from: a */
        public C2187ae mo8711a(int i) {
            return (C2187ae) this.f6930k.get(i);
        }

        /* renamed from: u */
        public boolean mo8725u() {
            return (this.f6924e & 32) == 32;
        }

        /* renamed from: v */
        public C2173aa mo8726v() {
            return this.f6931l;
        }

        /* renamed from: w */
        public boolean mo8727w() {
            return (this.f6924e & 64) == 64;
        }

        /* renamed from: x */
        public int mo8728x() {
            return this.f6932m;
        }

        /* renamed from: y */
        public boolean mo8729y() {
            return (this.f6924e & Allocation.USAGE_SHARED) == 128;
        }

        /* renamed from: z */
        public C2197ai mo8730z() {
            return this.f6933n;
        }

        /* renamed from: A */
        public boolean mo8704A() {
            return (this.f6924e & 256) == 256;
        }

        /* renamed from: B */
        public int mo8705B() {
            return this.f6934o;
        }

        /* renamed from: C */
        public boolean mo8706C() {
            return (this.f6924e & 512) == 512;
        }

        /* renamed from: D */
        public int mo8707D() {
            return this.f6935p;
        }

        /* renamed from: E */
        public List<Integer> mo8708E() {
            return this.f6936q;
        }

        /* renamed from: I */
        private void m10948I() {
            this.f6925f = 518;
            this.f6926g = 2054;
            this.f6927h = 0;
            this.f6928i = C2173aa.m9813a();
            this.f6929j = 0;
            this.f6930k = Collections.emptyList();
            this.f6931l = C2173aa.m9813a();
            this.f6932m = 0;
            this.f6933n = C2197ai.m10175a();
            this.f6934o = 0;
            this.f6935p = 0;
            this.f6936q = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6937r;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo8717j()) {
                this.f6937r = 0;
                return false;
            } else if (!mo8719l() || mo8720p().mo8106h()) {
                for (int i = 0; i < mo8724t(); i++) {
                    if (!mo8711a(i).mo8106h()) {
                        this.f6937r = 0;
                        return false;
                    }
                }
                if (mo8725u() && !mo8726v().mo8106h()) {
                    this.f6937r = 0;
                    return false;
                } else if (mo8729y() && !mo8730z().mo8106h()) {
                    this.f6937r = 0;
                    return false;
                } else if (!mo9202P()) {
                    this.f6937r = 0;
                    return false;
                } else {
                    this.f6937r = 1;
                    return true;
                }
            } else {
                this.f6937r = 0;
                return false;
            }
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            C2388a Q = mo9203Q();
            if ((this.f6924e & 2) == 2) {
                fVar.mo9137a(1, this.f6926g);
            }
            if ((this.f6924e & 4) == 4) {
                fVar.mo9137a(2, this.f6927h);
            }
            if ((this.f6924e & 8) == 8) {
                fVar.mo9152b(3, (C2406q) this.f6928i);
            }
            for (int i = 0; i < this.f6930k.size(); i++) {
                fVar.mo9152b(4, (C2406q) this.f6930k.get(i));
            }
            if ((this.f6924e & 32) == 32) {
                fVar.mo9152b(5, (C2406q) this.f6931l);
            }
            if ((this.f6924e & Allocation.USAGE_SHARED) == 128) {
                fVar.mo9152b(6, (C2406q) this.f6933n);
            }
            if ((this.f6924e & 256) == 256) {
                fVar.mo9137a(7, this.f6934o);
            }
            if ((this.f6924e & 512) == 512) {
                fVar.mo9137a(8, this.f6935p);
            }
            if ((this.f6924e & 16) == 16) {
                fVar.mo9137a(9, this.f6929j);
            }
            if ((this.f6924e & 64) == 64) {
                fVar.mo9137a(10, this.f6932m);
            }
            if ((this.f6924e & 1) == 1) {
                fVar.mo9137a(11, this.f6925f);
            }
            for (int i2 = 0; i2 < this.f6936q.size(); i2++) {
                fVar.mo9137a(31, ((Integer) this.f6936q.get(i2)).intValue());
            }
            Q.mo9209a(19000, fVar);
            fVar.mo9159c(this.f6923d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6938s;
            if (i != -1) {
                return i;
            }
            int d = (this.f6924e & 2) == 2 ? C2376f.m11831d(1, this.f6926g) + 0 : 0;
            if ((this.f6924e & 4) == 4) {
                d += C2376f.m11831d(2, this.f6927h);
            }
            if ((this.f6924e & 8) == 8) {
                d += C2376f.m11832d(3, (C2406q) this.f6928i);
            }
            int i2 = d;
            for (int i3 = 0; i3 < this.f6930k.size(); i3++) {
                i2 += C2376f.m11832d(4, (C2406q) this.f6930k.get(i3));
            }
            if ((this.f6924e & 32) == 32) {
                i2 += C2376f.m11832d(5, (C2406q) this.f6931l);
            }
            if ((this.f6924e & Allocation.USAGE_SHARED) == 128) {
                i2 += C2376f.m11832d(6, (C2406q) this.f6933n);
            }
            if ((this.f6924e & 256) == 256) {
                i2 += C2376f.m11831d(7, this.f6934o);
            }
            if ((this.f6924e & 512) == 512) {
                i2 += C2376f.m11831d(8, this.f6935p);
            }
            if ((this.f6924e & 16) == 16) {
                i2 += C2376f.m11831d(9, this.f6929j);
            }
            if ((this.f6924e & 64) == 64) {
                i2 += C2376f.m11831d(10, this.f6932m);
            }
            if ((this.f6924e & 1) == 1) {
                i2 += C2376f.m11831d(11, this.f6925f);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f6936q.size(); i5++) {
                i4 += C2376f.m11837h(((Integer) this.f6936q.get(i5)).intValue());
            }
            int size = i2 + i4 + (mo8708E().size() * 2) + mo9204R() + this.f6923d.mo9064a();
            this.f6938s = size;
            return size;
        }

        /* renamed from: F */
        public static C2262a m10947F() {
            return C2262a.m11005v();
        }

        /* renamed from: G */
        public C2262a mo8111n() {
            return m10947F();
        }

        /* renamed from: a */
        public static C2262a m10952a(C2260u uVar) {
            return m10947F().mo8128a(uVar);
        }

        /* renamed from: H */
        public C2262a mo8110m() {
            return m10952a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$v */
    public interface C2263v extends C2389d {
    }

    /* renamed from: b.h.b.a.b.e.a$w */
    /* compiled from: ProtoBuf */
    public static final class C2264w extends C2383i implements C2273x {

        /* renamed from: a */
        public static C2409s<C2264w> f6952a = new C2367b<C2264w>() {
            /* renamed from: a */
            public C2264w mo8114b(C2374e eVar, C2378g gVar) {
                return new C2264w(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2264w f6953c = new C2264w(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6954d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public List<C2267b> f6955e;

        /* renamed from: f */
        private byte f6956f;

        /* renamed from: g */
        private int f6957g;

        /* renamed from: b.h.b.a.b.e.a$w$a */
        /* compiled from: ProtoBuf */
        public static final class C2266a extends C2385a<C2264w, C2266a> implements C2273x {

            /* renamed from: a */
            private int f6958a;

            /* renamed from: b */
            private List<C2267b> f6959b = Collections.emptyList();

            /* renamed from: g */
            private void m11065g() {
            }

            private C2266a() {
                m11065g();
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public static C2266a m11066m() {
                return new C2266a();
            }

            /* renamed from: a */
            public C2266a mo8140k() {
                return m11066m().mo8128a(mo8767d());
            }

            /* renamed from: b */
            public C2264w mo8112o() {
                return C2264w.m11044a();
            }

            /* renamed from: c */
            public C2264w mo8141l() {
                C2264w d = mo8767d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2264w mo8767d() {
                C2264w wVar = new C2264w((C2385a) this);
                int i = this.f6958a;
                if ((this.f6958a & 1) == 1) {
                    this.f6959b = Collections.unmodifiableList(this.f6959b);
                    this.f6958a &= -2;
                }
                wVar.f6955e = this.f6959b;
                return wVar;
            }

            /* renamed from: a */
            public C2266a mo8128a(C2264w wVar) {
                if (wVar == C2264w.m11044a()) {
                    return this;
                }
                if (!wVar.f6955e.isEmpty()) {
                    if (this.f6959b.isEmpty()) {
                        this.f6959b = wVar.f6955e;
                        this.f6958a &= -2;
                    } else {
                        m11067n();
                        this.f6959b.addAll(wVar.f6955e);
                    }
                }
                mo9198a(mo9199x().mo9075a(wVar.f6954d));
                return this;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                for (int i = 0; i < mo8768e(); i++) {
                    if (!mo8764a(i).mo8106h()) {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: a */
            public C2266a mo8132c(C2374e eVar, C2378g gVar) {
                C2264w wVar;
                C2264w wVar2 = null;
                try {
                    C2264w wVar3 = (C2264w) C2264w.f6952a.mo8114b(eVar, gVar);
                    if (wVar3 != null) {
                        mo8128a(wVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    wVar = (C2264w) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    wVar2 = wVar;
                }
                if (wVar2 != null) {
                    mo8128a(wVar2);
                }
                throw th;
            }

            /* renamed from: n */
            private void m11067n() {
                if ((this.f6958a & 1) != 1) {
                    this.f6959b = new ArrayList(this.f6959b);
                    this.f6958a |= 1;
                }
            }

            /* renamed from: e */
            public int mo8768e() {
                return this.f6959b.size();
            }

            /* renamed from: a */
            public C2267b mo8764a(int i) {
                return (C2267b) this.f6959b.get(i);
            }
        }

        /* renamed from: b.h.b.a.b.e.a$w$b */
        /* compiled from: ProtoBuf */
        public static final class C2267b extends C2383i implements C2272c {

            /* renamed from: a */
            public static C2409s<C2267b> f6960a = new C2367b<C2267b>() {
                /* renamed from: a */
                public C2267b mo8114b(C2374e eVar, C2378g gVar) {
                    return new C2267b(eVar, gVar);
                }
            };

            /* renamed from: c */
            private static final C2267b f6961c = new C2267b(true);
            /* access modifiers changed from: private */

            /* renamed from: d */
            public final C2371d f6962d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public int f6963e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public int f6964f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public int f6965g;
            /* access modifiers changed from: private */

            /* renamed from: h */
            public C2270b f6966h;

            /* renamed from: i */
            private byte f6967i;

            /* renamed from: j */
            private int f6968j;

            /* renamed from: b.h.b.a.b.e.a$w$b$a */
            /* compiled from: ProtoBuf */
            public static final class C2269a extends C2385a<C2267b, C2269a> implements C2272c {

                /* renamed from: a */
                private int f6969a;

                /* renamed from: b */
                private int f6970b = -1;

                /* renamed from: c */
                private int f6971c;

                /* renamed from: d */
                private C2270b f6972d = C2270b.PACKAGE;

                /* renamed from: g */
                private void m11113g() {
                }

                private C2269a() {
                    m11113g();
                }

                /* access modifiers changed from: private */
                /* renamed from: m */
                public static C2269a m11114m() {
                    return new C2269a();
                }

                /* renamed from: a */
                public C2269a mo8140k() {
                    return m11114m().mo8128a(mo8787d());
                }

                /* renamed from: b */
                public C2267b mo8112o() {
                    return C2267b.m11088a();
                }

                /* renamed from: c */
                public C2267b mo8141l() {
                    C2267b d = mo8787d();
                    if (d.mo8106h()) {
                        return d;
                    }
                    throw m11714a(d);
                }

                /* renamed from: d */
                public C2267b mo8787d() {
                    C2267b bVar = new C2267b((C2385a) this);
                    int i = this.f6969a;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    bVar.f6964f = this.f6970b;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    bVar.f6965g = this.f6971c;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    bVar.f6966h = this.f6972d;
                    bVar.f6963e = i2;
                    return bVar;
                }

                /* renamed from: a */
                public C2269a mo8128a(C2267b bVar) {
                    if (bVar == C2267b.m11088a()) {
                        return this;
                    }
                    if (bVar.mo8770d()) {
                        mo8780a(bVar.mo8771e());
                    }
                    if (bVar.mo8772f()) {
                        mo8784b(bVar.mo8773g());
                    }
                    if (bVar.mo8774j()) {
                        mo8781a(bVar.mo8775k());
                    }
                    mo9198a(mo9199x().mo9075a(bVar.f6962d));
                    return this;
                }

                /* renamed from: h */
                public final boolean mo8106h() {
                    return mo8788e();
                }

                /* renamed from: a */
                public C2269a mo8132c(C2374e eVar, C2378g gVar) {
                    C2267b bVar;
                    C2267b bVar2 = null;
                    try {
                        C2267b bVar3 = (C2267b) C2267b.f6960a.mo8114b(eVar, gVar);
                        if (bVar3 != null) {
                            mo8128a(bVar3);
                        }
                        return this;
                    } catch (C2395k e) {
                        bVar = (C2267b) e.mo9220a();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        bVar2 = bVar;
                    }
                    if (bVar2 != null) {
                        mo8128a(bVar2);
                    }
                    throw th;
                }

                /* renamed from: a */
                public C2269a mo8780a(int i) {
                    this.f6969a |= 1;
                    this.f6970b = i;
                    return this;
                }

                /* renamed from: e */
                public boolean mo8788e() {
                    return (this.f6969a & 2) == 2;
                }

                /* renamed from: b */
                public C2269a mo8784b(int i) {
                    this.f6969a |= 2;
                    this.f6971c = i;
                    return this;
                }

                /* renamed from: a */
                public C2269a mo8781a(C2270b bVar) {
                    if (bVar != null) {
                        this.f6969a |= 4;
                        this.f6972d = bVar;
                        return this;
                    }
                    throw new NullPointerException();
                }
            }

            /* renamed from: b.h.b.a.b.e.a$w$b$b */
            /* compiled from: ProtoBuf */
            public enum C2270b implements C2393a {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);
                

                /* renamed from: d */
                private static C2394b<C2270b> f6976d;

                /* renamed from: e */
                private final int f6978e;

                static {
                    f6976d = new C2394b<C2270b>() {
                        /* renamed from: a */
                        public C2270b mo8188b(int i) {
                            return C2270b.m11134a(i);
                        }
                    };
                }

                /* renamed from: a */
                public final int mo8186a() {
                    return this.f6978e;
                }

                /* renamed from: a */
                public static C2270b m11134a(int i) {
                    switch (i) {
                        case 0:
                            return CLASS;
                        case 1:
                            return PACKAGE;
                        case 2:
                            return LOCAL;
                        default:
                            return null;
                    }
                }

                private C2270b(int i, int i2) {
                    this.f6978e = i2;
                }
            }

            private C2267b(C2385a aVar) {
                super(aVar);
                this.f6967i = -1;
                this.f6968j = -1;
                this.f6962d = aVar.mo9199x();
            }

            private C2267b(boolean z) {
                this.f6967i = -1;
                this.f6968j = -1;
                this.f6962d = C2371d.f7253a;
            }

            /* renamed from: a */
            public static C2267b m11088a() {
                return f6961c;
            }

            /* renamed from: b */
            public C2267b mo8112o() {
                return f6961c;
            }

            private C2267b(C2374e eVar, C2378g gVar) {
                this.f6967i = -1;
                this.f6968j = -1;
                m11093r();
                C2373b i = C2371d.m11743i();
                C2376f a = C2376f.m11817a((OutputStream) i, 1);
                boolean z = false;
                while (!z) {
                    try {
                        int a2 = eVar.mo9095a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.f6963e |= 1;
                                this.f6964f = eVar.mo9109f();
                            } else if (a2 == 16) {
                                this.f6963e |= 2;
                                this.f6965g = eVar.mo9109f();
                            } else if (a2 == 24) {
                                int n = eVar.mo9117n();
                                C2270b a3 = C2270b.m11134a(n);
                                if (a3 == null) {
                                    a.mo9171p(a2);
                                    a.mo9171p(n);
                                } else {
                                    this.f6963e |= 4;
                                    this.f6966h = a3;
                                }
                            } else if (!mo9197a(eVar, a, gVar, a2)) {
                            }
                        }
                        z = true;
                    } catch (C2395k e) {
                        throw e.mo9219a(this);
                    } catch (IOException e2) {
                        throw new C2395k(e2.getMessage()).mo9219a(this);
                    } catch (Throwable th) {
                        try {
                            a.mo9131a();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f6962d = i.mo9090a();
                            throw th2;
                        }
                        this.f6962d = i.mo9090a();
                        mo9196O();
                        throw th;
                    }
                }
                try {
                    a.mo9131a();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f6962d = i.mo9090a();
                    throw th3;
                }
                this.f6962d = i.mo9090a();
                mo9196O();
            }

            static {
                f6961c.m11093r();
            }

            /* renamed from: c */
            public C2409s<C2267b> mo8101c() {
                return f6960a;
            }

            /* renamed from: d */
            public boolean mo8770d() {
                return (this.f6963e & 1) == 1;
            }

            /* renamed from: e */
            public int mo8771e() {
                return this.f6964f;
            }

            /* renamed from: f */
            public boolean mo8772f() {
                return (this.f6963e & 2) == 2;
            }

            /* renamed from: g */
            public int mo8773g() {
                return this.f6965g;
            }

            /* renamed from: j */
            public boolean mo8774j() {
                return (this.f6963e & 4) == 4;
            }

            /* renamed from: k */
            public C2270b mo8775k() {
                return this.f6966h;
            }

            /* renamed from: r */
            private void m11093r() {
                this.f6964f = -1;
                this.f6965g = 0;
                this.f6966h = C2270b.PACKAGE;
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                byte b = this.f6967i;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!mo8772f()) {
                    this.f6967i = 0;
                    return false;
                }
                this.f6967i = 1;
                return true;
            }

            /* renamed from: a */
            public void mo8099a(C2376f fVar) {
                mo8107i();
                if ((this.f6963e & 1) == 1) {
                    fVar.mo9137a(1, this.f6964f);
                }
                if ((this.f6963e & 2) == 2) {
                    fVar.mo9137a(2, this.f6965g);
                }
                if ((this.f6963e & 4) == 4) {
                    fVar.mo9156c(3, this.f6966h.mo8186a());
                }
                fVar.mo9159c(this.f6962d);
            }

            /* renamed from: i */
            public int mo8107i() {
                int i = this.f6968j;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.f6963e & 1) == 1) {
                    i2 = 0 + C2376f.m11831d(1, this.f6964f);
                }
                if ((this.f6963e & 2) == 2) {
                    i2 += C2376f.m11831d(2, this.f6965g);
                }
                if ((this.f6963e & 4) == 4) {
                    i2 += C2376f.m11834e(3, this.f6966h.mo8186a());
                }
                int a = i2 + this.f6962d.mo9064a();
                this.f6968j = a;
                return a;
            }

            /* renamed from: l */
            public static C2269a m11092l() {
                return C2269a.m11114m();
            }

            /* renamed from: p */
            public C2269a mo8111n() {
                return m11092l();
            }

            /* renamed from: a */
            public static C2269a m11086a(C2267b bVar) {
                return m11092l().mo8128a(bVar);
            }

            /* renamed from: q */
            public C2269a mo8110m() {
                return m11086a(this);
            }
        }

        /* renamed from: b.h.b.a.b.e.a$w$c */
        public interface C2272c extends C2408r {
        }

        private C2264w(C2385a aVar) {
            super(aVar);
            this.f6956f = -1;
            this.f6957g = -1;
            this.f6954d = aVar.mo9199x();
        }

        private C2264w(boolean z) {
            this.f6956f = -1;
            this.f6957g = -1;
            this.f6954d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2264w m11044a() {
            return f6953c;
        }

        /* renamed from: b */
        public C2264w mo8112o() {
            return f6953c;
        }

        private C2264w(C2374e eVar, C2378g gVar) {
            this.f6956f = -1;
            this.f6957g = -1;
            m11049j();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 10) {
                            if (!z2 || !true) {
                                this.f6955e = new ArrayList();
                                z2 |= true;
                            }
                            this.f6955e.add(eVar.mo9096a(C2267b.f6960a, gVar));
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.f6955e = Collections.unmodifiableList(this.f6955e);
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6954d = i.mo9090a();
                        throw th2;
                    }
                    this.f6954d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 && true) {
                this.f6955e = Collections.unmodifiableList(this.f6955e);
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6954d = i.mo9090a();
                throw th3;
            }
            this.f6954d = i.mo9090a();
            mo9196O();
        }

        static {
            f6953c.m11049j();
        }

        /* renamed from: c */
        public C2409s<C2264w> mo8101c() {
            return f6952a;
        }

        /* renamed from: d */
        public int mo8757d() {
            return this.f6955e.size();
        }

        /* renamed from: a */
        public C2267b mo8755a(int i) {
            return (C2267b) this.f6955e.get(i);
        }

        /* renamed from: j */
        private void m11049j() {
            this.f6955e = Collections.emptyList();
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6956f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < mo8757d(); i++) {
                if (!mo8755a(i).mo8106h()) {
                    this.f6956f = 0;
                    return false;
                }
            }
            this.f6956f = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            for (int i = 0; i < this.f6955e.size(); i++) {
                fVar.mo9152b(1, (C2406q) this.f6955e.get(i));
            }
            fVar.mo9159c(this.f6954d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6957g;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f6955e.size(); i3++) {
                i2 += C2376f.m11832d(1, (C2406q) this.f6955e.get(i3));
            }
            int a = i2 + this.f6954d.mo9064a();
            this.f6957g = a;
            return a;
        }

        /* renamed from: e */
        public static C2266a m11048e() {
            return C2266a.m11066m();
        }

        /* renamed from: f */
        public C2266a mo8111n() {
            return m11048e();
        }

        /* renamed from: a */
        public static C2266a m11043a(C2264w wVar) {
            return m11048e().mo8128a(wVar);
        }

        /* renamed from: g */
        public C2266a mo8110m() {
            return m11043a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$x */
    public interface C2273x extends C2408r {
    }

    /* renamed from: b.h.b.a.b.e.a$y */
    /* compiled from: ProtoBuf */
    public static final class C2274y extends C2383i implements C2277z {

        /* renamed from: a */
        public static C2409s<C2274y> f6979a = new C2367b<C2274y>() {
            /* renamed from: a */
            public C2274y mo8114b(C2374e eVar, C2378g gVar) {
                return new C2274y(eVar, gVar);
            }
        };

        /* renamed from: c */
        private static final C2274y f6980c = new C2274y(true);
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C2371d f6981d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2402o f6982e;

        /* renamed from: f */
        private byte f6983f;

        /* renamed from: g */
        private int f6984g;

        /* renamed from: b.h.b.a.b.e.a$y$a */
        /* compiled from: ProtoBuf */
        public static final class C2276a extends C2385a<C2274y, C2276a> implements C2277z {

            /* renamed from: a */
            private int f6985a;

            /* renamed from: b */
            private C2402o f6986b = C2401n.f7321a;

            /* renamed from: f */
            private void m11160f() {
            }

            /* renamed from: h */
            public final boolean mo8106h() {
                return true;
            }

            private C2276a() {
                m11160f();
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public static C2276a m11161g() {
                return new C2276a();
            }

            /* renamed from: a */
            public C2276a mo8140k() {
                return m11161g().mo8128a(mo8801d());
            }

            /* renamed from: b */
            public C2274y mo8112o() {
                return C2274y.m11139a();
            }

            /* renamed from: c */
            public C2274y mo8141l() {
                C2274y d = mo8801d();
                if (d.mo8106h()) {
                    return d;
                }
                throw m11714a(d);
            }

            /* renamed from: d */
            public C2274y mo8801d() {
                C2274y yVar = new C2274y((C2385a) this);
                int i = this.f6985a;
                if ((this.f6985a & 1) == 1) {
                    this.f6986b = this.f6986b.mo9243b();
                    this.f6985a &= -2;
                }
                yVar.f6982e = this.f6986b;
                return yVar;
            }

            /* renamed from: a */
            public C2276a mo8128a(C2274y yVar) {
                if (yVar == C2274y.m11139a()) {
                    return this;
                }
                if (!yVar.f6982e.isEmpty()) {
                    if (this.f6986b.isEmpty()) {
                        this.f6986b = yVar.f6982e;
                        this.f6985a &= -2;
                    } else {
                        m11162m();
                        this.f6986b.addAll(yVar.f6982e);
                    }
                }
                mo9198a(mo9199x().mo9075a(yVar.f6981d));
                return this;
            }

            /* renamed from: a */
            public C2276a mo8132c(C2374e eVar, C2378g gVar) {
                C2274y yVar;
                C2274y yVar2 = null;
                try {
                    C2274y yVar3 = (C2274y) C2274y.f6979a.mo8114b(eVar, gVar);
                    if (yVar3 != null) {
                        mo8128a(yVar3);
                    }
                    return this;
                } catch (C2395k e) {
                    yVar = (C2274y) e.mo9220a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    yVar2 = yVar;
                }
                if (yVar2 != null) {
                    mo8128a(yVar2);
                }
                throw th;
            }

            /* renamed from: m */
            private void m11162m() {
                if ((this.f6985a & 1) != 1) {
                    this.f6986b = new C2401n(this.f6986b);
                    this.f6985a |= 1;
                }
            }
        }

        private C2274y(C2385a aVar) {
            super(aVar);
            this.f6983f = -1;
            this.f6984g = -1;
            this.f6981d = aVar.mo9199x();
        }

        private C2274y(boolean z) {
            this.f6983f = -1;
            this.f6984g = -1;
            this.f6981d = C2371d.f7253a;
        }

        /* renamed from: a */
        public static C2274y m11139a() {
            return f6980c;
        }

        /* renamed from: b */
        public C2274y mo8112o() {
            return f6980c;
        }

        private C2274y(C2374e eVar, C2378g gVar) {
            this.f6983f = -1;
            this.f6984g = -1;
            m11144j();
            C2373b i = C2371d.m11743i();
            C2376f a = C2376f.m11817a((OutputStream) i, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int a2 = eVar.mo9095a();
                    if (a2 != 0) {
                        if (a2 == 10) {
                            C2371d l = eVar.mo9115l();
                            if (!z2 || !true) {
                                this.f6982e = new C2401n();
                                z2 |= true;
                            }
                            this.f6982e.mo9239a(l);
                        } else if (!mo9197a(eVar, a, gVar, a2)) {
                        }
                    }
                    z = true;
                } catch (C2395k e) {
                    throw e.mo9219a(this);
                } catch (IOException e2) {
                    throw new C2395k(e2.getMessage()).mo9219a(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.f6982e = this.f6982e.mo9243b();
                    }
                    try {
                        a.mo9131a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f6981d = i.mo9090a();
                        throw th2;
                    }
                    this.f6981d = i.mo9090a();
                    mo9196O();
                    throw th;
                }
            }
            if (z2 && true) {
                this.f6982e = this.f6982e.mo9243b();
            }
            try {
                a.mo9131a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f6981d = i.mo9090a();
                throw th3;
            }
            this.f6981d = i.mo9090a();
            mo9196O();
        }

        static {
            f6980c.m11144j();
        }

        /* renamed from: c */
        public C2409s<C2274y> mo8101c() {
            return f6979a;
        }

        /* renamed from: d */
        public C2410t mo8792d() {
            return this.f6982e;
        }

        /* renamed from: a */
        public String mo8790a(int i) {
            return (String) this.f6982e.get(i);
        }

        /* renamed from: j */
        private void m11144j() {
            this.f6982e = C2401n.f7321a;
        }

        /* renamed from: h */
        public final boolean mo8106h() {
            byte b = this.f6983f;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f6983f = 1;
            return true;
        }

        /* renamed from: a */
        public void mo8099a(C2376f fVar) {
            mo8107i();
            for (int i = 0; i < this.f6982e.size(); i++) {
                fVar.mo9139a(1, this.f6982e.mo9246c(i));
            }
            fVar.mo9159c(this.f6981d);
        }

        /* renamed from: i */
        public int mo8107i() {
            int i = this.f6984g;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f6982e.size(); i3++) {
                i2 += C2376f.m11825b(this.f6982e.mo9246c(i3));
            }
            int size = i2 + 0 + (mo8792d().size() * 1) + this.f6981d.mo9064a();
            this.f6984g = size;
            return size;
        }

        /* renamed from: e */
        public static C2276a m11143e() {
            return C2276a.m11161g();
        }

        /* renamed from: f */
        public C2276a mo8111n() {
            return m11143e();
        }

        /* renamed from: a */
        public static C2276a m11138a(C2274y yVar) {
            return m11143e().mo8128a(yVar);
        }

        /* renamed from: g */
        public C2276a mo8110m() {
            return m11138a(this);
        }
    }

    /* renamed from: b.h.b.a.b.e.a$z */
    public interface C2277z extends C2408r {
    }
}
