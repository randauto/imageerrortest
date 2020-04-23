package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.C3227u;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;

/* renamed from: b.h.b.a.b.l.bb */
/* compiled from: KotlinType.kt */
public abstract class C2793bb extends C2841w {
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C2841w mo9900d();

    /* renamed from: e */
    public boolean mo9901e() {
        return true;
    }

    public C2793bb() {
        super(null);
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return mo9900d().mo7086x();
    }

    /* renamed from: g */
    public C2767an mo9507g() {
        return mo9900d().mo9507g();
    }

    /* renamed from: a */
    public List<C2771ap> mo9501a() {
        return mo9900d().mo9501a();
    }

    /* renamed from: c */
    public boolean mo7897c() {
        return mo9900d().mo7897c();
    }

    /* renamed from: b */
    public C2560h mo7787b() {
        return mo9900d().mo7787b();
    }

    /* renamed from: l */
    public final C2788az mo9892l() {
        C2841w d = mo9900d();
        while (d instanceof C2793bb) {
            d = ((C2793bb) d).mo9900d();
        }
        if (d != null) {
            return (C2788az) d;
        }
        throw new C3227u("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
    }

    public String toString() {
        return mo9901e() ? mo9900d().toString() : "<Not computed yet>";
    }
}
