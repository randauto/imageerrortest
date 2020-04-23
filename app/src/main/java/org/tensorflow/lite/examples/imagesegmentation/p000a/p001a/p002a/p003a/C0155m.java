package p000a.p001a.p002a.p003a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p000a.p001a.p002a.p003a.p004a.p006b.C0018g;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0027l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0028m;
import p000a.p001a.p002a.p003a.p004a.p010e.C0092b;
import p000a.p001a.p002a.p003a.p004a.p010e.C0103e;
import p000a.p001a.p002a.p003a.p004a.p012g.C0115d;
import p000a.p001a.p002a.p003a.p004a.p012g.C0116e;
import p000a.p001a.p002a.p003a.p004a.p012g.C0119h;
import p000a.p001a.p002a.p003a.p004a.p012g.C0125n;
import p000a.p001a.p002a.p003a.p004a.p012g.C0128q;
import p000a.p001a.p002a.p003a.p004a.p012g.C0133t;
import p000a.p001a.p002a.p003a.p004a.p012g.C0138y;

/* renamed from: a.a.a.a.m */
/* compiled from: Onboarding */
class C0155m extends C0151i<Boolean> {

    /* renamed from: a */
    private final C0103e f343a = new C0092b();

    /* renamed from: b */
    private PackageManager f344b;

    /* renamed from: c */
    private String f345c;

    /* renamed from: d */
    private PackageInfo f346d;

    /* renamed from: e */
    private String f347e;

    /* renamed from: f */
    private String f348f;

    /* renamed from: g */
    private String f349g;

    /* renamed from: h */
    private String f350h;

    /* renamed from: i */
    private String f351i;

    /* renamed from: j */
    private final Future<Map<String, C0153k>> f352j;

    /* renamed from: k */
    private final Collection<C0151i> f353k;

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public String getVersion() {
        return "1.4.8.32";
    }

    public C0155m(Future<Map<String, C0153k>> future, Collection<C0151i> collection) {
        this.f352j = future;
        this.f353k = collection;
    }

    /* access modifiers changed from: protected */
    public boolean onPreExecute() {
        try {
            this.f349g = getIdManager().mo73i();
            this.f344b = getContext().getPackageManager();
            this.f345c = getContext().getPackageName();
            this.f346d = this.f344b.getPackageInfo(this.f345c, 0);
            this.f347e = Integer.toString(this.f346d.versionCode);
            this.f348f = this.f346d.versionName == null ? "0.0" : this.f346d.versionName;
            this.f350h = this.f344b.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.f351i = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (NameNotFoundException e) {
            C0140c.m397g().mo293e("Fabric", "Failed init", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground() {
        boolean z;
        Map map;
        String k = C0020i.m80k(getContext());
        C0133t c = m447c();
        if (c != null) {
            try {
                if (this.f352j != null) {
                    map = (Map) this.f352j.get();
                } else {
                    map = new HashMap();
                }
                z = m445a(k, c.f287a, mo342a(map, this.f353k).values());
            } catch (Exception e) {
                C0140c.m397g().mo293e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    private C0133t m447c() {
        try {
            C0128q.m360a().mo276a(this, this.idManager, this.f343a, this.f347e, this.f348f, mo343b(), C0027l.m90a(getContext())).mo278c();
            return C0128q.m360a().mo277b();
        } catch (Exception e) {
            C0140c.m397g().mo293e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, C0153k> mo342a(Map<String, C0153k> map, Collection<C0151i> collection) {
        for (C0151i iVar : collection) {
            if (!map.containsKey(iVar.getIdentifier())) {
                map.put(iVar.getIdentifier(), new C0153k(iVar.getIdentifier(), iVar.getVersion(), "binary"));
            }
        }
        return map;
    }

    /* renamed from: a */
    private boolean m445a(String str, C0116e eVar, Collection<C0153k> collection) {
        if ("new".equals(eVar.f238b)) {
            if (m446b(str, eVar, collection)) {
                return C0128q.m360a().mo279d();
            }
            C0140c.m397g().mo293e("Fabric", "Failed to create app with Crashlytics service.", null);
            return false;
        } else if ("configured".equals(eVar.f238b)) {
            return C0128q.m360a().mo279d();
        } else {
            if (eVar.f242f) {
                C0140c.m397g().mo283a("Fabric", "Server says an update is required - forcing a full App update.");
                m448c(str, eVar, collection);
            }
            return true;
        }
    }

    /* renamed from: b */
    private boolean m446b(String str, C0116e eVar, Collection<C0153k> collection) {
        return new C0119h(this, mo343b(), eVar.f239c, this.f343a).mo262a(m443a(C0125n.m359a(getContext(), str), collection));
    }

    /* renamed from: c */
    private boolean m448c(String str, C0116e eVar, Collection<C0153k> collection) {
        return m444a(eVar, C0125n.m359a(getContext(), str), collection);
    }

    /* renamed from: a */
    private boolean m444a(C0116e eVar, C0125n nVar, Collection<C0153k> collection) {
        return new C0138y(this, mo343b(), eVar.f239c, this.f343a).mo262a(m443a(nVar, collection));
    }

    /* renamed from: a */
    private C0115d m443a(C0125n nVar, Collection<C0153k> collection) {
        Context context = getContext();
        C0115d dVar = new C0115d(new C0018g().mo40a(context), getIdManager().mo67c(), this.f348f, this.f347e, C0020i.m53a(C0020i.m82m(context)), this.f350h, C0028m.m94a(this.f349g).mo54a(), this.f351i, "0", nVar, collection);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo343b() {
        return C0020i.m65b(getContext(), "com.crashlytics.ApiEndpoint");
    }
}
