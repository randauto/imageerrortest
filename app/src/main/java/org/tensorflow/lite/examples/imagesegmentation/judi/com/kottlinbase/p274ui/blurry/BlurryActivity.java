package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.os.PersistableBundle;
import android.support.p053v4.app.C0647g;
import android.support.p053v4.app.C0656h;
import android.support.p053v4.app.C0690s;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import butterknife.OnClick;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.C3415j;
import com.bumptech.glide.load.p164b.C3529j;
import com.bumptech.glide.p156f.C3369h;
import com.facebook.ads.AdError;
import com.google.android.gms.p208d.C4738f;
import com.google.android.gms.p208d.C4739g;
import com.google.firebase.p234f.C6705d.C6706a;
import com.google.firebase.p234f.C6707e;
import com.google.firebase.remoteconfig.C6792a;
import com.google.p187a.C4299e;
import com.judi.emojiphoto.R;
import com.wang.avi.AVLoadingIndicatorView;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import judi.com.C7139a;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.model.BlurEffect;
import judi.com.kottlinbase.model.BokehMarketWrapper;
import judi.com.kottlinbase.model.DefaultTexture;
import judi.com.kottlinbase.model.IEffect;
import judi.com.kottlinbase.model.ITexture;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.blurry.editor.C7255a;
import judi.com.kottlinbase.p274ui.blurry.editor.C7257b;
import judi.com.kottlinbase.p274ui.blurry.editor.C7269c;
import judi.com.kottlinbase.p274ui.blurry.editor.bokeh.BokehFragment;
import judi.com.kottlinbase.p274ui.creater.EmojiCreaterActivity;
import judi.com.kottlinbase.p274ui.home.HomeActivity;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7223a;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7224b;
import judi.com.kottlinbase.p274ui.remove.BackgroundEditorActivity;
import judi.com.kottlinbase.p274ui.result.ResultDetailActivity;
import judi.com.service.C7363a;
import judi.com.service.C7365c;
import judi.com.service.C7365c.C7367b;
import judi.com.service.C7370d;
import p000a.p013b.C0164b;
import p000a.p013b.p014a.p016b.C0158a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p031g.C0255a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p145c.p146a.p147a.C3243f.C3254a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0003J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\bH\u0002J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020\bH\u0016J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020*H\u0016J\"\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0010\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020*H\u0016J\b\u00102\u001a\u00020\u0018H\u0016J\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u0018H\u0014J\u0010\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u000bH\u0016J\b\u00109\u001a\u00020\u0018H\u0016J\b\u0010:\u001a\u00020\u0018H\u0016J\u0018\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u000bH\u0016J\u0010\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\bH\u0016J\b\u0010@\u001a\u00020\u0018H\u0016J\b\u0010A\u001a\u00020\u0018H\u0016J\b\u0010B\u001a\u00020\u0018H\u0016J\u0012\u0010C\u001a\u00020\u00182\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\b\u0010F\u001a\u00020\u0018H\u0007J\u001c\u0010G\u001a\u00020\u00182\b\u0010H\u001a\u0004\u0018\u00010E2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u0010\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\bH\u0016J\u0010\u0010P\u001a\u00020\u00182\u0006\u0010Q\u001a\u00020\bH\u0016J\u0012\u0010R\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010S\u001a\u00020\u0018H\u0002J\b\u0010T\u001a\u00020\u000bH\u0002J\u0010\u0010U\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u000bH\u0002J\b\u0010V\u001a\u00020\u0018H\u0016J\u0010\u0010W\u001a\u00020\u00182\u0006\u0010X\u001a\u00020YH\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/BlurryActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/kottlinbase/ui/blurry/BlurView;", "Ljudi/com/service/DetectorManager$DetectorListenner;", "Ljudi/com/kottlinbase/ui/view/HoldButton$HoldListener;", "()V", "REQUEST_CREATE_EMOJI", "", "REQUEST_MANUAL_EDIT", "TAG", "", "kotlin.jvm.PlatformType", "blurEffect", "Ljudi/com/kottlinbase/model/IEffect;", "blurry", "Ljudi/com/kottlinbase/ui/blurry/Blurry;", "config", "Ljudi/com/service/Config;", "detector", "Ljudi/com/service/DetectorManager;", "path", "resultPath", "applyBlurry", "", "effect", "attachEditor", "frm", "Ljudi/com/kottlinbase/ui/blurry/editor/BaseEditorFragment;", "checkNewEmojiPackage", "countCurrentEmojiCount", "createPresenter", "currentEditorFrm", "Landroid/support/v4/app/Fragment;", "detachEditor", "dismissLoading", "getBokehDataFile", "Ljava/io/File;", "getBokehDataFileTemp", "getLayoutId", "gotoManualFocusClick", "isBusy", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAdsClose", "finished", "onBackPressed", "onBlurLevelUpdate", "level", "", "onDestroy", "onDetectorFinished", "resultFolder", "onDetectorOffline", "onDetectorOnline", "onError", "errorCode", "mess", "onFaddingUpdate", "fadding", "onHold", "onInit", "onRelease", "onRestoreInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "onSaveClick", "onSaveInstanceState", "outState", "outPersistentState", "Landroid/os/PersistableBundle;", "onTextureUpdate", "texture", "Ljudi/com/kottlinbase/model/ITexture;", "onToolsItemClick", "buttonId", "onUpdateAlpha", "alpha", "openResult", "refreshNewestEmojiFromServer", "saveResult", "showConfirmRestartApp", "showLoading", "showTutGetMoreEmoji", "view", "Landroid/view/View;", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity */
/* compiled from: BlurryActivity.kt */
public final class BlurryActivity extends C7218a<C7271c<? super C7248a>> implements C7248a, C7367b {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f26387l = BlurryActivity.class.getSimpleName();

