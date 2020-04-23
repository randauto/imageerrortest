package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.p275a;

import android.content.Context;
import android.support.p064v7.widget.RecyclerView.C1153a;
import android.view.LayoutInflater;
import judi.com.kottlinbase.p274ui.p275a.C7220b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J'\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, mo10386c = {"Ljudi/com/kottlinbase/ui/base/BaseAdpater;", "VH", "Ljudi/com/kottlinbase/ui/base/BaseHolder;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "inflate", "Landroid/view/LayoutInflater;", "getInflate", "()Landroid/view/LayoutInflater;", "getString", "", "id", "", "params", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.a.a */
/* compiled from: BaseAdpater.kt */
public abstract class C7219a<VH extends C7220b> extends C1153a<VH> {

    /* renamed from: a */
    private final LayoutInflater f26367a;

    /* renamed from: b */
    private final Context f26368b;

    public C7219a(Context context) {
        C1489j.m6972b(context, "context");
        this.f26368b = context;
        LayoutInflater from = LayoutInflater.from(this.f26368b);
        C1489j.m6969a((Object) from, "LayoutInflater.from(context)");
        this.f26367a = from;
    }

    /* renamed from: f */
    public final Context mo23261f() {
        return this.f26368b;
    }

    /* renamed from: e */
    public final LayoutInflater mo23260e() {
        return this.f26367a;
    }
}
