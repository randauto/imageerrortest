package p073b.p085h.p087b.p088a.p090b.p094b.p097c;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1691al;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1710ay;
import p073b.p085h.p087b.p088a.p090b.p094b.C1723az;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1795d;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1797f;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1818w;
import p073b.p085h.p087b.p088a.p090b.p094b.p095a.C1659h;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1827b;
import p073b.p085h.p087b.p088a.p090b.p098c.p099a.C1830d;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2582h;
import p073b.p085h.p087b.p088a.p090b.p119i.C2584j;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2552d;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2560h.C2564c;
import p073b.p085h.p087b.p088a.p090b.p119i.p125e.C2565i;
import p073b.p085h.p087b.p088a.p090b.p130k.C2707c;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;
import p073b.p085h.p087b.p088a.p090b.p131l.C2767an;
import p073b.p085h.p087b.p088a.p090b.p131l.C2814e;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.b.c.n */
/* compiled from: EnumEntrySyntheticClassDescriptor */
public class C1769n extends C1762g {

    /* renamed from: c */
    static final /* synthetic */ boolean f5441c = (!C1769n.class.desiredAssertionStatus());

    /* renamed from: d */
    private final C2767an f5442d;

    /* renamed from: e */
    private final C2560h f5443e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2710f<Set<C2360f>> f5444f;

    /* renamed from: g */
    private final C1659h f5445g;

    /* renamed from: b.h.b.a.b.b.c.n$a */
    /* compiled from: EnumEntrySyntheticClassDescriptor */
    private class C1770a extends C2565i {

        /* renamed from: a */
        static final /* synthetic */ boolean f5446a = (!C1769n.class.desiredAssertionStatus());

        /* renamed from: d */
        private final C2707c<C2360f, Collection<C1691al>> f5448d;

        /* renamed from: e */
        private final C2707c<C2360f, Collection<C1687ah>> f5449e;

        /* renamed from: f */
        private final C2710f<Collection<C1804m>> f5450f;

        public C1770a(C2713i iVar) {
            this.f5448d = iVar.mo9791a((C1450b<? super K, ? extends V>) new C1450b<C2360f, Collection<C1691al>>(C1769n.this) {
                /* renamed from: a */
                public Collection<C1691al> mo6756a(C2360f fVar) {
                    return C1770a.this.m8048b(fVar);
                }
            });
            this.f5449e = iVar.mo9791a((C1450b<? super K, ? extends V>) new C1450b<C2360f, Collection<C1687ah>>(C1769n.this) {
                /* renamed from: a */
                public Collection<C1687ah> mo6756a(C2360f fVar) {
                    return C1770a.this.m8045a(fVar);
                }
            });
            this.f5450f = iVar.mo9793a((C1449a<? extends T>) new C1449a<Collection<C1804m>>(C1769n.this) {
                /* renamed from: b */
                public Collection<C1804m> mo6823a() {
                    return C1770a.this.m8050d();
                }
            });
        }

