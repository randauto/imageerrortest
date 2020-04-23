package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity_ViewBinding */
public final class BlurryActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    private BlurryActivity f26416b;

    /* renamed from: c */
    private View f26417c;

    public BlurryActivity_ViewBinding(final BlurryActivity blurryActivity, View view) {
        this.f26416b = blurryActivity;
        View a = C3237b.m14849a(view, R.id.btnSave, "method 'onSaveClick'");
        this.f26417c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                blurryActivity.onSaveClick();
            }
        });
    }
}
