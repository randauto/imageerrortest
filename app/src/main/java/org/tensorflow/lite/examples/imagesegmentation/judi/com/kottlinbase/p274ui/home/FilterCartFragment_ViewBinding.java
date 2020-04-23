package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.home.FilterCartFragment_ViewBinding */
public final class FilterCartFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    private FilterCartFragment f26581b;

    /* renamed from: c */
    private View f26582c;

    public FilterCartFragment_ViewBinding(final FilterCartFragment filterCartFragment, View view) {
        this.f26581b = filterCartFragment;
        View a = C3237b.m14849a(view, R.id.imgThumb, "method 'onEffectClick'");
        this.f26582c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                filterCartFragment.onEffectClick();
            }
        });
    }
}
