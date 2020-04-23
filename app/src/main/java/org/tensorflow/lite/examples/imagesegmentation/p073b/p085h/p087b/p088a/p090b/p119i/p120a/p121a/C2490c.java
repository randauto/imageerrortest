package p073b.p085h.p087b.p088a.p090b.p119i.p120a.p121a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.C3221p;
import p073b.C3227u;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p130k.C2691b;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2771ap;
import p073b.p085h.p087b.p088a.p090b.p131l.C2773ar;
import p073b.p085h.p087b.p088a.p090b.p131l.C2774as;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2818h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2839u;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2844z;

/* renamed from: b.h.b.a.b.i.a.a.c */
/* compiled from: CapturedTypeConstructor.kt */
public final class C2490c {

    /* renamed from: b.h.b.a.b.i.a.a.c$a */
    /* compiled from: CapturedTypeConstructor.kt */
    static final class C2491a extends C1490k implements C1449a<C2841w> {

        /* renamed from: a */
        final /* synthetic */ C2771ap f7543a;

        C2491a(C2771ap apVar) {
            this.f7543a = apVar;
            super(0);
        }

        /* renamed from: b */
        public final C2841w mo6823a() {
            C2841w c = this.f7543a.mo9869c();
            C1489j.m6969a((Object) c, "this@createCapturedIfNeeded.type");
            return c;
        }
    }

    /* renamed from: b.h.b.a.b.i.a.a.c$b */
    /* compiled from: CapturedTypeConstructor.kt */
    public static final class C2492b extends C2818h {

        /* renamed from: a */
        final /* synthetic */ C2774as f7544a;

        /* renamed from: b */
        final /* synthetic */ boolean f7545b;

        C2492b(C2774as asVar, boolean z, C2774as asVar2) {
            this.f7544a = asVar;
            this.f7545b = z;
            super(asVar2);
        }

        /* renamed from: b */
        public boolean mo9515b() {
            return this.f7545b;
        }

        /* renamed from: b */
        public C2771ap mo7782b(C2841w wVar) {
            C1489j.m6972b(wVar, "key");
            C2771ap b = super.mo7782b(wVar);
            if (b == null) {
                return null;
            }
            C1799h d = wVar.mo9507g().mo7096d();
            if (!(d instanceof C1700ar)) {
                d = null;
            }
            return C2490c.m12503b(b, (C1700ar) d);
        }
    }

    /* renamed from: a */
    public static final C2841w m12501a(C2771ap apVar) {
        C1489j.m6972b(apVar, "typeProjection");
        C2488a aVar = new C2488a(apVar, null, false, null, 14, null);
        return aVar;
    }

    /* renamed from: a */
    public static final boolean m12502a(C2841w wVar) {
        C1489j.m6972b(wVar, "$receiver");
        return wVar.mo9507g() instanceof C2489b;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ C2774as m12500a(C2774as asVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m12499a(asVar, z);
    }

    /* renamed from: a */
    public static final C2774as m12499a(C2774as asVar, boolean z) {
        C1489j.m6972b(asVar, "$receiver");
        if (!(asVar instanceof C2839u)) {
            return new C2492b(asVar, z, asVar);
        }
        C2839u uVar = (C2839u) asVar;
        C1700ar[] d = uVar.mo9949d();
        Iterable<C3221p> a = C1406e.m6795a((T[]) uVar.mo9950e(), (R[]) uVar.mo9949d());
        Collection arrayList = new ArrayList(C1415k.m6842a(a, 10));
        for (C3221p pVar : a) {
            arrayList.add(m12503b((C2771ap) pVar.mo10387a(), (C1700ar) pVar.mo10388b()));
        }
        Object[] array = ((List) arrayList).toArray(new C2771ap[0]);
        if (array != null) {
            return new C2839u(d, (C2771ap[]) array, z);
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C2771ap m12503b(C2771ap apVar, C1700ar arVar) {
        C2771ap apVar2;
        if (arVar == null || apVar.mo9868b() == C2792ba.INVARIANT) {
            return apVar;
        }
        if (arVar.mo7316k() != apVar.mo9868b()) {
            return new C2773ar(m12501a(apVar));
        }
        if (apVar.mo9867a()) {
            C2713i iVar = C2691b.f7924a;
            C1489j.m6969a((Object) iVar, "LockBasedStorageManager.NO_LOCKS");
            apVar2 = new C2773ar(new C2844z(iVar, new C2491a(apVar)));
        } else {
            apVar2 = new C2773ar(apVar.mo9869c());
        }
        return apVar2;
    }
}
