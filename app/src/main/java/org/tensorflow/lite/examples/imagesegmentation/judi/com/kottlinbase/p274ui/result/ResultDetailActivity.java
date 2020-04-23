package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.result;

import android.content.Intent;
import android.net.Uri;
import android.support.p053v4.app.C0656h;
import android.support.p053v4.content.FileProvider;
import android.view.View;
import android.widget.ImageView;
import butterknife.OnClick;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.load.p164b.C3529j;
import com.bumptech.glide.p156f.C3344a;
import com.bumptech.glide.p156f.C3369h;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.HashMap;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7223a;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7224b;
import judi.com.kottlinbase.quickads.banner.WaterfallBanner;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0007J\b\u0010\u0011\u001a\u00020\nH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/ui/result/ResultDetailActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "()V", "pathResult", "", "createPresenter", "getLayoutId", "", "onAdsClose", "", "finished", "", "onBackPressed", "onDestroy", "onInit", "onPutGalleryClick", "onShareClick", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.result.ResultDetailActivity */
/* compiled from: ResultDetailActivity.kt */
public final class ResultDetailActivity extends C7218a<C7271c<?>> {

    /* renamed from: l */
    private String f26654l;

    /* renamed from: m */
    private HashMap f26655m;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/result/ResultDetailActivity$onPutGalleryClick$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.result.ResultDetailActivity$a */
    /* compiled from: ResultDetailActivity.kt */
    public static final class C7344a implements C7224b {
        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
        }

        C7344a() {
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26655m == null) {
            this.f26655m = new HashMap();
        }
        View view = (View) this.f26655m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26655m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_result;
    }

    /* renamed from: m */
    public C7271c<?> mo23233m() {
        return null;
    }

    /* renamed from: n */
    public void mo23234n() {
        this.f26654l = getIntent().getStringExtra("arg_path");
        C3303c.m15106a((C0656h) this).mo10837a(this.f26654l).mo10667b((C3344a<?>) C3369h.m15421b(C3529j.f9432b)).mo10823a((ImageView) mo23231c(C7192a.imgResult));
    }

    @OnClick
    public final void onPutGalleryClick() {
        if (this.f26654l != null) {
            CharSequence charSequence = this.f26654l;
            if (!(charSequence == null || charSequence.length() == 0)) {
                sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(this.f26654l))));
                new C7223a(this).mo23276b((int) R.string.msg_add_gallery_success).mo23274a(false).mo23279b(false).mo23270a(17039370, (C7224b) new C7344a()).mo23287j().show();
            }
        }
    }

    @OnClick
    public final void onShareClick() {
        Uri a = FileProvider.m2907a(this, "com.judi.emojiphoto", new File(this.f26654l));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", a);
        startActivity(Intent.createChooser(intent, getString(R.string.app_name)));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WaterfallBanner waterfallBanner = (WaterfallBanner) mo23231c(C7192a.adsBanner);
        if (waterfallBanner != null) {
            waterfallBanner.mo23224a();
        }
    }

    public void onBackPressed() {
        if (!mo23253q().mo23211b(70, true)) {
            super.onBackPressed();
        }
    }

    /* renamed from: a */
    public void mo23201a(boolean z) {
        if (z) {
            finish();
        }
    }
}
