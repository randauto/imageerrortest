package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry.editor.bokeh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p064v7.widget.LinearLayoutManager;
import android.support.p064v7.widget.RecyclerView;
import android.support.p064v7.widget.RecyclerView.C1153a;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import butterknife.OnClick;
import com.facebook.ads.AdError;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import judi.com.C7139a;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.model.DefaultTexture;
import judi.com.kottlinbase.model.ITexture;
import judi.com.kottlinbase.model.Settings;
import judi.com.kottlinbase.p272a.C7182a;
import judi.com.kottlinbase.p272a.C7182a.C7186a;
import judi.com.kottlinbase.p274ui.blurry.C7248a;
import judi.com.kottlinbase.p274ui.blurry.editor.C7257b;
import judi.com.kottlinbase.p274ui.gallery.market.BokeBackgroundActivity;
import p000a.p013b.C0164b;
import p000a.p013b.p014a.p016b.C0158a;
import p000a.p013b.p019d.C0185d;
import p000a.p013b.p031g.C0255a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0007J$\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehFragment;", "Ljudi/com/kottlinbase/ui/blurry/editor/BaseEditorFragment;", "Ljudi/com/kottlinbase/utils/ItemClickSupport$OnItemClickListener;", "()V", "REQUEST_DOWNLOAD_BOKEH", "", "bokehCatList", "", "", "boketCatAdapter", "Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehCatAdapter;", "textures", "Ljudi/com/kottlinbase/model/ITexture;", "getBokehCatList", "getTextureList", "layoutId", "loadBokehCatSync", "", "loadEffectSync", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onGetEmojiClick", "onInit", "view", "Landroid/view/View;", "arg", "Landroid/os/Bundle;", "savedInstanceState", "onItemClicked", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "position", "v", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.BokehFragment */
/* compiled from: BokehFragment.kt */
public final class BokehFragment extends C7257b implements C7186a {

