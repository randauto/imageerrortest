package p000a.p001a.p002a.p003a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;

/* renamed from: a.a.a.a.e */
/* compiled from: FabricKitsFinder */
class C0145e implements Callable<Map<String, C0153k>> {

    /* renamed from: a */
    final String f337a;

    C0145e(String str) {
        this.f337a = str;
    }

    /* renamed from: a */
    public Map<String, C0153k> call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(m415c());
        hashMap.putAll(m416d());
        StringBuilder sb = new StringBuilder();
        sb.append("finish scanning in ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        C0140c.m397g().mo286b("Fabric", sb.toString());
        return hashMap;
    }

    /* renamed from: c */
    private Map<String, C0153k> m415c() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.f");
            C0153k kVar = new C0153k("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(kVar.mo338a(), kVar);
            C0140c.m397g().mo286b("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: d */
    private Map<String, C0153k> m416d() {
        HashMap hashMap = new HashMap();
        ZipFile b = mo317b();
        Enumeration entries = b.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > "fabric/".length()) {
                C0153k a = m414a(zipEntry, b);
                if (a != null) {
                    hashMap.put(a.mo338a(), a);
                    C0140c.m397g().mo286b("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a.mo338a(), a.mo339b()}));
                }
            }
        }
        if (b != null) {
            try {
                b.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private C0153k m414a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid format of fabric file,");
                    sb.append(zipEntry.getName());
                    throw new IllegalStateException(sb.toString());
                }
                C0153k kVar = new C0153k(property, property2, property3);
                C0020i.m57a((Closeable) inputStream);
                return kVar;
            } catch (IOException e) {
                e = e;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error when parsing fabric properties ");
                    sb2.append(zipEntry.getName());
                    C0140c.m397g().mo293e("Fabric", sb2.toString(), e);
                    C0020i.m57a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C0020i.m57a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Error when parsing fabric properties ");
            sb22.append(zipEntry.getName());
            C0140c.m397g().mo293e("Fabric", sb22.toString(), e);
            C0020i.m57a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C0020i.m57a((Closeable) inputStream);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ZipFile mo317b() {
        return new ZipFile(this.f337a);
    }
}
