package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p109f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p073b.C3221p;
import p073b.C3226t;
import p073b.C3230x;
import p073b.p074a.C1389ad;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p074a.C1433z;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p084g.C1517d;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2150u;
import p073b.p085h.p087b.p088a.p090b.p119i.p124d.C2536c;

/* renamed from: b.h.b.a.b.d.a.f.m */
/* compiled from: predefinedEnhancementInfo.kt */
final class C2065m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<String, C2051j> f6294a = new LinkedHashMap();

    /* renamed from: b.h.b.a.b.d.a.f.m$a */
    /* compiled from: predefinedEnhancementInfo.kt */
    public final class C2066a {

        /* renamed from: a */
        final /* synthetic */ C2065m f6295a;

        /* renamed from: b */
        private final String f6296b;

        /* renamed from: b.h.b.a.b.d.a.f.m$a$a */
        /* compiled from: predefinedEnhancementInfo.kt */
        public final class C2067a {

            /* renamed from: a */
            final /* synthetic */ C2066a f6297a;

            /* renamed from: b */
            private final List<C3221p<String, C2072r>> f6298b = new ArrayList();

            /* renamed from: c */
            private C3221p<String, C2072r> f6299c = C3226t.m14841a("V", null);

            /* renamed from: d */
            private final String f6300d;

            public C2067a(C2066a aVar, String str) {
                C1489j.m6972b(str, "functionName");
                this.f6297a = aVar;
                this.f6300d = str;
            }

            /* renamed from: a */
            public final void mo7957a(String str, C2016d... dVarArr) {
                C2072r rVar;
                C1489j.m6972b(str, "type");
                C1489j.m6972b(dVarArr, "qualifiers");
                Collection collection = this.f6298b;
                if (dVarArr.length == 0) {
                    rVar = null;
                } else {
                    Iterable<C1433z> k = C1406e.m6826k(dVarArr);
                    Map linkedHashMap = new LinkedHashMap(C1517d.m7048c(C1389ad.m6746a(C1415k.m6842a(k, 10)), 16));
                    for (C1433z zVar : k) {
                        linkedHashMap.put(Integer.valueOf(zVar.mo6910a()), (C2016d) zVar.mo6911b());
                    }
                    rVar = new C2072r(linkedHashMap);
                }
                collection.add(C3226t.m14841a(str, rVar));
            }

            /* renamed from: b */
            public final void mo7958b(String str, C2016d... dVarArr) {
                C1489j.m6972b(str, "type");
                C1489j.m6972b(dVarArr, "qualifiers");
                Iterable<C1433z> k = C1406e.m6826k(dVarArr);
                Map linkedHashMap = new LinkedHashMap(C1517d.m7048c(C1389ad.m6746a(C1415k.m6842a(k, 10)), 16));
                for (C1433z zVar : k) {
                    linkedHashMap.put(Integer.valueOf(zVar.mo6910a()), (C2016d) zVar.mo6911b());
                }
                this.f6299c = C3226t.m14841a(str, new C2072r(linkedHashMap));
            }

            /* renamed from: a */
            public final void mo7956a(C2536c cVar) {
                C1489j.m6972b(cVar, "type");
                this.f6299c = C3226t.m14841a(cVar.mo9561c(), null);
            }

            /* renamed from: a */
            public final C3221p<String, C2051j> mo7955a() {
                C2150u uVar = C2150u.f6453a;
                String a = this.f6297a.mo7953a();
                String str = this.f6300d;
                Iterable<C3221p> iterable = this.f6298b;
                Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
                for (C3221p a2 : iterable) {
                    arrayList.add((String) a2.mo10387a());
                }
                String a3 = uVar.mo8077a(a, uVar.mo8078a(str, (List) arrayList, (String) this.f6299c.mo10387a()));
                C2072r rVar = (C2072r) this.f6299c.mo10388b();
                Iterable<C3221p> iterable2 = this.f6298b;
                Collection arrayList2 = new ArrayList(C1415k.m6842a(iterable2, 10));
                for (C3221p b : iterable2) {
                    arrayList2.add((C2072r) b.mo10388b());
                }
                return C3226t.m14841a(a3, new C2051j(rVar, (List) arrayList2));
            }
        }

        public C2066a(C2065m mVar, String str) {
            C1489j.m6972b(str, "className");
            this.f6295a = mVar;
            this.f6296b = str;
        }

        /* renamed from: a */
        public final String mo7953a() {
            return this.f6296b;
        }

        /* renamed from: a */
        public final void mo7954a(String str, C1450b<? super C2067a, C3230x> bVar) {
            C1489j.m6972b(str, "name");
            C1489j.m6972b(bVar, "block");
            Map a = this.f6295a.f6294a;
            C2067a aVar = new C2067a(this, str);
            bVar.mo6756a(aVar);
            C3221p a2 = aVar.mo7955a();
            a.put(a2.mo10387a(), a2.mo10388b());
        }
    }

    /* renamed from: a */
    public final Map<String, C2051j> mo7952a() {
        return this.f6294a;
    }
}
