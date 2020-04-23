package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p053v4.app.C0656h;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.OnClick;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.C3413i;
import com.google.p187a.C4299e;
import com.judi.emojiphoto.R;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.model.OtherApp;
import judi.com.kottlinbase.model.OtherAppWrapper;
import judi.com.kottlinbase.p272a.C7189c;
import judi.com.kottlinbase.p274ui.p276b.C7228c;
import judi.com.service.C7370d;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0007J&\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/OtherAppDialog;", "Ljudi/com/kottlinbase/ui/dialog/BaseDialogFragment;", "()V", "currentOtherApp", "", "bindOtherApp", "", "app", "Ljudi/com/kottlinbase/model/OtherApp;", "getDataFile", "Ljava/io/File;", "getLayoutId", "", "loadDefault", "loadOtherApp", "onDownloadClick", "onExistClick", "onInit", "view", "Landroid/view/View;", "fragmentArg", "Landroid/os/Bundle;", "saveInstance", "randInt", "min", "max", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.home.OtherAppDialog */
/* compiled from: OtherAppDialog.kt */
public final class OtherAppDialog extends C7228c {

    /* renamed from: ag */
    private String f26606ag;

    /* renamed from: ah */
    private HashMap f26607ah;

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23298ao();
    }

    /* renamed from: al */
    public int mo23295al() {
        return R.layout.dialog_other_app;
    }

    /* renamed from: ao */
    public void mo23298ao() {
        if (this.f26607ah != null) {
            this.f26607ah.clear();
        }
    }

    /* renamed from: d */
    public View mo23300d(int i) {
        if (this.f26607ah == null) {
            this.f26607ah = new HashMap();
        }
        View view = (View) this.f26607ah.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26607ah.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo23293a(View view, Bundle bundle, Bundle bundle2) {
        mo2011b(true);
        m38955ar();
        float b = ((float) C7189c.f26296a.mo23126b(mo2116m())) * 0.96f;
        ImageView imageView = (ImageView) mo23300d(C7192a.imgThumb);
        C1489j.m6969a((Object) imageView, "imgThumb");
        imageView.getLayoutParams().height = (int) ((b * ((float) 530)) / ((float) 870));
    }

    @OnClick
    public final void onDownloadClick() {
        if (this.f26606ag != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("market://details?id=");
                sb.append(this.f26606ag);
                mo2062a(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
            } catch (ActivityNotFoundException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https://play.google.com/store/apps/details?id=");
                sb2.append(this.f26606ag);
                mo2062a(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
            }
        } else {
            try {
                mo2062a(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:Judi+Studio")));
            } catch (ActivityNotFoundException unused2) {
                mo2062a(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/search?q=pub:Judi+Studio")));
            }
        }
    }

    @OnClick
    public final void onExistClick() {
        C0656h o = mo2120o();
        if (o != null) {
            o.finish();
        }
    }

    /* renamed from: c */
    private final int m38957c(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    /* renamed from: aq */
    private final File m38954aq() {
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        C1489j.m6969a((Object) m, "context!!");
        File a = C7370d.m39130a(m.getFilesDir(), "other_app", "other_app", "json");
        C1489j.m6969a((Object) a, "FileUtil.createFile(cont…pp\", \"other_app\", \"json\")");
        return a;
    }

    /* renamed from: ar */
    private final void m38955ar() {
        String str;
        try {
            File aq = m38954aq();
            if (!aq.exists() || aq.length() <= 0) {
                str = C7370d.m39131a(mo2116m(), (int) R.raw.other_app);
                C1489j.m6969a((Object) str, "FileUtil.readFileFromRaw…context, R.raw.other_app)");
            } else {
                str = C7370d.m39134a(aq);
                C1489j.m6969a((Object) str, "FileUtil.readJson(dataFile)");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(": str other app");
            sb.append(str);
            Log.d("dddd", sb.toString());
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
            int c = m38957c(0, otherAppWrapper.getOtherApp().size());
            if (!(!otherAppWrapper.getOtherApp().isEmpty()) || c < 0 || c >= otherAppWrapper.getOtherApp().size()) {
                m38956as();
                return;
            }
            this.f26606ag = ((OtherApp) otherAppWrapper.getOtherApp().get(c)).getPackageName();
            m38953a((OtherApp) otherAppWrapper.getOtherApp().get(c));
        } catch (Exception e) {
            Log.d("dddd", e.toString());
            m38956as();
        }
    }

    /* renamed from: a */
    private final void m38953a(OtherApp otherApp) {
        TextView textView = (TextView) mo23300d(C7192a.tvAppTitle);
        C1489j.m6969a((Object) textView, "tvAppTitle");
        textView.setText(otherApp.getTitle());
        TextView textView2 = (TextView) mo23300d(C7192a.tvAppContent);
        C1489j.m6969a((Object) textView2, "tvAppContent");
        textView2.setText(otherApp.getAppContent());
        Context m = mo2116m();
        if (m == null) {
            C1489j.m6968a();
        }
        ((C3413i) C3303c.m15109b(m).mo10837a(otherApp.getThumb()).mo10676g()).mo10823a((ImageView) mo23300d(C7192a.imgThumb));
    }

    /* renamed from: as */
    private final void m38956as() {
        m38953a(new OtherApp("Emoji background changer - emoji photo editor", "com.judi.emojiphoto", "https://firebasestorage.googleapis.com/v0/b/callcolor-c893a.appspot.com/o/photo_project%2Ftut%2Femoji_photo_intro.png?alt=media&token=a445357f-ccf3-4157-b37c-de1dde0310be", "★ Easy to use with a simple interface\n★ More than 50++ emoji background\n★ Create your own emoticons\n★ Emoji picker hundreds of emoticons for you"));
    }
}
