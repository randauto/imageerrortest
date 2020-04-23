package p000a.p001a.p002a.p003a.p004a.p009d;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0041u;

/* renamed from: a.a.a.a.a.d.h */
/* compiled from: QueueFileEventStorage */
public class C0089h implements C0084c {

    /* renamed from: a */
    private final Context f161a;

    /* renamed from: b */
    private final File f162b;

    /* renamed from: c */
    private final String f163c;

    /* renamed from: d */
    private final File f164d;

    /* renamed from: e */
    private C0041u f165e = new C0041u(this.f164d);

    /* renamed from: f */
    private File f166f;

    public C0089h(Context context, File file, String str, String str2) {
        this.f161a = context;
        this.f162b = file;
        this.f163c = str2;
        this.f164d = new File(this.f162b, str);
        m219e();
    }

    /* renamed from: e */
    private void m219e() {
        this.f166f = new File(this.f162b, this.f163c);
        if (!this.f166f.exists()) {
            this.f166f.mkdirs();
        }
    }

    /* renamed from: a */
    public void mo185a(byte[] bArr) {
        this.f165e.mo81a(bArr);
    }

    /* renamed from: a */
    public int mo181a() {
        return this.f165e.mo79a();
    }

    /* renamed from: a */
    public void mo183a(String str) {
        this.f165e.close();
        m218a(this.f164d, new File(this.f166f, str));
        this.f165e = new C0041u(this.f164d);
    }

    /* renamed from: a */
    private void m218a(File file, File file2) {
        FileInputStream fileInputStream;
        OutputStream a;
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a = mo194a(file2);
            } catch (Throwable th) {
                th = th;
                C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream");
                C0020i.m58a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
            try {
                C0020i.m60a((InputStream) fileInputStream, a, new byte[1024]);
                C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream");
                C0020i.m58a((Closeable) a, "Failed to close output stream");
                file.delete();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                outputStream = a;
                th = th3;
                C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream");
                C0020i.m58a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            C0020i.m58a((Closeable) fileInputStream, "Failed to close file input stream");
            C0020i.m58a((Closeable) outputStream, "Failed to close output stream");
            file.delete();
            throw th;
        }
    }

    /* renamed from: a */
    public OutputStream mo194a(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: a */
    public List<File> mo182a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f166f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo184a(List<File> list) {
        for (File file : list) {
            C0020i.m55a(this.f161a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    /* renamed from: c */
    public List<File> mo188c() {
        return Arrays.asList(this.f166f.listFiles());
    }

    /* renamed from: d */
    public void mo189d() {
        try {
            this.f165e.close();
        } catch (IOException unused) {
        }
        this.f164d.delete();
    }

    /* renamed from: b */
    public boolean mo187b() {
        return this.f165e.mo84b();
    }

    /* renamed from: a */
    public boolean mo186a(int i, int i2) {
        return this.f165e.mo83a(i, i2);
    }
}
