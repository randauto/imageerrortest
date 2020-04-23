package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry.editor;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.blurry.C7248a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0016"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/BlurLevelFragment;", "Ljudi/com/kottlinbase/ui/blurry/editor/BaseEditorFragment;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "()V", "layoutId", "", "onInit", "", "view", "Landroid/view/View;", "arg", "Landroid/os/Bundle;", "savedInstanceState", "onProgressChanged", "p0", "Landroid/widget/SeekBar;", "p1", "p2", "", "onStartTrackingTouch", "onStopTrackingTouch", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.editor.c */
/* compiled from: BlurLevelFragment.kt */
public final class C7269c extends C7257b implements OnSeekBarChangeListener {

    /* renamed from: a */
    public static final C7270a f26473a = new C7270a(null);

    /* renamed from: b */
    private HashMap f26474b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/BlurLevelFragment$Companion;", "", "()V", "newInstance", "Ljudi/com/kottlinbase/ui/blurry/editor/BlurLevelFragment;", "currentLevel", "", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.c$a */
    /* compiled from: BlurLevelFragment.kt */
    public static final class C7270a {
        private C7270a() {
        }

        public /* synthetic */ C7270a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C7269c mo23362a(float f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("arg_blur_level", f);
            C7269c cVar = new C7269c();
            cVar.mo2102g(bundle);
            return cVar;
        }
    }

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23265e();
    }

    /* renamed from: d */
    public int mo23263d() {
        return R.layout.fragment_blur_level;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26474b == null) {
            this.f26474b = new HashMap();
        }
        View view = (View) this.f26474b.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26474b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26474b != null) {
            this.f26474b.clear();
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: a */
    public void mo23262a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
        if (bundle == null) {
            SeekBar seekBar = (SeekBar) mo23264d(C7192a.seekBlurLevel);
            C1489j.m6969a((Object) seekBar, "seekBlurLevel");
            seekBar.setProgress(8);
        } else {
            SeekBar seekBar2 = (SeekBar) mo23264d(C7192a.seekBlurLevel);
            C1489j.m6969a((Object) seekBar2, "seekBlurLevel");
            seekBar2.setProgress((int) bundle.getFloat("arg_blur_level", 8.0f));
        }
        ((SeekBar) mo23264d(C7192a.seekBlurLevel)).setOnSeekBarChangeListener(this);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        SeekBar seekBar2 = (SeekBar) mo23264d(C7192a.seekBlurLevel);
        C1489j.m6969a((Object) seekBar2, "seekBlurLevel");
        if (seekBar2.getProgress() > 0) {
            C7248a ak = mo23343ak();
            if (ak != null) {
                SeekBar seekBar3 = (SeekBar) mo23264d(C7192a.seekBlurLevel);
                C1489j.m6969a((Object) seekBar3, "seekBlurLevel");
                ak.mo23304a((float) seekBar3.getProgress());
                return;
            }
            return;
        }
        C7248a ak2 = mo23343ak();
        if (ak2 != null) {
            ak2.mo23304a(2.0f);
        }
    }
}
