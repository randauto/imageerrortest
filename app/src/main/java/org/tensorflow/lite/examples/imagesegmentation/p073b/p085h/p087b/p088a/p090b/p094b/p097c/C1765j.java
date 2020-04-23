package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1650b;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;

/* renamed from: b.h.b.a.b.b.c.j */
/* compiled from: DeclarationDescriptorImpl */
public abstract class C1765j extends C1650b implements C1804m {

    /* renamed from: a */
    private final C2360f f5438a;

    /* renamed from: E_ */
    public C1804m mo7347E_() {
        return this;
    }

    public C1765j(C1659h hVar, C2360f fVar) {
        super(hVar);
        this.f5438a = fVar;
    }

    /* renamed from: z_ */
    public C2360f mo7351z_() {
        return this.f5438a;
    }

    public String toString() {
        return m8000a(this);
    }

    /* renamed from: a */
    public static String m8000a(C1804m mVar) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C2443c.f7423h.mo9344a(mVar));
            sb.append("[");
            sb.append(mVar.getClass().getSimpleName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(mVar)));
            sb.append("]");
            return sb.toString();
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mVar.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(mVar.mo7351z_());
            return sb2.toString();
        }
    }
}
