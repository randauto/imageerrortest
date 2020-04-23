package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry.editor;

import android.content.Context;
import android.os.Bundle;
import android.support.p053v4.app.C0656h;
import android.view.View;
import java.util.HashMap;
import judi.com.kottlinbase.p274ui.C7221b;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.kottlinbase.p274ui.blurry.C7248a;
import p073b.C3218m;
import p073b.C3227u;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/BaseEditorFragment;", "Ljudi/com/kottlinbase/ui/BaseFragment;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "()V", "parent", "Ljudi/com/kottlinbase/ui/blurry/BlurView;", "getParent", "()Ljudi/com/kottlinbase/ui/blurry/BlurView;", "setParent", "(Ljudi/com/kottlinbase/ui/blurry/BlurView;)V", "createPresenter", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.editor.b */
/* compiled from: BaseEditorFragment.kt */
public abstract class C7257b extends C7221b<C7271c<?>> {

    /* renamed from: a */
    private C7248a f26449a;

    /* renamed from: b */
    private HashMap f26450b;

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23265e();
    }

    /* renamed from: c */
    public C7271c<?> mo2013c() {
        return null;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26450b == null) {
            this.f26450b = new HashMap();
        }
        View view = (View) this.f26450b.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26450b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26450b != null) {
            this.f26450b.clear();
        }
    }

    /* renamed from: ak */
    public final C7248a mo23343ak() {
        return this.f26449a;
    }

    /* renamed from: a */
    public void mo2007a(Bundle bundle) {
        super.mo2007a(bundle);
        if (this.f26449a == null && (mo2120o() instanceof C7248a)) {
            C0656h o = mo2120o();
            if (o != null) {
                this.f26449a = (C7248a) o;
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.kottlinbase.ui.blurry.BlurView");
        }
    }

    /* renamed from: a */
    public void mo2006a(Context context) {
        super.mo2006a(context);
        if (this.f26449a == null && (context instanceof C7248a)) {
            this.f26449a = (C7248a) context;
        }
    }
}
