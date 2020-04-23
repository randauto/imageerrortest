package p073b.p085h.p087b.p088a.p090b.p131l;

/* renamed from: b.h.b.a.b.l.aq */
/* compiled from: TypeProjectionBase */
public abstract class C2772aq implements C2771ap {
    public String toString() {
        if (mo9867a()) {
            return "*";
        }
        if (mo9868b() == C2792ba.INVARIANT) {
            return mo9869c().toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo9868b());
        sb.append(" ");
        sb.append(mo9869c());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2771ap)) {
            return false;
        }
        C2771ap apVar = (C2771ap) obj;
        return mo9867a() == apVar.mo9867a() && mo9868b() == apVar.mo9868b() && mo9869c().equals(apVar.mo9869c());
    }

    public int hashCode() {
        return (mo9868b().hashCode() * 31) + (mo9867a() ? 17 : mo9869c().hashCode());
    }
}
