package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import butterknife.OnClick;
import com.google.android.gms.p208d.C4739g;
import com.google.firebase.remoteconfig.C6792a;
import com.google.firebase.remoteconfig.C6797f;
import com.google.firebase.remoteconfig.C6798g;
import com.google.firebase.remoteconfig.C6798g.C6799a;
import com.hanks.htextview.p239a.C6809a;
import com.hanks.htextview.p239a.C6815f;
import com.hanks.htextview.scale.ScaleTextView;
import com.judi.emojiphoto.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import judi.com.C7139a;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.home.HomeActivity;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7223a;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7224b;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0007J\b\u0010\u0017\u001a\u00020\rH\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX.¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001b"}, mo10386c = {"Ljudi/com/kottlinbase/ui/splash/SplashActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Lcom/hanks/htextview/base/AnimationListener;", "()V", "currentPos", "", "splashMessage", "", "", "[Ljava/lang/String;", "createPresenter", "fetchRemoteConfig", "", "getLayoutId", "gotoMainScreen", "onAdsClose", "finished", "", "onAnimationEnd", "hTextView", "Lcom/hanks/htextview/base/HTextView;", "onGotoHomeClick", "onInit", "verifyInstallerId", "context", "Landroid/content/Context;", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.splash.SplashActivity */
/* compiled from: SplashActivity.kt */
public final class SplashActivity extends C7218a<C7271c<?>> implements C6809a {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String[] f26663l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f26664m;

    /* renamed from: n */
    private HashMap f26665n;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onSuccess"})
    /* renamed from: judi.com.kottlinbase.ui.splash.SplashActivity$a */
    /* compiled from: SplashActivity.kt */
    static final class C7347a<TResult> implements C4739g<Void> {

        /* renamed from: a */
        final /* synthetic */ C6792a f26666a;

        C7347a(C6792a aVar) {
            this.f26666a = aVar;
        }

        /* renamed from: a */
        public final void mo14130a(Void voidR) {
            Log.d(SplashActivity.class.getSimpleName(), "fetchRemoteConfig success");
            this.f26666a.mo21371b();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/splash/SplashActivity$gotoMainScreen$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.splash.SplashActivity$b */
    /* compiled from: SplashActivity.kt */
    public static final class C7348b implements C7224b {

        /* renamed from: a */
        final /* synthetic */ SplashActivity f26667a;

        C7348b(SplashActivity splashActivity) {
            this.f26667a = splashActivity;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            this.f26667a.startActivity(new Intent(this.f26667a, HomeActivity.class));
            this.f26667a.finish();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/splash/SplashActivity$gotoMainScreen$2", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.splash.SplashActivity$c */
    /* compiled from: SplashActivity.kt */
    public static final class C7349c implements C7224b {

        /* renamed from: a */
        final /* synthetic */ SplashActivity f26668a;

        C7349c(SplashActivity splashActivity) {
            this.f26668a = splashActivity;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            this.f26668a.mo23259v();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo10386c = {"judi/com/kottlinbase/ui/splash/SplashActivity$onInit$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.splash.SplashActivity$d */
    /* compiled from: SplashActivity.kt */
    public static final class C7350d implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ SplashActivity f26669a;

        C7350d(SplashActivity splashActivity) {
            this.f26669a = splashActivity;
        }

        public void onGlobalLayout() {
            ScaleTextView scaleTextView = (ScaleTextView) this.f26669a.mo23231c(C7192a.tvAnim);
            C1489j.m6969a((Object) scaleTextView, "tvAnim");
            scaleTextView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            SplashActivity splashActivity = this.f26669a;
            String[] stringArray = this.f26669a.getResources().getStringArray(R.array.splash_message);
            C1489j.m6969a((Object) stringArray, "resources.getStringArray(R.array.splash_message)");
            splashActivity.f26663l = stringArray;
            ((ScaleTextView) this.f26669a.mo23231c(C7192a.tvAnim)).mo21398a(SplashActivity.m39059a(this.f26669a)[this.f26669a.f26664m]);
            ((ScaleTextView) this.f26669a.mo23231c(C7192a.tvAnim)).setAnimationListener(this.f26669a);
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26665n == null) {
            this.f26665n = new HashMap();
        }
        View view = (View) this.f26665n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26665n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_splash;
    }

    /* renamed from: m */
    public C7271c<?> mo23233m() {
        return null;
    }

    /* renamed from: a */
    public static final /* synthetic */ String[] m39059a(SplashActivity splashActivity) {
        String[] strArr = splashActivity.f26663l;
        if (strArr == null) {
            C1489j.m6973b("splashMessage");
        }
        return strArr;
    }

    /* renamed from: n */
    public void mo23234n() {
        m39061w();
        Object systemService = getSystemService("power");
        if (systemService == null) {
            throw new C3227u("null cannot be cast to non-null type android.os.PowerManager");
        } else if (((PowerManager) systemService).isInteractive()) {
            ScaleTextView scaleTextView = (ScaleTextView) mo23231c(C7192a.tvAnim);
            C1489j.m6969a((Object) scaleTextView, "tvAnim");
            scaleTextView.getViewTreeObserver().addOnGlobalLayoutListener(new C7350d(this));
        } else {
            mo23257t();
        }
    }

    /* renamed from: w */
    private final void m39061w() {
        C6792a a = C6792a.m35902a();
        a.mo21369a(new C6799a().mo21375a(false).mo21376a());
        a.mo21366a((int) R.xml.remote_config_defaults);
        C1489j.m6969a((Object) a, "instance");
        C6797f c = a.mo21372c();
        C1489j.m6969a((Object) c, "instance.info");
        C6798g a2 = c.mo18820a();
        C1489j.m6969a((Object) a2, "instance.info.configSettings");
        a.mo21364a(a2.mo21374a() ? 0 : 86400).mo14138a((C4739g<? super TResult>) new C7347a<Object>(a));
    }

    /* renamed from: a */
    public void mo21381a(C6815f fVar) {
        this.f26664m++;
        int i = this.f26664m;
        String[] strArr = this.f26663l;
        if (strArr == null) {
            C1489j.m6973b("splashMessage");
        }
        if (i >= strArr.length) {
            ImageView imageView = (ImageView) mo23231c(C7192a.btnGoto);
            C1489j.m6969a((Object) imageView, "btnGoto");
            imageView.setVisibility(0);
            if (!mo23253q().mo23211b(100, false)) {
                mo23257t();
            }
        }
        int i2 = this.f26664m;
        String[] strArr2 = this.f26663l;
        if (strArr2 == null) {
            C1489j.m6973b("splashMessage");
        }
        if (i2 < strArr2.length) {
            ScaleTextView scaleTextView = (ScaleTextView) mo23231c(C7192a.tvAnim);
            String[] strArr3 = this.f26663l;
            if (strArr3 == null) {
                C1489j.m6973b("splashMessage");
            }
            scaleTextView.mo21398a(strArr3[this.f26664m]);
        }
    }

    /* renamed from: t */
    public void mo23257t() {
        if (!isFinishing()) {
            Context context = this;
            if (mo23431a(context) || C7139a.m38192a().mo23027j()) {
                startActivity(new Intent(context, HomeActivity.class));
                finish();
                return;
            }
            C7139a.m38192a().mo23016b(true);
            new C7223a(context).mo23269a((int) R.string.title_install_apk).mo23276b((int) R.string.msg_install_apk).mo23270a((int) R.string.btn_continue, (C7224b) new C7348b(this)).mo23277b((int) R.string.btn_goto_play_store, (C7224b) new C7349c(this)).mo23287j().show();
        }
    }

    /* renamed from: a */
    public void mo23201a(boolean z) {
        mo23257t();
    }

    @OnClick
    public final void onGotoHomeClick() {
        mo23257t();
    }

    /* renamed from: a */
    public final boolean mo23431a(Context context) {
        C1489j.m6972b(context, "context");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"com.android.vending", "com.google.android.feedback"}));
        String installerPackageName = getPackageManager().getInstallerPackageName(getPackageName());
        return installerPackageName != null && arrayList.contains(installerPackageName);
    }
}
