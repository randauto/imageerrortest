package p073b.p085h.p087b.p088a.p090b.p119i;

import java.util.Comparator;
import java.util.List;
import p073b.C3230x;
import p073b.p079e.p080a.C1450b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1648a;
import p073b.p085h.p087b.p088a.p090b.p094b.C1687ah;
import p073b.p085h.p087b.p088a.p090b.p094b.C1690ak;
import p073b.p085h.p087b.p088a.p090b.p094b.C1699aq;
import p073b.p085h.p087b.p088a.p090b.p094b.C1700ar;
import p073b.p085h.p087b.p088a.p090b.p094b.C1705au;
import p073b.p085h.p087b.p088a.p090b.p094b.C1724b;
import p073b.p085h.p087b.p088a.p090b.p094b.C1796e;
import p073b.p085h.p087b.p088a.p090b.p094b.C1803l;
import p073b.p085h.p087b.p088a.p090b.p094b.C1804m;
import p073b.p085h.p087b.p088a.p090b.p094b.C1813t;
import p073b.p085h.p087b.p088a.p090b.p118h.C2438a;
import p073b.p085h.p087b.p088a.p090b.p118h.C2443c;
import p073b.p085h.p087b.p088a.p090b.p118h.C2467g;
import p073b.p085h.p087b.p088a.p090b.p118h.C2469h;
import p073b.p085h.p087b.p088a.p090b.p131l.C2841w;

/* renamed from: b.h.b.a.b.i.f */
/* compiled from: MemberComparator */
public class C2577f implements Comparator<C1804m> {

    /* renamed from: a */
    public static final C2577f f7677a = new C2577f();

    /* renamed from: b */
    static final /* synthetic */ boolean f7678b = (!C2577f.class.desiredAssertionStatus());

    /* renamed from: c */
    private static final C2443c f7679c = C2443c.f7425j.mo9350a((C1450b<? super C2469h, C3230x>) new C1450b<C2469h, C3230x>() {
        /* renamed from: a */
        public C3230x mo6756a(C2469h hVar) {
            hVar.mo9403f(false);
            hVar.mo9401e(true);
            hVar.mo9388a(C2438a.UNLESS_EMPTY);
            hVar.mo9394b(C2467g.f7465l);
            return C3230x.f8645a;
        }
    });

    /* renamed from: b.h.b.a.b.i.f$a */
    /* compiled from: MemberComparator */
    public static class C2579a implements Comparator<C1804m> {

        /* renamed from: a */
        public static final C2579a f7680a = new C2579a();

        private C2579a() {
        }

        /* renamed from: a */
        private static int m12799a(C1804m mVar) {
            if (C2523c.m12604l(mVar)) {
                return 8;
            }
            if (mVar instanceof C1803l) {
                return 7;
            }
            if (mVar instanceof C1687ah) {
                return ((C1687ah) mVar).mo7231d() == null ? 6 : 5;
            }
            if (mVar instanceof C1813t) {
                return ((C1813t) mVar).mo7231d() == null ? 4 : 3;
            }
            if (mVar instanceof C1796e) {
                return 2;
            }
            return mVar instanceof C1699aq ? 1 : 0;
        }

        /* renamed from: a */
        public int compare(C1804m mVar, C1804m mVar2) {
            Integer c = m12801c(mVar, mVar2);
            if (c != null) {
                return c.intValue();
            }
            return 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static Integer m12801c(C1804m mVar, C1804m mVar2) {
            int a = m12799a(mVar2) - m12799a(mVar);
            if (a != 0) {
                return Integer.valueOf(a);
            }
            if (C2523c.m12604l(mVar) && C2523c.m12604l(mVar2)) {
                return Integer.valueOf(0);
            }
            int a2 = mVar.mo7351z_().compareTo(mVar2.mo7351z_());
            if (a2 != 0) {
                return Integer.valueOf(a2);
            }
            return null;
        }
    }

    private C2577f() {
    }

