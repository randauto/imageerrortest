package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.creater.ResultDialog_ViewBinding */
public final class ResultDialog_ViewBinding implements Unbinder {

    /* renamed from: b */
    private ResultDialog f26503b;

    /* renamed from: c */
    private View f26504c;

    /* renamed from: d */
    private View f26505d;

    public ResultDialog_ViewBinding(final ResultDialog resultDialog, View view) {
        this.f26503b = resultDialog;
        View a = C3237b.m14849a(view, R.id.btnRetry, "method 'onOnRetry'");
        this.f26504c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                resultDialog.onOnRetry();
            }
        });
        View a2 = C3237b.m14849a(view, R.id.btnOk, "method 'onOnUse'");
        this.f26505d = a2;
        a2.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                resultDialog.onOnUse();
            }
        });
    }
}
