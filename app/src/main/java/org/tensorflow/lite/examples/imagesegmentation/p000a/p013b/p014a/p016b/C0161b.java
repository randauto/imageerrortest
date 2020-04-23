package p000a.p013b.p014a.p016b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p000a.p013b.C0189e;
import p000a.p013b.C0189e.C0191b;
import p000a.p013b.p017b.C0166b;
import p000a.p013b.p017b.C0167c;
import p000a.p013b.p030f.C0254a;

/* renamed from: a.b.a.b.b */
/* compiled from: HandlerScheduler */
final class C0161b extends C0189e {

    /* renamed from: b */
    private final Handler f359b;

    /* renamed from: a.b.a.b.b$a */
    /* compiled from: HandlerScheduler */
    private static final class C0162a extends C0191b {

        /* renamed from: a */
        private final Handler f360a;

        /* renamed from: b */
        private volatile boolean f361b;

        C0162a(Handler handler) {
            this.f360a = handler;
        }

        /* renamed from: a */
        public C0166b mo348a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f361b) {
                return C0167c.m481a();
            } else {
                C0163b bVar = new C0163b(this.f360a, C0254a.m673a(runnable));
                Message obtain = Message.obtain(this.f360a, bVar);
                obtain.obj = this;
                this.f360a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f361b) {
                    return bVar;
                }
                this.f360a.removeCallbacks(bVar);
                return C0167c.m481a();
            }
        }

        /* renamed from: a */
        public void mo349a() {
            this.f361b = true;
            this.f360a.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: a.b.a.b.b$b */
    /* compiled from: HandlerScheduler */
    private static final class C0163b implements C0166b, Runnable {

        /* renamed from: a */
        private final Handler f362a;

        /* renamed from: b */
        private final Runnable f363b;

        /* renamed from: c */
        private volatile boolean f364c;

        C0163b(Handler handler, Runnable runnable) {
            this.f362a = handler;
            this.f363b = runnable;
        }

        public void run() {
            try {
                this.f363b.run();
            } catch (Throwable th) {
                C0254a.m674a(th);
            }
        }

        /* renamed from: a */
        public void mo349a() {
            this.f364c = true;
            this.f362a.removeCallbacks(this);
        }
    }

    C0161b(Handler handler) {
        this.f359b = handler;
    }

    /* renamed from: a */
    public C0166b mo346a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C0163b bVar = new C0163b(this.f359b, C0254a.m673a(runnable));
            this.f359b.postDelayed(bVar, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    public C0191b mo347a() {
        return new C0162a(this.f359b);
    }
}
