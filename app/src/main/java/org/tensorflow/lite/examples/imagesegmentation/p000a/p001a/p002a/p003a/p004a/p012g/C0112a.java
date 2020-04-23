package p000a.p001a.p002a.p003a.p004a.p012g;

import java.util.Locale;
import p000a.p001a.p002a.p003a.C0140c;
import p000a.p001a.p002a.p003a.C0151i;
import p000a.p001a.p002a.p003a.C0153k;
import p000a.p001a.p002a.p003a.p004a.p006b.C0008a;
import p000a.p001a.p002a.p003a.p004a.p006b.C0046v;
import p000a.p001a.p002a.p003a.p004a.p010e.C0094c;
import p000a.p001a.p002a.p003a.p004a.p010e.C0095d;
import p000a.p001a.p002a.p003a.p004a.p010e.C0103e;

/* renamed from: a.a.a.a.a.g.a */
/* compiled from: AbstractAppSpiCall */
abstract class C0112a extends C0008a {
    public C0112a(C0151i iVar, String str, String str2, C0103e eVar, C0094c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    /* renamed from: a */
    public boolean mo262a(C0115d dVar) {
        C0095d b = m326b(m325a(getHttpRequest(), dVar), dVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Sending app info to ");
        sb.append(getUrl());
        C0140c.m397g().mo283a("Fabric", sb.toString());
        if (dVar.f235j != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("App icon hash is ");
            sb2.append(dVar.f235j.f260a);
            C0140c.m397g().mo283a("Fabric", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("App icon size is ");
            sb3.append(dVar.f235j.f262c);
            sb3.append("x");
            sb3.append(dVar.f235j.f263d);
            C0140c.m397g().mo283a("Fabric", sb3.toString());
        }
        int b2 = b.mo213b();
        String str = "POST".equals(b.mo236o()) ? "Create" : "Update";
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(" app request ID: ");
        sb4.append(b.mo215b(C0008a.HEADER_REQUEST_ID));
        C0140c.m397g().mo283a("Fabric", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Result was ");
        sb5.append(b2);
        C0140c.m397g().mo283a("Fabric", sb5.toString());
        return C0046v.m158a(b2) == 0;
    }

    /* renamed from: a */
    private C0095d m325a(C0095d dVar, C0115d dVar2) {
        return dVar.mo203a(C0008a.HEADER_API_KEY, dVar2.f226a).mo203a(C0008a.HEADER_CLIENT_TYPE, C0008a.ANDROID_CLIENT_TYPE).mo203a(C0008a.HEADER_CLIENT_VERSION, this.kit.getVersion());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p000a.p001a.p002a.p003a.p004a.p010e.C0095d m326b(p000a.p001a.p002a.p003a.p004a.p010e.C0095d r8, p000a.p001a.p002a.p003a.p004a.p012g.C0115d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "app[identifier]"
            java.lang.String r1 = r9.f227b
            a.a.a.a.a.e.d r8 = r8.mo223e(r0, r1)
            java.lang.String r0 = "app[name]"
            java.lang.String r1 = r9.f231f
            a.a.a.a.a.e.d r8 = r8.mo223e(r0, r1)
            java.lang.String r0 = "app[display_version]"
            java.lang.String r1 = r9.f228c
            a.a.a.a.a.e.d r8 = r8.mo223e(r0, r1)
            java.lang.String r0 = "app[build_version]"
            java.lang.String r1 = r9.f229d
            a.a.a.a.a.e.d r8 = r8.mo223e(r0, r1)
            java.lang.String r0 = "app[source]"
            int r1 = r9.f232g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            a.a.a.a.a.e.d r8 = r8.mo202a(r0, r1)
            java.lang.String r0 = "app[minimum_sdk_version]"
            java.lang.String r1 = r9.f233h
            a.a.a.a.a.e.d r8 = r8.mo223e(r0, r1)
            java.lang.String r0 = "app[built_sdk_version]"
            java.lang.String r1 = r9.f234i
            a.a.a.a.a.e.d r8 = r8.mo223e(r0, r1)
            java.lang.String r0 = r9.f230e
            boolean r0 = p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m73d(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "app[instance_identifier]"
            java.lang.String r1 = r9.f230e
            r8.mo223e(r0, r1)
        L_0x004b:
            a.a.a.a.a.g.n r0 = r9.f235j
            if (r0 == 0) goto L_0x00c6
            r0 = 0
            a.a.a.a.i r1 = r7.kit     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            a.a.a.a.a.g.n r2 = r9.f235j     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            int r2 = r2.f261b     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            java.lang.String r0 = "app[icon][hash]"
            a.a.a.a.a.g.n r2 = r9.f235j     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r2 = r2.f260a     // Catch:{ NotFoundException -> 0x0092 }
            a.a.a.a.a.e.d r0 = r8.mo223e(r0, r2)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r2 = "app[icon][data]"
            java.lang.String r3 = "icon.png"
            java.lang.String r4 = "application/octet-stream"
            a.a.a.a.a.e.d r0 = r0.mo207a(r2, r3, r4, r1)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r2 = "app[icon][width]"
            a.a.a.a.a.g.n r3 = r9.f235j     // Catch:{ NotFoundException -> 0x0092 }
            int r3 = r3.f262c     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NotFoundException -> 0x0092 }
            a.a.a.a.a.e.d r0 = r0.mo202a(r2, r3)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r2 = "app[icon][height]"
            a.a.a.a.a.g.n r3 = r9.f235j     // Catch:{ NotFoundException -> 0x0092 }
            int r3 = r3.f263d     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NotFoundException -> 0x0092 }
            r0.mo202a(r2, r3)     // Catch:{ NotFoundException -> 0x0092 }
            goto L_0x00b9
        L_0x0092:
            r0 = move-exception
            goto L_0x009b
        L_0x0094:
            r8 = move-exception
            r1 = r0
            goto L_0x00c0
        L_0x0097:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x009b:
            a.a.a.a.l r2 = p000a.p001a.p002a.p003a.C0140c.m397g()     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = "Fabric"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r4.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "Failed to find app icon with resource ID: "
            r4.append(r5)     // Catch:{ all -> 0x00bf }
            a.a.a.a.a.g.n r5 = r9.f235j     // Catch:{ all -> 0x00bf }
            int r5 = r5.f261b     // Catch:{ all -> 0x00bf }
            r4.append(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00bf }
            r2.mo293e(r3, r4, r0)     // Catch:{ all -> 0x00bf }
        L_0x00b9:
            java.lang.String r0 = "Failed to close app icon InputStream."
            p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m58a(r1, r0)
            goto L_0x00c6
        L_0x00bf:
            r8 = move-exception
        L_0x00c0:
            java.lang.String r9 = "Failed to close app icon InputStream."
            p000a.p001a.p002a.p003a.p004a.p006b.C0020i.m58a(r1, r9)
            throw r8
        L_0x00c6:
            java.util.Collection<a.a.a.a.k> r0 = r9.f236k
            if (r0 == 0) goto L_0x00f3
            java.util.Collection<a.a.a.a.k> r9 = r9.f236k
            java.util.Iterator r9 = r9.iterator()
        L_0x00d0:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r9.next()
            a.a.a.a.k r0 = (p000a.p001a.p002a.p003a.C0153k) r0
            java.lang.String r1 = r7.mo261a(r0)
            java.lang.String r2 = r0.mo339b()
            r8.mo223e(r1, r2)
            java.lang.String r1 = r7.mo263b(r0)
            java.lang.String r0 = r0.mo340c()
            r8.mo223e(r1, r0)
            goto L_0x00d0
        L_0x00f3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p001a.p002a.p003a.p004a.p012g.C0112a.m326b(a.a.a.a.a.e.d, a.a.a.a.a.g.d):a.a.a.a.a.e.d");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo261a(C0153k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{kVar.mo338a()});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo263b(C0153k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{kVar.mo338a()});
    }
}
