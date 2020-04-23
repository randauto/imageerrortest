package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase;

import android.app.Application;
import android.content.Context;
import com.p148a.C3272b;
import judi.com.C7139a;
import judi.com.kottlinbase.quickads.C7195a;
import p073b.C3218m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, mo10386c = {"Ljudi/com/kottlinbase/BaseApp;", "Landroid/app/Application;", "()V", "onCreate", "", "onTerminate", "app_release"})
/* compiled from: BaseApp.kt */
public final class BaseApp extends Application {
    public void onCreate() {
        super.onCreate();
        Context context = this;
        C3272b.m14958a(context);
        C7139a.m38192a().mo23013a(context);
        C7195a.f26308b.mo23200a(context, new C7181a());
    }

    public void onTerminate() {
        super.onTerminate();
        C3272b.m14959b();
        C7195a.f26308b.mo23199a().mo23197b();
    }
}
