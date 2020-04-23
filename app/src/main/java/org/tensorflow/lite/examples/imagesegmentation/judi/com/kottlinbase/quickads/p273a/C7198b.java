package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.quickads.p273a;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.C3822Ad;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.C4360b;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0018\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0019"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/full/AdsListenerWrapper;", "Lcom/facebook/ads/InterstitialAdListener;", "Lcom/google/android/gms/ads/AdListener;", "()V", "onAdClicked", "", "p0", "Lcom/facebook/ads/Ad;", "network", "", "onAdClosed", "onAdDisplay", "onAdFailedToLoad", "onAdImpression", "onAdLoadFailed", "noConnect", "", "onAdLoadSuccess", "onAdLoaded", "onError", "p1", "Lcom/facebook/ads/AdError;", "onInterstitialDismissed", "onInterstitialDisplayed", "onLoggingImpression", "app_release"})
/* renamed from: judi.com.kottlinbase.quickads.a.b */
/* compiled from: AdsListenerWrapper.kt */
public abstract class C7198b extends C4360b implements InterstitialAdListener {
    /* renamed from: a */
    public abstract void mo23202a(int i, boolean z);

    /* renamed from: b */
    public abstract void mo23203b(int i);

    /* renamed from: c */
    public abstract void mo23204c(int i);

    /* renamed from: d */
    public abstract void mo23205d(int i);

    /* renamed from: e */
    public abstract void mo23206e(int i);

    public void onLoggingImpression(C3822Ad ad) {
    }

    /* renamed from: e */
    public void mo13213e() {
        super.mo13213e();
        mo23205d(1);
    }

    /* renamed from: a */
    public void mo13208a(int i) {
        super.mo13208a(i);
        String a = C7199c.f26311a.mo23215a();
        StringBuilder sb = new StringBuilder();
        sb.append(":onError ");
        sb.append(i);
        Log.e(a, sb.toString());
        mo23202a(1, i == 2);
    }

    /* renamed from: c */
    public void mo13211c() {
        super.mo13211c();
        mo23204c(1);
    }

    /* renamed from: f */
    public void mo13219f() {
        super.mo13219f();
        mo23203b(1);
    }

    /* renamed from: a */
    public void mo13207a() {
        super.mo13207a();
        mo23206e(1);
    }

    public void onInterstitialDisplayed(C3822Ad ad) {
        mo23203b(2);
    }

    public void onAdClicked(C3822Ad ad) {
        mo23205d(2);
    }

    public void onInterstitialDismissed(C3822Ad ad) {
        mo23204c(2);
    }

    public void onError(C3822Ad ad, AdError adError) {
        String a = C7199c.f26311a.mo23215a();
        StringBuilder sb = new StringBuilder();
        sb.append(":onError ");
        sb.append(adError != null ? adError.getErrorMessage() : null);
        Log.e(a, sb.toString());
        mo23202a(2, C1489j.m6971a((Object) adError, (Object) AdError.NETWORK_ERROR));
    }

    public void onAdLoaded(C3822Ad ad) {
        mo23206e(2);
    }
}
