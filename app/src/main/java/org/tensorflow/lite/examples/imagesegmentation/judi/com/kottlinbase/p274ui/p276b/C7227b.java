package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.p276b;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.judi.emojiphoto.R;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo10386c = {"Ljudi/com/kottlinbase/ui/dialog/BaseAlert;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "setAttributes", "", "isFull", "", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.b.b */
/* compiled from: BaseAlert.kt */
public class C7227b extends Dialog {
    public C7227b(Context context) {
        super(context, R.style.AllDialogTransparent);
    }

    /* renamed from: a */
    public final void mo23292a(boolean z) {
        if (getWindow() != null) {
            Window window = getWindow();
            if (window == null) {
                C1489j.m6968a();
            }
            window.setGravity(17);
            Window window2 = getWindow();
            if (window2 == null) {
                C1489j.m6968a();
            }
            window2.setSoftInputMode(16);
            LayoutParams layoutParams = new LayoutParams();
            Window window3 = getWindow();
            if (window3 == null) {
                C1489j.m6968a();
            }
            layoutParams.copyFrom(window3.getAttributes());
            int i = -1;
            layoutParams.width = -1;
            if (!z) {
                i = -2;
            }
            layoutParams.height = i;
            Window window4 = getWindow();
            if (window4 == null) {
                C1489j.m6968a();
            }
            window4.setAttributes(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo23291a() {
        mo23292a(false);
    }
}
