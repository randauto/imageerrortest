package p073b.p085h.p087b.p088a.p090b.p127j.p128a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p073b.C3221p;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p084g.C1517d;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1675aa;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1810s;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1651c;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1653d;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a.C2162a;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a.C2162a.C2165b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a.C2162a.C2165b.C2168b;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f;
import p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2513o;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2773ar;
import p073b.p085h.p087b.p088a.p090b.p131l.C2827p;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;
import p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a;

/* renamed from: b.h.b.a.b.j.a.c */
/* compiled from: AnnotationDeserializer.kt */
public final class C2646c {

    /* renamed from: a */
    private final C1821y f7817a;

    /* renamed from: b */
    private final C1675aa f7818b;

    public C2646c(C1821y yVar, C1675aa aaVar) {
        C1489j.m6972b(yVar, "module");
        C1489j.m6972b(aaVar, "notFoundClasses");
        this.f7817a = yVar;
        this.f7818b = aaVar;
    }

    /* renamed from: a */
    private final C1627g m13124a() {
        return this.f7817a.mo7522a();
    }

    /* renamed from: a */
    public final C1651c mo9697a(C2160a aVar, C2285c cVar) {
        C1489j.m6972b(aVar, "proto");
        C1489j.m6972b(cVar, "nameResolver");
        C1796e b = m13128b(C2674r.m13223a(cVar, aVar.mo8103e()));
        Map a = C1389ad.m6747a();
        if (aVar.mo8105g() != 0) {
            C1804m mVar = b;
            if (!C2827p.m13783a(mVar) && C2523c.m12606n(mVar)) {
                Collection k = b.mo7072k();
                C1489j.m6969a((Object) k, "annotationClass.constructors");
                C1795d dVar = (C1795d) C1415k.m6884g((Iterable<? extends T>) k);
                if (dVar != null) {
                    List i = dVar.mo7236i();
                    C1489j.m6969a((Object) i, "constructor.valueParameters");
                    Iterable iterable = i;
                    Map linkedHashMap = new LinkedHashMap(C1517d.m7048c(C1389ad.m6746a(C1415k.m6842a(iterable, 10)), 16));
                    for (Object next : iterable) {
                        C1705au auVar = (C1705au) next;
                        C1489j.m6969a((Object) auVar, "it");
                        linkedHashMap.put(auVar.mo7351z_(), next);
                    }
                    List f = aVar.mo8104f();
                    C1489j.m6969a((Object) f, "proto.argumentList");
                    Iterable<C2162a> iterable2 = f;
                    Collection arrayList = new ArrayList();
                    for (C2162a aVar2 : iterable2) {
                        C1489j.m6969a((Object) aVar2, "it");
                        C3221p a2 = m13127a(aVar2, linkedHashMap, cVar);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    a = C1389ad.m6748a((Iterable<? extends C3221p<? extends K, ? extends V>>) (List) arrayList);
                }
            }
        }
        return new C1653d(b.mo7346A_(), a, C1692am.f5331a);
    }

    /* renamed from: a */
    private final C3221p<C2360f, C2500f<?>> m13127a(C2162a aVar, Map<C2360f, ? extends C1705au> map, C2285c cVar) {
        C1705au auVar = (C1705au) map.get(C2674r.m13224b(cVar, aVar.mo8117e()));
        if (auVar == null) {
            return null;
        }
        C2360f b = C2674r.m13224b(cVar, aVar.mo8117e());
        C2841w r = auVar.mo7320r();
        C1489j.m6969a((Object) r, "parameter.type");
        C2165b g = aVar.mo8119g();
        C1489j.m6969a((Object) g, "proto.value");
        return new C3221p<>(b, mo9698a(r, g, cVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ff, code lost:
        if (p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a.m13678a(r8.mo9516a(r6.f7817a), r7) == false) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2506j.f7553a.mo9531a("Unexpected argument value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f<?> mo9698a(p073b.p085h.p087b.p088a.p090b.p131l.C2841w r7, p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a.C2162a.C2165b r8, p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c r9) {
        /*
            r6 = this;
            java.lang.String r0 = "expectedType"
            p073b.p079e.p081b.C1489j.m6972b(r7, r0)
            java.lang.String r0 = "value"
            p073b.p079e.p081b.C1489j.m6972b(r8, r0)
            java.lang.String r0 = "nameResolver"
            p073b.p079e.p081b.C1489j.m6972b(r9, r0)
            b.h.b.a.b.e.a.b$a r0 = p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2280b.f7003K
            int r1 = r8.mo8143B()
            java.lang.Boolean r0 = r0.mo8809b(r1)
            b.h.b.a.b.e.a$a$a$b$b r1 = r8.mo8149e()
            if (r1 == 0) goto L_0x020e
            int[] r2 = p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2647d.f7819a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 0
            r3 = 1
            switch(r1) {
                case 1: goto L_0x01d6;
                case 2: goto L_0x01c7;
                case 3: goto L_0x01a7;
                case 4: goto L_0x0188;
                case 5: goto L_0x016a;
                case 6: goto L_0x015c;
                case 7: goto L_0x014e;
                case 8: goto L_0x0139;
                case 9: goto L_0x0127;
                case 10: goto L_0x0119;
                case 11: goto L_0x00ff;
                case 12: goto L_0x00e8;
                case 13: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x020e
        L_0x002e:
            boolean r0 = p073b.p085h.p087b.p088a.p090b.p091a.C1627g.m7409c(r7)
            if (r0 != 0) goto L_0x003a
            boolean r0 = p073b.p085h.p087b.p088a.p090b.p091a.C1627g.m7414d(r7)
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            java.util.List r8 = r8.mo8164y()
            java.lang.String r0 = "arrayElements"
            p073b.p079e.p081b.C1489j.m6969a(r8, r0)
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = p073b.p074a.C1415k.m6883f(r8)
            java.lang.String r1 = "arrayElements.first()"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)
            b.h.b.a.b.e.a$a$a$b r0 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a.C2162a.C2165b) r0
            b.h.b.a.b.l.ad r0 = r6.m13126a(r0, r9)
            b.h.b.a.b.a.g r1 = r6.m13124a()
            b.h.b.a.b.l.w r0 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r0
            b.h.b.a.b.l.ad r1 = r1.mo7190b(r0)
            if (r1 == 0) goto L_0x006d
            r0 = r1
            b.h.b.a.b.l.w r0 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r0
            goto L_0x009e
        L_0x006d:
            b.h.b.a.b.a.g r1 = r6.m13124a()
            b.h.b.a.b.l.ba r3 = p073b.p085h.p087b.p088a.p090b.p131l.C2792ba.INVARIANT
            b.h.b.a.b.l.ad r0 = r1.mo7186a(r3, r0)
            java.lang.String r1 = "builtIns.getArrayType(Va…RIANT, actualElementType)"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)
            b.h.b.a.b.l.w r0 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r0
            goto L_0x009e
        L_0x007f:
            if (r2 == 0) goto L_0x0083
            r0 = r7
            goto L_0x009e
        L_0x0083:
            b.h.b.a.b.a.g r0 = r6.m13124a()
            b.h.b.a.b.l.ba r1 = p073b.p085h.p087b.p088a.p090b.p131l.C2792ba.INVARIANT
            b.h.b.a.b.a.g r3 = r6.m13124a()
            b.h.b.a.b.l.ad r3 = r3.mo7206s()
            b.h.b.a.b.l.w r3 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r3
            b.h.b.a.b.l.ad r0 = r0.mo7186a(r1, r3)
            java.lang.String r1 = "builtIns.getArrayType(Va…ARIANT, builtIns.anyType)"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)
            b.h.b.a.b.l.w r0 = (p073b.p085h.p087b.p088a.p090b.p131l.C2841w) r0
        L_0x009e:
            b.h.b.a.b.a.g r1 = r6.m13124a()
            if (r2 == 0) goto L_0x00a6
            r2 = r7
            goto L_0x00a7
        L_0x00a6:
            r2 = r0
        L_0x00a7:
            b.h.b.a.b.l.w r1 = r1.mo7187a(r2)
            b.h.b.a.b.i.b.g r2 = p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2501g.f7548a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p073b.p074a.C1415k.m6842a(r8, r4)
            r3.<init>(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r8 = r8.iterator()
        L_0x00c0:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x00de
            java.lang.Object r4 = r8.next()
            b.h.b.a.b.e.a$a$a$b r4 = (p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2160a.C2162a.C2165b) r4
            java.lang.String r5 = "expectedElementType"
            p073b.p079e.p081b.C1489j.m6969a(r1, r5)
            java.lang.String r5 = "it"
            p073b.p079e.p081b.C1489j.m6969a(r4, r5)
            b.h.b.a.b.i.b.f r4 = r6.mo9698a(r1, r4, r9)
            r3.add(r4)
            goto L_0x00c0
        L_0x00de:
            java.util.List r3 = (java.util.List) r3
            b.h.b.a.b.i.b.b r8 = r2.mo9524a(r3, r0)
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x00e8:
            b.h.b.a.b.i.b.a r0 = new b.h.b.a.b.i.b.a
            b.h.b.a.b.e.a$a r8 = r8.mo8163x()
            java.lang.String r1 = "value.annotation"
            p073b.p079e.p081b.C1489j.m6969a(r8, r1)
            b.h.b.a.b.b.a.c r8 = r6.mo9697a(r8, r9)
            r0.<init>(r8)
            r8 = r0
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x00ff:
            b.h.b.a.b.i.b.i r0 = new b.h.b.a.b.i.b.i
            int r1 = r8.mo8159t()
            b.h.b.a.b.f.a r1 = p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2674r.m13223a(r9, r1)
            int r8 = r8.mo8161v()
            b.h.b.a.b.f.f r8 = p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2674r.m13224b(r9, r8)
            r0.<init>(r1, r8)
            r8 = r0
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x0119:
            int r8 = r8.mo8159t()
            b.h.b.a.b.f.a r8 = p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2674r.m13223a(r9, r8)
            b.h.b.a.b.i.b.f r8 = r6.m13125a(r8)
            goto L_0x01f5
        L_0x0127:
            b.h.b.a.b.i.b.s r0 = new b.h.b.a.b.i.b.s
            int r8 = r8.mo8157r()
            java.lang.String r8 = r9.mo8811a(r8)
            r0.<init>(r8)
            r8 = r0
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x0139:
            b.h.b.a.b.i.b.c r9 = new b.h.b.a.b.i.b.c
            long r0 = r8.mo8151g()
            r4 = 0
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0146
            r2 = 1
        L_0x0146:
            r9.<init>(r2)
            r8 = r9
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x014e:
            b.h.b.a.b.i.b.h r9 = new b.h.b.a.b.i.b.h
            double r0 = r8.mo8155p()
            r9.<init>(r0)
            r8 = r9
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x015c:
            b.h.b.a.b.i.b.k r9 = new b.h.b.a.b.i.b.k
            float r8 = r8.mo8153k()
            r9.<init>(r8)
            r8 = r9
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x016a:
            long r8 = r8.mo8151g()
            java.lang.String r1 = "isUnsigned"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x017f
            b.h.b.a.b.i.b.v r0 = new b.h.b.a.b.i.b.v
            r0.<init>(r8)
            goto L_0x0184
        L_0x017f:
            b.h.b.a.b.i.b.p r0 = new b.h.b.a.b.i.b.p
            r0.<init>(r8)
        L_0x0184:
            r8 = r0
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x0188:
            long r8 = r8.mo8151g()
            int r8 = (int) r8
            java.lang.String r9 = "isUnsigned"
            p073b.p079e.p081b.C1489j.m6969a(r0, r9)
            boolean r9 = r0.booleanValue()
            if (r9 == 0) goto L_0x019e
            b.h.b.a.b.i.b.u r9 = new b.h.b.a.b.i.b.u
            r9.<init>(r8)
            goto L_0x01a3
        L_0x019e:
            b.h.b.a.b.i.b.l r9 = new b.h.b.a.b.i.b.l
            r9.<init>(r8)
        L_0x01a3:
            r8 = r9
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x01a7:
            long r8 = r8.mo8151g()
            int r8 = (int) r8
            short r8 = (short) r8
            java.lang.String r9 = "isUnsigned"
            p073b.p079e.p081b.C1489j.m6969a(r0, r9)
            boolean r9 = r0.booleanValue()
            if (r9 == 0) goto L_0x01be
            b.h.b.a.b.i.b.w r9 = new b.h.b.a.b.i.b.w
            r9.<init>(r8)
            goto L_0x01c3
        L_0x01be:
            b.h.b.a.b.i.b.r r9 = new b.h.b.a.b.i.b.r
            r9.<init>(r8)
        L_0x01c3:
            r8 = r9
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x01c7:
            b.h.b.a.b.i.b.e r9 = new b.h.b.a.b.i.b.e
            long r0 = r8.mo8151g()
            int r8 = (int) r0
            char r8 = (char) r8
            r9.<init>(r8)
            r8 = r9
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
            goto L_0x01f5
        L_0x01d6:
            long r8 = r8.mo8151g()
            int r8 = (int) r8
            byte r8 = (byte) r8
            java.lang.String r9 = "isUnsigned"
            p073b.p079e.p081b.C1489j.m6969a(r0, r9)
            boolean r9 = r0.booleanValue()
            if (r9 == 0) goto L_0x01ed
            b.h.b.a.b.i.b.t r9 = new b.h.b.a.b.i.b.t
            r9.<init>(r8)
            goto L_0x01f2
        L_0x01ed:
            b.h.b.a.b.i.b.d r9 = new b.h.b.a.b.i.b.d
            r9.<init>(r8)
        L_0x01f2:
            r8 = r9
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
        L_0x01f5:
            b.h.b.a.b.b.y r9 = r6.f7817a
            b.h.b.a.b.l.w r9 = r8.mo9516a(r9)
            boolean r7 = p073b.p085h.p087b.p088a.p090b.p131l.p134c.C2803a.m13678a(r9, r7)
            if (r7 == 0) goto L_0x0202
            goto L_0x020d
        L_0x0202:
            b.h.b.a.b.i.b.j$a r7 = p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2506j.f7553a
            java.lang.String r8 = "Unexpected argument value"
            b.h.b.a.b.i.b.j r7 = r7.mo9531a(r8)
            r8 = r7
            b.h.b.a.b.i.b.f r8 = (p073b.p085h.p087b.p088a.p090b.p119i.p122b.C2500f) r8
        L_0x020d:
            return r8
        L_0x020e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Unsupported annotation argument type: "
            r9.append(r0)
            b.h.b.a.b.e.a$a$a$b$b r8 = r8.mo8149e()
            r9.append(r8)
            java.lang.String r8 = " (expected "
            r9.append(r8)
            r9.append(r7)
            r7 = 41
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2646c.mo9698a(b.h.b.a.b.l.w, b.h.b.a.b.e.a$a$a$b, b.h.b.a.b.e.a.c):b.h.b.a.b.i.b.f");
    }

    /* renamed from: a */
    private final C2500f<?> m13125a(C2354a aVar) {
        C2755ad A_ = m13128b(aVar).mo7346A_();
        C1489j.m6969a((Object) A_, "resolveClass(classId).defaultType");
        C2841w g = C2803a.m13684g(A_);
        C2354a a = C2354a.m11661a(C1627g.f5076h.f5124ac.mo9028c());
        C1489j.m6969a((Object) a, "ClassId.topLevel(KotlinB…FQ_NAMES.kClass.toSafe())");
        return new C2513o<>(C2842x.m13880a(C1659h.f5247a.mo7260a(), m13128b(a), C1415k.m6832a(new C2773ar(g))));
    }

    /* renamed from: a */
    private final C2755ad m13126a(C2165b bVar, C2285c cVar) {
        C1627g a = m13124a();
        C2168b e = bVar.mo8149e();
        if (e != null) {
            switch (C2647d.f7820b[e.ordinal()]) {
                case 1:
                    C2755ad v = a.mo7209v();
                    C1489j.m6969a((Object) v, "byteType");
                    return v;
                case 2:
                    C2755ad B = a.mo7179B();
                    C1489j.m6969a((Object) B, "charType");
                    return B;
                case 3:
                    C2755ad w = a.mo7210w();
                    C1489j.m6969a((Object) w, "shortType");
                    return w;
                case 4:
                    C2755ad x = a.mo7211x();
                    C1489j.m6969a((Object) x, "intType");
                    return x;
                case 5:
                    C2755ad y = a.mo7212y();
                    C1489j.m6969a((Object) y, "longType");
                    return y;
                case 6:
                    C2755ad z = a.mo7213z();
                    C1489j.m6969a((Object) z, "floatType");
                    return z;
                case 7:
                    C2755ad A = a.mo7178A();
                    C1489j.m6969a((Object) A, "doubleType");
                    return A;
                case 8:
                    C2755ad C = a.mo7180C();
                    C1489j.m6969a((Object) C, "booleanType");
                    return C;
                case 9:
                    C2755ad E = a.mo7182E();
                    C1489j.m6969a((Object) E, "stringType");
                    return E;
                case 10:
                    throw new IllegalStateException("Arrays of class literals are not supported yet".toString());
                case 11:
                    C2755ad A_ = m13128b(C2674r.m13223a(cVar, bVar.mo8159t())).mo7346A_();
                    C1489j.m6969a((Object) A_, "resolveClass(nameResolve…lue.classId)).defaultType");
                    return A_;
                case 12:
                    C2160a x2 = bVar.mo8163x();
                    C1489j.m6969a((Object) x2, "value.annotation");
                    C2755ad A_2 = m13128b(C2674r.m13223a(cVar, x2.mo8103e())).mo7346A_();
                    C1489j.m6969a((Object) A_2, "resolveClass(nameResolve…notation.id)).defaultType");
                    return A_2;
                case 13:
                    throw new IllegalStateException("Array of arrays is impossible".toString());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown type: ");
        sb.append(bVar.mo8149e());
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: b */
    private final C1796e m13128b(C2354a aVar) {
        return C1810s.m8444a(this.f7817a, aVar, this.f7818b);
    }
}
