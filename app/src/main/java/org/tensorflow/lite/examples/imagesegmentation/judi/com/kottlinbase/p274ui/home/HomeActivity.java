package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Parcelable;
import android.support.p053v4.app.C0647g;
import android.support.p053v4.app.C0656h;
import android.support.p053v4.app.C0663l;
import android.support.p053v4.app.C0689r;
import android.support.p053v4.view.ViewPager;
import android.support.p064v7.widget.LinearLayoutManager;
import android.support.p064v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import butterknife.OnClick;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.load.C3419a;
import com.bumptech.glide.load.p164b.C3553q;
import com.bumptech.glide.p156f.C3368g;
import com.bumptech.glide.p156f.C3369h;
import com.bumptech.glide.p156f.p157a.C3353i;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import judi.com.C7139a;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p272a.C7182a;
import judi.com.kottlinbase.p272a.C7182a.C7186a;
import judi.com.kottlinbase.p272a.C7189c;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.HeaderBar;
import judi.com.kottlinbase.p274ui.HeaderBar.C7217b;
import judi.com.kottlinbase.p274ui.blurry.BlurryActivity;
import judi.com.kottlinbase.p274ui.other.OtherAppActivity;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7223a;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7224b;
import judi.com.kottlinbase.p274ui.picker.ImagePickerActivity;
import judi.com.kottlinbase.p274ui.rate.RateActivity;
import judi.com.kottlinbase.quickads.banner.AdmodNativeBanner;
import judi.com.kottlinbase.save.SaveResultActivity;
import judi.com.service.C7370d;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p073b.p143j.C3199m;
import p254d.p255a.C6972a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u00032\u00020\u0004:\u000234B\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0014J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J$\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u000eH\u0007J+\u0010#\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0%2\u0006\u0010&\u001a\u00020'H\u0016¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u000eH\u0007J\b\u0010*\u001a\u00020\u000eH\u0007J\b\u0010+\u001a\u00020\u000eH\u0007J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.H\u0007J\b\u0010/\u001a\u00020\u000eH\u0007J\b\u00100\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/HomeActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/kottlinbase/utils/ItemClickSupport$OnItemClickListener;", "Ljudi/com/kottlinbase/ui/home/HomeView;", "()V", "actionAfterPermission", "", "recentPhotos", "", "", "createPresenter", "getLayoutId", "loadRecentPhoto", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAdsClose", "finished", "", "onBackPressed", "onDestroy", "onFilterCardClick", "filterType", "onInit", "onItemClicked", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "position", "v", "Landroid/view/View;", "onRateUsClick", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSaveClick", "onStatClick", "onStorageNeverAsk", "onStorageRationale", "request", "Lpermissions/dispatcher/PermissionRequest;", "onStorageReady", "openPicker", "start", "path", "Companion", "FilterCardAdapter", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.home.HomeActivity */
/* compiled from: HomeActivity.kt */
public final class HomeActivity extends C7218a<C7271c<?>> implements C7186a, C7328d {

    /* renamed from: l */
    public static final C7312a f26585l = new C7312a(null);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static int f26586o = 1;

    /* renamed from: m */
    private final List<String> f26587m = new ArrayList();

    /* renamed from: n */
    private int f26588n;

    /* renamed from: p */
    private HashMap f26589p;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/HomeActivity$Companion;", "", "()V", "LOAD_RECENT", "", "OPEN_PICKER", "RECEIVE_SEND", "REQUEST_PICKER", "currentFilterType", "getCurrentFilterType", "()I", "setCurrentFilterType", "(I)V", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.HomeActivity$a */
    /* compiled from: HomeActivity.kt */
    public static final class C7312a {
        private C7312a() {
        }

