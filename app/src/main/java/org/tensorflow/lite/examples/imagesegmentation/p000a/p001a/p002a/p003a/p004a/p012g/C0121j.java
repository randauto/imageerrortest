package p000a.p001a.p002a.p003a.p004a.p012g;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0140c;
import p000a.p001a.p002a.p003a.C0151i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0026k;
import p000a.p001a.p002a.p003a.p004a.p006b.C0027l;
import p000a.p001a.p002a.p003a.p004a.p011f.C0110c;
import p000a.p001a.p002a.p003a.p004a.p011f.C0111d;

/* renamed from: a.a.a.a.a.g.j */
/* compiled from: DefaultSettingsController */
class C0121j implements C0132s {

    /* renamed from: a */
    private final C0136w f247a;

    /* renamed from: b */
    private final C0135v f248b;

    /* renamed from: c */
    private final C0026k f249c;

    /* renamed from: d */
    private final C0118g f250d;

    /* renamed from: e */
    private final C0137x f251e;

    /* renamed from: f */
    private final C0151i f252f;

    /* renamed from: g */
    private final C0110c f253g = new C0111d(this.f252f);

    /* renamed from: h */
    private final C0027l f254h;

    public C0121j(C0151i iVar, C0136w wVar, C0026k kVar, C0135v vVar, C0118g gVar, C0137x xVar, C0027l lVar) {
        this.f252f = iVar;
        this.f247a = wVar;
        this.f249c = kVar;
        this.f248b = vVar;
        this.f250d = gVar;
        this.f251e = xVar;
        this.f254h = lVar;
    }

    /* renamed from: a */
    public C0133t mo266a() {
        return mo267a(C0131r.USE_CACHE);
    }

    /* renamed from: a */
    public C0133t mo267a(C0131r rVar) {
        C0133t tVar;
        C0133t tVar2 = null;
        if (!this.f254h.mo52a()) {
            C0140c.m397g().mo283a("Fabric", "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            if (!C0140c.m398h() && !mo271d()) {
                tVar2 = m336b(rVar);
            }
            if (tVar2 == null) {
                JSONObject a = this.f251e.mo274a(this.f247a);
                if (a != null) {
                    C0133t a2 = this.f248b.mo272a(this.f249c, a);
                    try {
                        this.f250d.mo265a(a2.f293g, a);
                        m335a(a, "Loaded settings: ");
                        mo268a(mo269b());
                        tVar2 = a2;
                    } catch (Exception e) {
                        e = e;
                        tVar2 = a2;
                        C0140c.m397g().mo293e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
                        tVar = tVar2;
                        return tVar;
                    }
                }
            }
            if (tVar2 == null) {
                tVar = m336b(C0131r.IGNORE_CACHE_EXPIRATION);
                return tVar;
            }
        } catch (Exception e2) {
            e = e2;
            C0140c.m397g().mo293e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
            tVar = tVar2;
            return tVar;
        }
        tVar = tVar2;
        return tVar;
    }

    /* renamed from: b */
    private C0133t m336b(C0131r rVar) {
        C0133t tVar = null;
        try {
            if (C0131r.SKIP_CACHE_LOOKUP.equals(rVar)) {
                return null;
            }
            JSONObject a = this.f250d.mo264a();
            if (a != null) {
                C0133t a2 = this.f248b.mo272a(this.f249c, a);
                if (a2 != null) {
                    m335a(a, "Loaded cached settings: ");
                    long a3 = this.f249c.mo50a();
                    if (!C0131r.IGNORE_CACHE_EXPIRATION.equals(rVar)) {
                        if (a2.mo280a(a3)) {
                            C0140c.m397g().mo283a("Fabric", "Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C0140c.m397g().mo283a("Fabric", "Returning cached settings.");
                        return a2;
                    } catch (Exception e) {
                        e = e;
                        tVar = a2;
                        C0140c.m397g().mo293e("Fabric", "Failed to get cached settings", e);
                        return tVar;
                    }
                } else {
                    C0140c.m397g().mo293e("Fabric", "Failed to transform cached settings data.", null);
                    return null;
                }
            } else {
                C0140c.m397g().mo283a("Fabric", "No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C0140c.m397g().mo293e("Fabric", "Failed to get cached settings", e);
            return tVar;
        }
    }

    /* renamed from: a */
    private void m335a(JSONObject jSONObject, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
        C0140c.m397g().mo283a("Fabric", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo269b() {
        return C0020i.m53a(C0020i.m82m(this.f252f.getContext()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo270c() {
        return this.f253g.mo258a().getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo268a(String str) {
        Editor b = this.f253g.mo260b();
        b.putString("existing_instance_identifier", str);
        return this.f253g.mo259a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo271d() {
        return !mo270c().equals(mo269b());
    }
}
