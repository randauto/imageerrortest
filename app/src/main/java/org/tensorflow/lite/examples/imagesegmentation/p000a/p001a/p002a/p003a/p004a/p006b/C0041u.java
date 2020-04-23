package p000a.p001a.p002a.p003a.p004a.p006b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a.a.a.a.a.b.u */
/* compiled from: QueueFile */
public class C0041u implements Closeable {

    /* renamed from: b */
    private static final Logger f86b = Logger.getLogger(C0041u.class.getName());

    /* renamed from: a */
    int f87a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final RandomAccessFile f88c;

    /* renamed from: d */
    private int f89d;

    /* renamed from: e */
    private C0043a f90e;

    /* renamed from: f */
    private C0043a f91f;

    /* renamed from: g */
    private final byte[] f92g = new byte[16];

    /* renamed from: a.a.a.a.a.b.u$a */
    /* compiled from: QueueFile */
    static class C0043a {

        /* renamed from: a */
        static final C0043a f96a = new C0043a(0, 0);

        /* renamed from: b */
        final int f97b;

        /* renamed from: c */
        final int f98c;

        C0043a(int i, int i2) {
            this.f97b = i;
            this.f98c = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.f97b);
            sb.append(", length = ");
            sb.append(this.f98c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: a.a.a.a.a.b.u$b */
    /* compiled from: QueueFile */
    private final class C0044b extends InputStream {

        /* renamed from: b */
        private int f100b;

        /* renamed from: c */
        private int f101c;

        private C0044b(C0043a aVar) {
            this.f100b = C0041u.this.m141b(aVar.f97b + 4);
            this.f101c = aVar.f98c;
        }

        public int read(byte[] bArr, int i, int i2) {
            C0041u.m143b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (this.f101c <= 0) {
                return -1;
            } else {
                if (i2 > this.f101c) {
                    i2 = this.f101c;
                }
                C0041u.this.m144b(this.f100b, bArr, i, i2);
                this.f100b = C0041u.this.m141b(this.f100b + i2);
                this.f101c -= i2;
                return i2;
            }
        }

        public int read() {
            if (this.f101c == 0) {
                return -1;
            }
            C0041u.this.f88c.seek((long) this.f100b);
            int read = C0041u.this.f88c.read();
            this.f100b = C0041u.this.m141b(this.f100b + 1);
            this.f101c--;
            return read;
        }
    }

    /* renamed from: a.a.a.a.a.b.u$c */
    /* compiled from: QueueFile */
    public interface C0045c {
        void read(InputStream inputStream, int i);
    }

    public C0041u(File file) {
        if (!file.exists()) {
            m139a(file);
        }
        this.f88c = m142b(file);
        m148e();
    }

    /* renamed from: b */
    private static void m145b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: a */
    private static void m140a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b : iArr) {
            m145b(bArr, i, b);
            i += 4;
        }
    }

