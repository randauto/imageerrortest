package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.result;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.result.ResultDetailActivity_ViewBinding */
public final class ResultDetailActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    private ResultDetailActivity f26656b;

    /* renamed from: c */
    private View f26657c;

    /* renamed from: d */
    private View f26658d;

    public ResultDetailActivity_ViewBinding(final ResultDetailActivity resultDetailActivity, View view) {
        this.f26656b = resultDetailActivity;
        View a = C3237b.m14849a(view, R.id.containerPutGallery, "method 'onPutGalleryClick'");
        this.f26657c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                resultDetailActivity.onPutGalleryClick();
            }
        });
        View a2 = C3237b.m14849a(view, R.id.containerShare, "method 'onShareClick'");
        this.f26658d = a2;
        a2.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                resultDetailActivity.onShareClick();
            }
        });
    }
}
