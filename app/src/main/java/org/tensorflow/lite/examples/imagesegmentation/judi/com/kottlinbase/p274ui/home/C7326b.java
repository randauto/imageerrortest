package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.home;

import android.support.p053v4.app.C0625a;
import java.lang.ref.WeakReference;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;
import p254d.p255a.C6972a;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo10386c = {"Ljudi/com/kottlinbase/ui/home/HomeActivityOnStorageReadyPermissionRequest;", "Lpermissions/dispatcher/PermissionRequest;", "target", "Ljudi/com/kottlinbase/ui/home/HomeActivity;", "(Ljudi/com/kottlinbase/ui/home/HomeActivity;)V", "weakTarget", "Ljava/lang/ref/WeakReference;", "cancel", "", "proceed", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.home.b */
/* compiled from: HomeActivityPermissionsDispatcher.kt */
final class C7326b implements C6972a {

    /* renamed from: a */
    private final WeakReference<HomeActivity> f26617a;

    public C7326b(HomeActivity homeActivity) {
        C1489j.m6972b(homeActivity, "target");
        this.f26617a = new WeakReference<>(homeActivity);
    }

    /* renamed from: a */
    public void mo21703a() {
        HomeActivity homeActivity = (HomeActivity) this.f26617a.get();
        if (homeActivity != null) {
            C0625a.m2278a(homeActivity, C7327c.f26619b, C7327c.f26618a);
        }
    }
}
