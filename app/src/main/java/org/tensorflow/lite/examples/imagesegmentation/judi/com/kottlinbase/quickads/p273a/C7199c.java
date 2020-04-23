package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.quickads.p273a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.C4360b;
import com.google.android.gms.ads.C4367d;
import com.google.android.gms.ads.C4367d.C4368a;
import com.google.android.gms.ads.C4396i;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;
import judi.com.kottlinbase.quickads.C7195a;
import judi.com.kottlinbase.quickads.C7210c;
import p073b.C3218m;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1500u.C1501a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001a\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\bH\u0002J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0002J\b\u0010!\u001a\u00020\bH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0006\u0010$\u001a\u00020\u0011J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J\u0010\u0010'\u001a\u00020#2\u0006\u0010 \u001a\u00020\bH\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010 \u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020#2\u0006\u0010 \u001a\u00020\bH\u0016J\u0018\u0010*\u001a\u00020#2\u0006\u0010 \u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0011H\u0016J\u0010\u0010,\u001a\u00020#2\u0006\u0010 \u001a\u00020\bH\u0016J\u0018\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020#H\u0016J\u0018\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0011H\u0016J \u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0011H\u0016J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020\u0011H\u0002J\b\u00107\u001a\u00020\u0011H\u0002J\u0010\u00108\u001a\u00020#2\u0006\u0010/\u001a\u00020\u000eH\u0016J\u0010\u00108\u001a\u00020#2\u0006\u0010.\u001a\u00020\rH\u0016J\u0010\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020\bH\u0002J\b\u0010;\u001a\u00020#H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006="}, mo10386c = {"Ljudi/com/kottlinbase/quickads/full/AdsWatterfalInteractor;", "Ljudi/com/kottlinbase/quickads/full/AdsListenerWrapper;", "Ljudi/com/kottlinbase/quickads/full/IAdsInteractor;", "Lcom/facebook/ads/InterstitialAdListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adsShowingState", "", "alert", "Ljudi/com/kottlinbase/quickads/AdsLoadingAlert;", "callbackMap", "Ljava/util/LinkedHashMap;", "", "Ljudi/com/kottlinbase/quickads/full/AdsCallback;", "Lkotlin/collections/LinkedHashMap;", "closeAfter", "", "currentLayer", "energyCount", "fanRetryCount", "fbAds", "Lcom/facebook/ads/InterstitialAd;", "googleAds", "Lcom/google/android/gms/ads/InterstitialAd;", "googleRetryCount", "isFanLoading", "pref", "Landroid/content/SharedPreferences;", "getEnergy", "getIdForLayer", "layer", "network", "getNextLayer", "initLoadingAlert", "", "isUseDialog", "loadFAN", "loadGoogle", "onAdClicked", "onAdClosed", "onAdDisplay", "onAdLoadFailed", "noConnect", "onAdLoadSuccess", "registerCallback", "key", "callback", "release", "requestAds", "value", "finishedAfter", "adsNetwork", "sendCallback", "showFAN", "showGoogle", "unregisterCallback", "updateEnergy", "energy", "wakeupAds", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.quickads.a.c */
/* compiled from: AdsWatterfalInteractor.kt */
public final class C7199c extends C7198b implements InterstitialAdListener, C7203d {

    /* renamed from: a */
    public static final C7200a f26311a = new C7200a(null);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f26312o = f26312o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static C7203d f26313p;

    /* renamed from: b */
    private SharedPreferences f26314b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4396i f26315c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public InterstitialAd f26316d;

    /* renamed from: e */
    private Context f26317e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26318f;

    /* renamed from: g */
    private boolean f26319g;

    /* renamed from: h */
    private int f26320h;

    /* renamed from: i */
    private int f26321i;

    /* renamed from: j */
    private boolean f26322j;

    /* renamed from: k */
    private C7210c f26323k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f26324l;

    /* renamed from: m */
    private int f26325m = 1;

