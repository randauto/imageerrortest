package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p064v7.widget.AppCompatImageButton;
import android.support.p064v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.judi.emojiphoto.R;
import java.util.HashMap;
import judi.com.kottlinbase.C7191b.C7192a;
import judi.com.kottlinbase.C7191b.C7193b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\tH\u0002R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, mo10386c = {"Ljudi/com/kottlinbase/ui/HeaderBar;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listener", "Ljudi/com/kottlinbase/ui/HeaderBar$OnHeaderBarListener;", "getListener", "()Ljudi/com/kottlinbase/ui/HeaderBar$OnHeaderBarListener;", "setListener", "(Ljudi/com/kottlinbase/ui/HeaderBar$OnHeaderBarListener;)V", "onClick", "", "v", "Landroid/view/View;", "setLeftIcon", "icon", "setLeftIcon2", "setRight1Icon", "setRight2Icon", "OnHeaderBarListener", "SimpleHeaderBarListener", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.HeaderBar */
/* compiled from: HeaderBar.kt */
public final class HeaderBar extends RelativeLayout implements OnClickListener {

    /* renamed from: a */
    private C7216a f26360a;

    /* renamed from: b */
    private HashMap f26361b;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, mo10386c = {"Ljudi/com/kottlinbase/ui/HeaderBar$OnHeaderBarListener;", "", "onHeaderMenuLef2", "", "onHeaderMenuLeft", "onHeaderRight1", "view", "Landroid/view/View;", "onHeaderRight2", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.HeaderBar$a */
    /* compiled from: HeaderBar.kt */
    public interface C7216a {
        /* renamed from: a */
        void mo23245a();

        /* renamed from: a */
        void mo23246a(View view);

        /* renamed from: b */
        void mo23247b(View view);
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, mo10386c = {"Ljudi/com/kottlinbase/ui/HeaderBar$SimpleHeaderBarListener;", "Ljudi/com/kottlinbase/ui/HeaderBar$OnHeaderBarListener;", "()V", "onHeaderMenuLef2", "", "onHeaderMenuLeft", "onHeaderRight1", "view", "Landroid/view/View;", "onHeaderRight2", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.HeaderBar$b */
    /* compiled from: HeaderBar.kt */
    public static abstract class C7217b implements C7216a {
        /* renamed from: a */
        public void mo23245a() {
        }

        /* renamed from: a */
        public void mo23246a(View view) {
        }

        /* renamed from: b */
        public void mo23247b(View view) {
        }
    }

    /* renamed from: a */
    public View mo23241a(int i) {
        if (this.f26361b == null) {
            this.f26361b = new HashMap();
        }
        View view = (View) this.f26361b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26361b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C7216a getListener() {
        return this.f26360a;
    }

    public final void setListener(C7216a aVar) {
        this.f26360a = aVar;
    }

    public HeaderBar(Context context, AttributeSet attributeSet) {
        C1489j.m6972b(context, "context");
        this(context, attributeSet, 0);
    }

    @TargetApi(21)
    public HeaderBar(Context context, AttributeSet attributeSet, int i, int i2) {
        C1489j.m6972b(context, "context");
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.view_header, this, true);
    }

    public HeaderBar(Context context, AttributeSet attributeSet, int i) {
        C1489j.m6972b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.view_header, this, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7193b.HeaderBar);
        String string = obtainStyledAttributes.getString(4);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(3, 0);
        CharSequence charSequence = string;
        if (!TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo23241a(C7192a.tv_title);
            C1489j.m6969a((Object) appCompatTextView, "tv_title");
            appCompatTextView.setVisibility(getVisibility());
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo23241a(C7192a.tv_title);
            C1489j.m6969a((Object) appCompatTextView2, "tv_title");
            appCompatTextView2.setText(charSequence);
        }
        setLeftIcon2(resourceId2);
        setLeftIcon(resourceId);
        setRight1Icon(resourceId3);
        setRight2Icon(resourceId4);
        obtainStyledAttributes.recycle();
        OnClickListener onClickListener = this;
        ((AppCompatImageButton) mo23241a(C7192a.img_btn_right1)).setOnClickListener(onClickListener);
        ((AppCompatImageButton) mo23241a(C7192a.img_btn_right2)).setOnClickListener(onClickListener);
        ((AppCompatImageButton) mo23241a(C7192a.img_btn_left)).setOnClickListener(onClickListener);
        ((AppCompatImageButton) mo23241a(C7192a.img_btn_left2)).setOnClickListener(onClickListener);
    }

    private final void setLeftIcon2(int i) {
        if (i == 0) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo23241a(C7192a.img_btn_left2);
            C1489j.m6969a((Object) appCompatImageButton, "img_btn_left2");
            appCompatImageButton.setVisibility(8);
            return;
        }
        ((AppCompatImageButton) mo23241a(C7192a.img_btn_left2)).setImageResource(i);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo23241a(C7192a.img_btn_left2);
        C1489j.m6969a((Object) appCompatImageButton2, "img_btn_left2");
        appCompatImageButton2.setVisibility(0);
    }

    private final void setLeftIcon(int i) {
        if (i == 0) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo23241a(C7192a.img_btn_left);
            C1489j.m6969a((Object) appCompatImageButton, "img_btn_left");
            appCompatImageButton.setVisibility(8);
            return;
        }
        ((AppCompatImageButton) mo23241a(C7192a.img_btn_left)).setImageResource(i);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo23241a(C7192a.img_btn_left);
        C1489j.m6969a((Object) appCompatImageButton2, "img_btn_left");
        appCompatImageButton2.setVisibility(0);
    }

    private final void setRight1Icon(int i) {
        if (i == 0) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo23241a(C7192a.img_btn_right1);
            C1489j.m6969a((Object) appCompatImageButton, "img_btn_right1");
            appCompatImageButton.setVisibility(8);
            return;
        }
        ((AppCompatImageButton) mo23241a(C7192a.img_btn_right1)).setImageResource(i);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo23241a(C7192a.img_btn_right1);
        C1489j.m6969a((Object) appCompatImageButton2, "img_btn_right1");
        appCompatImageButton2.setVisibility(0);
    }

    private final void setRight2Icon(int i) {
        if (i == 0) {
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo23241a(C7192a.img_btn_right2);
            C1489j.m6969a((Object) appCompatImageButton, "img_btn_right2");
            appCompatImageButton.setVisibility(8);
            return;
        }
        ((AppCompatImageButton) mo23241a(C7192a.img_btn_right2)).setImageResource(i);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo23241a(C7192a.img_btn_right2);
        C1489j.m6969a((Object) appCompatImageButton2, "img_btn_right2");
        appCompatImageButton2.setVisibility(0);
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.img_btn_left) {
            C7216a aVar = this.f26360a;
            if (aVar != null) {
                aVar.mo23245a();
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.img_btn_right1) {
            C7216a aVar2 = this.f26360a;
            if (aVar2 != null) {
                aVar2.mo23247b(view);
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.img_btn_right2) {
            C7216a aVar3 = this.f26360a;
            if (aVar3 != null) {
                aVar3.mo23246a(view);
            }
        }
    }
}
