package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.test;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.test.TestActivity_ViewBinding */
public final class TestActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    private TestActivity f26677b;

    /* renamed from: c */
    private View f26678c;

    /* renamed from: d */
    private View f26679d;

    public TestActivity_ViewBinding(final TestActivity testActivity, View view) {
        this.f26677b = testActivity;
        View a = C3237b.m14849a(view, R.id.btn_save, "method 'save'");
        this.f26678c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                testActivity.save();
            }
        });
        View a2 = C3237b.m14849a(view, R.id.btn_show, "method 'show'");
        this.f26679d = a2;
        a2.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                testActivity.show();
            }
        });
    }
}
