package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.p064v7.app.C1006c;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import butterknife.ButterKnife;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.p276b.C7229d;
import judi.com.kottlinbase.quickads.p273a.C7197a;
import judi.com.kottlinbase.quickads.p273a.C7199c;
import judi.com.kottlinbase.quickads.p273a.C7203d;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1503v;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0017\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0014H&J\b\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001cH\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\"\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020\u0019H\u0014J\b\u00104\u001a\u00020\u0019H&J\b\u00105\u001a\u00020\u0019H\u0014J\b\u00106\u001a\u00020\u0019H\u0016J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u001cH\u0016J\b\u00109\u001a\u00020\u0019H\u0016J\u0010\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u001eH\u0016J\b\u0010<\u001a\u00020\u0019H\u0016J\u0010\u0010<\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u001cH\u0016J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u001cH\u0016J\u0010\u0010?\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u001cH\u0016R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, mo10386c = {"Ljudi/com/kottlinbase/ui/BaseActivity;", "P", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Landroid/support/v7/app/AppCompatActivity;", "Ljudi/com/kottlinbase/ui/BaseView;", "Ljudi/com/kottlinbase/quickads/full/AdsCallback;", "()V", "ads", "Ljudi/com/kottlinbase/quickads/full/IAdsInteractor;", "getAds", "()Ljudi/com/kottlinbase/quickads/full/IAdsInteractor;", "setAds", "(Ljudi/com/kottlinbase/quickads/full/IAdsInteractor;)V", "presenter", "getPresenter", "()Ljudi/com/kottlinbase/ui/BasePresenter;", "setPresenter", "(Ljudi/com/kottlinbase/ui/BasePresenter;)V", "Ljudi/com/kottlinbase/ui/BasePresenter;", "progressCount", "", "progressDialog", "Ljudi/com/kottlinbase/ui/dialog/ProgressAlert;", "createPresenter", "dismissLoading", "", "finishedActivity", "getAdsCallbackKey", "", "getAnchorSnackBar", "Landroid/view/View;", "getLayoutId", "gotoMainScreen", "gotoPermissionSetting", "gotoRateApp", "hideKeyboard", "launchApplication", "pkg", "mContext", "Landroid/content/Context;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAdsClose", "finished", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", "onStart", "restartApp", "sendFeedback", "msg", "shareApp", "showKeyboard", "focusView", "showLoading", "showMessageDialog", "message", "showSnackMessage", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.a */
/* compiled from: BaseActivity.kt */
public abstract class C7218a<P extends C7271c<?>> extends C1006c implements C7197a, C7293d {

    /* renamed from: k */
    public C7203d f26362k;

    /* renamed from: l */
    private P f26363l;

    /* renamed from: m */
    private C7229d f26364m;

    /* renamed from: n */
    private int f26365n;

    /* renamed from: o */
    private HashMap f26366o;

    /* renamed from: a */
    public void mo23201a(boolean z) {
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26366o == null) {
            this.f26366o = new HashMap();
        }
        View view = (View) this.f26366o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26366o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public abstract int mo23232l();

    /* renamed from: m */
    public abstract P mo23233m();

    /* renamed from: n */
    public abstract void mo23234n();

    /* renamed from: t */
    public void mo23257t() {
    }

    /* renamed from: o */
    public String mo23251o() {
        String w_ = C1503v.m6999a(getClass()).mo6938w_();
        if (w_ == null) {
            C1489j.m6968a();
        }
        return w_;
    }

    /* renamed from: p */
    public final P mo23252p() {
        return this.f26363l;
    }

