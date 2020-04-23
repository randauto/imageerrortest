package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.os.Handler;
import android.support.p053v4.app.C0690s;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import butterknife.OnClick;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.creater.p277a.C7284b;
import judi.com.kottlinbase.quickads.banner.WaterfallBanner;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1500u.C1502b;
import p145c.p146a.p147a.C3242e;
import p145c.p146a.p147a.C3243f;
import p145c.p146a.p147a.C3243f.C3254a;
import p256e.p258b.C6979c;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0007J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, mo10386c = {"Ljudi/com/kottlinbase/ui/creater/EmojiCreaterActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/kottlinbase/ui/creater/EmojiCreaterView;", "()V", "REQUEST_PICK_EMOJI", "", "drawer", "Ljudi/com/kottlinbase/ui/creater/drawer/EmojiDrawer;", "fileObserver", "Landroid/os/FileObserver;", "savePath", "", "createPresenter", "createShowCase", "Lme/toptas/fancyshowcase/FancyShowCaseView;", "view", "Landroid/view/View;", "id", "msg", "gravity", "getLayoutId", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onEmojiReady", "onInit", "onPickEmojiClick", "onRetryClick", "onUseThisEmoji", "saveEmoji", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.creater.EmojiCreaterActivity */
/* compiled from: EmojiCreaterActivity.kt */
public final class EmojiCreaterActivity extends C7218a<C7271c<?>> implements C7282a {

    /* renamed from: l */
    private final int f26475l = 10001;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C7284b f26476m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public FileObserver f26477n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f26478o;

    /* renamed from: p */
    private HashMap f26479p;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
    /* renamed from: judi.com.kottlinbase.ui.creater.EmojiCreaterActivity$a */
    /* compiled from: EmojiCreaterActivity.kt */
    static final class C7272a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EmojiCreaterActivity f26480a;

        /* renamed from: b */
        final /* synthetic */ Intent f26481b;

        C7272a(EmojiCreaterActivity emojiCreaterActivity, Intent intent) {
            this.f26480a = emojiCreaterActivity;
            this.f26481b = intent;
        }

        public final void run() {
            ArrayList stringArrayListExtra = this.f26481b.getStringArrayListExtra("arg_emoji_list");
            C0690s a = this.f26480a.mo2158f().mo2228a();
            this.f26480a.f26478o = "";
            EmojiCreaterActivity emojiCreaterActivity = this.f26480a;
            C1489j.m6969a((Object) stringArrayListExtra, "emojiList");
            emojiCreaterActivity.f26476m = new C7284b(stringArrayListExtra);
            a.mo1980b(R.id.frm, new C6979c(this.f26480a.f26476m));
            a.mo1989d();
            ProgressBar progressBar = (ProgressBar) this.f26480a.mo23231c(C7192a.progress);
            C1489j.m6969a((Object) progressBar, "progress");
            progressBar.setVisibility(8);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, mo10386c = {"judi/com/kottlinbase/ui/creater/EmojiCreaterActivity$saveEmoji$1", "Landroid/os/FileObserver;", "onEvent", "", "event", "", "path", "", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.creater.EmojiCreaterActivity$b */
    /* compiled from: EmojiCreaterActivity.kt */
    public static final class C7273b extends FileObserver {

        /* renamed from: a */
        final /* synthetic */ EmojiCreaterActivity f26482a;

        /* renamed from: b */
        final /* synthetic */ C1502b f26483b;

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
        /* renamed from: judi.com.kottlinbase.ui.creater.EmojiCreaterActivity$b$a */
        /* compiled from: EmojiCreaterActivity.kt */
        static final class C7274a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C7273b f26484a;

            C7274a(C7273b bVar) {
                this.f26484a = bVar;
            }

            public final void run() {
                this.f26484a.f26482a.m38782y();
            }
        }

        C7273b(EmojiCreaterActivity emojiCreaterActivity, C1502b bVar, String str, int i) {
            this.f26482a = emojiCreaterActivity;
            this.f26483b = bVar;
            super(str, i);
        }

        public void onEvent(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(": ");
            sb.append(i);
            sb.append(" / ");
            sb.append(str);
            Log.d("file", sb.toString());
            if (i == 8) {
                this.f26482a.runOnUiThread(new C7274a(this));
                FileObserver b = this.f26482a.f26477n;
                if (b != null) {
                    b.stopWatching();
                }
                this.f26482a.f26477n = null;
            }
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26479p == null) {
            this.f26479p = new HashMap();
        }
        View view = (View) this.f26479p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26479p.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_emoji_creater;
    }

    /* renamed from: m */
    public C7271c<?> mo23233m() {
        return null;
    }

    /* renamed from: w */
    public void mo23316w() {
    }

    /* renamed from: n */
    public void mo23234n() {
        C3242e eVar = new C3242e();
        ImageButton imageButton = (ImageButton) mo23231c(C7192a.btnPickEmoji);
        C1489j.m6969a((Object) imageButton, "btnPickEmoji");
        String string = getString(R.string.msg_pick_emoji);
        C1489j.m6969a((Object) string, "getString(R.string.msg_pick_emoji)");
        eVar.mo10435a(m38775a(imageButton, "btnPickEmoji", string, 17));
        ImageButton imageButton2 = (ImageButton) mo23231c(C7192a.btnSaveFrame);
        C1489j.m6969a((Object) imageButton2, "btnSaveFrame");
        String string2 = getString(R.string.msg_save_emoji);
        C1489j.m6969a((Object) string2, "getString(R.string.msg_save_emoji)");
        eVar.mo10435a(m38775a(imageButton2, "btnSaveEmoji", string2, 17));
        eVar.mo10436a();
    }

    /* renamed from: a */
    private final C3243f m38775a(View view, String str, String str2, int i) {
        C3243f a = new C3254a(this).mo10468b(str).mo10463a(view).mo10464a(str2).mo10462a(i).mo10465a(false).mo10467b(300).mo10466a();
        C1489j.m6969a((Object) a, "FancyShowCaseView.Builde…\n                .build()");
        return a;
    }

    @OnClick
    public final void onPickEmojiClick() {
        startActivityForResult(new Intent(this, EmojiPickerActivity.class), this.f26475l);
    }

    @OnClick
    public final void saveEmoji() {
        if (this.f26476m != null) {
            ProgressBar progressBar = (ProgressBar) mo23231c(C7192a.progress);
            C1489j.m6969a((Object) progressBar, "progress");
            boolean z = false;
            progressBar.setVisibility(0);
            C1502b bVar = new C1502b();
            bVar.f4869a = new File(getFilesDir(), "bokeh/Creator");
            if (!((File) bVar.f4869a).exists()) {
                ((File) bVar.f4869a).mkdirs();
            }
            this.f26477n = new C7273b(this, bVar, ((File) bVar.f4869a).getPath(), 8);
            FileObserver fileObserver = this.f26477n;
            if (fileObserver != null) {
                fileObserver.startWatching();
            }
            CharSequence charSequence = this.f26478o;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (z) {
                File file = (File) bVar.f4869a;
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(System.currentTimeMillis()));
                sb.append(".");
                sb.append("png");
                this.f26478o = new File(file, sb.toString()).getPath();
            }
            C7284b bVar2 = this.f26476m;
            if (bVar2 == null) {
                C1489j.m6968a();
            }
            String str = this.f26478o;
            if (str == null) {
                C1489j.m6968a();
            }
            bVar2.mo23381a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m38782y() {
        ProgressBar progressBar = (ProgressBar) mo23231c(C7192a.progress);
        C1489j.m6969a((Object) progressBar, "progress");
        progressBar.setVisibility(8);
        ResultDialog resultDialog = new ResultDialog();
        Bundle bundle = new Bundle();
        String str = "arg_emoji_path";
        String str2 = this.f26478o;
        if (str2 == null) {
            C1489j.m6968a();
        }
        bundle.putString(str, str2);
        resultDialog.mo2102g(bundle);
        resultDialog.mo2008a(mo2158f(), "ResultDialog");
    }

    /* renamed from: x */
    public void mo23368x() {
        Intent intent = new Intent();
        intent.putExtra("arg_emoji_path", this.f26478o);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f26475l && i2 == -1 && intent != null) {
            ProgressBar progressBar = (ProgressBar) mo23231c(C7192a.progress);
            C1489j.m6969a((Object) progressBar, "progress");
            progressBar.setVisibility(0);
            new Handler().postDelayed(new C7272a(this, intent), 100);
        }
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
