package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.quickads.banner;

import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.C3822Ad;
import com.google.android.gms.ads.C4360b;
import p073b.C3218m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\tH&J\u001c\u0010\u000f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0013"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/banner/BannerListener;", "Lcom/google/android/gms/ads/AdListener;", "Lcom/facebook/ads/AdListener;", "()V", "onAdClicked", "", "p0", "Lcom/facebook/ads/Ad;", "onAdFailedToLoad", "", "onAdLoaded", "onBannerError", "network", "errorCode", "onBannerLoaded", "onError", "p1", "Lcom/facebook/ads/AdError;", "onLoggingImpression", "app_release"})
/* renamed from: judi.com.kottlinbase.quickads.banner.a */
/* compiled from: BannerListener.kt */
public abstract class C7209a extends C4360b implements AdListener {
    /* renamed from: a */
    public abstract void mo23226a(int i, int i2);

    /* renamed from: b */
    public abstract void mo23227b(int i);

    public void onAdClicked(C3822Ad ad) {
    }

    public void onLoggingImpression(C3822Ad ad) {
    }

    public void onAdLoaded(C3822Ad ad) {
        mo23227b(2);
    }

    public void onError(C3822Ad ad, AdError adError) {
        mo23226a(2, adError != null ? adError.getErrorCode() : 0);
    }

    /* renamed from: a */
    public void mo13207a() {
        super.mo13207a();
        mo23227b(1);
    }

    /* renamed from: a */
    public void mo13208a(int i) {
        super.mo13208a(i);
        mo23226a(1, i);
    }
}
