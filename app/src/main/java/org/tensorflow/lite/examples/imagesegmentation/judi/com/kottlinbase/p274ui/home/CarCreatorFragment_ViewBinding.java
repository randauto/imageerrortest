package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.home.CarCreatorFragment_ViewBinding */
public final class CarCreatorFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    private CarCreatorFragment f26563b;

    /* renamed from: c */
    private View f26564c;

    public CarCreatorFragment_ViewBinding(final CarCreatorFragment carCreatorFragment, View view) {
        this.f26563b = carCreatorFragment;
        View a = C3237b.m14849a(view, R.id.containerCreator, "method 'onCreatorClick'");
        this.f26564c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                carCreatorFragment.onCreatorClick();
            }
        });
    }
}