    /* renamed from: m */
    private final int f26388m = AdError.NETWORK_ERROR_CODE;

    /* renamed from: n */
    private final int f26389n = AdError.NO_FILL_ERROR_CODE;

    /* renamed from: o */
    private C7365c f26390o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f26391p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C7363a f26392q;

    /* renamed from: r */
    private C7249b f26393r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public IEffect f26394s = BlurEffect.Companion.bestEffect();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f26395t;

    /* renamed from: u */
    private HashMap f26396u;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "call"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$a */
    /* compiled from: BlurryActivity.kt */
    static final class C7230a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26397a;

        /* renamed from: b */
        final /* synthetic */ IEffect f26398b;

        C7230a(BlurryActivity blurryActivity, IEffect iEffect) {
            this.f26397a = blurryActivity;
            this.f26398b = iEffect;
        }

        /* renamed from: a */
        public final String call() {
            C7249b c = BlurryActivity.m38642c(this.f26397a);
            C7363a a = this.f26397a.f26392q;
            if (a == null) {
                C1489j.m6968a();
            }
            IEffect iEffect = this.f26398b;
            String d = this.f26397a.f26391p;
            if (d == null) {
                C1489j.m6968a();
            }
            return c.mo23333a(a, iEffect, d);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$b */
    /* compiled from: BlurryActivity.kt */
    static final class C7231b<T> implements C0185d<String> {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26399a;

        C7231b(BlurryActivity blurryActivity) {
            this.f26399a = blurryActivity;
        }

        /* renamed from: a */
        public final void mo381a(String str) {
            this.f26399a.mo23254r();
            if (str != null) {
                if (!(str.length() == 0)) {
                    if (!this.f26399a.isFinishing()) {
                        C3303c.m15106a((C0656h) this.f26399a).mo10837a(str).mo10667b(C3369h.m15421b(C3529j.f9432b).mo10669b(true)).mo10823a((ImageView) this.f26399a.mo23231c(C7192a.imgPreview));
                        return;
                    }
                    return;
                }
            }
            BlurryActivity blurryActivity = this.f26399a;
            String string = this.f26399a.getString(R.string.msg_unknow_error);
            C1489j.m6969a((Object) string, "getString(R.string.msg_unknow_error)");
            blurryActivity.mo23248b(string);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/blurry/BlurryActivity$onBackPressed$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$c */
    /* compiled from: BlurryActivity.kt */
    public static final class C7232c implements C7224b {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26400a;

        C7232c(BlurryActivity blurryActivity) {
            this.f26400a = blurryActivity;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            this.f26400a.finish();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$d */
    /* compiled from: BlurryActivity.kt */
    static final class C7233d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26401a;

        C7233d(BlurryActivity blurryActivity) {
            this.f26401a = blurryActivity;
        }

        public final void run() {
            if (this.f26401a.f26392q != null) {
                C7363a a = this.f26401a.f26392q;
                if (a == null) {
                    C1489j.m6968a();
                }
                File file = new File(a.mo23457d());
                if (file.isDirectory() && file.listFiles() != null) {
                    for (File delete : file.listFiles()) {
                        delete.delete();
                    }
                }
                file.delete();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$e */
    /* compiled from: BlurryActivity.kt */
    static final class C7234e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26402a;

        C7234e(BlurryActivity blurryActivity) {
            this.f26402a = blurryActivity;
        }

        public final void run() {
            if (!this.f26402a.isFinishing()) {
                this.f26402a.mo23254r();
                C3415j a = C3303c.m15106a((C0656h) this.f26402a);
                C7363a a2 = this.f26402a.f26392q;
                if (a2 == null) {
                    C1489j.m6968a();
                }
                String d = a2.mo23457d();
                C7363a a3 = this.f26402a.f26392q;
                if (a3 == null) {
                    C1489j.m6968a();
                }
                a.mo10835a(new File(d, a3.mo23453a())).mo10667b(C3369h.m15421b(C3529j.f9432b).mo10669b(true)).mo10823a((ImageView) this.f26402a.mo23231c(C7192a.imgPreview));
                C3415j a4 = C3303c.m15106a((C0656h) this.f26402a);
                C7363a a5 = this.f26402a.f26392q;
                if (a5 == null) {
                    C1489j.m6968a();
                }
                String d2 = a5.mo23457d();
                C7363a a6 = this.f26402a.f26392q;
                if (a6 == null) {
                    C1489j.m6968a();
                }
                a4.mo10835a(new File(d2, a6.mo23455b())).mo10667b(C3369h.m15421b(C3529j.f9432b).mo10669b(true)).mo10823a((ImageView) this.f26402a.mo23231c(C7192a.imgBackground));
                new C7223a(this.f26402a).mo23269a((int) R.string.title_detect_done).mo23276b((int) R.string.msg_apply_blur).mo23270a(17039379, (C7224b) new C7224b(this) {

                    /* renamed from: a */
                    final /* synthetic */ C7234e f26403a;

                    {
                        this.f26403a = r1;
                    }

                    /* renamed from: a */
                    public void mo23288a(View view) {
                        C1489j.m6972b(view, "v");
                        this.f26403a.f26402a.m38636a(this.f26403a.f26402a.f26394s);
                    }
                }).mo23277b(17039369, (C7224b) null).mo23287j().show();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$f */
    /* compiled from: BlurryActivity.kt */
    static final class C7236f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26404a;

        C7236f(BlurryActivity blurryActivity) {
            this.f26404a = blurryActivity;
        }

        public final void run() {
            this.f26404a.mo23255s();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$g */
    /* compiled from: BlurryActivity.kt */
    static final class C7237g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26405a;

        /* renamed from: b */
        final /* synthetic */ int f26406b;

        /* renamed from: c */
        final /* synthetic */ String f26407c;

        C7237g(BlurryActivity blurryActivity, int i, String str) {
            this.f26405a = blurryActivity;
            this.f26406b = i;
            this.f26407c = str;
        }

        public final void run() {
            if (this.f26406b != 999 && this.f26406b != 1) {
                this.f26405a.mo23248b(this.f26407c);
            } else if (!this.f26405a.isFinishing()) {
                this.f26405a.m38646e(this.f26407c);
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "call"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$h */
    /* compiled from: BlurryActivity.kt */
    static final class C7238h<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26408a;

        C7238h(BlurryActivity blurryActivity) {
            this.f26408a = blurryActivity;
        }

        /* renamed from: a */
        public final String call() {
            return this.f26408a.m38651y();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$i */
    /* compiled from: BlurryActivity.kt */
    static final class C7239i<T> implements C0185d<String> {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26409a;

        C7239i(BlurryActivity blurryActivity) {
            this.f26409a = blurryActivity;
        }

        /* renamed from: a */
        public final void mo381a(String str) {
            this.f26409a.mo23254r();
            this.f26409a.f26395t = str;
            if (!this.f26409a.isFinishing()) {
                long b = C6792a.m35902a().mo21370b("emoji_energy_save_image");
                String g = this.f26409a.f26387l;
                StringBuilder sb = new StringBuilder();
                sb.append("save enery: ");
                sb.append(b);
                Log.d(g, sb.toString());
                if (!this.f26409a.mo23253q().mo23211b(b <= 0 ? 20 : (int) b, false)) {
                    this.f26409a.m38648f(this.f26409a.f26395t);
                }
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onFailure"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$j */
    /* compiled from: BlurryActivity.kt */
    static final class C7240j implements C4738f {

        /* renamed from: a */
        public static final C7240j f26410a = new C7240j();

        C7240j() {
        }

        /* renamed from: a */
        public final void mo14129a(Exception exc) {
            C1489j.m6972b(exc, "it");
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012 \u0005*\b\u0018\u00010\u0003R\u00020\u00040\u0003R\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "kotlin.jvm.PlatformType", "onSuccess"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$k */
    /* compiled from: BlurryActivity.kt */
    static final class C7241k<TResult> implements C4739g<C6706a> {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26411a;

        /* renamed from: b */
        final /* synthetic */ File f26412b;

        C7241k(BlurryActivity blurryActivity, File file) {
            this.f26411a = blurryActivity;
            this.f26412b = file;
        }

        /* renamed from: a */
        public final void mo14130a(C6706a aVar) {
            if (!this.f26411a.isFinishing()) {
                String a = C7370d.m39134a(this.f26412b);
                int h = this.f26411a.m38633E();
                StringBuilder sb = new StringBuilder();
                sb.append(": ");
                sb.append(a);
                Log.d("refreshNewestFromServer", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("current count ->> : ");
                sb2.append(h);
                Log.d("refreshNewestFromServer", sb2.toString());
                BokehMarketWrapper bokehMarketWrapper = (BokehMarketWrapper) new C4299e().mo13132a(a, BokehMarketWrapper.class);
                if ((bokehMarketWrapper != null ? bokehMarketWrapper.getBokeh() : null) != null && bokehMarketWrapper.getBokeh().size() != h) {
                    C7139a.m38192a().mo23020c(true);
                }
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/blurry/BlurryActivity$showConfirmRestartApp$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$l */
    /* compiled from: BlurryActivity.kt */
    public static final class C7242l implements C7224b {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26413a;

        C7242l(BlurryActivity blurryActivity) {
            this.f26413a = blurryActivity;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            try {
                Intent intent = new Intent(this.f26413a, HomeActivity.class);
                intent.addFlags(268435456);
                intent.addFlags(32768);
                this.f26413a.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/blurry/BlurryActivity$showConfirmRestartApp$2", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.BlurryActivity$m */
    /* compiled from: BlurryActivity.kt */
    public static final class C7243m implements C7224b {

        /* renamed from: a */
        final /* synthetic */ BlurryActivity f26414a;

        /* renamed from: b */
        final /* synthetic */ String f26415b;

        C7243m(BlurryActivity blurryActivity, String str) {
            this.f26414a = blurryActivity;
            this.f26415b = str;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            this.f26414a.mo23250d(this.f26415b);
            this.f26414a.finish();
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26396u == null) {
            this.f26396u = new HashMap();
        }
        View view = (View) this.f26396u.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26396u.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_blurry;
    }

    /* renamed from: m */
    public C7271c<C7248a> mo23233m() {
        return null;
    }

    /* renamed from: c */
    public static final /* synthetic */ C7249b m38642c(BlurryActivity blurryActivity) {
        C7249b bVar = blurryActivity.f26393r;
        if (bVar == null) {
            C1489j.m6973b("blurry");
        }
        return bVar;
    }

    /* renamed from: n */
    public void mo23234n() {
        this.f26391p = getIntent().getStringExtra("arg_path");
        this.f26394s.setFilterType(HomeActivity.f26585l.mo23408a());
        File a = C7370d.m39128a(C7370d.m39128a(getFilesDir(), "detector"), String.valueOf(System.currentTimeMillis()));
        C1489j.m6969a((Object) a, "dir");
        this.f26392q = new C7363a(a.getPath()).mo23454a(true);
        Context context = this;
        this.f26393r = new C7249b(context);
        this.f26390o = new C7365c(context);
        C7365c cVar = this.f26390o;
        if (cVar == null) {
            C1489j.m6973b("detector");
        }
        cVar.mo23461a((C7367b) this);
        C7365c cVar2 = this.f26390o;
        if (cVar2 == null) {
            C1489j.m6973b("detector");
        }
        cVar2.mo23459a();
        C3303c.m15106a((C0656h) this).mo10837a(this.f26391p).mo10667b(C3369h.m15421b(C3529j.f9432b).mo10669b(true)).mo10823a((ImageView) mo23231c(C7192a.imgBackground));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        CharSequence charSequence = this.f26395t;
        if ((charSequence == null || charSequence.length() == 0) && bundle != null) {
            bundle.getString("arg_result_path");
        }
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        if (this.f26395t != null && bundle != null) {
            String str = "arg_result_path";
            String str2 = this.f26395t;
            if (str2 == null) {
                C1489j.m6968a();
            }
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public void mo23306a(int i, String str) {
        C1489j.m6972b(str, "mess");
        String str2 = this.f26387l;
        StringBuilder sb = new StringBuilder();
        sb.append(":onError ");
        sb.append(str);
        Log.d(str2, sb.toString());
        runOnUiThread(new C7237g(this, i, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m38646e(String str) {
        new C7223a(this).mo23269a((int) R.string.msg_unknow_error).mo23274a(false).mo23279b(false).mo23276b((int) R.string.msg_restart_application).mo23270a(17039379, (C7224b) new C7242l(this)).mo23277b((int) R.string.btn_send_feedback, (C7224b) new C7243m(this, str)).mo23287j().show();
    }

    /* renamed from: w */
    public void mo23316w() {
        Log.d(this.f26387l, ":onDetectorOnline ");
        runOnUiThread(new C7236f(this));
        C7365c cVar = this.f26390o;
        if (cVar == null) {
            C1489j.m6973b("detector");
        }
        String str = this.f26391p;
        if (str == null) {
            C1489j.m6968a();
        }
        C7363a aVar = this.f26392q;
        if (aVar == null) {
            C1489j.m6968a();
        }
        cVar.mo23460a(str, aVar);
    }

    /* renamed from: x */
    public void mo23317x() {
        Log.d(this.f26387l, ":onDetectorOffline ");
    }

    /* renamed from: a */
    public void mo23307a(String str) {
        C1489j.m6972b(str, "resultFolder");
        String str2 = this.f26387l;
        StringBuilder sb = new StringBuilder();
        sb.append(": onDetectorFinished ");
        sb.append(str);
        Log.d(str2, sb.toString());
        runOnUiThread(new C7234e(this));
    }

    /* renamed from: c_ */
    public void mo23310c_(int i) {
        if (!mo23315t_()) {
            this.f26394s.setAlphaEmoji(i);
            ImageView imageView = (ImageView) mo23231c(C7192a.imgPreview);
            C1489j.m6969a((Object) imageView, "imgPreview");
            imageView.setAlpha(((float) i) / 100.0f);
        }
    }

    /* renamed from: a */
    public void mo23308a(ITexture iTexture) {
        C1489j.m6972b(iTexture, "texture");
        if (!mo23315t_()) {
            this.f26394s.setTextureType(iTexture);
            m38636a(this.f26394s);
        }
    }

    /* renamed from: a */
    public void mo23304a(float f) {
        if (!mo23315t_()) {
            this.f26394s.setBlurLevel(f);
            m38636a(this.f26394s);
        }
    }

    /* renamed from: a */
    public void mo23305a(int i) {
        Log.d(this.f26387l, "onToolsItemClick: ");
        if (!mo23315t_()) {
            switch (i) {
                case R.id.containerAlpha /*2131296385*/:
                    m38639a((C7257b) C7255a.f26447a.mo23342a(this.f26394s.getAlphaEmoji()));
                    break;
                case R.id.containerBokeh /*2131296386*/:
                    m38639a((C7257b) BokehFragment.f26451a.mo23345a());
                    break;
                case R.id.containerCreater /*2131296394*/:
                    startActivityForResult(new Intent(this, EmojiCreaterActivity.class), this.f26389n);
                    break;
                case R.id.containerFocus /*2131296399*/:
                    m38652z();
                    break;
                case R.id.containerLevel /*2131296404*/:
                    m38639a((C7257b) C7269c.f26473a.mo23362a(this.f26394s.blurLevel()));
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C7365c cVar = this.f26390o;
        if (cVar == null) {
            C1489j.m6973b("detector");
        }
        cVar.mo23463c();
        C7365c cVar2 = this.f26390o;
        if (cVar2 == null) {
            C1489j.m6973b("detector");
        }
        cVar2.mo23462b();
        super.onDestroy();
    }

    /* renamed from: s */
    public void mo23255s() {
        AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView) mo23231c(C7192a.scanProgress);
        C1489j.m6969a((Object) aVLoadingIndicatorView, "scanProgress");
        aVLoadingIndicatorView.setVisibility(0);
    }

    /* renamed from: r */
    public void mo23254r() {
        AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView) mo23231c(C7192a.scanProgress);
        C1489j.m6969a((Object) aVLoadingIndicatorView, "scanProgress");
        aVLoadingIndicatorView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final String m38651y() {
        this.f26394s.saveBestConfig();
        C7363a aVar = this.f26392q;
        if (aVar == null) {
            C1489j.m6968a();
        }
        String d = aVar.mo23457d();
        C7363a aVar2 = this.f26392q;
        if (aVar2 == null) {
            C1489j.m6968a();
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(new File(d, aVar2.mo23455b()).getPath());
        C7363a aVar3 = this.f26392q;
        if (aVar3 == null) {
            C1489j.m6968a();
        }
        String d2 = aVar3.mo23457d();
        C7363a aVar4 = this.f26392q;
        if (aVar4 == null) {
            C1489j.m6968a();
        }
        Bitmap decodeFile2 = BitmapFactory.decodeFile(new File(d2, aVar4.mo23456c()).getPath());
        C7249b bVar = this.f26393r;
        if (bVar == null) {
            C1489j.m6973b("blurry");
        }
        C1489j.m6969a((Object) decodeFile, "layer1");
        Bitmap a = bVar.mo23332a(decodeFile, decodeFile2, this.f26394s.getAlphaEmoji());
        String str = this.f26387l;
        StringBuilder sb = new StringBuilder();
        sb.append(": ");
        sb.append(this.f26394s.getAlphaEmoji());
        Log.d(str, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(System.currentTimeMillis()));
        sb2.append(".png");
        String sb3 = sb2.toString();
        File a2 = C7370d.m39128a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "EmojiPhoto");
        if (!a2.exists()) {
            a2.mkdirs();
        }
        C7370d.m39133a((Context) this, a2, a, sb3);
        String path = new File(a2, sb3).getPath();
        C1489j.m6969a((Object) path, "File(dir, fileName).path");
        return path;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public final void m38636a(IEffect iEffect) {
        if (!mo23315t_()) {
            mo23255s();
            C0164b.m466a((Callable<? extends T>) new C7230a<Object>(this, iEffect)).mo356b(C0255a.m681a()).mo353a(C0158a.m458a()).mo351a((C0185d<? super T>) new C7231b<Object>(this));
        }
    }

    @SuppressLint({"CheckResult"})
    @OnClick
    public final void onSaveClick() {
        if (!mo23315t_()) {
            mo23255s();
            C0164b.m466a((Callable<? extends T>) new C7238h<Object>(this)).mo356b(C0255a.m681a()).mo353a(C0158a.m458a()).mo351a((C0185d<? super T>) new C7239i<Object>(this));
        }
    }

    /* renamed from: a */
    public void mo23201a(boolean z) {
        if (!isFinishing()) {
            m38648f(this.f26395t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m38648f(String str) {
        Intent intent = new Intent(this, ResultDetailActivity.class);
        intent.putExtra("arg_path", str);
        startActivity(intent);
    }

    /* renamed from: t_ */
    public boolean mo23315t_() {
        AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView) mo23231c(C7192a.scanProgress);
        C1489j.m6969a((Object) aVLoadingIndicatorView, "scanProgress");
        boolean z = aVLoadingIndicatorView.getVisibility() == 0;
        if (z) {
            Toast.makeText(this, R.string.msg_is_busy, 0).show();
        }
        return z;
    }

    /* renamed from: z */
    private final void m38652z() {
        if (!mo23315t_()) {
            Intent intent = new Intent(this, BackgroundEditorActivity.class);
            String str = "arg_path";
            C7363a aVar = this.f26392q;
            if (aVar == null) {
                C1489j.m6968a();
            }
            String d = aVar.mo23457d();
            C7363a aVar2 = this.f26392q;
            if (aVar2 == null) {
                C1489j.m6968a();
            }
            intent.putExtra(str, new File(d, aVar2.mo23455b()).getPath());
            String str2 = "arg_folder";
            C7363a aVar3 = this.f26392q;
            if (aVar3 == null) {
                C1489j.m6968a();
            }
            intent.putExtra(str2, aVar3.mo23457d());
            startActivityForResult(intent, this.f26388m);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f26388m) {
            if (i2 == -1) {
                Log.d(this.f26387l, ":onActivityResult update mask");
                m38636a(this.f26394s);
            }
        } else if (i == this.f26389n && i2 == -1 && intent != null) {
            Log.d(this.f26387l, ":onActivityResult update mask");
            String stringExtra = intent.getStringExtra("arg_emoji_path");
            CharSequence charSequence = stringExtra;
            if (charSequence == null || charSequence.length() == 0) {
                String string = getString(R.string.msg_unknow_error);
                C1489j.m6969a((Object) string, "getString(R.string.msg_unknow_error)");
                mo23248b(string);
                return;
            }
            IEffect iEffect = this.f26394s;
            C1489j.m6969a((Object) stringExtra, "stringExtra");
            iEffect.setTextureType(new DefaultTexture(stringExtra));
            m38636a(this.f26394s);
        }
    }

    /* renamed from: A */
    private final C0647g m38629A() {
        return mo2158f().mo2225a((int) R.id.frmEditor);
    }

    /* renamed from: B */
    private final void m38630B() {
        C0690s a = mo2158f().mo2228a();
        a.mo1968a(R.anim.slide_in, R.anim.slide_out, R.anim.slide_in, R.anim.slide_out);
        C0647g a2 = mo2158f().mo2225a((int) R.id.frmEditor);
        if (a2 != null) {
            a.mo1971a(a2);
        }
        a.mo1986c();
    }

    /* renamed from: a */
    private final void m38639a(C7257b bVar) {
        C0647g a = mo2158f().mo2225a((int) R.id.frmEditor);
        if (a == null || !a.mo2134x()) {
            C0690s a2 = mo2158f().mo2228a();
            a2.mo1968a(R.anim.slide_in, R.anim.slide_out, R.anim.slide_in, R.anim.slide_out);
            a2.mo1980b(R.id.frmEditor, bVar);
            a2.mo1986c();
        } else if (C1489j.m6971a((Object) a.getClass().getSimpleName(), (Object) bVar.getClass().getSimpleName())) {
            m38630B();
        } else {
            C0690s a3 = mo2158f().mo2228a();
            a3.mo1968a(R.anim.slide_in, R.anim.slide_out, R.anim.slide_in, R.anim.slide_out);
            a3.mo1980b(R.id.frmEditor, bVar);
            a3.mo1986c();
        }
    }

    public void onBackPressed() {
        if (mo23315t_()) {
            new C7223a(this).mo23269a((int) R.string.title_cancel_scan_image).mo23276b((int) R.string.msg_cancel_scan_image).mo23277b(17039370, (C7224b) new C7232c(this)).mo23270a(17039369, (C7224b) null).mo23287j().show();
            return;
        }
        C0647g A = m38629A();
        String str = this.f26387l;
        StringBuilder sb = new StringBuilder();
        sb.append(": ");
        sb.append(String.valueOf(A));
        Log.d(str, sb.toString());
        if (m38629A() != null) {
            if (A == null) {
                C1489j.m6968a();
            }
            if (A.mo2134x()) {
                m38630B();
                return;
            }
        }
        new Thread(new C7233d(this)).start();
        super.onBackPressed();
    }

    /* renamed from: b */
    public void mo23309b() {
        m38631C();
    }

    /* renamed from: C */
    private final void m38631C() {
        File D = m38632D();
        StringBuilder sb = new StringBuilder();
        sb.append("url ->>> ");
        sb.append(C6792a.m35902a().mo21365a("emoji_url_bokeh_market"));
        Log.d("refreshNewestFromServer", sb.toString());
        String a = C6792a.m35902a().mo21365a("emoji_url_bokeh_market");
        if (a != null) {
            if (!(a.length() == 0)) {
                C6707e.m35606a().mo21211a(a).mo21219a(D).mo14137a((C4738f) C7240j.f26410a).mo14138a((C4739g<? super TResult>) new C7241k<Object>(this, D));
            }
        }
    }

    /* renamed from: D */
    private final File m38632D() {
        File a = C7370d.m39130a(getCacheDir(), "bokeh_version", "bokeh_market", "json");
        C1489j.m6969a((Object) a, "FileUtil.createFile(cach…, \"bokeh_market\", \"json\")");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final int m38633E() {
        String str;
        File F = m38634F();
        if (F.exists()) {
            str = C7370d.m39134a(F);
            C1489j.m6969a((Object) str, "FileUtil.readJson(bokehDataFile)");
        } else {
            str = C7370d.m39131a((Context) this, (int) R.raw.bokeh_market);
            C1489j.m6969a((Object) str, "FileUtil.readFileFromRaw…this, R.raw.bokeh_market)");
        }
        BokehMarketWrapper bokehMarketWrapper = (BokehMarketWrapper) new C4299e().mo13132a(str, BokehMarketWrapper.class);
        if ((bokehMarketWrapper != null ? bokehMarketWrapper.getBokeh() : null) != null) {
            return bokehMarketWrapper.getBokeh().size();
        }
        return 0;
    }

    /* renamed from: F */
    private final File m38634F() {
        File filesDir = getFilesDir();
        C1489j.m6969a((Object) filesDir, "filesDir");
        File a = C7370d.m39130a(filesDir, "bokeh_version", "bokeh_market", "json");
        C1489j.m6969a((Object) a, "FileUtil.createFile(dir,…, \"bokeh_market\", \"json\")");
        return a;
    }

    public void showTutGetMoreEmoji(View view) {
        C1489j.m6972b(view, "view");
        Log.d(this.f26387l, ": showTutGetMoreEmoji");
        new C3254a(this).mo10468b("get_more_emoji").mo10463a(view).mo10464a(getString(R.string.msg_tut_get_more_emoji)).mo10462a(17).mo10465a(false).mo10467b(300).mo10466a().mo10437a();
    }
}
