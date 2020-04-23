package p000a.p001a.p002a.p003a.p004a.p007c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p000a.p001a.p002a.p003a.p004a.p007c.C0065b;
import p000a.p001a.p002a.p003a.p004a.p007c.C0074i;
import p000a.p001a.p002a.p003a.p004a.p007c.C0078l;

/* renamed from: a.a.a.a.a.c.c */
/* compiled from: DependencyPriorityBlockingQueue */
public class C0066c<E extends C0065b & C0078l & C0074i> extends PriorityBlockingQueue<E> {

    /* renamed from: a */
    final Queue<E> f142a = new LinkedList();

    /* renamed from: b */
    private final ReentrantLock f143b = new ReentrantLock();

    /* renamed from: a */
    public E take() {
        return mo126b(0, null, null);
    }

    /* renamed from: b */
    public E peek() {
        try {
            return mo126b(1, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public E poll(long j, TimeUnit timeUnit) {
        return mo126b(3, Long.valueOf(j), timeUnit);
    }

    /* renamed from: c */
    public E poll() {
        try {
            return mo126b(2, null, null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public int size() {
        try {
            this.f143b.lock();
            return this.f142a.size() + super.size();
        } finally {
            this.f143b.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.f143b.lock();
            return mo124a((T[]) super.toArray(tArr), (T[]) this.f142a.toArray(tArr));
        } finally {
            this.f143b.unlock();
        }
    }

    public Object[] toArray() {
        try {
            this.f143b.lock();
            return mo124a((T[]) super.toArray(), (T[]) this.f142a.toArray());
        } finally {
            this.f143b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.f143b.lock();
            int drainTo = super.drainTo(collection) + this.f142a.size();
            while (!this.f142a.isEmpty()) {
                collection.add(this.f142a.poll());
            }
            return drainTo;
        } finally {
            this.f143b.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i) {
        try {
            this.f143b.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.f142a.isEmpty() && drainTo <= i) {
                collection.add(this.f142a.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f143b.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f143b.lock();
            return super.contains(obj) || this.f142a.contains(obj);
        } finally {
            this.f143b.unlock();
        }
    }

    public void clear() {
        try {
            this.f143b.lock();
            this.f142a.clear();
            super.clear();
        } finally {
            this.f143b.unlock();
        }
    }

    public boolean remove(Object obj) {
        try {
            this.f143b.lock();
            return super.remove(obj) || this.f142a.remove(obj);
        } finally {
            this.f143b.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.f143b.lock();
            return this.f142a.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f143b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public E mo120a(int i, Long l, TimeUnit timeUnit) {
        E e;
        switch (i) {
            case 0:
                e = (C0065b) super.take();
                break;
            case 1:
                e = (C0065b) super.peek();
                break;
            case 2:
                e = (C0065b) super.poll();
                break;
            case 3:
                e = (C0065b) super.poll(l.longValue(), timeUnit);
                break;
            default:
                return null;
        }
        return e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo122a(int i, E e) {
        try {
            this.f143b.lock();
            if (i == 1) {
                super.remove(e);
            }
            boolean offer = this.f142a.offer(e);
            return offer;
        } finally {
            this.f143b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public E mo126b(int i, Long l, TimeUnit timeUnit) {
        E a;
        while (true) {
            a = mo120a(i, l, timeUnit);
            if (a == null || mo123a(a)) {
                return a;
            }
            mo122a(i, a);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo123a(E e) {
        return e.areDependenciesMet();
    }

    /* renamed from: d */
    public void mo130d() {
        try {
            this.f143b.lock();
            Iterator it = this.f142a.iterator();
            while (it.hasNext()) {
                C0065b bVar = (C0065b) it.next();
                if (mo123a(bVar)) {
                    super.offer(bVar);
                    it.remove();
                }
            }
        } finally {
            this.f143b.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> T[] mo124a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }
}