    /* renamed from: n */
    private final LinkedHashMap<String, C7197a> f26326n = new LinkedHashMap<>();

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/full/AdsWatterfalInteractor$Companion;", "", "()V", "ENERGY_HIGHT", "", "ENERGY_LOW", "ENERGY_LOW1", "ENERGY_LOW2", "ENERGY_MAX", "ENERGY_MEDIUM", "FB_SHOWING", "GG_SHOWING", "INSTANCE", "Ljudi/com/kottlinbase/quickads/full/IAdsInteractor;", "LAST_LAYER", "NONE", "RETRY_LIMIT", "TAG", "", "getTAG", "()Ljava/lang/String;", "destroy", "", "init", "context", "Landroid/content/Context;", "instance", "app_release"})
    /* renamed from: judi.com.kottlinbase.quickads.a.c$a */
    /* compiled from: AdsWatterfalInteractor.kt */
    public static final class C7200a {
        private C7200a() {
        }

        public /* synthetic */ C7200a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo23215a() {
            return C7199c.f26312o;
        }

        /* renamed from: a */
        public final C7203d mo23216a(Context context) {
            C1489j.m6972b(context, "context");
            if (C7199c.f26313p == null) {
                C7199c.f26313p = new C7199c(context);
            }
            C7203d k = C7199c.f26313p;
            if (k == null) {
                C1489j.m6968a();
            }
            return k;
        }

