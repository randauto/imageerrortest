package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.quickads;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.C4438j;
import judi.com.kottlinbase.quickads.p273a.C7199c;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/AdsFactory;", "", "()V", "adsIds", "Ljudi/com/kottlinbase/quickads/AdsIds;", "getAdsIds", "()Ljudi/com/kottlinbase/quickads/AdsIds;", "setAdsIds", "(Ljudi/com/kottlinbase/quickads/AdsIds;)V", "bannerId", "", "network", "", "layer", "fullId", "nativeId", "release", "", "Companion", "app_release"})
/* renamed from: judi.com.kottlinbase.quickads.a */
/* compiled from: AdsFactory.kt */
public final class C7195a {

    /* renamed from: b */
    public static final C7196a f26308b = new C7196a(null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C7195a f26309c;

    /* renamed from: a */
    public C7204b f26310a;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, mo10386c = {"Ljudi/com/kottlinbase/quickads/AdsFactory$Companion;", "", "()V", "ADMOD_NETWORK", "", "FAN_NETWORK", "INSTANCE", "Ljudi/com/kottlinbase/quickads/AdsFactory;", "instance", "getInstance", "()Ljudi/com/kottlinbase/quickads/AdsFactory;", "init", "", "context", "Landroid/content/Context;", "adsIds", "Ljudi/com/kottlinbase/quickads/AdsIds;", "app_release"})
    /* renamed from: judi.com.kottlinbase.quickads.a$a */
    /* compiled from: AdsFactory.kt */
    public static final class C7196a {
        private C7196a() {
        }

        public /* synthetic */ C7196a(C1486g gVar) {
            this();
        }

        /* renamed from: a */
        public final C7195a mo23199a() {
            C7195a c = C7195a.f26309c;
            if (c == null) {
                C1489j.m6968a();
            }
            return c;
        }

        /* renamed from: a */
        public final void mo23200a(Context context, C7204b bVar) {
            C1489j.m6972b(context, "context");
            C1489j.m6972b(bVar, "adsIds");
            C7195a.f26309c = new C7195a();
            mo23199a().mo23195a(bVar);
            AudienceNetworkAds.isInAdsProcess(context);
            AudienceNetworkAds.initialize(context);
            C4438j.m18665a(context, bVar.mo23107a());
            C7199c.f26311a.mo23216a(context);
        }
    }

    /* renamed from: a */
    public final C7204b mo23194a() {
        C7204b bVar = this.f26310a;
        if (bVar == null) {
            C1489j.m6973b("adsIds");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo23195a(C7204b bVar) {
        C1489j.m6972b(bVar, "<set-?>");
        this.f26310a = bVar;
    }

    /* renamed from: a */
    public final String mo23193a(int i, int i2) {
        if (i2 != 1) {
            C7204b bVar = this.f26310a;
            if (bVar == null) {
                C1489j.m6973b("adsIds");
            }
            return bVar.mo23110b(i);
        }
        C7204b bVar2 = this.f26310a;
        if (bVar2 == null) {
            C1489j.m6973b("adsIds");
        }
        return bVar2.mo23108a(i);
    }

    /* renamed from: b */
    public final String mo23196b(int i, int i2) {
        switch (i2) {
            case 1:
                C7204b bVar = this.f26310a;
                if (bVar == null) {
                    C1489j.m6973b("adsIds");
                }
                return bVar.mo23111c(i);
            case 2:
                C7204b bVar2 = this.f26310a;
                if (bVar2 == null) {
                    C1489j.m6973b("adsIds");
                }
                return bVar2.mo23112d(i);
            case 3:
                C7204b bVar3 = this.f26310a;
                if (bVar3 == null) {
                    C1489j.m6973b("adsIds");
                }
                return bVar3.mo23113e(i);
            default:
                C7204b bVar4 = this.f26310a;
                if (bVar4 == null) {
                    C1489j.m6973b("adsIds");
                }
                return bVar4.mo23114f(i);
        }
    }

    /* renamed from: c */
    public final String mo23198c(int i, int i2) {
        if (i2 != 1) {
            C7204b bVar = this.f26310a;
            if (bVar == null) {
                C1489j.m6973b("adsIds");
            }
            return bVar.mo23116h(i);
        }
        C7204b bVar2 = this.f26310a;
        if (bVar2 == null) {
            C1489j.m6973b("adsIds");
        }
        return bVar2.mo23115g(i);
    }

    /* renamed from: b */
    public final void mo23197b() {
        C7199c.f26311a.mo23217b().mo23213h();
    }
}
