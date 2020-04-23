package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry.editor.bokeh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.judi.emojiphoto.R;
import java.util.List;
import judi.com.kottlinbase.model.Settings;
import judi.com.kottlinbase.p274ui.p275a.C7219a;
import judi.com.kottlinbase.p274ui.p275a.C7220b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehCatAdapter;", "Ljudi/com/kottlinbase/ui/base/BaseAdpater;", "Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehCatAdapter$CatHolder;", "context", "Landroid/content/Context;", "list", "", "", "(Landroid/content/Context;Ljava/util/List;)V", "current", "getCurrent", "()Ljava/lang/String;", "setCurrent", "(Ljava/lang/String;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "CatHolder", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.a */
/* compiled from: BokehCatAdapter.kt */
public final class C7265a extends C7219a<C7266a> {

    /* renamed from: a */
    private final List<String> f26466a;

    /* renamed from: b */
    private String f26467b = Settings.Companion.settings().getDefaultBokeh();

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehCatAdapter$CatHolder;", "Ljudi/com/kottlinbase/ui/base/BaseHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "container", "kotlin.jvm.PlatformType", "tvName", "Landroid/widget/TextView;", "bind", "", "name", "", "current", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.a$a */
    /* compiled from: BokehCatAdapter.kt */
    public static final class C7266a extends C7220b {

        /* renamed from: q */
        private final TextView f26468q;

        /* renamed from: r */
        private final View f26469r;

        public C7266a(View view) {
            C1489j.m6972b(view, "view");
            super(view);
            this.f26468q = (TextView) view.findViewById(R.id.tvBokehCat);
            this.f26469r = view.findViewById(R.id.container);
        }

        /* renamed from: a */
        public final void mo23355a(String str, String str2) {
            C1489j.m6972b(str, "name");
            C1489j.m6972b(str2, "current");
            TextView textView = this.f26468q;
            C1489j.m6969a((Object) textView, "tvName");
            textView.setText(str);
            View view = this.f26469r;
            C1489j.m6969a((Object) view, "container");
            view.setSelected(C1489j.m6971a((Object) str, (Object) str2));
        }
    }

    /* renamed from: a */
    public final void mo23352a(String str) {
        C1489j.m6972b(str, "<set-?>");
        this.f26467b = str;
    }

    public C7265a(Context context, List<String> list) {
        C1489j.m6972b(context, "context");
        C1489j.m6972b(list, "list");
        super(context);
        this.f26466a = list;
    }

    /* renamed from: c */
    public C7266a mo4763a(ViewGroup viewGroup, int i) {
        C1489j.m6972b(viewGroup, "p0");
        if (i == 0) {
            View inflate = mo23260e().inflate(R.layout.item_bokeh_cat, viewGroup, false);
            C1489j.m6969a((Object) inflate, "view");
            return new C7266a(inflate);
        }
        View inflate2 = mo23260e().inflate(R.layout.item_bokeh_download, viewGroup, false);
        C1489j.m6969a((Object) inflate2, "view");
        return new C7266a(inflate2);
    }

    /* renamed from: a */
    public int mo4761a() {
        return this.f26466a.size();
    }

    /* renamed from: a */
    public void mo4767a(C7266a aVar, int i) {
        C1489j.m6972b(aVar, "p0");
        if (mo4762a(i) == 0) {
            aVar.mo23355a((String) this.f26466a.get(i), this.f26467b);
        }
    }

    /* renamed from: a */
    public int mo4762a(int i) {
        return i >= this.f26466a.size() ? 1 : 0;
    }
}
