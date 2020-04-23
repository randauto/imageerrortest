package org.tensorflow.lite.examples.imagesegmentation.judi.com.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import judi.com.service.DetectorService.C7362c;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo10386c = {"Ljudi/com/service/DetectorManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connection", "Landroid/content/ServiceConnection;", "detectService", "Ljudi/com/service/IDetectorService;", "isConnected", "", "listenner", "Ljudi/com/service/DetectorManager$DetectorListenner;", "connect", "", "disconnect", "register", "l", "startDetect", "pathInput", "", "config", "Ljudi/com/service/Config;", "stopDetect", "unregister", "DetectorCallback", "DetectorListenner", "bgremover_release"})
/* renamed from: judi.com.service.c */
/* compiled from: DetectorManager.kt */
public final class C7365c {

    /* renamed from: a */
    private final Context f26717a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7371e f26718b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f26719c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C7367b f26720d;

    /* renamed from: e */
    private final ServiceConnection f26721e = new C7368c(this);

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, mo10386c = {"Ljudi/com/service/DetectorManager$DetectorCallback;", "", "onError", "", "errorCode", "", "mess", "", "onResult", "resultFolder", "bgremover_release"})
    /* renamed from: judi.com.service.c$a */
    /* compiled from: DetectorManager.kt */
    public interface C7366a {
        /* renamed from: a */
        void mo23464a(int i, String str);

        /* renamed from: a */
        void mo23465a(String str);
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, mo10386c = {"Ljudi/com/service/DetectorManager$DetectorListenner;", "", "onDetectorFinished", "", "resultFolder", "", "onDetectorOffline", "onDetectorOnline", "onError", "errorCode", "", "mess", "bgremover_release"})
    /* renamed from: judi.com.service.c$b */
    /* compiled from: DetectorManager.kt */
    public interface C7367b {
        /* renamed from: a */
        void mo23306a(int i, String str);

        /* renamed from: a */
        void mo23307a(String str);

        /* renamed from: w */
        void mo23316w();

        /* renamed from: x */
        void mo23317x();
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo10386c = {"judi/com/service/DetectorManager$connection$1", "Landroid/content/ServiceConnection;", "onServiceConnected", "", "className", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "arg0", "bgremover_release"})
    /* renamed from: judi.com.service.c$c */
    /* compiled from: DetectorManager.kt */
    public static final class C7368c implements ServiceConnection {

        /* renamed from: a */
        final /* synthetic */ C7365c f26722a;

        C7368c(C7365c cVar) {
            this.f26722a = cVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1489j.m6972b(componentName, "className");
            C1489j.m6972b(iBinder, "service");
            this.f26722a.f26718b = ((C7362c) iBinder).mo23452a();
            try {
                C7371e b = this.f26722a.f26718b;
                if (b == null) {
                    C1489j.m6968a();
                }
                b.mo23446a();
                this.f26722a.f26719c = true;
                C7367b a = this.f26722a.f26720d;
                if (a != null) {
                    a.mo23316w();
                }
            } catch (Exception e) {
                C7367b a2 = this.f26722a.f26720d;
                if (a2 != null) {
                    a2.mo23306a(999, e.toString());
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1489j.m6972b(componentName, "arg0");
            this.f26722a.f26719c = false;
            this.f26722a.f26718b = null;
            C7367b a = this.f26722a.f26720d;
            if (a != null) {
                a.mo23317x();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, mo10386c = {"judi/com/service/DetectorManager$startDetect$1", "Ljudi/com/service/DetectorManager$DetectorCallback;", "onError", "", "errorCode", "", "mess", "", "onResult", "resultFolder", "bgremover_release"})
    /* renamed from: judi.com.service.c$d */
    /* compiled from: DetectorManager.kt */
    public static final class C7369d implements C7366a {

        /* renamed from: a */
        final /* synthetic */ C7365c f26723a;

        C7369d(C7365c cVar) {
            this.f26723a = cVar;
        }

        /* renamed from: a */
        public void mo23464a(int i, String str) {
            C1489j.m6972b(str, "mess");
            C7367b a = this.f26723a.f26720d;
            if (a != null) {
                a.mo23306a(i, str);
            }
        }

        /* renamed from: a */
        public void mo23465a(String str) {
            C1489j.m6972b(str, "resultFolder");
            C7367b a = this.f26723a.f26720d;
            if (a != null) {
                a.mo23307a(str);
            }
        }
    }

    public C7365c(Context context) {
        C1489j.m6972b(context, "context");
        this.f26717a = context;
    }

    /* renamed from: a */
    public final void mo23460a(String str, Config aVar) {
        C1489j.m6972b(str, "pathInput");
        C1489j.m6972b(aVar, "config");
        C7371e eVar = this.f26718b;
        if (eVar != null) {
            eVar.mo23447a(str, aVar, new C7369d(this));
        }
    }

    /* renamed from: a */
    public final void mo23459a() {
        this.f26717a.bindService(new Intent(this.f26717a, DetectorService.class), this.f26721e, 1);
    }

    /* renamed from: b */
    public final void mo23462b() {
        if (this.f26719c) {
            if (this.f26720d != null) {
                mo23463c();
            }
            this.f26717a.unbindService(this.f26721e);
            this.f26719c = false;
        }
    }

    /* renamed from: a */
    public final void mo23461a(C7367b bVar) {
        C1489j.m6972b(bVar, "l");
        this.f26720d = bVar;
    }

    /* renamed from: c */
    public final void mo23463c() {
        this.f26720d = null;
    }
}
