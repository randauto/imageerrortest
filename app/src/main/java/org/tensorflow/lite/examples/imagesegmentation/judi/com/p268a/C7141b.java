package org.tensorflow.lite.examples.imagesegmentation.judi.com.p268a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.os.Bundle;
import android.os.Handler;
import android.support.p053v4.app.C0647g;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

import com.bumptech.glide.C3303c;
import com.bumptech.glide.load.C3419a;
import com.bumptech.glide.load.p164b.C3553q;
import com.bumptech.glide.p156f.C3368g;
import com.bumptech.glide.p156f.C3369h;
import com.bumptech.glide.p156f.p157a.C3353i;

import org.tensorflow.lite.examples.imagesegmentation.judi.com.p269b.C7160a;
import org.tensorflow.lite.examples.imagesegmentation.judi.com.p269b.C7170d;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;

import judi.com.C7139a;
import judi.com.p268a.C7153c.C7154a;
import judi.com.p268a.C7153c.C7156c;
import judi.com.p268a.C7153c.C7157d;
import judi.com.p268a.C7153c.C7158e;
import judi.com.p269b.C7160a.C7165d;
import judi.com.p269b.C7166b;
import judi.com.p271d.C7178c;
import judi.com.service.C7363a;
import judi.com.service.C7370d;
import p000a.p013b.C0164b;
import p000a.p013b.p014a.p016b.C0158a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p031g.C0255a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p145c.p146a.p147a.C3240c;
import p145c.p146a.p147a.C3242e;
import p145c.p146a.p147a.C3243f;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0014\u0010#\u001a\u0004\u0018\u00010\u00172\b\u0010$\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\bH\u0016J\b\u0010'\u001a\u00020 H\u0002J\u0012\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J$\u00100\u001a\u00020 2\u0006\u00101\u001a\u00020,2\b\u00102\u001a\u0004\u0018\u00010/2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\"H\u0002J\b\u00105\u001a\u00020 H\u0002J\b\u00106\u001a\u00020 H\u0002J\u0010\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020\"H\u0002J\b\u00109\u001a\u00020\u0005H\u0002J\b\u0010:\u001a\u00020 H\u0002J\u0010\u0010;\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006="}, mo10386c = {"Ljudi/com/bgremover/BgRemoveFragment;", "Ljudi/com/bgremover/BaseBgEditorFragment;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "aspectHeight", "", "aspectWidth", "config", "Ljudi/com/service/Config;", "drawingView", "Ljudi/com/erase/DrawingView;", "dv1", "Landroid/widget/ImageView;", "handler", "Landroid/os/Handler;", "myContext", "Landroid/content/Context;", "orgBitHeight", "orgBitWidth", "orgBitmap", "Landroid/graphics/Bitmap;", "parentHeight", "parentWidth", "path", "shaderView", "Ljudi/com/erase/ShaderView;", "spaceFolder", "createCurrentMask", "enableCutArea", "", "enable", "", "getGreenLayerBitmap", "b", "isBusy", "layoutId", "loadImage", "onAttach", "context", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInit", "view", "arg", "openMaskTut", "open", "setImageBitmap", "showFocusTutorial", "showLoading", "show", "updateMask", "updateMaskSync", "updateUiCutItem", "Companion", "bgremover_release"})
/* renamed from: judi.com.a.b */
/* compiled from: BgRemoveFragment.kt */
public final class C7141b extends C7140a implements OnClickListener {

    /* renamed from: a */
    public static final C7142a f26125a = new C7142a(null);
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public static Bitmap f26126ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public static BitmapShader f26127ap;

    /* renamed from: ag */
    private String f26128ag;

    /* renamed from: ah */
    private String f26129ah;

    /* renamed from: ai */
    private C7160a f26130ai;

    /* renamed from: aj */
    private ImageView f26131aj;

    /* renamed from: ak */
    private C7170d f26132ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public Handler f26133al = new Handler();

    /* renamed from: am */
    private C7363a f26134am;

    /* renamed from: an */
    private Context f26135an;

