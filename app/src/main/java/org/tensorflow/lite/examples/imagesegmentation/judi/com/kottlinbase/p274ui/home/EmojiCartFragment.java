package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.content.Context;
import android.os.Bundle;
import android.support.p053v4.app.C0656h;
import android.view.View;
import android.widget.ImageView;
import butterknife.OnClick;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.C3413i;
import com.google.android.gms.p208d.C4738f;
import com.google.android.gms.p208d.C4739g;
import com.google.firebase.p234f.C6705d.C6706a;
import com.google.firebase.p234f.C6707e;
import com.google.p187a.C4299e;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import judi.com.C7139a;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.model.OtherApp;
import judi.com.kottlinbase.model.OtherAppWrapper;
import judi.com.kottlinbase.p274ui.C7221b;
import judi.com.kottlinbase.p274ui.C7271c;
import judi.com.service.C7370d;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0007J$\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/EmojiCartFragment;", "Ljudi/com/kottlinbase/ui/BaseFragment;", "Ljudi/com/kottlinbase/ui/BasePresenter;", "()V", "currentOtherApp", "", "parentView", "Ljudi/com/kottlinbase/ui/home/HomeView;", "createPresenter", "downloadOtherData", "", "getDataFile", "Ljava/io/File;", "layoutId", "", "loadDefault", "loadOtherApp", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEffectClick", "onInit", "view", "Landroid/view/View;", "arg", "randInt", "min", "max", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.home.EmojiCartFragment */
/* compiled from: EmojiCartFragment.kt */
public final class EmojiCartFragment extends C7221b<C7271c<?>> {

    /* renamed from: a */
    public static final C7306a f26567a = new C7306a(null);

    /* renamed from: b */
    private C7328d f26568b;

    /* renamed from: c */
    private String f26569c;

    /* renamed from: d */
    private HashMap f26570d;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/EmojiCartFragment$Companion;", "", "()V", "newInstance", "Ljudi/com/kottlinbase/ui/home/EmojiCartFragment;", "type", "", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.EmojiCartFragment$a */
    /* compiled from: EmojiCartFragment.kt */
    public static final class C7306a {
        private C7306a() {
        }

        public /* synthetic */ C7306a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final EmojiCartFragment mo23398a(int i) {
            EmojiCartFragment emojiCartFragment = new EmojiCartFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("arg_filter_type", i);
            emojiCartFragment.mo2102g(bundle);
            return emojiCartFragment;
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012 \u0005*\b\u0018\u00010\u0003R\u00020\u00040\u0003R\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, mo10386c = {"<anonymous>", "", "it", "Lcom/google/firebase/storage/FileDownloadTask$TaskSnapshot;", "Lcom/google/firebase/storage/FileDownloadTask;", "kotlin.jvm.PlatformType", "onSuccess"})
    /* renamed from: judi.com.kottlinbase.ui.home.EmojiCartFragment$b */
    /* compiled from: EmojiCartFragment.kt */
    static final class C7307b<TResult> implements C4739g<C6706a> {

        /* renamed from: a */
        final /* synthetic */ EmojiCartFragment f26571a;

        C7307b(EmojiCartFragment emojiCartFragment) {
            this.f26571a = emojiCartFragment;
        }

