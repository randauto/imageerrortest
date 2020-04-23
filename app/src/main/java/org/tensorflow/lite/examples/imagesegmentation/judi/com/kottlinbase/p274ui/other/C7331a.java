package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.other;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.p156f.C3369h;
import com.judi.emojiphoto.R;
import java.util.List;
import judi.com.kottlinbase.model.OtherApp;
import judi.com.kottlinbase.p272a.C7189c;
import judi.com.kottlinbase.p274ui.p275a.C7219a;
import judi.com.kottlinbase.p274ui.p275a.C7220b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo10386c = {"Ljudi/com/kottlinbase/ui/other/OtherAppAdapter;", "Ljudi/com/kottlinbase/ui/base/BaseAdpater;", "Ljudi/com/kottlinbase/ui/other/OtherAppAdapter$OtherAppHolder;", "context", "Landroid/content/Context;", "list", "", "Ljudi/com/kottlinbase/model/OtherApp;", "(Landroid/content/Context;Ljava/util/List;)V", "itemHeight", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OtherAppHolder", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.other.a */
/* compiled from: OtherAppAdapter.kt */
public final class C7331a extends C7219a<C7332a> {

    /* renamed from: a */
    private List<OtherApp> f26626a;

    /* renamed from: b */
    private int f26627b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/ui/other/OtherAppAdapter$OtherAppHolder;", "Ljudi/com/kottlinbase/ui/base/BaseHolder;", "height", "", "view", "Landroid/view/View;", "(ILandroid/view/View;)V", "img", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "tvName", "Landroid/widget/TextView;", "bind", "", "context", "Landroid/content/Context;", "app", "Ljudi/com/kottlinbase/model/OtherApp;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.other.a$a */
    /* compiled from: OtherAppAdapter.kt */
    public static final class C7332a extends C7220b {

        /* renamed from: q */
        private final ImageView f26628q;

        /* renamed from: r */
        private final TextView f26629r;

        public C7332a(int i, View view) {
            C1489j.m6972b(view, "view");
            super(view);
            this.f26628q = (ImageView) view.findViewById(R.id.imgThumb);
            this.f26629r = (TextView) view.findViewById(R.id.tvAppName);
            View view2 = this.f3981a;
            C1489j.m6969a((Object) view2, "itemView");
            view2.getLayoutParams().height = i;
        }

        /* renamed from: a */
        public final void mo23417a(Context context, OtherApp otherApp) {
            C1489j.m6972b(context, "context");
            C1489j.m6972b(otherApp, "app");
            TextView textView = this.f26629r;
            C1489j.m6969a((Object) textView, "tvName");
            textView.setText(otherApp.getTitle());
            C3303c.m15109b(context).mo10837a(otherApp.getThumb()).mo10667b(new C3369h().mo10676g()).mo10823a(this.f26628q);
        }
    }

    public C7331a(Context context, List<OtherApp> list) {
        C1489j.m6972b(context, "context");
        C1489j.m6972b(list, "list");
        super(context);
        this.f26626a = list;
        this.f26627b = ((C7189c.f26296a.mo23126b(context) - C7189c.f26296a.mo23125a(context, 16)) * 530) / 870;
    }

    /* renamed from: c */
    public C7332a mo4763a(ViewGroup viewGroup, int i) {
        C1489j.m6972b(viewGroup, "parent");
        int i2 = this.f26627b;
        View inflate = mo23260e().inflate(R.layout.item_other_app, viewGroup, false);
        C1489j.m6969a((Object) inflate, "inflate.inflate(R.layout…other_app, parent, false)");
        return new C7332a(i2, inflate);
    }

    /* renamed from: a */
    public int mo4761a() {
        return this.f26626a.size();
    }

    /* renamed from: a */
    public void mo4767a(C7332a aVar, int i) {
        C1489j.m6972b(aVar, "holder");
        aVar.mo23417a(mo23261f(), (OtherApp) this.f26626a.get(i));
    }
}
