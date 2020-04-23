package p000a.p013b.p020e.p028g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: a.b.e.g.f */
/* compiled from: RxThreadFactory */
public final class C0237f extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a */
    final String f473a;

    /* renamed from: b */
    final int f474b;

    /* renamed from: c */
    final boolean f475c;

    /* renamed from: a.b.e.g.f$a */
    /* compiled from: RxThreadFactory */
    static final class C0238a extends Thread {
        C0238a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C0237f(String str) {
        this(str, 5, false);
    }

    public C0237f(String str, int i) {
        this(str, i, false);
    }

    public C0237f(String str, int i, boolean z) {
        this.f473a = str;
        this.f474b = i;
        this.f475c = z;
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.f473a);
        sb.append('-');
        sb.append(incrementAndGet());
        String sb2 = sb.toString();
        Thread aVar = this.f475c ? new C0238a(runnable, sb2) : new Thread(runnable, sb2);
        aVar.setPriority(this.f474b);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxThreadFactory[");
        sb.append(this.f473a);
        sb.append("]");
        return sb.toString();
    }
}
