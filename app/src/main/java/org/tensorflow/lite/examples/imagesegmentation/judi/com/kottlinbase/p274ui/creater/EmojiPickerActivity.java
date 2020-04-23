package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater;

import android.content.Intent;
import android.os.Handler;
import android.support.p053v4.app.C0647g;
import android.support.p053v4.app.C0690s;
import android.view.View;
import android.widget.ProgressBar;
import butterknife.OnClick;
import com.judi.emojiphoto.R;
import hani.momanii.supernova_emoji_library.Helper.EmojiconTextView;
import hani.momanii.supernova_emoji_library.p264a.C7118c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.quickads.banner.WaterfallBanner;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0014J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo10386c = {"Ljudi/com/kottlinbase/ui/creater/EmojiPickerActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/kottlinbase/ui/creater/EmojiPickerView;", "()V", "emoji", "", "", "createPresenter", "getLayoutId", "", "onDeleteClick", "", "onDestroy", "onEmojiClick", "emojicon", "Lhani/momanii/supernova_emoji_library/emoji/Emojicon;", "onInit", "onSaveEmojiClick", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.creater.EmojiPickerActivity */
/* compiled from: EmojiPickerActivity.kt */
public final class EmojiPickerActivity extends C7218a<C7271c<?>> implements C7286c {

    /* renamed from: l */
    private final List<String> f26495l = new ArrayList();

    /* renamed from: m */
    private HashMap f26496m;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
    /* renamed from: judi.com.kottlinbase.ui.creater.EmojiPickerActivity$a */
    /* compiled from: EmojiPickerActivity.kt */
    static final class C7278a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EmojiPickerActivity f26497a;

        C7278a(EmojiPickerActivity emojiPickerActivity) {
            this.f26497a = emojiPickerActivity;
        }

        public final void run() {
            C0690s a = this.f26497a.mo2158f().mo2228a();
            a.mo1967a(17432576, 17432577);
            a.mo1969a((int) R.id.viewAnchor, (C0647g) new C7285b());
            a.mo1989d();
            ProgressBar progressBar = (ProgressBar) this.f26497a.mo23231c(C7192a.progress);
            C1489j.m6969a((Object) progressBar, "progress");
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26496m == null) {
            this.f26496m = new HashMap();
        }
        View view = (View) this.f26496m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26496m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_picker;
    }

    /* renamed from: m */
    public C7271c<?> mo23233m() {
        return null;
    }

    /* renamed from: n */
    public void mo23234n() {
        ProgressBar progressBar = (ProgressBar) mo23231c(C7192a.progress);
        C1489j.m6969a((Object) progressBar, "progress");
        progressBar.setVisibility(0);
        new Handler().postDelayed(new C7278a(this), 100);
    }

    /* renamed from: a */
    public void mo23372a(C7118c cVar) {
        if (cVar != null) {
            List<String> list = this.f26495l;
            String a = cVar.mo22909a();
            C1489j.m6969a((Object) a, "emojicon.emoji");
            list.add(a);
            ((EmojiconTextView) mo23231c(C7192a.tvEmoji)).append(cVar.mo22909a());
        }
    }

    /* renamed from: w */
    public void mo23316w() {
        if (!this.f26495l.isEmpty()) {
            this.f26495l.remove(this.f26495l.size() - 1);
            EmojiconTextView emojiconTextView = (EmojiconTextView) mo23231c(C7192a.tvEmoji);
            C1489j.m6969a((Object) emojiconTextView, "tvEmoji");
            emojiconTextView.setText("");
            for (String append : this.f26495l) {
                ((EmojiconTextView) mo23231c(C7192a.tvEmoji)).append(append);
            }
        }
    }

    @OnClick
    public final void onSaveEmojiClick() {
        if (!this.f26495l.isEmpty()) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("arg_emoji_list", new ArrayList(this.f26495l));
            setResult(-1, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WaterfallBanner waterfallBanner = (WaterfallBanner) mo23231c(C7192a.adsBanner);
        if (waterfallBanner != null) {
            waterfallBanner.mo23224a();
        }
    }
}
