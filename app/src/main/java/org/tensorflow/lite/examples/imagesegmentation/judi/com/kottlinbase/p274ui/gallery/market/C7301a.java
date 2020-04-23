package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.gallery.market;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.p156f.C3369h;
import com.judi.emojiphoto.R;
import java.util.List;
import judi.com.kottlinbase.model.BokehMarket;
import judi.com.kottlinbase.p272a.C7189c;
import judi.com.kottlinbase.p274ui.p275a.C7219a;
import judi.com.kottlinbase.p274ui.p275a.C7220b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo10386c = {"Ljudi/com/kottlinbase/ui/gallery/market/BokehMarketAdapter;", "Ljudi/com/kottlinbase/ui/base/BaseAdpater;", "Ljudi/com/kottlinbase/ui/gallery/market/BokehMarketAdapter$BokeHolder;", "context", "Landroid/content/Context;", "list", "", "Ljudi/com/kottlinbase/model/BokehMarket;", "(Landroid/content/Context;Ljava/util/List;)V", "itemHeight", "", "getItemCount", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "BokeHolder", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.gallery.market.a */
/* compiled from: BokehMarketAdapter.kt */
public final class C7301a extends C7219a<C7302a> {

    /* renamed from: a */
    private final List<BokehMarket> f26551a;

    /* renamed from: b */
    private int f26552b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/ui/gallery/market/BokehMarketAdapter$BokeHolder;", "Ljudi/com/kottlinbase/ui/base/BaseHolder;", "view", "Landroid/view/View;", "itemHeight", "", "(Landroid/view/View;I)V", "thumb", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "tvName", "Landroid/widget/TextView;", "bind", "", "context", "Landroid/content/Context;", "item", "Ljudi/com/kottlinbase/model/BokehMarket;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.gallery.market.a$a */
    /* compiled from: BokehMarketAdapter.kt */
    public static final class C7302a extends C7220b {

        /* renamed from: q */
        private final ImageView f26553q;

        /* renamed from: r */
        private final TextView f26554r;

        public C7302a(View view, int i) {
            C1489j.m6972b(view, "view");
            super(view);
            this.f26553q = (ImageView) view.findViewById(R.id.imgThumb);
            this.f26554r = (TextView) view.findViewById(R.id.tvName);
            view.getLayoutParams().height = i;
        }

        /* renamed from: a */
        public final void mo23394a(Context context, BokehMarket bokehMarket) {
            C1489j.m6972b(context, "context");
            C1489j.m6972b(bokehMarket, "item");
            TextView textView = this.f26554r;
            C1489j.m6969a((Object) textView, "tvName");
            textView.setText(bokehMarket.getName());
            C3303c.m15109b(context).mo10837a(bokehMarket.getThumbnailUrl()).mo10667b(new C3369h().mo10676g()).mo10823a(this.f26553q);
        }
    }

    public C7301a(Context context, List<BokehMarket> list) {
        C1489j.m6972b(context, "context");
        C1489j.m6972b(list, "list");
        super(context);
        this.f26551a = list;
        this.f26552b = ((C7189c.f26296a.mo23126b(context) - C7189c.f26296a.mo23125a(context, 32)) * 167) / 300;
    }

    /* renamed from: c */
    public C7302a mo4763a(ViewGroup viewGroup, int i) {
        C1489j.m6972b(viewGroup, "p0");
        View inflate = mo23260e().inflate(R.layout.item_shape_market, viewGroup, false);
        C1489j.m6969a((Object) inflate, "view");
        return new C7302a(inflate, this.f26552b);
    }

    /* renamed from: a */
    public int mo4761a() {
        return this.f26551a.size();
    }

    /* renamed from: a */
    public void mo4767a(C7302a aVar, int i) {
        C1489j.m6972b(aVar, "p0");
        aVar.mo23394a(mo23261f(), (BokehMarket) this.f26551a.get(i));
    }
}
