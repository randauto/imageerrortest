package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater.save;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.creater.save.CreatorListActivity_ViewBinding */
public final class CreatorListActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    private CreatorListActivity f26530b;

    /* renamed from: c */
    private View f26531c;

    public CreatorListActivity_ViewBinding(final CreatorListActivity creatorListActivity, View view) {
        this.f26530b = creatorListActivity;
        View a = C3237b.m14849a(view, R.id.btnCreate, "method 'onCreateClick'");
        this.f26531c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                creatorListActivity.onCreateClick();
            }
        });
    }
}
