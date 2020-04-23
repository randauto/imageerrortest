package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.other;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p064v7.widget.LinearLayoutManager;
import android.support.p064v7.widget.RecyclerView;
import android.support.p064v7.widget.RecyclerView.C1153a;
import android.view.View;
import com.google.p187a.C4299e;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.model.OtherApp;
import judi.com.kottlinbase.model.OtherAppWrapper;
import judi.com.kottlinbase.p272a.C7182a;
import judi.com.kottlinbase.p272a.C7182a.C7186a;
import judi.com.kottlinbase.p274ui.C7221b;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.service.C7370d;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0002J$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J$\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo10386c = {"Ljudi/com/kottlinbase/ui/other/OtherAppFragment;", "Ljudi/com/kottlinbase/ui/BaseFragment;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/kottlinbase/utils/ItemClickSupport$OnItemClickListener;", "()V", "isHorizontal", "", "list", "", "Ljudi/com/kottlinbase/model/OtherApp;", "createPresenter", "downloadOtherData", "", "getDataFile", "Ljava/io/File;", "layoutId", "", "loadOtherApp", "onInit", "view", "Landroid/view/View;", "arg", "Landroid/os/Bundle;", "savedInstanceState", "onItemClicked", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "position", "v", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.other.OtherAppFragment */
/* compiled from: OtherAppFragment.kt */
public final class OtherAppFragment extends C7221b<C7271c<?>> implements C7186a {

    /* renamed from: a */
    private List<OtherApp> f26623a = new ArrayList();

    /* renamed from: b */
    private boolean f26624b;

    /* renamed from: c */
    private HashMap f26625c;

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23265e();
    }

    /* renamed from: c */
    public C7271c<?> mo2013c() {
        return null;
    }

    /* renamed from: d */
    public int mo23263d() {
        return R.layout.fragment_other_app;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26625c == null) {
            this.f26625c = new HashMap();
        }
        View view = (View) this.f26625c.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26625c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26625c != null) {
            this.f26625c.clear();
        }
    }

    /* renamed from: a */
    public void mo23262a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
        RecyclerView recyclerView = (RecyclerView) mo23264d(C7192a.recyclerViewOther);
        C1489j.m6969a((Object) recyclerView, "recyclerViewOther");
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) m, "context!!");
        recyclerView.setAdapter(new C7331a(m, this.f26623a));
        RecyclerView recyclerView2 = (RecyclerView) mo23264d(C7192a.recyclerViewOther);
        C1489j.m6969a((Object) recyclerView2, "recyclerViewOther");
        recyclerView2.setLayoutManager(!this.f26624b ? new LinearLayoutManager(mo2116m()) : new LinearLayoutManager(mo2116m(), 0, false));
        C7182a.m38386a((RecyclerView) mo23264d(C7192a.recyclerViewOther)).mo23118a((C7186a) this);
        m38988ak();
    }

    /* renamed from: ak */
    private final void m38988ak() {
        String str;
        File al = m38989al();
        if (!al.exists() || al.length() <= 0) {
            str = C7370d.m39131a(mo2116m(), (int) R.raw.other_app);
            C1489j.m6969a((Object) str, "FileUtil.readFileFromRaw…context, R.raw.other_app)");
        } else {
            str = C7370d.m39134a(al);
            C1489j.m6969a((Object) str, "FileUtil.readJson(dataFile)");
        }
        Object a = new C4299e().mo13132a(str, OtherAppWrapper.class);
        C1489j.m6969a(a, "gson.fromJson(strData, O…erAppWrapper::class.java)");
        OtherAppWrapper otherAppWrapper = (OtherAppWrapper) a;
        this.f26623a.clear();
        this.f26623a.addAll(otherAppWrapper.getOtherApp());
        RecyclerView recyclerView = (RecyclerView) mo23264d(C7192a.recyclerViewOther);
        C1489j.m6969a((Object) recyclerView, "recyclerViewOther");
        C1153a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.mo4780d();
        }
    }

    /* renamed from: al */
    private final File m38989al() {
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) m, "context!!");
        File a = C7370d.m39130a(m.getFilesDir(), "other_app", "other_app", "json");
        C1489j.m6969a((Object) a, "FileUtil.createFile(cont…pp\", \"other_app\", \"json\")");
        return a;
    }

    /* renamed from: a */
    public void mo23122a(RecyclerView recyclerView, int i, View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("market://details?id=");
        sb.append(((OtherApp) this.f26623a.get(i)).getPackageName());
        try {
            mo2062a(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("http://play.google.com/store/apps/details?id=");
            sb2.append(((OtherApp) this.f26623a.get(i)).getPackageName());
            mo2062a(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
        }
    }
}
