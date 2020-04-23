package p000a.p001a.p002a.p003a.p004a.p011f;

import android.content.Context;
import java.io.File;
import p000a.p001a.p002a.p003a.C0140c;
import p000a.p001a.p002a.p003a.C0151i;

/* renamed from: a.a.a.a.a.f.b */
/* compiled from: FileStoreImpl */
public class C0109b implements C0108a {

    /* renamed from: a */
    private final Context f206a;

    /* renamed from: b */
    private final String f207b;

    /* renamed from: c */
    private final String f208c;

    public C0109b(C0151i iVar) {
        if (iVar.getContext() != null) {
            this.f206a = iVar.getContext();
            this.f207b = iVar.getPath();
            StringBuilder sb = new StringBuilder();
            sb.append("Android/");
            sb.append(this.f206a.getPackageName());
            this.f208c = sb.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* renamed from: a */
    public File mo256a() {
        return mo257a(this.f206a.getFilesDir());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public File mo257a(File file) {
        if (file == null) {
            C0140c.m397g().mo283a("Fabric", "Null File");
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            C0140c.m397g().mo290d("Fabric", "Couldn't create file");
        }
        return null;
    }
}
