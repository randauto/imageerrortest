package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.other;

import android.view.View;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import p073b.C3218m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo10386c = {"Ljudi/com/kottlinbase/ui/other/OtherAppActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "()V", "createPresenter", "getLayoutId", "", "onInit", "", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.other.OtherAppActivity */
/* compiled from: OtherAppActivity.kt */
public final class OtherAppActivity extends C7218a<C7271c<?>> {

    /* renamed from: l */
    private HashMap f26622l;

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26622l == null) {
            this.f26622l = new HashMap();
        }
        View view = (View) this.f26622l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26622l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_other_app;
    }

    /* renamed from: m */
    public C7271c<?> mo23233m() {
        return null;
    }

    /* renamed from: n */
    public void mo23234n() {
    }
}
