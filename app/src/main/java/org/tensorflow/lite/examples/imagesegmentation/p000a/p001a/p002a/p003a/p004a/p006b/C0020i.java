package p000a.p001a.p002a.p003a.p004a.p006b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import p000a.p001a.p002a.p003a.C0140c;

/* renamed from: a.a.a.a.a.b.i */
/* compiled from: CommonUtils */
public class C0020i {

    /* renamed from: a */
    public static final Comparator<File> f19a = new Comparator<File>() {
        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    };

    /* renamed from: b */
    private static Boolean f20b;

    /* renamed from: c */
    private static final char[] f21c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d */
    private static long f22d = -1;

    /* renamed from: a.a.a.a.a.b.i$a */
    /* compiled from: CommonUtils */
    enum C0022a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: k */
        private static final Map<String, C0022a> f33k = null;

        static {
            f33k = new HashMap(4);
            f33k.put("armeabi-v7a", ARMV7);
            f33k.put("armeabi", ARMV6);
            f33k.put("arm64-v8a", ARM64);
            f33k.put("x86", X86_32);
        }

        /* renamed from: a */
        static C0022a m86a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C0140c.m397g().mo283a("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            C0022a aVar = (C0022a) f33k.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                aVar = UNKNOWN;
            }
            return aVar;
        }
    }

    /* renamed from: b */
    public static String m64b(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    /* renamed from: a */
    public static SharedPreferences m44a(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* renamed from: a */
    public static String m46a(File file, String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = Pattern.compile("\\s*:\\s*").split(readLine, 2);
                        if (split.length > 1 && split[0].equals(str)) {
                            str2 = split[1];
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error parsing ");
                            sb.append(file);
                            C0140c.m397g().mo293e("Fabric", sb.toString(), e);
                            m58a((Closeable) bufferedReader, "Failed to close system file reader.");
                            return str2;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error parsing ");
                sb2.append(file);
                C0140c.m397g().mo293e("Fabric", sb2.toString(), e);
                m58a((Closeable) bufferedReader, "Failed to close system file reader.");
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                m58a((Closeable) bufferedReader, "Failed to close system file reader.");
                throw th;
            }
            m58a((Closeable) bufferedReader, "Failed to close system file reader.");
        }
        return str2;
    }

    /* renamed from: a */
    public static int m39a() {
        return C0022a.m86a().ordinal();
    }

    /* renamed from: b */
    public static synchronized long m62b() {
        long j;
        long a;
        synchronized (C0020i.class) {
            if (f22d == -1) {
                long j2 = 0;
                String a2 = m46a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a2)) {
                    String upperCase = a2.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            a = m42a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            a = m42a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            a = m42a(upperCase, "GB", 1073741824);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            C0140c.m397g().mo283a("Fabric", sb.toString());
                        }
                        j2 = a;
                    } catch (NumberFormatException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        C0140c.m397g().mo293e("Fabric", sb2.toString(), e);
                    }
                }
                f22d = j2;
            }
            j = f22d;
        }
        return j;
    }

    /* renamed from: a */
    static long m42a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: a */
    public static RunningAppProcessInfo m43a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m47a(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    /* renamed from: a */
    public static String m49a(String str) {
        return m50a(str, "SHA-1");
    }

    /* renamed from: b */
    public static String m67b(String str) {
        return m50a(str, "SHA-256");
    }

    /* renamed from: b */
    public static String m66b(InputStream inputStream) {
        return m48a(inputStream, "SHA-1");
    }

    /* renamed from: a */
    private static String m50a(String str, String str2) {
        return m52a(str.getBytes(), str2);
    }

    /* renamed from: a */
    private static String m48a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m51a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            C0140c.m397g().mo293e("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    /* renamed from: a */
    private static String m52a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m51a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(str);
            sb.append(", returning empty string.");
            C0140c.m397g().mo293e("Fabric", sb.toString(), e);
            return "";
        }
    }

    /* renamed from: a */
    public static String m53a(String... strArr) {
        String str = null;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : strArr) {
            if (str2 != null) {
                arrayList.add(str2.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            str = m49a(sb2);
        }
        return str;
    }

    /* renamed from: b */
    public static long m63b(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: c */
    public static long m68c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: c */
    public static Float m69c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    /* renamed from: d */
    public static boolean m72d(Context context) {
        boolean z = false;
        if (m75f(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static void m55a(Context context, String str) {
        if (m74e(context)) {
            C0140c.m397g().mo283a("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m56a(Context context, String str, Throwable th) {
        if (m74e(context)) {
            C0140c.m397g().mo292e("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m54a(Context context, int i, String str, String str2) {
        if (m74e(context)) {
            C0140c.m397g().mo281a(i, "Fabric", str2);
        }
    }

    /* renamed from: e */
    public static boolean m74e(Context context) {
        if (f20b == null) {
            f20b = Boolean.valueOf(m61a(context, "com.crashlytics.Trace", false));
        }
        return f20b.booleanValue();
    }

    /* renamed from: a */
    public static boolean m61a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = m40a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                int a2 = m40a(context, str, "string");
                if (a2 > 0) {
                    return Boolean.parseBoolean(context.getString(a2));
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public static int m40a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m79j(context));
    }

    /* renamed from: f */
    public static boolean m75f(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    /* renamed from: g */
    public static boolean m76g(Context context) {
        boolean f = m75f(context);
        String str = Build.TAGS;
        if ((!f && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (f || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m70c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: h */
    public static int m77h(Context context) {
        int i = m75f(context) ? 1 : 0;
        if (m76g(context)) {
            i |= 2;
        }
        return m70c() ? i | 4 : i;
    }

    /* renamed from: a */
    public static int m41a(Context context, boolean z) {
        Float c = m69c(context);
        if (!z || c == null) {
            return 1;
        }
        if (((double) c.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) c.floatValue()) < 99.0d ? 2 : 0;
    }

    /* renamed from: a */
    public static String m51a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = f21c[b >>> 4];
            cArr[i2 + 1] = f21c[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: i */
    public static boolean m78i(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: b */
    public static String m65b(Context context, String str) {
        int a = m40a(context, str, "string");
        return a > 0 ? context.getString(a) : "";
    }

    /* renamed from: a */
    public static void m58a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C0140c.m397g().mo293e("Fabric", str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m59a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                C0140c.m397g().mo293e("Fabric", str, e);
            }
        }
    }

    /* renamed from: d */
    public static boolean m73d(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    public static String m45a(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* renamed from: j */
    public static String m79j(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            return context.getResources().getResourcePackageName(i);
        } catch (NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: a */
    public static void m60a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public static String m80k(Context context) {
        InputStream inputStream;
        String str = null;
        try {
            inputStream = context.getResources().openRawResource(m81l(context));
            try {
                String b = m66b(inputStream);
                if (!m73d(b)) {
                    str = b;
                }
                m58a((Closeable) inputStream, "Failed to close icon input stream.");
                return str;
            } catch (Exception e) {
                e = e;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not calculate hash for app icon:");
                    sb.append(e.getMessage());
                    C0140c.m397g().mo290d("Fabric", sb.toString());
                    m58a((Closeable) inputStream, "Failed to close icon input stream.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    m58a((Closeable) inputStream, "Failed to close icon input stream.");
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not calculate hash for app icon:");
            sb2.append(e.getMessage());
            C0140c.m397g().mo290d("Fabric", sb2.toString());
            m58a((Closeable) inputStream, "Failed to close icon input stream.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m58a((Closeable) inputStream, "Failed to close icon input stream.");
            throw th;
        }
    }

    /* renamed from: l */
    public static int m81l(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    /* renamed from: m */
    public static String m82m(Context context) {
        int a = m40a(context, "io.fabric.android.build_id", "string");
        if (a == 0) {
            a = m40a(context, "com.crashlytics.android.build_id", "string");
        }
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        StringBuilder sb = new StringBuilder();
        sb.append("Build ID is: ");
        sb.append(string);
        C0140c.m397g().mo283a("Fabric", sb.toString());
        return string;
    }

    /* renamed from: n */
    public static String m83n(Context context) {
        int a = m40a(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        StringBuilder sb = new StringBuilder();
        sb.append("Unity Editor version is: ");
        sb.append(string);
        C0140c.m397g().mo283a("Fabric", sb.toString());
        return string;
    }

    /* renamed from: a */
    public static void m57a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m71c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: o */
    public static boolean m84o(Context context) {
        boolean z = true;
        if (!m71c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            z = false;
        }
        return z;
    }
}
