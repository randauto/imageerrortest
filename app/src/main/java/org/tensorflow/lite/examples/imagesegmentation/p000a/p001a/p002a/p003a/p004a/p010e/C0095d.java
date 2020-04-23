package p000a.p001a.p002a.p003a.p004a.p010e;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

/* renamed from: a.a.a.a.a.e.d */
/* compiled from: HttpRequest */
public class C0095d {

    /* renamed from: b */
    private static final String[] f179b = new String[0];

    /* renamed from: c */
    private static C0098b f180c = C0098b.f196a;

    /* renamed from: a */
    public final URL f181a;

    /* renamed from: d */
    private HttpURLConnection f182d = null;

    /* renamed from: e */
    private final String f183e;

    /* renamed from: f */
    private C0102e f184f;

    /* renamed from: g */
    private boolean f185g;

    /* renamed from: h */
    private boolean f186h = true;

    /* renamed from: i */
    private boolean f187i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f188j = 8192;

    /* renamed from: k */
    private String f189k;

    /* renamed from: l */
    private int f190l;

    /* renamed from: a.a.a.a.a.e.d$a */
    /* compiled from: HttpRequest */
    protected static abstract class C0097a<V> extends C0101d<V> {

        /* renamed from: a */
        private final Closeable f194a;

        /* renamed from: b */
        private final boolean f195b;

        protected C0097a(Closeable closeable, boolean z) {
            this.f194a = closeable;
            this.f195b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo240c() {
            if (this.f194a instanceof Flushable) {
                ((Flushable) this.f194a).flush();
            }
            if (this.f195b) {
                try {
                    this.f194a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f194a.close();
            }
        }
    }

    /* renamed from: a.a.a.a.a.e.d$b */
    /* compiled from: HttpRequest */
    public interface C0098b {

        /* renamed from: a */
        public static final C0098b f196a = new C0098b() {
            /* renamed from: a */
            public HttpURLConnection mo241a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }

            /* renamed from: a */
            public HttpURLConnection mo242a(URL url, Proxy proxy) {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        /* renamed from: a */
        HttpURLConnection mo241a(URL url);

        /* renamed from: a */
        HttpURLConnection mo242a(URL url, Proxy proxy);
    }

    /* renamed from: a.a.a.a.a.e.d$c */
    /* compiled from: HttpRequest */
    public static class C0100c extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        protected C0100c(IOException iOException) {
            super(iOException);
        }

        /* renamed from: a */
        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: a.a.a.a.a.e.d$d */
    /* compiled from: HttpRequest */
    protected static abstract class C0101d<V> implements Callable<V> {
        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract V mo239b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo240c();

        protected C0101d() {
        }

        public V call() {
            boolean z = true;
            try {
                V b = mo239b();
                try {
                    mo240c();
                    return b;
                } catch (IOException e) {
                    throw new C0100c(e);
                }
            } catch (C0100c e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C0100c(e3);
            } catch (Throwable th) {
                th = th;
                mo240c();
                throw th;
            }
        }
    }

    /* renamed from: a.a.a.a.a.e.d$e */
    /* compiled from: HttpRequest */
    public static class C0102e extends BufferedOutputStream {

        /* renamed from: a */
        private final CharsetEncoder f197a;

        public C0102e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f197a = Charset.forName(C0095d.m251f(str)).newEncoder();
        }

        /* renamed from: a */
        public C0102e mo246a(String str) {
            ByteBuffer encode = this.f197a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m251f(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    /* renamed from: a */
    private static StringBuilder m243a(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    /* renamed from: b */
    private static StringBuilder m246b(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append('&');
        }
        return sb;
    }

    /* renamed from: a */
    public static String m241a(CharSequence charSequence) {
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(':');
                sb.append(Integer.toString(port));
                host = sb.toString();
            }
            try {
                URI uri = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), url.getRef());
                String aSCIIString = uri.toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0) {
                    return aSCIIString;
                }
                int i = indexOf + 1;
                if (i >= aSCIIString.length()) {
                    return aSCIIString;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aSCIIString.substring(0, i));
                sb2.append(aSCIIString.substring(i).replace("+", "%2B").replace("#", "%23"));
                return sb2.toString();
            } catch (URISyntaxException e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new C0100c(iOException);
            }
        } catch (IOException e2) {
            throw new C0100c(e2);
        }
    }

