package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.picker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.support.p053v4.app.C0656h;
import android.support.p053v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.load.C3419a;
import com.bumptech.glide.load.p164b.C3553q;
import com.bumptech.glide.p156f.C3368g;
import com.bumptech.glide.p156f.C3369h;
import com.bumptech.glide.p156f.p157a.C3353i;
import com.judi.emojiphoto.R;
import com.zhihu.matisse.C6904a;
import com.zhihu.matisse.C6907b;
import com.zhihu.matisse.C6909c.C6917h;
import com.zhihu.matisse.internal.p248a.C6927a;
import com.zhihu.matisse.internal.p248a.C6929b;
import com.zhihu.matisse.internal.p248a.C6931d;
import com.zhihu.matisse.p243a.C6905a;
import com.zhihu.matisse.p243a.p244a.C6906a;
import com.zhihu.matisse.p247d.C6923b;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.blurry.BlurryActivity;
import judi.com.kottlinbase.quickads.banner.WaterfallBanner;
import judi.com.service.C7370d;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0014J$\u0010\u001d\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0016J\u0016\u0010!\u001a\u00020\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160#H\u0002J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, mo10386c = {"Ljudi/com/kottlinbase/ui/picker/ImagePickerActivity;", "Lcom/zhihu/matisse/ui/MatisseActivity;", "Ljudi/com/kottlinbase/ui/picker/PickerView;", "()V", "containerHeader", "Landroid/view/View;", "progress", "Landroid/widget/ProgressBar;", "tvAlbumName", "Landroid/widget/TextView;", "containerId", "", "emptyView", "getLayoutId", "initViews", "", "isBusy", "", "onAlbumClick", "pos", "onAlbumSelected", "album", "Lcom/zhihu/matisse/internal/entity/Album;", "onCaptionResult", "uri", "Landroid/net/Uri;", "path", "", "onDestroy", "onMediaClick", "item", "Lcom/zhihu/matisse/internal/entity/Item;", "adapterPosition", "showAlbumList", "albumList", "", "start", "viewPager", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.picker.ImagePickerActivity */
/* compiled from: ImagePickerActivity.kt */
public final class ImagePickerActivity extends C6923b implements C7342c {

