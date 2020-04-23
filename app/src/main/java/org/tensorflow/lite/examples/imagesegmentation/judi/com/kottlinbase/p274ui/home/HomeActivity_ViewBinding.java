package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.home.HomeActivity_ViewBinding */
public final class HomeActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    private HomeActivity f26596b;

    /* renamed from: c */
    private View f26597c;

    /* renamed from: d */
    private View f26598d;

    /* renamed from: e */
    private View f26599e;

    public HomeActivity_ViewBinding(final HomeActivity homeActivity, View view) {
        this.f26596b = homeActivity;
        View a = C3237b.m14849a(view, R.id.btnStart, "method 'onStatClick'");
        this.f26597c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                homeActivity.onStatClick();
            }
        });
        View a2 = C3237b.m14849a(view, R.id.btnRateUs, "method 'onRateUsClick'");
        this.f26598d = a2;
        a2.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                homeActivity.onRateUsClick();
            }
        });
        View a3 = C3237b.m14849a(view, R.id.btnSave, "method 'onSaveClick'");
        this.f26599e = a3;
        a3.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                homeActivity.onSaveClick();
            }
        });
    }
}
