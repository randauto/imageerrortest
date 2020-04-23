package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.quickads.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import com.google.android.gms.ads.C4360b;
import com.google.android.gms.ads.C4367d;
import com.google.android.gms.ads.C4367d.C4368a;
import com.google.android.gms.ads.C4371e;
import com.google.android.gms.ads.C4372f;
import judi.com.kottlinbase.C7191b.C7193b;
import judi.com.kottlinbase.quickads.C7195a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0019H\u0014R\u0010\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/banner/AdmodBanner;", "Landroid/widget/LinearLayout;", "Ljudi/com/kottlinbase/quickads/banner/AdsBanner;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adListener", "judi/com/kottlinbase/quickads/banner/AdmodBanner$adListener$1", "Ljudi/com/kottlinbase/quickads/banner/AdmodBanner$adListener$1;", "adSize", "adView", "Lcom/google/android/gms/ads/AdView;", "currentLayer", "convertAdsSize", "Lcom/google/android/gms/ads/AdSize;", "value", "createRequest", "Lcom/google/android/gms/ads/AdRequest;", "destroy", "", "getIdForLayer", "", "layer", "loadAds", "nextLayer", "", "onFinishInflate", "app_release"})
/* compiled from: AdmodBanner.kt */
public final class AdmodBanner extends LinearLayout {

    /* renamed from: a */
    private C4372f f26330a;

    /* renamed from: b */
    private int f26331b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f26332c;

    /* renamed from: d */
    private C7205a f26333d;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, mo10386c = {"judi/com/kottlinbase/quickads/banner/AdmodBanner$adListener$1", "Lcom/google/android/gms/ads/AdListener;", "onAdFailedToLoad", "", "err", "", "onAdLoaded", "app_release"})
    /* renamed from: judi.com.kottlinbase.quickads.banner.AdmodBanner$a */
    /* compiled from: AdmodBanner.kt */
    public static final class C7205a extends C4360b {

        /* renamed from: a */
        final /* synthetic */ AdmodBanner f26334a;

        C7205a(AdmodBanner admodBanner) {
            this.f26334a = admodBanner;
        }

        /* renamed from: a */
        public void mo13207a() {
            Log.d("AdmodBanner", ":onAdLoaded ");
            super.mo13207a();
            this.f26334a.f26332c = 1;
        }

        /* renamed from: a */
        public void mo13208a(int i) {
            super.mo13208a(i);
            this.f26334a.removeAllViews();
            StringBuilder sb = new StringBuilder();
            sb.append(":onAdFailedToLoad ");
            sb.append(i);
            Log.d("AdmodBanner", sb.toString());
            if (i != 2 && this.f26334a.m38487b()) {
                this.f26334a.m38489d();
            }
        }
    }

    public AdmodBanner(Context context) {
        this(context, null);
    }

    public AdmodBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdmodBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26331b = 1;
        this.f26332c = 1;
        this.f26333d = new C7205a(this);
        Log.d(AdmodBanner.class.getSimpleName(), "init");
        if (context != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7193b.AdmodBanner);
            this.f26331b = obtainStyledAttributes.getInteger(0, 1);
            obtainStyledAttributes.recycle();
        }
        setBackgroundColor(-1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m38487b() {
        if (this.f26332c >= 2) {
            return false;
        }
        this.f26332c++;
        return true;
    }

    /* renamed from: a */
    private final String m38482a(int i) {
        String simpleName = AdmodBanner.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("getIdForLayer ");
        sb.append(i);
        Log.d(simpleName, sb.toString());
        return C7195a.f26308b.mo23199a().mo23193a(1, i);
    }

    /* renamed from: c */
    private final C4367d m38488c() {
        C4367d a = new C4368a().mo13304b(C7195a.f26308b.mo23199a().mo23194a().mo23117i(1)).mo13304b("B3EEABB8EE11C2BE770B684D95219ECB").mo13303a();
        C1489j.m6969a((Object) a, "AdRequest.Builder()\n    …\n                .build()");
        return a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m38489d();
    }

    /* renamed from: b */
    private final C4371e m38485b(int i) {
        switch (i) {
            case 1:
                C4371e eVar = C4371e.f11045a;
                C1489j.m6969a((Object) eVar, "AdSize.BANNER");
                return eVar;
            case 2:
                C4371e eVar2 = C4371e.f11047c;
                C1489j.m6969a((Object) eVar2, "AdSize.LARGE_BANNER");
                return eVar2;
            default:
                C4371e eVar3 = C4371e.f11051g;
                C1489j.m6969a((Object) eVar3, "AdSize.SMART_BANNER");
                return eVar3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m38489d() {
        String a = m38482a(this.f26332c);
        if (this.f26330a != null) {
            C4372f fVar = this.f26330a;
            if (fVar == null) {
                C1489j.m6968a();
            }
            if (C1489j.m6971a((Object) fVar.getAdUnitId(), (Object) a)) {
                return;
            }
        }
        this.f26330a = new C4372f(getContext());
        C4372f fVar2 = this.f26330a;
        if (fVar2 == null) {
            C1489j.m6968a();
        }
        fVar2.setAdSize(m38485b(this.f26331b));
        C4372f fVar3 = this.f26330a;
        if (fVar3 == null) {
            C1489j.m6968a();
        }
        fVar3.setAdUnitId(a);
        C4372f fVar4 = this.f26330a;
        if (fVar4 == null) {
            C1489j.m6968a();
        }
        fVar4.setAdListener(this.f26333d);
        String simpleName = AdmodBanner.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("loadAds ");
        C4372f fVar5 = this.f26330a;
        if (fVar5 == null) {
            C1489j.m6968a();
        }
        sb.append(fVar5.getAdUnitId());
        Log.d(simpleName, sb.toString());
        if (this.f26330a != null) {
            addView(this.f26330a);
            C4372f fVar6 = this.f26330a;
            if (fVar6 != null) {
                fVar6.mo13324a(m38488c());
            }
        }
    }

    /* renamed from: a */
    public void mo23220a() {
        C4372f fVar = this.f26330a;
        if (fVar != null) {
            fVar.mo13326c();
        }
    }
}
