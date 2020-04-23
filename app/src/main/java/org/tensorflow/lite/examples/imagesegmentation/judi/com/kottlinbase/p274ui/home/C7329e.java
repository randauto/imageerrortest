package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.p156f.C3344a;
import com.bumptech.glide.p156f.C3369h;
import com.judi.emojiphoto.R;
import java.util.List;
import judi.com.kottlinbase.p274ui.p275a.C7219a;
import judi.com.kottlinbase.p274ui.p275a.C7220b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/RecentAdapter;", "Ljudi/com/kottlinbase/ui/base/BaseAdpater;", "Ljudi/com/kottlinbase/ui/home/RecentAdapter$PhotoHolder;", "context", "Landroid/content/Context;", "list", "", "", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "PhotoHolder", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.home.e */
/* compiled from: RecentAdapter.kt */
public final class C7329e extends C7219a<C7330a> {

    /* renamed from: a */
    private final List<String> f26620a;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/RecentAdapter$PhotoHolder;", "Ljudi/com/kottlinbase/ui/base/BaseHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "img", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "bind", "", "path", "", "context", "Landroid/content/Context;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.home.e$a */
    /* compiled from: RecentAdapter.kt */
    public static final class C7330a extends C7220b {

        /* renamed from: q */
        private ImageView f26621q;

        public C7330a(View view) {
            C1489j.m6972b(view, "view");
            super(view);
            this.f26621q = (ImageView) view.findViewById(R.id.imgThumb);
        }

        /* renamed from: a */
        public final void mo23414a(String str, Context context) {
            C1489j.m6972b(str, "path");
            C1489j.m6972b(context, "context");
            C3303c.m15109b(context).mo10837a(str).mo10667b((C3344a<?>) C3369h.m15420b()).mo10823a(this.f26621q);
        }
    }

    public C7329e(Context context, List<String> list) {
        C1489j.m6972b(context, "context");
        C1489j.m6972b(list, "list");
        super(context);
        this.f26620a = list;
    }

    /* renamed from: c */
    public C7330a mo4763a(ViewGroup viewGroup, int i) {
        C1489j.m6972b(viewGroup, "p0");
        View inflate = mo23260e().inflate(R.layout.item_recent_photo, viewGroup, false);
        C1489j.m6969a((Object) inflate, "view");
        return new C7330a(inflate);
    }

    /* renamed from: a */
    public int mo4761a() {
        return this.f26620a.size();
    }

    /* renamed from: a */
    public void mo4767a(C7330a aVar, int i) {
        C1489j.m6972b(aVar, "p0");
        aVar.mo23414a((String) this.f26620a.get(i), mo23261f());
    }
}
