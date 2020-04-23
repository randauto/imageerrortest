package p073b.p085h.p087b.p088a.p090b.p130k;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: b.h.b.a.b.k.e */
/* compiled from: NoLock */
class C2709e implements Lock {

    /* renamed from: a */
    public static final Lock f7954a = new C2709e();

    public void lock() {
    }

    public void unlock() {
    }

    private C2709e() {
    }

    public void lockInterruptibly() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public boolean tryLock() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public boolean tryLock(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }
}
