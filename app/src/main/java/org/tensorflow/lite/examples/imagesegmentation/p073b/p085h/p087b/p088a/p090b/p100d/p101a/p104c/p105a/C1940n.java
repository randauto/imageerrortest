package p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p105a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1692am;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.p097c.C1751b;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p102a.C1861l;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1962e;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.C1967h;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p104c.p106b.C1949d;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C1995j;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2007v;
import p073b.p085h.p087b.p088a.p090b.p100d.p101a.p108e.C2008w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;
import p073b.p085h.p087b.p088a.p090b.p131l.C2792ba;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;
import p073b.p085h.p087b.p088a.p090b.p131l.C2842x;

/* renamed from: b.h.b.a.b.d.a.c.a.n */
/* compiled from: LazyJavaTypeParameterDescriptor.kt */
public final class C1940n extends C1751b {

    /* renamed from: a */
    private final C1962e f5853a = new C1962e(this.f5854b, this.f5855c);

    /* renamed from: b */
    private final C1967h f5854b;

    /* renamed from: c */
    private final C2008w f5855c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7387a(C2841w wVar) {
        C1489j.m6972b(wVar, "type");
    }

    public C1940n(C1967h hVar, C2008w wVar, int i, C1804m mVar) {
        C1489j.m6972b(hVar, "c");
        C1489j.m6972b(wVar, "javaTypeParameter");
        C1489j.m6972b(mVar, "containingDeclaration");
        super(hVar.mo7803c(), mVar, wVar.mo7867r(), C2792ba.INVARIANT, false, i, C1692am.f5331a, hVar.mo7805e().mo7755l());
        this.f5854b = hVar;
        this.f5855c = wVar;
    }

    /* renamed from: o */
    public C1962e mo7086x() {
        return this.f5853a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public List<C2841w> mo7389m() {
        Collection c = this.f5855c.mo7872c();
        if (c.isEmpty()) {
            C2755ad s = this.f5854b.mo7804d().mo7522a().mo7206s();
            C1489j.m6969a((Object) s, "c.module.builtIns.anyType");
            C2755ad t = this.f5854b.mo7804d().mo7522a().mo7207t();
            C1489j.m6969a((Object) t, "c.module.builtIns.nullableAnyType");
            return C1415k.m6832a(C2842x.m13883a(s, t));
        }
        Iterable<C1995j> iterable = c;
        Collection arrayList = new ArrayList(C1415k.m6842a(iterable, 10));
        for (C1995j a : iterable) {
            arrayList.add(this.f5854b.mo7802b().mo7773a((C2007v) a, C1949d.m9005a(C1861l.COMMON, false, (C1700ar) this, 1, (Object) null)));
        }
        return (List) arrayList;
    }
}
