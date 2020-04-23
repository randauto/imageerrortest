package p073b.p085h.p087b.p088a.p090b.p127j.p128a;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c.C2219b;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2280b;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2285c;
import p073b.p085h.p087b.p088a.p090b.p112e.p113a.C2290h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2354a;
import p073b.p085h.p087b.p088a.p090b.p116f.C2355b;

/* renamed from: b.h.b.a.b.j.a.s */
/* compiled from: ProtoContainer.kt */
public abstract class C2675s {

    /* renamed from: a */
    private final C2285c f7886a;

    /* renamed from: b */
    private final C2290h f7887b;

    /* renamed from: c */
    private final C1692am f7888c;

    /* renamed from: b.h.b.a.b.j.a.s$a */
    /* compiled from: ProtoContainer.kt */
    public static final class C2676a extends C2675s {

        /* renamed from: a */
        private final C2354a f7889a;

        /* renamed from: b */
        private final C2219b f7890b;

        /* renamed from: c */
        private final boolean f7891c;

        /* renamed from: d */
        private final C2216c f7892d;

        /* renamed from: e */
        private final C2676a f7893e;

        /* renamed from: h */
        public final C2676a mo9769h() {
            return this.f7893e;
        }

        public C2676a(C2216c cVar, C2285c cVar2, C2290h hVar, C1692am amVar, C2676a aVar) {
            C1489j.m6972b(cVar, "classProto");
            C1489j.m6972b(cVar2, "nameResolver");
            C1489j.m6972b(hVar, "typeTable");
            super(cVar2, hVar, amVar, null);
            this.f7892d = cVar;
            this.f7893e = aVar;
            this.f7889a = C2674r.m13223a(cVar2, this.f7892d.mo8467g());
            C2219b bVar = (C2219b) C2280b.f7008e.mo8809b(this.f7892d.mo8463e());
            if (bVar == null) {
                bVar = C2219b.CLASS;
            }
            this.f7890b = bVar;
            Boolean a = C2280b.f7009f.mo8809b(this.f7892d.mo8463e());
            C1489j.m6969a((Object) a, "Flags.IS_INNER.get(classProto.flags)");
            this.f7891c = a.booleanValue();
        }

        /* renamed from: e */
        public final C2354a mo9766e() {
            return this.f7889a;
        }

        /* renamed from: f */
        public final C2219b mo9767f() {
            return this.f7890b;
        }

        /* renamed from: g */
        public final boolean mo9768g() {
            return this.f7891c;
        }

        /* renamed from: a */
        public C2355b mo9761a() {
            C2355b g = this.f7889a.mo9008g();
            C1489j.m6969a((Object) g, "classId.asSingleFqName()");
            return g;
        }
    }

    /* renamed from: b.h.b.a.b.j.a.s$b */
    /* compiled from: ProtoContainer.kt */
    public static final class C2677b extends C2675s {

        /* renamed from: a */
        private final C2355b f7894a;

        public C2677b(C2355b bVar, C2285c cVar, C2290h hVar, C1692am amVar) {
            C1489j.m6972b(bVar, "fqName");
            C1489j.m6972b(cVar, "nameResolver");
            C1489j.m6972b(hVar, "typeTable");
            super(cVar, hVar, amVar, null);
            this.f7894a = bVar;
        }

        /* renamed from: a */
        public C2355b mo9761a() {
            return this.f7894a;
        }
    }

    /* renamed from: a */
    public abstract C2355b mo9761a();

    private C2675s(C2285c cVar, C2290h hVar, C1692am amVar) {
        this.f7886a = cVar;
        this.f7887b = hVar;
        this.f7888c = amVar;
    }

    public /* synthetic */ C2675s(C2285c cVar, C2290h hVar, C1692am amVar, C1486g gVar) {
        this(cVar, hVar, amVar);
    }

    /* renamed from: b */
    public final C2285c mo9762b() {
        return this.f7886a;
    }

    /* renamed from: c */
    public final C2290h mo9763c() {
        return this.f7887b;
    }

    /* renamed from: d */
    public final C1692am mo9764d() {
        return this.f7888c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(mo9761a());
        return sb.toString();
    }
}