        /* renamed from: b */
        public final C7203d mo23217b() {
            if (C7199c.f26313p != null) {
                C7203d k = C7199c.f26313p;
                if (k == null) {
                    C1489j.m6968a();
                }
                return k;
            }
            throw new RuntimeException("pleas call init() before access");
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"})
    /* renamed from: judi.com.kottlinbase.quickads.a.c$b */
    /* compiled from: AdsWatterfalInteractor.kt */
    static final class C7201b implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C7199c f26327a;

        /* renamed from: b */
        final /* synthetic */ C1501a f26328b;

        C7201b(C7199c cVar, C1501a aVar) {
            this.f26327a = cVar;
            this.f26328b = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f26328b.f4868a = this.f26327a.f26316d.show();
            this.f26327a.f26324l = 1;
            this.f26327a.f26318f = 0;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"})
    /* renamed from: judi.com.kottlinbase.quickads.a.c$c */
    /* compiled from: AdsWatterfalInteractor.kt */
    static final class C7202c implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C7199c f26329a;

        C7202c(C7199c cVar) {
            this.f26329a = cVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f26329a.f26315c.mo13443d();
        }
    }

    public C7199c(Context context) {
        C1489j.m6972b(context, "context");
        this.f26317e = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ads_data", 0);
        C1489j.m6969a((Object) sharedPreferences, "context.getSharedPrefere…a\", Context.MODE_PRIVATE)");
        this.f26314b = sharedPreferences;
        this.f26316d = new InterstitialAd(context, m38434a(this.f26325m, 2));
        this.f26315c = new C4396i(context);
        this.f26315c.mo13438a(m38434a(this.f26325m, 1));
        this.f26316d.setAdListener(this);
        this.f26315c.mo13434a((C4360b) this);
        this.f26318f = m38448r();
        mo23212g();
    }

    /* renamed from: a */
    public void mo23207a(Context context) {
        C1489j.m6972b(context, "context");
        this.f26323k = new C7210c(context);
    }

    /* renamed from: g */
    public void mo23212g() {
        Log.d(f26312o, ":wakeupAds ");
        if (!this.f26315c.mo13441b() && !this.f26315c.mo13442c()) {
            m38443m();
        }
    }

    /* renamed from: a */
    public void mo23209a(String str, C7197a aVar) {
        C1489j.m6972b(str, "key");
        C1489j.m6972b(aVar, "callback");
        String str2 = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append(":registerCallback ->> ");
        sb.append(str);
        Log.d(str2, sb.toString());
        this.f26326n.put(str, aVar);
    }

    /* renamed from: a */
    public void mo23208a(String str) {
        C1489j.m6972b(str, "key");
        String str2 = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append(":unregisterCallback ->> ");
        sb.append(str);
        Log.d(str2, sb.toString());
        if (this.f26326n.containsKey(str)) {
            this.f26326n.remove(str);
        }
    }

    /* renamed from: b */
    public boolean mo23211b(int i, boolean z) {
        return mo23210a(i, 2, z);
    }

    /* renamed from: a */
    public boolean mo23210a(int i, int i2, boolean z) {
        boolean z2;
        this.f26319g = z;
        this.f26318f += i;
        String str = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append("requestAds en = ");
        sb.append(this.f26318f);
        Log.d(str, sb.toString());
        if (this.f26318f < 100) {
            Log.d(f26312o, ":not enough  energy");
            return false;
        }
        if (m38445o()) {
            z2 = true;
        } else {
            z2 = m38446p();
        }
        return z2;
    }

    /* renamed from: b */
    public void mo23203b(int i) {
        String str = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append(": onAdDisplay ");
        sb.append(i);
        Log.d(str, sb.toString());
        this.f26318f = 0;
    }

    /* renamed from: a */
    public void mo23202a(int i, boolean z) {
        String str = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append(":onAdLoadFailed ");
        sb.append(i);
        sb.append("no Connect ");
        sb.append(z);
        Log.d(str, sb.toString());
        switch (i) {
            case 1:
                if (!z) {
                    this.f26321i++;
                    this.f26325m = m38447q();
                    m38443m();
                    return;
                }
                return;
            case 2:
                if (!z) {
                    this.f26320h++;
                    this.f26322j = false;
                    m38444n();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public void mo23206e(int i) {
        String str = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append("onAdLoadSuccess FAN = 2 Admod = 1 ->>>>: ");
        sb.append(i);
        Log.d(str, sb.toString());
        this.f26325m = 1;
        this.f26321i = 0;
        this.f26320h = 0;
        if (i == 2) {
            this.f26322j = false;
        }
    }

    /* renamed from: c */
    public void mo23204c(int i) {
        String str = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append(": onAdClosed ");
        sb.append(i);
        Log.d(str, sb.toString());
        m38442l();
        this.f26324l = 0;
        this.f26325m = 1;
        m38443m();
    }

    /* renamed from: d */
    public void mo23205d(int i) {
        String str = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append(": onAdClicked ");
        sb.append(i);
        Log.d(str, sb.toString());
    }

    /* renamed from: h */
    public void mo23213h() {
        Log.d(f26312o, "release: ");
        this.f26326n.clear();
        this.f26316d.destroy();
        m38439f(this.f26318f);
    }

    /* renamed from: l */
    private final void m38442l() {
        String str = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append(": sendCallback isClose ->>");
        sb.append(this.f26319g);
        Log.d(str, sb.toString());
        if (!this.f26326n.values().isEmpty()) {
            String str2 = f26312o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(": sendCallback key ->>");
            Set keySet = this.f26326n.keySet();
            C1489j.m6969a((Object) keySet, "callbackMap.keys");
            sb2.append((String) C1415k.m6876d(keySet));
            Log.d(str2, sb2.toString());
            Collection values = this.f26326n.values();
            C1489j.m6969a((Object) values, "callbackMap.values");
            ((C7197a) C1415k.m6876d(values)).mo23201a(this.f26319g);
        }
    }

    /* renamed from: m */
    private final void m38443m() {
        Log.d(f26312o, "loadFAN: ");
        if (this.f26320h >= 4) {
            String str = f26312o;
            StringBuilder sb = new StringBuilder();
            sb.append(": loadFAN: limit retry -> ");
            sb.append(this.f26320h);
            Log.d(str, sb.toString());
            return;
        }
        if (this.f26316d.isAdLoaded() || this.f26322j || this.f26324l == 1) {
            Log.d(f26312o, ":FAN ignore load");
        } else {
            this.f26322j = true;
            String a = m38434a(this.f26325m, 2);
            if (true ^ C1489j.m6971a((Object) a, (Object) this.f26316d.getPlacementId())) {
                this.f26316d.destroy();
                this.f26316d = new InterstitialAd(this.f26317e, a);
                this.f26316d.setAdListener(this);
            }
            this.f26316d.loadAd();
            String str2 = f26312o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("load FAN with id ->> : ");
            sb2.append(a);
            Log.d(str2, sb2.toString());
        }
    }

    /* renamed from: n */
    private final void m38444n() {
        Log.d(f26312o, "loadGoogle: ");
        if (this.f26321i >= 4) {
            String str = f26312o;
            StringBuilder sb = new StringBuilder();
            sb.append(": loadGoogle: limit retry -> ");
            sb.append(this.f26321i);
            Log.d(str, sb.toString());
            return;
        }
        if (this.f26315c.mo13442c() || this.f26315c.mo13441b() || this.f26324l == 2) {
            Log.d(f26312o, ":GÔG ignore load");
        } else {
            C4367d a = new C4368a().mo13303a();
            C1489j.m6969a((Object) a, "AdRequest.Builder().build()");
            String a2 = m38434a(this.f26325m, 1);
            if (true ^ C1489j.m6971a((Object) a2, (Object) this.f26315c.mo13433a())) {
                this.f26315c = new C4396i(this.f26317e);
                this.f26315c.mo13438a(a2);
                this.f26315c.mo13434a((C4360b) this);
            }
            this.f26315c.mo13435a(a);
            String str2 = f26312o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":load google with ID ->> ");
            sb2.append(a2);
            Log.d(str2, sb2.toString());
        }
    }

    /* renamed from: o */
    private final boolean m38445o() {
        if (this.f26316d.isAdLoaded()) {
            C1501a aVar = new C1501a();
            aVar.f4868a = false;
            if (!mo23214i()) {
                aVar.f4868a = this.f26316d.show();
                this.f26324l = 1;
                this.f26318f = 0;
            } else if (this.f26323k != null) {
                C7210c cVar = this.f26323k;
                if (cVar == null) {
                    C1489j.m6968a();
                }
                if (cVar.mo23228a()) {
                    C7210c cVar2 = this.f26323k;
                    if (cVar2 != null) {
                        cVar2.setOnDismissListener(new C7201b(this, aVar));
                    }
                }
            }
            String str = f26312o;
            StringBuilder sb = new StringBuilder();
            sb.append(": showFAN ");
            sb.append(aVar.f4868a);
            Log.d(str, sb.toString());
            return true;
        }
        Log.d(f26312o, ": showFAN false > not load");
        return false;
    }

    /* renamed from: p */
    private final boolean m38446p() {
        if (this.f26315c.mo13441b()) {
            if (!mo23214i()) {
                this.f26315c.mo13443d();
                this.f26324l = 2;
                this.f26318f = 0;
            } else if (this.f26323k != null) {
                C7210c cVar = this.f26323k;
                if (cVar == null) {
                    C1489j.m6968a();
                }
                if (cVar.mo23228a()) {
                    C7210c cVar2 = this.f26323k;
                    if (cVar2 != null) {
                        cVar2.show();
                    }
                    C7210c cVar3 = this.f26323k;
                    if (cVar3 != null) {
                        cVar3.setOnDismissListener(new C7202c(this));
                    }
                    this.f26324l = 2;
                    this.f26318f = 0;
                    Log.d(f26312o, ": showGoogle true");
                }
            }
            return true;
        }
        Log.d(f26312o, ": showGoogle false > not load");
        return false;
    }

    /* renamed from: q */
    private final int m38447q() {
        int i = this.f26325m + 1;
        if (i > 4 || i <= 0) {
            this.f26325m = 4;
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo23214i() {
        float b = C7195a.f26308b.mo23199a().mo23194a().mo23109b();
        if (b == 0.0f) {
            b = 1.0f;
        }
        int nextInt = new Random().nextInt(101);
        String str = f26312o;
        StringBuilder sb = new StringBuilder();
        sb.append("isUseDialog ");
        sb.append(b);
        sb.append(" / ");
        sb.append(nextInt);
        Log.d(str, sb.toString());
        return ((float) nextInt) <= b;
    }

    /* renamed from: a */
    private final String m38434a(int i, int i2) {
        return C7195a.f26308b.mo23199a().mo23196b(i2, i);
    }

    /* renamed from: f */
    private final void m38439f(int i) {
        Editor edit = this.f26314b.edit();
        edit.putInt("ads_energy_count", i);
        edit.apply();
    }

    /* renamed from: r */
    private final int m38448r() {
        return this.f26314b.getInt("ads_energy_count", 50);
    }
}
