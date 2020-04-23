package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.home.AutoBlurCartFragment_ViewBinding */
public final class AutoBlurCartFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    private AutoBlurCartFragment f26558b;

    /* renamed from: c */
    private View f26559c;

    public AutoBlurCartFragment_ViewBinding(final AutoBlurCartFragment autoBlurCartFragment, View view) {
        this.f26558b = autoBlurCartFragment;
        View a = C3237b.m14849a(view, R.id.imgThumb, "method 'onEffectClick'");
        this.f26559c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                autoBlurCartFragment.onEffectClick();
            }
        });
    }
}
