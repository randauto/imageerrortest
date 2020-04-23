package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.quickads;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.judi.emojiphoto.R;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0002¨\u0006\r"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/AdsLoadingAlert;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "safeShow", "", "setAttributes", "isFull", "app_release"})
/* renamed from: judi.com.kottlinbase.quickads.c */
/* compiled from: AdsLoadingAlert.kt */
public class C7210c extends Dialog {

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
    /* renamed from: judi.com.kottlinbase.quickads.c$a */
    /* compiled from: AdsLoadingAlert.kt */
    static final class C7211a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7210c f26351a;

        C7211a(C7210c cVar) {
            this.f26351a = cVar;
        }

        public final void run() {
            try {
                this.f26351a.dismiss();
            } catch (Exception e) {
                Log.d("AdsLoadingAler", "after 600: ", e);
            }
        }
    }

    public C7210c(Context context) {
        super(context, R.style.JudiAdsAlert);
    }

    /* renamed from: a */
    private final void m38530a(boolean z) {
        if (getWindow() != null) {
            Window window = getWindow();
            if (window == null) {
                C1489j.m6968a();
            }
            window.setGravity(17);
            Window window2 = getWindow();
            if (window2 == null) {
                C1489j.m6968a();
            }
            window2.setSoftInputMode(16);
            LayoutParams layoutParams = new LayoutParams();
            Window window3 = getWindow();
            if (window3 == null) {
                C1489j.m6968a();
            }
            layoutParams.copyFrom(window3.getAttributes());
            int i = -1;
            layoutParams.width = -1;
            if (!z) {
                i = -2;
            }
            layoutParams.height = i;
            Window window4 = getWindow();
            if (window4 == null) {
                C1489j.m6968a();
            }
            window4.setAttributes(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.judi_dialog_ads);
        m38530a(true);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    /* renamed from: a */
    public final boolean mo23228a() {
        try {
            super.show();
            new Handler().postDelayed(new C7211a(this), 900);
            return true;
        } catch (Exception e) {
            Log.d("AdsLoadingAlert", ": ", e);
            return false;
        }
    }
}
