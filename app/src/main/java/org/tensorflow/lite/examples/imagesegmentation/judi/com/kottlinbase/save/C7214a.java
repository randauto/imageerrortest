package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.save;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.C3413i;
import com.judi.emojiphoto.R;
import java.util.List;
import judi.com.kottlinbase.p272a.C7189c;
import judi.com.kottlinbase.p274ui.p275a.C7219a;
import judi.com.kottlinbase.p274ui.p275a.C7220b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo10386c = {"Ljudi/com/kottlinbase/save/ResultAdapter;", "Ljudi/com/kottlinbase/ui/base/BaseAdpater;", "Ljudi/com/kottlinbase/save/ResultAdapter$ResultHolder;", "context", "Landroid/content/Context;", "result", "", "", "(Landroid/content/Context;Ljava/util/List;)V", "itemHeight", "", "getItemCount", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "ResultHolder", "app_release"})
/* renamed from: judi.com.kottlinbase.save.a */
/* compiled from: ResultAdapter.kt */
public final class C7214a extends C7219a<C7215a> {

    /* renamed from: a */
    private final List<String> f26357a;

    /* renamed from: b */
    private int f26358b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo10386c = {"Ljudi/com/kottlinbase/save/ResultAdapter$ResultHolder;", "Ljudi/com/kottlinbase/ui/base/BaseHolder;", "view", "Landroid/view/View;", "itemHeight", "", "(Landroid/view/View;I)V", "img", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "bind", "", "context", "Landroid/content/Context;", "path", "", "app_release"})
    /* renamed from: judi.com.kottlinbase.save.a$a */
    /* compiled from: ResultAdapter.kt */
    public static final class C7215a extends C7220b {

        /* renamed from: q */
        private ImageView f26359q;

        public C7215a(View view, int i) {
            C1489j.m6972b(view, "view");
            super(view);
            View view2 = this.f3981a;
            C1489j.m6969a((Object) view2, "itemView");
            view2.getLayoutParams().height = i;
            this.f26359q = (ImageView) view.findViewById(R.id.img);
        }

        /* renamed from: a */
        public final void mo23240a(Context context, String str) {
            C1489j.m6972b(context, "context");
            C1489j.m6972b(str, "path");
            ((C3413i) C3303c.m15109b(context).mo10837a(str).mo10676g()).mo10823a(this.f26359q);
        }
    }

    public C7214a(Context context, List<String> list) {
        C1489j.m6972b(context, "context");
        C1489j.m6972b(list, "result");
        super(context);
        this.f26357a = list;
        this.f26358b = (((C7189c.f26296a.mo23126b(context) - C7189c.f26296a.mo23125a(context, 8)) / 2) * 236) / 137;
    }

    /* renamed from: c */
    public C7215a mo4763a(ViewGroup viewGroup, int i) {
        C1489j.m6972b(viewGroup, "p0");
        View inflate = mo23260e().inflate(R.layout.item_result, viewGroup, false);
        C1489j.m6969a((Object) inflate, "view");
        return new C7215a(inflate, this.f26358b);
    }

    /* renamed from: a */
    public int mo4761a() {
        return this.f26357a.size();
    }

    /* renamed from: a */
    public void mo4767a(C7215a aVar, int i) {
        C1489j.m6972b(aVar, "p0");
        aVar.mo23240a(mo23261f(), (String) this.f26357a.get(i));
    }
}
