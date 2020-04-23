package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.p276b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p053v4.app.C0646f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import butterknife.ButterKnife;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.p272a.C7189c;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\b\u0010\r\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0002J&\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010 \u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\"\u001a\u00020\u0010H\u0016J\u001a\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006$"}, mo10386c = {"Ljudi/com/kottlinbase/ui/dialog/BaseDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "()V", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "dialogH", "", "dialogW", "getContextM", "getLayoutId", "getThemId", "onAttach", "", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDialogSize", "w", "h", "onInit", "view", "fragmentArg", "saveInstance", "onResume", "onViewCreated", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.b.c */
/* compiled from: BaseDialogFragment.kt */
public abstract class C7228c extends C0646f {

    /* renamed from: ag */
    private Context f26385ag;

    /* renamed from: ah */
    private HashMap f26386ah;

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23298ao();
    }

    /* renamed from: a */
    public abstract void mo23293a(View view, Bundle bundle, Bundle bundle2);

    /* renamed from: ak */
    public int mo23294ak() {
        return R.style.AllDialogAppCompatAlert;
    }

    /* renamed from: al */
    public abstract int mo23295al();

    /* renamed from: an */
    public int mo23297an() {
        return 0;
    }

    /* renamed from: ao */
    public void mo23298ao() {
        if (this.f26386ah != null) {
            this.f26386ah.clear();
        }
    }

    /* renamed from: d */
    public View mo23300d(int i) {
        if (this.f26386ah == null) {
            this.f26386ah = new HashMap();
        }
        View view = (View) this.f26386ah.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26386ah.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo2007a(Bundle bundle) {
        super.mo2007a(bundle);
        mo2004a(1, mo23294ak());
        if (this.f26385ag == null && VERSION.SDK_INT < 23) {
            this.f26385ag = mo2120o();
        }
    }

    /* renamed from: a */
    public void mo2006a(Context context) {
        super.mo2006a(context);
        if (this.f26385ag == null && VERSION.SDK_INT < 23) {
            this.f26385ag = context;
        }
    }

    /* renamed from: a */
    public void mo2071a(View view, Bundle bundle) {
        C1489j.m6972b(view, "view");
        super.mo2071a(view, bundle);
        super.mo2071a(view, bundle);
        ButterKnife.m14845a(this, view);
        mo23293a(view, mo2037N_(), bundle);
    }

    /* renamed from: a */
    public View mo2052a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1489j.m6972b(layoutInflater, "inflater");
        return layoutInflater.inflate(mo23295al(), viewGroup, false);
    }

    /* renamed from: B */
    public void mo2024B() {
        super.mo2024B();
        m38613c(mo23296am(), mo23297an());
    }

    /* renamed from: am */
    public int mo23296am() {
        return (int) (((double) C7189c.f26296a.mo23126b(mo23299ap())) * 0.96d);
    }

    /* renamed from: ap */
    public final Context mo23299ap() {
        if (VERSION.SDK_INT < 23) {
            return this.f26385ag;
        }
        return super.mo2116m();
    }

    /* renamed from: c */
    private final void m38613c(int i, int i2) {
        Dialog d = mo2015d();
        C1489j.m6969a((Object) d, "dialog");
        Window window = d.getWindow();
        if (window != null) {
            if (i <= 0) {
                i = -2;
            }
            if (i2 <= 0) {
                i2 = -2;
            }
            window.setLayout(i, i2);
        }
    }
}
