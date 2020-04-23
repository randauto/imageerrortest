package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.remove;

import android.support.p053v4.app.C0647g;
import android.support.p053v4.app.C0690s;
import android.view.View;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.p274ui.C7218a;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7223a;
import judi.com.kottlinbase.p274ui.p276b.C7222a.C7225c;
import judi.com.p268a.C7141b;
import judi.com.p268a.C7141b.C7142a;
import judi.com.p268a.C7159d;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo10386c = {"Ljudi/com/kottlinbase/ui/remove/BackgroundEditorActivity;", "Ljudi/com/kottlinbase/ui/BaseActivity;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Ljudi/com/bgremover/RemoverView;", "()V", "folderPath", "", "path", "createPresenter", "getLayoutId", "", "inputNotFound", "", "mes", "maskUpdateMaskCancel", "maskUpdated", "onInit", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.remove.BackgroundEditorActivity */
/* compiled from: BackgroundEditorActivity.kt */
public final class BackgroundEditorActivity extends C7218a<C7271c<?>> implements C7159d {

    /* renamed from: l */
    private String f26650l;

    /* renamed from: m */
    private String f26651m;

    /* renamed from: n */
    private HashMap f26652n;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo10386c = {"judi/com/kottlinbase/ui/remove/BackgroundEditorActivity$inputNotFound$1", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnDismissListener;", "onDismiss", "", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.remove.BackgroundEditorActivity$a */
    /* compiled from: BackgroundEditorActivity.kt */
    public static final class C7343a implements C7225c {

        /* renamed from: a */
        final /* synthetic */ BackgroundEditorActivity f26653a;

        C7343a(BackgroundEditorActivity backgroundEditorActivity) {
            this.f26653a = backgroundEditorActivity;
        }

        /* renamed from: a */
        public void mo23289a() {
            if (!this.f26653a.isFinishing()) {
                this.f26653a.finish();
            }
        }
    }

    /* renamed from: c */
    public View mo23231c(int i) {
        if (this.f26652n == null) {
            this.f26652n = new HashMap();
        }
        View view = (View) this.f26652n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26652n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: l */
    public int mo23232l() {
        return R.layout.activity_bg_editor;
    }

    /* renamed from: m */
    public C7271c<?> mo23233m() {
        return null;
    }

    /* renamed from: n */
    public void mo23234n() {
        this.f26650l = getIntent().getStringExtra("arg_path");
        this.f26651m = getIntent().getStringExtra("arg_folder");
        if (this.f26650l == null || this.f26651m == null) {
            throw new RuntimeException("path not found");
        }
        C0690s a = mo2158f().mo2228a();
        C0647g a2 = mo2158f().mo2225a((int) R.id.frm);
        if (a2 != null) {
            a.mo1971a(a2);
        }
        C7142a aVar = C7141b.f26125a;
        String str = this.f26650l;
        if (str == null) {
            C1489j.m6968a();
        }
        String str2 = this.f26651m;
        if (str2 == null) {
            C1489j.m6968a();
        }
        a.mo1969a((int) R.id.frm, (C0647g) aVar.mo23038a(str, str2)).mo1986c();
    }

    /* renamed from: v_ */
    public void mo23058v_() {
        setResult(-1);
        finish();
    }

    /* renamed from: b */
    public void mo23057b() {
        finish();
    }

    /* renamed from: a */
    public void mo23056a(String str) {
        if (str == null) {
            str = getString(R.string.msg_unknow_error);
        }
        C7223a a = new C7223a(this).mo23274a(false);
        C1489j.m6969a((Object) str, "mesage");
        a.mo23271a(str).mo23279b(false).mo23273a((C7225c) new C7343a(this)).mo23287j().show();
    }
}