    /* renamed from: a */
    private static int m132a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: e */
    private void m148e() {
        this.f88c.seek(0);
        this.f88c.readFully(this.f92g);
        this.f87a = m132a(this.f92g, 0);
        if (((long) this.f87a) <= this.f88c.length()) {
            this.f89d = m132a(this.f92g, 4);
            int a = m132a(this.f92g, 8);
            int a2 = m132a(this.f92g, 12);
            this.f90e = m133a(a);
            this.f91f = m133a(a2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File is truncated. Expected length: ");
        sb.append(this.f87a);
        sb.append(", Actual length: ");
        sb.append(this.f88c.length());
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    private void m136a(int i, int i2, int i3, int i4) {
        m140a(this.f92g, i, i2, i3, i4);
        this.f88c.seek(0);
        this.f88c.write(this.f92g);
    }

    /* renamed from: a */
    private C0043a m133a(int i) {
        if (i == 0) {
            return C0043a.f96a;
        }
        this.f88c.seek((long) i);
        return new C0043a(i, this.f88c.readInt());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m139a(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        RandomAccessFile b = m142b(file2);
        try {
            b.setLength(4096);
            b.seek(0);
            byte[] bArr = new byte[16];
            m140a(bArr, CodedOutputStream.DEFAULT_BUFFER_SIZE, 0, 0, 0);
            b.write(bArr);
            b.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    /* renamed from: b */
    private static RandomAccessFile m142b(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m141b(int i) {
        return i < this.f87a ? i : (i + 16) - this.f87a;
    }

    /* renamed from: a */
    private void m137a(int i, byte[] bArr, int i2, int i3) {
        int b = m141b(i);
        if (b + i3 <= this.f87a) {
            this.f88c.seek((long) b);
            this.f88c.write(bArr, i2, i3);
            return;
        }
        int i4 = this.f87a - b;
        this.f88c.seek((long) b);
        this.f88c.write(bArr, i2, i4);
        this.f88c.seek(16);
        this.f88c.write(bArr, i2 + i4, i3 - i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m144b(int i, byte[] bArr, int i2, int i3) {
        int b = m141b(i);
        if (b + i3 <= this.f87a) {
            this.f88c.seek((long) b);
            this.f88c.readFully(bArr, i2, i3);
            return;
        }
        int i4 = this.f87a - b;
        this.f88c.seek((long) b);
        this.f88c.readFully(bArr, i2, i4);
        this.f88c.seek(16);
        this.f88c.readFully(bArr, i2 + i4, i3 - i4);
    }

    /* renamed from: a */
    public void mo81a(byte[] bArr) {
        mo82a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void mo82a(byte[] bArr, int i, int i2) {
        int i3;
        m143b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m146c(i2);
        boolean b = mo84b();
        if (b) {
            i3 = 16;
        } else {
            i3 = m141b(this.f91f.f97b + 4 + this.f91f.f98c);
        }
        C0043a aVar = new C0043a(i3, i2);
        m145b(this.f92g, 0, i2);
        m137a(aVar.f97b, this.f92g, 0, 4);
        m137a(aVar.f97b + 4, bArr, i, i2);
        m136a(this.f87a, this.f89d + 1, b ? aVar.f97b : this.f90e.f97b, aVar.f97b);
        this.f91f = aVar;
        this.f89d++;
        if (b) {
            this.f90e = this.f91f;
        }
    }

    /* renamed from: a */
    public int mo79a() {
        if (this.f89d == 0) {
            return 16;
        }
        if (this.f91f.f97b >= this.f90e.f97b) {
            return (this.f91f.f97b - this.f90e.f97b) + 4 + this.f91f.f98c + 16;
        }
        return (((this.f91f.f97b + 4) + this.f91f.f98c) + this.f87a) - this.f90e.f97b;
    }

    /* renamed from: f */
    private int m149f() {
        return this.f87a - mo79a();
    }

    /* renamed from: b */
    public synchronized boolean mo84b() {
        return this.f89d == 0;
    }

    /* renamed from: c */
    private void m146c(int i) {
        int i2 = i + 4;
        int f = m149f();
        if (f < i2) {
            int i3 = this.f87a;
            do {
                f += i3;
                i3 <<= 1;
            } while (f < i2);
            m147d(i3);
            int b = m141b(this.f91f.f97b + 4 + this.f91f.f98c);
            if (b < this.f90e.f97b) {
                FileChannel channel = this.f88c.getChannel();
                channel.position((long) this.f87a);
                long j = (long) (b - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f91f.f97b < this.f90e.f97b) {
                int i4 = (this.f87a + this.f91f.f97b) - 16;
                m136a(i3, this.f89d, this.f90e.f97b, i4);
                this.f91f = new C0043a(i4, this.f91f.f98c);
            } else {
                m136a(i3, this.f89d, this.f90e.f97b, this.f91f.f97b);
            }
            this.f87a = i3;
        }
    }

    /* renamed from: d */
    private void m147d(int i) {
        this.f88c.setLength((long) i);
        this.f88c.getChannel().force(true);
    }

    /* renamed from: a */
    public synchronized void mo80a(C0045c cVar) {
        int i = this.f90e.f97b;
        for (int i2 = 0; i2 < this.f89d; i2++) {
            C0043a a = m133a(i);
            cVar.read(new C0044b(a), a.f98c);
            i = m141b(a.f97b + 4 + a.f98c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m143b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public synchronized void mo85c() {
        if (mo84b()) {
            throw new NoSuchElementException();
        } else if (this.f89d == 1) {
            mo87d();
        } else {
            int b = m141b(this.f90e.f97b + 4 + this.f90e.f98c);
            m144b(b, this.f92g, 0, 4);
            int a = m132a(this.f92g, 0);
            m136a(this.f87a, this.f89d - 1, b, this.f91f.f97b);
            this.f89d--;
            this.f90e = new C0043a(b, a);
        }
    }

    /* renamed from: d */
    public synchronized void mo87d() {
        m136a((int) CodedOutputStream.DEFAULT_BUFFER_SIZE, 0, 0, 0);
        this.f89d = 0;
        this.f90e = C0043a.f96a;
        this.f91f = C0043a.f96a;
        if (this.f87a > 4096) {
            m147d(CodedOutputStream.DEFAULT_BUFFER_SIZE);
        }
        this.f87a = CodedOutputStream.DEFAULT_BUFFER_SIZE;
    }

    public synchronized void close() {
        this.f88c.close();
    }

    /* renamed from: a */
    public boolean mo83a(int i, int i2) {
        return (mo79a() + 4) + i <= i2;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f87a);
        sb.append(", size=");
        sb.append(this.f89d);
        sb.append(", first=");
        sb.append(this.f90e);
        sb.append(", last=");
        sb.append(this.f91f);
        sb.append(", element lengths=[");
        try {
            mo80a((C0045c) new C0045c() {

                /* renamed from: a */
                boolean f93a = true;

                public void read(InputStream inputStream, int i) {
                    if (this.f93a) {
                        this.f93a = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            f86b.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
