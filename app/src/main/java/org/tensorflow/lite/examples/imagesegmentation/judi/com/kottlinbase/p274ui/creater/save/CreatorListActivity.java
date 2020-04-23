package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater.save;

import android.content.Context;
import android.content.Intent;
import android.support.p064v7.widget.GridLayoutManager;
import android.support.p064v7.widget.RecyclerView;
import android.support.p064v7.widget.RecyclerView.C1153a;
import android.view.View;
import butterknife.OnClick;
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
import judi.com.kottlinbase.p274ui.creater.EmojiCreaterActivity;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7223a;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7224b;
import judi.com.kottlinbase.quickads.banner.WaterfallBanner;
import p000a.p013b.C0164b;
import p000a.p013b.p014a.p016b.C0158a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p031g.C0255a;
import p073b.C3218m;
import p073b.p074a.C1406e;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0007J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0016J$\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo10386c = {"Ljudi/com/kottlinbase/ui/creater/save/CreatorListActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/kottlinbase/utils/ItemClickSupport$OnItemClickListener;", "()V", "REQUEST_CREATE", "", "result", "", "", "createPresenter", "getLayoutId", "getResultList", "loadResultSync", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateClick", "onDestroy", "onInit", "onItemClicked", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "position", "v", "Landroid/view/View;", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.creater.save.CreatorListActivity */
/* compiled from: CreatorListActivity.kt */
public final class CreatorListActivity extends C7218a<C7271c<?>> implements C7186a {

    /* renamed from: l */
    private final int f26522l = 10001;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final List<String> f26523m = new ArrayList();

    /* renamed from: n */
    private HashMap f26524n;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "", "", "call"})
    /* renamed from: judi.com.kottlinbase.ui.creater.save.CreatorListActivity$a */
    /* compiled from: CreatorListActivity.kt */
    static final class C7287a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ CreatorListActivity f26525a;

        C7287a(CreatorListActivity creatorListActivity) {
            this.f26525a = creatorListActivity;
        }

        /* renamed from: a */
        public final List<String> call() {
            return this.f26525a.m38834x();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "accept"})
    /* renamed from: judi.com.kottlinbase.ui.creater.save.CreatorListActivity$b */
    /* compiled from: CreatorListActivity.kt */
    static final class C7288b<T> implements C0185d<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ CreatorListActivity f26526a;

        C7288b(CreatorListActivity creatorListActivity) {
            this.f26526a = creatorListActivity;
        }

        /* renamed from: a */
        public final void mo381a(List<String> list) {
            this.f26526a.mo23254r();
            this.f26526a.f26523m.clear();
            List a = this.f26526a.f26523m;
            C1489j.m6969a((Object) list, "it");
            a.addAll(list);
            RecyclerView recyclerView = (RecyclerView) this.f26526a.mo23231c(C7192a.recyclerView);
            C1489j.m6969a((Object) recyclerView, "recyclerView");
            C1153a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.mo4780d();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo10386c = {"judi/com/kottlinbase/ui/creater/save/CreatorListActivity$onItemClicked$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.creater.save.CreatorListActivity$c */
    /* compiled from: CreatorListActivity.kt */
    public static final class C7289c implements C7224b {

        /* renamed from: a */
        final /* synthetic */ CreatorListActivity f26527a;

        /* renamed from: b */
        final /* synthetic */ int f26528b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView f26529c;

        C7289c(CreatorListActivity creatorListActivity, int i, RecyclerView recyclerView) {
            this.f26527a = creatorListActivity;
            this.f26528b = i;
            this.f26529c = recyclerView;
        }

        /* renamed from: a */
        public void mo23288a(View view) {
            C1489j.m6972b(view, "v");
            if (this.f26528b >= 0 && this.f26528b < this.f26527a.f26523m.size()) {
                new File((String) this.f26527a.f26523m.get(this.f26528b)).delete();
                this.f26527a.f26523m.remove(this.f26528b);
                RecyclerView recyclerView = this.f26529c;
                if (recyclerView != null) {
                    C1153a adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.mo4780d();
                    }
                }
                this.f26527a.mo23253q().mo23211b(25, false);
            }
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26524n == null) {
            this.f26524n = new HashMap();
        }
        View view = (View) this.f26524n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26524n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_creator_list;
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
        recyclerView2.setAdapter(new C7291a(context, this.f26523m));
        C7182a.m38386a((RecyclerView) mo23231c(C7192a.recyclerView)).mo23118a((C7186a) this);
        m38833w();
    }

    /* renamed from: a */
    public void mo23122a(RecyclerView recyclerView, int i, View view) {
        new C7223a(this).mo23269a((int) R.string.title_delete_emoji).mo23276b((int) R.string.msg_delete_emoji).mo23270a(17039360, (C7224b) null).mo23277b(17039370, (C7224b) new C7289c(this, i, recyclerView)).mo23287j().show();
    }

    /* renamed from: w */
    private final void m38833w() {
        mo23255s();
        C0164b.m466a((Callable<? extends T>) new C7287a<Object>(this)).mo356b(C0255a.m681a()).mo353a(C0158a.m458a()).mo351a((C0185d<? super T>) new C7288b<Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final List<String> m38834x() {
        File file = new File(getFilesDir(), "bokeh/Creator");
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

    @OnClick
    public final void onCreateClick() {
        startActivityForResult(new Intent(this, EmojiCreaterActivity.class), this.f26522l);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.f26522l && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("arg_emoji_path");
            CharSequence charSequence = stringExtra;
            if (!(charSequence == null || charSequence.length() == 0)) {
                List<String> list = this.f26523m;
                C1489j.m6969a((Object) stringExtra, "path");
                list.add(0, stringExtra);
                RecyclerView recyclerView = (RecyclerView) mo23231c(C7192a.recyclerView);
                C1489j.m6969a((Object) recyclerView, "recyclerView");
                C1153a adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.mo4780d();
                }
            }
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
