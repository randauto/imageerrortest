package p073b.p085h.p087b.p088a.p090b.p118h;

import p073b.p079e.p081b.C1489j;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.h.n */
/* compiled from: DescriptorRenderer.kt */
public enum C2479n {
    ;

    /* renamed from: b.h.b.a.b.h.n$a */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2480a extends C2479n {
        C2480a(String str, int i) {
            super(str, i);
        }

        /* renamed from: a */
        public String mo9492a(String str) {
            C1489j.m6972b(str, "string");
            return C3199m.m14756a(C3199m.m14756a(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    /* renamed from: b.h.b.a.b.h.n$b */
    /* compiled from: DescriptorRenderer.kt */
    static final class C2481b extends C2479n {
        /* renamed from: a */
        public String mo9492a(String str) {
            C1489j.m6972b(str, "string");
            return str;
        }

        C2481b(String str, int i) {
            super(str, i);
        }
    }

    /* renamed from: a */
    public abstract String mo9492a(String str);
}
