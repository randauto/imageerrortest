package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.Collection;
import java.util.Collections;
import p073b.p085h.p087b.p088a.p090b.p091a.C1627g;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p119i.p123c.C2524a;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p139n.C2908i;

/* renamed from: b.h.b.a.b.l.b */
/* compiled from: AbstractClassTypeConstructor */
public abstract class C2789b extends C2794c implements C2767an {

    /* renamed from: a */
    private int f8051a = 0;

    /* renamed from: B_ */
    public abstract C1796e mo7096d();

    public C2789b(C2713i iVar) {
        super(iVar);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f8051a;
        if (i2 != 0) {
            return i2;
        }
        C1796e B_ = mo7096d();
        if (m13604a((C1799h) B_)) {
            i = C2523c.m12596d(B_).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.f8051a = i;
        return i;
    }

    /* renamed from: e */
    public C1627g mo7407e() {
        return C2524a.m12627d(mo7096d());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2767an) || obj.hashCode() != hashCode()) {
            return false;
        }
        C2767an anVar = (C2767an) obj;
        if (anVar.mo7094b().size() != mo7094b().size()) {
            return false;
        }
        C1796e B_ = mo7096d();
        C1799h d = anVar.mo7096d();
        if (!m13604a((C1799h) B_) || ((d != null && !m13604a(d)) || !(d instanceof C1796e))) {
            return false;
        }
        return m13603a(B_, (C1796e) d);
    }

    /* renamed from: a */
    private static boolean m13603a(C1796e eVar, C1796e eVar2) {
        if (!eVar.mo7351z_().equals(eVar2.mo7351z_())) {
            return false;
        }
        C1804m b = eVar.mo7065b();
        C1804m b2 = eVar2.mo7065b();
        while (true) {
            boolean z = true;
            if (b == null || b2 == null) {
                return true;
            }
            if (b instanceof C1821y) {
                return b2 instanceof C1821y;
            }
            if (b2 instanceof C1821y) {
                return false;
            }
            if (b instanceof C1680ab) {
                if (!(b2 instanceof C1680ab) || !((C1680ab) b).mo7284f().equals(((C1680ab) b2).mo7284f())) {
                    z = false;
                }
                return z;
            } else if ((b2 instanceof C1680ab) || !b.mo7351z_().equals(b2.mo7351z_())) {
                return false;
            } else {
                b = b.mo7065b();
                b2 = b2.mo7065b();
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m13604a(C1799h hVar) {
        return !C2827p.m13783a((C1804m) hVar) && !C2523c.m12593b((C1804m) hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<C2841w> mo9893a(boolean z) {
        C1804m b = mo7096d().mo7065b();
        if (!(b instanceof C1796e)) {
            return Collections.emptyList();
        }
        C2908i iVar = new C2908i();
        C1796e eVar = (C1796e) b;
        iVar.add(eVar.mo7346A_());
        C1796e i = eVar.mo7070i();
        if (z && i != null) {
            iVar.add(i.mo7346A_());
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C2841w mo7413h() {
        if (C1627g.m7408c(mo7096d())) {
            return null;
        }
        return mo7407e().mo7206s();
    }
}