    /* renamed from: a */
    public static final C7258a f26451a = new C7258a(null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f26452b = AdError.NO_FILL_ERROR_CODE;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<ITexture> f26453c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<String> f26454d = new ArrayList();

    /* renamed from: e */
    private C7265a f26455e;

    /* renamed from: f */
    private HashMap f26456f;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehFragment$Companion;", "", "()V", "newInstance", "Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehFragment;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.BokehFragment$a */
    /* compiled from: BokehFragment.kt */
    public static final class C7258a {
        private C7258a() {
        }

        public /* synthetic */ C7258a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final BokehFragment mo23345a() {
            return new BokehFragment();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "", "", "call"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.BokehFragment$b */
    /* compiled from: BokehFragment.kt */
    static final class C7259b<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ BokehFragment f26457a;

        C7259b(BokehFragment bokehFragment) {
            this.f26457a = bokehFragment;
        }

        /* renamed from: a */
        public final List<String> call() {
            return this.f26457a.m38728an();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "accept"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.BokehFragment$c */
    /* compiled from: BokehFragment.kt */
    static final class C7260c<T> implements C0185d<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ BokehFragment f26458a;

        C7260c(BokehFragment bokehFragment) {
            this.f26458a = bokehFragment;
        }

        /* renamed from: a */
        public final void mo381a(List<String> list) {
            this.f26458a.f26454d.clear();
            List a = this.f26458a.f26454d;
            C1489j.m6969a((Object) list, "it");
            a.addAll(list);
            C7265a c = BokehFragment.m38731c(this.f26458a);
            if (c != null) {
                c.mo4780d();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo10386c = {"<anonymous>", "", "Ljudi/com/kottlinbase/model/ITexture;", "call"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.BokehFragment$d */
    /* compiled from: BokehFragment.kt */
    static final class C7261d<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ BokehFragment f26459a;

        C7261d(BokehFragment bokehFragment) {
            this.f26459a = bokehFragment;
        }

        /* renamed from: a */
        public final List<ITexture> call() {
            return this.f26459a.m38729ao();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "", "Ljudi/com/kottlinbase/model/ITexture;", "kotlin.jvm.PlatformType", "accept"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.BokehFragment$e */
    /* compiled from: BokehFragment.kt */
    static final class C7262e<T> implements C0185d<List<? extends ITexture>> {

        /* renamed from: a */
        final /* synthetic */ BokehFragment f26460a;

        C7262e(BokehFragment bokehFragment) {
            this.f26460a = bokehFragment;
        }

        /* renamed from: a */
        public final void mo381a(List<? extends ITexture> list) {
            this.f26460a.f26453c.clear();
            List f = this.f26460a.f26453c;
            C1489j.m6969a((Object) list, "it");
            f.addAll(list);
            RecyclerView recyclerView = (RecyclerView) this.f26460a.mo23264d(C7192a.recyclerView);
            C1489j.m6969a((Object) recyclerView, "recyclerView");
            C1153a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.mo4780d();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, mo10386c = {"judi/com/kottlinbase/ui/blurry/editor/bokeh/BokehFragment$onInit$1", "Ljudi/com/kottlinbase/utils/ItemClickSupport$OnItemClickListener;", "onItemClicked", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "position", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.BokehFragment$f */
    /* compiled from: BokehFragment.kt */
    public static final class C7263f implements C7186a {

        /* renamed from: a */
        final /* synthetic */ BokehFragment f26461a;

        C7263f(BokehFragment bokehFragment) {
            this.f26461a = bokehFragment;
        }

        /* renamed from: a */
        public void mo23122a(RecyclerView recyclerView, int i, View view) {
            if (this.f26461a.mo23343ak() != null) {
                if (i >= this.f26461a.f26454d.size()) {
                    C7248a ak = this.f26461a.mo23343ak();
                    if (ak == null) {
                        C1489j.m6968a();
                    }
                    if (!ak.mo23315t_()) {
                        this.f26461a.startActivityForResult(new Intent(this.f26461a.mo2116m(), BokeBackgroundActivity.class), this.f26461a.f26452b);
                    }
                } else if (i >= 0 && i < this.f26461a.f26454d.size()) {
                    Settings.Companion.changeDefaultBokeh((String) this.f26461a.f26454d.get(i));
                    BokehFragment.m38731c(this.f26461a).mo23352a((String) this.f26461a.f26454d.get(i));
                    BokehFragment.m38731c(this.f26461a).mo4780d();
                    this.f26461a.m38726al();
                }
            }
        }
    }

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23265e();
    }

    /* renamed from: d */
    public int mo23263d() {
        return R.layout.fragment_bokeh;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26456f == null) {
            this.f26456f = new HashMap();
        }
        View view = (View) this.f26456f.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26456f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26456f != null) {
            this.f26456f.clear();
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ C7265a m38731c(BokehFragment bokehFragment) {
        C7265a aVar = bokehFragment.f26455e;
        if (aVar == null) {
            C1489j.m6973b("boketCatAdapter");
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo23262a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
        RecyclerView recyclerView = (RecyclerView) mo23264d(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView, "recyclerView");
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) m, "context!!");
        recyclerView.setAdapter(new C7267b(m, this.f26453c));
        ((RecyclerView) mo23264d(C7192a.recyclerView)).setHasFixedSize(true);
        RecyclerView recyclerView2 = (RecyclerView) mo23264d(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView2, "recyclerView");
        Context m2 = mo2116m();
        if (m2 == null) {
            C1489j.m6968a();
        }
        int i = 0;
        recyclerView2.setLayoutManager(new LinearLayoutManager(m2, 0, false));
        C7182a.m38386a((RecyclerView) mo23264d(C7192a.recyclerView)).mo23118a((C7186a) this);
        Context m3 = mo2116m();
        if (m3 == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) m3, "context!!");
        this.f26455e = new C7265a(m3, this.f26454d);
        RecyclerView recyclerView3 = (RecyclerView) mo23264d(C7192a.recyclerViewBokehTitle);
        C1489j.m6969a((Object) recyclerView3, "recyclerViewBokehTitle");
        C7265a aVar = this.f26455e;
        if (aVar == null) {
            C1489j.m6973b("boketCatAdapter");
        }
        recyclerView3.setAdapter(aVar);
        RecyclerView recyclerView4 = (RecyclerView) mo23264d(C7192a.recyclerViewBokehTitle);
        C1489j.m6969a((Object) recyclerView4, "recyclerViewBokehTitle");
        Context m4 = mo2116m();
        if (m4 == null) {
            C1489j.m6968a();
        }
        recyclerView4.setLayoutManager(new LinearLayoutManager(m4, 0, false));
        C7182a.m38386a((RecyclerView) mo23264d(C7192a.recyclerViewBokehTitle)).mo23118a((C7186a) new C7263f(this));
        m38726al();
        m38727am();
        C7139a a = C7139a.m38192a();
        C1489j.m6969a((Object) a, "SessionManager.getInstance()");
        if (a.mo23029l()) {
            C7139a.m38192a().mo23019c(System.currentTimeMillis());
            C7248a ak = mo23343ak();
            if (ak != null) {
                ak.mo23309b();
            }
        }
        ImageView imageView = (ImageView) mo23264d(C7192a.imgNewBadge);
        C1489j.m6969a((Object) imageView, "imgNewBadge");
        C7139a a2 = C7139a.m38192a();
        C1489j.m6969a((Object) a2, "SessionManager.getInstance()");
        if (!a2.mo23028k()) {
            i = 4;
        }
        imageView.setVisibility(i);
        C7248a ak2 = mo23343ak();
        if (ak2 != null) {
            RelativeLayout relativeLayout = (RelativeLayout) mo23264d(C7192a.containerGetEmoji);
            C1489j.m6969a((Object) relativeLayout, "containerGetEmoji");
            ak2.showTutGetMoreEmoji(relativeLayout);
        }
    }

    @OnClick
    public final void onGetEmojiClick() {
        C7248a ak = mo23343ak();
        if (ak == null) {
            C1489j.m6968a();
        }
        if (!ak.mo23315t_()) {
            ImageView imageView = (ImageView) mo23264d(C7192a.imgNewBadge);
            C1489j.m6969a((Object) imageView, "imgNewBadge");
            imageView.setVisibility(8);
            C7139a.m38192a().mo23020c(false);
            startActivityForResult(new Intent(mo2116m(), BokeBackgroundActivity.class), this.f26452b);
        }
    }

    /* renamed from: a */
    public void mo23122a(RecyclerView recyclerView, int i, View view) {
        if (i >= 0 && this.f26453c.size() > i) {
            C7248a ak = mo23343ak();
            if (ak != null) {
                ak.mo23308a((ITexture) this.f26453c.get(i));
            }
        }
    }

    /* renamed from: a */
    public void mo2055a(int i, int i2, Intent intent) {
        super.mo2055a(i, i2, intent);
        if (i == this.f26452b && i2 == -1) {
            Toast.makeText(mo2116m(), R.string.msg_bokeh_gallery_update, 0).show();
            m38726al();
            m38727am();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: al */
    public final void m38726al() {
        C0164b.m466a((Callable<? extends T>) new C7261d<Object>(this)).mo356b(C0255a.m681a()).mo353a(C0158a.m458a()).mo351a((C0185d<? super T>) new C7262e<Object>(this));
    }

    /* renamed from: am */
    private final void m38727am() {
        C0164b.m466a((Callable<? extends T>) new C7259b<Object>(this)).mo356b(C0255a.m681a()).mo353a(C0158a.m458a()).mo351a((C0185d<? super T>) new C7260c<Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: an */
    public final List<String> m38728an() {
        ArrayList arrayList = new ArrayList();
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) m, "context!!");
        File file = new File(m.getFilesDir(), "bokeh");
        if (file.listFiles() != null) {
            File[] listFiles = file.listFiles();
            C1489j.m6969a((Object) listFiles, "bokehDir.listFiles()");
            for (File file2 : listFiles) {
                C1489j.m6969a((Object) file2, "it");
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: ao */
    public final List<ITexture> m38729ao() {
        File[] listFiles;
        String defaultBokeh = Settings.Companion.settings().getDefaultBokeh();
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) m, "context!!");
        File filesDir = m.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append("bokeh/");
        sb.append(defaultBokeh);
        File file = new File(filesDir, sb.toString());
        ArrayList arrayList = new ArrayList();
        if (file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                C1489j.m6969a((Object) file2, "file");
                if (file2.isFile() && file2.exists()) {
                    String path = file2.getPath();
                    C1489j.m6969a((Object) path, "file.path");
                    arrayList.add(new DefaultTexture(path));
                }
            }
        }
        return arrayList;
    }
}
