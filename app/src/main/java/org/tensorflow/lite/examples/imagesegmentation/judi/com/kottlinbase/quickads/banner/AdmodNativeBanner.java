package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.quickads.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.C4360b;
import com.google.android.gms.ads.C4363c.C4364a;
import com.google.android.gms.ads.C4367d.C4368a;
import com.google.android.gms.ads.C4444m.C4445a;
import com.google.android.gms.ads.formats.C4374b.C4376b;
import com.google.android.gms.ads.formats.C4377c.C4378a;
import com.google.android.gms.ads.formats.C4389j;
import com.google.android.gms.ads.formats.C4389j.C4390a;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.judi.emojiphoto.R;
import judi.com.kottlinbase.C7191b.C7193b;
import judi.com.kottlinbase.quickads.C7195a;
import p073b.C3218m;
import p073b.C3227u;
import p073b.p079e.p081b.C1489j;
import p073b.p143j.C3199m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/banner/AdmodNativeBanner;", "Landroid/widget/RelativeLayout;", "Ljudi/com/kottlinbase/quickads/banner/AdsBanner;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "adListener", "judi/com/kottlinbase/quickads/banner/AdmodNativeBanner$adListener$1", "Ljudi/com/kottlinbase/quickads/banner/AdmodNativeBanner$adListener$1;", "adsLayoutId", "currentLayer", "lastId", "nativeAd", "Lcom/google/android/gms/ads/formats/UnifiedNativeAd;", "destroy", "", "getIdForLayer", "layer", "nextLayer", "", "onFinishInflate", "populateUnifiedNativeAdView", "adView", "Lcom/google/android/gms/ads/formats/UnifiedNativeAdView;", "refreshAd", "app_release"})
/* compiled from: AdmodNativeBanner.kt */
public final class AdmodNativeBanner extends RelativeLayout {

    /* renamed from: a */
    private final String f26335a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f26336b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4389j f26337c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f26338d;

    /* renamed from: e */
    private String f26339e;

