package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.gallery.market;

import android.content.Context;
import android.support.p064v7.widget.LinearLayoutManager;
import android.support.p064v7.widget.RecyclerView;
import android.support.p064v7.widget.RecyclerView.C1153a;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.p208d.C4738f;
import com.google.android.gms.p208d.C4739g;
import com.google.firebase.p234f.C6705d.C6706a;
import com.google.firebase.p234f.C6707e;
import com.google.firebase.p234f.C6709g;
import com.google.firebase.remoteconfig.C6792a;
import com.google.p187a.C4299e;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.model.BokehMarket;
import judi.com.kottlinbase.model.BokehMarketWrapper;
import judi.com.kottlinbase.p272a.C7182a;
import judi.com.kottlinbase.p272a.C7182a.C7186a;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7223a;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7224b;
import judi.com.kottlinbase.quickads.banner.AdmodBanner;
import judi.com.service.C7370d;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0014J\b\u0010\u0019\u001a\u00020\rH\u0016J$\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\rH\u0002J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, mo10386c = {"Ljudi/com/kottlinbase/ui/gallery/market/BokeBackgroundActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/kottlinbase/utils/ItemClickSupport$OnItemClickListener;", "()V", "lastPosition", "", "list", "", "Ljudi/com/kottlinbase/model/BokehMarket;", "resultCode", "createPresenter", "downloadBokeh", "", "bokeh", "dir", "Ljava/io/File;", "getBokehDataFile", "getLayoutId", "loadData", "onAdsClose", "finished", "", "onBackPressed", "onDestroy", "onInit", "onItemClicked", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "position", "v", "Landroid/view/View;", "refreshNewestFromServer", "startDownload", "bokehMarket", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.gallery.market.BokeBackgroundActivity */
/* compiled from: BokeBackgroundActivity.kt */
public final class BokeBackgroundActivity extends C7218a<C7271c<?>> implements C7186a {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final List<BokehMarket> f26537l = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f26538m;

    /* renamed from: n */
    private int f26539n;

    /* renamed from: o */
    private HashMap f26540o;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012 \u0005*\b\u0018\u00010\u0003R\u00020\u00040\u0003R\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "kotlin.jvm.PlatformType", "onSuccess"})
    /* renamed from: judi.com.kottlinbase.ui.gallery.market.BokeBackgroundActivity$a */
    /* compiled from: BokeBackgroundActivity.kt */
    static final class C7294a<TResult> implements C4739g<C6706a> {

        /* renamed from: a */
        final /* synthetic */ BokeBackgroundActivity f26541a;

        /* renamed from: b */
        final /* synthetic */ File f26542b;

        /* renamed from: c */
        final /* synthetic */ File f26543c;

        C7294a(BokeBackgroundActivity bokeBackgroundActivity, File file, File file2) {
            this.f26541a = bokeBackgroundActivity;
            this.f26542b = file;
            this.f26543c = file2;
        }

        /* renamed from: a */
        public final void mo14130a(C6706a aVar) {
            this.f26541a.mo23254r();
            if (this.f26541a.isFinishing()) {
                return;
            }
            if (this.f26542b.exists()) {
                C7370d.m39135a(this.f26542b, this.f26543c);
                BokeBackgroundActivity bokeBackgroundActivity = this.f26541a;
                String string = this.f26541a.getString(R.string.msg_bokeh_downloaded);
                C1489j.m6969a((Object) string, "getString(R.string.msg_bokeh_downloaded)");
                bokeBackgroundActivity.mo23248b(string);
                this.f26541a.f26538m = -1;
                return;
            }
            BokeBackgroundActivity bokeBackgroundActivity2 = this.f26541a;
            String string2 = this.f26541a.getString(R.string.msg_unknow_error);
            C1489j.m6969a((Object) string2, "getString(R.string.msg_unknow_error)");
            bokeBackgroundActivity2.mo23248b(string2);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "exception", "Ljava/lang/Exception;", "onFailure"})
    /* renamed from: judi.com.kottlinbase.ui.gallery.market.BokeBackgroundActivity$b */
    /* compiled from: BokeBackgroundActivity.kt */
    static final class C7295b implements C4738f {

        /* renamed from: a */
        final /* synthetic */ BokeBackgroundActivity f26544a;

        C7295b(BokeBackgroundActivity bokeBackgroundActivity) {
            this.f26544a = bokeBackgroundActivity;
        }

        /* renamed from: a */
        public final void mo14129a(Exception exc) {
            String str;
            C1489j.m6972b(exc, "exception");
            this.f26544a.mo23254r();
            BokeBackgroundActivity bokeBackgroundActivity = this.f26544a;
            if (exc.getMessage() == null) {
                str = this.f26544a.getString(R.string.msg_unknow_error);
            } else {
                str = exc.getMessage();
                if (str == null) {
                    C1489j.m6968a();
                }
            }
            C1489j.m6969a((Object) str, "if (exception.message ==… else exception.message!!");
            bokeBackgroundActivity.mo23248b(str);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012 \u0005*\b\u0018\u00010\u0003R\u00020\u00040\u0003R\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "kotlin.jvm.PlatformType", "onProgress"})
    /* renamed from: judi.com.kottlinbase.ui.gallery.market.BokeBackgroundActivity$c */
    /* compiled from: BokeBackgroundActivity.kt */
    static final class C7296c<TProgress> implements C6709g<C6706a> {

        /* renamed from: a */
        final /* synthetic */ BokeBackgroundActivity f26545a;

        C7296c(BokeBackgroundActivity bokeBackgroundActivity) {
            this.f26545a = bokeBackgroundActivity;
        }

        /* renamed from: a */
        public final void mo21215a(C6706a aVar) {
            if (!this.f26545a.isFinishing()) {
                try {
                    C1489j.m6969a((Object) aVar, "it");
                    long a = (aVar.mo21209a() * ((long) 100)) / aVar.mo21210b();
                    BokeBackgroundActivity bokeBackgroundActivity = this.f26545a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f26545a.getString(R.string.msg_downloading));
                    sb.append(" ");
                    sb.append(a);
                    sb.append("%");
                    bokeBackgroundActivity.mo23249c(sb.toString());
                } catch (Exception unused) {
                }
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/gallery/market/BokeBackgroundActivity$onItemClicked$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.gallery.market.BokeBackgroundActivity$d */
    /* compiled from: BokeBackgroundActivity.kt */
    public static final class C7297d implements C7224b {

        /* renamed from: a */
        final /* synthetic */ BokeBackgroundActivity f26546a;

        C7297d(BokeBackgroundActivity bokeBackgroundActivity) {
            this.f26546a = bokeBackgroundActivity;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            this.f26546a.mo23259v();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onFailure"})
    /* renamed from: judi.com.kottlinbase.ui.gallery.market.BokeBackgroundActivity$e */
    /* compiled from: BokeBackgroundActivity.kt */
    static final class C7298e implements C4738f {

        /* renamed from: a */
        final /* synthetic */ BokeBackgroundActivity f26547a;

        C7298e(BokeBackgroundActivity bokeBackgroundActivity) {
            this.f26547a = bokeBackgroundActivity;
        }

        /* renamed from: a */
        public final void mo14129a(Exception exc) {
            C1489j.m6972b(exc, "it");
            if (!this.f26547a.isFinishing()) {
                ProgressBar progressBar = (ProgressBar) this.f26547a.mo23231c(C7192a.progress_bar);
                C1489j.m6969a((Object) progressBar, "progress_bar");
                progressBar.setVisibility(8);
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012 \u0005*\b\u0018\u00010\u0003R\u00020\u00040\u0003R\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "kotlin.jvm.PlatformType", "onSuccess"})
    /* renamed from: judi.com.kottlinbase.ui.gallery.market.BokeBackgroundActivity$f */
    /* compiled from: BokeBackgroundActivity.kt */
    static final class C7299f<TResult> implements C4739g<C6706a> {

        /* renamed from: a */
        final /* synthetic */ BokeBackgroundActivity f26548a;

        /* renamed from: b */
        final /* synthetic */ File f26549b;

        C7299f(BokeBackgroundActivity bokeBackgroundActivity, File file) {
            this.f26548a = bokeBackgroundActivity;
            this.f26549b = file;
        }

        /* renamed from: a */
        public final void mo14130a(C6706a aVar) {
            if (!this.f26548a.isFinishing()) {
                ProgressBar progressBar = (ProgressBar) this.f26548a.mo23231c(C7192a.progress_bar);
                C1489j.m6969a((Object) progressBar, "progress_bar");
                progressBar.setVisibility(8);
                String a = C7370d.m39134a(this.f26549b);
                StringBuilder sb = new StringBuilder();
                sb.append(": ");
                sb.append(a);
                Log.d("refreshNewestFromServer", sb.toString());
                BokehMarketWrapper bokehMarketWrapper = (BokehMarketWrapper) new C4299e().mo13132a(a, BokehMarketWrapper.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(bokehMarketWrapper.getBokeh().size());
                sb2.append("/");
                sb2.append(this.f26548a.f26537l.size());
                Log.d("refreshNewestFromServer", sb2.toString());
                if ((bokehMarketWrapper != null ? bokehMarketWrapper.getBokeh() : null) != null && bokehMarketWrapper.getBokeh().size() != this.f26548a.f26537l.size()) {
                    new C7223a(this.f26548a).mo23276b((int) R.string.msg_new_bokeh_available).mo23270a((int) R.string.btn_refresh, (C7224b) new C7224b(this) {

                        /* renamed from: a */
                        final /* synthetic */ C7299f f26550a;

                        {
                            this.f26550a = r1;
                        }

                        /* renamed from: a */
                        public void mo23288a(View view) {
                            C1489j.m6972b(view, "v");
                            this.f26550a.f26548a.m38858y();
                        }
                    }).mo23287j().show();
                }
            }
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26540o == null) {
            this.f26540o = new HashMap();
        }
        View view = (View) this.f26540o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26540o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_bokeh_market;
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
        recyclerView.setAdapter(new C7301a(context, this.f26537l));
        RecyclerView recyclerView2 = (RecyclerView) mo23231c(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView2, "recyclerView");
        recyclerView2.setLayoutManager(new LinearLayoutManager(context));
        C7182a.m38386a((RecyclerView) mo23231c(C7192a.recyclerView)).mo23118a((C7186a) this);
        m38858y();
        m38856w();
    }

    /* renamed from: w */
    private final void m38856w() {
        ProgressBar progressBar = (ProgressBar) mo23231c(C7192a.progress_bar);
        C1489j.m6969a((Object) progressBar, "progress_bar");
        boolean z = false;
        progressBar.setVisibility(0);
        File x = m38857x();
        String a = C6792a.m35902a().mo21365a("emoji_url_bokeh_market");
        if (a != null) {
            if (a.length() == 0) {
                z = true;
            }
            if (!z) {
                C6707e.m35606a().mo21211a(C6792a.m35902a().mo21365a("emoji_url_bokeh_market")).mo21219a(x).mo14137a((C4738f) new C7298e(this)).mo14138a((C4739g<? super TResult>) new C7299f<Object>(this, x));
            }
        }
    }

    /* renamed from: x */
    private final File m38857x() {
        File filesDir = getFilesDir();
        C1489j.m6969a((Object) filesDir, "filesDir");
        File a = C7370d.m39130a(filesDir, "bokeh_version", "bokeh_market", "json");
        C1489j.m6969a((Object) a, "FileUtil.createFile(dir,…, \"bokeh_market\", \"json\")");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m38858y() {
        String str;
        File x = m38857x();
        if (x.exists()) {
            str = C7370d.m39134a(x);
            C1489j.m6969a((Object) str, "FileUtil.readJson(bokehDataFile)");
        } else {
            str = C7370d.m39131a((Context) this, (int) R.raw.bokeh_market);
            C1489j.m6969a((Object) str, "FileUtil.readFileFromRaw…this, R.raw.bokeh_market)");
        }
        BokehMarketWrapper bokehMarketWrapper = (BokehMarketWrapper) new C4299e().mo13132a(str, BokehMarketWrapper.class);
        if ((bokehMarketWrapper != null ? bokehMarketWrapper.getBokeh() : null) != null) {
            this.f26537l.clear();
            this.f26537l.addAll(bokehMarketWrapper.getBokeh());
        }
        RecyclerView recyclerView = (RecyclerView) mo23231c(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView, "recyclerView");
        C1153a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.mo4780d();
        }
    }

    /* renamed from: a */
    public void mo23122a(RecyclerView recyclerView, int i, View view) {
        if (21 < ((BokehMarket) this.f26537l.get(i)).getMinVersion()) {
            new C7223a(this).mo23276b((int) R.string.msg_require_update_app).mo23270a(17039379, (C7224b) new C7297d(this)).mo23277b(17039369, (C7224b) null).mo23287j().show();
            return;
        }
        if (!mo23253q().mo23211b(50, false)) {
            m38852a((BokehMarket) this.f26537l.get(i));
        } else {
            this.f26539n = i;
        }
    }

    /* renamed from: a */
    public void mo23201a(boolean z) {
        if (this.f26539n >= 0 && this.f26539n < this.f26537l.size()) {
            m38852a((BokehMarket) this.f26537l.get(this.f26539n));
        }
    }

    /* renamed from: a */
    private final void m38852a(BokehMarket bokehMarket) {
        m38853a(bokehMarket, new File(getFilesDir(), "bokeh"));
    }

    /* renamed from: a */
    private final void m38853a(BokehMarket bokehMarket, File file) {
        File a = C7370d.m39129a(getCacheDir(), "bokeh", "zip");
        File file2 = new File(file, bokehMarket.getFolder());
        if (file2.exists() && file2.listFiles() != null) {
            File[] listFiles = file2.listFiles();
            C1489j.m6969a((Object) listFiles, "destDir.listFiles()");
            if (!(listFiles.length == 0)) {
                String string = getString(R.string.msg_bokeh_has_download);
                C1489j.m6969a((Object) string, "getString(R.string.msg_bokeh_has_download)");
                mo23248b(string);
                return;
            }
        }
        mo23255s();
        C6707e.m35606a().mo21211a(bokehMarket.getUrl()).mo21219a(a).mo14138a((C4739g<? super TResult>) new C7294a<Object>(this, a, file2)).mo14137a((C4738f) new C7295b(this)).mo21226a((C6709g<? super TResult>) new C7296c<Object>(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        AdmodBanner admodBanner = (AdmodBanner) mo23231c(C7192a.adsBanner);
        if (admodBanner != null) {
            admodBanner.mo23220a();
        }
    }

    public void onBackPressed() {
        setResult(this.f26538m);
        super.onBackPressed();
    }
}
