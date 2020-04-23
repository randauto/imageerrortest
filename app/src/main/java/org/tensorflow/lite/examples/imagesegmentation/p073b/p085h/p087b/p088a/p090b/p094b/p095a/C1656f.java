package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p094b.C1817v;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2495a;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2496b;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2505i;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2517s;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.a.f */
/* compiled from: annotationUtil.kt */
public final class C1656f {

    /* renamed from: a */
    private static final C2360f f5238a = C2360f.m11701a("message");

    /* renamed from: b */
    private static final C2360f f5239b = C2360f.m11701a("replaceWith");

    /* renamed from: c */
    private static final C2360f f5240c = C2360f.m11701a("level");

    /* renamed from: d */
    private static final C2360f f5241d = C2360f.m11701a("expression");

    /* renamed from: e */
    private static final C2360f f5242e = C2360f.m11701a("imports");

    /* renamed from: f */
    private static final C2355b f5243f = new C2355b("kotlin.internal.InlineOnly");

    /* renamed from: b.h.b.a.b.b.a.f$a */
    /* compiled from: annotationUtil.kt */
    static final class C1657a extends C1490k implements C1450b<C1821y, C2755ad> {

        /* renamed from: a */
        final /* synthetic */ C1627g f5244a;

        C1657a(C1627g gVar) {
            this.f5244a = gVar;
            super(1);
        }

        /* renamed from: a */
        public final C2755ad mo6756a(C1821y yVar) {
            C1489j.m6972b(yVar, "module");
            C2755ad a = yVar.mo7522a().mo7186a(C2792ba.INVARIANT, (C2841w) this.f5244a.mo7182E());
            C1489j.m6969a((Object) a, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return a;
        }
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C1651c m7536a(C1627g gVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return m7535a(gVar, str, str2, str3);
    }

    /* renamed from: a */
    public static final C1651c m7535a(C1627g gVar, String str, String str2, String str3) {
        C1489j.m6972b(gVar, "$receiver");
        C1489j.m6972b(str, "message");
        C1489j.m6972b(str2, "replaceWith");
        C1489j.m6972b(str3, "level");
        C2355b bVar = C1627g.f5076h.f5095A;
        C1489j.m6969a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.replaceWith");
        C1666k kVar = new C1666k(gVar, bVar, C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(f5241d, new C2517s(str2)), C3226t.m14841a(f5242e, new C2496b(C1415k.m6837a(), new C1657a(gVar)))}));
        C2355b bVar2 = C1627g.f5076h.f5168y;
        C1489j.m6969a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.deprecated");
        C2360f fVar = f5240c;
        C2354a a = C2354a.m11661a(C1627g.f5076h.f5169z);
        C1489j.m6969a((Object) a, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
        C2360f a2 = C2360f.m11701a(str3);
        C1489j.m6969a((Object) a2, "Name.identifier(level)");
        return new C1666k(gVar, bVar2, C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(f5238a, new C2517s(str)), C3226t.m14841a(f5239b, new C2495a(kVar)), C3226t.m14841a(fVar, new C2505i(a, a2))}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (m7541c(r2) == false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m7538a(p073b.p085h.p087b.p088a.p090b.p094b.C1817v r2) {
        /*
            java.lang.String r0 = "$receiver"
            p073b.p079e.p081b.C1489j.m6972b(r2, r0)
            boolean r0 = r2 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1724b
            if (r0 == 0) goto L_0x0029
            r0 = r2
            b.h.b.a.b.b.b r0 = (p073b.p085h.p087b.p088a.p090b.p094b.C1724b) r0
            boolean r1 = m7537a(r0)
            if (r1 != 0) goto L_0x0027
            b.h.b.a.b.b.b r0 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12590b(r0)
            java.lang.String r1 = "DescriptorUtils.getDirectMember(this)"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)
            boolean r0 = m7537a(r0)
            if (r0 != 0) goto L_0x0027
            boolean r2 = m7541c(r2)
            if (r2 == 0) goto L_0x0029
        L_0x0027:
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1656f.m7538a(b.h.b.a.b.b.v):boolean");
    }

    /* renamed from: b */
    public static final boolean m7540b(C1817v vVar) {
        boolean z;
        C1489j.m6972b(vVar, "$receiver");
        if (m7538a(vVar)) {
            return true;
        }
        if (vVar instanceof C1813t) {
            C1813t tVar = (C1813t) vVar;
            if (tVar.mo7452C() && tVar.mo7108a()) {
                List i = tVar.mo7236i();
                C1489j.m6969a((Object) i, "valueParameters");
                Iterable iterable = i;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C1705au) it.next()).mo7327o()) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z || C1489j.m6971a((Object) tVar.mo7077p(), (Object) C1710ay.f5336a)) {
                        return true;
                    }
                }
                z = false;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (m7539b(r0) == false) goto L_0x004b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m7541c(p073b.p085h.p087b.p088a.p090b.p094b.C1817v r2) {
        /*
            java.lang.String r0 = "$receiver"
            p073b.p079e.p081b.C1489j.m6972b(r2, r0)
            boolean r0 = r2 instanceof p073b.p085h.p087b.p088a.p090b.p094b.C1813t
            if (r0 == 0) goto L_0x004b
            r0 = r2
            b.h.b.a.b.b.b r0 = (p073b.p085h.p087b.p088a.p090b.p094b.C1724b) r0
            boolean r1 = m7539b(r0)
            if (r1 != 0) goto L_0x0022
            b.h.b.a.b.b.b r0 = p073b.p085h.p087b.p088a.p090b.p119i.C2523c.m12590b(r0)
            java.lang.String r1 = "DescriptorUtils.getDirectMember(this)"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)
            boolean r0 = m7539b(r0)
            if (r0 != 0) goto L_0x0022
            goto L_0x004b
        L_0x0022:
            r0 = r2
            b.h.b.a.b.b.t r0 = (p073b.p085h.p087b.p088a.p090b.p094b.C1813t) r0
            boolean r0 = r0.mo7108a()
            boolean r1 = p073b.C3232z.f8648a
            if (r1 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0030
            goto L_0x0049
        L_0x0030:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Function is not inline: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0049:
            r2 = 1
            return r2
        L_0x004b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1656f.m7541c(b.h.b.a.b.b.v):boolean");
    }

    /* renamed from: a */
    private static final boolean m7537a(C1724b bVar) {
        List f = bVar.mo7233f();
        C1489j.m6969a((Object) f, "typeParameters");
        Iterable<C1700ar> iterable = f;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (C1700ar arVar : iterable) {
            C1489j.m6969a((Object) arVar, "it");
            if (arVar.mo7317l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static final boolean m7539b(C1724b bVar) {
        return bVar.mo7086x().mo7257b(f5243f);
    }
}
