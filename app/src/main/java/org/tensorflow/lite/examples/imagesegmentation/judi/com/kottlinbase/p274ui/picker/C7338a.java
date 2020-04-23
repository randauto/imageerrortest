package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.picker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C3303c;
import com.bumptech.glide.C3413i;
import com.judi.emojiphoto.R;
import com.zhihu.matisse.internal.p248a.C6927a;
import java.util.ArrayList;
import judi.com.kottlinbase.p274ui.p275a.C7219a;
import judi.com.kottlinbase.p274ui.p275a.C7220b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo10386c = {"Ljudi/com/kottlinbase/ui/picker/AlbumAdapter;", "Ljudi/com/kottlinbase/ui/base/BaseAdpater;", "Ljudi/com/kottlinbase/ui/picker/AlbumAdapter$AlbumHolder;", "context", "Landroid/content/Context;", "list", "Ljava/util/ArrayList;", "Lcom/zhihu/matisse/internal/entity/Album;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "AlbumHolder", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.picker.a */
/* compiled from: AlbumAdapter.kt */
public final class C7338a extends C7219a<C7339a> {

    /* renamed from: a */
    private final ArrayList<C6927a> f26642a;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo10386c = {"Ljudi/com/kottlinbase/ui/picker/AlbumAdapter$AlbumHolder;", "Ljudi/com/kottlinbase/ui/base/BaseHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imgThumb", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "tvName", "Landroid/widget/TextView;", "bind", "", "context", "Landroid/content/Context;", "album", "Lcom/zhihu/matisse/internal/entity/Album;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.picker.a$a */
    /* compiled from: AlbumAdapter.kt */
    public static final class C7339a extends C7220b {

        /* renamed from: q */
        private ImageView f26643q;

        /* renamed from: r */
        private TextView f26644r;

        public C7339a(View view) {
            C1489j.m6972b(view, "view");
            super(view);
            this.f26643q = (ImageView) view.findViewById(R.id.imgThumb);
            this.f26644r = (TextView) view.findViewById(R.id.tvAlbumName);
        }

        /* renamed from: a */
        public final void mo23427a(Context context, C6927a aVar) {
            C1489j.m6972b(context, "context");
            C1489j.m6972b(aVar, "album");
            TextView textView = this.f26644r;
            C1489j.m6969a((Object) textView, "tvName");
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.mo21602a(context));
            sb.append(" (");
            sb.append(aVar.mo21604c());
            sb.append(")");
            textView.setText(sb.toString());
            ((C3413i) C3303c.m15109b(context).mo10837a(aVar.mo21603b()).mo10676g()).mo10823a(this.f26643q);
        }
    }

    public C7338a(Context context, ArrayList<C6927a> arrayList) {
        C1489j.m6972b(context, "context");
        C1489j.m6972b(arrayList, "list");
        super(context);
        this.f26642a = arrayList;
    }

    /* renamed from: c */
    public C7339a mo4763a(ViewGroup viewGroup, int i) {
        C1489j.m6972b(viewGroup, "p0");
        View inflate = mo23260e().inflate(R.layout.item_album, viewGroup, false);
        C1489j.m6969a((Object) inflate, "view");
        return new C7339a(inflate);
    }

    /* renamed from: a */
    public int mo4761a() {
        return this.f26642a.size();
    }

    /* renamed from: a */
    public void mo4767a(C7339a aVar, int i) {
        C1489j.m6972b(aVar, "p0");
        Context f = mo23261f();
        Object obj = this.f26642a.get(i);
        C1489j.m6969a(obj, "list[p1]");
        aVar.mo23427a(f, (C6927a) obj);
    }
}