    /* renamed from: a */
    public int compare(C1804m mVar, C1804m mVar2) {
        Integer b = C2579a.m12801c(mVar, mVar2);
        if (b != null) {
            return b.intValue();
        }
        if (!(mVar instanceof C1699aq) || !(mVar2 instanceof C1699aq)) {
            int i = 1;
            if ((mVar instanceof C1648a) && (mVar2 instanceof C1648a)) {
                C1648a aVar = (C1648a) mVar;
                C1648a aVar2 = (C1648a) mVar2;
                C1690ak d = aVar.mo7231d();
                C1690ak d2 = aVar2.mo7231d();
                if (!f7678b) {
                    int i2 = d != null ? 1 : 0;
                    if (d2 == null) {
                        i = 0;
                    }
                    if (i2 != i) {
                        throw new AssertionError();
                    }
                }
                if (d != null) {
                    int compareTo = f7679c.mo9348a(d.mo7320r()).compareTo(f7679c.mo9348a(d2.mo7320r()));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                List i3 = aVar.mo7236i();
                List i4 = aVar2.mo7236i();
                for (int i5 = 0; i5 < Math.min(i3.size(), i4.size()); i5++) {
                    int compareTo2 = f7679c.mo9348a(((C1705au) i3.get(i5)).mo7320r()).compareTo(f7679c.mo9348a(((C1705au) i4.get(i5)).mo7320r()));
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                }
                int size = i3.size() - i4.size();
                if (size != 0) {
                    return size;
                }
                List f = aVar.mo7233f();
                List f2 = aVar2.mo7233f();
                for (int i6 = 0; i6 < Math.min(f.size(), f2.size()); i6++) {
                    List j = ((C1700ar) f.get(i6)).mo7315j();
                    List j2 = ((C1700ar) f2.get(i6)).mo7315j();
                    int size2 = j.size() - j2.size();
                    if (size2 != 0) {
                        return size2;
                    }
                    for (int i7 = 0; i7 < j.size(); i7++) {
                        int compareTo3 = f7679c.mo9348a((C2841w) j.get(i7)).compareTo(f7679c.mo9348a((C2841w) j2.get(i7)));
                        if (compareTo3 != 0) {
                            return compareTo3;
                        }
                    }
                }
                int size3 = f.size() - f2.size();
                if (size3 != 0) {
                    return size3;
                }
                if ((aVar instanceof C1724b) && (aVar2 instanceof C1724b)) {
                    int ordinal = ((C1724b) aVar).mo7344n().ordinal() - ((C1724b) aVar2).mo7344n().ordinal();
                    if (ordinal != 0) {
                        return ordinal;
                    }
                }
            } else if (!(mVar instanceof C1796e) || !(mVar2 instanceof C1796e)) {
                throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", new Object[]{mVar, mVar.getClass(), mVar2, mVar2.getClass()}));
            } else {
                C1796e eVar = (C1796e) mVar;
                C1796e eVar2 = (C1796e) mVar2;
                if (eVar.mo7073l().ordinal() != eVar2.mo7073l().ordinal()) {
                    return eVar.mo7073l().ordinal() - eVar2.mo7073l().ordinal();
                }
                if (eVar.mo7078q() != eVar2.mo7078q()) {
                    if (!eVar.mo7078q()) {
                        i = -1;
                    }
                    return i;
                }
            }
        } else {
            int compareTo4 = f7679c.mo9348a((C2841w) ((C1699aq) mVar).mo7309a()).compareTo(f7679c.mo9348a((C2841w) ((C1699aq) mVar2).mo7309a()));
            if (compareTo4 != 0) {
                return compareTo4;
            }
        }
        int compareTo5 = f7679c.mo9344a(mVar).compareTo(f7679c.mo9344a(mVar2));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        return C2523c.m12599g(mVar).mo7351z_().compareTo(C2523c.m12599g(mVar2).mo7351z_());
    }
}