        /* renamed from: a */
        public final void mo14130a(C6706a aVar) {
            C7139a.m38192a().mo23021d();
            if (this.f26571a.mo2134x()) {
                try {
                    this.f26571a.m38899ak();
                } catch (Exception unused) {
                }
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onFailure"})
    /* renamed from: judi.com.kottlinbase.ui.home.EmojiCartFragment$c */
    /* compiled from: EmojiCartFragment.kt */
    static final class C7308c implements C4738f {

        /* renamed from: a */
        final /* synthetic */ EmojiCartFragment f26572a;

        C7308c(EmojiCartFragment emojiCartFragment) {
            this.f26572a = emojiCartFragment;
        }

        /* renamed from: a */
        public final void mo14129a(Exception exc) {
            C1489j.m6972b(exc, "it");
            if (this.f26572a.mo2134x()) {
                this.f26572a.m38900al();
            }
        }
    }

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
        return R.layout.view_emoji_card;
    }

    /* renamed from: d */
    public View mo23264d(int i) {
        if (this.f26570d == null) {
            this.f26570d = new HashMap();
        }
        View view = (View) this.f26570d.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26570d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public void mo23265e() {
        if (this.f26570d != null) {
            this.f26570d.clear();
        }
    }

    /* renamed from: a */
    public void mo2007a(Bundle bundle) {
        super.mo2007a(bundle);
        if (this.f26568b == null && (mo2120o() instanceof C7328d)) {
            C0656h o = mo2120o();
            if (o != null) {
                this.f26568b = (C7328d) o;
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.kottlinbase.ui.home.HomeView");
        }
    }

    /* renamed from: a */
    public void mo2006a(Context context) {
        C1489j.m6972b(context, "context");
        super.mo2006a(context);
        if (this.f26568b == null && (context instanceof C7328d)) {
            this.f26568b = (C7328d) context;
        }
    }

    /* renamed from: a */
    public void mo23262a(View view, Bundle bundle, Bundle bundle2) {
        C1489j.m6972b(view, "view");
        C7139a a = C7139a.m38192a();
        C1489j.m6969a((Object) a, "SessionManager.getInstance()");
        if (a.mo23022e()) {
            m38901am();
        } else {
            m38899ak();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ak */
    public final void m38899ak() {
        String str;
        try {
            File an = m38902an();
            if (!an.exists() || an.length() <= 0) {
                str = C7370d.m39131a(mo2116m(), (int) R.raw.other_app);
                C1489j.m6969a((Object) str, "FileUtil.readFileFromRaw…context, R.raw.other_app)");
            } else {
                str = C7370d.m39134a(an);
                C1489j.m6969a((Object) str, "FileUtil.readJson(dataFile)");
            }
            Object a = new C4299e().mo13132a(str, OtherAppWrapper.class);
            C1489j.m6969a(a, "gson.fromJson(strData, O…erAppWrapper::class.java)");
            OtherAppWrapper otherAppWrapper = (OtherAppWrapper) a;
            Iterator it = otherAppWrapper.getOtherApp().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OtherApp otherApp = (OtherApp) it.next();
                String packageName = otherApp.getPackageName();
                Context m = mo2116m();
                if (C1489j.m6971a((Object) packageName, (Object) m != null ? m.getPackageName() : null)) {
                    otherAppWrapper.getOtherApp().remove(otherApp);
                    break;
                }
            }
            int a2 = m38897a(0, otherAppWrapper.getOtherApp().size());
            if (!(!otherAppWrapper.getOtherApp().isEmpty()) || a2 < 0 || a2 >= otherAppWrapper.getOtherApp().size()) {
                m38900al();
                return;
            }
            this.f26569c = ((OtherApp) otherAppWrapper.getOtherApp().get(a2)).getPackageName();
            Context m2 = mo2116m();
            if (m2 == null) {
                C1489j.m6968a();
            }
            C1489j.m6969a((Object) ((C3413i) C3303c.m15109b(m2).mo10837a(((OtherApp) otherAppWrapper.getOtherApp().get(a2)).getThumb()).mo10676g()).mo10823a((ImageView) mo23264d(C7192a.imgThumbOtherApp)), "Glide.with(context!!)\n  …  .into(imgThumbOtherApp)");
        } catch (Exception unused) {
            m38900al();
        }
    }

    /* renamed from: a */
    private final int m38897a(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    /* access modifiers changed from: private */
    /* renamed from: al */
    public final void m38900al() {
        this.f26569c = "com.judi.autoblur";
        String str = "https://firebasestorage.googleapis.com/v0/b/callcolor-c893a.appspot.com/o/photo_project%2Ftut%2Fauto_intro.png?alt=media&token=cfed6674-421e-4e74-885c-e35ded283da3";
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        ((C3413i) C3303c.m15109b(m).mo10837a(str).mo10676g()).mo10823a((ImageView) mo23264d(C7192a.imgThumbOtherApp));
    }

    /* renamed from: am */
    private final void m38901am() {
        C6707e.m35606a().mo21211a("gs://callcolor-c893a.appspot.com/other_app/other_app.json").mo21219a(m38902an()).mo14138a((C4739g<? super TResult>) new C7307b<Object>(this)).mo14137a((C4738f) new C7308c(this));
    }

    /* renamed from: an */
    private final File m38902an() {
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) m, "context!!");
        File a = C7370d.m39130a(m.getFilesDir(), "other_app", "other_app", "json");
        C1489j.m6969a((Object) a, "FileUtil.createFile(cont…pp\", \"other_app\", \"json\")");
        return a;
    }

    @OnClick
    public final void onEffectClick() {
        C7328d dVar = this.f26568b;
        if (dVar != null) {
            dVar.mo23403d(0);
        }
    }
}
