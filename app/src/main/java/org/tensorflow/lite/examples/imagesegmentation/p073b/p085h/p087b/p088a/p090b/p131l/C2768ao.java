package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p073b.C3221p;
import p073b.p074a.C1389ad;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;

/* renamed from: b.h.b.a.b.l.ao */
/* compiled from: TypeSubstitution.kt */
public abstract class C2768ao extends C2774as {

    /* renamed from: b */
    public static final C2769a f8029b = new C2769a(null);

    /* renamed from: b.h.b.a.b.l.ao$a */
    /* compiled from: TypeSubstitution.kt */
    public static final class C2769a {

        /* renamed from: b.h.b.a.b.l.ao$a$a */
        /* compiled from: TypeSubstitution.kt */
        public static final class C2770a extends C2768ao {

            /* renamed from: a */
            final /* synthetic */ Map f8030a;

            /* renamed from: c */
            final /* synthetic */ boolean f8031c;

            C2770a(Map map, boolean z) {
                this.f8030a = map;
                this.f8031c = z;
            }

            /* renamed from: a */
            public C2771ap mo9871a(C2767an anVar) {
                C1489j.m6972b(anVar, "key");
                return (C2771ap) this.f8030a.get(anVar);
            }

            /* renamed from: a */
            public boolean mo7781a() {
                return this.f8030a.isEmpty();
            }

            /* renamed from: c */
            public boolean mo9875c() {
                return this.f8031c;
            }
        }

        private C2769a() {
        }

        public /* synthetic */ C2769a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* bridge */ /* synthetic */ C2768ao m13520a(C2769a aVar, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo9872a(map, z);
        }

        /* renamed from: a */
        public final C2768ao mo9872a(Map<C2767an, ? extends C2771ap> map, boolean z) {
            C1489j.m6972b(map, "map");
            return new C2770a(map, z);
        }

        /* renamed from: a */
        public final C2774as mo9874a(C2841w wVar) {
            C1489j.m6972b(wVar, "kotlinType");
            return mo9873a(wVar.mo9507g(), wVar.mo9501a());
        }

        /* renamed from: a */
        public final C2774as mo9873a(C2767an anVar, List<? extends C2771ap> list) {
            C1489j.m6972b(anVar, "typeConstructor");
            C1489j.m6972b(list, "arguments");
            List b = anVar.mo7094b();
            C1489j.m6969a((Object) b, "parameters");
            C1700ar arVar = (C1700ar) C1415k.m6888i(b);
            if (!(arVar != null ? arVar.mo7312a() : false)) {
                return new C2839u(b, list);
            }
            C2769a aVar = this;
            List b2 = anVar.mo7094b();
            C1489j.m6969a((Object) b2, "typeConstructor.parameters");
            Iterable<C1700ar> iterable = b2;
            Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
            for (C1700ar arVar2 : iterable) {
                C1489j.m6969a((Object) arVar2, "it");
                arrayList.add(arVar2.mo7067e());
            }
            return m13520a(aVar, C1389ad.m6748a((Iterable<? extends C3221p<? extends K, ? extends V>>) C1415k.m6861a((Iterable<? extends T>) (List) arrayList, (Iterable<? extends R>) list)), false, 2, null);
        }
    }

    /* renamed from: a */
    public static final C2768ao m13516a(Map<C2767an, ? extends C2771ap> map) {
        return C2769a.m13520a(f8029b, map, false, 2, null);
    }

    /* renamed from: a */
    public static final C2774as m13517a(C2767an anVar, List<? extends C2771ap> list) {
        return f8029b.mo9873a(anVar, list);
    }

    /* renamed from: a */
    public abstract C2771ap mo9871a(C2767an anVar);

    /* renamed from: b */
    public C2771ap mo7782b(C2841w wVar) {
        C1489j.m6972b(wVar, "key");
        return mo9871a(wVar.mo9507g());
    }
}
