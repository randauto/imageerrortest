package org.tensorflow.lite.examples.imagesegmentation.judi.com.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: judi.com.service.d */
/* compiled from: FileUtil */
public class FileUtil {

    /* renamed from: a */
    public static final String f26724a = "d";

    private FileUtil() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[SYNTHETIC, Splitter:B:18:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a A[SYNTHETIC, Splitter:B:25:0x003a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static String m39134a(File r4) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0027, all -> 0x0024 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0027, all -> 0x0024 }
            int r4 = r1.available()     // Catch:{ IOException -> 0x0022 }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0022 }
            r1.read(r4)     // Catch:{ IOException -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x0022 }
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0022 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r4, r3)     // Catch:{ IOException -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x001d }
            goto L_0x0021
        L_0x001d:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0021:
            return r2
        L_0x0022:
            r4 = move-exception
            goto L_0x0029
        L_0x0024:
            r4 = move-exception
            r1 = r0
            goto L_0x0038
        L_0x0027:
            r4 = move-exception
            r1 = r0
        L_0x0029:
            r4.printStackTrace()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0036
            r1.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0036
        L_0x0032:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0036:
            return r0
        L_0x0037:
            r4 = move-exception
        L_0x0038:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: judi.com.service.C7370d.m39134a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static String m39133a(Context context, File file, Bitmap bitmap, String str) {
        return m39132a(context, CompressFormat.PNG, file, bitmap, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[SYNTHETIC, Splitter:B:20:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044 A[SYNTHETIC, Splitter:B:26:0x0044] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static String m39132a(Context r1, CompressFormat r2, File r3, Bitmap r4, String r5) {
        /*
            if (r4 != 0) goto L_0x0005
            java.lang.String r1 = ""
            return r1
        L_0x0005:
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r5)
            r3 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0021 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0021 }
            r3 = 90
            r4.compress(r2, r3, r5)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r5.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x003d
        L_0x0019:
            r1 = move-exception
            r3 = r5
            goto L_0x0042
        L_0x001c:
            r2 = move-exception
            r3 = r5
            goto L_0x0022
        L_0x001f:
            r1 = move-exception
            goto L_0x0042
        L_0x0021:
            r2 = move-exception
        L_0x0022:
            java.lang.String r4 = f26724a     // Catch:{ all -> 0x001f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r5.<init>()     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "saveIcon: "
            r5.append(r0)     // Catch:{ all -> 0x001f }
            r5.append(r2)     // Catch:{ all -> 0x001f }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x001f }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x003d
            r3.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            java.lang.String r1 = r1.getPath()
            return r1
        L_0x0042:
            if (r3 == 0) goto L_0x0047
            r3.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: judi.com.service.C7370d.m39132a(android.content.Context, android.graphics.Bitmap$CompressFormat, java.io.File, android.graphics.Bitmap, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static void m39136a(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(inputStream));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    File file2 = new File(file, nextEntry.getName());
                    File parentFile = nextEntry.isDirectory() ? file2 : file2.getParentFile();
                    if (!parentFile.isDirectory()) {
                        if (!parentFile.mkdirs()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to ensure directory: ");
                            sb.append(parentFile.getAbsolutePath());
                            throw new FileNotFoundException(sb.toString());
                        }
                    }
                    if (!nextEntry.isDirectory()) {
                        fileOutputStream = new FileOutputStream(file2);
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                    }
                } else {
                    zipInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            zipInputStream.close();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static String m39131a(Context r2, int r3) {
        /*
            android.content.res.Resources r2 = r2.getResources()
            java.io.InputStream r2 = r2.openRawResource(r3)
            r3 = 0
            int r0 = r2.available()     // Catch:{ IOException -> 0x0023 }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0023 }
            r2.read(r0)     // Catch:{ IOException -> 0x0023 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0023 }
            r1.<init>()     // Catch:{ IOException -> 0x0023 }
            r1.write(r0)     // Catch:{ IOException -> 0x0021 }
            r1.close()     // Catch:{ IOException -> 0x0021 }
            r2.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            r2 = move-exception
            goto L_0x0025
        L_0x0023:
            r2 = move-exception
            r1 = r3
        L_0x0025:
            r2.printStackTrace()
        L_0x0028:
            if (r1 != 0) goto L_0x002b
            goto L_0x002f
        L_0x002b:
            java.lang.String r3 = r1.toString()
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: judi.com.service.C7370d.m39131a(android.content.Context, int):java.lang.String");
    }

    /* renamed from: a */
    public static void m39135a(File file, File file2) {
        m39136a((InputStream) new FileInputStream(file), file2);
    }

    /* renamed from: a */
    public static File m39129a(File file, String str, String str2) {
        return m39130a(file, str, (String) null, str2);
    }

    /* renamed from: a */
    public static File m39130a(File file, String str, String str2, String str3) {
        String str4;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHH_mm_ss_SSS", Locale.getDefault());
        if (str2 == null) {
            str4 = simpleDateFormat.format(new Date()).concat(".").concat(str3);
        } else {
            str4 = str2.concat(".").concat(str3);
        }
        return new File(file2, str4);
    }

    /* renamed from: a */
    public static File m39128a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }
}