        /* renamed from: a */
        public Collection mo7443a(C2360f fVar, C1827b bVar) {
            return (Collection) this.f5449e.mo6756a(fVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Collection<C1687ah> m8045a(C2360f fVar) {
            return m8046a(fVar, m8049c().mo7443a(fVar, C1830d.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: b */
        public Collection mo7444b(C2360f fVar, C1827b bVar) {
            return (Collection) this.f5448d.mo6756a(fVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Collection<C1691al> m8048b(C2360f fVar) {
            return m8046a(fVar, m8049c().mo7444b(fVar, C1830d.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: c */
        private C2560h m8049c() {
            Collection C_ = C1769n.this.mo7067e().mo7405C_();
            if (f5446a || C_.size() == 1) {
                return ((C2841w) C_.iterator().next()).mo7787b();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Enum entry and its companion object both should have exactly one supertype: ");
            sb.append(C_);
            throw new AssertionError(sb.toString());
        }

        /* renamed from: a */
        private <D extends C1724b> Collection<D> m8046a(C2360f fVar, Collection<D> collection) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            C2584j.m12828a(fVar, collection, Collections.emptySet(), C1769n.this, new C2582h() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo7449a(C1724b bVar, C1724b bVar2) {
                }

                /* renamed from: a */
                public void mo7448a(C1724b bVar) {
                    C2584j.m12825a(bVar, null);
                    linkedHashSet.add(bVar);
                }
            });
            return linkedHashSet;
        }

        /* renamed from: a */
        public Collection<C1804m> mo7373a(C2552d dVar, C1450b<? super C2360f, Boolean> bVar) {
            return (Collection) this.f5450f.mo6823a();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public Collection<C1804m> m8050d() {
            HashSet hashSet = new HashSet();
            for (C2360f fVar : (Set) C1769n.this.f5444f.mo6823a()) {
                hashSet.addAll(mo7444b(fVar, (C1827b) C1830d.FOR_NON_TRACKED_SCOPE));
                hashSet.addAll(mo7443a(fVar, (C1827b) C1830d.FOR_NON_TRACKED_SCOPE));
            }
            return hashSet;
        }

        /* renamed from: D_ */
        public Set<C2360f> mo7441D_() {
            return (Set) C1769n.this.f5444f.mo6823a();
        }

        /* renamed from: G_ */
        public Set<C2360f> mo7442G_() {
            return (Set) C1769n.this.f5444f.mo6823a();
        }
    }

    /* renamed from: i */
    public C1796e mo7070i() {
        return null;
    }

    /* renamed from: o */
    public C1795d mo7076o() {
        return null;
    }

    /* renamed from: q */
    public boolean mo7078q() {
        return false;
    }

    /* renamed from: r */
    public boolean mo7079r() {
        return false;
    }

    /* renamed from: s */
    public boolean mo7080s() {
        return false;
    }

    /* renamed from: t */
    public boolean mo7081t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo7083u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo7084v() {
        return false;
    }

    /* renamed from: a */
    public static C1769n m8024a(C2713i iVar, C1796e eVar, C2360f fVar, C2710f<Set<C2360f>> fVar2, C1659h hVar, C1692am amVar) {
        C1769n nVar = new C1769n(iVar, eVar, eVar.mo7346A_(), fVar, fVar2, hVar, amVar);
        return nVar;
    }

    private C1769n(C2713i iVar, C1796e eVar, C2841w wVar, C2360f fVar, C2710f<Set<C2360f>> fVar2, C1659h hVar, C1692am amVar) {
        super(iVar, eVar, fVar, amVar, false);
        if (f5441c || eVar.mo7073l() == C1797f.ENUM_CLASS) {
            this.f5445g = hVar;
            this.f5442d = new C2814e(this, Collections.emptyList(), Collections.singleton(wVar), iVar);
            this.f5443e = new C1770a(iVar);
            this.f5444f = fVar2;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    public C2560h mo7068g() {
        return this.f5443e;
    }

    /* renamed from: x_ */
    public C2560h mo7087x_() {
        return C2564c.f7661a;
    }

    /* renamed from: k */
    public Collection<C1795d> mo7072k() {
        return Collections.emptyList();
    }

    /* renamed from: e */
    public C2767an mo7067e() {
        return this.f5442d;
    }

    /* renamed from: l */
    public C1797f mo7073l() {
        return C1797f.ENUM_ENTRY;
    }

    /* renamed from: m */
    public C1818w mo7074m() {
        return C1818w.FINAL;
    }

    /* renamed from: p */
    public C1723az mo7077p() {
        return C1710ay.f5340e;
    }

    /* renamed from: x */
    public C1659h mo7086x() {
        return this.f5445g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("enum entry ");
        sb.append(mo7351z_());
        return sb.toString();
    }

    /* renamed from: z */
    public List<C1700ar> mo7090z() {
        return Collections.emptyList();
    }
}
