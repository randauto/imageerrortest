package p073b.p085h.p087b.p088a.p090b.p100d.p110b;

import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p143j.C3199m;

/* renamed from: b.h.b.a.b.d.b.h */
/* compiled from: typeSignatureMapping.kt */
public class C2128h<T> {

    /* renamed from: a */
    private int f6434a;

    /* renamed from: b */
    private T f6435b;

    /* renamed from: c */
    private final C2134k<T> f6436c;

    /* renamed from: b */
    public void mo8040b() {
    }

    /* renamed from: a */
    public void mo8037a() {
        if (this.f6435b == null) {
            this.f6434a++;
            int i = this.f6434a;
        }
    }

    /* renamed from: a */
    public void mo8039a(T t) {
        C1489j.m6972b(t, "objectType");
        mo8041b(t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo8041b(T t) {
        C1489j.m6972b(t, "type");
        if (this.f6435b == null) {
            C2134k<T> kVar = this.f6436c;
            StringBuilder sb = new StringBuilder();
            sb.append(C3199m.m14752a("[", this.f6434a));
            sb.append(this.f6436c.mo8056b(t));
            this.f6435b = kVar.mo8054a(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo8038a(C2360f fVar, T t) {
        C1489j.m6972b(fVar, "name");
        C1489j.m6972b(t, "type");
        mo8041b(t);
    }
}
