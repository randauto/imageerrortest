package p073b.p085h.p087b.p088a.p090b.p112e.p113a;

import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2213ao;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2216c.C2219b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2252q;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2254r;
import p073b.p085h.p087b.p088a.p090b.p117g.C2392j.C2393a;

/* renamed from: b.h.b.a.b.e.a.b */
/* compiled from: Flags */
public class C2280b {

    /* renamed from: A */
    public static final C2282a f6993A = C2284c.m11187a(f7029z);

    /* renamed from: B */
    public static final C2282a f6994B = C2284c.m11187a(f6993A);

    /* renamed from: C */
    public static final C2282a f6995C = C2284c.m11187a(f7005b);

    /* renamed from: D */
    public static final C2282a f6996D = C2284c.m11187a(f6995C);

    /* renamed from: E */
    public static final C2282a f6997E = C2284c.m11187a(f6996D);

    /* renamed from: F */
    public static final C2282a f6998F = C2284c.m11187a(f7007d);

    /* renamed from: G */
    public static final C2282a f6999G = C2284c.m11187a(f6998F);

    /* renamed from: H */
    public static final C2282a f7000H = C2284c.m11187a(f6999G);

    /* renamed from: I */
    public static final C2282a f7001I = C2284c.m11186a();

    /* renamed from: J */
    public static final C2282a f7002J = C2284c.m11187a(f7001I);

    /* renamed from: K */
    public static final C2282a f7003K = C2284c.m11186a();

    /* renamed from: a */
    public static final C2282a f7004a = C2284c.m11186a();

    /* renamed from: b */
    public static final C2282a f7005b = C2284c.m11186a();

    /* renamed from: c */
    public static final C2284c<C2213ao> f7006c = C2284c.m11188a(f7005b, C2213ao.values());

    /* renamed from: d */
    public static final C2284c<C2254r> f7007d = C2284c.m11188a(f7006c, C2254r.values());

    /* renamed from: e */
    public static final C2284c<C2219b> f7008e = C2284c.m11188a(f7007d, C2219b.values());

    /* renamed from: f */
    public static final C2282a f7009f = C2284c.m11187a(f7008e);

    /* renamed from: g */
    public static final C2282a f7010g = C2284c.m11187a(f7009f);

    /* renamed from: h */
    public static final C2282a f7011h = C2284c.m11187a(f7010g);

    /* renamed from: i */
    public static final C2282a f7012i = C2284c.m11187a(f7011h);

    /* renamed from: j */
    public static final C2282a f7013j = C2284c.m11187a(f7012i);

    /* renamed from: k */
    public static final C2282a f7014k = C2284c.m11187a(f7006c);

    /* renamed from: l */
    public static final C2284c<C2252q> f7015l = C2284c.m11188a(f7007d, C2252q.values());

    /* renamed from: m */
    public static final C2282a f7016m = C2284c.m11187a(f7015l);

    /* renamed from: n */
    public static final C2282a f7017n = C2284c.m11187a(f7016m);

    /* renamed from: o */
    public static final C2282a f7018o = C2284c.m11187a(f7017n);

    /* renamed from: p */
    public static final C2282a f7019p = C2284c.m11187a(f7018o);

    /* renamed from: q */
    public static final C2282a f7020q = C2284c.m11187a(f7019p);

    /* renamed from: r */
    public static final C2282a f7021r = C2284c.m11187a(f7020q);

    /* renamed from: s */
    public static final C2282a f7022s = C2284c.m11187a(f7021r);

    /* renamed from: t */
    public static final C2282a f7023t = C2284c.m11187a(f7015l);

    /* renamed from: u */
    public static final C2282a f7024u = C2284c.m11187a(f7023t);

    /* renamed from: v */
    public static final C2282a f7025v = C2284c.m11187a(f7024u);

    /* renamed from: w */
    public static final C2282a f7026w = C2284c.m11187a(f7025v);

    /* renamed from: x */
    public static final C2282a f7027x = C2284c.m11187a(f7026w);

    /* renamed from: y */
    public static final C2282a f7028y = C2284c.m11187a(f7027x);

    /* renamed from: z */
    public static final C2282a f7029z = C2284c.m11187a(f7028y);

    /* renamed from: b.h.b.a.b.e.a.b$a */
    /* compiled from: Flags */
    public static class C2282a extends C2284c<Boolean> {
        public C2282a(int i) {
            super(i, 1);
        }

        /* renamed from: a */
        public Boolean mo8809b(int i) {
            boolean z = true;
            if ((i & (1 << this.f7031a)) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: b.h.b.a.b.e.a.b$b */
    /* compiled from: Flags */
    private static class C2283b<E extends C2393a> extends C2284c<E> {

        /* renamed from: c */
        private final E[] f7030c;

        public C2283b(int i, E[] eArr) {
            super(i, m11183a(eArr));
            this.f7030c = eArr;
        }

        /* renamed from: a */
        private static <E> int m11183a(E[] eArr) {
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Empty enum: ");
            sb.append(eArr.getClass());
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public E mo8809b(int i) {
            E[] eArr;
            int i2 = (i & (((1 << this.f7032b) - 1) << this.f7031a)) >> this.f7031a;
            for (E e : this.f7030c) {
                if (e.mo8186a() == i2) {
                    return e;
                }
            }
            return null;
        }
    }

    /* renamed from: b.h.b.a.b.e.a.b$c */
    /* compiled from: Flags */
    public static abstract class C2284c<E> {

        /* renamed from: a */
        public final int f7031a;

        /* renamed from: b */
        public final int f7032b;

        /* renamed from: b */
        public abstract E mo8809b(int i);

        /* renamed from: a */
        public static <E extends C2393a> C2284c<E> m11188a(C2284c<?> cVar, E[] eArr) {
            return new C2283b(cVar.f7031a + cVar.f7032b, eArr);
        }

        /* renamed from: a */
        public static C2282a m11186a() {
            return new C2282a(0);
        }

        /* renamed from: a */
        public static C2282a m11187a(C2284c<?> cVar) {
            return new C2282a(cVar.f7031a + cVar.f7032b);
        }

        private C2284c(int i, int i2) {
            this.f7031a = i;
            this.f7032b = i2;
        }
    }
}
