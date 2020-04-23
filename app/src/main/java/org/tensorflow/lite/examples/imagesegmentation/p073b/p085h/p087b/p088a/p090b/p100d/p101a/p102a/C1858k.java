package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a;

import java.util.Collections;
import java.util.List;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2002q;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.d.a.a.k */
/* compiled from: SignaturePropagator */
public interface C1858k {

    /* renamed from: a */
    public static final C1858k f5686a = new C1858k() {
        /* renamed from: a */
        public C1860a mo7616a(C2002q qVar, C1796e eVar, C2841w wVar, C2841w wVar2, List<C1705au> list, List<C1700ar> list2) {
            C1860a aVar = new C1860a(wVar, wVar2, list, list2, Collections.emptyList(), false);
            return aVar;
        }

        /* renamed from: a */
        public void mo7617a(C1724b bVar, List<String> list) {
            throw new UnsupportedOperationException("Should not be called");
        }
    };

    /* renamed from: b.h.b.a.b.d.a.a.k$a */
    /* compiled from: SignaturePropagator */
    public static class C1860a {

        /* renamed from: a */
        private final C2841w f5687a;

        /* renamed from: b */
        private final C2841w f5688b;

        /* renamed from: c */
        private final List<C1705au> f5689c;

        /* renamed from: d */
        private final List<C1700ar> f5690d;

        /* renamed from: e */
        private final List<String> f5691e;

        /* renamed from: f */
        private final boolean f5692f;

        public C1860a(C2841w wVar, C2841w wVar2, List<C1705au> list, List<C1700ar> list2, List<String> list3, boolean z) {
            this.f5687a = wVar;
            this.f5688b = wVar2;
            this.f5689c = list;
            this.f5690d = list2;
            this.f5691e = list3;
            this.f5692f = z;
        }

        /* renamed from: a */
        public C2841w mo7618a() {
            return this.f5687a;
        }

        /* renamed from: b */
        public C2841w mo7619b() {
            return this.f5688b;
        }

        /* renamed from: c */
        public List<C1705au> mo7620c() {
            return this.f5689c;
        }

        /* renamed from: d */
        public List<C1700ar> mo7621d() {
            return this.f5690d;
        }

        /* renamed from: e */
        public boolean mo7622e() {
            return this.f5692f;
        }

        /* renamed from: f */
        public List<String> mo7623f() {
            return this.f5691e;
        }
    }

    /* renamed from: a */
    C1860a mo7616a(C2002q qVar, C1796e eVar, C2841w wVar, C2841w wVar2, List<C1705au> list, List<C1700ar> list2);

    /* renamed from: a */
    void mo7617a(C1724b bVar, List<String> list);
}
