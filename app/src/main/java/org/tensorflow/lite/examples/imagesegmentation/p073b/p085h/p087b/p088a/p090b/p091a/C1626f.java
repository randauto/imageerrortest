package p073b.p085h.p087b.p088a.p090b.p091a;

import java.util.List;
import p073b.C3232z;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p091a.p092a.C1573a;
import p073b.p085h.p087b.p088a.p090b.p091a.p092a.C1573a.C1574a;
import p073b.p085h.p087b.p088a.p090b.p091a.p092a.C1576b.C1580b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1663i;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1666k;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2517s;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;

/* renamed from: b.h.b.a.b.a.f */
/* compiled from: functionTypes.kt */
public final class C1626f {
    /* renamed from: a */
    public static final boolean m7373a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1799h d = wVar.mo9507g().mo7096d();
        return (d != null ? m7368a((C1804m) d) : null) == C1580b.Function;
    }

    /* renamed from: b */
    public static final boolean m7374b(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1799h d = wVar.mo9507g().mo7096d();
        return (d != null ? m7368a((C1804m) d) : null) == C1580b.SuspendFunction;
    }

    /* renamed from: c */
    public static final boolean m7375c(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1799h d = wVar.mo9507g().mo7096d();
        C1580b a = d != null ? m7368a((C1804m) d) : null;
        return a == C1580b.Function || a == C1580b.SuspendFunction;
    }

    /* renamed from: d */
    public static final boolean m7376d(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return m7375c(wVar) && m7381i(wVar);
    }

    /* renamed from: i */
    private static final boolean m7381i(C2841w wVar) {
        C1659h x = wVar.mo7086x();
        C2355b bVar = C1627g.f5076h.f5096B;
        C1489j.m6969a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return x.mo7254a(bVar) != null;
    }

    /* renamed from: a */
    public static final C1580b m7368a(C1804m mVar) {
        C1489j.m6972b(mVar, "$receiver");
        if ((mVar instanceof C1796e) && C1627g.m7402b(mVar)) {
            return m7369a(C2524a.m12621a(mVar));
        }
        return null;
    }

    /* renamed from: a */
    private static final C1580b m7369a(C2356c cVar) {
        if (!cVar.mo9026b() || cVar.mo9029d()) {
            return null;
        }
        C1574a aVar = C1573a.f4956a;
        String a = cVar.mo9032f().mo9039a();
        C1489j.m6969a((Object) a, "shortName().asString()");
        C2355b d = cVar.mo9028c().mo9017d();
        C1489j.m6969a((Object) d, "toSafe().parent()");
        return aVar.mo7055a(a, d);
    }

    /* renamed from: e */
    public static final C2841w m7377e(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        boolean c = m7375c(wVar);
        if (C3232z.f8648a && !c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a function type: ");
            sb.append(wVar);
            throw new AssertionError(sb.toString());
        } else if (m7381i(wVar)) {
            return ((C2771ap) C1415k.m6883f(wVar.mo9501a())).mo9869c();
        } else {
            return null;
        }
    }

    /* renamed from: f */
    public static final C2841w m7378f(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        boolean c = m7375c(wVar);
        if (!C3232z.f8648a || c) {
            C2841w c2 = ((C2771ap) C1415k.m6886h(wVar.mo9501a())).mo9869c();
            C1489j.m6969a((Object) c2, "arguments.last().type");
            return c2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a function type: ");
        sb.append(wVar);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: g */
    public static final List<C2771ap> m7379g(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        boolean c = m7375c(wVar);
        if (!C3232z.f8648a || c) {
            List a = wVar.mo9501a();
            int d = m7376d(wVar);
            boolean z = true;
            int size = a.size() - 1;
            if (d > size) {
                z = false;
            }
            if (!C3232z.f8648a || z) {
                return a.subList(d, size);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Not an exact function type: ");
            sb.append(wVar);
            throw new AssertionError(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Not a function type: ");
        sb2.append(wVar);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: h */
    public static final C2360f m7380h(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        C1659h x = wVar.mo7086x();
        C2355b bVar = C1627g.f5076h.f5097C;
        C1489j.m6969a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.parameterName");
        C1651c a = x.mo7254a(bVar);
        if (a == null) {
            return null;
        }
        Object g = C1415k.m6884g((Iterable<? extends T>) a.mo7241c().values());
        if (!(g instanceof C2517s)) {
            g = null;
        }
        C2517s sVar = (C2517s) g;
        if (sVar != null) {
            String str = (String) sVar.mo9521a();
            if (str != null) {
                if (!C2360f.m11702b(str)) {
                    str = null;
                }
                if (str != null) {
                    return C2360f.m11701a(str);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r2.mo9041c() == false) goto L_0x0056;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<p073b.p085h.p087b.p088a.p090b.p131l.C2771ap> m7372a(p073b.p085h.p087b.p088a.p090b.p131l.C2841w r10, java.util.List<? extends p073b.p085h.p087b.p088a.p090b.p131l.C2841w> r11, java.util.List<p073b.p085h.p087b.p088a.p090b.p116f.C2360f> r12, p073b.p085h.p087b.p088a.p090b.p131l.C2841w r13, p073b.p085h.p087b.p088a.p090b.p091a.C1627g r14) {
        /*
            java.lang.String r0 = "parameterTypes"
            p073b.p079e.p081b.C1489j.m6972b(r11, r0)
            java.lang.String r0 = "returnType"
            p073b.p079e.p081b.C1489j.m6972b(r13, r0)
            java.lang.String r0 = "builtIns"
            p073b.p079e.p081b.C1489j.m6972b(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r2 = 0
            r3 = 1
            if (r10 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            int r1 = r1 + r4
            int r1 = r1 + r3
            r0.<init>(r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = 0
            if (r10 == 0) goto L_0x002c
            b.h.b.a.b.l.ap r10 = p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a.m13683f(r10)
            goto L_0x002d
        L_0x002c:
            r10 = r3
        L_0x002d:
            p073b.p085h.p087b.p088a.p090b.p139n.C2885a.m13950a(r1, r10)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r10 = r11.iterator()
        L_0x0036:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00a0
            java.lang.Object r11 = r10.next()
            int r4 = r2 + 1
            b.h.b.a.b.l.w r11 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r11
            if (r12 == 0) goto L_0x0055
            java.lang.Object r2 = r12.get(r2)
            b.h.b.a.b.f.f r2 = (p073b.p085h.p087b.p088a.p090b.p116f.C2360f) r2
            if (r2 == 0) goto L_0x0055
            boolean r5 = r2.mo9041c()
            if (r5 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            if (r2 == 0) goto L_0x0097
            b.h.b.a.b.b.a.k r5 = new b.h.b.a.b.b.a.k
            b.h.b.a.b.a.g$a r6 = p073b.p085h.p087b.p088a.p090b.p091a.C1627g.f5076h
            b.h.b.a.b.f.b r6 = r6.f5097C
            java.lang.String r7 = "KotlinBuiltIns.FQ_NAMES.parameterName"
            p073b.p079e.p081b.C1489j.m6969a(r6, r7)
            java.lang.String r7 = "name"
            b.h.b.a.b.f.f r7 = p073b.p085h.p087b.p088a.p090b.p116f.C2360f.m11701a(r7)
            b.h.b.a.b.i.b.s r8 = new b.h.b.a.b.i.b.s
            java.lang.String r2 = r2.mo9039a()
            java.lang.String r9 = "name.asString()"
            p073b.p079e.p081b.C1489j.m6969a(r2, r9)
            r8.<init>(r2)
            b.p r2 = p073b.C3226t.m14841a(r7, r8)
            java.util.Map r2 = p073b.p074a.C1389ad.m6743a(r2)
            r5.<init>(r14, r6, r2)
            b.h.b.a.b.b.a.i r2 = new b.h.b.a.b.b.a.i
            b.h.b.a.b.b.a.h r6 = r11.mo7086x()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r5 = p073b.p074a.C1415k.m6877d(r6, r5)
            r2.<init>(r5)
            b.h.b.a.b.b.a.h r2 = (p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h) r2
            b.h.b.a.b.l.w r11 = p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a.m13676a(r11, r2)
        L_0x0097:
            b.h.b.a.b.l.ap r11 = p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a.m13683f(r11)
            r1.add(r11)
            r2 = r4
            goto L_0x0036
        L_0x00a0:
            b.h.b.a.b.l.ap r10 = p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a.m13683f(r13)
            r0.add(r10)
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p091a.C1626f.m7372a(b.h.b.a.b.l.w, java.util.List, java.util.List, b.h.b.a.b.l.w, b.h.b.a.b.a.g):java.util.List");
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C2755ad m7371a(C1627g gVar, C1659h hVar, C2841w wVar, List list, List list2, C2841w wVar2, boolean z, int i, Object obj) {
        return m7370a(gVar, hVar, wVar, list, list2, wVar2, (i & 64) != 0 ? false : z);
    }

    /* renamed from: a */
    public static final C2755ad m7370a(C1627g gVar, C1659h hVar, C2841w wVar, List<? extends C2841w> list, List<C2360f> list2, C2841w wVar2, boolean z) {
        C1489j.m6972b(gVar, "builtIns");
        C1489j.m6972b(hVar, "annotations");
        C1489j.m6972b(list, "parameterTypes");
        C1489j.m6972b(wVar2, "returnType");
        List a = m7372a(wVar, list, list2, wVar2, gVar);
        int size = list.size();
        if (wVar != null) {
            size++;
        }
        C1796e d = z ? gVar.mo7193d(size) : gVar.mo7191c(size);
        if (wVar != null) {
            C2355b bVar = C1627g.f5076h.f5096B;
            C1489j.m6969a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
            if (hVar.mo7254a(bVar) == null) {
                Iterable iterable = hVar;
                C2355b bVar2 = C1627g.f5076h.f5096B;
                C1489j.m6969a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                hVar = new C1663i(C1415k.m6877d(iterable, new C1666k(gVar, bVar2, C1389ad.m6747a())));
            }
        }
        C1489j.m6969a((Object) d, "classDescriptor");
        return C2842x.m13880a(hVar, d, a);
    }
}
