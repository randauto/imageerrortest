package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.content.Context;
import android.os.Bundle;
import android.support.p053v4.app.C0656h;
import android.view.View;
import android.widget.ImageView;
import butterknife.OnClick;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.C3413i;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.C7221b;
import judi.com.kottlinbase.p274ui.C7271c;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0007J$\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/FilterCartFragment;", "Ljudi/com/kottlinbase/ui/BaseFragment;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "()V", "filterType", "", "parentView", "Ljudi/com/kottlinbase/ui/home/HomeView;", "createPresenter", "layoutId", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEffectClick", "onInit", "view", "Landroid/view/View;", "arg", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.home.FilterCartFragment */
/* compiled from: FilterCartFragment.kt */
public final class FilterCartFragment extends C7221b<C7271c<?>> {

    /* renamed from: a */
    public static final C7310a f26577a = new C7310a(null);

    /* renamed from: b */
    private int f26578b = 1;

    /* renamed from: c */
    private C7328d f26579c;

    /* renamed from: d */
    private HashMap f26580d;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/FilterCartFragment$Companion;", "", "()V", "newInstance", "Ljudi/com/kottlinbase/ui/home/FilterCartFragment;", "type", "", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.FilterCartFragment$a */
    /* compiled from: FilterCartFragment.kt */
    public static final class C7310a {
        private C7310a() {
        }

        public /* synthetic */ C7310a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final FilterCartFragment mo23401a(int i) {
            FilterCartFragment filterCartFragment = new FilterCartFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("arg_filter_type", i);
            filterCartFragment.mo2102g(bundle);
            return filterCartFragment;
        }
    }

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
        return R.layout.view_filter_card;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26580d == null) {
            this.f26580d = new HashMap();
        }
        View view = (View) this.f26580d.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26580d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26580d != null) {
            this.f26580d.clear();
        }
    }

    /* renamed from: a */
    public void mo2007a(Bundle bundle) {
        super.mo2007a(bundle);
        if (this.f26579c == null && (mo2120o() instanceof C7328d)) {
            C0656h o = mo2120o();
            if (o != null) {
                this.f26579c = (C7328d) o;
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.kottlinbase.ui.home.HomeView");
        }
    }

    /* renamed from: a */
    public void mo2006a(Context context) {
        super.mo2006a(context);
        if (this.f26579c == null && (context instanceof C7328d)) {
            this.f26579c = (C7328d) context;
        }
    }

    /* renamed from: a */
    public void mo23262a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
        String str = "https://firebasestorage.googleapis.com/v0/b/callcolor-c893a.appspot.com/o/photo_project%2Ftut%2Femoji_photo_intro.png?alt=media&token=a445357f-ccf3-4157-b37c-de1dde0310be";
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        ((C3413i) C3303c.m15109b(m).mo10837a(str).mo10676g()).mo10823a((ImageView) mo23264d(C7192a.imgThumb));
    }

    @OnClick
    public final void onEffectClick() {
        C7328d dVar = this.f26579c;
        if (dVar != null) {
            dVar.mo23403d(this.f26578b);
        }
    }
}
