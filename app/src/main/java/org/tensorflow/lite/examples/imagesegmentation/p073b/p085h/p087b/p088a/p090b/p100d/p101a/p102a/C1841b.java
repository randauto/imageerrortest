package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a;

import java.util.Map;
import p073b.p074a.C1389ad;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p079e.p081b.C1498s;
import p073b.p079e.p081b.C1499t;
import p073b.p079e.p081b.C1503v;
import p073b.p085h.C3135k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1987b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2712h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;

/* renamed from: b.h.b.a.b.d.a.a.b */
/* compiled from: JavaAnnotationMapper.kt */
public class C1841b implements C1651c {

    /* renamed from: a */
    static final /* synthetic */ C3135k[] f5652a = {C1503v.m7004a((C1498s) new C1499t(C1503v.m6999a(C1841b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: b */
    private final C1692am f5653b;

    /* renamed from: c */
    private final C2710f f5654c;

    /* renamed from: d */
    private final C1987b f5655d;

    /* renamed from: e */
    private final C2355b f5656e;

    /* renamed from: b.h.b.a.b.d.a.a.b$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C1842a extends C1490k implements C1449a<C2755ad> {

        /* renamed from: a */
        final /* synthetic */ C1841b f5657a;

        /* renamed from: b */
        final /* synthetic */ C1967h f5658b;

        C1842a(C1841b bVar, C1967h hVar) {
            this.f5657a = bVar;
            this.f5658b = hVar;
            super(0);
        }

        /* renamed from: b */
        public final C2755ad mo6823a() {
            C1796e b = this.f5658b.mo7804d().mo7522a().mo7188b(this.f5657a.mo7240b());
            C1489j.m6969a((Object) b, "c.module.builtIns.getBuiltInClassByFqName(fqName)");
            return b.mo7346A_();
        }
    }

    /* renamed from: e */
    public C2755ad mo7239a() {
        return (C2755ad) C2712h.m13321a(this.f5654c, (Object) this, f5652a[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1841b(p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h r2, p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1985a r3, p073b.p085h.p087b.p088a.p090b.p116f.C2355b r4) {
        /*
            r1 = this;
            java.lang.String r0 = "c"
            p073b.p079e.p081b.C1489j.m6972b(r2, r0)
            java.lang.String r0 = "fqName"
            p073b.p079e.p081b.C1489j.m6972b(r4, r0)
            r1.<init>()
            r1.f5656e = r4
            if (r3 == 0) goto L_0x0025
            b.h.b.a.b.d.a.c.b r4 = r2.mo7805e()
            b.h.b.a.b.d.a.d.b r4 = r4.mo7752i()
            r0 = r3
            b.h.b.a.b.d.a.e.l r0 = (p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1997l) r0
            b.h.b.a.b.d.a.d.a r4 = r4.mo7019a(r0)
            if (r4 == 0) goto L_0x0025
            b.h.b.a.b.b.am r4 = (p073b.p085h.p087b.p088a.p090b.p094b.C1692am) r4
            goto L_0x002c
        L_0x0025:
            b.h.b.a.b.b.am r4 = p073b.p085h.p087b.p088a.p090b.p094b.C1692am.f5331a
            java.lang.String r0 = "SourceElement.NO_SOURCE"
            p073b.p079e.p081b.C1489j.m6969a(r4, r0)
        L_0x002c:
            r1.f5653b = r4
            b.h.b.a.b.k.i r4 = r2.mo7803c()
            b.h.b.a.b.d.a.a.b$a r0 = new b.h.b.a.b.d.a.a.b$a
            r0.<init>(r1, r2)
            b.e.a.a r0 = (p073b.p079e.p080a.C1449a) r0
            b.h.b.a.b.k.f r2 = r4.mo9793a(r0)
            r1.f5654c = r2
            if (r3 == 0) goto L_0x0050
            java.util.Collection r2 = r3.mo7825a()
            if (r2 == 0) goto L_0x0050
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = p073b.p074a.C1415k.m6871c(r2)
            b.h.b.a.b.d.a.e.b r2 = (p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1987b) r2
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            r1.f5655d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1841b.<init>(b.h.b.a.b.d.a.c.h, b.h.b.a.b.d.a.e.a, b.h.b.a.b.f.b):void");
    }

    /* renamed from: b */
    public C2355b mo7240b() {
        return this.f5656e;
    }

    /* renamed from: d */
    public C1692am mo7242d() {
        return this.f5653b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C1987b mo7595f() {
        return this.f5655d;
    }

    /* renamed from: c */
    public Map<C2360f, C2500f<?>> mo7241c() {
        return C1389ad.m6747a();
    }
}
