package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.home.OtherAppDialog_ViewBinding */
public final class OtherAppDialog_ViewBinding implements Unbinder {

    /* renamed from: b */
    private OtherAppDialog f26608b;

    /* renamed from: c */
    private View f26609c;

    /* renamed from: d */
    private View f26610d;

    public OtherAppDialog_ViewBinding(final OtherAppDialog otherAppDialog, View view) {
        this.f26608b = otherAppDialog;
        View a = C3237b.m14849a(view, R.id.btnDownload, "method 'onDownloadClick'");
        this.f26609c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                otherAppDialog.onDownloadClick();
            }
        });
        View a2 = C3237b.m14849a(view, R.id.btnExist, "method 'onExistClick'");
        this.f26610d = a2;
        a2.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                otherAppDialog.onExistClick();
            }
        });
    }
}
