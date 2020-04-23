package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.p053v4.app.C0656h;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.C3415j;
import com.bumptech.glide.load.p164b.C3529j;
import com.bumptech.glide.p156f.C3369h;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.p271d.C7176a;
import judi.com.p271d.C7180e;
import judi.com.service.C7363a;
import judi.com.service.C7370d;
import p000a.p013b.C0164b;
import p000a.p013b.p014a.p016b.C0158a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p031g.C0255a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/TestActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "()V", "blurry", "Ljudi/com/kottlinbase/ui/blurry/Blurry;", "config", "Ljudi/com/service/Config;", "input", "", "createPresenter", "getLayoutId", "", "onInit", "", "testScript", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.TestActivity */
/* compiled from: TestActivity.kt */
public final class TestActivity extends C7218a<C7271c<?>> {

    /* renamed from: l */
    public static final C7245a f26420l = new C7245a(null);

    /* renamed from: p */
    private static String f26421p = "dilated_mask.jpg";

    /* renamed from: q */
    private static String f26422q = "dilated_mask.jpg";

    /* renamed from: m */
    private C7363a f26423m;

    /* renamed from: n */
    private String f26424n;

    /* renamed from: o */
    private C7249b f26425o = new C7249b(this);

    /* renamed from: r */
    private HashMap f26426r;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/TestActivity$Companion;", "", "()V", "dilatedMask", "", "getDilatedMask", "()Ljava/lang/String;", "setDilatedMask", "(Ljava/lang/String;)V", "erodedMask", "getErodedMask", "setErodedMask", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.TestActivity$a */
    /* compiled from: TestActivity.kt */
    public static final class C7245a {
        private C7245a() {
        }

        public /* synthetic */ C7245a(C1486g gVar) {
            this();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "call"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.TestActivity$b */
    /* compiled from: TestActivity.kt */
    static final class C7246b<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ TestActivity f26427a;

        C7246b(TestActivity testActivity) {
            this.f26427a = testActivity;
        }

        /* renamed from: a */
        public final String call() {
            return this.f26427a.m38685w();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.TestActivity$c */
    /* compiled from: TestActivity.kt */
    static final class C7247c<T> implements C0185d<String> {

        /* renamed from: a */
        final /* synthetic */ TestActivity f26428a;

        C7247c(TestActivity testActivity) {
            this.f26428a = testActivity;
        }

        /* renamed from: a */
        public final void mo381a(String str) {
            this.f26428a.mo23254r();
            C3303c.m15106a((C0656h) this.f26428a).mo10837a(str).mo10667b(new C3369h().mo10656a(C3529j.f9432b)).mo10823a((ImageView) this.f26428a.mo23231c(C7192a.img));
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26426r == null) {
            this.f26426r = new HashMap();
        }
        View view = (View) this.f26426r.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26426r.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_test_blurry;
    }

    /* renamed from: m */
    public C7271c<?> mo23233m() {
        return null;
    }

    /* renamed from: n */
    public void mo23234n() {
        File a = C7370d.m39128a(C7370d.m39128a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "detector"), "1552617791860");
        C1489j.m6969a((Object) a, "createDir");
        this.f26423m = new C7363a(a.getPath());
        String path = new File(a, "input.png").getPath();
        C1489j.m6969a((Object) path, "File(createDir, \"input.png\").path");
        this.f26424n = path;
        C3415j a2 = C3303c.m15106a((C0656h) this);
        String str = this.f26424n;
        if (str == null) {
            C1489j.m6973b("input");
        }
        a2.mo10837a(str).mo10667b(new C3369h().mo10656a(C3529j.f9432b)).mo10823a((ImageView) mo23231c(C7192a.imgBg));
        mo23255s();
        C0164b.m466a((Callable<? extends T>) new C7246b<Object>(this)).mo356b(C0255a.m681a()).mo353a(C0158a.m458a()).mo351a((C0185d<? super T>) new C7247c<Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final String m38685w() {
        String str = this.f26424n;
        if (str == null) {
            C1489j.m6973b("input");
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        C7363a aVar = this.f26423m;
        if (aVar == null) {
            C1489j.m6973b("config");
        }
        Bitmap decodeFile2 = BitmapFactory.decodeFile(new File(aVar.mo23457d(), "raw_mask.jpg").getPath());
        C1489j.m6969a((Object) decodeFile, "inputBitmap");
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), decodeFile.getConfig());
        Context context = this;
        C7180e eVar = new C7180e(context, decodeFile2, decodeFile, createBitmap);
        eVar.mo23103e();
        eVar.mo23101a(decodeFile);
        C7176a aVar2 = new C7176a(context, decodeFile, createBitmap);
        aVar2.mo23103e();
        aVar2.mo23101a(createBitmap);
        String str2 = "abc.png";
        C7363a aVar3 = this.f26423m;
        if (aVar3 == null) {
            C1489j.m6973b("config");
        }
        C7370d.m39133a(context, new File(aVar3.mo23457d()), createBitmap, str2);
        C7363a aVar4 = this.f26423m;
        if (aVar4 == null) {
            C1489j.m6973b("config");
        }
        String path = new File(aVar4.mo23457d(), str2).getPath();
        C1489j.m6969a((Object) path, "File(config.outPutDir, fileName).path");
        return path;
    }
}
