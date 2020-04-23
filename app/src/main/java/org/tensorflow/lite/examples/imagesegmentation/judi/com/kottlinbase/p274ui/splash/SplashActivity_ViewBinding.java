package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.splash;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.splash.SplashActivity_ViewBinding */
public final class SplashActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    private SplashActivity f26670b;

    /* renamed from: c */
    private View f26671c;

    public SplashActivity_ViewBinding(final SplashActivity splashActivity, View view) {
        this.f26670b = splashActivity;
        View a = C3237b.m14849a(view, R.id.btnGoto, "method 'onGotoHomeClick'");
        this.f26671c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                splashActivity.onGotoHomeClick();
            }
        });
    }
}
