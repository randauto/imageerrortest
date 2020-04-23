package p073b.p085h.p087b.p088a.p090b.p094b;

import java.util.Collection;

/* renamed from: b.h.b.a.b.b.b */
/* compiled from: CallableMemberDescriptor */
public interface C1724b extends C1648a, C1817v {

    /* renamed from: b.h.b.a.b.b.b$a */
    /* compiled from: CallableMemberDescriptor */
    public enum C1725a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: a */
        public boolean mo7345a() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* renamed from: a */
    C1724b mo7341a(C1804m mVar, C1818w wVar, C1723az azVar, C1725a aVar, boolean z);

    /* renamed from: a */
    void mo7342a(Collection<? extends C1724b> collection);

    /* renamed from: k */
    Collection<? extends C1724b> mo7238k();

    /* renamed from: l */
    C1724b mo7343l();

    /* renamed from: n */
    C1725a mo7344n();
}
