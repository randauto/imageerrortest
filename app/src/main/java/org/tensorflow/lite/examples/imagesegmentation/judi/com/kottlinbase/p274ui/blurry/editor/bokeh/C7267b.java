package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.blurry.editor.bokeh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.C3413i;
import com.judi.emojiphoto.R;
import java.util.List;
import judi.com.kottlinbase.model.ITexture;
import judi.com.kottlinbase.p274ui.p275a.C7219a;
import judi.com.kottlinbase.p274ui.p275a.C7220b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehTextureAdapter;", "Ljudi/com/kottlinbase/ui/base/BaseAdpater;", "Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehTextureAdapter$BlurHolder;", "context", "Landroid/content/Context;", "effects", "", "Ljudi/com/kottlinbase/model/ITexture;", "(Landroid/content/Context;Ljava/util/List;)V", "textures", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "BlurHolder", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.b */
/* compiled from: BokehTextureAdapter.kt */
public final class C7267b extends C7219a<C7268a> {

    /* renamed from: a */
    private final List<ITexture> f26470a;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo10386c = {"Ljudi/com/kottlinbase/ui/blurry/editor/bokeh/BokehTextureAdapter$BlurHolder;", "Ljudi/com/kottlinbase/ui/base/BaseHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imgThumb", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "tvTitle", "Landroid/widget/TextView;", "bind", "", "context", "Landroid/content/Context;", "texture", "Ljudi/com/kottlinbase/model/ITexture;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.blurry.editor.bokeh.b$a */
    /* compiled from: BokehTextureAdapter.kt */
    public static final class C7268a extends C7220b {

        /* renamed from: q */
        private ImageView f26471q;

        /* renamed from: r */
        private TextView f26472r;

        public C7268a(View view) {
            C1489j.m6972b(view, "view");
            super(view);
            this.f26471q = (ImageView) view.findViewById(R.id.imgThumb);
            this.f26472r = (TextView) view.findViewById(R.id.tvType);
        }

        /* renamed from: a */
        public final void mo23358a(Context context, ITexture iTexture) {
            C1489j.m6972b(context, "context");
            C1489j.m6972b(iTexture, "texture");
            TextView textView = this.f26472r;
            C1489j.m6969a((Object) textView, "tvTitle");
            textView.setText("");
            ((C3413i) C3303c.m15109b(context).mo10837a(iTexture.textureThumbnail()).mo10666b(100, 100)).mo10823a(this.f26471q);
        }
    }

    public C7267b(Context context, List<ITexture> list) {
        C1489j.m6972b(context, "context");
        C1489j.m6972b(list, "effects");
        super(context);
        this.f26470a = list;
    }

    /* renamed from: c */
    public C7268a mo4763a(ViewGroup viewGroup, int i) {
        C1489j.m6972b(viewGroup, "p0");
        View inflate = mo23260e().inflate(R.layout.item_blur_type, viewGroup, false);
        C1489j.m6969a((Object) inflate, "view");
        return new C7268a(inflate);
    }

    /* renamed from: a */
    public int mo4761a() {
        return this.f26470a.size();
    }

    /* renamed from: a */
    public void mo4767a(C7268a aVar, int i) {
        C1489j.m6972b(aVar, "p0");
        aVar.mo23358a(mo23261f(), (ITexture) this.f26470a.get(i));
    }
}
