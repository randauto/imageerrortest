package p000a.p001a.p002a.p003a.p004a.p010e;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p000a.p001a.p002a.p003a.C0140c;

/* renamed from: a.a.a.a.a.e.h */
/* compiled from: PinningTrustManager */
class C0106h implements X509TrustManager {

    /* renamed from: a */
    private static final X509Certificate[] f198a = new X509Certificate[0];

    /* renamed from: b */
    private final TrustManager[] f199b;

    /* renamed from: c */
    private final C0107i f200c;

    /* renamed from: d */
    private final long f201d;

    /* renamed from: e */
    private final List<byte[]> f202e = new LinkedList();

    /* renamed from: f */
    private final Set<X509Certificate> f203f = Collections.synchronizedSet(new HashSet());

    public C0106h(C0107i iVar, C0105g gVar) {
        this.f199b = m311a(iVar);
        this.f200c = iVar;
        this.f201d = gVar.getPinCreationTimeInMillis();
        for (String a : gVar.getPins()) {
            this.f202e.add(m310a(a));
        }
    }

    /* renamed from: a */
    private TrustManager[] m311a(C0107i iVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(iVar.f204a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    private boolean m309a(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f202e) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new CertificateException(e);
        }
    }

    /* renamed from: a */
    private void m308a(X509Certificate[] x509CertificateArr, String str) {
        for (TrustManager trustManager : this.f199b) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private void m307a(X509Certificate[] x509CertificateArr) {
        if (this.f201d == -1 || System.currentTimeMillis() - this.f201d <= 15552000000L) {
            X509Certificate[] a = C0091a.m231a(x509CertificateArr, this.f200c);
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m309a(a[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pins are stale, (");
        sb.append(System.currentTimeMillis() - this.f201d);
        sb.append(" millis vs ");
        sb.append(15552000000L);
        sb.append(" millis) falling back to system trust.");
        C0140c.m397g().mo290d("Fabric", sb.toString());
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.f203f.contains(x509CertificateArr[0])) {
            m308a(x509CertificateArr, str);
            m307a(x509CertificateArr);
            this.f203f.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f198a;
    }

    /* renamed from: a */
    private byte[] m310a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
