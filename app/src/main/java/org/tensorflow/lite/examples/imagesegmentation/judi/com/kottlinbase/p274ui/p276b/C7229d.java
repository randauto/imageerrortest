package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.p276b;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.judi.emojiphoto.R;
import judi.com.kottlinbase.C7191b.C7192a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo10386c = {"Ljudi/com/kottlinbase/ui/dialog/ProgressAlert;", "Ljudi/com/kottlinbase/ui/dialog/BaseAlert;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dismiss", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateMessage", "mesage", "", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.b.d */
/* compiled from: ProgressAlert.kt */
public final class C7229d extends C7227b {
    public C7229d(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_progress);
        mo23291a();
    }

    /* renamed from: a */
    public final void mo23301a(String str) {
        C1489j.m6972b(str, "mesage");
        TextView textView = (TextView) findViewById(C7192a.tvProgressMsg);
        C1489j.m6969a((Object) textView, "tvProgressMsg");
        CharSequence charSequence = str;
        int i = 0;
        if (charSequence.length() == 0) {
            i = 4;
        }
        textView.setVisibility(i);
        TextView textView2 = (TextView) findViewById(C7192a.tvProgressMsg);
        C1489j.m6969a((Object) textView2, "tvProgressMsg");
        textView2.setText(charSequence);
    }

    public void dismiss() {
        try {
            TextView textView = (TextView) findViewById(C7192a.tvProgressMsg);
            C1489j.m6969a((Object) textView, "tvProgressMsg");
            textView.setVisibility(4);
            super.dismiss();
        } catch (Exception unused) {
        }
    }
}