    /* renamed from: a */
    public static String m242a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        m243a(charSequence2, sb);
        m246b(charSequence2, sb);
        Iterator it = map.entrySet().iterator();
        Entry entry = (Entry) it.next();
        sb.append(entry.getKey().toString());
        sb.append('=');
        Object value = entry.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it.hasNext()) {
            sb.append('&');
            Entry entry2 = (Entry) it.next();
            sb.append(entry2.getKey().toString());
            sb.append('=');
            Object value2 = entry2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static C0095d m244b(CharSequence charSequence) {
        return new C0095d(charSequence, "GET");
    }

    /* renamed from: a */
    public static C0095d m240a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a = m242a(charSequence, map);
        if (z) {
            a = m241a((CharSequence) a);
        }
        return m244b((CharSequence) a);
    }

    /* renamed from: c */
    public static C0095d m247c(CharSequence charSequence) {
        return new C0095d(charSequence, "POST");
    }

    /* renamed from: b */
    public static C0095d m245b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a = m242a(charSequence, map);
        if (z) {
            a = m241a((CharSequence) a);
        }
        return m247c((CharSequence) a);
    }

    /* renamed from: d */
    public static C0095d m248d(CharSequence charSequence) {
        return new C0095d(charSequence, "PUT");
    }

    /* renamed from: e */
    public static C0095d m249e(CharSequence charSequence) {
        return new C0095d(charSequence, "DELETE");
    }

    public C0095d(CharSequence charSequence, String str) {
        try {
            this.f181a = new URL(charSequence.toString());
            this.f183e = str;
        } catch (MalformedURLException e) {
            throw new C0100c(e);
        }
    }

    /* renamed from: p */
    private Proxy m252p() {
        return new Proxy(Type.HTTP, new InetSocketAddress(this.f189k, this.f190l));
    }

    /* renamed from: q */
    private HttpURLConnection m253q() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.f189k != null) {
                httpURLConnection = f180c.mo242a(this.f181a, m252p());
            } else {
                httpURLConnection = f180c.mo241a(this.f181a);
            }
            httpURLConnection.setRequestMethod(this.f183e);
            return httpURLConnection;
        } catch (IOException e) {
            throw new C0100c(e);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo236o());
        sb.append(' ');
        sb.append(mo235n());
        return sb.toString();
    }

    /* renamed from: a */
    public HttpURLConnection mo212a() {
        if (this.f182d == null) {
            this.f182d = m253q();
        }
        return this.f182d;
    }

    /* renamed from: b */
    public int mo213b() {
        try {
            mo231j();
            return mo212a().getResponseCode();
        } catch (IOException e) {
            throw new C0100c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ByteArrayOutputStream mo218c() {
        int i = mo230i();
        if (i > 0) {
            return new ByteArrayOutputStream(i);
        }
        return new ByteArrayOutputStream();
    }

    /* renamed from: a */
    public String mo211a(String str) {
        ByteArrayOutputStream c = mo218c();
        try {
            mo201a((InputStream) mo224e(), (OutputStream) c);
            return c.toString(m251f(str));
        } catch (IOException e) {
            throw new C0100c(e);
        }
    }

    /* renamed from: d */
    public String mo222d() {
        return mo211a(mo228g());
    }

    /* renamed from: e */
    public BufferedInputStream mo224e() {
        return new BufferedInputStream(mo227f(), this.f188j);
    }

    /* renamed from: f */
    public InputStream mo227f() {
        InputStream inputStream;
        if (mo213b() < 400) {
            try {
                inputStream = mo212a().getInputStream();
            } catch (IOException e) {
                throw new C0100c(e);
            }
        } else {
            inputStream = mo212a().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = mo212a().getInputStream();
                } catch (IOException e2) {
                    throw new C0100c(e2);
                }
            }
        }
        if (!this.f187i || !"gzip".equals(mo229h())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e3) {
            throw new C0100c(e3);
        }
    }

    /* renamed from: a */
    public C0095d mo200a(int i) {
        mo212a().setConnectTimeout(i);
        return this;
    }

    /* renamed from: a */
    public C0095d mo203a(String str, String str2) {
        mo212a().setRequestProperty(str, str2);
        return this;
    }

    /* renamed from: a */
    public C0095d mo209a(Entry<String, String> entry) {
        return mo203a((String) entry.getKey(), (String) entry.getValue());
    }

    /* renamed from: b */
    public String mo215b(String str) {
        mo232k();
        return mo212a().getHeaderField(str);
    }

    /* renamed from: c */
    public int mo217c(String str) {
        return mo199a(str, -1);
    }

    /* renamed from: a */
    public int mo199a(String str, int i) {
        mo232k();
        return mo212a().getHeaderFieldInt(str, i);
    }

    /* renamed from: b */
    public String mo216b(String str, String str2) {
        return mo219c(mo215b(str), str2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    /* renamed from: c */
    protected java.lang.String mo219c(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0071
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x0071
        L_0x000a:
            int r1 = r9.length()
            r2 = 59
            int r3 = r9.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x0070
            if (r3 != r1) goto L_0x001b
            goto L_0x0070
        L_0x001b:
            int r5 = r9.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r9.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r9.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r9.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r9 = 2
            if (r7 <= r9) goto L_0x0065
            r9 = 0
            char r9 = r3.charAt(r9)
            r10 = 34
            if (r10 != r9) goto L_0x0065
            int r7 = r7 - r4
            char r9 = r3.charAt(r7)
            if (r10 != r9) goto L_0x0065
            java.lang.String r9 = r3.substring(r4, r7)
            return r9
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r9.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        L_0x0070:
            return r0
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p010e.C0095d.mo219c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    public String mo228g() {
        return mo216b("Content-Type", "charset");
    }

    /* renamed from: a */
    public C0095d mo210a(boolean z) {
        mo212a().setUseCaches(z);
        return this;
    }

    /* renamed from: h */
    public String mo229h() {
        return mo215b("Content-Encoding");
    }

    /* renamed from: d */
    public C0095d mo220d(String str) {
        return mo221d(str, null);
    }

    /* renamed from: d */
    public C0095d mo221d(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return mo203a("Content-Type", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; charset=");
        sb.append(str2);
        return mo203a("Content-Type", sb.toString());
    }

    /* renamed from: i */
    public int mo230i() {
        return mo217c("Content-Length");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0095d mo201a(InputStream inputStream, OutputStream outputStream) {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        C00961 r0 = new C0097a<C0095d>(inputStream, this.f186h) {
            /* renamed from: a */
            public C0095d mo239b() {
                byte[] bArr = new byte[C0095d.this.f188j];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return C0095d.this;
                    }
                    outputStream2.write(bArr, 0, read);
                }
            }
        };
        return (C0095d) r0.call();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0095d mo231j() {
        if (this.f184f == null) {
            return this;
        }
        if (this.f185g) {
            this.f184f.mo246a("\r\n--00content0boundary00--\r\n");
        }
        if (this.f186h) {
            try {
                this.f184f.close();
            } catch (IOException unused) {
            }
        } else {
            this.f184f.close();
        }
        this.f184f = null;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0095d mo232k() {
        try {
            return mo231j();
        } catch (IOException e) {
            throw new C0100c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0095d mo233l() {
        if (this.f184f != null) {
            return this;
        }
        mo212a().setDoOutput(true);
        this.f184f = new C0102e(mo212a().getOutputStream(), mo219c(mo212a().getRequestProperty("Content-Type"), "charset"), this.f188j);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0095d mo234m() {
        if (!this.f185g) {
            this.f185g = true;
            mo220d("multipart/form-data; boundary=00content0boundary00").mo233l();
            this.f184f.mo246a("--00content0boundary00\r\n");
        } else {
            this.f184f.mo246a("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0095d mo205a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        mo226f("Content-Disposition", sb.toString());
        if (str3 != null) {
            mo226f("Content-Type", str3);
        }
        return mo225f((CharSequence) "\r\n");
    }

    /* renamed from: e */
    public C0095d mo223e(String str, String str2) {
        return mo214b(str, (String) null, str2);
    }

    /* renamed from: b */
    public C0095d mo214b(String str, String str2, String str3) {
        return mo208a(str, str2, (String) null, str3);
    }

    /* renamed from: a */
    public C0095d mo208a(String str, String str2, String str3, String str4) {
        try {
            mo234m();
            mo205a(str, str2, str3);
            this.f184f.mo246a(str4);
            return this;
        } catch (IOException e) {
            throw new C0100c(e);
        }
    }

    /* renamed from: a */
    public C0095d mo202a(String str, Number number) {
        return mo204a(str, (String) null, number);
    }

    /* renamed from: a */
    public C0095d mo204a(String str, String str2, Number number) {
        return mo214b(str, str2, number != null ? number.toString() : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A[SYNTHETIC, Splitter:B:19:0x0024] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000a.p001a.p002a.p003a.p004a.p010e.C0095d mo206a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001b }
            r2.<init>(r7)     // Catch:{ IOException -> 0x001b }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001b }
            a.a.a.a.a.e.d r4 = r3.mo207a(r4, r5, r6, r1)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r4
        L_0x0013:
            r4 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x0016:
            r4 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
        L_0x001c:
            a.a.a.a.a.e.d$c r5 = new a.a.a.a.a.e.d$c     // Catch:{ all -> 0x0019 }
            r5.<init>(r4)     // Catch:{ all -> 0x0019 }
            throw r5     // Catch:{ all -> 0x0019 }
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p010e.C0095d.mo206a(java.lang.String, java.lang.String, java.lang.String, java.io.File):a.a.a.a.a.e.d");
    }

    /* renamed from: a */
    public C0095d mo207a(String str, String str2, String str3, InputStream inputStream) {
        try {
            mo234m();
            mo205a(str, str2, str3);
            mo201a(inputStream, (OutputStream) this.f184f);
            return this;
        } catch (IOException e) {
            throw new C0100c(e);
        }
    }

    /* renamed from: f */
    public C0095d mo226f(String str, String str2) {
        return mo225f((CharSequence) str).mo225f((CharSequence) ": ").mo225f((CharSequence) str2).mo225f((CharSequence) "\r\n");
    }

    /* renamed from: f */
    public C0095d mo225f(CharSequence charSequence) {
        try {
            mo233l();
            this.f184f.mo246a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new C0100c(e);
        }
    }

    /* renamed from: n */
    public URL mo235n() {
        return mo212a().getURL();
    }

    /* renamed from: o */
    public String mo236o() {
        return mo212a().getRequestMethod();
    }
}
