package org.tensorflow.lite.examples.imagesegmentation.judi.com.p268a;

import android.content.Context;
import android.os.Bundle;
import android.support.p053v4.app.C0647g;
import android.support.p053v4.app.C0656h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import java.util.HashMap;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p145c.p146a.p147a.C3243f;
import p145c.p146a.p147a.C3243f.C3254a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u001a\u0010 \u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006!"}, mo10386c = {"Ljudi/com/bgremover/BaseBgEditorFragment;", "Landroid/support/v4/app/Fragment;", "()V", "parent", "Ljudi/com/bgremover/RemoverView;", "getParent", "()Ljudi/com/bgremover/RemoverView;", "setParent", "(Ljudi/com/bgremover/RemoverView;)V", "createShowCase", "Lme/toptas/fancyshowcase/FancyShowCaseView;", "view", "Landroid/view/View;", "msg", "", "gravity", "", "layoutId", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onInit", "arg", "onViewCreated", "bgremover_release"})
/* renamed from: judi.com.a.a */
/* compiled from: BaseBgEditorFragment.kt */
public abstract class C7140a extends C0647g {

    /* renamed from: a */
    private C7159d f26123a;

    /* renamed from: b */
    private HashMap f26124b;

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23035e();
    }

    /* renamed from: a */
    public abstract void mo23032a(View view, Bundle bundle, Bundle bundle2);

    /* renamed from: d */
    public abstract int mo23033d();

    /* renamed from: d */
    public View mo23034d(int i) {
        if (this.f26124b == null) {
            this.f26124b = new HashMap();
        }
        View view = (View) this.f26124b.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26124b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23035e() {
        if (this.f26124b != null) {
            this.f26124b.clear();
        }
    }

    /* renamed from: c */
    public final C7159d mo2013c() {
        return this.f26123a;
    }

    /* renamed from: a */
    public View mo2052a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1489j.m6972b(layoutInflater, "inflater");
        return layoutInflater.inflate(mo23033d(), viewGroup, false);
    }

    /* renamed from: a */
    public void mo2071a(View view, Bundle bundle) {
        C1489j.m6972b(view, "view");
        super.mo2071a(view, bundle);
        ButterKnife.m14845a(this, view);
        mo23032a(view, mo2037N_(), bundle);
    }

    /* renamed from: a */
    public void mo2007a(Bundle bundle) {
        super.mo2007a(bundle);
        if (this.f26123a == null && (mo2120o() instanceof C7159d)) {
            C0656h o = mo2120o();
            if (o != null) {
                this.f26123a = (C7159d) o;
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.bgremover.RemoverView");
        }
    }

    /* renamed from: a */
    public void mo2006a(Context context) {
        super.mo2006a(context);
        if (this.f26123a == null && (mo2120o() instanceof C7159d)) {
            C0656h o = mo2120o();
            if (o != null) {
                this.f26123a = (C7159d) o;
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.bgremover.RemoverView");
        }
    }

    /* renamed from: a */
    public final C3243f mo23030a(View view, String str) {
        C1489j.m6972b(view, "view");
        C1489j.m6972b(str, "msg");
        return mo23031a(view, str, 17);
    }

    /* renamed from: a */
    public final C3243f mo23031a(View view, String str, int i) {
        C1489j.m6972b(view, "view");
        C1489j.m6972b(str, "msg");
        C0656h o = mo2120o();
        if (o == null) {
            C1489j.m6968a();
        }
        C3243f a = new C3254a(o).mo10463a(view).mo10464a(str).mo10462a(i).mo10465a(false).mo10467b(300).mo10466a();
        C1489j.m6969a((Object) a, "FancyShowCaseView.Builde…\n                .build()");
        return a;
    }
}
