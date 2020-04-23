package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.home.EmojiCartFragment_ViewBinding */
public final class EmojiCartFragment_ViewBinding implements Unbinder {

    /* renamed from: b */
    private EmojiCartFragment f26573b;

    /* renamed from: c */
    private View f26574c;

    public EmojiCartFragment_ViewBinding(final EmojiCartFragment emojiCartFragment, View view) {
        this.f26573b = emojiCartFragment;
        View a = C3237b.m14849a(view, R.id.imgThumbOtherApp, "method 'onEffectClick'");
        this.f26574c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                emojiCartFragment.onEffectClick();
            }
        });
    }
}
