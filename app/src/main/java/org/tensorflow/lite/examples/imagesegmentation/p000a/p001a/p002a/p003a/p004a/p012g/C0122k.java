package p000a.p001a.p002a.p003a.p004a.p012g;

import com.crashlytics.android.beta.BuildConfig;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.p004a.p006b.C0026k;
import p000a.p001a.p002a.p003a.p004a.p009d.C0081b;

/* renamed from: a.a.a.a.a.g.k */
/* compiled from: DefaultSettingsJsonTransform */
class C0122k implements C0135v {
    C0122k() {
    }

    /* renamed from: a */
    public C0133t mo272a(C0026k kVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        C0133t tVar = new C0133t(m343a(kVar, (long) optInt2, jSONObject), m344a(jSONObject.getJSONObject("app")), m348e(jSONObject.getJSONObject("session")), m349f(jSONObject.getJSONObject("prompt")), m346c(jSONObject.getJSONObject("features")), m347d(jSONObject.getJSONObject("analytics")), m350g(jSONObject.getJSONObject(BuildConfig.ARTIFACT_ID)), optInt, optInt2);
        return tVar;
    }

    /* renamed from: a */
    private C0116e m344a(JSONObject jSONObject) {
        C0116e eVar = new C0116e(jSONObject.getString("identifier"), jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false), (!jSONObject.has("icon") || !jSONObject.getJSONObject("icon").has("hash")) ? null : m345b(jSONObject.getJSONObject("icon")));
        return eVar;
    }

    /* renamed from: b */
    private C0114c m345b(JSONObject jSONObject) {
        return new C0114c(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    /* renamed from: c */
    private C0124m m346c(JSONObject jSONObject) {
        C0124m mVar = new C0124m(jSONObject.optBoolean("prompt_enabled", false), jSONObject.optBoolean("collect_logged_exceptions", true), jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_analytics", false), jSONObject.optBoolean("firebase_crashlytics_enabled", false));
        return mVar;
    }

    /* renamed from: d */
    private C0113b m347d(JSONObject jSONObject) {
        C0113b bVar = new C0113b(jSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events"), jSONObject.optInt("flush_interval_secs", 600), jSONObject.optInt("max_byte_size_per_file", C0081b.MAX_BYTE_SIZE_PER_FILE), jSONObject.optInt("max_file_count_per_send", 1), jSONObject.optInt("max_pending_send_file_count", 100), jSONObject.optBoolean("forward_to_google_analytics", false), jSONObject.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject.optBoolean("track_custom_events", true), jSONObject.optBoolean("track_predefined_events", true), jSONObject.optInt("sampling_rate", 1), jSONObject.optBoolean("flush_on_background", true));
        return bVar;
    }

    /* renamed from: e */
    private C0127p m348e(JSONObject jSONObject) {
        C0127p pVar = new C0127p(jSONObject.optInt("log_buffer_size", 64000), jSONObject.optInt("max_chained_exception_depth", 8), jSONObject.optInt("max_custom_exception_events", 64), jSONObject.optInt("max_custom_key_value_pairs", 64), jSONObject.optInt("identifier_mask", 255), jSONObject.optBoolean("send_session_without_crash", false), jSONObject.optInt("max_complete_sessions_count", 4));
        return pVar;
    }

    /* renamed from: f */
    private C0126o m349f(JSONObject jSONObject) {
        C0126o oVar = new C0126o(jSONObject.optString("title", "Send Crash Report?"), jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject.optString("send_button_title", "Send"), jSONObject.optBoolean("show_cancel_button", true), jSONObject.optString("cancel_button_title", "Don't Send"), jSONObject.optBoolean("show_always_send_button", true), jSONObject.optString("always_send_button_title", "Always Send"));
        return oVar;
    }

    /* renamed from: g */
    private C0117f m350g(JSONObject jSONObject) {
        return new C0117f(jSONObject.optString("update_endpoint", C0134u.f296a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    /* renamed from: a */
    private long m343a(C0026k kVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.getLong("expires_at");
        }
        return kVar.mo50a() + (j * 1000);
    }
}
