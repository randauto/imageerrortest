package p000a.p001a.p002a.p003a.p004a.p010e;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p000a.p001a.p002a.p003a.C0139b;
import p000a.p001a.p002a.p003a.C0154l;

/* renamed from: a.a.a.a.a.e.b */
/* compiled from: DefaultHttpRequestFactory */
public class C0092b implements C0103e {

    /* renamed from: a */
    private final C0154l f169a;

    /* renamed from: b */
    private C0105g f170b;

    /* renamed from: c */
    private SSLSocketFactory f171c;

    /* renamed from: d */
    private boolean f172d;

    public C0092b() {
        this(new C0139b());
    }

    public C0092b(C0154l lVar) {
        this.f169a = lVar;
    }

    /* renamed from: a */
    public void mo198a(C0105g gVar) {
        if (this.f170b != gVar) {
            this.f170b = gVar;
            m232a();
        }
    }

    /* renamed from: a */
    private synchronized void m232a() {
        this.f172d = false;
        this.f171c = null;
    }

    /* renamed from: a */
    public C0095d mo196a(C0094c cVar, String str) {
        return mo197a(cVar, str, Collections.emptyMap());
    }

    /* renamed from: a */
    public C0095d mo197a(C0094c cVar, String str, Map<String, String> map) {
        C0095d dVar;
        switch (cVar) {
            case GET:
                dVar = C0095d.m240a((CharSequence) str, map, true);
                break;
            case POST:
                dVar = C0095d.m245b((CharSequence) str, map, true);
                break;
            case PUT:
                dVar = C0095d.m248d((CharSequence) str);
                break;
            case DELETE:
                dVar = C0095d.m249e((CharSequence) str);
                break;
            default:
                throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (m233a(str) && this.f170b != null) {
            SSLSocketFactory b = m234b();
            if (b != null) {
                ((HttpsURLConnection) dVar.mo212a()).setSSLSocketFactory(b);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private boolean m233a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }

    /* renamed from: b */
    private synchronized SSLSocketFactory m234b() {
        if (this.f171c == null && !this.f172d) {
            this.f171c = m235c();
        }
        return this.f171c;
    }

    /* renamed from: c */
    private synchronized SSLSocketFactory m235c() {
        SSLSocketFactory a;
        this.f172d = true;
        try {
            a = C0104f.m306a(this.f170b);
            this.f169a.mo283a("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.f169a.mo293e("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a;
    }
}
