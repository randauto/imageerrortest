package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.test;

import android.support.p053v4.app.C0690s;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import butterknife.OnClick;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.test.C7356b.C7357a;
import judi.com.kottlinbase.p274ui.test.C7356b.C7358b;
import p073b.C3218m;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p256e.p258b.C6979c;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo10386c = {"Ljudi/com/kottlinbase/ui/test/TestActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/test/TestContact$Presenter;", "Ljudi/com/kottlinbase/ui/test/TestContact$View;", "()V", "bokehDrawer", "Ljudi/com/kottlinbase/ui/test/BokehDrawer;", "createPresenter", "getLayoutId", "", "onInit", "", "save", "show", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.test.TestActivity */
/* compiled from: TestActivity.kt */
public final class TestActivity extends C7218a<C7357a> implements C7358b {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C7355a f26674l;

    /* renamed from: m */
    private HashMap f26675m;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, mo10386c = {"judi/com/kottlinbase/ui/test/TestActivity$onInit$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "p0", "Landroid/widget/SeekBar;", "p1", "", "p2", "", "onStartTrackingTouch", "onStopTrackingTouch", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.test.TestActivity$a */
    /* compiled from: TestActivity.kt */
    public static final class C7352a implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ TestActivity f26676a;

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        C7352a(TestActivity testActivity) {
            this.f26676a = testActivity;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            if (this.f26676a.f26674l != null) {
                C7355a a = this.f26676a.f26674l;
                if (a == null) {
                    C1489j.m6968a();
                }
                SeekBar seekBar2 = (SeekBar) this.f26676a.mo23231c(C7192a.seek);
                C1489j.m6969a((Object) seekBar2, "seek");
                a.mo23440a(seekBar2.getProgress());
            }
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26675m == null) {
            this.f26675m = new HashMap();
        }
        View view = (View) this.f26675m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26675m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_test;
    }

    /* renamed from: w */
    public C7357a mo23233m() {
        return new C7359c();
    }

    /* renamed from: n */
    public void mo23234n() {
        C7271c p = mo23252p();
        if (p == null) {
            C1489j.m6968a();
        }
        ((C7357a) p).mo23365a(this);
        ((SeekBar) mo23231c(C7192a.seek)).setOnSeekBarChangeListener(new C7352a(this));
    }

    @OnClick
    public final void save() {
        C7355a aVar = this.f26674l;
        if (aVar == null) {
            C1489j.m6968a();
        }
        aVar.mo23441a("/sdcard/DCIM/detector/test/bokeh_mask.png");
    }

    @OnClick
    public final void show() {
        C0690s a = mo2158f().mo2228a();
        this.f26674l = new C7355a(C1415k.m6841c("🤣", "🤣"));
        a.mo1980b(R.id.frm, new C6979c(this.f26674l));
        a.mo1989d();
    }
}
