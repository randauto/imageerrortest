package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.creater.EmojiPickerActivity_ViewBinding */
public final class EmojiPickerActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    private EmojiPickerActivity f26498b;

    /* renamed from: c */
    private View f26499c;

    public EmojiPickerActivity_ViewBinding(final EmojiPickerActivity emojiPickerActivity, View view) {
        this.f26498b = emojiPickerActivity;
        View a = C3237b.m14849a(view, R.id.btnSaveEmoji, "method 'onSaveEmojiClick'");
        this.f26499c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                emojiPickerActivity.onSaveEmojiClick();
            }
        });
    }
}
