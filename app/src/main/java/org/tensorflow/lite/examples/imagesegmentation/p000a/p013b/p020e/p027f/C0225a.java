package p000a.p013b.p020e.p027f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p000a.p013b.p020e.p023c.C0213c;
import p000a.p013b.p020e.p029h.C0253c;

/* renamed from: a.b.e.f.a */
/* compiled from: SpscLinkedArrayQueue */
public final class C0225a<T> implements C0213c<T> {

    /* renamed from: a */
    static final int f423a = Integer.getInteger("jctools.spsc.max.lookahead.step", CodedOutputStream.DEFAULT_BUFFER_SIZE).intValue();

    /* renamed from: j */
    private static final Object f424j = new Object();

    /* renamed from: b */
    final AtomicLong f425b = new AtomicLong();

    /* renamed from: c */
    int f426c;

    /* renamed from: d */
    long f427d;

    /* renamed from: e */
    final int f428e;

    /* renamed from: f */
    AtomicReferenceArray<Object> f429f;

    /* renamed from: g */
    final int f430g;

    /* renamed from: h */
    AtomicReferenceArray<Object> f431h;

    /* renamed from: i */
    final AtomicLong f432i = new AtomicLong();

    /* renamed from: b */
    private static int m599b(int i) {
        return i;
    }

    public C0225a(int i) {
        int a = C0253c.m665a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f429f = atomicReferenceArray;
        this.f428e = i2;
        m593a(a);
        this.f431h = atomicReferenceArray;
        this.f430g = i2;
        this.f427d = (long) (i2 - 1);
        m594a(0);
    }

    /* renamed from: a */
    public boolean mo389a(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f429f;
            long f = m603f();
            int i = this.f428e;
            int a = m589a(f, i);
            if (f < this.f427d) {
                return m598a(atomicReferenceArray, t, f, a);
            }
            long j = ((long) this.f426c) + f;
            if (m600b(atomicReferenceArray, m589a(j, i)) == null) {
                this.f427d = j - 1;
                return m598a(atomicReferenceArray, t, f, a);
            } else if (m600b(atomicReferenceArray, m589a(1 + f, i)) == null) {
                return m598a(atomicReferenceArray, t, f, a);
            } else {
                m596a(atomicReferenceArray, f, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    /* renamed from: a */
    private boolean m598a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m595a(atomicReferenceArray, i, (Object) t);
        m594a(j + 1);
        return true;
    }

    /* renamed from: a */
    private void m596a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f429f = atomicReferenceArray2;
        this.f427d = (j2 + j) - 1;
        m595a(atomicReferenceArray2, i, (Object) t);
        m597a(atomicReferenceArray, atomicReferenceArray2);
        m595a(atomicReferenceArray, i, f424j);
        m594a(j + 1);
    }

    /* renamed from: a */
    private void m597a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m595a(atomicReferenceArray, m599b(atomicReferenceArray.length() - 1), (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m592a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int b = m599b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m600b(atomicReferenceArray, b);
        m595a(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: b */
    public T mo390b() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f431h;
        long g = m604g();
        int i = this.f430g;
        int a = m589a(g, i);
        T b = m600b(atomicReferenceArray, a);
        boolean z = b == f424j;
        if (b != null && !z) {
            m595a(atomicReferenceArray, a, (Object) null);
            m601b(g + 1);
            return b;
        } else if (z) {
            return m591a(m592a(atomicReferenceArray, i + 1), g, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private T m591a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f431h = atomicReferenceArray;
        int a = m589a(j, i);
        T b = m600b(atomicReferenceArray, a);
        if (b != null) {
            m595a(atomicReferenceArray, a, (Object) null);
            m601b(j + 1);
        }
        return b;
    }

    /* renamed from: d */
    public void mo392d() {
        while (true) {
            if (mo390b() == null && mo391c()) {
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean mo391c() {
        return m590a() == m602e();
    }

    /* renamed from: a */
    private void m593a(int i) {
        this.f426c = Math.min(i / 4, f423a);
    }

    /* renamed from: a */
    private long m590a() {
        return this.f425b.get();
    }

    /* renamed from: e */
    private long m602e() {
        return this.f432i.get();
    }

    /* renamed from: f */
    private long m603f() {
        return this.f425b.get();
    }

    /* renamed from: g */
    private long m604g() {
        return this.f432i.get();
    }

    /* renamed from: a */
    private void m594a(long j) {
        this.f425b.lazySet(j);
    }

    /* renamed from: b */
    private void m601b(long j) {
        this.f432i.lazySet(j);
    }

    /* renamed from: a */
    private static int m589a(long j, int i) {
        return m599b(((int) j) & i);
    }

    /* renamed from: a */
    private static void m595a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: b */
    private static <E> Object m600b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }
}