    /* renamed from: f */
    private C7206a f26340f;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, mo10386c = {"judi/com/kottlinbase/quickads/banner/AdmodNativeBanner$adListener$1", "Lcom/google/android/gms/ads/AdListener;", "onAdFailedToLoad", "", "err", "", "onAdLoaded", "app_release"})
    /* renamed from: judi.com.kottlinbase.quickads.banner.AdmodNativeBanner$a */
    /* compiled from: AdmodNativeBanner.kt */
    public static final class C7206a extends C4360b {

        /* renamed from: a */
        final /* synthetic */ AdmodNativeBanner f26341a;

        C7206a(AdmodNativeBanner admodNativeBanner) {
            this.f26341a = admodNativeBanner;
        }

        /* renamed from: a */
        public void mo13207a() {
            Log.d(AdmodNativeBanner.class.getSimpleName(), ":onAdLoaded ");
            super.mo13207a();
            this.f26341a.f26338d = 1;
        }

        /* renamed from: a */
        public void mo13208a(int i) {
            super.mo13208a(i);
            String simpleName = AdmodNativeBanner.class.getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(":onAdFailedToLoad ");
            sb.append(i);
            Log.d(simpleName, sb.toString());
            if (i != 2 && this.f26341a.m38500b()) {
                this.f26341a.m38501c();
            }
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "unifiedNativeAd", "Lcom/google/android/gms/ads/formats/UnifiedNativeAd;", "kotlin.jvm.PlatformType", "onUnifiedNativeAdLoaded"})
    /* renamed from: judi.com.kottlinbase.quickads.banner.AdmodNativeBanner$b */
    /* compiled from: AdmodNativeBanner.kt */
    static final class C7207b implements C4390a {

        /* renamed from: a */
        final /* synthetic */ AdmodNativeBanner f26342a;

        C7207b(AdmodNativeBanner admodNativeBanner) {
            this.f26342a = admodNativeBanner;
        }

        /* renamed from: a */
        public final void mo13218a(C4389j jVar) {
            if (this.f26342a.f26337c != null) {
                C4389j a = this.f26342a.f26337c;
                if (a != null) {
                    a.mo13425k();
                }
            }
            this.f26342a.f26337c = jVar;
            View inflate = LayoutInflater.from(this.f26342a.getContext()).inflate(this.f26342a.f26336b, null);
            if (inflate != null) {
                UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) inflate;
                AdmodNativeBanner admodNativeBanner = this.f26342a;
                C1489j.m6969a((Object) jVar, "unifiedNativeAd");
                admodNativeBanner.m38495a(jVar, unifiedNativeAdView);
                this.f26342a.removeAllViews();
                this.f26342a.addView(unifiedNativeAdView);
                return;
            }
            throw new C3227u("null cannot be cast to non-null type com.google.android.gms.ads.formats.UnifiedNativeAdView");
        }
    }

    public AdmodNativeBanner(Context context) {
        super(context);
        this.f26335a = "AdmodNativeBanner";
        this.f26338d = 1;
        this.f26340f = new C7206a(this);
    }

    public AdmodNativeBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdmodNativeBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26335a = "AdmodNativeBanner";
        this.f26338d = 1;
        this.f26340f = new C7206a(this);
        if (context != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7193b.AdmodNativeBanner);
            if (obtainStyledAttributes != null) {
                this.f26336b = obtainStyledAttributes.getResourceId(0, 0);
                if (this.f26336b == 0) {
                    this.f26336b = R.layout.judi_layout_admod_native;
                }
                obtainStyledAttributes.recycle();
                TextView textView = new TextView(context);
                textView.setText(R.string.msg_loading_ads);
                textView.setTextSize(22.0f);
                textView.setTextColor(-16777216);
                textView.setAlpha(0.6f);
                textView.setGravity(4);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(13, -1);
                addView(textView, layoutParams);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        Log.d(this.f26335a, ": onFinishInflate");
        m38501c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m38500b() {
        if (this.f26338d >= 2) {
            return false;
        }
        this.f26338d++;
        return true;
    }

    /* renamed from: a */
    private final String m38494a(int i) {
        String simpleName = AdmodNativeBanner.class.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("getIdForLayer ");
        sb.append(i);
        Log.d(simpleName, sb.toString());
        return C7195a.f26308b.mo23199a().mo23198c(1, i);
    }

    /* renamed from: a */
    public void mo23222a() {
        C4389j jVar = this.f26337c;
        if (jVar != null) {
            jVar.mo13425k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m38495a(C4389j jVar, UnifiedNativeAdView unifiedNativeAdView) {
        Log.d(this.f26335a, ": populateUnifiedNativeAdView");
        unifiedNativeAdView.setMediaView((MediaView) unifiedNativeAdView.findViewById(R.id.ad_media));
        unifiedNativeAdView.setHeadlineView(unifiedNativeAdView.findViewById(R.id.ad_headline));
        unifiedNativeAdView.setBodyView(unifiedNativeAdView.findViewById(R.id.ad_body));
        unifiedNativeAdView.setCallToActionView(unifiedNativeAdView.findViewById(R.id.ad_call_to_action));
        unifiedNativeAdView.setIconView(unifiedNativeAdView.findViewById(R.id.ad_app_icon));
        unifiedNativeAdView.setStarRatingView(unifiedNativeAdView.findViewById(R.id.ad_stars));
        unifiedNativeAdView.setAdvertiserView(unifiedNativeAdView.findViewById(R.id.ad_advertiser));
        View headlineView = unifiedNativeAdView.getHeadlineView();
        if (headlineView != null) {
            ((TextView) headlineView).setText(jVar.mo13415a());
            if (unifiedNativeAdView.getBodyView() != null) {
                if (jVar.mo13417c() == null) {
                    View bodyView = unifiedNativeAdView.getBodyView();
                    C1489j.m6969a((Object) bodyView, "adView.bodyView");
                    bodyView.setVisibility(8);
                } else {
                    View bodyView2 = unifiedNativeAdView.getBodyView();
                    C1489j.m6969a((Object) bodyView2, "adView.bodyView");
                    bodyView2.setVisibility(0);
                    View bodyView3 = unifiedNativeAdView.getBodyView();
                    if (bodyView3 != null) {
                        ((TextView) bodyView3).setText(jVar.mo13417c());
                    } else {
                        throw new C3227u("null cannot be cast to non-null type android.widget.TextView");
                    }
                }
            }
            if (jVar.mo13419e() == null) {
                View callToActionView = unifiedNativeAdView.getCallToActionView();
                C1489j.m6969a((Object) callToActionView, "adView.callToActionView");
                callToActionView.setVisibility(8);
            } else {
                View callToActionView2 = unifiedNativeAdView.getCallToActionView();
                C1489j.m6969a((Object) callToActionView2, "adView.callToActionView");
                callToActionView2.setVisibility(0);
                View callToActionView3 = unifiedNativeAdView.getCallToActionView();
                if (callToActionView3 != null) {
                    ((Button) callToActionView3).setText(jVar.mo13419e());
                } else {
                    throw new C3227u("null cannot be cast to non-null type android.widget.Button");
                }
            }
            if (jVar.mo13418d() == null) {
                View iconView = unifiedNativeAdView.getIconView();
                C1489j.m6969a((Object) iconView, "adView.iconView");
                iconView.setVisibility(8);
            } else {
                View iconView2 = unifiedNativeAdView.getIconView();
                if (iconView2 != null) {
                    ImageView imageView = (ImageView) iconView2;
                    C4376b d = jVar.mo13418d();
                    C1489j.m6969a((Object) d, "nativeAd.icon");
                    imageView.setImageDrawable(d.mo13365a());
                    View iconView3 = unifiedNativeAdView.getIconView();
                    C1489j.m6969a((Object) iconView3, "adView.iconView");
                    iconView3.setVisibility(0);
                } else {
                    throw new C3227u("null cannot be cast to non-null type android.widget.ImageView");
                }
            }
            if (unifiedNativeAdView.getStarRatingView() != null) {
                if (jVar.mo13421g() == null) {
                    View starRatingView = unifiedNativeAdView.getStarRatingView();
                    C1489j.m6969a((Object) starRatingView, "adView.starRatingView");
                    starRatingView.setVisibility(4);
                } else {
                    View starRatingView2 = unifiedNativeAdView.getStarRatingView();
                    if (starRatingView2 != null) {
                        RatingBar ratingBar = (RatingBar) starRatingView2;
                        Double g = jVar.mo13421g();
                        if (g == null) {
                            C1489j.m6968a();
                        }
                        ratingBar.setRating((float) g.doubleValue());
                        View starRatingView3 = unifiedNativeAdView.getStarRatingView();
                        C1489j.m6969a((Object) starRatingView3, "adView.starRatingView");
                        starRatingView3.setVisibility(0);
                    } else {
                        throw new C3227u("null cannot be cast to non-null type android.widget.RatingBar");
                    }
                }
            }
            if (jVar.mo13420f() == null) {
                View advertiserView = unifiedNativeAdView.getAdvertiserView();
                C1489j.m6969a((Object) advertiserView, "adView.advertiserView");
                advertiserView.setVisibility(4);
            } else {
                View advertiserView2 = unifiedNativeAdView.getAdvertiserView();
                if (advertiserView2 != null) {
                    ((TextView) advertiserView2).setText(jVar.mo13420f());
                    View advertiserView3 = unifiedNativeAdView.getAdvertiserView();
                    C1489j.m6969a((Object) advertiserView3, "adView.advertiserView");
                    advertiserView3.setVisibility(0);
                } else {
                    throw new C3227u("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            unifiedNativeAdView.setNativeAd(jVar);
            return;
        }
        throw new C3227u("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m38501c() {
        String a = m38494a(this.f26338d);
        if (this.f26339e == null || !C3199m.m14759a(this.f26339e, a, false, 2, null)) {
            String str = this.f26335a;
            StringBuilder sb = new StringBuilder();
            sb.append(":refreshAd ads id ->> ");
            sb.append(a);
            Log.d(str, sb.toString());
            this.f26339e = a;
            C4364a aVar = new C4364a(getContext(), a);
            aVar.mo13293a((C4390a) new C7207b(this));
            aVar.mo13289a((C4360b) this.f26340f);
            aVar.mo13290a(new C4378a().mo13377a(new C4445a().mo13544a(true).mo13545a()).mo13379a());
            aVar.mo13295a().mo13288a(new C4368a().mo13304b(C7195a.f26308b.mo23199a().mo23194a().mo23117i(1)).mo13303a());
        }
    }
}
