package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry.editor.bokeh;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.BokehFragment_ViewBinding */
public final class BokehFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    private BokehFragment f26462b;

    /* renamed from: c */
    private View f26463c;

    public BokehFragment_ViewBinding(final BokehFragment bokehFragment, View view) {
        this.f26462b = bokehFragment;
        View a = C3237b.m14849a(view, R.id.containerGetEmoji, "method 'onGetEmojiClick'");
        this.f26463c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                bokehFragment.onGetEmojiClick();
            }
        });
    }
}
