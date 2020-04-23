package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry.editor;

import android.os.Bundle;
import android.view.View;
import butterknife.OnClick;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.p274ui.blurry.C7248a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J$\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0007¨\u0006\u0011"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/ToolsItemFragment;", "Ljudi/com/kottlinbase/ui/blurry/editor/BaseEditorFragment;", "()V", "layoutId", "", "onAlphaClick", "", "onBokehClick", "onCreaterClick", "onInit", "view", "Landroid/view/View;", "arg", "Landroid/os/Bundle;", "savedInstanceState", "onLevelClick", "onManualFocusClick", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.editor.ToolsItemFragment */
/* compiled from: ToolsItemFragment.kt */
public final class ToolsItemFragment extends C7257b {

    /* renamed from: a */
    private HashMap f26430a;

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23265e();
    }

    /* renamed from: a */
    public void mo23262a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
    }

    /* renamed from: d */
    public int mo23263d() {
        return R.layout.fragment_tools_item;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26430a == null) {
            this.f26430a = new HashMap();
        }
        View view = (View) this.f26430a.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26430a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26430a != null) {
            this.f26430a.clear();
        }
    }

    @OnClick
    public final void onManualFocusClick() {
        C7248a ak = mo23343ak();
        if (ak != null) {
            ak.mo23305a((int) R.id.containerFocus);
        }
    }

    @OnClick
    public final void onCreaterClick() {
        C7248a ak = mo23343ak();
        if (ak != null) {
            ak.mo23305a((int) R.id.containerCreater);
        }
    }

    @OnClick
    public final void onLevelClick() {
        C7248a ak = mo23343ak();
        if (ak != null) {
            ak.mo23305a((int) R.id.containerLevel);
        }
    }

    @OnClick
    public final void onBokehClick() {
        C7248a ak = mo23343ak();
        if (ak != null) {
            ak.mo23305a((int) R.id.containerBokeh);
        }
    }

    @OnClick
    public final void onAlphaClick() {
        C7248a ak = mo23343ak();
        if (ak != null) {
            ak.mo23305a((int) R.id.containerAlpha);
        }
    }
}
