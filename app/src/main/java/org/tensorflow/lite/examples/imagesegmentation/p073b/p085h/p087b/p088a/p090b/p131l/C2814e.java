package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap.C1698a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.l.e */
/* compiled from: ClassTypeConstructorImpl */
public class C2814e extends C2789b implements C2767an {

    /* renamed from: a */
    private final C1796e f8084a;

    /* renamed from: b */
    private final List<C1700ar> f8085b;

    /* renamed from: c */
    private final Collection<C2841w> f8086c;

    /* renamed from: f */
    public boolean mo7097f() {
        return true;
    }

    public C2814e(C1796e eVar, List<? extends C1700ar> list, Collection<C2841w> collection, C2713i iVar) {
        super(iVar);
        this.f8084a = eVar;
        this.f8085b = Collections.unmodifiableList(new ArrayList(list));
        this.f8086c = Collections.unmodifiableCollection(collection);
    }

    /* renamed from: b */
    public List<C1700ar> mo7094b() {
        return this.f8085b;
    }

    public String toString() {
        return C2523c.m12596d(this.f8084a).mo9025a();
    }

    /* renamed from: B_ */
    public C1796e mo7096d() {
        return this.f8084a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<C2841w> mo7093a() {
        return this.f8086c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C1697ap mo7098g() {
        return C1698a.f5333a;
    }
}
