package p000a.p001a.p002a.p003a.p004a.p012g;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p000a.p001a.p002a.p003a.C0140c;
import p000a.p001a.p002a.p003a.C0151i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0018g;
import p000a.p001a.p002a.p003a.p004a.p006b.C0020i;
import p000a.p001a.p002a.p003a.p004a.p006b.C0027l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0028m;
import p000a.p001a.p002a.p003a.p004a.p006b.C0037s;
import p000a.p001a.p002a.p003a.p004a.p006b.C0047w;
import p000a.p001a.p002a.p003a.p004a.p010e.C0103e;

/* renamed from: a.a.a.a.a.g.q */
/* compiled from: Settings */
public class C0128q {

    /* renamed from: a */
    private final AtomicReference<C0133t> f278a;

    /* renamed from: b */
    private final CountDownLatch f279b;

    /* renamed from: c */
    private C0132s f280c;

    /* renamed from: d */
    private boolean f281d;

    /* renamed from: a.a.a.a.a.g.q$a */
    /* compiled from: Settings */
    static class C0130a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C0128q f282a = new C0128q();
    }

    /* renamed from: a */
    public static C0128q m360a() {
        return C0130a.f282a;
    }

    private C0128q() {
        this.f278a = new AtomicReference<>();
        this.f279b = new CountDownLatch(1);
        this.f281d = false;
    }

    /* renamed from: a */
    public synchronized C0128q mo276a(C0151i iVar, C0037s sVar, C0103e eVar, String str, String str2, String str3, C0027l lVar) {
        C0151i iVar2 = iVar;
        synchronized (this) {
            if (this.f281d) {
                return this;
            }
            if (this.f280c == null) {
                Context context = iVar.getContext();
                String c = sVar.mo67c();
                String a = new C0018g().mo40a(context);
                String i = sVar.mo73i();
                C0047w wVar = new C0047w();
                C0122k kVar = new C0122k();
                C0120i iVar3 = new C0120i(iVar2);
                String k = C0020i.m80k(context);
                String str4 = str3;
                C0123l lVar2 = new C0123l(iVar2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{c}), eVar);
                String g = sVar.mo71g();
                String str5 = g;
                String str6 = str2;
                String str7 = str;
                C0136w wVar2 = new C0136w(a, str5, sVar.mo70f(), sVar.mo69e(), sVar.mo66b(), C0020i.m53a(C0020i.m82m(context)), str6, str7, C0028m.m94a(i).mo54a(), k);
                C0121j jVar = new C0121j(iVar, wVar2, wVar, kVar, iVar3, lVar2, lVar);
                this.f280c = jVar;
            }
            this.f281d = true;
            return this;
        }
    }

    /* renamed from: b */
    public C0133t mo277b() {
        try {
            this.f279b.await();
            return (C0133t) this.f278a.get();
        } catch (InterruptedException unused) {
            C0140c.m397g().mo292e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    /* renamed from: c */
    public synchronized boolean mo278c() {
        C0133t a;
        a = this.f280c.mo266a();
        m361a(a);
        return a != null;
    }

    /* renamed from: d */
    public synchronized boolean mo279d() {
        C0133t a;
        a = this.f280c.mo267a(C0131r.SKIP_CACHE_LOOKUP);
        m361a(a);
        if (a == null) {
            C0140c.m397g().mo293e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a != null;
    }

    /* renamed from: a */
    private void m361a(C0133t tVar) {
        this.f278a.set(tVar);
        this.f279b.countDown();
    }
}
