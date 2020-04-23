package p073b.p085h.p087b.p088a.p090b.p131l;

import java.util.Collection;
import java.util.List;
import p073b.C3230x;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1449a;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p094b.C1697ap;
import p073b.p085h.p087b.p088a.p090b.p130k.C2710f;
import p073b.p085h.p087b.p088a.p090b.p130k.C2713i;

/* renamed from: b.h.b.a.b.l.c */
/* compiled from: AbstractTypeConstructor.kt */
public abstract class C2794c implements C2767an {

    /* renamed from: a */
    private final C2710f<C2795a> f8062a;

    /* renamed from: b.h.b.a.b.l.c$a */
    /* compiled from: AbstractTypeConstructor.kt */
    private static final class C2795a {

        /* renamed from: a */
        private List<? extends C2841w> f8063a = C1415k.m6832a(C2827p.f8099a);

        /* renamed from: b */
        private final Collection<C2841w> f8064b;

        public C2795a(Collection<? extends C2841w> collection) {
            C1489j.m6972b(collection, "allSupertypes");
            this.f8064b = collection;
        }

        /* renamed from: b */
        public final Collection<C2841w> mo9907b() {
            return this.f8064b;
        }

        /* renamed from: a */
        public final List<C2841w> mo9905a() {
            return this.f8063a;
        }

        /* renamed from: a */
        public final void mo9906a(List<? extends C2841w> list) {
            C1489j.m6972b(list, "<set-?>");
            this.f8063a = list;
        }
    }

    /* renamed from: b.h.b.a.b.l.c$b */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C2796b extends C1490k implements C1449a<C2795a> {

        /* renamed from: a */
        final /* synthetic */ C2794c f8065a;

        C2796b(C2794c cVar) {
            this.f8065a = cVar;
            super(0);
        }

        /* renamed from: b */
        public final C2795a mo6823a() {
            return new C2795a(this.f8065a.mo7093a());
        }
    }

    /* renamed from: b.h.b.a.b.l.c$c */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C2797c extends C1490k implements C1450b<Boolean, C2795a> {

        /* renamed from: a */
        public static final C2797c f8066a = new C2797c();

        C2797c() {
            super(1);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo6756a(Object obj) {
            return mo9909a(((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        public final C2795a mo9909a(boolean z) {
            return new C2795a(C1415k.m6832a(C2827p.f8099a));
        }
    }

    /* renamed from: b.h.b.a.b.l.c$d */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C2798d extends C1490k implements C1450b<C2795a, C3230x> {

        /* renamed from: a */
        final /* synthetic */ C2794c f8067a;

        /* renamed from: b.h.b.a.b.l.c$d$a */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C2801a extends C1490k implements C1450b<C2767an, Collection<? extends C2841w>> {

            /* renamed from: a */
            final /* synthetic */ C2798d f8070a;

            C2801a(C2798d dVar) {
                this.f8070a = dVar;
                super(1);
            }

            /* renamed from: a */
            public final Collection<C2841w> mo6756a(C2767an anVar) {
                C1489j.m6972b(anVar, "it");
                return this.f8070a.f8067a.m13647a(anVar, false);
            }
        }

        /* renamed from: b.h.b.a.b.l.c$d$b */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C2802b extends C1490k implements C1450b<C2841w, C3230x> {

            /* renamed from: a */
            final /* synthetic */ C2798d f8071a;

            C2802b(C2798d dVar) {
                this.f8071a = dVar;
                super(1);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
                mo9914a((C2841w) obj);
                return C3230x.f8645a;
            }

            /* renamed from: a */
            public final void mo9914a(C2841w wVar) {
                C1489j.m6972b(wVar, "it");
                this.f8071a.f8067a.mo7412a(wVar);
            }
        }

        C2798d(C2794c cVar) {
            this.f8067a = cVar;
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo9910a((C2795a) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo9910a(C2795a aVar) {
            C1489j.m6972b(aVar, "supertypes");
            Collection a = this.f8067a.mo7098g().mo7308a(this.f8067a, aVar.mo9907b(), new C2801a(this), new C2802b(this));
            List list = null;
            if (a.isEmpty()) {
                C2841w h = this.f8067a.mo7413h();
                Collection a2 = h != null ? C1415k.m6832a(h) : null;
                if (a2 == null) {
                    a2 = C1415k.m6837a();
                }
                a = a2;
            }
            this.f8067a.mo7098g().mo7308a(this.f8067a, a, new C1450b<C2767an, Collection<? extends C2841w>>(this) {

                /* renamed from: a */
                final /* synthetic */ C2798d f8068a;

                {
                    this.f8068a = r1;
                }

                /* renamed from: a */
                public final Collection<C2841w> mo6756a(C2767an anVar) {
                    C1489j.m6972b(anVar, "it");
                    return this.f8068a.f8067a.m13647a(anVar, true);
                }
            }, new C1450b<C2841w, C3230x>(this) {

                /* renamed from: a */
                final /* synthetic */ C2798d f8069a;

                {
                    this.f8069a = r1;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
                    mo9912a((C2841w) obj);
                    return C3230x.f8645a;
                }

                /* renamed from: a */
                public final void mo9912a(C2841w wVar) {
                    C1489j.m6972b(wVar, "it");
                    this.f8069a.f8067a.mo9903b(wVar);
                }
            });
            if (a instanceof List) {
                list = a;
            }
            List list2 = list;
            if (list2 == null) {
                list2 = C1415k.m6893k((Iterable<? extends T>) a);
            }
            aVar.mo9906a(list2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Collection<C2841w> mo7093a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7412a(C2841w wVar) {
        C1489j.m6972b(wVar, "type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9903b(C2841w wVar) {
        C1489j.m6972b(wVar, "type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C1697ap mo7098g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C2841w mo7413h() {
        return null;
    }

    public C2794c(C2713i iVar) {
        C1489j.m6972b(iVar, "storageManager");
        this.f8062a = iVar.mo9794a(new C2796b(this), C2797c.f8066a, new C2798d(this));
    }

    /* renamed from: j */
    public List<C2841w> mo7405C_() {
        return ((C2795a) this.f8062a.mo6823a()).mo9905a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Collection<C2841w> m13647a(C2767an anVar, boolean z) {
        C2794c cVar = (C2794c) (!(anVar instanceof C2794c) ? null : anVar);
        if (cVar != null) {
            List b = C1415k.m6870b(((C2795a) cVar.f8062a.mo6823a()).mo9907b(), (Iterable<? extends T>) cVar.mo9893a(z));
            if (b != null) {
                return b;
            }
        }
        Collection<C2841w> C_ = anVar.mo7405C_();
        C1489j.m6969a((Object) C_, "supertypes");
        return C_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Collection<C2841w> mo9893a(boolean z) {
        return C1415k.m6837a();
    }
}
