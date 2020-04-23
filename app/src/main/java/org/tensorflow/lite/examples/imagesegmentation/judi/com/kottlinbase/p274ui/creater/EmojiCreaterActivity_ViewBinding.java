package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater;

import android.view.View;
import butterknife.Unbinder;
import butterknife.p144a.C3235a;
import butterknife.p144a.C3237b;
import com.judi.emojiphoto.R;

/* renamed from: judi.com.kottlinbase.ui.creater.EmojiCreaterActivity_ViewBinding */
public final class EmojiCreaterActivity_ViewBinding implements Unbinder {

    /* renamed from: b */
    private EmojiCreaterActivity f26485b;

    /* renamed from: c */
    private View f26486c;

    /* renamed from: d */
    private View f26487d;

    /* renamed from: e */
    private View f26488e;

    public EmojiCreaterActivity_ViewBinding(final EmojiCreaterActivity emojiCreaterActivity, View view) {
        this.f26485b = emojiCreaterActivity;
        View a = C3237b.m14849a(view, R.id.btnPickEmoji, "method 'onPickEmojiClick'");
        this.f26486c = a;
        a.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                emojiCreaterActivity.onPickEmojiClick();
            }
        });
        View a2 = C3237b.m14849a(view, R.id.containerPick, "method 'onPickEmojiClick'");
        this.f26487d = a2;
        a2.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                emojiCreaterActivity.onPickEmojiClick();
            }
        });
        View a3 = C3237b.m14849a(view, R.id.btnSaveFrame, "method 'saveEmoji'");
        this.f26488e = a3;
        a3.setOnClickListener(new C3235a() {
            /* renamed from: a */
            public void mo10408a(View view) {
                emojiCreaterActivity.saveEmoji();
            }
        });
    }
}
