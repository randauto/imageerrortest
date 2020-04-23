package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.OnClick;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.p274ui.C7221b;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.creater.save.CreatorListActivity;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0007J$\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000f"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/CarCreatorFragment;", "Ljudi/com/kottlinbase/ui/BaseFragment;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "()V", "createPresenter", "layoutId", "", "onCreatorClick", "", "onInit", "view", "Landroid/view/View;", "arg", "Landroid/os/Bundle;", "savedInstanceState", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.home.CarCreatorFragment */
/* compiled from: CarCreatorFragment.kt */
public final class CarCreatorFragment extends C7221b<C7271c<?>> {

    /* renamed from: a */
    private HashMap f26562a;

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23265e();
    }

    /* renamed from: a */
    public void mo23262a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
    }

    /* renamed from: c */
    public C7271c<?> mo2013c() {
        return null;
    }

    /* renamed from: d */
    public int mo23263d() {
        return R.layout.view_creator_fragment;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26562a == null) {
            this.f26562a = new HashMap();
        }
        View view = (View) this.f26562a.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26562a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26562a != null) {
            this.f26562a.clear();
        }
    }

    @OnClick
    public final void onCreatorClick() {
        mo2062a(new Intent(mo2116m(), CreatorListActivity.class));
    }
}
