package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater;

import android.os.Bundle;
import android.support.p053v4.app.C0647g;
import android.support.p053v4.app.C0656h;
import android.view.View;
import android.widget.ImageView;
import butterknife.OnClick;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.p156f.C3369h;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p272a.C7189c;
import judi.com.kottlinbase.p274ui.p276b.C7228c;
import judi.com.kottlinbase.p274ui.view.SquareImageView;
import p073b.C3218m;
import p073b.C3227u;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J&\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0007¨\u0006\u0011"}, mo10386c = {"Ljudi/com/kottlinbase/ui/creater/ResultDialog;", "Ljudi/com/kottlinbase/ui/dialog/BaseDialogFragment;", "()V", "dialogH", "", "dialogW", "getLayoutId", "getThemId", "onInit", "", "view", "Landroid/view/View;", "fragmentArg", "Landroid/os/Bundle;", "saveInstance", "onOnRetry", "onOnUse", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.creater.ResultDialog */
/* compiled from: ResultDialog.kt */
public final class ResultDialog extends C7228c {

    /* renamed from: ag */
    private HashMap f26502ag;

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23298ao();
    }

    /* renamed from: ak */
    public int mo23294ak() {
        return R.style.AllDialogBlack;
    }

    /* renamed from: al */
    public int mo23295al() {
        return R.layout.dialog_reuslt_emoji;
    }

    /* renamed from: ao */
    public void mo23298ao() {
        if (this.f26502ag != null) {
            this.f26502ag.clear();
        }
    }

    /* renamed from: d */
    public View mo23300d(int i) {
        if (this.f26502ag == null) {
            this.f26502ag = new HashMap();
        }
        View view = (View) this.f26502ag.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26502ag.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: am */
    public int mo23296am() {
        return C7189c.f26296a.mo23126b(mo23299ap());
    }

    /* renamed from: an */
    public int mo23297an() {
        return C7189c.f26296a.mo23124a(mo23299ap());
    }

    /* renamed from: a */
    public void mo23293a(View view, Bundle bundle, Bundle bundle2) {
        mo2011b(true);
        if (bundle != null) {
            C3303c.m15105a((C0647g) this).mo10837a(bundle.getString("arg_emoji_path")).mo10667b(new C3369h().mo10679i()).mo10823a((ImageView) (SquareImageView) mo23300d(C7192a.imgResultEmoji));
        }
    }

    @OnClick
    public final void onOnRetry() {
        mo2013c();
        if (mo2120o() != null && (mo2120o() instanceof C7282a)) {
            C0656h o = mo2120o();
            if (o != null) {
                ((C7282a) o).mo23316w();
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.kottlinbase.ui.creater.EmojiCreaterView");
        }
    }

    @OnClick
    public final void onOnUse() {
        mo2013c();
        if (mo2120o() != null && (mo2120o() instanceof C7282a)) {
            C0656h o = mo2120o();
            if (o != null) {
                ((C7282a) o).mo23368x();
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.kottlinbase.ui.creater.EmojiCreaterView");
        }
    }
}
