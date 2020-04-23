package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.picker;

import android.content.Context;
import android.os.Bundle;
import android.support.p053v4.app.C0656h;
import android.support.p064v7.widget.LinearLayoutManager;
import android.support.p064v7.widget.RecyclerView;
import android.view.View;
import com.judi.emojiphoto.R;
import com.zhihu.matisse.internal.p248a.C6927a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.p272a.C7182a;
import judi.com.kottlinbase.p272a.C7182a.C7186a;
import judi.com.kottlinbase.p274ui.p276b.C7228c;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J&\u0010\u0013\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016J$\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0016R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo10386c = {"Ljudi/com/kottlinbase/ui/picker/AlbumListDialogFragment;", "Ljudi/com/kottlinbase/ui/dialog/BaseDialogFragment;", "Ljudi/com/kottlinbase/utils/ItemClickSupport$OnItemClickListener;", "()V", "albums", "Ljava/util/ArrayList;", "Lcom/zhihu/matisse/internal/entity/Album;", "Lkotlin/collections/ArrayList;", "view", "Ljudi/com/kottlinbase/ui/picker/PickerView;", "getLayoutId", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInit", "Landroid/view/View;", "fragmentArg", "saveInstance", "onItemClicked", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "position", "v", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.picker.b */
/* compiled from: AlbumListDialogFragment.kt */
public final class C7340b extends C7228c implements C7186a {

    /* renamed from: ag */
    public static final C7341a f26645ag = new C7341a(null);

    /* renamed from: ah */
    private ArrayList<C6927a> f26646ah;

    /* renamed from: ai */
    private C7342c f26647ai;

    /* renamed from: aj */
    private HashMap f26648aj;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, mo10386c = {"Ljudi/com/kottlinbase/ui/picker/AlbumListDialogFragment$Companion;", "", "()V", "newInstance", "Ljudi/com/kottlinbase/ui/picker/AlbumListDialogFragment;", "albums", "", "Lcom/zhihu/matisse/internal/entity/Album;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.picker.b$a */
    /* compiled from: AlbumListDialogFragment.kt */
    public static final class C7341a {
        private C7341a() {
        }

        public /* synthetic */ C7341a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C7340b mo23428a(List<? extends C6927a> list) {
            C1489j.m6972b(list, "albums");
            C7340b bVar = new C7340b();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("arg_album_list", new ArrayList(list));
            bVar.mo2102g(bundle);
            return bVar;
        }
    }

    /* renamed from: P_ */
    public /* synthetic */ void mo2002P_() {
        super.mo2002P_();
        mo23298ao();
    }

    /* renamed from: al */
    public int mo23295al() {
        return R.layout.dialog_album_list;
    }

    /* renamed from: ao */
    public void mo23298ao() {
        if (this.f26648aj != null) {
            this.f26648aj.clear();
        }
    }

    /* renamed from: d */
    public View mo23300d(int i) {
        if (this.f26648aj == null) {
            this.f26648aj = new HashMap();
        }
        View view = (View) this.f26648aj.get(Integer.valueOf(i));
        if (view == null) {
            View A = mo2023A();
            if (A == null) {
                return null;
            }
            view = A.findViewById(i);
            this.f26648aj.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo2007a(Bundle bundle) {
        super.mo2007a(bundle);
        if (this.f26647ai == null && (mo2120o() instanceof C7342c)) {
            C0656h o = mo2120o();
            if (o != null) {
                this.f26647ai = (C7342c) o;
                return;
            }
            throw new C3227u("null cannot be cast to non-null type judi.com.kottlinbase.ui.picker.PickerView");
        }
    }

    /* renamed from: a */
    public void mo2006a(Context context) {
        super.mo2006a(context);
        if (this.f26647ai == null && (context instanceof C7342c)) {
            this.f26647ai = (C7342c) context;
        }
    }

    /* renamed from: a */
    public void mo23293a(View view, Bundle bundle, Bundle bundle2) {
        this.f26646ah = bundle != null ? bundle.getParcelableArrayList("arg_album_list") : null;
        if (this.f26646ah == null) {
            mo2013c();
            return;
        }
        RecyclerView recyclerView = (RecyclerView) mo23300d(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView, "recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(mo23299ap()));
        ((RecyclerView) mo23300d(C7192a.recyclerView)).setHasFixedSize(true);
        RecyclerView recyclerView2 = (RecyclerView) mo23300d(C7192a.recyclerView);
        C1489j.m6969a((Object) recyclerView2, "recyclerView");
        Context ap = mo23299ap();
        if (ap == null) {
            C1489j.m6968a();
        }
        ArrayList<C6927a> arrayList = this.f26646ah;
        if (arrayList == null) {
            C1489j.m6968a();
        }
        recyclerView2.setAdapter(new C7338a(ap, arrayList));
        C7182a.m38386a((RecyclerView) mo23300d(C7192a.recyclerView)).mo23118a((C7186a) this);
    }

    /* renamed from: a */
    public void mo23122a(RecyclerView recyclerView, int i, View view) {
        C7342c cVar = this.f26647ai;
        if (cVar != null) {
            cVar.mo23418c(i);
        }
        mo2013c();
    }
}