    /* renamed from: m */
    public static final C7333a f26630m = new C7333a(null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ProgressBar f26631n;

    /* renamed from: o */
    private TextView f26632o;

    /* renamed from: p */
    private View f26633p;

    /* renamed from: q */
    private HashMap f26634q;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo10386c = {"Ljudi/com/kottlinbase/ui/picker/ImagePickerActivity$Companion;", "", "()V", "openPicker", "", "a", "Landroid/app/Activity;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.picker.ImagePickerActivity$a */
    /* compiled from: ImagePickerActivity.kt */
    public static final class C7333a {
        private C7333a() {
        }

        public /* synthetic */ C7333a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo23420a(Activity activity) {
            C1489j.m6972b(activity, "a");
            C6904a.m36052a(activity).mo21560a(C6907b.m36067a()).mo21580b(true).mo21574a((int) C6917h.Matisse_Dracula).mo21577a(false).mo21579b(9).mo21582c(false).mo21581c(10).mo21576a(new C6929b(true, activity.getPackageName(), "Camera")).mo21575a((C6905a) new C6906a()).mo21578a(1, ImagePickerActivity.class);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* renamed from: judi.com.kottlinbase.ui.picker.ImagePickerActivity$b */
    /* compiled from: ImagePickerActivity.kt */
    static final class C7334b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImagePickerActivity f26635a;

        C7334b(ImagePickerActivity imagePickerActivity) {
            this.f26635a = imagePickerActivity;
        }

        public final void onClick(View view) {
            ImagePickerActivity imagePickerActivity = this.f26635a;
            List list = this.f26635a.f24311k;
            C1489j.m6969a((Object) list, "albumList");
            imagePickerActivity.m39005a(list);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, mo10386c = {"judi/com/kottlinbase/ui/picker/ImagePickerActivity$start$2", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/Bitmap;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.picker.ImagePickerActivity$c */
    /* compiled from: ImagePickerActivity.kt */
    public static final class C7335c implements C3368g<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ ImagePickerActivity f26636a;

        /* renamed from: b */
        final /* synthetic */ File f26637b;

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
        /* renamed from: judi.com.kottlinbase.ui.picker.ImagePickerActivity$c$a */
        /* compiled from: ImagePickerActivity.kt */
        static final class C7336a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C7335c f26638a;

            /* renamed from: b */
            final /* synthetic */ C3553q f26639b;

            C7336a(C7335c cVar, C3553q qVar) {
                this.f26638a = cVar;
                this.f26639b = qVar;
            }

            public final void run() {
                Toast.makeText(this.f26638a.f26636a, String.valueOf(this.f26639b), 0).show();
                ProgressBar a = this.f26638a.f26636a.f26631n;
                if (a != null) {
                    a.setVisibility(8);
                }
            }
        }

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo10386c = {"<anonymous>", "", "run"})
        /* renamed from: judi.com.kottlinbase.ui.picker.ImagePickerActivity$c$b */
        /* compiled from: ImagePickerActivity.kt */
        static final class C7337b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C7335c f26640a;

            /* renamed from: b */
            final /* synthetic */ String f26641b;

            C7337b(C7335c cVar, String str) {
                this.f26640a = cVar;
                this.f26641b = str;
            }

            public final void run() {
                ProgressBar a = this.f26640a.f26636a.f26631n;
                if (a != null) {
                    a.setVisibility(8);
                }
                Intent intent = new Intent(this.f26640a.f26636a, BlurryActivity.class);
                intent.putExtra("arg_path", new File(this.f26640a.f26637b, this.f26641b).getPath());
                this.f26640a.f26636a.startActivity(intent);
            }
        }

        C7335c(ImagePickerActivity imagePickerActivity, File file) {
            this.f26636a = imagePickerActivity;
            this.f26637b = file;
        }

        /* renamed from: a */
        public boolean mo10736a(C3553q qVar, Object obj, C3353i<Bitmap> iVar, boolean z) {
            this.f26636a.runOnUiThread(new C7336a(this, qVar));
            return true;
        }

        /* renamed from: a */
        public boolean mo10737a(Bitmap bitmap, Object obj, C3353i<Bitmap> iVar, C3419a aVar, boolean z) {
            String str = "dddd";
            StringBuilder sb = new StringBuilder();
            sb.append("input size  ->>> ");
            Integer num = null;
            sb.append(bitmap != null ? Integer.valueOf(bitmap.getWidth()) : null);
            sb.append("/");
            if (bitmap != null) {
                num = Integer.valueOf(bitmap.getHeight());
            }
            sb.append(num);
            Log.d(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(System.currentTimeMillis()));
            sb2.append(".");
            sb2.append("jpg");
            String sb3 = sb2.toString();
            C7370d.m39132a(this.f26636a, CompressFormat.JPEG, this.f26637b, bitmap, sb3);
            this.f26636a.runOnUiThread(new C7337b(this, sb3));
            return true;
        }
    }

    /* renamed from: d */
    public View mo23419d(int i) {
        if (this.f26634q == null) {
            this.f26634q = new HashMap();
        }
        View view = (View) this.f26634q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26634q.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo21588l() {
        return R.layout.activity_image_picker;
    }

    /* renamed from: m */
    public int mo21589m() {
        return R.id.container;
    }

    /* renamed from: n */
    public int mo21590n() {
        return R.id.empty_view;
    }

    /* renamed from: o */
    public int mo21591o() {
        return R.id.viewPagerAlbum;
    }

    /* renamed from: p */
    public void mo21597p() {
        this.f26631n = (ProgressBar) findViewById(R.id.progressLoad);
        this.f26632o = (TextView) findViewById(R.id.tvHeader);
        this.f26633p = findViewById(R.id.headerContainer);
        View view = this.f26633p;
        if (view != null) {
            view.setOnClickListener(new C7334b(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m39005a(List<? extends C6927a> list) {
        C7340b.f26645ag.mo23428a(list).mo2008a(mo2158f(), "AlbumListDialogFragment");
    }

    /* renamed from: a */
    public void mo21586a(C6927a aVar, C6931d dVar, int i) {
        if (!m39007q()) {
            if ((dVar != null ? dVar.mo21614a() : null) != null) {
                String uri = dVar.mo21614a().toString();
                C1489j.m6969a((Object) uri, "item.contentUri.toString()");
                m39004a(uri);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m39007q() {
        /*
            r4 = this;
            android.widget.ProgressBar r0 = r4.f26631n
            r1 = 0
            if (r0 == 0) goto L_0x0014
            android.widget.ProgressBar r0 = r4.f26631n
            if (r0 != 0) goto L_0x000c
            p073b.p079e.p081b.C1489j.m6968a()
        L_0x000c:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0024
            r2 = r4
            android.content.Context r2 = (android.content.Context) r2
            r3 = 2131689633(0x7f0f00a1, float:1.9008287E38)
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r3, r1)
            r1.show()
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: judi.com.kottlinbase.p274ui.picker.ImagePickerActivity.m39007q():boolean");
    }

    /* renamed from: a */
    public void mo21584a(Uri uri, String str) {
        File file = new File(str);
        if (file.exists()) {
            String path = file.getPath();
            C1489j.m6969a((Object) path, "file.path");
            m39004a(path);
        }
    }

    /* renamed from: a */
    private final void m39004a(String str) {
        File a = C7370d.m39128a(getFilesDir(), "input");
        if (a.listFiles() != null && a.listFiles().length > 3) {
            File[] listFiles = a.listFiles();
            C1489j.m6969a((Object) listFiles, "dir.listFiles()");
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        ProgressBar progressBar = this.f26631n;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        C3303c.m15106a((C0656h) this).mo10845f().mo10832a(str).mo10667b(C3369h.m15419a().mo10653a(1026)).mo10828a((C3368g<TranscodeType>) new C7335c<TranscodeType>(this, a)).mo10833b();
    }

    /* renamed from: a */
    public void mo21585a(C6927a aVar) {
        super.mo21585a(aVar);
        if (aVar != null) {
            TextView textView = this.f26632o;
            if (textView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.mo21602a((Context) this));
                sb.append(" (");
                sb.append(aVar.mo21604c());
                sb.append(")");
                textView.setText(sb.toString());
            }
        }
    }

    /* renamed from: c */
    public void mo23418c(int i) {
        if (i < this.f24311k.size()) {
            ViewPager viewPager = this.f24312l;
            if (viewPager != null) {
                viewPager.mo3031a(i, false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WaterfallBanner waterfallBanner = (WaterfallBanner) mo23419d(C7192a.adsBanner);
        if (waterfallBanner != null) {
            waterfallBanner.mo23224a();
        }
    }
}
