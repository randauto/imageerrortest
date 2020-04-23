package p073b.p085h.p087b.p088a.p090b.p117g;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p073b.p085h.p087b.p088a.p090b.p117g.C2406q.C2407a;

/* renamed from: b.h.b.a.b.g.a */
/* compiled from: AbstractMessageLite */
public abstract class C2364a implements C2406q {

    /* renamed from: b */
    protected int f7245b = 0;

    /* renamed from: b.h.b.a.b.g.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C2365a<BuilderType extends C2365a> implements C2407a {

        /* renamed from: b.h.b.a.b.g.a$a$a */
        /* compiled from: AbstractMessageLite */
        static final class C2366a extends FilterInputStream {

            /* renamed from: a */
            private int f7246a;

            C2366a(InputStream inputStream, int i) {
                super(inputStream);
                this.f7246a = i;
            }

            public int available() {
                return Math.min(super.available(), this.f7246a);
            }

            public int read() {
                if (this.f7246a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f7246a--;
                }
                return read;
            }

            public int read(byte[] bArr, int i, int i2) {
                if (this.f7246a <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, this.f7246a));
                if (read >= 0) {
                    this.f7246a -= read;
                }
                return read;
            }

            public long skip(long j) {
                long skip = super.skip(Math.min(j, (long) this.f7246a));
                if (skip >= 0) {
                    this.f7246a = (int) (((long) this.f7246a) - skip);
                }
                return skip;
            }
        }

        /* renamed from: b */
        public abstract BuilderType mo8132c(C2374e eVar, C2378g gVar);

        /* renamed from: k */
        public abstract BuilderType clone();

        /* renamed from: a */
        protected static C2425w m11714a(C2406q qVar) {
            return new C2425w(qVar);
        }
    }

    /* renamed from: a */
    public void mo9047a(OutputStream outputStream) {
        int i = mo8107i();
        C2376f a = C2376f.m11817a(outputStream, C2376f.m11815a(C2376f.m11849q(i) + i));
        a.mo9171p(i);
        mo8099a(a);
        a.mo9131a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public C2425w mo9046N() {
        return new C2425w(this);
    }
}
