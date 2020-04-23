package p000a.p001a.p002a.p003a.p004a.p010e;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: a.a.a.a.a.e.f */
/* compiled from: NetworkUtils */
public final class C0104f {
    /* renamed from: a */
    public static final SSLSocketFactory m306a(C0105g gVar) {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, new TrustManager[]{new C0106h(new C0107i(gVar.getKeyStoreStream(), gVar.getKeyStorePassword()), gVar)}, null);
        return instance.getSocketFactory();
    }
}
