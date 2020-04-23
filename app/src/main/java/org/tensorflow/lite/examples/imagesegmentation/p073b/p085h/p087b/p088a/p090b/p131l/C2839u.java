package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.List;
import p073b.C3227u;
import p073b.C3232z;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;

/* renamed from: b.h.b.a.b.l.u */
/* compiled from: TypeSubstitution.kt */
public final class C2839u extends C2774as {

    /* renamed from: a */
    private final C1700ar[] f8118a;

    /* renamed from: b */
    private final C2771ap[] f8119b;

    /* renamed from: c */
    private final boolean f8120c;

    /* renamed from: d */
    public final C1700ar[] mo9949d() {
        return this.f8118a;
    }

    /* renamed from: e */
    public final C2771ap[] mo9950e() {
        return this.f8119b;
    }

    public /* synthetic */ C2839u(C1700ar[] arVarArr, C2771ap[] apVarArr, boolean z, int i, C1486g gVar) {
        if ((i & 4) != 0) {
            z = false;
        }
        this(arVarArr, apVarArr, z);
    }

    public C2839u(C1700ar[] arVarArr, C2771ap[] apVarArr, boolean z) {
        C1489j.m6972b(arVarArr, "parameters");
        C1489j.m6972b(apVarArr, "arguments");
        this.f8118a = arVarArr;
        this.f8119b = apVarArr;
        this.f8120c = z;
        boolean z2 = this.f8118a.length <= this.f8119b.length;
        if (C3232z.f8648a && !z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Number of arguments should not be less then number of parameters, but: parameters=");
            sb.append(this.f8118a.length);
            sb.append(", args=");
            sb.append(this.f8119b.length);
            throw new AssertionError(sb.toString());
        }
    }

    public C2839u(List<? extends C1700ar> list, List<? extends C2771ap> list2) {
        C1489j.m6972b(list, "parameters");
        C1489j.m6972b(list2, "argumentsList");
        Object[] array = list.toArray(new C1700ar[0]);
        if (array != null) {
            C1700ar[] arVarArr = (C1700ar[]) array;
            Object[] array2 = list2.toArray(new C2771ap[0]);
            if (array2 != null) {
                this(arVarArr, (C2771ap[]) array2, false, 4, null);
                return;
            }
            throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C3227u("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public boolean mo7781a() {
        return this.f8119b.length == 0;
    }

    /* renamed from: b */
    public boolean mo9515b() {
        return this.f8120c;
    }

    /* renamed from: b */
    public C2771ap mo7782b(C2841w wVar) {
        C1489j.m6972b(wVar, "key");
        C1799h d = wVar.mo9507g().mo7096d();
        if (!(d instanceof C1700ar)) {
            d = null;
        }
        C1700ar arVar = (C1700ar) d;
        if (arVar == null) {
            return null;
        }
        int g = arVar.mo7314g();
        if (g >= this.f8118a.length || !C1489j.m6971a((Object) this.f8118a[g].mo7067e(), (Object) arVar.mo7067e())) {
            return null;
        }
        return this.f8119b[g];
    }
}
