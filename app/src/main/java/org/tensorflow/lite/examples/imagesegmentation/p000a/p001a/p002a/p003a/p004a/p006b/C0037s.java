package p000a.p001a.p002a.p003a.p004a.p006b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import p000a.p001a.p002a.p003a.C0140c;
import p000a.p001a.p002a.p003a.C0151i;

/* renamed from: a.a.a.a.a.b.s */
/* compiled from: IdManager */
public class C0037s {

    /* renamed from: e */
    private static final Pattern f60e = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: f */
    private static final String f61f = Pattern.quote("/");

    /* renamed from: a */
    C0010c f62a;

    /* renamed from: b */
    C0009b f63b;

    /* renamed from: c */
    boolean f64c;

    /* renamed from: d */
    C0036r f65d;

    /* renamed from: g */
    private final ReentrantLock f66g = new ReentrantLock();

    /* renamed from: h */
    private final C0039t f67h;

    /* renamed from: i */
    private final boolean f68i;

    /* renamed from: j */
    private final boolean f69j;

    /* renamed from: k */
    private final Context f70k;

    /* renamed from: l */
    private final String f71l;

    /* renamed from: m */
    private final String f72m;

    /* renamed from: n */
    private final Collection<C0151i> f73n;

    /* renamed from: a.a.a.a.a.b.s$a */
    /* compiled from: IdManager */
    public enum C0038a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        

        /* renamed from: h */
        public final int f82h;

        private C0038a(int i) {
            this.f82h = i;
        }
    }

    public C0037s(Context context, String str, String str2, Collection<C0151i> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f70k = context;
            this.f71l = str;
            this.f72m = str2;
            this.f73n = collection;
            this.f67h = new C0039t();
            this.f62a = new C0010c(context);
            this.f65d = new C0036r();
            this.f68i = C0020i.m61a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (!this.f68i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Device ID collection disabled for ");
                sb.append(context.getPackageName());
                C0140c.m397g().mo283a("Fabric", sb.toString());
            }
            this.f69j = C0020i.m61a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.f69j) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("User information collection disabled for ");
                sb2.append(context.getPackageName());
                C0140c.m397g().mo283a("Fabric", sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /* renamed from: a */
    public boolean mo65a() {
        return this.f69j;
    }

    /* renamed from: a */
    private String m111a(String str) {
        if (str == null) {
            return null;
        }
        return f60e.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: b */
    public String mo66b() {
        String str = this.f72m;
        if (str != null) {
            return str;
        }
        SharedPreferences a = C0020i.m44a(this.f70k);
        m115b(a);
        String string = a.getString("crashlytics.installation.id", null);
        return string == null ? m110a(a) : string;
    }

    /* renamed from: c */
    public String mo67c() {
        return this.f71l;
    }

    /* renamed from: d */
    public String mo68d() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo69e());
        sb.append("/");
        sb.append(mo70f());
        return sb.toString();
    }

    /* renamed from: e */
    public String mo69e() {
        return m114b(VERSION.RELEASE);
    }

    /* renamed from: f */
    public String mo70f() {
        return m114b(VERSION.INCREMENTAL);
    }

    /* renamed from: g */
    public String mo71g() {
        return String.format(Locale.US, "%s/%s", new Object[]{m114b(Build.MANUFACTURER), m114b(Build.MODEL)});
    }

    /* renamed from: b */
    private String m114b(String str) {
        return str.replaceAll(f61f, "");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private String m110a(SharedPreferences sharedPreferences) {
        this.f66g.lock();
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string == null) {
                string = m111a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            return string;
        } finally {
            this.f66g.unlock();
        }
    }

    /* renamed from: b */
    private void m115b(SharedPreferences sharedPreferences) {
        C0009b l = mo76l();
        if (l != null) {
            m112a(sharedPreferences, l.f8a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private void m112a(SharedPreferences sharedPreferences, String str) {
        this.f66g.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString("crashlytics.advertising.id", null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString("crashlytics.advertising.id", str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str).commit();
                }
                this.f66g.unlock();
            }
        } finally {
            this.f66g.unlock();
        }
    }

    /* renamed from: h */
    public Map<C0038a, String> mo72h() {
        HashMap hashMap = new HashMap();
        for (C0151i iVar : this.f73n) {
            if (iVar instanceof C0029n) {
                for (Entry entry : ((C0029n) iVar).getDeviceIdentifiers().entrySet()) {
                    m113a(hashMap, (C0038a) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: i */
    public String mo73i() {
        return this.f67h.mo77a(this.f70k);
    }

    /* renamed from: j */
    public Boolean mo74j() {
        if (mo75k()) {
            return m116m();
        }
        return null;
    }

    /* renamed from: a */
    private void m113a(Map<C0038a, String> map, C0038a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo75k() {
        return this.f68i && !this.f65d.mo61b(this.f70k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public synchronized C0009b mo76l() {
        if (!this.f64c) {
            this.f63b = this.f62a.mo26a();
            this.f64c = true;
        }
        return this.f63b;
    }

    /* renamed from: m */
    private Boolean m116m() {
        C0009b l = mo76l();
        if (l != null) {
            return Boolean.valueOf(l.f9b);
        }
        return null;
    }
}