    /* renamed from: q */
    public final C7203d mo23253q() {
        C7203d dVar = this.f26362k;
        if (dVar == null) {
            C1489j.m6973b("ads");
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo23232l());
        ButterKnife.m14844a((Activity) this);
        Context context = this;
        this.f26364m = new C7229d(context);
        this.f26363l = mo23233m();
        this.f26362k = C7199c.f26311a.mo23217b();
        C7203d dVar = this.f26362k;
        if (dVar == null) {
            C1489j.m6973b("ads");
        }
        dVar.mo23209a(mo23251o(), this);
        C7203d dVar2 = this.f26362k;
        if (dVar2 == null) {
            C1489j.m6973b("ads");
        }
        dVar2.mo23207a(context);
        P p = this.f26363l;
        if (p != null) {
            Intent intent = getIntent();
            p.mo23364a(intent != null ? intent.getExtras() : null, bundle);
        }
        mo23234n();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C7203d dVar = this.f26362k;
        if (dVar == null) {
            C1489j.m6973b("ads");
        }
        dVar.mo23207a((Context) this);
        C7203d dVar2 = this.f26362k;
        if (dVar2 == null) {
            C1489j.m6973b("ads");
        }
        dVar2.mo23212g();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C7203d dVar = this.f26362k;
        if (dVar == null) {
            C1489j.m6973b("ads");
        }
        dVar.mo23208a(mo23251o());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        P p = this.f26363l;
        if (p != null) {
            p.mo23363a(i, i2, intent);
        }
    }

    /* renamed from: b */
    public void mo23248b(String str) {
        C1489j.m6972b(str, "message");
        Snackbar.m1807a(mo23316w(), str, -1).mo1353d();
    }

    /* renamed from: r */
    public void mo23254r() {
        this.f26365n--;
        if (this.f26365n <= 0) {
            C7229d dVar = this.f26364m;
            if (dVar == null) {
                C1489j.m6968a();
            }
            if (dVar.isShowing() && !isFinishing()) {
                C7229d dVar2 = this.f26364m;
                if (dVar2 == null) {
                    C1489j.m6968a();
                }
                dVar2.dismiss();
            }
        }
    }

    /* renamed from: s */
    public void mo23255s() {
        this.f26365n++;
        C7229d dVar = this.f26364m;
        if (dVar == null) {
            C1489j.m6968a();
        }
        if (!dVar.isShowing() && !isFinishing()) {
            C7229d dVar2 = this.f26364m;
            if (dVar2 == null) {
                C1489j.m6968a();
            }
            dVar2.show();
        }
    }

    /* renamed from: c */
    public void mo23249c(String str) {
        C1489j.m6972b(str, "msg");
        if (!isFinishing()) {
            C7229d dVar = this.f26364m;
            if (dVar == null) {
                C1489j.m6968a();
            }
            if (!dVar.isShowing()) {
                C7229d dVar2 = this.f26364m;
                if (dVar2 == null) {
                    C1489j.m6968a();
                }
                dVar2.show();
            }
            C7229d dVar3 = this.f26364m;
            if (dVar3 != null) {
                dVar3.mo23301a(str);
            }
        }
    }

    public void showKeyboard(View view) {
        C1489j.m6972b(view, "focusView");
        view.requestFocus();
        Object systemService = getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).toggleSoftInput(2, 1);
            return;
        }
        throw new C3227u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: u */
    public void mo23258u() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    /* renamed from: v */
    public void mo23259v() {
        String packageName = getPackageName();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("market://details?id=");
            sb.append(packageName);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://play.google.com/store/apps/details?id=");
            sb2.append(packageName);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
        }
    }

    /* renamed from: w */
    private final View mo23316w() {
        View findViewById = findViewById(16908290);
        C1489j.m6969a((Object) findViewById, "findViewById(android.R.id.content)");
        return findViewById;
    }

    /* renamed from: d */
    public void mo23250d(String str) {
        C1489j.m6972b(str, "msg");
        StringBuilder sb = new StringBuilder();
        sb.append("mailto:");
        sb.append(getString(R.string.email_address));
        sb.append("?body=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error detail:");
        sb2.append(str);
        sb.append(Uri.encode(sb2.toString()));
        String sb3 = sb.toString();
        String str2 = "[Error report] Auto blur background - Portrait photography DSLR";
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append("&subject=");
            sb4.append(Uri.encode(str2));
            sb3 = sb4.toString();
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(sb3));
        startActivity(Intent.createChooser(intent, getString(R.string.send_email)));
    }
}
