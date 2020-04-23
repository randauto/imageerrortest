package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.quickads.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.google.android.gms.ads.C4367d;
import com.google.android.gms.ads.C4367d.C4368a;
import com.google.android.gms.ads.C4371e;
import com.google.android.gms.ads.C4372f;
import com.judi.emojiphoto.R;
import judi.com.kottlinbase.C7191b.C7193b;
import judi.com.kottlinbase.quickads.C7195a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001fH\u0014R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/banner/WaterfallBanner;", "Landroid/widget/RelativeLayout;", "Ljudi/com/kottlinbase/quickads/banner/AdsBanner;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "adListener", "judi/com/kottlinbase/quickads/banner/WaterfallBanner$adListener$1", "Ljudi/com/kottlinbase/quickads/banner/WaterfallBanner$adListener$1;", "adSize", "adView", "Lcom/google/android/gms/ads/AdView;", "adViewContainer", "Landroid/widget/LinearLayout;", "adViewFan", "Lcom/facebook/ads/AdView;", "currentLayer", "convertAdsSize", "Lcom/google/android/gms/ads/AdSize;", "value", "convertAdsSizeFan", "Lcom/facebook/ads/AdSize;", "createAdContainer", "", "createRequest", "Lcom/google/android/gms/ads/AdRequest;", "destroy", "getIdForLayer", "layer", "getIdForLayerFan", "loadAdmod", "loadFan", "nextLayer", "", "onFinishInflate", "app_release"})
/* compiled from: WaterfallBanner.kt */
public final class WaterfallBanner extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f26343a;

    /* renamed from: b */
    private C4372f f26344b;

    /* renamed from: c */
    private AdView f26345c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinearLayout f26346d;

    /* renamed from: e */
    private int f26347e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26348f;

    /* renamed from: g */
    private C7208a f26349g;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo10386c = {"judi/com/kottlinbase/quickads/banner/WaterfallBanner$adListener$1", "Ljudi/com/kottlinbase/quickads/banner/BannerListener;", "onBannerError", "", "network", "", "errorCode", "onBannerLoaded", "app_release"})
    /* renamed from: judi.com.kottlinbase.quickads.banner.WaterfallBanner$a */
    /* compiled from: WaterfallBanner.kt */
    public static final class C7208a extends C7209a {

        /* renamed from: a */
        final /* synthetic */ WaterfallBanner f26350a;

        C7208a(WaterfallBanner waterfallBanner) {
            this.f26350a = waterfallBanner;
        }

        /* renamed from: a */
        public void mo23226a(int i, int i2) {
            String a = this.f26350a.f26343a;
            StringBuilder sb = new StringBuilder();
            sb.append(":onAdFailedToLoad ");
            sb.append(i2);
            sb.append(" network >> ");
            sb.append(i);
            Log.d(a, sb.toString());
            LinearLayout b = this.f26350a.f26346d;
            if (b != null) {
                b.removeAllViews();
            }
            if (i != 2) {
                if (i2 != 2 && this.f26350a.m38516c()) {
                    this.f26350a.m38520e();
                }
            } else if (i2 != 1000) {
                this.f26350a.m38522f();
            }
        }

        /* renamed from: b */
        public void mo23227b(int i) {
            String a = this.f26350a.f26343a;
            StringBuilder sb = new StringBuilder();
            sb.append(":onBannerLoaded ");
            sb.append(i);
            Log.d(a, sb.toString());
            this.f26350a.f26348f = 1;
        }
    }

    public WaterfallBanner(Context context) {
        this(context, null);
    }

    public WaterfallBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaterfallBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26343a = "WaterfallBanner";
        this.f26347e = 1;
        this.f26348f = 1;
        this.f26349g = new C7208a(this);
        Log.d(WaterfallBanner.class.getSimpleName(), "init");
        if (context != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7193b.WaterfallBanner);
            this.f26347e = obtainStyledAttributes.getInteger(0, 3);
            obtainStyledAttributes.recycle();
        }
        setBackgroundColor(-1);
        TextView textView = new TextView(context);
        textView.setText(R.string.msg_loading_ads);
        textView.setTextSize(22.0f);
        textView.setTextColor(-16777216);
        textView.setAlpha(0.6f);
        textView.setGravity(4);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText("Ad");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(-1);
        textView2.setBackgroundColor(Color.parseColor("#FFAB00"));
        textView2.setPadding(20, 0, 20, 0);
        addView(textView2, new LayoutParams(-2, -2));
    }

    /* renamed from: b */
    private final void m38513b() {
        if (this.f26346d == null) {
            this.f26346d = new LinearLayout(getContext());
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(14, -1);
            addView(this.f26346d, layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m38516c() {
        if (this.f26348f >= 2) {
            return false;
        }
        this.f26348f++;
        return true;
    }

    /* renamed from: a */
    private final String m38508a(int i) {
        String simpleName = WaterfallBanner.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("getIdForLayerFan ");
        sb.append(i);
        Log.d(simpleName, sb.toString());
        return C7195a.f26308b.mo23199a().mo23193a(2, i);
    }

    /* renamed from: b */
    private final String m38512b(int i) {
        String simpleName = WaterfallBanner.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("getIdForLayerAdmod ");
        sb.append(i);
        Log.d(simpleName, sb.toString());
        return C7195a.f26308b.mo23199a().mo23193a(1, i);
    }

    /* renamed from: d */
    private final C4367d m38518d() {
        C4367d a = new C4368a().mo13304b(C7195a.f26308b.mo23199a().mo23194a().mo23117i(1)).mo13304b("B3EEABB8EE11C2BE770B684D95219ECB").mo13303a();
        C1489j.m6969a((Object) a, "AdRequest.Builder()\n    …\n                .build()");
        return a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m38520e();
    }

    /* renamed from: c */
    private final C4371e m38514c(int i) {
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

    /* renamed from: d */
    private final AdSize m38517d(int i) {
        switch (i) {
            case 1:
                AdSize adSize = AdSize.BANNER_HEIGHT_50;
                C1489j.m6969a((Object) adSize, "com.facebook.ads.AdSize.BANNER_HEIGHT_50");
                return adSize;
            case 2:
                AdSize adSize2 = AdSize.BANNER_HEIGHT_50;
                C1489j.m6969a((Object) adSize2, "com.facebook.ads.AdSize.BANNER_HEIGHT_50");
                return adSize2;
            default:
                AdSize adSize3 = AdSize.BANNER_HEIGHT_90;
                C1489j.m6969a((Object) adSize3, "com.facebook.ads.AdSize.BANNER_HEIGHT_90");
                return adSize3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m38520e() {
        String a = m38508a(this.f26348f);
        if (this.f26345c != null) {
            AdView adView = this.f26345c;
            if (adView == null) {
                C1489j.m6968a();
            }
            if (C1489j.m6971a((Object) adView.getPlacementId(), (Object) a)) {
                return;
            }
        }
        this.f26345c = new AdView(getContext(), a, m38517d(this.f26347e));
        AdView adView2 = this.f26345c;
        if (adView2 == null) {
            C1489j.m6968a();
        }
        adView2.setAdListener(this.f26349g);
        m38513b();
        LinearLayout linearLayout = this.f26346d;
        if (linearLayout == null) {
            C1489j.m6968a();
        }
        linearLayout.addView(this.f26345c);
        String str = this.f26343a;
        StringBuilder sb = new StringBuilder();
        sb.append("loadFan ");
        AdView adView3 = this.f26345c;
        if (adView3 == null) {
            C1489j.m6968a();
        }
        sb.append(adView3.getPlacementId());
        Log.d(str, sb.toString());
        AdView adView4 = this.f26345c;
        if (adView4 == null) {
            C1489j.m6968a();
        }
        adView4.loadAd();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m38522f() {
        String b = m38512b(this.f26348f);
        if (this.f26344b != null) {
            C4372f fVar = this.f26344b;
            if (fVar == null) {
                C1489j.m6968a();
            }
            if (C1489j.m6971a((Object) fVar.getAdUnitId(), (Object) b)) {
                return;
            }
        }
        this.f26344b = new C4372f(getContext());
        C4372f fVar2 = this.f26344b;
        if (fVar2 == null) {
            C1489j.m6968a();
        }
        fVar2.setAdSize(m38514c(this.f26347e));
        C4372f fVar3 = this.f26344b;
        if (fVar3 == null) {
            C1489j.m6968a();
        }
        fVar3.setAdUnitId(b);
        C4372f fVar4 = this.f26344b;
        if (fVar4 == null) {
            C1489j.m6968a();
        }
        fVar4.setAdListener(this.f26349g);
        String str = this.f26343a;
        StringBuilder sb = new StringBuilder();
        sb.append("loadAdmod ");
        C4372f fVar5 = this.f26344b;
        if (fVar5 == null) {
            C1489j.m6968a();
        }
        sb.append(fVar5.getAdUnitId());
        Log.d(str, sb.toString());
        if (this.f26344b != null) {
            m38513b();
            LinearLayout linearLayout = this.f26346d;
            if (linearLayout == null) {
                C1489j.m6968a();
            }
            linearLayout.addView(this.f26344b);
            C4372f fVar6 = this.f26344b;
            if (fVar6 != null) {
                fVar6.mo13324a(m38518d());
            }
        }
    }

    /* renamed from: a */
    public void mo23224a() {
        C4372f fVar = this.f26344b;
        if (fVar != null) {
            fVar.mo13326c();
        }
        AdView adView = this.f26345c;
        if (adView != null) {
            adView.destroy();
        }
    }
}