    /* renamed from: aq */
    private HashMap f26136aq;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f26137b = f26125a.getClass().getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f26138c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f26139d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f26140e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26141f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f26142g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f26143h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Bitmap f26144i;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, mo10386c = {"Ljudi/com/bgremover/BgRemoveFragment$Companion;", "", "()V", "inputBitmap", "Landroid/graphics/Bitmap;", "getInputBitmap", "()Landroid/graphics/Bitmap;", "setInputBitmap", "(Landroid/graphics/Bitmap;)V", "patternBMPshader", "Landroid/graphics/BitmapShader;", "getPatternBMPshader", "()Landroid/graphics/BitmapShader;", "setPatternBMPshader", "(Landroid/graphics/BitmapShader;)V", "newInstance", "Ljudi/com/bgremover/BgRemoveFragment;", "path", "", "spaceFolder", "bgremover_release"})
    /* renamed from: judi.com.a.b$a */
    /* compiled from: BgRemoveFragment.kt */
    public static final class C7142a {
        private C7142a() {
        }

        public /* synthetic */ C7142a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final Bitmap mo23037a() {
            return C7141b.f26126ao;
        }

        /* renamed from: a */
        public final void mo23039a(Bitmap bitmap) {
            C7141b.f26126ao = bitmap;
        }

        /* renamed from: b */
        public final BitmapShader mo23040b() {
            return C7141b.f26127ap;
        }

        /* renamed from: a */
        public final C7141b mo23038a(String str, String str2) {
            C1489j.m6972b(str, "path");
            C1489j.m6972b(str2, "spaceFolder");
            C7141b bVar = new C7141b();
            Bundle bundle = new Bundle();
            bundle.putString("arg_path", str);
            bundle.putString("arg_space_folder", str2);
            bVar.mo2102g(bundle);
            return bVar;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, mo10386c = {"judi/com/bgremover/BgRemoveFragment$loadImage$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/Bitmap;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "bgremover_release"})
    /* renamed from: judi.com.a.b$b */
    /* compiled from: BgRemoveFragment.kt */
    public static final class C7143b implements C3368g<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ C7141b f26145a;

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
        /* renamed from: judi.com.a.b$b$a */
        /* compiled from: BgRemoveFragment.kt */
        static final class C7144a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C7143b f26146a;

            /* renamed from: b */
            final /* synthetic */ C3553q f26147b;

            C7144a(C7143b bVar, C3553q qVar) {
                this.f26146a = bVar;
                this.f26147b = qVar;
            }

            public final void run() {
                this.f26146a.f26145a.m38228a(false);
                C7159d c = this.f26146a.f26145a.mo2013c();
                if (c != null) {
                    C3553q qVar = this.f26147b;
                    c.mo23056a(qVar != null ? qVar.getMessage() : null);
                }
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
        /* renamed from: judi.com.a.b$b$b */
        /* compiled from: BgRemoveFragment.kt */
        static final class C7145b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C7143b f26148a;

            C7145b(C7143b bVar) {
                this.f26148a = bVar;
            }

            public final void run() {
                this.f26148a.f26145a.m38228a(false);
                this.f26148a.f26145a.m38236ar();
            }
        }

        C7143b(C7141b bVar) {
            this.f26145a = bVar;
        }

        /* renamed from: a */
        public boolean mo10736a(C3553q qVar, Object obj, C3353i<Bitmap> iVar, boolean z) {
            Log.d(this.f26145a.f26137b, ": onLoadFailed");
            this.f26145a.f26133al.post(new C7144a(this, qVar));
            return true;
        }

        /* renamed from: a */
        public boolean mo10737a(Bitmap bitmap, Object obj, C3353i<Bitmap> iVar, C3419a aVar, boolean z) {
            C7141b.f26125a.mo23039a(bitmap);
            C7141b bVar = this.f26145a;
            Bitmap a = C7141b.f26125a.mo23037a();
            if (a == null) {
                C1489j.m6968a();
            }
            Bitmap a2 = C7141b.f26125a.mo23037a();
            if (a2 == null) {
                C1489j.m6968a();
            }
            bVar.f26144i = a.copy(a2.getConfig(), true);
            C7141b bVar2 = this.f26145a;
            Bitmap a3 = C7141b.f26125a.mo23037a();
            if (a3 == null) {
                C1489j.m6968a();
            }
            bVar2.f26138c = a3.getHeight();
            C7141b bVar3 = this.f26145a;
            Bitmap a4 = C7141b.f26125a.mo23037a();
            if (a4 == null) {
                C1489j.m6968a();
            }
            bVar3.f26139d = a4.getWidth();
            String a5 = this.f26145a.f26137b;
            StringBuilder sb = new StringBuilder();
            sb.append(":input size  ->> ");
            sb.append(this.f26145a.f26139d);
            sb.append('/');
            sb.append(this.f26145a.f26138c);
            Log.d(a5, sb.toString());
            float d = ((float) this.f26145a.f26140e) / ((float) Math.max(this.f26145a.f26139d, this.f26145a.f26138c));
            this.f26145a.f26142g = this.f26145a.f26140e;
            this.f26145a.f26143h = (int) (((float) this.f26145a.f26138c) * d);
            String a6 = this.f26145a.f26137b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(": rezie ratio ->>> ");
            sb2.append(d);
            Log.d(a6, sb2.toString());
            String a7 = this.f26145a.f26137b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(":aspect size  ->> ");
            sb3.append(this.f26145a.f26142g);
            sb3.append('/');
            sb3.append(this.f26145a.f26143h);
            Log.d(a7, sb3.toString());
            C7141b.f26125a.mo23039a(C7166b.m38309b(C7141b.f26125a.mo23037a(), this.f26145a.f26142g, this.f26145a.f26143h));
            this.f26145a.f26133al.post(new C7145b(this));
            return true;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, mo10386c = {"judi/com/bgremover/BgRemoveFragment$onInit$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "p0", "Landroid/widget/SeekBar;", "p1", "", "p2", "", "onStartTrackingTouch", "onStopTrackingTouch", "bgremover_release"})
    /* renamed from: judi.com.a.b$c */
    /* compiled from: BgRemoveFragment.kt */
    public static final class C7146c implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C7141b f26149a;

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        C7146c(C7141b bVar) {
            this.f26149a = bVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            String a = this.f26149a.f26137b;
            StringBuilder sb = new StringBuilder();
            sb.append(":offset ");
            SeekBar seekBar2 = (SeekBar) this.f26149a.mo23034d(C7156c.seedOffset);
            C1489j.m6969a((Object) seekBar2, "seedOffset");
            sb.append(seekBar2.getProgress());
            Log.d(a, sb.toString());
            if (!this.f26149a.m38231am()) {
                C7160a c = C7141b.m38243c(this.f26149a);
                SeekBar seekBar3 = (SeekBar) this.f26149a.mo23034d(C7156c.seedOffset);
                C1489j.m6969a((Object) seekBar3, "seedOffset");
                c.setOffset(seekBar3.getProgress() - 100);
                C7141b.m38243c(this.f26149a).invalidate();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, mo10386c = {"judi/com/bgremover/BgRemoveFragment$onInit$2", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "p0", "Landroid/widget/SeekBar;", "p1", "", "p2", "", "onStartTrackingTouch", "onStopTrackingTouch", "bgremover_release"})
    /* renamed from: judi.com.a.b$d */
    /* compiled from: BgRemoveFragment.kt */
    public static final class C7147d implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C7141b f26150a;

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        C7147d(C7141b bVar) {
            this.f26150a = bVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            String a = this.f26150a.f26137b;
            StringBuilder sb = new StringBuilder();
            sb.append(":size ");
            SeekBar seekBar2 = (SeekBar) this.f26150a.mo23034d(C7156c.seedSize);
            C1489j.m6969a((Object) seekBar2, "seedSize");
            sb.append(seekBar2.getProgress());
            Log.d(a, sb.toString());
            if (!this.f26150a.m38231am()) {
                SeekBar seekBar3 = (SeekBar) this.f26150a.mo23034d(C7156c.seedSize);
                C1489j.m6969a((Object) seekBar3, "seedSize");
                if (seekBar3.getProgress() > 10) {
                    C7160a c = C7141b.m38243c(this.f26150a);
                    SeekBar seekBar4 = (SeekBar) this.f26150a.mo23034d(C7156c.seedSize);
                    C1489j.m6969a((Object) seekBar4, "seedSize");
                    c.setRadius(seekBar4.getProgress());
                    C7141b.m38243c(this.f26150a).invalidate();
                }
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo10386c = {"judi/com/bgremover/BgRemoveFragment$onInit$3", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "bgremover_release"})
    /* renamed from: judi.com.a.b$e */
    /* compiled from: BgRemoveFragment.kt */
    public static final class C7148e implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C7141b f26151a;

        C7148e(C7141b bVar) {
            this.f26151a = bVar;
        }

        public void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f26151a.mo23034d(C7156c.main_rel_parent);
            C1489j.m6969a((Object) relativeLayout, "main_rel_parent");
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C7141b bVar = this.f26151a;
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f26151a.mo23034d(C7156c.main_rel_parent);
            C1489j.m6969a((Object) relativeLayout2, "main_rel_parent");
            bVar.f26140e = relativeLayout2.getWidth();
            C7141b bVar2 = this.f26151a;
            RelativeLayout relativeLayout3 = (RelativeLayout) this.f26151a.mo23034d(C7156c.main_rel_parent);
            C1489j.m6969a((Object) relativeLayout3, "main_rel_parent");
            bVar2.f26141f = relativeLayout3.getHeight();
            String a = this.f26151a.f26137b;
            StringBuilder sb = new StringBuilder();
            sb.append(":parent size  ->> ");
            sb.append(this.f26151a.f26140e);
            sb.append('/');
            sb.append(this.f26151a.f26141f);
            Log.d(a, sb.toString());
            this.f26151a.m38232an();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, mo10386c = {"judi/com/bgremover/BgRemoveFragment$setImageBitmap$1", "Ljudi/com/erase/DrawingView$UndoRedoListener;", "enableRedo", "", "var1", "", "var2", "", "enableUndo", "bgremover_release"})
    /* renamed from: judi.com.a.b$f */
    /* compiled from: BgRemoveFragment.kt */
    public static final class C7149f implements C7165d {

        /* renamed from: a */
        final /* synthetic */ C7141b f26152a;

        C7149f(C7141b bVar) {
            this.f26152a = bVar;
        }

        /* renamed from: a */
        public void mo23051a(boolean z, int i) {
            ImageButton imageButton = (ImageButton) this.f26152a.mo23034d(C7156c.btnRedo);
            C1489j.m6969a((Object) imageButton, "btnRedo");
            imageButton.setEnabled(z);
        }

        /* renamed from: b */
        public void mo23052b(boolean z, int i) {
            ImageButton imageButton = (ImageButton) this.f26152a.mo23034d(C7156c.btnUndo);
            C1489j.m6969a((Object) imageButton, "btnUndo");
            imageButton.setEnabled(z);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, mo10386c = {"judi/com/bgremover/BgRemoveFragment$showFocusTutorial$1", "Lme/toptas/fancyshowcase/DismissListener;", "onDismiss", "", "id", "", "onSkipped", "bgremover_release"})
    /* renamed from: judi.com.a.b$g */
    /* compiled from: BgRemoveFragment.kt */
    public static final class C7150g implements C3240c {

        /* renamed from: a */
        final /* synthetic */ C7141b f26153a;

        C7150g(C7141b bVar) {
            this.f26153a = bVar;
        }

        /* renamed from: a */
        public void mo10426a(String str) {
            C7139a.m38192a().mo23014a(true);
            this.f26153a.m38241b(true);
        }

        /* renamed from: b */
        public void mo10427b(String str) {
            C7139a.m38192a().mo23014a(true);
            this.f26153a.m38241b(true);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "call"})
    /* renamed from: judi.com.a.b$h */
    /* compiled from: BgRemoveFragment.kt */
    static final class C7151h<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C7141b f26154a;

        C7151h(C7141b bVar) {
            this.f26154a = bVar;
        }

        /* renamed from: a */
        public final String call() {
            return this.f26154a.m38235aq();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* renamed from: judi.com.a.b$i */
    /* compiled from: BgRemoveFragment.kt */
    static final class C7152i<T> implements C0185d<String> {

        /* renamed from: a */
        final /* synthetic */ C7141b f26155a;

        C7152i(C7141b bVar) {
            this.f26155a = bVar;
        }

        /* renamed from: a */
        public final void mo381a(String str) {
            if (((ProgressBar) this.f26155a.mo23034d(C7156c.progressBar)) != null) {
                ProgressBar progressBar = (ProgressBar) this.f26155a.mo23034d(C7156c.progressBar);
                C1489j.m6969a((Object) progressBar, "progressBar");
                progressBar.setVisibility(4);
            }
            C7159d c = this.f26155a.mo2013c();
            if (c != null) {
                c.mo23058v_();
            }
        }
    }

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23035e();
    }

    /* renamed from: d */
    public View mo23034d(int i) {
        if (this.f26136aq == null) {
            this.f26136aq = new HashMap();
        }
        View view = (View) this.f26136aq.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26136aq.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23035e() {
        if (this.f26136aq != null) {
            this.f26136aq.clear();
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ C7160a m38243c(C7141b bVar) {
        C7160a aVar = bVar.f26130ai;
        if (aVar == null) {
            C1489j.m6973b("drawingView");
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo2006a(Context context) {
        if (this.f26135an == null) {
            this.f26135an = context;
        }
        super.mo2006a(context);
    }

    /* renamed from: a */
    public void mo2007a(Bundle bundle) {
        if (this.f26135an == null) {
            this.f26135an = mo2120o();
        }
        super.mo2007a(bundle);
    }

    /* renamed from: d */
    public int mo23033d() {
        return C7157d.fragment_bg_remover;
    }

    /* renamed from: a */
    public void mo23032a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
        String str = null;
        this.f26128ag = bundle != null ? bundle.getString("arg_path") : null;
        if (bundle != null) {
            str = bundle.getString("arg_space_folder");
        }
        this.f26129ah = str;
        this.f26134am = new C7363a(this.f26129ah);
        if (this.f26128ag == null || this.f26129ah == null) {
            throw new RuntimeException("image path not found");
        }
        OnClickListener onClickListener = this;
        ((LinearLayout) mo23034d(C7156c.containerCut)).setOnClickListener(onClickListener);
        ((LinearLayout) mo23034d(C7156c.containerEraser)).setOnClickListener(onClickListener);
        ((Button) mo23034d(C7156c.btnDone)).setOnClickListener(onClickListener);
        ((ImageButton) mo23034d(C7156c.btnUndo)).setOnClickListener(onClickListener);
        ((ImageButton) mo23034d(C7156c.btnRedo)).setOnClickListener(onClickListener);
        ((ImageButton) mo23034d(C7156c.btnReset)).setOnClickListener(onClickListener);
        ((ImageButton) mo23034d(C7156c.btnCloseTut)).setOnClickListener(onClickListener);
        ((SeekBar) mo23034d(C7156c.seedOffset)).setOnSeekBarChangeListener(new C7146c(this));
        ((SeekBar) mo23034d(C7156c.seedSize)).setOnSeekBarChangeListener(new C7147d(this));
        m38245c(true);
        ImageButton imageButton = (ImageButton) mo23034d(C7156c.btnUndo);
        C1489j.m6969a((Object) imageButton, "btnUndo");
        imageButton.setEnabled(false);
        ImageButton imageButton2 = (ImageButton) mo23034d(C7156c.btnRedo);
        C1489j.m6969a((Object) imageButton2, "btnRedo");
        imageButton2.setEnabled(false);
        RelativeLayout relativeLayout = (RelativeLayout) mo23034d(C7156c.main_rel_parent);
        C1489j.m6969a((Object) relativeLayout, "main_rel_parent");
        relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C7148e(this));
        if (!C7139a.m38192a().mo23026i()) {
            m38233ao();
        }
        C3303c.m15105a((C0647g) this).mo10837a("https://firebasestorage.googleapis.com/v0/b/callcolor-c893a.appspot.com/o/photo_project%2Ftut%2Femoji_photo_tut.jpg?alt=media&token=ff4dadb5-ece1-4305-a926-39d08ca05af8").mo10667b(new C3369h().mo10679i()).mo10823a((ImageView) mo23034d(C7156c.imgTut));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m38228a(boolean z) {
        if (((ProgressBar) mo23034d(C7156c.progressBar)) != null) {
            ProgressBar progressBar = (ProgressBar) mo23034d(C7156c.progressBar);
            C1489j.m6969a((Object) progressBar, "progressBar");
            progressBar.setVisibility(z ? 0 : 4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: am */
    public final boolean m38231am() {
        if (((ProgressBar) mo23034d(C7156c.progressBar)) != null) {
            ProgressBar progressBar = (ProgressBar) mo23034d(C7156c.progressBar);
            C1489j.m6969a((Object) progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: an */
    public final void m38232an() {
        if (C7139a.m38192a().mo23026i()) {
            m38228a(true);
        }
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        C3303c.m15109b(m).mo10845f().mo10832a(this.f26128ag).mo10828a((C3368g<TranscodeType>) new C7143b<TranscodeType>(this)).mo10833b();
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i = C7156c.containerCut;
        if (valueOf != null && valueOf.intValue() == i) {
            m38245c(true);
            m38259m(true);
            return;
        }
        int i2 = C7156c.containerEraser;
        if (valueOf != null && valueOf.intValue() == i2) {
            m38245c(false);
            m38259m(false);
            return;
        }
        int i3 = C7156c.btnDone;
        if (valueOf != null && valueOf.intValue() == i3) {
            ImageButton imageButton = (ImageButton) mo23034d(C7156c.btnUndo);
            C1489j.m6969a((Object) imageButton, "btnUndo");
            if (imageButton.isEnabled()) {
                m38234ap();
                return;
            }
            C7159d c = mo2013c();
            if (c != null) {
                c.mo23057b();
                return;
            }
            return;
        }
        int i4 = C7156c.btnUndo;
        if (valueOf != null && valueOf.intValue() == i4) {
            C7160a aVar = this.f26130ai;
            if (aVar == null) {
                C1489j.m6973b("drawingView");
            }
            aVar.mo23063b();
            return;
        }
        int i5 = C7156c.btnRedo;
        if (valueOf != null && valueOf.intValue() == i5) {
            C7160a aVar2 = this.f26130ai;
            if (aVar2 == null) {
                C1489j.m6973b("drawingView");
            }
            aVar2.mo23060a();
            return;
        }
        int i6 = C7156c.btnReset;
        if (valueOf != null && valueOf.intValue() == i6) {
            m38233ao();
            return;
        }
        int i7 = C7156c.btnCloseTut;
        if (valueOf != null && valueOf.intValue() == i7) {
            m38241b(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m38241b(boolean z) {
        Animation loadAnimation = AnimationUtils.loadAnimation(mo2116m(), z ? C7154a.slide_down : C7154a.slide_up);
        C1489j.m6969a((Object) loadAnimation, "AnimationUtils.loadAnima…own else R.anim.slide_up)");
        ((RelativeLayout) mo23034d(C7156c.containerTutMask)).startAnimation(loadAnimation);
        RelativeLayout relativeLayout = (RelativeLayout) mo23034d(C7156c.containerTutMask);
        C1489j.m6969a((Object) relativeLayout, "containerTutMask");
        relativeLayout.setVisibility(z ? 0 : 8);
    }

    /* renamed from: ao */
    private final void m38233ao() {
        C3242e eVar = new C3242e();
        ProgressBar progressBar = (ProgressBar) mo23034d(C7156c.progressBar);
        C1489j.m6969a((Object) progressBar, "progressBar");
        View view = progressBar;
        String a = mo2054a(C7158e.msg_tut_zoom);
        C1489j.m6969a((Object) a, "getString(R.string.msg_tut_zoom)");
        C3243f a2 = mo23031a(view, a, 48);
        LinearLayout linearLayout = (LinearLayout) mo23034d(C7156c.containerCut);
        C1489j.m6969a((Object) linearLayout, "containerCut");
        View view2 = linearLayout;
        String a3 = mo2054a(C7158e.msg_tut_focus_area);
        C1489j.m6969a((Object) a3, "getString(R.string.msg_tut_focus_area)");
        C3242e a4 = eVar.mo10435a(mo23030a(view2, a3));
        LinearLayout linearLayout2 = (LinearLayout) mo23034d(C7156c.containerEraser);
        C1489j.m6969a((Object) linearLayout2, "containerEraser");
        View view3 = linearLayout2;
        String a5 = mo2054a(C7158e.msg_tut_clear_focus_area);
        C1489j.m6969a((Object) a5, "getString(R.string.msg_tut_clear_focus_area)");
        C3242e a6 = a4.mo10435a(mo23030a(view3, a5));
        LinearLayout linearLayout3 = (LinearLayout) mo23034d(C7156c.containerSeek);
        C1489j.m6969a((Object) linearLayout3, "containerSeek");
        View view4 = linearLayout3;
        String a7 = mo2054a(C7158e.msg_tut_brush_size);
        C1489j.m6969a((Object) a7, "getString(R.string.msg_tut_brush_size)");
        a6.mo10435a(mo23030a(view4, a7)).mo10435a(a2);
        a2.setDismissListener(new C7150g(this));
        eVar.mo10436a();
    }

    /* renamed from: ap */
    private final void m38234ap() {
        if (((ProgressBar) mo23034d(C7156c.progressBar)) != null) {
            ProgressBar progressBar = (ProgressBar) mo23034d(C7156c.progressBar);
            C1489j.m6969a((Object) progressBar, "progressBar");
            progressBar.setVisibility(0);
        }
        C0164b.m466a((Callable<? extends T>) new C7151h<Object>(this)).mo356b(C0255a.m681a()).mo353a(C0158a.m458a()).mo351a((C0185d<? super T>) new C7152i<Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: aq */
    public final String m38235aq() {
        Log.d(this.f26137b, ": updateMask");
        C7363a aVar = this.f26134am;
        if (aVar == null) {
            C1489j.m6973b("config");
        }
        String d = aVar.mo23457d();
        C7363a aVar2 = this.f26134am;
        if (aVar2 == null) {
            C1489j.m6973b("config");
        }
        File file = new File(d, aVar2.mo23453a());
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        C7160a aVar3 = this.f26130ai;
        if (aVar3 == null) {
            C1489j.m6973b("drawingView");
        }
        Bitmap finalBitmap = aVar3.getFinalBitmap();
        String str = this.f26137b;
        StringBuilder sb = new StringBuilder();
        sb.append(": final bitmap");
        C1489j.m6969a((Object) finalBitmap, "trimBitmap");
        sb.append(finalBitmap.getWidth());
        sb.append("/");
        sb.append(finalBitmap.getHeight());
        Log.d(str, sb.toString());
        Bitmap a = C7166b.m38306a(finalBitmap, this.f26139d, this.f26138c);
        String str2 = this.f26137b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(": final bitmap orig size ");
        sb2.append(this.f26139d);
        sb2.append("/");
        sb2.append(this.f26138c);
        Log.d(str2, sb2.toString());
        String str3 = this.f26137b;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(": final bitmap resize ");
        C1489j.m6969a((Object) a, "trimBitmap");
        sb3.append(a.getWidth());
        sb3.append("/");
        sb3.append(a.getHeight());
        Log.d(str3, sb3.toString());
        Context m = mo2116m();
        C7363a aVar4 = this.f26134am;
        if (aVar4 == null) {
            C1489j.m6973b("config");
        }
        File file2 = new File(aVar4.mo23457d());
        C7363a aVar5 = this.f26134am;
        if (aVar5 == null) {
            C1489j.m6973b("config");
        }
        C7370d.m39133a(m, file2, a, aVar5.mo23453a());
        Bitmap createBitmap = Bitmap.createBitmap(a.getWidth(), a.getHeight(), Config.ARGB_8888);
        C7178c cVar = new C7178c(this.f26135an, a, createBitmap);
        cVar.mo23103e();
        cVar.mo23101a(createBitmap);
        Context m2 = mo2116m();
        C7363a aVar6 = this.f26134am;
        if (aVar6 == null) {
            C1489j.m6973b("config");
        }
        File file3 = new File(aVar6.mo23457d());
        C7363a aVar7 = this.f26134am;
        if (aVar7 == null) {
            C1489j.m6973b("config");
        }
        C7370d.m39133a(m2, file3, createBitmap, aVar7.mo23458e());
        return "";
    }

    /* renamed from: c */
    private final void m38245c(boolean z) {
        ImageView imageView = (ImageView) mo23034d(C7156c.imgCut);
        C1489j.m6969a((Object) imageView, "imgCut");
        imageView.setSelected(z);
        TextView textView = (TextView) mo23034d(C7156c.tvCut);
        C1489j.m6969a((Object) textView, "tvCut");
        textView.setSelected(z);
        ImageView imageView2 = (ImageView) mo23034d(C7156c.imgEraser);
        C1489j.m6969a((Object) imageView2, "imgEraser");
        imageView2.setSelected(!z);
        TextView textView2 = (TextView) mo23034d(C7156c.tvEraser);
        C1489j.m6969a((Object) textView2, "tvEraser");
        textView2.setSelected(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: ar */
    public final void m38236ar() {
        this.f26130ai = new C7160a(mo2116m());
        this.f26131aj = new ImageView(mo2116m());
        C7160a aVar = this.f26130ai;
        if (aVar == null) {
            C1489j.m6973b("drawingView");
        }
        aVar.setAdjustViewBounds(true);
        ImageView imageView = this.f26131aj;
        if (imageView == null) {
            C1489j.m6973b("dv1");
        }
        imageView.setAdjustViewBounds(true);
        C7160a aVar2 = this.f26130ai;
        if (aVar2 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar2.setImageBitmap(m38237as());
        ImageView imageView2 = this.f26131aj;
        if (imageView2 == null) {
            C1489j.m6973b("dv1");
        }
        imageView2.setImageBitmap(m38238b(f26126ao));
        C7160a aVar3 = this.f26130ai;
        if (aVar3 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar3.mo23062a(true);
        C7160a aVar4 = this.f26130ai;
        if (aVar4 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar4.setMODE(0);
        C7160a aVar5 = this.f26130ai;
        if (aVar5 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar5.invalidate();
        C7160a aVar6 = this.f26130ai;
        if (aVar6 == null) {
            C1489j.m6973b("drawingView");
        }
        SeekBar seekBar = (SeekBar) mo23034d(C7156c.seedSize);
        C1489j.m6969a((Object) seekBar, "seedSize");
        aVar6.setRadius(seekBar.getProgress());
        C7160a aVar7 = this.f26130ai;
        if (aVar7 == null) {
            C1489j.m6973b("drawingView");
        }
        SeekBar seekBar2 = (SeekBar) mo23034d(C7156c.seedOffset);
        C1489j.m6969a((Object) seekBar2, "seedOffset");
        aVar7.setOffset(seekBar2.getProgress());
        C7160a aVar8 = this.f26130ai;
        if (aVar8 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar8.invalidate();
        this.f26132ak = new C7170d(mo2116m());
        C7170d dVar = this.f26132ak;
        if (dVar == null) {
            C1489j.m6973b("shaderView");
        }
        dVar.setLayoutParams(new LayoutParams(-1, -1));
        RelativeLayout relativeLayout = (RelativeLayout) mo23034d(C7156c.main_rel_parent);
        C7170d dVar2 = this.f26132ak;
        if (dVar2 == null) {
            C1489j.m6973b("shaderView");
        }
        relativeLayout.addView(dVar2);
        C7160a aVar9 = this.f26130ai;
        if (aVar9 == null) {
            C1489j.m6973b("drawingView");
        }
        C7170d dVar3 = this.f26132ak;
        if (dVar3 == null) {
            C1489j.m6973b("shaderView");
        }
        aVar9.setShaderView(dVar3);
        RelativeLayout relativeLayout2 = (RelativeLayout) mo23034d(C7156c.main_rel);
        C1489j.m6969a((Object) relativeLayout2, "this.main_rel");
        relativeLayout2.setScaleX(1.0f);
        RelativeLayout relativeLayout3 = (RelativeLayout) mo23034d(C7156c.main_rel);
        C1489j.m6969a((Object) relativeLayout3, "this.main_rel");
        relativeLayout3.setScaleY(1.0f);
        RelativeLayout relativeLayout4 = (RelativeLayout) mo23034d(C7156c.main_rel);
        C1489j.m6969a((Object) relativeLayout4, "this.main_rel");
        relativeLayout4.setTranslationX(0.0f);
        RelativeLayout relativeLayout5 = (RelativeLayout) mo23034d(C7156c.main_rel);
        C1489j.m6969a((Object) relativeLayout5, "this.main_rel");
        relativeLayout5.setTranslationY(0.0f);
        ((RelativeLayout) mo23034d(C7156c.main_rel)).removeAllViews();
        RelativeLayout relativeLayout6 = (RelativeLayout) mo23034d(C7156c.main_rel);
        ImageView imageView3 = this.f26131aj;
        if (imageView3 == null) {
            C1489j.m6973b("dv1");
        }
        relativeLayout6.addView(imageView3);
        RelativeLayout relativeLayout7 = (RelativeLayout) mo23034d(C7156c.main_rel);
        C7160a aVar10 = this.f26130ai;
        if (aVar10 == null) {
            C1489j.m6973b("drawingView");
        }
        relativeLayout7.addView(aVar10);
        C7160a aVar11 = this.f26130ai;
        if (aVar11 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar11.invalidate();
        C7160a aVar12 = this.f26130ai;
        if (aVar12 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar12.setUndoRedoListener(new C7149f(this));
        ((LinearLayout) mo23034d(C7156c.containerCut)).performClick();
    }

    /* renamed from: as */
    private final Bitmap m38237as() {
        C7363a aVar = this.f26134am;
        if (aVar == null) {
            C1489j.m6973b("config");
        }
        String d = aVar.mo23457d();
        C7363a aVar2 = this.f26134am;
        if (aVar2 == null) {
            C1489j.m6973b("config");
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(new File(d, aVar2.mo23453a()).getPath());
        if (decodeFile == null) {
            return Bitmap.createBitmap(this.f26142g, this.f26143h, Config.ARGB_8888);
        }
        String str = this.f26137b;
        StringBuilder sb = new StringBuilder();
        sb.append(":create current mask ");
        sb.append(decodeFile.getWidth());
        sb.append("/");
        sb.append(decodeFile.getHeight());
        Log.d(str, sb.toString());
        return C7166b.m38309b(decodeFile, this.f26142g, this.f26143h);
    }

    /* renamed from: m */
    private final void m38259m(boolean z) {
        if (z) {
            C7160a aVar = this.f26130ai;
            if (aVar == null) {
                C1489j.m6973b("drawingView");
            }
            aVar.setMODE(C7160a.f26157d);
            C7160a aVar2 = this.f26130ai;
            if (aVar2 == null) {
                C1489j.m6973b("drawingView");
            }
            aVar2.invalidate();
            return;
        }
        C7160a aVar3 = this.f26130ai;
        if (aVar3 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar3.setMODE(C7160a.f26161h);
        C7160a aVar4 = this.f26130ai;
        if (aVar4 == null) {
            C1489j.m6973b("drawingView");
        }
        aVar4.invalidate();
    }

    /* renamed from: b */
    private final Bitmap m38238b(Bitmap bitmap) {
        Config config;
        if (bitmap == null) {
            config = Config.ARGB_8888;
        } else {
            config = bitmap.getConfig();
            C1489j.m6969a((Object) config, "b.config");
        }
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setAlpha(90);
        Bitmap createBitmap = Bitmap.createBitmap(this.f26139d, this.f26138c, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(this.f26144i, 0.0f, 0.0f, null);
        canvas.drawRect(0.0f, 0.0f, (float) this.f26139d, (float) this.f26138c, paint);
        Bitmap createBitmap2 = Bitmap.createBitmap(this.f26139d, this.f26138c, config);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.drawColor(0);
        canvas2.drawBitmap(this.f26144i, 0.0f, 0.0f, null);
        f26127ap = new BitmapShader(C7166b.m38309b(createBitmap2, this.f26142g, this.f26143h), TileMode.REPEAT, TileMode.REPEAT);
        return C7166b.m38309b(createBitmap, this.f26142g, this.f26143h);
    }
}
