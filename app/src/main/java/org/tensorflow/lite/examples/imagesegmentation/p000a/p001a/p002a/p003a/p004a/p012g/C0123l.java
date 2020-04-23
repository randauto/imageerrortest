package p000a.p001a.p002a.p003a.p004a.p012g;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p000a.p001a.p002a.p003a.C0140c;
import p000a.p001a.p002a.p003a.C0151i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p010e.C0094c;
import p000a.p001a.p002a.p003a.p004a.p010e.C0095d;
import p000a.p001a.p002a.p003a.p004a.p010e.C0103e;

/* renamed from: a.a.a.a.a.g.l */
/* compiled from: DefaultSettingsSpiCall */
class C0123l extends C0008a implements C0137x {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo275a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public C0123l(C0151i iVar, String str, String str2, C0103e eVar) {
        this(iVar, str, str2, eVar, C0094c.GET);
    }

    C0123l(C0151i iVar, String str, String str2, C0103e eVar, C0094c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo274a(p000a.p001a.p002a.p003a.p004a.p012g.C0136w r8) {
        /*
            r7 = this;
            r0 = 0
            java.util.Map r1 = r7.m355b(r8)     // Catch:{ c -> 0x007a, all -> 0x0075 }
            a.a.a.a.a.e.d r2 = r7.getHttpRequest(r1)     // Catch:{ c -> 0x007a, all -> 0x0075 }
            a.a.a.a.a.e.d r8 = r7.m352a(r2, r8)     // Catch:{ c -> 0x0072, all -> 0x006f }
            a.a.a.a.l r2 = p000a.p001a.p002a.p003a.C0140c.m397g()     // Catch:{ c -> 0x006d }
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ c -> 0x006d }
            r4.<init>()     // Catch:{ c -> 0x006d }
            java.lang.String r5 = "Requesting settings from "
            r4.append(r5)     // Catch:{ c -> 0x006d }
            java.lang.String r5 = r7.getUrl()     // Catch:{ c -> 0x006d }
            r4.append(r5)     // Catch:{ c -> 0x006d }
            java.lang.String r4 = r4.toString()     // Catch:{ c -> 0x006d }
            r2.mo283a(r3, r4)     // Catch:{ c -> 0x006d }
            a.a.a.a.l r2 = p000a.p001a.p002a.p003a.C0140c.m397g()     // Catch:{ c -> 0x006d }
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ c -> 0x006d }
            r4.<init>()     // Catch:{ c -> 0x006d }
            java.lang.String r5 = "Settings query params were: "
            r4.append(r5)     // Catch:{ c -> 0x006d }
            r4.append(r1)     // Catch:{ c -> 0x006d }
            java.lang.String r1 = r4.toString()     // Catch:{ c -> 0x006d }
            r2.mo283a(r3, r1)     // Catch:{ c -> 0x006d }
            org.json.JSONObject r1 = r7.mo273a(r8)     // Catch:{ c -> 0x006d }
            if (r8 == 0) goto L_0x006b
            a.a.a.a.l r0 = p000a.p001a.p002a.p003a.C0140c.m397g()
            java.lang.String r2 = "Fabric"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Settings request ID: "
            r3.append(r4)
            java.lang.String r4 = "X-REQUEST-ID"
            java.lang.String r8 = r8.mo215b(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r0.mo283a(r2, r8)
        L_0x006b:
            r0 = r1
            goto L_0x00a9
        L_0x006d:
            r1 = move-exception
            goto L_0x007c
        L_0x006f:
            r0 = move-exception
            r8 = r2
            goto L_0x00ab
        L_0x0072:
            r1 = move-exception
            r8 = r2
            goto L_0x007c
        L_0x0075:
            r8 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x00ab
        L_0x007a:
            r1 = move-exception
            r8 = r0
        L_0x007c:
            a.a.a.a.l r2 = p000a.p001a.p002a.p003a.C0140c.m397g()     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "Fabric"
            java.lang.String r4 = "Settings request failed."
            r2.mo293e(r3, r4, r1)     // Catch:{ all -> 0x00aa }
            if (r8 == 0) goto L_0x00a9
            a.a.a.a.l r1 = p000a.p001a.p002a.p003a.C0140c.m397g()
            java.lang.String r2 = "Fabric"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Settings request ID: "
            r3.append(r4)
            java.lang.String r4 = "X-REQUEST-ID"
            java.lang.String r8 = r8.mo215b(r4)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r1.mo283a(r2, r8)
        L_0x00a9:
            return r0
        L_0x00aa:
            r0 = move-exception
        L_0x00ab:
            if (r8 == 0) goto L_0x00cd
            a.a.a.a.l r1 = p000a.p001a.p002a.p003a.C0140c.m397g()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Settings request ID: "
            r2.append(r3)
            java.lang.String r3 = "X-REQUEST-ID"
            java.lang.String r8 = r8.mo215b(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.String r2 = "Fabric"
            r1.mo283a(r2, r8)
        L_0x00cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p012g.C0123l.mo274a(a.a.a.a.a.g.w):org.json.JSONObject");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JSONObject mo273a(C0095d dVar) {
        int b = dVar.mo213b();
        StringBuilder sb = new StringBuilder();
        sb.append("Settings result was: ");
        sb.append(b);
        C0140c.m397g().mo283a("Fabric", sb.toString());
        if (mo275a(b)) {
            return m353a(dVar.mo222d());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to retrieve settings from ");
        sb2.append(getUrl());
        C0140c.m397g().mo292e("Fabric", sb2.toString());
        return null;
    }

    /* renamed from: a */
    private JSONObject m353a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse settings JSON from ");
            sb.append(getUrl());
            C0140c.m397g().mo284a("Fabric", sb.toString(), (Throwable) e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings response ");
            sb2.append(str);
            C0140c.m397g().mo283a("Fabric", sb2.toString());
            return null;
        }
    }

    /* renamed from: b */
    private Map<String, String> m355b(C0136w wVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", wVar.f304h);
        hashMap.put("display_version", wVar.f303g);
        hashMap.put("source", Integer.toString(wVar.f305i));
        if (wVar.f306j != null) {
            hashMap.put("icon_hash", wVar.f306j);
        }
        String str = wVar.f302f;
        if (!C0020i.m73d(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    private C0095d m352a(C0095d dVar, C0136w wVar) {
        m354a(dVar, C0008a.HEADER_API_KEY, wVar.f297a);
        m354a(dVar, C0008a.HEADER_CLIENT_TYPE, C0008a.ANDROID_CLIENT_TYPE);
        m354a(dVar, C0008a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        m354a(dVar, C0008a.HEADER_ACCEPT, C0008a.ACCEPT_JSON_VALUE);
        m354a(dVar, "X-CRASHLYTICS-DEVICE-MODEL", wVar.f298b);
        m354a(dVar, "X-CRASHLYTICS-OS-BUILD-VERSION", wVar.f299c);
        m354a(dVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", wVar.f300d);
        m354a(dVar, "X-CRASHLYTICS-INSTALLATION-ID", wVar.f301e);
        return dVar;
    }

    /* renamed from: a */
    private void m354a(C0095d dVar, String str, String str2) {
        if (str2 != null) {
            dVar.mo203a(str, str2);
        }
    }
}
