package p073b.p085h.p087b.p088a.p090b.p118h;

import java.util.ArrayList;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1680ab;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1799h;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p116f.C2356c;
import p073b.p085h.p087b.p088a.p090b.p116f.C2360f;
import p073b.p085h.p087b.p088a.p090b.p119i.C2523c;

/* renamed from: b.h.b.a.b.h.b */
/* compiled from: ClassifierNamePolicy.kt */
public interface C2439b {

    /* renamed from: b.h.b.a.b.h.b$a */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C2440a implements C2439b {

        /* renamed from: a */
        public static final C2440a f7413a = new C2440a();

        private C2440a() {
        }

        /* renamed from: a */
        public String mo9341a(C1799h hVar, C2443c cVar) {
            C1489j.m6972b(hVar, "classifier");
            C1489j.m6972b(cVar, "renderer");
            if (hVar instanceof C1700ar) {
                C2360f z_ = ((C1700ar) hVar).mo7351z_();
                C1489j.m6969a((Object) z_, "classifier.name");
                return cVar.mo9346a(z_, false);
            }
            C2356c d = C2523c.m12596d(hVar);
            C1489j.m6969a((Object) d, "DescriptorUtils.getFqName(classifier)");
            return cVar.mo9345a(d);
        }
    }

    /* renamed from: b.h.b.a.b.h.b$b */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C2441b implements C2439b {

        /* renamed from: a */
        public static final C2441b f7414a = new C2441b();

        private C2441b() {
        }

        /* renamed from: a */
        public String mo9341a(C1799h hVar, C2443c cVar) {
            C1489j.m6972b(hVar, "classifier");
            C1489j.m6972b(cVar, "renderer");
            if (hVar instanceof C1700ar) {
                C2360f z_ = ((C1700ar) hVar).mo7351z_();
                C1489j.m6969a((Object) z_, "classifier.name");
                return cVar.mo9346a(z_, false);
            }
            ArrayList arrayList = new ArrayList();
            C1804m mVar = hVar;
            do {
                arrayList.add(mVar.mo7351z_());
                mVar = mVar.mo7065b();
            } while (mVar instanceof C1796e);
            return C2482o.m12455a(C1415k.m6854d(arrayList));
        }
    }

    /* renamed from: b.h.b.a.b.h.b$c */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C2442c implements C2439b {

        /* renamed from: a */
        public static final C2442c f7415a = new C2442c();

        private C2442c() {
        }

        /* renamed from: a */
        public String mo9341a(C1799h hVar, C2443c cVar) {
            C1489j.m6972b(hVar, "classifier");
            C1489j.m6972b(cVar, "renderer");
            return m12138a(hVar);
        }

        /* renamed from: a */
        private final String m12138a(C1799h hVar) {
            C2360f z_ = hVar.mo7351z_();
            C1489j.m6969a((Object) z_, "descriptor.name");
            String a = C2482o.m12454a(z_);
            if (hVar instanceof C1700ar) {
                return a;
            }
            C1804m b = hVar.mo7065b();
            C1489j.m6969a((Object) b, "descriptor.containingDeclaration");
            String a2 = m12139a(b);
            if (a2 != null && (!C1489j.m6971a((Object) a2, (Object) ""))) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            return a;
        }

        /* renamed from: a */
        private final String m12139a(C1804m mVar) {
            if (mVar instanceof C1796e) {
                return m12138a((C1799h) mVar);
            }
            if (!(mVar instanceof C1680ab)) {
                return null;
            }
            C2356c b = ((C1680ab) mVar).mo7284f().mo9014b();
            C1489j.m6969a((Object) b, "descriptor.fqName.toUnsafe()");
            return C2482o.m12453a(b);
        }
    }

    /* renamed from: a */
    String mo9341a(C1799h hVar, C2443c cVar);
}
