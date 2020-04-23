package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.save;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.p064v7.widget.GridLayoutManager;
import android.support.p064v7.widget.RecyclerView;
import android.support.p064v7.widget.RecyclerView.C1153a;
import android.view.View;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p272a.C7182a;
import judi.com.kottlinbase.p272a.C7182a.C7186a;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.result.ResultDetailActivity;
import judi.com.kottlinbase.quickads.banner.WaterfallBanner;
import p000a.p013b.C0164b;
import p000a.p013b.p014a.p016b.C0158a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p031g.C0255a;
import p073b.C3218m;
import p073b.p074a.C1406e;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0016J$\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo10386c = {"Ljudi/com/kottlinbase/save/SaveResultActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/kottlinbase/utils/ItemClickSupport$OnItemClickListener;", "()V", "lastPosition", "", "result", "", "", "createPresenter", "getLayoutId", "getResultList", "loadResultSync", "", "onAdsClose", "finished", "", "onDestroy", "onInit", "onItemClicked", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "position", "v", "Landroid/view/View;", "openDetail", "path", "app_release"})
/* compiled from: SaveResultActivity.kt */
public final class SaveResultActivity extends C7218a<C7271c<?>> implements C7186a {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final List<String> f26352l = new ArrayList();

    /* renamed from: m */
    private int f26353m;

    /* renamed from: n */
    private HashMap f26354n;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "", "", "call"})
    /* renamed from: judi.com.kottlinbase.save.SaveResultActivity$a */
    /* compiled from: SaveResultActivity.kt */
    static final class C7212a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ SaveResultActivity f26355a;

        C7212a(SaveResultActivity saveResultActivity) {
            this.f26355a = saveResultActivity;
        }

        /* renamed from: a */
        public final List<String> call() {
            return this.f26355a.m38536x();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "accept"})
    /* renamed from: judi.com.kottlinbase.save.SaveResultActivity$b */
    /* compiled from: SaveResultActivity.kt */
    static final class C7213b<T> implements C0185d<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ SaveResultActivity f26356a;

        C7213b(SaveResultActivity saveResultActivity) {
            this.f26356a = saveResultActivity;
        }

        /* renamed from: a */
        public final void mo381a(List<String> list) {
            this.f26356a.mo23254r();
            this.f26356a.f26352l.clear();
            List b = this.f26356a.f26352l;
            C1489j.m6969a((Object) list, "it");
            b.addAll(list);
            RecyclerView recyclerView = (RecyclerView) this.f26356a.mo23231c(C7192a.recyclerView);
            C1489j.m6969a((Object) recyclerView, "recyclerView");
            C1153a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.mo4780d();
            }
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26354n == null) {
            this.f26354n = new HashMap();
        }
        View view = (View) this.f26354n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26354n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_save_result;
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
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
        ((RecyclerView) mo23231c(C7192a.recyclerView)).setHasFixedSize(true);
        RecyclerView recyclerView2 = (RecyclerView) mo23231c(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView2, "recyclerView");
        recyclerView2.setAdapter(new C7214a(context, this.f26352l));
        C7182a.m38386a((RecyclerView) mo23231c(C7192a.recyclerView)).mo23118a((C7186a) this);
        m38535w();
    }

    /* renamed from: w */
    private final void m38535w() {
        mo23255s();
        C0164b.m466a((Callable<? extends T>) new C7212a<Object>(this)).mo356b(C0255a.m681a()).mo353a(C0158a.m458a()).mo351a((C0185d<? super T>) new C7213b<Object>(this));
    }

    /* renamed from: a */
    public void mo23122a(RecyclerView recyclerView, int i, View view) {
        this.f26353m = i;
        if (!mo23253q().mo23211b(20, false)) {
            m38533a((String) this.f26352l.get(i));
        }
    }

    /* renamed from: a */
    public void mo23201a(boolean z) {
        if (this.f26353m < this.f26352l.size()) {
            m38533a((String) this.f26352l.get(this.f26353m));
        }
    }

    /* renamed from: a */
    private final void m38533a(String str) {
        Intent intent = new Intent(this, ResultDetailActivity.class);
        intent.putExtra("arg_path", str);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final List<String> m38536x() {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "EmojiPhoto");
        List<String> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            C1406e.m6779b((Object[]) ((Comparable[]) listFiles));
            for (File file2 : listFiles) {
                C1489j.m6969a((Object) file2, "it");
                if (file2.isFile()) {
                    String path = file2.getPath();
                    C1489j.m6969a((Object) path, "it.path");
                    arrayList.add(0, path);
                }
            }
        }
        return arrayList;
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
