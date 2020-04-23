package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.creater;

import android.content.Context;
import android.os.Bundle;
import android.support.p053v4.app.C0656h;
import android.view.View;
import com.judi.emojiphoto.R;
import hani.momanii.supernova_emoji_library.Helper.C7102c.C7104a;
import hani.momanii.supernova_emoji_library.Helper.EmojiconsView;
import hani.momanii.supernova_emoji_library.Helper.EmojiconsView.C7095b;
import hani.momanii.supernova_emoji_library.p264a.C7118c;
import java.util.HashMap;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p274ui.C7221b;
import judi.com.kottlinbase.p274ui.C7271c;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J$\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo10386c = {"Ljudi/com/kottlinbase/ui/creater/EmojiPickerFragment;", "Ljudi/com/kottlinbase/ui/BaseFragment;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "Lhani/momanii/supernova_emoji_library/Helper/EmojiconGridView$OnEmojiconClickedListener;", "Lhani/momanii/supernova_emoji_library/Helper/EmojiconsView$OnEmojiconBackspaceClickedListener;", "()V", "parent", "Ljudi/com/kottlinbase/ui/creater/EmojiPickerView;", "createPresenter", "layoutId", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEmojiconBackspaceClicked", "v", "Landroid/view/View;", "onEmojiconClicked", "emojicon", "Lhani/momanii/supernova_emoji_library/emoji/Emojicon;", "onInit", "view", "arg", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.creater.b */
/* compiled from: EmojiPickerFragment.kt */
public final class C7285b extends C7221b<C7271c<?>> implements C7095b, C7104a {

    /* renamed from: a */
    private C7286c f26520a;

    /* renamed from: b */
    private HashMap f26521b;

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
    public int mo23263d() {
        return R.layout.fragment_emoji_picker;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26521b == null) {
            this.f26521b = new HashMap();
        }
        View view = (View) this.f26521b.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26521b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26521b != null) {
            this.f26521b.clear();
        }
    }

    /* renamed from: a */
    public void mo2007a(Bundle bundle) {
        super.mo2007a(bundle);
        if (this.f26520a == null && (mo2120o() instanceof C7286c)) {
            C0656h o = mo2120o();
            if (o != null) {
                this.f26520a = (C7286c) o;
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.kottlinbase.ui.creater.EmojiPickerView");
        }
    }

    /* renamed from: a */
    public void mo2006a(Context context) {
        super.mo2006a(context);
        if (context != null && this.f26520a == null && (context instanceof C7286c)) {
            this.f26520a = (C7286c) context;
        }
    }

    /* renamed from: a */
    public void mo23262a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
        ((EmojiconsView) mo23264d(C7192a.emojiView)).f25988a = this;
        ((EmojiconsView) mo23264d(C7192a.emojiView)).f25989b = this;
    }

    /* renamed from: a */
    public void mo22898a(C7118c cVar) {
        C7286c cVar2 = this.f26520a;
        if (cVar2 != null) {
            cVar2.mo23372a(cVar);
        }
    }

    /* renamed from: a */
    public void mo22892a(View view) {
        C7286c cVar = this.f26520a;
        if (cVar != null) {
            cVar.mo23316w();
        }
    }
}