        public /* synthetic */ C7312a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo23408a() {
            return HomeActivity.f26586o;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/HomeActivity$FilterCardAdapter;", "Landroid/support/v4/app/FragmentStatePagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "(Landroid/support/v4/app/FragmentManager;)V", "getCount", "", "getItem", "Landroid/support/v4/app/Fragment;", "p0", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.HomeActivity$b */
    /* compiled from: HomeActivity.kt */
    public static final class C7313b extends C0689r {
        /* renamed from: b */
        public int mo3219b() {
            return 4;
        }

        public C7313b(C0663l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public C0647g mo2368a(int i) {
            switch (i) {
                case 0:
                    return FilterCartFragment.f26577a.mo23401a(1);
                case 1:
                    return new CarCreatorFragment();
                case 2:
                    return EmojiCartFragment.f26567a.mo23398a(0);
                default:
                    return new C7324a();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/home/HomeActivity$onAdsClose$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.HomeActivity$c */
    /* compiled from: HomeActivity.kt */
    public static final class C7314c implements C7224b {

        /* renamed from: a */
        final /* synthetic */ HomeActivity f26590a;

        C7314c(HomeActivity homeActivity) {
            this.f26590a = homeActivity;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            this.f26590a.finish();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/home/HomeActivity$onBackPressed$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.HomeActivity$d */
    /* compiled from: HomeActivity.kt */
    public static final class C7315d implements C7224b {

        /* renamed from: a */
        final /* synthetic */ HomeActivity f26591a;

        C7315d(HomeActivity homeActivity) {
            this.f26591a = homeActivity;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            C7139a.m38192a().mo23023f();
            this.f26591a.onRateUsClick();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/home/HomeActivity$onBackPressed$2", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.HomeActivity$e */
    /* compiled from: HomeActivity.kt */
    public static final class C7316e implements C7224b {

        /* renamed from: a */
        final /* synthetic */ HomeActivity f26592a;

        C7316e(HomeActivity homeActivity) {
            this.f26592a = homeActivity;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            this.f26592a.finish();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/home/HomeActivity$onInit$1", "Ljudi/com/kottlinbase/ui/HeaderBar$SimpleHeaderBarListener;", "onHeaderRight1", "", "view", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.HomeActivity$f */
    /* compiled from: HomeActivity.kt */
    public static final class C7317f extends C7217b {

        /* renamed from: a */
        final /* synthetic */ HomeActivity f26593a;

        C7317f(HomeActivity homeActivity) {
            this.f26593a = homeActivity;
        }

        /* renamed from: b */
        public void mo23247b(View view) {
            try {
                this.f26593a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://sites.google.com/view/emojibackgroundchangerprivatep/home")));
            } catch (Exception e) {
                HomeActivity homeActivity = this.f26593a;
                String message = e.getMessage();
                if (message == null) {
                    C1489j.m6968a();
                }
                homeActivity.mo23248b(message);
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, mo10386c = {"judi/com/kottlinbase/ui/home/HomeActivity$start$2", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/Bitmap;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.HomeActivity$g */
    /* compiled from: HomeActivity.kt */
    public static final class C7318g implements C3368g<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ HomeActivity f26594a;

        /* renamed from: b */
        final /* synthetic */ File f26595b;

        C7318g(HomeActivity homeActivity, File file) {
            this.f26594a = homeActivity;
            this.f26595b = file;
        }

        /* renamed from: a */
        public boolean mo10736a(C3553q qVar, Object obj, C3353i<Bitmap> iVar, boolean z) {
            this.f26594a.mo23254r();
            this.f26594a.mo23248b(String.valueOf(qVar));
            return true;
        }

        /* renamed from: a */
        public boolean mo10737a(Bitmap bitmap, Object obj, C3353i<Bitmap> iVar, C3419a aVar, boolean z) {
            this.f26594a.mo23254r();
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
            C7370d.m39132a(this.f26594a, CompressFormat.JPEG, this.f26595b, bitmap, sb3);
            Intent intent = new Intent(this.f26594a, BlurryActivity.class);
            intent.putExtra("arg_path", new File(this.f26595b, sb3).getPath());
            this.f26594a.startActivity(intent);
            return true;
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26589p == null) {
            this.f26589p = new HashMap();
        }
        View view = (View) this.f26589p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26589p.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_home;
    }

    /* renamed from: m */
    public C7271c<?> mo23233m() {
        return null;
    }

    /* renamed from: n */
    public void mo23234n() {
        RecyclerView recyclerView = (RecyclerView) mo23231c(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView, "recyclerView");
        Context context = this;
        recyclerView.setAdapter(new C7329e(context, this.f26587m));
        RecyclerView recyclerView2 = (RecyclerView) mo23231c(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView2, "recyclerView");
        recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
        ((RecyclerView) mo23231c(C7192a.recyclerView)).setHasFixedSize(true);
        C7182a.m38386a((RecyclerView) mo23231c(C7192a.recyclerView)).mo23118a((C7186a) this);
        ViewPager viewPager = (ViewPager) mo23231c(C7192a.viewPager);
        C1489j.m6969a((Object) viewPager, "viewPager");
        viewPager.setAdapter(new C7313b(mo2158f()));
        ViewPager viewPager2 = (ViewPager) mo23231c(C7192a.viewPager);
        C1489j.m6969a((Object) viewPager2, "viewPager");
        viewPager2.setPageMargin(C7189c.f26296a.mo23125a(context, 16));
        Intent intent = getIntent();
        C1489j.m6969a((Object) intent, "intent");
        if (C1489j.m6971a((Object) intent.getAction(), (Object) "android.intent.action.SEND")) {
            Intent intent2 = getIntent();
            C1489j.m6969a((Object) intent2, "intent");
            if (intent2.getType() != null) {
                Intent intent3 = getIntent();
                C1489j.m6969a((Object) intent3, "intent");
                String type = intent3.getType();
                C1489j.m6969a((Object) type, "intent.type");
                if (C3199m.m14761b(type, "image/", false, 2, null)) {
                    this.f26588n = 2;
                    ((HeaderBar) mo23231c(C7192a.header)).setListener(new C7317f(this));
                }
            }
        }
        this.f26588n = 1;
        ((HeaderBar) mo23231c(C7192a.header)).setListener(new C7317f(this));
    }

    /* renamed from: w */
    public final void mo23316w() {
        int i = this.f26588n;
        if (i == 0) {
            return;
        }
        if (i != 2) {
            m38929z();
            return;
        }
        Parcelable parcelableExtra = getIntent().getParcelableExtra("android.intent.extra.STREAM");
        if (parcelableExtra != null) {
            String uri = ((Uri) parcelableExtra).toString();
            C1489j.m6969a((Object) uri, "uri.toString()");
            m38927a(uri);
            return;
        }
        throw new C3227u("null cannot be cast to non-null type android.net.Uri");
    }

    /* renamed from: z */
    private final void m38929z() {
        ImagePickerActivity.f26630m.mo23420a(this);
    }

    /* renamed from: a */
    public final void mo23402a(C6972a aVar) {
        C1489j.m6972b(aVar, "request");
        aVar.mo21703a();
    }

    /* renamed from: x */
    public final void mo23407x() {
        Toast.makeText(this, R.string.msg_goto_permission, 0).show();
        mo23258u();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C1489j.m6972b(strArr, "permissions");
        C1489j.m6972b(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C7327c.m38974a(this, i, iArr);
    }

    @OnClick
    public final void onStatClick() {
        this.f26588n = 1;
        C7327c.m38973a(this);
    }

    @OnClick
    public final void onRateUsClick() {
        startActivity(new Intent(this, RateActivity.class));
    }

    @OnClick
    public final void onSaveClick() {
        startActivity(new Intent(this, SaveResultActivity.class));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && intent != null) {
            String uri = intent.getData().toString();
            C1489j.m6969a((Object) uri, "uri.toString()");
            m38927a(uri);
        }
    }

    /* renamed from: a */
    public void mo23122a(RecyclerView recyclerView, int i, View view) {
        m38927a((String) this.f26587m.get(i));
    }

    /* renamed from: a */
    private final void m38927a(String str) {
        mo23255s();
        File a = C7370d.m39128a(getFilesDir(), "input");
        if (a.listFiles() != null && a.listFiles().length > 3) {
            File[] listFiles = a.listFiles();
            C1489j.m6969a((Object) listFiles, "dir.listFiles()");
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        C3303c.m15106a((C0656h) this).mo10845f().mo10832a(str).mo10667b(C3369h.m15419a().mo10653a(1026)).mo10828a((C3368g<TranscodeType>) new C7318g<TranscodeType>(this, a)).mo10833b();
    }

    public void onBackPressed() {
        if (C7139a.m38192a().mo23025h()) {
            C7139a.m38192a().mo23015b(System.currentTimeMillis());
            new C7223a(this).mo23279b(true).mo23274a(true).mo23269a((int) R.string.title_ask_rate).mo23276b((int) R.string.msg_ask_rate).mo23270a(17039379, (C7224b) new C7315d(this)).mo23277b(17039369, (C7224b) new C7316e(this)).mo23287j().show();
        } else if (!mo23253q().mo23211b(100, true)) {
            new OtherAppDialog().mo2008a(mo2158f(), "OtherAppDialog");
        }
    }

    /* renamed from: d */
    public void mo23403d(int i) {
        if (i != 0) {
            f26586o = i;
            this.f26588n = 1;
            C7327c.m38973a(this);
            return;
        }
        startActivity(new Intent(this, OtherAppActivity.class));
    }

    /* renamed from: a */
    public void mo23201a(boolean z) {
        new C7223a(this).mo23276b((int) R.string.msg_exit_app).mo23270a(17039370, (C7224b) new C7314c(this)).mo23277b(17039369, (C7224b) null).mo23287j().show();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        AdmodNativeBanner admodNativeBanner = (AdmodNativeBanner) mo23231c(C7192a.nativeAd);
        if (admodNativeBanner != null) {
            admodNativeBanner.mo23222a();
        }
    }
}
